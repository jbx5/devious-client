import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
@Implements("Usernamed")
public interface Usernamed {
   @ObfuscatedName("nr")
   @ObfuscatedSignature(
      descriptor = "(B)Ltj;",
      garbageValue = "-45"
   )
   @Export("username")
   Username username();
}
