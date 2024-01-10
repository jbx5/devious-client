import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket RUNCLIENTSCRIPT;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket UPDATE_FRIENDLIST;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket VARP_LARGE;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket VARP_SMALL;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3289;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket UPDATE_INV_PARTIAL;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3291;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket MIDI_SONG;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket REBUILD_REGION;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3295;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3297;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3298;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3299;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket CAM_RESET;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket MINIMAP_FLAG_SET;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3302;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3303;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3304;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket UPDATE_INV_STOP_TRANSIT;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket MESSAGE_PRIVATE_ECHO;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3346;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3308;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket CAM_LOOKAT;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3310;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3316;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3312;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3285;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket NPC_SET_SEQUENCE;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket IF_SETPLAYERHEAD;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket UPDATE_STAT;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3394;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3318;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3319;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket MINIMAP_TOGGLE;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket LOGOUT_FULL;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket CAM_SETANGLE;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3392;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket UPDATE_INV_CLEAR;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3311;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3326;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket IF_CLOSESUB;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3328;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket URL_OPEN;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3335;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3331;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3332;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3382;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3334;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket IF_SETMODEL;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket GRAPHICSOBJECT_SPAWN;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3337;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket PLAYER_SPOTANIM;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket EVENT_WORLDHOP;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3340;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3341;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3342;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3387;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket UPDATE_STOCKMARKET_SLOT;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3344;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket IF_SETPOSITION;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3347;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3348;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket NPC_INFO_SMALL_VIEWPORT_1;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3404;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	static final ServerPacket field3351;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket IF_SETHIDE;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket PING_STATISTICS_REQUEST;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3354;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket IF_SETCOLOUR;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3323;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3357;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3338;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket IF_MOVESUB;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket TRIGGER_ONDIALOG_ABORT;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket IF_SETANGLE;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket REFLECTION_CHECKER;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket UPDATE_UID192;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket PROJECTILE_SPAWN;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3365;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket DYNAMICOBJECT_SPAWN;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3367;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3381;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket REBUILD_NORMAL;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3370;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3371;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3343;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket IF_SETNPCHEAD;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3374;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3339;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket UPDATE_INV_FULL;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3377;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3397;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket MESSAGE_GAME;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3380;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket CHAT_FILTER_SETTINGS;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3327;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3383;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket SET_PLAYER_OP;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3385;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket PLAYER_INFO;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket IF_SETOBJECT;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket NPC_INFO_LARGE_VIEWPORT_2;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket UPDATE_REBOOT_TIMER;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3390;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket NPC_SPOTANIM;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3363;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket LOGOUT;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3356;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket RESET_CLIENT_VARCACHE;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3396;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket MESSAGE_PRIVATE;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket SYNC_CLIENT_VARCACHE;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3399;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket MESSAGE_FRIENDS_CHAT;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket IF_SETSCROLLPOS;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3402;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket SET_PRIVCHATMODE;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3375;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3321;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3389;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3345;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket UPDATE_IGNORELIST;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3409;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket HINT_ARROW;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final ServerPacket field3411;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = 1701659203
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = 208470751
	)
	@Export("length")
	public final int length;

	static {
		RUNCLIENTSCRIPT = new ServerPacket(0, -2);
		UPDATE_FRIENDLIST = new ServerPacket(1, -2);
		VARP_LARGE = new ServerPacket(2, 6);
		VARP_SMALL = new ServerPacket(3, 3);
		field3289 = new ServerPacket(4, 8);
		UPDATE_INV_PARTIAL = new ServerPacket(5, -2);
		field3291 = new ServerPacket(6, 20);
		MIDI_SONG = new ServerPacket(7, 2);
		REBUILD_REGION = new ServerPacket(8, -2);
		UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(9, -2);
		field3295 = new ServerPacket(10, -2);
		UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(11, 2);
		field3297 = new ServerPacket(12, 12);
		field3298 = new ServerPacket(13, 2);
		field3299 = new ServerPacket(14, -1);
		CAM_RESET = new ServerPacket(15, 0);
		MINIMAP_FLAG_SET = new ServerPacket(16, 2);
		field3302 = new ServerPacket(17, 3);
		field3303 = new ServerPacket(18, 8);
		field3304 = new ServerPacket(19, 4);
		UPDATE_INV_STOP_TRANSIT = new ServerPacket(20, 2);
		MESSAGE_PRIVATE_ECHO = new ServerPacket(21, -2);
		field3346 = new ServerPacket(22, -1);
		field3308 = new ServerPacket(23, 1);
		CAM_LOOKAT = new ServerPacket(24, 7);
		field3310 = new ServerPacket(25, 4);
		field3316 = new ServerPacket(26, -1);
		field3312 = new ServerPacket(27, 19);
		field3285 = new ServerPacket(28, 8);
		NPC_SET_SEQUENCE = new ServerPacket(29, 5);
		IF_SETPLAYERHEAD = new ServerPacket(30, 4);
		UPDATE_STAT = new ServerPacket(31, 6);
		field3394 = new ServerPacket(32, 10);
		field3318 = new ServerPacket(33, 5);
		field3319 = new ServerPacket(34, 2);
		MINIMAP_TOGGLE = new ServerPacket(35, 1);
		LOGOUT_FULL = new ServerPacket(36, 0);
		CAM_SETANGLE = new ServerPacket(37, 6);
		field3392 = new ServerPacket(38, 2);
		UPDATE_INV_CLEAR = new ServerPacket(39, 4);
		field3311 = new ServerPacket(40, 6);
		field3326 = new ServerPacket(41, 5);
		IF_CLOSESUB = new ServerPacket(42, 4);
		field3328 = new ServerPacket(43, 0);
		URL_OPEN = new ServerPacket(44, -2);
		field3335 = new ServerPacket(45, -2);
		field3331 = new ServerPacket(46, 6);
		field3332 = new ServerPacket(47, -2);
		field3382 = new ServerPacket(48, -2);
		field3334 = new ServerPacket(49, 14);
		IF_SETMODEL = new ServerPacket(50, 6);
		GRAPHICSOBJECT_SPAWN = new ServerPacket(51, 8);
		field3337 = new ServerPacket(52, 3);
		PLAYER_SPOTANIM = new ServerPacket(53, 9);
		EVENT_WORLDHOP = new ServerPacket(54, -1);
		field3340 = new ServerPacket(55, 5);
		field3341 = new ServerPacket(56, 7);
		field3342 = new ServerPacket(57, 7);
		field3387 = new ServerPacket(58, 2);
		UPDATE_STOCKMARKET_SLOT = new ServerPacket(59, 20);
		field3344 = new ServerPacket(60, 0);
		IF_SETPOSITION = new ServerPacket(61, 8);
		field3347 = new ServerPacket(62, -2);
		field3348 = new ServerPacket(63, 11);
		NPC_INFO_SMALL_VIEWPORT_1 = new ServerPacket(64, -2);
		field3404 = new ServerPacket(65, 4);
		field3351 = new ServerPacket(66, -2);
		IF_SETHIDE = new ServerPacket(67, 5);
		PING_STATISTICS_REQUEST = new ServerPacket(68, 8);
		field3354 = new ServerPacket(69, -2);
		IF_SETCOLOUR = new ServerPacket(70, 6);
		field3323 = new ServerPacket(71, 9);
		field3357 = new ServerPacket(72, 4);
		field3338 = new ServerPacket(73, 1);
		IF_MOVESUB = new ServerPacket(74, 8);
		TRIGGER_ONDIALOG_ABORT = new ServerPacket(75, 0);
		IF_SETANGLE = new ServerPacket(76, 10);
		REFLECTION_CHECKER = new ServerPacket(77, -2);
		UPDATE_UID192 = new ServerPacket(78, 28);
		PROJECTILE_SPAWN = new ServerPacket(79, 17);
		field3365 = new ServerPacket(80, -2);
		DYNAMICOBJECT_SPAWN = new ServerPacket(81, 6);
		field3367 = new ServerPacket(82, -1);
		field3381 = new ServerPacket(83, 5);
		REBUILD_NORMAL = new ServerPacket(84, -2);
		field3370 = new ServerPacket(85, 6);
		field3371 = new ServerPacket(86, 5);
		field3343 = new ServerPacket(87, 8);
		IF_SETNPCHEAD = new ServerPacket(88, 6);
		field3374 = new ServerPacket(89, 6);
		field3339 = new ServerPacket(90, 2);
		UPDATE_INV_FULL = new ServerPacket(91, -2);
		field3377 = new ServerPacket(92, 4);
		field3397 = new ServerPacket(93, -2);
		MESSAGE_GAME = new ServerPacket(94, -1);
		field3380 = new ServerPacket(95, -2);
		CHAT_FILTER_SETTINGS = new ServerPacket(96, 2);
		field3327 = new ServerPacket(97, -2);
		field3383 = new ServerPacket(98, -1);
		SET_PLAYER_OP = new ServerPacket(99, -1);
		field3385 = new ServerPacket(100, 0);
		PLAYER_INFO = new ServerPacket(101, -2);
		IF_SETOBJECT = new ServerPacket(102, 10);
		NPC_INFO_LARGE_VIEWPORT_2 = new ServerPacket(103, -2);
		UPDATE_REBOOT_TIMER = new ServerPacket(104, 2);
		field3390 = new ServerPacket(105, 0);
		NPC_SPOTANIM = new ServerPacket(106, 9);
		field3363 = new ServerPacket(107, 5);
		LOGOUT = new ServerPacket(108, 1);
		field3356 = new ServerPacket(109, 0);
		RESET_CLIENT_VARCACHE = new ServerPacket(110, 0);
		field3396 = new ServerPacket(111, 12);
		MESSAGE_PRIVATE = new ServerPacket(112, -2);
		SYNC_CLIENT_VARCACHE = new ServerPacket(113, 0);
		field3399 = new ServerPacket(114, 7);
		MESSAGE_FRIENDS_CHAT = new ServerPacket(115, -1);
		IF_SETSCROLLPOS = new ServerPacket(116, 6);
		field3402 = new ServerPacket(117, 14);
		SET_PRIVCHATMODE = new ServerPacket(118, 1);
		field3375 = new ServerPacket(119, 7);
		field3321 = new ServerPacket(120, 3);
		field3389 = new ServerPacket(121, 10);
		field3345 = new ServerPacket(122, 6);
		UPDATE_IGNORELIST = new ServerPacket(123, -2);
		field3409 = new ServerPacket(124, 4);
		HINT_ARROW = new ServerPacket(125, 6);
		field3411 = new ServerPacket(126, 7);
	}

	ServerPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}
}
