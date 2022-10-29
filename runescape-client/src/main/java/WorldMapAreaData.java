import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
   @ObfuscatedName("p")
   @Export("worldMapData0Set")
   HashSet worldMapData0Set;
   @ObfuscatedName("b")
   @Export("worldMapData1Set")
   HashSet worldMapData1Set;
   @ObfuscatedName("o")
   @Export("iconList")
   List iconList;

   WorldMapAreaData() {
   }

   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "(Lqr;Lqr;IZB)V",
      garbageValue = "0"
   )
   @Export("init")
   void init(Buffer var1, Buffer var2, int var3, boolean var4) {
      this.read(var1, var3);
      int var5 = var2.readUnsignedShort();
      this.worldMapData0Set = new HashSet(var5);

      int var6;
      for(var6 = 0; var6 < var5; ++var6) {
         WorldMapData_0 var7 = new WorldMapData_0();

         try {
            var7.init(var2);
         } catch (IllegalStateException var12) {
            continue;
         }

         this.worldMapData0Set.add(var7);
      }

      var6 = var2.readUnsignedShort();
      this.worldMapData1Set = new HashSet(var6);

      for(int var10 = 0; var10 < var6; ++var10) {
         WorldMapData_1 var8 = new WorldMapData_1();

         try {
            var8.init(var2);
         } catch (IllegalStateException var11) {
            continue;
         }

         this.worldMapData1Set.add(var8);
      }

      this.initIconsList(var2, var4);
   }

   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "(Lqr;ZB)V",
      garbageValue = "99"
   )
   @Export("initIconsList")
   void initIconsList(Buffer var1, boolean var2) {
      this.iconList = new LinkedList();
      int var3 = var1.readUnsignedShort();

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1.readNullableLargeSmart();
         Coord var6 = new Coord(var1.readInt());
         boolean var7 = var1.readUnsignedByte() == 1;
         if (var2 || !var7) {
            this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null));
         }
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "-27"
   )
   static int method5266(int var0, int var1) {
      ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var2 == null) {
         return 0;
      } else if (var1 == -1) {
         return 0;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < var2.quantities.length; ++var4) {
            if (var2.ids[var4] == var1) {
               var3 += var2.quantities[var4];
            }
         }

         return var3;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-55640084"
   )
   public static void method5265(int var0) {
      if (var0 != -1) {
         if (MusicPatchPcmStream.Widget_loadedInterfaces[var0]) {
            UserComparator8.Widget_archive.clearFilesGroup(var0);
            if (Widget.Widget_interfaceComponents[var0] != null) {
               boolean var1 = true;

               for(int var2 = 0; var2 < Widget.Widget_interfaceComponents[var0].length; ++var2) {
                  if (Widget.Widget_interfaceComponents[var0][var2] != null) {
                     if (Widget.Widget_interfaceComponents[var0][var2].type != 2) {
                        Widget.Widget_interfaceComponents[var0][var2] = null;
                     } else {
                        var1 = false;
                     }
                  }
               }

               if (var1) {
                  Widget.Widget_interfaceComponents[var0] = null;
               }

               MusicPatchPcmStream.Widget_loadedInterfaces[var0] = false;
            }
         }
      }
   }
}
