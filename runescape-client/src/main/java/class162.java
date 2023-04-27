import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class162 extends class155 {
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1128553755
   )
   @Export("pcmSampleLength")
   public static int pcmSampleLength;
   @ObfuscatedName("af")
   String field1787;
   @ObfuscatedName("an")
   byte field1786;
   @ObfuscatedName("aw")
   byte field1785;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lgr;"
   )
   final class156 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lgr;)V"
   )
   class162(class156 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "-1949352075"
   )
   void vmethod3448(Buffer var1) {
      this.field1787 = var1.readStringCp1252NullTerminatedOrNull();
      if (this.field1787 != null) {
         var1.readUnsignedByte();
         this.field1786 = var1.readByte();
         this.field1785 = var1.readByte();
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lgj;B)V",
      garbageValue = "-49"
   )
   void vmethod3450(ClanChannel var1) {
      var1.name = this.field1787;
      if (this.field1787 != null) {
         var1.field1768 = this.field1786;
         var1.field1774 = this.field1785;
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "68"
   )
   static void method3456() {
      Messages.Messages_channels.clear();
      Messages.Messages_hashTable.clear();
      Messages.Messages_queue.clear();
      Messages.Messages_count = 0;
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(Lmq;IIB)V",
      garbageValue = "-125"
   )
   public static void method3452(Widget var0, int var1, int var2) {
      PlayerComposition var3 = var0.field3584;
      boolean var4 = var2 != var3.gender;
      var3.gender = var2;
      if (var4) {
         int var5;
         int var7;
         if (var3.gender == var1) {
            for(var5 = 0; var5 < PlayerComposition.equipmentIndices.length; ++var5) {
               var7 = PlayerComposition.equipmentIndices[var5];
               if (var3.equipment[var7] > 0 && var3.equipment[var7] < 512) {
                  var3.equipment[var7] = var3.field3522[var7];
               }
            }
         } else {
            label71: {
               if (var3.equipment[0] >= 512) {
                  boolean var8;
                  if (var3.equipment[0] < 512) {
                     var8 = false;
                  } else {
                     ItemComposition var6 = HealthBarUpdate.ItemDefinition_get(var3.equipment[0] - 512);
                     var8 = var6.maleModel1 != class204.field2324.field2315 && var6.maleModel2 != class204.field2324.field2315;
                  }

                  if (!var8) {
                     break label71;
                  }
               }

               var3.equipment[class204.field2324.field2315] = 1;
            }

            for(var5 = 0; var5 < 7; ++var5) {
               var7 = PlayerComposition.equipmentIndices[var5];
               if (var3.equipment[var7] > 0 && var3.equipment[var7] < 512) {
                  class163.method3462(var2, var3.equipment, var5);
               }
            }
         }
      }

      var3.method6068();
   }
}
