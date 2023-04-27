import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
public class class377 extends AbstractQueue {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "[Loh;"
   )
   class375[] field4401;
   @ObfuscatedName("an")
   Map field4399;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1960181101
   )
   int field4403;
   @ObfuscatedName("ac")
   final Comparator field4402;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -874295403
   )
   int field4400;

   public class377(int var1, Comparator var2) {
      this.field4400 = 0;
      this.field4401 = new class375[var1];
      this.field4399 = new HashMap();
      this.field4402 = var2;
   }

   public class377(int var1) {
      this(var1, (Comparator)null);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "7"
   )
   void method7245() {
      int var1 = (this.field4401.length << 1) + 1;
      this.field4401 = (class375[])((class375[])Arrays.copyOf(this.field4401, var1));
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-89"
   )
   void method7220(int var1) {
      class375 var2;
      int var3;
      for(var2 = this.field4401[var1]; var1 > 0; var1 = var3) {
         var3 = var1 - 1 >>> 1;
         class375 var4 = this.field4401[var3];
         if (this.field4402 != null) {
            if (this.field4402.compare(var2.field4389, var4.field4389) >= 0) {
               break;
            }
         } else if (((Comparable)var2.field4389).compareTo(var4.field4389) >= 0) {
            break;
         }

         this.field4401[var1] = var4;
         this.field4401[var1].field4390 = var1;
      }

      this.field4401[var1] = var2;
      this.field4401[var1].field4390 = var1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "55"
   )
   void method7221(int var1) {
      class375 var2 = this.field4401[var1];

      int var8;
      for(int var3 = this.field4403 >>> 1; var1 < var3; var1 = var8) {
         int var4 = (var1 << 1) + 1;
         class375 var5 = this.field4401[var4];
         int var6 = (var1 << 1) + 2;
         class375 var7 = this.field4401[var6];
         if (this.field4402 != null) {
            if (var6 < this.field4403 && this.field4402.compare(var5.field4389, var7.field4389) > 0) {
               var8 = var6;
            } else {
               var8 = var4;
            }
         } else if (var6 < this.field4403 && ((Comparable)var5.field4389).compareTo(var7.field4389) > 0) {
            var8 = var6;
         } else {
            var8 = var4;
         }

         if (this.field4402 != null) {
            if (this.field4402.compare(var2.field4389, this.field4401[var8].field4389) <= 0) {
               break;
            }
         } else if (((Comparable)var2.field4389).compareTo(this.field4401[var8].field4389) <= 0) {
            break;
         }

         this.field4401[var1] = this.field4401[var8];
         this.field4401[var1].field4390 = var1;
      }

      this.field4401[var1] = var2;
      this.field4401[var1].field4390 = var1;
   }

   public boolean remove(Object var1) {
      class375 var2 = (class375)this.field4399.remove(var1);
      if (var2 == null) {
         return false;
      } else {
         ++this.field4400;
         --this.field4403;
         if (var2.field4390 == this.field4403) {
            this.field4401[this.field4403] = null;
            return true;
         } else {
            class375 var3 = this.field4401[this.field4403];
            this.field4401[this.field4403] = null;
            this.field4401[var2.field4390] = var3;
            this.field4401[var2.field4390].field4390 = var2.field4390;
            this.method7221(var2.field4390);
            if (var3 == this.field4401[var2.field4390]) {
               this.method7220(var2.field4390);
            }

            return true;
         }
      }
   }

   public Object peek() {
      return this.field4403 == 0 ? null : this.field4401[0].field4389;
   }

   public int size() {
      return this.field4403;
   }

   public boolean offer(Object var1) {
      if (this.field4399.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         ++this.field4400;
         int var2 = this.field4403;
         if (var2 >= this.field4401.length) {
            this.method7245();
         }

         ++this.field4403;
         if (var2 == 0) {
            this.field4401[0] = new class375(var1, 0);
            this.field4399.put(var1, this.field4401[0]);
         } else {
            this.field4401[var2] = new class375(var1, var2);
            this.field4399.put(var1, this.field4401[var2]);
            this.method7220(var2);
         }

         return true;
      }
   }

   public Object poll() {
      if (this.field4403 == 0) {
         return null;
      } else {
         ++this.field4400;
         Object var1 = this.field4401[0].field4389;
         this.field4399.remove(var1);
         --this.field4403;
         if (this.field4403 == 0) {
            this.field4401[this.field4403] = null;
         } else {
            this.field4401[0] = this.field4401[this.field4403];
            this.field4401[0].field4390 = 0;
            this.field4401[this.field4403] = null;
            this.method7221(0);
         }

         return var1;
      }
   }

   public boolean contains(Object var1) {
      return this.field4399.containsKey(var1);
   }

   public Iterator iterator() {
      return new class376(this);
   }

   public Object[] toArray() {
      Object[] var1 = super.toArray();
      if (this.field4402 != null) {
         Arrays.sort(var1, this.field4402);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lsg;[IB)[Ljava/lang/Object;",
      garbageValue = "-86"
   )
   static Object[] method7250(Buffer var0, int[] var1) {
      int var2 = var0.readUShortSmart();
      Object[] var3 = new Object[var1.length * var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         for(int var5 = 0; var5 < var1.length; ++var5) {
            int var6 = var1.length * var4 + var5;
            class478 var7 = class103.method2717(var1[var5]);
            var3[var6] = var7.method8895(var0);
         }
      }

      return var3;
   }
}
