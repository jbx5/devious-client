import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
public class class325 {
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -474116439
	)
	int field3555;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	class53 field3553;

	@ObfuscatedSignature(
		descriptor = "(ILcj;)V"
	)
	class325(int var1, class53 var2) {
		this.field3555 = var1;
		this.field3553 = var2;
	}
}
