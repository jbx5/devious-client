import java.awt.FontMetrics;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public class class27 {
   @ObfuscatedName("bi")
   @Export("loginScreenFontMetrics")
   static FontMetrics loginScreenFontMetrics;
   @ObfuscatedName("aq")
   int[] field140 = new int[112];
   @ObfuscatedName("al")
   int[] field146 = new int[192];

   public class27() {
      Arrays.fill(this.field140, 3);
      Arrays.fill(this.field146, 3);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "0"
   )
   public void method407(int var1, int var2) {
      if (this.method414(var1) && this.method427(var2)) {
         this.field140[var1] = var2;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(CII)V",
      garbageValue = "48495477"
   )
   public void method408(char var1, int var2) {
      if (this.method446(var1) && this.method427(var2)) {
         this.field146[var1] = var2;
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-428082252"
   )
   public int method409(int var1) {
      return this.method414(var1) ? this.field140[var1] : 0;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(CB)I",
      garbageValue = "32"
   )
   public int method410(char var1) {
      return this.method446(var1) ? this.field146[var1] : 0;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1749930084"
   )
   public boolean method411(int var1) {
      return this.method414(var1) && (this.field140[var1] == 1 || this.field140[var1] == 3);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "-528043848"
   )
   public boolean method412(char var1) {
      return this.method446(var1) && (this.field146[var1] == 1 || this.field146[var1] == 3);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1380991347"
   )
   public boolean method413(int var1) {
      return this.method414(var1) && (this.field140[var1] == 2 || this.field140[var1] == 3);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "1152812714"
   )
   public boolean method441(char var1) {
      return this.method446(var1) && (this.field146[var1] == 2 || this.field146[var1] == 3);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "2137123671"
   )
   boolean method414(int var1) {
      if (var1 >= 0 && var1 < 112) {
         return true;
      } else {
         System.out.println("Invalid keycode: " + var1);
         return false;
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "1305668583"
   )
   boolean method446(char var1) {
      if (var1 >= 0 && var1 < 192) {
         return true;
      } else {
         System.out.println("Invalid keychar: " + var1);
         return false;
      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1805766557"
   )
   boolean method427(int var1) {
      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }

   @ObfuscatedName("jh")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-52"
   )
   static final void method418() {
      Language.method6931(false);
      Client.field559 = 0;
      boolean var0 = true;

      int var1;
      for(var1 = 0; var1 < class4.regionLandArchives.length; ++var1) {
         if (FontName.regionMapArchiveIds[var1] != -1 && class4.regionLandArchives[var1] == null) {
            class4.regionLandArchives[var1] = GrandExchangeOfferTotalQuantityComparator.archive9.takeFile(FontName.regionMapArchiveIds[var1], 0);
            if (class4.regionLandArchives[var1] == null) {
               var0 = false;
               ++Client.field559;
            }
         }

         if (Archive.regionLandArchiveIds[var1] != -1 && ObjectSound.regionMapArchives[var1] == null) {
            ObjectSound.regionMapArchives[var1] = GrandExchangeOfferTotalQuantityComparator.archive9.takeFileEncrypted(Archive.regionLandArchiveIds[var1], 0, GameObject.xteaKeys[var1]);
            if (ObjectSound.regionMapArchives[var1] == null) {
               var0 = false;
               ++Client.field559;
            }
         }
      }

      if (!var0) {
         Client.field621 = 1;
      } else {
         Client.field557 = 0;
         var0 = true;

         int var3;
         int var4;
         for(var1 = 0; var1 < class4.regionLandArchives.length; ++var1) {
            byte[] var17 = ObjectSound.regionMapArchives[var1];
            if (var17 != null) {
               var3 = (WorldMapAreaData.regions[var1] >> 8) * 64 - WorldMapData_0.baseX * 64;
               var4 = (WorldMapAreaData.regions[var1] & 255) * 64 - GameObject.baseY * 64;
               if (Client.isInInstance) {
                  var3 = 10;
                  var4 = 10;
               }

               var0 &= KitDefinition.method3685(var17, var3, var4);
            }
         }

         if (!var0) {
            Client.field621 = 2;
         } else {
            if (Client.field621 != 0) {
               WorldMapDecoration.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
            }

            class323.playPcmPlayers();
            class31.scene.clear();

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

            class323.playPcmPlayers();
            class137.method3197();
            var1 = class4.regionLandArchives.length;
            StructComposition.method3926();
            Language.method6931(true);
            int var5;
            if (!Client.isInInstance) {
               byte[] var16;
               for(var2 = 0; var2 < var1; ++var2) {
                  var3 = (WorldMapAreaData.regions[var2] >> 8) * 64 - WorldMapData_0.baseX * 64;
                  var4 = (WorldMapAreaData.regions[var2] & 255) * 64 - GameObject.baseY * 64;
                  var16 = class4.regionLandArchives[var2];
                  if (var16 != null) {
                     class323.playPcmPlayers();
                     WallDecoration.method5024(var16, var3, var4, class28.field164 * 8 - 48, class425.field4671 * 8 - 48, Client.collisionMaps);
                  }
               }

               for(var2 = 0; var2 < var1; ++var2) {
                  var3 = (WorldMapAreaData.regions[var2] >> 8) * 64 - WorldMapData_0.baseX * 64;
                  var4 = (WorldMapAreaData.regions[var2] & 255) * 64 - GameObject.baseY * 64;
                  var16 = class4.regionLandArchives[var2];
                  if (var16 == null && class425.field4671 < 800) {
                     class323.playPcmPlayers();
                     class122.method3044(var3, var4, 64, 64);
                  }
               }

               Language.method6931(true);

               for(var2 = 0; var2 < var1; ++var2) {
                  byte[] var15 = ObjectSound.regionMapArchives[var2];
                  if (var15 != null) {
                     var4 = (WorldMapAreaData.regions[var2] >> 8) * 64 - WorldMapData_0.baseX * 64;
                     var5 = (WorldMapAreaData.regions[var2] & 255) * 64 - GameObject.baseY * 64;
                     class323.playPcmPlayers();
                     class147.method3277(var15, var4, var5, class31.scene, Client.collisionMaps);
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
                  class323.playPcmPlayers();

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

                           for(int var12 = 0; var12 < WorldMapAreaData.regions.length; ++var12) {
                              if (WorldMapAreaData.regions[var12] == var11 && class4.regionLandArchives[var12] != null) {
                                 int var13 = (var9 - var3) * 8;
                                 int var14 = (var10 - var4) * 8;
                                 class19.method294(class4.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps);
                                 var18 = true;
                                 break;
                              }
                           }
                        }

                        if (!var18) {
                           TextureProvider.method4737(var2, var3 * 8, var4 * 8);
                        }
                     }
                  }
               }

               for(var2 = 0; var2 < 13; ++var2) {
                  for(var3 = 0; var3 < 13; ++var3) {
                     var4 = Client.instanceChunkTemplates[0][var2][var3];
                     if (var4 == -1) {
                        class122.method3044(var2 * 8, var3 * 8, 8, 8);
                     }
                  }
               }

               Language.method6931(true);

               for(var2 = 0; var2 < 4; ++var2) {
                  class323.playPcmPlayers();

                  for(var3 = 0; var3 < 13; ++var3) {
                     for(var4 = 0; var4 < 13; ++var4) {
                        var5 = Client.instanceChunkTemplates[var2][var3][var4];
                        if (var5 != -1) {
                           var6 = var5 >> 24 & 3;
                           var7 = var5 >> 1 & 3;
                           var8 = var5 >> 14 & 1023;
                           var9 = var5 >> 3 & 2047;
                           var10 = (var8 / 8 << 8) + var9 / 8;

                           for(var11 = 0; var11 < WorldMapAreaData.regions.length; ++var11) {
                              if (WorldMapAreaData.regions[var11] == var10 && ObjectSound.regionMapArchives[var11] != null) {
                                 Tiles.method2166(ObjectSound.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class31.scene, Client.collisionMaps);
                                 break;
                              }
                           }
                        }
                     }
                  }
               }
            }

            Language.method6931(true);
            class323.playPcmPlayers();
            class10.method98(class31.scene, Client.collisionMaps);
            Language.method6931(true);
            var2 = Tiles.Tiles_minPlane;
            if (var2 > GameEngine.Client_plane) {
               var2 = GameEngine.Client_plane;
            }

            if (var2 < GameEngine.Client_plane - 1) {
               var2 = GameEngine.Client_plane - 1;
            }

            if (Client.isLowDetail) {
               class31.scene.init(Tiles.Tiles_minPlane);
            } else {
               class31.scene.init(0);
            }

            for(var3 = 0; var3 < 104; ++var3) {
               for(var4 = 0; var4 < 104; ++var4) {
                  class121.updateItemPile(var3, var4);
               }
            }

            class323.playPcmPlayers();
            KeyHandler.method379();
            ObjectComposition.ObjectDefinition_cachedModelData.clear();
            PacketBufferNode var19;
            if (ScriptFrame.client.hasFrame()) {
               var19 = class330.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
               var19.packetBuffer.writeInt(1057001181);
               Client.packetWriter.addNode(var19);
            }

            if (!Client.isInInstance) {
               var3 = (class28.field164 - 6) / 8;
               var4 = (class28.field164 + 6) / 8;
               var5 = (class425.field4671 - 6) / 8;
               var6 = (class425.field4671 + 6) / 8;

               for(var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
                  for(var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
                     if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
                        GrandExchangeOfferTotalQuantityComparator.archive9.loadRegionFromName("m" + var7 + "_" + var8);
                        GrandExchangeOfferTotalQuantityComparator.archive9.loadRegionFromName("l" + var7 + "_" + var8);
                     }
                  }
               }
            }

            class138.updateGameState(30);
            class323.playPcmPlayers();
            Renderable.method4701();
            var19 = class330.getPacketBufferNode(ClientPacket.field3172, Client.packetWriter.isaacCipher);
            Client.packetWriter.addNode(var19);
            NPC.method2628();
         }
      }
   }
}
