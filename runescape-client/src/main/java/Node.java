import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pk")
@Implements("Node")
public class Node {
   @ObfuscatedName("gp")
   @Export("key")
   public long key;
   @ObfuscatedName("gq")
   @ObfuscatedSignature(
      descriptor = "Lpk;"
   )
   @Export("previous")
   public Node previous;
   @ObfuscatedName("gg")
   @ObfuscatedSignature(
      descriptor = "Lpk;"
   )
   @Export("next")
   public Node next;

   @ObfuscatedName("ez")
   @Export("remove")
   public void remove() {
      if (this.next != null) {
         this.next.previous = this.previous;
         this.previous.next = this.next;
         this.previous = null;
         this.next = null;
      }
   }

   @ObfuscatedName("eu")
   @Export("hasNext")
   public boolean hasNext() {
      return this.next != null;
   }
}
