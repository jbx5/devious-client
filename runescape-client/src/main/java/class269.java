import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
public class class269 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lkw;"
   )
   static final class269 field3019 = new class269(0);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lkw;"
   )
   static final class269 field3016 = new class269(1);
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1601195475
   )
   @Export("value")
   final int value;

   class269(int var1) {
      this.value = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1152388374"
   )
   static void method5466() {
      Tiles.Tiles_minPlane = 99;
      FaceNormal.Tiles_underlays = new short[4][104][104];
      class74.Tiles_overlays = new short[4][104][104];
      Player.Tiles_shapes = new byte[4][104][104];
      Tiles.field1018 = new byte[4][104][104];
      Tiles.field1020 = new int[4][105][105];
      class305.Tiles_underlays2 = new byte[4][105][105];
      Canvas.field116 = new int[105][105];
      UserComparator5.Tiles_hue = new int[104];
      class210.Tiles_saturation = new int[104];
      Tiles.Tiles_lightness = new int[104];
      class149.Tiles_hueMultiplier = new int[104];
      Tiles.field1019 = new int[104];
   }
}
