import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
public class class176 extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("archive5")
	static EvictingDualNodeHashTable archive5;
	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("varcs")
	static Varcs varcs;

	static {
		archive5 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I[B[BI)V",
		garbageValue = "1486108437"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3735 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3735 = new byte[11][];
			var0.field3704 = new byte[11][];
			var0.field3672 = new int[11];
			var0.field3756 = new int[11];
		}

		var0.field3735[var1] = var2;
		if (var2 != null) {
			var0.field3734 = true;
		} else {
			var0.field3734 = false;

			for (int var4 = 0; var4 < var0.field3735.length; ++var4) {
				if (var0.field3735[var4] != null) {
					var0.field3734 = true;
					break;
				}
			}
		}

		var0.field3704[var1] = var3;
	}
}
