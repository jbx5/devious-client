import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lmv;"
   )
   @Export("deque")
   IterableNodeDeque deque;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lpl;"
   )
   Node field4332;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lpl;"
   )
   @Export("last")
   Node last = null;

   @ObfuscatedSignature(
      descriptor = "(Lmv;)V"
   )
   IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
      this.setDeque(var1);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lmv;)V"
   )
   @Export("setDeque")
   void setDeque(IterableNodeDeque var1) {
      this.deque = var1;
      this.start();
   }

   @ObfuscatedName("e")
   @Export("start")
   void start() {
      this.field4332 = this.deque != null ? this.deque.sentinel.previous : null;
      this.last = null;
   }

   public void remove() {
      if (this.last == null) {
         throw new IllegalStateException();
      } else {
         this.last.remove();
         this.last = null;
      }
   }

   public boolean hasNext() {
      return this.deque.sentinel != this.field4332 && this.field4332 != null;
   }

   public Object next() {
      Node var1 = this.field4332;
      if (var1 == this.deque.sentinel) {
         var1 = null;
         this.field4332 = null;
      } else {
         this.field4332 = var1.previous;
      }

      this.last = var1;
      return var1;
   }
}
