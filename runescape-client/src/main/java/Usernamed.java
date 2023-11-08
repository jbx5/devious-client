import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(I)Lvj;",
		garbageValue = "-1748725154"
	)
	@Export("username")
	Username username();
}
