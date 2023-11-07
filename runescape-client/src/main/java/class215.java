import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
public class class215 {
	@ObfuscatedName("iv")
	static int[] field2305;
	@ObfuscatedName("ao")
	public String field2312;
	@ObfuscatedName("ab")
	public float[] field2306;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1563076575
	)
	public int field2308;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2077196113
	)
	public int field2309;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1214979095
	)
	public int field2310;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	final class208 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lic;)V"
	)
	class215(class208 var1) {
		this.this$0 = var1;
		this.field2306 = new float[4];
		this.field2308 = 1;
		this.field2309 = 1;
		this.field2310 = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SB)V",
		garbageValue = "0"
	)
	public static void method4229(String[] var0, short[] var1) {
		class132.sortItemsByName(var0, var1, 0, var0.length - 1);
	}
}
