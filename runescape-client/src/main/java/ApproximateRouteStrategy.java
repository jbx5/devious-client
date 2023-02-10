import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
   @ObfuscatedName("z")
   @Export("SpriteBuffer_yOffsets")
   public static int[] SpriteBuffer_yOffsets;
   @ObfuscatedName("et")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   @Export("archive10")
   static Archive archive10;

   ApproximateRouteStrategy() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIILgv;I)Z",
      garbageValue = "118374037"
   )
   @Export("hasArrived")
   public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
      return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
   }
}
