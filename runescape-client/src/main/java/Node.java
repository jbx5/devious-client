import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ru")
@Implements("Node")
public class Node {
   @ObfuscatedName("hl")
   @Export("key")
   public long key;
   @ObfuscatedName("he")
   @ObfuscatedSignature(
      descriptor = "Lru;"
   )
   @Export("previous")
   public Node previous;
   @ObfuscatedName("ha")
   @ObfuscatedSignature(
      descriptor = "Lru;"
   )
   @Export("next")
   public Node next;

   @ObfuscatedName("gi")
   @Export("remove")
   public void remove() {
      if (this.next != null) {
         this.next.previous = this.previous;
         this.previous.next = this.next;
         this.previous = null;
         this.next = null;
      }
   }

   @ObfuscatedName("gc")
   @Export("hasNext")
   public boolean hasNext() {
      return this.next != null;
   }
}
