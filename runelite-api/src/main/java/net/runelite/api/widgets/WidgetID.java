/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
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
package net.runelite.api.widgets;

/**
 * Utility class mapping widget IDs to global constants.
 * <p>
 * The constants defined directly under the {@link WidgetID} class are
 * Widget group IDs. All child IDs are defined in sub-classes relating
 * to their group.
 * <p>
 * For a more direct group-child widget mapping, use the
 * {@link WidgetInfo} enum class.
 */
public final class WidgetID
{
	public static final int FAIRY_RING_PANEL_GROUP_ID = InterfaceID.FAIRY_RING_PANEL;
	public static final int FAIRY_RING_GROUP_ID = InterfaceID.FAIRY_RING;
	public static final int LOGOUT_PANEL_ID = InterfaceID.LOGOUT_PANEL;
	public static final int BANK_GROUP_ID = InterfaceID.BANK;
	public static final int BANK_INVENTORY_GROUP_ID = InterfaceID.BANK_INVENTORY;
	public static final int GRAND_EXCHANGE_INVENTORY_GROUP_ID = InterfaceID.GRAND_EXCHANGE_INVENTORY;
	public static final int GRAND_EXCHANGE_GROUP_ID = InterfaceID.GRAND_EXCHANGE;
	public static final int DEPOSIT_BOX_GROUP_ID = InterfaceID.DEPOSIT_BOX;
	public static final int INVENTORY_GROUP_ID = InterfaceID.INVENTORY;
	public static final int PLAYER_TRADE_SCREEN_GROUP_ID = InterfaceID.TRADE;
	public static final int PLAYER_TRADE_INVENTORY_GROUP_ID = InterfaceID.TRADE_INVENTORY;
	public static final int FRIENDS_LIST_GROUP_ID = InterfaceID.FRIEND_LIST;
	public static final int IGNORE_LIST_GROUP_ID = InterfaceID.IGNORE_LIST;
	public static final int RAIDING_PARTY_GROUP_ID = InterfaceID.RAIDING_PARTY;
	public static final int EQUIPMENT_GROUP_ID = InterfaceID.EQUIPMENT;
	public static final int EQUIPMENT_INVENTORY_GROUP_ID = InterfaceID.EQUIPMENT_INVENTORY;
	public static final int EMOTES_GROUP_ID = InterfaceID.EMOTES;
	public static final int RUNE_POUCH_GROUP_ID = InterfaceID.RUNE_POUCH;
	public static final int ACHIEVEMENT_DIARY_GROUP_ID = InterfaceID.ACHIEVEMENT_DIARY;
	public static final int PEST_CONTROL_BOAT_GROUP_ID = InterfaceID.PEST_CONTROL_BOAT;
	public static final int PEST_CONTROL_GROUP_ID = InterfaceID.PEST_CONTROL;
	public static final int FRIENDS_CHAT_GROUP_ID = InterfaceID.FRIENDS_CHAT;
	public static final int MINIMAP_GROUP_ID = InterfaceID.MINIMAP;
	public static final int LOGIN_CLICK_TO_PLAY_GROUP_ID = InterfaceID.LOGIN_CLICK_TO_PLAY_SCREEN;
	public static final int CLUE_SCROLL_GROUP_ID = InterfaceID.CLUESCROLL;
	public static final int FIXED_VIEWPORT_GROUP_ID = InterfaceID.FIXED_VIEWPORT;
	public static final int RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID = InterfaceID.RESIZABLE_VIEWPORT;
	public static final int RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID = InterfaceID.RESIZABLE_VIEWPORT_BOTTOM_LINE;
	public static final int SHOP_GROUP_ID = InterfaceID.SHOP;
	public static final int SHOP_INVENTORY_GROUP_ID = InterfaceID.SHOP_INVENTORY;
	public static final int SMITHING_GROUP_ID = InterfaceID.SMITHING;
	public static final int GUIDE_PRICES_GROUP_ID = InterfaceID.GUIDE_PRICES;
	public static final int GUIDE_PRICES_INVENTORY_GROUP_ID = InterfaceID.GUIDE_PRICES_INVENTORY;
	public static final int COMBAT_GROUP_ID = InterfaceID.COMBAT;
	public static final int DIALOG_NPC_GROUP_ID = InterfaceID.DIALOG_NPC;
	public static final int SLAYER_REWARDS_GROUP_ID = InterfaceID.SLAYER_REWARDS;
	public static final int PRIVATE_CHAT = InterfaceID.PRIVATE_CHAT;
	public static final int CHATBOX_GROUP_ID = InterfaceID.CHATBOX;
	public static final int VOLCANIC_MINE_GROUP_ID = InterfaceID.VOLCANIC_MINE;
	public static final int BA_ATTACKER_GROUP_ID = InterfaceID.BA_ATTACKER;
	public static final int BA_COLLECTOR_GROUP_ID = InterfaceID.BA_COLLECTOR;
	public static final int BA_DEFENDER_GROUP_ID = InterfaceID.BA_DEFENDER;
	public static final int BA_HEALER_GROUP_ID = InterfaceID.BA_HEALER;
	public static final int BA_REWARD_GROUP_ID = InterfaceID.BA_REWARD;
	public static final int BA_TEAM_GROUP_ID = InterfaceID.BA_TEAM;
	public static final int LEVEL_UP_GROUP_ID = InterfaceID.LEVEL_UP;
	public static final int DIALOG_SPRITE_GROUP_ID = InterfaceID.DIALOG_SPRITE;
	public static final int DIALOG_DOUBLE_SPRITE_GROUP_ID = InterfaceID.DIALOG_DOUBLE_SPRITE;
	public static final int QUEST_COMPLETED_GROUP_ID = InterfaceID.QUEST_COMPLETED;
	public static final int CLUE_SCROLL_REWARD_GROUP_ID = InterfaceID.CLUESCROLL_REWARD;
	public static final int BARROWS_REWARD_GROUP_ID = InterfaceID.BARROWS_REWARD;
	public static final int RAIDS_GROUP_ID = InterfaceID.RAIDS;
	public static final int TOB_GROUP_ID = InterfaceID.TOB;
	public static final int MOTHERLODE_MINE_GROUP_ID = InterfaceID.MLM;
	public static final int EXPERIENCE_DROP_GROUP_ID = InterfaceID.EXPERIENCE_TRACKER;
	public static final int PUZZLE_BOX_GROUP_ID = InterfaceID.PUZZLE_BOX;
	public static final int LIGHT_BOX_GROUP_ID = InterfaceID.LIGHT_BOX;
	public static final int NIGHTMARE_ZONE_GROUP_ID = InterfaceID.NMZ;
	public static final int NIGHTMARE_PILLAR_HEALTH_GROUP_ID = InterfaceID.NIGHTMARE_PILLAR_HEALTH;
	public static final int BLAST_FURNACE_GROUP_ID = InterfaceID.BLAST_FURNACE;
	public static final int WORLD_MAP_GROUP_ID = InterfaceID.WORLD_MAP;
	public static final int PYRAMID_PLUNDER_GROUP_ID = InterfaceID.PYRAMID_PLUNDER;
	public static final int CHAMBERS_OF_XERIC_REWARD_GROUP_ID = InterfaceID.CHAMBERS_OF_XERIC_REWARD;
	public static final int THEATRE_OF_BLOOD_REWARD_GROUP_ID = InterfaceID.TOB_REWARD;
	public static final int EXPERIENCE_TRACKER_GROUP_ID = InterfaceID.EXPERIENCE_TRACKER;
	public static final int TITHE_FARM_GROUP_ID = InterfaceID.TITHE_FARM;
	public static final int KINGDOM_GROUP_ID = InterfaceID.KINGDOM;
	public static final int BARROWS_GROUP_ID = InterfaceID.BARROWS;
	public static final int BLAST_MINE_GROUP_ID = InterfaceID.BLAST_MINE;
	public static final int MTA_ALCHEMY_GROUP_ID = InterfaceID.MTA_ALCHEMY;
	public static final int MTA_ENCHANT_GROUP_ID = InterfaceID.MTA_ENCHANT;
	public static final int MTA_GRAVEYARD_GROUP_ID = InterfaceID.MTA_GRAVEYARD;
	public static final int MTA_TELEKINETIC_GROUP_ID = InterfaceID.MTA_TELEKINETIC;
	public static final int CORP_DAMAGE = InterfaceID.CORP_DAMAGE;
	public static final int DESTROY_ITEM_GROUP_ID = InterfaceID.DESTROY_ITEM;
	public static final int VARROCK_MUSEUM_QUIZ_GROUP_ID = InterfaceID.VARROCK_MUSEUM;
	public static final int KILL_LOGS_GROUP_ID = InterfaceID.KILL_LOG;
	public static final int DIARY_QUEST_GROUP_ID = InterfaceID.DIARY;
	public static final int THEATRE_OF_BLOOD_GROUP_ID = InterfaceID.TOB;
	public static final int WORLD_SWITCHER_GROUP_ID = InterfaceID.WORLD_SWITCHER;
	public static final int DIALOG_OPTION_GROUP_ID = InterfaceID.DIALOG_OPTION;
	public static final int DIALOG_PLAYER_GROUP_ID = InterfaceID.DIALOG_PLAYER;
	public static final int DRIFT_NET_FISHING_REWARD_GROUP_ID = InterfaceID.DRIFT_NET_FISHING_REWARD;
	public static final int FOSSIL_ISLAND_OXYGENBAR_ID = InterfaceID.FOSSIL_ISLAND_OXYGEN_BAR;
	public static final int MINIGAME_TAB_ID = InterfaceID.MINIGAMES;
	public static final int SPELLBOOK_GROUP_ID = InterfaceID.SPELLBOOK;
	public static final int PVP_GROUP_ID = InterfaceID.PVP;
	public static final int FISHING_TRAWLER_GROUP_ID = InterfaceID.TRAWLER;
	public static final int FISHING_TRAWLER_REWARD_GROUP_ID = InterfaceID.TRAWLER_REWARD;
	public static final int ZEAH_MESS_HALL_GROUP_ID = InterfaceID.ZEAH_MESS_HALL;
	public static final int LOOTING_BAG_GROUP_ID = InterfaceID.LOOTING_BAG;
	public static final int SKOTIZO_GROUP_ID = InterfaceID.SKOTIZO;
	public static final int FULLSCREEN_CONTAINER_TLI = InterfaceID.FULLSCREEN_CONTAINER_TLI;
	public static final int CHARACTER_SUMMARY_GROUP_ID = InterfaceID.CHARACTER_SUMMARY;
	public static final int QUESTLIST_GROUP_ID = InterfaceID.QUEST_LIST;
	public static final int SKILLS_GROUP_ID = InterfaceID.SKILLS;
	public static final int MUSIC_GROUP_ID = InterfaceID.MUSIC;
	public static final int BARROWS_PUZZLE_GROUP_ID = InterfaceID.BARROWS_PUZZLE;
	public static final int KEPT_ON_DEATH_GROUP_ID = InterfaceID.KEPT_ON_DEATH;
	public static final int GUIDE_PRICE_GROUP_ID = InterfaceID.GUIDE_PRICES;
	public static final int SEED_VAULT_INVENTORY_GROUP_ID = InterfaceID.SEED_VAULT_INVENTORY;
	public static final int BEGINNER_CLUE_MAP_CHAMPIONS_GUILD = InterfaceID.CLUE_BEGINNER_MAP_CHAMPIONS_GUILD;
	public static final int BEGINNER_CLUE_MAP_VARROCK_EAST_MINE = InterfaceID.CLUE_BEGINNER_MAP_VARROCK_EAST_MINE;
	public static final int BEGINNER_CLUE_MAP_DRAYNOR = InterfaceID.CLUE_BEGINNER_MAP_DYANOR;
	public static final int BEGINNER_CLUE_MAP_NORTH_OF_FALADOR = InterfaceID.CLUE_BEGINNER_MAP_NORTH_OF_FALADOR;
	public static final int BEGINNER_CLUE_MAP_WIZARDS_TOWER = InterfaceID.CLUE_BEGINNER_MAP_WIZARDS_TOWER;
	public static final int SEED_BOX_GROUP_ID = InterfaceID.SEED_BOX;
	public static final int SEED_VAULT_GROUP_ID = InterfaceID.SEED_VAULT;
	public static final int EXPLORERS_RING_ALCH_GROUP_ID = InterfaceID.EXPLORERS_RING;
	public static final int SETTINGS_SIDE_GROUP_ID = InterfaceID.SETTINGS_SIDE;
	public static final int SETTINGS_GROUP_ID = InterfaceID.SETTINGS;
	public static final int GWD_KC_GROUP_ID = InterfaceID.GWD_KC;
	public static final int LMS_GROUP_ID = InterfaceID.LMS;
	public static final int LMS_INGAME_GROUP_ID = InterfaceID.LMS_INGAME;
	public static final int ADVENTURE_LOG_ID = InterfaceID.ADVENTURE_LOG;
	public static final int COLLECTION_LOG_ID = InterfaceID.COLLECTION_LOG;
	public static final int GENERIC_SCROLL_GROUP_ID = InterfaceID.GENERIC_SCROLL;
	public static final int GAUNTLET_TIMER_GROUP_ID = InterfaceID.GAUNTLET_TIMER;
	public static final int HALLOWED_SEPULCHRE_TIMER_GROUP_ID = InterfaceID.HALLOWED_SEPULCHRE_TIMER;
	public static final int BANK_PIN_GROUP_ID = InterfaceID.BANK_PIN;
	public static final int HEALTH_OVERLAY_BAR_GROUP_ID = InterfaceID.HEALTH;
	public static final int CHAMBERS_OF_XERIC_STORAGE_UNIT_PRIVATE_GROUP_ID = InterfaceID.CHAMBERS_OF_XERIC_STORAGE_UNIT_PRIVATE;
	public static final int CHAMBERS_OF_XERIC_STORAGE_UNIT_SHARED_GROUP_ID = InterfaceID.CHAMBERS_OF_XERIC_STORAGE_UNIT_SHARED;
	public static final int CHAMBERS_OF_XERIC_STORAGE_UNIT_INVENTORY_GROUP_ID = InterfaceID.CHAMBERS_OF_XERIC_INVENTORY;
	public static final int DUEL_INVENTORY_GROUP_ID = InterfaceID.DUEL_INVENTORY;
	public static final int DUEL_INVENTORY_OTHER_GROUP_ID = InterfaceID.DUEL_INVENTORY_OTHER;
	public static final int TRAILBLAZER_AREAS_GROUP_ID = InterfaceID.TRAILBLAZER_AREAS;
	public static final int TEMPOROSS_GROUP_ID = InterfaceID.TEMPOROSS;
	public static final int TEMPOROSS_LOBBY_GROUP_ID = InterfaceID.TEMPOROSS_LOBBY;
	public static final int CLAN_GROUP_ID = InterfaceID.CLAN;
	public static final int CLAN_GUEST_GROUP_ID = InterfaceID.CLAN_GUEST;
	public static final int GRAVESTONE_GROUP_ID = InterfaceID.GRAVESTONE;
	public static final int POH_TREASURE_CHEST_INVENTORY_GROUP_ID = InterfaceID.POH_TREASURE_CHEST_INV;
	public static final int GROUP_IRON_GROUP_ID = InterfaceID.GROUP_IRON;
	public static final int GROUP_STORAGE_INVENTORY_GROUP_ID = InterfaceID.GROUP_STORAGE_INVENTORY;
	public static final int GROUP_STORAGE_GROUP_ID = InterfaceID.GROUP_STORAGE;
	public static final int WILDERNESS_LOOT_CHEST = InterfaceID.WILDERNESS_LOOT_CHEST;
	public static final int TRADE_WINDOW_GROUP_ID = InterfaceID.TRADE;
	public static final int TOA_REWARD_GROUP_ID = InterfaceID.TOA_REWARD;
	/**
	 * toa party interface in the raid lobby
	 */
	public static final int TOA_PARTY_GROUP_ID = InterfaceID.TOA_PARTY;
	/**
	 * toa raid interface in the raid
	 */
	public static final int TOA_RAID_GROUP_ID = InterfaceID.TOA_RAID;
	public static final int ACHIEVEMENT_DIARY_SCROLL_GROUP_ID = InterfaceID.ACHIEVEMENT_DIARY_SCROLL;
	public static final int PRAYER_GROUP_ID = InterfaceID.PRAYER;
	public static final int QUICK_PRAYERS_GROUP_ID = InterfaceID.QUICK_PRAYER;
	public static final int GOTR_GROUP_ID = InterfaceID.GOTR;
	public static final int TROUBLE_BREWING_GROUP_ID = InterfaceID.TROUBLE_BREWING;
	public static final int TROUBLE_BREWING_LOBBY_GROUP_ID = InterfaceID.TROUBLE_BREWING_LOBBY;
	public static final int MORTTON_TEMPLE_GROUP_ID = InterfaceID.MORTTON_TEMPLE;
	public static final int BGR_RANK_DRAUGHTS_GROUP_ID = InterfaceID.BGR_RANK_DRAUGHTS;
	public static final int BGR_RANK_RUNELINK_GROUP_ID = InterfaceID.BGR_RANK_RUNELINK;
	public static final int BGR_RANK_RUNESQUARES_GROUP_ID = InterfaceID.BGR_RANK_RUNESQUARES;
	public static final int BGR_RANK_RUNEVERSI_GROUP_ID = InterfaceID.BGR_RANK_RUNEVERSI;
	public static final int AGILITY_ARENA_HUD_GROUP_ID = InterfaceID.AGILITY_ARENA;
	public static final int GNOMEBALL_SCORE_GROUP_ID = InterfaceID.GNOMEBALL;
	public static final int CLANRANK_POPUP = InterfaceID.CLANRANK_POPUP;
	public static final int SANITY_GROUP_ID = InterfaceID.SANITY;
	public static final int THE_STRANGLER_INFECTION_GROUP_ID = InterfaceID.STRANGLER;

