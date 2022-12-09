import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
   @ObfuscatedName("h")
   final Thread field1440 = new Thread(this);
   @ObfuscatedName("e")
   @Export("isClosed")
   volatile boolean isClosed;
   @ObfuscatedName("v")
   @Export("requests")
   Queue requests = new LinkedList();
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -2031725395
   )
   int field1437;

   UrlRequester(int var1) {
      this.field1440.setPriority(1);
      this.field1440.start();
      this.field1437 = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ldm;I)V",
      garbageValue = "756674113"
   )
   abstract void vmethod2773(UrlRequest var1) throws IOException;

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URLConnection;I)V",
      garbageValue = "-572226816"
   )
   void method2747(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1437);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URLConnection;Ldm;B)V",
      garbageValue = "-37"
   )
   void method2754(URLConnection var1, UrlRequest var2) {
      DataInputStream var3 = null;

      try {
         int var5 = var1.getContentLength();
         var3 = new DataInputStream(var1.getInputStream());
         byte[] var4;
         if (var5 >= 0) {
            var4 = new byte[var5];
            var3.readFully(var4);
         } else {
            var4 = new byte[0];
            byte[] var6 = ItemContainer.ByteArrayPool_getArray(5000);

            byte[] var8;
            for(int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) {
               var8 = new byte[var4.length + var7];
               System.arraycopy(var4, 0, var8, 0, var4.length);
               System.arraycopy(var6, 0, var8, var4.length, var7);
            }

            class200.ByteArrayPool_release(var6);
         }

         var2.response0 = var4;
      } catch (IOException var10) {
      }

      if (var3 != null) {
         try {
            var3.close();
         } catch (IOException var9) {
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URL;B)Ldm;",
      garbageValue = "1"
   )
   @Export("request")
   public UrlRequest request(URL var1) {
      UrlRequest var2 = new UrlRequest(var1);
      synchronized(this) {
         this.requests.add(var2);
         this.notify();
         return var2;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-73462571"
   )
   @Export("close")
   public void close() {
      this.isClosed = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field1440.join();
      } catch (InterruptedException var4) {
      }

   }

   public void run() {
      while(!this.isClosed) {
         try {
            UrlRequest var1;
            synchronized(this) {
               var1 = (UrlRequest)this.requests.poll();
               if (var1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var5) {
                  }
                  continue;
               }
            }

            this.vmethod2773(var1);
         } catch (Exception var7) {
            class132.RunException_sendStackTrace((String)null, var7);
         }
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "8"
   )
   static void method2769() {
      for(ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
         if (var0.stream1 != null) {
            ApproximateRouteStrategy.pcmStreamMixer.removeSubStream(var0.stream1);
            var0.stream1 = null;
         }

         if (var0.stream2 != null) {
            ApproximateRouteStrategy.pcmStreamMixer.removeSubStream(var0.stream2);
            var0.stream2 = null;
         }
      }

      ObjectSound.objectSounds.clear();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lly;Lly;ZI)V",
      garbageValue = "-414686361"
   )
   public static void method2770(AbstractArchive var0, AbstractArchive var1, boolean var2) {
      ObjectComposition.ObjectDefinition_archive = var0;
      SoundSystem.ObjectDefinition_modelsArchive = var1;
      ObjectComposition.ObjectDefinition_isLowDetail = var2;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(IIIIIILhc;Lgw;I)V",
      garbageValue = "14932540"
   )
   @Export("addObjects")
   static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
      if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) {
         if (var0 < Tiles.Tiles_minPlane) {
            Tiles.Tiles_minPlane = var0;
         }

         ObjectComposition var8 = VarpDefinition.getObjectDefinition(var3);
         int var9;
         int var10;
         if (var4 != 1 && var4 != 3) {
            var9 = var8.sizeX;
            var10 = var8.sizeY;
         } else {
            var9 = var8.sizeY;
            var10 = var8.sizeX;
         }

         int var11;
         int var12;
         if (var9 + var1 <= 104) {
            var11 = (var9 >> 1) + var1;
            var12 = (var9 + 1 >> 1) + var1;
         } else {
            var11 = var1;
            var12 = var1 + 1;
         }

         int var13;
         int var14;
         if (var10 + var2 <= 104) {
            var13 = (var10 >> 1) + var2;
            var14 = var2 + (var10 + 1 >> 1);
         } else {
            var13 = var2;
            var14 = var2 + 1;
         }

         int[][] var15 = Tiles.Tiles_heights[var0];
         int var16 = var15[var11][var14] + var15[var12][var13] + var15[var11][var13] + var15[var12][var14] >> 2;
         int var17 = (var1 << 7) + (var9 << 6);
         int var18 = (var2 << 7) + (var10 << 6);
         long var19 = GameEngine.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
         int var21 = var5 + (var4 << 6);
         if (var8.int3 == 1) {
            var21 += 256;
         }

         int var23;
         int var24;
         if (var8.hasSound()) {
            ObjectSound var22 = new ObjectSound();
            var22.plane = var0;
            var22.x = var1 * 128;
            var22.y = var2 * 128;
            var23 = var8.sizeX;
            var24 = var8.sizeY;
            if (var4 == 1 || var4 == 3) {
               var23 = var8.sizeY;
               var24 = var8.sizeX;
            }

            var22.maxX = (var23 + var1) * 16384;
            var22.maxY = (var24 + var2) * 128;
            var22.soundEffectId = var8.ambientSoundId;
            var22.field847 = var8.int7 * 128;
            var22.field842 = var8.int5;
            var22.field839 = var8.int6;
            var22.soundEffectIds = var8.soundEffectIds;
            if (var8.transforms != null) {
               var22.obj = var8;
               var22.set();
            }

            ObjectSound.objectSounds.addFirst(var22);
            if (var22.soundEffectIds != null) {
               var22.field850 = var22.field842 + (int)(Math.random() * (double)(var22.field839 - var22.field842));
            }
         }

         Object var34;
         if (var5 == 22) {
            if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
               if (var8.animationId == -1 && var8.transforms == null) {
                  var34 = var8.getEntity(22, var4, var15, var17, var16, var18);
               } else {
                  var34 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
               }

               var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var34, var19, var21);
               if (var8.interactType == 1 && var7 != null) {
                  var7.setBlockedByFloorDec(var1, var2);
               }

            }
         } else if (var5 != 10 && var5 != 11) {
            int[] var10000;
            if (var5 >= 12) {
               if (var8.animationId == -1 && var8.transforms == null) {
                  var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
               } else {
                  var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
               }

               var6.method4440(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21);
               if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                  var10000 = class159.field1816[var0][var1];
                  var10000[var2] |= 2340;
               }

               if (var8.interactType != 0 && var7 != null) {
                  var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
               }

            } else if (var5 == 0) {
               if (var8.animationId == -1 && var8.transforms == null) {
                  var34 = var8.getEntity(0, var4, var15, var17, var16, var18);
               } else {
                  var34 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
               }

               var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1032[var4], 0, var19, var21);
               if (var4 == 0) {
                  if (var8.clipped) {
                     Canvas.Tiles_underlays[var0][var1][var2] = 50;
                     Canvas.Tiles_underlays[var0][var1][var2 + 1] = 50;
                  }

                  if (var8.modelClipped) {
                     var10000 = class159.field1816[var0][var1];
                     var10000[var2] |= 585;
                  }
               } else if (var4 == 1) {
                  if (var8.clipped) {
                     Canvas.Tiles_underlays[var0][var1][var2 + 1] = 50;
                     Canvas.Tiles_underlays[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if (var8.modelClipped) {
                     var10000 = class159.field1816[var0][var1];
                     var10000[var2 + 1] |= 1170;
                  }
               } else if (var4 == 2) {
                  if (var8.clipped) {
                     Canvas.Tiles_underlays[var0][var1 + 1][var2] = 50;
                     Canvas.Tiles_underlays[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if (var8.modelClipped) {
                     var10000 = class159.field1816[var0][var1 + 1];
                     var10000[var2] |= 585;
                  }
               } else if (var4 == 3) {
                  if (var8.clipped) {
                     Canvas.Tiles_underlays[var0][var1][var2] = 50;
                     Canvas.Tiles_underlays[var0][var1 + 1][var2] = 50;
                  }

                  if (var8.modelClipped) {
                     var10000 = class159.field1816[var0][var1];
                     var10000[var2] |= 1170;
                  }
               }

               if (var8.interactType != 0 && var7 != null) {
                  var7.method4142(var1, var2, var5, var4, var8.boolean1);
               }

               if (var8.int2 != 16) {
                  var6.method4446(var0, var1, var2, var8.int2);
               }

            } else if (var5 == 1) {
               if (var8.animationId == -1 && var8.transforms == null) {
                  var34 = var8.getEntity(1, var4, var15, var17, var16, var18);
               } else {
                  var34 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
               }

               var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1036[var4], 0, var19, var21);
               if (var8.clipped) {
                  if (var4 == 0) {
                     Canvas.Tiles_underlays[var0][var1][var2 + 1] = 50;
                  } else if (var4 == 1) {
                     Canvas.Tiles_underlays[var0][var1 + 1][var2 + 1] = 50;
                  } else if (var4 == 2) {
                     Canvas.Tiles_underlays[var0][var1 + 1][var2] = 50;
                  } else if (var4 == 3) {
                     Canvas.Tiles_underlays[var0][var1][var2] = 50;
                  }
               }

               if (var8.interactType != 0 && var7 != null) {
                  var7.method4142(var1, var2, var5, var4, var8.boolean1);
               }

            } else {
               int var28;
               if (var5 == 2) {
                  var28 = var4 + 1 & 3;
                  Object var31;
                  Object var32;
                  if (var8.animationId == -1 && var8.transforms == null) {
                     var31 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18);
                     var32 = var8.getEntity(2, var28, var15, var17, var16, var18);
                  } else {
                     var31 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                     var32 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                  }

                  var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var31, (Renderable)var32, Tiles.field1032[var4], Tiles.field1032[var28], var19, var21);
                  if (var8.modelClipped) {
                     if (var4 == 0) {
                        var10000 = class159.field1816[var0][var1];
                        var10000[var2] |= 585;
                        var10000 = class159.field1816[var0][var1];
                        var10000[1 + var2] |= 1170;
                     } else if (var4 == 1) {
                        var10000 = class159.field1816[var0][var1];
                        var10000[var2 + 1] |= 1170;
                        var10000 = class159.field1816[var0][var1 + 1];
                        var10000[var2] |= 585;
                     } else if (var4 == 2) {
                        var10000 = class159.field1816[var0][var1 + 1];
                        var10000[var2] |= 585;
                        var10000 = class159.field1816[var0][var1];
                        var10000[var2] |= 1170;
                     } else if (var4 == 3) {
                        var10000 = class159.field1816[var0][var1];
                        var10000[var2] |= 1170;
                        var10000 = class159.field1816[var0][var1];
                        var10000[var2] |= 585;
                     }
                  }

                  if (var8.interactType != 0 && var7 != null) {
                     var7.method4142(var1, var2, var5, var4, var8.boolean1);
                  }

                  if (var8.int2 != 16) {
                     var6.method4446(var0, var1, var2, var8.int2);
                  }

               } else if (var5 == 3) {
                  if (var8.animationId == -1 && var8.transforms == null) {
                     var34 = var8.getEntity(3, var4, var15, var17, var16, var18);
                  } else {
                     var34 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                  }

                  var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1036[var4], 0, var19, var21);
                  if (var8.clipped) {
                     if (var4 == 0) {
                        Canvas.Tiles_underlays[var0][var1][var2 + 1] = 50;
                     } else if (var4 == 1) {
                        Canvas.Tiles_underlays[var0][var1 + 1][var2 + 1] = 50;
                     } else if (var4 == 2) {
                        Canvas.Tiles_underlays[var0][var1 + 1][var2] = 50;
                     } else if (var4 == 3) {
                        Canvas.Tiles_underlays[var0][var1][var2] = 50;
                     }
                  }

                  if (var8.interactType != 0 && var7 != null) {
                     var7.method4142(var1, var2, var5, var4, var8.boolean1);
                  }

               } else if (var5 == 9) {
                  if (var8.animationId == -1 && var8.transforms == null) {
                     var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
                  } else {
                     var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                  }

                  var6.method4440(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21);
                  if (var8.interactType != 0 && var7 != null) {
                     var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
                  }

                  if (var8.int2 != 16) {
                     var6.method4446(var0, var1, var2, var8.int2);
                  }

               } else if (var5 == 4) {
                  if (var8.animationId == -1 && var8.transforms == null) {
                     var34 = var8.getEntity(4, var4, var15, var17, var16, var18);
                  } else {
                     var34 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                  }

                  var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1032[var4], 0, 0, 0, var19, var21);
               } else {
                  Object var25;
                  long var29;
                  if (var5 == 5) {
                     var28 = 16;
                     var29 = var6.getBoundaryObjectTag(var0, var1, var2);
                     if (var29 != 0L) {
                        var28 = VarpDefinition.getObjectDefinition(Occluder.Entity_unpackID(var29)).int2;
                     }

                     if (var8.animationId == -1 && var8.transforms == null) {
                        var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
                     } else {
                        var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                     }

                     var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1032[var4], 0, var28 * Tiles.field1035[var4], var28 * Tiles.field1029[var4], var19, var21);
                  } else if (var5 == 6) {
                     var28 = 8;
                     var29 = var6.getBoundaryObjectTag(var0, var1, var2);
                     if (0L != var29) {
                        var28 = VarpDefinition.getObjectDefinition(Occluder.Entity_unpackID(var29)).int2 / 2;
                     }

                     if (var8.animationId == -1 && var8.transforms == null) {
                        var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
                     } else {
                        var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                     }

                     var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var28 * Tiles.field1037[var4], var28 * Tiles.field1025[var4], var19, var21);
                  } else if (var5 == 7) {
                     var23 = var4 + 2 & 3;
                     if (var8.animationId == -1 && var8.transforms == null) {
                        var34 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
                     } else {
                        var34 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                     }

                     var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, 256, var23, 0, 0, var19, var21);
                  } else if (var5 == 8) {
                     var28 = 8;
                     var29 = var6.getBoundaryObjectTag(var0, var1, var2);
                     if (0L != var29) {
                        var28 = VarpDefinition.getObjectDefinition(Occluder.Entity_unpackID(var29)).int2 / 2;
                     }

                     int var27 = var4 + 2 & 3;
                     Object var26;
                     if (var8.animationId == -1 && var8.transforms == null) {
                        var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
                        var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18);
                     } else {
                        var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                        var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                     }

                     var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var28 * Tiles.field1037[var4], var28 * Tiles.field1025[var4], var19, var21);
                  }
               }
            }
         } else {
            if (var8.animationId == -1 && var8.transforms == null) {
               var34 = var8.getEntity(10, var4, var15, var17, var16, var18);
            } else {
               var34 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
            }

            if (var34 != null && var6.method4440(var0, var1, var2, var16, var9, var10, (Renderable)var34, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
               var23 = 15;
               if (var34 instanceof Model) {
                  var23 = ((Model)var34).method4666() / 4;
                  if (var23 > 30) {
                     var23 = 30;
                  }
               }

               for(var24 = 0; var24 <= var9; ++var24) {
                  for(int var33 = 0; var33 <= var10; ++var33) {
                     if (var23 > Canvas.Tiles_underlays[var0][var24 + var1][var33 + var2]) {
                        Canvas.Tiles_underlays[var0][var24 + var1][var33 + var2] = (byte)var23;
                     }
                  }
               }
            }

            if (var8.interactType != 0 && var7 != null) {
               var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
            }

         }
      }
   }

   @ObfuscatedName("my")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "0"
   )
   static void method2748(String var0) {
      class133.field1635 = var0;

      try {
         String var1 = BuddyRankComparator.client.getParameter(Integer.toString(18));
         String var2 = BuddyRankComparator.client.getParameter(Integer.toString(13));
         String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
         if (var0.length() == 0) {
            var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         } else {
            var3 = var3 + "; Expires=" + JagexCache.method3467(Message.method1197() + 94608000000L) + "; Max-Age=" + 94608000L;
         }

         class27.method389(BuddyRankComparator.client, "document.cookie=\"" + var3 + "\"");
      } catch (Throwable var4) {
      }

   }
}
