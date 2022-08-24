import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("jb")
@Implements("ClientPacket")
public class ClientPacket implements class261 {
	@ObfuscatedName("vz")
	@ObfuscatedSignature(descriptor = "Los;")
	@Export("worldMap")
	static WorldMap worldMap;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPOBJ4 = new ClientPacket(0, 7);

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2916 = new ClientPacket(1, 8);

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPPLAYER8 = new ClientPacket(2, 3);

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket EVENT_KEYBOARD = new ClientPacket(3, -2);

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2919 = new ClientPacket(4, 22);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Ljb;")
	static final ClientPacket field2920 = new ClientPacket(5, 7);

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket EVENT_MOUSE_IDLE = new ClientPacket(6, 0);

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPNPC4 = new ClientPacket(7, 3);

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2972 = new ClientPacket(8, -1);

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket CLAN_LEAVECHAT = new ClientPacket(9, -1);

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket CHAT_SETFILTER = new ClientPacket(10, 3);

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket IF_BUTTON3 = new ClientPacket(11, 8);

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket REFLECTION_CHECK_REPLY = new ClientPacket(12, -1);

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket IF_BUTTON4 = new ClientPacket(13, 8);

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket FREECAM_EXIT = new ClientPacket(14, 0);

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket EVENT_CAMERA_POSITION = new ClientPacket(15, 4);

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPNPC2 = new ClientPacket(16, 3);

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2932 = new ClientPacket(17, 13);

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket IF_BUTTON2 = new ClientPacket(18, 8);

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket LOGIN_TIMINGS = new ClientPacket(19, -1);

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket IF_BUTTON5 = new ClientPacket(20, 8);

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPPLAYERT = new ClientPacket(21, 11);

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket IF_BUTTON7 = new ClientPacket(22, 8);

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket EVENT_APPLET_FOCUS = new ClientPacket(23, 1);

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket DOCHEAT = new ClientPacket(24, -1);

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPLOCT = new ClientPacket(25, 15);

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPOBJ1 = new ClientPacket(26, 7);

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = "Ljb;")
	static final ClientPacket field2942 = new ClientPacket(27, -1);

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPLOC3 = new ClientPacket(28, 7);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2938 = new ClientPacket(29, 8);

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket IF_BUTTON9 = new ClientPacket(30, 8);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2946 = new ClientPacket(31, -1);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field3023 = new ClientPacket(32, 8);

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2948 = new ClientPacket(33, 0);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPLOCE = new ClientPacket(34, 2);

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field3001 = new ClientPacket(35, 8);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPNPC5 = new ClientPacket(36, 3);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPPLAYER6 = new ClientPacket(37, 3);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPPLAYER1 = new ClientPacket(38, 3);

	@ObfuscatedName("af")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPLOC2 = new ClientPacket(39, 7);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPLOC4 = new ClientPacket(40, 7);

	@ObfuscatedName("ai")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2956 = new ClientPacket(41, 14);

	@ObfuscatedName("ap")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPLOC5 = new ClientPacket(42, 7);

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2958 = new ClientPacket(43, 15);

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPPLAYER2 = new ClientPacket(44, 3);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2960 = new ClientPacket(45, -1);

	@ObfuscatedName("aa")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket MOVE_GAMECLICK = new ClientPacket(46, -1);

	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket FRIEND_DELUSER = new ClientPacket(47, -1);

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2963 = new ClientPacket(48, 8);

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2964 = new ClientPacket(49, 11);

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPPLAYER7 = new ClientPacket(50, 3);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2918 = new ClientPacket(51, 8);

	@ObfuscatedName("bq")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket RESUME_PAUSEBUTTON = new ClientPacket(52, 6);

	@ObfuscatedName("bn")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPPLAYER4 = new ClientPacket(53, 3);

	@ObfuscatedName("bl")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2969 = new ClientPacket(54, 8);

	@ObfuscatedName("bv")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket RESUME_NAMEDIALOG = new ClientPacket(55, -1);

	@ObfuscatedName("bu")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket IF_BUTTONT = new ClientPacket(56, 16);

	@ObfuscatedName("bb")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket IF_BUTTON1 = new ClientPacket(57, 8);

	@ObfuscatedName("bt")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket IF_BUTTON10 = new ClientPacket(58, 8);

	@ObfuscatedName("bw")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field3016 = new ClientPacket(59, 16);

	@ObfuscatedName("bd")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPPLAYER5 = new ClientPacket(60, 3);

	@ObfuscatedName("bg")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2976 = new ClientPacket(61, 11);

	@ObfuscatedName("by")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2977 = new ClientPacket(62, 8);

	@ObfuscatedName("bs")
	@ObfuscatedSignature(descriptor = "Ljb;")
	static final ClientPacket field2978 = new ClientPacket(63, -1);

	@ObfuscatedName("br")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2979 = new ClientPacket(64, 15);

	@ObfuscatedName("bx")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2980 = new ClientPacket(65, 4);

	@ObfuscatedName("ba")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPPLAYER3 = new ClientPacket(66, 3);

	@ObfuscatedName("bh")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2947 = new ClientPacket(67, -1);

	@ObfuscatedName("bc")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket RESUME_COUNTDIALOG = new ClientPacket(68, 4);

	@ObfuscatedName("bm")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2984 = new ClientPacket(69, -1);

	@ObfuscatedName("bp")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2985 = new ClientPacket(70, -1);

	@ObfuscatedName("bz")
	@ObfuscatedSignature(descriptor = "Ljb;")
	static final ClientPacket field2986 = new ClientPacket(71, -1);

	@ObfuscatedName("bo")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket RESUME_STRINGDIALOG = new ClientPacket(72, -1);

	@ObfuscatedName("bi")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket RESUME_OBJDIALOG = new ClientPacket(73, 2);

	@ObfuscatedName("bj")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPOBJ3 = new ClientPacket(74, 7);

	@ObfuscatedName("be")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket EVENT_WINDOW_SETTING = new ClientPacket(75, 5);

	@ObfuscatedName("bk")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket PING_STATISTICS = new ClientPacket(76, 10);

	@ObfuscatedName("bf")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPNPC3 = new ClientPacket(77, 3);

	@ObfuscatedName("ce")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2974 = new ClientPacket(78, -1);

	@ObfuscatedName("cb")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPOBJE = new ClientPacket(79, 2);

	@ObfuscatedName("co")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2945 = new ClientPacket(80, 8);

	@ObfuscatedName("cl")
	@ObfuscatedSignature(descriptor = "Ljb;")
	static final ClientPacket field2951 = new ClientPacket(81, 6);

	@ObfuscatedName("cf")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2944 = new ClientPacket(82, 4);

	@ObfuscatedName("ch")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPOBJ2 = new ClientPacket(83, 7);

	@ObfuscatedName("cq")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPLOC1 = new ClientPacket(84, 7);

	@ObfuscatedName("ci")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket IF_BUTTON6 = new ClientPacket(85, 8);

	@ObfuscatedName("cx")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2987 = new ClientPacket(86, -1);

	@ObfuscatedName("cc")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket IF_BUTTOND = new ClientPacket(87, 9);

	@ObfuscatedName("cm")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket IGNORE_DELUSER = new ClientPacket(88, -1);

	@ObfuscatedName("cn")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket IF_BUTTON8 = new ClientPacket(89, 8);

	@ObfuscatedName("cj")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field3005 = new ClientPacket(90, -2);

	@ObfuscatedName("ct")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket NO_TIMEOUT = new ClientPacket(91, 0);

	@ObfuscatedName("cp")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket CHAT_SENDPRIVATE = new ClientPacket(92, -2);

	@ObfuscatedName("cr")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPOBJ5 = new ClientPacket(93, 7);

	@ObfuscatedName("cs")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket FRIEND_ADDUSER = new ClientPacket(94, -1);

	@ObfuscatedName("cy")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket EVENT_MOUSE_CLICK = new ClientPacket(95, 6);

	@ObfuscatedName("cw")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPHELDD = new ClientPacket(96, 16);

	@ObfuscatedName("cg")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket DETECT_MODIFIED_CLIENT = new ClientPacket(97, 4);

	@ObfuscatedName("cd")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket CLOSE_MODAL = new ClientPacket(98, 0);

	@ObfuscatedName("cz")
	@ObfuscatedSignature(descriptor = "Ljb;")
	static final ClientPacket field3014 = new ClientPacket(99, 2);

	@ObfuscatedName("cu")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPNPC1 = new ClientPacket(100, 3);

	@ObfuscatedName("ca")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field2996 = new ClientPacket(101, 8);

	@ObfuscatedName("cv")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket CLAN_KICKUSER = new ClientPacket(102, -1);

	@ObfuscatedName("ck")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPOBJT = new ClientPacket(103, 15);

	@ObfuscatedName("du")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPNPCT = new ClientPacket(104, 11);

	@ObfuscatedName("di")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket CHAT_SENDABUSEREPORT = new ClientPacket(105, -1);

	@ObfuscatedName("dw")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket OPNPCE = new ClientPacket(106, 2);

	@ObfuscatedName("dy")
	@ObfuscatedSignature(descriptor = "Ljb;")
	public static final ClientPacket field3022 = new ClientPacket(107, 9);

	@ObfuscatedName("dv")
	@ObfuscatedGetter(intValue = 164940899)
	@Export("id")
	final int id;

	@ObfuscatedName("dd")
	@ObfuscatedGetter(intValue = -114749835)
	@Export("length")
	final int length;

	ClientPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)[Lkp;", garbageValue = "902941339")
	public static StudioGame[] method5129() {
		return new StudioGame[]{ StudioGame.game5, StudioGame.stellardawn, StudioGame.runescape, StudioGame.game3, StudioGame.oldscape, StudioGame.game4 };
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIB)V", garbageValue = "91")
	static final void method5130(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		CollisionMap.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, false);
	}
}