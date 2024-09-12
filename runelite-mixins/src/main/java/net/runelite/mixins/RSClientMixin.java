/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * Copyright (c) 2020, ThatGamerBlue <thatgamerblue@gmail.com>
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

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.primitives.Doubles;
import net.runelite.api.Animation;
import net.runelite.api.ChatMessageType;
import net.runelite.api.EnumComposition;
import net.runelite.api.FriendContainer;
import net.runelite.api.GameState;
import net.runelite.api.GrandExchangeOffer;
import net.runelite.api.HintArrowType;
import net.runelite.api.Ignore;
import net.runelite.api.IndexDataBase;
import net.runelite.api.IndexedSprite;
import net.runelite.api.IntegerNode;
import net.runelite.api.InventoryID;
import net.runelite.api.ItemComposition;
import net.runelite.api.LoginState;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.MessageNode;
import net.runelite.api.Model;
import net.runelite.api.ModelData;
import net.runelite.api.NPC;
import net.runelite.api.NPCComposition;
import net.runelite.api.NameableContainer;
import net.runelite.api.NodeCache;
import net.runelite.api.ObjectComposition;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Prayer;
import net.runelite.api.RenderOverview;
import net.runelite.api.ScriptEvent;
import net.runelite.api.Skill;
import net.runelite.api.SpritePixels;
import net.runelite.api.StructComposition;
import net.runelite.api.VarPlayer;
import net.runelite.api.VarbitComposition;
import net.runelite.api.Varbits;
import net.runelite.api.WidgetNode;
import net.runelite.api.World;
import net.runelite.api.WorldType;
import net.runelite.api.WorldView;
import net.runelite.api.clan.ClanChannel;
import net.runelite.api.clan.ClanRank;
import net.runelite.api.clan.ClanSettings;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AccountHashChanged;
import net.runelite.api.events.AmbientSoundEffectCreated;
import net.runelite.api.events.BeforeMenuRender;
import net.runelite.api.events.CanvasSizeChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ClanChannelChanged;
import net.runelite.api.events.ClientTick;
import net.runelite.api.events.DraggingWidgetChanged;
import net.runelite.api.events.FriendsChatChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GrandExchangeOfferChanged;
import net.runelite.api.events.GrandExchangeSearched;
import net.runelite.api.events.ItemSpawned;
import net.runelite.api.events.MenuOpened;
import net.runelite.api.events.MenuShouldLeftClick;
import net.runelite.api.events.PlayerMenuOptionsChanged;
import net.runelite.api.events.PostMenuSort;
import net.runelite.api.events.PostStructComposition;
import net.runelite.api.events.ResizeableChanged;
import net.runelite.api.events.StatChanged;
import net.runelite.api.events.UsernameChanged;
import net.runelite.api.events.VarbitChanged;
import net.runelite.api.events.VolumeChanged;
import net.runelite.api.events.WidgetClosed;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.events.WorldChanged;
import net.runelite.api.hooks.Callbacks;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.api.overlay.OverlayIndex;
import net.runelite.api.vars.AccountType;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetConfig;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.api.widgets.WidgetType;
import net.runelite.api.widgets.WidgetUtil;
import net.runelite.rs.api.RSAbstractArchive;
import net.runelite.rs.api.RSArchive;
import net.runelite.rs.api.RSBuffer;
import net.runelite.rs.api.RSChatChannel;
import net.runelite.rs.api.RSClanChannel;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSCollisionMap;
import net.runelite.rs.api.RSDbTable;
import net.runelite.rs.api.RSDbRowType;
import net.runelite.rs.api.RSDbTableType;
import net.runelite.rs.api.RSDualNode;
import net.runelite.rs.api.RSEnumComposition;
import net.runelite.rs.api.RSEvictingDualNodeHashTable;
import net.runelite.rs.api.RSFloorOverlayDefinition;
import net.runelite.rs.api.RSFont;
import net.runelite.rs.api.RSFriendSystem;
import net.runelite.rs.api.RSGameEngine;
import net.runelite.rs.api.RSIndexedSprite;
import net.runelite.rs.api.RSInterfaceParent;
import net.runelite.rs.api.RSItemContainer;
import net.runelite.rs.api.RSMenu;
import net.runelite.rs.api.RSModelData;
import net.runelite.rs.api.RSMusicSong;
import net.runelite.rs.api.RSNPC;
import net.runelite.rs.api.RSNode;
import net.runelite.rs.api.RSNodeDeque;
import net.runelite.rs.api.RSNodeHashTable;
import net.runelite.rs.api.RSObjectSound;
import net.runelite.rs.api.RSPacketBuffer;
import net.runelite.rs.api.RSPlayer;
import net.runelite.rs.api.RSRuneLiteClanMember;
import net.runelite.rs.api.RSRuneLiteMenuEntry;
import net.runelite.rs.api.RSScene;
import net.runelite.rs.api.RSScriptEvent;
import net.runelite.rs.api.RSSpritePixels;
import net.runelite.rs.api.RSStructComposition;
import net.runelite.rs.api.RSTile;
import net.runelite.rs.api.RSTileItem;
import net.runelite.rs.api.RSUsername;
import net.runelite.rs.api.RSWidget;
import net.runelite.rs.api.RSWorld;
import net.runelite.rs.api.RSWorldEntity;
import net.runelite.rs.api.RSWorldView;
import com.google.common.primitives.Ints;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntPredicate;

import static net.runelite.api.MenuAction.PLAYER_EIGHTH_OPTION;
import static net.runelite.api.MenuAction.PLAYER_FIFTH_OPTION;
import static net.runelite.api.MenuAction.PLAYER_FIRST_OPTION;
import static net.runelite.api.MenuAction.PLAYER_FOURTH_OPTION;
import static net.runelite.api.MenuAction.PLAYER_SECOND_OPTION;
import static net.runelite.api.MenuAction.PLAYER_SEVENTH_OPTION;
import static net.runelite.api.MenuAction.PLAYER_SIXTH_OPTION;
import static net.runelite.api.MenuAction.PLAYER_THIRD_OPTION;
import static net.runelite.api.Perspective.LOCAL_TILE_SIZE;
import static net.runelite.mixins.CameraMixin.NEW_PITCH_MAX;
import static net.runelite.mixins.CameraMixin.STANDARD_PITCH_MAX;
import static net.runelite.mixins.CameraMixin.STANDARD_PITCH_MIN;

