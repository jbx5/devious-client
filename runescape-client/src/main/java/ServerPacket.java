import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
@Implements("ServerPacket")
public class ServerPacket {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket REBUILD_NORMAL = new ServerPacket(0, -2);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3218 = new ServerPacket(1, 12);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket IF_SETPLAYERHEAD = new ServerPacket(2, 4);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket LOGOUT_FULL = new ServerPacket(3, 0);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket SET_PRIVCHATMODE = new ServerPacket(4, 1);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket PLAYER_SPOTANIM = new ServerPacket(5, 8);
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3223 = new ServerPacket(6, 11);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket PING_STATISTICS_REQUEST = new ServerPacket(7, 8);
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket MIDI_SONG = new ServerPacket(8, 2);
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3226 = new ServerPacket(9, 2);
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket SET_PLAYER_OP = new ServerPacket(10, -1);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3253 = new ServerPacket(11, 16);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket UPDATE_UID192 = new ServerPacket(12, 28);
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket RUNCLIENTSCRIPT = new ServerPacket(13, -2);
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket UPDATE_STAT = new ServerPacket(14, 6);
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket UPDATE_INV_STOP_TRANSIT = new ServerPacket(15, 2);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket IF_CLOSESUB = new ServerPacket(16, 4);
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket VARP_SMALL = new ServerPacket(17, 6);
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket UPDATE_STOCKMARKET_SLOT = new ServerPacket(18, 20);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket HINT_ARROW = new ServerPacket(19, 6);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket MESSAGE_GAME = new ServerPacket(20, -1);
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3228 = new ServerPacket(21, 0);
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket IF_SETHIDE = new ServerPacket(22, 5);
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3240 = new ServerPacket(23, 5);
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket PLAYER_INFO = new ServerPacket(24, -2);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket MINIMAP_FLAG_SET = new ServerPacket(25, 2);
   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3243 = new ServerPacket(26, 2);
   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3244 = new ServerPacket(27, -1);
   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3245 = new ServerPacket(28, -2);
   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   static final ServerPacket field3241 = new ServerPacket(29, -2);
   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket PROJECTILE_SPAWN = new ServerPacket(30, 17);
   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3248 = new ServerPacket(31, 7);
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket CAM_RESET = new ServerPacket(32, 0);
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3250 = new ServerPacket(33, 6);
   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3282 = new ServerPacket(34, -2);
   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket UPDATE_INV_PARTIAL = new ServerPacket(35, -2);
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket TRIGGER_ONDIALOG_ABORT = new ServerPacket(36, 0);
   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket NPC_INFO_LARGE_VIEWPORT_2 = new ServerPacket(37, -2);
   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3255 = new ServerPacket(38, 7);
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3256 = new ServerPacket(39, 14);
   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket IF_SETMODEL = new ServerPacket(40, 6);
   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3251 = new ServerPacket(41, 6);
   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket REBUILD_REGION = new ServerPacket(42, -2);
   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3224 = new ServerPacket(43, -1);
   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket RESET_CLIENT_VARCACHE = new ServerPacket(44, 0);
   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket IF_SETANGLE = new ServerPacket(45, 10);
   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket SYNC_CLIENT_VARCACHE = new ServerPacket(46, 0);
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket MINIMAP_TOGGLE = new ServerPacket(47, 1);
   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3261 = new ServerPacket(48, -1);
   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket IF_SETPOSITION = new ServerPacket(49, 8);
   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket IF_MOVESUB = new ServerPacket(50, 8);
   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket IF_SETNPCHEAD = new ServerPacket(51, 6);
   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3325 = new ServerPacket(52, 0);
   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3270 = new ServerPacket(53, 0);
   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket IF_SETCOLOUR = new ServerPacket(54, 6);
   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3272 = new ServerPacket(55, 5);
   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3233 = new ServerPacket(56, 2);
   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3274 = new ServerPacket(57, -2);
   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3275 = new ServerPacket(58, 6);
   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3276 = new ServerPacket(59, -2);
   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket URL_OPEN = new ServerPacket(60, -2);
   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket NPC_INFO_SMALL_VIEWPORT_1 = new ServerPacket(61, -2);
   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3279 = new ServerPacket(62, -1);
   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3280 = new ServerPacket(63, -2);
   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3281 = new ServerPacket(64, 1);
   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket EVENT_WORLDHOP = new ServerPacket(65, -1);
   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket DYNAMICOBJECT_SPAWN = new ServerPacket(66, 6);
   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3285 = new ServerPacket(67, -2);
   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket MESSAGE_FRIENDS_CHAT = new ServerPacket(68, -1);
   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3286 = new ServerPacket(69, 1);
   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3333 = new ServerPacket(70, 0);
   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3288 = new ServerPacket(71, 4);
   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket UPDATE_REBOOT_TIMER = new ServerPacket(72, 2);
   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket REFLECTION_CHECKER = new ServerPacket(73, -2);
   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket UPDATE_IGNORELIST = new ServerPacket(74, -2);
   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket CHAT_FILTER_SETTINGS = new ServerPacket(75, 2);
   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3258 = new ServerPacket(76, 4);
   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3294 = new ServerPacket(77, 4);
   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3324 = new ServerPacket(78, -2);
   @ObfuscatedName("dw")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3296 = new ServerPacket(79, -2);
   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket IF_SETOBJECT = new ServerPacket(80, 10);
   @ObfuscatedName("do")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket UPDATE_INV_CLEAR = new ServerPacket(81, 4);
   @ObfuscatedName("di")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3332 = new ServerPacket(82, 2);
   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket MESSAGE_PRIVATE_ECHO = new ServerPacket(83, -2);
   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3329 = new ServerPacket(84, 0);
   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket VARP_LARGE = new ServerPacket(85, 3);
   @ObfuscatedName("dt")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3303 = new ServerPacket(86, 5);
   @ObfuscatedName("dv")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3268 = new ServerPacket(87, 1);
   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3292 = new ServerPacket(88, 4);
   @ObfuscatedName("dg")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket NPC_SET_SEQUENCE = new ServerPacket(89, 5);
   @ObfuscatedName("de")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket UPDATE_FRIENDLIST = new ServerPacket(90, -2);
   @ObfuscatedName("dh")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3297 = new ServerPacket(91, 5);
   @ObfuscatedName("dp")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(92, -2);
   @ObfuscatedName("du")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket UPDATE_INV_FULL = new ServerPacket(93, -2);
   @ObfuscatedName("db")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3311 = new ServerPacket(94, -2);
   @ObfuscatedName("df")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3312 = new ServerPacket(95, 14);
   @ObfuscatedName("dq")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(96, 2);
   @ObfuscatedName("dd")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket IF_SETSCROLLPOS = new ServerPacket(97, 6);
   @ObfuscatedName("dj")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3252 = new ServerPacket(98, 6);
   @ObfuscatedName("dx")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket NPC_SPOTANIM = new ServerPacket(99, 8);
   @ObfuscatedName("dn")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3266 = new ServerPacket(100, -1);
   @ObfuscatedName("dy")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3318 = new ServerPacket(101, 9);
   @ObfuscatedName("ds")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3319 = new ServerPacket(102, -2);
   @ObfuscatedName("da")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket CAM_SETANGLE = new ServerPacket(103, 6);
   @ObfuscatedName("ep")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3238 = new ServerPacket(104, 4);
   @ObfuscatedName("eo")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3322 = new ServerPacket(105, 2);
   @ObfuscatedName("eq")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket GRAPHICSOBJECT_SPAWN = new ServerPacket(106, 8);
   @ObfuscatedName("et")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3284 = new ServerPacket(107, 8);
   @ObfuscatedName("ef")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3326 = new ServerPacket(108, 7);
   @ObfuscatedName("ez")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3293 = new ServerPacket(109, 7);
   @ObfuscatedName("ej")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3327 = new ServerPacket(110, 7);
   @ObfuscatedName("ea")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket CAM_LOOKAT = new ServerPacket(111, 8);
   @ObfuscatedName("eu")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3269 = new ServerPacket(112, 10);
   @ObfuscatedName("es")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3330 = new ServerPacket(113, 5);
   @ObfuscatedName("eb")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3331 = new ServerPacket(114, 8);
   @ObfuscatedName("el")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3308 = new ServerPacket(115, 6);
   @ObfuscatedName("en")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3316 = new ServerPacket(116, 5);
   @ObfuscatedName("er")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3334 = new ServerPacket(117, 9);
   @ObfuscatedName("eg")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   public static final ServerPacket field3335 = new ServerPacket(118, 9);
   @ObfuscatedName("ed")
   @ObfuscatedGetter(
      intValue = 1287795301
   )
   @Export("id")
   public final int id;
   @ObfuscatedName("ev")
   @ObfuscatedGetter(
      intValue = 1022694627
   )
   @Export("length")
   public final int length;

   ServerPacket(int var1, int var2) {
      this.id = var1;
      this.length = var2;
   }
}
