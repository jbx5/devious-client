import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
public final class class429 {
	@ObfuscatedName("ed")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("ab")
	final Object field4710;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1259105071
	)
	int field4709;

	class429(Object var1, int var2) {
		this.field4710 = var1;
		this.field4709 = var2;
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(Lnq;IIIIIII)V",
		garbageValue = "-2033758944"
	)
	static final void method7971(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field588) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field588 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				class416.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				class416.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				class416.invalidateWidget(var0);
				Client.field588 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				class416.invalidateWidget(var0);
			}
		}

	}
}
