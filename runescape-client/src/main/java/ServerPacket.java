import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
@Implements("ServerPacket")
public class ServerPacket {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket MESSAGE_FRIENDS_CHAT = new ServerPacket(0, -1);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3131 = new ServerPacket(1, 1);
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket EVENT_WORLDHOP = new ServerPacket(2, -1);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket UPDATE_INV_FULL = new ServerPacket(3, -2);
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3134 = new ServerPacket(4, 2);
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3135 = new ServerPacket(5, 8);
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3136 = new ServerPacket(6, 5);
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket UPDATE_FRIENDLIST = new ServerPacket(7, -2);
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket REFLECTION_CHECKER = new ServerPacket(8, -2);
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket TRIGGER_ONDIALOG_ABORT = new ServerPacket(9, 0);
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3140 = new ServerPacket(10, 2);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket NPC_SET_SEQUENCE = new ServerPacket(11, 5);
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket IF_SETMODEL = new ServerPacket(12, 6);
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3168 = new ServerPacket(13, 15);
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(14, -2);
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket SYNC_CLIENT_VARCACHE = new ServerPacket(15, 0);
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket REBUILD_NORMAL = new ServerPacket(16, -2);
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket IF_CLOSESUB = new ServerPacket(17, 4);
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3227 = new ServerPacket(18, 1);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3149 = new ServerPacket(19, 4);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3242 = new ServerPacket(20, 12);
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket IF_SETCOLOUR = new ServerPacket(21, 6);
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3138 = new ServerPacket(22, 6);
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3150 = new ServerPacket(23, 4);
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket MINIMAP_FLAG_SET = new ServerPacket(24, 2);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3155 = new ServerPacket(25, 2);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket PLAYER_INFO = new ServerPacket(26, -2);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3132 = new ServerPacket(27, 5);
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket UPDATE_IGNORELIST = new ServerPacket(28, -2);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket MESSAGE_PRIVATE = new ServerPacket(29, -2);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3174 = new ServerPacket(30, -2);
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket VARP_SMALL = new ServerPacket(31, 3);
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket UPDATE_UID192 = new ServerPacket(32, 28);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket URL_OPEN = new ServerPacket(33, -2);
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket IF_SETNPCHEAD = new ServerPacket(34, 6);
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket CHAT_FILTER_SETTINGS = new ServerPacket(35, 2);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3166 = new ServerPacket(36, -2);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3167 = new ServerPacket(37, 0);
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket MIDI_SONG = new ServerPacket(38, 2);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3169 = new ServerPacket(39, -2);
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket SET_PLAYER_OP = new ServerPacket(40, -1);
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3171 = new ServerPacket(41, 7);
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3172 = new ServerPacket(42, -2);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket GRAPHICSOBJECT_SPAWN = new ServerPacket(43, 8);
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket NPC_SPOTANIM = new ServerPacket(44, 8);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket IF_MOVESUB = new ServerPacket(45, 8);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket UPDATE_INV_STOP_TRANSIT = new ServerPacket(46, 2);
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket RUNCLIENTSCRIPT = new ServerPacket(47, -2);
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3178 = new ServerPacket(48, 7);
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3199 = new ServerPacket(49, 0);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket PROJECTILE_SPAWN = new ServerPacket(50, 17);
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3181 = new ServerPacket(51, 5);
   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(52, 2);
   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3183 = new ServerPacket(53, 5);
   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket IF_SETPLAYERHEAD = new ServerPacket(54, 4);
   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket IF_SETANGLE = new ServerPacket(55, 10);
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket REBUILD_REGION = new ServerPacket(56, -2);
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket UPDATE_INV_CLEAR = new ServerPacket(57, 4);
   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3143 = new ServerPacket(58, 5);
   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3189 = new ServerPacket(59, 0);
   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket IF_SETOBJECT = new ServerPacket(60, 10);
   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3217 = new ServerPacket(61, -1);
   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3192 = new ServerPacket(62, -1);
   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket CAM_LOOKAT = new ServerPacket(63, 6);
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3177 = new ServerPacket(64, 1);
   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket PING_STATISTICS_REQUEST = new ServerPacket(65, 8);
   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket PLAYER_SPOTANIM = new ServerPacket(66, 8);
   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket DYNAMICOBJECT_SPAWN = new ServerPacket(67, 6);
   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket RESET_CLIENT_VARCACHE = new ServerPacket(68, 0);
   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket UPDATE_STOCKMARKET_SLOT = new ServerPacket(69, 20);
   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket MINIMAP_TOGGLE = new ServerPacket(70, 1);
   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3229 = new ServerPacket(71, -1);
   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket IF_SETHIDE = new ServerPacket(72, 5);
   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket NPC_INFO_SMALL_VIEWPORT_2 = new ServerPacket(73, -2);
   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3204 = new ServerPacket(74, -1);
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket HINT_ARROW = new ServerPacket(75, 6);
   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket VARP_LARGE = new ServerPacket(76, 6);
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3207 = new ServerPacket(77, -2);
   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3208 = new ServerPacket(78, -1);
   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket SET_PRIVCHATMODE = new ServerPacket(79, 1);
   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3148 = new ServerPacket(80, -2);
   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket CAM_SETANGLE = new ServerPacket(81, 6);
   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket CAM_RESET = new ServerPacket(82, 0);
   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3213 = new ServerPacket(83, 6);
   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3214 = new ServerPacket(84, -2);
   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3215 = new ServerPacket(85, 0);
   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket MESSAGE_GAME = new ServerPacket(86, -1);
   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket LOGOUT = new ServerPacket(87, 1);
   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3218 = new ServerPacket(88, 2);
   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3219 = new ServerPacket(89, -2);
   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket UPDATE_REBOOT_TIMER = new ServerPacket(90, 2);
   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3202 = new ServerPacket(91, 4);
   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3222 = new ServerPacket(92, 4);
   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket NPC_INFO_LARGE_VIEWPORT_2 = new ServerPacket(93, -2);
   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket UPDATE_STAT = new ServerPacket(94, 6);
   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3225 = new ServerPacket(95, 4);
   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3226 = new ServerPacket(96, 14);
   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket IF_SETPOSITION = new ServerPacket(97, 8);
   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket MESSAGE_PRIVATE_ECHO = new ServerPacket(98, -2);
   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3190 = new ServerPacket(99, -2);
   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket LOGOUT_FULL = new ServerPacket(100, 0);
   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket UPDATE_INV_PARTIAL = new ServerPacket(101, -2);
   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket IF_SETSCROLLPOS = new ServerPacket(102, 6);
   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3233 = new ServerPacket(103, -2);
   @ObfuscatedName("ds")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3234 = new ServerPacket(104, 17);
   @ObfuscatedName("df")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket NPC_INFO_LARGE_VIEWPORT_1 = new ServerPacket(105, -2);
   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket NPC_INFO_SMALL_VIEWPORT_1 = new ServerPacket(106, -2);
   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3237 = new ServerPacket(107, 16);
   @ObfuscatedName("du")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3238 = new ServerPacket(108, 4);
   @ObfuscatedName("de")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3161 = new ServerPacket(109, 5);
   @ObfuscatedName("dt")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final ServerPacket field3240 = new ServerPacket(110, 8);
   @ObfuscatedName("he")
   @ObfuscatedGetter(
      intValue = 1691110679
   )
   static int field3133;
   @ObfuscatedName("da")
   @ObfuscatedGetter(
      intValue = -1220623677
   )
   @Export("id")
   public final int id;
   @ObfuscatedName("dx")
   @ObfuscatedGetter(
      intValue = 652557057
   )
   @Export("length")
   public final int length;

   ServerPacket(int var1, int var2) {
      this.id = var1;
      this.length = var2;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lca;S)V",
      garbageValue = "-4020"
   )
   @Export("runScriptEvent")
   public static void runScriptEvent(ScriptEvent var0) {
      class103.runScript(var0, 500000, 475000);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1276551764"
   )
   public static boolean method5399(int var0) {
      return (var0 >> 31 & 1) != 0;
   }
}
