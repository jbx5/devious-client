import java.io.DataInputStream;
import java.io.File;
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

@ObfuscatedName("di")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
   @ObfuscatedName("f")
   final Thread field1410 = new Thread(this);
   @ObfuscatedName("w")
   @Export("isClosed")
   volatile boolean isClosed;
   @ObfuscatedName("v")
   @Export("requests")
   Queue requests = new LinkedList();
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 2025768381
   )
   int field1406;

   UrlRequester(int var1) {
      this.field1410.setPriority(1);
      this.field1410.start();
      this.field1406 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ldg;I)V",
      garbageValue = "1626777935"
   )
   abstract void vmethod2875(UrlRequest var1) throws IOException;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URLConnection;I)V",
      garbageValue = "1863650112"
   )
   void method2855(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1406);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URLConnection;Ldg;I)V",
      garbageValue = "635566150"
   )
   void method2859(URLConnection var1, UrlRequest var2) {
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
            byte[] var6 = ClientPacket.ByteArrayPool_getArray(5000);

            byte[] var8;
            for(int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) {
               var8 = new byte[var4.length + var7];
               System.arraycopy(var4, 0, var8, 0, var4.length);
               System.arraycopy(var6, 0, var8, var4.length, var7);
            }

            class277.ByteArrayPool_release(var6);
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

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URL;I)Ldg;",
      garbageValue = "-1293624183"
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

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1651940663"
   )
   @Export("close")
   public void close() {
      this.isClosed = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field1410.join();
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

            this.vmethod2875(var1);
         } catch (Exception var7) {
            class121.RunException_sendStackTrace((String)null, var7);
         }
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Lqr;",
      garbageValue = "9"
   )
   @Export("getPreferencesFile")
   public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
      File var3 = new File(Ignored.cacheDir, "preferences" + var0 + ".dat");
      if (var3.exists()) {
         try {
            AccessFile var10 = new AccessFile(var3, "rw", 10000L);
            return var10;
         } catch (IOException var9) {
         }
      }

      String var4 = "";
      if (class86.cacheGamebuild == 33) {
         var4 = "_rc";
      } else if (class86.cacheGamebuild == 34) {
         var4 = "_wip";
      }

      File var5 = new File(UserComparator4.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      AccessFile var6;
      if (!var2 && var5.exists()) {
         try {
            var6 = new AccessFile(var5, "rw", 10000L);
            return var6;
         } catch (IOException var8) {
         }
      }

      try {
         var6 = new AccessFile(var3, "rw", 10000L);
         return var6;
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)Lgf;",
      garbageValue = "1042587763"
   )
   @Export("KitDefinition_get")
   public static KitDefinition KitDefinition_get(int var0) {
      KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
         var1 = new KitDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         KitDefinition.KitDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lda;FI)F",
      garbageValue = "-1354016584"
   )
   static float method2874(class125 var0, float var1) {
      if (var0 != null && var0.method3060() != 0) {
         if (var1 < (float)var0.field1524[0].field1474) {
            return var0.field1522 == class123.field1502 ? var0.field1524[0].field1467 : Messages.method2821(var0, var1, true);
         } else if (var1 > (float)var0.field1524[var0.method3060() - 1].field1474) {
            return var0.field1541 == class123.field1502 ? var0.field1524[var0.method3060() - 1].field1467 : Messages.method2821(var0, var1, false);
         } else if (var0.field1521) {
            return var0.field1524[0].field1467;
         } else {
            class120 var2 = var0.method3049(var1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
               return 0.0F;
            } else {
               if (0.0 == (double)var2.field1473 && 0.0 == (double)var2.field1472) {
                  var3 = true;
               } else if (var2.field1473 == Float.MAX_VALUE && var2.field1472 == Float.MAX_VALUE) {
                  var4 = true;
               } else if (var2.field1468 != null) {
                  if (var0.field1530) {
                     float var5 = (float)var2.field1474;
                     float var9 = var2.field1467;
                     float var6 = var5 + 0.33333334F * var2.field1473;
                     float var10 = var2.field1472 * 0.33333334F + var9;
                     float var8 = (float)var2.field1468.field1474;
                     float var12 = var2.field1468.field1467;
                     float var7 = var8 - 0.33333334F * var2.field1468.field1469;
                     float var11 = var12 - var2.field1468.field1470 * 0.33333334F;
                     if (var0.field1545) {
                        float var15 = var10;
                        float var16 = var11;
                        if (var0 != null) {
                           float var17 = var8 - var5;
                           if (0.0 != (double)var17) {
                              float var18 = var6 - var5;
                              float var19 = var7 - var5;
                              float[] var20 = new float[]{var18 / var17, var19 / var17};
                              var0.field1525 = var20[0] == 0.33333334F && var20[1] == 0.6666667F;
                              float var21 = var20[0];
                              float var22 = var20[1];
                              if ((double)var20[0] < 0.0) {
                                 var20[0] = 0.0F;
                              }

                              if ((double)var20[1] > 1.0) {
                                 var20[1] = 1.0F;
                              }

                              if ((double)var20[0] > 1.0 || var20[1] < -1.0F) {
                                 var20[1] = 1.0F - var20[1];
                                 if (var20[0] < 0.0F) {
                                    var20[0] = 0.0F;
                                 }

                                 if (var20[1] < 0.0F) {
                                    var20[1] = 0.0F;
                                 }

                                 if (var20[0] > 1.0F || var20[1] > 1.0F) {
                                    float var23 = (float)(((double)var20[1] - 2.0) * (double)var20[1] + (double)((var20[1] + (var20[0] - 2.0F)) * var20[0]) + 1.0);
                                    if (var23 + class121.field1479 > 0.0F) {
                                       if (class121.field1479 + var20[0] < 1.3333334F) {
                                          float var24 = var20[0] - 2.0F;
                                          float var25 = var20[0] - 1.0F;
                                          float var26 = (float)Math.sqrt((double)(var24 * var24 - 4.0F * var25 * var25));
                                          float var27 = 0.5F * (-var24 + var26);
                                          if (var20[1] + class121.field1479 > var27) {
                                             var20[1] = var27 - class121.field1479;
                                          } else {
                                             var27 = (-var24 - var26) * 0.5F;
                                             if (var20[1] < var27 + class121.field1479) {
                                                var20[1] = class121.field1479 + var27;
                                             }
                                          }
                                       } else {
                                          var20[0] = 1.3333334F - class121.field1479;
                                          var20[1] = 0.33333334F - class121.field1479;
                                       }
                                    }
                                 }

                                 var20[1] = 1.0F - var20[1];
                              }

                              float var10000;
                              if (var21 != var20[0]) {
                                 var10000 = var5 + var17 * var20[0];
                                 if ((double)var21 != 0.0) {
                                    var15 = var9 + (var10 - var9) * var20[0] / var21;
                                 }
                              }

                              if (var22 != var20[1]) {
                                 var10000 = var5 + var17 * var20[1];
                                 if ((double)var22 != 1.0) {
                                    var16 = (float)((double)var12 - (1.0 - (double)var20[1]) * (double)(var12 - var11) / (1.0 - (double)var22));
                                 }
                              }

                              var0.field1520 = var5;
                              var0.field1527 = var8;
                              GrandExchangeOfferOwnWorldComparator.method1202(0.0F, var20[0], var20[1], 1.0F, var0);
                              FriendSystem.method1909(var9, var15, var16, var12, var0);
                           }
                        }
                     } else {
                        ScriptFrame.method1155(var0, var5, var6, var7, var8, var9, var10, var11, var12);
                     }

                     var0.field1530 = false;
                  }
               } else {
                  var3 = true;
               }

               if (var3) {
                  return var2.field1467;
               } else if (var4) {
                  return (float)var2.field1474 != var1 && var2.field1468 != null ? var2.field1468.field1467 : var2.field1467;
               } else {
                  return var0.field1545 ? DynamicObject.method2202(var0, var1) : class382.method7405(var0, var1);
               }
            }
         }
      } else {
         return 0.0F;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)[Lde;",
      garbageValue = "1673828737"
   )
   static class123[] method2852() {
      return new class123[]{class123.field1502, class123.field1504, class123.field1503, class123.field1506, class123.field1505};
   }
}
