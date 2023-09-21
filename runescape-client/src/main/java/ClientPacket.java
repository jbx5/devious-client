import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ln")
@Implements("ClientPacket")
public class ClientPacket implements class307 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket EVENT_MOUSE_IDLE;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static final ClientPacket field3134;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3135;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3136;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPOBJE;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPNPCT;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static final ClientPacket field3139;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3140;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3141;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3137;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket PING_STATISTICS;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPNPC2;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket REFLECTION_CHECK_REPLY;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket FRIEND_DELUSER;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static final ClientPacket field3227;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3176;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3149;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static final ClientPacket field3133;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPLOCE;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket IF_BUTTON5;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3153;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3154;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket EVENT_CAMERA_POSITION;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3233;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPLOC5;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket IF_BUTTONT;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPPLAYER3;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket IF_BUTTON9;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket IF_BUTTON3;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPOBJ1;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket NO_TIMEOUT;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPPLAYER8;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket RESUME_PAUSEBUTTON;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPOBJ4;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket WIDGET_TYPE;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPNPC4;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket RESUME_OBJDIALOG;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket EVENT_APPLET_FOCUS;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPLOC1;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPLOC2;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPPLAYERT;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3174;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3175;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3197;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3188;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static final ClientPacket field3178;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3145;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPNPC3;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket EVENT_WINDOW_SETTING;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPPLAYER6;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket IF_BUTTON1;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket IF_BUTTON8;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket RESUME_STRINGDIALOG;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPPLAYER2;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket DOCHEAT;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket CLOSE_MODAL;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket RESUME_COUNTDIALOG;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket RESUME_NAMEDIALOG;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3191;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3192;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket IF_BUTTON7;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket EVENT_KEYBOARD;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3160;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket CLAN_KICKUSER;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPLOC3;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPPLAYER5;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPPLAYER4;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPNPCE;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket IGNORE_DELUSER;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPOBJ2;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPNPC1;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPPLAYER1;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket CHAT_SETFILTER;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket EVENT_MOUSE_CLICK;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket CHAT_SENDPRIVATE;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket IF_BUTTON4;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3209;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPPLAYER7;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket LOGIN_TIMINGS;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPLOC4;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket DETECT_MODIFIED_CLIENT;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3214;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket IF_BUTTON10;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket FREECAM_EXIT;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket IF_BUTTON2;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPNPC5;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPOBJ5;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket IF_BUTTON6;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket MOVE_GAMECLICK;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPOBJ3;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPLOCT;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3224;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3225;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket CHAT_SENDABUSEREPORT;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3150;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPOBJT;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket OPHELDD;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket FRIEND_ADDUSER;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -1749751835
	)
	@Export("id")
	final int id;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 1792610735
	)
	@Export("length")
	final int length;

	static {
		EVENT_MOUSE_IDLE = new ClientPacket(0, 0);
		field3134 = new ClientPacket(1, 7);
		field3135 = new ClientPacket(2, -1);
		field3136 = new ClientPacket(3, 1);
		OPOBJE = new ClientPacket(4, 6);
		OPNPCT = new ClientPacket(5, 11);
		field3139 = new ClientPacket(6, -1);
		field3140 = new ClientPacket(7, 13);
		field3141 = new ClientPacket(8, -1);
		field3137 = new ClientPacket(9, 22);
		PING_STATISTICS = new ClientPacket(10, 10);
		OPNPC2 = new ClientPacket(11, 3);
		REFLECTION_CHECK_REPLY = new ClientPacket(12, -1);
		FRIEND_DELUSER = new ClientPacket(13, -1);
		field3227 = new ClientPacket(14, -1);
		field3176 = new ClientPacket(15, 4);
		field3149 = new ClientPacket(16, 2);
		field3133 = new ClientPacket(17, 2);
		OPLOCE = new ClientPacket(18, 2);
		IF_BUTTON5 = new ClientPacket(19, 8);
		field3153 = new ClientPacket(20, 15);
		field3154 = new ClientPacket(21, 9);
		EVENT_CAMERA_POSITION = new ClientPacket(22, 4);
		field3233 = new ClientPacket(23, -1);
		OPLOC5 = new ClientPacket(24, 7);
		IF_BUTTONT = new ClientPacket(25, 16);
		OPPLAYER3 = new ClientPacket(26, 3);
		IF_BUTTON9 = new ClientPacket(27, 8);
		IF_BUTTON3 = new ClientPacket(28, 8);
		OPOBJ1 = new ClientPacket(29, 7);
		NO_TIMEOUT = new ClientPacket(30, 0);
		OPPLAYER8 = new ClientPacket(31, 3);
		RESUME_PAUSEBUTTON = new ClientPacket(32, 6);
		OPOBJ4 = new ClientPacket(33, 7);
		WIDGET_TYPE = new ClientPacket(34, 4);
		OPNPC4 = new ClientPacket(35, 3);
		RESUME_OBJDIALOG = new ClientPacket(36, 2);
		EVENT_APPLET_FOCUS = new ClientPacket(37, 1);
		OPLOC1 = new ClientPacket(38, 7);
		OPLOC2 = new ClientPacket(39, 7);
		OPPLAYERT = new ClientPacket(40, 11);
		field3174 = new ClientPacket(41, 0);
		field3175 = new ClientPacket(42, 1);
		field3197 = new ClientPacket(43, -1);
		field3188 = new ClientPacket(44, -1);
		field3178 = new ClientPacket(45, 2);
		field3145 = new ClientPacket(46, 11);
		OPNPC3 = new ClientPacket(47, 3);
		EVENT_WINDOW_SETTING = new ClientPacket(48, 5);
		OPPLAYER6 = new ClientPacket(49, 3);
		IF_BUTTON1 = new ClientPacket(50, 8);
		IF_BUTTON8 = new ClientPacket(51, 8);
		RESUME_STRINGDIALOG = new ClientPacket(52, -1);
		OPPLAYER2 = new ClientPacket(53, 3);
		DOCHEAT = new ClientPacket(54, -1);
		CLOSE_MODAL = new ClientPacket(55, 0);
		RESUME_COUNTDIALOG = new ClientPacket(56, 4);
		RESUME_NAMEDIALOG = new ClientPacket(57, -1);
		field3191 = new ClientPacket(58, -1);
		field3192 = new ClientPacket(59, -2);
		IF_BUTTON7 = new ClientPacket(60, 8);
		EVENT_KEYBOARD = new ClientPacket(61, -2);
		field3160 = new ClientPacket(62, 11);
		CLAN_KICKUSER = new ClientPacket(63, -1);
		OPLOC3 = new ClientPacket(64, 7);
		OPPLAYER5 = new ClientPacket(65, 3);
		OPPLAYER4 = new ClientPacket(66, 3);
		OPNPCE = new ClientPacket(67, 2);
		IGNORE_DELUSER = new ClientPacket(68, -1);
		OPOBJ2 = new ClientPacket(69, 7);
		OPNPC1 = new ClientPacket(70, 3);
		OPPLAYER1 = new ClientPacket(71, 3);
		CHAT_SETFILTER = new ClientPacket(72, 3);
		EVENT_MOUSE_CLICK = new ClientPacket(73, 6);
		CHAT_SENDPRIVATE = new ClientPacket(74, -2);
		IF_BUTTON4 = new ClientPacket(75, 8);
		field3209 = new ClientPacket(76, -1);
		OPPLAYER7 = new ClientPacket(77, 3);
		LOGIN_TIMINGS = new ClientPacket(78, -1);
		OPLOC4 = new ClientPacket(79, 7);
		DETECT_MODIFIED_CLIENT = new ClientPacket(80, 4);
		field3214 = new ClientPacket(81, -1);
		IF_BUTTON10 = new ClientPacket(82, 8);
		FREECAM_EXIT = new ClientPacket(83, 0);
		IF_BUTTON2 = new ClientPacket(84, 8);
		OPNPC5 = new ClientPacket(85, 3);
		OPOBJ5 = new ClientPacket(86, 7);
		IF_BUTTON6 = new ClientPacket(87, 8);
		MOVE_GAMECLICK = new ClientPacket(88, -1);
		OPOBJ3 = new ClientPacket(89, 7);
		OPLOCT = new ClientPacket(90, 15);
		field3224 = new ClientPacket(91, -1);
		field3225 = new ClientPacket(92, 15);
		CHAT_SENDABUSEREPORT = new ClientPacket(93, -1);
		field3150 = new ClientPacket(94, 4);
		OPOBJT = new ClientPacket(95, 15);
		OPHELDD = new ClientPacket(96, 16);
		FRIEND_ADDUSER = new ClientPacket(97, -1);
	}

	ClientPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "1044263127"
	)
	static int method5865(int var0, Script var1, boolean var2) {
		Widget var3 = class33.widgetDefinition.method6240(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = KitDefinition.Widget_unpackTargetMask(MouseRecorder.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "([Lnm;IB)V",
		garbageValue = "5"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						Interpreter.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					Interpreter.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = class33.widgetDefinition.method6240(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					Interpreter.runScriptEvent(var5);
				}
			}
		}

	}
}
