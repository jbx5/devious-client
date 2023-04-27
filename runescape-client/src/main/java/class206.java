import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
public class class206 extends Node {
   @ObfuscatedName("ae")
   @Export("BZip2Decompressor_block")
   static int[] BZip2Decompressor_block;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1583959695
   )
   public int field2348;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1480602069
   )
   public int field2343;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -469277123
   )
   public int field2344;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   public Widget field2345;

   @ObfuscatedSignature(
      descriptor = "(IIILmq;)V"
   )
   public class206(int var1, int var2, int var3, Widget var4) {
      this.field2344 = var1;
      this.field2348 = var2;
      this.field2343 = var3;
      this.field2345 = var4;
   }

   @ObfuscatedName("ov")
   @ObfuscatedSignature(
      descriptor = "(II)Lsk;",
      garbageValue = "1127097285"
   )
   static class482 method4205(int var0) {
      class482 var1 = (class482)Client.DBTableIndex_cache.get((long)var0);
      if (var1 == null) {
         var1 = new class482(PcmPlayer.field316, class373.method7203(var0), BufferedSink.method8064(var0));
         Client.DBTableIndex_cache.put(var1, (long)var0);
      }

      return var1;
   }
}
