import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lbn;"
   )
   @Export("MouseHandler_instance")
   public static MouseHandler MouseHandler_instance = new MouseHandler();
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 898312593
   )
   @Export("MouseHandler_idleCycles")
   public static volatile int MouseHandler_idleCycles = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -857678873
   )
   @Export("MouseHandler_currentButtonVolatile")
   public static volatile int MouseHandler_currentButtonVolatile = 0;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 141597573
   )
   @Export("MouseHandler_xVolatile")
   public static volatile int MouseHandler_xVolatile = -1;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1810991225
   )
   @Export("MouseHandler_yVolatile")
   public static volatile int MouseHandler_yVolatile = -1;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      longValue = -1225235563704375327L
   )
   @Export("MouseHandler_lastMovedVolatile")
   public static volatile long MouseHandler_lastMovedVolatile = -1L;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 2025551665
   )
   @Export("MouseHandler_currentButton")
   public static int MouseHandler_currentButton = 0;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1367600295
   )
   @Export("MouseHandler_x")
   public static int MouseHandler_x = 0;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -808246845
   )
   @Export("MouseHandler_y")
   public static int MouseHandler_y = 0;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      longValue = -7283638899694965843L
   )
   @Export("MouseHandler_millis")
   public static long MouseHandler_millis = 0L;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 1992798187
   )
   @Export("MouseHandler_lastButtonVolatile")
   public static volatile int MouseHandler_lastButtonVolatile = 0;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1880795303
   )
   @Export("MouseHandler_lastPressedXVolatile")
   public static volatile int MouseHandler_lastPressedXVolatile = 0;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 2141367755
   )
   @Export("MouseHandler_lastPressedYVolatile")
   public static volatile int MouseHandler_lastPressedYVolatile = 0;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      longValue = 6118197766883651609L
   )
   @Export("MouseHandler_lastPressedTimeMillisVolatile")
   public static volatile long MouseHandler_lastPressedTimeMillisVolatile = 0L;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 426079369
   )
   @Export("MouseHandler_lastButton")
   public static int MouseHandler_lastButton = 0;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 1750298703
   )
   @Export("MouseHandler_lastPressedX")
   public static int MouseHandler_lastPressedX = 0;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1805968983
   )
   @Export("MouseHandler_lastPressedY")
   public static int MouseHandler_lastPressedY = 0;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      longValue = 6498376297210789637L
   )
   @Export("MouseHandler_lastPressedTimeMillis")
   public static long MouseHandler_lastPressedTimeMillis = 0L;
   @ObfuscatedName("id")
   @ObfuscatedSignature(
      descriptor = "Lph;"
   )
   @Export("fontPlain11")
   static Font fontPlain11;
   @ObfuscatedName("qq")
   @ObfuscatedSignature(
      descriptor = "Lef;"
   )
   @Export("varcs")
   static Varcs varcs;

   MouseHandler() {
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/event/MouseEvent;I)I",
      garbageValue = "-1407367231"
   )
   @Export("getButton")
   final int getButton(MouseEvent var1) {
      int var2 = var1.getButton();
      if (!var1.isAltDown() && var2 != 2) {
         return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
      } else {
         return 4;
      }
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_xVolatile = var1.getX();
         MouseHandler_yVolatile = var1.getY();
         MouseHandler_lastMovedVolatile = var1.getWhen();
      }

   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_currentButtonVolatile = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final void mouseClicked(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void mouseExited(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_xVolatile = -1;
         MouseHandler_yVolatile = -1;
         MouseHandler_lastMovedVolatile = var1.getWhen();
      }

   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final void focusGained(FocusEvent var1) {
   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_currentButtonVolatile = 0;
      }

   }

   public final synchronized void mousePressed(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_lastPressedXVolatile = var1.getX();
         MouseHandler_lastPressedYVolatile = var1.getY();
         MouseHandler_lastPressedTimeMillisVolatile = BoundaryObject.method5027();
         MouseHandler_lastButtonVolatile = this.getButton(var1);
         if (MouseHandler_lastButtonVolatile != 0) {
            MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "-3257"
   )
   static int method653() {
      return ++Messages.Messages_count - 1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1002209752"
   )
   public static int method655(int var0) {
      return class452.field4731[var0 & 16383];
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IIIB)I",
      garbageValue = "54"
   )
   public static int method642(int var0, int var1, int var2) {
      int var3 = class155.method3288(var2 - var1 + 1);
      var3 <<= var1;
      var0 |= var3;
      return var0;
   }

   @ObfuscatedName("jd")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "55"
   )
   static final void method654() {
      class4.method14(false);
      Client.field572 = 0;
      boolean var0 = true;

      int var1;
      for(var1 = 0; var1 < WorldMapLabelSize.regionLandArchives.length; ++var1) {
         if (WorldMapCacheName.regionMapArchiveIds[var1] != -1 && WorldMapLabelSize.regionLandArchives[var1] == null) {
            WorldMapLabelSize.regionLandArchives[var1] = class305.archive9.takeFile(WorldMapCacheName.regionMapArchiveIds[var1], 0);
            if (WorldMapLabelSize.regionLandArchives[var1] == null) {
               var0 = false;
               ++Client.field572;
            }
         }

         if (class130.regionLandArchiveIds[var1] != -1 && class74.regionMapArchives[var1] == null) {
            class74.regionMapArchives[var1] = class305.archive9.takeFileEncrypted(class130.regionLandArchiveIds[var1], 0, SpotAnimationDefinition.xteaKeys[var1]);
            if (class74.regionMapArchives[var1] == null) {
               var0 = false;
               ++Client.field572;
            }
         }
      }

      if (!var0) {
         Client.field576 = 1;
      } else {
         Client.field574 = 0;
         var0 = true;

         int var3;
         int var4;
         for(var1 = 0; var1 < WorldMapLabelSize.regionLandArchives.length; ++var1) {
            byte[] var17 = class74.regionMapArchives[var1];
            if (var17 != null) {
               var3 = (SceneTilePaint.regions[var1] >> 8) * 64 - class213.baseX * 64;
               var4 = (SceneTilePaint.regions[var1] & 255) * 64 - class101.baseY * 64;
               if (Client.isInInstance) {
                  var3 = 10;
                  var4 = 10;
               }

               var0 &= class305.method5722(var17, var3, var4);
            }
         }

         if (!var0) {
            Client.field576 = 2;
         } else {
            if (Client.field576 != 0) {
               AABB.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
            }

            WorldMapSectionType.playPcmPlayers();
            class36.scene.clear();

            for(var1 = 0; var1 < 4; ++var1) {
               Client.collisionMaps[var1].clear();
            }

            int var2;
            for(var1 = 0; var1 < 4; ++var1) {
               for(var2 = 0; var2 < 104; ++var2) {
                  for(var3 = 0; var3 < 104; ++var3) {
                     Tiles.Tiles_renderFlags[var1][var2][var3] = 0;
                  }
               }
            }

            WorldMapSectionType.playPcmPlayers();
            class269.method5466();
            var1 = WorldMapLabelSize.regionLandArchives.length;
            class145.method3139();
            class4.method14(true);
            int var5;
            if (!Client.isInInstance) {
               byte[] var16;
               for(var2 = 0; var2 < var1; ++var2) {
                  var3 = (SceneTilePaint.regions[var2] >> 8) * 64 - class213.baseX * 64;
                  var4 = (SceneTilePaint.regions[var2] & 255) * 64 - class101.baseY * 64;
                  var16 = WorldMapLabelSize.regionLandArchives[var2];
                  if (var16 != null) {
                     WorldMapSectionType.playPcmPlayers();
                     WorldMapData_0.method5058(var16, var3, var4, class208.field2314 * 8 - 48, PlayerCompositionColorTextureOverride.field1891 * 8 - 48, Client.collisionMaps);
                  }
               }

               for(var2 = 0; var2 < var1; ++var2) {
                  var3 = (SceneTilePaint.regions[var2] >> 8) * 64 - class213.baseX * 64;
                  var4 = (SceneTilePaint.regions[var2] & 255) * 64 - class101.baseY * 64;
                  var16 = WorldMapLabelSize.regionLandArchives[var2];
                  if (var16 == null && PlayerCompositionColorTextureOverride.field1891 < 800) {
                     WorldMapSectionType.playPcmPlayers();
                     MilliClock.method3526(var3, var4, 64, 64);
                  }
               }

               class4.method14(true);

               for(var2 = 0; var2 < var1; ++var2) {
                  byte[] var15 = class74.regionMapArchives[var2];
                  if (var15 != null) {
                     var4 = (SceneTilePaint.regions[var2] >> 8) * 64 - class213.baseX * 64;
                     var5 = (SceneTilePaint.regions[var2] & 255) * 64 - class101.baseY * 64;
                     WorldMapSectionType.playPcmPlayers();
                     UserComparator6.method2895(var15, var4, var5, class36.scene, Client.collisionMaps);
                  }
               }
            }

            int var6;
            int var7;
            int var8;
            if (Client.isInInstance) {
               int var9;
               int var10;
               int var11;
               for(var2 = 0; var2 < 4; ++var2) {
                  WorldMapSectionType.playPcmPlayers();

                  for(var3 = 0; var3 < 13; ++var3) {
                     for(var4 = 0; var4 < 13; ++var4) {
                        boolean var18 = false;
                        var6 = Client.instanceChunkTemplates[var2][var3][var4];
                        if (var6 != -1) {
                           var7 = var6 >> 24 & 3;
                           var8 = var6 >> 1 & 3;
                           var9 = var6 >> 14 & 1023;
                           var10 = var6 >> 3 & 2047;
                           var11 = (var9 / 8 << 8) + var10 / 8;

                           for(int var12 = 0; var12 < SceneTilePaint.regions.length; ++var12) {
                              if (SceneTilePaint.regions[var12] == var11 && WorldMapLabelSize.regionLandArchives[var12] != null) {
                                 int var13 = (var9 - var3) * 8;
                                 int var14 = (var10 - var4) * 8;
                                 AABB.method4706(WorldMapLabelSize.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps);
                                 var18 = true;
                                 break;
                              }
                           }
                        }

                        if (!var18) {
                           Message.method1161(var2, var3 * 8, var4 * 8);
                        }
                     }
                  }
               }

               for(var2 = 0; var2 < 13; ++var2) {
                  for(var3 = 0; var3 < 13; ++var3) {
                     var4 = Client.instanceChunkTemplates[0][var2][var3];
                     if (var4 == -1) {
                        MilliClock.method3526(var2 * 8, var3 * 8, 8, 8);
                     }
                  }
               }

               class4.method14(true);

               for(var2 = 0; var2 < 4; ++var2) {
                  WorldMapSectionType.playPcmPlayers();

                  for(var3 = 0; var3 < 13; ++var3) {
                     for(var4 = 0; var4 < 13; ++var4) {
                        var5 = Client.instanceChunkTemplates[var2][var3][var4];
                        if (var5 != -1) {
                           var6 = var5 >> 24 & 3;
                           var7 = var5 >> 1 & 3;
                           var8 = var5 >> 14 & 1023;
                           var9 = var5 >> 3 & 2047;
                           var10 = (var8 / 8 << 8) + var9 / 8;

                           for(var11 = 0; var11 < SceneTilePaint.regions.length; ++var11) {
                              if (SceneTilePaint.regions[var11] == var10 && class74.regionMapArchives[var11] != null) {
                                 Tiles.method2167(class74.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class36.scene, Client.collisionMaps);
                                 break;
                              }
                           }
                        }
                     }
                  }
               }
            }

            class4.method14(true);
            WorldMapSectionType.playPcmPlayers();
            VarpDefinition.method3573(class36.scene, Client.collisionMaps);
            class4.method14(true);
            var2 = Tiles.Tiles_minPlane;
            if (var2 > Clock.Client_plane) {
               var2 = Clock.Client_plane;
            }

            if (var2 < Clock.Client_plane - 1) {
               var2 = Clock.Client_plane - 1;
            }

            if (Client.isLowDetail) {
               class36.scene.init(Tiles.Tiles_minPlane);
            } else {
               class36.scene.init(0);
            }

            for(var3 = 0; var3 < 104; ++var3) {
               for(var4 = 0; var4 < 104; ++var4) {
                  class128.updateItemPile(var3, var4);
               }
            }

            WorldMapSectionType.playPcmPlayers();
            VertexNormal.method4919();
            ObjectComposition.ObjectDefinition_cachedModelData.clear();
            PacketBufferNode var19;
            if (class347.client.hasFrame()) {
               var19 = ObjectComposition.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
               var19.packetBuffer.writeInt(1057001181);
               Client.packetWriter.addNode(var19);
            }

            if (!Client.isInInstance) {
               var3 = (class208.field2314 - 6) / 8;
               var4 = (class208.field2314 + 6) / 8;
               var5 = (PlayerCompositionColorTextureOverride.field1891 - 6) / 8;
               var6 = (PlayerCompositionColorTextureOverride.field1891 + 6) / 8;

               for(var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
                  for(var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
                     if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
                        class305.archive9.loadRegionFromName("m" + var7 + "_" + var8);
                        class305.archive9.loadRegionFromName("l" + var7 + "_" + var8);
                     }
                  }
               }
            }

            UserComparator8.updateGameState(30);
            WorldMapSectionType.playPcmPlayers();
            class161.method3331();
            var19 = ObjectComposition.getPacketBufferNode(ClientPacket.field3114, Client.packetWriter.isaacCipher);
            Client.packetWriter.addNode(var19);
            class125.method2918();
         }
      }
   }
}