	public static final int BANK_TUTORIAL_GROUP_ID = InterfaceID.BANK_TUTORIAL;

	/**
	 * OpenOSRS
	 */
	public static final int DIALOG_MINIGAME_GROUP_ID = 229;
	public static final int PEST_CONTROL_EXCHANGE_WINDOW_GROUP_ID = 243;
	public static final int GAUNTLET_MAP_GROUP_ID = 638;
	public static final int PLAYER_TRADE_CONFIRM_GROUP_ID = 334;
	public static final int OPTIONS_GROUP_ID = 261;
	public static final int JEWELLERY_BOX_GROUP_ID = 590;
	public static final int EQUIPMENT_PAGE_GROUP_ID = 84;
	public static final int QUESTTAB_GROUP_ID = 629;
	public static final int MUSICTAB_GROUP_ID = 239;
	public static final int FOSSIL_ISLAND_MUSHROOM_TELE_GROUP_ID = 608;
	public static final int THEATRE_OF_BLOOD_PARTY_GROUP_ID = 28;
	public static final int DIALOG_NOTIFICATION_GROUP_ID = 229;
	public static final int DIALOG_SPRITE2_ID = 11;
	public static final int MULTISKILL_MENU_GROUP_ID = 270;

	/**
	 * Tutorial Island player customization
	 */
	public static final int SET_DISPLAY_NAME_GROUP_ID = 558;
	public static final int CHARACTER_CREATOR_GROUP_ID = 679;

