import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sh")
public final class class469 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lsh;"
	)
	static class469[] field4866;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1665976069
	)
	static int field4862;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1729019913
	)
	static int field4868;
	@ObfuscatedName("at")
	float field4863;
	@ObfuscatedName("an")
	float field4865;
	@ObfuscatedName("ao")
	float field4864;
	@ObfuscatedName("ab")
	float field4867;

	static {
		field4866 = new class469[0];
		PlayerType.method6892(100);
		new class469();
	}

	class469() {
		this.method8381();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-41"
	)
	public void method8386() {
		synchronized(field4866) {
			if (class277.field3054 < field4862 - 1) {
				field4866[++class277.field3054 - 1] = this;
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-1592388866"
	)
	void method8379(float var1, float var2, float var3, float var4) {
		this.field4863 = var1;
		this.field4865 = var2;
		this.field4864 = var3;
		this.field4867 = var4;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1951250570"
	)
	public void method8383(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F));
		float var6 = (float)Math.cos((double)(var4 * 0.5F));
		this.field4863 = var1 * var5;
		this.field4865 = var2 * var5;
		this.field4864 = var3 * var5;
		this.field4867 = var6;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1755081326"
	)
	final void method8381() {
		this.field4864 = 0.0F;
		this.field4865 = 0.0F;
		this.field4863 = 0.0F;
		this.field4867 = 1.0F;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsh;S)V",
		garbageValue = "20063"
	)
	public final void method8382(class469 var1) {
		this.method8379(this.field4867 * var1.field4863 + var1.field4867 * this.field4863 + this.field4864 * var1.field4865 - this.field4865 * var1.field4864, var1.field4864 * this.field4863 + var1.field4865 * this.field4867 + (var1.field4867 * this.field4865 - var1.field4863 * this.field4864), var1.field4863 * this.field4865 + var1.field4867 * this.field4864 - var1.field4865 * this.field4863 + this.field4867 * var1.field4864, this.field4867 * var1.field4867 - this.field4863 * var1.field4863 - var1.field4865 * this.field4865 - var1.field4864 * this.field4864);
	}

	public String toString() {
		return this.field4863 + "," + this.field4865 + "," + this.field4864 + "," + this.field4867;
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = 31.0F * var2 + this.field4863;
		var2 = this.field4865 + var2 * 31.0F;
		var2 = var2 * 31.0F + this.field4864;
		var2 = this.field4867 + 31.0F * var2;
		return (int)var2;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class469)) {
			return false;
		} else {
			class469 var2 = (class469)var1;
			return this.field4863 == var2.field4863 && var2.field4865 == this.field4865 && this.field4864 == var2.field4864 && var2.field4867 == this.field4867;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lvl;",
		garbageValue = "655931485"
	)
	static IndexedSprite[] method8384() {
		IndexedSprite[] var0 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

		for (int var1 = 0; var1 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var1) {
			IndexedSprite var2 = var0[var1] = new IndexedSprite();
			var2.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
			var2.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
			var2.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var1];
			var2.yOffset = SpriteBufferProperties.SpriteBuffer_yOffsets[var1];
			var2.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = Ignored.SpriteBuffer_spriteHeights[var1];
			var2.palette = class126.SpriteBuffer_spritePalette;
			var2.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var1];
		}

		SpotAnimationDefinition.method3949();
		return var0;
	}
}
