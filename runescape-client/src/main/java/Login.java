import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("Login")
public class Login {
	@ObfuscatedName("ah")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1629550627
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 577739393
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1429316743
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("ae")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -175464077
	)
	@Export("Login_banType")
	static int Login_banType;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1228226987
	)
	static int field938;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1252493419
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cj")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("cr")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cy")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cg")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cl")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("cw")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 58966259
	)
	static int field946;
	@ObfuscatedName("cm")
	static String[] field931;
	@ObfuscatedName("cp")
	@Export("displayName")
	static String displayName;
	@ObfuscatedName("ch")
	static boolean field949;
	@ObfuscatedName("cf")
	static boolean field950;
	@ObfuscatedName("ca")
	@Export("rememberUsername")
	static boolean rememberUsername;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -980303345
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dm")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -425448161
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 660618563
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 440579911
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		longValue = -4310875596448659801L
	)
	static long field959;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		longValue = -1733690883729819501L
	)
	static long field960;
	@ObfuscatedName("de")
	static String[] field961;
	@ObfuscatedName("dz")
	static String[] field962;
	@ObfuscatedName("dh")
	static String[] field963;
	@ObfuscatedName("hc")
	static int[] field965;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		Login_banType = -1;
		field938 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field946 = 0;
		field931 = new String[8];
		displayName = "";
		field949 = false;
		field950 = false;
		rememberUsername = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class134();
		field959 = -1L;
		field960 = -1L;
		field961 = new String[]{"title.jpg"};
		field962 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field963 = new String[]{"logo_speedrunning"};
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lun;I)V",
		garbageValue = "4210704"
	)
	static final void method2160(PacketBuffer var0) {
		int var1 = 0;
		var0.importIndex();

		byte[] var10000;
		int var2;
		int var4;
		int var5;
		for (var2 = 0; var2 < Players.Players_count; ++var2) {
			var5 = Players.Players_indices[var2];
			if ((Players.field1382[var5] & 1) == 0) {
				if (var1 > 0) {
					--var1;
					var10000 = Players.field1382;
					var10000[var5] = (byte)(var10000[var5] | 2);
				} else {
					var4 = var0.readBits(1);
					if (var4 == 0) {
						var1 = class276.method5574(var0);
						var10000 = Players.field1382;
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						LoginScreenAnimation.readPlayerUpdate(var0, var5);
					}
				}
			}
		}

		var0.exportIndex();
		if (var1 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex();

			for (var2 = 0; var2 < Players.Players_count; ++var2) {
				var5 = Players.Players_indices[var2];
				if ((Players.field1382[var5] & 1) != 0) {
					if (var1 > 0) {
						--var1;
						var10000 = Players.field1382;
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						var4 = var0.readBits(1);
						if (var4 == 0) {
							var1 = class276.method5574(var0);
							var10000 = Players.field1382;
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							LoginScreenAnimation.readPlayerUpdate(var0, var5);
						}
					}
				}
			}

			var0.exportIndex();
			if (var1 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
					var5 = Players.Players_emptyIndices[var2];
					if ((Players.field1382[var5] & 1) != 0) {
						if (var1 > 0) {
							--var1;
							var10000 = Players.field1382;
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							var4 = var0.readBits(1);
							if (var4 == 0) {
								var1 = class276.method5574(var0);
								var10000 = Players.field1382;
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else if (class362.updateExternalPlayer(var0, var5)) {
								var10000 = Players.field1382;
								var10000[var5] = (byte)(var10000[var5] | 2);
							}
						}
					}
				}

				var0.exportIndex();
				if (var1 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
						var5 = Players.Players_emptyIndices[var2];
						if ((Players.field1382[var5] & 1) == 0) {
							if (var1 > 0) {
								--var1;
								var10000 = Players.field1382;
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else {
								var4 = var0.readBits(1);
								if (var4 == 0) {
									var1 = class276.method5574(var0);
									var10000 = Players.field1382;
									var10000[var5] = (byte)(var10000[var5] | 2);
								} else if (class362.updateExternalPlayer(var0, var5)) {
									var10000 = Players.field1382;
									var10000[var5] = (byte)(var10000[var5] | 2);
								}
							}
						}
					}

					var0.exportIndex();
					if (var1 != 0) {
						throw new RuntimeException();
					} else {
						Players.Players_count = 0;
						Players.Players_emptyIdxCount = 0;

						for (var2 = 1; var2 < 2048; ++var2) {
							var10000 = Players.field1382;
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var3 = Client.players[var2];
							if (var3 != null) {
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2;
							}
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1212711374"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (class243.widgetDefinition.loadInterface(var0)) {
			class286.runComponentCloseListeners(class243.widgetDefinition.Widget_interfaceComponents[var0], var1);
		}
	}
}
