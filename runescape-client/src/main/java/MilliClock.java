import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("MilliClock")
public class MilliClock extends Clock {
   @ObfuscatedName("ux")
   @ObfuscatedGetter(
      intValue = 924172288
   )
   static int field1871;
   @ObfuscatedName("af")
   long[] field1879 = new long[10];
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1354187759
   )
   int field1872 = 256;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1087246239
   )
   int field1873 = 1;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      longValue = -3320355304386370601L
   )
   long field1875 = class96.method2634();
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1554226597
   )
   int field1878 = 0;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1512168621
   )
   int field1876;

   MilliClock() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field1879[var1] = this.field1875;
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-331366942"
   )
   @Export("mark")
   public void mark() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field1879[var1] = 0L;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-1491982008"
   )
   @Export("wait")
   public int wait(int var1, int var2) {
      int var3 = this.field1872;
      int var4 = this.field1873;
      this.field1872 = 300;
      this.field1873 = 1;
      this.field1875 = class96.method2634();
      if (0L == this.field1879[this.field1876]) {
         this.field1872 = var3;
         this.field1873 = var4;
      } else if (this.field1875 > this.field1879[this.field1876]) {
         this.field1872 = (int)((long)(var1 * 2560) / (this.field1875 - this.field1879[this.field1876]));
      }

      if (this.field1872 < 25) {
         this.field1872 = 25;
      }

      if (this.field1872 > 256) {
         this.field1872 = 256;
         this.field1873 = (int)((long)var1 - (this.field1875 - this.field1879[this.field1876]) / 10L);
      }

      if (this.field1873 > var1) {
         this.field1873 = var1;
      }

      this.field1879[this.field1876] = this.field1875;
      this.field1876 = (this.field1876 + 1) % 10;
      int var5;
      if (this.field1873 > 1) {
         for(var5 = 0; var5 < 10; ++var5) {
            if (0L != this.field1879[var5]) {
               this.field1879[var5] += (long)this.field1873;
            }
         }
      }

      if (this.field1873 < var2) {
         this.field1873 = var2;
      }

      PlayerComposition.method6084((long)this.field1873);

      for(var5 = 0; this.field1878 < 256; this.field1878 += this.field1872) {
         ++var5;
      }

      this.field1878 &= 255;
      return var5;
   }
}
