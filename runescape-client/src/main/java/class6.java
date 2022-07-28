import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("z")
public enum class6 implements MouseWheel {

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lz;")
	field14(0, 0);
	@ObfuscatedName("qy")
	@ObfuscatedSignature(descriptor = "Lpo;")
	@Export("HitSplatDefinition_cached")
	static class428 HitSplatDefinition_cached;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 867944955)
	final int field19;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1103183445)
	final int field15;

	class6(int var3, int var4) {
		this.field19 = var3;
		this.field15 = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field15;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1483147000")
	static final void method34() {
		LoginScreenAnimation.method2279("You can't add yourself to your own ignore list");
	}
}