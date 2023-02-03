import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public class class133 extends DualNode {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -183831087
   )
   int field1604;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "[[Lda;"
   )
   public class125[][] field1601 = null;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "[[Lda;"
   )
   class125[][] field1602 = null;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lha;"
   )
   public Skeleton field1600;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1361787611
   )
   int field1599 = 0;
   @ObfuscatedName("j")
   boolean field1597;
   @ObfuscatedName("l")
   Future field1603;
   @ObfuscatedName("k")
   List field1598;

   @ObfuscatedSignature(
      descriptor = "(Lln;Lln;IZ)V"
   )
   class133(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
      this.field1604 = var3;
      byte[] var5 = var1.takeFile(this.field1604 >> 16 & '\uffff', this.field1604 & '\uffff');
      Buffer var6 = new Buffer(var5);
      int var7 = var6.readUnsignedByte();
      int var8 = var6.readUnsignedShort();
      byte[] var9;
      if (var4) {
         var9 = var2.getFile(0, var8);
      } else {
         var9 = var2.getFile(var8, 0);
      }

      this.field1600 = new Skeleton(var8, var9);
      this.field1598 = new ArrayList();
      this.field1603 = class277.field3059.submit(new class132(this, var6, var7));
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lrd;IS)V",
      garbageValue = "-4594"
   )
   void method3114(Buffer var1, int var2) {
      var1.readUnsignedShort();
      var1.readUnsignedShort();
      this.field1599 = var1.readUnsignedByte();
      int var3 = var1.readUnsignedShort();
      this.field1602 = new class125[this.field1600.method4450().method4428()][];
      this.field1601 = new class125[this.field1600.method4446()][];
      class124[] var4 = new class124[var3];

      int var5;
      int var7;
      int var9;
      for(var5 = 0; var5 < var3; ++var5) {
         var7 = var1.readUnsignedByte();
         class126[] var16 = new class126[]{class126.field1546, class126.field1548, class126.field1555, class126.field1550, class126.field1552, class126.field1551};
         class126 var17 = (class126)class4.findEnumerated(var16, var7);
         if (var17 == null) {
            var17 = class126.field1546;
         }

         var9 = var1.readShortSmart();
         int var11 = var1.readUnsignedByte();
         class127 var12 = (class127)class4.findEnumerated(class122.method3029(), var11);
         if (var12 == null) {
            var12 = class127.field1566;
         }

         class125 var13 = new class125();
         var13.method3064(var1, var2);
         var4[var5] = new class124(this, var13, var17, var12, var9);
         int var14 = var17.method3072();
         class125[][] var15;
         if (var17 == class126.field1548) {
            var15 = this.field1602;
         } else {
            var15 = this.field1601;
         }

         if (var15[var9] == null) {
            var15[var9] = new class125[var14];
         }

         if (var17 == class126.field1552) {
            this.field1597 = true;
         }
      }

      var5 = var3 / class461.field4894;
      int var6 = var3 % class461.field4894;
      int var8 = 0;

      for(var9 = 0; var9 < class461.field4894; ++var9) {
         var7 = var8;
         var8 += var5;
         if (var6 > 0) {
            ++var8;
            --var6;
         }

         if (var8 == var7) {
            break;
         }

         this.field1598.add(class277.field3059.submit(new class128(this, var7, var8, var4)));
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(S)Z",
      garbageValue = "21065"
   )
   public boolean method3094() {
      if (this.field1603 == null && this.field1598 == null) {
         return true;
      } else {
         if (this.field1603 != null) {
            if (!this.field1603.isDone()) {
               return false;
            }

            this.field1603 = null;
         }

         boolean var1 = true;

         for(int var2 = 0; var2 < this.field1598.size(); ++var2) {
            if (!((Future)this.field1598.get(var2)).isDone()) {
               var1 = false;
            } else {
               this.field1598.remove(var2);
               --var2;
            }
         }

         if (!var1) {
            return false;
         } else {
            this.field1598 = null;
            return true;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "1"
   )
   public int method3117() {
      return this.field1599;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1498028146"
   )
   public boolean method3096() {
      return this.field1597;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(ILdc;III)V",
      garbageValue = "-2140393878"
   )
   public void method3097(int var1, class122 var2, int var3, int var4) {
      class417 var5;
      synchronized(class417.field4641) {
         if (class417.field4643 == 0) {
            var5 = new class417();
         } else {
            class417.field4641[--class417.field4643].method7964();
            var5 = class417.field4641[class417.field4643];
         }
      }

      this.method3092(var5, var3, var2, var1);
      this.method3100(var5, var3, var2, var1);
      this.method3099(var5, var3, var2, var1);
      var2.method3000(var5);
      var5.method7908();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Lpb;ILdc;II)V",
      garbageValue = "1446395810"
   )
   void method3092(class417 var1, int var2, class122 var3, int var4) {
      float[] var5 = var3.method3004(this.field1599);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1602[var2] != null) {
         class125 var9 = this.field1602[var2][0];
         class125 var10 = this.field1602[var2][1];
         class125 var11 = this.field1602[var2][2];
         if (var9 != null) {
            var6 = var9.method3043(var4);
         }

         if (var10 != null) {
            var7 = var10.method3043(var4);
         }

         if (var11 != null) {
            var8 = var11.method3043(var4);
         }
      }

      class416 var25;
      synchronized(class416.field4635) {
         if (class388.field4510 == 0) {
            var25 = new class416();
         } else {
            class416.field4635[--class388.field4510].method7882();
            var25 = class416.field4635[class388.field4510];
         }
      }

      var25.method7897(1.0F, 0.0F, 0.0F, var6);
      class416 var26;
      synchronized(class416.field4635) {
         if (class388.field4510 == 0) {
            var26 = new class416();
         } else {
            class416.field4635[--class388.field4510].method7882();
            var26 = class416.field4635[class388.field4510];
         }
      }

      var26.method7897(0.0F, 1.0F, 0.0F, var7);
      class416 var13;
      synchronized(class416.field4635) {
         if (class388.field4510 == 0) {
            var13 = new class416();
         } else {
            class416.field4635[--class388.field4510].method7882();
            var13 = class416.field4635[class388.field4510];
         }
      }

      var13.method7897(0.0F, 0.0F, 1.0F, var8);
      class416 var15;
      synchronized(class416.field4635) {
         if (class388.field4510 == 0) {
            var15 = new class416();
         } else {
            class416.field4635[--class388.field4510].method7882();
            var15 = class416.field4635[class388.field4510];
         }
      }

      var15.method7883(var13);
      var15.method7883(var25);
      var15.method7883(var26);
      class417 var17;
      synchronized(class417.field4641) {
         if (class417.field4643 == 0) {
            var17 = new class417();
         } else {
            class417.field4641[--class417.field4643].method7964();
            var17 = class417.field4641[class417.field4643];
         }
      }

      var17.method7919(var15);
      var1.method7914(var17);
      var25.method7894();
      var26.method7894();
      var13.method7894();
      var15.method7894();
      var17.method7908();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lpb;ILdc;IB)V",
      garbageValue = "-85"
   )
   void method3099(class417 var1, int var2, class122 var3, int var4) {
      float[] var5 = var3.method3012(this.field1599);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1602[var2] != null) {
         class125 var9 = this.field1602[var2][3];
         class125 var10 = this.field1602[var2][4];
         class125 var11 = this.field1602[var2][5];
         if (var9 != null) {
            var6 = var9.method3043(var4);
         }

         if (var10 != null) {
            var7 = var10.method3043(var4);
         }

         if (var11 != null) {
            var8 = var11.method3043(var4);
         }
      }

      var1.field4644[12] = var6;
      var1.field4644[13] = var7;
      var1.field4644[14] = var8;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(Lpb;ILdc;II)V",
      garbageValue = "1689322046"
   )
   void method3100(class417 var1, int var2, class122 var3, int var4) {
      float[] var5 = var3.method3006(this.field1599);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1602[var2] != null) {
         class125 var9 = this.field1602[var2][6];
         class125 var10 = this.field1602[var2][7];
         class125 var11 = this.field1602[var2][8];
         if (var9 != null) {
            var6 = var9.method3043(var4);
         }

         if (var10 != null) {
            var7 = var10.method3043(var4);
         }

         if (var11 != null) {
            var8 = var11.method3043(var4);
         }
      }

      class417 var14;
      synchronized(class417.field4641) {
         if (class417.field4643 == 0) {
            var14 = new class417();
         } else {
            class417.field4641[--class417.field4643].method7964();
            var14 = class417.field4641[class417.field4643];
         }
      }

      var14.method7923(var6, var7, var8);
      var1.method7914(var14);
      var14.method7908();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IB)Lkz;",
      garbageValue = "74"
   )
   @Export("getWidget")
   public static Widget getWidget(int var0) {
      int var1 = var0 >> 16;
      int var2 = var0 & '\uffff';
      if (WorldMapLabel.Widget_interfaceComponents[var1] == null || WorldMapLabel.Widget_interfaceComponents[var1][var2] == null) {
         boolean var3 = class153.loadInterface(var1);
         if (!var3) {
            return null;
         }
      }

      return WorldMapLabel.Widget_interfaceComponents[var1][var2];
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "-186134787"
   )
   public static int method3118(int var0, int var1, int var2) {
      var2 &= 3;
      if (var2 == 0) {
         return var0;
      } else if (var2 == 1) {
         return var1;
      } else {
         return var2 == 2 ? 7 - var0 : 7 - var1;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-25"
   )
   public static int method3119() {
      return ++MouseHandler.MouseHandler_idleCycles - 1;
   }
}
