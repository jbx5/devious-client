import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
public class class421 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lvb;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ldc;I)V",
		garbageValue = "1429065701"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class535.runScript(var0, 500000, 475000);
	}
}
