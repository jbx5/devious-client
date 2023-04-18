import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "[Llg;"
   )
   @Export("PacketBufferNode_packetBufferNodes")
   static PacketBufferNode[] PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 380401923
   )
   @Export("PacketBufferNode_packetBufferNodeCount")
   static int PacketBufferNode_packetBufferNodeCount = 0;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Llv;"
   )
   @Export("clientPacket")
   ClientPacket clientPacket;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1245059367
   )
   @Export("clientPacketLength")
   int clientPacketLength;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lsq;"
   )
   @Export("packetBuffer")
   public PacketBuffer packetBuffer;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1816684323
   )
   @Export("index")
   public int index;

   PacketBufferNode() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2073453785"
   )
   @Export("release")
   public void release() {
      if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
         PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)[Lls;",
      garbageValue = "-1731859764"
   )
   @Export("ServerPacket_values")
   public static ServerPacket[] ServerPacket_values() {
      return new ServerPacket[]{ServerPacket.REBUILD_NORMAL, ServerPacket.field3218, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.LOGOUT_FULL, ServerPacket.SET_PRIVCHATMODE, ServerPacket.PLAYER_SPOTANIM, ServerPacket.field3223, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.MIDI_SONG, ServerPacket.field3226, ServerPacket.SET_PLAYER_OP, ServerPacket.field3253, ServerPacket.UPDATE_UID192, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.UPDATE_STAT, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.IF_CLOSESUB, ServerPacket.VARP_SMALL, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.HINT_ARROW, ServerPacket.MESSAGE_GAME, ServerPacket.field3228, ServerPacket.IF_SETHIDE, ServerPacket.field3240, ServerPacket.PLAYER_INFO, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.field3243, ServerPacket.field3244, ServerPacket.field3245, ServerPacket.field3241, ServerPacket.PROJECTILE_SPAWN, ServerPacket.field3248, ServerPacket.CAM_RESET, ServerPacket.field3250, ServerPacket.field3282, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.field3255, ServerPacket.field3256, ServerPacket.IF_SETMODEL, ServerPacket.field3251, ServerPacket.REBUILD_REGION, ServerPacket.field3224, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.IF_SETANGLE, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.MINIMAP_TOGGLE, ServerPacket.field3261, ServerPacket.IF_SETPOSITION, ServerPacket.IF_MOVESUB, ServerPacket.IF_SETNPCHEAD, ServerPacket.field3325, ServerPacket.field3270, ServerPacket.IF_SETCOLOUR, ServerPacket.field3272, ServerPacket.field3233, ServerPacket.field3274, ServerPacket.field3275, ServerPacket.field3276, ServerPacket.URL_OPEN, ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.field3279, ServerPacket.field3280, ServerPacket.field3281, ServerPacket.EVENT_WORLDHOP, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.field3285, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.field3286, ServerPacket.field3333, ServerPacket.field3288, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.REFLECTION_CHECKER, ServerPacket.UPDATE_IGNORELIST, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.field3258, ServerPacket.field3294, ServerPacket.field3324, ServerPacket.field3296, ServerPacket.IF_SETOBJECT, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.field3332, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.field3329, ServerPacket.VARP_LARGE, ServerPacket.field3303, ServerPacket.field3268, ServerPacket.field3292, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.field3297, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.UPDATE_INV_FULL, ServerPacket.field3311, ServerPacket.field3312, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.IF_SETSCROLLPOS, ServerPacket.field3252, ServerPacket.NPC_SPOTANIM, ServerPacket.field3266, ServerPacket.field3318, ServerPacket.field3319, ServerPacket.CAM_SETANGLE, ServerPacket.field3238, ServerPacket.field3322, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.field3284, ServerPacket.field3326, ServerPacket.field3293, ServerPacket.field3327, ServerPacket.CAM_LOOKAT, ServerPacket.field3269, ServerPacket.field3330, ServerPacket.field3331, ServerPacket.field3308, ServerPacket.field3316, ServerPacket.field3334, ServerPacket.field3335};
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;B)I",
      garbageValue = "27"
   )
   public static int method5709(CharSequence var0) {
      return SecureRandomFuture.method2122(var0, 10, true);
   }
}
