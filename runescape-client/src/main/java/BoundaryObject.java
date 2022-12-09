import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("BoundaryObject")
public final class BoundaryObject {
   @ObfuscatedName("az")
   protected static String field2787;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 231702347
   )
   @Export("z")
   int z;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -395952651
   )
   @Export("x")
   int x;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1849081701
   )
   @Export("y")
   int y;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1730515423
   )
   @Export("orientationA")
   int orientationA;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1631697669
   )
   @Export("orientationB")
   int orientationB;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lhr;"
   )
   @Export("renderable1")
   public Renderable renderable1;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lhr;"
   )
   @Export("renderable2")
   public Renderable renderable2;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      longValue = -2819561851550717281L
   )
   @Export("tag")
   public long tag = 0L;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -403448227
   )
   @Export("flags")
   int flags = 0;

   BoundaryObject() {
   }
}
