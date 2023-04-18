import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fw")
public class class144 extends class139 {
   @ObfuscatedName("iz")
   @ObfuscatedGetter(
      intValue = -1518641849
   )
   static int field1677;
   @ObfuscatedName("lf")
   @ObfuscatedGetter(
      intValue = -365969735
   )
   @Export("oculusOrbFocalPointY")
   static int oculusOrbFocalPointY;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 327631731
   )
   int field1671;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -2041660067
   )
   int field1672;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1801165299
   )
   int field1673;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 116080323
   )
   int field1676;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   final class142 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfa;)V"
   )
   class144(class142 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "168736686"
   )
   void vmethod3461(Buffer var1) {
      this.field1671 = var1.readInt();
      this.field1676 = var1.readInt();
      this.field1672 = var1.readUnsignedByte();
      this.field1673 = var1.readUnsignedByte();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfj;I)V",
      garbageValue = "1712319228"
   )
   void vmethod3458(ClanSettings var1) {
      var1.method3316(this.field1671, this.field1676, this.field1672, this.field1673);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIILia;Lif;Z[I[II)I",
      garbageValue = "1716451155"
   )
   public static int method3246(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7) {
      int var9;
      for(int var8 = 0; var8 < 128; ++var8) {
         for(var9 = 0; var9 < 128; ++var9) {
            class211.directions[var8][var9] = 0;
            class211.distances[var8][var9] = 99999999;
         }
      }

      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var19;
      int var20;
      int var21;
      boolean var28;
      if (var2 == 1) {
         var28 = class88.method2359(var0, var1, var3, var4);
      } else if (var2 == 2) {
         var10 = var0;
         var11 = var1;
         var12 = 64;
         var13 = 64;
         var14 = var0 - var12;
         var15 = var1 - var13;
         class211.directions[var12][var13] = 99;
         class211.distances[var12][var13] = 0;
         var16 = 0;
         var17 = 0;
         class211.bufferX[var16] = var0;
         class211.bufferY[var16++] = var1;
         int[][] var18 = var4.flags;

         boolean var29;
         while(true) {
            if (var17 == var16) {
               class18.field94 = var10;
               class397.field4534 = var11;
               var29 = false;
               break;
            }

            var10 = class211.bufferX[var17];
            var11 = class211.bufferY[var17];
            var17 = var17 + 1 & 4095;
            var12 = var10 - var14;
            var13 = var11 - var15;
            var19 = var10 - var4.xInset;
            var20 = var11 - var4.yInset;
            if (var3.hasArrived(2, var10, var11, var4)) {
               class18.field94 = var10;
               class397.field4534 = var11;
               var29 = true;
               break;
            }

            var21 = class211.distances[var12][var13] + 1;
            if (var12 > 0 && class211.directions[var12 - 1][var13] == 0 && (var18[var19 - 1][var20] & 19136782) == 0 && (var18[var19 - 1][var20 + 1] & 19136824) == 0) {
               class211.bufferX[var16] = var10 - 1;
               class211.bufferY[var16] = var11;
               var16 = var16 + 1 & 4095;
               class211.directions[var12 - 1][var13] = 2;
               class211.distances[var12 - 1][var13] = var21;
            }

            if (var12 < 126 && class211.directions[var12 + 1][var13] == 0 && (var18[var19 + 2][var20] & 19136899) == 0 && (var18[var19 + 2][var20 + 1] & 19136992) == 0) {
               class211.bufferX[var16] = var10 + 1;
               class211.bufferY[var16] = var11;
               var16 = var16 + 1 & 4095;
               class211.directions[var12 + 1][var13] = 8;
               class211.distances[var12 + 1][var13] = var21;
            }

            if (var13 > 0 && class211.directions[var12][var13 - 1] == 0 && (var18[var19][var20 - 1] & 19136782) == 0 && (var18[var19 + 1][var20 - 1] & 19136899) == 0) {
               class211.bufferX[var16] = var10;
               class211.bufferY[var16] = var11 - 1;
               var16 = var16 + 1 & 4095;
               class211.directions[var12][var13 - 1] = 1;
               class211.distances[var12][var13 - 1] = var21;
            }

            if (var13 < 126 && class211.directions[var12][var13 + 1] == 0 && (var18[var19][var20 + 2] & 19136824) == 0 && (var18[var19 + 1][var20 + 2] & 19136992) == 0) {
               class211.bufferX[var16] = var10;
               class211.bufferY[var16] = var11 + 1;
               var16 = var16 + 1 & 4095;
               class211.directions[var12][var13 + 1] = 4;
               class211.distances[var12][var13 + 1] = var21;
            }

            if (var12 > 0 && var13 > 0 && class211.directions[var12 - 1][var13 - 1] == 0 && (var18[var19 - 1][var20] & 19136830) == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0 && (var18[var19][var20 - 1] & 19136911) == 0) {
               class211.bufferX[var16] = var10 - 1;
               class211.bufferY[var16] = var11 - 1;
               var16 = var16 + 1 & 4095;
               class211.directions[var12 - 1][var13 - 1] = 3;
               class211.distances[var12 - 1][var13 - 1] = var21;
            }

            if (var12 < 126 && var13 > 0 && class211.directions[var12 + 1][var13 - 1] == 0 && (var18[var19 + 1][var20 - 1] & 19136911) == 0 && (var18[var19 + 2][var20 - 1] & 19136899) == 0 && (var18[var19 + 2][var20] & 19136995) == 0) {
               class211.bufferX[var16] = var10 + 1;
               class211.bufferY[var16] = var11 - 1;
               var16 = var16 + 1 & 4095;
               class211.directions[var12 + 1][var13 - 1] = 9;
               class211.distances[var12 + 1][var13 - 1] = var21;
            }

            if (var12 > 0 && var13 < 126 && class211.directions[var12 - 1][var13 + 1] == 0 && (var18[var19 - 1][var20 + 1] & 19136830) == 0 && (var18[var19 - 1][var20 + 2] & 19136824) == 0 && (var18[var19][var20 + 2] & 19137016) == 0) {
               class211.bufferX[var16] = var10 - 1;
               class211.bufferY[var16] = var11 + 1;
               var16 = var16 + 1 & 4095;
               class211.directions[var12 - 1][var13 + 1] = 6;
               class211.distances[var12 - 1][var13 + 1] = var21;
            }

            if (var12 < 126 && var13 < 126 && class211.directions[var12 + 1][var13 + 1] == 0 && (var18[var19 + 1][var20 + 2] & 19137016) == 0 && (var18[var19 + 2][var20 + 2] & 19136992) == 0 && (var18[var19 + 2][var20 + 1] & 19136995) == 0) {
               class211.bufferX[var16] = var10 + 1;
               class211.bufferY[var16] = var11 + 1;
               var16 = var16 + 1 & 4095;
               class211.directions[var12 + 1][var13 + 1] = 12;
               class211.distances[var12 + 1][var13 + 1] = var21;
            }
         }

         var28 = var29;
      } else {
         var28 = KitDefinition.method3698(var0, var1, var2, var3, var4);
      }

      var9 = var0 - 64;
      var10 = var1 - 64;
      var11 = class18.field94;
      var12 = class397.field4534;
      if (!var28) {
         var13 = Integer.MAX_VALUE;
         var14 = Integer.MAX_VALUE;
         byte var31 = 10;
         var16 = var3.approxDestinationX;
         var17 = var3.approxDestinationY;
         int var27 = var3.approxDestinationSizeX;
         var19 = var3.approxDestinationSizeY;

         for(var20 = var16 - var31; var20 <= var16 + var31; ++var20) {
            for(var21 = var17 - var31; var21 <= var17 + var31; ++var21) {
               int var22 = var20 - var9;
               int var23 = var21 - var10;
               if (var22 >= 0 && var23 >= 0 && var22 < 128 && var23 < 128 && class211.distances[var22][var23] < 100) {
                  int var24 = 0;
                  if (var20 < var16) {
                     var24 = var16 - var20;
                  } else if (var20 > var27 + var16 - 1) {
                     var24 = var20 - (var27 + var16 - 1);
                  }

                  int var25 = 0;
                  if (var21 < var17) {
                     var25 = var17 - var21;
                  } else if (var21 > var19 + var17 - 1) {
                     var25 = var21 - (var19 + var17 - 1);
                  }

                  int var26 = var25 * var25 + var24 * var24;
                  if (var26 < var13 || var13 == var26 && class211.distances[var22][var23] < var14) {
                     var13 = var26;
                     var14 = class211.distances[var22][var23];
                     var11 = var20;
                     var12 = var21;
                  }
               }
            }
         }

         if (var13 == Integer.MAX_VALUE) {
            return -1;
         }
      }

      if (var0 == var11 && var12 == var1) {
         var6[0] = var11;
         var7[0] = var12;
         return 0;
      } else {
         byte var30 = 0;
         class211.bufferX[var30] = var11;
         var13 = var30 + 1;
         class211.bufferY[var30] = var12;

         for(var14 = var15 = class211.directions[var11 - var9][var12 - var10]; var0 != var11 || var12 != var1; var14 = class211.directions[var11 - var9][var12 - var10]) {
            if (var14 != var15) {
               var15 = var14;
               class211.bufferX[var13] = var11;
               class211.bufferY[var13++] = var12;
            }

            if ((var14 & 2) != 0) {
               ++var11;
            } else if ((var14 & 8) != 0) {
               --var11;
            }

            if ((var14 & 1) != 0) {
               ++var12;
            } else if ((var14 & 4) != 0) {
               --var12;
            }
         }

         var16 = 0;

         while(var13-- > 0) {
            var6[var16] = class211.bufferX[var13];
            var7[var16++] = class211.bufferY[var13];
            if (var16 >= var6.length) {
               break;
            }
         }

         return var16;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IS)Lhq;",
      garbageValue = "2415"
   )
   @Export("getObjectDefinition")
   public static ObjectComposition getObjectDefinition(int var0) {
      ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
         var1 = new ObjectComposition();
         var1.id = var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.postDecode();
         if (var1.isSolid) {
            var1.interactType = 0;
            var1.boolean1 = false;
         }

         ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "([BIII)Ljava/lang/String;",
      garbageValue = "-253703196"
   )
   static String method3257(byte[] var0, int var1, int var2) {
      StringBuilder var3 = new StringBuilder();

      for(int var4 = var1; var4 < var2 + var1; var4 += 3) {
         int var5 = var0[var4] & 255;
         var3.append(class370.field4377[var5 >>> 2]);
         if (var4 < var2 - 1) {
            int var6 = var0[var4 + 1] & 255;
            var3.append(class370.field4377[(var5 & 3) << 4 | var6 >>> 4]);
            if (var4 < var2 - 2) {
               int var7 = var0[var4 + 2] & 255;
               var3.append(class370.field4377[(var6 & 15) << 2 | var7 >>> 6]).append(class370.field4377[var7 & 63]);
            } else {
               var3.append(class370.field4377[(var6 & 15) << 2]).append("=");
            }
         } else {
            var3.append(class370.field4377[(var5 & 3) << 4]).append("==");
         }
      }

      return var3.toString();
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1444508047"
   )
   public static void method3252() {
      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
         if (ArchiveDiskActionHandler.field4196 != 0) {
            ArchiveDiskActionHandler.field4196 = 1;

            try {
               ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
            } catch (InterruptedException var3) {
            }
         }

      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIFFFII)V",
      garbageValue = "-515253774"
   )
   public static void method3256(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      Rasterizer3D.field2519.vmethod4961(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZB)I",
      garbageValue = "38"
   )
   static int method3251(int var0, Script var1, boolean var2) {
      int var3;
      Object var4;
      int var5;
      class482 var6;
      int var7;
      if (var0 != ScriptOpcodes.DB_FIND_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND) {
         if (var0 != ScriptOpcodes.DB_FINDNEXT) {
            int var19;
            int var20;
            if (var0 == ScriptOpcodes.DB_GETFIELD) {
               Interpreter.Interpreter_intStackSize -= 3;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
               var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
               var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
               var20 = class373.method7203(var19);
               var7 = BufferedSink.method8064(var19);
               int var21 = class146.method3272(var19);
               DbRowType var26 = class125.getDbRowType(var3);
               DbTableType var27 = GameBuild.getDbTableType(var20);
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
                     class478 var22 = class103.method2717(var16);
                     if (var22 == class478.field4946) {
                        Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                     } else {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.method6884(var16);
                     }
                  }

                  return 1;
               } else {
                  var15 = var14.length / var28.length;
                  if (var5 >= 0 && var5 < var15) {
                     for(var16 = var12; var16 < var13; ++var16) {
                        int var17 = var16 + var28.length * var5;
                        class478 var18 = class103.method2717(var28[var16]);
                        if (var18 == class478.field4946) {
                           Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = (String)var14[var17];
                        } else {
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)var14[var17];
                        }
                     }

                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               }
            } else if (var0 == ScriptOpcodes.DB_GETFIELDCOUNT) {
               Interpreter.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
               var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
               var5 = 0;
               var20 = class373.method7203(var19);
               var7 = BufferedSink.method8064(var19);
               DbRowType var25 = class125.getDbRowType(var3);
               DbTableType var9 = GameBuild.getDbTableType(var20);
               int[] var10 = var9.types[var7];
               Object[] var11 = var25.getColumnType(var7);
               if (var11 == null && var9.defaultValues != null) {
                  var11 = var9.defaultValues[var7];
               }

               if (var11 != null) {
                  var5 = var11.length / var10.length;
               }

               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
               return 1;
            } else if (var0 != ScriptOpcodes.DB_FINDALL_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND_FILTER) {
               if (var0 == ScriptOpcodes.DB_GETROWTABLE) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  DbRowType var24 = class125.getDbRowType(var3);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var24.tableId;
                  return 1;
               } else if (var0 == ScriptOpcodes.DB_GETROW) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var19 = -1;
                  if (class9.field35 != null && var3 >= 0 && var3 < class9.field35.size()) {
                     var19 = (Integer)class9.field35.get(var3);
                  }

                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var19;
                  return 1;
               } else if (var0 != ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT && var0 != ScriptOpcodes.DB_FINDALL) {
                  return 2;
               } else {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = ScriptEvent.method2253(var3);
                  var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var6 = class206.method4205(var5);
                  if (var6 == null) {
                     throw new RuntimeException();
                  } else if (class373.method7203(var5) != Client.field746) {
                     throw new RuntimeException();
                  } else if (class9.field35 == null && class9.field35.isEmpty()) {
                     throw new RuntimeException();
                  } else {
                     var7 = class146.method3272(var5);
                     List var8 = var6.method8949(var4, var7);
                     class9.field35 = new LinkedList(class9.field35);
                     if (var8 != null) {
                        class9.field35.retainAll(var8);
                     } else {
                        class9.field35.clear();
                     }

                     class1.field6 = class9.field35.iterator();
                     if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class9.field35.size();
                     }

                     return 1;
                  }
               }
            } else {
               --Interpreter.Interpreter_intStackSize;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
               class482 var23 = class10.method99(var3);
               if (var23 == null) {
                  throw new RuntimeException();
               } else {
                  class9.field35 = var23.method8949(0, 0);
                  var5 = 0;
                  if (class9.field35 != null) {
                     Client.field746 = var3;
                     class1.field6 = class9.field35.iterator();
                     var5 = class9.field35.size();
                  }

                  if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
                  }

                  return 1;
               }
            }
         } else {
            if (class1.field6 != null && class1.field6.hasNext()) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)class1.field6.next();
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
            }

            return 1;
         }
      } else {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         var4 = ScriptEvent.method2253(var3);
         var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         var6 = class206.method4205(var5);
         if (var6 == null) {
            throw new RuntimeException();
         } else {
            var7 = class146.method3272(var5);
            class9.field35 = var6.method8949(var4, var7);
            if (class9.field35 != null) {
               Client.field746 = class373.method7203(var5);
               class1.field6 = class9.field35.iterator();
               if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class9.field35.size();
               }
            } else {
               Client.field746 = -1;
               class1.field6 = null;
               if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("ma")
   @ObfuscatedSignature(
      descriptor = "(Lmq;I)V",
      garbageValue = "-1541166442"
   )
   @Export("invalidateWidget")
   public static void invalidateWidget(Widget var0) {
      if (var0 != null && var0.cycle == Client.field659) {
         Client.field705[var0.rootIndex] = true;
      }

   }
}
