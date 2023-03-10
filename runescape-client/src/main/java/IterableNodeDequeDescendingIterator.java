import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lni;"
   )
   @Export("deque")
   IterableNodeDeque deque;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lru;"
   )
   Node field4321;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lru;"
   )
   @Export("last")
   Node last = null;

   @ObfuscatedSignature(
      descriptor = "(Lni;)V"
   )
   IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
      this.setDeque(var1);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lni;)V"
   )
   @Export("setDeque")
   void setDeque(IterableNodeDeque var1) {
      this.deque = var1;
      this.start();
   }

   @ObfuscatedName("al")
   @Export("start")
   void start() {
      this.field4321 = this.deque != null ? this.deque.sentinel.previous : null;
      this.last = null;
   }

   public Object next() {
      Node var1 = this.field4321;
      if (var1 == this.deque.sentinel) {
         var1 = null;
         this.field4321 = null;
      } else {
         this.field4321 = var1.previous;
      }

      this.last = var1;
      return var1;
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
      return this.deque.sentinel != this.field4321 && this.field4321 != null;
   }
}
