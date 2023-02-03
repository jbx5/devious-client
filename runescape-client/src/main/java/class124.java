import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class124 implements Callable {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lda;"
   )
   final class125 field1516;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Ldk;"
   )
   final class126 field1513;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Ldx;"
   )
   final class127 field1514;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1186726763
   )
   final int field1515;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lei;"
   )
   final class133 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lei;Lda;Ldk;Ldx;I)V"
   )
   class124(class133 var1, class125 var2, class126 var3, class127 var4, int var5) {
      this.this$0 = var1;
      this.field1516 = var2;
      this.field1513 = var3;
      this.field1514 = var4;
      this.field1515 = var5;
   }

   public Object call() {
      this.field1516.method3063();
      class125[][] var1;
      if (this.field1513 == class126.field1548) {
         var1 = this.this$0.field1602;
      } else {
         var1 = this.this$0.field1601;
      }

      var1[this.field1515][this.field1514.method3076()] = this.field1516;
      return null;
   }

   @ObfuscatedName("n")
   @Export("Entity_unpackID")
   public static int Entity_unpackID(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(ILko;ZI)V",
      garbageValue = "508000194"
   )
   static void method3040(int var0, Coord var1, boolean var2) {
      WorldMapArea var3 = WorldMapDecorationType.getWorldMap().getMapArea(var0);
      int var4 = class387.localPlayer.plane;
      int var5 = ParamComposition.baseX * 64 + (class387.localPlayer.x >> 7);
      int var6 = Client.baseY * 64 + (class387.localPlayer.y >> 7);
      Coord var7 = new Coord(var4, var5, var6);
      WorldMapDecorationType.getWorldMap().method8298(var3, var7, var1, var2);
   }
}