	static class WorldMap
	{
		static final int MAPVIEW = 7;
		static final int OVERVIEW_MAP = 10;
		static final int BOTTOM_BAR = 23;
		static final int SEARCH = 26;
		static final int SURFACE_SELECTOR = 34;
		static final int TOOLTIP = 41;
	}

	static class SlayerRewards
	{
		static final int TOP_BAR = 12;
	}

	static class DialogOption
	{
		static final int OPTIONS = 1;
	}

	static class DialogNPC
	{
		static final int HEAD_MODEL = 2;
		static final int NAME = 4;
		static final int TEXT = 6;
	}

	static class DialogPlayer
	{
		static final int TEXT = 6;
	}

	static class LogoutPanel
	{
		static final int WORLD_SWITCHER_BUTTON = 3;
		static final int LOGOUT_BUTTON = 6;
	}

	static class PestControl
	{
		static final int KNIGHT_INFO_CONTAINER = 2;

		static final int ACTIVITY_SHIELD_CONTAINER = 9;
		static final int ACTIVITY_BAR = 10;
		static final int ACTIVITY_PROGRESS = 12;

		static final int PURPLE_SHIELD = 13;
		static final int BLUE_SHIELD = 14;
		static final int YELLOW_SHIELD = 15;
		static final int RED_SHIELD = 16;

		static final int PURPLE_ICON = 17;
		static final int BLUE_ICON = 18;
		static final int YELLOW_ICON = 19;
		static final int RED_ICON = 20;

		static final int PURPLE_HEALTH = 21;
		static final int BLUE_HEALTH = 22;
		static final int YELLOW_HEALTH = 23;
		static final int RED_HEALTH = 24;
	}

	static class FriendList
	{
		static final int TITLE = 3;
		static final int FULL_CONTAINER = 5;
		static final int SORT_BY_NAME_BUTTON = 7;
		static final int SORT_BY_LAST_WORLD_CHANGE_BUTTON = 8;
		static final int SORT_BY_WORLD_BUTTON = 9;
		static final int LEGACY_SORT_BUTTON = 10;
		static final int NAMES_CONTAINER = 11;
		static final int SCROLL_BAR = 12;
		static final int LOADING_TEXT = 13;
		static final int PREVIOUS_NAME_HOLDER = 18;
	}

	static class IgnoreList
	{
		static final int TITLE = 3;
		static final int FULL_CONTAINER = 5;
		static final int SORT_BY_NAME_BUTTON = 7;
		static final int LEGACY_SORT_BUTTON = 8;
		static final int NAMES_CONTAINER = 9;
		static final int SCROLL_BAR = 10;
		static final int LOADING_TEXT = 11;
		static final int PREVIOUS_NAME_HOLDER = 16;
	}

	static class FriendsChat
	{
		static final int ROOT = 0;
		static final int TITLE = 1;
		static final int OWNER = 2;
		static final int LIST = 12;
	}

	static class Bank
	{
		static final int BANK_CONTAINER = 1;
		static final int INVENTORY_ITEM_CONTAINER = 3;
		static final int BANK_TITLE_BAR = 3;
		static final int TUTORIAL_BUTTON = 4;
		static final int EQUIPMENT_INVENTORY_ITEM_CONTAINER = 4;
		static final int ITEM_COUNT_TOP = 5;
		static final int ITEM_COUNT_BAR = 6;
		static final int ITEM_COUNT_BOTTOM = 7;
		static final int GROUP_STORAGE_BUTTON = 8;
		static final int CONTENT_CONTAINER = 10;
		static final int TAB_CONTAINER = 11;
		static final int ITEM_CONTAINER = 13;
		static final int SCROLLBAR = 14;
		static final int SEARCH_BUTTON_BACKGROUND = 40;
		static final int DEPOSIT_INVENTORY = 42;
		static final int DEPOSIT_EQUIPMENT = 44;
		static final int INCINERATOR = 46;
		static final int INCINERATOR_CONFIRM = 47;
		static final int EQUIPMENT_CONTENT_CONTAINER = 69;
		static final int SETTINGS_BUTTON = 113;
		static final int EQUIPMENT_BUTTON = 114;
		static final int POPUP = 116;
	}

	static class BankTutorial
	{
		static final int CONTAINER = 8;
		static final int STEP_TEXT = 27;
		static final int STEP_PROGRESS_TEXT = 28;
		static final int CLOSE_BUTTON_CONTAINER = 29;
		static final int PREVIOUS_BUTTON = 31;
		static final int CONTINUE_BUTTON = 32;
	}

	static class GroupStorage
	{
		static final int UI = 2;
		static final int ITEM_CONTAINER = 10;
	}

	static class GrandExchange
	{
		static final int WINDOW_CONTAINER = 0;
		static final int WINDOW_BORDERS = 2;
		static final int HISTORY_BUTTON = 3;
		static final int BACK_BUTTON = 4;
		static final int OFFER1 = 7;
		static final int OFFER2 = 8;
		static final int OFFER3 = 9;
		static final int OFFER4 = 10;
		static final int OFFER5 = 11;
		static final int OFFER6 = 12;
		static final int OFFER7 = 13;
		static final int OFFER8 = 14;
		static final int OFFER_CONTAINER = 25;
		static final int OFFER_DESCRIPTION = 26;
		static final int OFFER_PRICE = 27;
		static final int OFFER_CONFIRM_BUTTON = 29;
	}

	static class GrandExchangeInventory
	{
		static final int INVENTORY_ITEM_CONTAINER = 0;
	}

