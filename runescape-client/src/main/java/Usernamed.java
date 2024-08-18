import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("re")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "(I)Lvf;",
		garbageValue = "945769376"
	)
	@Export("username")
	Username username();
}
