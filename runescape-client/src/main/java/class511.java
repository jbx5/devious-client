import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tt")
public class class511 extends class513 {
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1380122005
	)
	public static int field5136;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -667451573
	)
	int field5135;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1823935137
	)
	int field5134;

	public class511(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field5135 = 0;
		this.field5134 = 0;
		this.field5135 = var1;
		this.field5134 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1631406843"
	)
	public int method9024() {
		double var1 = this.method9044();
		return (int)Math.round((double)this.field5135 + var1 * (double)(this.field5134 - this.field5135));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Luj;",
		garbageValue = "-1812894118"
	)
	@Export("getDbTableType")
	public static DbTableType getDbTableType(int var0) {
		DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbTableType.field5307.takeFile(39, var0);
			var1 = new DbTableType();
			if (var2 != null) {
				var1.method9483(new Buffer(var2));
			}

			var1.method9490();
			DbTableType.DBTableType_cache.put(var1, (long)var0);
			return var1;
		}
	}
}
