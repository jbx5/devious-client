import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class155 extends class158 {
   @ObfuscatedName("st")
   static boolean field1722;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -968793973
   )
   int field1718;
   @ObfuscatedName("an")
   byte field1723;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1624354661
   )
   int field1720;
   @ObfuscatedName("as")
   String field1721;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lgh;"
   )
   final class159 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lgh;)V"
   )
   class155(class159 var1) {
      this.this$0 = var1;
      this.field1718 = -1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "-986564571"
   )
   void vmethod3370(Buffer var1) {
      var1.readUnsignedByte();
      this.field1718 = var1.readUnsignedShort();
      this.field1723 = var1.readByte();
      this.field1720 = var1.readUnsignedShort();
      var1.readLong();
      this.field1721 = var1.readStringCp1252NullTerminated();
      var1.readUnsignedByte();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lgv;I)V",
      garbageValue = "1284013379"
   )
   void vmethod3371(ClanChannel var1) {
      ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1718);
      var2.rank = this.field1723;
      var2.world = this.field1720;
      var2.username = new Username(this.field1721);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-768750236"
   )
   public static int method3288(int var0) {
      return class302.field3370[var0];
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "486411013"
   )
   public static void method3287() {
      if (MouseHandler.MouseHandler_instance != null) {
         synchronized(MouseHandler.MouseHandler_instance) {
            MouseHandler.MouseHandler_instance = null;
         }
      }

   }
}
