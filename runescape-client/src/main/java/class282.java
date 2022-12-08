import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jc")
public final class class282 {
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      longValue = -788590648153767697L
   )
   static long field3327;

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)[Lra;",
      garbageValue = "-872214440"
   )
   static IndexedSprite[] method5509() {
      IndexedSprite[] var0 = new IndexedSprite[class481.SpriteBuffer_spriteCount];

      for(int var1 = 0; var1 < class481.SpriteBuffer_spriteCount; ++var1) {
         IndexedSprite var2 = var0[var1] = new IndexedSprite();
         var2.width = GrandExchangeOfferTotalQuantityComparator.SpriteBuffer_spriteWidth;
         var2.height = class481.SpriteBuffer_spriteHeight;
         var2.xOffset = class481.SpriteBuffer_xOffsets[var1];
         var2.yOffset = class414.SpriteBuffer_yOffsets[var1];
         var2.subWidth = class11.SpriteBuffer_spriteWidths[var1];
         var2.subHeight = StructComposition.SpriteBuffer_spriteHeights[var1];
         var2.palette = WorldMapEvent.SpriteBuffer_spritePalette;
         var2.pixels = FloorDecoration.SpriteBuffer_pixels[var1];
      }

      class481.SpriteBuffer_xOffsets = null;
      class414.SpriteBuffer_yOffsets = null;
      class11.SpriteBuffer_spriteWidths = null;
      StructComposition.SpriteBuffer_spriteHeights = null;
      WorldMapEvent.SpriteBuffer_spritePalette = null;
      FloorDecoration.SpriteBuffer_pixels = null;
      return var0;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "-808600101"
   )
   static int method5508(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.GETWINDOWMODE) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Message.getWindowedMode();
         return 1;
      } else {
         int var3;
         if (var0 == ScriptOpcodes.SETWINDOWMODE) {
            var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            if (var3 == 1 || var3 == 2) {
               class101.setWindowedMode(var3);
            }

            return 1;
         } else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = StructComposition.clientPreferences.method2434();
            return 1;
         } else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
            if (var0 == 5310) {
               --class87.Interpreter_intStackSize;
               return 1;
            } else {
               return 2;
            }
         } else {
            var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            if (var3 == 1 || var3 == 2) {
               StructComposition.clientPreferences.method2460(var3);
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("mx")
   @ObfuscatedSignature(
      descriptor = "(IIIILrx;Lkv;I)V",
      garbageValue = "826966523"
   )
   @Export("drawSpriteOnMinimap")
   static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
      if (var4 != null) {
         int var6 = Client.camAngleY & 2047;
         int var7 = var3 * var3 + var2 * var2;
         if (var7 <= 6400) {
            int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
            int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
            int var10 = var9 * var2 + var3 * var8 >> 16;
            int var11 = var3 * var9 - var8 * var2 >> 16;
            if (var7 > 2500) {
               var4.method9027(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
            } else {
               var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
            }

         }
      }
   }

   @ObfuscatedName("nm")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "2088314775"
   )
   static String method5507(String var0) {
      PlayerType[] var1 = class149.PlayerType_values();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         PlayerType var3 = var1[var2];
         if (var3.modIcon != -1 && var0.startsWith(class456.method8410(var3.modIcon))) {
            var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
            break;
         }
      }

      return var0;
   }
}
