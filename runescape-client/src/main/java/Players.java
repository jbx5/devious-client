import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Players")
public class Players {
   @ObfuscatedName("va")
   @Export("foundItemIds")
   static short[] foundItemIds;
   @ObfuscatedName("c")
   static byte[] field1323 = new byte[2048];
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "[Lgo;"
   )
   static class202[] field1314 = new class202[2048];
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "[Lqr;"
   )
   static Buffer[] field1315 = new Buffer[2048];
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1172132713
   )
   @Export("Players_count")
   static int Players_count = 0;
   @ObfuscatedName("y")
   @Export("Players_indices")
   static int[] Players_indices = new int[2048];
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1930478845
   )
   @Export("Players_emptyIdxCount")
   static int Players_emptyIdxCount = 0;
   @ObfuscatedName("n")
   @Export("Players_emptyIndices")
   static int[] Players_emptyIndices = new int[2048];
   @ObfuscatedName("r")
   @Export("Players_regions")
   static int[] Players_regions = new int[2048];
   @ObfuscatedName("l")
   @Export("Players_orientations")
   static int[] Players_orientations = new int[2048];
   @ObfuscatedName("s")
   @Export("Players_targetIndices")
   static int[] Players_targetIndices = new int[2048];
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 761611403
   )
   @Export("Players_pendingUpdateCount")
   static int Players_pendingUpdateCount = 0;
   @ObfuscatedName("b")
   @Export("Players_pendingUpdateIndices")
   static int[] Players_pendingUpdateIndices = new int[2048];
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Lqr;"
   )
   static Buffer field1325 = new Buffer(new byte[5000]);

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Llg;B)V",
      garbageValue = "-70"
   )
   public static void method2587(AbstractArchive var0) {
      GrandExchangeOfferTotalQuantityComparator.VarbitDefinition_archive = var0;
   }
}
