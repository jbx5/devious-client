import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -210256089
	)
	@Export("id")
	int id;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1213891965
	)
	@Export("count")
	int count;
	@ObfuscatedName("at")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("au")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	class241 field2629;

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
				this.field2629 = new class241(var3, var4);
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-357610485"
	)
	public int method4889() {
		return this.count;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljp;",
		garbageValue = "333832686"
	)
	public class241 method4887() {
		return this.field2629;
	}
}
