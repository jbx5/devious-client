import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ru")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(B)Lvn;",
		garbageValue = "-106"
	)
	@Export("username")
	Username username();
}
