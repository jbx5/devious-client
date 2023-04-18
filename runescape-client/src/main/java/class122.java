import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public class class122 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 875758789
   )
   public final int field1481;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lew;"
   )
   public class122 field1478;
   @ObfuscatedName("aw")
   float[][] field1474;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "[Lqj;"
   )
   final class425[] field1475;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "[Lqj;"
   )
   class425[] field1476;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "[Lqj;"
   )
   class425[] field1477;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lqj;"
   )
   class425 field1485 = new class425();
   @ObfuscatedName("al")
   boolean field1479 = true;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lqj;"
   )
   class425 field1480 = new class425();
   @ObfuscatedName("aa")
   boolean field1472 = true;
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lqj;"
   )
   class425 field1482 = new class425();
   @ObfuscatedName("ao")
   float[][] field1483;
   @ObfuscatedName("ax")
   float[][] field1473;
   @ObfuscatedName("ai")
   float[][] field1484;

   @ObfuscatedSignature(
      descriptor = "(ILsg;Z)V"
   )
   public class122(int var1, Buffer var2, boolean var3) {
      this.field1481 = var2.readShort();
      this.field1475 = new class425[var1];
      this.field1476 = new class425[this.field1475.length];
      this.field1477 = new class425[this.field1475.length];
      this.field1474 = new float[this.field1475.length][3];

      for(int var4 = 0; var4 < this.field1475.length; ++var4) {
         this.field1475[var4] = new class425(var2, var3);
         this.field1474[var4][0] = var2.method9064();
         this.field1474[var4][1] = var2.method9064();
         this.field1474[var4][2] = var2.method9064();
      }

      this.method2995();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "685443179"
   )
   void method2995() {
      this.field1483 = new float[this.field1475.length][3];
      this.field1473 = new float[this.field1475.length][3];
      this.field1484 = new float[this.field1475.length][3];
      class425 var1;
      synchronized(class425.field4665) {
         if (class425.field4667 == 0) {
            var1 = new class425();
         } else {
            class425.field4665[--class425.field4667].method8177();
            var1 = class425.field4665[class425.field4667];
         }
      }

      class425 var2 = var1;

      for(int var5 = 0; var5 < this.field1475.length; ++var5) {
         class425 var4 = this.method2996(var5);
         var2.method8179(var4);
         var2.method8197();
         this.field1483[var5] = var2.method8173();
         this.field1473[var5][0] = var4.field4670[12];
         this.field1473[var5][1] = var4.field4670[13];
         this.field1473[var5][2] = var4.field4670[14];
         this.field1484[var5] = var4.method8224();
      }

      var2.method8176();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IB)Lqj;",
      garbageValue = "0"
   )
   class425 method2996(int var1) {
      return this.field1475[var1];
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)Lqj;",
      garbageValue = "8"
   )
   class425 method2997(int var1) {
      if (this.field1476[var1] == null) {
         this.field1476[var1] = new class425(this.method2996(var1));
         if (this.field1478 != null) {
            this.field1476[var1].method8183(this.field1478.method2997(var1));
         } else {
            this.field1476[var1].method8183(class425.field4664);
         }
      }

      return this.field1476[var1];
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)Lqj;",
      garbageValue = "2116559151"
   )
   class425 method3009(int var1) {
      if (this.field1477[var1] == null) {
         this.field1477[var1] = new class425(this.method2997(var1));
         this.field1477[var1].method8197();
      }

      return this.field1477[var1];
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Lqj;I)V",
      garbageValue = "-2093338496"
   )
   void method3011(class425 var1) {
      this.field1485.method8179(var1);
      this.field1479 = true;
      this.field1472 = true;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)Lqj;",
      garbageValue = "535482001"
   )
   class425 method3000() {
      return this.field1485;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(B)Lqj;",
      garbageValue = "2"
   )
   class425 method3021() {
      if (this.field1479) {
         this.field1480.method8179(this.method3000());
         if (this.field1478 != null) {
            this.field1480.method8183(this.field1478.method3021());
         }

         this.field1479 = false;
      }

      return this.field1480;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(II)Lqj;",
      garbageValue = "250554518"
   )
   public class425 method2999(int var1) {
      if (this.field1472) {
         this.field1482.method8179(this.method3009(var1));
         this.field1482.method8183(this.method3021());
         this.field1472 = false;
      }

      return this.field1482;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)[F",
      garbageValue = "689701217"
   )
   float[] method3017(int var1) {
      return this.field1483[var1];
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(II)[F",
      garbageValue = "2097133235"
   )
   float[] method3003(int var1) {
      return this.field1473[var1];
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(II)[F",
      garbageValue = "-2141341986"
   )
   float[] method3004(int var1) {
      return this.field1484[var1];
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IB)Lhb;",
      garbageValue = "4"
   )
   public static HitSplatDefinition method3046(int var0) {
      HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
         var1 = new HitSplatDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-1549240794"
   )
   static final void method3044(int var0, int var1, int var2, int var3) {
      for(int var4 = var1; var4 <= var3 + var1; ++var4) {
         for(int var5 = var0; var5 <= var0 + var2; ++var5) {
            if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
               Tiles.Tiles_underlays2[0][var5][var4] = 127;
               if (var0 == var5 && var5 > 0) {
                  Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
               }

               if (var5 == var0 + var2 && var5 < 103) {
                  Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
               }

               if (var4 == var1 && var4 > 0) {
                  Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
               }

               if (var4 == var3 + var1 && var4 < 103) {
                  Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
               }
            }
         }
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-702557639"
   )
   static final void method3045() {
      if (!ViewportMouse.ViewportMouse_false0) {
         int var0 = Scene.Scene_cameraPitchSine;
         int var1 = Scene.Scene_cameraPitchCosine;
         int var2 = Scene.Scene_cameraYawSine;
         int var3 = Scene.Scene_cameraYawCosine;
         int var4 = 50;
         int var5 = 3500;
         int var6 = (ViewportMouse.ViewportMouse_x - TaskHandler.method3563()) * var4 / UserComparator7.method2904();
         int var7 = (ViewportMouse.ViewportMouse_y - class12.method164()) * var4 / UserComparator7.method2904();
         int var8 = (ViewportMouse.ViewportMouse_x - TaskHandler.method3563()) * var5 / UserComparator7.method2904();
         int var9 = (ViewportMouse.ViewportMouse_y - class12.method164()) * var5 / UserComparator7.method2904();
         int var11 = var1 * var7 + var0 * var4 >> 16;
         int var12 = var1 * var4 - var0 * var7 >> 16;
         int var13 = var5 * var0 + var1 * var9 >> 16;
         int var14 = var1 * var5 - var9 * var0 >> 16;
         int var10 = class387.method7599(var6, var12, var3, var2);
         var4 = class437.method8344(var6, var12, var3, var2);
         var6 = var10;
         var10 = class387.method7599(var8, var14, var3, var2);
         var5 = class437.method8344(var8, var14, var3, var2);
         ViewportMouse.field2767 = (var6 + var10) / 2;
         class294.field3366 = (var11 + var13) / 2;
         ViewportMouse.field2768 = (var5 + var4) / 2;
         ViewportMouse.field2769 = (var10 - var6) / 2;
         UserComparator8.field1418 = (var13 - var11) / 2;
         ReflectionCheck.field268 = (var5 - var4) / 2;
         EnumComposition.field1979 = Math.abs(ViewportMouse.field2769);
         ViewportMouse.field2771 = Math.abs(UserComparator8.field1418);
         class9.field44 = Math.abs(ReflectionCheck.field268);
      }
   }
}
