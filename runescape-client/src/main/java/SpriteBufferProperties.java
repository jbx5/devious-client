import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
@Implements("SpriteBufferProperties")
public class SpriteBufferProperties {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1366375317
	)
	@Export("SpriteBuffer_spriteWidth")
	public static int SpriteBuffer_spriteWidth;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "98"
	)
	public static int method7142(int var0) {
		return class535.method9466(ViewportMouse.ViewportMouse_entityTags[var0]);
	}
}
