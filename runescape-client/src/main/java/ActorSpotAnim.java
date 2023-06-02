import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("uv")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 144070655
   )
   @Export("spotAnimation")
   public int spotAnimation = -1;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1780958433
   )
   @Export("spotAnimationFrame")
   public int spotAnimationFrame = 0;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -642369433
   )
   @Export("spotAnimationFrameCycle")
   public int spotAnimationFrameCycle = 0;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -243562479
   )
   public int field5170 = 0;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 293081805
   )
   @Export("spotAnimationHeight")
   public int spotAnimationHeight = 0;

   public ActorSpotAnim(int var1, int var2, int var3, int var4) {
      this.spotAnimation = var1;
      this.spotAnimationHeight = var2;
      this.field5170 = var3;
      this.spotAnimationFrame = var4;
   }
}
