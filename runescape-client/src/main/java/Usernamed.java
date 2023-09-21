import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(I)Lvf;",
		garbageValue = "-1440888763"
	)
	@Export("username")
	Username username();
}
