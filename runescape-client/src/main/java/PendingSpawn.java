import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "[Lun;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1383860513
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1109299775
	)
	@Export("type")
	int type;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1415427477
	)
	@Export("x")
	int x;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -444130973
	)
	@Export("y")
	int y;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 700260725
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 761889211
	)
	int field1178;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2125054333
	)
	int field1176;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1497418465
	)
	int field1177;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1698941181
	)
	int field1170;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 607121519
	)
	int field1173;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1155527501
	)
	int field1180;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 88075867
	)
	int field1181;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 269057879
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2145088427
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1181 = 31;
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1554580645"
	)
	void method2413(int var1) {
		this.field1181 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "585710320"
	)
	boolean method2415(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1181 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-121"
	)
	static final void method2418(String var0) {
		class436.method7914(var0 + " is already on your friend list");
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "([Lnm;Lnm;ZB)V",
		garbageValue = "-37"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width;
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height;
		class360.resizeInterface(var0, var1.id, var3, var4, var2);
		if (var1.children != null) {
			class360.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
		if (var5 != null) {
			int var6 = var5.group;
			if (class33.widgetDefinition.loadInterface(var6)) {
				class360.resizeInterface(class33.widgetDefinition.Widget_interfaceComponents[var6], -1, var3, var4, var2);
			}
		}

		if (var1.contentType == 1337) {
		}

	}
}
