import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
   @ObfuscatedName("ty")
   @ObfuscatedSignature(
      descriptor = "Lby;"
   )
   @Export("decimator")
   static Decimator decimator;

   DevicePcmPlayerProvider() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)Lax;",
      garbageValue = "999216376"
   )
   @Export("player")
   public PcmPlayer player() {
      return new DevicePcmPlayer();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-98"
   )
   static void method320(int var0) {
      class12.method155(14);
      Login.Login_banType = var0;
   }

   @ObfuscatedName("hi")
   @ObfuscatedSignature(
      descriptor = "(Lkd;IIB)V",
      garbageValue = "1"
   )
   @Export("checkIfMinimapClicked")
   static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
      if (Client.minimapState == 0 || Client.minimapState == 3) {
         if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !SceneTilePaint.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
            SpriteMask var3 = var0.getSpriteMask(true);
            if (var3 == null) {
               return;
            }

            int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
            int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
            if (var3.contains(var4, var5)) {
               var4 -= var3.width / 2;
               var5 -= var3.height / 2;
               int var6 = Client.camAngleY & 2047;
               int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
               int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
               int var9 = var7 * var5 + var4 * var8 >> 11;
               int var10 = var5 * var8 - var4 * var7 >> 11;
               int var11 = var9 + class155.localPlayer.x >> 7;
               int var12 = class155.localPlayer.y - var10 >> 7;
               PacketBufferNode var13 = class136.getPacketBufferNode(ClientPacket.field3097, Client.packetWriter.isaacCipher);
               var13.packetBuffer.writeByte(18);
               var13.packetBuffer.writeByteSub(Client.field747.method4106(82) ? (Client.field747.method4106(81) ? 2 : 1) : 0);
               var13.packetBuffer.writeShortLE(class154.baseX * 64 + var11);
               var13.packetBuffer.writeShortAdd(class365.baseY * 64 + var12);
               var13.packetBuffer.writeByte(var4);
               var13.packetBuffer.writeByte(var5);
               var13.packetBuffer.writeShort(Client.camAngleY);
               var13.packetBuffer.writeByte(57);
               var13.packetBuffer.writeByte(0);
               var13.packetBuffer.writeByte(0);
               var13.packetBuffer.writeByte(89);
               var13.packetBuffer.writeShort(class155.localPlayer.x);
               var13.packetBuffer.writeShort(class155.localPlayer.y);
               var13.packetBuffer.writeByte(63);
               Client.packetWriter.addNode(var13);
               Client.destinationX = var11;
               Client.destinationY = var12;
            }
         }

      }
   }

   @ObfuscatedName("iu")
   @ObfuscatedSignature(
      descriptor = "(ZS)V",
      garbageValue = "226"
   )
   @Export("addNpcsToScene")
   static final void addNpcsToScene(boolean var0) {
      for(int var1 = 0; var1 < Client.npcCount; ++var1) {
         NPC var2 = Client.npcs[Client.npcIndices[var1]];
         if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
            int var3 = var2.x >> 7;
            int var4 = var2.y >> 7;
            if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
               if (var2.field1181 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
                  if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
                     continue;
                  }

                  Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
               }

               long var5 = GameEngine.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
               var2.playerCycle = Client.cycle;
               ReflectionCheck.scene.drawEntity(class383.Client_plane, var2.x, var2.y, SpotAnimationDefinition.getTileHeight(var2.field1181 * 64 - 64 + var2.x, var2.field1181 * 64 - 64 + var2.y, class383.Client_plane), var2.field1181 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
            }
         }
      }

   }

   @ObfuscatedName("ih")
   @ObfuscatedSignature(
      descriptor = "(Ljn;I)V",
      garbageValue = "2022149498"
   )
   static final void method315(class276 var0) {
      PacketBuffer var1 = Client.packetWriter.packetBuffer;
      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      TileItem var32;
      if (class276.field3165 == var0) {
         var2 = var1.readUnsignedByte();
         var3 = var1.readUnsignedShortAdd();
         var4 = var1.readInt();
         var5 = var1.readUnsignedByteAdd();
         var6 = (var5 >> 4 & 7) + InvDefinition.field1918;
         var7 = (var5 & 7) + class125.field1560;
         if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
            var32 = new TileItem();
            var32.id = var3;
            var32.quantity = var4;
            var32.method2612(var2);
            if (Client.groundItems[class383.Client_plane][var6][var7] == null) {
               Client.groundItems[class383.Client_plane][var6][var7] = new NodeDeque();
            }

            Client.groundItems[class383.Client_plane][var6][var7].addFirst(var32);
            class358.updateItemPile(var6, var7);
         }

      } else if (class276.field3159 == var0) {
         var2 = var1.readUnsignedShortAdd();
         var3 = var1.readUnsignedByte();
         var4 = var1.readUnsignedByteNeg();
         var5 = (var4 >> 4 & 7) + InvDefinition.field1918;
         var6 = (var4 & 7) + class125.field1560;
         var7 = var1.readUnsignedShortAdd();
         if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
            var5 = var5 * 128 + 64;
            var6 = var6 * 128 + 64;
            GraphicsObject var42 = new GraphicsObject(var7, class383.Client_plane, var5, var6, SpotAnimationDefinition.getTileHeight(var5, var6, class383.Client_plane) - var3, var2, Client.cycle);
            Client.graphicsObjects.addFirst(var42);
         }

      } else if (class276.field3163 == var0) {
         var2 = var1.readUnsignedByte();
         var3 = (var2 >> 4 & 7) + InvDefinition.field1918;
         var4 = (var2 & 7) + class125.field1560;
         var1.readUnsignedShortAddLE();
         var5 = var1.readUnsignedByteSub();
         var1.readUnsignedShortLE();
         var6 = var1.readInt();
         var1.readUnsignedByteNeg();
         var1.readUnsignedByteNeg();
         var7 = var1.readUnsignedShort();
         if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
            var32 = new TileItem();
            var32.id = var7;
            var32.quantity = var6;
            var32.method2612(var5);
            if (Client.groundItems[class383.Client_plane][var3][var4] == null) {
               Client.groundItems[class383.Client_plane][var3][var4] = new NodeDeque();
            }

            Client.groundItems[class383.Client_plane][var3][var4].addFirst(var32);
            class358.updateItemPile(var3, var4);
         }

      } else {
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         Projectile var36;
         if (class276.field3171 == var0) {
            var2 = var1.readUnsignedByteSub() * 4;
            var3 = var1.readUnsignedByte();
            var4 = (var3 >> 4 & 7) + InvDefinition.field1918;
            var5 = (var3 & 7) + class125.field1560;
            var6 = var1.readUnsignedShortAdd();
            var7 = var1.readUnsignedShortAdd();
            var8 = var1.readUnsignedByteAdd() * 4;
            var9 = var1.readUnsignedByteSub();
            var10 = var1.readUnsignedByte();
            var11 = var1.readShort();
            var12 = var1.readUnsignedShortAdd();
            byte var38 = var1.readByteSub();
            byte var39 = var1.readByte();
            var13 = var38 + var4;
            var14 = var39 + var5;
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104 && var12 != 65535) {
               var4 = var4 * 128 + 64;
               var5 = var5 * 128 + 64;
               var13 = var13 * 128 + 64;
               var14 = var14 * 128 + 64;
               var36 = new Projectile(var12, class383.Client_plane, var4, var5, SpotAnimationDefinition.getTileHeight(var4, var5, class383.Client_plane) - var8, var6 + Client.cycle, var7 + Client.cycle, var10, var9, var11, var2);
               var36.setDestination(var13, var14, SpotAnimationDefinition.getTileHeight(var13, var14, class383.Client_plane) - var2, var6 + Client.cycle);
               Client.projectiles.addFirst(var36);
            }

         } else if (class276.field3157 == var0) {
            var2 = var1.readUnsignedByteNeg();
            var3 = var2 >> 2;
            var4 = var2 & 3;
            var5 = Client.field579[var3];
            var6 = var1.readUnsignedByteNeg();
            var7 = (var6 >> 4 & 7) + InvDefinition.field1918;
            var8 = (var6 & 7) + class125.field1560;
            var9 = var1.readUnsignedByteNeg();
            var10 = var1.readUnsignedShortLE();
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
               class11.method105(class383.Client_plane, var7, var8, var5, var10, var3, var4, var9, 0, -1);
            }

         } else {
            NodeDeque var31;
            if (class276.field3169 == var0) {
               var2 = var1.readUnsignedByteAdd();
               var3 = (var2 >> 4 & 7) + InvDefinition.field1918;
               var4 = (var2 & 7) + class125.field1560;
               var5 = var1.readUnsignedShort();
               var6 = var1.readUnsignedIntIME();
               if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                  var31 = Client.groundItems[class383.Client_plane][var3][var4];
                  if (var31 != null) {
                     for(var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) {
                        if ((var5 & 32767) == var32.id && var6 == var32.quantity) {
                           var32.remove();
                           break;
                        }
                     }

                     if (var31.last() == null) {
                        Client.groundItems[class383.Client_plane][var3][var4] = null;
                     }

                     class358.updateItemPile(var3, var4);
                  }
               }

            } else if (class276.field3166 == var0) {
               var2 = var1.readUnsignedByteAdd();
               var3 = var2 >> 2;
               var4 = var2 & 3;
               var5 = Client.field579[var3];
               var6 = var1.readUnsignedByteAdd();
               var7 = (var6 >> 4 & 7) + InvDefinition.field1918;
               var8 = (var6 & 7) + class125.field1560;
               if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                  class11.method105(class383.Client_plane, var7, var8, var5, -1, var3, var4, 31, 0, -1);
               }

            } else {
               if (class276.field3158 == var0) {
                  var2 = var1.readUnsignedByte();
                  var3 = var1.readUnsignedShortAddLE();
                  var4 = var1.readUnsignedByteNeg();
                  var5 = (var4 >> 4 & 7) + InvDefinition.field1918;
                  var6 = (var4 & 7) + class125.field1560;
                  var7 = var1.readUnsignedByteAdd();
                  var8 = var7 >> 4 & 15;
                  var9 = var7 & 7;
                  if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                     var10 = var8 + 1;
                     if (class155.localPlayer.pathX[0] >= var5 - var10 && class155.localPlayer.pathX[0] <= var5 + var10 && class155.localPlayer.pathY[0] >= var6 - var10 && class155.localPlayer.pathY[0] <= var10 + var6 && StructComposition.clientPreferences.method2506() != 0 && var9 > 0 && Client.soundEffectCount < 50) {
                        Client.soundEffectIds[Client.soundEffectCount] = var3;
                        Client.queuedSoundEffectLoops[Client.soundEffectCount] = var9;
                        Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
                        Client.soundEffects[Client.soundEffectCount] = null;
                        Client.soundLocations[Client.soundEffectCount] = var8 + (var6 << 8) + (var5 << 16);
                        ++Client.soundEffectCount;
                     }
                  }
               }

               if (class276.field3164 == var0) {
                  var2 = var1.readUnsignedByteNeg();
                  var3 = var1.readUnsignedShortLE();
                  var4 = var1.readUnsignedShortAdd();
                  var5 = var1.readUnsignedByte() * 4;
                  var6 = var1.readUnsignedByteNeg();
                  var7 = (var6 >> 4 & 7) + InvDefinition.field1918;
                  var8 = (var6 & 7) + class125.field1560;
                  var9 = var1.readUnsignedByte() * 4;
                  var10 = var1.readUnsignedShortLE();
                  var11 = var1.readUnsignedByteNeg();
                  byte var37 = var1.readByteSub();
                  var13 = var1.readByteNeg();
                  var14 = var1.method8549();
                  var13 += var7;
                  var12 = var37 + var8;
                  if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var13 >= 0 && var12 >= 0 && var13 < 104 && var12 < 104 && var4 != 65535) {
                     var7 = var7 * 128 + 64;
                     var8 = var8 * 128 + 64;
                     var13 = var13 * 128 + 64;
                     var12 = var12 * 128 + 64;
                     var36 = new Projectile(var4, class383.Client_plane, var7, var8, SpotAnimationDefinition.getTileHeight(var7, var8, class383.Client_plane) - var5, var10 + Client.cycle, var3 + Client.cycle, var2, var11, var14, var9);
                     var36.setDestination(var13, var12, SpotAnimationDefinition.getTileHeight(var13, var12, class383.Client_plane) - var9, var10 + Client.cycle);
                     Client.projectiles.addFirst(var36);
                  }

               } else if (class276.field3168 == var0) {
                  var2 = var1.readUnsignedShortAdd();
                  var3 = var1.readUnsignedShortAddLE();
                  var4 = var1.readUnsignedByteSub();
                  var5 = (var4 >> 4 & 7) + InvDefinition.field1918;
                  var6 = (var4 & 7) + class125.field1560;
                  var7 = var1.readUnsignedShortLE();
                  if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                     NodeDeque var41 = Client.groundItems[class383.Client_plane][var5][var6];
                     if (var41 != null) {
                        for(TileItem var35 = (TileItem)var41.last(); var35 != null; var35 = (TileItem)var41.previous()) {
                           if ((var7 & 32767) == var35.id && var3 == var35.quantity) {
                              var35.quantity = var2;
                              break;
                           }
                        }

                        class358.updateItemPile(var5, var6);
                     }
                  }

               } else {
                  if (class276.field3167 == var0) {
                     var2 = var1.readUnsignedByteAdd();
                     var3 = var2 >> 2;
                     var4 = var2 & 3;
                     var5 = Client.field579[var3];
                     var6 = var1.readUnsignedShortLE();
                     var7 = var1.readUnsignedShortAdd();
                     var8 = var1.readUnsignedByteAdd();
                     var9 = (var8 >> 4 & 7) + InvDefinition.field1918;
                     var10 = (var8 & 7) + class125.field1560;
                     var11 = var1.readByteSub();
                     var12 = var1.readUnsignedShortLE();
                     var13 = var1.readByteSub();
                     var14 = var1.readByte();
                     byte var15 = var1.readByteNeg();
                     int var16 = var1.readUnsignedShortAdd();
                     Player var17;
                     if (var16 == Client.localPlayerIndex) {
                        var17 = class155.localPlayer;
                     } else {
                        var17 = Client.players[var16];
                     }

                     if (var17 != null) {
                        ObjectComposition var18 = VarpDefinition.getObjectDefinition(var7);
                        int var19;
                        int var20;
                        if (var4 != 1 && var4 != 3) {
                           var19 = var18.sizeX;
                           var20 = var18.sizeY;
                        } else {
                           var19 = var18.sizeY;
                           var20 = var18.sizeX;
                        }

                        int var21 = var9 + (var19 >> 1);
                        int var22 = var9 + (var19 + 1 >> 1);
                        int var23 = var10 + (var20 >> 1);
                        int var24 = var10 + (var20 + 1 >> 1);
                        int[][] var25 = Tiles.Tiles_heights[class383.Client_plane];
                        int var26 = var25[var21][var24] + var25[var21][var23] + var25[var22][var23] + var25[var22][var24] >> 2;
                        int var27 = (var9 << 7) + (var19 << 6);
                        int var28 = (var10 << 7) + (var20 << 6);
                        Model var29 = var18.getModel(var3, var4, var25, var27, var26, var28);
                        if (var29 != null) {
                           class11.method105(class383.Client_plane, var9, var10, var5, -1, 0, 0, 31, var6 + 1, var12 + 1);
                           var17.animationCycleStart = var6 + Client.cycle;
                           var17.animationCycleEnd = var12 + Client.cycle;
                           var17.model0 = var29;
                           var17.field1131 = var9 * 128 + var19 * 64;
                           var17.field1137 = var10 * 128 + var20 * 64;
                           var17.tileHeight2 = var26;
                           byte var30;
                           if (var14 > var11) {
                              var30 = (byte)var14;
                              var14 = var11;
                              var11 = var30;
                           }

                           if (var15 > var13) {
                              var30 = var15;
                              var15 = (byte)var13;
                              var13 = var30;
                           }

                           var17.minX = var9 + var14;
                           var17.maxX = var9 + var11;
                           var17.minY = var10 + var15;
                           var17.maxY = var10 + var13;
                        }
                     }
                  }

                  if (class276.field3170 == var0) {
                     var2 = var1.readUnsignedByteNeg();
                     var3 = (var2 >> 4 & 7) + InvDefinition.field1918;
                     var4 = (var2 & 7) + class125.field1560;
                     var5 = var1.readUnsignedShortAddLE();
                     var6 = var1.readUnsignedByteAdd();
                     var7 = var6 >> 2;
                     var8 = var6 & 3;
                     var9 = Client.field579[var7];
                     if (var3 >= 0 && var4 >= 0 && var3 < 103 && var4 < 103) {
                        if (var9 == 0) {
                           BoundaryObject var34 = ReflectionCheck.scene.method4452(class383.Client_plane, var3, var4);
                           if (var34 != null) {
                              var11 = Occluder.Entity_unpackID(var34.tag);
                              if (var7 == 2) {
                                 var34.renderable1 = new DynamicObject(var11, 2, var8 + 4, class383.Client_plane, var3, var4, var5, false, var34.renderable1);
                                 var34.renderable2 = new DynamicObject(var11, 2, var8 + 1 & 3, class383.Client_plane, var3, var4, var5, false, var34.renderable2);
                              } else {
                                 var34.renderable1 = new DynamicObject(var11, var7, var8, class383.Client_plane, var3, var4, var5, false, var34.renderable1);
                              }
                           }
                        }

                        if (var9 == 1) {
                           WallDecoration var43 = ReflectionCheck.scene.method4604(class383.Client_plane, var3, var4);
                           if (var43 != null) {
                              var11 = Occluder.Entity_unpackID(var43.tag);
                              if (var7 != 4 && var7 != 5) {
                                 if (var7 == 6) {
                                    var43.renderable1 = new DynamicObject(var11, 4, var8 + 4, class383.Client_plane, var3, var4, var5, false, var43.renderable1);
                                 } else if (var7 == 7) {
                                    var43.renderable1 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, class383.Client_plane, var3, var4, var5, false, var43.renderable1);
                                 } else if (var7 == 8) {
                                    var43.renderable1 = new DynamicObject(var11, 4, var8 + 4, class383.Client_plane, var3, var4, var5, false, var43.renderable1);
                                    var43.renderable2 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, class383.Client_plane, var3, var4, var5, false, var43.renderable2);
                                 }
                              } else {
                                 var43.renderable1 = new DynamicObject(var11, 4, var8, class383.Client_plane, var3, var4, var5, false, var43.renderable1);
                              }
                           }
                        }

                        if (var9 == 2) {
                           GameObject var44 = ReflectionCheck.scene.getGameObject(class383.Client_plane, var3, var4);
                           if (var7 == 11) {
                              var7 = 10;
                           }

                           if (var44 != null) {
                              var44.renderable = new DynamicObject(Occluder.Entity_unpackID(var44.tag), var7, var8, class383.Client_plane, var3, var4, var5, false, var44.renderable);
                           }
                        }

                        if (var9 == 3) {
                           FloorDecoration var45 = ReflectionCheck.scene.getFloorDecoration(class383.Client_plane, var3, var4);
                           if (var45 != null) {
                              var45.renderable = new DynamicObject(Occluder.Entity_unpackID(var45.tag), 22, var8, class383.Client_plane, var3, var4, var5, false, var45.renderable);
                           }
                        }
                     }

                  } else if (class276.field3160 == var0) {
                     var2 = var1.readUnsignedShortAdd();
                     var1.readUnsignedShort();
                     var3 = var1.readUnsignedByteAdd();
                     var4 = (var3 >> 4 & 7) + InvDefinition.field1918;
                     var5 = (var3 & 7) + class125.field1560;
                     if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                        NodeDeque var33 = Client.groundItems[class383.Client_plane][var4][var5];
                        if (var33 != null) {
                           for(TileItem var40 = (TileItem)var33.last(); var40 != null; var40 = (TileItem)var33.previous()) {
                              if ((var2 & 32767) == var40.id) {
                                 var40.remove();
                                 break;
                              }
                           }

                           if (var33.last() == null) {
                              Client.groundItems[class383.Client_plane][var4][var5] = null;
                           }

                           class358.updateItemPile(var4, var5);
                        }
                     }

                  } else if (class276.field3161 == var0) {
                     var2 = var1.readUnsignedShortAddLE();
                     var3 = var1.readUnsignedByteNeg();
                     var4 = (var3 >> 4 & 7) + InvDefinition.field1918;
                     var5 = (var3 & 7) + class125.field1560;
                     var6 = var1.readUnsignedByteSub();
                     if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                        var31 = Client.groundItems[class383.Client_plane][var4][var5];
                        if (var31 != null) {
                           for(var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) {
                              if ((var2 & 32767) == var32.id) {
                                 var32.method2612(var6);
                                 break;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }
}
