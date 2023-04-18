import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
public class class376 implements Iterator {
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Ltc;"
   )
   static IndexedSprite field4398;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Loe;"
   )
   class377 field4395;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1092736727
   )
   int field4397 = 0;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1365662605
   )
   int field4396;

   @ObfuscatedSignature(
      descriptor = "(Loe;)V"
   )
   class376(class377 var1) {
      this.field4396 = this.field4395.field4400;
      this.field4395 = var1;
   }

   public boolean hasNext() {
      return this.field4397 < this.field4395.field4403;
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }

   public Object next() {
      if (this.field4395.field4400 != this.field4396) {
         throw new ConcurrentModificationException();
      } else if (this.field4397 < this.field4395.field4403) {
         Object var1 = this.field4395.field4401[this.field4397].field4389;
         ++this.field4397;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }
}
