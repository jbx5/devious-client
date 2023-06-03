import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
@Implements("Timer")
public class Timer {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      longValue = 3344983247548410809L
   )
   long field4506 = -1L;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      longValue = -3844984739841209177L
   )
   long field4504 = -1L;
   @ObfuscatedName("av")
   public boolean field4499 = false;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      longValue = 5725797799893562143L
   )
   long field4500 = 0L;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      longValue = -7760677433481046661L
   )
   long field4501 = 0L;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      longValue = -1102559983850000693L
   )
   long field4502 = 0L;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1785572645
   )
   int field4497 = 0;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1813441365
   )
   int field4507 = 0;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1715839131
   )
   int field4505 = 0;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1187553919
   )
   int field4498 = 0;

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2089124905"
   )
   public void method7612() {
      this.field4506 = BoundaryObject.method5027();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1927932111"
   )
   public void method7608() {
      if (-1L != this.field4506) {
         this.field4501 = BoundaryObject.method5027() - this.field4506;
         this.field4506 = -1L;
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1221021078"
   )
   public void method7609(int var1) {
      this.field4504 = BoundaryObject.method5027();
      this.field4497 = var1;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1737596077"
   )
   public void method7610() {
      if (this.field4504 != -1L) {
         this.field4500 = BoundaryObject.method5027() - this.field4504;
         this.field4504 = -1L;
      }

      ++this.field4505;
      this.field4499 = true;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "431404039"
   )
   public void method7617() {
      this.field4499 = false;
      this.field4507 = 0;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-613072356"
   )
   public void method7625() {
      this.method7610();
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "801850388"
   )
   @Export("write")
   public void write(Buffer var1) {
      class280.method5601(var1, this.field4501);
      class280.method5601(var1, this.field4500);
      class280.method5601(var1, this.field4502);
      var1.writeShort(this.field4497);
      var1.writeShort(this.field4507);
      var1.writeShort(this.field4505);
      var1.writeShort(this.field4498);
   }
}
