import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lc")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("superStream")
   MidiPcmStream superStream;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lnh;"
   )
   @Export("queue")
   NodeDeque queue = new NodeDeque();
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lbn;"
   )
   @Export("mixer")
   PcmStreamMixer mixer = new PcmStreamMixer();

   @ObfuscatedSignature(
      descriptor = "(Lln;)V"
   )
   MusicPatchPcmStream(MidiPcmStream var1) {
      this.superStream = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Llq;[IIIII)V",
      garbageValue = "1090554723"
   )
   void method5950(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
      if ((this.superStream.field3405[var1.field3467] & 4) != 0 && var1.field3464 < 0) {
         int var6 = this.superStream.field3410[var1.field3467] / (PcmPlayer.field306 * 586337296);

         while(true) {
            int var7 = (var6 + 1048575 - var1.field3469) / var6;
            if (var7 > var4) {
               var1.field3469 += var6 * var4;
               break;
            }

            var1.stream.fill(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.field3469 += var6 * var7 - 1048576;
            int var8 = PcmPlayer.field306 * 586337296 / 100;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            RawPcmStream var10 = var1.stream;
            if (this.superStream.field3408[var1.field3467] == 0) {
               var1.stream = RawPcmStream.method978(var1.rawSound, var10.method918(), var10.method909(), var10.method941());
            } else {
               var1.stream = RawPcmStream.method978(var1.rawSound, var10.method918(), 0, var10.method941());
               this.superStream.method5805(var1, var1.patch.field3436[var1.field3454] < 0);
               var1.stream.method1014(var8, var10.method909());
            }

            if (var1.patch.field3436[var1.field3454] < 0) {
               var1.stream.setNumLoops(-1);
            }

            var10.method916(var8);
            var10.fill(var2, var3, var5 - var3);
            if (var10.method1021()) {
               this.mixer.addSubStream(var10);
            }
         }
      }

      var1.stream.fill(var2, var3, var4);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Llq;IB)V",
      garbageValue = "1"
   )
   void method5948(MusicPatchNode var1, int var2) {
      if ((this.superStream.field3405[var1.field3467] & 4) != 0 && var1.field3464 < 0) {
         int var3 = this.superStream.field3410[var1.field3467] / (PcmPlayer.field306 * 586337296);
         int var4 = (var3 + 1048575 - var1.field3469) / var3;
         var1.field3469 = var3 * var2 + var1.field3469 & 1048575;
         if (var4 <= var2) {
            if (this.superStream.field3408[var1.field3467] == 0) {
               var1.stream = RawPcmStream.method978(var1.rawSound, var1.stream.method918(), var1.stream.method909(), var1.stream.method941());
            } else {
               var1.stream = RawPcmStream.method978(var1.rawSound, var1.stream.method918(), 0, var1.stream.method941());
               this.superStream.method5805(var1, var1.patch.field3436[var1.field3454] < 0);
            }

            if (var1.patch.field3436[var1.field3454] < 0) {
               var1.stream.setNumLoops(-1);
            }

            var2 = var1.field3469 / var3;
         }
      }

      var1.stream.skip(var2);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "()Lbp;"
   )
   @Export("firstSubStream")
   protected PcmStream firstSubStream() {
      MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
      if (var1 == null) {
         return null;
      } else {
         return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream());
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "()Lbp;"
   )
   @Export("nextSubStream")
   protected PcmStream nextSubStream() {
      MusicPatchNode var1;
      do {
         var1 = (MusicPatchNode)this.queue.previous();
         if (var1 == null) {
            return null;
         }
      } while(var1.stream == null);

      return var1.stream;
   }

   @ObfuscatedName("al")
   protected int vmethod5949() {
      return 0;
   }

   @ObfuscatedName("at")
   @Export("fill")
   protected void fill(int[] var1, int var2, int var3) {
      this.mixer.fill(var1, var2, var3);

      for(MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
         if (!this.superStream.method5878(var6)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.field3462) {
                  this.method5950(var6, var1, var4, var5, var5 + var4);
                  var6.field3462 -= var5;
                  break;
               }

               this.method5950(var6, var1, var4, var6.field3462, var4 + var5);
               var4 += var6.field3462;
               var5 -= var6.field3462;
            } while(!this.superStream.method5798(var6, var1, var4, var5));
         }
      }

   }

   @ObfuscatedName("ay")
   @Export("skip")
   protected void skip(int var1) {
      this.mixer.skip(var1);

      for(MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
         if (!this.superStream.method5878(var3)) {
            int var2 = var1;

            do {
               if (var2 <= var3.field3462) {
                  this.method5948(var3, var2);
                  var3.field3462 -= var2;
                  break;
               }

               this.method5948(var3, var3.field3462);
               var2 -= var3.field3462;
            } while(!this.superStream.method5798(var3, (int[])null, 0, var2));
         }
      }

   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZB)I",
      garbageValue = "41"
   )
   static int method5944(int var0, Script var1, boolean var2) {
      int var3;
      if (var0 == ScriptOpcodes.OC_NAME) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = HealthBarUpdate.ItemDefinition_get(var3).name;
         return 1;
      } else {
         ItemComposition var5;
         int var6;
         if (var0 == ScriptOpcodes.OC_OP) {
            Interpreter.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var5 = HealthBarUpdate.ItemDefinition_get(var3);
            if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) {
               Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
            } else {
               Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == ScriptOpcodes.OC_IOP) {
            Interpreter.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var5 = HealthBarUpdate.ItemDefinition_get(var3);
            if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) {
               Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
            } else {
               Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == ScriptOpcodes.OC_COST) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBarUpdate.ItemDefinition_get(var3).price;
            return 1;
         } else if (var0 == ScriptOpcodes.OC_STACKABLE) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBarUpdate.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
            return 1;
         } else {
            ItemComposition var4;
            if (var0 == ScriptOpcodes.OC_CERT) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               var4 = HealthBarUpdate.ItemDefinition_get(var3);
               if (var4.noteTemplate == -1 && var4.note >= 0) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.note;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.OC_UNCERT) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               var4 = HealthBarUpdate.ItemDefinition_get(var3);
               if (var4.noteTemplate >= 0 && var4.note >= 0) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.note;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.OC_MEMBERS) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBarUpdate.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               var4 = HealthBarUpdate.ItemDefinition_get(var3);
               if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.placeholder;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               var4 = HealthBarUpdate.ItemDefinition_get(var3);
               if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.placeholder;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.OC_FIND) {
               String var7 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
               var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               class68.findItemDefinitions(var7, var6 == 1);
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class264.foundItemIdCount;
               return 1;
            } else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
               if (var0 == ScriptOpcodes.OC_FINDRESET) {
                  FontName.foundItemIndex = 0;
                  return 1;
               } else if (var0 == 4213) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var6 = HealthBarUpdate.ItemDefinition_get(var3).getShiftClickIndex();
                  if (var6 == -1) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6;
                  } else {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6 + 1;
                  }

                  return 1;
               } else if (var0 == 4214) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBarUpdate.ItemDefinition_get(var3).maleModel;
                  return 1;
               } else if (var0 == 4215) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBarUpdate.ItemDefinition_get(var3).maleModel1;
                  return 1;
               } else if (var0 == 4216) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBarUpdate.ItemDefinition_get(var3).maleModel2;
                  return 1;
               } else if (var0 == 4217) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = HealthBarUpdate.ItemDefinition_get(var3);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.field2251;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (class399.foundItemIds != null && FontName.foundItemIndex < class264.foundItemIdCount) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class399.foundItemIds[++FontName.foundItemIndex - 1] & '\uffff';
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
               }

               return 1;
            }
         }
      }
   }
}
