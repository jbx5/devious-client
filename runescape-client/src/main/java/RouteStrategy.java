import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 59947595
   )
   @Export("approxDestinationX")
   public int approxDestinationX;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -662612897
   )
   @Export("approxDestinationY")
   public int approxDestinationY;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1804274713
   )
   @Export("approxDestinationSizeX")
   public int approxDestinationSizeX;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -584396795
   )
   @Export("approxDestinationSizeY")
   public int approxDestinationSizeY;

   protected RouteStrategy() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IIILic;B)Z",
      garbageValue = "-38"
   )
   @Export("hasArrived")
   protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

   @ObfuscatedName("ls")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIS)V",
      garbageValue = "246"
   )
   @Export("updateRootInterface")
   static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (Client.loadInterface(var0)) {
         UserComparator3.updateInterface(class16.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
      }
   }

   @ObfuscatedName("ne")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "972113387"
   )
   public static boolean method4214() {
      return Client.staffModLevel >= 2;
   }
}
