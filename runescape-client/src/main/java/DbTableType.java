import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vn")
@Implements("DbTableType")
public class DbTableType extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static AbstractArchive field5394;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("DBTableType_cache")
	public static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lvc;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("ag")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("ak")
	@Export("types")
	public int[][] types;
	@ObfuscatedName("aj")
	@Export("defaultValues")
	public Object[][] defaultValues;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64);
	}

	DbTableType() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvl;B)V",
		garbageValue = "-29"
	)
	void method9973(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method9976(var1, var2);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvl;II)V",
		garbageValue = "1158183631"
	)
	void method9976(Buffer var1, int var2) {
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

					this.defaultValues[var5] = class30.method460(var1, var7);
				}
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-15"
	)
	void method9969() {
	}
}
