import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("po")
public class class435 extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Llh;")
	static AbstractArchive field4666;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("DBTableType_cache")
	static EvictingDualNodeHashTable DBTableType_cache;

	@ObfuscatedName("q")
	public int[][] field4668;

	@ObfuscatedName("f")
	public Object[][] field4669;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64);
	}

	class435() {
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
			if (this.field4668 == null) {
				this.field4668 = new int[var3][];
			}
			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) {
				int var5 = var4 & 127;
				boolean var6 = (var4 & 128) != 0;
				int[] var7 = new int[var1.readUnsignedByte()];
				for (int var8 = 0; var8 < var7.length; ++var8) {
					var7[var8] = var1.readUShortSmart();
				}
				this.field4668[var5] = var7;
				if (var6) {
					if (this.field4669 == null) {
						this.field4669 = new Object[this.field4668.length][];
					}
					this.field4669[var5] = Frames.method4353(var1, var7);
				}
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1716843483")
	void method7602() {
	}
}