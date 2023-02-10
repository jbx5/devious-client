import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
public class class120 {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1970822725
   )
   int field1474;
   @ObfuscatedName("w")
   float field1467;
   @ObfuscatedName("v")
   float field1469 = Float.MAX_VALUE;
   @ObfuscatedName("s")
   float field1470 = Float.MAX_VALUE;
   @ObfuscatedName("z")
   float field1473 = Float.MAX_VALUE;
   @ObfuscatedName("j")
   float field1472 = Float.MAX_VALUE;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Ldp;"
   )
   class120 field1468;

   class120() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lrd;IB)V",
      garbageValue = "119"
   )
   void method2974(Buffer var1, int var2) {
      this.field1474 = var1.readShort();
      this.field1467 = var1.method8764();
      this.field1469 = var1.method8764();
      this.field1470 = var1.method8764();
      this.field1473 = var1.method8764();
      this.field1472 = var1.method8764();
   }

   @ObfuscatedName("fq")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-16"
   )
   static int method2977() {
      if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
         int var0 = 0;

         for(int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
            var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
         }

         return var0 * 10000 / Client.field800;
      } else {
         return 10000;
      }
   }

   @ObfuscatedName("gg")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "421431963"
   )
   static final void method2978() {
      int[] var0 = Players.Players_indices;

      int var1;
      for(var1 = 0; var1 < Players.Players_count; ++var1) {
         Player var4 = Client.players[var0[var1]];
         if (var4 != null && var4.overheadTextCyclesRemaining > 0) {
            --var4.overheadTextCyclesRemaining;
            if (var4.overheadTextCyclesRemaining == 0) {
               var4.overheadText = null;
            }
         }
      }

      for(var1 = 0; var1 < Client.npcCount; ++var1) {
         int var2 = Client.npcIndices[var1];
         NPC var3 = Client.npcs[var2];
         if (var3 != null && var3.overheadTextCyclesRemaining > 0) {
            --var3.overheadTextCyclesRemaining;
            if (var3.overheadTextCyclesRemaining == 0) {
               var3.overheadText = null;
            }
         }
      }

   }
}
