import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
public class class139 {
   @ObfuscatedName("fu")
   @Export("worldHost")
   static String worldHost;
   @ObfuscatedName("iv")
   @ObfuscatedSignature(
      descriptor = "Lrx;"
   )
   @Export("redHintArrowSprite")
   static SpritePixels redHintArrowSprite;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      longValue = -2412790718351732385L
   )
   long field1674;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 911939033
   )
   int field1668 = -1;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lmv;"
   )
   IterableNodeDeque field1669 = new IterableNodeDeque();

   @ObfuscatedSignature(
      descriptor = "(Lqy;)V"
   )
   public class139(Buffer var1) {
      this.method3093(var1);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1937502404"
   )
   void method3093(Buffer var1) {
      this.field1674 = var1.readLong();
      this.field1668 = var1.readInt();

      for(int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
         Object var3;
         if (var2 == 3) {
            var3 = new class158(this);
         } else if (var2 == 1) {
            var3 = new class134(this);
         } else if (var2 == 13) {
            var3 = new class151(this);
         } else if (var2 == 4) {
            var3 = new class143(this);
         } else if (var2 == 6) {
            var3 = new class150(this);
         } else if (var2 == 5) {
            var3 = new class135(this);
         } else if (var2 == 2) {
            var3 = new class140(this);
         } else if (var2 == 7) {
            var3 = new class133(this);
         } else if (var2 == 14) {
            var3 = new class137(this);
         } else if (var2 == 8) {
            var3 = new class154(this);
         } else if (var2 == 9) {
            var3 = new class160(this);
         } else if (var2 == 10) {
            var3 = new class146(this);
         } else if (var2 == 11) {
            var3 = new class141(this);
         } else if (var2 == 12) {
            var3 = new class145(this);
         } else {
            if (var2 != 15) {
               throw new RuntimeException("");
            }

            var3 = new class155(this);
         }

         ((class136)var3).vmethod3349(var1);
         this.field1669.addFirst((Node)var3);
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lep;I)V",
      garbageValue = "-1399392797"
   )
   public void method3094(ClanSettings var1) {
      if (this.field1674 == var1.field1723 && this.field1668 == var1.field1746) {
         for(class136 var2 = (class136)this.field1669.last(); var2 != null; var2 = (class136)this.field1669.previous()) {
            var2.vmethod3350(var1);
         }

         ++var1.field1746;
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "([BIILhc;[Lgw;B)V",
      garbageValue = "115"
   )
   static final void method3087(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
      Buffer var5 = new Buffer(var0);
      int var6 = -1;

      while(true) {
         int var7 = var5.readIncrSmallSmart();
         if (var7 == 0) {
            return;
         }

         var6 += var7;
         int var8 = 0;

         while(true) {
            int var9 = var5.readUShortSmart();
            if (var9 == 0) {
               break;
            }

            var8 += var9 - 1;
            int var10 = var8 & 63;
            int var11 = var8 >> 6 & 63;
            int var12 = var8 >> 12;
            int var13 = var5.readUnsignedByte();
            int var14 = var13 >> 2;
            int var15 = var13 & 3;
            int var16 = var11 + var1;
            int var17 = var10 + var2;
            if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
               int var18 = var12;
               if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) {
                  var18 = var12 - 1;
               }

               CollisionMap var19 = null;
               if (var18 >= 0) {
                  var19 = var4[var18];
               }

               UrlRequester.addObjects(var12, var16, var17, var6, var15, var14, var3, var19);
            }
         }
      }
   }
}
