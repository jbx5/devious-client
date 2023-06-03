import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public class class150 extends class158 {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -924193823
   )
   int field1671;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lgh;"
   )
   final class159 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lgh;)V"
   )
   class150(class159 var1) {
      this.this$0 = var1;
      this.field1671 = -1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "-986564571"
   )
   void vmethod3370(Buffer var1) {
      this.field1671 = var1.readUnsignedShort();
      var1.readUnsignedByte();
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         var1.readLong();
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lgv;I)V",
      garbageValue = "1284013379"
   )
   void vmethod3371(ClanChannel var1) {
      var1.removeMember(this.field1671);
   }
}
