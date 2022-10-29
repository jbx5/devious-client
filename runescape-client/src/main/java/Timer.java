import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
@Implements("Timer")
public class Timer {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      longValue = -6291711796372129095L
   )
   long field4401 = -1L;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      longValue = -8110696240229183057L
   )
   long field4398 = -1L;
   @ObfuscatedName("c")
   public boolean field4399 = false;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      longValue = 4063476653118069893L
   )
   long field4400 = 0L;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      longValue = -661183232158759653L
   )
   long field4397 = 0L;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      longValue = 6443664063363474187L
   )
   long field4402 = 0L;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 667375041
   )
   int field4403 = 0;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -242105373
   )
   int field4405 = 0;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -436148189
   )
   int field4404 = 0;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -2086133347
   )
   int field4406 = 0;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "15"
   )
   public void method7167() {
      this.field4401 = UserComparator8.method2748();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1883370213"
   )
   public void method7168() {
      if (-1L != this.field4401) {
         this.field4397 = UserComparator8.method2748() - this.field4401;
         this.field4401 = -1L;
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "-18816"
   )
   public void method7181(int var1) {
      this.field4398 = UserComparator8.method2748();
      this.field4403 = var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2055594229"
   )
   public void method7184() {
      if (this.field4398 != -1L) {
         this.field4400 = UserComparator8.method2748() - this.field4398;
         this.field4398 = -1L;
      }

      ++this.field4404;
      this.field4399 = true;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1208497835"
   )
   public void method7170() {
      this.field4399 = false;
      this.field4405 = 0;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-72"
   )
   public void method7171() {
      this.method7184();
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-1944716362"
   )
   @Export("write")
   public void write(Buffer var1) {
      WorldMapRegion.method4963(var1, this.field4397);
      WorldMapRegion.method4963(var1, this.field4400);
      WorldMapRegion.method4963(var1, this.field4402);
      var1.writeShort(this.field4403);
      var1.writeShort(this.field4405);
      var1.writeShort(this.field4404);
      var1.writeShort(this.field4406);
   }
}
