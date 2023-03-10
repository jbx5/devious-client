import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("am")
public class class14 {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1185576571
   )
   final int field71;
   @ObfuscatedName("al")
   final String field70;
   @ObfuscatedName("ac")
   final ThreadFactory field73;
   @ObfuscatedName("ab")
   final ThreadPoolExecutor field72;

   public class14(String var1, int var2, int var3) {
      this.field70 = var1;
      this.field71 = var2;
      this.field73 = new class16(this);
      this.field72 = this.method167(var3);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljava/util/concurrent/ThreadPoolExecutor;",
      garbageValue = "-5"
   )
   final ThreadPoolExecutor method167(int var1) {
      return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field71), this.field73);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lak;S)Lag;",
      garbageValue = "15032"
   )
   public class18 method165(class10 var1) {
      if (this.field72.getQueue().remainingCapacity() <= 0) {
         System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field72.getCorePoolSize() + " Queue capacity " + this.field71);
         return new class18("Queue full");
      } else {
         class18 var2 = new class18(this.field72.submit(new class19(this, var1)));
         return var2;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "40"
   )
   public final void method176() {
      try {
         this.field72.shutdown();
      } catch (Exception var2) {
         System.err.println("Error shutting down RestRequestService\r\n" + var2);
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Ldx;III)V",
      garbageValue = "-1914250793"
   )
   @Export("runScript")
   static void runScript(ScriptEvent var0, int var1, int var2) {
      Object[] var3 = var0.args;
      Script var4;
      int var20;
      if (Skills.isWorldMapEvent(var0.type)) {
         InvDefinition.worldMapEvent = (WorldMapEvent)var3[0];
         WorldMapElement var5 = class123.WorldMapElement_get(InvDefinition.worldMapEvent.mapElement);
         var4 = GrandExchangeOfferNameComparator.getWorldMapScript(var0.type, var5.objectId, var5.category);
      } else {
         var20 = (Integer)var3[0];
         var4 = SecureRandomCallable.getScript(var20);
      }

      if (var4 != null) {
         Interpreter.Interpreter_intStackSize = 0;
         HealthBar.Interpreter_stringStackSize = 0;
         var20 = -1;
         int[] var6 = var4.opcodes;
         int[] var7 = var4.intOperands;
         int var8 = -1;
         Interpreter.Interpreter_frameDepth = 0;
         Interpreter.field835 = false;
         boolean var9 = false;
         int var10 = 0;
         boolean var30 = false;

         label954: {
            label955: {
               try {
                  int var13;
                  try {
                     var30 = true;
                     Interpreter.Interpreter_intLocals = new int[var4.localIntCount];
                     int var11 = 0;
                     Interpreter.Interpreter_stringLocals = new String[var4.localStringCount];
                     int var12 = 0;

                     int var14;
                     String var21;
                     for(var13 = 1; var13 < var3.length; ++var13) {
                        if (var3[var13] instanceof Integer) {
                           var14 = (Integer)var3[var13];
                           if (var14 == -2147483647) {
                              var14 = var0.mouseX;
                           }

                           if (var14 == -2147483646) {
                              var14 = var0.mouseY;
                           }

                           if (var14 == -2147483645) {
                              var14 = var0.widget != null ? var0.widget.id : -1;
                           }

                           if (var14 == -2147483644) {
                              var14 = var0.opIndex;
                           }

                           if (var14 == -2147483643) {
                              var14 = var0.widget != null ? var0.widget.childIndex : -1;
                           }

                           if (var14 == -2147483642) {
                              var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
                           }

                           if (var14 == -2147483641) {
                              var14 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
                           }

                           if (var14 == -2147483640) {
                              var14 = var0.keyTyped;
                           }

                           if (var14 == -2147483639) {
                              var14 = var0.keyPressed;
                           }

                           Interpreter.Interpreter_intLocals[var11++] = var14;
                        } else if (var3[var13] instanceof String) {
                           var21 = (String)var3[var13];
                           if (var21.equals("event_opbase")) {
                              var21 = var0.targetName;
                           }

                           Interpreter.Interpreter_stringLocals[var12++] = var21;
                        }
                     }

                     Interpreter.field838 = var0.field1051;

                     while(true) {
                        ++var10;
                        if (var10 > var1) {
                           throw new RuntimeException();
                        }

                        ++var20;
                        var8 = var6[var20];
                        if (var8 >= 100) {
                           boolean var34;
                           if (var4.intOperands[var20] == 1) {
                              var34 = true;
                           } else {
                              var34 = false;
                           }

                           var14 = class7.method40(var8, var4, var34);
                           switch (var14) {
                              case 0:
                                 var30 = false;
                                 break label954;
                              case 1:
                              default:
                                 break;
                              case 2:
                                 throw new IllegalStateException();
                           }
                        } else if (var8 == ScriptOpcodes.ICONST) {
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7[var20];
                        } else if (var8 == ScriptOpcodes.GET_VARP) {
                           var13 = var7[var20];
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
                        } else if (var8 == ScriptOpcodes.SET_VARP) {
                           var13 = var7[var20];
                           Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                           class159.changeGameOptions(var13);
                        } else if (var8 == ScriptOpcodes.SCONST) {
                           Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.stringOperands[var20];
                        } else if (var8 == ScriptOpcodes.JUMP) {
                           var20 += var7[var20];
                        } else if (var8 == ScriptOpcodes.IF_ICMPNE) {
                           Interpreter.Interpreter_intStackSize -= 2;
                           if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                              var20 += var7[var20];
                           }
                        } else if (var8 == ScriptOpcodes.IF_ICMPEQ) {
                           Interpreter.Interpreter_intStackSize -= 2;
                           if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                              var20 += var7[var20];
                           }
                        } else if (var8 == ScriptOpcodes.IF_ICMPLT) {
                           Interpreter.Interpreter_intStackSize -= 2;
                           if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                              var20 += var7[var20];
                           }
                        } else if (var8 == ScriptOpcodes.IF_ICMPGT) {
                           Interpreter.Interpreter_intStackSize -= 2;
                           if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                              var20 += var7[var20];
                           }
                        } else if (var8 == ScriptOpcodes.RETURN) {
                           if (Interpreter.Interpreter_frameDepth == 0) {
                              var30 = false;
                              break;
                           }

                           ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
                           var4 = var39.script;
                           var6 = var4.opcodes;
                           var7 = var4.intOperands;
                           var20 = var39.pc;
                           Interpreter.Interpreter_intLocals = var39.intLocals;
                           Interpreter.Interpreter_stringLocals = var39.stringLocals;
                        } else if (var8 == ScriptOpcodes.GET_VARBIT) {
                           var13 = var7[var20];
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class17.getVarbit(var13);
                        } else if (var8 == ScriptOpcodes.SET_VARBIT) {
                           var13 = var7[var20];
                           MouseRecorder.method2275(var13, Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
                        } else if (var8 == ScriptOpcodes.IF_ICMPLE) {
                           Interpreter.Interpreter_intStackSize -= 2;
                           if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                              var20 += var7[var20];
                           }
                        } else if (var8 == ScriptOpcodes.IF_ICMPGE) {
                           Interpreter.Interpreter_intStackSize -= 2;
                           if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                              var20 += var7[var20];
                           }
                        } else if (var8 == ScriptOpcodes.ILOAD) {
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var20]];
                        } else if (var8 == ScriptOpcodes.ISTORE) {
                           Interpreter.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        } else if (var8 == ScriptOpcodes.SLOAD) {
                           Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var20]];
                        } else if (var8 == ScriptOpcodes.SSTORE) {
                           Interpreter.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                        } else if (var8 == ScriptOpcodes.JOIN_STRING) {
                           var13 = var7[var20];
                           HealthBar.Interpreter_stringStackSize -= var13;
                           var21 = class364.method6855(Interpreter.Interpreter_stringStack, HealthBar.Interpreter_stringStackSize, var13);
                           Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var21;
                        } else if (var8 == ScriptOpcodes.POP_INT) {
                           --Interpreter.Interpreter_intStackSize;
                        } else if (var8 == ScriptOpcodes.POP_STRING) {
                           --HealthBar.Interpreter_stringStackSize;
                        } else {
                           int var17;
                           if (var8 != ScriptOpcodes.INVOKE) {
                              if (var8 == ScriptOpcodes.GET_VARC_INT) {
                                 Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class248.varcs.getInt(var7[var20]);
                              } else if (var8 == ScriptOpcodes.SET_VARC_INT) {
                                 class248.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
                              } else if (var8 == ScriptOpcodes.DEFINE_ARRAY) {
                                 var13 = var7[var20] >> 16;
                                 var14 = var7[var20] & '\uffff';
                                 int var24 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                                 if (var24 < 0 || var24 > 5000) {
                                    throw new RuntimeException();
                                 }

                                 Interpreter.Interpreter_arrayLengths[var13] = var24;
                                 byte var25 = -1;
                                 if (var14 == 105) {
                                    var25 = 0;
                                 }

                                 for(var17 = 0; var17 < var24; ++var17) {
                                    Interpreter.Interpreter_arrays[var13][var17] = var25;
                                 }
                              } else if (var8 == ScriptOpcodes.GET_ARRAY_INT) {
                                 var13 = var7[var20];
                                 var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                                 if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
                                    throw new RuntimeException();
                                 }

                                 Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
                              } else if (var8 == ScriptOpcodes.SET_ARRAY_INT) {
                                 var13 = var7[var20];
                                 Interpreter.Interpreter_intStackSize -= 2;
                                 var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                                 if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
                                    throw new RuntimeException();
                                 }

                                 Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                              } else {
                                 String var22;
                                 if (var8 == ScriptOpcodes.GET_VARC_STRING_OLD) {
                                    var22 = class248.varcs.getStringOld(var7[var20]);
                                    if (var22 == null) {
                                       var22 = "null";
                                    }

                                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var22;
                                 } else if (var8 == ScriptOpcodes.SET_VARC_STRING_OLD) {
                                    class248.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]);
                                 } else if (var8 == ScriptOpcodes.GET_VARC_STRING) {
                                    var22 = class248.varcs.getString(var7[var20]);
                                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var22;
                                 } else if (var8 == ScriptOpcodes.SET_VARC_STRING) {
                                    class248.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]);
                                 } else if (var8 == ScriptOpcodes.SWITCH) {
                                    IterableNodeHashTable var37 = var4.switches[var7[var20]];
                                    IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
                                    if (var36 != null) {
                                       var20 += var36.integer;
                                    }
                                 } else {
                                    Integer var38;
                                    if (var8 == ScriptOpcodes.GET_VARCLANSETTING) {
                                       var38 = class366.field4338.getTitleGroupValue(var7[var20]);
                                       if (var38 == null) {
                                          Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                                       } else {
                                          Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var38;
                                       }
                                    } else {
                                       if (var8 != ScriptOpcodes.GET_VARCLAN) {
                                          throw new IllegalStateException();
                                       }

                                       var38 = class188.field1958.method7934(var7[var20]);
                                       if (var38 == null) {
                                          Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                                       } else {
                                          Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var38;
                                       }
                                    }
                                 }
                              }
                           } else {
                              var13 = var7[var20];
                              Script var35 = SecureRandomCallable.getScript(var13);
                              int[] var15 = new int[var35.localIntCount];
                              String[] var16 = new String[var35.localStringCount];

                              for(var17 = 0; var17 < var35.intArgumentCount; ++var17) {
                                 var15[var17] = Interpreter.Interpreter_intStack[var17 + (Interpreter.Interpreter_intStackSize - var35.intArgumentCount)];
                              }

                              for(var17 = 0; var17 < var35.stringArgumentCount; ++var17) {
                                 var16[var17] = Interpreter.Interpreter_stringStack[var17 + (HealthBar.Interpreter_stringStackSize - var35.stringArgumentCount)];
                              }

                              Interpreter.Interpreter_intStackSize -= var35.intArgumentCount;
                              HealthBar.Interpreter_stringStackSize -= var35.stringArgumentCount;
                              ScriptFrame var23 = new ScriptFrame();
                              var23.script = var4;
                              var23.pc = var20;
                              var23.intLocals = Interpreter.Interpreter_intLocals;
                              var23.stringLocals = Interpreter.Interpreter_stringLocals;
                              Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23;
                              var4 = var35;
                              var6 = var35.opcodes;
                              var7 = var35.intOperands;
                              var20 = -1;
                              Interpreter.Interpreter_intLocals = var15;
                              Interpreter.Interpreter_stringLocals = var16;
                           }
                        }
                     }
                  } catch (Exception var31) {
                     var9 = true;
                     StringBuilder var27 = new StringBuilder(30);
                     var27.append("").append(var4.key).append(" ");

                     for(var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) {
                        var27.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
                     }

                     var27.append("").append(var8);
                     class364.RunException_sendStackTrace(var27.toString(), var31);
                     var30 = false;
                     break label955;
                  }
               } finally {
                  if (var30) {
                     while(Interpreter.field837.size() > 0) {
                        class99 var19 = (class99)Interpreter.field837.remove(0);
                        class333.widgetDefaultMenuAction(var19.method2631(), var19.method2632(), var19.method2635(), var19.method2634(), "");
                     }

                     if (Interpreter.field835) {
                        Interpreter.field835 = false;
                        class240.method4792();
                     }

                     if (!var9 && var2 > 0 && var10 >= var2) {
                        class364.RunException_sendStackTrace("Warning: Script " + var4.field965 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
                     }

                  }
               }

               while(Interpreter.field837.size() > 0) {
                  class99 var40 = (class99)Interpreter.field837.remove(0);
                  class333.widgetDefaultMenuAction(var40.method2631(), var40.method2632(), var40.method2635(), var40.method2634(), "");
               }

               if (Interpreter.field835) {
                  Interpreter.field835 = false;
                  class240.method4792();
               }

               if (!var9 && var2 > 0 && var10 >= var2) {
                  class364.RunException_sendStackTrace("Warning: Script " + var4.field965 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
               }

               return;
            }

            while(Interpreter.field837.size() > 0) {
               class99 var26 = (class99)Interpreter.field837.remove(0);
               class333.widgetDefaultMenuAction(var26.method2631(), var26.method2632(), var26.method2635(), var26.method2634(), "");
            }

            if (Interpreter.field835) {
               Interpreter.field835 = false;
               class240.method4792();
            }

            if (!var9 && var2 > 0 && var10 >= var2) {
               class364.RunException_sendStackTrace("Warning: Script " + var4.field965 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
            }

            return;
         }

         while(Interpreter.field837.size() > 0) {
            class99 var33 = (class99)Interpreter.field837.remove(0);
            class333.widgetDefaultMenuAction(var33.method2631(), var33.method2632(), var33.method2635(), var33.method2634(), "");
         }

         if (Interpreter.field835) {
            Interpreter.field835 = false;
            class240.method4792();
         }

         if (!var9 && var2 > 0 && var10 >= var2) {
            class364.RunException_sendStackTrace("Warning: Script " + var4.field965 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
         }

      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "265895051"
   )
   static void method173(int var0) {
      if (var0 != Login.loginIndex) {
         Login.loginIndex = var0;
      }
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZB)I",
      garbageValue = "-91"
   )
   static int method175(int var0, Script var1, boolean var2) {
      if (var0 == 7463) {
         boolean var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
         class140.method3106(var3);
         return 1;
      } else {
         return 2;
      }
   }
}
