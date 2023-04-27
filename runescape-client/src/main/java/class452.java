import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rr")
public class class452 extends class455 {
   @ObfuscatedName("fv")
   @ObfuscatedSignature(
      descriptor = "Lnd;"
   )
   @Export("archive8")
   static Archive archive8;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -925977301
   )
   int field4791 = 0;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -970289067
   )
   int field4786 = 0;
   @ObfuscatedName("aw")
   double field4790 = 0.0;
   @ObfuscatedName("ac")
   double field4788 = 0.0;
   @ObfuscatedName("au")
   double field4789 = 0.0;
   @ObfuscatedName("ab")
   double field4792 = 0.0;
   @ObfuscatedName("aq")
   double field4785 = 0.0;

   public class452(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      super(var9, var10);
      this.field4791 = var3;
      this.field4786 = var6;
      if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
         this.field4790 = (double)var4;
         this.field4788 = (double)var5;
      } else {
         double var11 = (double)((float)(var7 + var1)) / 2.0;
         double var13 = (double)((float)(var8 + var2)) / 2.0;
         double var15 = (double)((float)(var4 + var7)) / 2.0;
         double var17 = (double)((float)(var5 + var8)) / 2.0;
         double var19 = (double)(var7 - var1) * -1.0 / (double)(var8 - var2);
         double var21 = (double)(var4 - var7) * -1.0 / (double)(var5 - var8);
         this.field4790 = (var17 + (var19 * var11 - var21 * var15) - var13) / (var19 - var21);
         this.field4788 = var13 + var19 * (this.field4790 - var11);
         this.field4789 = Math.sqrt(Math.pow(this.field4790 - (double)var1, 2.0) + Math.pow(this.field4788 - (double)var2, 2.0));
         this.field4792 = Math.atan2((double)var2 - this.field4788, (double)var1 - this.field4790);
         double var23 = Math.atan2((double)var8 - this.field4788, (double)var7 - this.field4790);
         this.field4785 = Math.atan2((double)var5 - this.field4788, (double)var4 - this.field4790);
         boolean var25 = this.field4792 <= var23 && var23 <= this.field4785 || this.field4785 <= var23 && var23 <= this.field4792;
         if (!var25) {
            this.field4785 += (double)(this.field4792 - this.field4785 > 0.0 ? 2 : -2) * Math.PI;
         }

      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2116561795"
   )
   public int vmethod8438() {
      double var1 = this.method8447();
      double var3 = this.field4792 + var1 * (this.field4785 - this.field4792);
      return (int)Math.round(this.field4790 + this.field4789 * Math.cos(var3));
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2107399454"
   )
   public int vmethod8433() {
      double var1 = this.method8447();
      double var3 = (this.field4785 - this.field4792) * var1 + this.field4792;
      return (int)Math.round(this.field4788 + this.field4789 * Math.sin(var3));
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   public int vmethod8434() {
      double var1 = this.method8447();
      return (int)Math.round((double)(this.field4786 - this.field4791) * var1 + (double)this.field4791);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lnm;II)Ltc;",
      garbageValue = "988192085"
   )
   public static IndexedSprite method8415(AbstractArchive var0, int var1) {
      byte[] var3 = var0.takeFileFlat(var1);
      boolean var2;
      if (var3 == null) {
         var2 = false;
      } else {
         class485.SpriteBuffer_decode(var3);
         var2 = true;
      }

      return !var2 ? null : Strings.method6600();
   }

   @ObfuscatedName("lb")
   @ObfuscatedSignature(
      descriptor = "(Lmq;I)Z",
      garbageValue = "-1381305986"
   )
   @Export("runCs1")
   static final boolean runCs1(Widget var0) {
      if (var0.cs1Comparisons == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
            int var2 = ArchiveLoader.method2230(var0, var1);
            int var3 = var0.cs1ComparisonValues[var1];
            if (var0.cs1Comparisons[var1] == 2) {
               if (var2 >= var3) {
                  return false;
               }
            } else if (var0.cs1Comparisons[var1] == 3) {
               if (var2 <= var3) {
                  return false;
               }
            } else if (var0.cs1Comparisons[var1] == 4) {
               if (var2 == var3) {
                  return false;
               }
            } else if (var3 != var2) {
               return false;
            }
         }

         return true;
      }
   }
}
