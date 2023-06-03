import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
@Implements("Usernamed")
public interface Usernamed {
   @ObfuscatedName("np")
   @ObfuscatedSignature(
      descriptor = "(I)Lun;",
      garbageValue = "-1538198940"
   )
   @Export("username")
   Username username();
}
