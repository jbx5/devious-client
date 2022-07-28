import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("oh")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)Lou;", garbageValue = "-1956544923")
	@Export("get")
	PlatformInfo get();
}