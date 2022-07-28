import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
@Implements("Usernamed")
public interface Usernamed {
   @ObfuscatedName("li")
   @ObfuscatedSignature(
      descriptor = "(B)Lqi;",
      garbageValue = "37"
   )
   @Export("username")
   Username username();
}
