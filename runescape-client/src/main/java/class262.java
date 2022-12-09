import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
public abstract class class262 implements class264 {
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lnv;"
   )
   @Export("ItemDefinition_fontPlain11")
   static Font ItemDefinition_fontPlain11;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 390677413
   )
   protected int field3022;

   @ObfuscatedSignature(
      descriptor = "(Llw;Lmb;I)V"
   )
   protected class262(StudioGame var1, Language var2, int var3) {
      this.field3022 = var3;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(IIIB)I",
      garbageValue = "67"
   )
   static int method5406(int var0, int var1, int var2) {
      if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) {
         return 0;
      } else {
         return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0;
      }
   }

   @ObfuscatedName("hh")
   @ObfuscatedSignature(
      descriptor = "(Lcj;IIB)V",
      garbageValue = "64"
   )
   @Export("performPlayerAnimation")
   static void performPlayerAnimation(Player var0, int var1, int var2) {
      if (var0.sequence == var1 && var1 != -1) {
         int var3 = AABB.SequenceDefinition_get(var1).field2276;
         if (var3 == 1) {
            var0.sequenceFrame = 0;
            var0.sequenceFrameCycle = 0;
            var0.sequenceDelay = var2;
            var0.field1223 = 0;
         }

         if (var3 == 2) {
            var0.field1223 = 0;
         }
      } else if (var1 == -1 || var0.sequence == -1 || AABB.SequenceDefinition_get(var1).field2300 >= AABB.SequenceDefinition_get(var0.sequence).field2300) {
         var0.sequence = var1;
         var0.sequenceFrame = 0;
         var0.sequenceFrameCycle = 0;
         var0.sequenceDelay = var2;
         var0.field1223 = 0;
         var0.field1252 = var0.pathLength;
      }

   }

   @ObfuscatedName("ja")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1733231225"
   )
   @Export("resumePauseWidget")
   static void resumePauseWidget(int var0, int var1) {
      PacketBufferNode var2 = class136.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
      var2.packetBuffer.writeShortAdd(var1);
      var2.packetBuffer.writeInt(var0);
      Client.packetWriter.addNode(var2);
   }
}
