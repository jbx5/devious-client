import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
public class class370 extends AbstractQueue {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "[Lnf;"
   )
   class368[] field4387;
   @ObfuscatedName("w")
   Map field4384;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 53756609
   )
   int field4385;
   @ObfuscatedName("s")
   final Comparator field4383;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 480929613
   )
   int field4386;

   public class370(int var1, Comparator var2) {
      this.field4386 = 0;
      this.field4387 = new class368[var1];
      this.field4384 = new HashMap();
      this.field4383 = var2;
   }

   public class370(int var1) {
      this(var1, (Comparator)null);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "119219884"
   )
   void method7038() {
      int var1 = (this.field4387.length << 1) + 1;
      this.field4387 = (class368[])((class368[])Arrays.copyOf(this.field4387, var1));
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "1"
   )
   void method7043(int var1) {
      class368 var2;
      int var3;
      for(var2 = this.field4387[var1]; var1 > 0; var1 = var3) {
         var3 = var1 - 1 >>> 1;
         class368 var4 = this.field4387[var3];
         if (this.field4383 != null) {
            if (this.field4383.compare(var2.field4377, var4.field4377) >= 0) {
               break;
            }
         } else if (((Comparable)var2.field4377).compareTo(var4.field4377) >= 0) {
            break;
         }

         this.field4387[var1] = var4;
         this.field4387[var1].field4376 = var1;
      }

      this.field4387[var1] = var2;
      this.field4387[var1].field4376 = var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-95"
   )
   void method7040(int var1) {
      class368 var2 = this.field4387[var1];

      int var8;
      for(int var3 = this.field4385 >>> 1; var1 < var3; var1 = var8) {
         int var4 = (var1 << 1) + 1;
         class368 var5 = this.field4387[var4];
         int var6 = (var1 << 1) + 2;
         class368 var7 = this.field4387[var6];
         if (this.field4383 != null) {
            if (var6 < this.field4385 && this.field4383.compare(var5.field4377, var7.field4377) > 0) {
               var8 = var6;
            } else {
               var8 = var4;
            }
         } else if (var6 < this.field4385 && ((Comparable)var5.field4377).compareTo(var7.field4377) > 0) {
            var8 = var6;
         } else {
            var8 = var4;
         }

         if (this.field4383 != null) {
            if (this.field4383.compare(var2.field4377, this.field4387[var8].field4377) <= 0) {
               break;
            }
         } else if (((Comparable)var2.field4377).compareTo(this.field4387[var8].field4377) <= 0) {
            break;
         }

         this.field4387[var1] = this.field4387[var8];
         this.field4387[var1].field4376 = var1;
      }

      this.field4387[var1] = var2;
      this.field4387[var1].field4376 = var1;
   }

   public boolean remove(Object var1) {
      class368 var2 = (class368)this.field4384.remove(var1);
      if (var2 == null) {
         return false;
      } else {
         ++this.field4386;
         --this.field4385;
         if (var2.field4376 == this.field4385) {
            this.field4387[this.field4385] = null;
            return true;
         } else {
            class368 var3 = this.field4387[this.field4385];
            this.field4387[this.field4385] = null;
            this.field4387[var2.field4376] = var3;
            this.field4387[var2.field4376].field4376 = var2.field4376;
            this.method7040(var2.field4376);
            if (var3 == this.field4387[var2.field4376]) {
               this.method7043(var2.field4376);
            }

            return true;
         }
      }
   }

   public Object peek() {
      return this.field4385 == 0 ? null : this.field4387[0].field4377;
   }

   public int size() {
      return this.field4385;
   }

   public boolean offer(Object var1) {
      if (this.field4384.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         ++this.field4386;
         int var2 = this.field4385;
         if (var2 >= this.field4387.length) {
            this.method7038();
         }

         ++this.field4385;
         if (var2 == 0) {
            this.field4387[0] = new class368(var1, 0);
            this.field4384.put(var1, this.field4387[0]);
         } else {
            this.field4387[var2] = new class368(var1, var2);
            this.field4384.put(var1, this.field4387[var2]);
            this.method7043(var2);
         }

         return true;
      }
   }

   public Object poll() {
      if (this.field4385 == 0) {
         return null;
      } else {
         ++this.field4386;
         Object var1 = this.field4387[0].field4377;
         this.field4384.remove(var1);
         --this.field4385;
         if (this.field4385 == 0) {
            this.field4387[this.field4385] = null;
         } else {
            this.field4387[0] = this.field4387[this.field4385];
            this.field4387[0].field4376 = 0;
            this.field4387[this.field4385] = null;
            this.method7040(0);
         }

         return var1;
      }
   }

   public Object[] toArray() {
      Object[] var1 = super.toArray();
      if (this.field4383 != null) {
         Arrays.sort(var1, this.field4383);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   public boolean contains(Object var1) {
      return this.field4384.containsKey(var1);
   }

   public Iterator iterator() {
      return new class369(this);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "78"
   )
   public static int method7065(int var0) {
      return var0 != 0 && var0 != 1 ? -1 : 0;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IB)Lqn;",
      garbageValue = "-49"
   )
   public static class463 method7047(int var0) {
      int var1 = class461.field4893[var0];
      if (var1 == 1) {
         return class463.field4897;
      } else if (var1 == 2) {
         return class463.field4903;
      } else {
         return var1 == 3 ? class463.field4898 : null;
      }
   }
}
