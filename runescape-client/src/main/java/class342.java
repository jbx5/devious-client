import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
public class class342 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 876070529
	)
	@Export("canvasHeight")
	public static int canvasHeight;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2054843409"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)Ljava/lang/String;",
		garbageValue = "1549371491"
	)
	public static String method6308(Buffer var0) {
		return class150.method3199(var0, 32767);
	}
}
