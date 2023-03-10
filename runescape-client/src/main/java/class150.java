import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fh")
public class class150 extends class140 {
   @ObfuscatedName("ap")
   static int[] field1680;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 1214622489
   )
   int field1682;
   @ObfuscatedName("al")
   String field1681;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfo;"
   )
   final class143 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfo;)V"
   )
   class150(class143 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "-1979280996"
   )
   void vmethod3361(Buffer var1) {
      this.field1682 = var1.readInt();
      this.field1681 = var1.readStringCp1252NullTerminated();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lfi;B)V",
      garbageValue = "29"
   )
   void vmethod3362(ClanSettings var1) {
      var1.method3211(this.field1682, this.field1681);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "([BIIB)Z",
      garbageValue = "67"
   )
   static final boolean method3188(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      Buffer var4 = new Buffer(var0);
      int var5 = -1;

      label71:
      while(true) {
         int var6 = var4.readIncrSmallSmart();
         if (var6 == 0) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while(true) {
            int var9;
            while(!var8) {
               var9 = var4.readUShortSmart();
               if (var9 == 0) {
                  continue label71;
               }

               var7 += var9 - 1;
               int var10 = var7 & 63;
               int var11 = var7 >> 6 & 63;
               int var12 = var4.readUnsignedByte() >> 2;
               int var13 = var11 + var1;
               int var14 = var10 + var2;
               if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
                  ObjectComposition var15 = WallDecoration.getObjectDefinition(var5);
                  if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
                     if (!var15.needsModelFiles()) {
                        ++Client.field548;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }

            var9 = var4.readUShortSmart();
            if (var9 == 0) {
               break;
            }

            var4.readUnsignedByte();
         }
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZI)I",
      garbageValue = "2036952880"
   )
   static int method3181(int var0, Script var1, boolean var2) {
      Widget var3 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
      if (var0 == ScriptOpcodes.IF_GETX) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETY) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETHIDE) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETLAYER) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("jp")
   @ObfuscatedSignature(
      descriptor = "(Lkz;I)V",
      garbageValue = "-1653447364"
   )
   static final void method3183(class283 var0) {
      PacketBuffer var1 = Client.packetWriter.packetBuffer;
      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      NodeDeque var33;
      TileItem var41;
      if (class283.field3154 == var0) {
         var2 = var1.readUnsignedShort();
         var3 = var1.readUnsignedByteNeg();
         var4 = (var3 >> 4 & 7) + class283.field3165;
         var5 = (var3 & 7) + class149.field1677;
         var6 = var1.readUnsignedByte();
         if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
            var33 = Client.groundItems[TaskHandler.Client_plane][var4][var5];
            if (var33 != null) {
               for(var41 = (TileItem)var33.last(); var41 != null; var41 = (TileItem)var33.previous()) {
                  if ((var2 & 32767) == var41.id) {
                     var41.method2649(var6);
                     break;
                  }
               }
            }
         }

      } else {
         int var7;
         int var8;
         int var9;
         int var10;
         if (class283.field3158 == var0) {
            var2 = var1.readUnsignedByteAdd();
            var3 = var2 >> 4 & 15;
            var4 = var2 & 7;
            var5 = var1.readUnsignedByte();
            var6 = (var5 >> 4 & 7) + class283.field3165;
            var7 = (var5 & 7) + class149.field1677;
            var8 = var1.readUnsignedShortAddLE();
            var9 = var1.readUnsignedByte();
            if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
               var10 = var3 + 1;
               if (BuddyRankComparator.localPlayer.pathX[0] >= var6 - var10 && BuddyRankComparator.localPlayer.pathX[0] <= var10 + var6 && BuddyRankComparator.localPlayer.pathY[0] >= var7 - var10 && BuddyRankComparator.localPlayer.pathY[0] <= var10 + var7 && WorldMapSectionType.clientPreferences.method2463() != 0 && var4 > 0 && Client.soundEffectCount < 50) {
                  Client.soundEffectIds[Client.soundEffectCount] = var8;
                  Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4;
                  Client.queuedSoundEffectDelays[Client.soundEffectCount] = var9;
                  Client.soundEffects[Client.soundEffectCount] = null;
                  Client.soundLocations[Client.soundEffectCount] = var3 + (var7 << 8) + (var6 << 16);
                  ++Client.soundEffectCount;
               }
            }
         }

         int var11;
         if (class283.field3159 == var0) {
            var2 = var1.readUnsignedByteAdd();
            var3 = var2 >> 2;
            var4 = var2 & 3;
            var5 = Client.field554[var3];
            var6 = var1.readUnsignedByteAdd();
            var7 = (var6 >> 4 & 7) + class283.field3165;
            var8 = (var6 & 7) + class149.field1677;
            var9 = var1.readUnsignedShort();
            if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) {
               if (var5 == 0) {
                  BoundaryObject var35 = class1.scene.method4408(TaskHandler.Client_plane, var7, var8);
                  if (var35 != null) {
                     var11 = class279.Entity_unpackID(var35.tag);
                     if (var3 == 2) {
                        var35.renderable1 = new DynamicObject(var11, 2, var4 + 4, TaskHandler.Client_plane, var7, var8, var9, false, var35.renderable1);
                        var35.renderable2 = new DynamicObject(var11, 2, var4 + 1 & 3, TaskHandler.Client_plane, var7, var8, var9, false, var35.renderable2);
                     } else {
                        var35.renderable1 = new DynamicObject(var11, var3, var4, TaskHandler.Client_plane, var7, var8, var9, false, var35.renderable1);
                     }

                     return;
                  }
               }

               if (var5 == 1) {
                  WallDecoration var43 = class1.scene.method4409(TaskHandler.Client_plane, var7, var8);
                  if (var43 != null) {
                     var11 = class279.Entity_unpackID(var43.tag);
                     if (var3 != 4 && var3 != 5) {
                        if (var3 == 6) {
                           var43.renderable1 = new DynamicObject(var11, 4, var4 + 4, TaskHandler.Client_plane, var7, var8, var9, false, var43.renderable1);
                        } else if (var3 == 7) {
                           var43.renderable1 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, TaskHandler.Client_plane, var7, var8, var9, false, var43.renderable1);
                        } else if (var3 == 8) {
                           var43.renderable1 = new DynamicObject(var11, 4, var4 + 4, TaskHandler.Client_plane, var7, var8, var9, false, var43.renderable1);
                           var43.renderable2 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, TaskHandler.Client_plane, var7, var8, var9, false, var43.renderable2);
                        }
                     } else {
                        var43.renderable1 = new DynamicObject(var11, 4, var4, TaskHandler.Client_plane, var7, var8, var9, false, var43.renderable1);
                     }

                     return;
                  }
               }

               if (var5 == 2) {
                  GameObject var44 = class1.scene.getGameObject(TaskHandler.Client_plane, var7, var8);
                  if (var3 == 11) {
                     var3 = 10;
                  }

                  if (var44 != null) {
                     var44.renderable = new DynamicObject(class279.Entity_unpackID(var44.tag), var3, var4, TaskHandler.Client_plane, var7, var8, var9, false, var44.renderable);
                     return;
                  }
               }

               if (var5 == 3) {
                  FloorDecoration var45 = class1.scene.getFloorDecoration(TaskHandler.Client_plane, var7, var8);
                  if (var45 != null) {
                     var45.renderable = new DynamicObject(class279.Entity_unpackID(var45.tag), 22, var4, TaskHandler.Client_plane, var7, var8, var9, false, var45.renderable);
                     return;
                  }
               }

               class140.method3113(TaskHandler.Client_plane, var7, var8, var5, var9);
            }

         } else if (class283.field3160 == var0) {
            var2 = var1.readUnsignedShortLE();
            var3 = var1.readInt();
            var4 = var1.readUnsignedByteNeg();
            var5 = (var4 >> 4 & 7) + class283.field3165;
            var6 = (var4 & 7) + class149.field1677;
            var7 = var1.readInt();
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
               NodeDeque var42 = Client.groundItems[TaskHandler.Client_plane][var5][var6];
               if (var42 != null) {
                  for(TileItem var34 = (TileItem)var42.last(); var34 != null; var34 = (TileItem)var42.previous()) {
                     if ((var2 & 32767) == var34.id && var7 == var34.quantity) {
                        var34.quantity = var3;
                        break;
                     }
                  }

                  class148.updateItemPile(var5, var6);
               }
            }

         } else if (class283.field3155 == var0) {
            var2 = var1.readUnsignedShort();
            var3 = var1.readUnsignedIntLE();
            var4 = var1.readUnsignedByte();
            var5 = (var4 >> 4 & 7) + class283.field3165;
            var6 = (var4 & 7) + class149.field1677;
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
               var33 = Client.groundItems[TaskHandler.Client_plane][var5][var6];
               if (var33 != null) {
                  for(var41 = (TileItem)var33.last(); var41 != null; var41 = (TileItem)var33.previous()) {
                     if ((var2 & 32767) == var41.id && var3 == var41.quantity) {
                        var41.remove();
                        break;
                     }
                  }

                  if (var33.last() == null) {
                     Client.groundItems[TaskHandler.Client_plane][var5][var6] = null;
                  }

                  class148.updateItemPile(var5, var6);
               }
            }

         } else if (class283.field3157 == var0) {
            var2 = var1.readUnsignedByteSub();
            var3 = var1.readUnsignedShortAdd();
            var4 = var1.readUnsignedByteSub();
            var5 = var4 >> 2;
            var6 = var4 & 3;
            var7 = Client.field554[var5];
            var8 = var1.readUnsignedByte();
            var9 = (var8 >> 4 & 7) + class283.field3165;
            var10 = (var8 & 7) + class149.field1677;
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
               Decimator.method1124(TaskHandler.Client_plane, var9, var10, var7, var3, var5, var6, var2, 0, -1);
            }

         } else if (class283.field3156 == var0) {
            var1.readUnsignedShortAddLE();
            var2 = var1.readUnsignedByteNeg();
            var3 = var1.readUnsignedShortAddLE();
            var1.readUnsignedByteSub();
            var1.readUnsignedShort();
            var4 = var1.readUnsignedIntLE();
            var1.readUnsignedByteSub();
            var5 = var1.readUnsignedByteNeg();
            var6 = (var5 >> 4 & 7) + class283.field3165;
            var7 = (var5 & 7) + class149.field1677;
            if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
               var41 = new TileItem();
               var41.id = var3;
               var41.quantity = var4;
               var41.method2649(var2);
               if (Client.groundItems[TaskHandler.Client_plane][var6][var7] == null) {
                  Client.groundItems[TaskHandler.Client_plane][var6][var7] = new NodeDeque();
               }

               Client.groundItems[TaskHandler.Client_plane][var6][var7].addFirst(var41);
               class148.updateItemPile(var6, var7);
            }

         } else if (class283.field3164 == var0) {
            var2 = var1.readUnsignedShortLE();
            var3 = var1.readUnsignedByteAdd();
            var4 = (var3 >> 4 & 7) + class283.field3165;
            var5 = (var3 & 7) + class149.field1677;
            var6 = var1.readUnsignedShortAdd();
            var7 = var1.readUnsignedByte();
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
               var4 = var4 * 128 + 64;
               var5 = var5 * 128 + 64;
               GraphicsObject var32 = new GraphicsObject(var6, TaskHandler.Client_plane, var4, var5, WorldMapDecorationType.getTileHeight(var4, var5, TaskHandler.Client_plane) - var7, var2, Client.cycle);
               Client.graphicsObjects.addFirst(var32);
            }

         } else {
            int var12;
            int var13;
            int var14;
            if (class283.field3162 == var0) {
               var2 = var1.method8678();
               byte var37 = var1.readByteNeg();
               var4 = var1.readUnsignedByteSub() * 4;
               byte var38 = var1.readByte();
               var6 = var1.readUnsignedShortLE();
               var7 = var1.readUnsignedByte();
               var8 = var1.readUnsignedShortLE();
               var9 = var1.readUnsignedByte() * 4;
               var10 = var1.readUnsignedByteAdd();
               var11 = var1.readUnsignedByteAdd();
               var12 = (var11 >> 4 & 7) + class283.field3165;
               var13 = (var11 & 7) + class149.field1677;
               var14 = var1.readUnsignedShortAddLE();
               var5 = var38 + var12;
               var3 = var37 + var13;
               if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104 && var5 >= 0 && var3 >= 0 && var5 < 104 && var3 < 104 && var8 != 65535) {
                  var12 = var12 * 128 + 64;
                  var13 = var13 * 128 + 64;
                  var5 = var5 * 128 + 64;
                  var3 = var3 * 128 + 64;
                  Projectile var31 = new Projectile(var8, TaskHandler.Client_plane, var12, var13, WorldMapDecorationType.getTileHeight(var12, var13, TaskHandler.Client_plane) - var4, var14 + Client.cycle, var6 + Client.cycle, var10, var7, var2, var9);
                  var31.setDestination(var5, var3, WorldMapDecorationType.getTileHeight(var5, var3, TaskHandler.Client_plane) - var9, var14 + Client.cycle);
                  Client.projectiles.addFirst(var31);
               }

            } else if (class283.field3163 == var0) {
               var2 = var1.readUnsignedByte();
               var3 = var2 >> 2;
               var4 = var2 & 3;
               var5 = Client.field554[var3];
               var6 = var1.readUnsignedByte();
               var7 = (var6 >> 4 & 7) + class283.field3165;
               var8 = (var6 & 7) + class149.field1677;
               if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                  Decimator.method1124(TaskHandler.Client_plane, var7, var8, var5, -1, var3, var4, 31, 0, -1);
               }

            } else {
               if (class283.field3161 == var0) {
                  byte var36 = var1.readByteNeg();
                  var3 = var1.readUnsignedByteAdd();
                  var4 = (var3 >> 4 & 7) + class283.field3165;
                  var5 = (var3 & 7) + class149.field1677;
                  var6 = var1.readUnsignedShortAdd();
                  byte var39 = var1.readByteAdd();
                  var8 = var1.readUnsignedShortLE();
                  byte var40 = var1.readByteSub();
                  var10 = var1.readUnsignedShort();
                  var11 = var1.readUnsignedByteAdd();
                  var12 = var11 >> 2;
                  var13 = var11 & 3;
                  var14 = Client.field554[var12];
                  int var15 = var1.readUnsignedShort();
                  byte var16 = var1.readByteSub();
                  Player var17;
                  if (var6 == Client.localPlayerIndex) {
                     var17 = BuddyRankComparator.localPlayer;
                  } else {
                     var17 = Client.players[var6];
                  }

                  if (var17 != null) {
                     ObjectComposition var18 = WallDecoration.getObjectDefinition(var8);
                     int var19;
                     int var20;
                     if (var13 != 1 && var13 != 3) {
                        var19 = var18.sizeX;
                        var20 = var18.sizeY;
                     } else {
                        var19 = var18.sizeY;
                        var20 = var18.sizeX;
                     }

                     int var21 = var4 + (var19 >> 1);
                     int var22 = var4 + (var19 + 1 >> 1);
                     int var23 = var5 + (var20 >> 1);
                     int var24 = var5 + (var20 + 1 >> 1);
                     int[][] var25 = Tiles.Tiles_heights[TaskHandler.Client_plane];
                     int var26 = var25[var22][var24] + var25[var21][var24] + var25[var21][var23] + var25[var22][var23] >> 2;
                     int var27 = (var4 << 7) + (var19 << 6);
                     int var28 = (var5 << 7) + (var20 << 6);
                     Model var29 = var18.getModel(var12, var13, var25, var27, var26, var28);
                     if (var29 != null) {
                        Decimator.method1124(TaskHandler.Client_plane, var4, var5, var14, -1, 0, 0, 31, var15 + 1, var10 + 1);
                        var17.animationCycleStart = var15 + Client.cycle;
                        var17.animationCycleEnd = var10 + Client.cycle;
                        var17.model0 = var29;
                        var17.field1095 = var4 * 128 + var19 * 64;
                        var17.field1097 = var5 * 128 + var20 * 64;
                        var17.tileHeight2 = var26;
                        byte var30;
                        if (var16 > var40) {
                           var30 = var16;
                           var16 = var40;
                           var40 = var30;
                        }

                        if (var39 > var36) {
                           var30 = var39;
                           var39 = var36;
                           var36 = var30;
                        }

                        var17.minX = var16 + var4;
                        var17.maxX = var40 + var4;
                        var17.minY = var39 + var5;
                        var17.maxY = var36 + var5;
                     }
                  }
               }

            }
         }
      }
   }

   @ObfuscatedName("lb")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1445723028"
   )
   static boolean method3190(int var0) {
      for(int var1 = 0; var1 < Client.field714; ++var1) {
         if (Client.field716[var1] == var0) {
            return true;
         }
      }

      return false;
   }
}
