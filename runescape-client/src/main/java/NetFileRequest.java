import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   @Export("archive")
   Archive archive;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 279436127
   )
   @Export("crc")
   int crc;
   @ObfuscatedName("v")
   @Export("padding")
   byte padding;

   NetFileRequest() {
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "([BIII)Z",
      garbageValue = "-2058830969"
   )
   static final boolean method6516(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      Buffer var4 = new Buffer(var0);
      int var5 = -1;

      label69:
      while(true) {
         int var6 = var4.readIncrSmallSmart();
         if (var6 == 0) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while(true) {
            int var9;
            while(!var8) {
               var9 = var4.readUShortSmart();
               if (var9 == 0) {
                  continue label69;
               }

               var7 += var9 - 1;
               int var10 = var7 & 63;
               int var11 = var7 >> 6 & 63;
               int var12 = var4.readUnsignedByte() >> 2;
               int var13 = var11 + var1;
               int var14 = var10 + var2;
               if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
                  ObjectComposition var15 = class463.getObjectDefinition(var5);
                  if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
                     if (!var15.needsModelFiles()) {
                        ++Client.field567;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }

            var9 = var4.readUShortSmart();
            if (var9 == 0) {
               break;
            }

            var4.readUnsignedByte();
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "([BIILhn;[Lgv;B)V",
      garbageValue = "-47"
   )
   static final void method6517(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
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

               UserList.addObjects(var12, var16, var17, var6, var15, var14, var3, var19);
            }
         }
      }
   }
}
