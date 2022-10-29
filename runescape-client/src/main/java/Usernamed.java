import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
@Implements("Usernamed")
public interface Usernamed {
   @ObfuscatedName("mo")
   @ObfuscatedSignature(
      descriptor = "(I)Lrg;",
      garbageValue = "-2072830771"
   )
   @Export("username")
   Username username();
}
