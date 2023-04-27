import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("AABB")
public class AABB {
   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "Lmd;"
   )
   static GameBuild field2611;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 108689513
   )
   @Export("xMid")
   int xMid;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 849275953
   )
   @Export("yMid")
   int yMid;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1615192333
   )
   @Export("zMid")
   int zMid;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1923653815
   )
   @Export("xMidOffset")
   int xMidOffset;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -975840301
   )
   @Export("yMidOffset")
   int yMidOffset;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -452185969
   )
   @Export("zMidOffset")
   int zMidOffset;

   AABB(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.xMid = var1;
      this.yMid = var2;
      this.zMid = var3;
      this.xMidOffset = var4;
      this.yMidOffset = var5;
      this.zMidOffset = var6;
   }
}
