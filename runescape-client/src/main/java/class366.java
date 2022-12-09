import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
public class class366 extends AbstractQueue {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "[Lnb;"
   )
   class364[] field4373;
   @ObfuscatedName("e")
   Map field4368;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1410749845
   )
   int field4369;
   @ObfuscatedName("x")
   final Comparator field4371;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1565326987
   )
   int field4372;

   public class366(int var1, Comparator var2) {
      this.field4372 = 0;
      this.field4373 = new class364[var1];
      this.field4368 = new HashMap();
      this.field4371 = var2;
   }

   public class366(int var1) {
      this(var1, (Comparator)null);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-417662224"
   )
   void method7014() {
      int var1 = (this.field4373.length << 1) + 1;
      this.field4373 = (class364[])((class364[])Arrays.copyOf(this.field4373, var1));
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-77"
   )
   void method7006(int var1) {
      class364 var2;
      int var3;
      for(var2 = this.field4373[var1]; var1 > 0; var1 = var3) {
         var3 = var1 - 1 >>> 1;
         class364 var4 = this.field4373[var3];
         if (this.field4371 != null) {
            if (this.field4371.compare(var2.field4362, var4.field4362) >= 0) {
               break;
            }
         } else if (((Comparable)var2.field4362).compareTo(var4.field4362) >= 0) {
            break;
         }

         this.field4373[var1] = var4;
         this.field4373[var1].field4363 = var1;
      }

      this.field4373[var1] = var2;
      this.field4373[var1].field4363 = var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "0"
   )
   void method7007(int var1) {
      class364 var2 = this.field4373[var1];

      int var8;
      for(int var3 = this.field4369 >>> 1; var1 < var3; var1 = var8) {
         int var4 = (var1 << 1) + 1;
         class364 var5 = this.field4373[var4];
         int var6 = (var1 << 1) + 2;
         class364 var7 = this.field4373[var6];
         if (this.field4371 != null) {
            if (var6 < this.field4369 && this.field4371.compare(var5.field4362, var7.field4362) > 0) {
               var8 = var6;
            } else {
               var8 = var4;
            }
         } else if (var6 < this.field4369 && ((Comparable)var5.field4362).compareTo(var7.field4362) > 0) {
            var8 = var6;
         } else {
            var8 = var4;
         }

         if (this.field4371 != null) {
            if (this.field4371.compare(var2.field4362, this.field4373[var8].field4362) <= 0) {
               break;
            }
         } else if (((Comparable)var2.field4362).compareTo(this.field4373[var8].field4362) <= 0) {
            break;
         }

         this.field4373[var1] = this.field4373[var8];
         this.field4373[var1].field4363 = var1;
      }

      this.field4373[var1] = var2;
      this.field4373[var1].field4363 = var1;
   }

   public boolean remove(Object var1) {
      class364 var2 = (class364)this.field4368.remove(var1);
      if (var2 == null) {
         return false;
      } else {
         ++this.field4372;
         --this.field4369;
         if (this.field4369 == var2.field4363) {
            this.field4373[this.field4369] = null;
            return true;
         } else {
            class364 var3 = this.field4373[this.field4369];
            this.field4373[this.field4369] = null;
            this.field4373[var2.field4363] = var3;
            this.field4373[var2.field4363].field4363 = var2.field4363;
            this.method7007(var2.field4363);
            if (var3 == this.field4373[var2.field4363]) {
               this.method7006(var2.field4363);
            }

            return true;
         }
      }
   }

   public Object peek() {
      return this.field4369 == 0 ? null : this.field4373[0].field4362;
   }

   public int size() {
      return this.field4369;
   }

   public Object poll() {
      if (this.field4369 == 0) {
         return null;
      } else {
         ++this.field4372;
         Object var1 = this.field4373[0].field4362;
         this.field4368.remove(var1);
         --this.field4369;
         if (this.field4369 == 0) {
            this.field4373[this.field4369] = null;
         } else {
            this.field4373[0] = this.field4373[this.field4369];
            this.field4373[0].field4363 = 0;
            this.field4373[this.field4369] = null;
            this.method7007(0);
         }

         return var1;
      }
   }

   public boolean contains(Object var1) {
      return this.field4368.containsKey(var1);
   }

   public Object[] toArray() {
      Object[] var1 = super.toArray();
      if (this.field4371 != null) {
         Arrays.sort(var1, this.field4371);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   public Iterator iterator() {
      return new class365(this);
   }

   public boolean offer(Object var1) {
      if (this.field4368.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         ++this.field4372;
         int var2 = this.field4369;
         if (var2 >= this.field4373.length) {
            this.method7014();
         }

         ++this.field4369;
         if (var2 == 0) {
            this.field4373[0] = new class364(var1, 0);
            this.field4368.put(var1, this.field4373[0]);
         } else {
            this.field4373[var2] = new class364(var1, var2);
            this.field4368.put(var1, this.field4373[var2]);
            this.method7006(var2);
         }

         return true;
      }
   }
}
