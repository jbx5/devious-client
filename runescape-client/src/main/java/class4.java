import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
public final class class4 {
	@ObfuscatedName("jm")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "74"
	)
	static void method16() {
		Client.menu.menuOptionsCount = 0;
		Client.isMenuOpen = false;
	}
}
