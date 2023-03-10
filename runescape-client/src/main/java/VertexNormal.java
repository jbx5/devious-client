import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
@Implements("VertexNormal")
public class VertexNormal {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 969385191
   )
   @Export("x")
   int x;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -396532773
   )
   @Export("y")
   int y;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -630703257
   )
   @Export("z")
   int z;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1138206661
   )
   @Export("magnitude")
   int magnitude;

   VertexNormal() {
   }

   @ObfuscatedSignature(
      descriptor = "(Liy;)V"
   )
   VertexNormal(VertexNormal var1) {
      this.x = var1.x;
      this.y = var1.y;
      this.z = var1.z;
      this.magnitude = var1.magnitude;
   }
}
