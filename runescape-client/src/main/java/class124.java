import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public class class124 {
   @ObfuscatedName("iy")
   @ObfuscatedGetter(
      intValue = 1050251481
   )
   static int field1471;
   @ObfuscatedName("ou")
   @ObfuscatedGetter(
      intValue = 1841925967
   )
   static int field1479;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1984831557
   )
   public final int field1465;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lek;"
   )
   public class124 field1474;
   @ObfuscatedName("ac")
   float[][] field1481;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "[Lqt;"
   )
   final class421[] field1467;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "[Lqt;"
   )
   class421[] field1468;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "[Lqt;"
   )
   class421[] field1469;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lqt;"
   )
   class421 field1470 = new class421();
   @ObfuscatedName("aq")
   boolean field1464 = true;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lqt;"
   )
   class421 field1472 = new class421();
   @ObfuscatedName("ar")
   boolean field1473 = true;
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Lqt;"
   )
   class421 field1466 = new class421();
   @ObfuscatedName("ax")
   float[][] field1475;
   @ObfuscatedName("as")
   float[][] field1476;
   @ObfuscatedName("ay")
   float[][] field1477;

   @ObfuscatedSignature(
      descriptor = "(ILsy;Z)V"
   )
   public class124(int var1, Buffer var2, boolean var3) {
      this.field1465 = var2.readShort();
      this.field1467 = new class421[var1];
      this.field1468 = new class421[this.field1467.length];
      this.field1469 = new class421[this.field1467.length];
      this.field1481 = new float[this.field1467.length][3];

      for(int var4 = 0; var4 < this.field1467.length; ++var4) {
         this.field1467[var4] = new class421(var2, var3);
         this.field1481[var4][0] = var2.method8626();
         this.field1481[var4][1] = var2.method8626();
         this.field1481[var4][2] = var2.method8626();
      }

      this.method2927();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2063624266"
   )
   void method2927() {
      this.field1475 = new float[this.field1467.length][3];
      this.field1476 = new float[this.field1467.length][3];
      this.field1477 = new float[this.field1467.length][3];
      class421 var1;
      synchronized(class421.field4611) {
         if (class421.field4610 == 0) {
            var1 = new class421();
         } else {
            class421.field4611[--class421.field4610].method7856();
            var1 = class421.field4611[class421.field4610];
         }
      }

      class421 var2 = var1;

      for(int var5 = 0; var5 < this.field1467.length; ++var5) {
         class421 var4 = this.method2928(var5);
         var2.method7850(var4);
         var2.method7855();
         this.field1475[var5] = var2.method7858();
         this.field1476[var5][0] = var4.field4608[12];
         this.field1476[var5][1] = var4.field4608[13];
         this.field1476[var5][2] = var4.field4608[14];
         this.field1477[var5] = var4.method7857();
      }

      var2.method7888();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IB)Lqt;",
      garbageValue = "49"
   )
   class421 method2928(int var1) {
      return this.field1467[var1];
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)Lqt;",
      garbageValue = "-1175337484"
   )
   class421 method2929(int var1) {
      if (this.field1468[var1] == null) {
         this.field1468[var1] = new class421(this.method2928(var1));
         if (this.field1474 != null) {
            this.field1468[var1].method7851(this.field1474.method2929(var1));
         } else {
            this.field1468[var1].method7851(class421.field4612);
         }
      }

      return this.field1468[var1];
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IB)Lqt;",
      garbageValue = "-71"
   )
   class421 method2930(int var1) {
      if (this.field1469[var1] == null) {
         this.field1469[var1] = new class421(this.method2929(var1));
         this.field1469[var1].method7855();
      }

      return this.field1469[var1];
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lqt;I)V",
      garbageValue = "1219238582"
   )
   void method2944(class421 var1) {
      this.field1470.method7850(var1);
      this.field1464 = true;
      this.field1473 = true;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)Lqt;",
      garbageValue = "83"
   )
   class421 method2926() {
      return this.field1470;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)Lqt;",
      garbageValue = "1330180428"
   )
   class421 method2933() {
      if (this.field1464) {
         this.field1472.method7850(this.method2926());
         if (this.field1474 != null) {
            this.field1472.method7851(this.field1474.method2933());
         }

         this.field1464 = false;
      }

      return this.field1472;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(II)Lqt;",
      garbageValue = "1012813641"
   )
   public class421 method2934(int var1) {
      if (this.field1473) {
         this.field1466.method7850(this.method2930(var1));
         this.field1466.method7851(this.method2933());
         this.field1473 = false;
      }

      return this.field1466;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)[F",
      garbageValue = "-2121032861"
   )
   float[] method2935(int var1) {
      return this.field1475[var1];
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(II)[F",
      garbageValue = "1356694558"
   )
   float[] method2936(int var1) {
      return this.field1476[var1];
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(IB)[F",
      garbageValue = "-24"
   )
   float[] method2937(int var1) {
      return this.field1477[var1];
   }
}
