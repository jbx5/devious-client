import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
@Implements("Usernamed")
public interface Usernamed {
   @ObfuscatedName("ma")
   @ObfuscatedSignature(
      descriptor = "(I)Lsi;",
      garbageValue = "-2141997640"
   )
   @Export("username")
   Username username();
}
