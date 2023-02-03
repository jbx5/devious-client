import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jg")
@Implements("ServerPacket")
public class ServerPacket {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket REBUILD_NORMAL = new ServerPacket(0, -2);
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3193 = new ServerPacket(1, 2);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket PLAYER_INFO = new ServerPacket(2, -2);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3195 = new ServerPacket(3, -2);
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket CAM_LOOKAT = new ServerPacket(4, 6);
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3197 = new ServerPacket(5, 2);
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket CAM_SETANGLE = new ServerPacket(6, 6);
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket NPC_INFO_SMALL_VIEWPORT_2 = new ServerPacket(7, -2);
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket RESET_CLIENT_VARCACHE = new ServerPacket(8, 0);
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket NPC_INFO_LARGE_VIEWPORT_1 = new ServerPacket(9, -2);
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3202 = new ServerPacket(10, 4);
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket CAM_RESET = new ServerPacket(11, 0);
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(12, 2);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket MESSAGE_GAME = new ServerPacket(13, 2);
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3273 = new ServerPacket(14, 0);
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket REFLECTION_CHECKER = new ServerPacket(15, -2);
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3208 = new ServerPacket(16, 4);
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket UPDATE_STOCKMARKET_SLOT = new ServerPacket(17, 20);
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket RUNCLIENTSCRIPT = new ServerPacket(18, -2);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket UPDATE_INV_STOP_TRANSIT = new ServerPacket(19, 2);
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3259 = new ServerPacket(20, -2);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3213 = new ServerPacket(21, -2);
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket SET_PRIVCHATMODE = new ServerPacket(22, 1);
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3215 = new ServerPacket(23, 5);
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3206 = new ServerPacket(24, 7);
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket MESSAGE_PRIVATE = new ServerPacket(25, -2);
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket VARP_SMALL = new ServerPacket(26, 6);
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3219 = new ServerPacket(27, -1);
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3220 = new ServerPacket(28, 9);
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3221 = new ServerPacket(29, -2);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket REBUILD_REGION = new ServerPacket(30, -2);
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3223 = new ServerPacket(31, 14);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3224 = new ServerPacket(32, -1);
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket URL_OPEN = new ServerPacket(33, -2);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket LOGOUT = new ServerPacket(34, 1);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3198 = new ServerPacket(35, 6);
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3200 = new ServerPacket(36, 0);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket UPDATE_STAT = new ServerPacket(37, 6);
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3230 = new ServerPacket(38, 7);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket MIDI_SONG = new ServerPacket(39, 2);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket IF_SETPOSITION = new ServerPacket(40, 8);
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3233 = new ServerPacket(41, 15);
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket PROJECTILE_SPAWN = new ServerPacket(42, 17);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3235 = new ServerPacket(43, 4);
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket UPDATE_INV_PARTIAL = new ServerPacket(44, -2);
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3306 = new ServerPacket(45, 5);
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3238 = new ServerPacket(46, 12);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket IF_SETOBJECT = new ServerPacket(47, 10);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3240 = new ServerPacket(48, 2);
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3248 = new ServerPacket(49, 0);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3242 = new ServerPacket(50, 5);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket UPDATE_REBOOT_TIMER = new ServerPacket(51, 2);
   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3244 = new ServerPacket(52, -2);
   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket NPC_INFO_LARGE_VIEWPORT_2 = new ServerPacket(53, -2);
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket UPDATE_INV_CLEAR = new ServerPacket(54, 4);
   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3247 = new ServerPacket(55, 5);
   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket SET_PLAYER_OP = new ServerPacket(56, -1);
   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket LOGOUT_FULL = new ServerPacket(57, 0);
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket IF_SETCOLOUR = new ServerPacket(58, 6);
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket GRAPHICSOBJECT_SPAWN = new ServerPacket(59, 8);
   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket IF_SETPLAYERHEAD = new ServerPacket(60, 4);
   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3212 = new ServerPacket(61, -1);
   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket NPC_SPOTANIM = new ServerPacket(62, 8);
   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket NPC_INFO_SMALL_VIEWPORT_1 = new ServerPacket(63, -2);
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket IF_CLOSESUB = new ServerPacket(64, 4);
   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket MINIMAP_TOGGLE = new ServerPacket(65, 1);
   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket IF_SETANGLE = new ServerPacket(66, 10);
   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket IF_SETMODEL = new ServerPacket(67, 6);
   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket EVENT_WORLDHOP = new ServerPacket(68, -1);
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket PING_STATISTICS_REQUEST = new ServerPacket(69, 8);
   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket UPDATE_INV_FULL = new ServerPacket(70, -2);
   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket TRIGGER_ONDIALOG_ABORT = new ServerPacket(71, 0);
   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3264 = new ServerPacket(72, -2);
   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket UPDATE_FRIENDLIST = new ServerPacket(73, -2);
   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket UPDATE_UID192 = new ServerPacket(74, 28);
   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3252 = new ServerPacket(75, 2);
   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3251 = new ServerPacket(76, -2);
   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3269 = new ServerPacket(77, 6);
   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket HINT_ARROW = new ServerPacket(78, 6);
   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket SYNC_CLIENT_VARCACHE = new ServerPacket(79, 0);
   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3272 = new ServerPacket(80, 8);
   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3266 = new ServerPacket(81, -1);
   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3291 = new ServerPacket(82, -2);
   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3275 = new ServerPacket(83, -2);
   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3232 = new ServerPacket(84, -1);
   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3277 = new ServerPacket(85, 1);
   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket MESSAGE_PRIVATE_ECHO = new ServerPacket(86, -2);
   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3225 = new ServerPacket(87, -1);
   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3280 = new ServerPacket(88, 6);
   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3263 = new ServerPacket(89, 7);
   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket MINIMAP_FLAG_SET = new ServerPacket(90, 2);
   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket NPC_SET_SEQUENCE = new ServerPacket(91, 5);
   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket CHAT_FILTER_SETTINGS = new ServerPacket(92, 2);
   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3285 = new ServerPacket(93, -2);
   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket PLAYER_SPOTANIM = new ServerPacket(94, 8);
   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3241 = new ServerPacket(95, 1);
   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket UPDATE_IGNORELIST = new ServerPacket(96, -2);
   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket VARP_LARGE = new ServerPacket(97, 3);
   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket DYNAMICOBJECT_SPAWN = new ServerPacket(98, 6);
   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3293 = new ServerPacket(99, 0);
   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket IF_SETSCROLLPOS = new ServerPacket(100, 6);
   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3228 = new ServerPacket(101, 14);
   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket IF_SETHIDE = new ServerPacket(102, 5);
   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3295 = new ServerPacket(103, 4);
   @ObfuscatedName("dw")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket IF_SETNPCHEAD = new ServerPacket(104, 6);
   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(105, -2);
   @ObfuscatedName("db")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3298 = new ServerPacket(106, 17);
   @ObfuscatedName("di")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3299 = new ServerPacket(107, 16);
   @ObfuscatedName("dy")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3300 = new ServerPacket(108, 0);
   @ObfuscatedName("dg")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3301 = new ServerPacket(109, 4);
   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket IF_MOVESUB = new ServerPacket(110, 8);
   @ObfuscatedName("dn")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket MESSAGE_FRIENDS_CHAT = new ServerPacket(111, -1);
   @ObfuscatedName("df")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   public static final ServerPacket field3304 = new ServerPacket(112, 11);
   @ObfuscatedName("da")
   static boolean field3307;
   @ObfuscatedName("dv")
   @ObfuscatedGetter(
      intValue = -1282844463
   )
   @Export("id")
   public final int id;
   @ObfuscatedName("dr")
   @ObfuscatedGetter(
      intValue = -1354345063
   )
   @Export("length")
   public final int length;

