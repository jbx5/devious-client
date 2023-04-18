import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements MouseWheel {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lhd;"
   )
   field1990(0, 0),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lhd;"
   )
   @Export("HorizontalAlignment_centered")
   HorizontalAlignment_centered(2, 1),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lhd;"
   )
   field1992(1, 2);

   @ObfuscatedName("az")
   @Export("userHomeDirectory")
   public static String userHomeDirectory;
   @ObfuscatedName("tt")
   @ObfuscatedSignature(
      descriptor = "Lbu;"
   )
   @Export("pcmPlayer1")
   static PcmPlayer pcmPlayer1;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1932346871
   )
   @Export("value")
   public final int value;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 455418089
   )
   @Export("id")
   final int id;

   HorizontalAlignment(int var3, int var4) {
      this.value = var3;
      this.id = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "741942848"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(ZZB)I",
      garbageValue = "-35"
   )
   public static int method3762(boolean var0, boolean var1) {
      int var2 = 0;
      var2 = var2 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount;
      return var2;
   }
}
