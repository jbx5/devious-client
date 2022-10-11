import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
   WorldMapData_0() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;B)V",
      garbageValue = "-67"
   )
   @Export("init")
   void init(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if (var2 != WorldMapID.field2926.value) {
         throw new IllegalStateException("");
      } else {
         super.minPlane = var1.readUnsignedByte();
         super.planes = var1.readUnsignedByte();
         super.regionXLow = var1.readUnsignedShort() * 64;
         super.regionYLow = var1.readUnsignedShort() * 64;
         super.regionX = var1.readUnsignedShort();
         super.regionY = var1.readUnsignedShort();
         super.groupId = var1.readNullableLargeSmart();
         super.fileId = var1.readNullableLargeSmart();
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-1742589874"
   )
   @Export("readGeography")
   void readGeography(Buffer var1) {
      super.planes = Math.min(super.planes, 4);
      super.floorUnderlayIds = new short[1][64][64];
      super.floorOverlayIds = new short[super.planes][64][64];
      super.field2886 = new byte[super.planes][64][64];
      super.field2887 = new byte[super.planes][64][64];
      super.decorations = new WorldMapDecoration[super.planes][64][64][];
      int var2 = var1.readUnsignedByte();
      if (var2 != class248.field2915.value) {
         throw new IllegalStateException("");
      } else {
         int var3 = var1.readUnsignedByte();
         int var4 = var1.readUnsignedByte();
         if (var3 == super.regionX && var4 == super.regionY) {
            for(int var5 = 0; var5 < 64; ++var5) {
               for(int var6 = 0; var6 < 64; ++var6) {
                  this.readTile(var5, var6, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof WorldMapData_0)) {
         return false;
      } else {
         WorldMapData_0 var2 = (WorldMapData_0)var1;
         return super.regionX == var2.regionX && super.regionY == var2.regionY;
      }
   }

   public int hashCode() {
      return super.regionX | super.regionY << 8;
   }

   @ObfuscatedName("fd")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "611853521"
   )
   static void method4678() {
      Client.packetWriter.clearBuffer();
      Client.packetWriter.packetBuffer.offset = 0;
      Client.packetWriter.serverPacket = null;
      Client.packetWriter.field1380 = null;
      Client.packetWriter.field1373 = null;
      Client.packetWriter.field1381 = null;
      Client.packetWriter.serverPacketLength = 0;
      Client.packetWriter.field1371 = 0;
      Client.rebootTimer = 0;
      Client.menuOptionsCount = 0;
      Client.isMenuOpen = false;
      Client.minimapState = 0;
      Client.destinationX = 0;

      int var0;
      for(var0 = 0; var0 < 2048; ++var0) {
         Client.players[var0] = null;
      }

      class296.localPlayer = null;

      for(var0 = 0; var0 < Client.npcs.length; ++var0) {
         NPC var1 = Client.npcs[var0];
         if (var1 != null) {
            var1.targetIndex = -1;
            var1.false0 = false;
         }
      }

      class133.method2975();
      class21.updateGameState(30);

      for(var0 = 0; var0 < 100; ++var0) {
         Client.field717[var0] = true;
      }

      class9.method61();
   }

   @ObfuscatedName("iu")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1620030234"
   )
   static final void method4667(int var0, int var1) {
      if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) {
         if (Client.showMouseOverText) {
            int var2 = class250.method5167();
            String var3;
            if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) {
               var3 = "Use" + " " + Client.selectedItemName + " " + "->";
            } else if (Client.isSpellSelected && Client.menuOptionsCount < 2) {
               var3 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
            } else {
               var3 = FaceNormal.method4461(var2);
            }

            if (Client.menuOptionsCount > 2) {
               var3 = var3 + GameObject.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
            }

            UserComparator3.fontBold12.drawRandomAlphaAndSpacing(var3, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000);
         }
      }
   }

   @ObfuscatedName("kh")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "131998521"
   )
   static final void method4676(int var0) {
      var0 = Math.max(Math.min(var0, 100), 0);
      var0 = 100 - var0;
      float var1 = (float)var0 / 200.0F + 0.5F;
      FloorDecoration.method4134((double)var1);
   }
}