	static class DepositBox
	{
		static final int INVENTORY_ITEM_CONTAINER = 2;
	}

	static class Shop
	{
		static final int ITEMS_CONTAINER = 2;
		static final int INVENTORY_ITEM_CONTAINER = 0;
	}

	static class Smithing
	{
		static final int INVENTORY_ITEM_CONTAINER = 0;

		static final int QTY_1 = 3;
		static final int QTY_5 = 4;
		static final int QTY_10 = 5;
		static final int QTY_X = 6;
		static final int QTY_ALL = 7;

		static final int DAGGER = 9;
		static final int SWORD = 10;
		static final int SCIMITAR = 11;
		static final int LONG_SWORD = 12;
		static final int TWO_H_SWORD = 13;
		static final int AXE = 14;
		static final int MACE = 15;
		static final int WARHAMMER = 16;
		static final int BATTLE_AXE = 17;
		static final int CLAWS = 18;
		static final int CHAIN_BODY = 19;
		static final int PLATE_LEGS = 20;
		static final int PLATE_SKIRT = 21;
		static final int PLATE_BODY = 22;
		static final int NAILS = 23;
		static final int MED_HELM = 24;
		static final int FULL_HELM = 25;
		static final int SQ_SHIELD = 26;
		static final int KITE_SHIELD = 27;
		static final int EXCLUSIVE1 = 28;
		static final int DART_TIPS = 29;
		static final int ARROW_HEADS = 30;
		static final int KNIVES = 31;
		static final int EXCLUSIVE2 = 32;
		static final int JAVELIN_HEADS = 33;
		static final int BOLTS = 34;
		static final int LIMBS = 35;
	}

	static class GuidePrices
	{
		static final int ITEM_CONTAINER = 2;
		static final int INVENTORY_ITEM_CONTAINER = 0;
	}

	static class Equipment
	{
		static final int STATS = 1;
		static final int PRICES = 3;
		static final int DEATH = 5;
		static final int FOLLOWER = 7;
		static final int HELMET = 15;
		static final int CAPE = 16;
		static final int AMULET = 17;
		static final int WEAPON = 18;
		static final int BODY = 19;
		static final int SHIELD = 20;
		static final int LEGS = 21;
		static final int GLOVES = 22;
		static final int BOOTS = 23;
		static final int RING = 24;
		static final int AMMO = 25;

		static final int INVENTORY_ITEM_CONTAINER = 0;
	}

	static class Emotes
	{
		static final int EMOTE_WINDOW = 0;
		static final int EMOTE_SCROLL_CONTAINER = 1;
		static final int EMOTE_CONTAINER = 2;
		static final int EMOTE_SCROLLBAR = 4;
	}

	static class Cluescroll
	{
		static final int CLUE_TEXT = 2;
		static final int CLUE_SCROLL_ITEM_CONTAINER = 3;
	}

	static class Minimap
	{
		static final int XP_ORB = 5;
		static final int HEALTH_ORB = 6;
		static final int PRAYER_ORB = 17;
		static final int QUICK_PRAYER_ORB = 19; // Has the "Quick-prayers" name
		static final int PRAYER_ORB_TEXT = 20;
		static final int RUN_ORB = 25;
		static final int TOGGLE_RUN_ORB = 27; // Has the "Toggle run" name
		static final int RUN_ORB_TEXT = 28;
		static final int SPEC_ORB = 33;
		static final int SPEC_CLICKBOX = 35;
		static final int WORLDMAP_ORB = 48;
		static final int WIKI_BANNER_PARENT = 49;
		static final int WIKI_BANNER = 50;
		static final int WORLDMAP_OPTIONS = 53;
	}

	static class LoginClickToPlayScreen
	{
		static final int MESSAGE_OF_THE_DAY = 6;
		static final int OPEN_STORE_BUTTON = 62;
		static final int VIEW_INBOX_BUTTON = 67;
		static final int CLICK_HERE_TO_PLAY_BUTTON = 72;
	}

	static class FixedViewport
	{
		static final int MINIMAP = 8;
		static final int MINIMAP_DRAW_AREA = 21;
		static final int FIXED_VIEWPORT = 32;
		static final int MULTICOMBAT_INDICATOR = 36;
		static final int FRIENDS_CHAT_TAB = 46;
		static final int FRIENDS_TAB = 48;
		static final int IGNORES_TAB = 47;
		static final int LOGOUT_TAB = 49;
		static final int OPTIONS_TAB = 50;
		static final int EMOTES_TAB = 51;
		static final int MUSIC_TAB = 52;
		static final int FRIENDS_CHAT_ICON = 53;
		static final int FRIENDS_ICON = 55;
		static final int IGNORES_ICON = 54;
		static final int LOGOUT_ICON = 56;
		static final int OPTIONS_ICON = 57;
		static final int EMOTES_ICON = 58;
		static final int MUSIC_ICON = 59;
		static final int COMBAT_TAB = 62;
		static final int STATS_TAB = 63;
		static final int QUESTS_TAB = 64;
		static final int INVENTORY_TAB = 65;
		static final int EQUIPMENT_TAB = 66;
		static final int PRAYER_TAB = 67;
		static final int MAGIC_TAB = 68;
		static final int COMBAT_ICON = 69;
		static final int STATS_ICON = 70;
		static final int QUESTS_ICON = 71;
		static final int INVENTORY_ICON = 72;
		static final int EQUIPMENT_ICON = 73;
		static final int PRAYER_ICON = 74;
		static final int MAGIC_ICON = 75;
		static final int ROOT_INTERFACE_CONTAINER = 16;
		static final int BANK_CONTAINER = 77;
		static final int INTERFACE_CONTAINER = 78;
		static final int INVENTORY_CONTAINER = 82;
	}

	static class ResizableViewport
	{
		static final int RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX = 15;
		static final int MULTICOMBAT_INDICATOR = 19;
		static final int MINIMAP = 93;
		static final int MINIMAP_DRAW_AREA = 29;
		static final int MINIMAP_ORB_HOLDER = 32;
		static final int FRIENDS_CHAT_TAB = 42;
		static final int IGNORES_TAB = 43;
		static final int FRIENDS_TAB = 44;
		static final int LOGOUT_TAB = 45;
		static final int OPTIONS_TAB = 46;
		static final int EMOTES_TAB = 47;
		static final int MUSIC_TAB = 48;
		static final int FRIENDS_CHAT_ICON = 49;
		static final int FRIENDS_ICON = 51;
		static final int IGNORES_ICON = 50;
		static final int LOGOUT_ICON = 52;
		static final int OPTIONS_ICON = 53;
		static final int EMOTES_ICON = 54;
		static final int MUSIC_ICON = 55;
		static final int COMBAT_TAB = 58;
		static final int STATS_TAB = 59;
		static final int QUESTS_TAB = 60;
		static final int INVENTORY_TAB = 61;
		static final int EQUIPMENT_TAB = 62;
		static final int PRAYER_TAB = 63;
		static final int MAGIC_TAB = 64;
		static final int COMBAT_ICON = 65;
		static final int STATS_ICON = 66;
		static final int QUESTS_ICON = 67;
		static final int INVENTORY_ICON = 68;
		static final int EQUIPMENT_ICON = 69;
		static final int PRAYER_ICON = 70;
		static final int MAGIC_ICON = 71;
		static final int INTERFACE_CONTAINER = 72;
		static final int INVENTORY_CONTAINER = 78;
		static final int CHATBOX_PARENT = 94;
		static final int INVENTORY_PARENT = 95;
	}

