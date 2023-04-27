import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tt")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1171575623
   )
   @Export("spotAnimation")
   public int spotAnimation = -1;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 971664459
   )
   @Export("spotAnimationFrame")
   public int spotAnimationFrame = 0;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 77733639
   )
   @Export("spotAnimationFrameCycle")
   public int spotAnimationFrameCycle = 0;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1415749665
   )
   public int field5144 = 0;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -790772793
   )
   @Export("spotAnimationHeight")
   public int spotAnimationHeight = 0;

   public ActorSpotAnim(int var1, int var2, int var3, int var4) {
      this.spotAnimation = var1;
      this.spotAnimationHeight = var2;
      this.field5144 = var3;
      this.spotAnimationFrame = var4;
   }
}
