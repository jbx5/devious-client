import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
public class class105 {
	@ObfuscatedName("en")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -841998663
	)
	int field1381;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 462637913
	)
	int field1379;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1636216495
	)
	int field1380;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1700021687
	)
	int field1382;

	class105(int var1, int var2, int var3, int var4) {
		this.field1381 = var1;
		this.field1379 = var2;
		this.field1380 = var3;
		this.field1382 = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1526695139"
	)
	int method2735() {
		return this.field1381;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-656700362"
	)
	int method2734() {
		return this.field1379;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1722123979"
	)
	int method2749() {
		return this.field1380;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1655027363"
	)
	int method2736() {
		return this.field1382;
	}

	@ObfuscatedName("aa")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1438891682"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 30) {
				Client.field552.method4379();
			}

			if (Client.gameState == 0) {
				class188.client.method624();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				SoundSystem.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				Client.field535 = 0;
				Client.field566 = 0;
				Client.timer.method8391(var0);
				if (var0 != 20) {
					AbstractWorldMapIcon.setAuthenticationScheme(false);
				}
			}

			if (var0 != 20 && var0 != 40 && HttpHeaders.field4870 != null) {
				HttpHeaders.field4870.close();
				HttpHeaders.field4870 = null;
			}

			if (Client.gameState == 25) {
				Client.field584 = 0;
				Client.field595 = 0;
				Client.field596 = 1;
				Client.field699 = 0;
				Client.field638 = 1;
			}

			int var1;
			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					var1 = Client.gameState == 11 ? 4 : 0;
					class325.method6191(class138.archive10, class177.archive8, false, var1);
				} else if (var0 == 11) {
					class325.method6191(class138.archive10, class177.archive8, false, 4);
				} else if (var0 == 50) {
					WorldMapSection2.setLoginResponseString("", "Updating date of birth...", "");
					class325.method6191(class138.archive10, class177.archive8, false, 7);
				} else if (var0 != 0) {
					class154.method3294();
				}
			} else {
				var1 = HttpRequestTask.hasAcceptedEULA() ? 0 : 12;
				class325.method6191(class138.archive10, class177.archive8, true, var1);
			}

			Client.gameState = var0;
		}
	}

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)Ljava/lang/String;",
		garbageValue = "-101011192"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (TaskHandler.Widget_unpackTargetMask(class160.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
		}
	}

	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static void method2750() {
		if (Client.oculusOrbState == 1) {
			Client.field627 = true;
		}

	}
}