	static class ResizableViewportBottomLine
	{
		static final int RESIZABLE_VIEWPORT_BOTTOM_LINE = 15;
		static final int MINIMAP = 90;
		static final int MINIMAP_DRAW_AREA = 29;
		static final int MINIMAP_ORB_HOLDER = 32;
		static final int LOGOUT_BUTTON_OVERLAY = 33;
		static final int MINIMAP_LOGOUT_BUTTON = 34;
		static final int FRIENDS_CHAT_TAB = 37;
		static final int IGNORES_TAB = 38;
		static final int FRIENDS_TAB = 39;
		static final int SETTINGS_TAB = 40;
		static final int EMOTES_TAB = 41;
		static final int MUSIC_TAB = 42;
		static final int FC_ICON = 43;
		static final int IGNORES_ICON = 44;
		static final int FRIEND_ICON = 45;
		static final int SETTINGS_ICON = 46;
		static final int EMOTE_ICON = 47;
		static final int MUSIC_ICON = 48;
		static final int COMBAT_TAB = 51;
		static final int SKILLS_TAB = 52;
		static final int QUESTS_TAB = 53;
		static final int INVENTORY_TAB = 54;
		static final int EQUIP_TAB = 55;
		static final int PRAYER_TAB = 56;
		static final int MAGIC_TAB = 57;
		static final int CMB_ICON = 58;
		static final int SKILLS_ICON = 59;
		static final int QUESTS_ICON = 60;
		static final int INVENTORY_ICON = 61;
		static final int EQUIP_ICON = 62;
		static final int PRAYER_ICON = 63;
		static final int MAGIC_ICON = 64;
		static final int INTERFACE_CONTAINER = 69;
		static final int INVENTORY_CONTAINER = 75;
		static final int CHATBOX_PARENT = 91;
		static final int TABS1 = 92;
		static final int TABS2 = 93;
		static final int INVENTORY_PARENT = 94;
	}

	static class Chatbox
	{
		static final int PARENT = 0;
		static final int BUTTONS = 1;
		static final int TAB_ALL = 4;
		static final int TAB_GAME = 7;
		static final int TAB_PUBLIC = 11;
		static final int TAB_PRIVATE = 15;
		static final int TAB_CHANNEL = 19;
		static final int TAB_CLAN = 23;
		static final int TAB_TRADE = 27;
		static final int REPORT_TEXT = 33;
		static final int FRAME = 34;
		static final int TRANSPARENT_BACKGROUND = 35;
		static final int CONTAINER = 37;
		static final int TITLE = 41;
		static final int FULL_INPUT = 42;
		static final int GE_SEARCH_RESULTS = 50;
		static final int MESSAGES = 53;
		static final int TRANSPARENT_BACKGROUND_LINES = 54;
		static final int INPUT = 55;
		static final int MESSAGE_LINES = 56;
		static final int FIRST_MESSAGE = 57;
	}

	static class Prayer
	{
		static final int THICK_SKIN = 9;
		static final int BURST_OF_STRENGTH = 10;
		static final int CLARITY_OF_THOUGHT = 11;
		static final int SHARP_EYE = 27;
		static final int MYSTIC_WILL = 30;
		static final int ROCK_SKIN = 12;
		static final int SUPERHUMAN_STRENGTH = 13;
		static final int IMPROVED_REFLEXES = 14;
		static final int RAPID_RESTORE = 15;
		static final int RAPID_HEAL = 16;
		static final int PROTECT_ITEM = 17;
		static final int HAWK_EYE = 28;
		static final int MYSTIC_LORE = 31;
		static final int STEEL_SKIN = 18;
		static final int ULTIMATE_STRENGTH = 19;
		static final int INCREDIBLE_REFLEXES = 20;
		static final int PROTECT_FROM_MAGIC = 21;
		static final int PROTECT_FROM_MISSILES = 22;
		static final int PROTECT_FROM_MELEE = 23;
		static final int EAGLE_EYE = 29;
		static final int MYSTIC_MIGHT = 32;
		static final int RETRIBUTION = 24;
		static final int REDEMPTION = 25;
		static final int SMITE = 26;
		static final int PRESERVE = 37;
		static final int CHIVALRY = 34;
		static final int PIETY = 35;
		static final int RIGOUR = 33;
		static final int AUGURY = 36;
	}

	public static class QuickPrayer
	{
		static final int PRAYERS = 4;

		public static final int THICK_SKIN_CHILD_ID = 0;
		public static final int BURST_OF_STRENGTH_CHILD_ID = 1;
		public static final int CLARITY_OF_THOUGHT_CHILD_ID = 2;
		public static final int SHARP_EYE_CHILD_ID = 18;
		public static final int MYSTIC_WILL_CHILD_ID = 19;
		public static final int ROCK_SKIN_CHILD_ID = 3;
		public static final int SUPERHUMAN_STRENGTH_CHILD_ID = 4;
		public static final int IMPROVED_REFLEXES_CHILD_ID = 5;
		public static final int RAPID_RESTORE_CHILD_ID = 6;
		public static final int RAPID_HEAL_CHILD_ID = 7;
		public static final int PROTECT_ITEM_CHILD_ID = 8;
		public static final int HAWK_EYE_CHILD_ID = 20;
		public static final int MYSTIC_LORE_CHILD_ID = 21;
		public static final int STEEL_SKIN_CHILD_ID = 9;
		public static final int ULTIMATE_STRENGTH_CHILD_ID = 10;
		public static final int INCREDIBLE_REFLEXES_CHILD_ID = 11;
		public static final int PROTECT_FROM_MAGIC_CHILD_ID = 12;
		public static final int PROTECT_FROM_MISSILES_CHILD_ID = 13;
		public static final int PROTECT_FROM_MELEE_CHILD_ID = 14;
		public static final int EAGLE_EYE_CHILD_ID = 22;
		public static final int MYSTIC_MIGHT_CHILD_ID = 23;
		public static final int RETRIBUTION_CHILD_ID = 15;
		public static final int REDEMPTION_CHILD_ID = 16;
		public static final int SMITE_CHILD_ID = 17;
		public static final int PRESERVE_CHILD_ID = 28;
		public static final int CHIVALRY_CHILD_ID = 25;
		public static final int PIETY_CHILD_ID = 26;
		public static final int RIGOUR_CHILD_ID = 24;
		public static final int AUGURY_CHILD_ID = 27;
	}

	static class Combat
	{
		static final int WEAPON_NAME = 1;
		static final int LEVEL = 3;
		static final int STYLE_ONE = 4;
		static final int STYLE_TWO = 8;
		static final int STYLE_THREE = 12;
		static final int STYLE_FOUR = 16;
		static final int SPELLS = 20;
		static final int DEFENSIVE_SPELL_BOX = 21;
		static final int DEFENSIVE_SPELL_ICON = 23;
		static final int DEFENSIVE_SPELL_SHIELD = 24;
		static final int DEFENSIVE_SPELL_TEXT = 25;
		static final int SPELL_BOX = 26;
		static final int SPELL_ICON = 28;
		static final int SPELL_TEXT = 29;
		static final int AUTO_RETALIATE = 30;
		static final int SPECIAL_ATTACK_BAR = 34;
		static final int SPECIAL_ATTACK_CLICKBOX = 36;
		static final int TOOLTIP = 41;
	}

	static class VolcanicMine
	{
		static final int STABILITY_INFOBOX_CONTAINER = 2;
		static final int TIME_LEFT = 6;
		static final int POINTS = 8;
		static final int STABILITY = 10;
		static final int PLAYER_COUNT = 12;
		static final int VENT_A_PERCENTAGE = 16;
		static final int VENT_B_PERCENTAGE = 17;
		static final int VENT_C_PERCENTAGE = 18;
		static final int VENT_A_STATUS = 20;
		static final int VENT_B_STATUS = 21;
		static final int VENT_C_STATUS = 22;
		static final int VENTS_INFOBOX_CONTAINER = 26;
	}

	static class BarbarianAssault
	{
		static class ATK
		{
			static final int ROLE_SPRITE = 11;
			static final int ROLE = 12;
		}

		static class HLR
		{
			static final int TEAMMATES = 13;
			static final int TEAMMATE1 = 18;
			static final int TEAMMATE2 = 22;
			static final int TEAMMATE3 = 26;
			static final int TEAMMATE4 = 30;
		}

		static final int TEAM = 2;

		static final int ROLE_SPRITE = 10;
		static final int ROLE = 11;

		static final int REWARD_TEXT = 57;
	}

	static class LevelUp
	{
		static final int SKILL = 1;
		static final int LEVEL = 2;
		static final int CONTINUE = 3;
	}

	static class QuestCompleted
	{
		static final int NAME_TEXT = 4;
	}

	static class Raids
	{
		static final int POINTS_INFOBOX = 3;
	}

	static class Health
	{
		static final int HEALTHBAR_CONTAINER = 5;
		static final int HEALTHBAR_TEXT = 20;
	}

	static class ChambersOfXericStorageUnitPrivate
	{
		static final int PRIVATE_CHEST_ITEM_CONTAINER = 6;
	}

