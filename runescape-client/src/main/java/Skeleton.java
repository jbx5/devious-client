import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("gm")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 1780002005)
	@Export("id")
	int id;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -64074659)
	@Export("count")
	int count;

	@ObfuscatedName("w")
	@Export("transformTypes")
	int[] transformTypes;

	@ObfuscatedName("y")
	@Export("labels")
	int[][] labels;

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "Lgq;")
	class201 field2376;

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
				this.field2376 = new class201(var3, var4);
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-58631089")
	public int method4148() {
		return this.count;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)Lgq;", garbageValue = "1269137329")
	public class201 method4150() {
		return this.field2376;
	}
}