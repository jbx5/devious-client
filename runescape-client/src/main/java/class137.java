import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public class class137 extends class139 {
   @ObfuscatedName("ip")
   @ObfuscatedSignature(
      descriptor = "Lon;"
   )
   @Export("fontBold12")
   static Font fontBold12;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      longValue = -8453460473841490933L
   )
   long field1632;
   @ObfuscatedName("an")
   String field1633;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   final class142 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfa;)V"
   )
   class137(class142 var1) {
      this.this$0 = var1;
      this.field1632 = -1L;
      this.field1633 = null;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "168736686"
   )
   void vmethod3461(Buffer var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         this.field1632 = var1.readLong();
      }

      this.field1633 = var1.readStringCp1252NullTerminatedOrNull();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfj;I)V",
      garbageValue = "1712319228"
   )
   void vmethod3458(ClanSettings var1) {
      var1.method3299(this.field1632, this.field1633, 0);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-876753180"
   )
   static void method3197() {
      Tiles.Tiles_minPlane = 99;
      class186.Tiles_underlays = new short[4][104][104];
      Tiles.Tiles_overlays = new short[4][104][104];
      Tiles.Tiles_shapes = new byte[4][104][104];
      Tiles.field999 = new byte[4][104][104];
      class161.field1782 = new int[4][105][105];
      Tiles.Tiles_underlays2 = new byte[4][105][105];
      Tiles.field996 = new int[105][105];
      FileSystem.Tiles_hue = new int[104];
      Tiles.Tiles_saturation = new int[104];
      class283.Tiles_lightness = new int[104];
      UserComparator4.Tiles_hueMultiplier = new int[104];
      class31.field176 = new int[104];
   }
}
