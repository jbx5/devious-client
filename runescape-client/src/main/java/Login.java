import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("Login")
public class Login {
	@ObfuscatedName("c")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	2022945893)

	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"[Lqq;")

	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Lqq;")

	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lqq;")

	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 
	-1514793593)

	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 
	66055169)

	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("z")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("au")
	@ObfuscatedGetter(intValue = 
	688596069)

	@Export("Login_banType")
	static int Login_banType;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(intValue = 
	-547641813)

	static int field895;
	@ObfuscatedName("az")
	@ObfuscatedGetter(intValue = 
	-1615096635)

	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("as")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("aa")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("bj")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("bm")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("br")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("bo")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("be")
	@ObfuscatedGetter(intValue = 
	326073325)

	static int field903;
	@ObfuscatedName("bh")
	static String[] field904;
	@ObfuscatedName("by")
	static boolean field909;
	@ObfuscatedName("bt")
	static boolean field906;
	@ObfuscatedName("bp")
	static boolean field907;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(intValue = 
	1549221867)

	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("cm")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(intValue = 
	-1213239867)

	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(intValue = 
	-418396213)

	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("co")
	@ObfuscatedGetter(intValue = 
	-2129612195)

	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(longValue = 
	-2025470405168207311L)

	static long field915;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(longValue = 
	679387299211312041L)

	static long field916;
	@ObfuscatedName("cr")
	static String[] field917;
	@ObfuscatedName("cq")
	static String[] field918;
	static 
	{
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		Login_banType = -1;
		field895 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field903 = 0;
		field904 = new String[8];
		field909 = false;
		field906 = false;
		field907 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class120();
		field915 = -1L;
		field916 = -1L;
		field917 = new String[]{ "title.jpg" };
		field918 = new String[]{ "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"2061264207")

	static void method1960() {
		ByteArrayPool.field4167.clear();
		ByteArrayPool.field4167.add(100);
		ByteArrayPool.field4167.add(5000);
		ByteArrayPool.field4167.add(10000);
		ByteArrayPool.field4167.add(30000);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Lpz;ILcz;II)V", garbageValue = 
	"540363482")

	static final void method1932(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class193.field2186.field2183;
		if ((var3 & 8192) != 0) {
			var2.field1167 = Client.cycle + var0.readUnsignedShortAdd();
			var2.field1168 = Client.cycle + var0.readUnsignedShortLE();
			var2.field1169 = var0.readByteNeg();
			var2.field1114 = var0.readByteNeg();
			var2.field1171 = var0.readByteSub();
			var2.field1122 = ((byte) (var0.readUnsignedByteNeg()));
		}

		if ((var3 & 256) != 0) {
			var4 = var0.readByteSub();
		}

		int var5;
		int var8;
		int var9;
		int var12;
		if ((var3 & 1) != 0) {
			var5 = var0.readUnsignedShortLE();
			PlayerType var6 = ((PlayerType) (MusicPatchPcmStream.findEnumerated(WorldMapManager.PlayerType_values(), var0.readUnsignedByte())));
			boolean var7 = var0.readUnsignedByteSub() == 1;
			var8 = var0.readUnsignedByteSub();
			var9 = var0.offset;
			if ((var2.username != null) && (var2.appearance != null)) {
				boolean var10 = false;
				if (var6.isUser && Decimator.friendSystem.isIgnored(var2.username)) {
					var10 = true;
				}

				if (((!var10) && (Client.field618 == 0)) && (!var2.isHidden)) {
					Players.field1273.offset = 0;
					var0.readBytesReversed(Players.field1273.array, 0, var8);
					Players.field1273.offset = 0;
					String var11 = AbstractFont.escapeBrackets(MouseHandler.method584(class193.method3883(Players.field1273)));
					var2.overheadText = var11.trim();
					var2.overheadTextColor = var5 >> 8;
					var2.overheadTextEffect = var5 & 255;
					var2.overheadTextCyclesRemaining = 150;
					var2.isAutoChatting = var7;
					var2.field1130 = (((var2 != GrandExchangeEvents.localPlayer) && var6.isUser) && ("" != Client.field728)) && (var11.toLowerCase().indexOf(Client.field728) == (-1));
					if (var6.isPrivileged) {
						var12 = (var7) ? 91 : 1;
					} else {
						var12 = (var7) ? 90 : 2;
					}

					if (var6.modIcon != (-1)) {
						Actor.addGameMessage(var12, Script.method1990(var6.modIcon) + var2.username.getName(), var11);
					} else {
						Actor.addGameMessage(var12, var2.username.getName(), var11);
					}
				}
			}

			var0.offset = var8 + var9;
		}

		if ((var3 & 2048) != 0) {
			for (var5 = 0; var5 < 3; ++var5) {
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 4096) != 0) {
			var2.spotAnimation = var0.readUnsignedShortLE();
			var5 = var0.readUnsignedIntLE();
			var2.spotAnimationHeight = var5 >> 16;
			var2.field1134 = (var5 & 65535) + Client.cycle;
			var2.spotAnimationFrame = 0;
			var2.spotAnimationFrameCycle = 0;
			if (var2.field1134 > Client.cycle) {
				var2.spotAnimationFrame = -1;
			}

			if (var2.spotAnimation == 65535) {
				var2.spotAnimation = -1;
			}
		}

		if ((var3 & 128) != 0) {
			var5 = var0.readUnsignedByteSub();
			byte[] var17 = new byte[var5];
			Buffer var13 = new Buffer(var17);
			var0.readBytesReversed(var17, 0, var5);
			Players.field1276[var1] = var13;
			var2.read(var13);
		}

		if ((var3 & 512) != 0) {
			var2.field1129 = var0.readByteAdd();
			var2.field1160 = var0.readByte();
			var2.field1132 = var0.readByteSub();
			var2.field1161 = var0.readByteNeg();
			var2.field1143 = var0.readUnsignedShortAdd() + Client.cycle;
			var2.field1163 = var0.readUnsignedShortAddLE() + Client.cycle;
			var2.field1135 = var0.readUnsignedShortLE();
			if (var2.field1070) {
				var2.field1129 += var2.tileX;
				var2.field1160 += var2.tileY;
				var2.field1132 += var2.tileX;
				var2.field1161 += var2.tileY;
				var2.pathLength = 0;
			} else {
				var2.field1129 += var2.pathX[0];
				var2.field1160 += var2.pathY[0];
				var2.field1132 += var2.pathX[0];
				var2.field1161 += var2.pathY[0];
				var2.pathLength = 1;
			}

			var2.field1170 = 0;
		}

		if ((var3 & 16) != 0) {
			var2.field1121 = var0.readUnsignedShort();
			if (var2.pathLength == 0) {
				var2.orientation = var2.field1121;
				var2.field1121 = -1;
			}
		}

		if ((var3 & 2) != 0) {
			var2.overheadText = var0.readStringCp1252NullTerminated();
			if (var2.overheadText.charAt(0) == '~') {
				var2.overheadText = var2.overheadText.substring(1);
				Actor.addGameMessage(2, var2.username.getName(), var2.overheadText);
			} else if (var2 == GrandExchangeEvents.localPlayer) {
				Actor.addGameMessage(2, var2.username.getName(), var2.overheadText);
			}

			var2.isAutoChatting = false;
			var2.overheadTextColor = 0;
			var2.overheadTextEffect = 0;
			var2.overheadTextCyclesRemaining = 150;
		}

		int var14;
		if ((var3 & 8) != 0) {
			var5 = var0.readUnsignedShortAddLE();
			if (var5 == 65535) {
				var5 = -1;
			}

			var14 = var0.readUnsignedByteSub();
			GrandExchangeOfferOwnWorldComparator.performPlayerAnimation(var2, var5, var14);
		}

		if ((var3 & 16384) != 0) {
			class193[] var15 = Players.field1286;
			class193[] var21 = new class193[]{ class193.field2185, class193.field2187, class193.field2186, class193.field2184 };
			var15[var1] = ((class193) (MusicPatchPcmStream.findEnumerated(var21, var0.readByteNeg())));
		}

		if ((var3 & 32) != 0) {
			var2.targetIndex = var0.readUnsignedShortLE();
			if (var2.targetIndex == 65535) {
				var2.targetIndex = -1;
			}
		}

		if ((var3 & 4) != 0) {
			var5 = var0.readUnsignedByteNeg();
			int var16;
			int var19;
			int var20;
			if (var5 > 0) {
				for (var14 = 0; var14 < var5; ++var14) {
					var8 = -1;
					var9 = -1;
					var20 = -1;
					var19 = var0.readUShortSmart();
					if (var19 == 32767) {
						var19 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						var8 = var0.readUShortSmart();
						var20 = var0.readUShortSmart();
					} else if (var19 != 32766) {
						var9 = var0.readUShortSmart();
					} else {
						var19 = -1;
					}

					var16 = var0.readUShortSmart();
					var2.addHitSplat(var19, var9, var8, var20, Client.cycle, var16);
				}
			}

			var14 = var0.readUnsignedByte();
			if (var14 > 0) {
				for (var19 = 0; var19 < var14; ++var19) {
					var8 = var0.readUShortSmart();
					var9 = var0.readUShortSmart();
					if (var9 != 32767) {
						var20 = var0.readUShortSmart();
						var16 = var0.readUnsignedByte();
						var12 = (var9 > 0) ? var0.readUnsignedByteNeg() : var16;
						var2.addHealthBar(var8, Client.cycle, var9, var20, var16, var12);
					} else {
						var2.removeHealthBar(var8);
					}
				}
			}
		}

		if (var2.field1070) {
			if (var4 == 127) {
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class193 var22;
				if (var4 != class193.field2186.field2183) {
					class193[] var18 = new class193[]{ class193.field2185, class193.field2187, class193.field2186, class193.field2184 };
					var22 = ((class193) (MusicPatchPcmStream.findEnumerated(var18, var4)));
				} else {
					var22 = Players.field1286[var1];
				}

				var2.method2125(var2.tileX, var2.tileY, var22);
			}
		}

	}
}