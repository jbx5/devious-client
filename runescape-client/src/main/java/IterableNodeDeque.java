import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
@Implements("IterableNodeDeque")
public class IterableNodeDeque implements Iterable, Collection {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lpr;"
   )
   @Export("sentinel")
   Node sentinel = new Node();
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lpr;"
   )
   Node field4348;

   public IterableNodeDeque() {
      this.sentinel.previous = this.sentinel;
      this.sentinel.next = this.sentinel;
   }

   @ObfuscatedName("f")
   @Export("rsClear")
   public void rsClear() {
      while(this.sentinel.previous != this.sentinel) {
         this.sentinel.previous.remove();
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lpr;)V"
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

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lpr;)V"
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

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "()Lpr;"
   )
   @Export("last")
   public Node last() {
      return this.method6854((Node)null);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lpr;)Lpr;"
   )
   Node method6854(Node var1) {
      Node var2;
      if (var1 == null) {
         var2 = this.sentinel.previous;
      } else {
         var2 = var1;
      }

      if (var2 == this.sentinel) {
         this.field4348 = null;
         return null;
      } else {
         this.field4348 = var2.previous;
         return var2;
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "()Lpr;"
   )
   @Export("previous")
   public Node previous() {
      Node var1 = this.field4348;
      if (var1 == this.sentinel) {
         this.field4348 = null;
         return null;
      } else {
         this.field4348 = var1.previous;
         return var1;
      }
   }

   @ObfuscatedName("n")
   int method6856() {
      int var1 = 0;

      for(Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
         ++var1;
      }

      return var1;
   }

   @ObfuscatedName("l")
   public boolean method6900() {
      return this.sentinel.previous == this.sentinel;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "()[Lpr;"
   )
   Node[] method6858() {
      Node[] var1 = new Node[this.method6856()];
      int var2 = 0;

      for(Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
         var1[var2++] = var3;
      }

      return var1;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lpr;)Z"
   )
   boolean method6861(Node var1) {
      this.addFirst(var1);
      return true;
   }

   public int size() {
      return this.method6856();
   }

   public boolean isEmpty() {
      return this.method6900();
   }

   public boolean contains(Object var1) {
      throw new RuntimeException();
   }

   public Object[] toArray() {
      return this.method6858();
   }

   public boolean remove(Object var1) {
      throw new RuntimeException();
   }

   public boolean containsAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean retainAll(Collection var1) {
      throw new RuntimeException();
   }

   public void clear() {
      this.rsClear();
   }

   public boolean add(Object var1) {
      return this.method6861((Node)var1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int hashCode() {
      return super.hashCode();
   }

   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for(Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public Iterator iterator() {
      return new IterableNodeDequeDescendingIterator(this);
   }

   public boolean removeAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean addAll(Collection var1) {
      throw new RuntimeException();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Lpr;Lpr;)V"
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
