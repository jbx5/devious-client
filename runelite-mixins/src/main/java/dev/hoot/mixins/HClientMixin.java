package dev.hoot.mixins;

import dev.hoot.api.events.AutomatedInteraction;
import dev.hoot.api.events.ExperienceGained;
import dev.hoot.api.events.LoginStateChanged;
import dev.hoot.api.events.PlaneChanged;
import net.runelite.api.*;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.events.StatChanged;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.api.widgets.Widget;
import net.runelite.rs.api.*;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

import static net.runelite.api.MenuAction.UNKNOWN;

@Mixin(RSClient.class)
public abstract class HClientMixin implements RSClient
{
	@Shadow("client")
	private static RSClient client;

	@Shadow("rl$menuEntries")
	private static RSRuneLiteMenuEntry[] rl$menuEntries;

	@Inject
	public static HashMap<Integer, RSNPCComposition> npcDefCache = new HashMap<>();
	@Inject
	public static HashMap<Integer, RSObjectComposition> objDefCache = new HashMap<>();
	@Inject
	public static HashMap<Integer, RSItemComposition> itemDefCache = new HashMap<>();

	@Inject
	private static boolean lowCpu;

	@Inject
	private static int[] previousExp = new int[23];

	@Inject
	private static AtomicReference<AutomatedInteraction> automatedMenu = new AtomicReference<>(null);

	@Inject
	@Override
	public void interact(final int identifier, final int opcode, final int param0, final int param1,
						 final int screenX, final int screenY, long entityTag)
	{
		AutomatedInteraction event = new AutomatedInteraction("Automated", "", identifier, MenuAction.of(opcode),
				param0, param1, screenX, screenY, entityTag);

		client.getCallbacks().post(event);
	}

	@Inject
	@Override
	public String getLoginMessage()
	{
		if (getLoginIndex() == 14)
		{
			if (getBanType() == 0)
			{
				return "Your account has been disabled. Please visit the support page for assistance.";
			}

			if (getBanType() == 1)
			{
				return "Account locked as we suspect it has been stolen. Please visit the support page for assistance.";
			}
		}

		if (getLoginIndex() == 3)
		{
			return "Invalid credentials.";
		}

		return getLoginResponse1() + " " + getLoginResponse2() + " " + getLoginResponse3();
	}

	@Override
	@Inject
	public boolean isTileObjectValid(Tile tile, TileObject t)
	{
		if (!(t instanceof RSGameObject))
		{
			return true;
		}

		// actors, projectiles, and graphics objects are added and removed from the scene each frame as GameObjects,
		// so ignore them.
		RSGameObject gameObject = (RSGameObject) t;
		RSRenderable renderable = gameObject.getRenderable();
		boolean invalid = renderable instanceof RSActor || renderable instanceof RSProjectile || renderable instanceof RSGraphicsObject;
		invalid |= gameObject.getStartX() != ((RSTile) tile).getX() || gameObject.getStartY() != ((RSTile) tile).getY();
		return !invalid;
	}

	@Inject
	@Override
	public boolean isItemDefinitionCached(int id)
	{
		return itemDefCache.containsKey(id);
	}

	@Inject
	@Override
	public boolean isLowCpu()
	{
		return lowCpu;
	}

	@Inject
	@Override
	public void setLowCpu(boolean enabled)
	{
		lowCpu = enabled;
	}

