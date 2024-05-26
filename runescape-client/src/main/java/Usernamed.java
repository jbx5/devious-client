import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rn")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "(I)Lvv;",
		garbageValue = "1783143876"
	)
	@Export("username")
	Username username();
}
