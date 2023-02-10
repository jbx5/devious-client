import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
public class class427 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lpf;"
   )
   public static final class427 field4680 = new class427("application/json");
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lpf;"
   )
   static final class427 field4678 = new class427("text/plain");
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Lkd;"
   )
   @Export("musicTrack")
   public static MusicTrack musicTrack;
   @ObfuscatedName("v")
   String field4677;

   class427(String var1) {
      this.field4677 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "105"
   )
   public String method8031() {
      return this.field4677;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Lrd;IIIIIII)V",
      garbageValue = "821456932"
   )
   @Export("loadTerrain")
   static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      if (HealthBar.method2611(var1, var2, var3)) {
         Tiles.Tiles_renderFlags[var1][var2][var3] = 0;

         while(true) {
            var7 = Client.field505 < 209 ? var0.readUnsignedByte() : var0.readUnsignedShort();
            if (var7 == 0) {
               if (var1 == 0) {
                  int[] var14 = Tiles.Tiles_heights[0][var2];
                  int var11 = var4 + 932731;
                  int var12 = var5 + 556238;
                  int var13 = class4.method17('넵' + var11, var12 + 91923, 4) - 128 + (class4.method17(10294 + var11, var12 + '鎽', 2) - 128 >> 1) + (class4.method17(var11, var12, 1) - 128 >> 2);
                  var13 = (int)(0.3 * (double)var13) + 35;
                  if (var13 < 10) {
                     var13 = 10;
                  } else if (var13 > 60) {
                     var13 = 60;
                  }

                  var14[var3] = -var13 * 8;
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
               class172.Tiles_overlays[var1][var2][var3] = Client.field505 < 209 ? (short)var0.readByte() : (short)var0.readShort();
               Tiles.Tiles_shapes[var1][var2][var3] = (byte)((var7 - 2) / 4);
               Tiles.field1012[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
            } else if (var7 <= 81) {
               Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49);
            } else {
               Tiles.Tiles_underlays[var1][var2][var3] = (short)(var7 - 81);
            }
         }
      } else {
         while(true) {
            var7 = Client.field505 < 209 ? var0.readUnsignedByte() : var0.readUnsignedShort();
            if (var7 == 0) {
               break;
            }

            if (var7 == 1) {
               var0.readUnsignedByte();
               break;
            }

            if (var7 <= 49) {
               if (Client.field505 < 209) {
                  var0.readByte();
               } else {
                  var0.readShort();
               }
            }
         }
      }

   }
}
