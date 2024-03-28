import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1966640063
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1143807725
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2074293697
	)
	int field1368;

	TileItem() {
		this.field1368 = 31;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2105793353"
	)
	void method2680(int var1) {
		this.field1368 = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljn;",
		garbageValue = "1157175232"
	)
	@Export("getModel")
	protected final Model getModel() {
		return HttpRequest.ItemDefinition_get(this.id).getModel(this.quantity);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1113455560"
	)
	boolean method2690(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1368 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "662928347"
	)
	static final int method2691(int var0, int var1) {
		int var2 = var0 + var1 * 57;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1233600598"
	)
	static final void method2679() {
		Client.field681 = Client.cycleCntr;
		GraphicsObject.field893 = true;
	}
}
