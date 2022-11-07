import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
public class class21 {
   @ObfuscatedName("s")
   public static short[] field114;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1217651977
   )
   final int field112;
   @ObfuscatedName("f")
   final String field111;

   class21(String var1) {
      this.field112 = 400;
      this.field111 = "";
   }

   class21(HttpURLConnection var1) throws IOException {
      this.field112 = var1.getResponseCode();
      var1.getResponseMessage();
      var1.getHeaderFields();
      StringBuilder var2 = new StringBuilder();
      InputStream var3 = this.field112 >= 300 ? var1.getErrorStream() : var1.getInputStream();
      if (var3 != null) {
         InputStreamReader var4 = new InputStreamReader(var3);
         BufferedReader var5 = new BufferedReader(var4);

         String var6;
         while((var6 = var5.readLine()) != null) {
            var2.append(var6);
         }

         var3.close();
      }

      this.field111 = var2.toString();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "95"
   )
   public int method295() {
      return this.field112;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "1566330722"
   )
   public String method296() {
      return this.field111;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "([BIIII[Lgr;I)V",
      garbageValue = "-1820513040"
   )
   static final void method298(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
      int var7;
      int var8;
      for(int var6 = 0; var6 < 4; ++var6) {
         for(var7 = 0; var7 < 64; ++var7) {
            for(var8 = 0; var8 < 64; ++var8) {
               if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) {
                  int[] var10000 = var5[var6].flags[var7 + var1];
                  var10000[var8 + var2] &= -16777217;
               }
            }
         }
      }

      Buffer var10 = new Buffer(var0);

      for(var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < 64; ++var8) {
            for(int var9 = 0; var9 < 64; ++var9) {
               WorldMapRegion.loadTerrain(var10, var7, var8 + var1, var9 + var2, var3, var4, 0);
            }
         }
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Lqk;I)V",
      garbageValue = "-1870756909"
   )
   static final void method297(PacketBuffer var0) {
      for(int var1 = 0; var1 < Players.Players_pendingUpdateCount; ++var1) {
         int var2 = Players.Players_pendingUpdateIndices[var1];
         Player var3 = Client.players[var2];
         int var4 = var0.readUnsignedByte();
         if ((var4 & 4) != 0) {
            var4 += var0.readUnsignedByte() << 8;
         }

         byte var5 = class202.field2287.field2285;
         int var6;
         if ((var4 & 16) != 0) {
            var3.targetIndex = var0.readUnsignedShortAddLE();
            if (Script.isLargePlayerInfo) {
               var3.targetIndex += var0.readUnsignedByteSub() << 16;
               var6 = 16777215;
            } else {
               var6 = 65535;
            }

            if (var6 == var3.targetIndex) {
               var3.targetIndex = -1;
            }
         }

         if ((var4 & 2) != 0) {
            var3.overheadText = var0.readStringCp1252NullTerminated();
            if (var3.overheadText.charAt(0) == '~') {
               var3.overheadText = var3.overheadText.substring(1);
               MouseHandler.addGameMessage(2, var3.username.getName(), var3.overheadText);
            } else if (var3 == class296.localPlayer) {
               MouseHandler.addGameMessage(2, var3.username.getName(), var3.overheadText);
            }

            var3.isAutoChatting = false;
            var3.overheadTextColor = 0;
            var3.overheadTextEffect = 0;
            var3.overheadTextCyclesRemaining = 150;
         }

         if ((var4 & 64) != 0) {
            var6 = var0.readUnsignedByteNeg();
            byte[] var7 = new byte[var6];
            Buffer var8 = new Buffer(var7);
            var0.readBytes(var7, 0, var6);
            Players.field1315[var2] = var8;
            var3.read(var8);
         }

         if ((var4 & 4096) != 0) {
            var5 = var0.readByte();
         }

         int var14;
         if ((var4 & 8) != 0) {
            var6 = var0.readUnsignedShortAdd();
            if (var6 == 65535) {
               var6 = -1;
            }

            var14 = var0.readUnsignedByteAdd();
            FontName.performPlayerAnimation(var3, var6, var14);
         }

         if ((var4 & 2048) != 0) {
            var3.field1197 = Client.cycle + var0.readUnsignedShortLE();
            var3.field1198 = Client.cycle + var0.readUnsignedShortAddLE();
            var3.field1199 = var0.readByte();
            var3.field1200 = var0.readByteAdd();
            var3.field1185 = var0.readByte();
            var3.field1202 = (byte)var0.readUnsignedByteSub();
         }

         if ((var4 & 1) != 0) {
            var3.field1203 = var0.readUnsignedShort();
            if (var3.pathLength == 0) {
               var3.orientation = var3.field1203;
               var3.field1203 = -1;
            }
         }

         if ((var4 & 16384) != 0) {
            var3.field1150 = var0.readByteNeg();
            var3.field1190 = var0.readByteAdd();
            var3.field1189 = var0.readByteAdd();
            var3.field1188 = var0.readByteNeg();
            var3.field1192 = var0.readUnsignedShortAddLE() + Client.cycle;
            var3.field1193 = var0.readUnsignedShortLE() + Client.cycle;
            var3.field1194 = var0.readUnsignedShort();
            if (var3.field1116) {
               var3.field1150 += var3.tileX;
               var3.field1190 += var3.tileY;
               var3.field1189 += var3.tileX;
               var3.field1188 += var3.tileY;
               var3.pathLength = 0;
            } else {
               var3.field1150 += var3.pathX[0];
               var3.field1190 += var3.pathY[0];
               var3.field1189 += var3.pathX[0];
               var3.field1188 += var3.pathY[0];
               var3.pathLength = 1;
            }

            var3.field1211 = 0;
         }

         int var9;
         int var10;
         int var13;
         if ((var4 & 32) != 0) {
            var6 = var0.readUnsignedByteSub();
            int var11;
            int var15;
            int var17;
            if (var6 > 0) {
               for(var14 = 0; var14 < var6; ++var14) {
                  var9 = -1;
                  var10 = -1;
                  var11 = -1;
                  var15 = var0.readUShortSmart();
                  if (var15 == 32767) {
                     var15 = var0.readUShortSmart();
                     var10 = var0.readUShortSmart();
                     var9 = var0.readUShortSmart();
                     var11 = var0.readUShortSmart();
                  } else if (var15 != 32766) {
                     var10 = var0.readUShortSmart();
                  } else {
                     var15 = -1;
                  }

                  var17 = var0.readUShortSmart();
                  var3.addHitSplat(var15, var10, var9, var11, Client.cycle, var17);
               }
            }

            var14 = var0.readUnsignedByteSub();
            if (var14 > 0) {
               for(var15 = 0; var15 < var14; ++var15) {
                  var9 = var0.readUShortSmart();
                  var10 = var0.readUShortSmart();
                  if (var10 != 32767) {
                     var11 = var0.readUShortSmart();
                     var17 = var0.readUnsignedByteSub();
                     var13 = var10 > 0 ? var0.readUnsignedByte() : var17;
                     var3.addHealthBar(var9, Client.cycle, var10, var11, var17, var13);
                  } else {
                     var3.removeHealthBar(var9);
                  }
               }
            }
         }

         if ((var4 & 8192) != 0) {
            var3.spotAnimation = var0.readUnsignedShortAddLE();
            var6 = var0.readUnsignedIntME();
            var3.spotAnimationHeight = var6 >> 16;
            var3.field1186 = (var6 & '\uffff') + Client.cycle;
            var3.spotAnimationFrame = 0;
            var3.spotAnimationFrameCycle = 0;
            if (var3.field1186 > Client.cycle) {
               var3.spotAnimationFrame = -1;
            }

            if (var3.spotAnimation == 65535) {
               var3.spotAnimation = -1;
            }
         }

         if ((var4 & 512) != 0) {
            for(var6 = 0; var6 < 3; ++var6) {
               var3.actions[var6] = var0.readStringCp1252NullTerminated();
            }
         }

         if ((var4 & 128) != 0) {
            var6 = var0.readUnsignedShortAdd();
            PlayerType var18 = (PlayerType)WallDecoration.findEnumerated(class303.PlayerType_values(), var0.readUnsignedByteAdd());
            boolean var20 = var0.readUnsignedByteSub() == 1;
            var9 = var0.readUnsignedByteNeg();
            var10 = var0.offset;
            if (var3.username != null && var3.appearance != null) {
               boolean var19 = false;
               if (var18.isUser && WallDecoration.friendSystem.isIgnored(var3.username)) {
                  var19 = true;
               }

               if (!var19 && Client.field687 == 0 && !var3.isHidden) {
                  Players.field1325.offset = 0;
                  var0.readBytesLE(Players.field1325.array, 0, var9);
                  Players.field1325.offset = 0;
                  String var12 = AbstractFont.escapeBrackets(HealthBarDefinition.method3513(class296.method5721(Players.field1325)));
                  var3.overheadText = var12.trim();
                  var3.overheadTextColor = var6 >> 8;
                  var3.overheadTextEffect = var6 & 255;
                  var3.overheadTextCyclesRemaining = 150;
                  var3.isAutoChatting = var20;
                  var3.field1155 = var3 != class296.localPlayer && var18.isUser && "" != Client.field730 && var12.toLowerCase().indexOf(Client.field730) == -1;
                  if (var18.isPrivileged) {
                     var13 = var20 ? 91 : 1;
                  } else {
                     var13 = var20 ? 90 : 2;
                  }

                  if (var18.modIcon != -1) {
                     MouseHandler.addGameMessage(var13, class268.method5367(var18.modIcon) + var3.username.getName(), var12);
                  } else {
                     MouseHandler.addGameMessage(var13, var3.username.getName(), var12);
                  }
               }
            }

            var0.offset = var10 + var9;
         }

         if ((var4 & 1024) != 0) {
            Players.field1314[var2] = (class202)WallDecoration.findEnumerated(BufferedSink.method7548(), var0.readByteSub());
         }

         if (var3.field1116) {
            if (var5 == 127) {
               var3.resetPath(var3.tileX, var3.tileY);
            } else {
               class202 var16;
               if (var5 != class202.field2287.field2285) {
                  var16 = (class202)WallDecoration.findEnumerated(BufferedSink.method7548(), var5);
               } else {
                  var16 = Players.field1314[var2];
               }

               var3.method2291(var3.tileX, var3.tileY, var16);
            }
         }
      }

   }

   @ObfuscatedName("fn")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2028812630"
   )
   static void updateGameState(int var0) {
      if (var0 != Client.gameState) {
         if (Client.gameState == 30) {
            Client.field734.method3933();
         }

         if (Client.gameState == 0) {
            ClanChannelMember.client.method536();
         }

         if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
            ReflectionCheck.method713(0);
            Client.field525 = 0;
            Client.field526 = 0;
            Client.timer.method7181(var0);
            if (var0 != 20) {
               SoundCache.method874(false);
            }
         }

         if (var0 != 20 && var0 != 40 && Frames.field2528 != null) {
            Frames.field2528.close();
            Frames.field2528 = null;
         }

         if (Client.gameState == 25) {
            Client.field582 = 0;
            Client.field557 = 0;
            Client.field488 = 1;
            Client.field559 = 0;
            Client.field560 = 1;
         }

         if (var0 != 5 && var0 != 10) {
            if (var0 == 20) {
               int var3 = Client.gameState == 11 ? 4 : 0;
               UserList.method7441(WorldMapRegion.archive10, class142.archive8, false, var3);
            } else if (var0 == 11) {
               UserList.method7441(WorldMapRegion.archive10, class142.archive8, false, 4);
            } else if (var0 == 50) {
               MusicPatchNode2.setLoginResponseString("", "Updating date of birth...", "");
               UserList.method7441(WorldMapRegion.archive10, class142.archive8, false, 7);
            } else {
               PlayerType.method6274();
            }
         } else {
            boolean var1 = BufferedSink.clientPreferences.method2472() >= Client.field494;
            int var2 = var1 ? 0 : 12;
            UserList.method7441(WorldMapRegion.archive10, class142.archive8, true, var2);
         }

         Client.gameState = var0;
      }
   }

   @ObfuscatedName("hm")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "1258940689"
   )
   @Export("drawEntities")
   static final void drawEntities(int var0, int var1, int var2, int var3) {
      ++Client.viewportDrawCount;
      if (class296.localPlayer.x >> 7 == Client.destinationX && class296.localPlayer.y >> 7 == Client.destinationY) {
         Client.destinationX = 0;
      }

      Language.method6581();
      if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
         class20.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
      }

      class319.addNpcsToScene(true);
      int var4 = Players.Players_count;
      int[] var5 = Players.Players_indices;

      int var6;
      for(var6 = 0; var6 < var4; ++var6) {
         if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) {
            class20.addPlayerToScene(Client.players[var5[var6]], true);
         }
      }

      class319.addNpcsToScene(false);
      class11.method100();
      NPCComposition.drawGraphicsObjectEntity();
      MouseHandler.setViewportShape(var0, var1, var2, var3, true);
      var0 = Client.viewportOffsetX;
      var1 = Client.viewportOffsetY;
      var2 = Client.viewportWidth;
      var3 = Client.viewportHeight;
      Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
      Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
      var4 = Client.camAngleX;
      if (Client.field590 / 256 > var4) {
         var4 = Client.field590 / 256;
      }

      if (Client.field556[4] && Client.field665[4] + 128 > var4) {
         var4 = Client.field665[4] + 128;
      }

      int var17 = Client.camAngleY & 2047;
      ClientPreferences.method2470(class31.oculusOrbFocalPointX, VarpDefinition.field1869, PendingSpawn.oculusOrbFocalPointY, var4, var17, StructComposition.method3661(var4), var3);
      if (!Client.isCameraLocked) {
         var6 = NetFileRequest.method6341();
      } else {
         var6 = ModelData0.method4641();
      }

      int var7 = TextureProvider.cameraX;
      int var8 = class31.cameraY;
      int var9 = class313.cameraZ;
      int var10 = class408.cameraPitch;
      int var11 = WorldMapSection1.cameraYaw;

      int var12;
      int var13;
      for(var12 = 0; var12 < 5; ++var12) {
         if (Client.field556[var12]) {
            var13 = (int)(Math.random() * (double)(Client.field760[var12] * 2 + 1) - (double)Client.field760[var12] + Math.sin((double)Client.field762[var12] / 100.0 * (double)Client.field763[var12]) * (double)Client.field665[var12]);
            if (var12 == 0) {
               TextureProvider.cameraX += var13;
            }

            if (var12 == 1) {
               class31.cameraY += var13;
            }

            if (var12 == 2) {
               class313.cameraZ += var13;
            }

            if (var12 == 3) {
               WorldMapSection1.cameraYaw = var13 + WorldMapSection1.cameraYaw & 2047;
            }

            if (var12 == 4) {
               class408.cameraPitch += var13;
               if (class408.cameraPitch < 128) {
                  class408.cameraPitch = 128;
               }

               if (class408.cameraPitch > 383) {
                  class408.cameraPitch = 383;
               }
            }
         }
      }

      var12 = MouseHandler.MouseHandler_x;
      var13 = MouseHandler.MouseHandler_y;
      if (MouseHandler.MouseHandler_lastButton != 0) {
         var12 = MouseHandler.MouseHandler_lastPressedX;
         var13 = MouseHandler.MouseHandler_lastPressedY;
      }

      int var14;
      if (var12 >= var0 && var12 < var0 + var2 && var13 >= var1 && var13 < var3 + var1) {
         var14 = var12 - var0;
         int var15 = var13 - var1;
         ViewportMouse.ViewportMouse_x = var14;
         ViewportMouse.ViewportMouse_y = var15;
         ViewportMouse.ViewportMouse_isInViewport = true;
         ViewportMouse.ViewportMouse_entityCount = 0;
         ViewportMouse.ViewportMouse_false0 = false;
      } else {
         ViewportMouse.ViewportMouse_isInViewport = false;
         ViewportMouse.ViewportMouse_entityCount = 0;
      }

      class355.playPcmPlayers();
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
      class355.playPcmPlayers();
      var14 = Rasterizer3D.Rasterizer3D_zoom;
      Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom;
      class139.scene.draw(TextureProvider.cameraX, class31.cameraY, class313.cameraZ, class408.cameraPitch, WorldMapSection1.cameraYaw, var6);
      Rasterizer3D.Rasterizer3D_zoom = var14;
      class355.playPcmPlayers();
      class139.scene.clearTempGameObjects();
      Varcs.method2612(var0, var1, var2, var3);
      if (Client.hintArrowType == 2) {
         Skeleton.worldToScreen(Client.hintArrowSubX * 64 + (Client.hintArrowX - KeyHandler.baseX * 64 << 7), Client.hintArrowSubY * 64 + (Client.hintArrowY - class158.baseY * 64 << 7), Client.hintArrowHeight * 4);
         if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
            class162.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
         }
      }

      ((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
      GameEngine.method662();
      TextureProvider.cameraX = var7;
      class31.cameraY = var8;
      class313.cameraZ = var9;
      class408.cameraPitch = var10;
      WorldMapSection1.cameraYaw = var11;
      if (Client.isLoading) {
         int var16 = 0;
         var16 = var16 + NetCache.NetCache_pendingPriorityResponsesCount + NetCache.NetCache_pendingPriorityWritesCount;
         if (var16 == 0) {
            Client.isLoading = false;
         }
      }

      if (Client.isLoading) {
         Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
         class145.drawLoadingMessage("Loading - please wait.", false);
      }

   }
}
