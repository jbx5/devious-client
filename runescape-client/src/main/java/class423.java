import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
public class class423 {
	@ObfuscatedName("ax")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvb;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("ab")
	float field4672;
	@ObfuscatedName("ay")
	float field4669;
	@ObfuscatedName("an")
	float field4671;

	static {
		new class423(0.0F, 0.0F, 0.0F);
		new class423(1.0F, 1.0F, 1.0F);
		new class423(1.0F, 0.0F, 0.0F);
		new class423(0.0F, 1.0F, 0.0F);
		new class423(0.0F, 0.0F, 1.0F);
		class233.method4787(100);
	}

	public class423(float var1, float var2, float var3) {
		this.field4672 = var1;
		this.field4669 = var2;
		this.field4671 = var3;
	}

	class423() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lqh;B)Z",
		garbageValue = "65"
	)
	boolean method7820(class423 var1) {
		return this.field4672 == var1.field4672 && var1.field4669 == this.field4669 && this.field4671 == var1.field4671;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-649403982"
	)
	final float method7818() {
		return (float)Math.sqrt((double)(this.field4671 * this.field4671 + this.field4669 * this.field4669 + this.field4672 * this.field4672));
	}

	public String toString() {
		return this.field4672 + ", " + this.field4669 + ", " + this.field4671;
	}
}
