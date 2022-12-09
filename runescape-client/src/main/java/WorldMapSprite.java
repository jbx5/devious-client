import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
   @ObfuscatedName("e")
   @Export("tileColors")
   final int[] tileColors;

   WorldMapSprite() {
      this.tileColors = new int[4096];
   }

   WorldMapSprite(int[] var1) {
      this.tileColors = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "77614709"
   )
   @Export("getTileColor")
   final int getTileColor(int var1, int var2) {
      return this.tileColors[var2 * 64 + var1];
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "118"
   )
   public static int method5272(int var0) {
      return Varps.method5806(ViewportMouse.ViewportMouse_entityTags[var0]);
   }
}