	@Copy("drawWidgets")
	@Replace("drawWidgets")
	static final void copy$drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7)
	{
		if (!lowCpu)
		{
			copy$drawWidgets(var0, var1, var2, var3, var4, var5, var6, var7);
		}
	}

	@Copy("drawModelComponents")
	@Replace("drawModelComponents")
	static void copy$drawModelComponents(Widget[] var0, int var1)
	{
		if (!lowCpu)
		{
			copy$drawModelComponents(var0, var1);
		}
	}

	@Inject
	@Override
	public void uncacheNPC(int id)
	{
		npcDefCache.remove(id);
	}

	@Inject
	@Override
	public void uncacheItem(int id)
	{
		itemDefCache.remove(id);
	}

	@Inject
	@Override
	public void uncacheObject(int id)
	{
		objDefCache.remove(id);
	}

	@Inject
	@Override
	public void clearNPCCache()
	{
		npcDefCache.clear();
	}

	@Inject
	@Override
	public void clearItemCache()
	{
		itemDefCache.clear();
	}

	@Inject
	@Override
	public void clearObjectCache()
	{
		objDefCache.clear();
	}

	@Inject
	@MethodHook("resumePauseWidget")
	public static void onDialogProcessed(int widgetUid, int menuIndex)
	{
		DialogOption option = DialogOption.of(widgetUid, menuIndex);
		if (option == null)
		{
			client.getLogger().debug("Unmapped DialogOption: {} {}", widgetUid, menuIndex);
			return;
		}

		client.getCallbacks().post(option);
	}

	@Inject
	@Override
	public ObjectComposition getObjectDefinition(int objectId)
	{
		if (objDefCache.containsKey(objectId))
		{
			return objDefCache.get(objectId);
		}

		assert this.isClientThread() : "getObjectDefinition must be called on client thread";
		RSObjectComposition objectComposition = getRSObjectComposition(objectId);
		objDefCache.put(objectId, objectComposition);
		return objectComposition;
	}

	@Inject
	@Override
	@Nonnull
	public ItemComposition getItemComposition(int id)
	{
		if (itemDefCache.containsKey(id))
		{
			return itemDefCache.get(id);
		}

		assert this.isClientThread() : "getItemComposition must be called on client thread";
		RSItemComposition def = getRSItemDefinition(id);
		itemDefCache.put(id, def);
		return def;
	}

	@Inject
	@FieldHook("loginIndex")
	public static void loginIndex(int idx)
	{
		client.getCallbacks().post(new LoginStateChanged(client.getLoginIndex()));
	}

	@FieldHook("experience")
	@Inject
	public static void experiencedChanged(int idx)
	{
		Skill[] possibleSkills = Skill.values();

		// We subtract one here because 'Overall' isn't considered a skill that's updated.
		if (idx < possibleSkills.length - 1)
		{
			Skill updatedSkill = possibleSkills[idx];
			StatChanged statChanged = new StatChanged(
					updatedSkill,
					client.getSkillExperience(updatedSkill),
					client.getRealSkillLevel(updatedSkill),
					client.getBoostedSkillLevel(updatedSkill)
			);
			if (previousExp[idx] == 0 && client.getSkillExperience(updatedSkill) > 0)
			{
				previousExp[idx] = client.getSkillExperience(updatedSkill);
			}

			experienceGained(idx, client.getSkillExperience(updatedSkill), client.getRealSkillLevel(updatedSkill), updatedSkill);
			client.getCallbacks().post(statChanged);
		}
	}

	@Inject
	public static void experienceGained(int idx, int exp, int skillLevel, Skill updatedSkill)
	{
		if (exp > previousExp[idx])
		{
			int gained = exp - previousExp[idx];

			ExperienceGained experienceGained = new ExperienceGained(
					updatedSkill,
					gained,
					exp,
					skillLevel
			);

			client.getCallbacks().post(experienceGained);
			previousExp[idx] = exp;
		}
	}

	@Inject
	@FieldHook("Client_plane")
	public static void clientPlaneChanged(int idx)
	{
		client.getCallbacks().post(new PlaneChanged(client.getPlane()));
	}

	@Copy("menuAction")
	@Replace("menuAction")
	static void copy$menuAction(int param0, int param1, int opcode, int id, String option, String target, int canvasX, int canvasY)
	{
		RSRuneLiteMenuEntry menuEntry = null;

		for (int i = client.getMenuOptionCount() - 1; i >= 0; --i)
		{
			if (client.getMenuOptions()[i] == option && client.getMenuTargets()[i] == target && client.getMenuIdentifiers()[i] == id && client.getMenuOpcodes()[i] == opcode)
			{
				menuEntry = rl$menuEntries[i];
				break;
			}
		}

		/*
		 * The RuneScape client may deprioritize an action in the menu by incrementing the opcode with 2000,
		 * undo it here so we can get the correct opcode
		 */
		if (opcode >= 2000)
		{
			opcode -= 2000;
		}

		AutomatedInteraction replacement = automatedMenu.getAndSet(null);
		if (replacement != null)
		{
			System.out.println("Replaced menu: " + replacement);
			param0 = replacement.getParam0();
			param1 = replacement.getParam1();
			opcode = replacement.getOpcode().getId();
			id = replacement.getIdentifier();
			option = replacement.getOption();
			target = replacement.getTarget();
		}

		final MenuOptionClicked menuOptionClicked = new MenuOptionClicked();
		menuOptionClicked.setParam0(param0);
		menuOptionClicked.setMenuOption(option);
		menuOptionClicked.setMenuTarget(target);
		menuOptionClicked.setMenuAction(MenuAction.of(opcode));
		menuOptionClicked.setId(id);
		menuOptionClicked.setParam1(param1);
		menuOptionClicked.setSelectedItemIndex(client.getSelectedItemSlot());
		menuOptionClicked.setCanvasX(canvasX);
		menuOptionClicked.setCanvasY(canvasY);

		client.getCallbacks().post(menuOptionClicked);

		if (menuEntry != null && menuEntry.getConsumer() != null)
		{
			menuEntry.getConsumer().accept(menuEntry);
		}

		if (menuOptionClicked.isConsumed())
		{
			return;
		}

		copy$menuAction(menuOptionClicked.getParam0(), menuOptionClicked.getParam1(),
				menuOptionClicked.getMenuAction() == UNKNOWN ? opcode : menuOptionClicked.getMenuAction().getId(),
				menuOptionClicked.getId(), menuOptionClicked.getMenuOption(), menuOptionClicked.getMenuTarget(),
				canvasX, canvasY);
	}

	@Inject
	@Override
	public void setPendingAutomation(AutomatedInteraction replacement)
	{
		automatedMenu.set(replacement);
	}

	@Inject
	@Override
	public AutomatedInteraction getPendingAutomation()
	{
		return automatedMenu.get();
	}
}
