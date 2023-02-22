import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
public class class279 {
   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      descriptor = "[Lsp;"
   )
   @Export("worldSelectFlagSprites")
   static IndexedSprite[] worldSelectFlagSprites;

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)Ljava/lang/String;",
      garbageValue = "1523365304"
   )
   public static String method5452(Buffer var0) {
      return GrandExchangeEvents.method6535(var0, 32767);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lne;Ljava/lang/String;Ljava/lang/String;B)[Lsn;",
      garbageValue = "7"
   )
   public static SpritePixels[] method5454(AbstractArchive var0, String var1, String var2) {
      int var3 = var0.getGroupId(var1);
      int var4 = var0.getFileId(var3, var2);
      return class70.method2046(var0, var3, var4);
   }

   @ObfuscatedName("ap")
   @Export("Entity_unpackID")
   public static int Entity_unpackID(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }

   @ObfuscatedName("mr")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "50"
   )
   static final void method5453() {
      Client.field682 = Client.cycleCntr;
      PlayerCompositionColorTextureOverride.field1875 = true;
   }
}
