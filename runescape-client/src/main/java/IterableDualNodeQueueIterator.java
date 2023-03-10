import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
@Implements("IterableDualNodeQueueIterator")
public class IterableDualNodeQueueIterator implements Iterator {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lnh;"
   )
   @Export("queue")
   IterableDualNodeQueue queue;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lqk;"
   )
   @Export("head")
   DualNode head;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lqk;"
   )
   @Export("last")
   DualNode last = null;

   @ObfuscatedSignature(
      descriptor = "(Lnh;)V"
   )
   IterableDualNodeQueueIterator(IterableDualNodeQueue var1) {
      this.queue = var1;
      this.head = this.queue.sentinel.previousDual;
      this.last = null;
   }

   public Object next() {
      DualNode var1 = this.head;
      if (var1 == this.queue.sentinel) {
         var1 = null;
         this.head = null;
      } else {
         this.head = var1.previousDual;
      }

      this.last = var1;
      return var1;
   }

   public void remove() {
      this.last.removeDual();
      this.last = null;
   }

   public boolean hasNext() {
      return this.queue.sentinel != this.head;
   }
}
