import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pv")
public abstract class class417 implements class261 {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lqr;"
   )
   class456 field4651;

   class417(int var1) {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;II)V",
      garbageValue = "1487404426"
   )
   abstract void vmethod7892(Buffer var1, int var2);

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lqy;B)V",
      garbageValue = "1"
   )
   public void method7891(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         class413 var3 = (class413)World.findEnumerated(GraphicsObject.method2028(), var2);
         if (var3 != null) {
            switch (var3.field4638) {
               case 0:
                  class326[] var5 = new class326[]{class326.field4140, class326.field4143, class326.field4141, class326.field4144};
                  World.findEnumerated(var5, var1.readUnsignedByte());
                  break;
               case 1:
               default:
                  throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
               case 2:
                  int var4 = var1.readUnsignedByte();
                  this.field4651 = class9.method82(var4);
                  if (this.field4651 != null) {
                     break;
                  }

                  throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
               case 3:
                  var1.readStringCp1252NullCircumfixed();
            }
         } else {
            this.vmethod7892(var1, var2);
         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(S)Z",
      garbageValue = "-3806"
   )
   boolean method7893() {
      return this.field4651 != null;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/Object;",
      garbageValue = "-84"
   )
   Object method7894() {
      if (this.field4651 == class456.field4874) {
         return 0;
      } else if (this.field4651 == class456.field4870) {
         return -1L;
      } else {
         return this.field4651 == class456.field4871 ? "" : null;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "-377158891"
   )
   static int method7903(int var0, Script var1, boolean var2) {
      int var3;
      Object var4;
      int var5;
      class460 var6;
      int var7;
      if (var0 != ScriptOpcodes.DB_FIND_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND) {
         if (var0 != ScriptOpcodes.DB_FINDNEXT) {
            int var19;
            int var20;
            if (var0 == ScriptOpcodes.DB_GETFIELD) {
               class87.Interpreter_intStackSize -= 3;
               var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
               var19 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
               var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2];
               var20 = class300.method5847(var19);
               var7 = DbTableType.method8447(var19);
               int var21 = class163.method3422(var19);
               DbRowType var26 = HealthBarUpdate.getDbRowType(var3);
               DbTableType var27 = class146.getDbTableType(var20);
               int[] var28 = var27.types[var7];
               int var12 = 0;
               int var13 = var28.length;
               if (var21 >= 0) {
                  if (var21 >= var13) {
                     throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13);
                  }

                  var12 = var21;
                  var13 = var21 + 1;
               }

               Object[] var14 = var26.getColumnType(var7);
               if (var14 == null && var27.defaultValues != null) {
                  var14 = var27.defaultValues[var7];
               }

               int var15;
               int var16;
               if (var14 == null) {
                  for(var15 = var12; var15 < var13; ++var15) {
                     var16 = var28[var15];
                     class456 var22 = class9.method82(var16);
                     if (var22 == class456.field4871) {
                        Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     } else {
                        Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class18.method269(var16);
                     }
                  }

                  return 1;
               } else {
                  var15 = var14.length / var28.length;
                  if (var5 >= 0 && var5 < var15) {
                     for(var16 = var12; var16 < var13; ++var16) {
                        int var17 = var16 + var28.length * var5;
                        class456 var18 = class9.method82(var28[var16]);
                        if (var18 == class456.field4871) {
                           Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = (String)var14[var17];
                        } else {
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (Integer)var14[var17];
                        }
                     }

                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               }
            } else if (var0 == ScriptOpcodes.DB_GETFIELDCOUNT) {
               class87.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
               var19 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
               var5 = 0;
               var20 = class300.method5847(var19);
               var7 = DbTableType.method8447(var19);
               DbRowType var25 = HealthBarUpdate.getDbRowType(var3);
               DbTableType var9 = class146.getDbTableType(var20);
               int[] var10 = var9.types[var7];
               Object[] var11 = var25.getColumnType(var7);
               if (var11 == null && var9.defaultValues != null) {
                  var11 = var9.defaultValues[var7];
               }

               if (var11 != null) {
                  var5 = var11.length / var10.length;
               }

               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5;
               return 1;
            } else if (var0 != ScriptOpcodes.DB_FINDALL_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND_FILTER) {
               if (var0 == ScriptOpcodes.DB_GETROWTABLE) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  DbRowType var24 = HealthBarUpdate.getDbRowType(var3);
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var24.tableId;
                  return 1;
               } else if (var0 == ScriptOpcodes.DB_GETROW) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  var19 = -1;
                  if (PcmPlayer.field333 != null && var3 >= 0 && var3 < PcmPlayer.field333.size()) {
                     var19 = (Integer)PcmPlayer.field333.get(var3);
                  }

                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var19;
                  return 1;
               } else if (var0 != ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT && var0 != ScriptOpcodes.DB_FINDALL) {
                  return 2;
               } else {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  var4 = class130.method3031(var3);
                  var5 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  var6 = LoginScreenAnimation.method2407(var5);
                  if (var6 == null) {
                     throw new RuntimeException();
                  } else if (class300.method5847(var5) != Client.field800) {
                     throw new RuntimeException();
                  } else if (PcmPlayer.field333 == null && PcmPlayer.field333.isEmpty()) {
                     throw new RuntimeException();
                  } else {
                     var7 = class163.method3422(var5);
                     List var8 = var6.method8451(var4, var7);
                     PcmPlayer.field333 = new LinkedList(PcmPlayer.field333);
                     if (var8 != null) {
                        PcmPlayer.field333.retainAll(var8);
                     } else {
                        PcmPlayer.field333.clear();
                     }

                     Timer.field4460 = PcmPlayer.field333.iterator();
                     if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
                        Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = PcmPlayer.field333.size();
                     }

                     return 1;
                  }
               }
            } else {
               --class87.Interpreter_intStackSize;
               var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
               class460 var23 = class412.method7854(var3);
               if (var23 == null) {
                  throw new RuntimeException();
               } else {
                  PcmPlayer.field333 = var23.method8451(0, 0);
                  var5 = 0;
                  if (PcmPlayer.field333 != null) {
                     Client.field800 = var3;
                     Timer.field4460 = PcmPlayer.field333.iterator();
                     var5 = PcmPlayer.field333.size();
                  }

                  if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5;
                  }

                  return 1;
               }
            }
         } else {
            if (Timer.field4460 != null && Timer.field4460.hasNext()) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (Integer)Timer.field4460.next();
            } else {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
            }

            return 1;
         }
      } else {
         var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
         var4 = class130.method3031(var3);
         var5 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
         var6 = LoginScreenAnimation.method2407(var5);
         if (var6 == null) {
            throw new RuntimeException();
         } else {
            var7 = class163.method3422(var5);
            PcmPlayer.field333 = var6.method8451(var4, var7);
            if (PcmPlayer.field333 != null) {
               Client.field800 = class300.method5847(var5);
               Timer.field4460 = PcmPlayer.field333.iterator();
               if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = PcmPlayer.field333.size();
               }
            } else {
               Client.field800 = -1;
               Timer.field4460 = null;
               if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
               }
            }

            return 1;
         }
      }
   }
}
