import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mf")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lmt;"
   )
   @Export("deque")
   IterableNodeDeque deque;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lpr;"
   )
   Node field4346;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lpr;"
   )
   @Export("last")
   Node last = null;

   @ObfuscatedSignature(
      descriptor = "(Lmt;)V"
   )
   IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
      this.setDeque(var1);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lmt;)V"
   )
   @Export("setDeque")
   void setDeque(IterableNodeDeque var1) {
      this.deque = var1;
      this.start();
   }

   @ObfuscatedName("w")
   @Export("start")
   void start() {
      this.field4346 = this.deque != null ? this.deque.sentinel.previous : null;
      this.last = null;
   }

   public Object next() {
      Node var1 = this.field4346;
      if (var1 == this.deque.sentinel) {
         var1 = null;
         this.field4346 = null;
      } else {
         this.field4346 = var1.previous;
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
      return this.deque.sentinel != this.field4346 && this.field4346 != null;
   }
}
