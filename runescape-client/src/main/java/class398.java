import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("oz")
public class class398 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Loz;")
	public static final class398 field4447 = new class398("application/json");

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Loz;")
	static final class398 field4443 = new class398("text/plain");

	@ObfuscatedName("pe")
	@ObfuscatedSignature(descriptor = "Lpo;")
	@Export("HitSplatDefinition_cachedSprites")
	static class428 HitSplatDefinition_cachedSprites;

	@ObfuscatedName("f")
	String field4444;

	class398(String var1) {
		this.field4444 = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;", garbageValue = "32")
	public String method7126() {
		return this.field4444;
	}
}