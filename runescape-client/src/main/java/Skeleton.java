import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
@Implements("Skeleton")
public class Skeleton extends Node {
   @ObfuscatedName("ub")
   @ObfuscatedGetter(
      intValue = 1270192117
   )
   static int field2505;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 1593065305
   )
   @Export("id")
   int id;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -2009602779
   )
   @Export("count")
   int count;
   @ObfuscatedName("aq")
   @Export("transformTypes")
   int[] transformTypes;
   @ObfuscatedName("ap")
   @Export("labels")
   int[][] labels;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Lik;"
   )
   class220 field2504;

   public Skeleton(int var1, byte[] var2) {
      this.id = var1;
      Buffer var3 = new Buffer(var2);
      this.count = var3.readUnsignedByte();
      this.transformTypes = new int[this.count];
      this.labels = new int[this.count][];

      int var4;
      for(var4 = 0; var4 < this.count; ++var4) {
         this.transformTypes[var4] = var3.readUnsignedByte();
      }

      for(var4 = 0; var4 < this.count; ++var4) {
         this.labels[var4] = new int[var3.readUnsignedByte()];
      }

      for(var4 = 0; var4 < this.count; ++var4) {
         for(int var5 = 0; var5 < this.labels[var4].length; ++var5) {
            this.labels[var4][var5] = var3.readUnsignedByte();
         }
      }

      if (var3.offset < var3.array.length) {
         var4 = var3.readUnsignedShort();
         if (var4 > 0) {
            this.field2504 = new class220(var3, var4);
         }
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1955897689"
   )
   public int method4380() {
      return this.count;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)Lik;",
      garbageValue = "1670591230"
   )
   public class220 method4377() {
      return this.field2504;
   }

   @ObfuscatedName("ia")
   @ObfuscatedSignature(
      descriptor = "(ZLsq;I)V",
      garbageValue = "900523512"
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
         var2 = var1.readUnsignedShortAddLE();
         int var3 = var1.readUnsignedShortAdd();
         var4 = var1.readUnsignedShort();
         ModelData0.xteaKeys = new int[var4][4];

         for(var5 = 0; var5 < var4; ++var5) {
            for(var6 = 0; var6 < 4; ++var6) {
               ModelData0.xteaKeys[var5][var6] = var1.readInt();
            }
         }

         class12.regions = new int[var4];
         PacketBuffer.regionMapArchiveIds = new int[var4];
         class123.regionLandArchiveIds = new int[var4];
         GrandExchangeOfferOwnWorldComparator.regionLandArchives = new byte[var4][];
         class372.regionMapArchives = new byte[var4][];
         var4 = 0;

         for(var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
            for(var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
               var7 = var6 + (var5 << 8);
               class12.regions[var4] = var7;
               PacketBuffer.regionMapArchiveIds[var4] = ClientPreferences.archive9.getGroupId("m" + var5 + "_" + var6);
               class123.regionLandArchiveIds[var4] = ClientPreferences.archive9.getGroupId("l" + var5 + "_" + var6);
               ++var4;
            }
         }

         Coord.method5773(var2, var3, true);
      } else {
         var2 = var1.readUnsignedShortAddLE();
         boolean var15 = var1.readUnsignedByteNeg() == 1;
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
         ModelData0.xteaKeys = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               ModelData0.xteaKeys[var6][var7] = var1.readInt();
            }
         }

         class12.regions = new int[var5];
         PacketBuffer.regionMapArchiveIds = new int[var5];
         class123.regionLandArchiveIds = new int[var5];
         GrandExchangeOfferOwnWorldComparator.regionLandArchives = new byte[var5][];
         class372.regionMapArchives = new byte[var5][];
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
                        if (class12.regions[var13] == var12) {
                           var12 = -1;
                           break;
                        }
                     }

                     if (var12 != -1) {
                        class12.regions[var5] = var12;
                        var13 = var12 >> 8 & 255;
                        int var14 = var12 & 255;
                        PacketBuffer.regionMapArchiveIds[var5] = ClientPreferences.archive9.getGroupId("m" + var13 + "_" + var14);
                        class123.regionLandArchiveIds[var5] = ClientPreferences.archive9.getGroupId("l" + var13 + "_" + var14);
                        ++var5;
                     }
                  }
               }
            }
         }

         Coord.method5773(var2, var4, !var15);
      }

   }

   @ObfuscatedName("lu")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2135079356"
   )
   static final void method4384(int var0) {
      var0 = Math.max(Math.min(var0, 100), 0);
      var0 = 100 - var0;
      float var1 = (float)var0 / 200.0F + 0.5F;
      class7.method54((double)var1);
   }
}
