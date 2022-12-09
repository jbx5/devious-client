import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class137 extends class136 {
   @ObfuscatedName("fl")
   @ObfuscatedGetter(
      intValue = 1408608023
   )
   @Export("js5Port")
   static int js5Port;
   @ObfuscatedName("qa")
   @ObfuscatedSignature(
      descriptor = "Lqk;"
   )
   @Export("HitSplatDefinition_cachedSprites")
   static class451 HitSplatDefinition_cachedSprites;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1628784665
   )
   int field1655;
   @ObfuscatedName("e")
   boolean field1651;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   final class139 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lem;)V"
   )
   class137(class139 var1) {
      this.this$0 = var1;
      this.field1655 = -1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1101327225"
   )
   void vmethod3349(Buffer var1) {
      this.field1655 = var1.readUnsignedShort();
      this.field1651 = var1.readUnsignedByte() == 1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lep;I)V",
      garbageValue = "839088249"
   )
   void vmethod3350(ClanSettings var1) {
      var1.method3188(this.field1655, this.field1651);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "124"
   )
   @Export("Messages_getHistorySize")
   static int Messages_getHistorySize(int var0) {
      ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
      return var1 == null ? 0 : var1.size();
   }
}
