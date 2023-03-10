import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class152 extends class156 {
   @ObfuscatedName("aj")
   String field1719;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1378456505
   )
   int field1715;
   @ObfuscatedName("ac")
   byte field1717;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lgk;"
   )
   final class157 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lgk;)V"
   )
   class152(class157 var1) {
      this.this$0 = var1;
      this.field1719 = null;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "2070491057"
   )
   void vmethod3353(Buffer var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         var1.readLong();
      }

      this.field1719 = var1.readStringCp1252NullTerminatedOrNull();
      this.field1715 = var1.readUnsignedShort();
      this.field1717 = var1.readByte();
      var1.readLong();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lgn;B)V",
      garbageValue = "-82"
   )
   void vmethod3354(ClanChannel var1) {
      ClanChannelMember var2 = new ClanChannelMember();
      var2.username = new Username(this.field1719);
      var2.world = this.field1715;
      var2.rank = this.field1717;
      var1.addMember(var2);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(II)Lfa;",
      garbageValue = "-2137783984"
   )
   static class135 method3268(int var0) {
      class135[] var1 = new class135[]{class135.field1588, class135.field1579, class135.field1580, class135.field1581, class135.field1589, class135.field1583, class135.field1584, class135.field1585, class135.field1586};
      class135 var2 = (class135)SpriteMask.findEnumerated(var1, var0);
      if (var2 == null) {
         var2 = class135.field1586;
      }

      return var2;
   }
}
