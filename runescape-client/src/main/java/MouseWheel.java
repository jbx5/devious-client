import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("MouseWheel")
public interface MouseWheel {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "89"
	)
	@Export("useRotation")
	int useRotation();
}
