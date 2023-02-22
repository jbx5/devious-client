import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
@Implements("WorldMapArea")
public class WorldMapArea {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 1364779187
   )
   @Export("id")
   int id = -1;
   @ObfuscatedName("al")
   @Export("internalName")
   String internalName;
   @ObfuscatedName("ac")
   @Export("externalName")
   String externalName;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -861936449
   )
   @Export("backGroundColor")
   int backGroundColor = -1;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1914508313
   )
   @Export("zoom")
   int zoom = -1;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Llt;"
   )
   @Export("origin")
   Coord origin = null;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1244824785
   )
   @Export("regionLowX")
   int regionLowX = Integer.MAX_VALUE;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -609305437
   )
   @Export("regionHighX")
   int regionHighX = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1790684409
   )
   @Export("regionLowY")
   int regionLowY = Integer.MAX_VALUE;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 1015122273
   )
   @Export("regionHighY")
   int regionHighY = 0;
   @ObfuscatedName("ak")
   @Export("isMain")
   boolean isMain = false;
   @ObfuscatedName("ax")
   @Export("sections")
   LinkedList sections;

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;IB)V",
      garbageValue = "70"
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

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)Lkd;",
      garbageValue = "1493006035"
   )
   @Export("readWorldMapSection")
   WorldMapSection readWorldMapSection(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      WorldMapSectionType var3 = (WorldMapSectionType)SpriteMask.findEnumerated(WorldMapSectionType.method5187(), var2);
      Object var4 = null;
      switch (var3.type) {
         case 0:
            var4 = new class248();
            break;
         case 1:
            var4 = new WorldMapSection1();
            break;
         case 2:
            var4 = new WorldMapSection0();
            break;
         case 3:
            var4 = new WorldMapSection2();
            break;
         default:
            throw new IllegalStateException("");
      }

      ((WorldMapSection)var4).read(var1);
      return (WorldMapSection)var4;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IIII)Z",
      garbageValue = "-1950894227"
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

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-375705273"
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

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIII)[I",
      garbageValue = "1460236922"
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

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(III)Llt;",
      garbageValue = "-1410281579"
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

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1716718867"
   )
   @Export("setBounds")
   void setBounds() {
      Iterator var1 = this.sections.iterator();

      while(var1.hasNext()) {
         WorldMapSection var2 = (WorldMapSection)var1.next();
         var2.expandBounds(this);
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-1"
   )
   @Export("getId")
   public int getId() {
      return this.id;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "10996936"
   )
   @Export("getIsMain")
   public boolean getIsMain() {
      return this.isMain;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "-65"
   )
   @Export("getInternalName")
   public String getInternalName() {
      return this.internalName;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "94"
   )
   @Export("getExternalName")
   public String getExternalName() {
      return this.externalName;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "570565152"
   )
   @Export("getBackGroundColor")
   int getBackGroundColor() {
      return this.backGroundColor;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1040127358"
   )
   @Export("getZoom")
   public int getZoom() {
      return this.zoom;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "1"
   )
   @Export("getRegionLowX")
   public int getRegionLowX() {
      return this.regionLowX;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "632784773"
   )
   @Export("getRegionHighX")
   public int getRegionHighX() {
      return this.regionHighX;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "-7674"
   )
   @Export("getRegionLowY")
   public int getRegionLowY() {
      return this.regionLowY;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1770419527"
   )
   @Export("getRegionHighY")
   public int getRegionHighY() {
      return this.regionHighY;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "689611916"
   )
   @Export("getOriginX")
   public int getOriginX() {
      return this.origin.x;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   @Export("getOriginPlane")
   public int getOriginPlane() {
      return this.origin.plane;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "10"
   )
   @Export("getOriginY")
   public int getOriginY() {
      return this.origin.y;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Llt;",
      garbageValue = "631641282"
   )
   @Export("getOrigin")
   public Coord getOrigin() {
      return new Coord(this.origin);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(B)[Lln;",
      garbageValue = "6"
   )
   static LoginPacket[] method4920() {
      return new LoginPacket[]{LoginPacket.field3285, LoginPacket.field3286, LoginPacket.field3284, LoginPacket.field3288, LoginPacket.field3289, LoginPacket.field3290};
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lsn;IIII)V",
      garbageValue = "-553024587"
   )
   static void method4918(SpritePixels var0, int var1, int var2, int var3) {
      WorldMapRegion.WorldMapRegion_cachedSprites.put(var0, class122.method2891(var1, var2, var3), var0.pixels.length * 4);
   }

   @ObfuscatedName("me")
   @ObfuscatedSignature(
      descriptor = "(IIZB)V",
      garbageValue = "69"
   )
   static final void method4919(int var0, int var1, boolean var2) {
      if (Client.currentClanChannels[var0] != null) {
         if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3329()) {
            ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
            PacketBufferNode var4 = UserComparator9.getPacketBufferNode(ClientPacket.field3145, Client.packetWriter.isaacCipher);
            var4.packetBuffer.writeByte(4 + WorldMapLabel.stringCp1252NullTerminatedByteSize(var3.username.getName()));
            var4.packetBuffer.writeByte(var0);
            var4.packetBuffer.writeShort(var1);
            var4.packetBuffer.writeBoolean(var2);
            var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
            Client.packetWriter.addNode(var4);
         }
      }
   }
}