	static class Tob
	{
		static final int PARTY_INTERFACE = 5;
		static final int PARTY_STATS = 7;
		static final int HEALTHBAR_CONTAINER = 9;
	}

	static class PuzzleBox
	{
		static final int VISIBLE_BOX = 4;
	}

	static class LightBox
	{
		static final int LIGHT_BOX = 1;
		static final int LIGHT_BOX_WINDOW = 2;
		static final int LIGHT_BULB_CONTAINER = 3;
		static final int LIGHT_BOX_BUTTON_CONTAINER = 6;
		static final int BUTTON_A = 8;
		static final int BUTTON_B = 9;
		static final int BUTTON_C = 10;
		static final int BUTTON_D = 11;
		static final int BUTTON_E = 12;
		static final int BUTTON_F = 13;
		static final int BUTTON_G = 14;
		static final int BUTTON_H = 15;
	}

	static class DialogSprite
	{
		static final int SPRITE = 1;
		static final int TEXT = 2;
		static final int SPRITE2 = 3;
	}

	static class ExperienceTracker
	{
		static final int WIDGET = 4;
		static final int BOTTOM_BAR = 16;
	}

	static class FairyRingPanel
	{
		static final int HEADER = 2;
		static final int LIST = 7;
		static final int FAVORITES = 8;
		static final int SEPARATOR = 9;
		static final int SCROLLBAR = 152;
	}

	static class FairyRing
	{
		static final int LEFT_ORB_CLOCKWISE = 19;
		static final int LEFT_ORB_COUNTER_CLOCKWISE = 20;
		static final int MIDDLE_ORB_CLOCKWISE = 21;
		static final int MIDDLE_ORB_COUNTER_CLOCKWISE = 22;
		static final int RIGHT_ORB_CLOCKWISE = 23;
		static final int RIGHT_ORB_COUNTER_CLOCKWISE = 24;
		static final int TELEPORT_BUTTON = 26;
	}

	static class FairyRingCode
	{
		static final int FAIRY_QUEEN_HIDEOUT = 139;
	}

	static class Barrows
	{
		static final int BARROWS_BROTHERS = 4;
		static final int BARROWS_POTENTIAL = 5;
	}

	static class Diary
	{
		static final int DIARY_TITLE = 2;
		static final int DIARY_TEXT = 3;
	}

	static class AchievementDiaryScroll
	{
		static final int TITLE = 2;
		static final int TEXT = 3;
	}

	static class DestroyItem
	{
		static final int DESTROY_ITEM_NAME = 6;
		static final int DESTROY_ITEM_YES = 1;
		static final int DESTROY_ITEM_NO = 3;
	}

	static class VarrockMuseum
	{
		static final int VARROCK_MUSEUM_QUESTION = 28;
		static final int VARROCK_MUSEUM_FIRST_ANSWER = 29;
		static final int VARROCK_MUSEUM_SECOND_ANSWER = 30;
		static final int VARROCK_MUSEUM_THIRD_ANSWER = 31;
	}

	static class KillLog
	{
		static final int TITLE = 3;
		static final int MONSTER = 13;
		static final int KILLS = 14;
		static final int STREAK = 15;
	}

	static class WorldSwitcher
	{
		static final int CONTAINER = 1;
		static final int WORLD_LIST = 18;
		static final int LOGOUT_BUTTON = 23;
	}

	static class Minigames
	{
		static final int TELEPORT_BUTTON = 30;
	}

	static class StandardSpellBook
	{
		static final int LUMBRIDGE_HOME_TELEPORT = 6;
		static final int KOUREND_HOME_TELEPORT = 4;
		static final int CATHERBY_HOME_TELEPORT = 5;
	}

	static class AncientSpellBook
	{
		static final int EDGEVILLE_HOME_TELEPORT = 100;
	}

	static class LunarSpellBook
	{
		static final int LUNAR_HOME_TELEPORT = 101;
		static final int FERTILE_SOIL = 126;
	}

	static class ArceuusSpellBook
	{
		static final int ARCEUUS_HOME_TELEPORT = 145;
	}

	static class Pvp
	{
		static final int KILLDEATH_RATIO = 26;
		static final int WILDERNESS_SKULL_CONTAINER = 44;
		static final int SKULL_CONTAINER = 45;
		static final int SAFE_ZONE = 47;
		static final int WILDERNESS_LEVEL = 50; // this can also be the Deadman Mode "Protection" text
	}

	static class KourendFavour
	{
		static final int KOUREND_FAVOUR_OVERLAY = 1;
	}

	static class Zeah
	{
		static final int MESS_HALL_COOKING_DISPLAY = 2;
	}

	static class LootingBag
	{
		static final int LOOTING_BAG_INVENTORY = 5;
	}

	static class Skotizo
	{
		static final int CONTAINER = 2;
	}

	public static class CharacterSummary
	{
		static final int CONTAINER = 2;

		public static final int COMBAT_LEVEL_BOX_CHILD_ID = 9;
	}

	static class QuestList
	{
		static final int BOX = 0;
		static final int CONTAINER = 2;
	}

	static class Music
	{
		static final int CONTAINER = 0;
		static final int SCROLL_CONTAINER = 4;
		static final int LIST = 6;
		static final int SCROLLBAR = 7;
	}

	static class Barrows_Puzzle
	{
		static final int PARENT = 0;
		static final int SEQUENCE_1 = 3;
		static final int ANSWER1_CONTAINER = 12;
		static final int ANSWER1 = 13;
		static final int ANSWER2_CONTAINER = 14;
		static final int ANSWER2 = 15;
		static final int ANSWER3_CONTAINER = 16;
		static final int ANSWER3 = 17;
	}

	static class SeedVault
	{
		static final int INVENTORY_ITEM_CONTAINER = 1;
		static final int TITLE_CONTAINER = 2;
		static final int ITEM_CONTAINER = 15;
		static final int ITEM_TEXT = 16;
		static final int SEARCH_BUTTON = 24;
	}

	static class ExplorersRing
	{
		static final int INVENTORY = 7;
	}

	static class SettingsSide
	{
		static final int CAMERA_ZOOM_SLIDER_TRACK = 57;
		static final int MUSIC_SLIDER = 92;
		static final int MUSIC_SLIDER_STEP_HOLDER = 104;
		static final int SOUND_EFFECT_SLIDER = 106;
		static final int AREA_SOUND_SLIDER = 120;
	}

	static class Settings
	{
		static final int INIT = 1;
	}

	static class AchievementDiary
	{
		static final int CONTAINER = 2;
	}

	static class Skills
	{
		static final int CONTAINER = 0;
	}

	static class Lms
	{
		static final int INFO = 2;
	}

	static class LmsKDA
	{
		static final int INFO = 4;
	}

	static class AdventureLog
	{
		static final int CONTAINER = 0;
	}

	static class CollectionLog
	{
		static final int CONTAINER = 0;
		static final int TABS = 3;
		static final int ENTRY = 17;
		static final int ENTRY_HEADER = 19;
		static final int ENTRY_ITEMS = 36;
	}

	static class GenericScroll
	{
		static final int TEXT = 7;
	}

	static class GauntletTimer
	{
		static final int CONTAINER = 2;
	}

	static class HallowedSepulchreTimer
	{
		static final int CONTAINER = 2;
	}

	// Also used for many other interfaces!
	static class BankPin
	{
		static final int CONTAINER = 0;
		static final int TOP_LEFT_TEXT = 2;
		static final int FIRST_ENTERED = 3;
		static final int SECOND_ENTERED = 4;
		static final int THIRD_ENTERED = 5;
		static final int FOURTH_ENTERED = 6;
		static final int INSTRUCTION_TEXT = 10;
		static final int EXIT_BUTTON = 13;
		static final int FORGOT_BUTTON = 15;
		static final int BUTTON_1 = 16;
		static final int BUTTON_2 = 18;
		static final int BUTTON_3 = 20;
		static final int BUTTON_4 = 22;
		static final int BUTTON_5 = 24;
		static final int BUTTON_6 = 26;
		static final int BUTTON_7 = 28;
		static final int BUTTON_8 = 30;
		static final int BUTTON_9 = 32;
		static final int BUTTON_10 = 34;
	}

	static class TrailblazerAreas
	{
		static final int TELEPORT = 59;
	}

	static class TemporossStatus
	{
		static final int STATUS_INDICATOR = 2;
		static final int LOBBY = 5;
	}

