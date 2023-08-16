import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
public class class36 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("aj")
	@Export("userHomeDirectory")
	static String userHomeDirectory;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "16"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (ModeWhere.loadInterface(var0)) {
			class162.field1797 = null;
			class135.drawInterface(PacketBufferNode.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (class162.field1797 != null) {
				class135.drawInterface(class162.field1797, -1412584499, var1, var2, var3, var4, class134.field1611, class326.field3559, var7);
				class162.field1797 = null;
			}

		} else {
			if (var7 != -1) {
				Client.validRootWidgets[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.validRootWidgets[var8] = true;
				}
			}

		}
	}
}
