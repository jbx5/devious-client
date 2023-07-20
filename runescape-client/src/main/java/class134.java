import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
class class134 implements Callable {
	@ObfuscatedName("as")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class137 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lfz;Lty;I)V"
	)
	class134(class137 var1, Buffer var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3055(this.val$p, this.val$version);
		return null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-460438382"
	)
	public static void method3048() {
		StructComposition.StructDefinition_cached.clear();
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIII)V",
		garbageValue = "1018331432"
	)
	static final void method3047(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		class7.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, false);
	}
}
