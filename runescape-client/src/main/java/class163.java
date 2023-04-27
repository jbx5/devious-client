import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class163 extends class139 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1515394365
   )
   int field1791;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      longValue = 382806309398385789L
   )
   long field1790;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   final class142 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfa;)V"
   )
   class163(class142 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "168736686"
   )
   void vmethod3461(Buffer var1) {
      this.field1791 = var1.readInt();
      this.field1790 = var1.readLong();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfj;I)V",
      garbageValue = "1712319228"
   )
   void vmethod3458(ClanSettings var1) {
      var1.method3312(this.field1791, this.field1790);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I[III)V",
      garbageValue = "2068575587"
   )
   static void method3462(int var0, int[] var1, int var2) {
      for(int var3 = 0; var3 < KitDefinition.KitDefinition_fileCount; ++var3) {
         KitDefinition var4 = class100.KitDefinition_get(var3);
         if (var4 != null && !var4.nonSelectable && (var0 == 1 ? 7 : 0) + var2 == var4.bodypartID) {
            var1[PlayerComposition.equipmentIndices[var2]] = var3 + 256;
            break;
         }
      }

   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZI)I",
      garbageValue = "-1671510816"
   )
   static int method3463(int var0, Script var1, boolean var2) {
      if (var0 == 7108) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ByteArrayPool.method7595() ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }
}
