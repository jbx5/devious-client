import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public class class140 extends class139 {
   @ObfuscatedName("l")
   @Export("SpriteBuffer_pixels")
   public static byte[][] SpriteBuffer_pixels;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -539019319
   )
   int field1652;
   @ObfuscatedName("w")
   boolean field1651;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   final class142 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lex;)V"
   )
   class140(class142 var1) {
      this.this$0 = var1;
      this.field1652 = -1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lrd;S)V",
      garbageValue = "-5782"
   )
   void vmethod3394(Buffer var1) {
      this.field1652 = var1.readUnsignedShort();
      this.field1651 = var1.readUnsignedByte() == 1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Leb;B)V",
      garbageValue = "-26"
   )
   void vmethod3393(ClanSettings var1) {
      var1.method3237(this.field1652, this.field1651);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1251147466"
   )
   static void method3164() {
      Messages.Messages_channels.clear();
      Messages.Messages_hashTable.clear();
      Messages.Messages_queue.clear();
      Messages.Messages_count = 0;
   }

   @ObfuscatedName("j")
   public static int method3158(long var0) {
      return (int)(var0 >>> 7 & 127L);
   }
}
