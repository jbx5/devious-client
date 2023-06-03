import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("WallDecoration")
public final class WallDecoration {
   @ObfuscatedName("ul")
   @ObfuscatedGetter(
      intValue = -1524978369
   )
   static int field2828;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1768831305
   )
   @Export("z")
   int z;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 743465745
   )
   @Export("xOffset")
   int xOffset;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 248971679
   )
   @Export("x")
   int x;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1620925779
   )
   @Export("y")
   int y;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 266433617
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -874216225
   )
   @Export("orientation2")
   int orientation2;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1906641877
   )
   @Export("yOffset")
   int yOffset;
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Lim;"
   )
   @Export("renderable1")
   public Renderable renderable1;
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Lim;"
   )
   @Export("renderable2")
   public Renderable renderable2;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      longValue = -1468641823099948599L
   )
   @Export("tag")
   public long tag = 0L;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1745333937
   )
   @Export("flags")
   int flags = 0;

   WallDecoration() {
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(Lhx;I)Z",
      garbageValue = "-300819598"
   )
   static boolean method5043(ObjectComposition var0) {
      if (var0.transforms != null) {
         int[] var1 = var0.transforms;

         for(int var2 = 0; var2 < var1.length; ++var2) {
            int var3 = var1[var2];
            ObjectComposition var4 = class175.getObjectDefinition(var3);
            if (var4.mapIconId != -1) {
               return true;
            }
         }
      } else if (var0.mapIconId != -1) {
         return true;
      }

      return false;
   }
}
