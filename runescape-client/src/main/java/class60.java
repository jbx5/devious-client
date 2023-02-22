import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
final class class60 implements ThreadFactory {
   public Thread newThread(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lcz;Lcz;IZIZI)I",
      garbageValue = "1656285972"
   )
   static int method1161(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
      int var6 = UserComparator5.compareWorlds(var0, var1, var2, var3);
      if (var6 != 0) {
         return var3 ? -var6 : var6;
      } else if (var4 == -1) {
         return 0;
      } else {
         int var7 = UserComparator5.compareWorlds(var0, var1, var4, var5);
         return var5 ? -var7 : var7;
      }
   }

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "(ILlt;ZI)V",
      garbageValue = "-1613275271"
   )
   static void method1156(int var0, Coord var1, boolean var2) {
      WorldMapArea var3 = class467.getWorldMap().getMapArea(var0);
      int var4 = BuddyRankComparator.localPlayer.plane;
      int var5 = GameEngine.baseX * 64 + (BuddyRankComparator.localPlayer.x >> 7);
      int var6 = class178.baseY * 64 + (BuddyRankComparator.localPlayer.y >> 7);
      Coord var7 = new Coord(var4, var5, var6);
      class467.getWorldMap().method8155(var3, var7, var1, var2);
   }

   @ObfuscatedName("jh")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2027983398"
   )
   static void method1159() {
      Client.menuOptionsCount = 0;
      Client.isMenuOpen = false;
   }

   @ObfuscatedName("nu")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "424259051"
   )
   static void method1155(int var0) {
      if (var0 != Client.loginState) {
         Client.loginState = var0;
      }
   }
}
