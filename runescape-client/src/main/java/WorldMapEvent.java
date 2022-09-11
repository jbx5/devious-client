import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1057426347
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILkz;Lkz;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)[Ljl;",
		garbageValue = "127"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.NPC_INFO_LARGE_VIEWPORT_1, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.field3073, ServerPacket.field3074, ServerPacket.field3145, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.field3077, ServerPacket.field3125, ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.field3080, ServerPacket.field3081, ServerPacket.IF_SETANGLE, ServerPacket.field3083, ServerPacket.field3084, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.field3086, ServerPacket.NPC_SPOTANIM, ServerPacket.field3071, ServerPacket.CAM_SETANGLE, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.field3092, ServerPacket.REBUILD_REGION, ServerPacket.UPDATE_UID192, ServerPacket.MESSAGE_GAME, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.field3097, ServerPacket.field3098, ServerPacket.field3099, ServerPacket.field3147, ServerPacket.SET_PLAYER_OP, ServerPacket.IF_SETOBJECT, ServerPacket.field3103, ServerPacket.UPDATE_IGNORELIST, ServerPacket.field3105, ServerPacket.UPDATE_STAT, ServerPacket.IF_SETHIDE, ServerPacket.PLAYER_SPOTANIM, ServerPacket.PLAYER_INFO, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.field3113, ServerPacket.field3175, ServerPacket.EVENT_WORLDHOP, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.PROJECTILE_SPAWN, ServerPacket.MESSAGE_PRIVATE, ServerPacket.IF_MOVESUB, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.NPC_INFO_SMALL_VIEWPORT_2, ServerPacket.field3127, ServerPacket.field3121, ServerPacket.field3151, ServerPacket.IF_SETNPCHEAD, ServerPacket.field3124, ServerPacket.field3072, ServerPacket.IF_SETPOSITION, ServerPacket.LOGOUT, ServerPacket.IF_SETMODEL, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.field3131, ServerPacket.field3132, ServerPacket.field3133, ServerPacket.field3091, ServerPacket.IF_SETSCROLLPOS, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.field3139, ServerPacket.field3140, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.field3172, ServerPacket.field3143, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.field3146, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.MINIMAP_TOGGLE, ServerPacket.VARP_LARGE, ServerPacket.LOGOUT_FULL, ServerPacket.CAM_RESET, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.field3089, ServerPacket.IF_CLOSESUB, ServerPacket.SET_PRIVCHATMODE, ServerPacket.UPDATE_INV_FULL, ServerPacket.CAM_LOOKAT, ServerPacket.VARP_SMALL, ServerPacket.IF_SETCOLOUR, ServerPacket.field3082, ServerPacket.HINT_ARROW, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.field3163, ServerPacket.field3075, ServerPacket.field3154, ServerPacket.MIDI_SONG, ServerPacket.REBUILD_NORMAL, ServerPacket.REFLECTION_CHECKER, ServerPacket.field3169, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.field3171, ServerPacket.URL_OPEN, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.field3108, ServerPacket.field3166, ServerPacket.field3176}; // L: 115
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Ldv;",
		garbageValue = "-958717632"
	)
	static class119 method5257(int var0) {
		class119[] var1 = new class119[]{class119.field1480, class119.field1470, class119.field1473, class119.field1472, class119.field1471, class119.field1474}; // L: 33
		class119 var2 = (class119)Varps.findEnumerated(var1, var0); // L: 35
		if (var2 == null) { // L: 36
			var2 = class119.field1480;
		}

		return var2; // L: 37
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(Lcl;I)Z",
		garbageValue = "2125074657"
	)
	static boolean method5256(Player var0) {
		if (Client.drawPlayerNames == 0) { // L: 4796
			return false;
		} else {
			boolean var1;
			if (class67.localPlayer == var0) { // L: 4797
				var1 = (Client.drawPlayerNames & 8) != 0; // L: 4811
				return var1; // L: 4813
			} else {
				var1 = UserComparator4.method2730() || class137.method3085() && var0.isFriend(); // L: 4798
				if (!var1) { // L: 4799
					boolean var2 = (Client.drawPlayerNames & 2) != 0; // L: 4802
					var1 = var2 && var0.isFriendsChatMember(); // L: 4804
				}

				return var1; // L: 4806
			}
		}
	}
}
