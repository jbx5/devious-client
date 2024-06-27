import java.util.regex.Pattern;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
public final class class415 {
	@ObfuscatedName("br")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	public static Client client;

	static {
		Pattern.compile("^\\D*(\\d+)\\D*$");
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(CLpe;I)I",
		garbageValue = "-1294766597"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}
}
