import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
public class class215 {
   @ObfuscatedName("at")
   final int[][] field2390;
   @ObfuscatedName("an")
   final int[][] field2387;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 2071166765
   )
   int field2391;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -322205241
   )
   int field2389;
   @ObfuscatedName("ax")
   final int[] field2388;
   @ObfuscatedName("ap")
   final int[] field2386;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 524552563
   )
   final int field2392;

   public class215(int var1, int var2) {
      this.field2390 = new int[var1][var2];
      this.field2387 = new int[var1][var2];
      int var3 = var2 * var1;
      int var4 = class128.method2970(var3 / 4);
      this.field2388 = new int[var4];
      this.field2386 = new int[var4];
      this.field2392 = var4 - 1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "49275"
   )
   void method4253() {
      for(int var1 = 0; var1 < this.field2390.length; ++var1) {
         for(int var2 = 0; var2 < this.field2390[var1].length; ++var2) {
            this.field2390[var1][var2] = 0;
            this.field2387[var1][var2] = 99999999;
         }
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-233085726"
   )
   void method4223(int var1, int var2) {
      this.field2391 = var1;
      this.field2389 = var2;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-688840555"
   )
   int method4243() {
      return this.field2391;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1112467231"
   )
   int method4251() {
      return this.field2389;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-195718858"
   )
   int method4230() {
      return this.field2390.length;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1040069971"
   )
   int method4227() {
      return this.field2390[0].length;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)[[I",
      garbageValue = "-83163757"
   )
   int[][] method4245() {
      return this.field2390;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(I)[[I",
      garbageValue = "1989654250"
   )
   int[][] method4229() {
      return this.field2387;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(S)[I",
      garbageValue = "30978"
   )
   int[] method4225() {
      return this.field2388;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)[I",
      garbageValue = "-853225023"
   )
   int[] method4221() {
      return this.field2386;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "100629336"
   )
   int method4232() {
      return this.field2392;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "641389715"
   )
   @Export("ItemContainer_getCount")
   static int ItemContainer_getCount(int var0, int var1) {
      ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var2 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
      }
   }

   @ObfuscatedName("ap")
   @Export("Entity_unpackID")
   public static int Entity_unpackID(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(II)J",
      garbageValue = "1690944162"
   )
   public static long method4252(int var0) {
      if (var0 > 63) {
         throw new class387("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
      } else {
         return (long)Math.pow(2.0, (double)var0) - 1L;
      }
   }
}
