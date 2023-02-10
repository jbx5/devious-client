import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
public class class303 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("HealthBarDefinition_archive")
   static AbstractArchive HealthBarDefinition_archive;
   @ObfuscatedName("iu")
   @ObfuscatedGetter(
      intValue = 1858733151
   )
   static int field3472;

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljava/lang/String;",
      garbageValue = "-59"
   )
   static final String method5869(int var0) {
      if (var0 < 100000) {
         return "<col=ffff00>" + var0 + "</col>";
      } else {
         return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>";
      }
   }
}
