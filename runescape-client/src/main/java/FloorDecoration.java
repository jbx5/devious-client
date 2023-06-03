import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("FloorDecoration")
public final class FloorDecoration {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 2134679337
   )
   @Export("z")
   int z;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1961961451
   )
   @Export("x")
   int x;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 842433563
   )
   @Export("y")
   int y;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lim;"
   )
   @Export("renderable")
   public Renderable renderable;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      longValue = 5480525870071507937L
   )
   @Export("tag")
   public long tag;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 603864985
   )
   @Export("flags")
   int flags;

   FloorDecoration() {
   }

   @ObfuscatedName("at")
   public static final void method4357(long var0) {
      if (var0 > 0L) {
         if (0L == var0 % 10L) {
            Skeleton.method4505(var0 - 1L);
            Skeleton.method4505(1L);
         } else {
            Skeleton.method4505(var0);
         }

      }
   }

   @ObfuscatedName("kh")
   @ObfuscatedSignature(
      descriptor = "(IIS)V",
      garbageValue = "3841"
   )
   @Export("resumePauseWidget")
   static void resumePauseWidget(int var0, int var1) {
      PacketBufferNode var2 = ObjectComposition.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
      var2.packetBuffer.writeInt(var0);
      var2.packetBuffer.writeShortAdd(var1);
      Client.packetWriter.addNode(var2);
   }
}
