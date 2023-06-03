import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("ServerPacket")
public class ServerPacket {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3265 = new ServerPacket(0, 6);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket MESSAGE_PRIVATE_ECHO = new ServerPacket(1, -2);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3222 = new ServerPacket(2, 5);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket IF_SETCOLOUR = new ServerPacket(3, 6);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket UPDATE_REBOOT_TIMER = new ServerPacket(4, 2);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3230 = new ServerPacket(5, 10);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket MESSAGE_GAME = new ServerPacket(6, -1);
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3227 = new ServerPacket(7, -1);
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3228 = new ServerPacket(8, -2);
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3229 = new ServerPacket(9, 9);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(10, -2);
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3276 = new ServerPacket(11, -1);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket GRAPHICSOBJECT_SPAWN = new ServerPacket(12, 8);
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3233 = new ServerPacket(13, 7);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket EVENT_WORLDHOP = new ServerPacket(14, -1);
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   static final ServerPacket field3235 = new ServerPacket(15, -2);
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3236 = new ServerPacket(16, 5);
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket REFLECTION_CHECKER = new ServerPacket(17, -2);
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3238 = new ServerPacket(18, 12);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket NPC_SET_SEQUENCE = new ServerPacket(19, 5);
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket SYNC_CLIENT_VARCACHE = new ServerPacket(20, 0);
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3241 = new ServerPacket(21, 1);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket NPC_INFO_LARGE_VIEWPORT_2 = new ServerPacket(22, -2);
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket LOGOUT = new ServerPacket(23, 1);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket MESSAGE_PRIVATE = new ServerPacket(24, -2);
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket VARP_SMALL = new ServerPacket(25, 6);
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket VARP_LARGE = new ServerPacket(26, 3);
   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket UPDATE_IGNORELIST = new ServerPacket(27, -2);
   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3248 = new ServerPacket(28, 4);
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3254 = new ServerPacket(29, 5);
   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3301 = new ServerPacket(30, 0);
   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket TRIGGER_ONDIALOG_ABORT = new ServerPacket(31, 0);
   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket IF_SETPOSITION = new ServerPacket(32, 8);
   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket UPDATE_STAT = new ServerPacket(33, 6);
   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket REBUILD_REGION = new ServerPacket(34, -2);
   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3309 = new ServerPacket(35, -1);
   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3273 = new ServerPacket(36, -2);
   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket NPC_SPOTANIM = new ServerPacket(37, 9);
   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3326 = new ServerPacket(38, 14);
   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket UPDATE_UID192 = new ServerPacket(39, 28);
   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket UPDATE_FRIENDLIST = new ServerPacket(40, -2);
   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3261 = new ServerPacket(41, 0);
   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket PROJECTILE_SPAWN = new ServerPacket(42, 17);
   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket SET_PRIVCHATMODE = new ServerPacket(43, 1);
   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3264 = new ServerPacket(44, -2);
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3256 = new ServerPacket(45, -2);
   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3266 = new ServerPacket(46, 2);
   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3297 = new ServerPacket(47, 7);
   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3268 = new ServerPacket(48, 2);
   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket IF_SETANGLE = new ServerPacket(49, 10);
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket IF_MOVESUB = new ServerPacket(50, 8);
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket DYNAMICOBJECT_SPAWN = new ServerPacket(51, 6);
   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket RUNCLIENTSCRIPT = new ServerPacket(52, -2);
   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3239 = new ServerPacket(53, 16);
   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3274 = new ServerPacket(54, -2);
   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket IF_SETHIDE = new ServerPacket(55, 5);
   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket LOGOUT_FULL = new ServerPacket(56, 0);
   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket IF_CLOSESUB = new ServerPacket(57, 4);
   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket URL_OPEN = new ServerPacket(58, -2);
   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket UPDATE_INV_FULL = new ServerPacket(59, -2);
   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3280 = new ServerPacket(60, 6);
   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket MINIMAP_TOGGLE = new ServerPacket(61, 1);
   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket CAM_RESET = new ServerPacket(62, 0);
   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket IF_SETNPCHEAD = new ServerPacket(63, 6);
   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket MESSAGE_FRIENDS_CHAT = new ServerPacket(64, -1);
   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3285 = new ServerPacket(65, 0);
   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3306 = new ServerPacket(66, 5);
   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3244 = new ServerPacket(67, 8);
   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket CHAT_FILTER_SETTINGS = new ServerPacket(68, 2);
   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3284 = new ServerPacket(69, 4);
   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket REBUILD_NORMAL = new ServerPacket(70, -2);
   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3291 = new ServerPacket(71, -2);
   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket NPC_INFO_SMALL_VIEWPORT_1 = new ServerPacket(72, -2);
   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3293 = new ServerPacket(73, 8);
   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3226 = new ServerPacket(74, 1);
   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket SET_PLAYER_OP = new ServerPacket(75, -1);
   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3263 = new ServerPacket(76, 7);
   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3292 = new ServerPacket(77, 4);
   @ObfuscatedName("dd")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3298 = new ServerPacket(78, 5);
   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3299 = new ServerPacket(79, 7);
   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket PLAYER_INFO = new ServerPacket(80, -2);
   @ObfuscatedName("da")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket PLAYER_SPOTANIM = new ServerPacket(81, 9);
   @ObfuscatedName("dt")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3302 = new ServerPacket(82, 4);
   @ObfuscatedName("dn")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket CAM_SETANGLE = new ServerPacket(83, 6);
   @ObfuscatedName("dw")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3304 = new ServerPacket(84, 7);
   @ObfuscatedName("df")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket UPDATE_STOCKMARKET_SLOT = new ServerPacket(85, 20);
   @ObfuscatedName("dx")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3317 = new ServerPacket(86, 2);
   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket CAM_LOOKAT = new ServerPacket(87, 6);
   @ObfuscatedName("do")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket IF_SETOBJECT = new ServerPacket(88, 10);
   @ObfuscatedName("db")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3245 = new ServerPacket(89, -1);
   @ObfuscatedName("dq")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3310 = new ServerPacket(90, -2);
   @ObfuscatedName("dh")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3311 = new ServerPacket(91, 5);
   @ObfuscatedName("dp")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3312 = new ServerPacket(92, -2);
   @ObfuscatedName("dv")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3313 = new ServerPacket(93, 6);
   @ObfuscatedName("di")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3260 = new ServerPacket(94, 14);
   @ObfuscatedName("dj")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3315 = new ServerPacket(95, 4);
   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3316 = new ServerPacket(96, 2);
   @ObfuscatedName("dy")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket IF_SETSCROLLPOS = new ServerPacket(97, 6);
   @ObfuscatedName("dg")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3318 = new ServerPacket(98, -2);
   @ObfuscatedName("de")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket MIDI_SONG = new ServerPacket(99, 2);
   @ObfuscatedName("du")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3249 = new ServerPacket(100, 0);
   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket UPDATE_INV_PARTIAL = new ServerPacket(101, -2);
   @ObfuscatedName("ds")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket UPDATE_INV_STOP_TRANSIT = new ServerPacket(102, 2);
   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket PING_STATISTICS_REQUEST = new ServerPacket(103, 8);
   @ObfuscatedName("ee")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3308 = new ServerPacket(104, 11);
   @ObfuscatedName("er")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3325 = new ServerPacket(105, 2);
   @ObfuscatedName("eh")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(106, 2);
   @ObfuscatedName("eu")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket IF_SETMODEL = new ServerPacket(107, 6);
   @ObfuscatedName("ef")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3328 = new ServerPacket(108, 8);
   @ObfuscatedName("ez")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket IF_SETPLAYERHEAD = new ServerPacket(109, 4);
   @ObfuscatedName("em")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3330 = new ServerPacket(110, 0);
   @ObfuscatedName("ea")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3331 = new ServerPacket(111, 6);
   @ObfuscatedName("en")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket MINIMAP_FLAG_SET = new ServerPacket(112, 2);
   @ObfuscatedName("et")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket UPDATE_INV_CLEAR = new ServerPacket(113, 4);
   @ObfuscatedName("ek")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket HINT_ARROW = new ServerPacket(114, 6);
   @ObfuscatedName("ec")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3335 = new ServerPacket(115, -1);
   @ObfuscatedName("el")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket RESET_CLIENT_VARCACHE = new ServerPacket(116, 0);
   @ObfuscatedName("ed")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   public static final ServerPacket field3337 = new ServerPacket(117, 3);
   @ObfuscatedName("ep")
   @ObfuscatedGetter(
      intValue = 1692527301
   )
   @Export("id")
   public final int id;
   @ObfuscatedName("ew")
   @ObfuscatedGetter(
      intValue = 77769803
   )
   @Export("length")
   public final int length;

   ServerPacket(int var1, int var2) {
      this.id = var1;
      this.length = var2;
   }

   @ObfuscatedName("ic")
   @ObfuscatedSignature(
      descriptor = "(Ldh;IIS)V",
      garbageValue = "-22365"
   )
   @Export("performPlayerAnimation")
   static void performPlayerAnimation(Player var0, int var1, int var2) {
      if (var0.sequence == var1 && var1 != -1) {
         int var3 = WorldMapLabelSize.SequenceDefinition_get(var1).field2299;
         if (var3 == 1) {
            var0.sequenceFrame = 0;
            var0.sequenceFrameCycle = 0;
            var0.sequenceDelay = var2;
            var0.field1200 = 0;
         }

         if (var3 == 2) {
            var0.field1200 = 0;
         }
      } else if (var1 == -1 || var0.sequence == -1 || WorldMapLabelSize.SequenceDefinition_get(var1).field2278 >= WorldMapLabelSize.SequenceDefinition_get(var0.sequence).field2278) {
         var0.sequence = var1;
         var0.sequenceFrame = 0;
         var0.sequenceFrameCycle = 0;
         var0.sequenceDelay = var2;
         var0.field1200 = 0;
         var0.field1226 = var0.pathLength;
      }

   }
}
