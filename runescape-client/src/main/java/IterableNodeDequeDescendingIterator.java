import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lml;"
   )
   @Export("deque")
   IterableNodeDeque deque;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lpk;"
   )
   Node field4277;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lpk;"
   )
   @Export("last")
   Node last = null;

   @ObfuscatedSignature(
      descriptor = "(Lml;)V"
   )
   IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
      this.setDeque(var1);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lml;)V"
   )
   @Export("setDeque")
   void setDeque(IterableNodeDeque var1) {
      this.deque = var1;
      this.start();
   }

   @ObfuscatedName("f")
   @Export("start")
   void start() {
      this.field4277 = this.deque != null ? this.deque.sentinel.previous : null;
      this.last = null;
   }

   public Object next() {
      Node var1 = this.field4277;
      if (var1 == this.deque.sentinel) {
         var1 = null;
         this.field4277 = null;
      } else {
         this.field4277 = var1.previous;
      }

      this.last = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.deque.sentinel != this.field4277 && this.field4277 != null;
   }

   public void remove() {
      if (this.last == null) {
         throw new IllegalStateException();
      } else {
         this.last.remove();
         this.last = null;
      }
   }
}
