import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
public class class227 extends Node {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1067213567
	)
	public int field2417;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1013754093
	)
	public int field2418;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2006834851
	)
	public int field2419;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	public Widget field2420;

	@ObfuscatedSignature(
		descriptor = "(IIILng;)V"
	)
	public class227(int var1, int var2, int var3, Widget var4) {
		this.field2419 = var1;
		this.field2417 = var2;
		this.field2418 = var3;
		this.field2420 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "14"
	)
	public static int method4423(int var0) {
		return var0 >>> 4 & class527.field5154;
	}
}
