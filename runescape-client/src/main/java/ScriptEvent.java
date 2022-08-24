import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("co")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("sz")
	@ObfuscatedSignature(descriptor = "Lbq;")
	@Export("decimator")
	static Decimator decimator;

	@ObfuscatedName("vx")
	@ObfuscatedGetter(intValue = -1961432799)
	@Export("foundItemIdCount")
	static int foundItemIdCount;

	@ObfuscatedName("s")
	@Export("args")
	Object[] args;

	@ObfuscatedName("h")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lkn;")
	@Export("widget")
	Widget widget;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 1908546929)
	@Export("mouseX")
	int mouseX;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 2078605609)
	@Export("mouseY")
	int mouseY;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 292390885)
	@Export("opIndex")
	int opIndex;

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "Lkn;")
	@Export("dragTarget")
	Widget dragTarget;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 358587025)
	@Export("keyTyped")
	int keyTyped;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 474745929)
	@Export("keyPressed")
	int keyPressed;

	@ObfuscatedName("n")
	@Export("targetName")
	String targetName;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -327885641)
	int field1039;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 736580663)
	@Export("type")
	int type = 76;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "([Ljava/lang/Object;I)V", garbageValue = "1390308076")
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1431944361")
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)[Ljy;", garbageValue = "331732172")
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ ServerPacket.NPC_INFO_LARGE_VIEWPORT_1, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.field3048, ServerPacket.field3127, ServerPacket.field3071, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.field3057, ServerPacket.field3053, ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.field3064, ServerPacket.field3056, ServerPacket.IF_SETANGLE, ServerPacket.field3058, ServerPacket.field3065, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.field3061, ServerPacket.NPC_SPOTANIM, ServerPacket.field3055, ServerPacket.CAM_SETANGLE, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.field3122, ServerPacket.REBUILD_REGION, ServerPacket.UPDATE_UID192, ServerPacket.MESSAGE_GAME, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.field3092, ServerPacket.field3073, ServerPacket.field3067, ServerPacket.field3075, ServerPacket.SET_PLAYER_OP, ServerPacket.IF_SETOBJECT, ServerPacket.field3099, ServerPacket.UPDATE_IGNORELIST, ServerPacket.field3080, ServerPacket.UPDATE_STAT, ServerPacket.IF_SETHIDE, ServerPacket.PLAYER_SPOTANIM, ServerPacket.PLAYER_INFO, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.field3086, ServerPacket.field3087, ServerPacket.EVENT_WORLDHOP, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.PROJECTILE_SPAWN, ServerPacket.MESSAGE_PRIVATE, ServerPacket.IF_MOVESUB, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.NPC_INFO_SMALL_VIEWPORT_2, ServerPacket.field3125, ServerPacket.field3096, ServerPacket.field3097, ServerPacket.IF_SETNPCHEAD, ServerPacket.field3098, ServerPacket.field3100, ServerPacket.IF_SETPOSITION, ServerPacket.LOGOUT, ServerPacket.IF_SETMODEL, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.field3052, ServerPacket.field3089, ServerPacket.field3108, ServerPacket.field3109, ServerPacket.IF_SETSCROLLPOS, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.field3151, ServerPacket.field3115, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.field3117, ServerPacket.field3118, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.field3049, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.MINIMAP_TOGGLE, ServerPacket.VARP_LARGE, ServerPacket.LOGOUT_FULL, ServerPacket.CAM_RESET, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.field3132, ServerPacket.IF_CLOSESUB, ServerPacket.SET_PRIVCHATMODE, ServerPacket.UPDATE_INV_FULL, ServerPacket.CAM_LOOKAT, ServerPacket.VARP_SMALL, ServerPacket.IF_SETCOLOUR, ServerPacket.field3135, ServerPacket.HINT_ARROW, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.field3107, ServerPacket.field3139, ServerPacket.field3140, ServerPacket.MIDI_SONG, ServerPacket.REBUILD_NORMAL, ServerPacket.REFLECTION_CHECKER, ServerPacket.field3144, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.field3146, ServerPacket.URL_OPEN, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.field3149, ServerPacket.field3150 };
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "([BI)Lii;", garbageValue = "1858757744")
	static WorldMapSprite method2063(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(class155.method3172(var0).pixels);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "1186851078")
	public static int method2064(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}
}