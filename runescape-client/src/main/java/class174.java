import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class174 extends class177 {
   @ObfuscatedName("ek")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   @Export("archive14")
   static Archive archive14;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -2117443693
   )
   int field1883;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfs;"
   )
   final class166 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfs;Ljava/lang/String;I)V"
   )
   class174(class166 var1, String var2, int var3) {
      super(var1, var2);
      this.this$0 = var1;
      this.field1883 = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "1024"
   )
   public int vmethod3537() {
      return 0;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "64"
   )
   public int vmethod3539() {
      return this.field1883;
   }

   @ObfuscatedName("fr")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-200044471"
   )
   static void method3525(int var0, int var1) {
      int[] var2 = new int[9];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         int var4 = var3 * 32 + 15 + 128;
         int var5 = class17.method274(var4);
         int var6 = Rasterizer3D.Rasterizer3D_sine[var4];
         int var8 = var1 - 334;
         if (var8 < 0) {
            var8 = 0;
         } else if (var8 > 100) {
            var8 = 100;
         }

         int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight;
         int var7 = var5 * var9 / 256;
         var2[var3] = var6 * var7 >> 16;
      }

      Scene.Scene_buildVisiblityMap(var2, 500, 800, var0 * 334 / var1, 334);
   }

   @ObfuscatedName("ig")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2140118435"
   )
   @Export("addCancelMenuEntry")
   static void addCancelMenuEntry() {
      ScriptFrame.method1156();
      Client.menuActions[0] = "Cancel";
      Client.menuTargets[0] = "";
      Client.menuOpcodes[0] = 1006;
      Client.menuShiftClick[0] = false;
      Client.menuOptionsCount = 1;
   }
}