   ServerPacket(int var1, int var2) {
      this.id = var1;
      this.length = var2;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lrd;Ljava/lang/String;I)I",
      garbageValue = "1788578065"
   )
   public static int method5563(Buffer var0, String var1) {
      int var2 = var0.offset;
      int var4 = var1.length();
      byte[] var5 = new byte[var4];

      for(int var6 = 0; var6 < var4; ++var6) {
         char var7 = var1.charAt(var6);
         if ((var7 <= 0 || var7 >= 128) && (var7 < 160 || var7 > 255)) {
            if (var7 == 8364) {
               var5[var6] = -128;
            } else if (var7 == 8218) {
               var5[var6] = -126;
            } else if (var7 == 402) {
               var5[var6] = -125;
            } else if (var7 == 8222) {
               var5[var6] = -124;
            } else if (var7 == 8230) {
               var5[var6] = -123;
            } else if (var7 == 8224) {
               var5[var6] = -122;
            } else if (var7 == 8225) {
               var5[var6] = -121;
            } else if (var7 == 710) {
               var5[var6] = -120;
            } else if (var7 == 8240) {
               var5[var6] = -119;
            } else if (var7 == 352) {
               var5[var6] = -118;
            } else if (var7 == 8249) {
               var5[var6] = -117;
            } else if (var7 == 338) {
               var5[var6] = -116;
            } else if (var7 == 381) {
               var5[var6] = -114;
            } else if (var7 == 8216) {
               var5[var6] = -111;
            } else if (var7 == 8217) {
               var5[var6] = -110;
            } else if (var7 == 8220) {
               var5[var6] = -109;
            } else if (var7 == 8221) {
               var5[var6] = -108;
            } else if (var7 == 8226) {
               var5[var6] = -107;
            } else if (var7 == 8211) {
               var5[var6] = -106;
            } else if (var7 == 8212) {
               var5[var6] = -105;
            } else if (var7 == 732) {
               var5[var6] = -104;
            } else if (var7 == 8482) {
               var5[var6] = -103;
            } else if (var7 == 353) {
               var5[var6] = -102;
            } else if (var7 == 8250) {
               var5[var6] = -101;
            } else if (var7 == 339) {
               var5[var6] = -100;
            } else if (var7 == 382) {
               var5[var6] = -98;
            } else if (var7 == 376) {
               var5[var6] = -97;
            } else {
               var5[var6] = 63;
            }
         } else {
            var5[var6] = (byte)var7;
         }
      }

      var0.writeSmartByteShort(var5.length);
      var0.offset += class312.huffman.compress(var5, 0, var5.length, var0.array, var0.offset);
      return var0.offset - var2;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lrd;J)V"
   )
   static void method5560(Buffer var0, long var1) {
      var1 /= 10L;
      if (var1 < 0L) {
         var1 = 0L;
      } else if (var1 > 65535L) {
         var1 = 65535L;
      }

      var0.writeShort((int)var1);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZB)I",
      garbageValue = "0"
   )
   static int method5564(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
         class302.Interpreter_intStackSize -= 2;
         Client.field773 = (short)ItemLayer.method4228(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]);
         if (Client.field773 <= 0) {
            Client.field773 = 256;
         }

         Client.field774 = (short)ItemLayer.method4228(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]);
         if (Client.field774 <= 0) {
            Client.field774 = 256;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
         class302.Interpreter_intStackSize -= 2;
         Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
         if (Client.zoomHeight <= 0) {
            Client.zoomHeight = 256;
         }

         Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
         if (Client.zoomWidth <= 0) {
            Client.zoomWidth = 320;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
         class302.Interpreter_intStackSize -= 4;
         Client.field763 = (short)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
         if (Client.field763 <= 0) {
            Client.field763 = 1;
         }

         Client.field778 = (short)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
         if (Client.field778 <= 0) {
            Client.field778 = 32767;
         } else if (Client.field778 < Client.field763) {
            Client.field778 = Client.field763;
         }

         Client.field779 = (short)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2];
         if (Client.field779 <= 0) {
            Client.field779 = 1;
         }

         Client.field780 = (short)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 3];
         if (Client.field780 <= 0) {
            Client.field780 = 32767;
         } else if (Client.field780 < Client.field779) {
            Client.field780 = Client.field779;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
         if (Client.viewportWidget != null) {
            MusicPatchPcmStream.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.viewportWidth;
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.viewportHeight;
         } else {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.zoomHeight;
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.zoomWidth;
         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = MouseRecorder.method2327(Client.field773);
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = MouseRecorder.method2327(Client.field774);
         return 1;
      } else if (var0 == 6220) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
         return 1;
      } else if (var0 == 6221) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
         return 1;
      } else if (var0 == 6222) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = GameEngine.canvasWidth;
         return 1;
      } else if (var0 == 6223) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class127.canvasHeight;
         return 1;
      } else {
         return 2;
      }
   }
}
