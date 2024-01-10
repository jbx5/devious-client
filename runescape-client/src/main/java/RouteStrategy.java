import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("ai")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = -264909595
	)
	static int field2446;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 293274175
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1418028301
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 462429505
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1664197873
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIILii;I)Z",
		garbageValue = "-1725376681"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1186461625"
	)
	public static int method4509(int var0) {
		return var0 >>> 12;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "26"
	)
	static int method4507(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return class28.method437(var0, var1, var2);
		} else if (var0 < 1100) {
			return FadeInTask.method7948(var0, var1, var2);
		} else if (var0 < 1200) {
			return class131.method3092(var0, var1, var2);
		} else if (var0 < 1300) {
			return MouseHandler.method721(var0, var1, var2);
		} else if (var0 < 1400) {
			return GrandExchangeOfferOwnWorldComparator.method1247(var0, var1, var2);
		} else if (var0 < 1500) {
			return Occluder.method5586(var0, var1, var2);
		} else if (var0 < 1600) {
			return class367.method6958(var0, var1, var2);
		} else if (var0 < 1700) {
			return class313.method5998(var0, var1, var2);
		} else if (var0 < 1800) {
			return class402.method7522(var0, var1, var2);
		} else if (var0 < 1900) {
			return KitDefinition.method3640(var0, var1, var2);
		} else if (var0 < 2000) {
			return class28.method433(var0, var1, var2);
		} else if (var0 < 2100) {
			return FadeInTask.method7948(var0, var1, var2);
		} else if (var0 < 2200) {
			return class131.method3092(var0, var1, var2);
		} else if (var0 < 2300) {
			return MouseHandler.method721(var0, var1, var2);
		} else if (var0 < 2400) {
			return GrandExchangeOfferOwnWorldComparator.method1247(var0, var1, var2);
		} else if (var0 < 2500) {
			return Occluder.method5586(var0, var1, var2);
		} else if (var0 < 2600) {
			return class33.method494(var0, var1, var2);
		} else if (var0 < 2700) {
			return class386.method7275(var0, var1, var2);
		} else if (var0 < 2800) {
			return ReflectionCheck.method735(var0, var1, var2);
		} else if (var0 < 2900) {
			return VerticalAlignment.method3786(var0, var1, var2);
		} else if (var0 < 3000) {
			return class28.method433(var0, var1, var2);
		} else if (var0 < 3200) {
			return class93.method2440(var0, var1, var2);
		} else if (var0 < 3300) {
			return UserComparator3.method2972(var0, var1, var2);
		} else if (var0 < 3400) {
			return GameBuild.method6935(var0, var1, var2);
		} else if (var0 < 3500) {
			return AbstractArchive.method7038(var0, var1, var2);
		} else if (var0 < 3600) {
			return SecureRandomCallable.method2323(var0, var1, var2);
		} else if (var0 < 3700) {
			return SecureRandomFuture.method2233(var0, var1, var2);
		} else if (var0 < 3800) {
			return class222.method4381(var0, var1, var2);
		} else if (var0 < 3900) {
			return class148.method3276(var0, var1, var2);
		} else if (var0 < 4000) {
			return PcmPlayer.method860(var0, var1, var2);
		} else if (var0 < 4100) {
			return class358.method6930(var0, var1, var2);
		} else if (var0 < 4200) {
			return UrlRequest.method2929(var0, var1, var2);
		} else if (var0 < 4300) {
			return Occluder.method5590(var0, var1, var2);
		} else if (var0 < 5100) {
			return class184.method3709(var0, var1, var2);
		} else if (var0 < 5400) {
			return GrandExchangeOfferAgeComparator.method7193(var0, var1, var2);
		} else if (var0 < 5600) {
			return Coord.method6328(var0, var1, var2);
		} else if (var0 < 5700) {
			return class169.method3544(var0, var1, var2);
		} else if (var0 < 6300) {
			return HttpResponse.method303(var0, var1, var2);
		} else if (var0 < 6600) {
			return class208.method4155(var0, var1, var2);
		} else if (var0 < 6700) {
			return class30.method455(var0, var1, var2);
		} else if (var0 < 6800) {
			return class314.method6006(var0, var1, var2);
		} else if (var0 < 6900) {
			return class400.method7497(var0, var1, var2);
		} else if (var0 < 7000) {
			return class1.method10(var0, var1, var2);
		} else if (var0 < 7100) {
			return class400.method7498(var0, var1, var2);
		} else if (var0 < 7200) {
			return class174.method3571(var0, var1, var2);
		} else if (var0 < 7300) {
			return class184.method3708(var0, var1, var2);
		} else if (var0 < 7500) {
			return class235.method4604(var0, var1, var2);
		} else if (var0 < 7600) {
			return class101.method2719(var0, var1, var2);
		} else if (var0 < 7700) {
			return class59.method1186(var0, var1, var2);
		} else {
			return var0 < 8100 ? class139.method3189(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1319131518"
	)
	public static int method4508(int var0) {
		class138 var1 = class430.method8064(var0);
		if (var1 == null) {
			return 2;
		} else {
			return var1.method3159() ? 0 : 1;
		}
	}

	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "458248434"
	)
	static void method4506(int var0) {
		Client.oculusOrbState = var0;
	}
}
