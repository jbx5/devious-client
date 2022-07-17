import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("po")
public class DbTableType extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Llh;")
	static AbstractArchive field4666;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("DBTableType_cache")
	static EvictingDualNodeHashTable DBTableType_cache;

	@ObfuscatedName("q")
	public int[][] types;

	@ObfuscatedName("f")
	public Object[][] defaultValues;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64);
	}

	DbTableType() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqt;I)V", garbageValue = "1788628332")
	void method7592(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			this.method7593(var1, var2);
		} 
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqt;II)V", garbageValue = "1985465936")
	void method7593(Buffer var1, int var2) {
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
					this.defaultValues[var5] = Frames.method4353(var1, var7);
				}
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1716843483")
	void method7602() {
	}
}