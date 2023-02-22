import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class130 implements class121 {
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IILip;Liz;B)Z",
      garbageValue = "-117"
   )
   static final boolean method3028(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
      int var4 = var0;
      int var5 = var1;
      int var6 = 64;
      int var7 = 64;
      int var8 = var0 - var6;
      int var9 = var1 - var7;
      class212.directions[var6][var7] = 99;
      class212.distances[var6][var7] = 0;
      int var10 = 0;
      int var11 = 0;
      class212.bufferX[var10] = var0;
      class212.bufferY[var10++] = var1;
      int[][] var12 = var3.flags;

      while(var10 != var11) {
         var4 = class212.bufferX[var11];
         var5 = class212.bufferY[var11];
         var11 = var11 + 1 & 4095;
         var6 = var4 - var8;
         var7 = var5 - var9;
         int var13 = var4 - var3.xInset;
         int var14 = var5 - var3.yInset;
         if (var2.hasArrived(2, var4, var5, var3)) {
            class212.field2344 = var4;
            class83.field1035 = var5;
            return true;
         }

         int var15 = class212.distances[var6][var7] + 1;
         if (var6 > 0 && class212.directions[var6 - 1][var7] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) {
            class212.bufferX[var10] = var4 - 1;
            class212.bufferY[var10] = var5;
            var10 = var10 + 1 & 4095;
            class212.directions[var6 - 1][var7] = 2;
            class212.distances[var6 - 1][var7] = var15;
         }

         if (var6 < 126 && class212.directions[var6 + 1][var7] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) {
            class212.bufferX[var10] = var4 + 1;
            class212.bufferY[var10] = var5;
            var10 = var10 + 1 & 4095;
            class212.directions[var6 + 1][var7] = 8;
            class212.distances[var6 + 1][var7] = var15;
         }

         if (var7 > 0 && class212.directions[var6][var7 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) {
            class212.bufferX[var10] = var4;
            class212.bufferY[var10] = var5 - 1;
            var10 = var10 + 1 & 4095;
            class212.directions[var6][var7 - 1] = 1;
            class212.distances[var6][var7 - 1] = var15;
         }

         if (var7 < 126 && class212.directions[var6][var7 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) {
            class212.bufferX[var10] = var4;
            class212.bufferY[var10] = var5 + 1;
            var10 = var10 + 1 & 4095;
            class212.directions[var6][var7 + 1] = 4;
            class212.distances[var6][var7 + 1] = var15;
         }

         if (var6 > 0 && var7 > 0 && class212.directions[var6 - 1][var7 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) {
            class212.bufferX[var10] = var4 - 1;
            class212.bufferY[var10] = var5 - 1;
            var10 = var10 + 1 & 4095;
            class212.directions[var6 - 1][var7 - 1] = 3;
            class212.distances[var6 - 1][var7 - 1] = var15;
         }

         if (var6 < 126 && var7 > 0 && class212.directions[var6 + 1][var7 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) {
            class212.bufferX[var10] = var4 + 1;
            class212.bufferY[var10] = var5 - 1;
            var10 = var10 + 1 & 4095;
            class212.directions[var6 + 1][var7 - 1] = 9;
            class212.distances[var6 + 1][var7 - 1] = var15;
         }

         if (var6 > 0 && var7 < 126 && class212.directions[var6 - 1][var7 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) {
            class212.bufferX[var10] = var4 - 1;
            class212.bufferY[var10] = var5 + 1;
            var10 = var10 + 1 & 4095;
            class212.directions[var6 - 1][var7 + 1] = 6;
            class212.distances[var6 - 1][var7 + 1] = var15;
         }

         if (var6 < 126 && var7 < 126 && class212.directions[var6 + 1][var7 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) {
            class212.bufferX[var10] = var4 + 1;
            class212.bufferY[var10] = var5 + 1;
            var10 = var10 + 1 & 4095;
            class212.directions[var6 + 1][var7 + 1] = 12;
            class212.distances[var6 + 1][var7 + 1] = var15;
         }
      }

      class212.field2344 = var4;
      class83.field1035 = var5;
      return false;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-900441843"
   )
   @Export("ItemContainer_getCount")
   static int ItemContainer_getCount(int var0, int var1) {
      ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var2 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)[Lsp;",
      garbageValue = "1901804570"
   )
   static IndexedSprite[] method3031() {
      IndexedSprite[] var0 = new IndexedSprite[class492.SpriteBuffer_spriteCount];

      for(int var1 = 0; var1 < class492.SpriteBuffer_spriteCount; ++var1) {
         IndexedSprite var2 = var0[var1] = new IndexedSprite();
         var2.width = class492.SpriteBuffer_spriteWidth;
         var2.height = class492.SpriteBuffer_spriteHeight;
         var2.xOffset = class492.SpriteBuffer_xOffsets[var1];
         var2.yOffset = Canvas.SpriteBuffer_yOffsets[var1];
         var2.subWidth = InterfaceParent.SpriteBuffer_spriteWidths[var1];
         var2.subHeight = class144.SpriteBuffer_spriteHeights[var1];
         var2.palette = class181.SpriteBuffer_spritePalette;
         var2.pixels = class144.SpriteBuffer_pixels[var1];
      }

      FriendsList.method7473();
      return var0;
   }

   @ObfuscatedName("gv")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1363946201"
   )
   static final void method3030(boolean var0) {
      if (var0) {
         Client.field518 = Login.field914 ? class136.field1594 : class136.field1596;
      } else {
         Client.field518 = WorldMapSectionType.clientPreferences.method2452(Login.Login_username) ? class136.field1593 : class136.field1595;
      }

   }

   @ObfuscatedName("kn")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-801479046"
   )
   @Export("resumePauseWidget")
   static void resumePauseWidget(int var0, int var1) {
      PacketBufferNode var2 = UserComparator9.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
      var2.packetBuffer.writeShort(var1);
      var2.packetBuffer.writeIntME(var0);
      Client.packetWriter.addNode(var2);
   }
}
