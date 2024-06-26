import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
public class class263 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[Lma;",
		garbageValue = "1123961108"
	)
	static class323[] method5015() {
		return new class323[]{class323.field3538, class323.field3542, class323.field3537, class323.field3540, class323.field3544, class323.field3539, class323.field3543, class323.field3541};
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I[B[BI)V",
		garbageValue = "-1058813367"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3907 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3907 = new byte[11][];
			var0.field3980 = new byte[11][];
			var0.field3966 = new int[11];
			var0.field3910 = new int[11];
		}

		var0.field3907[var1] = var2;
		if (var2 != null) {
			var0.field3915 = true;
		} else {
			var0.field3915 = false;

			for (int var4 = 0; var4 < var0.field3907.length; ++var4) {
				if (var0.field3907[var4] != null) {
					var0.field3915 = true;
					break;
				}
			}
		}

		var0.field3980[var1] = var3;
	}
}
