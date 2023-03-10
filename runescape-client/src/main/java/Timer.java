import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
@Implements("Timer")
public class Timer {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      longValue = 6474461140514365781L
   )
   long field4441 = -1L;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      longValue = -6484235333072242705L
   )
   long field4433 = -1L;
   @ObfuscatedName("ac")
   public boolean field4434 = false;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      longValue = 2445261166309703959L
   )
   long field4436 = 0L;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      longValue = 4891784982145261159L
   )
   long field4435 = 0L;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      longValue = -338388379477578015L
   )
   long field4432 = 0L;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1495988025
   )
   int field4438 = 0;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 340077697
   )
   int field4439 = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1170875171
   )
   int field4437 = 0;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -783077817
   )
   int field4440 = 0;

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1077675210"
   )
   public void method7336() {
      this.field4441 = WorldMapSection2.method4844();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "83"
   )
   public void method7323() {
      if (this.field4441 != -1L) {
         this.field4435 = WorldMapSection2.method4844() - this.field4441;
         this.field4441 = -1L;
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1956190938"
   )
   public void method7333(int var1) {
      this.field4433 = WorldMapSection2.method4844();
      this.field4438 = var1;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1378136429"
   )
   public void method7335() {
      if (-1L != this.field4433) {
         this.field4436 = WorldMapSection2.method4844() - this.field4433;
         this.field4433 = -1L;
      }

      ++this.field4437;
      this.field4434 = true;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-350279291"
   )
   public void method7324() {
      this.field4434 = false;
      this.field4439 = 0;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "20"
   )
   public void method7325() {
      this.method7335();
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "1658003997"
   )
   @Export("write")
   public void write(Buffer var1) {
      long var2 = this.field4435;
      var2 /= 10L;
      if (var2 < 0L) {
         var2 = 0L;
      } else if (var2 > 65535L) {
         var2 = 65535L;
      }

      var1.writeShort((int)var2);
      long var4 = this.field4436;
      var4 /= 10L;
      if (var4 < 0L) {
         var4 = 0L;
      } else if (var4 > 65535L) {
         var4 = 65535L;
      }

      var1.writeShort((int)var4);
      long var6 = this.field4432;
      var6 /= 10L;
      if (var6 < 0L) {
         var6 = 0L;
      } else if (var6 > 65535L) {
         var6 = 65535L;
      }

      var1.writeShort((int)var6);
      var1.writeShort(this.field4438);
      var1.writeShort(this.field4439);
      var1.writeShort(this.field4437);
      var1.writeShort(this.field4440);
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Lmy;IIIB)V",
      garbageValue = "10"
   )
   @Export("Widget_setKeyRate")
   static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
      if (var0.field3583 == null) {
         throw new RuntimeException();
      } else {
         var0.field3583[var1] = var2;
         var0.field3603[var1] = var3;
      }
   }

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "([BI)[B",
      garbageValue = "1791005101"
   )
   @Export("decompressBytes")
   static final byte[] decompressBytes(byte[] var0) {
      Buffer var1 = new Buffer(var0);
      int var2 = var1.readUnsignedByte();
      int var3 = var1.readInt();
      if (var3 < 0 || AbstractArchive.field4201 != 0 && var3 > AbstractArchive.field4201) {
         throw new RuntimeException();
      } else if (var2 == 0) {
         byte[] var6 = new byte[var3];
         var1.readBytes(var6, 0, var3);
         return var6;
      } else {
         int var4 = var1.readInt();
         if (var4 >= 0 && (AbstractArchive.field4201 == 0 || var4 <= AbstractArchive.field4201)) {
            byte[] var5 = new byte[var4];
            if (var2 == 1) {
               BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
            } else {
               AbstractArchive.gzipDecompressor.decompress(var1, var5);
            }

            return var5;
         } else {
            throw new RuntimeException();
         }
      }
   }
}
