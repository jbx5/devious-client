import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3397;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket REBUILD_REGION;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket IF_SETHIDE;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3384;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket PLAYER_SPOTANIM;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3386;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3510;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket REBUILD_NORMAL;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3389;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3390;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3391;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket IF_SETOBJECT;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3479;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3502;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3395;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3396;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket IF_MOVESUB;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket DYNAMICOBJECT_SPAWN;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket MESSAGE_PRIVATE_ECHO;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3400;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3401;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket IF_SETMODEL;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket MESSAGE_FRIENDS_CHAT;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3404;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket UPDATE_UID192;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket UPDATE_INV_FULL;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3407;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3439;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket PING_STATISTICS_REQUEST;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3394;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket UPDATE_REBOOT_TIMER;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket LOGOUT;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket IF_CLOSESUB;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3415;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3432;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket UPDATE_STOCKMARKET_SLOT;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3419;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3436;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket UPDATE_FRIENDLIST;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket UPDATE_STAT;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3422;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3424;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket MESSAGE_PRIVATE;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket SYNC_CLIENT_VARCACHE;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3427;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3494;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3429;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3430;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket PLAYER_INFO;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket IF_SETANGLE;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3433;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket IF_SETPOSITION;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3435;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3458;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3437;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3423;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3428;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3440;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket GRAPHICSOBJECT_SPAWN;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket NPC_SET_SEQUENCE;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3443;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket VARP_LARGE;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket TRIGGER_ONDIALOG_ABORT;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket CAM_SETANGLE;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3447;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3482;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3498;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket CAM_RESET;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket CAM_MOVETO;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket VARP_SMALL;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket EVENT_WORLDHOP;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3517;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket MIDI_SONG;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3456;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3465;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket MINIMAP_TOGGLE;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket SET_PLAYER_OP;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3449;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3461;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3462;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3388;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket IF_SETPLAYERHEAD;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket URL_OPEN;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket UPDATE_INV_CLEAR;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket UPDATE_INV_PARTIAL;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3387;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3469;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3470;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket UPDATE_IGNORELIST;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket MINIMAP_FLAG_SET;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3473;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3474;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket NPC_INFO_LARGE_VIEWPORT_2;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3476;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket NPC_INFO_SMALL_VIEWPORT_1;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket IF_SETSCROLLPOS;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket MESSAGE_GAME;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3480;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3481;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket RESET_CLIENT_VARCACHE;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3501;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3484;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket REFLECTION_CHECKER;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket RUNCLIENTSCRIPT;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3383;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3438;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket CAM_LOOKAT;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket HINT_ARROW;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3491;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	static final ServerPacket field3492;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3493;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket SET_PRIVCHATMODE;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket CHAT_FILTER_SETTINGS;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket NPC_SPOTANIM;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3497;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket UPDATE_INV_STOP_TRANSIT;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3505;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	static final ServerPacket field3500;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3488;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket IF_SETNPCHEAD;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket PROJECTILE_SPAWN;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket IF_SETCOLOUR;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3471;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3464;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket LOGOUT_FULL;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3508;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3509;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3410;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3516;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3512;
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3513;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3514;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public static final ServerPacket field3515;
	@ObfuscatedName("ff")
	@ObfuscatedGetter(
		intValue = -1278277807
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("fe")
	@ObfuscatedGetter(
		intValue = 568054299
	)
	@Export("length")
	public final int length;

	static {
		field3397 = new ServerPacket(0, 5);
		REBUILD_REGION = new ServerPacket(1, -2);
		IF_SETHIDE = new ServerPacket(2, 5);
		field3384 = new ServerPacket(3, 1);
		PLAYER_SPOTANIM = new ServerPacket(4, 9);
		field3386 = new ServerPacket(5, 4);
		field3510 = new ServerPacket(6, 4);
		REBUILD_NORMAL = new ServerPacket(7, -2);
		field3389 = new ServerPacket(8, 2);
		field3390 = new ServerPacket(9, 5);
		field3391 = new ServerPacket(10, -2);
		IF_SETOBJECT = new ServerPacket(11, 10);
		field3479 = new ServerPacket(12, 17);
		field3502 = new ServerPacket(13, -2);
		field3395 = new ServerPacket(14, -1);
		field3396 = new ServerPacket(15, 5);
		IF_MOVESUB = new ServerPacket(16, 8);
		DYNAMICOBJECT_SPAWN = new ServerPacket(17, 6);
		MESSAGE_PRIVATE_ECHO = new ServerPacket(18, -2);
		field3400 = new ServerPacket(19, 6);
		field3401 = new ServerPacket(20, 9);
		IF_SETMODEL = new ServerPacket(21, 6);
		MESSAGE_FRIENDS_CHAT = new ServerPacket(22, -1);
		field3404 = new ServerPacket(23, 2);
		UPDATE_UID192 = new ServerPacket(24, 28);
		UPDATE_INV_FULL = new ServerPacket(25, -2);
		field3407 = new ServerPacket(26, 11);
		field3439 = new ServerPacket(27, -1);
		PING_STATISTICS_REQUEST = new ServerPacket(28, 8);
		field3394 = new ServerPacket(29, -2);
		UPDATE_REBOOT_TIMER = new ServerPacket(30, 2);
		LOGOUT = new ServerPacket(31, 1);
		UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(32, 3);
		IF_CLOSESUB = new ServerPacket(33, 4);
		field3415 = new ServerPacket(34, 1);
		UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(35, -2);
		field3432 = new ServerPacket(36, 4);
		UPDATE_STOCKMARKET_SLOT = new ServerPacket(37, 20);
		field3419 = new ServerPacket(38, -2);
		field3436 = new ServerPacket(39, 2);
		UPDATE_FRIENDLIST = new ServerPacket(40, -2);
		UPDATE_STAT = new ServerPacket(41, 7);
		field3422 = new ServerPacket(42, 6);
		field3424 = new ServerPacket(43, 3);
		MESSAGE_PRIVATE = new ServerPacket(44, -1);
		SYNC_CLIENT_VARCACHE = new ServerPacket(45, 0);
		field3427 = new ServerPacket(46, -2);
		field3494 = new ServerPacket(47, 7);
		field3429 = new ServerPacket(48, 2);
		field3430 = new ServerPacket(49, 12);
		PLAYER_INFO = new ServerPacket(50, -2);
		IF_SETANGLE = new ServerPacket(51, 10);
		field3433 = new ServerPacket(52, -1);
		IF_SETPOSITION = new ServerPacket(53, 8);
		field3435 = new ServerPacket(54, 3);
		field3458 = new ServerPacket(55, 10);
		field3437 = new ServerPacket(56, 14);
		field3423 = new ServerPacket(57, 0);
		field3428 = new ServerPacket(58, 20);
		field3440 = new ServerPacket(59, -2);
		GRAPHICSOBJECT_SPAWN = new ServerPacket(60, 8);
		NPC_SET_SEQUENCE = new ServerPacket(61, 5);
		field3443 = new ServerPacket(62, 14);
		VARP_LARGE = new ServerPacket(63, 6);
		TRIGGER_ONDIALOG_ABORT = new ServerPacket(64, 0);
		CAM_SETANGLE = new ServerPacket(65, 6);
		field3447 = new ServerPacket(66, 8);
		field3482 = new ServerPacket(67, 4);
		field3498 = new ServerPacket(68, 6);
		CAM_RESET = new ServerPacket(69, 0);
		CAM_MOVETO = new ServerPacket(70, 8);
		VARP_SMALL = new ServerPacket(71, 3);
		EVENT_WORLDHOP = new ServerPacket(72, -1);
		field3517 = new ServerPacket(73, 0);
		MIDI_SONG = new ServerPacket(74, 2);
		field3456 = new ServerPacket(75, 3);
		field3465 = new ServerPacket(76, 5);
		MINIMAP_TOGGLE = new ServerPacket(77, 1);
		SET_PLAYER_OP = new ServerPacket(78, -1);
		field3449 = new ServerPacket(79, 0);
		field3461 = new ServerPacket(80, 4);
		field3462 = new ServerPacket(81, 7);
		field3388 = new ServerPacket(82, 8);
		IF_SETPLAYERHEAD = new ServerPacket(83, 4);
		URL_OPEN = new ServerPacket(84, -2);
		UPDATE_INV_CLEAR = new ServerPacket(85, 4);
		UPDATE_INV_PARTIAL = new ServerPacket(86, -2);
		field3387 = new ServerPacket(87, -2);
		field3469 = new ServerPacket(88, 6);
		field3470 = new ServerPacket(89, 0);
		UPDATE_IGNORELIST = new ServerPacket(90, -2);
		MINIMAP_FLAG_SET = new ServerPacket(91, 2);
		field3473 = new ServerPacket(92, 6);
		field3474 = new ServerPacket(93, -2);
		NPC_INFO_LARGE_VIEWPORT_2 = new ServerPacket(94, -2);
		field3476 = new ServerPacket(95, -2);
		NPC_INFO_SMALL_VIEWPORT_1 = new ServerPacket(96, -2);
		IF_SETSCROLLPOS = new ServerPacket(97, 6);
		MESSAGE_GAME = new ServerPacket(98, -1);
		field3480 = new ServerPacket(99, 5);
		field3481 = new ServerPacket(100, 0);
		RESET_CLIENT_VARCACHE = new ServerPacket(101, 0);
		field3501 = new ServerPacket(102, 7);
		field3484 = new ServerPacket(103, 2);
		REFLECTION_CHECKER = new ServerPacket(104, -2);
		RUNCLIENTSCRIPT = new ServerPacket(105, -2);
		field3383 = new ServerPacket(106, 8);
		field3438 = new ServerPacket(107, 7);
		CAM_LOOKAT = new ServerPacket(108, 7);
		HINT_ARROW = new ServerPacket(109, 6);
		field3491 = new ServerPacket(110, 6);
		field3492 = new ServerPacket(111, 7);
		field3493 = new ServerPacket(112, -1);
		SET_PRIVCHATMODE = new ServerPacket(113, 1);
		CHAT_FILTER_SETTINGS = new ServerPacket(114, 2);
		NPC_SPOTANIM = new ServerPacket(115, 9);
		field3497 = new ServerPacket(116, -2);
		UPDATE_INV_STOP_TRANSIT = new ServerPacket(117, 2);
		field3505 = new ServerPacket(118, 10);
		field3500 = new ServerPacket(119, -2);
		field3488 = new ServerPacket(120, 12);
		IF_SETNPCHEAD = new ServerPacket(121, 6);
		PROJECTILE_SPAWN = new ServerPacket(122, 19);
		IF_SETCOLOUR = new ServerPacket(123, 6);
		field3471 = new ServerPacket(124, 4);
		field3464 = new ServerPacket(125, 5);
		LOGOUT_FULL = new ServerPacket(126, 0);
		field3508 = new ServerPacket(127, -2);
		field3509 = new ServerPacket(128, -2);
		field3410 = new ServerPacket(129, 1);
		field3516 = new ServerPacket(130, -1);
		field3512 = new ServerPacket(131, 1);
		field3513 = new ServerPacket(132, 1);
		field3514 = new ServerPacket(133, 0);
		field3515 = new ServerPacket(134, 4);
	}

	ServerPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}
}
