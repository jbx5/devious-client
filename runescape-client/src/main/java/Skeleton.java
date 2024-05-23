import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("cc")
	static String field2697;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 215908835
	)
	@Export("id")
	int id;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 415648975
	)
	@Export("count")
	int count;
	@ObfuscatedName("ab")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("ac")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	class249 field2703;

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
				this.field2703 = new class249(var3, var4);
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1286736484"
	)
	public int method4846() {
		return this.count;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lje;",
		garbageValue = "-868887817"
	)
	public class249 method4844() {
		return this.field2703;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1894808035"
	)
	public static int method4848(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1821199649"
	)
	public static void method4849() {
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
	}
}
