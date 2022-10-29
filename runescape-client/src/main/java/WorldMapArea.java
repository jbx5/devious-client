import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("WorldMapArea")
public class WorldMapArea {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 2073270465
   )
   @Export("id")
   int id = -1;
   @ObfuscatedName("f")
   @Export("internalName")
   String internalName;
   @ObfuscatedName("c")
   @Export("externalName")
   String externalName;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 837415887
   )
   @Export("backGroundColor")
   int backGroundColor = -1;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 139353785
   )
   @Export("zoom")
   int zoom = -1;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lki;"
   )
   @Export("origin")
   Coord origin = null;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 742806467
   )
   @Export("regionLowX")
   int regionLowX = Integer.MAX_VALUE;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 773734045
   )
   @Export("regionHighX")
   int regionHighX = 0;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1868515059
   )
   @Export("regionLowY")
   int regionLowY = Integer.MAX_VALUE;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -372427559
   )
   @Export("regionHighY")
   int regionHighY = 0;
   @ObfuscatedName("l")
   @Export("isMain")
   boolean isMain = false;
   @ObfuscatedName("s")
   @Export("sections")
   LinkedList sections;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;II)V",
      garbageValue = "-1692354213"
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

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqr;B)Lin;",
      garbageValue = "4"
   )
   @Export("readWorldMapSection")
   WorldMapSection readWorldMapSection(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      WorldMapSectionType[] var3 = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE0, WorldMapSectionType.WORLDMAPSECTIONTYPE2, WorldMapSectionType.WORLDMAPSECTIONTYPE3, WorldMapSectionType.WORLDMAPSECTIONTYPE1};
      WorldMapSectionType var4 = (WorldMapSectionType)WallDecoration.findEnumerated(var3, var2);
      Object var5 = null;
      switch (var4.type) {
         case 0:
            var5 = new class238();
            break;
         case 1:
            var5 = new WorldMapSection0();
            break;
         case 2:
            var5 = new WorldMapSection2();
            break;
         case 3:
            var5 = new WorldMapSection1();
            break;
         default:
            throw new IllegalStateException("");
      }

      ((WorldMapSection)var5).read(var1);
      return (WorldMapSection)var5;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IIIB)Z",
      garbageValue = "16"
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

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "5"
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

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IIII)[I",
      garbageValue = "1987596526"
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

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(IIB)Lki;",
      garbageValue = "-1"
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

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "8"
   )
   @Export("setBounds")
   void setBounds() {
      Iterator var1 = this.sections.iterator();

      while(var1.hasNext()) {
         WorldMapSection var2 = (WorldMapSection)var1.next();
         var2.expandBounds(this);
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-638994814"
   )
   @Export("getId")
   public int getId() {
      return this.id;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2071613735"
   )
   @Export("getIsMain")
   public boolean getIsMain() {
      return this.isMain;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "2026241447"
   )
   @Export("getInternalName")
   public String getInternalName() {
      return this.internalName;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "-82"
   )
   @Export("getExternalName")
   public String getExternalName() {
      return this.externalName;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "16"
   )
   @Export("getBackGroundColor")
   int getBackGroundColor() {
      return this.backGroundColor;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1411100102"
   )
   @Export("getZoom")
   public int getZoom() {
      return this.zoom;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1252801712"
   )
   @Export("getRegionLowX")
   public int getRegionLowX() {
      return this.regionLowX;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "10"
   )
   @Export("getRegionHighX")
   public int getRegionHighX() {
      return this.regionHighX;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-39"
   )
   @Export("getRegionLowY")
   public int getRegionLowY() {
      return this.regionLowY;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "14"
   )
   @Export("getRegionHighY")
   public int getRegionHighY() {
      return this.regionHighY;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "895382707"
   )
   @Export("getOriginX")
   public int getOriginX() {
      return this.origin.x;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "89"
   )
   @Export("getOriginPlane")
   public int getOriginPlane() {
      return this.origin.plane;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1086496383"
   )
   @Export("getOriginY")
   public int getOriginY() {
      return this.origin.y;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)Lki;",
      garbageValue = "1340170820"
   )
   @Export("getOrigin")
   public Coord getOrigin() {
      return new Coord(this.origin);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "506591648"
   )
   static final int method4749() {
      return ViewportMouse.ViewportMouse_x;
   }
}
