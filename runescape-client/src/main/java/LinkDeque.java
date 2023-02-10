import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
@Implements("LinkDeque")
public class LinkDeque {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lpz;"
   )
   @Export("sentinel")
   Link sentinel = new Link();
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lpz;"
   )
   @Export("current")
   Link current;

   public LinkDeque() {
      this.sentinel.previous = this.sentinel;
      this.sentinel.next = this.sentinel;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lpz;)V"
   )
   @Export("addFirst")
   public void addFirst(Link var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel.next;
      var1.previous = this.sentinel;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "()Lpz;"
   )
   @Export("last")
   public Link last() {
      Link var1 = this.sentinel.previous;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "()Lpz;"
   )
   @Export("previous")
   public Link previous() {
      Link var1 = this.current;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }
}
