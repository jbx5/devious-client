import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
   @ObfuscatedName("af")
   @Export("reversed")
   final boolean reversed;

   public UserComparator7(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpb;Lpb;B)I",
      garbageValue = "-76"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (var1.world != 0 && var2.world != 0) {
         return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
      } else {
         return this.compareUser(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("af")
   public static final int method2910(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if (var2 != 0.0) {
         double var12;
         if (var4 < 0.5) {
            var12 = var4 * (1.0 + var2);
         } else {
            var12 = var4 + var2 - var2 * var4;
         }

         double var14 = var4 * 2.0 - var12;
         double var16 = 0.3333333333333333 + var0;
         if (var16 > 1.0) {
            --var16;
         }

         double var20 = var0 - 0.3333333333333333;
         if (var20 < 0.0) {
            ++var20;
         }

         if (var16 * 6.0 < 1.0) {
            var6 = 6.0 * (var12 - var14) * var16 + var14;
         } else if (2.0 * var16 < 1.0) {
            var6 = var12;
         } else if (var16 * 3.0 < 2.0) {
            var6 = var14 + (0.6666666666666666 - var16) * (var12 - var14) * 6.0;
         } else {
            var6 = var14;
         }

         if (var0 * 6.0 < 1.0) {
            var8 = var14 + 6.0 * (var12 - var14) * var0;
         } else if (var0 * 2.0 < 1.0) {
            var8 = var12;
         } else if (3.0 * var0 < 2.0) {
            var8 = var14 + 6.0 * (var12 - var14) * (0.6666666666666666 - var0);
         } else {
            var8 = var14;
         }

         if (6.0 * var20 < 1.0) {
            var10 = 6.0 * (var12 - var14) * var20 + var14;
         } else if (2.0 * var20 < 1.0) {
            var10 = var12;
         } else if (var20 * 3.0 < 2.0) {
            var10 = (0.6666666666666666 - var20) * (var12 - var14) * 6.0 + var14;
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(256.0 * var6);
      int var13 = (int)(256.0 * var8);
      int var23 = (int)(256.0 * var10);
      int var15 = var23 + (var13 << 8) + (var22 << 16);
      return var15;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1532029373"
   )
   public static int method2904() {
      return Rasterizer3D.field2514.field2790;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZI)I",
      garbageValue = "-1934960343"
   )
   static int method2911(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ObfuscatedName("ky")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)V",
      garbageValue = "129719618"
   )
   static void method2909(int var0, String var1) {
      int var2 = Players.Players_count;
      int[] var3 = Players.Players_indices;
      boolean var4 = false;
      Username var5 = new Username(var1, class70.loginType);

      for(int var6 = 0; var6 < var2; ++var6) {
         Player var7 = Client.players[var3[var6]];
         if (var7 != null && var7 != MusicPatchNode.localPlayer && var7.username != null && var7.username.equals(var5)) {
            PacketBufferNode var8;
            if (var0 == 1) {
               var8 = class330.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeByteSub(0);
               var8.packetBuffer.writeShort(var3[var6]);
               Client.packetWriter.addNode(var8);
            } else if (var0 == 4) {
               var8 = class330.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeByteNeg(0);
               var8.packetBuffer.writeShortLE(var3[var6]);
               Client.packetWriter.addNode(var8);
            } else if (var0 == 6) {
               var8 = class330.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeShortAdd(var3[var6]);
               var8.packetBuffer.writeByteNeg(0);
               Client.packetWriter.addNode(var8);
            } else if (var0 == 7) {
               var8 = class330.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeShortAddLE(var3[var6]);
               var8.packetBuffer.writeByteAdd(0);
               Client.packetWriter.addNode(var8);
            }

            var4 = true;
            break;
         }
      }

      if (!var4) {
         UserComparator5.addGameMessage(4, "", "Unable to find " + var1);
      }

   }
}
