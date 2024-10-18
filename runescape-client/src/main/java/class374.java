import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ok")
public class class374 {
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "Lwl;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;

	static {
		Math.sqrt(8192.0D);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1912364332"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;

		try {
			var0 = IgnoreList.getPreferencesFile("", WorldMapRenderer.field3156.name, true);
			Buffer var1 = TaskHandler.clientPreferences.toBuffer();
			var0.write(var1.array, 0, var1.offset);
		} catch (Exception var3) {
		}

		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "-1754910537"
	)
	static int method7517(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return class155.method3616(var0, var1, var2);
		} else if (var0 < 1100) {
			return LoginState.method1294(var0, var1, var2);
		} else if (var0 < 1200) {
			return LoginState.method1297(var0, var1, var2);
		} else if (var0 < 1300) {
			return GrandExchangeOfferOwnWorldComparator.method1277(var0, var1, var2);
		} else if (var0 < 1400) {
			return class384.method7544(var0, var1, var2);
		} else if (var0 < 1500) {
			return DirectByteArrayCopier.method7503(var0, var1, var2);
		} else if (var0 < 1600) {
			return Language.method7859(var0, var1, var2);
		} else if (var0 < 1700) {
			return AbstractWorldMapData.method6282(var0, var1, var2);
		} else if (var0 < 1800) {
			return class403.method7840(var0, var1, var2);
		} else if (var0 < 1900) {
			return class60.method1198(var0, var1, var2);
		} else if (var0 < 2000) {
			return GraphicsObject.method2328(var0, var1, var2);
		} else if (var0 < 2100) {
			return LoginState.method1294(var0, var1, var2);
		} else if (var0 < 2200) {
			return LoginState.method1297(var0, var1, var2);
		} else if (var0 < 2300) {
			return GrandExchangeOfferOwnWorldComparator.method1277(var0, var1, var2);
		} else if (var0 < 2400) {
			return class384.method7544(var0, var1, var2);
		} else if (var0 < 2500) {
			return DirectByteArrayCopier.method7503(var0, var1, var2);
		} else if (var0 < 2600) {
			return class462.method8870(var0, var1, var2);
		} else if (var0 < 2700) {
			return class47.method896(var0, var1, var2);
		} else if (var0 < 2800) {
			return Decimator.method1169(var0, var1, var2);
		} else if (var0 < 2900) {
			return JagNetThread.method7713(var0, var1, var2);
		} else if (var0 < 3000) {
			return GraphicsObject.method2328(var0, var1, var2);
		} else if (var0 < 3200) {
			return DevicePcmPlayerProvider.method322(var0, var1, var2);
		} else if (var0 < 3300) {
			return class544.method9949(var0, var1, var2);
		} else if (var0 < 3400) {
			return class171.method3807(var0, var1, var2);
		} else if (var0 < 3500) {
			return HttpQueryParams.method9406(var0, var1, var2);
		} else if (var0 < 3600) {
			return Client.method1952(var0, var1, var2);
		} else if (var0 < 3700) {
			return class463.method8880(var0, var1, var2);
		} else if (var0 < 3800) {
			return WorldView.method2948(var0, var1, var2);
		} else if (var0 < 3900) {
			return class143.method3501(var0, var1, var2);
		} else if (var0 < 4000) {
			return MusicPatchNode2.method6562(var0, var1, var2);
		} else if (var0 < 4100) {
			return Decimator.method1166(var0, var1, var2);
		} else if (var0 < 4200) {
			return class169.method3784(var0, var1, var2);
		} else if (var0 < 4300) {
			return class141.method3498(var0, var1, var2);
		} else if (var0 < 5100) {
			return DirectByteArrayCopier.method7506(var0, var1, var2);
		} else if (var0 < 5400) {
			return SecureUrlRequester.method3232(var0, var1, var2);
		} else if (var0 < 5600) {
			return class202.method4110(var0, var1, var2);
		} else if (var0 < 5700) {
			return MenuAction.method2337(var0, var1, var2);
		} else if (var0 < 6300) {
			return class136.method3441(var0, var1, var2);
		} else if (var0 < 6600) {
			return class73.method2261(var0, var1, var2);
		} else if (var0 < 6700) {
			return class166.method3764(var0, var1, var2);
		} else if (var0 < 6800) {
			return ClanChannelMember.method3585(var0, var1, var2);
		} else if (var0 < 6900) {
			return class95.method2662(var0, var1, var2);
		} else if (var0 < 7000) {
			return InvDefinition.method3840(var0, var1, var2);
		} else if (var0 < 7100) {
			return MusicPatch.method6772(var0, var1, var2);
		} else if (var0 < 7200) {
			return WidgetDefinition.method6910(var0, var1, var2);
		} else if (var0 < 7500) {
			return GrandExchangeOfferOwnWorldComparator.method1278(var0, var1, var2);
		} else if (var0 < 7600) {
			return Login.method2376(var0, var1, var2);
		} else if (var0 < 7700) {
			return Canvas.method328(var0, var1, var2);
		} else if (var0 < 8000) {
			return HttpRequestTask.method286(var0, var1, var2);
		} else {
			return var0 < 8100 ? class384.method7542(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-48"
	)
	public static int method7518(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2;
	}
}
