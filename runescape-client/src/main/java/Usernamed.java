import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(B)Lqo;",
		garbageValue = "101"
	)
	@Export("username")
	Username username();
}
