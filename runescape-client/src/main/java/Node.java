import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
@Implements("Node")
public class Node {
   @ObfuscatedName("gt")
   @Export("key")
   public long key;
   @ObfuscatedName("gc")
   @ObfuscatedSignature(
      descriptor = "Lpl;"
   )
   @Export("previous")
   public Node previous;
   @ObfuscatedName("gw")
   @ObfuscatedSignature(
      descriptor = "Lpl;"
   )
   @Export("next")
   public Node next;

   @ObfuscatedName("fd")
   @Export("remove")
   public void remove() {
      if (this.next != null) {
         this.next.previous = this.previous;
         this.previous.next = this.next;
         this.previous = null;
         this.next = null;
      }
   }

   @ObfuscatedName("fr")
   @Export("hasNext")
   public boolean hasNext() {
      return this.next != null;
   }
}
