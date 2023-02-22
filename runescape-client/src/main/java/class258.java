import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
public class class258 {
   @ObfuscatedName("vf")
   static List field2982;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Ljj;"
   )
   static final class258 field2980 = new class258(0);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Ljj;"
   )
   static final class258 field2986 = new class258(1);
   @ObfuscatedName("fb")
   @ObfuscatedSignature(
      descriptor = "Lmx;"
   )
   @Export("archive2")
   static Archive archive2;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1445258151
   )
   @Export("value")
   final int value;

   class258(int var1) {
      this.value = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)[Lke;",
      garbageValue = "-1296187217"
   )
   @Export("ServerPacket_values")
   public static ServerPacket[] ServerPacket_values() {
      return new ServerPacket[]{ServerPacket.REBUILD_NORMAL, ServerPacket.REBUILD_REGION, ServerPacket.field3180, ServerPacket.field3274, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.field3179, ServerPacket.REFLECTION_CHECKER, ServerPacket.field3181, ServerPacket.IF_SETCOLOUR, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.field3185, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.PLAYER_SPOTANIM, ServerPacket.field3188, ServerPacket.field3189, ServerPacket.NPC_SPOTANIM, ServerPacket.MESSAGE_GAME, ServerPacket.field3249, ServerPacket.IF_SETMODEL, ServerPacket.field3194, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.field3196, ServerPacket.UPDATE_IGNORELIST, ServerPacket.field3255, ServerPacket.field3199, ServerPacket.MINIMAP_TOGGLE, ServerPacket.field3201, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.field3203, ServerPacket.LOGOUT_FULL, ServerPacket.field3208, ServerPacket.LOGOUT, ServerPacket.UPDATE_INV_FULL, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.field3246, ServerPacket.PLAYER_INFO, ServerPacket.field3211, ServerPacket.field3205, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.field3214, ServerPacket.field3215, ServerPacket.field3216, ServerPacket.field3217, ServerPacket.field3218, ServerPacket.MESSAGE_PRIVATE, ServerPacket.field3275, ServerPacket.field3221, ServerPacket.IF_SETSCROLLPOS, ServerPacket.field3223, ServerPacket.field3224, ServerPacket.field3225, ServerPacket.UPDATE_UID192, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.SET_PLAYER_OP, ServerPacket.IF_MOVESUB, ServerPacket.field3230, ServerPacket.IF_SETNPCHEAD, ServerPacket.field3232, ServerPacket.SET_PRIVCHATMODE, ServerPacket.field3239, ServerPacket.field3206, ServerPacket.field3177, ServerPacket.field3237, ServerPacket.IF_CLOSESUB, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.CAM_SETANGLE, ServerPacket.VARP_SMALL, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.URL_OPEN, ServerPacket.PROJECTILE_SPAWN, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.IF_SETANGLE, ServerPacket.field3174, ServerPacket.CAM_LOOKAT, ServerPacket.EVENT_WORLDHOP, ServerPacket.UPDATE_STAT, ServerPacket.CAM_RESET, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.MIDI_SONG, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.field3187, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.field3260, ServerPacket.field3261, ServerPacket.field3262, ServerPacket.field3277, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.HINT_ARROW, ServerPacket.IF_SETPOSITION, ServerPacket.field3267, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.VARP_LARGE, ServerPacket.field3270, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.field3272, ServerPacket.field3233, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.field3227, ServerPacket.field3192, ServerPacket.field3278, ServerPacket.IF_SETOBJECT, ServerPacket.IF_SETHIDE, ServerPacket.field3281};
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-36"
   )
   public static void method5232() {
      class293.midiPcmStream.clear();
      class293.musicPlayerStatus = 1;
      class364.musicTrackArchive = null;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "-28"
   )
   public static boolean method5230(int var0) {
      return var0 >= WorldMapDecorationType.field3709.id && var0 <= WorldMapDecorationType.field3724.id;
   }
}
