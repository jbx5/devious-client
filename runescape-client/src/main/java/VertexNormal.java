import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("VertexNormal")
public class VertexNormal {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1947768797
   )
   @Export("x")
   int x;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 858418419
   )
   @Export("y")
   int y;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1811796619
   )
   @Export("z")
   int z;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -513667565
   )
   @Export("magnitude")
   int magnitude;

   VertexNormal() {
   }

   @ObfuscatedSignature(
      descriptor = "(Lht;)V"
   )
   VertexNormal(VertexNormal var1) {
      this.x = var1.x;
      this.y = var1.y;
      this.z = var1.z;
      this.magnitude = var1.magnitude;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)J",
      garbageValue = "1903334964"
   )
   public static long method4844(int var0) {
      return ViewportMouse.ViewportMouse_entityTags[var0];
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1985144350"
   )
   static void method4845() {
      WorldMapRegion.WorldMapRegion_cachedSprites.clear();
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "9"
   )
   public static void method4843() {
      PlayerComposition.PlayerAppearance_cachedModels.clear();
   }
}
