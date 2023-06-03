import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public class class19 implements Callable {
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      longValue = -2034572934949977087L
   )
   public static long field100;
   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      descriptor = "Ltj;"
   )
   static IndexedSprite field97;
   @ObfuscatedName("fc")
   @ObfuscatedSignature(
      descriptor = "Lgu;"
   )
   @Export("js5SocketTask")
   static Task js5SocketTask;
   @ObfuscatedName("kc")
   @ObfuscatedSignature(
      descriptor = "[Ltm;"
   )
   @Export("mapDotSprites")
   static SpritePixels[] mapDotSprites;
   @ObfuscatedName("om")
   @ObfuscatedSignature(
      descriptor = "Lmb;"
   )
   static Widget field99;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lao;"
   )
   final class10 field96;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lac;"
   )
   final class14 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lac;Lao;)V"
   )
   class19(class14 var1, class10 var2) {
      this.this$0 = var1;
      this.field96 = var2;
   }

   public Object call() throws Exception {
      try {
         while(this.field96.method101()) {
            FloorDecoration.method4357(10L);
         }
      } catch (IOException var2) {
         return new class20("Error servicing REST query: " + var2.getMessage());
      }

      return this.field96.method95();
   }

   @ObfuscatedName("jp")
   @ObfuscatedSignature(
      descriptor = "(ZLtl;I)V",
      garbageValue = "-1158341435"
   )
   @Export("loadRegions")
   static final void loadRegions(boolean var0, PacketBuffer var1) {
      Client.isInInstance = var0;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      if (!Client.isInInstance) {
         int var2 = var1.readUnsignedShortAdd();
         var3 = var1.readUnsignedShortAddLE();
         var4 = var1.readUnsignedShort();
         SpotAnimationDefinition.xteaKeys = new int[var4][4];

         for(var5 = 0; var5 < var4; ++var5) {
            for(var6 = 0; var6 < 4; ++var6) {
               SpotAnimationDefinition.xteaKeys[var5][var6] = var1.readInt();
            }
         }

         SceneTilePaint.regions = new int[var4];
         WorldMapCacheName.regionMapArchiveIds = new int[var4];
         class130.regionLandArchiveIds = new int[var4];
         WorldMapLabelSize.regionLandArchives = new byte[var4][];
         class74.regionMapArchives = new byte[var4][];
         var4 = 0;

         for(var5 = (var3 - 6) / 8; var5 <= (var3 + 6) / 8; ++var5) {
            for(var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) {
               var7 = var6 + (var5 << 8);
               SceneTilePaint.regions[var4] = var7;
               WorldMapCacheName.regionMapArchiveIds[var4] = class305.archive9.getGroupId("m" + var5 + "_" + var6);
               class130.regionLandArchiveIds[var4] = class305.archive9.getGroupId("l" + var5 + "_" + var6);
               ++var4;
            }
         }

         ReflectionCheck.method670(var3, var2, true);
      } else {
         boolean var15 = var1.readUnsignedByte() == 1;
         var3 = var1.readUnsignedShortAddLE();
         var4 = var1.readUnsignedShortAdd();
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
         SpotAnimationDefinition.xteaKeys = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               SpotAnimationDefinition.xteaKeys[var6][var7] = var1.readInt();
            }
         }

         SceneTilePaint.regions = new int[var5];
         WorldMapCacheName.regionMapArchiveIds = new int[var5];
         class130.regionLandArchiveIds = new int[var5];
         WorldMapLabelSize.regionLandArchives = new byte[var5][];
         class74.regionMapArchives = new byte[var5][];
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
                        if (SceneTilePaint.regions[var13] == var12) {
                           var12 = -1;
                           break;
                        }
                     }

                     if (var12 != -1) {
                        SceneTilePaint.regions[var5] = var12;
                        var13 = var12 >> 8 & 255;
                        int var14 = var12 & 255;
                        WorldMapCacheName.regionMapArchiveIds[var5] = class305.archive9.getGroupId("m" + var13 + "_" + var14);
                        class130.regionLandArchiveIds[var5] = class305.archive9.getGroupId("l" + var13 + "_" + var14);
                        ++var5;
                     }
                  }
               }
            }
         }

         ReflectionCheck.method670(var4, var3, !var15);
      }

   }
}
