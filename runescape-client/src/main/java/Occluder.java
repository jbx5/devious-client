import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("Occluder")
public final class Occluder {
   @ObfuscatedName("th")
   @ObfuscatedGetter(
      intValue = 959648640
   )
   static int field2636;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1892245081
   )
   @Export("minTileX")
   int minTileX;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 514373031
   )
   @Export("maxTileX")
   int maxTileX;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1916583407
   )
   @Export("minTileY")
   int minTileY;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1037281985
   )
   @Export("maxTileY")
   int maxTileY;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1080102931
   )
   @Export("type")
   int type;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -821427861
   )
   @Export("minX")
   int minX;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1466699159
   )
   @Export("maxX")
   int maxX;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1277702437
   )
   @Export("minZ")
   int minZ;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1587170153
   )
   @Export("maxZ")
   int maxZ;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1761060981
   )
   @Export("minY")
   int minY;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -934931019
   )
   @Export("maxY")
   int maxY;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -2054486103
   )
   int field2627;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1792552595
   )
   int field2633;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 8708161
   )
   int field2632;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -801880649
   )
   int field2635;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 428701389
   )
   int field2634;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1960214883
   )
   int field2639;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 124194473
   )
   int field2638;

   Occluder() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V",
      garbageValue = "1977226602"
   )
   public static void method4650(Applet var0, String var1) {
      class31.field190 = var0;
      if (var1 != null) {
         class31.field186 = var1;
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "-76"
   )
   static void method4649(String var0) {
      String var1;
      if (var0 != null && !var0.isEmpty() && var0.charAt(0) != '#') {
         var1 = var0;
      } else {
         var1 = "";
      }

      Login.field927 = var1;
   }
}
