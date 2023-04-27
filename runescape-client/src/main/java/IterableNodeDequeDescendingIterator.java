import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Loi;"
   )
   @Export("deque")
   IterableNodeDeque deque;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lrp;"
   )
   Node field4358;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lrp;"
   )
   @Export("last")
   Node last = null;

   @ObfuscatedSignature(
      descriptor = "(Loi;)V"
   )
   IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
      this.setDeque(var1);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Loi;)V"
   )
   @Export("setDeque")
   void setDeque(IterableNodeDeque var1) {
      this.deque = var1;
      this.start();
   }

   @ObfuscatedName("an")
   @Export("start")
   void start() {
      this.field4358 = this.deque != null ? this.deque.sentinel.previous : null;
      this.last = null;
   }

   public boolean hasNext() {
      return this.deque.sentinel != this.field4358 && this.field4358 != null;
   }

   public void remove() {
      if (this.last == null) {
         throw new IllegalStateException();
      } else {
         this.last.remove();
         this.last = null;
      }
   }

   public Object next() {
      Node var1 = this.field4358;
      if (var1 == this.deque.sentinel) {
         var1 = null;
         this.field4358 = null;
      } else {
         this.field4358 = var1.previous;
      }

      this.last = var1;
      return var1;
   }
}
