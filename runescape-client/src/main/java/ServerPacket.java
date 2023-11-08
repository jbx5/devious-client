import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket NPC_INFO_SMALL_VIEWPORT_1;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3249;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket PLAYER_INFO;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket IF_SETSCROLLPOS;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket VARP_LARGE;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3370;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket IF_MOVESUB;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3358;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3256;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket IF_SETANGLE;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3258;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3259;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3260;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket RUNCLIENTSCRIPT;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket UPDATE_REBOOT_TIMER;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket NPC_SET_SEQUENCE;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3289;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket MESSAGE_FRIENDS_CHAT;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket CHAT_FILTER_SETTINGS;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket IF_SETPLAYERHEAD;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3268;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3269;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3270;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket CAM_LOOKAT;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket MESSAGE_PRIVATE_ECHO;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3349;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3274;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket VARP_SMALL;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3308;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket HINT_ARROW;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket SET_PRIVCHATMODE;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket UPDATE_STOCKMARKET_SLOT;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3280;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3298;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket IF_CLOSESUB;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3283;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3284;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3285;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket UPDATE_INV_FULL;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3373;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3288;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket IF_SETMODEL;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket MINIMAP_TOGGLE;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3291;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket CAM_RESET;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3261;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3294;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3295;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket IF_SETPOSITION;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket UPDATE_INV_PARTIAL;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3316;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket UPDATE_INV_CLEAR;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3300;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3301;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	static final ServerPacket field3302;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3303;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3304;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3305;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket UPDATE_STAT;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket SYNC_CLIENT_VARCACHE;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket MESSAGE_GAME;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket RESET_CLIENT_VARCACHE;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket LOGOUT;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket UPDATE_FRIENDLIST;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket PING_STATISTICS_REQUEST;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3313;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket IF_SETHIDE;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3321;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3287;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3317;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket CAM_SETANGLE;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3319;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket MESSAGE_PRIVATE;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3314;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3293;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3323;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket UPDATE_UID192;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3325;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket MIDI_SONG;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3251;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket PLAYER_SPOTANIM;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3330;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3328;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3332;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket PROJECTILE_SPAWN;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3335;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3336;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket NPC_SPOTANIM;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket UPDATE_INV_STOP_TRANSIT;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3339;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3340;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3341;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3342;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3343;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3344;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3271;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket EVENT_WORLDHOP;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket LOGOUT_FULL;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3296;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket GRAPHICSOBJECT_SPAWN;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket IF_SETOBJECT;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket TRIGGER_ONDIALOG_ABORT;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket SET_PLAYER_OP;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3299;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3250;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket NPC_INFO_LARGE_VIEWPORT_2;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket IF_SETNPCHEAD;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket UPDATE_IGNORELIST;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3353;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3359;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket URL_OPEN;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3297;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket DYNAMICOBJECT_SPAWN;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3248;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3364;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket REBUILD_NORMAL;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3366;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3367;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3306;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket REBUILD_REGION;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket IF_SETCOLOUR;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3371;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket MINIMAP_FLAG_SET;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket field3276;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public static final ServerPacket REFLECTION_CHECKER;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = 1979699673
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = -2127206281
	)
	@Export("length")
	public final int length;

	static {
		NPC_INFO_SMALL_VIEWPORT_1 = new ServerPacket(0, -2);
		field3249 = new ServerPacket(1, 6);
		PLAYER_INFO = new ServerPacket(2, -2);
		IF_SETSCROLLPOS = new ServerPacket(3, 6);
		VARP_LARGE = new ServerPacket(4, 6);
		field3370 = new ServerPacket(5, 20);
		IF_MOVESUB = new ServerPacket(6, 8);
		field3358 = new ServerPacket(7, 6);
		field3256 = new ServerPacket(8, 4);
		IF_SETANGLE = new ServerPacket(9, 10);
		field3258 = new ServerPacket(10, -2);
		field3259 = new ServerPacket(11, 9);
		field3260 = new ServerPacket(12, 2);
		RUNCLIENTSCRIPT = new ServerPacket(13, -2);
		UPDATE_REBOOT_TIMER = new ServerPacket(14, 2);
		NPC_SET_SEQUENCE = new ServerPacket(15, 5);
		field3289 = new ServerPacket(16, 1);
		MESSAGE_FRIENDS_CHAT = new ServerPacket(17, -1);
		CHAT_FILTER_SETTINGS = new ServerPacket(18, 2);
		IF_SETPLAYERHEAD = new ServerPacket(19, 4);
		field3268 = new ServerPacket(20, 8);
		field3269 = new ServerPacket(21, 3);
		field3270 = new ServerPacket(22, 19);
		CAM_LOOKAT = new ServerPacket(23, 10);
		MESSAGE_PRIVATE_ECHO = new ServerPacket(24, -2);
		field3349 = new ServerPacket(25, 5);
		field3274 = new ServerPacket(26, -2);
		VARP_SMALL = new ServerPacket(27, 3);
		field3308 = new ServerPacket(28, 6);
		HINT_ARROW = new ServerPacket(29, 6);
		SET_PRIVCHATMODE = new ServerPacket(30, 1);
		UPDATE_STOCKMARKET_SLOT = new ServerPacket(31, 20);
		field3280 = new ServerPacket(32, 0);
		field3298 = new ServerPacket(33, 6);
		IF_CLOSESUB = new ServerPacket(34, 4);
		field3283 = new ServerPacket(35, -1);
		field3284 = new ServerPacket(36, 5);
		field3285 = new ServerPacket(37, 7);
		UPDATE_INV_FULL = new ServerPacket(38, -2);
		field3373 = new ServerPacket(39, 14);
		field3288 = new ServerPacket(40, 4);
		IF_SETMODEL = new ServerPacket(41, 6);
		MINIMAP_TOGGLE = new ServerPacket(42, 1);
		field3291 = new ServerPacket(43, 14);
		CAM_RESET = new ServerPacket(44, 0);
		field3261 = new ServerPacket(45, 8);
		field3294 = new ServerPacket(46, 5);
		field3295 = new ServerPacket(47, 7);
		IF_SETPOSITION = new ServerPacket(48, 8);
		UPDATE_INV_PARTIAL = new ServerPacket(49, -2);
		field3316 = new ServerPacket(50, 8);
		UPDATE_INV_CLEAR = new ServerPacket(51, 4);
		field3300 = new ServerPacket(52, 4);
		field3301 = new ServerPacket(53, 5);
		field3302 = new ServerPacket(54, -2);
		field3303 = new ServerPacket(55, 7);
		field3304 = new ServerPacket(56, 0);
		field3305 = new ServerPacket(57, -2);
		UPDATE_STAT = new ServerPacket(58, 6);
		SYNC_CLIENT_VARCACHE = new ServerPacket(59, 0);
		MESSAGE_GAME = new ServerPacket(60, -1);
		RESET_CLIENT_VARCACHE = new ServerPacket(61, 0);
		LOGOUT = new ServerPacket(62, 1);
		UPDATE_FRIENDLIST = new ServerPacket(63, -2);
		PING_STATISTICS_REQUEST = new ServerPacket(64, 8);
		field3313 = new ServerPacket(65, -2);
		IF_SETHIDE = new ServerPacket(66, 5);
		field3321 = new ServerPacket(67, 4);
		field3287 = new ServerPacket(68, 12);
		field3317 = new ServerPacket(69, 7);
		CAM_SETANGLE = new ServerPacket(70, 6);
		field3319 = new ServerPacket(71, -1);
		MESSAGE_PRIVATE = new ServerPacket(72, -2);
		field3314 = new ServerPacket(73, -1);
		field3293 = new ServerPacket(74, -2);
		field3323 = new ServerPacket(75, 4);
		UPDATE_UID192 = new ServerPacket(76, 28);
		field3325 = new ServerPacket(77, 19);
		UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(78, 2);
		MIDI_SONG = new ServerPacket(79, 2);
		field3251 = new ServerPacket(80, -2);
		PLAYER_SPOTANIM = new ServerPacket(81, 9);
		field3330 = new ServerPacket(82, 5);
		field3328 = new ServerPacket(83, -2);
		field3332 = new ServerPacket(84, -2);
		PROJECTILE_SPAWN = new ServerPacket(85, 17);
		UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(86, -2);
		field3335 = new ServerPacket(87, 2);
		field3336 = new ServerPacket(88, 0);
		NPC_SPOTANIM = new ServerPacket(89, 9);
		UPDATE_INV_STOP_TRANSIT = new ServerPacket(90, 2);
		field3339 = new ServerPacket(91, 0);
		field3340 = new ServerPacket(92, 16);
		field3341 = new ServerPacket(93, -2);
		field3342 = new ServerPacket(94, 11);
		field3343 = new ServerPacket(95, 4);
		field3344 = new ServerPacket(96, 6);
		field3271 = new ServerPacket(97, 5);
		EVENT_WORLDHOP = new ServerPacket(98, -1);
		LOGOUT_FULL = new ServerPacket(99, 0);
		field3296 = new ServerPacket(100, 1);
		GRAPHICSOBJECT_SPAWN = new ServerPacket(101, 8);
		IF_SETOBJECT = new ServerPacket(102, 10);
		TRIGGER_ONDIALOG_ABORT = new ServerPacket(103, 0);
		SET_PLAYER_OP = new ServerPacket(104, -1);
		field3299 = new ServerPacket(105, -1);
		field3250 = new ServerPacket(106, 7);
		NPC_INFO_LARGE_VIEWPORT_2 = new ServerPacket(107, -2);
		IF_SETNPCHEAD = new ServerPacket(108, 6);
		UPDATE_IGNORELIST = new ServerPacket(109, -2);
		field3353 = new ServerPacket(110, -1);
		field3359 = new ServerPacket(111, 12);
		URL_OPEN = new ServerPacket(112, -2);
		field3297 = new ServerPacket(113, 10);
		DYNAMICOBJECT_SPAWN = new ServerPacket(114, 6);
		field3248 = new ServerPacket(115, 2);
		field3364 = new ServerPacket(116, 0);
		REBUILD_NORMAL = new ServerPacket(117, -2);
		field3366 = new ServerPacket(118, 2);
		field3367 = new ServerPacket(119, 2);
		field3306 = new ServerPacket(120, 8);
		REBUILD_REGION = new ServerPacket(121, -2);
		IF_SETCOLOUR = new ServerPacket(122, 6);
		field3371 = new ServerPacket(123, -2);
		MINIMAP_FLAG_SET = new ServerPacket(124, 2);
		field3276 = new ServerPacket(125, 7);
		REFLECTION_CHECKER = new ServerPacket(126, -2);
	}

	ServerPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "128950429"
	)
	static void method5933(int var0) {
		class462.field4771 = var0;
		class462.field4770 = new class462[var0];
		DirectByteArrayCopier.field3822 = 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "-2070270076"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		synchronized(ByteArrayPool.field4577) {
			byte[] var3;
			if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool.ByteArrayPool_smallCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_small[--ByteArrayPool.ByteArrayPool_smallCount];
				ByteArrayPool.ByteArrayPool_small[ByteArrayPool.ByteArrayPool_smallCount] = null;
				return var3;
			}

			if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool.ByteArrayPool_mediumCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_medium[--ByteArrayPool.ByteArrayPool_mediumCount];
				ByteArrayPool.ByteArrayPool_medium[ByteArrayPool.ByteArrayPool_mediumCount] = null;
				return var3;
			}

			if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool.ByteArrayPool_largeCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_large[--ByteArrayPool.ByteArrayPool_largeCount];
				ByteArrayPool.ByteArrayPool_large[ByteArrayPool.ByteArrayPool_largeCount] = null;
				return var3;
			}

			if ((var0 == 30000 || var0 < 30000 && var1) && ByteArrayPool.field4573 > 0) {
				var3 = ByteArrayPool.field4589[--ByteArrayPool.field4573];
				ByteArrayPool.field4589[ByteArrayPool.field4573] = null;
				return var3;
			}

			int var6;
			if (class1.ByteArrayPool_arrays != null) {
				for (var6 = 0; var6 < Clock.ByteArrayPool_alternativeSizes.length; ++var6) {
					if ((Clock.ByteArrayPool_alternativeSizes[var6] == var0 || var0 < Clock.ByteArrayPool_alternativeSizes[var6] && var1) && class267.ByteArrayPool_altSizeArrayCounts[var6] > 0) {
						byte[] var4 = class1.ByteArrayPool_arrays[var6][--class267.ByteArrayPool_altSizeArrayCounts[var6]];
						class1.ByteArrayPool_arrays[var6][class267.ByteArrayPool_altSizeArrayCounts[var6]] = null;
						return var4;
					}
				}
			}

			if (var1 && Clock.ByteArrayPool_alternativeSizes != null) {
				for (var6 = 0; var6 < Clock.ByteArrayPool_alternativeSizes.length; ++var6) {
					if (var0 <= Clock.ByteArrayPool_alternativeSizes[var6] && class267.ByteArrayPool_altSizeArrayCounts[var6] < class1.ByteArrayPool_arrays[var6].length) {
						return new byte[Clock.ByteArrayPool_alternativeSizes[var6]];
					}
				}
			}
		}

		return new byte[var0];
	}
}
