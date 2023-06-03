import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
@Implements("UserComparator2")
public class UserComparator2 implements Comparator {
   @ObfuscatedName("at")
   @Export("reversed")
   final boolean reversed;

   public UserComparator2(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lqm;Lqm;I)I",
      garbageValue = "-1788407627"
   )
   @Export("compare_bridged")
   int compare_bridged(User var1, User var2) {
      return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((User)var1, (User)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "381252338"
   )
   @Export("SpriteBuffer_decode")
   public static void SpriteBuffer_decode(byte[] var0) {
      Buffer var1 = new Buffer(var0);
      var1.offset = var0.length - 2;
      class515.SpriteBuffer_spriteCount = var1.readUnsignedShort();
      class515.SpriteBuffer_xOffsets = new int[class515.SpriteBuffer_spriteCount];
      class402.SpriteBuffer_yOffsets = new int[class515.SpriteBuffer_spriteCount];
      class515.SpriteBuffer_spriteWidths = new int[class515.SpriteBuffer_spriteCount];
      class515.SpriteBuffer_spriteHeights = new int[class515.SpriteBuffer_spriteCount];
      class515.SpriteBuffer_pixels = new byte[class515.SpriteBuffer_spriteCount][];
      var1.offset = var0.length - 7 - class515.SpriteBuffer_spriteCount * 8;
      class330.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
      class489.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
      int var2 = (var1.readUnsignedByte() & 255) + 1;

      int var3;
      for(var3 = 0; var3 < class515.SpriteBuffer_spriteCount; ++var3) {
         class515.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class515.SpriteBuffer_spriteCount; ++var3) {
         class402.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class515.SpriteBuffer_spriteCount; ++var3) {
         class515.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class515.SpriteBuffer_spriteCount; ++var3) {
         class515.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
      }

      var1.offset = var0.length - 7 - class515.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
      class515.SpriteBuffer_spritePalette = new int[var2];

      for(var3 = 1; var3 < var2; ++var3) {
         class515.SpriteBuffer_spritePalette[var3] = var1.readMedium();
         if (class515.SpriteBuffer_spritePalette[var3] == 0) {
            class515.SpriteBuffer_spritePalette[var3] = 1;
         }
      }

      var1.offset = 0;

      for(var3 = 0; var3 < class515.SpriteBuffer_spriteCount; ++var3) {
         int var4 = class515.SpriteBuffer_spriteWidths[var3];
         int var5 = class515.SpriteBuffer_spriteHeights[var3];
         int var6 = var5 * var4;
         byte[] var7 = new byte[var6];
         class515.SpriteBuffer_pixels[var3] = var7;
         int var8 = var1.readUnsignedByte();
         int var9;
         if (var8 == 0) {
            for(var9 = 0; var9 < var6; ++var9) {
               var7[var9] = var1.readByte();
            }
         } else if (var8 == 1) {
            for(var9 = 0; var9 < var4; ++var9) {
               for(int var10 = 0; var10 < var5; ++var10) {
                  var7[var9 + var4 * var10] = var1.readByte();
               }
            }
         }
      }

   }
}
