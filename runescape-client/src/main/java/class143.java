import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public class class143 extends class151 {
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lry;"
   )
   @Export("titlebuttonSprite")
   static IndexedSprite titlebuttonSprite;
   @ObfuscatedName("ee")
   @ObfuscatedSignature(
      descriptor = "Llx;"
   )
   @Export("archive13")
   static Archive archive13;
   @ObfuscatedName("im")
   @Export("regionMapArchiveIds")
   static int[] regionMapArchiveIds;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 632047953
   )
   int field1649;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   final class152 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lem;)V"
   )
   class143(class152 var1) {
      this.this$0 = var1;
      this.field1649 = -1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;B)V",
      garbageValue = "85"
   )
   void vmethod3238(Buffer var1) {
      this.field1649 = var1.readUnsignedShort();
      var1.readUnsignedByte();
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         var1.readLong();
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Leq;I)V",
      garbageValue = "-1303116736"
   )
   void vmethod3239(ClanChannel var1) {
      var1.removeMember(this.field1649);
   }

   @ObfuscatedName("kq")
   @ObfuscatedSignature(
      descriptor = "(Lkn;B)V",
      garbageValue = "104"
   )
   @Export("invalidateWidget")
   public static void invalidateWidget(Widget var0) {
      if (var0 != null && var0.cycle == Client.field739) {
         Client.field717[var0.rootIndex] = true;
      }

   }

   @ObfuscatedName("mh")
   @ObfuscatedSignature(
      descriptor = "(IIIZB)V",
      garbageValue = "26"
   )
   public static void method3054(int var0, int var1, int var2, boolean var3) {
      PacketBufferNode var4 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field2997, Client.packetWriter.isaacCipher);
      var4.packetBuffer.writeByteSub(var2);
      var4.packetBuffer.writeIntME(var3 ? Client.field586 : 0);
      var4.packetBuffer.writeShortAddLE(var0);
      var4.packetBuffer.writeShortLE(var1);
      Client.packetWriter.addNode(var4);
   }
}
