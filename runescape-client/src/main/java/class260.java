import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class260 {
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1109598135
   )
   static int field2944;

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
      garbageValue = "-2120938795"
   )
   @Export("RunException_sendStackTrace")
   public static void RunException_sendStackTrace(String var0, Throwable var1) {
      if (var1 != null) {
         var1.printStackTrace();
      } else {
         try {
            String var2 = "";
            if (var1 != null) {
               Throwable var4 = var1;
               String var5;
               if (var1 instanceof RunException) {
                  RunException var6 = (RunException)var1;
                  var5 = var6.message + " | ";
                  var4 = var6.throwable;
               } else {
                  var5 = "";
               }

               StringWriter var18 = new StringWriter();
               PrintWriter var7 = new PrintWriter(var18);
               var4.printStackTrace(var7);
               var7.close();
               String var8 = var18.toString();
               BufferedReader var9 = new BufferedReader(new StringReader(var8));
               String var10 = var9.readLine();

               label59:
               while(true) {
                  while(true) {
                     String var11 = var9.readLine();
                     if (var11 == null) {
                        var5 = var5 + "| " + var10;
                        var2 = var5;
                        break label59;
                     }

                     int var12 = var11.indexOf(40);
                     int var13 = var11.indexOf(41, var12 + 1);
                     if (var12 >= 0 && var13 >= 0) {
                        String var14 = var11.substring(var12 + 1, var13);
                        int var15 = var14.indexOf(".java:");
                        if (var15 >= 0) {
                           var14 = var14.substring(0, var15) + var14.substring(var15 + 5);
                           var5 = var5 + var14 + ' ';
                           continue;
                        }

                        var11 = var11.substring(0, var12);
                     }

                     var11 = var11.trim();
                     var11 = var11.substring(var11.lastIndexOf(32) + 1);
                     var11 = var11.substring(var11.lastIndexOf(9) + 1);
                     var5 = var5 + var11 + ' ';
                  }
               }
            }

            if (var0 != null) {
               if (var1 != null) {
                  var2 = var2 + " | ";
               }

               var2 = var2 + var0;
            }

            System.out.println("Error: " + var2);
            var2 = var2.replace(':', '.');
            var2 = var2.replace('@', '_');
            var2 = var2.replace('&', '_');
            var2 = var2.replace('#', '_');
            if (RunException.RunException_applet == null) {
               return;
            }

            URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + class160.RunException_revision + "&cs=" + class163.field1773 + "&u=" + RunException.field5176 + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + class451.clientType + "&e=" + var2);
            DataInputStream var17 = new DataInputStream(var3.openStream());
            var17.read();
            var17.close();
         } catch (Exception var16) {
         }

      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)[Lll;",
      garbageValue = "1728453073"
   )
   @Export("ServerPacket_values")
   public static ServerPacket[] ServerPacket_values() {
      return new ServerPacket[]{ServerPacket.field3265, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.field3222, ServerPacket.IF_SETCOLOUR, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.field3230, ServerPacket.MESSAGE_GAME, ServerPacket.field3227, ServerPacket.field3228, ServerPacket.field3229, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.field3276, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.field3233, ServerPacket.EVENT_WORLDHOP, ServerPacket.field3235, ServerPacket.field3236, ServerPacket.REFLECTION_CHECKER, ServerPacket.field3238, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.field3241, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.LOGOUT, ServerPacket.MESSAGE_PRIVATE, ServerPacket.VARP_SMALL, ServerPacket.VARP_LARGE, ServerPacket.UPDATE_IGNORELIST, ServerPacket.field3248, ServerPacket.field3254, ServerPacket.field3301, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.IF_SETPOSITION, ServerPacket.UPDATE_STAT, ServerPacket.REBUILD_REGION, ServerPacket.field3309, ServerPacket.field3273, ServerPacket.NPC_SPOTANIM, ServerPacket.field3326, ServerPacket.UPDATE_UID192, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.field3261, ServerPacket.PROJECTILE_SPAWN, ServerPacket.SET_PRIVCHATMODE, ServerPacket.field3264, ServerPacket.field3256, ServerPacket.field3266, ServerPacket.field3297, ServerPacket.field3268, ServerPacket.IF_SETANGLE, ServerPacket.IF_MOVESUB, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.field3239, ServerPacket.field3274, ServerPacket.IF_SETHIDE, ServerPacket.LOGOUT_FULL, ServerPacket.IF_CLOSESUB, ServerPacket.URL_OPEN, ServerPacket.UPDATE_INV_FULL, ServerPacket.field3280, ServerPacket.MINIMAP_TOGGLE, ServerPacket.CAM_RESET, ServerPacket.IF_SETNPCHEAD, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.field3285, ServerPacket.field3306, ServerPacket.field3244, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.field3284, ServerPacket.REBUILD_NORMAL, ServerPacket.field3291, ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.field3293, ServerPacket.field3226, ServerPacket.SET_PLAYER_OP, ServerPacket.field3263, ServerPacket.field3292, ServerPacket.field3298, ServerPacket.field3299, ServerPacket.PLAYER_INFO, ServerPacket.PLAYER_SPOTANIM, ServerPacket.field3302, ServerPacket.CAM_SETANGLE, ServerPacket.field3304, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.field3317, ServerPacket.CAM_LOOKAT, ServerPacket.IF_SETOBJECT, ServerPacket.field3245, ServerPacket.field3310, ServerPacket.field3311, ServerPacket.field3312, ServerPacket.field3313, ServerPacket.field3260, ServerPacket.field3315, ServerPacket.field3316, ServerPacket.IF_SETSCROLLPOS, ServerPacket.field3318, ServerPacket.MIDI_SONG, ServerPacket.field3249, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.field3308, ServerPacket.field3325, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.IF_SETMODEL, ServerPacket.field3328, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.field3330, ServerPacket.field3331, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.HINT_ARROW, ServerPacket.field3335, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.field3337};
   }
}
