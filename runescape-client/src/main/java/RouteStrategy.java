import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1813601119
   )
   @Export("approxDestinationX")
   public int approxDestinationX;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 582937053
   )
   @Export("approxDestinationY")
   public int approxDestinationY;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1144807893
   )
   @Export("approxDestinationSizeX")
   public int approxDestinationSizeX;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1308573933
   )
   @Export("approxDestinationSizeY")
   public int approxDestinationSizeY;

   protected RouteStrategy() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIILgv;I)Z",
      garbageValue = "118374037"
   )
   @Export("hasArrived")
   public abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-546644607"
   )
   static final void method4218() {
      Decimator.method1115("Your ignore list is full. Max of 100 for free users, and 400 for members");
   }
}
