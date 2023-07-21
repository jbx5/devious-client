import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qv")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(I)Lui;",
		garbageValue = "466420447"
	)
	@Export("username")
	Username username();
}
