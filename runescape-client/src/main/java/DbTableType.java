import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("un")
@Implements("DbTableType")
public class DbTableType extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	public static AbstractArchive field5348;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("DBTableType_cache")
	public static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("ag")
	@Export("types")
	public int[][] types;
	@ObfuscatedName("am")
	@Export("defaultValues")
	public Object[][] defaultValues;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64);
	}

	DbTableType() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "-39"
	)
	void method9794(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method9795(var1, var2);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvf;II)V",
		garbageValue = "852231286"
	)
	void method9795(Buffer var1, int var2) {
		if (var2 == 1) {
			int var3 = var1.readUnsignedByte();
			if (this.types == null) {
				this.types = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) {
				int var5 = var4 & 127;
				boolean var6 = (var4 & 128) != 0;
				int[] var7 = new int[var1.readUnsignedByte()];

				for (int var8 = 0; var8 < var7.length; ++var8) {
					var7[var8] = var1.readUShortSmart();
				}

				this.types[var5] = var7;
				if (var6) {
					if (this.defaultValues == null) {
						this.defaultValues = new Object[this.types.length][];
					}

					this.defaultValues[var5] = class330.method6427(var1, var7);
				}
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1056183933"
	)
	void method9796() {
	}
}
