import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("ServerPacket")
public class ServerPacket {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket REBUILD_NORMAL = new ServerPacket(0, -2);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket REBUILD_REGION = new ServerPacket(1, -2);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3180 = new ServerPacket(2, 14);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3274 = new ServerPacket(3, -2);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket UPDATE_REBOOT_TIMER = new ServerPacket(4, 2);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3179 = new ServerPacket(5, 6);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket REFLECTION_CHECKER = new ServerPacket(6, -2);
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3181 = new ServerPacket(7, 16);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket IF_SETCOLOUR = new ServerPacket(8, 6);
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket UPDATE_INV_PARTIAL = new ServerPacket(9, -2);
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket CHAT_FILTER_SETTINGS = new ServerPacket(10, 2);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3185 = new ServerPacket(11, 0);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket NPC_SET_SEQUENCE = new ServerPacket(12, 5);
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket PLAYER_SPOTANIM = new ServerPacket(13, 8);
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3188 = new ServerPacket(14, 5);
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3189 = new ServerPacket(15, -2);
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket NPC_SPOTANIM = new ServerPacket(16, 8);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket MESSAGE_GAME = new ServerPacket(17, 14);
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3249 = new ServerPacket(18, 6);
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket IF_SETMODEL = new ServerPacket(19, 6);
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3194 = new ServerPacket(20, -1);
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket GRAPHICSOBJECT_SPAWN = new ServerPacket(21, 8);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3196 = new ServerPacket(22, 0);
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket UPDATE_IGNORELIST = new ServerPacket(23, -2);
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3255 = new ServerPacket(24, 4);
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3199 = new ServerPacket(25, 1);
   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket MINIMAP_TOGGLE = new ServerPacket(26, 1);
   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3201 = new ServerPacket(27, 2);
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(28, 2);
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3203 = new ServerPacket(29, 5);
   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket LOGOUT_FULL = new ServerPacket(30, 0);
   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3208 = new ServerPacket(31, 4);
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket LOGOUT = new ServerPacket(32, 1);
   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket UPDATE_INV_FULL = new ServerPacket(33, -2);
   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket DYNAMICOBJECT_SPAWN = new ServerPacket(34, 6);
   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3246 = new ServerPacket(35, -1);
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket PLAYER_INFO = new ServerPacket(36, -2);
   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3211 = new ServerPacket(37, -2);
   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3205 = new ServerPacket(38, 8);
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket TRIGGER_ONDIALOG_ABORT = new ServerPacket(39, 0);
   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3214 = new ServerPacket(40, 5);
   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3215 = new ServerPacket(41, 5);
   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3216 = new ServerPacket(42, 1);
   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3217 = new ServerPacket(43, -2);
   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3218 = new ServerPacket(44, -2);
   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket MESSAGE_PRIVATE = new ServerPacket(45, -2);
   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3275 = new ServerPacket(46, 2);
   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3221 = new ServerPacket(47, 12);
   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket IF_SETSCROLLPOS = new ServerPacket(48, 6);
   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3223 = new ServerPacket(49, 0);
   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3224 = new ServerPacket(50, 2);
   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3225 = new ServerPacket(51, 4);
   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket UPDATE_UID192 = new ServerPacket(52, 28);
   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket IF_SETPLAYERHEAD = new ServerPacket(53, 4);
   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket SET_PLAYER_OP = new ServerPacket(54, -1);
   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket IF_MOVESUB = new ServerPacket(55, 8);
   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3230 = new ServerPacket(56, 2);
   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket IF_SETNPCHEAD = new ServerPacket(57, 6);
   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3232 = new ServerPacket(58, 2);
   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket SET_PRIVCHATMODE = new ServerPacket(59, 1);
   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3239 = new ServerPacket(60, 6);
   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3206 = new ServerPacket(61, 7);
   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3177 = new ServerPacket(62, -2);
   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3237 = new ServerPacket(63, -2);
   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket IF_CLOSESUB = new ServerPacket(64, 4);
   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket MESSAGE_FRIENDS_CHAT = new ServerPacket(65, -1);
   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket CAM_SETANGLE = new ServerPacket(66, 6);
   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket VARP_SMALL = new ServerPacket(67, 6);
   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket UPDATE_STOCKMARKET_SLOT = new ServerPacket(68, 20);
   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket RESET_CLIENT_VARCACHE = new ServerPacket(69, 0);
   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket URL_OPEN = new ServerPacket(70, -2);
   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket PROJECTILE_SPAWN = new ServerPacket(71, 17);
   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket PING_STATISTICS_REQUEST = new ServerPacket(72, 8);
   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(73, -2);
   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket IF_SETANGLE = new ServerPacket(74, 10);
   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3174 = new ServerPacket(75, -1);
   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket CAM_LOOKAT = new ServerPacket(76, 6);
   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket EVENT_WORLDHOP = new ServerPacket(77, -1);
   @ObfuscatedName("du")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket UPDATE_STAT = new ServerPacket(78, 6);
   @ObfuscatedName("dg")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket CAM_RESET = new ServerPacket(79, 0);
   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket MINIMAP_FLAG_SET = new ServerPacket(80, 2);
   @ObfuscatedName("dp")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket UPDATE_INV_STOP_TRANSIT = new ServerPacket(81, 2);
   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket MIDI_SONG = new ServerPacket(82, 2);
   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket SYNC_CLIENT_VARCACHE = new ServerPacket(83, 0);
   @ObfuscatedName("de")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3187 = new ServerPacket(84, -1);
   @ObfuscatedName("dx")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket UPDATE_INV_CLEAR = new ServerPacket(85, 4);
   @ObfuscatedName("ds")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3260 = new ServerPacket(86, 9);
   @ObfuscatedName("dd")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3261 = new ServerPacket(87, 11);
   @ObfuscatedName("dv")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3262 = new ServerPacket(88, 4);
   @ObfuscatedName("dh")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3277 = new ServerPacket(89, -1);
   @ObfuscatedName("dj")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket UPDATE_FRIENDLIST = new ServerPacket(90, -2);
   @ObfuscatedName("da")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket HINT_ARROW = new ServerPacket(91, 6);
   @ObfuscatedName("dq")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket IF_SETPOSITION = new ServerPacket(92, 8);
   @ObfuscatedName("dw")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3267 = new ServerPacket(93, 4);
   @ObfuscatedName("dt")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket RUNCLIENTSCRIPT = new ServerPacket(94, -2);
   @ObfuscatedName("db")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket VARP_LARGE = new ServerPacket(95, 3);
   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3270 = new ServerPacket(96, 7);
   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket MESSAGE_PRIVATE_ECHO = new ServerPacket(97, -2);
   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3272 = new ServerPacket(98, -2);
   @ObfuscatedName("df")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3233 = new ServerPacket(99, 0);
   @ObfuscatedName("dy")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket NPC_INFO_LARGE_VIEWPORT_2 = new ServerPacket(100, -2);
   @ObfuscatedName("do")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket NPC_INFO_SMALL_VIEWPORT_1 = new ServerPacket(101, -2);
   @ObfuscatedName("dn")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3227 = new ServerPacket(102, -1);
   @ObfuscatedName("di")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3192 = new ServerPacket(103, -2);
   @ObfuscatedName("en")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket field3278 = new ServerPacket(104, 0);
   @ObfuscatedName("ei")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket IF_SETOBJECT = new ServerPacket(105, 10);
   @ObfuscatedName("ee")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   public static final ServerPacket IF_SETHIDE = new ServerPacket(106, 5);
   @ObfuscatedName("ex")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   static final ServerPacket field3281 = new ServerPacket(107, -2);
   @ObfuscatedName("ep")
   @ObfuscatedGetter(
      intValue = -453259019
   )
   @Export("id")
   public final int id;
   @ObfuscatedName("eb")
   @ObfuscatedGetter(
      intValue = -2016392975
   )
   @Export("length")
   public final int length;

   ServerPacket(int var1, int var2) {
      this.id = var1;
      this.length = var2;
   }
}
