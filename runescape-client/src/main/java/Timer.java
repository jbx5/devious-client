import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
@Implements("Timer")
public class Timer {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      longValue = -5348577498961612219L
   )
   long field4485 = -1L;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      longValue = -1205622465697215077L
   )
   long field4484 = -1L;
   @ObfuscatedName("aw")
   public boolean field4483 = false;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      longValue = -2218855404195630245L
   )
   long field4486 = 0L;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      longValue = -6021685739129757585L
   )
   long field4487 = 0L;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      longValue = 8532053387917432831L
   )
   long field4488 = 0L;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1298612247
   )
   int field4489 = 0;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -3830165
   )
   int field4490 = 0;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1920442979
   )
   int field4491 = 0;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1000691937
   )
   int field4492 = 0;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1033751982"
   )
   public void method7602() {
      this.field4485 = class96.method2634();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1996100766"
   )
   public void method7613() {
      if (this.field4485 != -1L) {
         this.field4487 = class96.method2634() - this.field4485;
         this.field4485 = -1L;
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "13"
   )
   public void method7603(int var1) {
      this.field4484 = class96.method2634();
      this.field4489 = var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1585437622"
   )
   public void method7604() {
      if (-1L != this.field4484) {
         this.field4486 = class96.method2634() - this.field4484;
         this.field4484 = -1L;
      }

      ++this.field4491;
      this.field4483 = true;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-90"
   )
   public void method7605() {
      this.field4483 = false;
      this.field4490 = 0;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2129657232"
   )
   public void method7606() {
      this.method7604();
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "-1606158047"
   )
   @Export("write")
   public void write(Buffer var1) {
      long var2 = this.field4487;
      var2 /= 10L;
      if (var2 < 0L) {
         var2 = 0L;
      } else if (var2 > 65535L) {
         var2 = 65535L;
      }

      var1.writeShort((int)var2);
      long var4 = this.field4486;
      var4 /= 10L;
      if (var4 < 0L) {
         var4 = 0L;
      } else if (var4 > 65535L) {
         var4 = 65535L;
      }

      var1.writeShort((int)var4);
      long var6 = this.field4488;
      var6 /= 10L;
      if (var6 < 0L) {
         var6 = 0L;
      } else if (var6 > 65535L) {
         var6 = 65535L;
      }

      var1.writeShort((int)var6);
      var1.writeShort(this.field4489);
      var1.writeShort(this.field4490);
      var1.writeShort(this.field4491);
      var1.writeShort(this.field4492);
   }
}
