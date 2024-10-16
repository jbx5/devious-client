import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3496;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3537;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3438;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3439;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3440;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_REBOOT_TIMER;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3442;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3437;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket LOGOUT;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket REBUILD_REGION;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket CHAT_FILTER_SETTINGS;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3447;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket TRIGGER_ONDIALOG_ABORT;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3518;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3450;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket GRAPHICSOBJECT_SPAWN;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket RESET_CLIENT_VARCACHE;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3453;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket MESSAGE_PRIVATE_ECHO;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket SET_PLAYER_OP;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3485;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket MESSAGE_PRIVATE;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3487;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_INV_PARTIAL;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_CLOSESUB;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_INV_FULL;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3466;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3464;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3465;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3524;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3468;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3469;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3470;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3449;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_IGNORELIST;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3473;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3474;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket CAM_SETANGLE;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket CAM_MOVETO;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3477;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3478;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3558;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3480;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3481;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3482;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket MESSAGE_GAME;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket PROJECTILE_SPAWN_OLD;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3577;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket VARP_LARGE;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket SYNC_CLIENT_VARCACHE;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3488;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket DYNAMICOBJECT_SPAWN;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3490;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_STOCKMARKET_SLOT;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3492;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SETHIDE;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SETCOLOUR;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SETMODEL;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3497;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_UID192;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3498;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket PLAYER_INFO;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3475;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3501;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3513;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3503;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket LOGOUT_FULL;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3505;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_STAT;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_MOVESUB;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_INV_STOP_TRANSIT;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3509;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3510;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	static final ServerPacket field3511;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3512;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3455;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket REFLECTION_CHECKER;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SETPLAYERHEAD;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3516;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket NPC_SET_SEQUENCE;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket SET_PRIVCHATMODE;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket NPC_SPOTANIM;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3520;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3521;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3527;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3523;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3541;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3551;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3526;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SETSCROLLPOS;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	static final ServerPacket field3528;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3529;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3530;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket HINT_ARROW;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket MINIMAP_TOGGLE;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket RUNCLIENTSCRIPT;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket MESSAGE_FRIENDS_CHAT;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket URL_OPEN;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3536;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket VARP_SMALL;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3538;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket EVENT_WORLDHOP;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3540;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3463;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_INV_CLEAR;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3506;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket CAM_LOOKAT;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket REBUILD_NORMAL;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3546;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3547;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket MINIMAP_FLAG_SET;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3479;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SETOBJECT;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SETNPCHEAD;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket PLAYER_SPOTANIM;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SETPOSITION;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket PING_STATISTICS_REQUEST;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3555;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3436;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket CAM_RESET;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_FRIENDLIST;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3559;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SETANGLE;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3561;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3562;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3504;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3564;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3574;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3566;
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3567;
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3568;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3569;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3570;
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket PROJECTILE_SPAWN;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3572;
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3573;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3563;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3539;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3576;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3458;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3578;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3579;
	@ObfuscatedName("fb")
	@ObfuscatedGetter(
		intValue = 1898944799
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("fr")
	@ObfuscatedGetter(
		intValue = 402120897
	)
	@Export("length")
	public final int length;

	static {
		field3496 = new ServerPacket(0, 1);
		field3537 = new ServerPacket(1, -2);
		field3438 = new ServerPacket(2, 17);
		field3439 = new ServerPacket(3, 6);
		field3440 = new ServerPacket(4, 10);
		UPDATE_REBOOT_TIMER = new ServerPacket(5, 2);
		field3442 = new ServerPacket(6, 10);
		field3437 = new ServerPacket(7, 3);
		LOGOUT = new ServerPacket(8, 1);
		REBUILD_REGION = new ServerPacket(9, -2);
		CHAT_FILTER_SETTINGS = new ServerPacket(10, 2);
		field3447 = new ServerPacket(11, 3);
		TRIGGER_ONDIALOG_ABORT = new ServerPacket(12, 0);
		field3518 = new ServerPacket(13, -1);
		field3450 = new ServerPacket(14, 2);
		GRAPHICSOBJECT_SPAWN = new ServerPacket(15, 8);
		RESET_CLIENT_VARCACHE = new ServerPacket(16, 0);
		field3453 = new ServerPacket(17, 4);
		MESSAGE_PRIVATE_ECHO = new ServerPacket(18, -2);
		SET_PLAYER_OP = new ServerPacket(19, -1);
		field3485 = new ServerPacket(20, 6);
		MESSAGE_PRIVATE = new ServerPacket(21, -1);
		field3487 = new ServerPacket(22, 7);
		UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(23, 3);
		UPDATE_INV_PARTIAL = new ServerPacket(24, -2);
		IF_CLOSESUB = new ServerPacket(25, 4);
		UPDATE_INV_FULL = new ServerPacket(26, -2);
		field3466 = new ServerPacket(27, -2);
		field3464 = new ServerPacket(28, 4);
		field3465 = new ServerPacket(29, 7);
		field3524 = new ServerPacket(30, -2);
		UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(31, -2);
		field3468 = new ServerPacket(32, 2);
		field3469 = new ServerPacket(33, 5);
		field3470 = new ServerPacket(34, 5);
		field3449 = new ServerPacket(35, 5);
		UPDATE_IGNORELIST = new ServerPacket(36, -2);
		field3473 = new ServerPacket(37, 14);
		field3474 = new ServerPacket(38, 1);
		CAM_SETANGLE = new ServerPacket(39, 6);
		CAM_MOVETO = new ServerPacket(40, 8);
		field3477 = new ServerPacket(41, 0);
		field3478 = new ServerPacket(42, 6);
		field3558 = new ServerPacket(43, 7);
		field3480 = new ServerPacket(44, 5);
		field3481 = new ServerPacket(45, 4);
		field3482 = new ServerPacket(46, 14);
		MESSAGE_GAME = new ServerPacket(47, -1);
		PROJECTILE_SPAWN_OLD = new ServerPacket(48, 19);
		field3577 = new ServerPacket(49, -2);
		VARP_LARGE = new ServerPacket(50, 6);
		SYNC_CLIENT_VARCACHE = new ServerPacket(51, 0);
		field3488 = new ServerPacket(52, 17);
		DYNAMICOBJECT_SPAWN = new ServerPacket(53, 6);
		field3490 = new ServerPacket(54, -1);
		UPDATE_STOCKMARKET_SLOT = new ServerPacket(55, 20);
		field3492 = new ServerPacket(56, 5);
		IF_SETHIDE = new ServerPacket(57, 5);
		IF_SETCOLOUR = new ServerPacket(58, 6);
		IF_SETMODEL = new ServerPacket(59, 6);
		field3497 = new ServerPacket(60, 4);
		UPDATE_UID192 = new ServerPacket(61, 28);
		field3498 = new ServerPacket(62, 0);
		PLAYER_INFO = new ServerPacket(63, -2);
		field3475 = new ServerPacket(64, 7);
		field3501 = new ServerPacket(65, -2);
		field3513 = new ServerPacket(66, 12);
		field3503 = new ServerPacket(67, 8);
		LOGOUT_FULL = new ServerPacket(68, 0);
		field3505 = new ServerPacket(69, 0);
		UPDATE_STAT = new ServerPacket(70, 7);
		IF_MOVESUB = new ServerPacket(71, 8);
		UPDATE_INV_STOP_TRANSIT = new ServerPacket(72, 2);
		field3509 = new ServerPacket(73, 5);
		field3510 = new ServerPacket(74, 2);
		field3511 = new ServerPacket(75, -2);
		field3512 = new ServerPacket(76, 4);
		field3455 = new ServerPacket(77, -2);
		REFLECTION_CHECKER = new ServerPacket(78, -2);
		IF_SETPLAYERHEAD = new ServerPacket(79, 4);
		field3516 = new ServerPacket(80, 4);
		NPC_SET_SEQUENCE = new ServerPacket(81, 5);
		SET_PRIVCHATMODE = new ServerPacket(82, 1);
		NPC_SPOTANIM = new ServerPacket(83, 9);
		field3520 = new ServerPacket(84, 2);
		field3521 = new ServerPacket(85, 0);
		field3527 = new ServerPacket(86, -1);
		field3523 = new ServerPacket(87, -2);
		field3541 = new ServerPacket(88, -1);
		field3551 = new ServerPacket(89, 6);
		field3526 = new ServerPacket(90, -2);
		IF_SETSCROLLPOS = new ServerPacket(91, 6);
		field3528 = new ServerPacket(92, 7);
		field3529 = new ServerPacket(93, -2);
		field3530 = new ServerPacket(94, 8);
		HINT_ARROW = new ServerPacket(95, 6);
		MINIMAP_TOGGLE = new ServerPacket(96, 1);
		RUNCLIENTSCRIPT = new ServerPacket(97, -2);
		MESSAGE_FRIENDS_CHAT = new ServerPacket(98, -1);
		URL_OPEN = new ServerPacket(99, -2);
		field3536 = new ServerPacket(100, 11);
		VARP_SMALL = new ServerPacket(101, 3);
		field3538 = new ServerPacket(102, 0);
		EVENT_WORLDHOP = new ServerPacket(103, -1);
		field3540 = new ServerPacket(104, 6);
		field3463 = new ServerPacket(105, -2);
		UPDATE_INV_CLEAR = new ServerPacket(106, 4);
		field3506 = new ServerPacket(107, 6);
		CAM_LOOKAT = new ServerPacket(108, 7);
		REBUILD_NORMAL = new ServerPacket(109, -2);
		field3546 = new ServerPacket(110, 2);
		field3547 = new ServerPacket(111, 9);
		MINIMAP_FLAG_SET = new ServerPacket(112, 2);
		field3479 = new ServerPacket(113, 8);
		IF_SETOBJECT = new ServerPacket(114, 10);
		IF_SETNPCHEAD = new ServerPacket(115, 6);
		PLAYER_SPOTANIM = new ServerPacket(116, 9);
		IF_SETPOSITION = new ServerPacket(117, 8);
		PING_STATISTICS_REQUEST = new ServerPacket(118, 8);
		field3555 = new ServerPacket(119, -2);
		field3436 = new ServerPacket(120, 12);
		CAM_RESET = new ServerPacket(121, 0);
		UPDATE_FRIENDLIST = new ServerPacket(122, -2);
		field3559 = new ServerPacket(123, 20);
		IF_SETANGLE = new ServerPacket(124, 10);
		field3561 = new ServerPacket(125, 7);
		field3562 = new ServerPacket(126, 3);
		field3504 = new ServerPacket(127, -2);
		field3564 = new ServerPacket(128, 2);
		field3574 = new ServerPacket(129, 2);
		field3566 = new ServerPacket(130, -2);
		field3567 = new ServerPacket(131, 4);
		field3568 = new ServerPacket(132, 0);
		field3569 = new ServerPacket(133, 1);
		field3570 = new ServerPacket(134, -2);
		PROJECTILE_SPAWN = new ServerPacket(135, 22);
		field3572 = new ServerPacket(136, -1);
		field3573 = new ServerPacket(137, 4);
		field3563 = new ServerPacket(138, 1);
		field3539 = new ServerPacket(139, -2);
		field3576 = new ServerPacket(140, -2);
		field3458 = new ServerPacket(141, 1);
		field3578 = new ServerPacket(142, -2);
		field3579 = new ServerPacket(143, -2);
	}

	ServerPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}
}
