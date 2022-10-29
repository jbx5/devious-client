import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("WorldMapEvent")
public class WorldMapEvent {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 2110092031
   )
   @Export("mapElement")
   public int mapElement;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lki;"
   )
   @Export("coord1")
   public Coord coord1;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lki;"
   )
   @Export("coord2")
   public Coord coord2;

   @ObfuscatedSignature(
      descriptor = "(ILki;Lki;)V"
   )
   public WorldMapEvent(int var1, Coord var2, Coord var3) {
      this.mapElement = var1;
      this.coord1 = var2;
      this.coord2 = var3;
   }

   @ObfuscatedName("a")
   @Export("base37DecodeLong")
   public static String base37DecodeLong(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (0L == var0 % 37L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; 0L != var3; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = class359.base37Table[(int)(var6 - var0 * 37L)];
               if (var8 == '_') {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Float;Ljava/lang/Float;I)V",
      garbageValue = "-753033350"
   )
   static void method5310(Float var0, Float var1) {
      if (var0 + class121.field1454 < 1.3333334F) {
         float var2 = var0 - 2.0F;
         float var3 = var0 - 1.0F;
         float var4 = (float)Math.sqrt((double)(var2 * var2 - var3 * 4.0F * var3));
         float var5 = 0.5F * (var4 + -var2);
         if (var1 + class121.field1454 > var5) {
            var1 = var5 - class121.field1454;
         } else {
            var5 = 0.5F * (-var2 - var4);
            if (var1 < var5 + class121.field1454) {
               var1 = class121.field1454 + var5;
            }
         }
      } else {
         var0 = 1.3333334F - class121.field1454;
         var1 = 0.33333334F - class121.field1454;
      }

   }
}
