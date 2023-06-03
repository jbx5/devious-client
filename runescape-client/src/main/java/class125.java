import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public class class125 {
   @ObfuscatedName("as")
   public static final float field1463 = Math.ulp(1.0F);
   @ObfuscatedName("ax")
   public static final float field1467;
   @ObfuscatedName("ap")
   static float[] field1465;
   @ObfuscatedName("ab")
   static float[] field1462;
   @ObfuscatedName("ak")
   public static ThreadPoolExecutor field1468;
   @ObfuscatedName("oz")
   @ObfuscatedGetter(
      intValue = 940066811
   )
   @Export("selectedSpellFlags")
   static int selectedSpellFlags;

   static {
      field1467 = 2.0F * field1463;
      field1465 = new float[4];
      field1462 = new float[5];
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ldz;Ldd;III)V",
      garbageValue = "2074139136"
   )
   @Export("runScriptLogic")
   static void runScriptLogic(ScriptEvent var0, Script var1, int var2, int var3) {
      Object[] var4 = var0.args;
      Interpreter.Interpreter_intStackSize = 0;
      class149.Interpreter_stringStackSize = 0;
      int var5 = -1;
      int[] var6 = var1.opcodes;
      int[] var7 = var1.intOperands;
      int var8 = -1;
      Interpreter.Interpreter_frameDepth = 0;
      Interpreter.field852 = false;
      boolean var9 = false;
      int var10 = 0;
      boolean var29 = false;

      label933: {
         label934: {
            try {
               int var13;
               try {
                  var29 = true;
                  Interpreter.Interpreter_intLocals = new int[var1.localIntCount];
                  int var11 = 0;
                  Interpreter.Interpreter_stringLocals = new String[var1.localStringCount];
                  int var12 = 0;

                  int var14;
                  String var20;
                  for(var13 = 1; var13 < var4.length; ++var13) {
                     if (var4[var13] instanceof Integer) {
                        var14 = (Integer)var4[var13];
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
                     } else if (var4[var13] instanceof String) {
                        var20 = (String)var4[var13];
                        if (var20.equals("event_opbase")) {
                           var20 = var0.targetName;
                        }

                        Interpreter.Interpreter_stringLocals[var12++] = var20;
                     }
                  }

                  Interpreter.field871 = var0.field1068;

                  label920:
                  while(true) {
                     ++var10;
                     if (var10 > var2) {
                        throw new RuntimeException();
                     }

                     ++var5;
                     var8 = var6[var5];
                     if (var8 >= 100) {
                        boolean var33;
                        if (var1.intOperands[var5] == 1) {
                           var33 = true;
                        } else {
                           var33 = false;
                        }

                        var14 = class388.method7212(var8, var1, var33);
                        switch (var14) {
                           case 0:
                              var29 = false;
                              break label920;
                           case 1:
                           default:
                              break;
                           case 2:
                              throw new IllegalStateException();
                        }
                     } else if (var8 == 0) {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7[var5];
                     } else if (var8 == 1) {
                        var13 = var7[var5];
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
                     } else if (var8 == 2) {
                        var13 = var7[var5];
                        Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        class393.changeGameOptions(var13);
                     } else if (var8 == 3) {
                        Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var1.stringOperands[var5];
                     } else if (var8 == 6) {
                        var5 += var7[var5];
                     } else if (var8 == 7) {
                        Interpreter.Interpreter_intStackSize -= 2;
                        if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == 8) {
                        Interpreter.Interpreter_intStackSize -= 2;
                        if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == 9) {
                        Interpreter.Interpreter_intStackSize -= 2;
                        if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == 10) {
                        Interpreter.Interpreter_intStackSize -= 2;
                        if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == 21) {
                        if (Interpreter.Interpreter_frameDepth == 0) {
                           var29 = false;
                           break label934;
                        }

                        ScriptFrame var38 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
                        var1 = var38.script;
                        var6 = var1.opcodes;
                        var7 = var1.intOperands;
                        var5 = var38.pc;
                        Interpreter.Interpreter_intLocals = var38.intLocals;
                        Interpreter.Interpreter_stringLocals = var38.stringLocals;
                     } else if (var8 == 25) {
                        var13 = var7[var5];
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class343.getVarbit(var13);
                     } else if (var8 == 27) {
                        var13 = var7[var5];
                        Buffer.method9158(var13, Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
                     } else if (var8 == 31) {
                        Interpreter.Interpreter_intStackSize -= 2;
                        if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == 32) {
                        Interpreter.Interpreter_intStackSize -= 2;
                        if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == 33) {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var5]];
                     } else if (var8 == 34) {
                        Interpreter.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     } else if (var8 == 35) {
                        Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var5]];
                     } else if (var8 == 36) {
                        Interpreter.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
                     } else if (var8 == 37) {
                        var13 = var7[var5];
                        class149.Interpreter_stringStackSize -= var13;
                        var20 = JagexCache.method3497(Interpreter.Interpreter_stringStack, class149.Interpreter_stringStackSize, var13);
                        Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var20;
                     } else if (var8 == 38) {
                        --Interpreter.Interpreter_intStackSize;
                     } else if (var8 == 39) {
                        --class149.Interpreter_stringStackSize;
                     } else {
                        int var17;
                        if (var8 != 40) {
                           if (var8 == 42) {
                              Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MouseHandler.varcs.getInt(var7[var5]);
                           } else if (var8 == 43) {
                              MouseHandler.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
                           } else if (var8 == 44) {
                              var13 = var7[var5] >> 16;
                              var14 = var7[var5] & '\uffff';
                              int var23 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                              if (var23 < 0 || var23 > 5000) {
                                 throw new RuntimeException();
                              }

                              Interpreter.Interpreter_arrayLengths[var13] = var23;
                              byte var24 = -1;
                              if (var14 == 105) {
                                 var24 = 0;
                              }

                              for(var17 = 0; var17 < var23; ++var17) {
                                 Interpreter.Interpreter_arrays[var13][var17] = var24;
                              }
                           } else if (var8 == 45) {
                              var13 = var7[var5];
                              var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                              if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
                                 throw new RuntimeException();
                              }

                              Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
                           } else if (var8 == 46) {
                              var13 = var7[var5];
                              Interpreter.Interpreter_intStackSize -= 2;
                              var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                              if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
                                 throw new RuntimeException();
                              }

                              Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                           } else {
                              String var21;
                              if (var8 == 47) {
                                 var21 = MouseHandler.varcs.getStringOld(var7[var5]);
                                 if (var21 == null) {
                                    var21 = "null";
                                 }

                                 Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var21;
                              } else if (var8 == 48) {
                                 MouseHandler.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]);
                              } else if (var8 == 49) {
                                 var21 = MouseHandler.varcs.getString(var7[var5]);
                                 Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var21;
                              } else if (var8 == 50) {
                                 MouseHandler.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]);
                              } else if (var8 == 60) {
                                 IterableNodeHashTable var36 = var1.switches[var7[var5]];
                                 IntegerNode var35 = (IntegerNode)var36.get((long)Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
                                 if (var35 != null) {
                                    var5 += var35.integer;
                                 }
                              } else {
                                 Integer var37;
                                 if (var8 == 74) {
                                    var37 = class309.field3452.getTitleGroupValue(var7[var5]);
                                    if (var37 == null) {
                                       Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                                    } else {
                                       Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var37;
                                    }
                                 } else {
                                    if (var8 != 76) {
                                       throw new IllegalStateException();
                                    }

                                    var37 = class127.field1495.method8187(var7[var5]);
                                    if (var37 == null) {
                                       Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                                    } else {
                                       Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var37;
                                    }
                                 }
                              }
                           }
                        } else {
                           var13 = var7[var5];
                           Script var34 = class190.getScript(var13);
                           int[] var15 = new int[var34.localIntCount];
                           String[] var16 = new String[var34.localStringCount];

                           for(var17 = 0; var17 < var34.intArgumentCount; ++var17) {
                              var15[var17] = Interpreter.Interpreter_intStack[var17 + (Interpreter.Interpreter_intStackSize - var34.intArgumentCount)];
                           }

                           for(var17 = 0; var17 < var34.stringArgumentCount; ++var17) {
                              var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class149.Interpreter_stringStackSize - var34.stringArgumentCount)];
                           }

                           Interpreter.Interpreter_intStackSize -= var34.intArgumentCount;
                           class149.Interpreter_stringStackSize -= var34.stringArgumentCount;
                           ScriptFrame var22 = new ScriptFrame();
                           var22.script = var1;
                           var22.pc = var5;
                           var22.intLocals = Interpreter.Interpreter_intLocals;
                           var22.stringLocals = Interpreter.Interpreter_stringLocals;
                           Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22;
                           var1 = var34;
                           var6 = var34.opcodes;
                           var7 = var34.intOperands;
                           var5 = -1;
                           Interpreter.Interpreter_intLocals = var15;
                           Interpreter.Interpreter_stringLocals = var16;
                        }
                     }
                  }
               } catch (Exception var30) {
                  var9 = true;
                  StringBuilder var26 = new StringBuilder(30);
                  var26.append("").append(var1.key).append(" ");

                  for(var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) {
                     var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
                  }

                  var26.append("").append(var8);
                  class260.RunException_sendStackTrace(var26.toString(), var30);
                  var29 = false;
                  break label933;
               }
            } finally {
               if (var29) {
                  while(Interpreter.field873.size() > 0) {
                     class101 var19 = (class101)Interpreter.field873.remove(0);
                     InvDefinition.widgetDefaultMenuAction(var19.method2628(), var19.method2629(), var19.method2639(), var19.method2631(), "");
                  }

                  if (Interpreter.field852) {
                     Interpreter.field852 = false;
                     class36.method664();
                  }

                  if (!var9 && var3 > 0 && var10 >= var3) {
                     class260.RunException_sendStackTrace("Warning: Script " + var1.field992 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
                  }

               }
            }

            while(Interpreter.field873.size() > 0) {
               class101 var32 = (class101)Interpreter.field873.remove(0);
               InvDefinition.widgetDefaultMenuAction(var32.method2628(), var32.method2629(), var32.method2639(), var32.method2631(), "");
            }

            if (Interpreter.field852) {
               Interpreter.field852 = false;
               class36.method664();
            }

            if (!var9 && var3 > 0 && var10 >= var3) {
               class260.RunException_sendStackTrace("Warning: Script " + var1.field992 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
            }

            return;
         }

         while(Interpreter.field873.size() > 0) {
            class101 var39 = (class101)Interpreter.field873.remove(0);
            InvDefinition.widgetDefaultMenuAction(var39.method2628(), var39.method2629(), var39.method2639(), var39.method2631(), "");
         }

         if (Interpreter.field852) {
            Interpreter.field852 = false;
            class36.method664();
         }

         if (!var9 && var3 > 0 && var10 >= var3) {
            class260.RunException_sendStackTrace("Warning: Script " + var1.field992 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
         }

         return;
      }

      while(Interpreter.field873.size() > 0) {
         class101 var25 = (class101)Interpreter.field873.remove(0);
         InvDefinition.widgetDefaultMenuAction(var25.method2628(), var25.method2629(), var25.method2639(), var25.method2631(), "");
      }

      if (Interpreter.field852) {
         Interpreter.field852 = false;
         class36.method664();
      }

      if (!var9 && var3 > 0 && var10 >= var3) {
         class260.RunException_sendStackTrace("Warning: Script " + var1.field992 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
      }

   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1160250297"
   )
   protected static final void method2918() {
      BufferedNetSocket.clock.mark();

      int var0;
      for(var0 = 0; var0 < 32; ++var0) {
         GameEngine.graphicsTickTimes[var0] = 0L;
      }

      for(var0 = 0; var0 < 32; ++var0) {
         GameEngine.clientTickTimes[var0] = 0L;
      }

      GameEngine.gameCyclesToDo = 0;
   }
}
