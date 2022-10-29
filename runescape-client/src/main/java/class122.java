import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public class class122 {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1842803755
   )
   public final int field1456;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ldi;"
   )
   public class122 field1457;
   @ObfuscatedName("c")
   float[][] field1469;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "[Lov;"
   )
   final class407[] field1458;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "[Lov;"
   )
   class407[] field1459;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "[Lov;"
   )
   class407[] field1460;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lov;"
   )
   class407 field1467 = new class407();
   @ObfuscatedName("d")
   boolean field1462 = true;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lov;"
   )
   class407 field1463 = new class407();
   @ObfuscatedName("r")
   boolean field1461 = true;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Lov;"
   )
   class407 field1464 = new class407();
   @ObfuscatedName("s")
   float[][] field1466;
   @ObfuscatedName("p")
   float[][] field1465;
   @ObfuscatedName("b")
   float[][] field1468;

   @ObfuscatedSignature(
      descriptor = "(ILqr;Z)V"
   )
   public class122(int var1, Buffer var2, boolean var3) {
      this.field1456 = var2.readShort();
      this.field1458 = new class407[var1];
      this.field1459 = new class407[this.field1458.length];
      this.field1460 = new class407[this.field1458.length];
      this.field1469 = new float[this.field1458.length][3];

      for(int var4 = 0; var4 < this.field1458.length; ++var4) {
         this.field1458[var4] = new class407(var2, var3);
         this.field1469[var4][0] = var2.method8410();
         this.field1469[var4][1] = var2.method8410();
         this.field1469[var4][2] = var2.method8410();
      }

      this.method2825();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-79"
   )
   void method2825() {
      this.field1466 = new float[this.field1458.length][3];
      this.field1465 = new float[this.field1458.length][3];
      this.field1468 = new float[this.field1458.length][3];
      class407 var1 = Coord.method5706();

      for(int var2 = 0; var2 < this.field1458.length; ++var2) {
         class407 var3 = this.method2863(var2);
         var1.method7648(var3);
         var1.method7678();
         this.field1466[var2] = var1.method7645();
         this.field1465[var2][0] = var3.field4566[12];
         this.field1465[var2][1] = var3.field4566[13];
         this.field1465[var2][2] = var3.field4566[14];
         this.field1468[var2] = var3.method7658();
      }

      var1.method7695();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)Lov;",
      garbageValue = "1957990882"
   )
   class407 method2863(int var1) {
      return this.field1458[var1];
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(II)Lov;",
      garbageValue = "-1684001429"
   )
   class407 method2843(int var1) {
      if (this.field1459[var1] == null) {
         this.field1459[var1] = new class407(this.method2863(var1));
         if (this.field1457 != null) {
            this.field1459[var1].method7652(this.field1457.method2843(var1));
         } else {
            this.field1459[var1].method7652(class407.field4567);
         }
      }

      return this.field1459[var1];
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(II)Lov;",
      garbageValue = "2008765713"
   )
   class407 method2828(int var1) {
      if (this.field1460[var1] == null) {
         this.field1460[var1] = new class407(this.method2843(var1));
         this.field1460[var1].method7678();
      }

      return this.field1460[var1];
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lov;B)V",
      garbageValue = "-124"
   )
   void method2847(class407 var1) {
      this.field1467.method7648(var1);
      this.field1462 = true;
      this.field1461 = true;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)Lov;",
      garbageValue = "723790579"
   )
   class407 method2830() {
      return this.field1467;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)Lov;",
      garbageValue = "-1868205322"
   )
   class407 method2831() {
      if (this.field1462) {
         this.field1463.method7648(this.method2830());
         if (this.field1457 != null) {
            this.field1463.method7652(this.field1457.method2831());
         }

         this.field1462 = false;
      }

      return this.field1463;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(II)Lov;",
      garbageValue = "2047938676"
   )
   public class407 method2832(int var1) {
      if (this.field1461) {
         this.field1464.method7648(this.method2828(var1));
         this.field1464.method7652(this.method2831());
         this.field1461 = false;
      }

      return this.field1464;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IB)[F",
      garbageValue = "-77"
   )
   float[] method2845(int var1) {
      return this.field1466[var1];
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(IB)[F",
      garbageValue = "43"
   )
   float[] method2834(int var1) {
      return this.field1465[var1];
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(IB)[F",
      garbageValue = "1"
   )
   float[] method2835(int var1) {
      return this.field1468[var1];
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-60194862"
   )
   static final boolean method2865() {
      return ViewportMouse.ViewportMouse_isInViewport;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1460045562"
   )
   static final void method2864() {
      if (!ViewportMouse.ViewportMouse_false0) {
         int var0 = Scene.Scene_cameraPitchSine;
         int var1 = Scene.Scene_cameraPitchCosine;
         int var2 = Scene.Scene_cameraYawSine;
         int var3 = Scene.Scene_cameraYawCosine;
         int var4 = 50;
         int var5 = 3500;
         int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var4 / Rasterizer3D.Rasterizer3D_zoom;
         int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var4 / Rasterizer3D.Rasterizer3D_zoom;
         int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var5 / Rasterizer3D.Rasterizer3D_zoom;
         int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var5 / Rasterizer3D.Rasterizer3D_zoom;
         int var10 = Rasterizer3D.method4189(var7, var4, var1, var0);
         var4 = Rasterizer3D.method4199(var7, var4, var1, var0);
         var7 = var10;
         var10 = Rasterizer3D.method4189(var9, var5, var1, var0);
         var5 = Rasterizer3D.method4199(var9, var5, var1, var0);
         var9 = var10;
         var10 = Rasterizer3D.method4214(var6, var4, var3, var2);
         var4 = Rasterizer3D.method4172(var6, var4, var3, var2);
         var6 = var10;
         var10 = Rasterizer3D.method4214(var8, var5, var3, var2);
         var5 = Rasterizer3D.method4172(var8, var5, var3, var2);
         ViewportMouse.field2672 = (var10 + var6) / 2;
         ViewportMouse.field2677 = (var7 + var9) / 2;
         ViewportMouse.field2674 = (var4 + var5) / 2;
         class309.field3657 = (var10 - var6) / 2;
         UserComparator6.field1435 = (var9 - var7) / 2;
         MenuAction.field887 = (var5 - var4) / 2;
         ViewportMouse.field2675 = Math.abs(class309.field3657);
         WorldMapArchiveLoader.field4685 = Math.abs(UserComparator6.field1435);
         class6.field17 = Math.abs(MenuAction.field887);
      }
   }
}
