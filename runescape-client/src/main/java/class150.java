import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class150 extends class136 {
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Lra;"
   )
   static IndexedSprite field1756;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1536120659
   )
   int field1755;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   final class139 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lem;)V"
   )
   class150(class139 var1) {
      this.this$0 = var1;
      this.field1755 = -1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1101327225"
   )
   void vmethod3349(Buffer var1) {
      this.field1755 = var1.readUnsignedShort();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lep;I)V",
      garbageValue = "839088249"
   )
   void vmethod3350(ClanSettings var1) {
      var1.method3189(this.field1755);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "48"
   )
   public static boolean method3261(int var0) {
      return var0 == WorldMapDecorationType.field3749.id;
   }
}