@Mixin(RSClient.class)
public abstract class RSClientMixin implements RSClient
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	public static Logger rl$logger = LoggerFactory.getLogger("injected-client");

	@Inject
	@javax.inject.Inject
	private Callbacks callbacks;

	@Inject
	private DrawCallbacks drawCallbacks;

	@Inject
	private static int tickCount;

	@Inject
	private static IntPredicate animationInterpolationFilter;

	@Inject
	private static RSPlayer[] oldPlayers = new RSPlayer[2048];

	@Inject
	private static int itemPressedDurationBuffer;

	@Inject
	private static int inventoryDragDelay;

	@Inject
	private static int oldMenuEntryCount;

	@Inject
	private static RSTileItem lastItemDespawn;

	@Inject
	private int gpuFlags;

	@Inject
	private static boolean oldIsResized;

	@Inject
	static int skyboxColor;

	@Inject
	private final Cache<Integer, RSEnumComposition> enumCache = CacheBuilder.newBuilder()
			.maximumSize(64)
			.build();

	@Inject
	private static boolean printMenuActions;

	@Inject
	private static boolean hideDisconnect = false;

	@Inject
	private static boolean hideFriendAttackOptions = false;

	@Inject
	private static boolean hideClanmateAttackOptions = false;

	@Inject
	private static boolean hideFriendCastOptions = false;

	@Inject
	private static boolean hideClanmateCastOptions = false;

	@Inject
	private static boolean allWidgetsAreOpTargetable = false;

	@Inject
	public static int viewportColor;

	@Inject
	private static Set<String> unhiddenCasts = new HashSet<String>();

	@Inject
	private boolean isMirrored = false;

	@Inject
	private Integer comparingAppearance = 0;

	@Inject
	private static boolean hdMinimapEnabled;

	@Inject
	public static boolean unlockedFps;

	@Inject
	public static double tmpCamAngleY;

	@Inject
	public static double tmpCamAngleX;

	@Inject
	public long lastNanoTime;

	@Inject
	public long delayNanoTime;

	@Inject
	public RSEvictingDualNodeHashTable tmpModelDataCache = newEvictingDualNodeHashTable(16);

	@Inject
	private List<String> outdatedScripts = new ArrayList<>();

	@Inject
	private static ArrayList<WidgetItem> widgetItems = new ArrayList<>();

	@Inject
	private static ArrayList<Widget> hiddenWidgets = new ArrayList<>();

	@Shadow("menu")
	private static RSMenu menu;

	/**
	 * Sub-menu
	 */

	@Inject
	private int clickedIdx = -1;
	@Inject
	private int clickedSubIdx = -1;
	@Inject
	private int submenuX = 0;
	@Inject
	private int submenuY = 0;
	@Inject
	private int submenuWidth = 0;
	@Inject
	private int submenuHeight = 0;
	@Inject
	private int submenuScroll = 0;
	@Inject
	private static int submenuScrollMax = 0;
	@Inject
	private int submenuIdx = -1;
	@Inject
	private int menuScroll = 0;
	@Inject
	private static int menuScrollMax = 0;

	@Inject
	@Override
	public boolean isMenuScrollable()
	{
		return menuScrollMax > 0;
	}
	@Inject
	@Override
	public int getMenuScroll()
	{
		return menuScroll;
	}
	@Inject
	@Override
	public void setMenuScroll(int s)
	{
		menuScroll = Ints.constrainToRange(s, 0, menuScrollMax);
	}
	@Inject
	@Override
	public int getSubmenuX()
	{
		return submenuX;
	}
	@Inject
	@Override
	public MenuEntry getClickedMenuEntry()
	{
		if (clickedIdx == -1)
		{
			return null;
		}

		MenuEntry entry;
		if (clickedSubIdx != -1)
		{
			entry = menu.getMenuEntries()[clickedIdx].getSubMenu().getMenuEntries()[clickedSubIdx];
		}
		else
		{
			entry = menu.getMenuEntries()[clickedIdx];
		}
		clickedIdx = -1;
		clickedSubIdx = -1;
		return entry;
	}
	@Inject
	@Override
	public int getSubmenuY()
	{
		return submenuY;
	}
	@Inject
	@Override
	public int getSubmenuWidth()
	{
		return submenuWidth;
	}
	@Inject
	@Override
	public int getSubmenuHeight()
	{
		return submenuHeight;
	}
	@Inject
	@Override
	public int getSubmenuScroll()
	{
		return submenuScroll;
	}
	@Inject
	@Override
	public int getSubmenuIdx()
	{
		return submenuIdx;
	}
	@Inject
	@Override
	public void setSubmenuX(int x)
	{
		submenuX = x;
	}
	@Inject
	@Override
	public void setSubmenuY(int y)
	{
		submenuY = y;
	}
	@Inject
	@Override
	public void setSubmenuWidth(int w)
	{
		submenuWidth = w;
	}
	@Inject
	@Override
	public void setSubmenuHeight(int h)
	{
		submenuHeight = h;
	}
	@Inject
	@Override
	public void setSubmenuScroll(int s)
	{
		submenuScroll = Ints.constrainToRange(s, 0, submenuScrollMax);
	}
	@Inject
	@Override
	public void setSubmenuScrollMax(int max)
	{
		submenuScrollMax = max;
	}
	@Inject
	@Override
	public void setSubmenuIdx(int idx)
	{
		submenuIdx = idx;
	}
	/**
	 * End of sub-menu
	 */

	@Inject
	private static final Map<Integer, byte[]> customClientScripts = new HashMap<>();

	@Inject
	@Override
	public void setPrintMenuActions(boolean yes)
	{
		printMenuActions = yes;
	}

	@Inject
	@Override
	public void setHideDisconnect(boolean dontShow)
	{
		hideDisconnect = dontShow;
	}

	@Inject
	@Override
	public void setHideFriendAttackOptions(boolean yes)
	{
		hideFriendAttackOptions = yes;
	}

	@Inject
	@Override
	public void setHideFriendCastOptions(boolean yes)
	{
		hideFriendCastOptions = yes;
	}

	@Inject
	@Override
	public void setHideClanmateAttackOptions(boolean yes)
	{
		hideClanmateAttackOptions = yes;
	}

	@Inject
	@Override
	public void setHideClanmateCastOptions(boolean yes)
	{
		hideClanmateCastOptions = yes;
	}

	@Inject
	@Override
	public void setAllWidgetsAreOpTargetable(boolean yes)
	{
		allWidgetsAreOpTargetable = yes;
	}

	@Inject
	@Override
	public void setUnhiddenCasts(Set<String> casts)
	{
		unhiddenCasts = casts;
	}

	@Inject
	public RSClientMixin()
	{
	}

	@Inject
	@Override
	public String getBuildID()
	{
		return "OpenOSRS";
	}

	@Inject
	@Override
	public Callbacks getCallbacks()
	{
		return callbacks;
	}

	@Inject
	@Override
	public DrawCallbacks getDrawCallbacks()
	{
		return drawCallbacks;
	}

	@Inject
	@Override
	public void setDrawCallbacks(DrawCallbacks drawCallbacks)
	{
		this.drawCallbacks = drawCallbacks;
	}

	@Inject
	@Override
	public Logger getLogger()
	{
		return rl$logger;
	}

	@Inject
	@Override
	public IntPredicate getAnimationInterpolationFilter()
	{
		return animationInterpolationFilter;
	}

	@Inject
	@Override
	public void setAnimationInterpolationFilter(IntPredicate filter)
	{
		animationInterpolationFilter = filter;
	}

	@Inject
	@Override
	public void setInventoryDragDelay(int delay)
	{
		inventoryDragDelay = delay;
	}

	@Inject
	@Override
	public boolean isHdMinimapEnabled()
	{
		return hdMinimapEnabled;
	}

	@Inject
	@Override
	public void setHdMinimapEnabled(boolean enabled)
	{
		hdMinimapEnabled = enabled;
	}

	@Inject
	@Override
	public AccountType getAccountType()
	{
		int varbit = getVarbitValue(Varbits.ACCOUNT_TYPE);

		switch (varbit)
		{
			case 1:
				return AccountType.IRONMAN;
			case 2:
				return AccountType.ULTIMATE_IRONMAN;
			case 3:
				return AccountType.HARDCORE_IRONMAN;
			case 4:
				return AccountType.GROUP_IRONMAN;
			case 5:
				return AccountType.HARDCORE_GROUP_IRONMAN;
			case 6:
				return AccountType.UNRANKED_GROUP_IRONMAN;
			default:
				return AccountType.NORMAL;
		}
	}

	@Inject
	@Override
	public int getBoostedSkillLevel(Skill skill)
	{
		int[] boostedLevels = getBoostedSkillLevels();
		return boostedLevels[skill.ordinal()];
	}

	@Inject
	@Override
	public int getRealSkillLevel(Skill skill)
	{
		int[] realLevels = getRealSkillLevels();
		return realLevels[skill.ordinal()];
	}

	@Inject
	@Override
	public int getTotalLevel()
	{
		int totalLevel = 0;

		int[] realLevels = client.getRealSkillLevels();
		int lastSkillIdx = Skill.CONSTRUCTION.ordinal();

		for (int i = 0; i < realLevels.length; i++)
		{
			if (i <= lastSkillIdx)
			{
				totalLevel += realLevels[i];
			}
		}

		return totalLevel;
	}

	@Inject
	public MessageNode addChatMessage(ChatMessageType type, String name, String message, String sender, boolean postEvent)
	{
		assert this.isClientThread() : "addChatMessage must be called on client thread";

		ChatMessageType tmpType = type;
		String tmpMessage = message;

		if (type == ChatMessageType.CLAN_GIM_CHAT)
		{
			tmpType = ChatMessageType.CLAN_CHAT;
			tmpMessage = "|" + message;
		}
		else if (type == ChatMessageType.CLAN_GIM_MESSAGE)
		{
			tmpType = ChatMessageType.CLAN_MESSAGE;
			tmpMessage = "|" + message;
		}

		copy$addChatMessage(tmpType.getType(), name, tmpMessage, sender);

		Logger logger = client.getLogger();
		if (logger.isDebugEnabled())
		{
			logger.debug("Chat message type {}: {}", type.name(), message);
		}

		// Get the message node which was added
		@SuppressWarnings("unchecked") Map<Integer, RSChatChannel> chatLineMap = client.getChatLineMap();
		RSChatChannel chatLineBuffer = chatLineMap.get(type.getType());
		MessageNode messageNode = chatLineBuffer.getLines()[0];

		if (postEvent)
		{
			final ChatMessage chatMessage = new ChatMessage(messageNode, type, name, message, sender, messageNode.getTimestamp());
			client.getCallbacks().post(chatMessage);
		}

		return messageNode;
	}

	@Inject
	@Override
	public MessageNode addChatMessage(ChatMessageType type, String name, String message, String sender)
	{
		return addChatMessage(type, name, message, sender, true);
	}

	@Inject
	@Override
	public GameState getGameState()
	{
		return GameState.of(getRSGameState());
	}

	@Inject
	@Override
	public void setGameState(int state)
	{
		assert this.isClientThread() : "setGameState must be called on client thread";
		client.setRSGameState(state);
	}

	@Inject
	@Override
	public void setGameState(GameState gameState)
	{
		assert this.isClientThread() : "setGameState must be called on client thread";
		setGameState(gameState.getState());
	}

	@Inject
	@Override
	public Point getMouseCanvasPosition()
	{
		return new Point(getMouseX(), getMouseY());
	}

	@Inject
	@Override
	public void showMouseCross(int color)
	{
		client.setMouseCrossColor(color);
		client.setMouseCrossState(0);
	}

	@Inject
	@Override
	public Widget[] getWidgetRoots()
	{
		int topGroup = getTopLevelInterfaceId();
		if (topGroup == -1)
		{
			return new Widget[]{};
		}
		List<Widget> widgets = new ArrayList<Widget>();
		for (RSWidget widget : client.getWidgetDefinition().getWidgets()[topGroup])
		{
			if (widget != null && widget.getRSParentId() == -1)
			{
				widgets.add(widget);
			}
		}
		return widgets.toArray(new Widget[widgets.size()]);
	}

	@Inject
	@Override
	public Widget getWidget(WidgetInfo widget)
	{
		int groupId = widget.getGroupId();
		int childId = widget.getChildId();

		return getWidget(groupId, childId);
	}

	@Inject
	@Override
	public Widget getWidget(int id)
	{
		return getWidget(WidgetUtil.componentToInterface(id), WidgetUtil.componentToId(id));
	}

	@Inject
	@Override
	public RSWidget[] getGroup(int groupId)
	{
		if (client.getWidgetDefinition() == null)
		{
			return null;
		}
		else
		{
			RSWidget[][] widgets = client.getWidgetDefinition().getWidgets();
			return widgets != null && groupId >= 0 && groupId < widgets.length && widgets[groupId] != null ? widgets[groupId] : null;
		}
	}

	@Inject
	@Override
	public Widget getWidget(int groupId, int childId)
	{
		if (client.getWidgetDefinition() == null)
		{
			return null;
		}
		else
		{
			RSWidget[][] widgets = client.getWidgetDefinition().getWidgets();
			if (widgets != null && widgets.length > groupId)
			{
				RSWidget[] childWidgets = widgets[groupId];
				return childWidgets != null && childWidgets.length > childId ? childWidgets[childId] : null;
			}
			else
			{
				return null;
			}
		}
	}

	@Inject
	@Override
	public RSEvictingDualNodeHashTable getWidgetSpriteCache()
	{
		return getWidgetDefinition() != null ? getWidgetDefinition().getWidgetSpriteCache() : null;
	}

	// Unethicalite API
	@Inject
	@Override
	public RSWidget[][] getWidgets()
	{
		return getWidgetDefinition() != null ? getWidgetDefinition().getWidgets() : null;
	}

	@Inject
	@Override
	public RSWidget getWidgetChild(int parent, int child)
	{
		return getWidgetDefinition() != null ? getWidgetDefinition().getWidgetChild(parent, child) : null;
	}
	//



	@Inject
	@Override
	public int getServerVarpValue(int varpId)
	{
		int[] varps = this.getServerVarps();
		return varps[varpId];
	}

	@Inject
	@Override
	public int getVarpValue(VarPlayer varPlayer)
	{
		int[] varps = getServerVarps();
		return varps[varPlayer.getId()];
	}

	@Inject
	@Override
	public int getServerVarbitValue(int varbit)
	{
		return this.getVarbitValue(this.getServerVarps(), varbit);
	}

	@Inject
	@Override
	public int getVar(VarPlayer varPlayer)
	{
		int[] varps = getVarps();
		return varps[varPlayer.getId()];
	}

	@Inject
	@Override
	public int getVarpValue(int[] varps, int varpId)
	{
		return varps[varpId];
	}

	@Inject
	@Override
	public int getVarpValue(int varpId)
	{
		return getVarpValue(getVarps(), varpId);
	}

	@Inject
	@Override
	public boolean isPrayerActive(Prayer prayer)
	{
		return getVarbitValue(prayer.getVarbit()) == 1;
	}

	/**
	 * Returns the local player's current experience in the specified
	 * {@link Skill}.
	 *
	 * @param skill the {@link Skill} to retrieve the experience for
	 * @return the local player's current experience in the specified
	 * {@link Skill}, or -1 if the {@link Skill} isn't valid
	 */
	@Inject
	@Override
	public int getSkillExperience(Skill skill)
	{
		int[] experiences = getSkillExperiences();

		if (skill == Skill.OVERALL)
		{
			rl$logger.debug("getSkillExperience called for {}!", skill);
			return (int) getOverallExperience();
		}

		int idx = skill.ordinal();

		// I'm not certain exactly how needed this is, but if the Skill enum is updated in the future
		// to hold something else that's not reported it'll save us from an ArrayIndexOutOfBoundsException.
		if (idx >= experiences.length)
		{
			return -1;
		}

		return experiences[idx];
	}

	@Inject
	@Override
	public long getOverallExperience()
	{
		int[] experiences = getSkillExperiences();

		long totalExperience = 0L;

		for (int experience : experiences)
		{
			totalExperience += experience;
		}

		return totalExperience;
	}

	@Inject
	@Override
	public void refreshChat()
	{
		setChatCycle(getCycleCntr());
	}

	/**
	 * RSRuneLiteMenuEntry methods used by injector
	 *
	 * DO NOT REMOVE
	 */
	@Inject
	public static RSRuneLiteMenuEntry newBareRuneliteMenuEntry()
	{
		throw new NotImplementedException();
	}

	@Inject
	public static RSRuneLiteMenuEntry newRuneliteMenuEntry(int idx)
	{
		throw new NotImplementedException();
	}

	/**
	 * Deprecated menu entry
	 */

	@Inject
	@Override
	public MenuEntry createMenuEntry(String option, String target, int identifier, int opcode, int param1, int param2, int itemId, boolean forceLeftClick)
	{
		return menu.createMenuEntry(option, target, identifier, opcode, param1, param2, itemId, forceLeftClick);
	}

	@Inject
	@Override
	public MenuEntry createMenuEntry(int idx)
	{
		return menu.createMenuEntry(idx);
	}

	@Inject
	@Override
	public MenuEntry[] getMenuEntries()
	{
		return menu.getMenuEntries();
	}

	@Inject
	@Override
	public void setMenuEntries(MenuEntry[] menuEntries)
	{
		menu.setMenuEntries(menuEntries);
	}

	@Inject
	@Override
	public int getMenuOptionCount()
	{
		return menu.getMenuOptionCount();
	}

	@Inject
	@Override
	public void setMenuOptionCount(int count)
	{
		menu.setMenuOptionCount(count);
	}

	@Inject
	@Override
	public int getMenuX()
	{
		return menu.getMenuX();
	}

	@Inject
	@Override
	public int getMenuY()
	{
		return menu.getMenuY();
	}

	@Inject
	@Override
	public int getMenuWidth()
	{
		return menu.getMenuWidth();
	}

	@Inject
	@Override
	public int getMenuHeight()
	{
		return menu.getMenuHeight();
	}
	/*--------------------------------------------------------------------------------------*/

	@Copy("menu")
	@Replace("menu")
	final void menu()
	{
		boolean var1 = false;
		//int var2;
		//int var5;
		while (!var1)
		{
			var1 = true;
			for (int i = 0; i < menu.getMenuOptionCount() - 1; ++i)
			{
				if (menu.getMenuOpcodes()[i] < 1000 && menu.getMenuOpcodes()[i + 1] > 1000)
				{
					menu.sortMenuEntries(i, i + 1);
					var1 = false;
				}
			}
			if (var1 && !client.isMenuOpen())
			{
				client.getCallbacks().post(new PostMenuSort());
			}
		}

		if (client.getDraggedWidget() == null)
		{
			int mouseLastButton = client.getMouseLastButton();
			if (client.isMenuOpen())
			{
				if (mouseLastButton != 1 && (client.isMouseCam() || mouseLastButton != 4))
				{
					int mouseX = client.getMouseX();
					int mouseY = client.getMouseY();
					//this checks if the mouse is contained in the menu area
					boolean regmenuContainsMouse = (mouseX >= client.getMenuX() - 10 && mouseX <= client.getMenuX() + client.getMenuWidth() + 10 && mouseY >= client.getMenuY() - 10 && mouseY <= client.getMenuY() + client.getMenuHeight() + 10);
					boolean submenuContainsMouse = (mouseX >= client.getSubmenuX() - 10 && mouseX <= client.getSubmenuX() + client.getSubmenuWidth() + 10 && mouseY >= client.getSubmenuY() - 10 && mouseY <= client.getSubmenuY() + client.getSubmenuHeight() + 10);
					if (!regmenuContainsMouse && !submenuContainsMouse)
					{
						client.setMenuOpen(false);
						client.setSubmenuIdx(-1);
						for (int i = 0; i < client.getRootWidgetCount(); ++i)
						{
							if (client.getWidgetWidths()[i] + client.getWidgetPositionsX()[i] >  client.getMenuX() && client.getWidgetPositionsX()[i] <  client.getMenuX() +  client.getMenuWidth() && client.getWidgetPositionsY()[i] + client.getWidgetHeights()[i] > client.getMenuY() && client.getWidgetPositionsY()[i] < client.getMenuY() + client.getMenuHeight())
							{
								client.getValidRootWidgets()[i] = true;
							}
							if (client.getWidgetWidths()[i] + client.getWidgetPositionsX()[i] > client.getSubmenuX() && client.getWidgetPositionsX()[i] < client.getSubmenuX() + client.getMenuWidth() && client.getWidgetPositionsY()[i] + client.getWidgetHeights()[i] > client.getSubmenuY() && client.getWidgetPositionsY()[i] < client.getSubmenuY() + client.getSubmenuHeight())
							{
								client.getValidRootWidgets()[i] = true;
							}
						}
					}
					else if (!submenuContainsMouse)
					{
						client.setSubmenuIdx(-1);
					}

					if (client.isMenuOpen() && client.getMouseWheelRotation() != 0)
					{
						if (regmenuContainsMouse && menuScrollMax > 0)
						{
							client.setMenuScroll(menuScroll + client.getMouseWheelRotation());
							if (menuScroll < 0)
							{
								menuScroll = 0;
							}
							else if (menuScroll > menuScrollMax)
							{
								menuScroll = menuScrollMax;
							}
						}

						if (submenuContainsMouse && submenuScrollMax > 0)
						{
							client.setSubmenuScroll(submenuScroll + client.getMouseWheelRotation());
							if (submenuScroll < 0)
							{
								submenuScroll = 0;
							}
							else if (submenuScroll > submenuScrollMax)
							{
								submenuScroll = submenuScrollMax;
							}
						}
					}
				}

				if (mouseLastButton == 1 || !client.isMouseCam() && mouseLastButton == 4)
				{
					// Regular
					outer:
					for (int i = 0; i < menu.getMenuOptionCount(); i++)
					{
						int rowY = (menu.getMenuOptionCount() - 1 - i - client.getMenuScroll()) * 15 + client.getMenuY() + 31;
						if (client.getMouseLastPressedX() > client.getMenuX() && client.getMouseLastPressedX() < client.getMenuWidth() + client.getMenuX() && client.getMouseLastPressedY() > rowY - 13 && client.getMouseLastPressedY() < rowY + 3)
						{
							MenuEntry entry = menu.getMenuEntries()[i];
							clickedIdx = i;
							client.sendMenuAction(entry.getParam0(), entry.getParam1(), entry.getOpcode(), entry.getIdentifier(), entry.getItemId(), entry.getWorldViewId(), entry.getOption(), entry.getTarget(), client.getMouseLastPressedX(), client.getMouseLastPressedY());
							break;
						}

						// Sub entries
						if (menu.getSubMenus()[i] != null)
						{
							MenuEntry[] subEntries = menu.getSubMenus()[i].getMenuEntries();
							for (int j = 0; j < subEntries.length; j++)
							{
								int rowYSub = (subEntries.length - 1 - j - client.getSubmenuScroll()) * 15 + client.getSubmenuY() + 31;
								if (client.getMouseLastPressedX() > client.getSubmenuX() && client.getMouseLastPressedX() < client.getSubmenuWidth() + client.getSubmenuX() && client.getMouseLastPressedY() > rowYSub - 13 && client.getMouseLastPressedY() < rowYSub + 3)
								{
									RSRuneLiteMenuEntry subEntry = (RSRuneLiteMenuEntry) subEntries[j];
									clickedIdx = i;
									clickedSubIdx = j;
									client.sendMenuAction(subEntry.getParam0(), subEntry.getParam1(), subEntry.getOpcode(), subEntry.getIdentifier(), subEntry.getItemId(), subEntry.getWorldViewId(), subEntry.getOption(), subEntry.getTarget(), client.getMouseLastPressedX(), client.getMouseLastPressedY());
									break outer;
								}
							}
						}
					}

					client.setMenuOpen(false);
					client.setSubmenuIdx(-1);

					for (int i = 0; i < client.getRootWidgetCount(); ++i)
					{
						if (client.getWidgetWidths()[i] + client.getWidgetPositionsX()[i] > client.getMenuX() && client.getWidgetPositionsX()[i] < client.getMenuX() + client.getMenuWidth() && client.getWidgetHeights()[i] + client.getWidgetPositionsY()[i] > client.getMenuY() && client.getWidgetPositionsY()[i] < client.getMenuY() +  client.getMenuHeight())
						{
							client.getValidRootWidgets()[i] = true;
						}
						else if (client.getSubmenuIdx() != -1 && (client.getWidgetWidths()[i] + client.getWidgetPositionsX()[i] > client.getSubmenuX() && client.getWidgetPositionsX()[i] < client.getSubmenuX() + client.getSubmenuWidth() && client.getWidgetHeights()[i] + client.getWidgetPositionsY()[i] > client.getSubmenuY() && client.getWidgetPositionsY()[i] < client.getSubmenuY() + client.getSubmenuHeight()))
						{
							client.getValidRootWidgets()[i] = true;
						}
					}
				}
			}
			else
			{
				int idx = menu.getMenuOptionCount() - 1;
				if ((mouseLastButton == 1 || !client.isMouseCam() && mouseLastButton == 4) && copy$shouldLeftClickOpenMenu(menu.getMenuOpcodes()[menu.getMenuOptionCount() - 1], menu.getMenuForceLeftClick()[menu.getMenuOptionCount() - 1]))
				{
					mouseLastButton = 2;
				}

				if ((mouseLastButton == 1 || !client.isMouseCam() && mouseLastButton == 4) && menu.getMenuOptionCount() > 0 && idx >= 0)
				{
					client.sendMenuAction(menu.getMenuArguments1()[idx], menu.getMenuArguments2()[idx], menu.getMenuOpcodes()[idx], menu.getMenuIdentifiers()[idx], menu.getMenuItemIds()[idx], menu.getMenuWorldViewIds()[idx], menu.getMenuOptions()[idx], menu.getMenuTargets()[idx], client.getMouseLastPressedX(), client.getMouseLastPressedY());
				}

				if (mouseLastButton == 2 && menu.getMenuOptionCount() > 0)
				{
					this.openMenu(client.getMouseLastPressedX(), client.getMouseLastPressedY());
				}
			}
		}
	}

	@Inject
	@Override
	public void setModIcons(IndexedSprite[] modIcons)
	{
		setRSModIcons((RSIndexedSprite[]) modIcons);
	}

	@Inject
	@Override
	@Nullable
	public LocalPoint getLocalDestinationLocation()
	{
		int sceneX = getDestinationX();
		int sceneY = getDestinationY();
		return sceneX != 0 && sceneY != 0 ? LocalPoint.fromScene(sceneX, sceneY, client.getTopLevelWorldView().getScene()) : null;
	}

	@Inject
	@Override
	public void changeMemoryMode(boolean lowMemory)
	{
		setLowMemory(lowMemory);
		setSceneLowMemory(lowMemory);
		setAudioHighMemory(true);
		setObjectDefinitionLowDetail(lowMemory);
		if (getGameState() == GameState.LOGGED_IN)
		{
			setGameState(GameState.LOADING);
		}
	}

	@Inject
	@Override
	public RSItemContainer getItemContainer(InventoryID inventory)
	{
		RSNodeHashTable itemContainers = getItemContainers();
		return (RSItemContainer) itemContainers.get(inventory.getId());
	}

	@Inject
	@Override
	public RSItemContainer getItemContainer(int id)
	{
		RSNodeHashTable itemContainers = getItemContainers();

		for (Object itemContainer : itemContainers)
		{
			RSItemContainer container = ((RSItemContainer) itemContainer);

			if (((RSItemContainer) itemContainer).getId() == id)
			{
				return container;
			}
		}

		return null;
	}

	@Inject
	@Override
	public boolean isFriended(String name, boolean mustBeLoggedIn)
	{
		RSUsername rsName = createName(name, getLoginType());
		return getFriendManager().isFriended(rsName, mustBeLoggedIn);
	}

	@Inject
	@Override
	public FriendContainer getFriendContainer()
	{
		return getFriendManager().getFriendContainer();
	}

	@Inject
	@Override
	public NameableContainer<Ignore> getIgnoreContainer()
	{
		return getFriendManager().getIgnoreContainer();
	}

	@FieldHook("isDraggingWidget")
	@Inject
	public static void draggingWidgetChanged(int idx)
	{
		DraggingWidgetChanged draggingWidgetChanged = new DraggingWidgetChanged();
		draggingWidgetChanged.setDraggingWidget(client.isDraggingWidget());
		client.getCallbacks().post(draggingWidgetChanged);
	}

	@Inject
	public RSSpritePixels createItemSprite(int itemId, int quantity, int border, int shadowColor, int stackable, boolean noted)
	{
		assert isClientThread() : "createItemSprite must be called on client thread";
		return createRSItemSprite(itemId, quantity, border, shadowColor, stackable, noted);
	}

	@Inject
	@Override
	public SpritePixels createItemSprite(int itemId, int quantity, int border, int shadowColor, int stackable, boolean noted, int scale)
	{
		assert isClientThread() : "createItemSprite must be called on client thread";

		int zoom = get3dZoom();
		set3dZoom(scale);
		try
		{
			return createItemSprite(itemId, quantity, border, shadowColor, stackable, noted);
		}
		finally
		{
			set3dZoom(zoom);
		}
	}

	@Copy("runWidgetOnLoadListener")
	@Replace("runWidgetOnLoadListener")
	@SuppressWarnings("InfiniteRecursion")
	public static void copy$runWidgetOnLoadListener(int groupId)
	{
		copy$runWidgetOnLoadListener(groupId);

		RSWidget[][] widgets = client.getWidgetDefinition().getWidgets();
		boolean loaded = widgets != null && widgets[groupId] != null;

		if (loaded)
		{
			WidgetLoaded event = new WidgetLoaded();
			event.setGroupId(groupId);
			client.getCallbacks().post(event);
		}
	}

	/*@FieldHook("itemDragDuration")
	@Inject
	public static void itemPressedDurationChanged(int idx)
	{
		if (client.getItemPressedDuration() > 0)
		{
			itemPressedDurationBuffer++;
			if (itemPressedDurationBuffer >= inventoryDragDelay)
			{
				client.setItemPressedDuration(itemPressedDurationBuffer);
			}
			else
			{
				client.setItemPressedDuration(0);
			}
		}
		else
		{
			itemPressedDurationBuffer = 0;
		}
	}*/

	//	@FieldHook("experience")
