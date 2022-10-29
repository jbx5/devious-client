import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
@Implements("World")
public class World {
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -8455751
   )
   @Export("World_count")
   static int World_count = 0;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 631669307
   )
   @Export("World_listCount")
   static int World_listCount = 0;
   @ObfuscatedName("d")
   @Export("World_sortOption2")
   static int[] World_sortOption2 = new int[]{1, 1, 1, 1};
   @ObfuscatedName("n")
   @Export("World_sortOption1")
   static int[] World_sortOption1 = new int[]{0, 1, 2, 3};
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1427237969
   )
   @Export("id")
   int id;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 389267987
   )
   @Export("properties")
   int properties;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1852026131
   )
   @Export("population")
   int population;
   @ObfuscatedName("b")
   @Export("host")
   String host;
   @ObfuscatedName("o")
   @Export("activity")
   String activity;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1379842523
   )
   @Export("location")
   int location;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 782405637
   )
   @Export("index")
   int index;

   World() {
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-429823684"
   )
   @Export("isMembersOnly")
   boolean isMembersOnly() {
      return (1 & this.properties) != 0;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1333964541"
   )
   boolean method1729() {
      return (2 & this.properties) != 0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-126"
   )
   @Export("isPvp")
   boolean isPvp() {
      return (4 & this.properties) != 0;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "32"
   )
   boolean method1727() {
      return (8 & this.properties) != 0;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1965547126"
   )
   @Export("isDeadman")
   boolean isDeadman() {
      return (536870912 & this.properties) != 0;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "15322951"
   )
   @Export("isBeta")
   boolean isBeta() {
      return (33554432 & this.properties) != 0;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "7"
   )
   boolean method1770() {
      return (1073741824 & this.properties) != 0;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "35"
   )
   boolean method1735() {
      return (256 & this.properties) != 0;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1160797874"
   )
   boolean method1759() {
      return (134217728 & this.properties) != 0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1750378326"
   )
   static void method1765() {
      for(ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
         if (var0.obj != null) {
            var0.set();
         }
      }

   }
}
