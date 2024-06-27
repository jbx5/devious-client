import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ut")
@Implements("DbRowType")
public class DbRowType extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	public static AbstractArchive field5305;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("DBRowType_cache")
	static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("ag")
	@Export("columnTypes")
	Object[][] columnTypes;
	@ObfuscatedName("ak")
	int[][] field5306;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -258897133
	)
	@Export("tableId")
	public int tableId;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64);
	}

	DbRowType() {
		this.tableId = -1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-779652439"
	)
	void method9460(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method9462(var1, var2);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)[Ljava/lang/Object;",
		garbageValue = "251055664"
	)
	@Export("getColumnType")
	public Object[] getColumnType(int var1) {
		return this.columnTypes == null ? null : this.columnTypes[var1];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;IB)V",
		garbageValue = "-63"
	)
	void method9462(Buffer var1, int var2) {
		if (var2 == 3) {
			int var3 = var1.readUnsignedByte();
			if (this.columnTypes == null) {
				this.columnTypes = new Object[var3][];
				this.field5306 = new int[var3][];
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
						class534 var15 = AttackOption.method2792(var6[var13]);
						var11[var14] = var15.method9409(var1);
					}
				}

				var16[var4] = var11;
				this.field5306[var4] = var6;
			}
		} else if (var2 == 4) {
			this.tableId = var1.packBytesToInt();
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "320165233"
	)
	void method9459() {
	}
}
