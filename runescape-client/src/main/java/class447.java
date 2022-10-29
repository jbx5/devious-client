import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
class class447 implements Iterator {
   @ObfuscatedName("h")
   @Export("Interpreter_stringLocals")
   static String[] Interpreter_stringLocals;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1360521347
   )
   int field4812;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lqf;"
   )
   final class448 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lqf;)V"
   )
   class447(class448 var1) {
      this.this$0 = var1;
   }

   public boolean hasNext() {
      return this.field4812 < this.this$0.method7748();
   }

   public Object next() {
      int var1 = ++this.field4812 - 1;
      class413 var2 = (class413)this.this$0.field4818.get((long)var1);
      return var2 != null ? var2 : this.this$0.method8211(var1);
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }
}
