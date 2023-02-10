import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public class class125 {
   @ObfuscatedName("f")
   boolean field1545;
   @ObfuscatedName("w")
   boolean field1521;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lde;"
   )
   class123 field1522;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lde;"
   )
   class123 field1541;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "[Ldp;"
   )
   class120[] field1524;
   @ObfuscatedName("j")
   boolean field1525;
   @ObfuscatedName("i")
   float field1520;
   @ObfuscatedName("n")
   float field1527;
   @ObfuscatedName("l")
   float field1528;
   @ObfuscatedName("k")
   float field1529;
   @ObfuscatedName("c")
   float field1543;
   @ObfuscatedName("r")
   float field1531;
   @ObfuscatedName("b")
   float field1532;
   @ObfuscatedName("m")
   float field1537;
   @ObfuscatedName("t")
   float field1534;
   @ObfuscatedName("h")
   float field1535;
   @ObfuscatedName("p")
   boolean field1530 = true;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 1887825127
   )
   int field1523 = 0;
   @ObfuscatedName("u")
   float[] field1538;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 960875505
   )
   int field1526;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -464217391
   )
   int field1540;
   @ObfuscatedName("q")
   float field1539;
   @ObfuscatedName("d")
   float field1542;

   class125() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lrd;II)I",
      garbageValue = "-1866146568"
   )
   int method3064(Buffer var1, int var2) {
      int var3 = var1.readUnsignedShort();
      ReflectionCheck.method695(var1.readUnsignedByte());
      int var5 = var1.readUnsignedByte();
      class123 var6 = (class123)class4.findEnumerated(UrlRequester.method2852(), var5);
      if (var6 == null) {
         var6 = class123.field1502;
      }

      this.field1522 = var6;
      this.field1541 = ItemContainer.method2292(var1.readUnsignedByte());
      this.field1545 = var1.readUnsignedByte() != 0;
      this.field1524 = new class120[var3];
      class120 var9 = null;

      for(int var7 = 0; var7 < var3; ++var7) {
         class120 var8 = new class120();
         var8.method2974(var1, var2);
         this.field1524[var7] = var8;
         if (var9 != null) {
            var9.field1468 = var8;
         }

         var9 = var8;
      }

      return var3;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "26018598"
   )
   void method3063() {
      this.field1526 = this.field1524[0].field1474;
      this.field1540 = this.field1524[this.method3060() - 1].field1474;
      this.field1538 = new float[this.method3046() + 1];

      for(int var1 = this.method3061(); var1 <= this.method3045(); ++var1) {
         this.field1538[var1 - this.method3061()] = UrlRequester.method2874(this, (float)var1);
      }

      this.field1524 = null;
      this.field1539 = UrlRequester.method2874(this, (float)(this.method3061() - 1));
      this.field1542 = UrlRequester.method2874(this, (float)(this.method3045() + 1));
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)F",
      garbageValue = "2047017372"
   )
   public float method3043(int var1) {
      if (var1 < this.method3061()) {
         return this.field1539;
      } else {
         return var1 > this.method3045() ? this.field1542 : this.field1538[var1 - this.method3061()];
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-178881798"
   )
   int method3061() {
      return this.field1526;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1489350859"
   )
   int method3045() {
      return this.field1540;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "11"
   )
   int method3046() {
      return this.method3045() - this.method3061();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(FI)I",
      garbageValue = "-2139366977"
   )
   int method3047(float var1) {
      if (this.field1523 < 0 || !((float)this.field1524[this.field1523].field1474 <= var1) || this.field1524[this.field1523].field1468 != null && !((float)this.field1524[this.field1523].field1468.field1474 > var1)) {
         if (!(var1 < (float)this.method3061()) && !(var1 > (float)this.method3045())) {
            int var2 = this.method3060();
            int var3 = this.field1523;
            if (var2 > 0) {
               int var4 = 0;
               int var5 = var2 - 1;

               do {
                  int var6 = var5 + var4 >> 1;
                  if (var1 < (float)this.field1524[var6].field1474) {
                     if (var1 > (float)this.field1524[var6 - 1].field1474) {
                        var3 = var6 - 1;
                        break;
                     }

                     var5 = var6 - 1;
                  } else {
                     if (!(var1 > (float)this.field1524[var6].field1474)) {
                        var3 = var6;
                        break;
                     }

                     if (var1 < (float)this.field1524[var6 + 1].field1474) {
                        var3 = var6;
                        break;
                     }

                     var4 = var6 + 1;
                  }
               } while(var4 <= var5);
            }

            if (var3 != this.field1523) {
               this.field1523 = var3;
               this.field1530 = true;
            }

            return this.field1523;
         } else {
            return -1;
         }
      } else {
         return this.field1523;
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(FB)Ldp;",
      garbageValue = "-71"
   )
   class120 method3049(float var1) {
      int var2 = this.method3047(var1);
      return var2 >= 0 && var2 < this.field1524.length ? this.field1524[var2] : null;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1012762214"
   )
   int method3060() {
      return this.field1524 == null ? 0 : this.field1524.length;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Lln;Ljava/lang/String;Ljava/lang/String;I)[Lrg;",
      garbageValue = "-46072999"
   )
   public static IndexedSprite[] method3066(AbstractArchive var0, String var1, String var2) {
      int var3 = var0.getGroupId(var1);
      int var4 = var0.getFileId(var3, var2);
      IndexedSprite[] var5;
      if (!Buffer.method8892(var0, var3, var4)) {
         var5 = null;
      } else {
         IndexedSprite[] var7 = new IndexedSprite[class488.SpriteBuffer_spriteCount];

         for(int var8 = 0; var8 < class488.SpriteBuffer_spriteCount; ++var8) {
            IndexedSprite var9 = var7[var8] = new IndexedSprite();
            var9.width = class488.SpriteBuffer_spriteWidth;
            var9.height = class488.SpriteBuffer_spriteHeight;
            var9.xOffset = class488.SpriteBuffer_xOffsets[var8];
            var9.yOffset = ApproximateRouteStrategy.SpriteBuffer_yOffsets[var8];
            var9.subWidth = FriendsList.SpriteBuffer_spriteWidths[var8];
            var9.subHeight = class132.SpriteBuffer_spriteHeights[var8];
            var9.palette = class100.SpriteBuffer_spritePalette;
            var9.pixels = class140.SpriteBuffer_pixels[var8];
         }

         class100.method2724();
         var5 = var7;
      }

      return var5;
   }
}
