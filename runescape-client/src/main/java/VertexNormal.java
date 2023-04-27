import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("VertexNormal")
public class VertexNormal {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1941999827
   )
   @Export("x")
   int x;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 124229261
   )
   @Export("y")
   int y;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 2108671835
   )
   @Export("z")
   int z;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1837445001
   )
   @Export("magnitude")
   int magnitude;

   VertexNormal() {
   }

   @ObfuscatedSignature(
      descriptor = "(Lib;)V"
   )
   VertexNormal(VertexNormal var1) {
      this.x = var1.x;
      this.y = var1.y;
      this.z = var1.z;
      this.magnitude = var1.magnitude;
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-2041739406"
   )
   static int method4909(int var0) {
      return (int)Math.pow(2.0, (double)((float)var0 / 256.0F + 7.0F));
   }
}
