import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
@Implements("Bounds")
public class Bounds {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -844906645
   )
   @Export("lowX")
   public int lowX;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1864020389
   )
   @Export("lowY")
   public int lowY;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 944313703
   )
   @Export("highX")
   public int highX;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1376251093
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

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "26"
   )
   @Export("setLow")
   public void setLow(int var1, int var2) {
      this.lowX = var1;
      this.lowY = var2;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-6"
   )
   @Export("setHigh")
   public void setHigh(int var1, int var2) {
      this.highX = var1;
      this.highY = var2;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "917820097"
   )
   public boolean method8089(int var1, int var2) {
      return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.lowY + this.highY;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lqu;Lqu;I)V",
      garbageValue = "-1323788808"
   )
   public void method8105(Bounds var1, Bounds var2) {
      this.method8091(var1, var2);
      this.method8092(var1, var2);
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Lqu;Lqu;B)V",
      garbageValue = "0"
   )
   void method8091(Bounds var1, Bounds var2) {
      var2.lowX = this.lowX;
      var2.highX = this.highX;
      if (this.lowX < var1.lowX) {
         var2.highX -= var1.lowX - this.lowX;
         var2.lowX = var1.lowX;
      }

      if (var2.method8095() > var1.method8095()) {
         var2.highX -= var2.method8095() - var1.method8095();
      }

      if (var2.highX < 0) {
         var2.highX = 0;
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lqu;Lqu;I)V",
      garbageValue = "924152232"
   )
   void method8092(Bounds var1, Bounds var2) {
      var2.lowY = this.lowY;
      var2.highY = this.highY;
      if (this.lowY < var1.lowY) {
         var2.highY -= var1.lowY - this.lowY;
         var2.lowY = var1.lowY;
      }

      if (var2.method8116() > var1.method8116()) {
         var2.highY -= var2.method8116() - var1.method8116();
      }

      if (var2.highY < 0) {
         var2.highY = 0;
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1027665402"
   )
   int method8095() {
      return this.highX + this.lowX;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1021516763"
   )
   int method8116() {
      return this.highY + this.lowY;
   }

   public String toString() {
      return null;
   }
}
