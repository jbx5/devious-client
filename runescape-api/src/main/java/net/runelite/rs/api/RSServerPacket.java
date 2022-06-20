package net.runelite.rs.api;

import net.runelite.api.packets.ServerPacket;
import net.runelite.mapping.Import;

public interface RSServerPacket extends ServerPacket
{
	@Import("id")
	@Override
	int getId();

	@Import("length")
	@Override
	int getLength();
	@Import("field3123")
	RSServerPacket GRAPHICSOBJECT_SPAWN();

	@Import("field3075")
	RSServerPacket LOGOUT();

	@Import("field3045")
	RSServerPacket MESSAGE_FRIENDS_CHAT();

	@Import("field3068")
	RSServerPacket CAM_RESET();

	@Import("field3090")
	RSServerPacket PLAYER_INFO();

	@Import("field3103")
	RSServerPacket HINT_ARROW();

	@Import("field3095")
	RSServerPacket IF_SETHIDE();

	@Import("field3129")
	RSServerPacket IF_SETPLAYERHEAD();

	@Import("field3043")
	RSServerPacket IF_SETSCROLLPOS();

	@Import("field3106")
	RSServerPacket NPC_INFO_LARGE_VIEWPORT_1();

	@Import("field3079")
	RSServerPacket UPDATE_REBOOT_TIMER();

	@Import("field3094")
	RSServerPacket UPDATE_STOCKMARKET_SLOT();

	@Import("field3097")
	RSServerPacket NPC_INFO_SMALL_VIEWPORT_2();

	@Import("field3089")
	RSServerPacket UPDATE_FRIENDLIST();

	@Import("field3073")
	RSServerPacket MINIMAP_TOGGLE();

	@Import("field3056")
	RSServerPacket NPC_INFO_SMALL_VIEWPORT_1();

	@Import("field3102")
	RSServerPacket NPC_SPOTANIM();

	@Import("field3127")
	RSServerPacket RESET_CLIENT_VARCACHE();

	@Import("field3060")
	RSServerPacket IF_SETOBJECT();

	@Import("field3099")
	RSServerPacket UPDATE_INV_FULL();

	@Import("field3066")
	RSServerPacket UPDATE_IGNORELIST();

	@Import("field3105")
	RSServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED();

	@Import("field3082")
	RSServerPacket REBUILD_NORMAL();

	@Import("field3119")
	RSServerPacket IF_MOVESUB();

	@Import("field3137")
	RSServerPacket REFLECTION_CHECKER();

	@Import("field3116")
	RSServerPacket PROJECTILE_SPAWN();

	@Import("field3121")
	RSServerPacket CAM_LOOKAT();

	@Import("field3061")
	RSServerPacket MINIMAP_FLAG_SET();

	@Import("field3057")
	RSServerPacket NPC_SET_SEQUENCE();

	@Import("field3136")
	RSServerPacket MESSAGE_PRIVATE_ECHO();

	@Import("field3142")
	RSServerPacket UPDATE_ZONE_FULL_FOLLOWS();

	@Import("field3080")
	RSServerPacket UPDATE_INV_CLEAR();

	@Import("field3107")
	RSServerPacket LOGOUT_FULL();

	@Import("field3101")
	RSServerPacket MIDI_SONG();

	@Import("field3055")
	RSServerPacket TRIGGER_ONDIALOG_ABORT();

	@Import("field3114")
	RSServerPacket SET_PLAYER_OP();

	@Import("field3041")
	RSServerPacket IF_SETCOLOUR();

	@Import("field3083")
	RSServerPacket MESSAGE_PRIVATE();

	@Import("field3046")
	RSServerPacket REBUILD_REGION();

	@Import("field3091")
	RSServerPacket UPDATE_STAT();

	@Import("field3078")
	RSServerPacket IF_CLOSESUB();

	@Import("field3049")
	RSServerPacket PING_STATISTICS_REQUEST();

	@Import("field3120")
	RSServerPacket URL_OPEN();

	@Import("field3093")
	RSServerPacket RUNCLIENTSCRIPT();

	@Import("field3069")
	RSServerPacket MESSAGE_GAME();

	@Import("field3047")
	RSServerPacket CAM_SETANGLE();

	@Import("field3052")
	RSServerPacket PLAYER_SPOTANIM();

	@Import("field3108")
	RSServerPacket CHAT_FILTER_SETTINGS();

	@Import("field3058")
	RSServerPacket NPC_INFO_LARGE_VIEWPORT_2();

	@Import("field3087")
	RSServerPacket IF_SETPOSITION();

	@Import("field3092")
	RSServerPacket UPDATE_UID192();

	@Import("field3104")
	RSServerPacket DYNAMICOBJECT_SPAWN();
}
