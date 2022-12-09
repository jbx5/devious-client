import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("ClientPacket")
public class ClientPacket implements class274 {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPPLAYERT = new ClientPacket(0, 11);
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket EVENT_KEYBOARD = new ClientPacket(1, -2);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3049 = new ClientPacket(2, 14);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3050 = new ClientPacket(3, 13);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket PING_STATISTICS = new ClientPacket(4, 10);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   static final ClientPacket field3052 = new ClientPacket(5, 7);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3061 = new ClientPacket(6, 15);
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   static final ClientPacket field3054 = new ClientPacket(7, -1);
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPLOC4 = new ClientPacket(8, 7);
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket RESUME_PAUSEBUTTON = new ClientPacket(9, 6);
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket EVENT_WINDOW_SETTING = new ClientPacket(10, 5);
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket IF_BUTTOND = new ClientPacket(11, 9);
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3109 = new ClientPacket(12, -1);
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket IF_BUTTON1 = new ClientPacket(13, 8);
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPNPCT = new ClientPacket(14, 11);
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket IF_BUTTONT = new ClientPacket(15, 16);
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPOBJ1 = new ClientPacket(16, 7);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPOBJT = new ClientPacket(17, 15);
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3065 = new ClientPacket(18, -1);
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPPLAYER6 = new ClientPacket(19, 3);
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPNPC5 = new ClientPacket(20, 3);
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPNPC2 = new ClientPacket(21, 3);
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket RESUME_NAMEDIALOG = new ClientPacket(22, -1);
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket IF_BUTTON3 = new ClientPacket(23, 8);
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3056 = new ClientPacket(24, 8);
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket IF_BUTTON5 = new ClientPacket(25, 8);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket FREECAM_EXIT = new ClientPacket(26, 0);
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket IF_BUTTON8 = new ClientPacket(27, 8);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket FRIEND_ADDUSER = new ClientPacket(28, -1);
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket IF_BUTTON10 = new ClientPacket(29, 8);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket RESUME_COUNTDIALOG = new ClientPacket(30, 4);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3078 = new ClientPacket(31, -1);
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket IF_BUTTON7 = new ClientPacket(32, 8);
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPLOC3 = new ClientPacket(33, 7);
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPNPC3 = new ClientPacket(34, 3);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3082 = new ClientPacket(35, 11);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPOBJ4 = new ClientPacket(36, 7);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket DOCHEAT = new ClientPacket(37, -1);
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket CHAT_SETFILTER = new ClientPacket(38, 3);
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPPLAYER7 = new ClientPacket(39, 3);
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket CHAT_SENDABUSEREPORT = new ClientPacket(40, -1);
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPPLAYER5 = new ClientPacket(41, 3);
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3089 = new ClientPacket(42, -1);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3055 = new ClientPacket(43, -1);
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPPLAYER1 = new ClientPacket(44, 3);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3069 = new ClientPacket(45, 15);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3093 = new ClientPacket(46, 8);
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPPLAYER4 = new ClientPacket(47, 3);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3095 = new ClientPacket(48, 8);
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3127 = new ClientPacket(49, 2);
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3097 = new ClientPacket(50, -1);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket IF_BUTTON6 = new ClientPacket(51, 8);
   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket CHAT_SENDPRIVATE = new ClientPacket(52, -2);
   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPLOC2 = new ClientPacket(53, 7);
   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3101 = new ClientPacket(54, 8);
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPNPC4 = new ClientPacket(55, 3);
   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3122 = new ClientPacket(56, 8);
   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3104 = new ClientPacket(57, 8);
   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket EVENT_MOUSE_CLICK = new ClientPacket(58, 6);
   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPOBJ2 = new ClientPacket(59, 7);
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPLOCE = new ClientPacket(60, 2);
   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3108 = new ClientPacket(61, 4);
   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3120 = new ClientPacket(62, 9);
   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   static final ClientPacket field3063 = new ClientPacket(63, -1);
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3111 = new ClientPacket(64, 8);
   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3133 = new ClientPacket(65, 4);
   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   static final ClientPacket field3113 = new ClientPacket(66, -1);
   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket IF_BUTTON9 = new ClientPacket(67, 8);
   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3115 = new ClientPacket(68, -2);
   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3116 = new ClientPacket(69, 8);
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPLOC1 = new ClientPacket(70, 7);
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket CLAN_KICKUSER = new ClientPacket(71, -1);
   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPLOC5 = new ClientPacket(72, 7);
   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPPLAYER8 = new ClientPacket(73, 3);
   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3121 = new ClientPacket(74, -1);
   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket CLOSE_MODAL = new ClientPacket(75, 0);
   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPOBJ5 = new ClientPacket(76, 7);
   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket EVENT_MOUSE_IDLE = new ClientPacket(77, 0);
   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket RESUME_STRINGDIALOG = new ClientPacket(78, -1);
   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket RESUME_OBJDIALOG = new ClientPacket(79, 2);
   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket DETECT_MODIFIED_CLIENT = new ClientPacket(80, 4);
   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket IF_BUTTON4 = new ClientPacket(81, 8);
   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3107 = new ClientPacket(82, 0);
   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3086 = new ClientPacket(83, 11);
   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3131 = new ClientPacket(84, 16);
   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPOBJE = new ClientPacket(85, 6);
   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3139 = new ClientPacket(86, 8);
   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPPLAYER3 = new ClientPacket(87, 3);
   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket EVENT_APPLET_FOCUS = new ClientPacket(88, 1);
   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPOBJ3 = new ClientPacket(89, 7);
   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPNPC1 = new ClientPacket(90, 3);
   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3059 = new ClientPacket(91, 8);
   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket MOVE_GAMECLICK = new ClientPacket(92, -1);
   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket NO_TIMEOUT = new ClientPacket(93, 0);
   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket REFLECTION_CHECK_REPLY = new ClientPacket(94, -1);
   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3142 = new ClientPacket(95, -1);
   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket LOGIN_TIMINGS = new ClientPacket(96, -1);
   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket IF_BUTTON2 = new ClientPacket(97, 8);
   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3145 = new ClientPacket(98, -1);
   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   static final ClientPacket field3146 = new ClientPacket(99, 2);
   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPPLAYER2 = new ClientPacket(100, 3);
   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket IGNORE_DELUSER = new ClientPacket(101, -1);
   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket EVENT_CAMERA_POSITION = new ClientPacket(102, 4);
   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket FRIEND_DELUSER = new ClientPacket(103, -1);
   @ObfuscatedName("dh")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPNPCE = new ClientPacket(104, 2);
   @ObfuscatedName("dn")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPLOCT = new ClientPacket(105, 15);
   @ObfuscatedName("da")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket OPHELDD = new ClientPacket(106, 16);
   @ObfuscatedName("de")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   public static final ClientPacket field3154 = new ClientPacket(107, 22);
   @ObfuscatedName("dl")
   @ObfuscatedGetter(
      intValue = 148030627
   )
   @Export("id")
   final int id;
   @ObfuscatedName("dw")
   @ObfuscatedGetter(
      intValue = -1150175255
   )
   @Export("length")
   final int length;

   ClientPacket(int var1, int var2) {
      this.id = var1;
      this.length = var2;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "([BIII)Ljava/lang/String;",
      garbageValue = "-457974623"
   )
   @Export("decodeStringCp1252")
   public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         int var6 = var0[var5 + var1] & 255;
         if (var6 != 0) {
            if (var6 >= 128 && var6 < 160) {
               char var7 = class358.cp1252AsciiExtension[var6 - 128];
               if (var7 == 0) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }

   @ObfuscatedName("ik")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-24"
   )
   static void method5481() {
      for(class200 var0 = (class200)Client.field727.last(); var0 != null; var0 = (class200)Client.field727.previous()) {
         var0.remove();
      }

   }
}
