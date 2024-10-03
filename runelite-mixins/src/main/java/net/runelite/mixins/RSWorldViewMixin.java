package net.runelite.mixins;

import net.runelite.api.Actor;
import net.runelite.api.IndexedObjectSet;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.Projectile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.PlayerDespawned;
import net.runelite.api.events.PlayerSpawned;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSNPC;
import net.runelite.rs.api.RSPlayer;
import net.runelite.rs.api.RSProjectile;
import net.runelite.rs.api.RSScene;
import net.runelite.rs.api.RSTile;
import net.runelite.rs.api.RSWorldView;

@Mixin(RSWorldView.class)
public abstract class RSWorldViewMixin implements RSWorldView
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	@Override
	public boolean isTopLevel()
	{
		return getId() == -1;
	}

	@Inject
	@Override
	public IndexedObjectSet players()
	{
		return new IndexedObjectSet(this.getPlayers(), this.getPlayerUpdateManager().getPlayerIndices(), this.getPlayerUpdateManager().getPlayerCount());
	}

	@Inject
	@Override
	public IndexedObjectSet npcs()
	{
		return new IndexedObjectSet(this.getNpcs(), this.getNpcIndices(), this.getNpcCount());
	}

	@Inject
	@Override
	public IndexedObjectSet worldEntities()
	{
		return new IndexedObjectSet(this.getWorldEntities(), this.getWorldEntityIndices(), this.getWorldEntityCount());
	}

	@Inject
	@Override
	public RSTile getSelectedSceneTile()
	{
		RSScene scene = this.getScene();
		int x = scene.getBaseX();
		int y = scene.getBaseY();
		return x != -1 && y != -1 ? scene.getTiles()[this.getPlane()][x][y] : null;
	}

	@Inject
	@Override
	public Projectile createProjectile(int id, int plane, int startX, int startY, int startZ, int startCycle, int endCycle, int slope, int startHeight, int endHeight, Actor target, int targetX, int targetY)
	{
		int targetIndex = 0;
		if (target instanceof NPC)
		{
			targetIndex = ((NPC) target).getIndex() + 1;
		}
		else if (target instanceof Player)
		{
			targetIndex = -(((Player) target).getId() + 1);
		}

		RSProjectile projectile = this.newProjectile(id, plane, startX, startY, startZ, startCycle, endCycle, slope, startHeight, targetIndex, endHeight);
		projectile.setWorldView(this);
		projectile.setDestination(targetX, targetY, Perspective.getTileHeight(client, new LocalPoint(targetX, targetY, this), plane), startCycle);
		return projectile;
	}

	@FieldHook("npcs")
	@Inject
	public void cachedNPCsChanged(int idx)
	{
		if (idx > 0 && idx < this.getNpcs().length)
		{
			RSNPC npc = this.getNpcs()[idx];
			if (npc != null)
			{
				npc.setIndex(idx);
				npc.setWorldView(this);
				client.getCallbacks().postDeferred(new NpcSpawned(npc));
			}
		}
	}

	@Inject
	public RSPlayer[] oldPlayers;

	/*@MethodHook("<init>")
	@Inject
	public void rl$init(int var1, int var2, int var3, int var4)
	{
		this.oldPlayers = new RSPlayer[2048];
	}*/


	@FieldHook("players")
	@Inject
	public void cachedPlayersChanged(int idx)
	{
		if (oldPlayers == null)
		{
			oldPlayers = new RSPlayer[2048];
		}

		if (idx >= 0 && idx < this.getPlayers().length)
		{
			RSPlayer player = this.getPlayers()[idx];
			Player oldPlayer = this.oldPlayers[idx];
			this.oldPlayers[idx] = player;
			if (oldPlayer != null)
			{
				client.getCallbacks().post(new PlayerDespawned(oldPlayer));
			}
			if (player != null)
			{
				player.setWorldView(this);
				client.getCallbacks().postDeferred(new PlayerSpawned(player));
			}
		}
	}

	@Inject
	@Override
	public int[] getMapRegions()
	{
		return client.getMapRegions();
	}
}