	static class DialogNotification
	{
		static final int TEXT = 0;
		static final int CONTINUE = 1;
	}

	static class PestControlExchangeWindow
	{
		static final int ITEM_LIST = 2;
		static final int BOTTOM = 5;
		static final int POINTS = 8;
		static final int CONFIRM_BUTTON = 6;
	}

	static class MinigameDialog
	{
		static final int TEXT = 1;
		static final int CONTINUE = 2;
	}

	static class TheatreOfBlood
	{
		static final int RAIDING_PARTY = 9;
		static final int ORB_BOX = 10;
		static final int BOSS_HEALTH_BAR = 35;
	}

	static class TheatreOfBloodParty
	{
		static final int CONTAINER = 10;
	}

	static class EquipmentWidgetIdentifiers
	{
		static final int EQUIP_YOUR_CHARACTER = 3;
		static final int STAB_ATTACK_BONUS = 24;
		static final int SLASH_ATTACK_BONUS = 25;
		static final int CRUSH_ATTACK_BONUS = 26;
		static final int MAGIC_ATTACK_BONUS = 27;
		static final int RANGED_ATTACK_BONUS = 28;
		static final int STAB_DEFENCE_BONUS = 30;
		static final int SLASH_DEFENCE_BONUS = 31;
		static final int CRUSH_DEFENCE_BONUS = 32;
		static final int MAGIC_DEFENCE_BONUS = 33;
		static final int RANGED_DEFENCE_BONUS = 34;
		static final int MELEE_STRENGTH = 36;
		static final int RANGED_STRENGTH = 37;
		static final int MAGIC_DAMAGE = 38;
		static final int PRAYER_BONUS = 39;
		static final int UNDEAD_DAMAGE_BONUS = 41;
		static final int SLAYER_DAMAGE_BONUS = 42;
		static final int WEIGHT = 49;
	}

	static class FossilMushroomTeleport
	{
		static final int ROOT = 2;
		static final int HOUSE_ON_HILL = 4;
		static final int VERDANT_VALLEY = 8;
		static final int SWAMP = 12;
		static final int MUSHROOM_MEADOW = 16;
	}

	static class SpellBook
	{
		static final int FILTERED_SPELLS_BOUNDS = 3;
		static final int TOOLTIP = 190;

		// NORMAL SPELLS
		static final int LUMBRIDGE_HOME_TELEPORT = 6;
		static final int WIND_STRIKE = 7;
		static final int CONFUSE = 8;
		static final int ENCHANT_CROSSBOW_BOLT = 9;
		static final int WATER_STRIKE = 10;
		static final int LVL_1_ENCHANT = 11;
		static final int EARTH_STRIKE = 12;
		static final int WEAKEN = 13;
		static final int FIRE_STRIKE = 14;
		static final int BONES_TO_BANANAS = 15;
		static final int WIND_BOLT = 16;
		static final int CURSE = 17;
		static final int BIND = 18;
		static final int LOW_LEVEL_ALCHEMY = 19;
		static final int WATER_BOLT = 20;
		static final int VARROCK_TELEPORT = 21;
		static final int LVL_2_ENCHANT = 22;
		static final int EARTH_BOLT = 23;
		static final int LUMBRIDGE_TELEPORT = 24;
		static final int TELEKINETIC_GRAB = 25;
		static final int FIRE_BOLT = 26;
		static final int FALADOR_TELEPORT = 27;
		static final int CRUMBLE_UNDEAD = 28;
		static final int TELEPORT_TO_HOUSE = 29;
		static final int WIND_BLAST = 30;
		static final int SUPERHEAT_ITEM = 31;
		static final int CAMELOT_TELEPORT = 32;
		static final int WATER_BLAST = 33;
		static final int LVL_3_ENCHANT = 34;
		static final int IBAN_BLAST = 35;
		static final int SNARE = 36;
		static final int MAGIC_DART = 37;
		static final int ARDOUGNE_TELEPORT = 38;
		static final int EARTH_BLAST = 39;
		static final int HIGH_LEVEL_ALCHEMY = 40;
		static final int CHARGE_WATER_ORB = 41;
		static final int LVL_4_ENCHANT = 42;
		static final int WATCHTOWER_TELEPORT = 43;
		static final int FIRE_BLAST = 44;
		static final int CHARGE_EARTH_ORB = 45;
		static final int BONES_TO_PEACHES = 46;
		static final int SARADOMIN_STRIKE = 47;
		static final int CLAWS_OF_GUTHIX = 48;
		static final int FLAMES_OF_ZAMORAK = 49;
		static final int TROLLHEIM_TELEPORT = 50;
		static final int WIND_WAVE = 51;
		static final int CHARGE_FIRE_ORB = 52;
		static final int TELEPORT_TO_APE_ATOLL = 53;
		static final int WATER_WAVE = 54;
		static final int CHARGE_AIR_ORB = 55;
		static final int VULNERABILITY = 56;
		static final int LVL_5_ENCHANT = 57;
		static final int TELEPORT_TO_KOUREND = 58;
		static final int EARTH_WAVE = 59;
		static final int ENFEEBLE = 60;
		static final int TELEOTHER_LUMBRIDGE = 61;
		static final int FIRE_WAVE = 62;
		static final int ENTANGLE = 63;
		static final int STUN = 64;
		static final int CHARGE = 65;
		static final int WIND_SURGE = 66;
		static final int TELEOTHER_FALADOR = 67;
		static final int WATER_SURGE = 68;
		static final int TELE_BLOCK = 69;
		static final int BOUNTY_TARGET_TELEPORT = 70;
		static final int LVL_6_ENCHANT = 71;
		static final int TELEOTHER_CAMELOT = 72;
		static final int EARTH_SURGE = 73;
		static final int LVL_7_ENCHANT = 74;
		static final int FIRE_SURGE = 75;

		// ANCIENT SPELLS
		static final int ICE_RUSH = 76;
		static final int ICE_BLITZ = 77;
		static final int ICE_BURST = 78;
		static final int ICE_BARRAGE = 79;
		static final int BLOOD_RUSH = 80;
		static final int BLOOD_BLITZ = 81;
		static final int BLOOD_BURST = 82;
		static final int BLOOD_BARRAGE = 83;
		static final int SMOKE_RUSH = 84;
		static final int SMOKE_BLITZ = 85;
		static final int SMOKE_BURST = 86;
		static final int SMOKE_BARRAGE = 87;
		static final int SHADOW_RUSH = 88;
		static final int SHADOW_BLITZ = 89;
		static final int SHADOW_BURST = 90;
		static final int SHADOW_BARRAGE = 91;
		static final int PADDEWWA_TELEPORT = 92;
		static final int SENNTISTEN_TELEPORT = 93;
		static final int KHARYRLL_TELEPORT = 94;
		static final int LASSAR_TELEPORT = 95;
		static final int DAREEYAK_TELEPORT = 96;
		static final int CARRALLANGER_TELEPORT = 97;
		static final int ANNAKARL_TELEPORT = 98;
		static final int GHORROCK_TELEPORT = 99;
		static final int EDGEVILLE_HOME_TELEPORT = 100;

		// LUNAR SPELLS
		static final int LUNAR_HOME_TELEPORT = 101;
		static final int BAKE_PIE = 102;
		static final int CURE_PLANT = 103;
		static final int MONSTER_EXAMINE = 104;
		static final int NPC_CONTACT = 105;
		static final int CURE_OTHER = 106;
		static final int HUMIDIFY = 107;
		static final int MOONCLAN_TELEPORT = 108;
		static final int TELE_GROUP_MOONCLAN = 109;
		static final int CURE_ME = 110;
		static final int HUNTER_KIT = 111;
		static final int WATERBIRTH_TELEPORT = 112;
		static final int TELE_GROUP_WATERBIRTH = 113;
		static final int CURE_GROUP = 114;
		static final int STAT_SPY = 115;
		static final int BARBARIAN_TELEPORT = 116;
		static final int TELE_GROUP_BARBARIAN = 117;
		static final int SUPERGLASS_MAKE = 118;
		static final int TAN_LEATHER = 119;
		static final int KHAZARD_TELEPORT = 120;
		static final int TELE_GROUP_KHAZARD = 121;
		static final int DREAM = 122;
		static final int STRING_JEWELLERY = 123;
		static final int STAT_RESTORE_POT_SHARE = 124;
		static final int MAGIC_IMBUE = 125;
		static final int FERTILE_SOIL = 126;
		static final int BOOST_POTION_SHARE = 127;
		static final int FISHING_GUILD_TELEPORT = 128;
		static final int TELE_GROUP_FISHING_GUILD = 129;
		static final int PLANK_MAKE = 130;
		static final int CATHERBY_TELEPORT = 131;
		static final int TELE_GROUP_CATHERBY = 132;
		static final int RECHARGE_DRAGONSTONE = 133;
		static final int ICE_PLATEAU_TELEPORT = 134;
		static final int TELE_GROUP_ICE_PLATEAU = 135;
		static final int ENERGY_TRANSFER = 136;
		static final int HEAL_OTHER = 137;
		static final int VENGEANCE_OTHER = 138;
		static final int VENGEANCE = 139;
		static final int HEAL_GROUP = 140;
		static final int SPELLBOOK_SWAP = 141;
		static final int GEOMANCY = 142;
		static final int SPIN_FLAX = 143;
		static final int OURANIA_TELEPORT = 144;

