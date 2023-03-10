import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("Occluder")
public final class Occluder {
   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "Lrm;"
   )
   @Export("loginType")
   static LoginType loginType;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -917227683
   )
   @Export("minTileX")
   int minTileX;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1000298007
   )
   @Export("maxTileX")
   int maxTileX;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1897859131
   )
   @Export("minTileY")
   int minTileY;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 438820163
   )
   @Export("maxTileY")
   int maxTileY;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -926370029
   )
   @Export("type")
   int type;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -228357533
   )
   @Export("minX")
   int minX;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 324539461
   )
   @Export("maxX")
   int maxX;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1422103233
   )
   @Export("minZ")
   int minZ;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 2140908231
   )
   @Export("maxZ")
   int maxZ;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -96491847
   )
   @Export("minY")
   int minY;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1634358819
   )
   @Export("maxY")
   int maxY;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 941054415
   )
   int field2609;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -181392515
   )
   int field2610;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -1463862325
   )
   int field2598;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1633371041
   )
   int field2612;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 1629326833
   )
   int field2601;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1321946745
   )
   int field2614;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 512353701
   )
   int field2611;

   Occluder() {
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(S)[Lej;",
      garbageValue = "22012"
   )
   static class125[] method4564() {
      return new class125[]{class125.field1490, class125.field1489, class125.field1484, class125.field1483, class125.field1486};
   }

   @ObfuscatedName("iw")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "-3"
   )
   static int method4563(int var0, int var1) {
      int var2 = var1 - 334;
      if (var2 < 0) {
         var2 = 0;
      } else if (var2 > 100) {
         var2 = 100;
      }

      int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight;
      return var0 * var3 / 256;
   }
}
