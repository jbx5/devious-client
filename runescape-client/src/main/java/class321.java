import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lm")
public class class321 {
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "-33470033"
   )
   static int method6264(int var0, Script var1, boolean var2) {
      int var3;
      if (var0 == ScriptOpcodes.OC_NAME) {
         var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = MidiPcmStream.ItemDefinition_get(var3).name;
         return 1;
      } else {
         ItemComposition var5;
         int var6;
         if (var0 == ScriptOpcodes.OC_OP) {
            class379.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var6 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            var5 = MidiPcmStream.ItemDefinition_get(var3);
            if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) {
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
            } else {
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == ScriptOpcodes.OC_IOP) {
            class379.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var6 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            var5 = MidiPcmStream.ItemDefinition_get(var3);
            if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) {
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
            } else {
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == ScriptOpcodes.OC_COST) {
            var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MidiPcmStream.ItemDefinition_get(var3).price;
            return 1;
         } else if (var0 == ScriptOpcodes.OC_STACKABLE) {
            var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MidiPcmStream.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
            return 1;
         } else {
            ItemComposition var4;
            if (var0 == ScriptOpcodes.OC_CERT) {
               var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               var4 = MidiPcmStream.ItemDefinition_get(var3);
               if (var4.noteTemplate == -1 && var4.note >= 0) {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.note;
               } else {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.OC_UNCERT) {
               var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               var4 = MidiPcmStream.ItemDefinition_get(var3);
               if (var4.noteTemplate >= 0 && var4.note >= 0) {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.note;
               } else {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.OC_MEMBERS) {
               var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MidiPcmStream.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
               var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               var4 = MidiPcmStream.ItemDefinition_get(var3);
               if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.placeholder;
               } else {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
               var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               var4 = MidiPcmStream.ItemDefinition_get(var3);
               if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.placeholder;
               } else {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.OC_FIND) {
               String var7 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
               var6 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               class297.findItemDefinitions(var7, var6 == 1);
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MilliClock.foundItemIdCount;
               return 1;
            } else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
               if (var0 == ScriptOpcodes.OC_FINDRESET) {
                  FriendLoginUpdate.foundItemIndex = 0;
                  return 1;
               } else if (var0 == 4213) {
                  var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  var6 = MidiPcmStream.ItemDefinition_get(var3).getShiftClickIndex();
                  if (var6 == -1) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var6;
                  } else {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var6 + 1;
                  }

                  return 1;
               } else if (var0 == 4214) {
                  var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MidiPcmStream.ItemDefinition_get(var3).maleModel;
                  return 1;
               } else if (var0 == 4215) {
                  var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MidiPcmStream.ItemDefinition_get(var3).maleModel1;
                  return 1;
               } else if (var0 == 4216) {
                  var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MidiPcmStream.ItemDefinition_get(var3).maleModel2;
                  return 1;
               } else if (var0 == 4217) {
                  var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  var4 = MidiPcmStream.ItemDefinition_get(var3);
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.field2182;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (Players.foundItemIds != null && FriendLoginUpdate.foundItemIndex < MilliClock.foundItemIdCount) {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Players.foundItemIds[++FriendLoginUpdate.foundItemIndex - 1] & '\uffff';
               } else {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
               }

               return 1;
            }
         }
      }
   }
}