		// ARCEUUS SPELLS
		static final int ARCEUUS_HOME_TELEPORT = 145;
		static final int BASIC_REANIMATION = 146;
		static final int ARCEUUS_LIBRARY_TELEPORT = 147;
		static final int ADEPT_REANIMATION = 148;
		static final int EXPERT_REANIMATION = 149;
		static final int MASTER_REANIMATION = 150;
		static final int DRAYNOR_MANOR_TELEPORT = 151;
		static final int MIND_ALTAR_TELEPORT = 153;
		static final int RESPAWN_TELEPORT = 154;
		static final int SALVE_GRAVEYARD_TELEPORT = 155;
		static final int FENKENSTRAINS_CASTLE_TELEPORT = 156;
		static final int WEST_ARDOUGNE_TELEPORT = 157;
		static final int HARMONY_ISLAND_TELEPORT = 158;
		static final int CEMETERY_TELEPORT = 159;
		static final int RESURRECT_CROPS = 160;
		static final int BARROWS_TELEPORT = 161;
		static final int APE_ATOLL_TELEPORT = 162;
		static final int BATTLEFRONT_TELEPORT = 163;
		static final int INFERIOR_DEMONBANE = 164;
		static final int SUPERIOR_DEMONBANE = 165;
		static final int DARK_DEMONBANE = 166;
		static final int MARK_OF_DARKNESS = 167;
		static final int GHOSTLY_GRASP = 168;
		static final int SKELETAL_GRASP = 169;
		static final int UNDEAD_GRASP = 170;
		static final int WARD_OF_ARCEUUS = 171;
		static final int LESSER_CORRUPTION = 172;
		static final int GREATER_CORRUPTION = 173;
		static final int DEMONIC_OFFERING = 174;
		static final int SINISTER_OFFERING = 175;
		static final int DEGRIME = 176;
		static final int SHADOW_VEIL = 177;
		static final int VILE_VIGOUR = 178;
		static final int DARK_LURE = 179;
		static final int DEATH_CHARGE = 180;
		static final int RESURRECT_LESSER_GHOST = 181;
		static final int RESURRECT_LESSER_SKELETON = 182;
		static final int RESURRECT_LESSER_ZOMBIE = 183;
		static final int RESURRECT_SUPERIOR_GHOST = 184;
		static final int RESURRECT_SUPERIOR_SKELETON = 185;
		static final int RESURRECT_SUPERIOR_ZOMBIE = 186;
		static final int RESURRECT_GREATER_GHOST = 187;
		static final int RESURRECT_GREATER_SKELETON = 188;
		static final int RESURRECT_GREATER_ZOMBIE = 189;
	}

	static class DialogSprite2
	{
		static final int SPRITE1 = 1;
		static final int TEXT = 2;
		static final int SPRITE2 = 3;
		static final int CONTINUE = 4;
	}

	static class QuestTab
	{
		static final int QUEST_TAB = 3;
	}

	public static class TradeScreen
	{
		public static final int FIRST_TRADING_WITH = 31;
		public static final int SECOND_ACCEPT_FUNC = 13;
		public static final int SECOND_DECLINE_FUNC = 14;
		public static final int SECOND_MY_OFFER = 23;
		public static final int SECOND_THEIR_OFFER = 24;
		public static final int SECOND_ACCEPT_TEXT = 25;
		public static final int SECOND_DECLINE_TEXT = 26;
		public static final int SECOND_MY_ITEMS = 28;
		public static final int SECOND_THEIR_ITEMS = 29;
		public static final int SECOND_TRADING_WITH = 30;
	}

	public static class DuelConfig
	{
		public static final int CONFIG_GROUP_IP = 482;
		public static final int TITLE = 35;
		public static final int OPPONENT_ATT = 9;
		public static final int OPPONENT_STR = 13;
		public static final int OPPONENT_DEF = 17;
		public static final int OPPONENT_HP = 21;
	}

	public static class DuelResult
	{
		public static final int RESULT_GROUP_ID = 372;
		public static final int TITLE = 16;
		public static final int TOTAL_STAKED = 32;
		public static final int TOTAL_TAX = 39;
		public static final int WINNINGS = 40;
	}

	static class JewelBox
	{
		static final int DUEL_RING = 2;
		static final int GAME_NECK = 3;
		static final int COMB_BRAC = 4;
		static final int SKIL_NECK = 5;
		static final int RING_OFGP = 6;
		static final int AMUL_GLOR = 7; // yes
	}

	static class Options
	{
		static final int CAMERA_ZOOM_SLIDER_HANDLE = 15;
		static final int MUSIC_SLIDER = 37;
		static final int SOUND_EFFECT_SLIDER = 43;
		static final int AREA_SOUND_SLIDER = 49;
	}

	static class GauntletMap
	{
		static final int CONTAINER = 4;
	}

	static class Clan
	{
		static final int LAYER = 0;
		static final int HEADER = 1;
		static final int MEMBERS = 6;
	}

	static class ClanGuest
	{
		static final int LAYER = 0;
		static final int HEADER = 1;
		static final int MEMBERS = 6;
	}

	static class Trade
	{
		static final int HEADER = 31;
	}

	static class TroubleBrewing
	{
		static final int SCORE = 68;
	}

	static class SetDisplayName
	{
		static final int LAYER = 0;
		static final int ENTER_NAME_INPUT = 7;
		static final int NAME_STATUS = 13;
		static final int NAME_SUGGESTIONS = 14;
		static final int LOOKUP_NAME_BUTTON = 18;
		static final int SET_NAME_BUTTON = 19;
	}

	static class CharacterCreator
	{
		static final int LAYER = 0;
		static final int HEAD_LEFT_BUTTON = 12;
		static final int HEAD_RIGHT_BUTTON = 13;
		static final int JAW_LEFT_BUTTON = 16;
		static final int JAW_RIGHT_BUTTON = 17;
		static final int TORSO_LEFT_BUTTON = 20;
		static final int TORSO_RIGHT_BUTTON = 21;
		static final int ARMS_LEFT_BUTTON = 24;
		static final int ARMS_RIGHT_BUTTON = 25;
		static final int HANDS_LEFT_BUTTON = 28;
		static final int HANDS_RIGHT_BUTTON = 29;
		static final int LEGS_LEFT_BUTTON = 32;
		static final int LEGS_RIGHT_BUTTON = 33;
		static final int FEET_LEFT_BUTTON = 36;
		static final int FEET_RIGHT_BUTTON = 37;
		static final int HAIR_COLOR_LEFT_BUTTON = 43;
		static final int HAIR_COLOR_RIGHT_BUTTON = 44;
		static final int TORSO_COLOR_LEFT_BUTTON = 47;
		static final int TORSO_COLOR_RIGHT_BUTTON = 48;
		static final int LEGS_COLOR_LEFT_BUTTON = 51;
		static final int LEGS_COLOR_RIGHT_BUTTON = 52;
		static final int FEET_COLOR_LEFT_BUTTON = 55;
		static final int FEET_COLOR_RIGHT_BUTTON = 56;
		static final int SKIN_COLOR_LEFT_BUTTON = 59;
		static final int SKIN_COLOR_RIGHT_BUTTON = 60;
		static final int GENDER_MALE_BUTTON = 65;
		static final int GENDER_FEMALE_BUTTON = 66;
		static final int CONFIRM_BUTTON = 68;
	}
}
