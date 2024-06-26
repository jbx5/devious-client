import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = -104959579
	)
	static int field2915;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 303187343
	)
	@Export("id")
	int id;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 360049709
	)
	@Export("count")
	int count;
	@ObfuscatedName("av")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("ab")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	class279 field2914;

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
				this.field2914 = new class279(var3, var4);
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-21"
	)
	public int method5406() {
		return this.count;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lkj;",
		garbageValue = "1927354495"
	)
	public class279 method5407() {
		return this.field2914;
	}
}
