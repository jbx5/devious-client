import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = -1324166715
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("uk")
	@ObfuscatedGetter(
		intValue = -1790423680
	)
	static int field2633;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1822758027
	)
	@Export("id")
	int id;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -536717565
	)
	@Export("count")
	int count;
	@ObfuscatedName("aw")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("ad")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	class243 field2636;

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
				this.field2636 = new class243(var3, var4);
			}
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-619378321"
	)
	public int method4695() {
		return this.count;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljr;",
		garbageValue = "1023110495"
	)
	public class243 method4697() {
		return this.field2636;
	}
}
