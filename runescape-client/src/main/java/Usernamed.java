import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pt")
@Implements("Usernamed")
public interface Usernamed {
   @ObfuscatedName("nv")
   @ObfuscatedSignature(
      descriptor = "(I)Ltm;",
      garbageValue = "637501068"
   )
   @Export("username")
   Username username();
}
