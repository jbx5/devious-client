import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rs")
public class class454 implements class459 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	public final class489 field4768;

	@ObfuscatedSignature(
		descriptor = "(Lsx;)V"
	)
	class454(class490 var1) {
		this.field4768 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lrp;)V"
	)
	public class454(class455 var1) {
		this(new class490(var1));
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "530420265"
	)
	public int method8287(int var1) {
		return this.field4768.vmethod8775(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfh;FS)F",
		garbageValue = "26313"
	)
	static float method8290(class130 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2;
			if (var0.field1553 == var1) {
				var2 = 0.0F;
			} else if (var1 == var0.field1554) {
				var2 = 1.0F;
			} else {
				var2 = (var1 - var0.field1553) / (var0.field1554 - var0.field1553);
			}

			float var3;
			if (var0.field1550) {
				var3 = var2;
			} else {
				class126.field1507[3] = var0.field1552;
				class126.field1507[2] = var0.field1557;
				class126.field1507[1] = var0.field1556;
				class126.field1507[0] = var0.field1555 - var2;
				class126.field1509[0] = 0.0F;
				class126.field1509[1] = 0.0F;
				class126.field1509[2] = 0.0F;
				class126.field1509[3] = 0.0F;
				class126.field1509[4] = 0.0F;
				int var4 = ModelData0.method5023(class126.field1507, 3, 0.0F, true, 1.0F, true, class126.field1509);
				if (var4 == 1) {
					var3 = class126.field1509[0];
				} else {
					var3 = 0.0F;
				}
			}

			return var3 * (var0.field1560 + var3 * (var3 * var0.field1547 + var0.field1561)) + var0.field1572;
		}
	}
}
