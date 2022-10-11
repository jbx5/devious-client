import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
@Implements("DbRowType")
public class DbRowType extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	static AbstractArchive field4718;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("DBRowType_cache")
	public static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("f")
	@Export("columnTypes")
	Object[][] columnTypes;
	@ObfuscatedName("n")
	int[][] field4716;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1580984827
	)
	@Export("tableId")
	public int tableId;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	DbRowType() {
		this.tableId = -1; // L: 14
	} // L: 17

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "-435731106"
	)
	void method7830(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 == 0) { // L: 37
				return; // L: 40
			}

			this.method7826(var1, var2); // L: 38
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)[Ljava/lang/Object;",
		garbageValue = "906427284"
	)
	@Export("getColumnType")
	public Object[] getColumnType(int var1) {
		return this.columnTypes == null ? null : this.columnTypes[var1]; // L: 43 44
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lqq;II)V",
		garbageValue = "2127843822"
	)
	void method7826(Buffer var1, int var2) {
		if (var2 == 3) { // L: 48
			int var3 = var1.readUnsignedByte(); // L: 49
			if (this.columnTypes == null) { // L: 50
				this.columnTypes = new Object[var3][]; // L: 51
				this.field4716 = new int[var3][]; // L: 52
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 54 55 63
				int var5 = var1.readUnsignedByte(); // L: 56
				int[] var6 = new int[var5]; // L: 57

				for (int var7 = 0; var7 < var5; ++var7) { // L: 58
					var6[var7] = var1.readUShortSmart(); // L: 59
				}

				this.columnTypes[var4] = class358.method6730(var1, var6); // L: 61
				this.field4716[var4] = var6; // L: 62
			}
		} else if (var2 == 4) { // L: 66
			this.tableId = var1.packBytesToInt(); // L: 67
		}

	} // L: 70

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1247469224"
	)
	void method7829() {
	} // L: 72
}
