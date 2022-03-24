import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"Lqx;")

	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	78791747)

	@Export("id")
	int id;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	2115979069)

	@Export("count")
	int count;
	@ObfuscatedName("f")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("u")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"Lgl;")

	class202 field2363;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1;
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte();
		this.transformTypes = new int[this.count];
		this.labels = new int[this.count][];

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) {
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) {
			var4 = var3.readUnsignedShort();
			if (var4 > 0) {
				this.field2363 = new class202(var3, var4);
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"-23")

	public int method4119() {
		return this.count;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)Lgl;", garbageValue = 
	"-954036382")

	public class202 method4120() {
		return this.field2363;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Llq;Llq;I)I", garbageValue = 
	"459175254")

	static int method4118(AbstractArchive var0, AbstractArchive var1) {
		int var2 = 0;
		String[] var3 = Login.field881;

		int var4;
		String var5;
		for (var4 = 0; var4 < var3.length; ++var4) {
			var5 = var3[var4];
			if (var0.tryLoadFileByNames(var5, "")) {
				++var2;
			}
		}

		var3 = Login.field914;

		for (var4 = 0; var4 < var3.length; ++var4) {
			var5 = var3[var4];
			if (var1.tryLoadFileByNames(var5, "")) {
				++var2;
			}
		}

		return var2;
	}
}