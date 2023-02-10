import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
@Implements("Bounds")
public class Bounds {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -249044357
   )
   @Export("lowX")
   public int lowX;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1735610867
   )
   @Export("lowY")
   public int lowY;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -820822125
   )
   @Export("highX")
   public int highX;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1249777961
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

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "95"
   )
   @Export("setLow")
   public void setLow(int var1, int var2) {
      this.lowX = var1;
      this.lowY = var2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1018354355"
   )
   @Export("setHigh")
   public void setHigh(int var1, int var2) {
      this.highX = var1;
      this.highY = var2;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1452685232"
   )
   public boolean method7850(int var1, int var2) {
      return var1 >= this.lowX && var1 < this.lowX + this.highX && var2 >= this.lowY && var2 < this.highY + this.lowY;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Loj;Loj;I)V",
      garbageValue = "-1630455550"
   )
   public void method7852(Bounds var1, Bounds var2) {
      this.method7864(var1, var2);
      this.method7867(var1, var2);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Loj;Loj;I)V",
      garbageValue = "-1461632973"
   )
   void method7864(Bounds var1, Bounds var2) {
      var2.lowX = this.lowX;
      var2.highX = this.highX;
      if (this.lowX < var1.lowX) {
         var2.highX -= var1.lowX - this.lowX;
         var2.lowX = var1.lowX;
      }

      if (var2.method7855() > var1.method7855()) {
         var2.highX -= var2.method7855() - var1.method7855();
      }

      if (var2.highX < 0) {
         var2.highX = 0;
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Loj;Loj;I)V",
      garbageValue = "-1126623052"
   )
   void method7867(Bounds var1, Bounds var2) {
      var2.lowY = this.lowY;
      var2.highY = this.highY;
      if (this.lowY < var1.lowY) {
         var2.highY -= var1.lowY - this.lowY;
         var2.lowY = var1.lowY;
      }

      if (var2.method7856() > var1.method7856()) {
         var2.highY -= var2.method7856() - var1.method7856();
      }

      if (var2.highY < 0) {
         var2.highY = 0;
      }

   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1598763426"
   )
   int method7855() {
      return this.highX + this.lowX;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1508699322"
   )
   int method7856() {
      return this.highY + this.lowY;
   }

   public String toString() {
      return null;
   }
}
