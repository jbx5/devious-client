import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1201940895
	)
	@Export("id")
	int id;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1582314451
	)
	@Export("count")
	int count;
	@ObfuscatedName("ao")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("ae")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	class270 field2830;

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
				this.field2830 = new class270(var3, var4);
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-10508"
	)
	public int method5372() {
		return this.count;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lkx;",
		garbageValue = "88"
	)
	public class270 method5373() {
		return this.field2830;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Ldd;",
		garbageValue = "-260731599"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = WorldMapDecorationType.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = class90.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1932368264"
	)
	public static void method5380() {
		synchronized(ArchiveDiskActionHandler.field4331) {
			if (ArchiveDiskActionHandler.field4329 != 0) {
				ArchiveDiskActionHandler.field4329 = 1;
				ArchiveDiskActionHandler.field4332 = true;

				try {
					ArchiveDiskActionHandler.field4331.wait();
				} catch (InterruptedException var3) {
				}
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1817162027"
	)
	public static boolean method5378(int var0) {
		return (var0 >> 20 & 1) != 0;
	}
}
