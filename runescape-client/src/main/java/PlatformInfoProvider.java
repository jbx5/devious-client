import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ok")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)Loo;", garbageValue = "-223070483")
	@Export("get")
	PlatformInfo get();
}