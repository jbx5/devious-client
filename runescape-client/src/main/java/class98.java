import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
public class class98 {
   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "Lra;"
   )
   static IndexedSprite field1340;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -51905745
   )
   int field1339;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1761089197
   )
   int field1332;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1499775775
   )
   int field1334;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1572552819
   )
   int field1335;

   class98(int var1, int var2, int var3, int var4) {
      this.field1339 = var1;
      this.field1332 = var2;
      this.field1334 = var3;
      this.field1335 = var4;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2043447441"
   )
   int method2592() {
      return this.field1339;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   int method2593() {
      return this.field1332;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "857409779"
   )
   int method2594() {
      return this.field1334;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "47"
   )
   int method2599() {
      return this.field1335;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Lgn;I)Z",
      garbageValue = "970496704"
   )
   static boolean method2602(ObjectComposition var0) {
      if (var0.transforms != null) {
         int[] var1 = var0.transforms;

         for(int var2 = 0; var2 < var1.length; ++var2) {
            int var3 = var1[var2];
            ObjectComposition var4 = VarpDefinition.getObjectDefinition(var3);
            if (var4.mapIconId != -1) {
               return true;
            }
         }
      } else if (var0.mapIconId != -1) {
         return true;
      }

      return false;
   }
}
