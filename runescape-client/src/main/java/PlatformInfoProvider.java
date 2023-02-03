import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)Lpu;",
      garbageValue = "-1"
   )
   @Export("get")
   PlatformInfo get();
}
