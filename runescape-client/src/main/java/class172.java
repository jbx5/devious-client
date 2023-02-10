import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class172 {
   @ObfuscatedName("z")
   @Export("Tiles_overlays")
   static short[][][] Tiles_overlays;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1676967961
   )
   static int field1868;
   @ObfuscatedName("p")
   @Export("ByteArrayPool_alternativeSizes")
   public static int[] ByteArrayPool_alternativeSizes;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ldg;"
   )
   public UrlRequest field1870;
   @ObfuscatedName("w")
   public float[] field1864;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfs;"
   )
   final class166 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfs;)V"
   )
   class172(class166 var1) {
      this.this$0 = var1;
      this.field1864 = new float[4];
   }
}
