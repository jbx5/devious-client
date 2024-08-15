import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
public class class318 {
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 420863311
	)
	static int field3253;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1575005448"
	)
	static void method6149() {
		MouseRecorder.field1083 = new int[2000];
		int var0 = 0;
		int var1 = 240;

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) {
			var3 = IntProjection.method3823((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.075F + 0.425F * (float)var0 / 16.0F));
			MouseRecorder.field1083[var0] = var3;
			++var0;
		}

		var1 = 48;

		for (int var5 = var1 / 6; var0 < MouseRecorder.field1083.length; var1 -= var5) {
			var3 = var0 * 2;

			for (int var4 = IntProjection.method3823((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < MouseRecorder.field1083.length; ++var0) {
				MouseRecorder.field1083[var0] = var4;
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-346779613"
	)
	public static void method6150() {
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

	}
}
