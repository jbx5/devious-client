import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
@Implements("WorldMapArea")
public class WorldMapArea {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -821361313
   )
   @Export("id")
   int id = -1;
   @ObfuscatedName("an")
   @Export("internalName")
   String internalName;
   @ObfuscatedName("av")
   @Export("externalName")
   String externalName;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 555090607
   )
   @Export("backGroundColor")
   int backGroundColor = -1;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -9571317
   )
   @Export("zoom")
   int zoom = -1;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lmg;"
   )
   @Export("origin")
   Coord origin = null;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -2109766823
   )
   @Export("regionLowX")
   int regionLowX = Integer.MAX_VALUE;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -153877805
   )
   @Export("regionHighX")
   int regionHighX = 0;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1562810187
   )
   @Export("regionLowY")
   int regionLowY = Integer.MAX_VALUE;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1232808299
   )
   @Export("regionHighY")
   int regionHighY = 0;
   @ObfuscatedName("ao")
   @Export("isMain")
   boolean isMain = false;
   @ObfuscatedName("aa")
   @Export("sections")
   LinkedList sections;

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;IB)V",
      garbageValue = "36"
   )
   @Export("read")
   public void read(Buffer var1, int var2) {
      this.id = var2;
      this.internalName = var1.readStringCp1252NullTerminated();
      this.externalName = var1.readStringCp1252NullTerminated();
      this.origin = new Coord(var1.readInt());
      this.backGroundColor = var1.readInt();
      var1.readUnsignedByte();
      this.isMain = var1.readUnsignedByte() == 1;
      this.zoom = var1.readUnsignedByte();
      int var3 = var1.readUnsignedByte();
      this.sections = new LinkedList();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.sections.add(this.readWorldMapSection(var1));
      }

      this.setBounds();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)Lkg;",
      garbageValue = "1317289511"
   )
   @Export("readWorldMapSection")
   WorldMapSection readWorldMapSection(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      WorldMapSectionType[] var3 = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE0, WorldMapSectionType.WORLDMAPSECTIONTYPE1, WorldMapSectionType.WORLDMAPSECTIONTYPE2, WorldMapSectionType.WORLDMAPSECTIONTYPE3};
      WorldMapSectionType var4 = (WorldMapSectionType)GameObject.findEnumerated(var3, var2);
      Object var5 = null;
      switch (var4.type) {
         case 0:
            var5 = new WorldMapSection2();
            break;
         case 1:
            var5 = new class259();
            break;
         case 2:
            var5 = new WorldMapSection1();
            break;
         case 3:
            var5 = new WorldMapSection0();
            break;
         default:
            throw new IllegalStateException("");
      }

      ((WorldMapSection)var5).read(var1);
      return (WorldMapSection)var5;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IIIS)Z",
      garbageValue = "128"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      Iterator var4 = this.sections.iterator();

      WorldMapSection var5;
      do {
         if (!var4.hasNext()) {
            return false;
         }

         var5 = (WorldMapSection)var4.next();
      } while(!var5.containsCoord(var1, var2, var3));

      return true;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-346531447"
   )
   @Export("containsPosition")
   public boolean containsPosition(int var1, int var2) {
      int var3 = var1 / 64;
      int var4 = var2 / 64;
      if (var3 >= this.regionLowX && var3 <= this.regionHighX) {
         if (var4 >= this.regionLowY && var4 <= this.regionHighY) {
            Iterator var5 = this.sections.iterator();

            WorldMapSection var6;
            do {
               if (!var5.hasNext()) {
                  return false;
               }

               var6 = (WorldMapSection)var5.next();
            } while(!var6.containsPosition(var1, var2));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(IIII)[I",
      garbageValue = "-1705163637"
   )
   @Export("position")
   public int[] position(int var1, int var2, int var3) {
      Iterator var4 = this.sections.iterator();

      WorldMapSection var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (WorldMapSection)var4.next();
      } while(!var5.containsCoord(var1, var2, var3));

      return var5.getBorderTileLengths(var1, var2, var3);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(III)Lmg;",
      garbageValue = "1030783725"
   )
   @Export("coord")
   public Coord coord(int var1, int var2) {
      Iterator var3 = this.sections.iterator();

      WorldMapSection var4;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         var4 = (WorldMapSection)var3.next();
      } while(!var4.containsPosition(var1, var2));

      return var4.coord(var1, var2);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1001248381"
   )
   @Export("setBounds")
   void setBounds() {
      Iterator var1 = this.sections.iterator();

      while(var1.hasNext()) {
         WorldMapSection var2 = (WorldMapSection)var1.next();
         var2.expandBounds(this);
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-100"
   )
   @Export("getId")
   public int getId() {
      return this.id;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "0"
   )
   @Export("getIsMain")
   public boolean getIsMain() {
      return this.isMain;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "76"
   )
   @Export("getInternalName")
   public String getInternalName() {
      return this.internalName;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "51"
   )
   @Export("getExternalName")
   public String getExternalName() {
      return this.externalName;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-52"
   )
   @Export("getBackGroundColor")
   int getBackGroundColor() {
      return this.backGroundColor;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "522808671"
   )
   @Export("getZoom")
   public int getZoom() {
      return this.zoom;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1080892519"
   )
   @Export("getRegionLowX")
   public int getRegionLowX() {
      return this.regionLowX;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2122048813"
   )
   @Export("getRegionHighX")
   public int getRegionHighX() {
      return this.regionHighX;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1014645029"
   )
   @Export("getRegionLowY")
   public int getRegionLowY() {
      return this.regionLowY;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1702826523"
   )
   @Export("getRegionHighY")
   public int getRegionHighY() {
      return this.regionHighY;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "2"
   )
   @Export("getOriginX")
   public int getOriginX() {
      return this.origin.x;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1035011114"
   )
   @Export("getOriginPlane")
   public int getOriginPlane() {
      return this.origin.plane;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-813728015"
   )
   @Export("getOriginY")
   public int getOriginY() {
      return this.origin.y;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)Lmg;",
      garbageValue = "-921903301"
   )
   @Export("getOrigin")
   public Coord getOrigin() {
      return new Coord(this.origin);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(CB)B",
      garbageValue = "14"
   )
   @Export("charToByteCp1252")
   public static byte charToByteCp1252(char var0) {
      byte var1;
      if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
         var1 = (byte)var0;
      } else if (var0 == 8364) {
         var1 = -128;
      } else if (var0 == 8218) {
         var1 = -126;
      } else if (var0 == 402) {
         var1 = -125;
      } else if (var0 == 8222) {
         var1 = -124;
      } else if (var0 == 8230) {
         var1 = -123;
      } else if (var0 == 8224) {
         var1 = -122;
      } else if (var0 == 8225) {
         var1 = -121;
      } else if (var0 == 710) {
         var1 = -120;
      } else if (var0 == 8240) {
         var1 = -119;
      } else if (var0 == 352) {
         var1 = -118;
      } else if (var0 == 8249) {
         var1 = -117;
      } else if (var0 == 338) {
         var1 = -116;
      } else if (var0 == 381) {
         var1 = -114;
      } else if (var0 == 8216) {
         var1 = -111;
      } else if (var0 == 8217) {
         var1 = -110;
      } else if (var0 == 8220) {
         var1 = -109;
      } else if (var0 == 8221) {
         var1 = -108;
      } else if (var0 == 8226) {
         var1 = -107;
      } else if (var0 == 8211) {
         var1 = -106;
      } else if (var0 == 8212) {
         var1 = -105;
      } else if (var0 == 732) {
         var1 = -104;
      } else if (var0 == 8482) {
         var1 = -103;
      } else if (var0 == 353) {
         var1 = -102;
      } else if (var0 == 8250) {
         var1 = -101;
      } else if (var0 == 339) {
         var1 = -100;
      } else if (var0 == 382) {
         var1 = -98;
      } else if (var0 == 376) {
         var1 = -97;
      } else {
         var1 = 63;
      }

      return var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(ILqc;Lny;I)V",
      garbageValue = "1736971993"
   )
   static void method5170(int var0, ArchiveDisk var1, Archive var2) {
      ArchiveDiskAction var3 = new ArchiveDiskAction();
      var3.type = 1;
      var3.key = (long)var0;
      var3.archiveDisk = var1;
      var3.archive = var2;
      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
         ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
      }

      class300.method5686();
   }
}
