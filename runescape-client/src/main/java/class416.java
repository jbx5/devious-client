import java.util.regex.Pattern;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qs")
public final class class416 {
	static {
		Pattern.compile("^\\D*(\\d+)\\D*$");
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(Lnq;I)V",
		garbageValue = "65280"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field686) {
			Client.validRootWidgets[var0.rootIndex] = true;
		}

	}
}
