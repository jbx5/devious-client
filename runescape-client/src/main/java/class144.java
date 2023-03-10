import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class144 extends class140 {
   @ObfuscatedName("av")
   @Export("SpriteBuffer_spriteHeights")
   public static int[] SpriteBuffer_spriteHeights;
   @ObfuscatedName("ap")
   @Export("SpriteBuffer_pixels")
   public static byte[][] SpriteBuffer_pixels;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -995598847
   )
   int field1639;
   @ObfuscatedName("al")
   byte field1640;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfo;"
   )
   final class143 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfo;)V"
   )
   class144(class143 var1) {
      this.this$0 = var1;
      this.field1639 = -1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "-1979280996"
   )
   void vmethod3361(Buffer var1) {
      this.field1639 = var1.readUnsignedShort();
      this.field1640 = var1.readByte();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lfi;B)V",
      garbageValue = "29"
   )
   void vmethod3362(ClanSettings var1) {
      var1.method3201(this.field1639, this.field1640);
   }

   @ObfuscatedName("ii")
   @ObfuscatedSignature(
      descriptor = "(B)Lnj;",
      garbageValue = "82"
   )
   public static NodeDeque method3139() {
      return Client.scriptEvents;
   }
}
