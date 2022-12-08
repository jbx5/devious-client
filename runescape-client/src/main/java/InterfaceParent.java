import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 545250955
   )
   @Export("group")
   int group;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -829260005
   )
   @Export("type")
   int type;
   @ObfuscatedName("v")
   boolean field1067 = false;

   InterfaceParent() {
   }

   @ObfuscatedName("gw")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "30"
   )
   static final void method2251(boolean var0) {
      if (var0) {
         Client.field540 = Login.field930 ? class132.field1629 : class132.field1626;
      } else {
         Client.field540 = StructComposition.clientPreferences.method2436(Login.Login_username) ? class132.field1624 : class132.field1625;
      }

   }

   @ObfuscatedName("is")
   @ObfuscatedSignature(
      descriptor = "(ZLqx;I)V",
      garbageValue = "-560600334"
   )
   @Export("loadRegions")
   static final void loadRegions(boolean var0, PacketBuffer var1) {
      Client.isInInstance = var0;
      int var2;
      int var3;
      int var5;
      int var6;
      int var7;
      if (!Client.isInInstance) {
         var2 = var1.readUnsignedShortLE();
         var3 = var1.readUnsignedShortAddLE();
         int var4 = var1.readUnsignedShort();
         class104.xteaKeys = new int[var4][4];

         for(var5 = 0; var5 < var4; ++var5) {
            for(var6 = 0; var6 < 4; ++var6) {
               class104.xteaKeys[var5][var6] = var1.readInt();
            }
         }

         class205.regions = new int[var4];
         Client.regionMapArchiveIds = new int[var4];
         class379.regionLandArchiveIds = new int[var4];
         class133.regionLandArchives = new byte[var4][];
         class241.regionMapArchives = new byte[var4][];
         var4 = 0;

         for(var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
            for(var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
               var7 = var6 + (var5 << 8);
               class205.regions[var4] = var7;
               Client.regionMapArchiveIds[var4] = class4.archive9.getGroupId("m" + var5 + "_" + var6);
               class379.regionLandArchiveIds[var4] = class4.archive9.getGroupId("l" + var5 + "_" + var6);
               ++var4;
            }
         }

         class281.method5499(var2, var3, true);
      } else {
         var2 = var1.readUnsignedShortAddLE();
         var3 = var1.readUnsignedShortAddLE();
         boolean var15 = var1.readUnsignedByteAdd() == 1;
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
         class104.xteaKeys = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               class104.xteaKeys[var6][var7] = var1.readInt();
            }
         }

         class205.regions = new int[var5];
         Client.regionMapArchiveIds = new int[var5];
         class379.regionLandArchiveIds = new int[var5];
         class133.regionLandArchives = new byte[var5][];
         class241.regionMapArchives = new byte[var5][];
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
                        if (class205.regions[var13] == var12) {
                           var12 = -1;
                           break;
                        }
                     }

                     if (var12 != -1) {
                        class205.regions[var5] = var12;
                        var13 = var12 >> 8 & 255;
                        int var14 = var12 & 255;
                        Client.regionMapArchiveIds[var5] = class4.archive9.getGroupId("m" + var13 + "_" + var14);
                        class379.regionLandArchiveIds[var5] = class4.archive9.getGroupId("l" + var13 + "_" + var14);
                        ++var5;
                     }
                  }
               }
            }
         }

         class281.method5499(var2, var3, !var15);
      }

   }
}
