import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
   DevicePcmPlayerProvider() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Lbi;",
      garbageValue = "-1314025679"
   )
   @Export("player")
   public PcmPlayer player() {
      return new DevicePcmPlayer();
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Ltz;IIIIIIB)V",
      garbageValue = "1"
   )
   @Export("loadTerrain")
   static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      if (class169.method3438(var1, var2, var3)) {
         Tiles.Tiles_renderFlags[var1][var2][var3] = 0;

         while(true) {
            var7 = var0.readUnsignedShort();
            if (var7 == 0) {
               if (var1 == 0) {
                  Tiles.Tiles_heights[0][var2][var3] = -class107.method2701(var4 + 932731, var5 + 556238) * 8;
               } else {
                  Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if (var7 == 1) {
               int var8 = var0.readUnsignedByte();
               if (var8 == 1) {
                  var8 = 0;
               }

               if (var1 == 0) {
                  Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
               } else {
                  Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8;
               }
               break;
            }

            if (var7 <= 49) {
               class74.Tiles_overlays[var1][var2][var3] = (short)var0.readShort();
               Player.Tiles_shapes[var1][var2][var3] = (byte)((var7 - 2) / 4);
               Tiles.field1018[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
            } else if (var7 <= 81) {
               Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49);
            } else {
               FaceNormal.Tiles_underlays[var1][var2][var3] = (short)(var7 - 81);
            }
         }
      } else {
         while(true) {
            var7 = var0.readUnsignedShort();
            if (var7 == 0) {
               break;
            }

            if (var7 == 1) {
               var0.readUnsignedByte();
               break;
            }

            if (var7 <= 49) {
               var0.readShort();
            }
         }
      }

   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZI)I",
      garbageValue = "-612230964"
   )
   static int method316(int var0, Script var1, boolean var2) {
      return 2;
   }
}
