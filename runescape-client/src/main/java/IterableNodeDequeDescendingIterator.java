import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lom;"
   )
   @Export("deque")
   IterableNodeDeque deque;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lrz;"
   )
   Node field4376;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lrz;"
   )
   @Export("last")
   Node last = null;

   @ObfuscatedSignature(
      descriptor = "(Lom;)V"
   )
   IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
      this.setDeque(var1);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lom;)V"
   )
   @Export("setDeque")
   void setDeque(IterableNodeDeque var1) {
      this.deque = var1;
      this.start();
   }

   @ObfuscatedName("an")
   @Export("start")
   void start() {
      this.field4376 = this.deque != null ? this.deque.sentinel.previous : null;
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

   public Object next() {
      Node var1 = this.field4376;
      if (var1 == this.deque.sentinel) {
         var1 = null;
         this.field4376 = null;
      } else {
         this.field4376 = var1.previous;
      }

      this.last = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.deque.sentinel != this.field4376 && this.field4376 != null;
   }
}
