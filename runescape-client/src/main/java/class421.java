import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
public class class421 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "-1666888379"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		class323.method6111(var0, var1, "openjs", var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfi;",
		garbageValue = "603068554"
	)
	static class136[] method7720() {
		return new class136[]{class136.field1609, class136.field1601, class136.field1599, class136.field1602, class136.field1600, class136.field1611};
	}
}
