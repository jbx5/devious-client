import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 322459375
   )
   public int field4556 = (int)(class153.method3317() / 1000L);
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lsi;"
   )
   @Export("username")
   public Username username;
   @ObfuscatedName("v")
   @Export("world")
   public short world;

   @ObfuscatedSignature(
      descriptor = "(Lsi;I)V"
   )
   FriendLoginUpdate(Username var1, int var2) {
      this.username = var1;
      this.world = (short)var2;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1614306334"
   )
   static String method7586() {
      String var0;
      if (PacketWriter.clientPreferences.method2484()) {
         String var2 = Login.Login_username;
         String var1 = KeyHandler.method366('*', var2.length());
         var0 = var1;
      } else {
         var0 = Login.Login_username;
      }

      return var0;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "-1201846591"
   )
   @Export("SpriteBuffer_decode")
   static void SpriteBuffer_decode(byte[] var0) {
      Buffer var1 = new Buffer(var0);
      var1.offset = var0.length - 2;
      class488.SpriteBuffer_spriteCount = var1.readUnsignedShort();
      class488.SpriteBuffer_xOffsets = new int[class488.SpriteBuffer_spriteCount];
      ApproximateRouteStrategy.SpriteBuffer_yOffsets = new int[class488.SpriteBuffer_spriteCount];
      FriendsList.SpriteBuffer_spriteWidths = new int[class488.SpriteBuffer_spriteCount];
      class132.SpriteBuffer_spriteHeights = new int[class488.SpriteBuffer_spriteCount];
      class140.SpriteBuffer_pixels = new byte[class488.SpriteBuffer_spriteCount][];
      var1.offset = var0.length - 7 - class488.SpriteBuffer_spriteCount * 8;
      class488.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
      class488.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
      int var2 = (var1.readUnsignedByte() & 255) + 1;

      int var3;
      for(var3 = 0; var3 < class488.SpriteBuffer_spriteCount; ++var3) {
         class488.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class488.SpriteBuffer_spriteCount; ++var3) {
         ApproximateRouteStrategy.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class488.SpriteBuffer_spriteCount; ++var3) {
         FriendsList.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class488.SpriteBuffer_spriteCount; ++var3) {
         class132.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
      }

      var1.offset = var0.length - 7 - class488.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
      class100.SpriteBuffer_spritePalette = new int[var2];

      for(var3 = 1; var3 < var2; ++var3) {
         class100.SpriteBuffer_spritePalette[var3] = var1.readMedium();
         if (class100.SpriteBuffer_spritePalette[var3] == 0) {
            class100.SpriteBuffer_spritePalette[var3] = 1;
         }
      }

      var1.offset = 0;

      for(var3 = 0; var3 < class488.SpriteBuffer_spriteCount; ++var3) {
         int var4 = FriendsList.SpriteBuffer_spriteWidths[var3];
         int var5 = class132.SpriteBuffer_spriteHeights[var3];
         int var6 = var4 * var5;
         byte[] var7 = new byte[var6];
         class140.SpriteBuffer_pixels[var3] = var7;
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
}
