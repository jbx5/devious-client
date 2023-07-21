import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket NPC_SET_SEQUENCE;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3216;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket UPDATE_STOCKMARKET_SLOT;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket PING_STATISTICS_REQUEST;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket UPDATE_REBOOT_TIMER;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3305;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3221;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket SET_PLAYER_OP;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket VARP_LARGE;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket IF_SETOBJECT;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket URL_OPEN;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket IF_MOVESUB;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3235;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3228;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3229;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3230;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3231;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3217;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket UPDATE_INV_STOP_TRANSIT;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket MESSAGE_PRIVATE_ECHO;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket RUNCLIENTSCRIPT;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3314;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket PROJECTILE_SPAWN;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3312;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3239;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3331;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket IF_SETNPCHEAD;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket IF_CLOSESUB;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket UPDATE_STAT;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket UPDATE_IGNORELIST;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket IF_SETCOLOUR;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3250;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket NPC_SPOTANIM;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3248;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3249;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3335;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3251;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3252;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket GRAPHICSOBJECT_SPAWN;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket VARP_SMALL;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket CHAT_FILTER_SETTINGS;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3219;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3257;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3258;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3259;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3260;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3277;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket HINT_ARROW;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket EVENT_WORLDHOP;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3246;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket IF_SETANGLE;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3296;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket MESSAGE_PRIVATE;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket IF_SETSCROLLPOS;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket REBUILD_REGION;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket DYNAMICOBJECT_SPAWN;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket MESSAGE_GAME;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket UPDATE_INV_PARTIAL;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3273;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3274;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket IF_SETMODEL;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket UPDATE_UID192;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket SYNC_CLIENT_VARCACHE;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3291;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket CAM_SETANGLE;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket MINIMAP_FLAG_SET;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket MINIMAP_TOGGLE;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket UPDATE_FRIENDLIST;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket TRIGGER_ONDIALOG_ABORT;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3284;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket PLAYER_SPOTANIM;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3286;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket IF_SETPOSITION;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket UPDATE_INV_FULL;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket RESET_CLIENT_VARCACHE;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3290;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket NPC_INFO_LARGE_VIEWPORT_2;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket MESSAGE_FRIENDS_CHAT;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket SET_PRIVCHATMODE;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket PLAYER_INFO;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3232;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3223;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3297;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3298;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3322;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket REFLECTION_CHECKER;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3280;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3302;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3299;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket MIDI_SONG;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket IF_SETHIDE;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3306;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3224;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3308;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket UPDATE_INV_CLEAR;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3311;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket CAM_RESET;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3313;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket REBUILD_NORMAL;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket LOGOUT;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket LOGOUT_FULL;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3318;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3319;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3303;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3321;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	static final ServerPacket field3247;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket CAM_LOOKAT;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3324;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3325;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket IF_SETPLAYERHEAD;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3327;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3328;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3329;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket NPC_INFO_SMALL_VIEWPORT_1;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3332;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3270;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3220;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3334;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3301;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final ServerPacket field3336;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = -1448898935
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = -466140897
	)
	@Export("length")
	public final int length;

	static {
		NPC_SET_SEQUENCE = new ServerPacket(0, 5);
		field3216 = new ServerPacket(1, 5);
		UPDATE_STOCKMARKET_SLOT = new ServerPacket(2, 20);
		PING_STATISTICS_REQUEST = new ServerPacket(3, 8);
		UPDATE_REBOOT_TIMER = new ServerPacket(4, 2);
		field3305 = new ServerPacket(5, 12);
		field3221 = new ServerPacket(6, 4);
		SET_PLAYER_OP = new ServerPacket(7, -1);
		VARP_LARGE = new ServerPacket(8, 6);
		IF_SETOBJECT = new ServerPacket(9, 10);
		URL_OPEN = new ServerPacket(10, -2);
		IF_MOVESUB = new ServerPacket(11, 8);
		field3235 = new ServerPacket(12, 7);
		field3228 = new ServerPacket(13, 10);
		field3229 = new ServerPacket(14, -2);
		field3230 = new ServerPacket(15, -1);
		field3231 = new ServerPacket(16, 16);
		field3217 = new ServerPacket(17, -2);
		UPDATE_INV_STOP_TRANSIT = new ServerPacket(18, 2);
		MESSAGE_PRIVATE_ECHO = new ServerPacket(19, -2);
		RUNCLIENTSCRIPT = new ServerPacket(20, -2);
		field3314 = new ServerPacket(21, 0);
		PROJECTILE_SPAWN = new ServerPacket(22, 17);
		field3312 = new ServerPacket(23, 2);
		field3239 = new ServerPacket(24, 4);
		field3331 = new ServerPacket(25, -1);
		IF_SETNPCHEAD = new ServerPacket(26, 6);
		IF_CLOSESUB = new ServerPacket(27, 4);
		UPDATE_STAT = new ServerPacket(28, 6);
		UPDATE_IGNORELIST = new ServerPacket(29, -2);
		IF_SETCOLOUR = new ServerPacket(30, 6);
		field3250 = new ServerPacket(31, 6);
		NPC_SPOTANIM = new ServerPacket(32, 9);
		field3248 = new ServerPacket(33, 1);
		field3249 = new ServerPacket(34, 5);
		field3335 = new ServerPacket(35, 3);
		field3251 = new ServerPacket(36, 14);
		field3252 = new ServerPacket(37, -2);
		GRAPHICSOBJECT_SPAWN = new ServerPacket(38, 8);
		VARP_SMALL = new ServerPacket(39, 3);
		CHAT_FILTER_SETTINGS = new ServerPacket(40, 2);
		field3219 = new ServerPacket(41, 2);
		field3257 = new ServerPacket(42, 2);
		field3258 = new ServerPacket(43, 0);
		field3259 = new ServerPacket(44, 5);
		field3260 = new ServerPacket(45, 5);
		field3277 = new ServerPacket(46, 8);
		HINT_ARROW = new ServerPacket(47, 6);
		EVENT_WORLDHOP = new ServerPacket(48, -1);
		field3246 = new ServerPacket(49, 6);
		IF_SETANGLE = new ServerPacket(50, 10);
		field3296 = new ServerPacket(51, 9);
		MESSAGE_PRIVATE = new ServerPacket(52, -2);
		IF_SETSCROLLPOS = new ServerPacket(53, 6);
		REBUILD_REGION = new ServerPacket(54, -2);
		DYNAMICOBJECT_SPAWN = new ServerPacket(55, 6);
		MESSAGE_GAME = new ServerPacket(56, -1);
		UPDATE_INV_PARTIAL = new ServerPacket(57, -2);
		field3273 = new ServerPacket(58, 6);
		field3274 = new ServerPacket(59, 7);
		IF_SETMODEL = new ServerPacket(60, 6);
		UPDATE_UID192 = new ServerPacket(61, 28);
		SYNC_CLIENT_VARCACHE = new ServerPacket(62, 0);
		field3291 = new ServerPacket(63, -2);
		CAM_SETANGLE = new ServerPacket(64, 6);
		MINIMAP_FLAG_SET = new ServerPacket(65, 2);
		MINIMAP_TOGGLE = new ServerPacket(66, 1);
		UPDATE_FRIENDLIST = new ServerPacket(67, -2);
		TRIGGER_ONDIALOG_ABORT = new ServerPacket(68, 0);
		field3284 = new ServerPacket(69, 8);
		PLAYER_SPOTANIM = new ServerPacket(70, 9);
		field3286 = new ServerPacket(71, 11);
		IF_SETPOSITION = new ServerPacket(72, 8);
		UPDATE_INV_FULL = new ServerPacket(73, -2);
		RESET_CLIENT_VARCACHE = new ServerPacket(74, 0);
		field3290 = new ServerPacket(75, 0);
		NPC_INFO_LARGE_VIEWPORT_2 = new ServerPacket(76, -2);
		MESSAGE_FRIENDS_CHAT = new ServerPacket(77, -1);
		SET_PRIVCHATMODE = new ServerPacket(78, 1);
		PLAYER_INFO = new ServerPacket(79, -2);
		field3232 = new ServerPacket(80, 5);
		field3223 = new ServerPacket(81, 4);
		field3297 = new ServerPacket(82, 8);
		field3298 = new ServerPacket(83, -1);
		field3322 = new ServerPacket(84, 2);
		REFLECTION_CHECKER = new ServerPacket(85, -2);
		field3280 = new ServerPacket(86, 0);
		field3302 = new ServerPacket(87, 1);
		field3299 = new ServerPacket(88, -2);
		MIDI_SONG = new ServerPacket(89, 2);
		IF_SETHIDE = new ServerPacket(90, 5);
		field3306 = new ServerPacket(91, -1);
		field3224 = new ServerPacket(92, 4);
		field3308 = new ServerPacket(93, -2);
		UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(94, 2);
		UPDATE_INV_CLEAR = new ServerPacket(95, 4);
		field3311 = new ServerPacket(96, -2);
		CAM_RESET = new ServerPacket(97, 0);
		field3313 = new ServerPacket(98, 0);
		REBUILD_NORMAL = new ServerPacket(99, -2);
		LOGOUT = new ServerPacket(100, 1);
		LOGOUT_FULL = new ServerPacket(101, 0);
		UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(102, -2);
		field3318 = new ServerPacket(103, 7);
		field3319 = new ServerPacket(104, 7);
		field3303 = new ServerPacket(105, -2);
		field3321 = new ServerPacket(106, 2);
		field3247 = new ServerPacket(107, -2);
		CAM_LOOKAT = new ServerPacket(108, 6);
		field3324 = new ServerPacket(109, -1);
		field3325 = new ServerPacket(110, 14);
		IF_SETPLAYERHEAD = new ServerPacket(111, 4);
		field3327 = new ServerPacket(112, 4);
		field3328 = new ServerPacket(113, 7);
		field3329 = new ServerPacket(114, 6);
		NPC_INFO_SMALL_VIEWPORT_1 = new ServerPacket(115, -2);
		field3332 = new ServerPacket(116, 5);
		field3270 = new ServerPacket(117, -2);
		field3220 = new ServerPacket(118, 10);
		field3334 = new ServerPacket(119, 4);
		field3301 = new ServerPacket(120, 12);
		field3336 = new ServerPacket(121, 8);
	}

	ServerPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}
}
