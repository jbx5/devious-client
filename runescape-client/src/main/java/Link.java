import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rx")
@Implements("Link")
public class Link {
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lrx;"
   )
   @Export("previous")
   public Link previous;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lrx;"
   )
   @Export("next")
   public Link next;

   @ObfuscatedName("af")
   @Export("remove")
   public void remove() {
      if (this.next != null) {
         this.next.previous = this.previous;
         this.previous.next = this.next;
         this.previous = null;
         this.next = null;
      }
   }
}
