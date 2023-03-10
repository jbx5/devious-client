import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
@Implements("Bounds")
public class Bounds {
   @ObfuscatedName("iu")
   @ObfuscatedGetter(
      longValue = 3405185936354156947L
   )
   static long field4584;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 813458901
   )
   @Export("lowX")
   public int lowX;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -624498377
   )
   @Export("lowY")
   public int lowY;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1491558545
   )
   @Export("highX")
   public int highX;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1232602271
   )
   @Export("highY")
   public int highY;

   public Bounds(int var1, int var2, int var3, int var4) {
      this.setLow(var1, var2);
      this.setHigh(var3, var4);
   }

   public Bounds(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "389511074"
   )
   @Export("setLow")
   public void setLow(int var1, int var2) {
      this.lowX = var1;
      this.lowY = var2;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "14"
   )
   @Export("setHigh")
   public void setHigh(int var1, int var2) {
      this.highX = var1;
      this.highY = var2;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "18"
   )
   public boolean method7770(int var1, int var2) {
      return var1 >= this.lowX && var1 < this.lowX + this.highX && var2 >= this.lowY && var2 < this.highY + this.lowY;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lqy;Lqy;B)V",
      garbageValue = "-37"
   )
   public void method7793(Bounds var1, Bounds var2) {
      this.method7792(var1, var2);
      this.method7773(var1, var2);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lqy;Lqy;I)V",
      garbageValue = "-1262807203"
   )
   void method7792(Bounds var1, Bounds var2) {
      var2.lowX = this.lowX;
      var2.highX = this.highX;
      if (this.lowX < var1.lowX) {
         var2.highX -= var1.lowX - this.lowX;
         var2.lowX = var1.lowX;
      }

      if (var2.method7774() > var1.method7774()) {
         var2.highX -= var2.method7774() - var1.method7774();
      }

      if (var2.highX < 0) {
         var2.highX = 0;
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lqy;Lqy;I)V",
      garbageValue = "-2072663964"
   )
   void method7773(Bounds var1, Bounds var2) {
      var2.lowY = this.lowY;
      var2.highY = this.highY;
      if (this.lowY < var1.lowY) {
         var2.highY -= var1.lowY - this.lowY;
         var2.lowY = var1.lowY;
      }

      if (var2.method7775() > var1.method7775()) {
         var2.highY -= var2.method7775() - var1.method7775();
      }

      if (var2.highY < 0) {
         var2.highY = 0;
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1719336503"
   )
   int method7774() {
      return this.highX + this.lowX;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-920537868"
   )
   int method7775() {
      return this.lowY + this.highY;
   }

   public String toString() {
      return null;
   }
}
