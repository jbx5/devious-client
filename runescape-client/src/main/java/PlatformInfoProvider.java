import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rq")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)Lrk;",
      garbageValue = "-99"
   )
   @Export("get")
   PlatformInfo get();
}
