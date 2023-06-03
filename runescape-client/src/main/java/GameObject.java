import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
@Implements("GameObject")
public final class GameObject {
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      intValue = 1995795893
   )
   static int field2850;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1220186919
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 963750777
   )
   @Export("startX")
   int startX;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1050812385
   )
   @Export("z")
   int z;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1872708547
   )
   @Export("centerX")
   int centerX;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1000962549
   )
   @Export("centerY")
   int centerY;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lim;"
   )
   @Export("renderable")
   public Renderable renderable;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1073660437
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 674522119
   )
   @Export("endX")
   int endX;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1292137241
   )
   @Export("startY")
   int startY;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1875098861
   )
   @Export("endY")
   int endY;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1962091335
   )
   int field2847;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1491176913
   )
   @Export("lastDrawn")
   int lastDrawn;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      longValue = 3751080140565960067L
   )
   @Export("tag")
   public long tag = 0L;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1247354483
   )
   @Export("flags")
   int flags = 0;

   GameObject() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "([Lob;II)Lob;",
      garbageValue = "285155448"
   )
   @Export("findEnumerated")
   public static MouseWheel findEnumerated(MouseWheel[] var0, int var1) {
      MouseWheel[] var2 = var0;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         MouseWheel var4 = var2[var3];
         if (var1 == var4.rsOrdinal()) {
            return var4;
         }
      }

      return null;
   }
}
