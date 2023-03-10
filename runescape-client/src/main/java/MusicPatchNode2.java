import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
   @ObfuscatedName("aj")
   byte[] field3319;
   @ObfuscatedName("al")
   byte[] field3314;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1679456389
   )
   int field3315;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1615838477
   )
   int field3316;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1904454123
   )
   int field3321;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 165480893
   )
   int field3318;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 920429853
   )
   int field3320;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -446800421
   )
   int field3313;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1265521917
   )
   int field3317;

   MusicPatchNode2() {
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-43135671"
   )
   @Export("changeWorldSelectSorting")
   static void changeWorldSelectSorting(int var0, int var1) {
      int[] var2 = new int[4];
      int[] var3 = new int[4];
      var2[0] = var0;
      var3[0] = var1;
      int var4 = 1;

      for(int var5 = 0; var5 < 4; ++var5) {
         if (World.World_sortOption1[var5] != var0) {
            var2[var4] = World.World_sortOption1[var5];
            var3[var4] = World.World_sortOption2[var5];
            ++var4;
         }
      }

      World.World_sortOption1 = var2;
      World.World_sortOption2 = var3;
      class16.sortWorlds(class260.World_worlds, 0, class260.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
   }
}
