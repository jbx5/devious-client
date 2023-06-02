import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
@Implements("NodeDeque")
public class NodeDeque {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lrz;"
   )
   @Export("sentinel")
   public Node sentinel = new Node();
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lrz;"
   )
   @Export("current")
   Node current;

   public NodeDeque() {
      this.sentinel.previous = this.sentinel;
      this.sentinel.next = this.sentinel;
   }

   @ObfuscatedName("at")
   @Export("clear")
   public void clear() {
      while(true) {
         Node var1 = this.sentinel.previous;
         if (var1 == this.sentinel) {
            this.current = null;
            return;
         }

         var1.remove();
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lrz;)V"
   )
   @Export("addFirst")
   public void addFirst(Node var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel.next;
      var1.previous = this.sentinel;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lrz;)V"
   )
   @Export("addLast")
   public void addLast(Node var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel;
      var1.previous = this.sentinel.previous;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "()Lrz;"
   )
   @Export("removeLast")
   public Node removeLast() {
      Node var1 = this.sentinel.previous;
      if (var1 == this.sentinel) {
         return null;
      } else {
         var1.remove();
         return var1;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "()Lrz;"
   )
   @Export("removeFirst")
   public Node removeFirst() {
      Node var1 = this.sentinel.next;
      if (var1 == this.sentinel) {
         return null;
      } else {
         var1.remove();
         return var1;
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "()Lrz;"
   )
   @Export("last")
   public Node last() {
      Node var1 = this.sentinel.previous;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "()Lrz;"
   )
   @Export("first")
   public Node first() {
      Node var1 = this.sentinel.next;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.next;
         return var1;
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "()Lrz;"
   )
   @Export("previous")
   public Node previous() {
      Node var1 = this.current;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "()Lrz;"
   )
   @Export("next")
   public Node next() {
      Node var1 = this.current;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.next;
         return var1;
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Lrz;Lrz;)V"
   )
   @Export("NodeDeque_addBefore")
   public static void NodeDeque_addBefore(Node var0, Node var1) {
      if (var0.next != null) {
         var0.remove();
      }

      var0.next = var1.next;
      var0.previous = var1;
      var0.next.previous = var0;
      var0.previous.next = var0;
   }
}
