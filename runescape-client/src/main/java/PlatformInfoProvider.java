import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Lrv;",
      garbageValue = "1351664737"
   )
   @Export("get")
   PlatformInfo get();
}
