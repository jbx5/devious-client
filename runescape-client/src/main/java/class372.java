import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
public class class372 implements Iterator {
   @ObfuscatedName("ja")
   @Export("regionMapArchives")
   static byte[][] regionMapArchives;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lop;"
   )
   class373 field4355;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1576368141
   )
   int field4354 = 0;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 81874847
   )
   int field4356;

   @ObfuscatedSignature(
      descriptor = "(Lop;)V"
   )
   class372(class373 var1) {
      this.field4356 = this.field4355.field4362;
      this.field4355 = var1;
   }

   public boolean hasNext() {
      return this.field4354 < this.field4355.field4359;
   }

   public Object next() {
      if (this.field4355.field4362 != this.field4356) {
         throw new ConcurrentModificationException();
      } else if (this.field4354 < this.field4355.field4359) {
         Object var1 = this.field4355.field4360[this.field4354].field4353;
         ++this.field4354;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }
}
