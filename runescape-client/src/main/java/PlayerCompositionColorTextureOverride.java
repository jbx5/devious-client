import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
@Implements("PlayerCompositionColorTextureOverride")
public class PlayerCompositionColorTextureOverride {
   @ObfuscatedName("v")
   @Export("playerCompositionRecolorTo")
   public short[] playerCompositionRecolorTo;
   @ObfuscatedName("s")
   @Export("playerCompositionRetextureTo")
   public short[] playerCompositionRetextureTo;

   PlayerCompositionColorTextureOverride(int var1) {
      ItemComposition var2 = TileItem.ItemDefinition_get(var1);
      if (var2.method4007()) {
         this.playerCompositionRecolorTo = new short[var2.recolorTo.length];
         System.arraycopy(var2.recolorTo, 0, this.playerCompositionRecolorTo, 0, this.playerCompositionRecolorTo.length);
      }

      if (var2.method4008()) {
         this.playerCompositionRetextureTo = new short[var2.retextureTo.length];
         System.arraycopy(var2.retextureTo, 0, this.playerCompositionRetextureTo, 0, this.playerCompositionRetextureTo.length);
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)[Ljg;",
      garbageValue = "1293582698"
   )
   @Export("ServerPacket_values")
   public static ServerPacket[] ServerPacket_values() {
      return new ServerPacket[]{ServerPacket.REBUILD_NORMAL, ServerPacket.field3193, ServerPacket.PLAYER_INFO, ServerPacket.field3195, ServerPacket.CAM_LOOKAT, ServerPacket.field3197, ServerPacket.CAM_SETANGLE, ServerPacket.NPC_INFO_SMALL_VIEWPORT_2, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.NPC_INFO_LARGE_VIEWPORT_1, ServerPacket.field3202, ServerPacket.CAM_RESET, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.MESSAGE_GAME, ServerPacket.field3273, ServerPacket.REFLECTION_CHECKER, ServerPacket.field3208, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.field3259, ServerPacket.field3213, ServerPacket.SET_PRIVCHATMODE, ServerPacket.field3215, ServerPacket.field3206, ServerPacket.MESSAGE_PRIVATE, ServerPacket.VARP_SMALL, ServerPacket.field3219, ServerPacket.field3220, ServerPacket.field3221, ServerPacket.REBUILD_REGION, ServerPacket.field3223, ServerPacket.field3224, ServerPacket.URL_OPEN, ServerPacket.LOGOUT, ServerPacket.field3198, ServerPacket.field3200, ServerPacket.UPDATE_STAT, ServerPacket.field3230, ServerPacket.MIDI_SONG, ServerPacket.IF_SETPOSITION, ServerPacket.field3233, ServerPacket.PROJECTILE_SPAWN, ServerPacket.field3235, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.field3306, ServerPacket.field3238, ServerPacket.IF_SETOBJECT, ServerPacket.field3240, ServerPacket.field3248, ServerPacket.field3242, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.field3244, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.field3247, ServerPacket.SET_PLAYER_OP, ServerPacket.LOGOUT_FULL, ServerPacket.IF_SETCOLOUR, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.field3212, ServerPacket.NPC_SPOTANIM, ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.IF_CLOSESUB, ServerPacket.MINIMAP_TOGGLE, ServerPacket.IF_SETANGLE, ServerPacket.IF_SETMODEL, ServerPacket.EVENT_WORLDHOP, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.UPDATE_INV_FULL, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.field3264, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.UPDATE_UID192, ServerPacket.field3252, ServerPacket.field3251, ServerPacket.field3269, ServerPacket.HINT_ARROW, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.field3272, ServerPacket.field3266, ServerPacket.field3291, ServerPacket.field3275, ServerPacket.field3232, ServerPacket.field3277, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.field3225, ServerPacket.field3280, ServerPacket.field3263, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.field3285, ServerPacket.PLAYER_SPOTANIM, ServerPacket.field3241, ServerPacket.UPDATE_IGNORELIST, ServerPacket.VARP_LARGE, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.field3293, ServerPacket.IF_SETSCROLLPOS, ServerPacket.field3228, ServerPacket.IF_SETHIDE, ServerPacket.field3295, ServerPacket.IF_SETNPCHEAD, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.field3298, ServerPacket.field3299, ServerPacket.field3300, ServerPacket.field3301, ServerPacket.IF_MOVESUB, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.field3304};
   }

   @ObfuscatedName("ih")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIIIIB)V",
      garbageValue = "63"
   )
   static final void method3571(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      PendingSpawn var10 = null;

      for(PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) {
         if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) {
            var10 = var11;
            break;
         }
      }

      if (var10 == null) {
         var10 = new PendingSpawn();
         var10.plane = var0;
         var10.type = var3;
         var10.x = var1;
         var10.y = var2;
         class204.method4131(var10);
         Client.pendingSpawns.addFirst(var10);
      }

      var10.field1150 = var4;
      var10.field1152 = var5;
      var10.field1151 = var6;
      var10.delay = var8;
      var10.hitpoints = var9;
      var10.method2414(var7);
   }
}
