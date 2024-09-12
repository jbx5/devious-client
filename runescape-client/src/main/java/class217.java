import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
public class class217 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	public UrlRequest field2369;
	@ObfuscatedName("ae")
	public float[] field2368;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	final class227 this$0;

	@ObfuscatedSignature(
		descriptor = "(Liy;)V"
	)
	class217(class227 var1) {
		this.this$0 = var1;
		this.field2368 = new float[4];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-2113283314"
	)
	static final int method4454(int var0, int var1, int var2, int var3) {
		return var0 * var2 - var3 * var1 >> 16;
	}
}
