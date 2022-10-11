import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
public class class369 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lnz;"
   )
   class365 field4370;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1691351667
   )
   int field4371 = 0;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -986062123
   )
   int field4372 = 0;

   @ObfuscatedSignature(
      descriptor = "(Lnz;II)V"
   )
   class369(class365 var1, int var2, int var3) {
      this.field4370 = var1;
      this.field4371 = var2;
      this.field4372 = var3;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-2128359160"
   )
   public String method7116() {
      if (this.method7097()) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(this.method7098());

         for(int var2 = this.field4371; var2 < this.field4372; ++var2) {
            class367 var3 = this.field4370.method6881(var2);
            var1.append(var3.field4347);
         }

         return var1.toString();
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "0"
   )
   boolean method7096(int var1) {
      return this.field4370.method6908() == 2 || this.field4370.method6908() == 1 && (!this.field4370.field4330 || this.field4372 - 1 != var1);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1367495691"
   )
   public boolean method7097() {
      return this.field4372 == this.field4371;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1700191897"
   )
   public int method7098() {
      return this.field4372 - this.field4371;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lns;B)Z",
      garbageValue = "109"
   )
   boolean method7099(class367 var1) {
      if (this.field4370.field4338 == 2) {
         return true;
      } else if (this.field4370.field4338 == 0) {
         return false;
      } else {
         return this.field4370.method6882() != var1;
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-38"
   )
   int method7109() {
      if (this.method7097()) {
         return 0;
      } else {
         class367 var1 = this.field4370.method6881(this.field4372 - 1);
         if (var1.field4347 == '\n') {
            return 0;
         } else if (this.method7099(var1)) {
            return this.field4370.field4335.advances[42];
         } else {
            int var2 = this.field4370.field4335.advances[var1.field4347];
            if (var2 == 0) {
               return var1.field4347 == '\t' ? this.field4370.field4335.advances[32] * 3 : this.field4370.field4335.advances[32];
            } else {
               return var2;
            }
         }
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)Lpv;",
      garbageValue = "1969608464"
   )
   public class437 method7101() {
      if (this.method7097()) {
         return new class437(0, 0);
      } else {
         class367 var1 = this.field4370.method6881(this.field4372 - 1);
         return new class437(var1.field4341 + this.method7109(), var1.field4343);
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(IB)Lns;",
      garbageValue = "2"
   )
   public class367 method7114(int var1) {
      return var1 >= 0 && var1 < this.method7098() ? this.field4370.method6881(this.field4371 + var1) : null;
   }
}
