import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
public class class390 extends AbstractQueue {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "[Lou;"
   )
   class388[] field4416;
   @ObfuscatedName("an")
   Map field4413;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -198371055
   )
   int field4412;
   @ObfuscatedName("as")
   final Comparator field4415;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 490326883
   )
   int field4414;

   public class390(int var1, Comparator var2) {
      this.field4414 = 0;
      this.field4416 = new class388[var1];
      this.field4413 = new HashMap();
      this.field4415 = var2;
   }

   public class390(int var1) {
      this(var1, (Comparator)null);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "2"
   )
   void method7226() {
      int var1 = (this.field4416.length << 1) + 1;
      this.field4416 = (class388[])((class388[])Arrays.copyOf(this.field4416, var1));
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "980463966"
   )
   void method7227(int var1) {
      class388 var2;
      int var3;
      for(var2 = this.field4416[var1]; var1 > 0; var1 = var3) {
         var3 = var1 - 1 >>> 1;
         class388 var4 = this.field4416[var3];
         if (this.field4415 != null) {
            if (this.field4415.compare(var2.field4406, var4.field4406) >= 0) {
               break;
            }
         } else if (((Comparable)var2.field4406).compareTo(var4.field4406) >= 0) {
            break;
         }

         this.field4416[var1] = var4;
         this.field4416[var1].field4407 = var1;
      }

      this.field4416[var1] = var2;
      this.field4416[var1].field4407 = var1;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "22"
   )
   void method7225(int var1) {
      class388 var2 = this.field4416[var1];

      int var8;
      for(int var3 = this.field4412 >>> 1; var1 < var3; var1 = var8) {
         int var4 = (var1 << 1) + 1;
         class388 var5 = this.field4416[var4];
         int var6 = (var1 << 1) + 2;
         class388 var7 = this.field4416[var6];
         if (this.field4415 != null) {
            if (var6 < this.field4412 && this.field4415.compare(var5.field4406, var7.field4406) > 0) {
               var8 = var6;
            } else {
               var8 = var4;
            }
         } else if (var6 < this.field4412 && ((Comparable)var5.field4406).compareTo(var7.field4406) > 0) {
            var8 = var6;
         } else {
            var8 = var4;
         }

         if (this.field4415 != null) {
            if (this.field4415.compare(var2.field4406, this.field4416[var8].field4406) <= 0) {
               break;
            }
         } else if (((Comparable)var2.field4406).compareTo(this.field4416[var8].field4406) <= 0) {
            break;
         }

         this.field4416[var1] = this.field4416[var8];
         this.field4416[var1].field4407 = var1;
      }

      this.field4416[var1] = var2;
      this.field4416[var1].field4407 = var1;
   }

   public boolean remove(Object var1) {
      class388 var2 = (class388)this.field4413.remove(var1);
      if (var2 == null) {
         return false;
      } else {
         ++this.field4414;
         --this.field4412;
         if (this.field4412 == var2.field4407) {
            this.field4416[this.field4412] = null;
            return true;
         } else {
            class388 var3 = this.field4416[this.field4412];
            this.field4416[this.field4412] = null;
            this.field4416[var2.field4407] = var3;
            this.field4416[var2.field4407].field4407 = var2.field4407;
            this.method7225(var2.field4407);
            if (var3 == this.field4416[var2.field4407]) {
               this.method7227(var2.field4407);
            }

            return true;
         }
      }
   }

   public Object peek() {
      return this.field4412 == 0 ? null : this.field4416[0].field4406;
   }

   public boolean contains(Object var1) {
      return this.field4413.containsKey(var1);
   }

   public int size() {
      return this.field4412;
   }

   public Object poll() {
      if (this.field4412 == 0) {
         return null;
      } else {
         ++this.field4414;
         Object var1 = this.field4416[0].field4406;
         this.field4413.remove(var1);
         --this.field4412;
         if (this.field4412 == 0) {
            this.field4416[this.field4412] = null;
         } else {
            this.field4416[0] = this.field4416[this.field4412];
            this.field4416[0].field4407 = 0;
            this.field4416[this.field4412] = null;
            this.method7225(0);
         }

         return var1;
      }
   }

   public Iterator iterator() {
      return new class389(this);
   }

   public Object[] toArray() {
      Object[] var1 = super.toArray();
      if (this.field4415 != null) {
         Arrays.sort(var1, this.field4415);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   public boolean offer(Object var1) {
      if (this.field4413.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         ++this.field4414;
         int var2 = this.field4412;
         if (var2 >= this.field4416.length) {
            this.method7226();
         }

         ++this.field4412;
         if (var2 == 0) {
            this.field4416[0] = new class388(var1, 0);
            this.field4413.put(var1, this.field4416[0]);
         } else {
            this.field4416[var2] = new class388(var1, var2);
            this.field4413.put(var1, this.field4416[var2]);
            this.method7227(var2);
         }

         return true;
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "0"
   )
   static void method7249(int var0) {
      if (var0 != Login.loginIndex) {
         Login.loginIndex = var0;
      }
   }
}
