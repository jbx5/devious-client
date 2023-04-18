import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("am")
public class class18 {
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1093766555
   )
   static int field94;
   @ObfuscatedName("bc")
   static String field97;
   @ObfuscatedName("af")
   Future field99;
   @ObfuscatedName("an")
   String field95;

   class18(Future var1) {
      this.field99 = var1;
   }

   class18(String var1) {
      this.method267(var1);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-898122072"
   )
   void method267(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.field95 = var1;
      if (this.field99 != null) {
         this.field99.cancel(true);
         this.field99 = null;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1876642692"
   )
   public final String method268() {
      return this.field95;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "58"
   )
   public boolean method266() {
      return this.field95 != null || this.field99 == null;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-2084770197"
   )
   public final boolean method269() {
      return this.method266() ? true : this.field99.isDone();
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)Laj;",
      garbageValue = "-1834092679"
   )
   public final class20 method270() {
      if (this.method266()) {
         return new class20(this.field95);
      } else if (!this.method269()) {
         return null;
      } else {
         try {
            return (class20)this.field99.get();
         } catch (Exception var3) {
            String var2 = "Error retrieving REST request reply";
            System.err.println(var2 + "\r\n" + var3);
            this.method267(var2);
            return new class20(var2);
         }
      }
   }

   @ObfuscatedName("an")
   public static void method285(double var0) {
      class7.Rasterizer3D_buildPalette(var0, 0, 512);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-254097069"
   )
   static void method283() {
      for(ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
         if (var0.obj != null) {
            var0.set();
         }
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-440671694"
   )
   public static int method289(int var0) {
      var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
      var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
      var0 = var0 + (var0 >>> 4) & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "777395555"
   )
   static String method287() {
      return class20.clientPreferences.method2450() ? WorldMapDecorationType.method6573(Login.Login_username) : Login.Login_username;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1601417771"
   )
   public static void method271() {
      int var0 = Rasterizer2D.Rasterizer2D_xClipStart;
      int var1 = Rasterizer2D.Rasterizer2D_yClipStart;
      int var2 = Rasterizer2D.Rasterizer2D_xClipEnd;
      int var3 = Rasterizer2D.Rasterizer2D_yClipEnd;
      Rasterizer3D.field2514.field2797 = var2 - var0;
      Rasterizer3D.field2514.field2796 = var3 - var1;
      Tiles.method2221();
      if (Rasterizer3D.field2514.Rasterizer3D_rowOffsets.length < Rasterizer3D.field2514.field2796) {
         Rasterizer3D.field2514.Rasterizer3D_rowOffsets = new int[class70.method2044(Rasterizer3D.field2514.field2796)];
      }

      int var4 = var0 + var1 * Rasterizer2D.Rasterizer2D_width;

      for(int var5 = 0; var5 < Rasterizer3D.field2514.field2796; ++var5) {
         Rasterizer3D.field2514.Rasterizer3D_rowOffsets[var5] = var4;
         var4 += Rasterizer2D.Rasterizer2D_width;
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2013158329"
   )
   public static void method288() {
      Widget.Widget_cachedSprites.clear();
      Widget.Widget_cachedModels.clear();
      Widget.Widget_cachedFonts.clear();
      Widget.Widget_cachedSpriteMasks.clear();
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZI)I",
      garbageValue = "995876193"
   )
   static int method272(int var0, Script var1, boolean var2) {
      int var3;
      if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
         return 1;
      } else {
         int var13;
         if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0;
            return 1;
         } else {
            boolean var12;
            if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
               var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
               if (class375.grandExchangeEvents != null) {
                  class375.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
               var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
               if (class375.grandExchangeEvents != null) {
                  class375.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
               Interpreter.Interpreter_intStackSize -= 2;
               var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == 1;
               boolean var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
               if (class375.grandExchangeEvents != null) {
                  Client.GrandExchangeEvents_worldComparator.filterWorlds = var11;
                  class375.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
               var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
               if (class375.grandExchangeEvents != null) {
                  class375.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
               var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
               if (class375.grandExchangeEvents != null) {
                  class375.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class375.grandExchangeEvents == null ? 0 : class375.grandExchangeEvents.events.size();
               return 1;
            } else {
               GrandExchangeEvent var4;
               if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)class375.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.world;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)class375.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.getOfferName();
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)class375.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName();
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)class375.grandExchangeEvents.events.get(var3);
                  long var5 = class96.method2634() - class323.field3740 - var4.age;
                  int var7 = (int)(var5 / 3600000L);
                  int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
                  int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * '\uea60')) / 1000L);
                  String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var10;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)class375.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)class375.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)class375.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   @ObfuscatedName("iz")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "185659219"
   )
   static final int method290(int var0) {
      return Math.min(Math.max(var0, 128), 383);
   }

   @ObfuscatedName("id")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-1135729474"
   )
   @Export("drawEntities")
   static final void drawEntities(int var0, int var1, int var2, int var3) {
      ++Client.viewportDrawCount;
      if (MusicPatchNode.localPlayer.x >> 7 == Client.destinationX && MusicPatchNode.localPlayer.y >> 7 == Client.destinationY) {
         Client.destinationX = 0;
      }

      TileItem.method2676();
      if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
         MouseHandler.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
      }

      RouteStrategy.addNpcsToScene(true);
      int var4 = Players.Players_count;
      int[] var5 = Players.Players_indices;

      int var6;
      for(var6 = 0; var6 < var4; ++var6) {
         if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) {
            MouseHandler.addPlayerToScene(Client.players[var5[var6]], true);
         }
      }

      RouteStrategy.addNpcsToScene(false);
      class142.method3235();
      GraphicsDefaults.method8084();
      class36.setViewportShape(var0, var1, var2, var3, true);
      var0 = Client.viewportOffsetX;
      var1 = Client.viewportOffsetY;
      var2 = Client.viewportWidth;
      var3 = Client.viewportHeight;
      Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
      method271();
      Rasterizer2D.method9447();
      var4 = Client.camAngleX;
      if (Client.field588 / 256 > var4) {
         var4 = Client.field588 / 256;
      }

      if (Client.field753[4] && Client.field776[4] + 128 > var4) {
         var4 = Client.field776[4] + 128;
      }

      int var34 = Client.camAngleY & 2047;
      var6 = class33.oculusOrbFocalPointX;
      int var7 = class96.field1296;
      int var8 = class144.oculusOrbFocalPointY;
      int var9 = WorldMapData_0.method5041(var4);
      int var11 = var3 - 334;
      if (var11 < 0) {
         var11 = 0;
      } else if (var11 > 100) {
         var11 = 100;
      }

      int var12 = (Client.zoomWidth - Client.zoomHeight) * var11 / 100 + Client.zoomHeight;
      int var10 = var9 * var12 / 256;
      var11 = 2048 - var4 & 2047;
      var12 = 2048 - var34 & 2047;
      int var13 = 0;
      int var14 = 0;
      int var15 = var10;
      int var16;
      int var17;
      int var18;
      if (var11 != 0) {
         var16 = Rasterizer3D.Rasterizer3D_sine[var11];
         var17 = Rasterizer3D.Rasterizer3D_cosine[var11];
         var18 = var17 * var14 - var16 * var10 >> 16;
         var15 = var16 * var14 + var10 * var17 >> 16;
         var14 = var18;
      }

      if (var12 != 0) {
         var16 = Rasterizer3D.Rasterizer3D_sine[var12];
         var17 = Rasterizer3D.Rasterizer3D_cosine[var12];
         var18 = var13 * var17 + var16 * var15 >> 16;
         var15 = var15 * var17 - var16 * var13 >> 16;
         var13 = var18;
      }

      if (Client.isCameraLocked) {
         WorldMapRectangle.field3006 = var6 - var13;
         Players.field1344 = var7 - var14;
         KitDefinition.field1957 = var8 - var15;
         ScriptEvent.field1041 = var4;
         class86.field1082 = var34;
      } else {
         class36.cameraX = var6 - var13;
         class174.cameraY = var7 - var14;
         class297.cameraZ = var8 - var15;
         WorldMapSectionType.cameraPitch = var4;
         class125.cameraYaw = var34;
      }

      if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class33.oculusOrbFocalPointX >> 7 != MusicPatchNode.localPlayer.x >> 7 || class144.oculusOrbFocalPointY >> 7 != MusicPatchNode.localPlayer.y >> 7)) {
         var16 = MusicPatchNode.localPlayer.plane;
         var17 = WorldMapData_0.baseX * 64 + (class33.oculusOrbFocalPointX >> 7);
         var18 = GameObject.baseY * 64 + (class144.oculusOrbFocalPointY >> 7);
         PacketBufferNode var19 = class330.getPacketBufferNode(ClientPacket.field3179, Client.packetWriter.isaacCipher);
         var19.packetBuffer.writeIntIME(Client.field576);
         var19.packetBuffer.writeShortAdd(var17);
         var19.packetBuffer.writeByteAdd(var16);
         var19.packetBuffer.writeShortAddLE(var18);
         Client.packetWriter.addNode(var19);
      }

      if (!Client.isCameraLocked) {
         var10 = UserComparator3.method2932();
      } else {
         if (class20.clientPreferences.method2513()) {
            var11 = GameEngine.Client_plane;
         } else {
            var12 = class147.getTileHeight(class36.cameraX, class297.cameraZ, GameEngine.Client_plane);
            if (var12 - class174.cameraY < 800 && (Tiles.Tiles_renderFlags[GameEngine.Client_plane][class36.cameraX >> 7][class297.cameraZ >> 7] & 4) != 0) {
               var11 = GameEngine.Client_plane;
            } else {
               var11 = 3;
            }
         }

         var10 = var11;
      }

      var11 = class36.cameraX;
      var12 = class174.cameraY;
      var13 = class297.cameraZ;
      var14 = WorldMapSectionType.cameraPitch;
      var15 = class125.cameraYaw;

      for(var16 = 0; var16 < 5; ++var16) {
         if (Client.field753[var16]) {
            var17 = (int)(Math.random() * (double)(Client.field754[var16] * 2 + 1) - (double)Client.field754[var16] + Math.sin((double)Client.field584[var16] * ((double)Client.field631[var16] / 100.0)) * (double)Client.field776[var16]);
            if (var16 == 0) {
               class36.cameraX += var17;
            }

            if (var16 == 1) {
               class174.cameraY += var17;
            }

            if (var16 == 2) {
               class297.cameraZ += var17;
            }

            if (var16 == 3) {
               class125.cameraYaw = var17 + class125.cameraYaw & 2047;
            }

            if (var16 == 4) {
               WorldMapSectionType.cameraPitch += var17;
               if (WorldMapSectionType.cameraPitch < 128) {
                  WorldMapSectionType.cameraPitch = 128;
               }

               if (WorldMapSectionType.cameraPitch > 383) {
                  WorldMapSectionType.cameraPitch = 383;
               }
            }
         }
      }

      var16 = MouseHandler.MouseHandler_x;
      var17 = MouseHandler.MouseHandler_y;
      if (MouseHandler.MouseHandler_lastButton != 0) {
         var16 = MouseHandler.MouseHandler_lastPressedX;
         var17 = MouseHandler.MouseHandler_lastPressedY;
      }

      if (var16 >= var0 && var16 < var0 + var2 && var17 >= var1 && var17 < var3 + var1) {
         var18 = var16 - var0;
         int var35 = var17 - var1;
         ViewportMouse.ViewportMouse_x = var18;
         ViewportMouse.ViewportMouse_y = var35;
         ViewportMouse.ViewportMouse_isInViewport = true;
         ViewportMouse.ViewportMouse_entityCount = 0;
         ViewportMouse.ViewportMouse_false0 = false;
      } else {
         class146.method3265();
      }

      class323.playPcmPlayers();
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
      class323.playPcmPlayers();
      var18 = UserComparator7.method2904();
      class314.method6147(ScriptFrame.client.field215);
      Rasterizer3D.field2514.field2790 = Client.viewportZoom;
      class31.scene.draw(class36.cameraX, class174.cameraY, class297.cameraZ, WorldMapSectionType.cameraPitch, class125.cameraYaw, var10);
      class314.method6147(false);
      if (Client.renderSelf) {
         Rasterizer2D.method9404();
      }

      Rasterizer3D.field2514.field2790 = var18;
      class323.playPcmPlayers();
      class31.scene.clearTempGameObjects();
      Client.overheadTextCount = 0;
      boolean var38 = false;
      int var20 = -1;
      int var21 = -1;
      int var22 = Players.Players_count;
      int[] var23 = Players.Players_indices;

      int var24;
      for(var24 = 0; var24 < var22 + Client.npcCount; ++var24) {
         Object var37;
         if (var24 < var22) {
            var37 = Client.players[var23[var24]];
            if (var23[var24] == Client.combatTargetPlayerIndex) {
               var38 = true;
               var20 = var24;
               continue;
            }

            if (var37 == MusicPatchNode.localPlayer) {
               var21 = var24;
               continue;
            }
         } else {
            var37 = Client.npcs[Client.npcIndices[var24 - var22]];
         }

         class33.drawActor2d((Actor)var37, var24, var0, var1, var2, var3);
      }

      if (Client.field614 && var21 != -1) {
         class33.drawActor2d(MusicPatchNode.localPlayer, var21, var0, var1, var2, var3);
      }

      if (var38) {
         class33.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var20, var0, var1, var2, var3);
      }

      for(var24 = 0; var24 < Client.overheadTextCount; ++var24) {
         int var25 = Client.overheadTextXs[var24];
         int var26 = Client.overheadTextYs[var24];
         int var27 = Client.overheadTextXOffsets[var24];
         int var28 = Client.overheadTextAscents[var24];
         boolean var29 = true;

         while(var29) {
            var29 = false;

            for(int var36 = 0; var36 < var24; ++var36) {
               if (var26 + 2 > Client.overheadTextYs[var36] - Client.overheadTextAscents[var36] && var26 - var28 < Client.overheadTextYs[var36] + 2 && var25 - var27 < Client.overheadTextXOffsets[var36] + Client.overheadTextXs[var36] && var25 + var27 > Client.overheadTextXs[var36] - Client.overheadTextXOffsets[var36] && Client.overheadTextYs[var36] - Client.overheadTextAscents[var36] < var26) {
                  var26 = Client.overheadTextYs[var36] - Client.overheadTextAscents[var36];
                  var29 = true;
               }
            }
         }

         Client.viewportTempX = Client.overheadTextXs[var24];
         Client.viewportTempY = Client.overheadTextYs[var24] = var26;
         String var30 = Client.overheadText[var24];
         if (Client.chatEffects == 0) {
            int var31 = 16776960;
            if (Client.overheadTextColors[var24] < 6) {
               var31 = Client.field715[Client.overheadTextColors[var24]];
            }

            if (Client.overheadTextColors[var24] == 6) {
               var31 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
            }

            if (Client.overheadTextColors[var24] == 7) {
               var31 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
            }

            if (Client.overheadTextColors[var24] == 8) {
               var31 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
            }

            int var32;
            if (Client.overheadTextColors[var24] == 9) {
               var32 = 150 - Client.overheadTextCyclesRemaining[var24];
               if (var32 < 50) {
                  var31 = var32 * 1280 + 16711680;
               } else if (var32 < 100) {
                  var31 = 16776960 - (var32 - 50) * 327680;
               } else if (var32 < 150) {
                  var31 = (var32 - 100) * 5 + '\uff00';
               }
            }

            if (Client.overheadTextColors[var24] == 10) {
               var32 = 150 - Client.overheadTextCyclesRemaining[var24];
               if (var32 < 50) {
                  var31 = var32 * 5 + 16711680;
               } else if (var32 < 100) {
                  var31 = 16711935 - (var32 - 50) * 327680;
               } else if (var32 < 150) {
                  var31 = (var32 - 100) * 327680 + 255 - (var32 - 100) * 5;
               }
            }

            if (Client.overheadTextColors[var24] == 11) {
               var32 = 150 - Client.overheadTextCyclesRemaining[var24];
               if (var32 < 50) {
                  var31 = 16777215 - var32 * 327685;
               } else if (var32 < 100) {
                  var31 = (var32 - 50) * 327685 + '\uff00';
               } else if (var32 < 150) {
                  var31 = 16777215 - (var32 - 100) * 327680;
               }
            }

            if (Client.overheadTextEffects[var24] == 0) {
               class137.fontBold12.drawCentered(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0);
            }

            if (Client.overheadTextEffects[var24] == 1) {
               class137.fontBold12.drawCenteredWave(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount);
            }

            if (Client.overheadTextEffects[var24] == 2) {
               class137.fontBold12.drawCenteredWave2(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount);
            }

            if (Client.overheadTextEffects[var24] == 3) {
               class137.fontBold12.drawCenteredShake(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var24]);
            }

            if (Client.overheadTextEffects[var24] == 4) {
               var32 = (150 - Client.overheadTextCyclesRemaining[var24]) * (class137.fontBold12.stringWidth(var30) + 100) / 150;
               Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
               class137.fontBold12.draw(var30, var0 + Client.viewportTempX + 50 - var32, Client.viewportTempY + var1, var31, 0);
               Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
            }

            if (Client.overheadTextEffects[var24] == 5) {
               var32 = 150 - Client.overheadTextCyclesRemaining[var24];
               int var33 = 0;
               if (var32 < 25) {
                  var33 = var32 - 25;
               } else if (var32 > 125) {
                  var33 = var32 - 125;
               }

               Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class137.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
               class137.fontBold12.drawCentered(var30, var0 + Client.viewportTempX, var33 + Client.viewportTempY + var1, var31, 0);
               Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
            }
         } else {
            class137.fontBold12.drawCentered(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
         }
      }

      class317.method6527(var0, var1);
      ((TextureProvider)Rasterizer3D.field2514.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
      Friend.method7815();
      class36.cameraX = var11;
      class174.cameraY = var12;
      class297.cameraZ = var13;
      WorldMapSectionType.cameraPitch = var14;
      class125.cameraYaw = var15;
      if (Client.isLoading && HorizontalAlignment.method3762(true, false) == 0) {
         Client.isLoading = false;
      }

      if (Client.isLoading) {
         Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
         WorldMapDecoration.drawLoadingMessage("Loading - please wait.", false);
      }

   }

   @ObfuscatedName("kh")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-308434665"
   )
   @Export("selectSpell")
   static void selectSpell(int var0, int var1, int var2, int var3) {
      Widget var4 = SoundSystem.getWidgetChild(var0, var1);
      if (var4 != null && var4.onTargetEnter != null) {
         ScriptEvent var5 = new ScriptEvent();
         var5.widget = var4;
         var5.args = var4.onTargetEnter;
         HealthBarUpdate.runScriptEvent(var5);
      }

      Client.selectedSpellItemId = var3;
      Client.isSpellSelected = true;
      class236.selectedSpellWidget = var0;
      Client.selectedSpellChildIndex = var1;
      SecureRandomFuture.selectedSpellFlags = var2;
      class144.invalidateWidget(var4);
   }
}
