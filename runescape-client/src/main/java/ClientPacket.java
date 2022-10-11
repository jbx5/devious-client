import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("ClientPacket")
public class ClientPacket implements class271 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket NO_TIMEOUT = new ClientPacket(0, 0);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field2997 = new ClientPacket(1, 9);
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field2998 = new ClientPacket(2, 14);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3039 = new ClientPacket(3, -1);
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket FRIEND_DELUSER = new ClientPacket(4, -1);
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPPLAYER3 = new ClientPacket(5, 3);
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket IF_BUTTON10 = new ClientPacket(6, 8);
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket CLOSE_MODAL = new ClientPacket(7, 0);
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket EVENT_KEYBOARD = new ClientPacket(8, -2);
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPNPC5 = new ClientPacket(9, 3);
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3006 = new ClientPacket(10, -1);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPLOC3 = new ClientPacket(11, 7);
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket IF_BUTTON3 = new ClientPacket(12, 8);
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3009 = new ClientPacket(13, -1);
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPLOC4 = new ClientPacket(14, 7);
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPOBJ4 = new ClientPacket(15, 7);
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket IF_BUTTON1 = new ClientPacket(16, 8);
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPNPC3 = new ClientPacket(17, 3);
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3014 = new ClientPacket(18, 15);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket IF_BUTTON4 = new ClientPacket(19, 8);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket IF_BUTTON5 = new ClientPacket(20, 8);
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3082 = new ClientPacket(21, 8);
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket IF_BUTTON9 = new ClientPacket(22, 8);
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket IF_BUTTON8 = new ClientPacket(23, 8);
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPOBJ3 = new ClientPacket(24, 7);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPLOC5 = new ClientPacket(25, 7);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3022 = new ClientPacket(26, 13);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket DETECT_MODIFIED_CLIENT = new ClientPacket(27, 4);
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3024 = new ClientPacket(28, 8);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket LOGIN_TIMINGS = new ClientPacket(29, -1);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPOBJ5 = new ClientPacket(30, 7);
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket CHAT_SETFILTER = new ClientPacket(31, 3);
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPOBJ2 = new ClientPacket(32, 7);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3038 = new ClientPacket(33, 4);
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket REFLECTION_CHECK_REPLY = new ClientPacket(34, -1);
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   static final ClientPacket field3101 = new ClientPacket(35, -1);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket RESUME_COUNTDIALOG = new ClientPacket(36, 4);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket IF_BUTTON2 = new ClientPacket(37, 8);
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket CHAT_SENDPRIVATE = new ClientPacket(38, -2);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket EVENT_APPLET_FOCUS = new ClientPacket(39, 1);
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3031 = new ClientPacket(40, -1);
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket DOCHEAT = new ClientPacket(41, -1);
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPPLAYER6 = new ClientPacket(42, 3);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPLOCE = new ClientPacket(43, 2);
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPOBJE = new ClientPacket(44, 6);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPPLAYER2 = new ClientPacket(45, 3);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket FREECAM_EXIT = new ClientPacket(46, 0);
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3043 = new ClientPacket(47, 8);
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPOBJT = new ClientPacket(48, 15);
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   static final ClientPacket field3045 = new ClientPacket(49, -1);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPPLAYER7 = new ClientPacket(50, 3);
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket EVENT_WINDOW_SETTING = new ClientPacket(51, 5);
   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket IF_BUTTON6 = new ClientPacket(52, 8);
   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket EVENT_CAMERA_POSITION = new ClientPacket(53, 4);
   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPLOCT = new ClientPacket(54, 15);
   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket EVENT_MOUSE_CLICK = new ClientPacket(55, 6);
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPPLAYER8 = new ClientPacket(56, 3);
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3053 = new ClientPacket(57, 16);
   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket IF_BUTTONT = new ClientPacket(58, 16);
   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3055 = new ClientPacket(59, 8);
   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3075 = new ClientPacket(60, -1);
   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPNPC1 = new ClientPacket(61, 3);
   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   static final ClientPacket field3056 = new ClientPacket(62, 7);
   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket IGNORE_DELUSER = new ClientPacket(63, -1);
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3060 = new ClientPacket(64, 8);
   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3061 = new ClientPacket(65, 8);
   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket RESUME_NAMEDIALOG = new ClientPacket(66, -1);
   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPNPC4 = new ClientPacket(67, 3);
   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3064 = new ClientPacket(68, 8);
   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket BUG_REPORT = new ClientPacket(69, -2);
   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket RESUME_PAUSEBUTTON = new ClientPacket(70, 6);
   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPPLAYER1 = new ClientPacket(71, 3);
   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3068 = new ClientPacket(72, 11);
   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket CHAT_SENDABUSEREPORT = new ClientPacket(73, -1);
   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3048 = new ClientPacket(74, 8);
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3071 = new ClientPacket(75, -1);
   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3072 = new ClientPacket(76, -1);
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket IF_BUTTON7 = new ClientPacket(77, 8);
   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3074 = new ClientPacket(78, -1);
   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket CLAN_KICKUSER = new ClientPacket(79, -1);
   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPNPCT = new ClientPacket(80, 11);
   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3029 = new ClientPacket(81, 8);
   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPLOC1 = new ClientPacket(82, 7);
   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPNPC2 = new ClientPacket(83, 3);
   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3080 = new ClientPacket(84, 15);
   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket RESUME_OBJDIALOG = new ClientPacket(85, 2);
   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket IF_BUTTOND = new ClientPacket(86, 9);
   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPNPCE = new ClientPacket(87, 2);
   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket EVENT_MOUSE_IDLE = new ClientPacket(88, 0);
   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket FRIEND_ADDUSER = new ClientPacket(89, -1);
   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field2996 = new ClientPacket(90, 4);
   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3087 = new ClientPacket(91, 8);
   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPPLAYER4 = new ClientPacket(92, 3);
   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPLOC2 = new ClientPacket(93, 7);
   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3090 = new ClientPacket(94, -1);
   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket MOVE_GAMECLICK = new ClientPacket(95, -1);
   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   static final ClientPacket field3092 = new ClientPacket(96, -1);
   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3093 = new ClientPacket(97, 0);
   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket RESUME_STRINGDIALOG = new ClientPacket(98, -1);
   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   static final ClientPacket field3028 = new ClientPacket(99, 2);
   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3096 = new ClientPacket(100, 2);
   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket PING_STATISTICS = new ClientPacket(101, 10);
   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPPLAYER5 = new ClientPacket(102, 3);
   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPHELDD = new ClientPacket(103, 16);
   @ObfuscatedName("ds")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3100 = new ClientPacket(104, 11);
   @ObfuscatedName("df")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPOBJ1 = new ClientPacket(105, 7);
   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket OPPLAYERT = new ClientPacket(106, 11);
   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final ClientPacket field3103 = new ClientPacket(107, 22);
   @ObfuscatedName("du")
   @ObfuscatedGetter(
      intValue = 691936867
   )
   @Export("id")
   final int id;
   @ObfuscatedName("de")
   @ObfuscatedGetter(
      intValue = -404453623
   )
   @Export("length")
   final int length;

   ClientPacket(int var1, int var2) {
      this.id = var1;
      this.length = var2;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)Lfv;",
      garbageValue = "-2072167789"
   )
   @Export("VarpDefinition_get")
   public static VarpDefinition VarpDefinition_get(int var0) {
      VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
         var1 = new VarpDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
      garbageValue = "1140833544"
   )
   public static String method5373(CharSequence var0) {
      return BoundaryObject.method4642('*', var0.length());
   }
}
