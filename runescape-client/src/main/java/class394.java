import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
public final class class394 {
   @ObfuscatedName("aj")
   final Comparator field4487;
   @ObfuscatedName("al")
   final Map field4484;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lop;"
   )
   final class373 field4483;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lop;"
   )
   final class373 field4481;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      longValue = -7338482294239229465L
   )
   final long field4482;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lpm;"
   )
   final class392 field4486;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1557215357
   )
   final int field4485;

   @ObfuscatedSignature(
      descriptor = "(JILpm;)V"
   )
   class394(long var1, int var3, class392 var4) {
      this.field4487 = new class393(this);
      this.field4482 = var1;
      this.field4485 = var3;
      this.field4486 = var4;
      if (this.field4485 == -1) {
         this.field4484 = new HashMap(64);
         this.field4483 = new class373(64, this.field4487);
         this.field4481 = null;
      } else {
         if (this.field4486 == null) {
            throw new IllegalArgumentException("");
         }

         this.field4484 = new HashMap(this.field4485);
         this.field4483 = new class373(this.field4485, this.field4487);
         this.field4481 = new class373(this.field4485);
      }

   }

   @ObfuscatedSignature(
      descriptor = "(ILpm;)V"
   )
   public class394(int var1, class392 var2) {
      this(-1L, var1, var2);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-121"
   )
   boolean method7421() {
      return this.field4485 != -1;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;",
      garbageValue = "-9"
   )
   public Object method7414(Object var1) {
      synchronized(this) {
         if (this.field4482 != -1L) {
            this.method7416();
         }

         class395 var3 = (class395)this.field4484.get(var1);
         if (var3 == null) {
            return null;
         } else {
            this.method7415(var3, false);
            return var3.field4491;
         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
      garbageValue = "-388203843"
   )
   public Object method7427(Object var1, Object var2) {
      synchronized(this) {
         if (this.field4482 != -1L) {
            this.method7416();
         }

         class395 var4 = (class395)this.field4484.get(var1);
         if (var4 != null) {
            Object var8 = var4.field4491;
            var4.field4491 = var2;
            this.method7415(var4, false);
            return var8;
         } else {
            class395 var5;
            if (this.method7421() && this.field4484.size() == this.field4485) {
               var5 = (class395)this.field4481.remove();
               this.field4484.remove(var5.field4489);
               this.field4483.remove(var5);
            }

            var5 = new class395(var2, var1);
            this.field4484.put(var1, var5);
            this.method7415(var5, true);
            return null;
         }
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lpn;ZI)V",
      garbageValue = "-797803936"
   )
   void method7415(class395 var1, boolean var2) {
      if (!var2) {
         this.field4483.remove(var1);
         if (this.method7421() && !this.field4481.remove(var1)) {
            throw new IllegalStateException("");
         }
      }

      var1.field4488 = System.currentTimeMillis();
      if (this.method7421()) {
         switch (this.field4486.field4477) {
            case 0:
               ++var1.field4490;
               break;
            case 1:
               var1.field4490 = var1.field4488;
         }

         this.field4481.add(var1);
      }

      this.field4483.add(var1);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1617279865"
   )
   void method7416() {
      if (this.field4482 == -1L) {
         throw new IllegalStateException("");
      } else {
         long var1 = System.currentTimeMillis() - this.field4482;

         while(!this.field4483.isEmpty()) {
            class395 var3 = (class395)this.field4483.peek();
            if (var3.field4488 >= var1) {
               return;
            }

            this.field4484.remove(var3.field4489);
            this.field4483.remove(var3);
            if (this.method7421()) {
               this.field4481.remove(var3);
            }
         }

      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1379189598"
   )
   public void method7417() {
      synchronized(this) {
         this.field4484.clear();
         this.field4483.clear();
         if (this.method7421()) {
            this.field4481.clear();
         }

      }
   }
}
