import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("of")
public class class389 implements Iterator {
   @ObfuscatedName("si")
   @ObfuscatedSignature(
      descriptor = "Lfs;"
   )
   @Export("guestClanSettings")
   static ClanSettings guestClanSettings;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lpu;"
   )
   class390 field4410;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1784205805
   )
   int field4409 = 0;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1457471961
   )
   int field4408;

   @ObfuscatedSignature(
      descriptor = "(Lpu;)V"
   )
   class389(class390 var1) {
      this.field4408 = this.field4410.field4414;
      this.field4410 = var1;
   }

   public boolean hasNext() {
      return this.field4409 < this.field4410.field4412;
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }

   public Object next() {
      if (this.field4410.field4414 != this.field4408) {
         throw new ConcurrentModificationException();
      } else if (this.field4409 < this.field4410.field4412) {
         Object var1 = this.field4410.field4416[this.field4409].field4406;
         ++this.field4409;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "840269360"
   )
   static int method7215(int var0) {
      return (int)Math.pow(2.0, (double)((float)var0 / 256.0F + 7.0F));
   }
}
