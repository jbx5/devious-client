import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("c")
public class class20 implements Callable {
   @ObfuscatedName("sr")
   @ObfuscatedSignature(
      descriptor = "Lep;"
   )
   @Export("guestClanSettings")
   static ClanSettings guestClanSettings;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lac;"
   )
   @Export("pcmPlayerProvider")
   public static class51 pcmPlayerProvider;
   @ObfuscatedName("am")
   @Export("fontHelvetica13")
   static java.awt.Font fontHelvetica13;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lj;"
   )
   final class10 field117;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Ln;"
   )
   final class14 this$0;

   @ObfuscatedSignature(
      descriptor = "(Ln;Lj;)V"
   )
   class20(class14 var1, class10 var2) {
      this.this$0 = var1;
      this.field117 = var2;
   }

   public Object call() throws Exception {
      try {
         while(this.field117.method88()) {
            class12.method157(10L);
         }
      } catch (IOException var2) {
         return new class21("Error servicing REST query: " + var2.getMessage());
      }

      return this.field117.method89();
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "-779759676"
   )
   static int method292(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZB)I",
      garbageValue = "114"
   )
   static int method294(int var0, Script var1, boolean var2) {
      int var3;
      if (var0 == ScriptOpcodes.OC_NAME) {
         var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
         Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = NPCComposition.ItemDefinition_get(var3).name;
         return 1;
      } else {
         ItemComposition var5;
         int var6;
         if (var0 == ScriptOpcodes.OC_OP) {
            class87.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var6 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            var5 = NPCComposition.ItemDefinition_get(var3);
            if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) {
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
            } else {
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == ScriptOpcodes.OC_IOP) {
            class87.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var6 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            var5 = NPCComposition.ItemDefinition_get(var3);
            if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) {
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
            } else {
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == ScriptOpcodes.OC_COST) {
            var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = NPCComposition.ItemDefinition_get(var3).price;
            return 1;
         } else if (var0 == ScriptOpcodes.OC_STACKABLE) {
            var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = NPCComposition.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
            return 1;
         } else {
            ItemComposition var4;
            if (var0 == ScriptOpcodes.OC_CERT) {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               var4 = NPCComposition.ItemDefinition_get(var3);
               if (var4.noteTemplate == -1 && var4.note >= 0) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.note;
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.OC_UNCERT) {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               var4 = NPCComposition.ItemDefinition_get(var3);
               if (var4.noteTemplate >= 0 && var4.note >= 0) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.note;
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.OC_MEMBERS) {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = NPCComposition.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               var4 = NPCComposition.ItemDefinition_get(var3);
               if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.placeholder;
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               var4 = NPCComposition.ItemDefinition_get(var3);
               if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.placeholder;
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.OC_FIND) {
               String var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               var6 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               class298.findItemDefinitions(var7, var6 == 1);
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ScriptEvent.foundItemIdCount;
               return 1;
            } else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
               if (var0 == ScriptOpcodes.OC_FINDRESET) {
                  UserComparator6.foundItemIndex = 0;
                  return 1;
               } else if (var0 == 4213) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  var6 = NPCComposition.ItemDefinition_get(var3).getShiftClickIndex();
                  if (var6 == -1) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var6;
                  } else {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var6 + 1;
                  }

                  return 1;
               } else if (var0 == 4214) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = NPCComposition.ItemDefinition_get(var3).maleModel;
                  return 1;
               } else if (var0 == 4215) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = NPCComposition.ItemDefinition_get(var3).maleModel1;
                  return 1;
               } else if (var0 == 4216) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = NPCComposition.ItemDefinition_get(var3).maleModel2;
                  return 1;
               } else if (var0 == 4217) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  var4 = NPCComposition.ItemDefinition_get(var3);
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.field2224;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (class19.foundItemIds != null && UserComparator6.foundItemIndex < ScriptEvent.foundItemIdCount) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class19.foundItemIds[++UserComparator6.foundItemIndex - 1] & '\uffff';
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
               }

               return 1;
            }
         }
      }
   }

   @ObfuscatedName("gi")
   @ObfuscatedSignature(
      descriptor = "(Lga;IIIS)V",
      garbageValue = "-29230"
   )
   static void method293(SequenceDefinition var0, int var1, int var2, int var3) {
      if (Client.soundEffectCount < 50 && StructComposition.clientPreferences.method2506() != 0) {
         if (var0.field2283 != null && var0.field2283.containsKey(var1)) {
            int var4 = (Integer)var0.field2283.get(var1);
            if (var4 != 0) {
               int var7 = var4 >> 8;
               int var8 = var4 >> 4 & 7;
               int var9 = var4 & 15;
               Client.soundEffectIds[Client.soundEffectCount] = var7;
               Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8;
               Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
               Client.soundEffects[Client.soundEffectCount] = null;
               int var10 = (var2 - 64) / 128;
               int var11 = (var3 - 64) / 128;
               Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16);
               ++Client.soundEffectCount;
            }

         }
      }
   }
}
