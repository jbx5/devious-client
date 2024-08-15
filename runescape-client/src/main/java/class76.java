import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
public class class76 {
	@ObfuscatedName("ab")
	static final BigInteger field898;
	@ObfuscatedName("ay")
	static final BigInteger field897;

	static {
		field898 = new BigInteger("10001", 16);
		field897 = new BigInteger("be87f077fe2eba53f76a85efd5af6d75d6c5ce60fba4ddff63f6b24f1ec713743f00b8d9684ea1ae49618de0a51b3021978e743064399fe8d3b6cd07287d209c493659d5fa9a6f7ba83bc4305eef9194c15acd93fc2754399ae9d470c92b171854176cb695ff290e4d0f52a9e2a9789f9f10cb7863296941508db340ebf14c4b", 16);
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "-19"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (FloorUnderlayDefinition.widgetDefinition.loadInterface(var0)) {
			class335.field3622 = null;
			UrlRequest.drawInterface(FloorUnderlayDefinition.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (class335.field3622 != null) {
				UrlRequest.drawInterface(class335.field3622, -1412584499, var1, var2, var3, var4, ClanChannelMember.field1685, class161.field1769, var7);
				class335.field3622 = null;
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
