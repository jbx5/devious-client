import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
public class class373 extends AbstractQueue {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "[Lob;"
   )
   class371[] field4360;
   @ObfuscatedName("al")
   Map field4358;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 706349751
   )
   int field4359;
   @ObfuscatedName("ab")
   final Comparator field4361;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -305399775
   )
   int field4362;

   public class373(int var1, Comparator var2) {
      this.field4362 = 0;
      this.field4360 = new class371[var1];
      this.field4358 = new HashMap();
      this.field4361 = var2;
   }

   public class373(int var1) {
      this(var1, (Comparator)null);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1216129727"
   )
   void method6957() {
      int var1 = (this.field4360.length << 1) + 1;
      this.field4360 = (class371[])((class371[])Arrays.copyOf(this.field4360, var1));
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1481495660"
   )
   void method6960(int var1) {
      class371 var2;
      int var3;
      for(var2 = this.field4360[var1]; var1 > 0; var1 = var3) {
         var3 = var1 - 1 >>> 1;
         class371 var4 = this.field4360[var3];
         if (this.field4361 != null) {
            if (this.field4361.compare(var2.field4353, var4.field4353) >= 0) {
               break;
            }
         } else if (((Comparable)var2.field4353).compareTo(var4.field4353) >= 0) {
            break;
         }

         this.field4360[var1] = var4;
         this.field4360[var1].field4351 = var1;
      }

      this.field4360[var1] = var2;
      this.field4360[var1].field4351 = var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1540192029"
   )
   void method6961(int var1) {
      class371 var2 = this.field4360[var1];

      int var8;
      for(int var3 = this.field4359 >>> 1; var1 < var3; var1 = var8) {
         int var4 = (var1 << 1) + 1;
         class371 var5 = this.field4360[var4];
         int var6 = (var1 << 1) + 2;
         class371 var7 = this.field4360[var6];
         if (this.field4361 != null) {
            if (var6 < this.field4359 && this.field4361.compare(var5.field4353, var7.field4353) > 0) {
               var8 = var6;
            } else {
               var8 = var4;
            }
         } else if (var6 < this.field4359 && ((Comparable)var5.field4353).compareTo(var7.field4353) > 0) {
            var8 = var6;
         } else {
            var8 = var4;
         }

         if (this.field4361 != null) {
            if (this.field4361.compare(var2.field4353, this.field4360[var8].field4353) <= 0) {
               break;
            }
         } else if (((Comparable)var2.field4353).compareTo(this.field4360[var8].field4353) <= 0) {
            break;
         }

         this.field4360[var1] = this.field4360[var8];
         this.field4360[var1].field4351 = var1;
      }

      this.field4360[var1] = var2;
      this.field4360[var1].field4351 = var1;
   }

   public boolean remove(Object var1) {
      class371 var2 = (class371)this.field4358.remove(var1);
      if (var2 == null) {
         return false;
      } else {
         ++this.field4362;
         --this.field4359;
         if (this.field4359 == var2.field4351) {
            this.field4360[this.field4359] = null;
            return true;
         } else {
            class371 var3 = this.field4360[this.field4359];
            this.field4360[this.field4359] = null;
            this.field4360[var2.field4351] = var3;
            this.field4360[var2.field4351].field4351 = var2.field4351;
            this.method6961(var2.field4351);
            if (var3 == this.field4360[var2.field4351]) {
               this.method6960(var2.field4351);
            }

            return true;
         }
      }
   }

   public Object peek() {
      return this.field4359 == 0 ? null : this.field4360[0].field4353;
   }

   public Object poll() {
      if (this.field4359 == 0) {
         return null;
      } else {
         ++this.field4362;
         Object var1 = this.field4360[0].field4353;
         this.field4358.remove(var1);
         --this.field4359;
         if (this.field4359 == 0) {
            this.field4360[this.field4359] = null;
         } else {
            this.field4360[0] = this.field4360[this.field4359];
            this.field4360[0].field4351 = 0;
            this.field4360[this.field4359] = null;
            this.method6961(0);
         }

         return var1;
      }
   }

   public boolean contains(Object var1) {
      return this.field4358.containsKey(var1);
   }

   public Object[] toArray() {
      Object[] var1 = super.toArray();
      if (this.field4361 != null) {
         Arrays.sort(var1, this.field4361);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   public Iterator iterator() {
      return new class372(this);
   }

   public boolean offer(Object var1) {
      if (this.field4358.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         ++this.field4362;
         int var2 = this.field4359;
         if (var2 >= this.field4360.length) {
            this.method6957();
         }

         ++this.field4359;
         if (var2 == 0) {
            this.field4360[0] = new class371(var1, 0);
            this.field4358.put(var1, this.field4360[0]);
         } else {
            this.field4360[var2] = new class371(var1, var2);
            this.field4358.put(var1, this.field4360[var2]);
            this.method6960(var2);
         }

         return true;
      }
   }

   public int size() {
      return this.field4359;
   }
}
