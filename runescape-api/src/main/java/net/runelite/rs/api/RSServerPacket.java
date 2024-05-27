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

	@Import("GRAPHICSOBJECT_SPAWN")
	RSServerPacket GRAPHICSOBJECT_SPAWN();

	@Import("LOGOUT")
	RSServerPacket LOGOUT();

	@Import("MESSAGE_FRIENDS_CHAT")
	RSServerPacket MESSAGE_FRIENDS_CHAT();

	@Import("CAM_RESET")
	RSServerPacket CAM_RESET();

	@Import("PLAYER_INFO")
	RSServerPacket PLAYER_INFO();

	@Import("HINT_ARROW")
	RSServerPacket HINT_ARROW();

	@Import("IF_SETHIDE")
	RSServerPacket IF_SETHIDE();

	@Import("IF_SETPLAYERHEAD")
	RSServerPacket IF_SETPLAYERHEAD();

	@Import("IF_SETSCROLLPOS")
	RSServerPacket IF_SETSCROLLPOS();

	//@Import("NPC_INFO_LARGE_VIEWPORT_1")
	//RSServerPacket NPC_INFO_LARGE_VIEWPORT_1();

	@Import("UPDATE_REBOOT_TIMER")
	RSServerPacket UPDATE_REBOOT_TIMER();

	@Import("UPDATE_STOCKMARKET_SLOT")
	RSServerPacket UPDATE_STOCKMARKET_SLOT();

	//@Import("NPC_INFO_SMALL_VIEWPORT_2")
	//RSServerPacket NPC_INFO_SMALL_VIEWPORT_2();

	@Import("UPDATE_FRIENDLIST")
	RSServerPacket UPDATE_FRIENDLIST();

	@Import("MINIMAP_TOGGLE")
	RSServerPacket MINIMAP_TOGGLE();

	@Import("NPC_INFO_SMALL_VIEWPORT_1")
	RSServerPacket NPC_INFO_SMALL_VIEWPORT_1();

	@Import("NPC_SPOTANIM")
	RSServerPacket NPC_SPOTANIM();

	@Import("RESET_CLIENT_VARCACHE")
	RSServerPacket RESET_CLIENT_VARCACHE();

	@Import("IF_SETOBJECT")
	RSServerPacket IF_SETOBJECT();

	@Import("VARP_SMALL")
	RSServerPacket VARP_SMALL();

	@Import("UPDATE_INV_FULL")
	RSServerPacket UPDATE_INV_FULL();

	@Import("UPDATE_IGNORELIST")
	RSServerPacket UPDATE_IGNORELIST();

	@Import("UPDATE_ZONE_PARTIAL_ENCLOSED")
	RSServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED();

	@Import("REBUILD_NORMAL")
	RSServerPacket REBUILD_NORMAL();

	@Import("IF_MOVESUB")
	RSServerPacket IF_MOVESUB();

	@Import("REFLECTION_CHECKER")
	RSServerPacket REFLECTION_CHECKER();

	@Import("PROJECTILE_SPAWN")
	RSServerPacket PROJECTILE_SPAWN();

	@Import("CAM_LOOKAT")
	RSServerPacket CAM_LOOKAT();

	@Import("MINIMAP_FLAG_SET")
	RSServerPacket MINIMAP_FLAG_SET();

	@Import("NPC_SET_SEQUENCE")
	RSServerPacket NPC_SET_SEQUENCE();

	@Import("MESSAGE_PRIVATE_ECHO")
	RSServerPacket MESSAGE_PRIVATE_ECHO();

	@Import("UPDATE_ZONE_FULL_FOLLOWS")
	RSServerPacket UPDATE_ZONE_FULL_FOLLOWS();

	@Import("VARP_LARGE")
	RSServerPacket VARP_LARGE();

	@Import("UPDATE_INV_CLEAR")
	RSServerPacket UPDATE_INV_CLEAR();

	@Import("LOGOUT_FULL")
	RSServerPacket LOGOUT_FULL();

	@Import("MIDI_SONG")
	RSServerPacket MIDI_SONG();

	@Import("TRIGGER_ONDIALOG_ABORT")
	RSServerPacket TRIGGER_ONDIALOG_ABORT();

	@Import("IF_SETANGLE")
	RSServerPacket IF_SETANGLE();

	@Import("SET_PLAYER_OP")
	RSServerPacket SET_PLAYER_OP();

	@Import("UPDATE_INV_PARTIAL")
	RSServerPacket UPDATE_INV_PARTIAL();

	@Import("IF_SETNPCHEAD")
	RSServerPacket IF_SETNPCHEAD();

	@Import("IF_SETMODEL")
	RSServerPacket IF_SETMODEL();

	@Import("IF_SETCOLOUR")
	RSServerPacket IF_SETCOLOUR();

	@Import("MESSAGE_PRIVATE")
	RSServerPacket MESSAGE_PRIVATE();

	@Import("REBUILD_REGION")
	RSServerPacket REBUILD_REGION();

	@Import("UPDATE_STAT")
	RSServerPacket UPDATE_STAT();

	@Import("IF_CLOSESUB")
	RSServerPacket IF_CLOSESUB();

	@Import("PING_STATISTICS_REQUEST")
	RSServerPacket PING_STATISTICS_REQUEST();

	@Import("UPDATE_INV_STOP_TRANSIT")
	RSServerPacket UPDATE_INV_STOP_TRANSIT();

	@Import("URL_OPEN")
	RSServerPacket URL_OPEN();

	@Import("RUNCLIENTSCRIPT")
	RSServerPacket RUNCLIENTSCRIPT();

	@Import("MESSAGE_GAME")
	RSServerPacket MESSAGE_GAME();

	@Import("CAM_SETANGLE")
	RSServerPacket CAM_SETANGLE();

	@Import("PLAYER_SPOTANIM")
	RSServerPacket PLAYER_SPOTANIM();

	@Import("CHAT_FILTER_SETTINGS")
	RSServerPacket CHAT_FILTER_SETTINGS();

	@Import("SYNC_CLIENT_VARCACHE")
	RSServerPacket SYNC_CLIENT_VARCACHE();

	@Import("NPC_INFO_LARGE_VIEWPORT_2")
	RSServerPacket NPC_INFO_LARGE_VIEWPORT_2();

	@Import("IF_SETPOSITION")
	RSServerPacket IF_SETPOSITION();

	@Import("UPDATE_UID192")
	RSServerPacket UPDATE_UID192();

	@Import("DYNAMICOBJECT_SPAWN")
	RSServerPacket DYNAMICOBJECT_SPAWN();

	@Import("SET_PRIVCHATMODE")
	RSServerPacket SET_PRIVCHATMODE();
}
