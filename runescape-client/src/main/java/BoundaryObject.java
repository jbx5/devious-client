import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("BoundaryObject")
public final class BoundaryObject {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -476261499
   )
   @Export("z")
   int z;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1217976121
   )
   @Export("x")
   int x;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 220339665
   )
   @Export("y")
   int y;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -244010561
   )
   @Export("orientationA")
   int orientationA;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1655274619
   )
   @Export("orientationB")
   int orientationB;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Liq;"
   )
   @Export("renderable1")
   public Renderable renderable1;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Liq;"
   )
   @Export("renderable2")
   public Renderable renderable2;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      longValue = 1373015219928650129L
   )
   @Export("tag")
   public long tag = 0L;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1167353109
   )
   @Export("flags")
   int flags = 0;

   BoundaryObject() {
   }

   @ObfuscatedName("ix")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1252454973"
   )
   static final void method4754(boolean var0) {
      EnumComposition.playPcmPlayers();
      ++Client.packetWriter.pendingWrites;
      if (Client.packetWriter.pendingWrites >= 50 || var0) {
         Client.packetWriter.pendingWrites = 0;
         if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
            PacketBufferNode var1 = UserComparator9.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
            Client.packetWriter.addNode(var1);

            try {
               Client.packetWriter.flush();
            } catch (IOException var3) {
               Client.hadNetworkError = true;
            }
         }

      }
   }
}
