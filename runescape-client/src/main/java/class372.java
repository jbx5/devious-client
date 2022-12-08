import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
public class class372 {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lnu;"
   )
   class368 field4425;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1332633145
   )
   int field4422 = 0;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1950005133
   )
   int field4423 = 0;

   @ObfuscatedSignature(
      descriptor = "(Lnu;II)V"
   )
   class372(class368 var1, int var2, int var3) {
      this.field4425 = var1;
      this.field4422 = var2;
      this.field4423 = var3;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "-8"
   )
   public String method7272() {
      if (this.method7251()) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(this.method7269());

         for(int var2 = this.field4422; var2 < this.field4423; ++var2) {
            class370 var3 = this.field4425.method7038(var2);
            var1.append(var3.field4395);
         }

         return var1.toString();
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-668291069"
   )
   boolean method7250(int var1) {
      return this.field4425.method7104() == 2 || this.field4425.method7104() == 1 && (!this.field4425.field4384 || this.field4423 - 1 != var1);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "866297201"
   )
   public boolean method7251() {
      return this.field4423 == this.field4422;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "200617085"
   )
   public int method7269() {
      return this.field4423 - this.field4422;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Lnp;I)Z",
      garbageValue = "1865365167"
   )
   boolean method7253(class370 var1) {
      if (this.field4425.field4388 == 2) {
         return true;
      } else if (this.field4425.field4388 == 0) {
         return false;
      } else {
         return this.field4425.method7039() != var1;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1800300537"
   )
   int method7270() {
      if (this.method7251()) {
         return 0;
      } else {
         class370 var1 = this.field4425.method7038(this.field4423 - 1);
         if (var1.field4395 == '\n') {
            return 0;
         } else if (this.method7253(var1)) {
            return this.field4425.field4385.advances[42];
         } else {
            int var2 = this.field4425.field4385.advances[var1.field4395];
            if (var2 == 0) {
               return var1.field4395 == '\t' ? this.field4425.field4385.advances[32] * 3 : this.field4425.field4385.advances[32];
            } else {
               return var2;
            }
         }
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Lpg;",
      garbageValue = "1286003884"
   )
   public class440 method7255() {
      if (this.method7251()) {
         return new class440(0, 0);
      } else {
         class370 var1 = this.field4425.method7038(this.field4423 - 1);
         return new class440(var1.field4398 + this.method7270(), var1.field4397);
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(IB)Lnp;",
      garbageValue = "1"
   )
   public class370 method7256(int var1) {
      return var1 >= 0 && var1 < this.method7269() ? this.field4425.method7038(this.field4422 + var1) : null;
   }
}
