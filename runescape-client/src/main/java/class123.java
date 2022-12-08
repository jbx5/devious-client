import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public class class123 {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1087900785
   )
   public final int field1516;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Ldt;"
   )
   public class123 field1513;
   @ObfuscatedName("v")
   float[][] field1514;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "[Loj;"
   )
   final class410[] field1515;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "[Loj;"
   )
   class410[] field1512;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "[Loj;"
   )
   class410[] field1517;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Loj;"
   )
   class410 field1518 = new class410();
   @ObfuscatedName("r")
   boolean field1522 = true;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Loj;"
   )
   class410 field1524 = new class410();
   @ObfuscatedName("b")
   boolean field1521 = true;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Loj;"
   )
   class410 field1519 = new class410();
   @ObfuscatedName("g")
   float[][] field1520;
   @ObfuscatedName("i")
   float[][] field1523;
   @ObfuscatedName("o")
   float[][] field1525;

   @ObfuscatedSignature(
      descriptor = "(ILqy;Z)V"
   )
   public class123(int var1, Buffer var2, boolean var3) {
      this.field1516 = var2.readShort();
      this.field1515 = new class410[var1];
      this.field1512 = new class410[this.field1515.length];
      this.field1517 = new class410[this.field1515.length];
      this.field1514 = new float[this.field1515.length][3];

      for(int var4 = 0; var4 < this.field1515.length; ++var4) {
         this.field1515[var4] = new class410(var2, var3);
         this.field1514[var4][0] = var2.method8556();
         this.field1514[var4][1] = var2.method8556();
         this.field1514[var4][2] = var2.method8556();
      }

      this.method2900();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-114"
   )
   void method2900() {
      this.field1520 = new float[this.field1515.length][3];
      this.field1523 = new float[this.field1515.length][3];
      this.field1525 = new float[this.field1515.length][3];
      class410 var1 = class326.method6395();

      for(int var2 = 0; var2 < this.field1515.length; ++var2) {
         class410 var3 = this.method2931(var2);
         var1.method7784(var3);
         var1.method7792();
         this.field1520[var2] = var1.method7781();
         this.field1523[var2][0] = var3.field4612[12];
         this.field1523[var2][1] = var3.field4612[13];
         this.field1523[var2][2] = var3.field4612[14];
         this.field1525[var2] = var3.method7794();
      }

      var1.method7795();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)Loj;",
      garbageValue = "-197286260"
   )
   class410 method2931(int var1) {
      return this.field1515[var1];
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IB)Loj;",
      garbageValue = "-39"
   )
   class410 method2903(int var1) {
      if (this.field1512[var1] == null) {
         this.field1512[var1] = new class410(this.method2931(var1));
         if (this.field1513 != null) {
            this.field1512[var1].method7788(this.field1513.method2903(var1));
         } else {
            this.field1512[var1].method7788(class410.field4613);
         }
      }

      return this.field1512[var1];
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IS)Loj;",
      garbageValue = "-1313"
   )
   class410 method2930(int var1) {
      if (this.field1517[var1] == null) {
         this.field1517[var1] = new class410(this.method2903(var1));
         this.field1517[var1].method7792();
      }

      return this.field1517[var1];
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Loj;I)V",
      garbageValue = "-969750342"
   )
   void method2907(class410 var1) {
      this.field1518.method7784(var1);
      this.field1522 = true;
      this.field1521 = true;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)Loj;",
      garbageValue = "1985387676"
   )
   class410 method2906() {
      return this.field1518;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Loj;",
      garbageValue = "46823189"
   )
   class410 method2913() {
      if (this.field1522) {
         this.field1524.method7784(this.method2906());
         if (this.field1513 != null) {
            this.field1524.method7788(this.field1513.method2913());
         }

         this.field1522 = false;
      }

      return this.field1524;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(II)Loj;",
      garbageValue = "1286617605"
   )
   public class410 method2904(int var1) {
      if (this.field1521) {
         this.field1519.method7784(this.method2930(var1));
         this.field1519.method7788(this.method2913());
         this.field1521 = false;
      }

      return this.field1519;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(IB)[F",
      garbageValue = "0"
   )
   float[] method2909(int var1) {
      return this.field1520[var1];
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(II)[F",
      garbageValue = "-2100029248"
   )
   float[] method2910(int var1) {
      return this.field1523[var1];
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(IS)[F",
      garbageValue = "1900"
   )
   float[] method2911(int var1) {
      return this.field1525[var1];
   }
}
