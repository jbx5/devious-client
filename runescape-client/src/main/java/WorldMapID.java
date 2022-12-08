import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("WorldMapID")
public class WorldMapID {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Liv;"
   )
   static final WorldMapID field2984 = new WorldMapID(0);
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Liv;"
   )
   static final WorldMapID field2983 = new WorldMapID(1);
   @ObfuscatedName("lw")
   @ObfuscatedSignature(
      descriptor = "Lkd;"
   )
   @Export("hoveredItemContainer")
   static Widget hoveredItemContainer;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1808192051
   )
   @Export("value")
   final int value;

   WorldMapID(int var1) {
      this.value = var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/String;[IIII)V",
      garbageValue = "-71600503"
   )
   static void method5277(String[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               int var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         method5277(var0, var1, var2, var5 - 1);
         method5277(var0, var1, var5 + 1, var3);
      }

   }

   @ObfuscatedName("nv")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   static void method5276() {
      if (GameEngine.field241 != null) {
         Client.field801 = Client.cycle;
         GameEngine.field241.method6663();

         for(int var0 = 0; var0 < Client.players.length; ++var0) {
            if (Client.players[var0] != null) {
               GameEngine.field241.method6652(class154.baseX * 64 + (Client.players[var0].x >> 7), class365.baseY * 64 + (Client.players[var0].y >> 7));
            }
         }
      }

   }
}
