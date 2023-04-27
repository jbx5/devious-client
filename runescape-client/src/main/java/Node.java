import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
@Implements("Node")
public class Node {
   @ObfuscatedName("hr")
   @Export("key")
   public long key;
   @ObfuscatedName("hc")
   @ObfuscatedSignature(
      descriptor = "Lrp;"
   )
   @Export("previous")
   public Node previous;
   @ObfuscatedName("hg")
   @ObfuscatedSignature(
      descriptor = "Lrp;"
   )
   @Export("next")
   public Node next;

   @ObfuscatedName("ga")
   @Export("remove")
   public void remove() {
      if (this.next != null) {
         this.next.previous = this.previous;
         this.previous.next = this.next;
         this.previous = null;
         this.next = null;
      }
   }

   @ObfuscatedName("gt")
   @Export("hasNext")
   public boolean hasNext() {
      return this.next != null;
   }
}
