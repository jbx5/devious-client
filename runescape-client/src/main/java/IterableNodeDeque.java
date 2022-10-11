import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
@Implements("IterableNodeDeque")
public class IterableNodeDeque implements Iterable, Collection {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lpk;"
   )
   @Export("sentinel")
   Node sentinel = new Node();
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lpk;"
   )
   Node field4280;

   public IterableNodeDeque() {
      this.sentinel.previous = this.sentinel;
      this.sentinel.next = this.sentinel;
   }

   @ObfuscatedName("a")
   @Export("rsClear")
   public void rsClear() {
      while(this.sentinel.previous != this.sentinel) {
         this.sentinel.previous.remove();
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lpk;)V"
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

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lpk;)V"
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

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "()Lpk;"
   )
   @Export("last")
   public Node last() {
      return this.method6656((Node)null);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lpk;)Lpk;"
   )
   Node method6656(Node var1) {
      Node var2;
      if (var1 == null) {
         var2 = this.sentinel.previous;
      } else {
         var2 = var1;
      }

      if (var2 == this.sentinel) {
         this.field4280 = null;
         return null;
      } else {
         this.field4280 = var2.previous;
         return var2;
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "()Lpk;"
   )
   @Export("previous")
   public Node previous() {
      Node var1 = this.field4280;
      if (var1 == this.sentinel) {
         this.field4280 = null;
         return null;
      } else {
         this.field4280 = var1.previous;
         return var1;
      }
   }

   @ObfuscatedName("d")
   int method6677() {
      int var1 = 0;

      for(Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
         ++var1;
      }

      return var1;
   }

   @ObfuscatedName("n")
   public boolean method6721() {
      return this.sentinel.previous == this.sentinel;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "()[Lpk;"
   )
   Node[] method6660() {
      Node[] var1 = new Node[this.method6677()];
      int var2 = 0;

      for(Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
         var1[var2++] = var3;
      }

      return var1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(Lpk;)Z"
   )
   boolean method6659(Node var1) {
      this.addFirst(var1);
      return true;
   }

   public Iterator iterator() {
      return new IterableNodeDequeDescendingIterator(this);
   }

   public int size() {
      return this.method6677();
   }

   public boolean isEmpty() {
      return this.method6721();
   }

   public boolean contains(Object var1) {
      throw new RuntimeException();
   }

   public boolean retainAll(Collection var1) {
      throw new RuntimeException();
   }

   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for(Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public boolean addAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean removeAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int hashCode() {
      return super.hashCode();
   }

   public boolean containsAll(Collection var1) {
      throw new RuntimeException();
   }

   public Object[] toArray() {
      return this.method6660();
   }

   public boolean add(Object var1) {
      return this.method6659((Node)var1);
   }

   public boolean remove(Object var1) {
      throw new RuntimeException();
   }

   public void clear() {
      this.rsClear();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lpk;Lpk;)V"
   )
   @Export("IterableNodeDeque_addBefore")
   public static void IterableNodeDeque_addBefore(Node var0, Node var1) {
      if (var0.next != null) {
         var0.remove();
      }

      var0.next = var1;
      var0.previous = var1.previous;
      var0.next.previous = var0;
      var0.previous.next = var0;
   }
}