//	@Inject
	public static void experiencedChanged(int idx)
	{
		Skill[] possibleSkills = Skill.values();

		if (idx < possibleSkills.length)
		{
			Skill updatedSkill = possibleSkills[idx];
			StatChanged statChanged = new StatChanged(
					updatedSkill,
					client.getSkillExperience(updatedSkill),
					client.getRealSkillLevel(updatedSkill),
					client.getBoostedSkillLevel(updatedSkill)
			);
			client.getCallbacks().post(statChanged);
		}
	}

	@FieldHook("changedSkills")
	@Inject
	public static void boostedSkillLevelsChanged(int idx)
	{
		if (idx == -1)
		{
			return;
		}

		int changedSkillIdx = idx - 1 & 31;
		int skillIdx = client.getChangedSkillLevels()[changedSkillIdx];
		Skill[] skills = Skill.values();
		if (skillIdx >= 0 && skillIdx < skills.length)
		{
			StatChanged statChanged = new StatChanged(
					skills[skillIdx],
					client.getSkillExperiences()[skillIdx],
					client.getRealSkillLevels()[skillIdx],
					client.getBoostedSkillLevels()[skillIdx]
			);
			client.getCallbacks().post(statChanged);
		}
	}

	@FieldHook("playerMenuActions")
	@Inject
	public static void playerOptionsChanged(int idx)
	{
		// Reset the menu opcode
		MenuAction[] playerActions = {PLAYER_FIRST_OPTION, PLAYER_SECOND_OPTION, PLAYER_THIRD_OPTION, PLAYER_FOURTH_OPTION,
				PLAYER_FIFTH_OPTION, PLAYER_SIXTH_OPTION, PLAYER_SEVENTH_OPTION, PLAYER_EIGHTH_OPTION};
		if (idx >= 0 && idx < playerActions.length)
		{
			MenuAction playerAction = playerActions[idx];
			client.getPlayerMenuTypes()[idx] = playerAction.getId();
		}

		PlayerMenuOptionsChanged optionsChanged = new PlayerMenuOptionsChanged();
		optionsChanged.setIndex(idx);
		client.getCallbacks().post(optionsChanged);
	}

	@FieldHook("gameState")
	@Inject
	public static void gameStateChanged(int idx)
	{
		GameState gameState = client.getGameState();
		client.getLogger().debug("Game state changed: {}", gameState);
		GameStateChanged gameStateChange = new GameStateChanged();
		gameStateChange.setGameState(gameState);
		client.getCallbacks().post(gameStateChange);

		if (gameState == GameState.LOGGED_IN)
		{
			if (client.getLocalPlayer() == null)
			{
				return;
			}

			int plane = client.getTopLevelWorldView().getPlane();
			RSScene scene = client.getTopLevelWorldView().getScene();
			RSTile[][][] tiles = scene.getTiles();
			RSNodeDeque[][][] allItemDeque = client.getWorldView().getGroundItems();
			RSNodeDeque[][] planeItems = allItemDeque[plane];

			for (int x = 0; x < 104; x++)
			{
				for (int y = 0; y < 104; y++)
				{
					RSNodeDeque itemDeque = planeItems[x][y];
					if (itemDeque != null)
					{
						RSTile tile = tiles[plane][x][y];
						RSNode head = itemDeque.getSentinel();

						for (RSNode current = head.getNext(); current != head; current = current.getNext())
						{
							RSTileItem item = (RSTileItem) current;
							item.setX(x);
							item.setY(y);
							ItemSpawned event = new ItemSpawned(tile, item);
							client.getCallbacks().post(event);
						}
					}
				}
			}
		}
		else if (gameState == GameState.LOGIN_SCREEN)
		{
			loadVarbits();
		}
	}

	@Inject
	private static Map<Integer, ArrayList<Integer>> varbitsMap;

	@Inject
	public static void loadVarbits()
	{
		// Load varbits into map<index, varbitIds>
		if (varbitsMap == null)
		{
			varbitsMap = new HashMap<>();
			RSArchive archive = client.getIndexConfig();
			int[] fileIds = archive.getFileIds(14);

			for (int i = 0; i < fileIds.length; i++)
			{
				VarbitComposition varbitComposition = client.getVarbit(i);
				if (varbitComposition != null)
				{
					int idx = varbitComposition.getIndex();
					if (varbitsMap.containsKey(idx))
					{
						varbitsMap.get(idx).add(i);
					}
					else
					{
						ArrayList<Integer> varbitIds = new ArrayList<>();
						varbitIds.add(i);
						varbitsMap.put(idx, varbitIds);
					}
				}
			}
		}
	}

	@Copy("findItemDefinitions")
	@Replace("findItemDefinitions")
	public static void copy$findItemDefinitions(String var0, boolean var1)
	{
		GrandExchangeSearched event = new GrandExchangeSearched();
		client.getCallbacks().post(event);
		if (!event.isConsumed())
		{
			copy$findItemDefinitions(var0, var1);
		}
	}

	@Inject
	@FieldHook("grandExchangeOffers")
	public static void onGrandExchangeOffersChanged(int idx)
	{
		if (idx == -1)
		{
			return;
		}

		GrandExchangeOffer internalOffer = client.getGrandExchangeOffers()[idx];

		if (internalOffer == null)
		{
			return;
		}

		GrandExchangeOfferChanged offerChangedEvent = new GrandExchangeOfferChanged();
		offerChangedEvent.setOffer(internalOffer);
		offerChangedEvent.setSlot(idx);
		client.getCallbacks().post(offerChangedEvent);
	}

	@Inject
	private static int[] oldVarps;

	@FieldHook("Varps_main")
	@Inject
	public static void settingsChanged(int idx)
	{
		// Varp changed
		VarbitChanged varbitChanged = new VarbitChanged();
		varbitChanged.setVarpId(idx);
		varbitChanged.setValue(client.getVarpValue(idx));
		client.getCallbacks().post(varbitChanged);

		// Varbit changed
		if (oldVarps == null)
		{
			oldVarps = new int[client.getVarps().length];
		}

		if (!Arrays.equals(oldVarps, client.getVarps()))
		{
			ArrayList<Integer> varbitIds = varbitsMap.get(idx);

			if (varbitIds == null || varbitIds.isEmpty())
			{
				return;
			}

			for (int varbitId : varbitIds)
			{
				int oldValue = client.getVarbitValue(oldVarps, varbitId);
				int newValue = client.getVarbitValue(client.getVarps(), varbitId);
				if (oldValue != newValue)
				{
					varbitChanged.setVarpId(-1);
					varbitChanged.setVarbitId(varbitId);
					varbitChanged.setValue(newValue);
					client.getCallbacks().post(varbitChanged);
				}
			}
			System.arraycopy(client.getVarps(), 0, oldVarps, 0, oldVarps.length);
		}
	}

	@FieldHook("isResizable")
	@Inject
	public static void resizeChanged(int idx)
	{
		//maybe couple with varbitChanged. resizeable may not be a varbit but it would fit with the other client settings.
		boolean isResized = client.isResized();

		if (oldIsResized != isResized)
		{
			ResizeableChanged resizeableChanged = new ResizeableChanged();
			resizeableChanged.setResized(isResized);
			client.getCallbacks().post(resizeableChanged);

			oldIsResized = isResized;
		}
	}

	@Inject
	public static RSRuneLiteClanMember runeLiteClanMember()
	{
		throw new NotImplementedException();
	}

	@FieldHook("friendsChat")
	@Inject
	public static void clanMemberManagerChanged(int idx)
	{
		client.getCallbacks().post(new FriendsChatChanged(client.getFriendsChatManager() != null));
	}

	@FieldHook("canvasWidth")
	@Inject
	public static void canvasWidthChanged(int idx)
	{
		client.getCallbacks().post(new CanvasSizeChanged());
	}

	@FieldHook("canvasHeight")
	@Inject
	public static void canvasHeightChanged(int idx)
	{
		client.getCallbacks().post(new CanvasSizeChanged());
	}

	@FieldHook("hintArrowPlayerIndex")
	@Inject
	public static void hintPlayerChanged(int ignored)
	{
		// Setting the localInteractingIndex (aka player target index, it only applies to players)
		// causes that player to get priority over others when rendering/menus are added
		if (client.getVar(VarPlayer.ATTACKING_PLAYER) == -1)
		{
			client.setLocalInteractingIndex(client.getHintArrowPlayerTargetIdx() & 2047);
		}
	}

	@FieldHook("combatTargetPlayerIndex")
	@Inject
	public static void combatPlayerTargetChanged(int ignored)
	{
		if (client.getLocalInteractingIndex() == -1)
		{
			final Player p = client.getHintArrowPlayer();
			if (p != null)
			{
				client.setLocalInteractingIndex(p.getId() & 2047);
			}
		}
	}

	@Inject
	@Override
	public boolean hasHintArrow()
	{
		return client.getHintArrowTargetType() != HintArrowType.NONE;
	}

	@Inject
	@Override
	public int getHintArrowType()
	{
		int type = client.getHintArrowTargetType();
		if (type == HintArrowType.NPC)
		{
			return HintArrowType.NPC;
		}
		else if (type == HintArrowType.PLAYER)
		{
			return HintArrowType.PLAYER;
		}
		else if (type == HintArrowType.COORDINATE)
		{
			return HintArrowType.COORDINATE;
		}
		else
		{
			return HintArrowType.NONE;
		}
	}

	@Inject
	@Override
	public void clearHintArrow()
	{
		client.setHintArrowTargetType(HintArrowType.NONE);
	}

	@Inject
	@Override
	public void setHintArrow(NPC npc)
	{
		client.setHintArrowTargetType(HintArrowType.NPC);
		client.setHintArrowNpcTargetIdx(npc.getIndex());
	}

	@Inject
	@Override
	public void setHintArrow(Player player)
	{
		client.setHintArrowTargetType(HintArrowType.PLAYER);
		client.setHintArrowPlayerTargetIdx(((RSPlayer) player).getId());
		hintPlayerChanged(-1);
	}

	@Inject
	@Override
	public void setHintArrow(WorldPoint point)
	{
		client.setHintArrowTargetType(HintArrowType.COORDINATE);
		client.setHintArrowX(point.getX());
		client.setHintArrowY(point.getY());
		// position the arrow in center of the tile
		client.setHintArrowOffsetX(LOCAL_TILE_SIZE / 2);
		client.setHintArrowOffsetY(LOCAL_TILE_SIZE / 2);
	}

	@Inject
	@Override
	public void setHintArrow(LocalPoint point)
	{
		client.setHintArrowTargetType(HintArrowType.COORDINATE);
		client.setHintArrowX(point.getX());
		client.setHintArrowY(point.getY());
		// position the arrow in center of the tile
		client.setHintArrowOffsetX(LOCAL_TILE_SIZE / 2);
		client.setHintArrowOffsetY(LOCAL_TILE_SIZE / 2);
	}

	@Inject
	@Override
	public WorldPoint getHintArrowPoint()
	{
		if (getHintArrowType() == HintArrowType.COORDINATE)
		{
			int x = client.getHintArrowX();
			int y = client.getHintArrowY();
			return new WorldPoint(x, y, client.getPlane());
		}

		return null;
	}

	@Inject
	@Override
	public Player getHintArrowPlayer()
	{
		if (getHintArrowType() == HintArrowType.PLAYER)
		{
			int idx = client.getHintArrowPlayerTargetIdx();
			RSPlayer[] players = client.getTopLevelWorldView().getPlayers();

			if (idx < 0 || idx >= players.length)
			{
				return null;
			}

			return players[idx];
		}

		return null;
	}

	@Inject
	@Override
	public NPC getHintArrowNpc()
	{
		if (getHintArrowType() == HintArrowType.NPC)
		{
			int idx = client.getHintArrowNpcTargetIdx();
			RSNPC[] npcs = client.getTopLevelWorldView().getNpcs();

			if (idx < 0 || idx >= npcs.length)
			{
				return null;
			}

			return npcs[idx];
		}

		return null;
	}

	@Override
	@Inject
	public void invokeMenuAction(String option, String target, int identifier, int opcode, int param0, int param1, int itemId, int x, int y)
	{
		assert isClientThread() : "invokeMenuAction must be called on client thread";

		client.sendMenuAction(param0, param1, opcode, identifier, itemId, -1, option, target, x, y);
	}

	@FieldHook("Login_username")
	@Inject
	public static void onUsernameChanged(int idx)
	{
		client.getCallbacks().post(new UsernameChanged());
	}

	@Override
	@Inject
	public int getTickCount()
	{
		return tickCount;
	}

	@Override
	@Inject
	public void setTickCount(int tick)
	{
		tickCount = tick;
	}

	@Inject
	@Override
	public EnumSet<WorldType> getWorldType()
	{
		int flags = getFlags();
		return WorldType.fromMask(flags);
	}

	@Copy("openMenu")
	@Replace("openMenu")
	public void copy$openMenu(int x, int y)
	{
		final MenuOpened event = new MenuOpened();
		event.setMenuEntries(getMenuEntries());
		callbacks.post(event);

		if (event.isModified())
		{
			setMenuEntries(event.getMenuEntries());
		}

		int tempWidth = client.getFontBold12().getTextWidth("Choose Option");

		int var4;
		int var5;
		int realCount = 0;
		for (var4 = 0; var4 < menu.getMenuOptionCount(); ++var4)
		{
			MenuEntry tempMenuEntry = menu.getMenuEntries()[var4];
			realCount++;
			String s = tempMenuEntry.getOption();
			if (!tempMenuEntry.getTarget().isEmpty())
			{
				s = s + " " + tempMenuEntry.getTarget();
			}

			if (tempMenuEntry.getSubMenu() != null)
			{
				s = s + " <col=ffffff><gt>";
			}
			tempWidth = Math.max(client.getFontBold12().getTextWidth(s), tempWidth);
		}

		tempWidth += 8;
		var4 = realCount * 15 + 22;
		var5 = x - tempWidth / 2;
		if (var5 + tempWidth > client.getCanvasWidth())
		{
			var5 = client.getCanvasWidth() - tempWidth;
		}

		if (var5 < 0)
		{
			var5 = 0;
		}

		int var6 = y;
		if (var4 + y > client.getCanvasHeight())
		{
			var6 = client.getCanvasHeight() - var4;
		}

		if (var6 < 0)
		{
			var6 = 0;
		}

		menu.setMenuX(var5);
		menu.setMenuY(var6);
		menu.setMenuWidth(tempWidth);
		menu.setMenuHeight(realCount * 15 + 22);
		client.getTopLevelWorldView().getScene().menuOpen(client.getPlane(), x - client.getViewportXOffset(), y - client.getViewportYOffset(), false);
		client.setMenuOpen(true);

		client.setMenuScroll(0);
		menuScrollMax = 0;
		if (var4 > this.getCanvasHeight())
		{
			menuScrollMax = (var4 - this.getCanvasHeight() + 14) / 15;
		}
	}


	/*@Copy("addWidgetItemMenuItem")
	@Replace("addWidgetItemMenuItem")
	static void copy$addWidgetItemMenuItem(RSWidget var0, RSItemComposition var1, int var2, int var3, boolean var4)
	{
		String[] var5 = var1.getInventoryActions();

		if (var5.length > var3)
		{
			copy$addWidgetItemMenuItem(var0, var1, var2, var3, var4);
		}
	}*/

	@Inject
	private static int rl$serverTick;

	@Inject
	@FieldHook("serverCycle")
	public static void onServerTicksChanged(int idx)
	{
		if (client.getServerCycle() == rl$serverTick + 1)
		{
			client.getCallbacks().serverTick();
		}
		rl$serverTick = client.getServerCycle();
	}

	@Inject
	@MethodHook("updateNpcs")
	public static void updateNpcs(RSWorldView wv, boolean var0, RSPacketBuffer var1)
	{
		client.getCallbacks().updateNpcs();
		syncMusicVolume();
	}

	@Inject
	@Override
	public WorldView getWorldView(int id)
	{
		if (id == -1)
		{
			return client.getTopLevelWorldView();
		}
		else
		{
			RSWorldEntity worldEntity = client.getTopLevelWorldView().getWorldEntities()[id];
			return worldEntity == null ? null : worldEntity.getWorldView();
		}
	}

	@SuppressWarnings("InfiniteRecursion")
	@Copy("addChatMessage")
	@Replace("addChatMessage")
	public static void copy$addChatMessage(int type, String name, String message, String sender)
	{
		copy$addChatMessage(type, name, message, sender);

		// Get the message node which was added
		@SuppressWarnings("unchecked") Map<Integer, RSChatChannel> chatLineMap = client.getChatLineMap();
		RSChatChannel chatLineBuffer = chatLineMap.get(type);
		MessageNode messageNode = chatLineBuffer.getLines()[0];

		ChatMessageType tmpType = ChatMessageType.of(type);

		if (tmpType == ChatMessageType.CLAN_CHAT && message != null && message.startsWith("|"))
		{
			tmpType = ChatMessageType.CLAN_GIM_CHAT;
			message = message.substring(1);
		}

		if (tmpType == ChatMessageType.CLAN_MESSAGE && message != null && message.startsWith("|"))
		{
			tmpType = ChatMessageType.CLAN_GIM_MESSAGE;
			message = message.substring(1);
		}

		Logger logger = client.getLogger();
		if (logger.isDebugEnabled())
		{
			ChatMessageType msgType = ChatMessageType.of(type);
			logger.debug("Chat message type {}: {}", msgType == ChatMessageType.UNKNOWN ? String.valueOf(type) : tmpType.name(), message);
		}

		final ChatMessage chatMessage = new ChatMessage(messageNode, tmpType, name, message, sender, messageNode.getTimestamp());
		client.getCallbacks().post(chatMessage);
	}

	@Copy("draw")
	@Replace("draw")
	public void copy$draw(boolean var1)
	{
		callbacks.frame();
		updateCamera();

		copy$draw(var1);

		checkResize();
	}

	@MethodHook("drawInterface")
	@Inject
	public static void preRenderWidgetLayer(Widget[] widgets, int parentId, int minX, int minY, int maxX, int maxY, int x, int y, int var8)
	{
		for (Widget value : widgets)
		{
			RSWidget widget = (RSWidget) value;
			if (widget == null || widget.getRSParentId() != parentId || widget.isSelfHidden())
			{
				continue;
			}

			final int renderX = x + widget.getRelativeX();
			final int renderY = y + widget.getRelativeY();
			widget.setRenderX(renderX);
			widget.setRenderY(renderY);

			if (widget.getType() == WidgetType.RECTANGLE && renderX == client.getViewportXOffset() && renderY == client.getViewportYOffset()
					&& widget.getWidth() == client.getViewportWidth() && widget.getHeight() == client.getViewportHeight()
					&& widget.getOpacity() > 0 && widget.isFilled() && widget.getFillMode().getOrdinal() == 0 && client.isGpu())
			{
				int tc = widget.getTextColor();
				int alpha = widget.getOpacity() & 0xFF;
				int inverseAlpha = 256 - alpha;
				int vpc = viewportColor;
				int c1 = (inverseAlpha * (tc & 0xFF00FF) >> 8 & 0xFF00FF) + (inverseAlpha * (tc & 0x00FF00) >> 8 & 0x00FF00);
				int c2 = (alpha * (vpc & 0xFF00FF) >> 8 & 0xFF00FF) + (alpha * (vpc & 0x00FF00) >> 8 & 0x00FF00);
				int outAlpha = inverseAlpha + ((vpc >>> 24) * (255 - inverseAlpha) * 0x8081 >>> 23);
				viewportColor = outAlpha << 24 | c1 + c2;
				widget.setHidden(true);
				hiddenWidgets.add(widget);
			}
		}
	}

	@Inject
	@MethodHook(value = "drawInterface", end = true)
	public static void postRenderWidgetLayer(Widget[] widgets, int parentId, int minX, int minY, int maxX, int maxY, int x, int y, int var8)
	{
		Callbacks callbacks = client.getCallbacks();
		int oldSize = widgetItems.size();

		for (Widget rlWidget : widgets)
		{
			RSWidget widget = (RSWidget) rlWidget;
			if (widget == null || widget.getRSParentId() != parentId || widget.isSelfHidden())
			{
				continue;
			}

			int type = widget.getType();
			if (type == WidgetType.GRAPHIC && widget.getItemId() != -1)
			{
				final int renderX = x + widget.getRelativeX();
				final int renderY = y + widget.getRelativeY();
				if (renderX >= minX && renderX <= maxX && renderY >= minY && renderY <= maxY)
				{
					WidgetItem widgetItem = new WidgetItem(widget.getItemId(), widget.getItemQuantity(), -1, widget.getBounds(), widget, null);
					widgetItems.add(widgetItem);
				}
			}
			else if (type == WidgetType.INVENTORY)
			{
				widgetItems.addAll(widget.getWidgetItems());
			}
		}

		List<WidgetItem> subList = Collections.emptyList();
		if (oldSize < widgetItems.size())
		{
			if (oldSize > 0)
			{
				subList = widgetItems.subList(oldSize, widgetItems.size());
			}
			else
			{
				subList = widgetItems;
			}
		}

		if (parentId == 0xabcdabcd)
		{
			widgetItems.clear();
		}
		else if (parentId != -1)
		{
			Widget widget = client.getWidget(parentId);
			Widget[] children = widget.getChildren();
			if (children == null || children == widgets)
			{
				callbacks.drawLayer(widget, subList);
			}
		}
		else
		{
			int group = -1;
			for (Widget widget : widgets)
			{
				if (widget != null)
				{
					group = WidgetUtil.componentToInterface(widget.getId());
					break;
				}
			}

			if (group == -1)
			{
				return;
			}

			callbacks.drawInterface(group, widgetItems);
			widgetItems.clear();
			for (int i = hiddenWidgets.size() - 1; i >= 0; i--)
			{
				Widget widget = hiddenWidgets.get(i);
				if (WidgetUtil.componentToInterface(widget.getId()) == group)
				{
					widget.setHidden(false);
					hiddenWidgets.remove(i);
				}
			}
		}
	}

	@Inject
	@Override
	public RSTileItem getLastItemDespawn()
	{
		return lastItemDespawn;
	}

	@Inject
	@Override
	public void setLastItemDespawn(RSTileItem lastItemDespawn)
	{
		RSClientMixin.lastItemDespawn = lastItemDespawn;
	}

	@Inject
	@Override
	public boolean isGpu()
	{
		return (gpuFlags & 1) == 1;
	}

	@Inject
	@Override
	public void setGpuFlags(int gpuFlags)
	{
		this.gpuFlags = gpuFlags;
	}

	@Inject
	@Override
	public int getGpuFlags()
	{
		return gpuFlags;
	}

	@Inject
	@Override
	public void queueChangedSkill(Skill skill)
	{
		int[] skills = client.getChangedSkills();
		int count = client.getChangedSkillsCount();
		skills[++count - 1 & 31] = skill.ordinal();
		client.setChangedSkillsCount(count);
	}

	@Inject
	@Override
	public RSSpritePixels[] getSprites(IndexDataBase source, int archiveId, int fileId)
	{
		RSAbstractArchive rsSource = (RSAbstractArchive) source;
		byte[] configData = rsSource.getConfigData(archiveId, fileId);
		if (configData == null)
		{
			return null;
		}

		decodeSprite(configData);

		int indexedSpriteCount = getIndexedSpriteCount();
		int maxWidth = getIndexedSpriteWidth();
		int maxHeight = getIndexedSpriteHeight();
		int[] offsetX = getIndexedSpriteOffsetXs();
		int[] offsetY = getIndexedSpriteOffsetYs();
		int[] widths = getIndexedSpriteWidths();
		int[] heights = getIndexedSpriteHeights();
		byte[][] spritePixelsArray = getSpritePixels();
		int[] indexedSpritePalette = getIndexedSpritePalette();

		RSSpritePixels[] array = new RSSpritePixels[indexedSpriteCount];

		for (int i = 0; i < indexedSpriteCount; ++i)
		{
			int width = widths[i];
			int height = heights[i];

			byte[] pixelArray = spritePixelsArray[i];
			int[] pixels = new int[width * height];

			RSSpritePixels spritePixels = createSpritePixels(pixels, width, height);
			spritePixels.setMaxHeight(maxHeight);
			spritePixels.setMaxWidth(maxWidth);
			spritePixels.setOffsetX(offsetX[i]);
			spritePixels.setOffsetY(offsetY[i]);

			for (int j = 0; j < width * height; ++j)
			{
				pixels[j] = indexedSpritePalette[pixelArray[j] & 0xff];
			}

			array[i] = spritePixels;
		}

		setIndexedSpriteOffsetXs(null);
		setIndexedSpriteOffsetYs(null);
		setIndexedSpriteWidths(null);
		setIndexedSpriteHeights(null);
		setIndexedSpritePalette(null);
		setSpritePixels(null);

		return array;
	}

	@Inject
	@Override
	public void setSkyboxColor(int newSkyboxColor)
	{
		skyboxColor = newSkyboxColor;
	}

	@Inject
	@Override
	public int getSkyboxColor()
	{
		return skyboxColor;
	}

	@Inject
	@FieldHook("cycleCntr")
	public static void onCycleCntrChanged(int idx)
	{
		client.getCallbacks().post(new ClientTick());
	}

	@Copy("shouldLeftClickOpenMenu")
	@Replace("shouldLeftClickOpenMenu")
	@SuppressWarnings("InfiniteRecursion")
	final boolean copy$shouldLeftClickOpenMenu(int menuOpcodes, boolean menuShiftClick)
	{
		if (copy$shouldLeftClickOpenMenu(menuOpcodes, menuShiftClick))
		{
			return true;
		}

		MenuShouldLeftClick menuShouldLeftClick = new MenuShouldLeftClick();
		client.getCallbacks().post(menuShouldLeftClick);

		if (menuShouldLeftClick.isForceRightClick())
		{
			return true;
		}

		int len = menu.getMenuOptionCount();
		if (len > 0)
		{
			int type = menu.getMenuOpcodes()[len - 1];
			return type == MenuAction.RUNELITE_OVERLAY.getId() || type == MenuAction.RUNELITE_OVERLAY_CONFIG.getId() || type == MenuAction.RUNELITE_INFOBOX.getId() || type == MenuAction.RUNELITE_LOW_PRIORITY.getId();
		}

		return false;
	}

	@Inject
	@Override
	public EnumComposition getEnum(int id)
	{
		assert isClientThread() : "getEnum must be called on client thread";

		RSEnumComposition rsEnumDefinition = enumCache.getIfPresent(id);
		if (rsEnumDefinition != null)
		{
			return rsEnumDefinition;
		}

		rsEnumDefinition = getRsEnum(id);
		enumCache.put(id, rsEnumDefinition);
		return rsEnumDefinition;
	}

	@Inject
	@Override
	public void resetHealthBarCaches()
	{
		getHealthBarCache().reset();
		getHealthBarSpriteCache().reset();
	}

	@Inject
	static boolean shouldHideAttackOptionFor(RSPlayer p)
	{
		/*if (client.getSpellSelected())
		{
			return ((hideFriendCastOptions && p.isFriended()) || (hideClanmateCastOptions && p.isFriendsChatMember()))
					&& !unhiddenCasts.contains(client.getSelectedSpellName().replaceAll("<[^>]*>", "").toLowerCase());
		}*/

		return ((hideFriendAttackOptions && p.isFriended()) || (hideClanmateAttackOptions && p.isFriendsChatMember()));
	}

	@Inject
	@Override
	public void addFriend(String friend)
	{
		RSFriendSystem friendSystem = getFriendManager();
		friendSystem.addFriend(friend);
	}

	@Inject
	@Override
	public void removeFriend(String friend)
	{
		RSFriendSystem friendSystem = getFriendManager();
		friendSystem.removeFriend(friend);
	}

	@Inject
	@Override
	public void addIgnore(String friend)
	{
		RSFriendSystem friendSystem = getFriendManager();
		friendSystem.addIgnore(friend);
	}

	@Inject
	@Override
	public void removeIgnore(String friend, boolean confirmToJagex)
	{
		RSFriendSystem friendSystem = getFriendManager();
		friendSystem.removeIgnore(friend, confirmToJagex);
	}

	@Inject
	private static BigInteger modulus;

	@Inject
	@Override
	public void setModulus(BigInteger modulus)
	{
		RSClientMixin.modulus = modulus;
	}

	@Inject
	@Override
	public BigInteger getModulus()
	{
		return RSClientMixin.modulus;
	}

	@Copy("forceDisconnect")
	@Replace("forceDisconnect")
	@SuppressWarnings("InfiniteRecursion")
	static void copy$forceDisconnect(int reason)
	{
		copy$forceDisconnect(reason);

		if (hideDisconnect && reason == 1)
		{
			client.promptCredentials(true);
		}
	}

	@Copy("changeGameOptions")
	@Replace("changeGameOptions")
	@SuppressWarnings("InfiniteRecursion")
	public static void copy$changeGameOptions(int var0)
	{
		copy$changeGameOptions(var0);

		int type = client.getVarpDefinition(var0).getType();
		if (type == 3 || type == 4 || type == 10)
		{
			VolumeChanged volumeChanged = new VolumeChanged(type == 3 ? VolumeChanged.Type.MUSIC : type == 4 ? VolumeChanged.Type.EFFECTS : VolumeChanged.Type.AREA);
			client.getCallbacks().post(volumeChanged);
		}
	}

	@Replace("getWidgetFlags")
	public static int getWidgetFlags(Widget widget)
	{
		IntegerNode integerNode = (IntegerNode) client.getWidgetFlags().get(((long) widget.getId() << 32) + (long) widget.getIndex());

		int widgetClickMask;

		if (integerNode == null)
		{
			widgetClickMask = widget.getClickMask();
		}
		else
		{
			widgetClickMask = integerNode.getValue();
		}

		if (allWidgetsAreOpTargetable)
		{
			widgetClickMask |= WidgetConfig.WIDGET_USE_TARGET;
		}

		return widgetClickMask;
	}

	@Inject
	@Override
	public void stopNow()
	{
		setStopTimeMs(1);
	}

	@Inject
	@Override
	public boolean isMirrored()
	{
		return isMirrored;
	}

	@Inject
	@Override
	public void setMirrored(boolean isMirrored)
	{
		this.isMirrored = isMirrored;
	}

	@Inject
	@Override
	public boolean isComparingAppearance()
	{
		return comparingAppearance > 0;
	}

	@Inject
	@Override
	public void setComparingAppearance(boolean comparingAppearance)
	{
		this.comparingAppearance += comparingAppearance ? 1 : -1;
	}

	@Inject
	@Override
	public ObjectComposition getObjectDefinition(int objectId)
	{
		assert this.isClientThread() : "getObjectDefinition must be called on client thread";
		return getRSObjectComposition(objectId);
	}
