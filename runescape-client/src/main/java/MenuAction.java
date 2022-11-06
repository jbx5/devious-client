import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("MenuAction")
public class MenuAction {
   @ObfuscatedName("sx")
   @ObfuscatedSignature(
      descriptor = "Lnc;"
   )
   @Export("friendsChat")
   static FriendsChat friendsChat;
   @ObfuscatedName("vo")
   static List field890;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1239822321
   )
   static int field887;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 440525807
   )
   @Export("param0")
   int param0;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1489507653
   )
   @Export("param1")
   int param1;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1234157163
   )
   @Export("opcode")
   int opcode;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 273873921
   )
   @Export("identifier")
   int identifier;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1862516219
   )
   @Export("itemId")
   int itemId;
   @ObfuscatedName("j")
   @Export("action")
   String action;
   @ObfuscatedName("y")
   @Export("target")
   String target;

   MenuAction() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "41"
   )
   public static void method2021() {
      if (MouseHandler.MouseHandler_instance != null) {
         synchronized(MouseHandler.MouseHandler_instance) {
            MouseHandler.MouseHandler_instance = null;
         }
      }

   }

   @ObfuscatedName("ku")
   @ObfuscatedSignature(
      descriptor = "([Lkn;II)V",
      garbageValue = "2081299014"
   )
   @Export("drawModelComponents")
   static final void drawModelComponents(Widget[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         Widget var3 = var0[var2];
         if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !class6.isComponentHidden(var3))) {
            if (var3.type == 0) {
               if (!var3.isIf3 && class6.isComponentHidden(var3) && var3 != Occluder.mousedOverWidgetIf1) {
                  continue;
               }

               drawModelComponents(var0, var3.id);
               if (var3.children != null) {
                  drawModelComponents(var3.children, var3.id);
               }

               InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
               if (var4 != null) {
                  ByteArrayPool.method7164(var4.group);
               }
            }

            if (var3.type == 6) {
               int var5;
               if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
                  boolean var8 = MouseHandler.runCs1(var3);
                  if (var8) {
                     var5 = var3.sequenceId2;
                  } else {
                     var5 = var3.sequenceId;
                  }

                  if (var5 != -1) {
                     SequenceDefinition var6 = WorldMapElement.SequenceDefinition_get(var5);
                     if (!var6.isCachedModelIdSet()) {
                        for(var3.modelFrameCycle += Client.graphicsCycle; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class143.invalidateWidget(var3)) {
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
                        int var7 = var6.method3876();
                        if (var3.modelFrame >= var7) {
                           var3.modelFrame -= var6.frameCount;
                           if (var3.modelFrame < 0 || var3.modelFrame >= var7) {
                              var3.modelFrame = 0;
                           }
                        }

                        class143.invalidateWidget(var3);
                     }
                  }
               }

               if (var3.field3533 != 0 && !var3.isIf3) {
                  int var9 = var3.field3533 >> 16;
                  var5 = var3.field3533 << 16 >> 16;
                  var9 *= Client.graphicsCycle;
                  var5 *= Client.graphicsCycle;
                  var3.modelAngleX = var9 + var3.modelAngleX & 2047;
                  var3.modelAngleY = var5 + var3.modelAngleY & 2047;
                  class143.invalidateWidget(var3);
               }
            }
         }
      }

   }

   @ObfuscatedName("lq")
   @ObfuscatedSignature(
      descriptor = "(Lkn;IIII)V",
      garbageValue = "-1782252068"
   )
   @Export("drawMinimap")
   static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
      class355.playPcmPlayers();
      SpriteMask var4 = var0.getSpriteMask(false);
      if (var4 != null) {
         Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
         if (Client.minimapState != 2 && Client.minimapState != 5) {
            int var5 = Client.camAngleY & 2047;
            int var6 = class296.localPlayer.x / 32 + 48;
            int var7 = 464 - class296.localPlayer.y / 32;
            Calendar.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

            int var8;
            int var10;
            int var16;
            for(var8 = 0; var8 < Client.mapIconCount; ++var8) {
               var16 = Client.mapIconXs[var8] * 4 + 2 - class296.localPlayer.x / 32;
               var10 = Client.mapIconYs[var8] * 4 + 2 - class296.localPlayer.y / 32;
               class277.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
            }

            int var11;
            int var12;
            for(var8 = 0; var8 < 104; ++var8) {
               for(var16 = 0; var16 < 104; ++var16) {
                  NodeDeque var14 = Client.groundItems[ApproximateRouteStrategy.Client_plane][var8][var16];
                  if (var14 != null) {
                     var11 = var8 * 4 + 2 - class296.localPlayer.x / 32;
                     var12 = var16 * 4 + 2 - class296.localPlayer.y / 32;
                     class277.drawSpriteOnMinimap(var1, var2, var11, var12, Decimator.mapDotSprites[0], var4);
                  }
               }
            }

            for(var8 = 0; var8 < Client.npcCount; ++var8) {
               NPC var9 = Client.npcs[Client.npcIndices[var8]];
               if (var9 != null && var9.isVisible()) {
                  NPCComposition var18 = var9.definition;
                  if (var18 != null && var18.transforms != null) {
                     var18 = var18.transform();
                  }

                  if (var18 != null && var18.drawMapDot && var18.isInteractable) {
                     var11 = var9.x / 32 - class296.localPlayer.x / 32;
                     var12 = var9.y / 32 - class296.localPlayer.y / 32;
                     class277.drawSpriteOnMinimap(var1, var2, var11, var12, Decimator.mapDotSprites[1], var4);
                  }
               }
            }

            var8 = Players.Players_count;
            int[] var17 = Players.Players_indices;

            for(var10 = 0; var10 < var8; ++var10) {
               Player var15 = Client.players[var17[var10]];
               if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class296.localPlayer) {
                  var12 = var15.x / 32 - class296.localPlayer.x / 32;
                  int var13 = var15.y / 32 - class296.localPlayer.y / 32;
                  if (var15.isFriend()) {
                     class277.drawSpriteOnMinimap(var1, var2, var12, var13, Decimator.mapDotSprites[3], var4);
                  } else if (class296.localPlayer.team != 0 && var15.team != 0 && var15.team == class296.localPlayer.team) {
                     class277.drawSpriteOnMinimap(var1, var2, var12, var13, Decimator.mapDotSprites[4], var4);
                  } else if (var15.isFriendsChatMember()) {
                     class277.drawSpriteOnMinimap(var1, var2, var12, var13, Decimator.mapDotSprites[5], var4);
                  } else if (var15.isClanMember()) {
                     class277.drawSpriteOnMinimap(var1, var2, var12, var13, Decimator.mapDotSprites[6], var4);
                  } else {
                     class277.drawSpriteOnMinimap(var1, var2, var12, var13, Decimator.mapDotSprites[2], var4);
                  }
               }
            }

            if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
               if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
                  NPC var19 = Client.npcs[Client.hintArrowNpcIndex];
                  if (var19 != null) {
                     var11 = var19.x / 32 - class296.localPlayer.x / 32;
                     var12 = var19.y / 32 - class296.localPlayer.y / 32;
                     class4444.worldToMinimap(var1, var2, var11, var12, WorldMapLabelSize.mapMarkerSprites[1], var4);
                  }
               }

               if (Client.hintArrowType == 2) {
                  var10 = Client.hintArrowX * 4 - KeyHandler.baseX * 256 + 2 - class296.localPlayer.x / 32;
                  var11 = Client.hintArrowY * 4 - class158.baseY * 256 + 2 - class296.localPlayer.y / 32;
                  class4444.worldToMinimap(var1, var2, var10, var11, WorldMapLabelSize.mapMarkerSprites[1], var4);
               }

               if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
                  Player var20 = Client.players[Client.hintArrowPlayerIndex];
                  if (var20 != null) {
                     var11 = var20.x / 32 - class296.localPlayer.x / 32;
                     var12 = var20.y / 32 - class296.localPlayer.y / 32;
                     class4444.worldToMinimap(var1, var2, var11, var12, WorldMapLabelSize.mapMarkerSprites[1], var4);
                  }
               }
            }

            if (Client.destinationX != 0) {
               var10 = Client.destinationX * 4 + 2 - class296.localPlayer.x / 32;
               var11 = Client.destinationY * 4 + 2 - class296.localPlayer.y / 32;
               class277.drawSpriteOnMinimap(var1, var2, var10, var11, WorldMapLabelSize.mapMarkerSprites[0], var4);
            }

            if (!class296.localPlayer.isHidden) {
               Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
            }
         } else {
            Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
         }

         Client.field718[var3] = true;
      }
   }
}
