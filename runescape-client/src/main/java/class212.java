import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
public class class212 {
   @ObfuscatedName("ac")
   @Export("directions")
   static int[][] directions = new int[128][128];
   @ObfuscatedName("ab")
   @Export("distances")
   static int[][] distances = new int[128][128];
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1698367393
   )
   static int field2344;
   @ObfuscatedName("aq")
   @Export("bufferX")
   static int[] bufferX = new int[4096];
   @ObfuscatedName("ap")
   @Export("bufferY")
   static int[] bufferY = new int[4096];
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 73098271
   )
   static int field2347;
   @ObfuscatedName("ae")
   @Export("ByteArrayPool_alternativeSizes")
   public static int[] ByteArrayPool_alternativeSizes;
   @ObfuscatedName("ei")
   @ObfuscatedSignature(
      descriptor = "Lds;"
   )
   @Export("mouseRecorder")
   static MouseRecorder mouseRecorder;

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "-723049536"
   )
   @Export("SpriteBuffer_decode")
   public static void SpriteBuffer_decode(byte[] var0) {
      Buffer var1 = new Buffer(var0);
      var1.offset = var0.length - 2;
      class492.SpriteBuffer_spriteCount = var1.readUnsignedShort();
      class492.SpriteBuffer_xOffsets = new int[class492.SpriteBuffer_spriteCount];
      Canvas.SpriteBuffer_yOffsets = new int[class492.SpriteBuffer_spriteCount];
      InterfaceParent.SpriteBuffer_spriteWidths = new int[class492.SpriteBuffer_spriteCount];
      class144.SpriteBuffer_spriteHeights = new int[class492.SpriteBuffer_spriteCount];
      class144.SpriteBuffer_pixels = new byte[class492.SpriteBuffer_spriteCount][];
      var1.offset = var0.length - 7 - class492.SpriteBuffer_spriteCount * 8;
      class492.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
      class492.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
      int var2 = (var1.readUnsignedByte() & 255) + 1;

      int var3;
      for(var3 = 0; var3 < class492.SpriteBuffer_spriteCount; ++var3) {
         class492.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class492.SpriteBuffer_spriteCount; ++var3) {
         Canvas.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class492.SpriteBuffer_spriteCount; ++var3) {
         InterfaceParent.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class492.SpriteBuffer_spriteCount; ++var3) {
         class144.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
      }

      var1.offset = var0.length - 7 - class492.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
      class181.SpriteBuffer_spritePalette = new int[var2];

      for(var3 = 1; var3 < var2; ++var3) {
         class181.SpriteBuffer_spritePalette[var3] = var1.readMedium();
         if (class181.SpriteBuffer_spritePalette[var3] == 0) {
            class181.SpriteBuffer_spritePalette[var3] = 1;
         }
      }

      var1.offset = 0;

      for(var3 = 0; var3 < class492.SpriteBuffer_spriteCount; ++var3) {
         int var4 = InterfaceParent.SpriteBuffer_spriteWidths[var3];
         int var5 = class144.SpriteBuffer_spriteHeights[var3];
         int var6 = var5 * var4;
         byte[] var7 = new byte[var6];
         class144.SpriteBuffer_pixels[var3] = var7;
         int var8 = var1.readUnsignedByte();
         int var9;
         if (var8 == 0) {
            for(var9 = 0; var9 < var6; ++var9) {
               var7[var9] = var1.readByte();
            }
         } else if (var8 == 1) {
            for(var9 = 0; var9 < var4; ++var9) {
               for(int var10 = 0; var10 < var5; ++var10) {
                  var7[var9 + var10 * var4] = var1.readByte();
               }
            }
         }
      }

   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(Lhu;I)Z",
      garbageValue = "1411875198"
   )
   static boolean method4157(ObjectComposition var0) {
      if (var0.transforms != null) {
         int[] var1 = var0.transforms;

         for(int var2 = 0; var2 < var1.length; ++var2) {
            int var3 = var1[var2];
            ObjectComposition var4 = WallDecoration.getObjectDefinition(var3);
            if (var4.mapIconId != -1) {
               return true;
            }
         }
      } else if (var0.mapIconId != -1) {
         return true;
      }

      return false;
   }
}
