import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("pr")
@Implements("DbRowType")
public class DbRowType extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lls;")
	static AbstractArchive field4678;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Liz;")
	@Export("DBRowType_cache")
	static EvictingDualNodeHashTable DBRowType_cache = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;

	@ObfuscatedName("w")
	@Export("columnTypes")
	Object[][] columnTypes;

	@ObfuscatedName("v")
	int[][] field4681;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 1503762807)
	@Export("tableId")
	public int tableId;

	DbRowType() {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqr;B)V", garbageValue = "0")
	void method7542(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			this.method7543(var1, var2);
		} 
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II)[Ljava/lang/Object;", garbageValue = "1183170979")
	@Export("getColumnType")
	public Object[] getColumnType(int var1) {
		return this.columnTypes == null ? null : this.columnTypes[var1];
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqr;II)V", garbageValue = "2146701023")
	void method7543(Buffer var1, int var2) {
		if (var2 == 3) {
			int var3 = var1.readUnsignedByte();
			if (this.columnTypes == null) {
				this.columnTypes = new Object[var3][];
				this.field4681 = new int[var3][];
			}
			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) {
				int var5 = var1.readUnsignedByte();
				int[] var6 = new int[var5];
				for (int var7 = 0; var7 < var5; ++var7) {
					var6[var7] = var1.readUShortSmart();
				}
				Object[][] var16 = this.columnTypes;
				int var10 = var1.readUShortSmart();
				Object[] var11 = new Object[var6.length * var10];
				for (int var12 = 0; var12 < var10; ++var12) {
					for (int var13 = 0; var13 < var6.length; ++var13) {
						int var14 = var13 + var6.length * var12;
						class433 var15 = class19.method285(var6[var13]);
						var11[var14] = var15.method7493(var1);
					}
				}
				var16[var4] = var11;
				this.field4681[var4] = var6;
			}
		} else if (var2 == 4) {
			this.tableId = var1.packBytesToInt();
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-57")
	void method7549() {
	}
}