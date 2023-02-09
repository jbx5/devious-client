import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
public class class277 {
   @ObfuscatedName("n")
   static ThreadPoolExecutor field3059;

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "([BB)V",
      garbageValue = "1"
   )
   @Export("ByteArrayPool_release")
   public static synchronized void ByteArrayPool_release(byte[] var0) {
      if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4450) {
         ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
      } else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4455) {
         ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
      } else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4456) {
         ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
      } else if (var0.length == 30000 && ByteArrayPool.field4449 < ByteArrayPool.field4452) {
         ByteArrayPool.field4453[++ByteArrayPool.field4449 - 1] = var0;
      } else {
         if (class9.ByteArrayPool_arrays != null) {
            for(int var1 = 0; var1 < class172.ByteArrayPool_alternativeSizes.length; ++var1) {
               if (var0.length == class172.ByteArrayPool_alternativeSizes[var1] && class132.ByteArrayPool_altSizeArrayCounts[var1] < class9.ByteArrayPool_arrays[var1].length) {
                  class9.ByteArrayPool_arrays[var1][class132.ByteArrayPool_altSizeArrayCounts[var1]++] = var0;
                  return;
               }
            }
         }

      }
   }

   @ObfuscatedName("hj")
   @ObfuscatedSignature(
      descriptor = "(ZLru;I)V",
      garbageValue = "-422348078"
   )
   @Export("loadRegions")
   static final void loadRegions(boolean var0, PacketBuffer var1) {
      Client.isInInstance = var0;
      int var2;
      int var4;
      int var5;
      int var6;
      int var7;
      if (!Client.isInInstance) {
         var2 = var1.readUnsignedShortLE();
         int var3 = var1.readUnsignedShortAddLE();
         var4 = var1.readUnsignedShort();
         GrandExchangeOffer.xteaKeys = new int[var4][4];

         for(var5 = 0; var5 < var4; ++var5) {
            for(var6 = 0; var6 < 4; ++var6) {
               GrandExchangeOffer.xteaKeys[var5][var6] = var1.readInt();
            }
         }

         MusicPatch.regions = new int[var4];
         Renderable.regionMapArchiveIds = new int[var4];
         class217.regionLandArchiveIds = new int[var4];
         class4.regionLandArchives = new byte[var4][];
         class323.regionMapArchives = new byte[var4][];
         var4 = 0;

         for(var5 = (var3 - 6) / 8; var5 <= (var3 + 6) / 8; ++var5) {
            for(var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) {
               var7 = var6 + (var5 << 8);
               MusicPatch.regions[var4] = var7;
               Renderable.regionMapArchiveIds[var4] = NetCache.archive9.getGroupId("m" + var5 + "_" + var6);
               class217.regionLandArchiveIds[var4] = NetCache.archive9.getGroupId("l" + var5 + "_" + var6);
               ++var4;
            }
         }

         class28.method432(var3, var2, true);
      } else {
         var2 = var1.readUnsignedShortLE();
         boolean var15 = var1.readUnsignedByte() == 1;
         var4 = var1.readUnsignedShort();
         var5 = var1.readUnsignedShort();
         var1.importIndex();

         int var8;
         int var9;
         for(var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 13; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  var9 = var1.readBits(1);
                  if (var9 == 1) {
                     Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
                  } else {
                     Client.instanceChunkTemplates[var6][var7][var8] = -1;
                  }
               }
            }
         }

         var1.exportIndex();
         GrandExchangeOffer.xteaKeys = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               GrandExchangeOffer.xteaKeys[var6][var7] = var1.readInt();
            }
         }

         MusicPatch.regions = new int[var5];
         Renderable.regionMapArchiveIds = new int[var5];
         class217.regionLandArchiveIds = new int[var5];
         class4.regionLandArchives = new byte[var5][];
         class323.regionMapArchives = new byte[var5][];
         var5 = 0;

         for(var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 13; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  var9 = Client.instanceChunkTemplates[var6][var7][var8];
                  if (var9 != -1) {
                     int var10 = var9 >> 14 & 1023;
                     int var11 = var9 >> 3 & 2047;
                     int var12 = (var10 / 8 << 8) + var11 / 8;

                     int var13;
                     for(var13 = 0; var13 < var5; ++var13) {
                        if (MusicPatch.regions[var13] == var12) {
                           var12 = -1;
                           break;
                        }
                     }

                     if (var12 != -1) {
                        MusicPatch.regions[var5] = var12;
                        var13 = var12 >> 8 & 255;
                        int var14 = var12 & 255;
                        Renderable.regionMapArchiveIds[var5] = NetCache.archive9.getGroupId("m" + var13 + "_" + var14);
                        class217.regionLandArchiveIds[var5] = NetCache.archive9.getGroupId("l" + var13 + "_" + var14);
                        ++var5;
                     }
                  }
               }
            }
         }

         class28.method432(var4, var2, !var15);
      }

   }
}
