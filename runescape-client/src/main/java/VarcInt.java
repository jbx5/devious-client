import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
@Implements("VarcInt")
public class VarcInt extends DualNode {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("VarcInt_archive")
   public static AbstractArchive VarcInt_archive;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("VarcInt_cached")
   public static EvictingDualNodeHashTable VarcInt_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("c")
   @Export("persist")
   public boolean persist = false;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqr;B)V",
      garbageValue = "-1"
   )
   public void method3459(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.method3463(var1, var2);
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lqr;IB)V",
      garbageValue = "1"
   )
   void method3463(Buffer var1, int var2) {
      if (var2 == 2) {
         this.persist = true;
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(S)[Ljw;",
      garbageValue = "20279"
   )
   @Export("ServerPacket_values")
   public static ServerPacket[] ServerPacket_values() {
      return new ServerPacket[]{ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.field3131, ServerPacket.EVENT_WORLDHOP, ServerPacket.UPDATE_INV_FULL, ServerPacket.field3134, ServerPacket.field3135, ServerPacket.field3136, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.REFLECTION_CHECKER, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.field3140, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.IF_SETMODEL, ServerPacket.field3168, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.REBUILD_NORMAL, ServerPacket.IF_CLOSESUB, ServerPacket.field3227, ServerPacket.field3149, ServerPacket.field3242, ServerPacket.IF_SETCOLOUR, ServerPacket.field3138, ServerPacket.field3150, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.field3155, ServerPacket.PLAYER_INFO, ServerPacket.field3132, ServerPacket.UPDATE_IGNORELIST, ServerPacket.MESSAGE_PRIVATE, ServerPacket.field3174, ServerPacket.VARP_SMALL, ServerPacket.UPDATE_UID192, ServerPacket.URL_OPEN, ServerPacket.IF_SETNPCHEAD, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.field3166, ServerPacket.field3167, ServerPacket.MIDI_SONG, ServerPacket.field3169, ServerPacket.SET_PLAYER_OP, ServerPacket.field3171, ServerPacket.field3172, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.NPC_SPOTANIM, ServerPacket.IF_MOVESUB, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.field3178, ServerPacket.field3199, ServerPacket.PROJECTILE_SPAWN, ServerPacket.field3181, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.field3183, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.IF_SETANGLE, ServerPacket.REBUILD_REGION, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.field3143, ServerPacket.field3189, ServerPacket.IF_SETOBJECT, ServerPacket.field3217, ServerPacket.field3192, ServerPacket.CAM_LOOKAT, ServerPacket.field3177, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.PLAYER_SPOTANIM, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.MINIMAP_TOGGLE, ServerPacket.field3229, ServerPacket.IF_SETHIDE, ServerPacket.NPC_INFO_SMALL_VIEWPORT_2, ServerPacket.field3204, ServerPacket.HINT_ARROW, ServerPacket.VARP_LARGE, ServerPacket.field3207, ServerPacket.field3208, ServerPacket.SET_PRIVCHATMODE, ServerPacket.field3148, ServerPacket.CAM_SETANGLE, ServerPacket.CAM_RESET, ServerPacket.field3213, ServerPacket.field3214, ServerPacket.field3215, ServerPacket.MESSAGE_GAME, ServerPacket.LOGOUT, ServerPacket.field3218, ServerPacket.field3219, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.field3202, ServerPacket.field3222, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.UPDATE_STAT, ServerPacket.field3225, ServerPacket.field3226, ServerPacket.IF_SETPOSITION, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.field3190, ServerPacket.LOGOUT_FULL, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.IF_SETSCROLLPOS, ServerPacket.field3233, ServerPacket.field3234, ServerPacket.NPC_INFO_LARGE_VIEWPORT_1, ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.field3237, ServerPacket.field3238, ServerPacket.field3161, ServerPacket.field3240};
   }
}
