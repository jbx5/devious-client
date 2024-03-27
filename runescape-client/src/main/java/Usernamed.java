import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rd")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(I)Lvx;",
		garbageValue = "617300231"
	)
	@Export("username")
	Username username();
}