//
//	@Inject
//	@Override
//	@Nonnull
//	public ItemComposition getItemComposition(int id)
//	{
//		assert this.isClientThread() : "getItemComposition must be called on client thread";
//		return getRSItemDefinition(id);
//	}

	@Inject
	@Override
	@Nonnull
	public ItemComposition getItemDefinition(int id)
	{
		return getItemComposition(id);
	}

	@Inject
	@Override
	public NPCComposition getNpcDefinition(int id)
	{
		assert this.isClientThread() : "getNpcDefinition must be called on client thread";
		return getRSNpcComposition(id);
	}

	// this exists because the original got inlined
	@Inject
	public void playMusicTrack(int var0, RSAbstractArchive var1, int var2, int var3, int var4, boolean var5)
	{
		for (RSMusicSong musicSong : client.getMusicSongs())
		{
			if (musicSong.getMusicTrackGroupId() == var2)
			{
				client.setMusicPlayerStatus(1);
				musicSong.setMusicTrackArchive(var1);
				musicSong.setMusicTrackGroupId(var2);
				musicSong.setMusicTrackFileId(var3);
				musicSong.setMusicTrackVolume(var4);
				musicSong.setMusicTrackBoolean(var5);
				//musicSong.setPcmSampleLength(var0);
				break;
			}
		}
	}

	@Inject
	@Override
	public void setOutdatedScript(String outdatedScript)
	{
		if (!outdatedScripts.contains(outdatedScript))
		{
			outdatedScripts.add(outdatedScript);
		}
	}

	@Inject
	@Override
	public List<String> getOutdatedScripts()
	{
		return this.outdatedScripts;
	}

	@Inject
	@MethodHook(value = "changeWorld", end = true)
	public static void postChangeWorld(RSWorld world)
	{
		client.getCallbacks().post(new WorldChanged());
	}

	@Inject
	@Override
	public void queueChangedVarp(int varp)
	{
		assert client.isClientThread() : "queueChangedVarp must be called on client thread";

		int[] changedVarps = client.getChangedVarps();
		int changedVarpCount = client.getChangedVarpCount();
		changedVarps[changedVarpCount & 31] = varp;
		client.setChangedVarpCount(changedVarpCount + 1);
	}

	@Inject
	@Override
	public ScriptEvent createScriptEvent(Object... args)
	{
		return createRSScriptEvent(args);
	}

	@Inject
	@Override
	public RSScriptEvent createRSScriptEvent(Object... args)
	{
		RSScriptEvent event = createScriptEvent();
		event.setArguments(args);
		return event;
	}

	@Inject
	@Override
	public NodeCache getStructCompositionCache()
	{
		assert client.isClientThread() : "getStructCompositionCache must be called on client thread";

		return getRSStructCompositionCache();
	}

	@Inject
	@Override
	public StructComposition getStructComposition(int structID)
	{
		assert client.isClientThread() : "getStructComposition must be called on client thread";

		return getRSStructComposition(structID);
	}

	@Copy("StructDefinition_getStructDefinition")
	@Replace("StructDefinition_getStructDefinition")
	@SuppressWarnings("InfiniteRecursion")
	static RSStructComposition copy$getStructComposition(int id)
	{
		RSStructComposition comp = copy$getStructComposition(id);

		if (comp.getId() == -1)
		{
			comp.setId(id);
			PostStructComposition event = new PostStructComposition();
			event.setStructComposition(comp);
			client.getCallbacks().post(event);
		}

		return comp;
	}

	@Inject
	@Override
	public int getMusicVolume()
	{
		return client.getPreferences().getMusicVolume();
	}

	@Inject
	@Override
	public void setMusicVolume(int volume)
	{
		if (volume != client.getMusicVolume())
		{
			musicVolumeDesync = true;
		}
		client.setRSMusicVolume(volume);
	}

	@Inject
	private static boolean musicVolumeDesync;

	@Inject
	public static void syncMusicVolume()
	{
		if (musicVolumeDesync && client.getGameState() == GameState.LOGGED_IN)
		{
			musicVolumeDesync = false;
			Widget widget = client.getWidget(WidgetInfo.SETTINGS_SIDE_MUSIC_SLIDER_STEP_HOLDER);
			if (widget != null && widget.getChildren() != null && widget.getChildren().length > 0)
			{
				int childLength = widget.getChildren().length;
				int childIndex = Ints.constrainToRange((client.getMusicVolume() * childLength + 255) / 256, 0, childLength - 1);
				Widget child = widget.getChild(childIndex);
				if (child != null)
				{
					Object[] childOnOpListener = child.getOnOpListener();
					try
					{
						child.setOnOpListener((Object[]) null);
						client.invokeMenuAction("", "", 1, MenuAction.CC_OP.getId(), childIndex, widget.getId());
					}
					finally
					{
						child.setOnOpListener(childOnOpListener);
					}
				}
			}
		}
	}

	@Inject
	private static void unloadInterface(int id, RSNodeDeque nodeDeque)
	{
		for (RSScriptEvent scriptEvent = (RSScriptEvent) nodeDeque.last(); scriptEvent != null; scriptEvent = (RSScriptEvent) nodeDeque.previous())
		{
			RSWidget widget = (RSWidget) scriptEvent.getSource();
			int group = WidgetUtil.componentToInterface(widget.getId());
			if (id == group)
			{
				scriptEvent.unlink();
			}
		}
	}

	@Inject
	@MethodHook("closeInterface")
	public static void preCloseInterface(RSInterfaceParent iface, boolean willUnload)
	{
		client.getCallbacks().post(new WidgetClosed(iface.getId(), iface.getModalMode(), willUnload));
		if (willUnload)
		{
			int id = iface.getId();
			unloadInterface(id, client.getScriptEvents());
			unloadInterface(id, client.getScriptEvents3());
			unloadInterface(id, client.getScriptEvents2());
		}
	}

	@Inject
	@Override
	public ClanChannel getClanChannel()
	{
		return getCurrentClanChannels()[0];
	}

	@Inject
	@Override
	public ClanChannel getClanChannel(int clanId)
	{
		ClanChannel[] clanChannels = client.getCurrentClanChannels();

		if (clanId >= 0 && clanId < clanChannels.length)
		{
			return clanChannels[clanId];
		}

		return null;
	}

	@Inject
	@Override
	public ClanSettings getClanSettings()
	{
		return getCurrentClanSettingsAry()[0];
	}

	@Inject
	@Override
	public ClanSettings getClanSettings(int clanId)
	{
		ClanSettings[] clanSettings = getCurrentClanSettingsAry();

		if (clanId >= 0 && clanId < clanSettings.length)
		{
			return clanSettings[clanId];
		}

		return null;
	}

	@Inject
	@Override
	public ClanRank getClanRankFromRs(int rank)
	{
		return new ClanRank(rank);
	}

	@Inject
	@FieldHook("guestClanChannel")
	public static void onGuestClanChannelChanged(int idx)
	{
		client.getCallbacks().post(new ClanChannelChanged(client.getGuestClanChannel(), -1, true));
	}

	@Inject
	@FieldHook("currentClanChannels")
	public static void onCurrentClanChannelsChanged(int idx)
	{
		RSClanChannel[] clanChannels = client.getCurrentClanChannels();

		if (idx >= 0 && idx < clanChannels.length)
		{
			RSClanChannel clanChannel = clanChannels[idx];
			client.getCallbacks().post(new ClanChannelChanged(clanChannel, idx, false));
		}
	}

	@Inject
	public static RSArchive[] archives = new RSArchive[21];

	@Inject
	@FieldHook("rndHue")
	public static void rndHue(int idx)
	{
		int rndHue = client.getRndHue();

		if (rndHue >= -8 && rndHue <= 8)
		{
			RSScene scene = client.getTopLevelWorldView().getScene();

			short[][][] underlays = client.getTileUnderlays();
			short[][][] overlays = client.getTileOverlays();
			byte[][][] tileShapes = client.getTileShapes();

			scene.setUnderlayIds(Arrays.copyOf(underlays, underlays.length));
			scene.setOverlayIds(Arrays.copyOf(overlays, overlays.length));
			scene.setTileShapes(Arrays.copyOf(tileShapes, tileShapes.length));
		}
	}

	@Inject
	public Model loadModel(int id)
	{
		return loadModel(id, null, null);
	}

	@Inject
	public Model loadModel(int id, short[] colorToFind, short[] colorToReplace)
	{
		RSModelData modeldata = client.getModelData(client.getObjectDefinition_modelsArchive(), id, 0);

		if (colorToFind != null)
		{
			for (int i = 0; i < colorToFind.length; ++i)
			{
				modeldata.rs$recolor(colorToFind[i], colorToReplace[i]);
			}
		}

		return modeldata.toModel(modeldata.getAmbient() + 64, modeldata.getContrast() + 850, -30, -50, -30);
	}

	@Inject
	public Animation loadAnimation(int id)
	{
		return client.getSequenceDefinition(id);
	}

	@Inject
	@Override
	public boolean isUnlockedFps()
	{
		return unlockedFps;
	}

	@Inject
	public void setUnlockedFps(boolean unlocked)
	{
		unlockedFps = unlocked;

		if (unlocked)
		{
			posToCameraAngle(client.getCameraYawTarget(), client.getCameraPitch());
		}
		else
		{
			delayNanoTime = 0L;
		}
	}

	@Inject
	public void setUnlockedFpsTarget(int var1)
	{
		if (var1 <= 0)
		{
			delayNanoTime = 0L;
		}
		else
		{
			delayNanoTime = 1000000000L / (long) var1;
		}
	}

	@Inject
	@Override
	public long getUnlockedFpsTarget()
	{
		return delayNanoTime;
	}

	@Inject
	public void updateCamera()
	{
		if (unlockedFps)
		{
			long nanoTime = System.nanoTime();
			long diff = nanoTime - this.lastNanoTime;
			this.lastNanoTime = nanoTime;

			if (this.getGameState() == GameState.LOGGED_IN)
			{
				this.interpolateCamera(diff);
			}
		}
	}

	@Inject
	public void interpolateCamera(long var1)
	{
		double angleDX = diffToDangle(client.getCamAngleDY(), var1);
		double angleDY = diffToDangle(client.getCamAngleDX(), var1);

		tmpCamAngleY += angleDX / 2;
		tmpCamAngleX += angleDY / 2;
		tmpCamAngleX = Doubles.constrainToRange(tmpCamAngleX, Perspective.UNIT * STANDARD_PITCH_MIN, client.getCameraPitchRelaxerEnabled() ? Perspective.UNIT * NEW_PITCH_MAX : Perspective.UNIT * STANDARD_PITCH_MAX);

		int yaw = toCameraPos(tmpCamAngleY);
		int pitch = toCameraPos(tmpCamAngleX);

		client.setCameraYawTarget(yaw);
		client.setCameraPitchTarget(pitch);
	}

	@Inject
	public static double diffToDangle(int var0, long var1)
	{
		double var2 = var0 * Perspective.UNIT;
		double var3 = (double) var1 / 2.0E7D;

		return var2 * var3;
	}

	@Inject
	@Override
	public void posToCameraAngle(int var0, int var1)
	{
		tmpCamAngleY = var0 * Perspective.UNIT;
		tmpCamAngleX = var1 * Perspective.UNIT;
	}

	@Inject
	public static int toCameraPos(double var0)
	{
		return (int) (var0 / Perspective.UNIT) & 2047;
	}

	@Inject
	@MethodHook("doCycle")
	protected final void doCycle()
	{
		client.getCallbacks().tick();
	}

	@Inject
	@MethodHook(value = "doCycle", end = true)
	protected final void doCycleEnd()
	{
		client.getCallbacks().tickEnd();
	}

	@Inject
	@Override
	public RSModelData mergeModels(ModelData[] var0, int var1)
	{
		return newModelData(Arrays.copyOf(var0, var1, getModelDataArray().getClass()), var1);
	}

	@Inject
	@Override
	public RSModelData mergeModels(ModelData... var0)
	{
		return mergeModels(var0, var0.length);
	}

	@Inject
	public IndexDataBase getIndex(int id)
	{
		return RSClientMixin.archives[id];
	}

	@Inject
	@Override
	public RSModelData loadModelData(int var0)
	{
		RSModelData modelData = (RSModelData) this.tmpModelDataCache.get(var0);

		if (modelData == null)
		{
			modelData = getModelData(RSClientMixin.archives[7], var0, 0);
			if (modelData == null)
			{
				return null;
			}

			this.tmpModelDataCache.put((RSDualNode) modelData, (long) var0);
		}

		return modelData.newModelData(modelData, true, true, true, true);
	}

	@Inject
	public static RSFloorOverlayDefinition loadFloorOverlay(int var0)
	{
		RSFloorOverlayDefinition var1 = (RSFloorOverlayDefinition) client.getFloorOverlayDefinitionCache().get(var0);

		if (var1 == null)
		{
			byte[] var2 = client.getFloorOverlayDefinitionArchive().loadData(4, var0);
			var1 = client.newFloorOverlayDefinition();
			if (var2 != null)
			{
				RSBuffer var3 = client.newBuffer(var2);
				var1.decode(var3, var0);
			}

			var1.postDecode();
			client.getFloorOverlayDefinitionCache().put((RSDualNode) var1, (long) var0);
		}

		return var1;
	}

	@Copy("addObjects")
	@Replace("addObjects")
	@SuppressWarnings("InfiniteRecursion")
	public static void copy$addObjects(RSWorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, RSCollisionMap var7)
	{
		boolean resetLowMemory = false;

		byte tileSetting = client.getTileSettings()[0][var1][var2];

		if (client.isLowMemory())
		{
			byte[] var10000 = client.getTileSettings()[0][var1];
			var10000[var2] &= -17;
			if (var5 == 22)
			{
				int TileOverlay = client.getTileOverlays()[0][var1][var2] & 255;

				if (TileOverlay > 0)
				{
					RSFloorOverlayDefinition floorOverlayDefinition = loadFloorOverlay(TileOverlay - 1);
					if (floorOverlayDefinition.getTexture() < 0 && floorOverlayDefinition.getPrimaryRgb() == 16711935)
					{
						client.setLowMemory(false);
						resetLowMemory = true;
					}
				}
			}
		}

		copy$addObjects(var0, var1, var2, var3, var4, var5, var6, var7);

		client.getTileSettings()[0][var1][var2] = tileSetting;

		if (resetLowMemory)
		{
			client.setLowMemory(true);
		}
	}

	@Inject
	@Override
	public Widget getSelectedWidget()
	{
		int selectedSpellWidget = client.getSelectedSpellWidget();
		int selectedSpellChildIndex = client.getSelectedSpellChildIndex();

		Widget widget = client.getWidget(selectedSpellWidget);

		if (widget != null && selectedSpellChildIndex > -1)
		{
			return widget.getChild(selectedSpellChildIndex);
		}

		return null;
	}

	@Inject
	@Override
	public int addClientScript(byte[] script)
	{
		assert this.isClientThread() : "addClientScript must be called on client thread";

		int highestUsedScript = -1;
		for (int index : OverlayIndex.getOverlays())
		{
			if ((index >> 16) != 12)
			{
				continue;
			}

			int scriptId = index & 0xFFFF;
			if (scriptId > highestUsedScript)
			{
				highestUsedScript = scriptId;
			}
		}

		if (highestUsedScript == -1)
		{
			highestUsedScript = 10000;
		}

		int newScriptId = highestUsedScript + 1;
		OverlayIndex.getOverlays().add((12 << 16) | newScriptId);
		customClientScripts.put((12 << 16) | newScriptId, script);
		return newScriptId;
	}

	@Inject
	@MethodHook("loginScreen")
	public static void loginScreenClick(RSGameEngine var0, RSFont var1, RSFont var2)
	{
		if (!client.isWorldSelectOpen() && (client.getMouseLastPressedX() > client.getLoginScreenXPadding() + 765 || client.getMouseLastPressedY() > 503))
		{
			client.setMouseLastPressedX(0);
			client.setMouseLastPressedX(0);
		}
	}

	//	@FieldHook("worldSelectOpen")
