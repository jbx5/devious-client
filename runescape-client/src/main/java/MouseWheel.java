import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
@Implements("MouseWheel")
public interface MouseWheel {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "104"
   )
   @Export("rsOrdinal")
   int rsOrdinal();
}
