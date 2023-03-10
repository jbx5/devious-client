import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rb")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)Lrt;",
      garbageValue = "389494998"
   )
   @Export("get")
   PlatformInfo get();
}
