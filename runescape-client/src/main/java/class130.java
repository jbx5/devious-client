import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class130 {
	@ObfuscatedName("au")
	public static final float field1517;
	@ObfuscatedName("ax")
	public static final float field1516;
	@ObfuscatedName("ao")
	static float[] field1522;
	@ObfuscatedName("am")
	static float[] field1518;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		longValue = -975036129438334281L
	)
	static long field1520;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = -427800679
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;

	static {
		field1517 = Math.ulp(1.0F);
		field1516 = field1517 * 2.0F;
		field1522 = new float[4];
		field1518 = new float[5];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZZI)Lvb;",
		garbageValue = "692215717"
	)
	static IndexedSprite method3116(boolean var0, boolean var1) {
		return var0 ? (var1 ? Login.field902 : class421.options_buttons_2Sprite) : (var1 ? Login.field907 : class423.options_buttons_0Sprite);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1181687975"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(Loj;Ljava/lang/String;B)V",
		garbageValue = "-31"
	)
	static void method3131(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field799 += var2.groupCount;
	}
}
