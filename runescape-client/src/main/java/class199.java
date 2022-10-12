import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
public class class199 implements class30 {
   @ObfuscatedName("iy")
   @ObfuscatedSignature(
      descriptor = "[Lri;"
   )
   @Export("crossSprites")
   static SpritePixels[] crossSprites;
   @ObfuscatedName("a")
   char[] field2253 = new char[128];
   @ObfuscatedName("f")
   int[] field2244 = new int[128];
   @ObfuscatedName("c")
   public int[] field2246 = new int[128];
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1356554437
   )
   public int field2247 = 0;
   @ObfuscatedName("h")
   int[] field2260 = new int[128];
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -130807531
   )
   int field2255 = 0;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1783716615
   )
   int field2250 = 0;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1510878411
   )
   int field2249 = 0;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1994138379
   )
   int field2258 = 0;
   @ObfuscatedName("r")
   boolean[] field2251 = new boolean[112];
   @ObfuscatedName("l")
   boolean[] field2254 = new boolean[112];
   @ObfuscatedName("s")
   boolean[] field2257 = new boolean[112];
   @ObfuscatedName("p")
   public char field2256;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 537328019
   )
   public int field2252;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1393279885"
   )
   public boolean vmethod3949(int var1) {
      this.method3952(var1);
      this.field2251[var1] = true;
      this.field2254[var1] = true;
      this.field2257[var1] = false;
      this.field2246[++this.field2247 - 1] = var1;
      return true;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1545920011"
   )
   public boolean vmethod3989(int var1) {
      this.field2251[var1] = false;
      this.field2254[var1] = false;
      this.field2257[var1] = true;
      this.field2260[++this.field2255 - 1] = var1;
      return true;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "1185620152"
   )
   public boolean vmethod3951(char var1) {
      int var2 = this.field2249 + 1 & 127;
      if (var2 != this.field2250) {
         this.field2244[this.field2249] = -1;
         this.field2253[this.field2249] = var1;
         this.field2249 = var2;
      }

      return false;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(ZB)Z",
      garbageValue = "109"
   )
   public boolean vmethod3953(boolean var1) {
      return false;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-523425228"
   )
   void method3952(int var1) {
      int var2 = this.field2249 + 1 & 127;
      if (var2 != this.field2250) {
         this.field2244[this.field2249] = var1;
         this.field2253[this.field2249] = 0;
         this.field2249 = var2;
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1294780802"
   )
   public void method3954() {
      this.field2250 = this.field2258;
      this.field2258 = this.field2249;
      this.field2247 = 0;
      this.field2255 = 0;
      Arrays.fill(this.field2254, false);
      Arrays.fill(this.field2257, false);
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "75"
   )
   public final boolean method3981() {
      if (this.field2258 == this.field2250) {
         return false;
      } else {
         this.field2252 = this.field2244[this.field2250];
         this.field2256 = this.field2253[this.field2250];
         this.field2250 = this.field2250 + 1 & 127;
         return true;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-532436733"
   )
   public boolean method3990(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2254[var1] : false;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-413170912"
   )
   public boolean method3956(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2251[var1] : false;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "16"
   )
   public boolean method3966(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2257[var1] : false;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I)[I",
      garbageValue = "1388395040"
   )
   public int[] method3985() {
      int[] var1 = new int[this.field2247];

      for(int var2 = 0; var2 < this.field2247; ++var2) {
         var1[var2] = this.field2246[var2];
      }

      return var1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)[I",
      garbageValue = "7"
   )
   public int[] method3959() {
      int[] var1 = new int[this.field2255];

      for(int var2 = 0; var2 < this.field2255; ++var2) {
         var1[var2] = this.field2260[var2];
      }

      return var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "-1953754974"
   )
   @Export("ByteArrayPool_release")
   public static synchronized void ByteArrayPool_release(byte[] var0) {
      if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4385) {
         ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
      } else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4386) {
         ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
      } else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4387) {
         ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
      } else if (var0.length == 30000 && ByteArrayPool.field4384 < ByteArrayPool.field4392) {
         ByteArrayPool.field4390[++ByteArrayPool.field4384 - 1] = var0;
      } else {
         if (class357.ByteArrayPool_arrays != null) {
            for(int var1 = 0; var1 < BoundaryObject.ByteArrayPool_alternativeSizes.length; ++var1) {
               if (var0.length == BoundaryObject.ByteArrayPool_alternativeSizes[var1] && class239.ByteArrayPool_altSizeArrayCounts[var1] < class357.ByteArrayPool_arrays[var1].length) {
                  class357.ByteArrayPool_arrays[var1][class239.ByteArrayPool_altSizeArrayCounts[var1]++] = var0;
                  return;
               }
            }
         }

      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(CB)Z",
      garbageValue = "3"
   )
   static boolean method3997(char var0) {
      return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Laa;I)V",
      garbageValue = "-68845051"
   )
   public static final void method3999(class51 var0) {
      class32.pcmPlayerProvider = var0;
   }
}
