import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Los;",
		garbageValue = "650886261"
	)
	@Export("get")
	PlatformInfo get();
}
