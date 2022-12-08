import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
@Implements("Usernamed")
public interface Usernamed {
   @ObfuscatedName("mw")
   @ObfuscatedSignature(
      descriptor = "(B)Lrp;",
      garbageValue = "77"
   )
   @Export("username")
   Username username();
}
