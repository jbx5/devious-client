import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nz")
@Implements("PlayerType")
public enum PlayerType implements MouseWheel {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lnz;"
   )
   @Export("PlayerType_normal")
   PlayerType_normal(0, -1, true, false, true),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lnz;"
   )
   @Export("PlayerType_playerModerator")
   PlayerType_playerModerator(1, 0, true, true, true),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lnz;"
   )
   @Export("PlayerType_jagexModerator")
   PlayerType_jagexModerator(2, 1, true, true, false),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lnz;"
   )
   @Export("PlayerType_ironman")
   PlayerType_ironman(3, 2, false, false, true),
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lnz;"
   )
   @Export("PlayerType_ultimateIronman")
   PlayerType_ultimateIronman(4, 3, false, false, true),
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lnz;"
   )
   @Export("PlayerType_hardcoreIronman")
   PlayerType_hardcoreIronman(5, 10, false, false, true),
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lnz;"
   )
   field4172(6, 22, false, false, true),
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lnz;"
   )
   field4173(7, 41, false, false, true),
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lnz;"
   )
   field4174(8, 42, false, false, true),
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lnz;"
   )
   field4175(9, 43, false, false, true),
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lnz;"
   )
   field4176(10, 44, false, false, true),
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lnz;"
   )
   field4186(11, 45, false, false, true),
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lnz;"
   )
   field4178(12, 46, false, false, true),
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lnz;"
   )
   field4181(13, 47, false, false, true),
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Lnz;"
   )
   field4179(14, 48, false, false, true),
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Lnz;"
   )
   field4170(15, 49, false, false, true),
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lnz;"
   )
   field4182(16, 52, false, false, true);

   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      descriptor = "Ltc;"
   )
   @Export("worldSelectLeftSprite")
   static IndexedSprite worldSelectLeftSprite;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -897643501
   )
   @Export("id")
   final int id;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 2138745227
   )
   @Export("modIcon")
   public final int modIcon;
   @ObfuscatedName("as")
   @Export("isPrivileged")
   public final boolean isPrivileged;
   @ObfuscatedName("aj")
   @Export("isUser")
   public final boolean isUser;

   PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
      this.id = var3;
      this.modIcon = var4;
      this.isPrivileged = var6;
      this.isUser = var7;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "741942848"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ldr;III)V",
      garbageValue = "637714632"
   )
   @Export("runScript")
   static void runScript(ScriptEvent var0, int var1, int var2) {
      Object[] var3 = var0.args;
      Script var4;
      int var20;
      if (class292.isWorldMapEvent(var0.type)) {
         ByteArrayPool.worldMapEvent = (WorldMapEvent)var3[0];
         WorldMapElement var5 = class354.WorldMapElement_get(ByteArrayPool.worldMapEvent.mapElement);
         var4 = class151.getWorldMapScript(var0.type, var5.objectId, var5.category);
      } else {
         var20 = (Integer)var3[0];
         var4 = AbstractByteArrayCopier.getScript(var20);
      }

      if (var4 != null) {
         Interpreter.Interpreter_intStackSize = 0;
         SecureRandomCallable.Interpreter_stringStackSize = 0;
         var20 = -1;
         int[] var6 = var4.opcodes;
         int[] var7 = var4.intOperands;
         int var8 = -1;
         Interpreter.Interpreter_frameDepth = 0;
         Interpreter.field849 = false;
         boolean var9 = false;
         int var10 = 0;
         boolean var30 = false;

         label952: {
            label953: {
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

                     Interpreter.field852 = var0.field1049;

                     label936:
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

                           var14 = class33.method511(var8, var4, var34);
                           switch (var14) {
                              case 0:
                                 var30 = false;
                                 break label936;
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
                           class7.changeGameOptions(var13);
                        } else if (var8 == ScriptOpcodes.SCONST) {
                           Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.stringOperands[var20];
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
                              break label953;
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
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class252.getVarbit(var13);
                        } else if (var8 == ScriptOpcodes.SET_VARBIT) {
                           var13 = var7[var20];
                           class283.method5685(var13, Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
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
                           Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var20]];
                        } else if (var8 == ScriptOpcodes.SSTORE) {
                           Interpreter.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
                        } else if (var8 == ScriptOpcodes.JOIN_STRING) {
                           var13 = var7[var20];
                           SecureRandomCallable.Interpreter_stringStackSize -= var13;
                           var21 = WorldMapSprite.method5468(Interpreter.Interpreter_stringStack, SecureRandomCallable.Interpreter_stringStackSize, var13);
                           Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var21;
                        } else if (var8 == ScriptOpcodes.POP_INT) {
                           --Interpreter.Interpreter_intStackSize;
                        } else if (var8 == ScriptOpcodes.POP_STRING) {
                           --SecureRandomCallable.Interpreter_stringStackSize;
                        } else {
                           int var17;
                           if (var8 != ScriptOpcodes.INVOKE) {
                              if (var8 == ScriptOpcodes.GET_VARC_INT) {
                                 Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class373.varcs.getInt(var7[var20]);
                              } else if (var8 == ScriptOpcodes.SET_VARC_INT) {
                                 class373.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
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
                                    var22 = class373.varcs.getStringOld(var7[var20]);
                                    if (var22 == null) {
                                       var22 = "null";
                                    }

                                    Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var22;
                                 } else if (var8 == ScriptOpcodes.SET_VARC_STRING_OLD) {
                                    class373.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]);
                                 } else if (var8 == ScriptOpcodes.GET_VARC_STRING) {
                                    var22 = class373.varcs.getString(var7[var20]);
                                    Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var22;
                                 } else if (var8 == ScriptOpcodes.SET_VARC_STRING) {
                                    class373.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]);
                                 } else if (var8 == ScriptOpcodes.SWITCH) {
                                    IterableNodeHashTable var37 = var4.switches[var7[var20]];
                                    IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
                                    if (var36 != null) {
                                       var20 += var36.integer;
                                    }
                                 } else {
                                    Integer var38;
                                    if (var8 == ScriptOpcodes.GET_VARCLANSETTING) {
                                       var38 = class133.field1597.getTitleGroupValue(var7[var20]);
                                       if (var38 == null) {
                                          Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                                       } else {
                                          Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var38;
                                       }
                                    } else {
                                       if (var8 != ScriptOpcodes.GET_VARCLAN) {
                                          throw new IllegalStateException();
                                       }

                                       var38 = Players.field1339.method8280(var7[var20]);
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
                              Script var35 = AbstractByteArrayCopier.getScript(var13);
                              int[] var15 = new int[var35.localIntCount];
                              String[] var16 = new String[var35.localStringCount];

                              for(var17 = 0; var17 < var35.intArgumentCount; ++var17) {
                                 var15[var17] = Interpreter.Interpreter_intStack[var17 + (Interpreter.Interpreter_intStackSize - var35.intArgumentCount)];
                              }

                              for(var17 = 0; var17 < var35.stringArgumentCount; ++var17) {
                                 var16[var17] = Interpreter.Interpreter_stringStack[var17 + (SecureRandomCallable.Interpreter_stringStackSize - var35.stringArgumentCount)];
                              }

                              Interpreter.Interpreter_intStackSize -= var35.intArgumentCount;
                              SecureRandomCallable.Interpreter_stringStackSize -= var35.stringArgumentCount;
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
                     class387.RunException_sendStackTrace(var27.toString(), var31);
                     var30 = false;
                     break label952;
                  }
               } finally {
                  if (var30) {
                     while(Interpreter.field837.size() > 0) {
                        class97 var19 = (class97)Interpreter.field837.remove(0);
                        Message.widgetDefaultMenuAction(var19.method2639(), var19.method2637(), var19.method2638(), var19.method2641(), "");
                     }

                     if (Interpreter.field849) {
                        Interpreter.field849 = false;
                        class148.method3291();
                     }

                     if (!var9 && var2 > 0 && var10 >= var2) {
                        class387.RunException_sendStackTrace("Warning: Script " + var4.field961 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
                     }

                  }
               }

               while(Interpreter.field837.size() > 0) {
                  class97 var33 = (class97)Interpreter.field837.remove(0);
                  Message.widgetDefaultMenuAction(var33.method2639(), var33.method2637(), var33.method2638(), var33.method2641(), "");
               }

               if (Interpreter.field849) {
                  Interpreter.field849 = false;
                  class148.method3291();
               }

               if (!var9 && var2 > 0 && var10 >= var2) {
                  class387.RunException_sendStackTrace("Warning: Script " + var4.field961 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
               }

               return;
            }

            while(Interpreter.field837.size() > 0) {
               class97 var40 = (class97)Interpreter.field837.remove(0);
               Message.widgetDefaultMenuAction(var40.method2639(), var40.method2637(), var40.method2638(), var40.method2641(), "");
            }

            if (Interpreter.field849) {
               Interpreter.field849 = false;
               class148.method3291();
            }

            if (!var9 && var2 > 0 && var10 >= var2) {
               class387.RunException_sendStackTrace("Warning: Script " + var4.field961 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
            }

            return;
         }

         while(Interpreter.field837.size() > 0) {
            class97 var26 = (class97)Interpreter.field837.remove(0);
            Message.widgetDefaultMenuAction(var26.method2639(), var26.method2637(), var26.method2638(), var26.method2641(), "");
         }

         if (Interpreter.field849) {
            Interpreter.field849 = false;
            class148.method3291();
         }

         if (!var9 && var2 > 0 && var10 >= var2) {
            class387.RunException_sendStackTrace("Warning: Script " + var4.field961 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
         }

      }
   }
}
