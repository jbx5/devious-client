import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("ClientPacket")
public class ClientPacket implements class285 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket field3105 = new ClientPacket(0, -1);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   static final ClientPacket field3099 = new ClientPacket(1, -1);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket EVENT_MOUSE_IDLE = new ClientPacket(2, 0);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket FREECAM_EXIT = new ClientPacket(3, 0);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket field3102 = new ClientPacket(4, 13);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket EVENT_KEYBOARD = new ClientPacket(5, -2);
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket CHAT_SENDPRIVATE = new ClientPacket(6, -2);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPPLAYER7 = new ClientPacket(7, 3);
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPPLAYER8 = new ClientPacket(8, 3);
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket field3142 = new ClientPacket(9, -1);
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPLOC1 = new ClientPacket(10, 7);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket RESUME_COUNTDIALOG = new ClientPacket(11, 4);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket field3110 = new ClientPacket(12, -1);
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket EVENT_MOUSE_CLICK = new ClientPacket(13, 6);
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket IGNORE_DELUSER = new ClientPacket(14, -1);
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket field3113 = new ClientPacket(15, 15);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket EVENT_WINDOW_SETTING = new ClientPacket(16, 5);
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   static final ClientPacket field3115 = new ClientPacket(17, 2);
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket FRIEND_DELUSER = new ClientPacket(18, -1);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPOBJ5 = new ClientPacket(19, 7);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket IF_BUTTON5 = new ClientPacket(20, 8);
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket FRIEND_ADDUSER = new ClientPacket(21, -1);
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPPLAYER5 = new ClientPacket(22, 3);
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket IF_BUTTONT = new ClientPacket(23, 16);
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPLOCT = new ClientPacket(24, 15);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPOBJT = new ClientPacket(25, 15);
   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket NO_TIMEOUT = new ClientPacket(26, 0);
   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   static final ClientPacket field3125 = new ClientPacket(27, -1);
   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPOBJ3 = new ClientPacket(28, 7);
   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPNPC4 = new ClientPacket(29, 3);
   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   static final ClientPacket field3128 = new ClientPacket(30, 7);
   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket field3129 = new ClientPacket(31, 11);
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPPLAYER3 = new ClientPacket(32, 3);
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPOBJ2 = new ClientPacket(33, 7);
   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket IF_BUTTON9 = new ClientPacket(34, 8);
   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPPLAYER2 = new ClientPacket(35, 3);
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket DETECT_MODIFIED_CLIENT = new ClientPacket(36, 4);
   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   static final ClientPacket field3135 = new ClientPacket(37, -1);
   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket IF_BUTTON7 = new ClientPacket(38, 8);
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPLOC2 = new ClientPacket(39, 7);
   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   static final ClientPacket field3138 = new ClientPacket(40, 2);
   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   static final ClientPacket field3139 = new ClientPacket(41, -1);
   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket field3140 = new ClientPacket(42, -2);
   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket field3141 = new ClientPacket(43, 15);
   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPLOC3 = new ClientPacket(44, 7);
   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket field3151 = new ClientPacket(45, -1);
   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket field3144 = new ClientPacket(46, 4);
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPPLAYERT = new ClientPacket(47, 11);
   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPLOC4 = new ClientPacket(48, 7);
   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPNPC5 = new ClientPacket(49, 3);
   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket field3148 = new ClientPacket(50, -1);
   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPHELDD = new ClientPacket(51, 16);
   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPNPCT = new ClientPacket(52, 11);
   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket WIDGET_TYPE = new ClientPacket(53, 4);
   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket CHAT_SETFILTER = new ClientPacket(54, 3);
   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPNPCE = new ClientPacket(55, 2);
   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket CLOSE_MODAL = new ClientPacket(56, 0);
   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPPLAYER6 = new ClientPacket(57, 3);
   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket RESUME_NAMEDIALOG = new ClientPacket(58, -1);
   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket MOVE_GAMECLICK = new ClientPacket(59, -1);
   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket field3179 = new ClientPacket(60, 9);
   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket RESUME_OBJDIALOG = new ClientPacket(61, 2);
   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPPLAYER4 = new ClientPacket(62, 3);
   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket IF_BUTTON8 = new ClientPacket(63, 8);
   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket IF_BUTTON1 = new ClientPacket(64, 8);
   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket RESUME_STRINGDIALOG = new ClientPacket(65, -1);
   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket EVENT_APPLET_FOCUS = new ClientPacket(66, 1);
   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket PING_STATISTICS = new ClientPacket(67, 10);
   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPLOCE = new ClientPacket(68, 2);
   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket IF_BUTTON10 = new ClientPacket(69, 8);
   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket IF_BUTTON2 = new ClientPacket(70, 8);
   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket IF_BUTTON6 = new ClientPacket(71, 8);
   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPLOC5 = new ClientPacket(72, 7);
   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket CHAT_SENDABUSEREPORT = new ClientPacket(73, -1);
   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket field3172 = new ClientPacket(74, 0);
   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket field3137 = new ClientPacket(75, 22);
   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket RESUME_PAUSEBUTTON = new ClientPacket(76, 6);
   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket EVENT_CAMERA_POSITION = new ClientPacket(77, 4);
   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPOBJE = new ClientPacket(78, 6);
   @ObfuscatedName("dw")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket IF_BUTTON3 = new ClientPacket(79, 8);
   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPNPC3 = new ClientPacket(80, 3);
   @ObfuscatedName("do")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPOBJ1 = new ClientPacket(81, 7);
   @ObfuscatedName("di")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket DOCHEAT = new ClientPacket(82, -1);
   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPNPC2 = new ClientPacket(83, 3);
   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket field3153 = new ClientPacket(84, -1);
   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket REFLECTION_CHECK_REPLY = new ClientPacket(85, -1);
   @ObfuscatedName("dt")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket CLAN_KICKUSER = new ClientPacket(86, -1);
   @ObfuscatedName("dv")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket field3185 = new ClientPacket(87, -1);
   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket LOGIN_TIMINGS = new ClientPacket(88, -1);
   @ObfuscatedName("dg")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket field3177 = new ClientPacket(89, -1);
   @ObfuscatedName("de")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPPLAYER1 = new ClientPacket(90, 3);
   @ObfuscatedName("dh")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPNPC1 = new ClientPacket(91, 3);
   @ObfuscatedName("dp")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket IF_BUTTON4 = new ClientPacket(92, 8);
   @ObfuscatedName("du")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket field3191 = new ClientPacket(93, 11);
   @ObfuscatedName("db")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket OPOBJ4 = new ClientPacket(94, 7);
   @ObfuscatedName("df")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   public static final ClientPacket field3193 = new ClientPacket(95, -1);
   @ObfuscatedName("dq")
   @ObfuscatedGetter(
      intValue = 1546470819
   )
   @Export("id")
   final int id;
   @ObfuscatedName("dd")
   @ObfuscatedGetter(
      intValue = -1619950699
   )
   @Export("length")
   final int length;

   ClientPacket(int var1, int var2) {
      this.id = var1;
      this.length = var2;
   }

   @ObfuscatedName("mp")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "2"
   )
   static void method5688() {
      for(InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
         int var1 = var0.group;
         if (SoundSystem.loadInterface(var1)) {
            boolean var2 = true;
            Widget[] var3 = VerticalAlignment.Widget_interfaceComponents[var1];

            int var4;
            for(var4 = 0; var4 < var3.length; ++var4) {
               if (var3[var4] != null) {
                  var2 = var3[var4].isIf3;
                  break;
               }
            }

            if (!var2) {
               var4 = (int)var0.key;
               Widget var5 = class165.getWidget(var4);
               if (var5 != null) {
                  class144.invalidateWidget(var5);
               }
            }
         }
      }

   }
}
