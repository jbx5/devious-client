import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
   @ObfuscatedName("ed")
   @ObfuscatedSignature(
      descriptor = "Llx;"
   )
   @Export("archive6")
   static Archive archive6;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 120058479
   )
   @Export("id")
   int id;
   @ObfuscatedName("f")
   @Export("intReplaceValues")
   int[] intReplaceValues;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 599967177
   )
   @Export("size")
   int size;
   @ObfuscatedName("x")
   @Export("operations")
   int[] operations;
   @ObfuscatedName("h")
   @Export("creationErrors")
   int[] creationErrors;
   @ObfuscatedName("j")
   @Export("fields")
   Field[] fields;
   @ObfuscatedName("y")
   @Export("methods")
   Method[] methods;
   @ObfuscatedName("d")
   @Export("arguments")
   byte[][][] arguments;

   ReflectionCheck() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IB)Lgy;",
      garbageValue = "-39"
   )
   @Export("SpotAnimationDefinition_get")
   public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
      SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0);
         var1 = new SpotAnimationDefinition();
         var1.id = var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Llg;I)V",
      garbageValue = "1804403992"
   )
   public static void method716(AbstractArchive var0) {
      class357.InvDefinition_archive = var0;
   }

   @ObfuscatedName("ii")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "29"
   )
   static final void method714() {
      class323.method6271(false);
      Client.field557 = 0;
      boolean var0 = true;

      int var1;
      for(var1 = 0; var1 < GrandExchangeOfferOwnWorldComparator.regionLandArchives.length; ++var1) {
         if (class143.regionMapArchiveIds[var1] != -1 && GrandExchangeOfferOwnWorldComparator.regionLandArchives[var1] == null) {
            GrandExchangeOfferOwnWorldComparator.regionLandArchives[var1] = SecureRandomFuture.archive9.takeFile(class143.regionMapArchiveIds[var1], 0);
            if (GrandExchangeOfferOwnWorldComparator.regionLandArchives[var1] == null) {
               var0 = false;
               ++Client.field557;
            }
         }

         if (class13.regionLandArchiveIds[var1] != -1 && class9.regionMapArchives[var1] == null) {
            class9.regionMapArchives[var1] = SecureRandomFuture.archive9.takeFileEncrypted(class13.regionLandArchiveIds[var1], 0, KeyHandler.xteaKeys[var1]);
            if (class9.regionMapArchives[var1] == null) {
               var0 = false;
               ++Client.field557;
            }
         }
      }

      if (!var0) {
         Client.field582 = 1;
      } else {
         Client.field559 = 0;
         var0 = true;

         int var3;
         int var4;
         for(var1 = 0; var1 < GrandExchangeOfferOwnWorldComparator.regionLandArchives.length; ++var1) {
            byte[] var15 = class9.regionMapArchives[var1];
            if (var15 != null) {
               var3 = (RouteStrategy.regions[var1] >> 8) * 64 - KeyHandler.baseX * 64;
               var4 = (RouteStrategy.regions[var1] & 255) * 64 - class158.baseY * 64;
               if (Client.isInInstance) {
                  var3 = 10;
                  var4 = 10;
               }

               var0 &= CollisionMap.method4036(var15, var3, var4);
            }
         }

         if (!var0) {
            Client.field582 = 2;
         } else {
            if (Client.field582 != 0) {
               class145.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
            }

            class355.playPcmPlayers();
            class139.scene.clear();

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

            class355.playPcmPlayers();
            Script.method2120();
            var1 = GrandExchangeOfferOwnWorldComparator.regionLandArchives.length;
            class87.method2257();
            class323.method6271(true);
            int var5;
            if (!Client.isInInstance) {
               byte[] var14;
               for(var2 = 0; var2 < var1; ++var2) {
                  var3 = (RouteStrategy.regions[var2] >> 8) * 64 - KeyHandler.baseX * 64;
                  var4 = (RouteStrategy.regions[var2] & 255) * 64 - class158.baseY * 64;
                  var14 = GrandExchangeOfferOwnWorldComparator.regionLandArchives[var2];
                  if (var14 != null) {
                     class355.playPcmPlayers();
                     class21.method298(var14, var3, var4, class343.field4234 * 8 - 48, ServerPacket.field3133 * 8 - 48, Client.collisionMaps);
                  }
               }

               for(var2 = 0; var2 < var1; ++var2) {
                  var3 = (RouteStrategy.regions[var2] >> 8) * 64 - KeyHandler.baseX * 64;
                  var4 = (RouteStrategy.regions[var2] & 255) * 64 - class158.baseY * 64;
                  var14 = GrandExchangeOfferOwnWorldComparator.regionLandArchives[var2];
                  if (var14 == null && ServerPacket.field3133 < 800) {
                     class355.playPcmPlayers();
                     WorldMapCacheName.method5228(var3, var4, 64, 64);
                  }
               }

               class323.method6271(true);

               for(var2 = 0; var2 < var1; ++var2) {
                  byte[] var13 = class9.regionMapArchives[var2];
                  if (var13 != null) {
                     var4 = (RouteStrategy.regions[var2] >> 8) * 64 - KeyHandler.baseX * 64;
                     var5 = (RouteStrategy.regions[var2] & 255) * 64 - class158.baseY * 64;
                     class355.playPcmPlayers();
                     class361.method6839(var13, var4, var5, class139.scene, Client.collisionMaps);
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
                  class355.playPcmPlayers();

                  for(var3 = 0; var3 < 13; ++var3) {
                     for(var4 = 0; var4 < 13; ++var4) {
                        boolean var16 = false;
                        var6 = Client.instanceChunkTemplates[var2][var3][var4];
                        if (var6 != -1) {
                           var7 = var6 >> 24 & 3;
                           var8 = var6 >> 1 & 3;
                           var9 = var6 >> 14 & 1023;
                           var10 = var6 >> 3 & 2047;
                           var11 = (var9 / 8 << 8) + var10 / 8;

                           for(int var12 = 0; var12 < RouteStrategy.regions.length; ++var12) {
                              if (RouteStrategy.regions[var12] == var11 && GrandExchangeOfferOwnWorldComparator.regionLandArchives[var12] != null) {
                                 HitSplatDefinition.method3717(GrandExchangeOfferOwnWorldComparator.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, Client.collisionMaps);
                                 var16 = true;
                                 break;
                              }
                           }
                        }

                        if (!var16) {
                           DynamicObject.method2131(var2, var3 * 8, var4 * 8);
                        }
                     }
                  }
               }

               for(var2 = 0; var2 < 13; ++var2) {
                  for(var3 = 0; var3 < 13; ++var3) {
                     var4 = Client.instanceChunkTemplates[0][var2][var3];
                     if (var4 == -1) {
                        WorldMapCacheName.method5228(var2 * 8, var3 * 8, 8, 8);
                     }
                  }
               }

               class323.method6271(true);

               for(var2 = 0; var2 < 4; ++var2) {
                  class355.playPcmPlayers();

                  for(var3 = 0; var3 < 13; ++var3) {
                     for(var4 = 0; var4 < 13; ++var4) {
                        var5 = Client.instanceChunkTemplates[var2][var3][var4];
                        if (var5 != -1) {
                           var6 = var5 >> 24 & 3;
                           var7 = var5 >> 1 & 3;
                           var8 = var5 >> 14 & 1023;
                           var9 = var5 >> 3 & 2047;
                           var10 = (var8 / 8 << 8) + var9 / 8;

                           for(var11 = 0; var11 < RouteStrategy.regions.length; ++var11) {
                              if (RouteStrategy.regions[var11] == var10 && class9.regionMapArchives[var11] != null) {
                                 Tiles.method2170(class9.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class139.scene, Client.collisionMaps);
                                 break;
                              }
                           }
                        }
                     }
                  }
               }
            }

            class323.method6271(true);
            class355.playPcmPlayers();
            class305.method6206(class139.scene, Client.collisionMaps);
            class323.method6271(true);
            var2 = Tiles.Tiles_minPlane;
            if (var2 > ApproximateRouteStrategy.Client_plane) {
               var2 = ApproximateRouteStrategy.Client_plane;
            }

            if (var2 < ApproximateRouteStrategy.Client_plane - 1) {
               var2 = ApproximateRouteStrategy.Client_plane - 1;
            }

            if (Client.isLowDetail) {
               class139.scene.init(Tiles.Tiles_minPlane);
            } else {
               class139.scene.init(0);
            }

            for(var3 = 0; var3 < 104; ++var3) {
               for(var4 = 0; var4 < 104; ++var4) {
                  class162.updateItemPile(var3, var4);
               }
            }

            class355.playPcmPlayers();
            Projectile.method2096();
            ObjectComposition.ObjectDefinition_cachedModelData.clear();
            PacketBufferNode var17;
            if (ClanChannelMember.client.hasFrame()) {
               var17 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
               var17.packetBuffer.writeInt(1057001181);
               Client.packetWriter.addNode(var17);
            }

            if (!Client.isInInstance) {
               var3 = (class343.field4234 - 6) / 8;
               var4 = (class343.field4234 + 6) / 8;
               var5 = (ServerPacket.field3133 - 6) / 8;
               var6 = (ServerPacket.field3133 + 6) / 8;

               for(var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
                  for(var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
                     if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
                        SecureRandomFuture.archive9.loadRegionFromName("m" + var7 + "_" + var8);
                        SecureRandomFuture.archive9.loadRegionFromName("l" + var7 + "_" + var8);
                     }
                  }
               }
            }

            class21.updateGameState(30);
            class355.playPcmPlayers();
            Interpreter.method2003();
            var17 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3093, Client.packetWriter.isaacCipher);
            Client.packetWriter.addNode(var17);
            class354.method6768();
         }
      }
   }

   @ObfuscatedName("ma")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-53"
   )
   static void method713(int var0) {
      if (var0 != Client.loginState) {
         Client.loginState = var0;
      }
   }
}
