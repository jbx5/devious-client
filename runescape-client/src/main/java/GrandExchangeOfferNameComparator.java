import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "[Lgk;"
   )
   @Export("WorldMapElement_cached")
   static WorldMapElement[] WorldMapElement_cached;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lmv;Lmv;I)I",
      garbageValue = "1470653167"
   )
   @Export("compare_bridged")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.getOfferName().compareTo(var2.getOfferName());
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "2091853460"
   )
   static void method6672(boolean var0) {
      byte var1 = 0;
      if (!ClanSettings.method3293()) {
         var1 = 12;
      } else if (Decimator.client.method1723() || Decimator.client.method1218() || Decimator.client.method1217()) {
         var1 = 10;
      }

      ReflectionCheck.method696(var1);
      if (var0) {
         Login.Login_username = "";
         Login.Login_password = "";
         UserComparator4.field1429 = 0;
         InvDefinition.otp = "";
      }

      FriendSystem.method1908();
      class361.method6967();
   }

   @ObfuscatedName("ho")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "984160518"
   )
   @Export("getTileHeight")
   static final int getTileHeight(int var0, int var1, int var2) {
      int var3 = var0 >> 7;
      int var4 = var1 >> 7;
      if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
         int var5 = var2;
         if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
            var5 = var2 + 1;
         }

         int var6 = var0 & 127;
         int var7 = var1 & 127;
         int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4] >> 7;
         int var9 = Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) + Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] * var6 >> 7;
         return var9 * var7 + var8 * (128 - var7) >> 7;
      } else {
         return 0;
      }
   }
}
