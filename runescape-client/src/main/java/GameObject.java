import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
@Implements("GameObject")
public final class GameObject {
   @ObfuscatedName("jc")
   @ObfuscatedGetter(
      intValue = 827352769
   )
   @Export("baseY")
   static int baseY;
   @ObfuscatedName("jd")
   @Export("xteaKeys")
   static int[][] xteaKeys;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -872547715
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 626811319
   )
   @Export("startX")
   int startX;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1042267931
   )
   @Export("z")
   int z;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1546117209
   )
   @Export("centerX")
   int centerX;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1463075659
   )
   @Export("centerY")
   int centerY;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Liv;"
   )
   @Export("renderable")
   public Renderable renderable;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1521986263
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1242897449
   )
   @Export("endX")
   int endX;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 2004902003
   )
   @Export("startY")
   int startY;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -80616117
   )
   @Export("endY")
   int endY;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 308174317
   )
   int field2843;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1033646519
   )
   @Export("lastDrawn")
   int lastDrawn;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      longValue = 5016412888503339625L
   )
   @Export("tag")
   public long tag = 0L;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -72925475
   )
   @Export("flags")
   int flags = 0;

   GameObject() {
   }
}
