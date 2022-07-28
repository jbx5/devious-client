import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("jr")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket NPC_INFO_LARGE_VIEWPORT_1 = new ServerPacket(0, -2);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket SYNC_CLIENT_VARCACHE = new ServerPacket(1, 0);

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3061 = new ServerPacket(2, -2);

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3073 = new ServerPacket(3, 5);

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3041 = new ServerPacket(4, -2);

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket CHAT_FILTER_SETTINGS = new ServerPacket(5, 2);

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3043 = new ServerPacket(6, -2);

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3044 = new ServerPacket(7, -2);

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket NPC_INFO_SMALL_VIEWPORT_1 = new ServerPacket(8, -2);

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3046 = new ServerPacket(9, 15);

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3047 = new ServerPacket(10, 3);

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket IF_SETANGLE = new ServerPacket(11, 10);

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3049 = new ServerPacket(12, 4);

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3131 = new ServerPacket(13, 2);

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket UPDATE_STOCKMARKET_SLOT = new ServerPacket(14, 20);

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3115 = new ServerPacket(15, -1);

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket NPC_SPOTANIM = new ServerPacket(16, 8);

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3054 = new ServerPacket(17, 4);

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket CAM_SETANGLE = new ServerPacket(18, 6);

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(19, 2);

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket NPC_INFO_LARGE_VIEWPORT_2 = new ServerPacket(20, -2);

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3058 = new ServerPacket(21, 0);

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket REBUILD_REGION = new ServerPacket(22, -2);

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket UPDATE_UID192 = new ServerPacket(23, 28);

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket MESSAGE_GAME = new ServerPacket(24, -1);

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket RUNCLIENTSCRIPT = new ServerPacket(25, -2);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3063 = new ServerPacket(26, 2);

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3064 = new ServerPacket(27, 2);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3065 = new ServerPacket(28, 5);

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3066 = new ServerPacket(29, 8);

	@ObfuscatedName("af")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket SET_PLAYER_OP = new ServerPacket(30, -1);

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket IF_SETOBJECT = new ServerPacket(31, 10);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3069 = new ServerPacket(32, 7);

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket UPDATE_IGNORELIST = new ServerPacket(33, -2);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3094 = new ServerPacket(34, 0);

	@ObfuscatedName("ai")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket UPDATE_STAT = new ServerPacket(35, 6);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket IF_SETHIDE = new ServerPacket(36, 5);

	@ObfuscatedName("ap")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket PLAYER_SPOTANIM = new ServerPacket(37, 8);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket PLAYER_INFO = new ServerPacket(38, -2);

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket UPDATE_REBOOT_TIMER = new ServerPacket(39, 2);

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3096 = new ServerPacket(40, 4);

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket IF_SETANIM = new ServerPacket(41, 6);

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket EVENT_WORLDHOP = new ServerPacket(42, -1);

	@ObfuscatedName("aa")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket PING_STATISTICS_REQUEST = new ServerPacket(43, 8);

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket PROJECTILE_SPAWN = new ServerPacket(44, 17);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket MESSAGE_PRIVATE = new ServerPacket(45, -2);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket IF_MOVESUB = new ServerPacket(46, 8);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket MESSAGE_PRIVATE_ECHO = new ServerPacket(47, -2);

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket NPC_INFO_SMALL_VIEWPORT_2 = new ServerPacket(48, -2);

	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3086 = new ServerPacket(49, 4);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3081 = new ServerPacket(50, 0);

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3088 = new ServerPacket(51, 4);

	@ObfuscatedName("bz")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket IF_SETNPCHEAD = new ServerPacket(52, 6);

	@ObfuscatedName("bs")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3077 = new ServerPacket(53, -1);

	@ObfuscatedName("bg")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3091 = new ServerPacket(54, 2);

	@ObfuscatedName("bv")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket IF_SETPOSITION = new ServerPacket(55, 8);

	@ObfuscatedName("ba")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket LOGOUT = new ServerPacket(56, 1);

	@ObfuscatedName("bd")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket IF_SETMODEL = new ServerPacket(57, 6);

	@ObfuscatedName("bf")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket UPDATE_FRIENDLIST = new ServerPacket(58, -2);

	@ObfuscatedName("bu")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket GRAPHICSOBJECT_SPAWN = new ServerPacket(59, 8);

	@ObfuscatedName("bk")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3097 = new ServerPacket(60, -1);

	@ObfuscatedName("bq")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3107 = new ServerPacket(61, 5);

	@ObfuscatedName("bj")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3099 = new ServerPacket(62, 14);

	@ObfuscatedName("bt")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3087 = new ServerPacket(63, 0);

	@ObfuscatedName("bp")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket IF_SETSCROLLPOS = new ServerPacket(64, 6);

	@ObfuscatedName("br")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(65, -2);

	@ObfuscatedName("be")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket DYNAMICOBJECT_SPAWN = new ServerPacket(66, 6);

	@ObfuscatedName("bx")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket RESET_CLIENT_VARCACHE = new ServerPacket(67, 0);

	@ObfuscatedName("bb")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3105 = new ServerPacket(68, 5);

	@ObfuscatedName("by")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3133 = new ServerPacket(69, -2);

	@ObfuscatedName("bh")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket MINIMAP_FLAG_SET = new ServerPacket(70, 2);

	@ObfuscatedName("bc")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3108 = new ServerPacket(71, -2);

	@ObfuscatedName("bo")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3109 = new ServerPacket(72, 1);

	@ObfuscatedName("bw")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket IF_SETPLAYERHEAD = new ServerPacket(73, 4);

	@ObfuscatedName("bm")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket UPDATE_INV_STOP_TRANSIT = new ServerPacket(74, 2);

	@ObfuscatedName("bl")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3060 = new ServerPacket(75, 6);

	@ObfuscatedName("bn")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket UPDATE_INV_CLEAR = new ServerPacket(76, 4);

	@ObfuscatedName("bi")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket MINIMAP_TOGGLE = new ServerPacket(77, 1);

	@ObfuscatedName("ch")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket VARP_LARGE = new ServerPacket(78, 6);

	@ObfuscatedName("cd")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket LOGOUT_FULL = new ServerPacket(79, 0);

	@ObfuscatedName("ci")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket CAM_RESET = new ServerPacket(80, 0);

	@ObfuscatedName("cp")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket TRIGGER_ONDIALOG_ABORT = new ServerPacket(81, 0);

	@ObfuscatedName("cg")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3119 = new ServerPacket(82, -2);

	@ObfuscatedName("cj")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket IF_CLOSESUB = new ServerPacket(83, 4);

	@ObfuscatedName("cz")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket SET_PRIVCHATMODE = new ServerPacket(84, 1);

	@ObfuscatedName("ck")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket UPDATE_INV_FULL = new ServerPacket(85, -2);

	@ObfuscatedName("cs")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket CAM_LOOKAT = new ServerPacket(86, 6);

	@ObfuscatedName("ca")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket VARP_SMALL = new ServerPacket(87, 3);

	@ObfuscatedName("cq")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket IF_SETCOLOUR = new ServerPacket(88, 6);

	@ObfuscatedName("cy")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3126 = new ServerPacket(89, -1);

	@ObfuscatedName("cw")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket HINT_ARROW = new ServerPacket(90, 6);

	@ObfuscatedName("co")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket UPDATE_INV_PARTIAL = new ServerPacket(91, -2);

	@ObfuscatedName("cr")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3129 = new ServerPacket(92, -2);

	@ObfuscatedName("ct")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3140 = new ServerPacket(93, -2);

	@ObfuscatedName("cl")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3114 = new ServerPacket(94, -1);

	@ObfuscatedName("cn")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket MIDI_SONG = new ServerPacket(95, 2);

	@ObfuscatedName("cu")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket REBUILD_NORMAL = new ServerPacket(96, -2);

	@ObfuscatedName("ce")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket REFLECTION_CHECKER = new ServerPacket(97, -2);

	@ObfuscatedName("cv")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3071 = new ServerPacket(98, 7);

	@ObfuscatedName("cx")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket NPC_SET_SEQUENCE = new ServerPacket(99, 5);

	@ObfuscatedName("cc")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3137 = new ServerPacket(100, 1);

	@ObfuscatedName("cm")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket URL_OPEN = new ServerPacket(101, -2);

	@ObfuscatedName("cb")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket MESSAGE_FRIENDS_CHAT = new ServerPacket(102, -1);

	@ObfuscatedName("cf")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3039 = new ServerPacket(103, 1);

	@ObfuscatedName("dz")
	@ObfuscatedSignature(descriptor = "Ljr;")
	public static final ServerPacket field3141 = new ServerPacket(104, 12);

	@ObfuscatedName("dc")
	@ObfuscatedGetter(intValue = 1613812205)
	@Export("id")
	public final int id;

	@ObfuscatedName("dh")
	@ObfuscatedGetter(intValue = -1292556653)
	@Export("length")
	public final int length;

	ServerPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(Lmx;Lmx;Lmx;B)V", garbageValue = "121")
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class352.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		Login.loginBoxCenter = Login.loginBoxX + 180;
		if (Login.worldSelectOpen) {
			class388.method7058(var0, var1);
		} else {
			SpriteMask.leftTitleSprite.drawAt(Login.xPadding, 0);
			class356.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Canvas.logoSprite.drawAt(Login.xPadding + 382 - Canvas.logoSprite.subWidth / 2, 18);
			int var3;
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) {
				var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}
			String var5;
			String var6;
			short var16;
			if (Client.gameState == 20) {
				class7.titleboxSprite.drawAt(Login.loginBoxX + 180 - class7.titleboxSprite.subWidth / 2, 271 - class7.titleboxSprite.subHeight / 2);
				var3 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var3, 16776960, 0);
				var3 += 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16776960, 0);
				var3 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16776960, 0);
				var3 += 15;
				var3 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var3, 16777215, 0);
					var16 = 200;
					for (var5 = VerticalAlignment.method3505(); var0.stringWidth(var5) > var16; var5 = var5.substring(0, var5.length() - 1)) {
					}
					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var3, 16777215, 0);
					var3 += 15;
					for (var6 = Calendar.method5512(Login.Login_password); var0.stringWidth(var6) > var16; var6 = var6.substring(1)) {
					}
					var0.draw("Password: " + var6, Login.loginBoxX + 180 - 108, var3, 16777215, 0);
					var3 += 15;
				}
			}
			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
				class7.titleboxSprite.drawAt(Login.loginBoxX, 171);
				int var11;
				short var17;
				if (Login.loginIndex == 0) {
					var17 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var17, 16776960, 0);
					var3 = var17 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var11 = 291;
					class229.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
					var0.drawLines("New User", var4 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					class229.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
					var0.drawLines("Existing User", var4 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var17 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var17, 16777215, 0);
					var3 = var17 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16777215, 0);
					var3 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16777215, 0);
					var3 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var11 = 321;
					class229.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
					var0.drawCentered("Continue", var4, var11 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					class229.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
					var0.drawCentered("Cancel", var4, var11 + 5, 16777215, 0);
				} else {
					int var7;
					if (Login.loginIndex == 2) {
						var17 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxCenter, var17, 16776960, 0);
						var3 = var17 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxCenter, var3, 16776960, 0);
						var3 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxCenter, var3, 16776960, 0);
						var3 += 15;
						var3 += 7;
						var0.draw("Login: ", Login.loginBoxCenter - 110, var3, 16777215, 0);
						var16 = 200;
						for (var5 = VerticalAlignment.method3505(); var0.stringWidth(var5) > var16; var5 = var5.substring(1)) {
						}
						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class82.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter - 70, var3, 16777215, 0);
						var3 += 15;
						for (var6 = Calendar.method5512(Login.Login_password); var0.stringWidth(var6) > var16; var6 = var6.substring(1)) {
						}
						var0.draw("Password: " + var6 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class82.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter - 108, var3, 16777215, 0);
						var3 += 15;
						var17 = 277;
						var7 = Login.loginBoxCenter + -117;
						IndexedSprite var14 = DynamicObject.method2045(Client.Login_isUsernameRemembered, Login.field892);
						var14.drawAt(var7, var17);
						var7 = var7 + var14.subWidth + 5;
						var1.draw("Remember username", var7, var17 + 13, 16776960, 0);
						var7 = Login.loginBoxCenter + 24;
						var14 = DynamicObject.method2045(class260.clientPreferences.method2326(), Login.field918);
						var14.drawAt(var7, var17);
						var7 = var7 + var14.subWidth + 5;
						var1.draw("Hide username", var7, var17 + 13, 16776960, 0);
						var3 = var17 + 15;
						int var9 = Login.loginBoxCenter - 80;
						short var10 = 321;
						class229.titlebuttonSprite.drawAt(var9 - 73, var10 - 20);
						var0.drawCentered("Login", var9, var10 + 5, 16777215, 0);
						var9 = Login.loginBoxCenter + 80;
						class229.titlebuttonSprite.drawAt(var9 - 73, var10 - 20);
						var0.drawCentered("Cancel", var9, var10 + 5, 16777215, 0);
						var17 = 357;
						switch (Login.field919) {
							case 2 :
								FaceNormal.field2446 = "Having trouble logging in?";
								break;
							default :
								FaceNormal.field2446 = "Can't login? Click here.";
						}
						KitDefinition.field1860 = new Bounds(Login.loginBoxCenter, var17, var1.stringWidth(FaceNormal.field2446), 11);
						WorldMapSectionType.field2781 = new Bounds(Login.loginBoxCenter, var17, var1.stringWidth("Still having trouble logging in?"), 11);
						var1.drawCentered(FaceNormal.field2446, Login.loginBoxCenter, var17, 16777215, 0);
					} else if (Login.loginIndex == 3) {
						var17 = 201;
						var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var17, 16776960, 0);
						var3 = var17 + 20;
						var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var3, 16776960, 0);
						var3 += 15;
						var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var3, 16776960, 0);
						var3 += 15;
						var4 = Login.loginBoxX + 180;
						var11 = 276;
						class229.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
						var2.drawCentered("Try again", var4, var11 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var11 = 326;
						class229.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
						var2.drawCentered("Forgotten password?", var4, var11 + 5, 16777215, 0);
					} else {
						short var8;
						if (Login.loginIndex == 4) {
							var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
							var17 = 236;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var17, 16777215, 0);
							var3 = var17 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16777215, 0);
							var3 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16777215, 0);
							var3 += 15;
							var0.draw("PIN: " + Calendar.method5512(Login.otp) + (Client.cycle % 40 < 20 ? class82.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var3, 16777215, 0);
							var3 -= 8;
							var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var3, 16776960, 0);
							var3 += 15;
							var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var3, 16776960, 0);
							var4 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15;
							var11 = var3 - var0.ascent;
							IndexedSprite var18;
							if (Login.field893) {
								var18 = Login.options_buttons_2Sprite;
							} else {
								var18 = class11.options_buttons_0Sprite;
							}
							var18.drawAt(var4, var11);
							var3 += 15;
							var7 = Login.loginBoxX + 180 - 80;
							var8 = 321;
							class229.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
							var0.drawCentered("Continue", var7, var8 + 5, 16777215, 0);
							var7 = Login.loginBoxX + 180 + 80;
							class229.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
							var0.drawCentered("Cancel", var7, var8 + 5, 16777215, 0);
							var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var8 + 36, 255, 0);
						} else if (Login.loginIndex == 5) {
							var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
							var17 = 221;
							var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var17, 16776960, 0);
							var3 = var17 + 15;
							var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16776960, 0);
							var3 += 15;
							var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16776960, 0);
							var3 += 15;
							var3 += 14;
							var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var3, 16777215, 0);
							var16 = 174;
							for (var5 = VerticalAlignment.method3505(); var0.stringWidth(var5) > var16; var5 = var5.substring(1)) {
							}
							var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? class82.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var3, 16777215, 0);
							var3 += 15;
							int var13 = Login.loginBoxX + 180 - 80;
							short var19 = 321;
							class229.titlebuttonSprite.drawAt(var13 - 73, var19 - 20);
							var0.drawCentered("Recover", var13, var19 + 5, 16777215, 0);
							var13 = Login.loginBoxX + 180 + 80;
							class229.titlebuttonSprite.drawAt(var13 - 73, var19 - 20);
							var0.drawCentered("Back", var13, var19 + 5, 16777215, 0);
							var19 = 356;
							var1.drawCentered("Still having trouble logging in?", Login.loginBoxCenter, var19, 268435455, 0);
						} else {
							short var20;
							if (Login.loginIndex == 6) {
								var17 = 201;
								var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var17, 16776960, 0);
								var3 = var17 + 15;
								var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16776960, 0);
								var3 += 15;
								var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16776960, 0);
								var3 += 15;
								var4 = Login.loginBoxX + 180;
								var20 = 321;
								class229.titlebuttonSprite.drawAt(var4 - 73, var20 - 20);
								var0.drawCentered("Back", var4, var20 + 5, 16777215, 0);
							} else if (Login.loginIndex == 7) {
								if (FriendsChat.field4305 && !Client.onMobile) {
									var17 = 201;
									var0.drawCentered(Login.Login_response1, Login.loginBoxCenter, var17, 16776960, 0);
									var3 = var17 + 15;
									var0.drawCentered(Login.Login_response2, Login.loginBoxCenter, var3, 16776960, 0);
									var3 += 15;
									var0.drawCentered(Login.Login_response3, Login.loginBoxCenter, var3, 16776960, 0);
									var4 = Login.loginBoxCenter - 150;
									var3 += 10;
									for (var11 = 0; var11 < 8; ++var11) {
										class229.titlebuttonSprite.method8148(var4, var3, 30, 40);
										boolean var21 = var11 == Login.field912 & Client.cycle % 40 < 20;
										var0.draw((Login.field901[var11] == null ? "" : Login.field901[var11]) + (var21 ? class82.colorStartTag(16776960) + "|" : ""), var4 + 10, var3 + 27, 16777215, 0);
										if (var11 != 1 && var11 != 3) {
											var4 += 35;
										} else {
											var4 += 50;
											var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var3 + 27, 16777215, 0);
										}
									}
									var11 = Login.loginBoxCenter - 80;
									short var22 = 321;
									class229.titlebuttonSprite.drawAt(var11 - 73, var22 - 20);
									var0.drawCentered("Submit", var11, var22 + 5, 16777215, 0);
									var11 = Login.loginBoxCenter + 80;
									class229.titlebuttonSprite.drawAt(var11 - 73, var22 - 20);
									var0.drawCentered("Cancel", var11, var22 + 5, 16777215, 0);
								} else {
									var17 = 216;
									var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var17, 16776960, 0);
									var3 = var17 + 15;
									var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var3, 16776960, 0);
									var3 += 15;
									var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var3, 16776960, 0);
									var3 += 15;
									var4 = Login.loginBoxX + 180 - 80;
									var20 = 321;
									class229.titlebuttonSprite.drawAt(var4 - 73, var20 - 20);
									var0.drawCentered("Set Date of Birth", var4, var20 + 5, 16777215, 0);
									var4 = Login.loginBoxX + 180 + 80;
									class229.titlebuttonSprite.drawAt(var4 - 73, var20 - 20);
									var0.drawCentered("Back", var4, var20 + 5, 16777215, 0);
								}
							} else if (Login.loginIndex == 8) {
								var17 = 216;
								var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var17, 16776960, 0);
								var3 = var17 + 15;
								var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var3, 16776960, 0);
								var3 += 15;
								var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var3, 16776960, 0);
								var3 += 15;
								var4 = Login.loginBoxX + 180 - 80;
								var20 = 321;
								class229.titlebuttonSprite.drawAt(var4 - 73, var20 - 20);
								var0.drawCentered("Privacy Policy", var4, var20 + 5, 16777215, 0);
								var4 = Login.loginBoxX + 180 + 80;
								class229.titlebuttonSprite.drawAt(var4 - 73, var20 - 20);
								var0.drawCentered("Back", var4, var20 + 5, 16777215, 0);
							} else if (Login.loginIndex == 9) {
								var17 = 221;
								var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var17, 16776960, 0);
								var3 = var17 + 25;
								var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16776960, 0);
								var3 += 25;
								var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16776960, 0);
								var4 = Login.loginBoxX + 180;
								var20 = 311;
								class229.titlebuttonSprite.drawAt(var4 - 73, var20 - 20);
								var0.drawCentered("Try again", var4, var20 + 5, 16777215, 0);
							} else if (Login.loginIndex == 10) {
								var3 = Login.loginBoxX + 180;
								var16 = 209;
								var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var16, 16776960, 0);
								var4 = var16 + 20;
								class342.field4165.drawAt(var3 - 109, var4);
								Login.field896.drawAt(var3 - 48, var4 + 18);
							} else if (Login.loginIndex == 12) {
								var3 = Login.loginBoxCenter;
								var16 = 216;
								var2.drawCentered("Before using this app, please read and accept our", var3, var16, 16777215, 0);
								var4 = var16 + 17;
								var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var3, var4, 16777215, 0);
								var4 += 17;
								var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var3, var4, 16777215, 0);
								var4 += 17;
								var2.drawCentered("By accepting, you agree to these documents.", var3, var4, 16777215, 0);
								var3 = Login.loginBoxCenter - 80;
								var16 = 311;
								class229.titlebuttonSprite.drawAt(var3 - 73, var16 - 20);
								var0.drawCentered("Accept", var3, var16 + 5, 16777215, 0);
								var3 = Login.loginBoxCenter + 80;
								class229.titlebuttonSprite.drawAt(var3 - 73, var16 - 20);
								var0.drawCentered("Decline", var3, var16 + 5, 16777215, 0);
							} else if (Login.loginIndex == 13) {
								var17 = 231;
								var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var17, 16777215, 0);
								var3 = var17 + 20;
								var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var3, 16777215, 0);
								var4 = Login.loginBoxX + 180;
								var17 = 311;
								class229.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
								var0.drawCentered("Back", var4, var17 + 5, 16777215, 0);
							} else if (Login.loginIndex == 14) {
								var17 = 201;
								String var12 = "";
								var5 = "";
								var6 = "";
								switch (Login.field906) {
									case 0 :
										var12 = "Your account has been involved";
										var5 = "in serious rule breaking.";
										var6 = "";
										break;
									case 1 :
										var12 = "Account locked as we suspect it has been stolen.";
										var5 = Strings.field3728;
										var6 = "";
										break;
									case 2 :
										var12 = "The unpaid balance on your account needs";
										var5 = "to be resolved before you can play.";
										var6 = Strings.field3725;
										break;
									default :
										class152.Login_promptCredentials(false);
								}
								var0.drawCentered(var12, Login.loginBoxX + 180, var17, 16776960, 0);
								var3 = var17 + 20;
								var0.drawCentered(var5, Login.loginBoxX + 180, var3, 16776960, 0);
								var3 += 20;
								var0.drawCentered(var6, Login.loginBoxX + 180, var3, 16776960, 0);
								var7 = Login.loginBoxX + 180;
								var8 = 276;
								class229.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
								var0.drawCentered("Support Page", var7, var8 + 5, 16777215, 0);
								var7 = Login.loginBoxX + 180;
								var8 = 326;
								class229.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
								var0.drawCentered("Back", var7, var8 + 5, 16777215, 0);
							} else if (Login.loginIndex == 24) {
								var17 = 221;
								var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var17, 16777215, 0);
								var3 = var17 + 15;
								var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16777215, 0);
								var3 += 15;
								var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16777215, 0);
								var3 += 15;
								var4 = Login.loginBoxX + 180;
								var20 = 301;
								class229.titlebuttonSprite.drawAt(var4 - 73, var20 - 20);
								var0.drawCentered("Ok", var4, var20 + 5, 16777215, 0);
							} else if (Login.loginIndex == 26) {
								var17 = 216;
								var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var17, 16776960, 0);
								var3 = var17 + 15;
								var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var3, 16776960, 0);
								var3 += 15;
								var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var3, 16776960, 0);
								var3 += 15;
								var4 = Login.loginBoxX + 180 - 80;
								var20 = 321;
								class229.titlebuttonSprite.drawAt(var4 - 73, var20 - 20);
								var0.drawCentered("Set Date of Birth", var4, var20 + 5, 16777215, 0);
								var4 = Login.loginBoxX + 180 + 80;
								class229.titlebuttonSprite.drawAt(var4 - 73, var20 - 20);
								var0.drawCentered("Back", var4, var20 + 5, 16777215, 0);
							}
						}
					}
				}
			}
			if (Client.gameState >= 10) {
				int[] var15 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var15);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class228.canvasHeight);
				RouteStrategy.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				RouteStrategy.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var15);
			}
			Login.title_muteSprite[class260.clientPreferences.method2316() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && class21.clientLanguage == Language.Language_EN) {
				if (Login.field931 != null) {
					var3 = Login.xPadding + 5;
					var16 = 463;
					byte var24 = 100;
					byte var23 = 35;
					Login.field931.drawAt(var3, var16);
					var0.drawCentered("World" + " " + Client.worldId, var24 / 2 + var3, var23 / 2 + var16 - 2, 16777215, 0);
					if (class144.World_request != null) {
						var1.drawCentered("Loading...", var24 / 2 + var3, var23 / 2 + var16 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var24 / 2 + var3, var23 / 2 + var16 + 12, 16777215, 0);
					}
				} else {
					Login.field931 = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(AbstractWorldMapData.archive8, "sl_button", "");
				}
			}
		}
	}
}