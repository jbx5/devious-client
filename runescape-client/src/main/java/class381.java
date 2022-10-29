import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
public final class class381 {
   @ObfuscatedName("a")
   final Comparator field4446;
   @ObfuscatedName("f")
   final Map field4442;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lmd;"
   )
   final class363 field4441;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lmd;"
   )
   final class363 field4443;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      longValue = -7051518262520903249L
   )
   final long field4444;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lnw;"
   )
   final class379 field4445;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1685085075
   )
   final int field4447;

   @ObfuscatedSignature(
      descriptor = "(JILnw;)V"
   )
   class381(long var1, int var3, class379 var4) {
      this.field4446 = new class380(this);
      this.field4444 = var1;
      this.field4447 = var3;
      this.field4445 = var4;
      if (this.field4447 == -1) {
         this.field4442 = new HashMap(64);
         this.field4441 = new class363(64, this.field4446);
         this.field4443 = null;
      } else {
         if (this.field4445 == null) {
            throw new IllegalArgumentException("");
         }

         this.field4442 = new HashMap(this.field4447);
         this.field4441 = new class363(this.field4447, this.field4446);
         this.field4443 = new class363(this.field4447);
      }

   }

   @ObfuscatedSignature(
      descriptor = "(ILnw;)V"
   )
   public class381(int var1, class379 var2) {
      this(-1L, var1, var2);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1897828923"
   )
   boolean method7214() {
      return this.field4447 != -1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
      garbageValue = "1414006924"
   )
   public Object method7208(Object var1) {
      synchronized(this) {
         if (this.field4444 != -1L) {
            this.method7211();
         }

         class382 var3 = (class382)this.field4442.get(var1);
         if (var3 == null) {
            return null;
         } else {
            this.method7215(var3, false);
            return var3.field4454;
         }
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
      garbageValue = "-1114479475"
   )
   public Object method7209(Object var1, Object var2) {
      synchronized(this) {
         if (this.field4444 != -1L) {
            this.method7211();
         }

         class382 var4 = (class382)this.field4442.get(var1);
         if (var4 != null) {
            Object var8 = var4.field4454;
            var4.field4454 = var2;
            this.method7215(var4, false);
            return var8;
         } else {
            class382 var5;
            if (this.method7214() && this.field4442.size() == this.field4447) {
               var5 = (class382)this.field4443.remove();
               this.field4442.remove(var5.field4450);
               this.field4441.remove(var5);
            }

            var5 = new class382(var2, var1);
            this.field4442.put(var1, var5);
            this.method7215(var5, true);
            return null;
         }
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lng;ZI)V",
      garbageValue = "2096861179"
   )
   void method7215(class382 var1, boolean var2) {
      if (!var2) {
         this.field4441.remove(var1);
         if (this.method7214() && !this.field4443.remove(var1)) {
            throw new IllegalStateException("");
         }
      }

      var1.field4451 = System.currentTimeMillis();
      if (this.method7214()) {
         switch (this.field4445.field4434) {
            case 0:
               var1.field4453 = var1.field4451;
               break;
            case 1:
               ++var1.field4453;
         }

         this.field4443.add(var1);
      }

      this.field4441.add(var1);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1487584922"
   )
   void method7211() {
      if (this.field4444 == -1L) {
         throw new IllegalStateException("");
      } else {
         long var1 = System.currentTimeMillis() - this.field4444;

         while(!this.field4441.isEmpty()) {
            class382 var3 = (class382)this.field4441.peek();
            if (var3.field4451 >= var1) {
               return;
            }

            this.field4442.remove(var3.field4450);
            this.field4441.remove(var3);
            if (this.method7214()) {
               this.field4443.remove(var3);
            }
         }

      }
   }
}
