import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pz")
@Implements("Link")
public class Link {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lpz;"
   )
   @Export("previous")
   public Link previous;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lpz;"
   )
   @Export("next")
   public Link next;

   @ObfuscatedName("f")
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
