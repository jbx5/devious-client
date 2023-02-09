import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ok")
public final class class391 {
   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "[Lrg;"
   )
   @Export("worldSelectArrows")
   static IndexedSprite[] worldSelectArrows;
   @ObfuscatedName("f")
   final Comparator field4526;
   @ObfuscatedName("w")
   final Map field4521;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lng;"
   )
   final class370 field4522;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lng;"
   )
   final class370 field4520;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      longValue = -6793249870985350943L
   )
   final long field4523;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lnr;"
   )
   final class389 field4525;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -80049473
   )
   final int field4524;

   @ObfuscatedSignature(
      descriptor = "(JILnr;)V"
   )
   class391(long var1, int var3, class389 var4) {
      this.field4526 = new class390(this);
      this.field4523 = var1;
      this.field4524 = var3;
      this.field4525 = var4;
      if (this.field4524 == -1) {
         this.field4521 = new HashMap(64);
         this.field4522 = new class370(64, this.field4526);
         this.field4520 = null;
      } else {
         if (this.field4525 == null) {
            throw new IllegalArgumentException("");
         }

         this.field4521 = new HashMap(this.field4524);
         this.field4522 = new class370(this.field4524, this.field4526);
         this.field4520 = new class370(this.field4524);
      }

   }

   @ObfuscatedSignature(
      descriptor = "(ILnr;)V"
   )
   public class391(int var1, class389 var2) {
      this(-1L, var1, var2);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-74"
   )
   boolean method7482() {
      return this.field4524 != -1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
      garbageValue = "-554777055"
   )
   public Object method7483(Object var1) {
      synchronized(this) {
         if (-1L != this.field4523) {
            this.method7486();
         }

         class392 var3 = (class392)this.field4521.get(var1);
         if (var3 == null) {
            return null;
         } else {
            this.method7485(var3, false);
            return var3.field4531;
         }
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
      garbageValue = "-2094667345"
   )
   public Object method7484(Object var1, Object var2) {
      synchronized(this) {
         if (this.field4523 != -1L) {
            this.method7486();
         }

         class392 var4 = (class392)this.field4521.get(var1);
         if (var4 != null) {
            Object var8 = var4.field4531;
            var4.field4531 = var2;
            this.method7485(var4, false);
            return var8;
         } else {
            class392 var5;
            if (this.method7482() && this.field4521.size() == this.field4524) {
               var5 = (class392)this.field4520.remove();
               this.field4521.remove(var5.field4529);
               this.field4522.remove(var5);
            }

            var5 = new class392(var2, var1);
            this.field4521.put(var1, var5);
            this.method7485(var5, true);
            return null;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Loh;ZI)V",
      garbageValue = "1998527527"
   )
   void method7485(class392 var1, boolean var2) {
      if (!var2) {
         this.field4522.remove(var1);
         if (this.method7482() && !this.field4520.remove(var1)) {
            throw new IllegalStateException("");
         }
      }

      var1.field4530 = System.currentTimeMillis();
      if (this.method7482()) {
         switch (this.field4525.field4514) {
            case 0:
               var1.field4528 = var1.field4530;
               break;
            case 1:
               ++var1.field4528;
         }

         this.field4520.add(var1);
      }

      this.field4522.add(var1);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-95573050"
   )
   void method7486() {
      if (this.field4523 == -1L) {
         throw new IllegalStateException("");
      } else {
         long var1 = System.currentTimeMillis() - this.field4523;

         while(!this.field4522.isEmpty()) {
            class392 var3 = (class392)this.field4522.peek();
            if (var3.field4530 >= var1) {
               return;
            }

            this.field4521.remove(var3.field4529);
            this.field4522.remove(var3);
            if (this.method7482()) {
               this.field4520.remove(var3);
            }
         }

      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-15"
   )
   public void method7487() {
      synchronized(this) {
         this.field4521.clear();
         this.field4522.clear();
         if (this.method7482()) {
            this.field4520.clear();
         }

      }
   }
}
