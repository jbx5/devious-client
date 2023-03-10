import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
public class class290 {
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("ItemDefinition_archive")
   public static AbstractArchive ItemDefinition_archive;
   @ObfuscatedName("ff")
   @ObfuscatedSignature(
      descriptor = "Lmx;"
   )
   @Export("archive7")
   static Archive archive7;
   @ObfuscatedName("gr")
   @ObfuscatedGetter(
      intValue = 1176851199
   )
   @Export("worldPort")
   static int worldPort;

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljava/lang/String;",
      garbageValue = "1"
   )
   static final String method5488(int var0) {
      if (var0 < 100000) {
         return "<col=ffff00>" + var0 + "</col>";
      } else {
         return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>";
      }
   }
}
