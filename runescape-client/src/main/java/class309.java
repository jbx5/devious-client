import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
public class class309 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3235;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3239;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3240;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3237;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3238;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3246;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3234;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3241;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3242;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3243;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3244;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3245;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3236;

	static {
		field3235 = new class309(5);
		field3239 = new class309(4);
		field3240 = new class309(7);
		field3237 = new class309(4);
		field3238 = new class309(14);
		field3246 = new class309(16);
		field3234 = new class309(14);
		field3241 = new class309(6);
		field3242 = new class309(5);
		field3243 = new class309(19);
		field3244 = new class309(11);
		field3245 = new class309(2);
		field3236 = new class309(20);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "5"
	)
	class309(int var1) {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;II)Lmq;",
		garbageValue = "-1598987475"
	)
	static MusicPatch method5871(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		return var2 == null ? null : new MusicPatch(var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-191003094"
	)
	static void method5867() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var0.obj != null) {
				var0.set();
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Luz;",
		garbageValue = "-108536845"
	)
	@Export("getDbTableType")
	public static DbTableType getDbTableType(int var0) {
		DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbTableType.field5080.takeFile(39, var0);
			var1 = new DbTableType();
			if (var2 != null) {
				var1.method9080(new Buffer(var2));
			}

			var1.method9068();
			DbTableType.DBTableType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lnm;II)V",
		garbageValue = "-1795308286"
	)
	public static void method5870(Widget var0, int var1) {
		ItemComposition var2 = class214.ItemDefinition_get(var1);
		var0.field3734.equipment[var2.maleModel] = var1 + 512;
		if (var2.maleModel1 != -1) {
			var0.field3734.equipment[var2.maleModel1] = 0;
		}

		if (var2.maleModel2 != -1) {
			var0.field3734.equipment[var2.maleModel2] = 0;
		}

		var0.field3734.method6291();
	}
}
