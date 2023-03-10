import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("go")
public class class159 extends class140 {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -390805345
   )
   int field1752;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfo;"
   )
   final class143 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfo;)V"
   )
   class159(class143 var1) {
      this.this$0 = var1;
      this.field1752 = -1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "-1979280996"
   )
   void vmethod3361(Buffer var1) {
      this.field1752 = var1.readUnsignedShort();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lfi;B)V",
      garbageValue = "29"
   )
   void vmethod3362(ClanSettings var1) {
      var1.method3192(this.field1752);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;II[BII)I",
      garbageValue = "872602777"
   )
   @Export("encodeStringCp1252")
   public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var2 - var1;

      for(int var6 = 0; var6 < var5; ++var6) {
         char var7 = var0.charAt(var6 + var1);
         if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
            var3[var6 + var4] = (byte)var7;
         } else if (var7 == 8364) {
            var3[var6 + var4] = -128;
         } else if (var7 == 8218) {
            var3[var6 + var4] = -126;
         } else if (var7 == 402) {
            var3[var6 + var4] = -125;
         } else if (var7 == 8222) {
            var3[var6 + var4] = -124;
         } else if (var7 == 8230) {
            var3[var6 + var4] = -123;
         } else if (var7 == 8224) {
            var3[var6 + var4] = -122;
         } else if (var7 == 8225) {
            var3[var6 + var4] = -121;
         } else if (var7 == 710) {
            var3[var6 + var4] = -120;
         } else if (var7 == 8240) {
            var3[var6 + var4] = -119;
         } else if (var7 == 352) {
            var3[var6 + var4] = -118;
         } else if (var7 == 8249) {
            var3[var6 + var4] = -117;
         } else if (var7 == 338) {
            var3[var6 + var4] = -116;
         } else if (var7 == 381) {
            var3[var6 + var4] = -114;
         } else if (var7 == 8216) {
            var3[var6 + var4] = -111;
         } else if (var7 == 8217) {
            var3[var6 + var4] = -110;
         } else if (var7 == 8220) {
            var3[var6 + var4] = -109;
         } else if (var7 == 8221) {
            var3[var6 + var4] = -108;
         } else if (var7 == 8226) {
            var3[var6 + var4] = -107;
         } else if (var7 == 8211) {
            var3[var6 + var4] = -106;
         } else if (var7 == 8212) {
            var3[var6 + var4] = -105;
         } else if (var7 == 732) {
            var3[var6 + var4] = -104;
         } else if (var7 == 8482) {
            var3[var6 + var4] = -103;
         } else if (var7 == 353) {
            var3[var6 + var4] = -102;
         } else if (var7 == 8250) {
            var3[var6 + var4] = -101;
         } else if (var7 == 339) {
            var3[var6 + var4] = -100;
         } else if (var7 == 382) {
            var3[var6 + var4] = -98;
         } else if (var7 == 376) {
            var3[var6 + var4] = -97;
         } else {
            var3[var6 + var4] = 63;
         }
      }

      return var5;
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZB)I",
      garbageValue = "1"
   )
   static int method3324(int var0, Script var1, boolean var2) {
      int var3;
      Object var4;
      int var5;
      class471 var6;
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
               var20 = class36.method674(var19);
               var7 = GameObject.method4778(var19);
               int var21 = Clock.method3535(var19);
               DbRowType var26 = SecureRandomCallable.getDbRowType(var3);
               DbTableType var27 = WorldMapSection0.getDbTableType(var20);
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
                     class467 var22 = class458.method8343(var16);
                     if (var22 == class467.field4865) {
                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                     } else {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ItemComposition.method3970(var16);
                     }
                  }

                  return 1;
               } else {
                  var15 = var14.length / var28.length;
                  if (var5 >= 0 && var5 < var15) {
                     for(var16 = var12; var16 < var13; ++var16) {
                        int var17 = var16 + var28.length * var5;
                        class467 var18 = class458.method8343(var28[var16]);
                        if (var18 == class467.field4865) {
                           Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = (String)var14[var17];
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
               var20 = class36.method674(var19);
               var7 = GameObject.method4778(var19);
               DbRowType var25 = SecureRandomCallable.getDbRowType(var3);
               DbTableType var9 = WorldMapSection0.getDbTableType(var20);
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
                  DbRowType var24 = SecureRandomCallable.getDbRowType(var3);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var24.tableId;
                  return 1;
               } else if (var0 == ScriptOpcodes.DB_GETROW) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var19 = -1;
                  if (class258.field2982 != null && var3 >= 0 && var3 < class258.field2982.size()) {
                     var19 = (Integer)class258.field2982.get(var3);
                  }

                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var19;
                  return 1;
               } else if (var0 != ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT && var0 != ScriptOpcodes.DB_FINDALL) {
                  return 2;
               } else {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = class135.method3074(var3);
                  var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var6 = class126.method2968(var5);
                  if (var6 == null) {
                     throw new RuntimeException();
                  } else if (class36.method674(var5) != Client.field765) {
                     throw new RuntimeException();
                  } else if (class258.field2982 == null && class258.field2982.isEmpty()) {
                     throw new RuntimeException();
                  } else {
                     var7 = Clock.method3535(var5);
                     List var8 = var6.method8512(var4, var7);
                     class258.field2982 = new LinkedList(class258.field2982);
                     if (var8 != null) {
                        class258.field2982.retainAll(var8);
                     } else {
                        class258.field2982.clear();
                     }

                     ScriptFrame.field450 = class258.field2982.iterator();
                     if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class258.field2982.size();
                     }

                     return 1;
                  }
               }
            } else {
               --Interpreter.Interpreter_intStackSize;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
               class471 var23 = class70.method2050(var3);
               if (var23 == null) {
                  throw new RuntimeException();
               } else {
                  class258.field2982 = var23.method8512(0, 0);
                  var5 = 0;
                  if (class258.field2982 != null) {
                     Client.field765 = var3;
                     ScriptFrame.field450 = class258.field2982.iterator();
                     var5 = class258.field2982.size();
                  }

                  if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
                  }

                  return 1;
               }
            }
         } else {
            if (ScriptFrame.field450 != null && ScriptFrame.field450.hasNext()) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)ScriptFrame.field450.next();
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
            }

            return 1;
         }
      } else {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         var4 = class135.method3074(var3);
         var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         var6 = class126.method2968(var5);
         if (var6 == null) {
            throw new RuntimeException();
         } else {
            var7 = Clock.method3535(var5);
            class258.field2982 = var6.method8512(var4, var7);
            if (class258.field2982 != null) {
               Client.field765 = class36.method674(var5);
               ScriptFrame.field450 = class258.field2982.iterator();
               if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class258.field2982.size();
               }
            } else {
               Client.field765 = -1;
               ScriptFrame.field450 = null;
               if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("my")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-284669755"
   )
   @Export("changeGameOptions")
   static final void changeGameOptions(int var0) {
      GrandExchangeOfferNameComparator.method6553();
      WorldMapSection2.method4824();
      int var1 = GameEngine.VarpDefinition_get(var0).type;
      if (var1 != 0) {
         int var2 = Varps.Varps_main[var0];
         if (var1 == 1) {
            if (var2 == 1) {
               class7.method54(0.9);
            }

            if (var2 == 2) {
               class7.method54(0.8);
            }

            if (var2 == 3) {
               class7.method54(0.7);
            }

            if (var2 == 4) {
               Rasterizer3D.Rasterizer3D_setBrightness(0.6);
               ((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.6);
               TaskHandler.method3446();
               WorldMapSectionType.clientPreferences.method2522(0.6);
            }
         }

         if (var1 == 3) {
            if (var2 == 0) {
               class70.method2047(255);
            }

            if (var2 == 1) {
               class70.method2047(192);
            }

            if (var2 == 2) {
               class70.method2047(128);
            }

            if (var2 == 3) {
               class70.method2047(64);
            }

            if (var2 == 4) {
               class70.method2047(0);
            }
         }

         if (var1 == 4) {
            if (var2 == 0) {
               ApproximateRouteStrategy.method1201(127);
            }

            if (var2 == 1) {
               ApproximateRouteStrategy.method1201(96);
            }

            if (var2 == 2) {
               ApproximateRouteStrategy.method1201(64);
            }

            if (var2 == 3) {
               ApproximateRouteStrategy.method1201(32);
            }

            if (var2 == 4) {
               ApproximateRouteStrategy.method1201(0);
            }
         }

         if (var1 == 5) {
            Client.leftClickOpensMenu = var2 == 1;
         }

         if (var1 == 6) {
            Client.chatEffects = var2;
         }

         if (var1 == 9) {
         }

         if (var1 == 10) {
            if (var2 == 0) {
               class12.method151(127);
            }

            if (var2 == 1) {
               class12.method151(96);
            }

            if (var2 == 2) {
               class12.method151(64);
            }

            if (var2 == 3) {
               class12.method151(32);
            }

            if (var2 == 4) {
               class12.method151(0);
            }
         }

         if (var1 == 17) {
            Client.followerIndex = var2 & '\uffff';
         }

         AttackOption[] var3;
         if (var1 == 18) {
            var3 = new AttackOption[]{AttackOption.field1306, AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1303};
            Client.playerAttackOption = (AttackOption)SpriteMask.findEnumerated(var3, var2);
            if (Client.playerAttackOption == null) {
               Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
            }
         }

         if (var1 == 19) {
            if (var2 == -1) {
               Client.combatTargetPlayerIndex = -1;
            } else {
               Client.combatTargetPlayerIndex = var2 & 2047;
            }
         }

         if (var1 == 22) {
            var3 = new AttackOption[]{AttackOption.field1306, AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1303};
            Client.npcAttackOption = (AttackOption)SpriteMask.findEnumerated(var3, var2);
            if (Client.npcAttackOption == null) {
               Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
            }
         }

      }
   }
}
