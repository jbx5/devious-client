import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
public final class class361 {
   @ObfuscatedName("a")
   final Object field4310;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1220600737
   )
   int field4311;

   class361(Object var1, int var2) {
      this.field4310 = var1;
      this.field4311 = var2;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "([BIILhf;[Lgr;B)V",
      garbageValue = "-47"
   )
   static final void method6839(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
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

               DbTableType.addObjects(var12, var16, var17, var6, var15, var14, var3, var19);
            }
         }
      }
   }
}
