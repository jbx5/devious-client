import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("pq")
@Implements("DbTableType")
public class DbTableType extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Llc;")
	public static AbstractArchive field4682;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("DBTableType_cache")
	public static EvictingDualNodeHashTable DBTableType_cache = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("h")
	@Export("SpriteBuffer_pixels")
	static byte[][] SpriteBuffer_pixels;

	@ObfuscatedName("f")
	@Export("types")
	public int[][] types;

	@ObfuscatedName("u")
	@Export("defaultValues")
	public Object[][] defaultValues;

	DbTableType() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "2014581097")
	void method7621(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			this.method7620(var1, var2);
		} 
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqw;IB)V", garbageValue = "6")
	void method7620(Buffer var1, int var2) {
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
					this.defaultValues[var5] = Huffman.method5486(var1, var7);
				}
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1229456655")
	void method7626() {
	}
}