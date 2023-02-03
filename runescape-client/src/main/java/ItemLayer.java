import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hi")
@Implements("ItemLayer")
public final class ItemLayer {
   @ObfuscatedName("r")
   public static short[] field2385;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 65542137
   )
   @Export("z")
   int z;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 437256192
   )
   @Export("x")
   int x;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 115225373
   )
   @Export("y")
   int y;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lhd;"
   )
   @Export("first")
   Renderable first;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lhd;"
   )
   @Export("second")
   Renderable second;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lhd;"
   )
   @Export("third")
   Renderable third;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      longValue = 4449823127160769047L
   )
   @Export("tag")
   long tag;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1504988741
   )
   @Export("height")
   int height;

   ItemLayer() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1806736275"
   )
   public static boolean method4229(int var0, int var1) {
      return (var0 >> var1 + 1 & 1) != 0;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lcd;III)V",
      garbageValue = "2122204306"
   )
   @Export("runScript")
   static void runScript(ScriptEvent var0, int var1, int var2) {
      Object[] var3 = var0.args;
      Script var4;
      int var20;
      if (class316.isWorldMapEvent(var0.type)) {
         class20.worldMapEvent = (WorldMapEvent)var3[0];
         WorldMapElement var5 = class4.WorldMapElement_get(class20.worldMapEvent.mapElement);
         var4 = class145.getWorldMapScript(var0.type, var5.objectId, var5.category);
      } else {
         var20 = (Integer)var3[0];
         var4 = class70.getScript(var20);
      }

      if (var4 != null) {
         class302.Interpreter_intStackSize = 0;
         class20.Interpreter_stringStackSize = 0;
         var20 = -1;
         int[] var6 = var4.opcodes;
         int[] var7 = var4.intOperands;
         int var8 = -1;
         Interpreter.Interpreter_frameDepth = 0;
         Interpreter.field851 = false;
         boolean var9 = false;
         int var10 = 0;
         boolean var30 = false;

         label956: {
            label957: {
               try {
                  int var13;
                  try {
                     var30 = true;
                     Interpreter.Interpreter_intLocals = new int[var4.localIntCount];
                     int var11 = 0;
                     SecureRandomFuture.Interpreter_stringLocals = new String[var4.localStringCount];
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

                           SecureRandomFuture.Interpreter_stringLocals[var12++] = var21;
                        }
                     }

                     Interpreter.field861 = var0.field1071;

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

                           var14 = class33.method493(var8, var4, var34);
                           switch (var14) {
                              case 0:
                                 var30 = false;
                                 break label956;
                              case 1:
                              default:
                                 break;
                              case 2:
                                 throw new IllegalStateException();
                           }
                        } else if (var8 == ScriptOpcodes.ICONST) {
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7[var20];
                        } else if (var8 == ScriptOpcodes.GET_VARP) {
                           var13 = var7[var20];
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
                        } else if (var8 == ScriptOpcodes.SET_VARP) {
                           var13 = var7[var20];
                           Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                           ReflectionCheck.changeGameOptions(var13);
                        } else if (var8 == ScriptOpcodes.SCONST) {
                           Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.stringOperands[var20];
                        } else if (var8 == ScriptOpcodes.JUMP) {
                           var20 += var7[var20];
                        } else if (var8 == ScriptOpcodes.IF_ICMPNE) {
                           class302.Interpreter_intStackSize -= 2;
                           if (Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]) {
                              var20 += var7[var20];
                           }
                        } else if (var8 == ScriptOpcodes.IF_ICMPEQ) {
                           class302.Interpreter_intStackSize -= 2;
                           if (Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]) {
                              var20 += var7[var20];
                           }
                        } else if (var8 == ScriptOpcodes.IF_ICMPLT) {
                           class302.Interpreter_intStackSize -= 2;
                           if (Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]) {
                              var20 += var7[var20];
                           }
                        } else if (var8 == ScriptOpcodes.IF_ICMPGT) {
                           class302.Interpreter_intStackSize -= 2;
                           if (Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]) {
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
                           SecureRandomFuture.Interpreter_stringLocals = var39.stringLocals;
                        } else if (var8 == ScriptOpcodes.GET_VARBIT) {
                           var13 = var7[var20];
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = SecureRandomFuture.getVarbit(var13);
                        } else if (var8 == ScriptOpcodes.SET_VARBIT) {
                           var13 = var7[var20];
                           WorldMapEvent.method5469(var13, Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
                        } else if (var8 == ScriptOpcodes.IF_ICMPLE) {
                           class302.Interpreter_intStackSize -= 2;
                           if (Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]) {
                              var20 += var7[var20];
                           }
                        } else if (var8 == ScriptOpcodes.IF_ICMPGE) {
                           class302.Interpreter_intStackSize -= 2;
                           if (Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]) {
                              var20 += var7[var20];
                           }
                        } else if (var8 == ScriptOpcodes.ILOAD) {
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var20]];
                        } else if (var8 == ScriptOpcodes.ISTORE) {
                           Interpreter.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                        } else if (var8 == ScriptOpcodes.SLOAD) {
                           Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = SecureRandomFuture.Interpreter_stringLocals[var7[var20]];
                        } else if (var8 == ScriptOpcodes.SSTORE) {
                           SecureRandomFuture.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
                        } else if (var8 == ScriptOpcodes.JOIN_STRING) {
                           var13 = var7[var20];
                           class20.Interpreter_stringStackSize -= var13;
                           var21 = class312.method6382(Interpreter.Interpreter_stringStack, class20.Interpreter_stringStackSize, var13);
                           Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var21;
                        } else if (var8 == ScriptOpcodes.POP_INT) {
                           --class302.Interpreter_intStackSize;
                        } else if (var8 == ScriptOpcodes.POP_STRING) {
                           --class20.Interpreter_stringStackSize;
                        } else {
                           int var17;
                           if (var8 != ScriptOpcodes.INVOKE) {
                              if (var8 == ScriptOpcodes.GET_VARC_INT) {
                                 Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class9.varcs.getInt(var7[var20]);
                              } else if (var8 == ScriptOpcodes.SET_VARC_INT) {
                                 class9.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
                              } else if (var8 == ScriptOpcodes.DEFINE_ARRAY) {
                                 var13 = var7[var20] >> 16;
                                 var14 = var7[var20] & '\uffff';
                                 int var24 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
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
                                 var14 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                                 if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
                                    throw new RuntimeException();
                                 }

                                 Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
                              } else if (var8 == ScriptOpcodes.SET_ARRAY_INT) {
                                 var13 = var7[var20];
                                 class302.Interpreter_intStackSize -= 2;
                                 var14 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                                 if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
                                    throw new RuntimeException();
                                 }

                                 Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
                              } else {
                                 String var22;
                                 if (var8 == ScriptOpcodes.GET_VARC_STRING_OLD) {
                                    var22 = class9.varcs.getStringOld(var7[var20]);
                                    if (var22 == null) {
                                       var22 = "null";
                                    }

                                    Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var22;
                                 } else if (var8 == ScriptOpcodes.SET_VARC_STRING_OLD) {
                                    class9.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]);
                                 } else if (var8 == ScriptOpcodes.GET_VARC_STRING) {
                                    var22 = class9.varcs.getString(var7[var20]);
                                    Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var22;
                                 } else if (var8 == ScriptOpcodes.SET_VARC_STRING) {
                                    class9.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]);
                                 } else if (var8 == ScriptOpcodes.SWITCH) {
                                    IterableNodeHashTable var37 = var4.switches[var7[var20]];
                                    IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
                                    if (var36 != null) {
                                       var20 += var36.integer;
                                    }
                                 } else {
                                    Integer var38;
                                    if (var8 == ScriptOpcodes.GET_VARCLANSETTING) {
                                       var38 = WorldMapArea.field2851.getTitleGroupValue(var7[var20]);
                                       if (var38 == null) {
                                          Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                                       } else {
                                          Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var38;
                                       }
                                    } else {
                                       if (var8 != ScriptOpcodes.GET_VARCLAN) {
                                          throw new IllegalStateException();
                                       }

                                       var38 = class388.field4512.method7995(var7[var20]);
                                       if (var38 == null) {
                                          Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                                       } else {
                                          Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var38;
                                       }
                                    }
                                 }
                              }
                           } else {
                              var13 = var7[var20];
                              Script var35 = class70.getScript(var13);
                              int[] var15 = new int[var35.localIntCount];
                              String[] var16 = new String[var35.localStringCount];

                              for(var17 = 0; var17 < var35.intArgumentCount; ++var17) {
                                 var15[var17] = Interpreter.Interpreter_intStack[var17 + (class302.Interpreter_intStackSize - var35.intArgumentCount)];
                              }

                              for(var17 = 0; var17 < var35.stringArgumentCount; ++var17) {
                                 var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class20.Interpreter_stringStackSize - var35.stringArgumentCount)];
                              }

                              class302.Interpreter_intStackSize -= var35.intArgumentCount;
                              class20.Interpreter_stringStackSize -= var35.stringArgumentCount;
                              ScriptFrame var23 = new ScriptFrame();
                              var23.script = var4;
                              var23.pc = var20;
                              var23.intLocals = Interpreter.Interpreter_intLocals;
                              var23.stringLocals = SecureRandomFuture.Interpreter_stringLocals;
                              Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23;
                              var4 = var35;
                              var6 = var35.opcodes;
                              var7 = var35.intOperands;
                              var20 = -1;
                              Interpreter.Interpreter_intLocals = var15;
                              SecureRandomFuture.Interpreter_stringLocals = var16;
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
                     class121.RunException_sendStackTrace(var27.toString(), var31);
                     var30 = false;
                     break label957;
                  }
               } finally {
                  if (var30) {
                     while(Interpreter.field864.size() > 0) {
                        class97 var19 = (class97)Interpreter.field864.remove(0);
                        class16.widgetDefaultMenuAction(var19.method2702(), var19.method2692(), var19.method2693(), var19.method2694(), "");
                     }

                     if (Interpreter.field851) {
                        Interpreter.field851 = false;
                        SoundCache.method869();
                     }

                     if (!var9 && var2 > 0 && var10 >= var2) {
                        class121.RunException_sendStackTrace("Warning: Script " + var4.field981 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
                     }

                  }
               }

               while(Interpreter.field864.size() > 0) {
                  class97 var40 = (class97)Interpreter.field864.remove(0);
                  class16.widgetDefaultMenuAction(var40.method2702(), var40.method2692(), var40.method2693(), var40.method2694(), "");
               }

               if (Interpreter.field851) {
                  Interpreter.field851 = false;
                  SoundCache.method869();
               }

               if (!var9 && var2 > 0 && var10 >= var2) {
                  class121.RunException_sendStackTrace("Warning: Script " + var4.field981 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
               }

               return;
            }

            while(Interpreter.field864.size() > 0) {
               class97 var26 = (class97)Interpreter.field864.remove(0);
               class16.widgetDefaultMenuAction(var26.method2702(), var26.method2692(), var26.method2693(), var26.method2694(), "");
            }

            if (Interpreter.field851) {
               Interpreter.field851 = false;
               SoundCache.method869();
            }

            if (!var9 && var2 > 0 && var10 >= var2) {
               class121.RunException_sendStackTrace("Warning: Script " + var4.field981 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
            }

            return;
         }

         while(Interpreter.field864.size() > 0) {
            class97 var33 = (class97)Interpreter.field864.remove(0);
            class16.widgetDefaultMenuAction(var33.method2702(), var33.method2692(), var33.method2693(), var33.method2694(), "");
         }

         if (Interpreter.field851) {
            Interpreter.field851 = false;
            SoundCache.method869();
         }

         if (!var9 && var2 > 0 && var10 >= var2) {
            class121.RunException_sendStackTrace("Warning: Script " + var4.field981 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
         }

      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(IIIZII)J",
      garbageValue = "-1955908833"
   )
   @Export("calculateTag")
   public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
      long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
      if (var3) {
         var5 |= 65536L;
      }

      return var5;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-18"
   )
   static int method4228(int var0) {
      return (int)Math.pow(2.0, (double)(7.0F + (float)var0 / 256.0F));
   }
}
