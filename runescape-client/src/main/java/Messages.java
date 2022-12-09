import java.awt.FontMetrics;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("Messages")
public class Messages {
   @ObfuscatedName("h")
   @Export("Messages_channels")
   static final Map Messages_channels = new HashMap();
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lql;"
   )
   @Export("Messages_hashTable")
   static final IterableNodeHashTable Messages_hashTable = new IterableNodeHashTable(1024);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lmm;"
   )
   @Export("Messages_queue")
   static final IterableDualNodeQueue Messages_queue = new IterableDualNodeQueue();
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1199730995
   )
   @Export("Messages_count")
   static int Messages_count = 0;
   @ObfuscatedName("av")
   @Export("loginScreenFontMetrics")
   static FontMetrics loginScreenFontMetrics;

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lly;B)V",
      garbageValue = "0"
   )
   public static void method2719(AbstractArchive var0) {
      InvDefinition.InvDefinition_archive = var0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqy;IIIIIII)V",
      garbageValue = "-1974916673"
   )
   @Export("loadTerrain")
   static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = var1 >= 0 && var1 < 4 && var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104;
      int var8;
      if (var7) {
         Tiles.Tiles_renderFlags[var1][var2][var3] = 0;

         while(true) {
            var8 = Client.field515 < 209 ? var0.readUnsignedByte() : var0.readUnsignedShort();
            if (var8 == 0) {
               if (var1 == 0) {
                  int[] var15 = Tiles.Tiles_heights[0][var2];
                  int var12 = var4 + 932731;
                  int var13 = var5 + 556238;
                  int var14 = World.method1801(var12 + '넵', var13 + 91923, 4) - 128 + (World.method1801(10294 + var12, var13 + '鎽', 2) - 128 >> 1) + (World.method1801(var12, var13, 1) - 128 >> 2);
                  var14 = (int)((double)var14 * 0.3) + 35;
                  if (var14 < 10) {
                     var14 = 10;
                  } else if (var14 > 60) {
                     var14 = 60;
                  }

                  var15[var3] = -var14 * 8;
               } else {
                  Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if (var8 == 1) {
               int var9 = var0.readUnsignedByte();
               if (var9 == 1) {
                  var9 = 0;
               }

               if (var1 == 0) {
                  Tiles.Tiles_heights[0][var2][var3] = -var9 * 8;
               } else {
                  Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var9 * 8;
               }
               break;
            }

            if (var8 <= 49) {
               class490.Tiles_overlays[var1][var2][var3] = Client.field515 < 209 ? (short)var0.readByte() : (short)var0.readShort();
               Tiles.Tiles_shapes[var1][var2][var3] = (byte)((var8 - 2) / 4);
               class358.field4344[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3);
            } else if (var8 <= 81) {
               Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var8 - 49);
            } else {
               Tiles.Tiles_underlays[var1][var2][var3] = (short)(var8 - 81);
            }
         }
      } else {
         while(true) {
            var8 = Client.field515 < 209 ? var0.readUnsignedByte() : var0.readUnsignedShort();
            if (var8 == 0) {
               break;
            }

            if (var8 == 1) {
               var0.readUnsignedByte();
               break;
            }

            if (var8 <= 49) {
               if (Client.field515 < 209) {
                  var0.readByte();
               } else {
                  var0.readShort();
               }
            }
         }
      }

   }
}
