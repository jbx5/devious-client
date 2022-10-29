import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
   @ObfuscatedName("t")
   @Export("cacheSubPaths")
   public static String[] cacheSubPaths;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lki;"
   )
   @Export("coord2")
   public final Coord coord2;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lki;"
   )
   @Export("coord1")
   public final Coord coord1;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1838862921
   )
   @Export("screenX")
   int screenX;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -29729157
   )
   @Export("screenY")
   int screenY;

   @ObfuscatedSignature(
      descriptor = "(Lki;Lki;)V"
   )
   AbstractWorldMapIcon(Coord var1, Coord var2) {
      this.coord1 = var1;
      this.coord2 = var2;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-410730858"
   )
   @Export("getElement")
   public abstract int getElement();

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)Liz;",
      garbageValue = "-1352130309"
   )
   @Export("getLabel")
   abstract WorldMapLabel getLabel();

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1449491180"
   )
   @Export("getSubWidth")
   abstract int getSubWidth();

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2053294830"
   )
   @Export("getSubHeight")
   abstract int getSubHeight();

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "41"
   )
   @Export("fitsScreen")
   boolean fitsScreen(int var1, int var2) {
      if (this.elementFitsScreen(var1, var2)) {
         return true;
      } else {
         return this.labelFitsScreen(var1, var2);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-970620116"
   )
   @Export("hasValidElement")
   boolean hasValidElement() {
      return this.getElement() >= 0;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "44"
   )
   @Export("elementFitsScreen")
   boolean elementFitsScreen(int var1, int var2) {
      if (!this.hasValidElement()) {
         return false;
      } else {
         WorldMapElement var3 = Actor.WorldMapElement_get(this.getElement());
         int var4 = this.getSubWidth();
         int var5 = this.getSubHeight();
         switch (var3.horizontalAlignment.value) {
            case 0:
               if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) {
                  return false;
               }
               break;
            case 1:
               if (var1 > this.screenX - var4 && var1 <= this.screenX) {
                  break;
               }

               return false;
            case 2:
               if (var1 < this.screenX || var1 >= var4 + this.screenX) {
                  return false;
               }
         }

         switch (var3.verticalAlignment.value) {
            case 0:
               if (var2 > this.screenY - var5 && var2 <= this.screenY) {
                  break;
               }

               return false;
            case 1:
               if (var2 >= this.screenY - var5 / 2 && var2 <= var5 / 2 + this.screenY) {
                  break;
               }

               return false;
            case 2:
               if (var2 < this.screenY || var2 >= var5 + this.screenY) {
                  return false;
               }
         }

         return true;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "222316650"
   )
   @Export("labelFitsScreen")
   boolean labelFitsScreen(int var1, int var2) {
      WorldMapLabel var3 = this.getLabel();
      if (var3 == null) {
         return false;
      } else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) {
         return var2 >= this.screenY && var2 <= var3.height + this.screenY;
      } else {
         return false;
      }
   }
}
