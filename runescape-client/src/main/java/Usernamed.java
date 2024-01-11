import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("re")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "(I)Lvs;",
		garbageValue = "-227041458"
	)
	@Export("username")
	Username username();
}
