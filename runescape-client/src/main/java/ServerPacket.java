import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("jy")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket NPC_INFO_LARGE_VIEWPORT_1 = new ServerPacket(0, -2);

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket SYNC_CLIENT_VARCACHE = new ServerPacket(1, 0);

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3048 = new ServerPacket(2, -2);

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3127 = new ServerPacket(3, 5);

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3071 = new ServerPacket(4, -2);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket CHAT_FILTER_SETTINGS = new ServerPacket(5, 2);

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3057 = new ServerPacket(6, -2);

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3053 = new ServerPacket(7, -2);

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket NPC_INFO_SMALL_VIEWPORT_1 = new ServerPacket(8, -2);

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3064 = new ServerPacket(9, 15);

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3056 = new ServerPacket(10, 3);

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket IF_SETANGLE = new ServerPacket(11, 10);

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3058 = new ServerPacket(12, 4);

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3065 = new ServerPacket(13, 2);

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket UPDATE_STOCKMARKET_SLOT = new ServerPacket(14, 20);

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3061 = new ServerPacket(15, -1);

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket NPC_SPOTANIM = new ServerPacket(16, 8);

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3055 = new ServerPacket(17, 4);

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket CAM_SETANGLE = new ServerPacket(18, 6);

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(19, 2);

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket NPC_INFO_LARGE_VIEWPORT_2 = new ServerPacket(20, -2);

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3122 = new ServerPacket(21, 0);

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket REBUILD_REGION = new ServerPacket(22, -2);

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket UPDATE_UID192 = new ServerPacket(23, 28);

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket MESSAGE_GAME = new ServerPacket(24, -1);

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket RUNCLIENTSCRIPT = new ServerPacket(25, -2);

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3092 = new ServerPacket(26, 2);

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3073 = new ServerPacket(27, 2);

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3067 = new ServerPacket(28, 5);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3075 = new ServerPacket(29, 8);

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket SET_PLAYER_OP = new ServerPacket(30, -1);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket IF_SETOBJECT = new ServerPacket(31, 10);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3099 = new ServerPacket(32, 7);

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket UPDATE_IGNORELIST = new ServerPacket(33, -2);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3080 = new ServerPacket(34, 0);

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket UPDATE_STAT = new ServerPacket(35, 6);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket IF_SETHIDE = new ServerPacket(36, 5);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket PLAYER_SPOTANIM = new ServerPacket(37, 8);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket PLAYER_INFO = new ServerPacket(38, -2);

	@ObfuscatedName("af")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket UPDATE_REBOOT_TIMER = new ServerPacket(39, 2);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3086 = new ServerPacket(40, 4);

	@ObfuscatedName("ai")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3087 = new ServerPacket(41, 6);

	@ObfuscatedName("ap")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket EVENT_WORLDHOP = new ServerPacket(42, -1);

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket PING_STATISTICS_REQUEST = new ServerPacket(43, 8);

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket PROJECTILE_SPAWN = new ServerPacket(44, 17);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket MESSAGE_PRIVATE = new ServerPacket(45, -2);

	@ObfuscatedName("aa")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket IF_MOVESUB = new ServerPacket(46, 8);

	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket MESSAGE_PRIVATE_ECHO = new ServerPacket(47, -2);

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket NPC_INFO_SMALL_VIEWPORT_2 = new ServerPacket(48, -2);

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3125 = new ServerPacket(49, 4);

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3096 = new ServerPacket(50, 0);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3097 = new ServerPacket(51, 4);

	@ObfuscatedName("bq")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket IF_SETNPCHEAD = new ServerPacket(52, 6);

	@ObfuscatedName("bn")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3098 = new ServerPacket(53, -1);

	@ObfuscatedName("bl")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3100 = new ServerPacket(54, 2);

	@ObfuscatedName("bv")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket IF_SETPOSITION = new ServerPacket(55, 8);

	@ObfuscatedName("bu")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket LOGOUT = new ServerPacket(56, 1);

	@ObfuscatedName("bb")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket IF_SETMODEL = new ServerPacket(57, 6);

	@ObfuscatedName("bt")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket UPDATE_FRIENDLIST = new ServerPacket(58, -2);

	@ObfuscatedName("bw")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket GRAPHICSOBJECT_SPAWN = new ServerPacket(59, 8);

	@ObfuscatedName("bd")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3052 = new ServerPacket(60, -1);

	@ObfuscatedName("bg")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3089 = new ServerPacket(61, 5);

	@ObfuscatedName("by")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3108 = new ServerPacket(62, 14);

	@ObfuscatedName("bs")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3109 = new ServerPacket(63, 0);

	@ObfuscatedName("br")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket IF_SETSCROLLPOS = new ServerPacket(64, 6);

	@ObfuscatedName("bx")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(65, -2);

	@ObfuscatedName("ba")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket DYNAMICOBJECT_SPAWN = new ServerPacket(66, 6);

	@ObfuscatedName("bh")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket RESET_CLIENT_VARCACHE = new ServerPacket(67, 0);

	@ObfuscatedName("bc")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3151 = new ServerPacket(68, 5);

	@ObfuscatedName("bm")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3115 = new ServerPacket(69, -2);

	@ObfuscatedName("bp")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket MINIMAP_FLAG_SET = new ServerPacket(70, 2);

	@ObfuscatedName("bz")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3117 = new ServerPacket(71, -2);

	@ObfuscatedName("bo")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3118 = new ServerPacket(72, 1);

	@ObfuscatedName("bi")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket IF_SETPLAYERHEAD = new ServerPacket(73, 4);

	@ObfuscatedName("bj")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket UPDATE_INV_STOP_TRANSIT = new ServerPacket(74, 2);

	@ObfuscatedName("be")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3049 = new ServerPacket(75, 6);

	@ObfuscatedName("bk")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket UPDATE_INV_CLEAR = new ServerPacket(76, 4);

	@ObfuscatedName("bf")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket MINIMAP_TOGGLE = new ServerPacket(77, 1);

	@ObfuscatedName("ce")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket VARP_LARGE = new ServerPacket(78, 6);

	@ObfuscatedName("cb")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket LOGOUT_FULL = new ServerPacket(79, 0);

	@ObfuscatedName("co")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket CAM_RESET = new ServerPacket(80, 0);

	@ObfuscatedName("cl")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket TRIGGER_ONDIALOG_ABORT = new ServerPacket(81, 0);

	@ObfuscatedName("cf")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3132 = new ServerPacket(82, -2);

	@ObfuscatedName("ch")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket IF_CLOSESUB = new ServerPacket(83, 4);

	@ObfuscatedName("cq")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket SET_PRIVCHATMODE = new ServerPacket(84, 1);

	@ObfuscatedName("ci")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket UPDATE_INV_FULL = new ServerPacket(85, -2);

	@ObfuscatedName("cx")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket CAM_LOOKAT = new ServerPacket(86, 6);

	@ObfuscatedName("cc")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket VARP_SMALL = new ServerPacket(87, 3);

	@ObfuscatedName("cm")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket IF_SETCOLOUR = new ServerPacket(88, 6);

	@ObfuscatedName("cn")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3135 = new ServerPacket(89, -1);

	@ObfuscatedName("cj")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket HINT_ARROW = new ServerPacket(90, 6);

	@ObfuscatedName("ct")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket UPDATE_INV_PARTIAL = new ServerPacket(91, -2);

	@ObfuscatedName("cp")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3107 = new ServerPacket(92, -2);

	@ObfuscatedName("cr")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3139 = new ServerPacket(93, -2);

	@ObfuscatedName("cs")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3140 = new ServerPacket(94, -1);

	@ObfuscatedName("cy")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket MIDI_SONG = new ServerPacket(95, 2);

	@ObfuscatedName("cw")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket REBUILD_NORMAL = new ServerPacket(96, -2);

	@ObfuscatedName("cg")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket REFLECTION_CHECKER = new ServerPacket(97, -2);

	@ObfuscatedName("cd")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3144 = new ServerPacket(98, 7);

	@ObfuscatedName("cz")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket NPC_SET_SEQUENCE = new ServerPacket(99, 5);

	@ObfuscatedName("cu")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3146 = new ServerPacket(100, 1);

	@ObfuscatedName("ca")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket URL_OPEN = new ServerPacket(101, -2);

	@ObfuscatedName("cv")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket MESSAGE_FRIENDS_CHAT = new ServerPacket(102, -1);

	@ObfuscatedName("ck")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3149 = new ServerPacket(103, 1);

	@ObfuscatedName("du")
	@ObfuscatedSignature(descriptor = "Ljy;")
	public static final ServerPacket field3150 = new ServerPacket(104, 12);

	@ObfuscatedName("di")
	@ObfuscatedGetter(intValue = -62777805)
	@Export("id")
	public final int id;

	@ObfuscatedName("dw")
	@ObfuscatedGetter(intValue = 1156259585)
	@Export("length")
	public final int length;

	ServerPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}
}