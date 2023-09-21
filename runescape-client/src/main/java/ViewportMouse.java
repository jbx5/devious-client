import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("ac")
	@Export("ViewportMouse_isInViewport")
	static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 884178361
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -78136905
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("ax")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1661824619
	)
	static int field2808;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -630047283
	)
	static int field2807;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 97003329
	)
	static int field2802;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -77145917
	)
	static int field2809;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1608809895
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("as")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "-527981427"
	)
	static int method5046(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return class168.method3407(var0, var1, var2);
		} else if (var0 < 1100) {
			return ClientPreferences.method2572(var0, var1, var2);
		} else if (var0 < 1200) {
			return class17.method267(var0, var1, var2);
		} else if (var0 < 1300) {
			return class76.method2125(var0, var1, var2);
		} else if (var0 < 1400) {
			return class4.method17(var0, var1, var2);
		} else if (var0 < 1500) {
			return class31.method458(var0, var1, var2);
		} else if (var0 < 1600) {
			return class87.method2309(var0, var1, var2);
		} else if (var0 < 1700) {
			return class134.method3070(var0, var1, var2);
		} else if (var0 < 1800) {
			return class202.method3766(var0, var1, var2);
		} else if (var0 < 1900) {
			return class13.method171(var0, var1, var2);
		} else if (var0 < 2000) {
			return class20.method299(var0, var1, var2);
		} else if (var0 < 2100) {
			return ClientPreferences.method2572(var0, var1, var2);
		} else if (var0 < 2200) {
			return class17.method267(var0, var1, var2);
		} else if (var0 < 2300) {
			return class76.method2125(var0, var1, var2);
		} else if (var0 < 2400) {
			return class4.method17(var0, var1, var2);
		} else if (var0 < 2500) {
			return class31.method458(var0, var1, var2);
		} else if (var0 < 2600) {
			return class30.method447(var0, var1, var2);
		} else if (var0 < 2700) {
			return DevicePcmPlayerProvider.method307(var0, var1, var2);
		} else if (var0 < 2800) {
			return Varps.method6215(var0, var1, var2);
		} else if (var0 < 2900) {
			return ClientPacket.method5865(var0, var1, var2);
		} else if (var0 < 3000) {
			return class20.method299(var0, var1, var2);
		} else if (var0 < 3200) {
			return class266.method5209(var0, var1, var2);
		} else if (var0 < 3300) {
			return class133.method3058(var0, var1, var2);
		} else if (var0 < 3400) {
			return Frames.method4856(var0, var1, var2);
		} else if (var0 < 3500) {
			return Buddy.method8164(var0, var1, var2);
		} else if (var0 < 3600) {
			return WorldMapElement.method3660(var0, var1, var2);
		} else if (var0 < 3700) {
			return ReflectionCheck.method698(var0, var1, var2);
		} else if (var0 < 3800) {
			return class470.method8453(var0, var1, var2);
		} else if (var0 < 3900) {
			return class13.method163(var0, var1, var2);
		} else if (var0 < 4000) {
			return class74.method2118(var0, var1, var2);
		} else if (var0 < 4100) {
			return KitDefinition.method3707(var0, var1, var2);
		} else if (var0 < 4200) {
			return class141.method3129(var0, var1, var2);
		} else if (var0 < 4300) {
			return class18.method278(var0, var1, var2);
		} else if (var0 < 5100) {
			return Projectile.method2187(var0, var1, var2);
		} else if (var0 < 5400) {
			return PlayerComposition.method6300(var0, var1, var2);
		} else if (var0 < 5600) {
			return ObjectSound.method1955(var0, var1, var2);
		} else if (var0 < 5700) {
			return HealthBarUpdate.method2457(var0, var1, var2);
		} else if (var0 < 6300) {
			return WorldMapAreaData.method5744(var0, var1, var2);
		} else if (var0 < 6600) {
			return class319.method5968(var0, var1, var2);
		} else if (var0 < 6700) {
			return GrandExchangeOfferNameComparator.method7062(var0, var1, var2);
		} else if (var0 < 6800) {
			return class330.method6205(var0, var1, var2);
		} else if (var0 < 6900) {
			return class169.method3419(var0, var1, var2);
		} else if (var0 < 7000) {
			return class104.method2711(var0, var1, var2);
		} else if (var0 < 7100) {
			return class224.method4247(var0, var1, var2);
		} else if (var0 < 7200) {
			return class17.method265(var0, var1, var2);
		} else if (var0 < 7300) {
			return MouseHandler.method652(var0, var1, var2);
		} else if (var0 < 7500) {
			return class472.method8475(var0, var1, var2);
		} else if (var0 < 7600) {
			return DynamicObject.method2218(var0, var1, var2);
		} else if (var0 < 7700) {
			return class150.method3186(var0, var1, var2);
		} else {
			return var0 < 8100 ? class4.method14(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILnm;IIIII[FI)Lnm;",
		garbageValue = "-357368567"
	)
	static Widget method5076(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget();
		var8.type = var0;
		var8.parentId = var1.id;
		var8.childIndex = var2;
		var8.isIf3 = true;
		var8.xAlignment = var3;
		var8.yAlignment = var4;
		var8.widthAlignment = var5;
		var8.heightAlignment = var6;
		var8.rawX = (int)(var7[0] * (float)var1.width);
		var8.rawY = (int)((float)var1.height * var7[1]);
		var8.rawWidth = (int)(var7[2] * (float)var1.width);
		var8.rawHeight = (int)((float)var1.height * var7[3]);
		return var8;
	}
}