//	@Inject
	public static void worldSelectionScreenToggled(int idx)
	{
		if (!client.isWorldSelectOpen())
		{
			Arrays.fill(client.getBufferProvider().getPixels(), 0);
		}
	}

	@MethodHook("drawTitle")
	@Inject
	public static void drawTitleHook(RSFont var0, RSFont var1, RSFont var2)
	{
		if (client.isWorldSelectOpen())
		{
			Arrays.fill(client.getBufferProvider().getPixels(), 0);
		}
	}

	@Inject
	@Override
	@Nullable
	public RSNPC getFollower()
	{
		int var1 = client.getFollowerIndex();
		RSNPC[] var2 = this.getTopLevelWorldView().getNpcs();
		return var1 >= 0 && var1 < var2.length ? var2[var1] : null;
	}

	// Render menu
	@Inject
	public static boolean drawMenu()
	{
		BeforeMenuRender event = new BeforeMenuRender();
		client.getCallbacks().post(event);
		if (!event.isConsumed())
		{
			client.drawOriginalMenu(255);
		}
		return true;
	}

	@Inject
	@Override
	public List getDBRowsByValue(int rowID, int column, int tupleIndex, Object value)
	{
		RSDbTable dbTable = client.getDbTable((rowID << 12 | column << 4));
		Map columns = (Map) dbTable.getColumns().get(tupleIndex);
		List rows = (List) columns.get(value);
		return rows == null ? Collections.emptyList() : Collections.unmodifiableList(rows);
	}

	@Inject
	@Override
	public Object[] getDBTableField(int rowID, int column, int tupleIndex)
	{
		RSDbRowType dbRowType = client.getDbRowType(rowID);
		RSDbTableType dbTableType = client.getDbTableType(dbRowType.getTableId());

		Object[] columnType = dbRowType.getColumnType(column);
		int[] type = dbTableType.getTypes()[column];

		if (columnType == null)
		{
			columnType = dbTableType.getDefaultValues()[column];
		}

		if (tupleIndex >= type.length)
		{
			throw new IllegalArgumentException("tuple index too large");
		}
		else if (columnType == null)
		{
			return new Object[0];
		}
		else
		{
			int fieldLength = columnType.length / type.length;
			Object[] field = new Object[fieldLength];

			for (int fieldIndex = 0; fieldIndex < fieldLength; ++fieldIndex)
			{
				field[fieldIndex] = columnType[fieldIndex * type.length + tupleIndex];
			}

			return field;
		}
	}

	@Inject
	private static int idleTimeout = 15000;

	@Inject
	private static volatile int idleCycles;

	@Inject
	public static volatile long lastActivityNanos = System.nanoTime();

	@Inject
	@FieldHook("MouseHandler_idleCycles")
	public static void onIdleCyclesChanged(int paramInt)
	{
		if (client.getMouseIdleTicks() > 0)
		{
			long l = System.nanoTime() - lastActivityNanos;
			idleCycles = (int) (l / 20000000L);
		}
		else
		{
			idleCycles = 0;
			lastActivityNanos = System.nanoTime();
		}

		client.setMouseIdleTicks(15000 * idleCycles / idleTimeout);
	}

	@Inject
	@Override
	public void setIdleTimeout(int ticks)
	{
		idleTimeout = ticks;
		if (idleTimeout > 75000)
		{
			idleTimeout = 75000;
		}
		else if (idleTimeout < 15000)
		{
			idleTimeout = 15000;
		}
	}

	@Inject
	@Override
	public int getIdleTimeout()
	{
		return idleTimeout;
	}

	@Inject
	@Override
	public int getKeyboardIdleTicks()
	{
		return this.getKeyHandler().getIdleCycles();
	}

	@Inject
	@Override
	public void setKeyboardIdleTicks(int var1)
	{
		this.getKeyHandler().setIdleCycles(var1);
	}

	@Inject
	@Override
	public boolean[] getPressedKeys()
	{
		return this.getKeyHandler().getPressedKeys();
	}

	@Inject
	@Override
	public RenderOverview getRenderOverview()
	{
		return client.getWorldMap();
	}

	@Inject
	@Override
	public void setWorldList(World[] worlds)
	{
		if (worlds != null && worlds.length != 0)
		{
			List<RSWorld> rsWorldList = new ArrayList<>();
			for (World world : worlds)
			{
				RSWorld rsWorld = client.createWorld();
				rsWorld.setActivity(world.getActivity());
				rsWorld.setAddress(world.getAddress());
				rsWorld.setId(world.getId());
				rsWorld.setLocation(world.getLocation());
				rsWorld.setIndex(world.getIndex());
				rsWorld.setPlayerCount(world.getPlayerCount());
				rsWorld.setTypes(world.getTypes());
				rsWorld.setMask(WorldType.toMask(world.getTypes()));
				rsWorldList.add(rsWorld);
			}
			client.setWorldList(rsWorldList.toArray(new RSWorld[0]));
		}
	}

	//@Shadow("clips")
	//static RSClips clips;

	@Inject
	@Override
	public int getRasterizer3D_clipNegativeMidX()
	{
		return client.getClips().getClipNegativeMidX();
	}

	@Inject
	@Override
	public int getRasterizer3D_clipNegativeMidY()
	{
		return client.getClips().getClipNegativeMidY();
	}

	@Inject
	@Override
	public void set3dZoom(int zoom)
	{
		client.getClips().setViewportZoom(zoom);
		client.setScale(zoom);
	}

	@Inject
	@Override
	public WidgetNode openInterface(int componentId, int interfaceId, int modalMode)
	{
		assert this.isClientThread() : "openInterface must be called on client thread";

		Widget component = this.getWidget(componentId);
		if (component == null)
		{
			throw new IllegalStateException("component does not exist");
		}
		else if (component.getType() != 0)
		{
			throw new IllegalStateException("component is not a layer");
		}
		else
		{
			RSInterfaceParent interfaceNode = (RSInterfaceParent) this.getComponentTable().get((long) componentId);
			if (interfaceNode != null)
			{
				this.closeInterface(interfaceNode, interfaceId != interfaceNode.getId());
			}

			Iterator iter = this.getComponentTable().iterator();

			RSInterfaceParent iface;
			do
			{
				if (!iter.hasNext())
				{
					interfaceNode = newInterfaceParent();
					interfaceNode.setId(interfaceId);
					interfaceNode.setModalMode(modalMode);
					this.getComponentTable().put(interfaceNode, (long) componentId);
					this.getWidgetDefinition().loadInterface(interfaceId);
					this.revalidateWidgetScroll(this.getWidgetDefinition().getWidgets()[componentId >> 16], component, false);
					this.copy$runWidgetOnLoadListener(interfaceId);
					int topLevelInterfaceId = this.getTopLevelInterfaceId();
					if (topLevelInterfaceId != -1 && this.getWidgetDefinition().loadInterface(topLevelInterfaceId))
					{
						this.runComponentCloseListeners(this.getWidgetDefinition().getWidgets()[topLevelInterfaceId], 1);
					}

					return interfaceNode;
				}

				iface = (RSInterfaceParent) iter.next();
			}
			while (iface.getId() != interfaceId);

			throw new IllegalStateException("interface " + interfaceId + " is already open");
		}
	}

	@Inject
	@Override
	public void closeInterface(WidgetNode interfaceNode, boolean unload)
	{
		WidgetNode widgetNode = (WidgetNode) interfaceNode;
		if (widgetNode != this.getComponentTable().get(widgetNode.getHash()))
		{
			throw new IllegalArgumentException("WidgetNode is no longer valid");
		}
		else
		{
			this.closeRSInterface(widgetNode, unload);
		}
	}

	@Inject
	@FieldHook("accountHash")
	public void onAccountHashChanged(int var0)
	{
		if (this.callbacks != null)
		{
			this.callbacks.post(new AccountHashChanged());
		}
	}

	@Inject
	private int expandedMapLoadingChunks;

	@Inject
	@Override
	public void setExpandedMapLoading(int chunks)
	{
		this.expandedMapLoadingChunks = Ints.constrainToRange(chunks, 0, 5);
	}

	@Inject
	@Override
	public int getExpandedMapLoading()
	{
		return expandedMapLoadingChunks;
	}

	@Inject
	@Override
	public LoginState getLoginState()
	{
		return getRSLoginState();
	}

	@Inject
	@MethodHook(value = "createObjectSound", end = true)
	public static void onAmbientSoundEffect(int var0, int var1, int var2, ObjectComposition var3, int var4)
	{
		RSObjectSound ambientSoundEffect = (RSObjectSound) client.getAmbientSoundEffects().last();
		AmbientSoundEffectCreated ambientSoundEffectCreated = new AmbientSoundEffectCreated(ambientSoundEffect);
		client.getCallbacks().post(ambientSoundEffectCreated);
	}

	@Copy("openURL")
	@Replace("openURL")
	public static void copy$openURL(String url, boolean var1, boolean var2)
	{
		try
		{
			client.getCallbacks().openUrl(url);
		}
		catch (Exception e)
		{
			client.getLogger().error("unable to open url {}", url, e);
		}
	}
}
