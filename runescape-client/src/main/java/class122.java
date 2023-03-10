import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class122 {
   @ObfuscatedName("af")
   @Export("formattedOperatingSystemName")
   public static String formattedOperatingSystemName;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -289941817
   )
   int field1455;
   @ObfuscatedName("al")
   float field1446;
   @ObfuscatedName("ac")
   float field1447 = Float.MAX_VALUE;
   @ObfuscatedName("ab")
   float field1448 = Float.MAX_VALUE;
   @ObfuscatedName("an")
   float field1449 = Float.MAX_VALUE;
   @ObfuscatedName("ao")
   float field1450 = Float.MAX_VALUE;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Leq;"
   )
   class122 field1451;

   class122() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;IB)V",
      garbageValue = "-50"
   )
   void method2892(Buffer var1, int var2) {
      this.field1455 = var1.readShort();
      this.field1446 = var1.method8626();
      this.field1447 = var1.method8626();
      this.field1448 = var1.method8626();
      this.field1449 = var1.method8626();
      this.field1450 = var1.method8626();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IIII)J",
      garbageValue = "-1933982227"
   )
   static long method2891(int var0, int var1, int var2) {
      return (long)(var2 << 16 | var0 << 8 | var1);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)[Ldd;",
      garbageValue = "-225905691"
   )
   static class87[] method2896() {
      return new class87[]{class87.field1070, class87.field1069, class87.field1072, class87.field1076, class87.field1071};
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(IIIB)I",
      garbageValue = "63"
   )
   @Export("hslToRgb")
   static final int hslToRgb(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
      return var3;
   }

   @ObfuscatedName("he")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;S)V",
      garbageValue = "-28795"
   )
   @Export("doCheat")
   static final void doCheat(String var0) {
      if (var0.equalsIgnoreCase("toggleroof")) {
         WorldMapSectionType.clientPreferences.method2432(!WorldMapSectionType.clientPreferences.method2458());
         if (WorldMapSectionType.clientPreferences.method2458()) {
            MusicPatchNode.addGameMessage(99, "", "Roofs are now all hidden");
         } else {
            MusicPatchNode.addGameMessage(99, "", "Roofs will only be removed selectively");
         }
      }

      if (var0.equalsIgnoreCase("displayfps")) {
         WorldMapSectionType.clientPreferences.method2433();
      }

      if (var0.equalsIgnoreCase("renderself")) {
         Client.renderSelf = !Client.renderSelf;
      }

      if (var0.equalsIgnoreCase("mouseovertext")) {
         Client.showMouseOverText = !Client.showMouseOverText;
      }

      if (Client.staffModLevel >= 2) {
         if (var0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
         }

         if (var0.equalsIgnoreCase("showcoord")) {
            WorldMapData_1.worldMap.showCoord = !WorldMapData_1.worldMap.showCoord;
         }

         if (var0.equalsIgnoreCase("fpson")) {
            WorldMapSectionType.clientPreferences.method2523(true);
         }

         if (var0.equalsIgnoreCase("fpsoff")) {
            WorldMapSectionType.clientPreferences.method2523(false);
         }

         if (var0.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if (var0.equalsIgnoreCase("clientdrop")) {
            PendingSpawn.method2350();
         }
      }

      PacketBufferNode var1 = UserComparator9.getPacketBufferNode(ClientPacket.DOCHEAT, Client.packetWriter.isaacCipher);
      var1.packetBuffer.writeByte(var0.length() + 1);
      var1.packetBuffer.writeStringCp1252NullTerminated(var0);
      Client.packetWriter.addNode(var1);
   }
}
