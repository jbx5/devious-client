import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("pr")
@Implements("DbRowType")
public class DbRowType extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Llc;")
	static AbstractArchive field4691;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("DBRowType_cache")
	static EvictingDualNodeHashTable DBRowType_cache = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("fz")
	@ObfuscatedGetter(intValue = 1406591067)
	@Export("js5Port")
	static int js5Port;

	@ObfuscatedName("f")
	@Export("columnTypes")
	Object[][] columnTypes;

	@ObfuscatedName("u")
	int[][] field4692;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -654681503)
	@Export("tableId")
	public int tableId;

	DbRowType() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-2092502516")
	void method7648(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			this.method7640(var1, var2);
		} 
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(II)[Ljava/lang/Object;", garbageValue = "-297067727")
	@Export("getColumnType")
	public Object[] getColumnType(int var1) {
		return this.columnTypes == null ? null : this.columnTypes[var1];
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqw;II)V", garbageValue = "-824344321")
	void method7640(Buffer var1, int var2) {
		if (var2 == 3) {
			int var3 = var1.readUnsignedByte();
			if (this.columnTypes == null) {
				this.columnTypes = new Object[var3][];
				this.field4692 = new int[var3][];
			}
			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) {
				int var5 = var1.readUnsignedByte();
				int[] var6 = new int[var5];
				for (int var7 = 0; var7 < var5; ++var7) {
					var6[var7] = var1.readUShortSmart();
				}
				this.columnTypes[var4] = Huffman.method5486(var1, var6);
				this.field4692[var4] = var6;
			}
		} else if (var2 == 4) {
			this.tableId = var1.packBytesToInt();
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "5")
	void method7637() {
	}
}