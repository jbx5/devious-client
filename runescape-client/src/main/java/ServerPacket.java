import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket REFLECTION_CHECKER;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket LOGOUT_FULL;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket UPDATE_REBOOT_TIMER;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3460;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3405;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3406;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3484;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3408;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3409;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket UPDATE_INV_STOP_TRANSIT;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3411;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3412;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3413;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3523;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3415;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket MESSAGE_PRIVATE;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket MESSAGE_PRIVATE_ECHO;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket MINIMAP_FLAG_SET;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket NPC_INFO_LARGE_VIEWPORT_2;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	static final ServerPacket field3421;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3422;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket UPDATE_STAT;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket IF_SETSCROLLPOS;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket VARP_SMALL;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket UPDATE_INV_PARTIAL;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3468;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3428;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3429;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket RUNCLIENTSCRIPT;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3427;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket NPC_INFO_SMALL_VIEWPORT_1;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3433;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket URL_OPEN;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket IF_MOVESUB;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3436;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3437;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3438;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3439;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket MESSAGE_FRIENDS_CHAT;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3472;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3404;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3443;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket VARP_LARGE;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket PLAYER_INFO;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket DYNAMICOBJECT_SPAWN;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket CAM_LOOKAT;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3448;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3449;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3450;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket IF_SETANGLE;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3495;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket NPC_SET_SEQUENCE;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket UPDATE_INV_CLEAR;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket MINIMAP_TOGGLE;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3456;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket IF_SETPOSITION;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket UPDATE_FRIENDLIST;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3459;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket UPDATE_IGNORELIST;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket IF_SETPLAYERHEAD;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket UPDATE_UID192;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket IF_SETMODEL;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3414;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3478;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3463;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3442;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3400;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket LOGOUT;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3470;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3471;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket TRIGGER_ONDIALOG_ABORT;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3434;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket PING_STATISTICS_REQUEST;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3500;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket GRAPHICSOBJECT_SPAWN;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3477;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3519;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket SYNC_CLIENT_VARCACHE;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3480;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3481;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket SET_PRIVCHATMODE;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3420;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket MIDI_SONG;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket UPDATE_STOCKMARKET_SLOT;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket IF_SETCOLOUR;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3487;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3488;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3489;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3452;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	static final ServerPacket field3491;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3407;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3493;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3494;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket MESSAGE_GAME;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket IF_CLOSESUB;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3497;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket REBUILD_NORMAL;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket CAM_SETANGLE;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket IF_SETNPCHEAD;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket UPDATE_INV_FULL;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3502;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3503;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3529;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket IF_SETOBJECT;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3506;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3507;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3485;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket CHAT_FILTER_SETTINGS;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3402;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket RESET_CLIENT_VARCACHE;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3512;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket EVENT_WORLDHOP;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3514;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket NPC_SPOTANIM;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket PLAYER_SPOTANIM;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3492;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket PROJECTILE_SPAWN;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket SET_PLAYER_OP;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket CAM_RESET;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket REBUILD_REGION;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket IF_SETHIDE;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3444;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3524;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3525;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket HINT_ARROW;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3527;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3528;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3535;
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3530;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3531;
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3532;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final ServerPacket field3423;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = -137661787
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("fd")
	@ObfuscatedGetter(
		intValue = -124538271
	)
	@Export("length")
	public final int length;

	static {
		REFLECTION_CHECKER = new ServerPacket(0, -2);
		UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(1, 3);
		LOGOUT_FULL = new ServerPacket(2, 0);
		UPDATE_REBOOT_TIMER = new ServerPacket(3, 2);
		field3460 = new ServerPacket(4, -2);
		field3405 = new ServerPacket(5, 6);
		field3406 = new ServerPacket(6, 5);
		field3484 = new ServerPacket(7, 5);
		field3408 = new ServerPacket(8, 11);
		field3409 = new ServerPacket(9, 12);
		UPDATE_INV_STOP_TRANSIT = new ServerPacket(10, 2);
		field3411 = new ServerPacket(11, 3);
		field3412 = new ServerPacket(12, -2);
		field3413 = new ServerPacket(13, -2);
		field3523 = new ServerPacket(14, 2);
		field3415 = new ServerPacket(15, 0);
		MESSAGE_PRIVATE = new ServerPacket(16, -1);
		UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(17, -2);
		MESSAGE_PRIVATE_ECHO = new ServerPacket(18, -2);
		MINIMAP_FLAG_SET = new ServerPacket(19, 2);
		NPC_INFO_LARGE_VIEWPORT_2 = new ServerPacket(20, -2);
		field3421 = new ServerPacket(21, -2);
		field3422 = new ServerPacket(22, 4);
		UPDATE_STAT = new ServerPacket(23, 7);
		IF_SETSCROLLPOS = new ServerPacket(24, 6);
		VARP_SMALL = new ServerPacket(25, 3);
		UPDATE_INV_PARTIAL = new ServerPacket(26, -2);
		field3468 = new ServerPacket(27, 2);
		field3428 = new ServerPacket(28, 2);
		field3429 = new ServerPacket(29, 10);
		RUNCLIENTSCRIPT = new ServerPacket(30, -2);
		field3427 = new ServerPacket(31, -2);
		NPC_INFO_SMALL_VIEWPORT_1 = new ServerPacket(32, -2);
		field3433 = new ServerPacket(33, 1);
		URL_OPEN = new ServerPacket(34, -2);
		IF_MOVESUB = new ServerPacket(35, 8);
		field3436 = new ServerPacket(36, 7);
		field3437 = new ServerPacket(37, 9);
		field3438 = new ServerPacket(38, 14);
		field3439 = new ServerPacket(39, 4);
		MESSAGE_FRIENDS_CHAT = new ServerPacket(40, -1);
		field3472 = new ServerPacket(41, 7);
		field3404 = new ServerPacket(42, 0);
		field3443 = new ServerPacket(43, 14);
		VARP_LARGE = new ServerPacket(44, 6);
		PLAYER_INFO = new ServerPacket(45, -2);
		DYNAMICOBJECT_SPAWN = new ServerPacket(46, 6);
		CAM_LOOKAT = new ServerPacket(47, 7);
		field3448 = new ServerPacket(48, -2);
		field3449 = new ServerPacket(49, 6);
		field3450 = new ServerPacket(50, 8);
		IF_SETANGLE = new ServerPacket(51, 10);
		field3495 = new ServerPacket(52, -1);
		NPC_SET_SEQUENCE = new ServerPacket(53, 5);
		UPDATE_INV_CLEAR = new ServerPacket(54, 4);
		MINIMAP_TOGGLE = new ServerPacket(55, 1);
		field3456 = new ServerPacket(56, 17);
		IF_SETPOSITION = new ServerPacket(57, 8);
		UPDATE_FRIENDLIST = new ServerPacket(58, -2);
		field3459 = new ServerPacket(59, 6);
		UPDATE_IGNORELIST = new ServerPacket(60, -2);
		IF_SETPLAYERHEAD = new ServerPacket(61, 4);
		UPDATE_UID192 = new ServerPacket(62, 28);
		IF_SETMODEL = new ServerPacket(63, 6);
		field3414 = new ServerPacket(64, 8);
		field3478 = new ServerPacket(65, -1);
		field3463 = new ServerPacket(66, 20);
		field3442 = new ServerPacket(67, 4);
		field3400 = new ServerPacket(68, 6);
		LOGOUT = new ServerPacket(69, 1);
		field3470 = new ServerPacket(70, -1);
		field3471 = new ServerPacket(71, 1);
		TRIGGER_ONDIALOG_ABORT = new ServerPacket(72, 0);
		field3434 = new ServerPacket(73, 4);
		PING_STATISTICS_REQUEST = new ServerPacket(74, 8);
		field3500 = new ServerPacket(75, 5);
		GRAPHICSOBJECT_SPAWN = new ServerPacket(76, 8);
		field3477 = new ServerPacket(77, 4);
		field3519 = new ServerPacket(78, 6);
		SYNC_CLIENT_VARCACHE = new ServerPacket(79, 0);
		field3480 = new ServerPacket(80, 12);
		field3481 = new ServerPacket(81, -2);
		SET_PRIVCHATMODE = new ServerPacket(82, 1);
		field3420 = new ServerPacket(83, -2);
		MIDI_SONG = new ServerPacket(84, 2);
		UPDATE_STOCKMARKET_SLOT = new ServerPacket(85, 20);
		IF_SETCOLOUR = new ServerPacket(86, 6);
		field3487 = new ServerPacket(87, 2);
		field3488 = new ServerPacket(88, -1);
		field3489 = new ServerPacket(89, 8);
		field3452 = new ServerPacket(90, 0);
		field3491 = new ServerPacket(91, 7);
		field3407 = new ServerPacket(92, 5);
		field3493 = new ServerPacket(93, -2);
		field3494 = new ServerPacket(94, 4);
		MESSAGE_GAME = new ServerPacket(95, -1);
		IF_CLOSESUB = new ServerPacket(96, 4);
		field3497 = new ServerPacket(97, 0);
		REBUILD_NORMAL = new ServerPacket(98, -2);
		CAM_SETANGLE = new ServerPacket(99, 6);
		IF_SETNPCHEAD = new ServerPacket(100, 6);
		UPDATE_INV_FULL = new ServerPacket(101, -2);
		field3502 = new ServerPacket(102, 6);
		field3503 = new ServerPacket(103, 7);
		field3529 = new ServerPacket(104, 5);
		IF_SETOBJECT = new ServerPacket(105, 10);
		field3506 = new ServerPacket(106, 0);
		field3507 = new ServerPacket(107, 2);
		field3485 = new ServerPacket(108, 7);
		CHAT_FILTER_SETTINGS = new ServerPacket(109, 2);
		field3402 = new ServerPacket(110, -2);
		RESET_CLIENT_VARCACHE = new ServerPacket(111, 0);
		field3512 = new ServerPacket(112, -2);
		EVENT_WORLDHOP = new ServerPacket(113, -1);
		field3514 = new ServerPacket(114, -2);
		NPC_SPOTANIM = new ServerPacket(115, 9);
		PLAYER_SPOTANIM = new ServerPacket(116, 9);
		field3492 = new ServerPacket(117, 3);
		PROJECTILE_SPAWN = new ServerPacket(118, 19);
		SET_PLAYER_OP = new ServerPacket(119, -1);
		CAM_RESET = new ServerPacket(120, 8);
		REBUILD_REGION = new ServerPacket(121, -2);
		IF_SETHIDE = new ServerPacket(122, 5);
		field3444 = new ServerPacket(123, 10);
		field3524 = new ServerPacket(124, 0);
		field3525 = new ServerPacket(125, 5);
		HINT_ARROW = new ServerPacket(126, 6);
		field3527 = new ServerPacket(127, 3);
		field3528 = new ServerPacket(128, 0);
		field3535 = new ServerPacket(129, 1);
		field3530 = new ServerPacket(130, 4);
		field3531 = new ServerPacket(131, 1);
		field3532 = new ServerPacket(132, 1);
		field3423 = new ServerPacket(133, -2);
	}

	ServerPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}
}
