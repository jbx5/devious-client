import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("px")
public class class437 extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Llh;")
	static AbstractArchive field4675;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("DBRowType_cache")
	static EvictingDualNodeHashTable DBRowType_cache;

	@ObfuscatedName("q")
	Object[][] field4676;

	@ObfuscatedName("f")
	int[][] field4677;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1231945791)
	public int field4678;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64);
	}

	class437() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqt;B)V", garbageValue = "1")
	void method7635(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			this.method7627(var1, var2);
		} 
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IB)[Ljava/lang/Object;", garbageValue = "-23")
	public Object[] method7625(int var1) {
		return this.field4676 == null ? null : this.field4676[var1];
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Lqt;II)V", garbageValue = "-1966368366")
	void method7627(Buffer var1, int var2) {
		if (var2 == 3) {
			int var3 = var1.readUnsignedByte();
			if (this.field4676 == null) {
				this.field4676 = new Object[var3][];
				this.field4677 = new int[var3][];
			}
			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) {
				int var5 = var1.readUnsignedByte();
				int[] var6 = new int[var5];
				for (int var7 = 0; var7 < var5; ++var7) {
					var6[var7] = var1.readUShortSmart();
				}
				Object[][] var16 = this.field4676;
				int var10 = var1.readUShortSmart();
				Object[] var11 = new Object[var6.length * var10];
				for (int var12 = 0; var12 < var10; ++var12) {
					for (int var13 = 0; var13 < var6.length; ++var13) {
						int var14 = var13 + var6.length * var12;
						class432 var15 = MusicPatchNode.method5472(var6[var13]);
						var11[var14] = var15.method7565(var1);
					}
				}
				var16[var4] = var11;
				this.field4677[var4] = var6;
			}
		} else if (var2 == 4) {
			this.field4678 = var1.packBytesToInt();
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-110987764")
	void method7636() {
	}
}