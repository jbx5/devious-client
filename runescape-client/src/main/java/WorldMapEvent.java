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
		return new ServerPacket[]{ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.REBUILD_NORMAL, ServerPacket.field3073, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.field3145, ServerPacket.REFLECTION_CHECKER, ServerPacket.field3077, ServerPacket.SET_PRIVCHATMODE, ServerPacket.field3120, ServerPacket.IF_SETSCROLLPOS, ServerPacket.field3081, ServerPacket.field3141, ServerPacket.field3083, ServerPacket.LOGOUT_FULL, ServerPacket.field3085, ServerPacket.IF_SETMODEL, ServerPacket.field3087, ServerPacket.IF_MOVESUB, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.field3090, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.field3092, ServerPacket.field3093, ServerPacket.EVENT_WORLDHOP, ServerPacket.REBUILD_REGION, ServerPacket.URL_OPEN, ServerPacket.IF_CLOSESUB, ServerPacket.field3098, ServerPacket.LOGOUT, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.field3101, ServerPacket.IF_SETPOSITION, ServerPacket.UPDATE_STAT, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.MINIMAP_TOGGLE, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.IF_SETANGLE, ServerPacket.field3153, ServerPacket.IF_SETNPCHEAD, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.field3113, ServerPacket.field3175, ServerPacket.field3115, ServerPacket.field3114, ServerPacket.CAM_LOOKAT, ServerPacket.CAM_SETANGLE, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.CAM_SETANGLE, ServerPacket.VARP_LARGE, ServerPacket.field3127, ServerPacket.MESSAGE_GAME, ServerPacket.NPC_INFO_SMALL_VIEWPORT_2, ServerPacket.field3123, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.field3072, ServerPacket.field3126, ServerPacket.SET_PLAYER_OP, ServerPacket.UPDATE_UID192, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.field3131, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.field3091, ServerPacket.NPC_SPOTANIM, ServerPacket.NPC_INFO_LARGE_VIEWPORT_1, ServerPacket.PLAYER_SPOTANIM, ServerPacket.field3138, ServerPacket.field3139, ServerPacket.field3140, ServerPacket.UPDATE_INV_FULL, ServerPacket.field3172, ServerPacket.UPDATE_IGNORELIST, ServerPacket.field3144, ServerPacket.field3094, ServerPacket.field3146, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.field3112, ServerPacket.IF_SETCOLOUR, ServerPacket.field3111, ServerPacket.HINT_ARROW, ServerPacket.field3152, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.field3155, ServerPacket.field3156, ServerPacket.IF_SETHIDE, ServerPacket.MESSAGE_PRIVATE, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.PLAYER_INFO, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.MIDI_SONG, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.field3075, ServerPacket.field3154, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.field3167, ServerPacket.field3168, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.VARP_SMALL, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.CAM_RESET, ServerPacket.field3173, ServerPacket.IF_SETOBJECT, ServerPacket.PROJECTILE_SPAWN, ServerPacket.field3176}; // L: 115
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
