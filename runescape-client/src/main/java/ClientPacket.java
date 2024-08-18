import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
@Implements("ClientPacket")
public class ClientPacket implements class320 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket EVENT_WINDOW_SETTING;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPPLAYER3;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3306;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket IF_BUTTON10;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket RESUME_OBJDIALOG;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	static final ClientPacket field3263;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPPLAYER8;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	static final ClientPacket field3287;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3266;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	static final ClientPacket field3346;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPPLAYER5;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPOBJ4;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket REFLECTION_CHECK_REPLY;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket IF_BUTTON7;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPPLAYER2;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket LOGIN_TIMINGS;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPNPC2;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPNPC5;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket NO_TIMEOUT;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3359;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket IF_BUTTON5;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPLOC3;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket IF_BUTTON9;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket CHAT_SETFILTER;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPNPC1;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket EVENT_MOUSE_CLICK;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket CHAT_SENDABUSEREPORT;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket MOVE_GAMECLICK;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket EVENT_MOUSE_IDLE;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket PING_STATISTICS;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPHELDD;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPLOC4;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3290;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket RESUME_COUNTDIALOG;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3292;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3304;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3260;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3295;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPLOC1;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3297;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	static final ClientPacket field3298;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPOBJ3;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPLOC5;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket IF_BUTTON4;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3303;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket IGNORE_DELUSER;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket IF_BUTTON3;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPPLAYER4;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket DOCHEAT;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket DETECT_MODIFIED_CLIENT;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket EVENT_APPLET_FOCUS;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket FREECAM_EXIT;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPLOCE;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPOBJT;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket RESUME_PAUSEBUTTON;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPOBJ1;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3314;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3315;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket RESUME_NAMEDIALOG;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPLOCT;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket IF_BUTTONT;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPNPCT;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPOBJ5;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3321;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPLOC2;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3305;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPPLAYER7;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3283;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3265;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket IF_BUTTON1;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket CLAN_KICKUSER;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket WIDGET_TYPE;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPNPC4;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket CLOSE_MODAL;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3284;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	static final ClientPacket field3267;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket IF_BUTTON8;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3335;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket FRIEND_DELUSER;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket FRIEND_ADDUSER;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket RESUME_STRINGDIALOG;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket MINIMAP_CLICK;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3340;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPNPC3;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket IF_BUTTON2;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3343;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPPLAYER6;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket EVENT_CAMERA_POSITION;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3350;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket IF_BUTTON6;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3348;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPNPCE;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPOBJE;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket CHAT_SENDPRIVATE;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPPLAYERT;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPOBJ2;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3354;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket EVENT_KEYBOARD;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket field3356;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final ClientPacket OPPLAYER1;
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	static Archive field3331;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -63361197
	)
	@Export("id")
	final int id;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -2054646611
	)
	@Export("length")
	final int length;

	static {
		EVENT_WINDOW_SETTING = new ClientPacket(0, 5);
		OPPLAYER3 = new ClientPacket(1, 3);
		field3306 = new ClientPacket(2, -1);
		IF_BUTTON10 = new ClientPacket(3, 8);
		RESUME_OBJDIALOG = new ClientPacket(4, 2);
		field3263 = new ClientPacket(5, 7);
		OPPLAYER8 = new ClientPacket(6, 3);
		field3287 = new ClientPacket(7, 2);
		field3266 = new ClientPacket(8, 4);
		field3346 = new ClientPacket(9, -1);
		OPPLAYER5 = new ClientPacket(10, 3);
		OPOBJ4 = new ClientPacket(11, 7);
		REFLECTION_CHECK_REPLY = new ClientPacket(12, -1);
		IF_BUTTON7 = new ClientPacket(13, 8);
		OPPLAYER2 = new ClientPacket(14, 3);
		LOGIN_TIMINGS = new ClientPacket(15, -1);
		OPNPC2 = new ClientPacket(16, 3);
		OPNPC5 = new ClientPacket(17, 3);
		NO_TIMEOUT = new ClientPacket(18, 0);
		field3359 = new ClientPacket(19, 2);
		IF_BUTTON5 = new ClientPacket(20, 8);
		OPLOC3 = new ClientPacket(21, 7);
		IF_BUTTON9 = new ClientPacket(22, 8);
		CHAT_SETFILTER = new ClientPacket(23, 3);
		OPNPC1 = new ClientPacket(24, 3);
		EVENT_MOUSE_CLICK = new ClientPacket(25, 6);
		CHAT_SENDABUSEREPORT = new ClientPacket(26, -1);
		MOVE_GAMECLICK = new ClientPacket(27, -1);
		EVENT_MOUSE_IDLE = new ClientPacket(28, 0);
		PING_STATISTICS = new ClientPacket(29, 10);
		OPHELDD = new ClientPacket(30, 16);
		OPLOC4 = new ClientPacket(31, 7);
		field3290 = new ClientPacket(32, -1);
		RESUME_COUNTDIALOG = new ClientPacket(33, 4);
		field3292 = new ClientPacket(34, 15);
		field3304 = new ClientPacket(35, 9);
		field3260 = new ClientPacket(36, 11);
		field3295 = new ClientPacket(37, 11);
		OPLOC1 = new ClientPacket(38, 7);
		field3297 = new ClientPacket(39, 15);
		field3298 = new ClientPacket(40, -1);
		OPOBJ3 = new ClientPacket(41, 7);
		OPLOC5 = new ClientPacket(42, 7);
		IF_BUTTON4 = new ClientPacket(43, 8);
		field3303 = new ClientPacket(44, 1);
		IGNORE_DELUSER = new ClientPacket(45, -1);
		IF_BUTTON3 = new ClientPacket(46, 8);
		OPPLAYER4 = new ClientPacket(47, 3);
		DOCHEAT = new ClientPacket(48, -1);
		DETECT_MODIFIED_CLIENT = new ClientPacket(49, 4);
		EVENT_APPLET_FOCUS = new ClientPacket(50, 1);
		FREECAM_EXIT = new ClientPacket(51, 0);
		OPLOCE = new ClientPacket(52, 2);
		OPOBJT = new ClientPacket(53, 15);
		RESUME_PAUSEBUTTON = new ClientPacket(54, 6);
		OPOBJ1 = new ClientPacket(55, 7);
		field3314 = new ClientPacket(56, -1);
		field3315 = new ClientPacket(57, -2);
		RESUME_NAMEDIALOG = new ClientPacket(58, -1);
		OPLOCT = new ClientPacket(59, 15);
		IF_BUTTONT = new ClientPacket(60, 16);
		OPNPCT = new ClientPacket(61, 11);
		OPOBJ5 = new ClientPacket(62, 7);
		field3321 = new ClientPacket(63, 0);
		OPLOC2 = new ClientPacket(64, 7);
		field3305 = new ClientPacket(65, 22);
		OPPLAYER7 = new ClientPacket(66, 3);
		field3283 = new ClientPacket(67, -1);
		field3265 = new ClientPacket(68, 4);
		IF_BUTTON1 = new ClientPacket(69, 8);
		CLAN_KICKUSER = new ClientPacket(70, -1);
		WIDGET_TYPE = new ClientPacket(71, 4);
		OPNPC4 = new ClientPacket(72, 3);
		CLOSE_MODAL = new ClientPacket(73, 0);
		field3284 = new ClientPacket(74, -1);
		field3267 = new ClientPacket(75, 2);
		IF_BUTTON8 = new ClientPacket(76, 8);
		field3335 = new ClientPacket(77, -1);
		FRIEND_DELUSER = new ClientPacket(78, -1);
		FRIEND_ADDUSER = new ClientPacket(79, -1);
		RESUME_STRINGDIALOG = new ClientPacket(80, -1);
		MINIMAP_CLICK = new ClientPacket(81, -1);
		field3340 = new ClientPacket(82, -1);
		OPNPC3 = new ClientPacket(83, 3);
		IF_BUTTON2 = new ClientPacket(84, 8);
		field3343 = new ClientPacket(85, -1);
		OPPLAYER6 = new ClientPacket(86, 3);
		EVENT_CAMERA_POSITION = new ClientPacket(87, 4);
		field3350 = new ClientPacket(88, 10);
		IF_BUTTON6 = new ClientPacket(89, 8);
		field3348 = new ClientPacket(90, 13);
		OPNPCE = new ClientPacket(91, 2);
		OPOBJE = new ClientPacket(92, 6);
		CHAT_SENDPRIVATE = new ClientPacket(93, -2);
		OPPLAYERT = new ClientPacket(94, 11);
		OPOBJ2 = new ClientPacket(95, 7);
		field3354 = new ClientPacket(96, 1);
		EVENT_KEYBOARD = new ClientPacket(97, -2);
		field3356 = new ClientPacket(98, 26);
		OPPLAYER1 = new ClientPacket(99, 3);
	}

	ClientPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-2039867117"
	)
	static void method6153(int var0, String var1) {
		Login.Login_loadingText = var1;
		Login.Login_loadingPercent = var0;
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Lkh;B)V",
		garbageValue = "36"
	)
	static void method6154(class266 var0) {
		if (var0 != null && var0.field2915 != null) {
			if (var0.field2915.childIndex >= 0) {
				Widget var1 = FloorUnderlayDefinition.widgetDefinition.method6544(var0.field2915.parentId);
				if (var1 == null || var1.children == null || var1.children.length == 0 || var0.field2915.childIndex >= var1.children.length || var0.field2915 != var1.children[var0.field2915.childIndex]) {
					return;
				}
			}

			if (var0.field2915.type == 11 && var0.field2914 == 0) {
				if (var0.field2915.method6959(var0.field2912, var0.field2913, 0, 0)) {
					var0.field2915.method7043().method4551().method4622(1, var0.field2915.method7043().method4521());
					switch(var0.field2915.method6963()) {
					case 0:
						SequenceDefinition.openURL(var0.field2915.method6965(), true, false);
						break;
					case 1:
						if (class155.method3410(SpriteMask.getWidgetFlags(var0.field2915))) {
							int[] var4 = var0.field2915.method7060();
							if (var4 != null) {
								PacketBufferNode var2 = class218.getPacketBufferNode(field3305, Client.packetWriter.isaacCipher);
								var2.packetBuffer.writeShortLE(var0.field2915.childIndex);
								var2.packetBuffer.writeInt(var4[1]);
								var2.packetBuffer.writeIntIME(var0.field2915.method6964());
								var2.packetBuffer.writeIntME(var4[0]);
								var2.packetBuffer.writeIntLE(var0.field2915.id);
								var2.packetBuffer.writeIntLE(var4[2]);
								Client.packetWriter.addNode(var2);
							}
						}
					}
				}
			} else if (var0.field2915.type == 12) {
				class358 var3 = var0.field2915.method6971();
				if (var3 != null && var3.method6692()) {
					switch(var0.field2914) {
					case 0:
						Client.field735.method5318(var0.field2915);
						var3.method6640(true);
						var3.method6679(var0.field2912, var0.field2913, Client.indexCheck.isValidIndexInRange(82), Client.indexCheck.isValidIndexInRange(81));
						break;
					case 1:
						var3.method6680(var0.field2912, var0.field2913);
					}
				}
			}

		}
	}
}
