import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements MouseWheel {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lho;"
   )
   field1977(0, 0),
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lho;"
   )
   @Export("HorizontalAlignment_centered")
   HorizontalAlignment_centered(2, 1),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lho;"
   )
   field1975(1, 2);

   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 375185625
   )
   @Export("value")
   public final int value;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1513901581
   )
   @Export("id")
   final int id;

   HorizontalAlignment(int var3, int var4) {
      this.value = var3;
      this.id = var4;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1409646049"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(III)Lcv;",
      garbageValue = "2046155289"
   )
   static Script method3663(int var0, int var1) {
      Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
      if (var2 != null) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = class167.archive12.getGroupId(var3);
         if (var4 == -1) {
            return null;
         } else {
            byte[] var5 = class167.archive12.takeFileFlat(var4);
            if (var5 != null) {
               if (var5.length <= 1) {
                  return null;
               }

               var2 = class4.newScript(var5);
               if (var2 != null) {
                  Script.Script_cached.put(var2, (long)(var0 << 16));
                  return var2;
               }
            }

            return null;
         }
      }
   }
}
