import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("du")
public class class125 {
   @ObfuscatedName("ir")
   @ObfuscatedGetter(
      intValue = 702458805
   )
   static int field1560;
   @ObfuscatedName("h")
   boolean field1547;
   @ObfuscatedName("e")
   boolean field1538;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Ldp;"
   )
   class124 field1539;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ldp;"
   )
   class124 field1540;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "[Ldq;"
   )
   class121[] field1541;
   @ObfuscatedName("q")
   boolean field1557;
   @ObfuscatedName("f")
   float field1543;
   @ObfuscatedName("r")
   float field1544;
   @ObfuscatedName("u")
   float field1545;
   @ObfuscatedName("b")
   float field1559;
   @ObfuscatedName("j")
   float field1537;
   @ObfuscatedName("g")
   float field1548;
   @ObfuscatedName("i")
   float field1549;
   @ObfuscatedName("o")
   float field1550;
   @ObfuscatedName("n")
   float field1551;
   @ObfuscatedName("k")
   float field1552;
   @ObfuscatedName("a")
   boolean field1553 = true;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1591300609
   )
   int field1556 = 0;
   @ObfuscatedName("l")
   float[] field1546;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1053774151
   )
   int field1542;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1911231087
   )
   int field1555;
   @ObfuscatedName("p")
   float field1558;
   @ObfuscatedName("d")
   float field1554;

   class125() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;II)I",
      garbageValue = "-978416029"
   )
   int method2943(Buffer var1, int var2) {
      int var3 = var1.readUnsignedShort();
      ChatChannel.method2152(var1.readUnsignedByte());
      int var5 = var1.readUnsignedByte();
      class124 var6 = (class124)World.findEnumerated(MidiPcmStream.method5640(), var5);
      if (var6 == null) {
         var6 = class124.field1535;
      }

      this.field1539 = var6;
      int var7 = var1.readUnsignedByte();
      class124 var8 = (class124)World.findEnumerated(MidiPcmStream.method5640(), var7);
      if (var8 == null) {
         var8 = class124.field1535;
      }

      this.field1540 = var8;
      this.field1547 = var1.readUnsignedByte() != 0;
      this.field1541 = new class121[var3];
      class121 var11 = null;

      int var9;
      for(var9 = 0; var9 < var3; ++var9) {
         class121 var10 = new class121();
         var10.method2884(var1, var2);
         this.field1541[var9] = var10;
         if (var11 != null) {
            var11.field1501 = var10;
         }

         var11 = var10;
      }

      this.field1542 = this.field1541[0].field1502;
      this.field1555 = this.field1541[this.method2947() - 1].field1502;
      this.field1546 = new float[this.method2944() + 1];

      for(var9 = this.method2946(); var9 <= this.method2942(); ++var9) {
         this.field1546[var9 - this.method2946()] = FloorOverlayDefinition.method3995(this, (float)var9);
      }

      this.field1541 = null;
      this.field1558 = FloorOverlayDefinition.method3995(this, (float)(this.method2946() - 1));
      this.field1554 = FloorOverlayDefinition.method3995(this, (float)(this.method2942() + 1));
      return var3;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IB)F",
      garbageValue = "-121"
   )
   public float method2966(int var1) {
      if (var1 < this.method2946()) {
         return this.field1558;
      } else {
         return var1 > this.method2942() ? this.field1554 : this.field1546[var1 - this.method2946()];
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "64"
   )
   int method2946() {
      return this.field1542;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "826348925"
   )
   int method2942() {
      return this.field1555;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1825494223"
   )
   int method2944() {
      return this.method2942() - this.method2946();
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(FI)I",
      garbageValue = "628644903"
   )
   int method2945(float var1) {
      if (this.field1556 < 0 || !((float)this.field1541[this.field1556].field1502 <= var1) || this.field1541[this.field1556].field1501 != null && !((float)this.field1541[this.field1556].field1501.field1502 > var1)) {
         if (!(var1 < (float)this.method2946()) && !(var1 > (float)this.method2942())) {
            int var2 = this.method2947();
            int var3 = this.field1556;
            if (var2 > 0) {
               int var4 = 0;
               int var5 = var2 - 1;

               do {
                  int var6 = var5 + var4 >> 1;
                  if (var1 < (float)this.field1541[var6].field1502) {
                     if (var1 > (float)this.field1541[var6 - 1].field1502) {
                        var3 = var6 - 1;
                        break;
                     }

                     var5 = var6 - 1;
                  } else {
                     if (!(var1 > (float)this.field1541[var6].field1502)) {
                        var3 = var6;
                        break;
                     }

                     if (var1 < (float)this.field1541[var6 + 1].field1502) {
                        var3 = var6;
                        break;
                     }

                     var4 = var6 + 1;
                  }
               } while(var4 <= var5);
            }

            if (var3 != this.field1556) {
               this.field1556 = var3;
               this.field1553 = true;
            }

            return this.field1556;
         } else {
            return -1;
         }
      } else {
         return this.field1556;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(FI)Ldq;",
      garbageValue = "-1470055279"
   )
   class121 method2950(float var1) {
      int var2 = this.method2945(var1);
      return var2 >= 0 && var2 < this.field1541.length ? this.field1541[var2] : null;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1641369395"
   )
   int method2947() {
      return this.field1541 == null ? 0 : this.field1541.length;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lcb;III)V",
      garbageValue = "-1404765395"
   )
   @Export("runScript")
   static void runScript(ScriptEvent var0, int var1, int var2) {
      Object[] var3 = var0.args;
      Script var4;
      int var20;
      if (class87.isWorldMapEvent(var0.type)) {
         GrandExchangeOfferUnitPriceComparator.worldMapEvent = (WorldMapEvent)var3[0];
         WorldMapElement var5 = JagexCache.WorldMapElement_get(GrandExchangeOfferUnitPriceComparator.worldMapEvent.mapElement);
         var4 = class29.getWorldMapScript(var0.type, var5.objectId, var5.category);
      } else {
         var20 = (Integer)var3[0];
         var4 = VarbitComposition.getScript(var20);
      }

      if (var4 != null) {
         class87.Interpreter_intStackSize = 0;
         Interpreter.Interpreter_stringStackSize = 0;
         var20 = -1;
         int[] var6 = var4.opcodes;
         int[] var7 = var4.intOperands;
         int var8 = -1;
         Interpreter.Interpreter_frameDepth = 0;
         Interpreter.field865 = false;
         boolean var9 = false;
         int var10 = 0;
         boolean var30 = false;

         label950: {
            label951: {
               try {
                  int var13;
                  try {
                     var30 = true;
                     Interpreter.Interpreter_intLocals = new int[var4.localIntCount];
                     int var11 = 0;
                     class415.Interpreter_stringLocals = new String[var4.localStringCount];
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

                           class415.Interpreter_stringLocals[var12++] = var21;
                        }
                     }

                     Interpreter.field874 = var0.field1084;

                     label934:
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

                           var14 = SecureRandomFuture.method2119(var8, var4, var34);
                           switch (var14) {
                              case 0:
                                 var30 = false;
                                 break label934;
                              case 1:
                              default:
                                 break;
                              case 2:
                                 throw new IllegalStateException();
                           }
                        } else if (var8 == ScriptOpcodes.ICONST) {
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7[var20];
                        } else if (var8 == ScriptOpcodes.GET_VARP) {
                           var13 = var7[var20];
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
                        } else if (var8 == ScriptOpcodes.SET_VARP) {
                           var13 = var7[var20];
                           Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                           MouseRecorder.changeGameOptions(var13);
                        } else if (var8 == ScriptOpcodes.SCONST) {
                           Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.stringOperands[var20];
                        } else if (var8 == ScriptOpcodes.JUMP) {
                           var20 += var7[var20];
                        } else if (var8 == ScriptOpcodes.IF_ICMPNE) {
                           class87.Interpreter_intStackSize -= 2;
                           if (Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]) {
                              var20 += var7[var20];
                           }
                        } else if (var8 == ScriptOpcodes.IF_ICMPEQ) {
                           class87.Interpreter_intStackSize -= 2;
                           if (Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]) {
                              var20 += var7[var20];
                           }
                        } else if (var8 == ScriptOpcodes.IF_ICMPLT) {
                           class87.Interpreter_intStackSize -= 2;
                           if (Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]) {
                              var20 += var7[var20];
                           }
                        } else if (var8 == ScriptOpcodes.IF_ICMPGT) {
                           class87.Interpreter_intStackSize -= 2;
                           if (Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]) {
                              var20 += var7[var20];
                           }
                        } else if (var8 == ScriptOpcodes.RETURN) {
                           if (Interpreter.Interpreter_frameDepth == 0) {
                              var30 = false;
                              break label951;
                           }

                           ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
                           var4 = var39.script;
                           var6 = var4.opcodes;
                           var7 = var4.intOperands;
                           var20 = var39.pc;
                           Interpreter.Interpreter_intLocals = var39.intLocals;
                           class415.Interpreter_stringLocals = var39.stringLocals;
                        } else if (var8 == ScriptOpcodes.GET_VARBIT) {
                           var13 = var7[var20];
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = PlayerCompositionColorTextureOverride.getVarbit(var13);
                        } else if (var8 == ScriptOpcodes.SET_VARBIT) {
                           var13 = var7[var20];
                           Login.method2065(var13, Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
                        } else if (var8 == ScriptOpcodes.IF_ICMPLE) {
                           class87.Interpreter_intStackSize -= 2;
                           if (Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]) {
                              var20 += var7[var20];
                           }
                        } else if (var8 == ScriptOpcodes.IF_ICMPGE) {
                           class87.Interpreter_intStackSize -= 2;
                           if (Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]) {
                              var20 += var7[var20];
                           }
                        } else if (var8 == ScriptOpcodes.ILOAD) {
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var20]];
                        } else if (var8 == ScriptOpcodes.ISTORE) {
                           Interpreter.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                        } else if (var8 == ScriptOpcodes.SLOAD) {
                           Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class415.Interpreter_stringLocals[var7[var20]];
                        } else if (var8 == ScriptOpcodes.SSTORE) {
                           class415.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                        } else if (var8 == ScriptOpcodes.JOIN_STRING) {
                           var13 = var7[var20];
                           Interpreter.Interpreter_stringStackSize -= var13;
                           var21 = Tile.method4311(Interpreter.Interpreter_stringStack, Interpreter.Interpreter_stringStackSize, var13);
                           Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var21;
                        } else if (var8 == ScriptOpcodes.POP_INT) {
                           --class87.Interpreter_intStackSize;
                        } else if (var8 == ScriptOpcodes.POP_STRING) {
                           --Interpreter.Interpreter_stringStackSize;
                        } else {
                           int var17;
                           if (var8 != ScriptOpcodes.INVOKE) {
                              if (var8 == ScriptOpcodes.GET_VARC_INT) {
                                 Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = WorldMapArea.varcs.getInt(var7[var20]);
                              } else if (var8 == ScriptOpcodes.SET_VARC_INT) {
                                 WorldMapArea.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
                              } else if (var8 == ScriptOpcodes.DEFINE_ARRAY) {
                                 var13 = var7[var20] >> 16;
                                 var14 = var7[var20] & '\uffff';
                                 int var24 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
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
                                 var14 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                                 if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
                                    throw new RuntimeException();
                                 }

                                 Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
                              } else if (var8 == ScriptOpcodes.SET_ARRAY_INT) {
                                 var13 = var7[var20];
                                 class87.Interpreter_intStackSize -= 2;
                                 var14 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                                 if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
                                    throw new RuntimeException();
                                 }

                                 Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
                              } else {
                                 String var22;
                                 if (var8 == ScriptOpcodes.GET_VARC_STRING_OLD) {
                                    var22 = WorldMapArea.varcs.getStringOld(var7[var20]);
                                    if (var22 == null) {
                                       var22 = "null";
                                    }

                                    Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var22;
                                 } else if (var8 == ScriptOpcodes.SET_VARC_STRING_OLD) {
                                    WorldMapArea.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
                                 } else if (var8 == ScriptOpcodes.GET_VARC_STRING) {
                                    var22 = WorldMapArea.varcs.getString(var7[var20]);
                                    Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var22;
                                 } else if (var8 == ScriptOpcodes.SET_VARC_STRING) {
                                    WorldMapArea.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
                                 } else if (var8 == ScriptOpcodes.SWITCH) {
                                    IterableNodeHashTable var37 = var4.switches[var7[var20]];
                                    IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
                                    if (var36 != null) {
                                       var20 += var36.integer;
                                    }
                                 } else {
                                    Integer var38;
                                    if (var8 == ScriptOpcodes.GET_VARCLANSETTING) {
                                       var38 = class126.field1573.getTitleGroupValue(var7[var20]);
                                       if (var38 == null) {
                                          Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                                       } else {
                                          Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var38;
                                       }
                                    } else {
                                       if (var8 != ScriptOpcodes.GET_VARCLAN) {
                                          throw new IllegalStateException();
                                       }

                                       var38 = LoginScreenAnimation.field1286.method7867(var7[var20]);
                                       if (var38 == null) {
                                          Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                                       } else {
                                          Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var38;
                                       }
                                    }
                                 }
                              }
                           } else {
                              var13 = var7[var20];
                              Script var35 = VarbitComposition.getScript(var13);
                              int[] var15 = new int[var35.localIntCount];
                              String[] var16 = new String[var35.localStringCount];

                              for(var17 = 0; var17 < var35.intArgumentCount; ++var17) {
                                 var15[var17] = Interpreter.Interpreter_intStack[var17 + (class87.Interpreter_intStackSize - var35.intArgumentCount)];
                              }

                              for(var17 = 0; var17 < var35.stringArgumentCount; ++var17) {
                                 var16[var17] = Interpreter.Interpreter_stringStack[var17 + (Interpreter.Interpreter_stringStackSize - var35.stringArgumentCount)];
                              }

                              class87.Interpreter_intStackSize -= var35.intArgumentCount;
                              Interpreter.Interpreter_stringStackSize -= var35.stringArgumentCount;
                              ScriptFrame var23 = new ScriptFrame();
                              var23.script = var4;
                              var23.pc = var20;
                              var23.intLocals = Interpreter.Interpreter_intLocals;
                              var23.stringLocals = class415.Interpreter_stringLocals;
                              Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23;
                              var4 = var35;
                              var6 = var35.opcodes;
                              var7 = var35.intOperands;
                              var20 = -1;
                              Interpreter.Interpreter_intLocals = var15;
                              class415.Interpreter_stringLocals = var16;
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
                     class132.RunException_sendStackTrace(var27.toString(), var31);
                     var30 = false;
                     break label950;
                  }
               } finally {
                  if (var30) {
                     while(Interpreter.field867.size() > 0) {
                        class98 var19 = (class98)Interpreter.field867.remove(0);
                        ModelData0.widgetDefaultMenuAction(var19.method2592(), var19.method2593(), var19.method2594(), var19.method2599(), "");
                     }

                     if (Interpreter.field865) {
                        Interpreter.field865 = false;
                        WorldMapSectionType.method5236();
                     }

                     if (!var9 && var2 > 0 && var10 >= var2) {
                        class132.RunException_sendStackTrace("Warning: Script " + var4.field990 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
                     }

                  }
               }

               while(Interpreter.field867.size() > 0) {
                  class98 var33 = (class98)Interpreter.field867.remove(0);
                  ModelData0.widgetDefaultMenuAction(var33.method2592(), var33.method2593(), var33.method2594(), var33.method2599(), "");
               }

               if (Interpreter.field865) {
                  Interpreter.field865 = false;
                  WorldMapSectionType.method5236();
               }

               if (!var9 && var2 > 0 && var10 >= var2) {
                  class132.RunException_sendStackTrace("Warning: Script " + var4.field990 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
               }

               return;
            }

            while(Interpreter.field867.size() > 0) {
               class98 var40 = (class98)Interpreter.field867.remove(0);
               ModelData0.widgetDefaultMenuAction(var40.method2592(), var40.method2593(), var40.method2594(), var40.method2599(), "");
            }

            if (Interpreter.field865) {
               Interpreter.field865 = false;
               WorldMapSectionType.method5236();
            }

            if (!var9 && var2 > 0 && var10 >= var2) {
               class132.RunException_sendStackTrace("Warning: Script " + var4.field990 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
            }

            return;
         }

         while(Interpreter.field867.size() > 0) {
            class98 var26 = (class98)Interpreter.field867.remove(0);
            ModelData0.widgetDefaultMenuAction(var26.method2592(), var26.method2593(), var26.method2594(), var26.method2599(), "");
         }

         if (Interpreter.field865) {
            Interpreter.field865 = false;
            WorldMapSectionType.method5236();
         }

         if (!var9 && var2 > 0 && var10 >= var2) {
            class132.RunException_sendStackTrace("Warning: Script " + var4.field990 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
         }

      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lly;III)Lrx;",
      garbageValue = "-16711936"
   )
   @Export("SpriteBuffer_getSprite")
   public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
      byte[] var4 = var0.takeFile(var1, var2);
      boolean var3;
      if (var4 == null) {
         var3 = false;
      } else {
         VarpDefinition.SpriteBuffer_decode(var4);
         var3 = true;
      }

      return !var3 ? null : class360.method6967();
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Lqy;II)V",
      garbageValue = "-1201081904"
   )
   public static void method2940(Buffer var0, int var1) {
      if (JagexCache.JagexCache_randomDat != null) {
         try {
            JagexCache.JagexCache_randomDat.seek(0L);
            JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
         } catch (Exception var3) {
         }
      }

   }

   @ObfuscatedName("kx")
   @ObfuscatedSignature(
      descriptor = "(IIB)Ljava/lang/String;",
      garbageValue = "120"
   )
   static final String method2971(int var0, int var1) {
      int var2 = var1 - var0;
      if (var2 < -9) {
         return MouseRecorder.colorStartTag(16711680);
      } else if (var2 < -6) {
         return MouseRecorder.colorStartTag(16723968);
      } else if (var2 < -3) {
         return MouseRecorder.colorStartTag(16740352);
      } else if (var2 < 0) {
         return MouseRecorder.colorStartTag(16756736);
      } else if (var2 > 9) {
         return MouseRecorder.colorStartTag(65280);
      } else if (var2 > 6) {
         return MouseRecorder.colorStartTag(4259584);
      } else if (var2 > 3) {
         return MouseRecorder.colorStartTag(8453888);
      } else {
         return var2 > 0 ? MouseRecorder.colorStartTag(12648192) : MouseRecorder.colorStartTag(16776960);
      }
   }
}
