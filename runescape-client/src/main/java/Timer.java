import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
@Implements("Timer")
public class Timer {
   @ObfuscatedName("vx")
   static Iterator field4460;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      longValue = 617951219101868201L
   )
   long field4458 = -1L;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      longValue = -7191502108870423843L
   )
   long field4456 = -1L;
   @ObfuscatedName("v")
   public boolean field4452 = false;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      longValue = 9077131697962765351L
   )
   long field4450 = 0L;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      longValue = -4812176588802340469L
   )
   long field4454 = 0L;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      longValue = 4276904843029533051L
   )
   long field4455 = 0L;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1102349833
   )
   int field4453 = 0;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 887946609
   )
   int field4457 = 0;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1762076025
   )
   int field4451 = 0;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1226330179
   )
   int field4459 = 0;

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-26308"
   )
   public void method7352() {
      this.field4458 = Message.method1197();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "5"
   )
   public void method7330() {
      if (-1L != this.field4458) {
         this.field4454 = Message.method1197() - this.field4458;
         this.field4458 = -1L;
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "4"
   )
   public void method7331(int var1) {
      this.field4456 = Message.method1197();
      this.field4453 = var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1829013009"
   )
   public void method7332() {
      if (this.field4456 != -1L) {
         this.field4450 = Message.method1197() - this.field4456;
         this.field4456 = -1L;
      }

      ++this.field4451;
      this.field4452 = true;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-223931045"
   )
   public void method7333() {
      this.field4452 = false;
      this.field4457 = 0;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-420900063"
   )
   public void method7328() {
      this.method7332();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqy;B)V",
      garbageValue = "-113"
   )
   @Export("write")
   public void write(Buffer var1) {
      long var2 = this.field4454;
      var2 /= 10L;
      if (var2 < 0L) {
         var2 = 0L;
      } else if (var2 > 65535L) {
         var2 = 65535L;
      }

      var1.writeShort((int)var2);
      long var4 = this.field4450;
      var4 /= 10L;
      if (var4 < 0L) {
         var4 = 0L;
      } else if (var4 > 65535L) {
         var4 = 65535L;
      }

      var1.writeShort((int)var4);
      long var6 = this.field4455;
      var6 /= 10L;
      if (var6 < 0L) {
         var6 = 0L;
      } else if (var6 > 65535L) {
         var6 = 65535L;
      }

      var1.writeShort((int)var6);
      var1.writeShort(this.field4453);
      var1.writeShort(this.field4457);
      var1.writeShort(this.field4451);
      var1.writeShort(this.field4459);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lly;Lly;III)Lnv;",
      garbageValue = "1891121533"
   )
   public static Font method7358(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
      byte[] var5 = var0.takeFile(var2, var3);
      boolean var4;
      if (var5 == null) {
         var4 = false;
      } else {
         VarpDefinition.SpriteBuffer_decode(var5);
         var4 = true;
      }

      if (!var4) {
         return null;
      } else {
         byte[] var6 = var1.takeFile(var2, var3);
         Font var8;
         if (var6 == null) {
            var8 = null;
         } else {
            Font var7 = new Font(var6, class481.SpriteBuffer_xOffsets, class414.SpriteBuffer_yOffsets, class11.SpriteBuffer_spriteWidths, StructComposition.SpriteBuffer_spriteHeights, WorldMapEvent.SpriteBuffer_spritePalette, FloorDecoration.SpriteBuffer_pixels);
            class481.SpriteBuffer_xOffsets = null;
            class414.SpriteBuffer_yOffsets = null;
            class11.SpriteBuffer_spriteWidths = null;
            StructComposition.SpriteBuffer_spriteHeights = null;
            WorldMapEvent.SpriteBuffer_spritePalette = null;
            FloorDecoration.SpriteBuffer_pixels = null;
            var8 = var7;
         }

         return var8;
      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "([BIIS)I",
      garbageValue = "-5416"
   )
   static int method7357(byte[] var0, int var1, int var2) {
      int var3 = -1;

      for(int var4 = var1; var4 < var2; ++var4) {
         var3 = var3 >>> 8 ^ Buffer.field4915[(var3 ^ var0[var4]) & 255];
      }

      var3 = ~var3;
      return var3;
   }
}
