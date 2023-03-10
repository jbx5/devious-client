import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class134 extends DualNode {
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1863398797
   )
   public static int field1573;
   @ObfuscatedName("ak")
   @Export("Tiles_saturation")
   static int[] Tiles_saturation;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1849285827
   )
   int field1574;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "[[Lew;"
   )
   public class127[][] field1568 = null;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "[[Lew;"
   )
   class127[][] field1575 = null;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lin;"
   )
   public Skeleton field1570;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1417348875
   )
   int field1567 = 0;
   @ObfuscatedName("ao")
   boolean field1569;
   @ObfuscatedName("ap")
   Future field1572;
   @ObfuscatedName("ar")
   List field1571;

   @ObfuscatedSignature(
      descriptor = "(Lne;Lne;IZ)V",
      garbageValue = "0"
   )
   public class134(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
      this.field1574 = var3;
      byte[] var5 = var1.takeFile(this.field1574 >> 16 & '\uffff', this.field1574 & '\uffff');
      Buffer var6 = new Buffer(var5);
      int var7 = var6.readUnsignedByte();
      int var8 = var6.readUnsignedShort();
      byte[] var9 = var2.getFile(var8, 0);
      this.field1570 = new Skeleton(var8, var9);
      this.field1571 = new ArrayList();
      this.field1572 = UserComparator7.field1413.submit(new class131(this, var6, var7));
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;IB)V",
      garbageValue = "15"
   )
   void method3049(Buffer var1, int var2) {
      var1.readUnsignedShort();
      var1.readUnsignedShort();
      this.field1567 = var1.readUnsignedByte();
      int var3 = var1.readUnsignedShort();
      this.field1575 = new class127[this.field1570.method4377().method4357()][];
      this.field1568 = new class127[this.field1570.method4380()][];
      class126[] var4 = new class126[var3];

      int var5;
      int var7;
      for(var5 = 0; var5 < var3; ++var5) {
         class128 var12 = UserComparator9.method2874(var1.readUnsignedByte());
         var7 = var1.readShortSmart();
         class129 var13 = WorldMapSectionType.method5191(var1.readUnsignedByte());
         class127 var14 = new class127();
         var14.method2972(var1, var2);
         var4[var5] = new class126(this, var14, var12, var13, var7);
         int var10 = var12.method3006();
         class127[][] var15;
         if (var12 == class128.field1534) {
            var15 = this.field1575;
         } else {
            var15 = this.field1568;
         }

         if (var15[var7] == null) {
            var15[var7] = new class127[var10];
         }

         if (var12 == class128.field1526) {
            this.field1569 = true;
         }
      }

      var5 = var3 / field1573;
      int var6 = var3 % field1573;
      int var8 = 0;

      for(int var9 = 0; var9 < field1573; ++var9) {
         var7 = var8;
         var8 += var5;
         if (var6 > 0) {
            ++var8;
            --var6;
         }

         if (var8 == var7) {
            break;
         }

         this.field1571.add(UserComparator7.field1413.submit(new class133(this, var7, var8, var4)));
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "204129598"
   )
   public boolean method3044() {
      if (this.field1572 == null && this.field1571 == null) {
         return true;
      } else {
         if (this.field1572 != null) {
            if (!this.field1572.isDone()) {
               return false;
            }

            this.field1572 = null;
         }

         boolean var1 = true;

         for(int var2 = 0; var2 < this.field1571.size(); ++var2) {
            if (!((Future)this.field1571.get(var2)).isDone()) {
               var1 = false;
            } else {
               this.field1571.remove(var2);
               --var2;
            }
         }

         if (!var1) {
            return false;
         } else {
            this.field1571 = null;
            return true;
         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "44"
   )
   public int method3058() {
      return this.field1567;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-213201648"
   )
   public boolean method3043() {
      return this.field1569;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(ILek;III)V",
      garbageValue = "-1829799905"
   )
   public void method3047(int var1, class124 var2, int var3, int var4) {
      class421 var5;
      synchronized(class421.field4611) {
         if (class421.field4610 == 0) {
            var5 = new class421();
         } else {
            class421.field4611[--class421.field4610].method7856();
            var5 = class421.field4611[class421.field4610];
         }
      }

      this.method3048(var5, var3, var2, var1);
      this.method3045(var5, var3, var2, var1);
      this.method3054(var5, var3, var2, var1);
      var2.method2944(var5);
      var5.method7888();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lqt;ILek;IB)V",
      garbageValue = "-67"
   )
   void method3048(class421 var1, int var2, class124 var3, int var4) {
      float[] var5 = var3.method2935(this.field1567);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1575[var2] != null) {
         class127 var9 = this.field1575[var2][0];
         class127 var10 = this.field1575[var2][1];
         class127 var11 = this.field1575[var2][2];
         if (var9 != null) {
            var6 = var9.method2974(var4);
         }

         if (var10 != null) {
            var7 = var10.method2974(var4);
         }

         if (var11 != null) {
            var8 = var11.method2974(var4);
         }
      }

      class420 var17 = class287.method5474();
      var17.method7820(1.0F, 0.0F, 0.0F, var6);
      class420 var18 = class287.method5474();
      var18.method7820(0.0F, 1.0F, 0.0F, var7);
      class420 var19 = class287.method5474();
      var19.method7820(0.0F, 0.0F, 1.0F, var8);
      class420 var12 = class287.method5474();
      var12.method7819(var19);
      var12.method7819(var17);
      var12.method7819(var18);
      class421 var13;
      synchronized(class421.field4611) {
         if (class421.field4610 == 0) {
            var13 = new class421();
         } else {
            class421.field4611[--class421.field4610].method7856();
            var13 = class421.field4611[class421.field4610];
         }
      }

      var13.method7852(var12);
      var1.method7851(var13);
      var17.method7824();
      var18.method7824();
      var19.method7824();
      var12.method7824();
      var13.method7888();
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lqt;ILek;IB)V",
      garbageValue = "21"
   )
   void method3054(class421 var1, int var2, class124 var3, int var4) {
      float[] var5 = var3.method2936(this.field1567);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1575[var2] != null) {
         class127 var9 = this.field1575[var2][3];
         class127 var10 = this.field1575[var2][4];
         class127 var11 = this.field1575[var2][5];
         if (var9 != null) {
            var6 = var9.method2974(var4);
         }

         if (var10 != null) {
            var7 = var10.method2974(var4);
         }

         if (var11 != null) {
            var8 = var11.method2974(var4);
         }
      }

      var1.field4608[12] = var6;
      var1.field4608[13] = var7;
      var1.field4608[14] = var8;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lqt;ILek;IB)V",
      garbageValue = "-128"
   )
   void method3045(class421 var1, int var2, class124 var3, int var4) {
      float[] var5 = var3.method2937(this.field1567);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1575[var2] != null) {
         class127 var9 = this.field1575[var2][6];
         class127 var10 = this.field1575[var2][7];
         class127 var11 = this.field1575[var2][8];
         if (var9 != null) {
            var6 = var9.method2974(var4);
         }

         if (var10 != null) {
            var7 = var10.method2974(var4);
         }

         if (var11 != null) {
            var8 = var11.method2974(var4);
         }
      }

      class421 var14;
      synchronized(class421.field4611) {
         if (class421.field4610 == 0) {
            var14 = new class421();
         } else {
            class421.field4611[--class421.field4610].method7856();
            var14 = class421.field4611[class421.field4610];
         }
      }

      var14.method7847(var6, var7, var8);
      var1.method7851(var14);
      var14.method7888();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(II)Lhk;",
      garbageValue = "-998339406"
   )
   public static FloorUnderlayDefinition method3068(int var0) {
      FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0);
         var1 = new FloorUnderlayDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2), var0);
         }

         var1.postDecode();
         FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }
}
