import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
public class class190 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)Ldd;",
      garbageValue = "2001284131"
   )
   @Export("getScript")
   static Script getScript(int var0) {
      Script var1 = (Script)Script.Script_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class33.archive12.takeFile(var0, 0);
         if (var2 == null) {
            return null;
         } else {
            var1 = class165.newScript(var2);
            Script.Script_cached.put(var1, (long)var0);
            return var1;
         }
      }
   }
}
