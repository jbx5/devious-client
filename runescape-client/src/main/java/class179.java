import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
public class class179 extends class185 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	static IndexedSprite field1901;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1299685023
	)
	static int field1899;
	@ObfuscatedName("pg")
	@ObfuscatedGetter(
		intValue = 1418007055
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("az")
	String field1900;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	final class182 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lhq;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class179(class182 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1900 = var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1882788400"
	)
	public int vmethod3670() {
		return 1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-53"
	)
	public String vmethod3666() {
		return this.field1900;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FI)F",
		garbageValue = "-1095561399"
	)
	static float method3545(class131 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2;
			if (var0.field1560 == var1) {
				var2 = 0.0F;
			} else if (var1 == var0.field1565) {
				var2 = 1.0F;
			} else {
				var2 = (var1 - var0.field1560) / (var0.field1565 - var0.field1560);
			}

			float var3;
			if (var0.field1563) {
				var3 = var2;
			} else {
				class127.field1523[3] = var0.field1569;
				class127.field1523[2] = var0.field1564;
				class127.field1523[1] = var0.field1580;
				class127.field1523[0] = var0.field1581 - var2;
				class127.field1524[0] = 0.0F;
				class127.field1524[1] = 0.0F;
				class127.field1524[2] = 0.0F;
				class127.field1524[3] = 0.0F;
				class127.field1524[4] = 0.0F;
				int var4 = Players.method2712(class127.field1523, 3, 0.0F, true, 1.0F, true, class127.field1524);
				if (var4 == 1) {
					var3 = class127.field1524[0];
				} else {
					var3 = 0.0F;
				}
			}

			return var0.field1577 + (var0.field1571 + var3 * (var0.field1572 + var3 * var0.field1570)) * var3;
		}
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "74"
	)
	static final int method3554(int var0) {
		return Math.abs(var0 - class17.cameraYaw) > 1024 ? (var0 < class17.cameraYaw ? 1 : -1) * 2048 + var0 : var0;
	}
}
