import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
public enum class93 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	field1133(0, -1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	field1126(1, 2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	field1127(2, 3),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	field1128(3, 4),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	field1129(4, 5),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	field1130(5, 6);

	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = 1291780503
	)
	static int field1125;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -730926097
	)
	final int field1131;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1478851745
	)
	final int field1132;

	class93(int var3, int var4) {
		this.field1131 = var3;
		this.field1132 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1132;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	static void method2587() {
		Tiles.Tiles_underlays = null;
		Tiles.Tiles_overlays = null;
		Tiles.Tiles_shapes = null;
		Tiles.field1037 = null;
		class543.field5378 = null;
		Tiles.Tiles_underlays2 = null;
		Tiles.field1039 = null;
		Tiles.Tiles_hue = null;
		Tiles.Tiles_saturation = null;
		SpriteBufferProperties.Tiles_lightness = null;
		MenuAction.Tiles_hueMultiplier = null;
		Tiles.field1042 = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "2"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvl;II)V",
		garbageValue = "133159266"
	)
	public static void method2592(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var3) {
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-18647"
	)
	public static void method2591() {
		ParamComposition.ParamDefinition_cached.clear();
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "1309787356"
	)
	static Object method2593(int var0) {
		return class173.method3818((class544)class177.findEnumerated(class544.method9937(), var0));
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-710649007"
	)
	static void method2596(int var0, int var1, int var2, int var3) {
		Widget var4 = class416.widgetDefinition.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			Ignored.runScriptEvent(var5);
		}

		Client.selectedSpellItemId = var3;
		Client.isSpellSelected = true;
		class483.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		class373.selectedSpellFlags = var2;
		class110.invalidateWidget(var4);
	}
}
