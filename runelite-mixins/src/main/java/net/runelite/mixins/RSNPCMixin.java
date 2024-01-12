/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.mixins;

import net.runelite.api.ActorSpotAnim;
import net.runelite.api.AnimationID;
import net.runelite.api.NPCComposition;
import net.runelite.api.NpcID;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.NpcChanged;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSNPC;
import net.runelite.rs.api.RSNPCComposition;
import net.unethicalite.api.events.NPCCompositionChanged;

import java.awt.Polygon;
import java.awt.Shape;
import java.util.Iterator;

@Mixin(RSNPC.class)
public abstract class RSNPCMixin implements RSNPC
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private int npcIndex;

	@Inject
	@Override
	public int getTransformedId()
	{
		RSNPCComposition composition = getComposition();
		if (composition != null && composition.getConfigs() != null)
		{
			composition = composition.transform();
		}
		return composition == null ? -1 : composition.getId();
	}

	@Inject
	@Override
	public String getTransformedName()
	{
		RSNPCComposition composition = getComposition();
		if (composition != null && composition.getConfigs() != null)
		{
			composition = composition.transform();
		}
		return composition == null ? null : composition.getName().replace('\u00A0', ' ');
	}

	@Inject
	@Override
	public int getTransformedLevel()
	{
		RSNPCComposition composition = getComposition();
		if (composition != null && composition.getConfigs() != null)
		{
			composition = composition.transform();
		}
		return composition == null ? -1 : composition.getCombatLevel();
	}

	@Inject
	@Override
	public int getIndex()
	{
		return npcIndex;
	}

	@Inject
	@Override
	public void setIndex(int id)
	{
		npcIndex = id;
	}

	@Inject
	@Override
	public void setComposition(NPCComposition composition)
	{
		setComposition((RSNPCComposition) composition);
	}

	@FieldHook(value = "definition", before = true)
	@Inject
	public void onDefinitionChanged(RSNPCComposition composition)
	{
		if (composition != null)
		{
			composition.setIndex(getIndex());
			client.getCallbacks().postDeferred(new NPCCompositionChanged(getIndex()));
		}

		if (composition == null)
		{
			client.getCallbacks().post(new NpcDespawned(this));
		}
		else if (this.getTransformedId() != -1)
		{
			RSNPCComposition oldComposition = getComposition();
			if (oldComposition == null)
			{
				return;
			}

			if (composition.getId() == oldComposition.getId())
			{
				return;
			}

			setDead(false);
			client.getCallbacks().postDeferred(new NpcChanged(this, oldComposition));
		}
	}

	@Copy("getModel")
	@Replace("getModel")
	@SuppressWarnings("InfiniteRecursion")
	public RSModel copy$getModel()
	{
		if (!client.isInterpolateNpcAnimations()
			|| this.getAnimation() == AnimationID.HELLHOUND_DEFENCE
			|| this.getAnimation() == 8270
			|| this.getAnimation() == 8271
			|| this.getPoseAnimation() == 5583
			|| this.getId() == NpcID.WYRM && this.getAnimation() == AnimationID.IDLE
			|| this.getId() == NpcID.TREE_SPIRIT && this.getAnimation() == AnimationID.IDLE
			|| this.getId() == NpcID.TREE_SPIRIT_6380 && this.getAnimation() == AnimationID.IDLE
			|| this.getId() == NpcID.TREE_SPIRIT_HARD && this.getAnimation() == AnimationID.IDLE
		)
		{
			return copy$getModel();
		}
		int actionFrame = getActionFrame();
		int poseFrame = getPoseFrame();
		int spotAnimFrame = getSpotAnimFrame();
		try
		{
			// combine the frames with the frame cycle so we can access this information in the sequence methods
			// without having to change method calls
			setActionFrame(Integer.MIN_VALUE | getActionFrameCycle() << 16 | actionFrame);
			setPoseFrame(Integer.MIN_VALUE | getPoseFrameCycle() << 16 | poseFrame);
			setSpotAnimFrame(Integer.MIN_VALUE | getSpotAnimationFrameCycle() << 16 | spotAnimFrame);
			Iterator iter = getSpotAnims().iterator();
			while (iter.hasNext())
			{
				ActorSpotAnim actorSpotAnim = (ActorSpotAnim) iter.next();
				int frame = actorSpotAnim.getFrame();
				if (frame != -1)
				{
					actorSpotAnim.setFrame(Integer.MIN_VALUE | actorSpotAnim.getCycle() << 16 | frame);
				}
			}
			return copy$getModel();
		}
		finally
		{
			// reset frames
			setActionFrame(actionFrame);
			setPoseFrame(poseFrame);
			setSpotAnimFrame(spotAnimFrame);
			Iterator iter = getSpotAnims().iterator();
			while (iter.hasNext())
			{
				ActorSpotAnim actorSpotAnim = (ActorSpotAnim) iter.next();
				int frame = actorSpotAnim.getFrame();
				if (frame != -1)
				{
					actorSpotAnim.setFrame(frame & '\uFFFF');
				}
			}
		}
	}

	@Inject
	@Override
	public Polygon getCanvasTilePoly()
	{
		NPCComposition transformedComposition = this.getTransformedComposition();
		if (transformedComposition == null)
		{
			return null;
		}
		else
		{
			int size = transformedComposition.getSize();
			return Perspective.getCanvasTileAreaPoly(client, this.getLocalLocation(), size);
		}
	}

	@Inject
	@Override
	public Shape getConvexHull()
	{
		RSModel model = getModel();
		if (model == null)
		{
			return null;
		}

		int size = getComposition().getSize();
		LocalPoint tileHeightPoint = new LocalPoint(
			size * Perspective.LOCAL_HALF_TILE_SIZE - Perspective.LOCAL_HALF_TILE_SIZE + getX(),
			size * Perspective.LOCAL_HALF_TILE_SIZE - Perspective.LOCAL_HALF_TILE_SIZE + getY());

		int tileHeight = Perspective.getTileHeight(client, tileHeightPoint, client.getPlane());

		return model.getConvexHull(getX(), getY(), getCurrentOrientation(), tileHeight);
	}
}
