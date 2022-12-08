import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public class class159 extends class152 {
   @ObfuscatedName("n")
   static int[][][] field1816;
   @ObfuscatedName("h")
   String field1814;
   @ObfuscatedName("e")
   byte field1813;
   @ObfuscatedName("v")
   byte field1815;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Led;"
   )
   final class153 this$0;

   @ObfuscatedSignature(
      descriptor = "(Led;)V"
   )
   class159(class153 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "468341515"
   )
   void vmethod3336(Buffer var1) {
      this.field1814 = var1.readStringCp1252NullTerminatedOrNull();
      if (this.field1814 != null) {
         var1.readUnsignedByte();
         this.field1813 = var1.readByte();
         this.field1815 = var1.readByte();
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lfn;I)V",
      garbageValue = "1227548281"
   )
   void vmethod3337(ClanChannel var1) {
      var1.name = this.field1814;
      if (this.field1814 != null) {
         var1.field1796 = this.field1813;
         var1.field1799 = this.field1815;
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "1927602287"
   )
   public static int method3346(int var0, int var1, int var2) {
      int var3 = Actor.method2362(var2 - var1 + 1);
      var3 <<= var1;
      return var0 & ~var3;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1850938391"
   )
   public static boolean method3345() {
      return class286.musicPlayerStatus != 0 ? true : class251.midiPcmStream.isReady();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;II)V",
      garbageValue = "-141846119"
   )
   static final void method3339(String var0, int var1) {
      PacketBufferNode var2 = class136.getPacketBufferNode(ClientPacket.field3089, Client.packetWriter.isaacCipher);
      var2.packetBuffer.writeByte(class13.stringCp1252NullTerminatedByteSize(var0) + 1);
      var2.packetBuffer.writeByteAdd(var1);
      var2.packetBuffer.writeStringCp1252NullTerminated(var0);
      Client.packetWriter.addNode(var2);
   }
}
