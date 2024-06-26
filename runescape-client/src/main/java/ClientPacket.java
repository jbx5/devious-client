import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mi")
@Implements("ClientPacket")
public class ClientPacket implements class318 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket RESUME_PAUSEBUTTON;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket EVENT_KEYBOARD;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	static final ClientPacket field3329;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket RESUME_STRINGDIALOG;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket field3282;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPNPCE;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	static final ClientPacket field3284;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket DOCHEAT;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket field3286;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPOBJ3;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPOBJT;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket field3348;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket REFLECTION_CHECK_REPLY;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket FRIEND_DELUSER;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPOBJ5;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket IF_BUTTONT;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket IF_BUTTON5;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket IF_BUTTON6;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket EVENT_MOUSE_CLICK;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPLOC3;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket field3298;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket field3299;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket EVENT_WINDOW_SETTING;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPPLAYER8;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket field3302;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket DETECT_MODIFIED_CLIENT;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket IF_BUTTON2;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPOBJ2;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket field3306;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket IF_BUTTON1;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket field3366;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket RESUME_NAMEDIALOG;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPNPC1;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket IF_BUTTON10;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPNPC3;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPLOCT;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPNPC5;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket field3280;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPLOC1;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket field3342;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket field3318;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket IF_BUTTON4;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket LOGIN_TIMINGS;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPHELDD;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket NO_TIMEOUT;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPPLAYER2;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPPLAYER4;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPOBJ4;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPLOCE;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket field3327;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPPLAYER7;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	static final ClientPacket field3313;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket field3330;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket IF_BUTTON8;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket CHAT_SETFILTER;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPNPCT;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket MOVE_GAMECLICK;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPLOC5;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket IF_BUTTON7;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket RESUME_OBJDIALOG;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket field3338;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket field3339;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket MINIMAP_CLICK;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	static final ClientPacket field3376;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket field3314;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPLOC2;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPPLAYER5;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPPLAYER1;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPOBJ1;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPOBJE;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket field3317;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket CHAT_SENDABUSEREPORT;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket FRIEND_ADDUSER;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket WIDGET_TYPE;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket CHAT_SENDPRIVATE;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket EVENT_APPLET_FOCUS;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPPLAYERT;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket IF_BUTTON9;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket IGNORE_DELUSER;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket field3357;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket CLAN_KICKUSER;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket RESUME_COUNTDIALOG;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket PING_STATISTICS;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket FREECAM_EXIT;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPNPC4;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket field3363;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket EVENT_CAMERA_POSITION;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket field3365;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket field3295;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPPLAYER6;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket EVENT_MOUSE_IDLE;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPLOC4;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPNPC2;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPPLAYER3;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	static final ClientPacket field3373;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket CLOSE_MODAL;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket IF_BUTTON3;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket field3375;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 109366263
	)
	@Export("id")
	final int id;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -1258603577
	)
	@Export("length")
	final int length;

	static {
		RESUME_PAUSEBUTTON = new ClientPacket(0, 6);
		EVENT_KEYBOARD = new ClientPacket(1, -2);
		field3329 = new ClientPacket(2, -1);
		RESUME_STRINGDIALOG = new ClientPacket(3, -1);
		field3282 = new ClientPacket(4, 4);
		OPNPCE = new ClientPacket(5, 2);
		field3284 = new ClientPacket(6, 2);
		DOCHEAT = new ClientPacket(7, -1);
		field3286 = new ClientPacket(8, -1);
		OPOBJ3 = new ClientPacket(9, 7);
		OPOBJT = new ClientPacket(10, 15);
		field3348 = new ClientPacket(11, -1);
		REFLECTION_CHECK_REPLY = new ClientPacket(12, -1);
		FRIEND_DELUSER = new ClientPacket(13, -1);
		OPOBJ5 = new ClientPacket(14, 7);
		IF_BUTTONT = new ClientPacket(15, 16);
		IF_BUTTON5 = new ClientPacket(16, 8);
		IF_BUTTON6 = new ClientPacket(17, 8);
		EVENT_MOUSE_CLICK = new ClientPacket(18, 6);
		OPLOC3 = new ClientPacket(19, 7);
		field3298 = new ClientPacket(20, -1);
		field3299 = new ClientPacket(21, 13);
		EVENT_WINDOW_SETTING = new ClientPacket(22, 5);
		OPPLAYER8 = new ClientPacket(23, 3);
		field3302 = new ClientPacket(24, -1);
		DETECT_MODIFIED_CLIENT = new ClientPacket(25, 4);
		IF_BUTTON2 = new ClientPacket(26, 8);
		OPOBJ2 = new ClientPacket(27, 7);
		field3306 = new ClientPacket(28, 15);
		IF_BUTTON1 = new ClientPacket(29, 8);
		field3366 = new ClientPacket(30, 22);
		RESUME_NAMEDIALOG = new ClientPacket(31, -1);
		OPNPC1 = new ClientPacket(32, 3);
		IF_BUTTON10 = new ClientPacket(33, 8);
		OPNPC3 = new ClientPacket(34, 3);
		OPLOCT = new ClientPacket(35, 15);
		OPNPC5 = new ClientPacket(36, 3);
		field3280 = new ClientPacket(37, 1);
		OPLOC1 = new ClientPacket(38, 7);
		field3342 = new ClientPacket(39, -1);
		field3318 = new ClientPacket(40, 11);
		IF_BUTTON4 = new ClientPacket(41, 8);
		LOGIN_TIMINGS = new ClientPacket(42, -1);
		OPHELDD = new ClientPacket(43, 16);
		NO_TIMEOUT = new ClientPacket(44, 0);
		OPPLAYER2 = new ClientPacket(45, 3);
		OPPLAYER4 = new ClientPacket(46, 3);
		OPOBJ4 = new ClientPacket(47, 7);
		OPLOCE = new ClientPacket(48, 2);
		field3327 = new ClientPacket(49, -2);
		OPPLAYER7 = new ClientPacket(50, 3);
		field3313 = new ClientPacket(51, -1);
		field3330 = new ClientPacket(52, 1);
		IF_BUTTON8 = new ClientPacket(53, 8);
		CHAT_SETFILTER = new ClientPacket(54, 3);
		OPNPCT = new ClientPacket(55, 11);
		MOVE_GAMECLICK = new ClientPacket(56, -1);
		OPLOC5 = new ClientPacket(57, 7);
		IF_BUTTON7 = new ClientPacket(58, 8);
		RESUME_OBJDIALOG = new ClientPacket(59, 2);
		field3338 = new ClientPacket(60, 9);
		field3339 = new ClientPacket(61, 4);
		MINIMAP_CLICK = new ClientPacket(62, -1);
		field3376 = new ClientPacket(63, 2);
		field3314 = new ClientPacket(64, -1);
		OPLOC2 = new ClientPacket(65, 7);
		OPPLAYER5 = new ClientPacket(66, 3);
		OPPLAYER1 = new ClientPacket(67, 3);
		OPOBJ1 = new ClientPacket(68, 7);
		OPOBJE = new ClientPacket(69, 6);
		field3317 = new ClientPacket(70, 0);
		CHAT_SENDABUSEREPORT = new ClientPacket(71, -1);
		FRIEND_ADDUSER = new ClientPacket(72, -1);
		WIDGET_TYPE = new ClientPacket(73, 4);
		CHAT_SENDPRIVATE = new ClientPacket(74, -2);
		EVENT_APPLET_FOCUS = new ClientPacket(75, 1);
		OPPLAYERT = new ClientPacket(76, 11);
		IF_BUTTON9 = new ClientPacket(77, 8);
		IGNORE_DELUSER = new ClientPacket(78, -1);
		field3357 = new ClientPacket(79, 2);
		CLAN_KICKUSER = new ClientPacket(80, -1);
		RESUME_COUNTDIALOG = new ClientPacket(81, 4);
		PING_STATISTICS = new ClientPacket(82, 10);
		FREECAM_EXIT = new ClientPacket(83, 0);
		OPNPC4 = new ClientPacket(84, 3);
		field3363 = new ClientPacket(85, 15);
		EVENT_CAMERA_POSITION = new ClientPacket(86, 4);
		field3365 = new ClientPacket(87, -1);
		field3295 = new ClientPacket(88, 11);
		OPPLAYER6 = new ClientPacket(89, 3);
		EVENT_MOUSE_IDLE = new ClientPacket(90, 0);
		OPLOC4 = new ClientPacket(91, 7);
		OPNPC2 = new ClientPacket(92, 3);
		OPPLAYER3 = new ClientPacket(93, 3);
		field3373 = new ClientPacket(94, 7);
		CLOSE_MODAL = new ClientPacket(95, 0);
		IF_BUTTON3 = new ClientPacket(96, 8);
		field3375 = new ClientPacket(97, -1);
	}

	ClientPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Loi;",
		garbageValue = "26"
	)
	public static GameBuild method6091(int var0) {
		GameBuild[] var1 = WallDecoration.method6029();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			GameBuild var3 = var1[var2];
			if (var0 == var3.buildId) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1268230275"
	)
	public static int method6093(int var0) {
		class142 var1 = class138.method3190(var0);
		if (var1 == null) {
			return 2;
		} else {
			return var1.method3231() ? 0 : 1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZB)I",
		garbageValue = "-92"
	)
	static int method6090(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = ModeWhere.widgetDefinition.method6519(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = ModeWhere.widgetDefinition.method6519(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_HASSUB) {
			int var5 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5);
			if (var4 != null) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTOP) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.rootInterface;
			return 1;
		} else if (var0 == 2707) {
			var3 = ModeWhere.widgetDefinition.method6519(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.method6949() ? 1 : 0;
			return 1;
		} else if (var0 == 2708) {
			var3 = ModeWhere.widgetDefinition.method6519(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
			return class324.method6115(var3);
		} else if (var0 == 2709) {
			var3 = ModeWhere.widgetDefinition.method6519(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
			return AbstractByteArrayCopier.method7026(var3);
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1642751815"
	)
	static void method6092(int var0, int var1) {
		int var2 = ParamComposition.fontBold12.stringWidth("Choose Option");

		int var3;
		int var4;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) {
			var4 = ParamComposition.fontBold12.stringWidth(WorldMapIcon_1.method4580(var3));
			if (var4 > var2) {
				var2 = var4;
			}
		}

		var2 += 8;
		var3 = Client.menuOptionsCount * 15 + 22;
		var4 = var0 - var2 / 2;
		if (var4 + var2 > class74.canvasWidth) {
			var4 = class74.canvasWidth - var2;
		}

		if (var4 < 0) {
			var4 = 0;
		}

		int var5 = var1;
		if (var3 + var1 > class1.canvasHeight) {
			var5 = class1.canvasHeight - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		class105.menuX = var4;
		UserComparator9.menuY = var5;
		class330.menuWidth = var2;
		IntProjection.menuHeight = Client.menuOptionsCount * 15 + 22;
	}
}
