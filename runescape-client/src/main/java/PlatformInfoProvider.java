import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pt")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)Lpw;",
      garbageValue = "-1441946026"
   )
   @Export("get")
   PlatformInfo get();
}
