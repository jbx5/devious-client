import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ik")
public class class213 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lik;"
   )
   static final class213 field2377 = new class213(5, 8, 8);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lik;"
   )
   static final class213 field2376 = new class213(1, 16, 16);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lik;"
   )
   public static final class213 field2367 = new class213(6, 32, 32);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lik;"
   )
   static final class213 field2370 = new class213(0, 48, 48);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lik;"
   )
   static final class213 field2371 = new class213(4, 64, 64);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lik;"
   )
   static final class213 field2372 = new class213(3, 96, 96);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lik;"
   )
   static final class213 field2373 = new class213(2, 128, 128);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "[Lik;"
   )
   static final class213[] field2368 = class126.method2956();
   @ObfuscatedName("iu")
   @ObfuscatedGetter(
      intValue = 263986803
   )
   @Export("baseX")
   static int baseX;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1423619973
   )
   final int field2374;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1861818857
   )
   public final int field2375;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 420608925
   )
   public final int field2369;

   static {
      Arrays.sort(field2368, new class218());
   }

   class213(int var1, int var2, int var3) {
      this.field2374 = var1;
      this.field2375 = var2;
      this.field2369 = var3;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-893955126"
   )
   int method4207() {
      return this.field2375 * this.field2369;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;B)I",
      garbageValue = "-80"
   )
   @Export("hashString")
   public static int hashString(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + WorldMapArea.charToByteCp1252(var0.charAt(var3));
      }

      return var2;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZI)I",
      garbageValue = "-1090149153"
   )
   static int method4210(int var0, Script var1, boolean var2) {
      Widget var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
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

   @ObfuscatedName("jg")
   @ObfuscatedSignature(
      descriptor = "(Llj;I)V",
      garbageValue = "1609784587"
   )
   static final void method4211(class294 var0) {
      PacketBuffer var1 = Client.packetWriter.packetBuffer;
      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      if (class294.field3207 == var0) {
         var2 = var1.readUnsignedByteNeg();
         var3 = (var2 >> 4 & 7) + WorldMapIcon_0.field2950;
         var4 = (var2 & 7) + Archive.field4231;
         var5 = var1.readUnsignedByteSub();
         var6 = var5 >> 4 & 15;
         var7 = var5 & 7;
         var8 = var1.readUnsignedShortLE();
         var9 = var1.readUnsignedByteAdd();
         if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
            var10 = var6 + 1;
            if (Projectile.localPlayer.pathX[0] >= var3 - var10 && Projectile.localPlayer.pathX[0] <= var3 + var10 && Projectile.localPlayer.pathY[0] >= var4 - var10 && Projectile.localPlayer.pathY[0] <= var10 + var4 && class10.clientPreferences.method2450() != 0 && var7 > 0 && Client.soundEffectCount < 50) {
               Client.soundEffectIds[Client.soundEffectCount] = var8;
               Client.queuedSoundEffectLoops[Client.soundEffectCount] = var7;
               Client.queuedSoundEffectDelays[Client.soundEffectCount] = var9;
               Client.soundEffects[Client.soundEffectCount] = null;
               Client.soundLocations[Client.soundEffectCount] = var6 + (var4 << 8) + (var3 << 16);
               ++Client.soundEffectCount;
            }
         }
      }

      int var11;
      int var12;
      int var13;
      int var14;
      byte var36;
      if (class294.field3201 == var0) {
         var2 = var1.readUnsignedShortAddLE();
         var36 = var1.readByteAdd();
         byte var38 = var1.readByte();
         byte var39 = var1.readByteAdd();
         var6 = var1.readUnsignedShortAdd();
         var7 = var1.readUnsignedByteSub();
         var8 = var7 >> 2;
         var9 = var7 & 3;
         var10 = Client.field570[var8];
         var11 = var1.readUnsignedShortLE();
         var12 = var1.readByteNeg();
         var13 = var1.readUnsignedByteSub();
         var14 = (var13 >> 4 & 7) + WorldMapIcon_0.field2950;
         int var15 = (var13 & 7) + Archive.field4231;
         int var16 = var1.readUnsignedShort();
         Player var17;
         if (var16 == Client.localPlayerIndex) {
            var17 = Projectile.localPlayer;
         } else {
            var17 = Client.players[var16];
         }

         if (var17 != null) {
            ObjectComposition var18 = class175.getObjectDefinition(var6);
            int var19;
            int var20;
            if (var9 != 1 && var9 != 3) {
               var19 = var18.sizeX;
               var20 = var18.sizeY;
            } else {
               var19 = var18.sizeY;
               var20 = var18.sizeX;
            }

            int var21 = var14 + (var19 >> 1);
            int var22 = var14 + (var19 + 1 >> 1);
            int var23 = var15 + (var20 >> 1);
            int var24 = var15 + (var20 + 1 >> 1);
            int[][] var25 = Tiles.Tiles_heights[Clock.Client_plane];
            int var26 = var25[var22][var24] + var25[var22][var23] + var25[var21][var23] + var25[var21][var24] >> 2;
            int var27 = (var14 << 7) + (var19 << 6);
            int var28 = (var15 << 7) + (var20 << 6);
            Model var29 = var18.getModel(var8, var9, var25, var27, var26, var28);
            if (var29 != null) {
               BoundaryObject.method5026(Clock.Client_plane, var14, var15, var10, -1, 0, 0, 31, var2 + 1, var11 + 1);
               var17.animationCycleStart = var2 + Client.cycle;
               var17.animationCycleEnd = var11 + Client.cycle;
               var17.model0 = var29;
               var17.field1107 = var14 * 128 + var19 * 64;
               var17.field1122 = var15 * 128 + var20 * 64;
               var17.tileHeight2 = var26;
               byte var30;
               if (var39 > var36) {
                  var30 = var39;
                  var39 = var36;
                  var36 = var30;
               }

               if (var38 > var12) {
                  var30 = var38;
                  var38 = (byte)var12;
                  var12 = var30;
               }

               var17.minX = var39 + var14;
               var17.maxX = var14 + var36;
               var17.minY = var15 + var38;
               var17.maxY = var12 + var15;
            }
         }
      }

      if (class294.field3205 == var0) {
         var2 = var1.readUnsignedByteSub();
         var3 = var1.readUnsignedByte();
         var4 = var3 >> 2;
         var5 = var3 & 3;
         var6 = Client.field570[var4];
         var7 = var1.readUnsignedShortAddLE();
         var8 = var1.readUnsignedByte();
         var9 = (var8 >> 4 & 7) + WorldMapIcon_0.field2950;
         var10 = (var8 & 7) + Archive.field4231;
         if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
            BoundaryObject.method5026(Clock.Client_plane, var9, var10, var6, var7, var4, var5, var2, 0, -1);
         }

      } else if (class294.field3203 == var0) {
         var2 = var1.readUnsignedShortAdd();
         var3 = var1.readUnsignedByteNeg();
         var4 = (var3 >> 4 & 7) + WorldMapIcon_0.field2950;
         var5 = (var3 & 7) + Archive.field4231;
         var6 = var1.readUnsignedByteAdd();
         var7 = var6 >> 2;
         var8 = var6 & 3;
         var9 = Client.field570[var7];
         if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) {
            if (var9 == 0) {
               BoundaryObject var35 = class36.scene.method4534(Clock.Client_plane, var4, var5);
               if (var35 != null) {
                  var11 = class215.Entity_unpackID(var35.tag);
                  if (var7 == 2) {
                     var35.renderable1 = new DynamicObject(var11, 2, var8 + 4, Clock.Client_plane, var4, var5, var2, false, var35.renderable1);
                     var35.renderable2 = new DynamicObject(var11, 2, var8 + 1 & 3, Clock.Client_plane, var4, var5, var2, false, var35.renderable2);
                  } else {
                     var35.renderable1 = new DynamicObject(var11, var7, var8, Clock.Client_plane, var4, var5, var2, false, var35.renderable1);
                  }

                  return;
               }
            }

            if (var9 == 1) {
               WallDecoration var42 = class36.scene.method4535(Clock.Client_plane, var4, var5);
               if (var42 != null) {
                  var11 = class215.Entity_unpackID(var42.tag);
                  if (var7 != 4 && var7 != 5) {
                     if (var7 == 6) {
                        var42.renderable1 = new DynamicObject(var11, 4, var8 + 4, Clock.Client_plane, var4, var5, var2, false, var42.renderable1);
                     } else if (var7 == 7) {
                        var42.renderable1 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, Clock.Client_plane, var4, var5, var2, false, var42.renderable1);
                     } else if (var7 == 8) {
                        var42.renderable1 = new DynamicObject(var11, 4, var8 + 4, Clock.Client_plane, var4, var5, var2, false, var42.renderable1);
                        var42.renderable2 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, Clock.Client_plane, var4, var5, var2, false, var42.renderable2);
                     }
                  } else {
                     var42.renderable1 = new DynamicObject(var11, 4, var8, Clock.Client_plane, var4, var5, var2, false, var42.renderable1);
                  }

                  return;
               }
            }

            if (var9 == 2) {
               GameObject var43 = class36.scene.getGameObject(Clock.Client_plane, var4, var5);
               if (var7 == 11) {
                  var7 = 10;
               }

               if (var43 != null) {
                  var43.renderable = new DynamicObject(class215.Entity_unpackID(var43.tag), var7, var8, Clock.Client_plane, var4, var5, var2, false, var43.renderable);
                  return;
               }
            }

            if (var9 == 3) {
               FloorDecoration var44 = class36.scene.getFloorDecoration(Clock.Client_plane, var4, var5);
               if (var44 != null) {
                  var44.renderable = new DynamicObject(class215.Entity_unpackID(var44.tag), 22, var8, Clock.Client_plane, var4, var5, var2, false, var44.renderable);
                  return;
               }
            }

            Message.method1172(Clock.Client_plane, var4, var5, var9, var2);
         }

      } else if (class294.field3202 == var0) {
         var2 = var1.readUnsignedByte();
         var3 = (var2 >> 4 & 7) + WorldMapIcon_0.field2950;
         var4 = (var2 & 7) + Archive.field4231;
         var5 = var1.readUnsignedByteAdd();
         var6 = var5 >> 2;
         var7 = var5 & 3;
         var8 = Client.field570[var6];
         if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
            BoundaryObject.method5026(Clock.Client_plane, var3, var4, var8, -1, var6, var7, 31, 0, -1);
         }

      } else {
         NodeDeque var34;
         TileItem var40;
         if (class294.field3206 == var0) {
            var2 = var1.readUnsignedShort();
            var3 = var1.readUnsignedByteSub();
            var4 = var1.readUnsignedByteAdd();
            var5 = (var4 >> 4 & 7) + WorldMapIcon_0.field2950;
            var6 = (var4 & 7) + Archive.field4231;
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
               var34 = Client.groundItems[Clock.Client_plane][var5][var6];
               if (var34 != null) {
                  for(var40 = (TileItem)var34.last(); var40 != null; var40 = (TileItem)var34.previous()) {
                     if ((var2 & 32767) == var40.id) {
                        var40.method2651(var3);
                        break;
                     }
                  }
               }
            }

         } else if (class294.field3208 == var0) {
            var2 = var1.readInt();
            var3 = var1.readUnsignedByte();
            var4 = (var3 >> 4 & 7) + WorldMapIcon_0.field2950;
            var5 = (var3 & 7) + Archive.field4231;
            var6 = var1.readUnsignedShortLE();
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
               var34 = Client.groundItems[Clock.Client_plane][var4][var5];
               if (var34 != null) {
                  for(var40 = (TileItem)var34.last(); var40 != null; var40 = (TileItem)var34.previous()) {
                     if ((var6 & 32767) == var40.id && var2 == var40.quantity) {
                        var40.remove();
                        break;
                     }
                  }

                  if (var34.last() == null) {
                     Client.groundItems[Clock.Client_plane][var4][var5] = null;
                  }

                  class128.updateItemPile(var4, var5);
               }
            }

         } else if (class294.field3198 == var0) {
            byte var37 = var1.readByte();
            var36 = var1.readByteNeg();
            var4 = var1.readUnsignedByteNeg();
            var5 = var1.readUnsignedByte() * 4;
            var6 = var1.readUnsignedShortAdd();
            var7 = var1.readUnsignedByteSub() * 4;
            var8 = var1.readUnsignedShortAdd();
            var9 = var1.method8959();
            var10 = var1.readUnsignedByteSub();
            var11 = (var10 >> 4 & 7) + WorldMapIcon_0.field2950;
            var12 = (var10 & 7) + Archive.field4231;
            var13 = var1.readUnsignedShortAddLE();
            var14 = var1.readUnsignedByteSub();
            var2 = var37 + var11;
            var3 = var36 + var12;
            if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104 && var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104 && var6 != 65535) {
               var11 = var11 * 128 + 64;
               var12 = var12 * 128 + 64;
               var2 = var2 * 128 + 64;
               var3 = var3 * 128 + 64;
               Projectile var33 = new Projectile(var6, Clock.Client_plane, var11, var12, Renderable.getTileHeight(var11, var12, Clock.Client_plane) - var5, var13 + Client.cycle, var8 + Client.cycle, var14, var4, var9, var7);
               var33.setDestination(var2, var3, Renderable.getTileHeight(var2, var3, Clock.Client_plane) - var7, var13 + Client.cycle);
               Client.projectiles.addFirst(var33);
            }

         } else if (class294.field3199 != var0) {
            if (class294.field3200 == var0) {
               var2 = var1.readUnsignedByte();
               var3 = (var2 >> 4 & 7) + WorldMapIcon_0.field2950;
               var4 = (var2 & 7) + Archive.field4231;
               var5 = var1.readUnsignedShortLE();
               var6 = var1.readUnsignedByteSub();
               var7 = var1.readUnsignedShort();
               if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                  var3 = var3 * 128 + 64;
                  var4 = var4 * 128 + 64;
                  GraphicsObject var41 = new GraphicsObject(var7, Clock.Client_plane, var3, var4, Renderable.getTileHeight(var3, var4, Clock.Client_plane) - var6, var5, Client.cycle);
                  Client.graphicsObjects.addFirst(var41);
               }

            } else if (class294.field3204 == var0) {
               var2 = var1.readUnsignedByteNeg();
               var3 = (var2 >> 4 & 7) + WorldMapIcon_0.field2950;
               var4 = (var2 & 7) + Archive.field4231;
               var1.readUnsignedByteNeg();
               var5 = var1.readUnsignedIntIME();
               var1.readUnsignedShortLE();
               var6 = var1.readUnsignedShortAddLE();
               var1.readUnsignedByteAdd();
               var1.readUnsignedShortLE();
               var7 = var1.readUnsignedByte();
               if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                  var40 = new TileItem();
                  var40.id = var6;
                  var40.quantity = var5;
                  var40.method2651(var7);
                  if (Client.groundItems[Clock.Client_plane][var3][var4] == null) {
                     Client.groundItems[Clock.Client_plane][var3][var4] = new NodeDeque();
                  }

                  Client.groundItems[Clock.Client_plane][var3][var4].addFirst(var40);
                  class128.updateItemPile(var3, var4);
               }

            }
         } else {
            var2 = var1.readUnsignedByteAdd();
            var3 = (var2 >> 4 & 7) + WorldMapIcon_0.field2950;
            var4 = (var2 & 7) + Archive.field4231;
            var5 = var1.readUnsignedIntIME();
            var6 = var1.readUnsignedShortLE();
            var7 = var1.readInt();
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
               NodeDeque var31 = Client.groundItems[Clock.Client_plane][var3][var4];
               if (var31 != null) {
                  for(TileItem var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) {
                     if ((var6 & 32767) == var32.id && var5 == var32.quantity) {
                        var32.quantity = var7;
                        break;
                     }
                  }

                  class128.updateItemPile(var3, var4);
               }
            }

         }
      }
   }

   @ObfuscatedName("lz")
   @ObfuscatedSignature(
      descriptor = "([Lmb;II)V",
      garbageValue = "-913429608"
   )
   @Export("drawModelComponents")
   static final void drawModelComponents(Widget[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         Widget var3 = var0[var2];
         if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !UserComparator9.isComponentHidden(var3))) {
            int var5;
            if (var3.type == 0) {
               if (!var3.isIf3 && UserComparator9.isComponentHidden(var3) && var3 != ClanChannel.mousedOverWidgetIf1) {
                  continue;
               }

               drawModelComponents(var0, var3.id);
               if (var3.children != null) {
                  drawModelComponents(var3.children, var3.id);
               }

               InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
               if (var4 != null) {
                  var5 = var4.group;
                  if (Client.loadInterface(var5)) {
                     drawModelComponents(class16.Widget_interfaceComponents[var5], -1);
                  }
               }
            }

            if (var3.type == 6) {
               if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
                  boolean var8 = ItemComposition.runCs1(var3);
                  if (var8) {
                     var5 = var3.sequenceId2;
                  } else {
                     var5 = var3.sequenceId;
                  }

                  if (var5 != -1) {
                     SequenceDefinition var6 = WorldMapLabelSize.SequenceDefinition_get(var5);
                     if (!var6.isCachedModelIdSet()) {
                        for(var3.modelFrameCycle += Client.graphicsCycle; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; Messages.invalidateWidget(var3)) {
                           var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame];
                           ++var3.modelFrame;
                           if (var3.modelFrame >= var6.frameIds.length) {
                              var3.modelFrame -= var6.frameCount;
                              if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) {
                                 var3.modelFrame = 0;
                              }
                           }
                        }
                     } else {
                        var3.modelFrame += Client.graphicsCycle;
                        int var7 = var6.method4084();
                        if (var3.modelFrame >= var7) {
                           var3.modelFrame -= var6.frameCount;
                           if (var3.modelFrame < 0 || var3.modelFrame >= var7) {
                              var3.modelFrame = 0;
                           }
                        }

                        Messages.invalidateWidget(var3);
                     }
                  }
               }

               if (var3.field3659 != 0 && !var3.isIf3) {
                  int var9 = var3.field3659 >> 16;
                  var5 = var3.field3659 << 16 >> 16;
                  var9 *= Client.graphicsCycle;
                  var5 *= Client.graphicsCycle;
                  var3.modelAngleX = var9 + var3.modelAngleX & 2047;
                  var3.modelAngleY = var5 + var3.modelAngleY & 2047;
                  Messages.invalidateWidget(var3);
               }
            }
         }
      }

   }
}
