import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("MouseWheel")
public interface MouseWheel {
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1790946346"
   )
   @Export("rsOrdinal")
   int rsOrdinal();
}
