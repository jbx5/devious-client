import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class157 extends class142 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 369331553
   )
   @Export("pcmSampleLength")
   public static int pcmSampleLength;
   @ObfuscatedName("kf")
   @ObfuscatedSignature(
      descriptor = "[Ltm;"
   )
   @Export("headIconPrayerSprites")
   static SpritePixels[] headIconPrayerSprites;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      longValue = -8489607795920725143L
   )
   long field1733;
   @ObfuscatedName("an")
   String field1730;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -127734709
   )
   int field1729;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfh;"
   )
   final class145 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfh;)V"
   )
   class157(class145 var1) {
      this.this$0 = var1;
      this.field1733 = -1L;
      this.field1730 = null;
      this.field1729 = 0;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;B)V",
      garbageValue = "59"
   )
   void vmethod3381(Buffer var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         this.field1733 = var1.readLong();
      }

      this.field1730 = var1.readStringCp1252NullTerminatedOrNull();
      this.field1729 = var1.readUnsignedShort();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfs;B)V",
      garbageValue = "-72"
   )
   void vmethod3382(ClanSettings var1) {
      var1.method3207(this.field1733, this.field1730, this.field1729);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1636680829"
   )
   public static int method3299(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }

   @ObfuscatedName("gx")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "715423144"
   )
   static void method3300(int var0, int var1) {
      int[] var2 = new int[9];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         int var4 = var3 * 32 + 15 + 128;
         int var5 = class101.method2635(var4);
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
}
