import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pk")
public final class class398 {
   @ObfuscatedName("af")
   final Comparator field4537;
   @ObfuscatedName("an")
   final Map field4536;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Loe;"
   )
   final class377 field4540;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Loe;"
   )
   final class377 field4535;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      longValue = -5966338096779578459L
   )
   final long field4538;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lpy;"
   )
   final class396 field4539;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1638192103
   )
   final int field4541;

   @ObfuscatedSignature(
      descriptor = "(JILpy;)V"
   )
   class398(long var1, int var3, class396 var4) {
      this.field4537 = new class397(this);
      this.field4538 = var1;
      this.field4541 = var3;
      this.field4539 = var4;
      if (this.field4541 == -1) {
         this.field4536 = new HashMap(64);
         this.field4540 = new class377(64, this.field4537);
         this.field4535 = null;
      } else {
         if (this.field4539 == null) {
            throw new IllegalArgumentException("");
         }

         this.field4536 = new HashMap(this.field4541);
         this.field4540 = new class377(this.field4541, this.field4537);
         this.field4535 = new class377(this.field4541);
      }

   }

   @ObfuscatedSignature(
      descriptor = "(ILpy;)V"
   )
   public class398(int var1, class396 var2) {
      this(-1L, var1, var2);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-119"
   )
   boolean method7697() {
      return this.field4541 != -1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;S)Ljava/lang/Object;",
      garbageValue = "12054"
   )
   public Object method7718(Object var1) {
      synchronized(this) {
         if (-1L != this.field4538) {
            this.method7702();
         }

         class399 var3 = (class399)this.field4536.get(var1);
         if (var3 == null) {
            return null;
         } else {
            this.method7700(var3, false);
            return var3.field4542;
         }
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
      garbageValue = "747668912"
   )
   public Object method7699(Object var1, Object var2) {
      synchronized(this) {
         if (this.field4538 != -1L) {
            this.method7702();
         }

         class399 var4 = (class399)this.field4536.get(var1);
         if (var4 != null) {
            Object var8 = var4.field4542;
            var4.field4542 = var2;
            this.method7700(var4, false);
            return var8;
         } else {
            class399 var5;
            if (this.method7697() && this.field4536.size() == this.field4541) {
               var5 = (class399)this.field4535.remove();
               this.field4536.remove(var5.field4543);
               this.field4540.remove(var5);
            }

            var5 = new class399(var2, var1);
            this.field4536.put(var1, var5);
            this.method7700(var5, true);
            return null;
         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lpj;ZB)V",
      garbageValue = "-8"
   )
   void method7700(class399 var1, boolean var2) {
      if (!var2) {
         this.field4540.remove(var1);
         if (this.method7697() && !this.field4535.remove(var1)) {
            throw new IllegalStateException("");
         }
      }

      var1.field4544 = System.currentTimeMillis();
      if (this.method7697()) {
         switch (this.field4539.field4531) {
            case 0:
               ++var1.field4545;
               break;
            case 1:
               var1.field4545 = var1.field4544;
         }

         this.field4535.add(var1);
      }

      this.field4540.add(var1);
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   void method7702() {
      if (this.field4538 == -1L) {
         throw new IllegalStateException("");
      } else {
         long var1 = System.currentTimeMillis() - this.field4538;

         while(!this.field4540.isEmpty()) {
            class399 var3 = (class399)this.field4540.peek();
            if (var3.field4544 >= var1) {
               return;
            }

            this.field4536.remove(var3.field4543);
            this.field4540.remove(var3);
            if (this.method7697()) {
               this.field4535.remove(var3);
            }
         }

      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1971799995"
   )
   public void method7719() {
      synchronized(this) {
         this.field4536.clear();
         this.field4540.clear();
         if (this.method7697()) {
            this.field4535.clear();
         }

      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-262861184"
   )
   public static void method7709() {
      class503.SpriteBuffer_xOffsets = null;
      class17.SpriteBuffer_yOffsets = null;
      class97.SpriteBuffer_spriteWidths = null;
      class138.SpriteBuffer_spriteHeights = null;
      class394.SpriteBuffer_spritePalette = null;
      VarbitComposition.SpriteBuffer_pixels = null;
   }
}
