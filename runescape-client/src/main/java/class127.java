import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
public class class127 implements MouseWheel {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lec;"
   )
   static final class127 field1545 = new class127(0, 0, (String)null, -1, -1);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lec;"
   )
   static final class127 field1547 = new class127(1, 1, (String)null, 0, 2);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lec;"
   )
   static final class127 field1546 = new class127(2, 2, (String)null, 1, 2);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lec;"
   )
   static final class127 field1544 = new class127(3, 3, (String)null, 2, 2);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lec;"
   )
   static final class127 field1566 = new class127(4, 4, (String)null, 3, 1);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lec;"
   )
   static final class127 field1560 = new class127(5, 5, (String)null, 4, 1);
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lec;"
   )
   static final class127 field1550 = new class127(6, 6, (String)null, 5, 1);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lec;"
   )
   static final class127 field1551 = new class127(7, 7, (String)null, 6, 3);
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lec;"
   )
   static final class127 field1552 = new class127(8, 8, (String)null, 7, 3);
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lec;"
   )
   static final class127 field1553 = new class127(9, 9, (String)null, 8, 3);
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lec;"
   )
   static final class127 field1554 = new class127(10, 10, (String)null, 0, 7);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lec;"
   )
   static final class127 field1548 = new class127(11, 11, (String)null, 1, 7);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lec;"
   )
   static final class127 field1556 = new class127(12, 12, (String)null, 2, 7);
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lec;"
   )
   static final class127 field1549 = new class127(13, 13, (String)null, 3, 7);
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Lec;"
   )
   static final class127 field1555 = new class127(14, 14, (String)null, 4, 7);
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Lec;"
   )
   static final class127 field1559 = new class127(15, 15, (String)null, 5, 7);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lec;"
   )
   static final class127 field1558 = new class127(16, 16, (String)null, 0, 5);
   @ObfuscatedName("gc")
   @ObfuscatedGetter(
      intValue = 814421223
   )
   @Export("js5Port")
   static int js5Port;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 551837117
   )
   final int field1561;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1158217209
   )
   final int field1562;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1204354247
   )
   final int field1563;

   @ObfuscatedSignature(
      descriptor = "(IILjava/lang/String;II)V",
      garbageValue = "-1"
   )
   class127(int var1, int var2, String var3, int var4, int var5) {
      this.field1561 = var1;
      this.field1562 = var2;
      this.field1563 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "741942848"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field1562;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "12"
   )
   int method3105() {
      return this.field1563;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IZIZB)V",
      garbageValue = "-41"
   )
   @Export("sortWorldList")
   static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
      if (class31.World_worlds != null) {
         class13.doWorldSorting(0, class31.World_worlds.length - 1, var0, var1, var2, var3);
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1285226307"
   )
   public static void method3118() {
      ItemComposition.ItemDefinition_cachedSprites.clear();
   }

   @ObfuscatedName("js")
   @ObfuscatedSignature(
      descriptor = "(ZLsq;B)V",
      garbageValue = "24"
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
         int var3 = var1.readUnsignedShortLE();
         var4 = var1.readUnsignedShort();
         GameObject.xteaKeys = new int[var4][4];

         for(var5 = 0; var5 < var4; ++var5) {
            for(var6 = 0; var6 < 4; ++var6) {
               GameObject.xteaKeys[var5][var6] = var1.readInt();
            }
         }

         WorldMapAreaData.regions = new int[var4];
         FontName.regionMapArchiveIds = new int[var4];
         Archive.regionLandArchiveIds = new int[var4];
         class4.regionLandArchives = new byte[var4][];
         ObjectSound.regionMapArchives = new byte[var4][];
         var4 = 0;

         for(var5 = (var3 - 6) / 8; var5 <= (var3 + 6) / 8; ++var5) {
            for(var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) {
               var7 = var6 + (var5 << 8);
               WorldMapAreaData.regions[var4] = var7;
               FontName.regionMapArchiveIds[var4] = GrandExchangeOfferTotalQuantityComparator.archive9.getGroupId("m" + var5 + "_" + var6);
               Archive.regionLandArchiveIds[var4] = GrandExchangeOfferTotalQuantityComparator.archive9.getGroupId("l" + var5 + "_" + var6);
               ++var4;
            }
         }

         Decimator.method1135(var3, var2, true);
      } else {
         var2 = var1.readUnsignedShortLE();
         boolean var15 = var1.readUnsignedByte() == 1;
         var4 = var1.readUnsignedShortAddLE();
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
         GameObject.xteaKeys = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               GameObject.xteaKeys[var6][var7] = var1.readInt();
            }
         }

         WorldMapAreaData.regions = new int[var5];
         FontName.regionMapArchiveIds = new int[var5];
         Archive.regionLandArchiveIds = new int[var5];
         class4.regionLandArchives = new byte[var5][];
         ObjectSound.regionMapArchives = new byte[var5][];
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
                        if (WorldMapAreaData.regions[var13] == var12) {
                           var12 = -1;
                           break;
                        }
                     }

                     if (var12 != -1) {
                        WorldMapAreaData.regions[var5] = var12;
                        var13 = var12 >> 8 & 255;
                        int var14 = var12 & 255;
                        FontName.regionMapArchiveIds[var5] = GrandExchangeOfferTotalQuantityComparator.archive9.getGroupId("m" + var13 + "_" + var14);
                        Archive.regionLandArchiveIds[var5] = GrandExchangeOfferTotalQuantityComparator.archive9.getGroupId("l" + var13 + "_" + var14);
                        ++var5;
                     }
                  }
               }
            }
         }

         Decimator.method1135(var2, var4, !var15);
      }

   }

   @ObfuscatedName("mu")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "63"
   )
   @Export("runIntfCloseListeners")
   static final void runIntfCloseListeners(int var0, int var1) {
      if (SoundSystem.loadInterface(var0)) {
         class143.runComponentCloseListeners(VerticalAlignment.Widget_interfaceComponents[var0], var1);
      }
   }
}
