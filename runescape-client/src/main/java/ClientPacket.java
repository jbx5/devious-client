import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("ClientPacket")
public class ClientPacket implements class262 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket FREECAM_EXIT = new ClientPacket(0, 0);
	@ObfuscatedName("p")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket EVENT_KEYBOARD = new ClientPacket(1, -2);
	@ObfuscatedName("f")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket IGNORE_DELUSER = new ClientPacket(2, -1);
	@ObfuscatedName("n")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field3023 = new ClientPacket(3, 4);
	@ObfuscatedName("k")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field2952 = new ClientPacket(4, -1);
	@ObfuscatedName("w")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field3025 = new ClientPacket(5, -1);
	@ObfuscatedName("s")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket RESUME_COUNTDIALOG = new ClientPacket(6, 4);
	@ObfuscatedName("q")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPPLAYER8 = new ClientPacket(7, 3);
	@ObfuscatedName("m")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket REFLECTION_CHECK_REPLY = new ClientPacket(8, -1);
	@ObfuscatedName("x")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPOBJ2 = new ClientPacket(9, 7);
	@ObfuscatedName("j")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field2960 = new ClientPacket(10, -1);
	@ObfuscatedName("v")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field2953 = new ClientPacket(11, 8);
	@ObfuscatedName("h")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field2963 = new ClientPacket(12, -1);
	@ObfuscatedName("t")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPNPCT = new ClientPacket(13, 11);
	@ObfuscatedName("u")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPHELDD = new ClientPacket(14, 16);
	@ObfuscatedName("d")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field2973 = new ClientPacket(15, 15);
	@ObfuscatedName("b")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket RESUME_PAUSEBUTTON = new ClientPacket(16, 6);
	@ObfuscatedName("a")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket CLOSE_MODAL = new ClientPacket(17, 0);
	@ObfuscatedName("l")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPNPC4 = new ClientPacket(18, 3);
	@ObfuscatedName("e")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPOBJT = new ClientPacket(19, 15);
	@ObfuscatedName("g")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket EVENT_WINDOW_SETTING = new ClientPacket(20, 5);
	@ObfuscatedName("y")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket EVENT_MOUSE_IDLE = new ClientPacket(21, 0);
	@ObfuscatedName("i")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPLOC3 = new ClientPacket(22, 7);
	@ObfuscatedName("r")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket IF_BUTTON8 = new ClientPacket(23, 8);
	@ObfuscatedName("z")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPNPC2 = new ClientPacket(24, 3);
	@ObfuscatedName("o")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPNPC5 = new ClientPacket(25, 3);
	@ObfuscatedName("as")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	static final ClientPacket field2968 = new ClientPacket(26, -1);
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPPLAYER3 = new ClientPacket(27, 3);
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket IF_BUTTON1 = new ClientPacket(28, 8);
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPPLAYER6 = new ClientPacket(29, 3);
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket RESUME_OBJDIALOG = new ClientPacket(30, 2);
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	static final ClientPacket field3004 = new ClientPacket(31, -1);
	@ObfuscatedName("an")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPLOCT = new ClientPacket(32, 15);
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPPLAYER4 = new ClientPacket(33, 3);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field2975 = new ClientPacket(34, 8);
	@ObfuscatedName("am")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPLOC5 = new ClientPacket(35, 7);
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket RESUME_STRINGDIALOG = new ClientPacket(36, -1);
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket PING_STATISTICS = new ClientPacket(37, 10);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket IF_BUTTON9 = new ClientPacket(38, 8);
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPLOC2 = new ClientPacket(39, 7);
	@ObfuscatedName("af")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field2971 = new ClientPacket(40, 0);
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field2977 = new ClientPacket(41, -1);
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field2936 = new ClientPacket(42, 11);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket IF_BUTTON4 = new ClientPacket(43, 8);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field2981 = new ClientPacket(44, 16);
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPPLAYER2 = new ClientPacket(45, 3);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPOBJE = new ClientPacket(46, 6);
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket IF_BUTTON2 = new ClientPacket(47, 8);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPPLAYER5 = new ClientPacket(48, 3);
	@ObfuscatedName("at")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPPLAYERT = new ClientPacket(49, 11);
	@ObfuscatedName("al")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket NO_TIMEOUT = new ClientPacket(50, 0);
	@ObfuscatedName("au")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket IF_BUTTONT = new ClientPacket(51, 16);
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field2984 = new ClientPacket(52, 11);
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	static final ClientPacket field2985 = new ClientPacket(53, -1);
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket CHAT_SENDABUSEREPORT = new ClientPacket(54, -1);
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket FRIEND_SETRANK = new ClientPacket(55, -1);
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field2987 = new ClientPacket(56, 8);
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field2990 = new ClientPacket(57, 8);
	@ObfuscatedName("by")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket CLAN_KICKUSER = new ClientPacket(58, -1);
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPOBJ5 = new ClientPacket(59, 7);
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPLOCE = new ClientPacket(60, 2);
	@ObfuscatedName("br")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPPLAYER7 = new ClientPacket(61, 3);
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	static final ClientPacket field2998 = new ClientPacket(62, 2);
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field2999 = new ClientPacket(63, 8);
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket CHAT_SETFILTER = new ClientPacket(64, 3);
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field3001 = new ClientPacket(65, 8);
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket BUG_REPORT = new ClientPacket(66, -2);
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket EVENT_CAMERA_POSITION = new ClientPacket(67, 4);
	@ObfuscatedName("be")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPNPC1 = new ClientPacket(68, 3);
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket EVENT_APPLET_FOCUS = new ClientPacket(69, 1);
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPOBJ4 = new ClientPacket(70, 7);
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field3007 = new ClientPacket(71, 15);
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field3045 = new ClientPacket(72, 9);
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket RESUME_NAMEDIALOG = new ClientPacket(73, -1);
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket IF_BUTTON10 = new ClientPacket(74, 8);
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPPLAYER1 = new ClientPacket(75, 3);
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket IF_BUTTON3 = new ClientPacket(76, 8);
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	static final ClientPacket field2997 = new ClientPacket(77, 7);
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket IF_BUTTON6 = new ClientPacket(78, 8);
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field3000 = new ClientPacket(79, -1);
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field2940 = new ClientPacket(80, 8);
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket IF_BUTTON7 = new ClientPacket(81, 8);
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field3005 = new ClientPacket(82, 2);
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field2954 = new ClientPacket(83, 8);
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket IF_BUTTOND = new ClientPacket(84, 9);
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field3014 = new ClientPacket(85, 4);
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPLOC4 = new ClientPacket(86, 7);
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field3017 = new ClientPacket(87, 8);
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field2946 = new ClientPacket(88, 13);
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket LOGIN_TIMINGS = new ClientPacket(89, -1);
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPOBJ3 = new ClientPacket(90, 7);
	@ObfuscatedName("co")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket IF_BUTTON5 = new ClientPacket(91, 8);
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket CHAT_SENDPRIVATE = new ClientPacket(92, -2);
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPOBJ1 = new ClientPacket(93, 7);
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket FRIEND_ADDUSER = new ClientPacket(94, -1);
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket DOCHEAT = new ClientPacket(95, -1);
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field3026 = new ClientPacket(96, -1);
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket MOVE_GAMECLICK = new ClientPacket(97, -1);
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPNPC3 = new ClientPacket(98, 3);
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPNPCE = new ClientPacket(99, 2);
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket FRIEND_DELUSER = new ClientPacket(100, -1);
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket IGNORE_ADDUSER = new ClientPacket(101, -1);
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field3037 = new ClientPacket(102, 14);
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket EVENT_MOUSE_CLICK = new ClientPacket(103, 6);
	@ObfuscatedName("db")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field3035 = new ClientPacket(104, 8);
	@ObfuscatedName("df")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket DETECT_MODIFIED_CLIENT = new ClientPacket(105, 4);
	@ObfuscatedName("du")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket OPLOC1 = new ClientPacket(106, 7);
	@ObfuscatedName("da")
	@ObfuscatedSignature(
			descriptor = "Ljf;"
	)
	public static final ClientPacket field2994 = new ClientPacket(107, 22);
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
			intValue = -1198668971
	)
	@Export("id")
	final int id;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
			intValue = 1792994671
	)
	@Export("length")
	final int length;

	ClientPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
			descriptor = "(I)[I",
			garbageValue = "-1572617485"
	)
	public static int[] method5341() {
		int[] var0 = new int[KeyHandler.field123];

		for(int var1 = 0; var1 < KeyHandler.field123; ++var1) {
			var0[var1] = KeyHandler.field143[var1];
		}

		return var0;
	}
}
