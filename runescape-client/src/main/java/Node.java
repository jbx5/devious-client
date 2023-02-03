import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
@Implements("Node")
public class Node {
   @ObfuscatedName("gr")
   @Export("key")
   public long key;
   @ObfuscatedName("gz")
   @ObfuscatedSignature(
      descriptor = "Lpr;"
   )
   @Export("previous")
   public Node previous;
   @ObfuscatedName("ge")
   @ObfuscatedSignature(
      descriptor = "Lpr;"
   )
   @Export("next")
   public Node next;

   @ObfuscatedName("fs")
   @Export("remove")
   public void remove() {
      if (this.next != null) {
         this.next.previous = this.previous;
         this.previous.next = this.next;
         this.previous = null;
         this.next = null;
      }
   }

   @ObfuscatedName("fg")
   @Export("hasNext")
   public boolean hasNext() {
      return this.next != null;
   }
}
