import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rb")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	static IndexedSprite field4811;

	static {
		TriBool_unknown = new TriBool();
		TriBool_true = new TriBool();
		TriBool_false = new TriBool();
	}

	TriBool() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Luv;",
		garbageValue = "-958861827"
	)
	@Export("getDbTableType")
	public static DbTableType getDbTableType(int var0) {
		DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbTableType.field5163.takeFile(39, var0);
			var1 = new DbTableType();
			if (var2 != null) {
				var1.method9148(new Buffer(var2));
			}

			var1.method9151();
			DbTableType.DBTableType_cache.put(var1, (long)var0);
			return var1;
		}
	}
}
