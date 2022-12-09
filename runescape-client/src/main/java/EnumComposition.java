import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("EnumDefinition_cached")
   static EvictingDualNodeHashTable EnumDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("fe")
   static String field2006;
   @ObfuscatedName("v")
   @Export("inputType")
   public char inputType;
   @ObfuscatedName("x")
   @Export("outputType")
   public char outputType;
   @ObfuscatedName("m")
   @Export("defaultStr")
   public String defaultStr = "null";
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1478484323
   )
   @Export("defaultInt")
   public int defaultInt;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1015031679
   )
   @Export("outputCount")
   public int outputCount = 0;
   @ObfuscatedName("r")
   @Export("keys")
   public int[] keys;
   @ObfuscatedName("u")
   @Export("intVals")
   public int[] intVals;
   @ObfuscatedName("b")
   @Export("strVals")
   public String[] strVals;

   EnumComposition() {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "-2074495591"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lqy;IS)V",
      garbageValue = "8918"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.inputType = (char)var1.readUnsignedByte();
      } else if (var2 == 2) {
         this.outputType = (char)var1.readUnsignedByte();
      } else if (var2 == 3) {
         this.defaultStr = var1.readStringCp1252NullTerminated();
      } else if (var2 == 4) {
         this.defaultInt = var1.readInt();
      } else {
         int var3;
         if (var2 == 5) {
            this.outputCount = var1.readUnsignedShort();
            this.keys = new int[this.outputCount];
            this.strVals = new String[this.outputCount];

            for(var3 = 0; var3 < this.outputCount; ++var3) {
               this.keys[var3] = var1.readInt();
               this.strVals[var3] = var1.readStringCp1252NullTerminated();
            }
         } else if (var2 == 6) {
            this.outputCount = var1.readUnsignedShort();
            this.keys = new int[this.outputCount];
            this.intVals = new int[this.outputCount];

            for(var3 = 0; var3 < this.outputCount; ++var3) {
               this.keys[var3] = var1.readInt();
               this.intVals[var3] = var1.readInt();
            }
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-585138184"
   )
   @Export("size")
   public int size() {
      return this.outputCount;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)[Ljf;",
      garbageValue = "-1969198767"
   )
   @Export("ServerPacket_values")
   public static ServerPacket[] ServerPacket_values() {
      return new ServerPacket[]{ServerPacket.RUNCLIENTSCRIPT, ServerPacket.IF_MOVESUB, ServerPacket.URL_OPEN, ServerPacket.field3186, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.VARP_LARGE, ServerPacket.MESSAGE_GAME, ServerPacket.EVENT_WORLDHOP, ServerPacket.IF_SETHIDE, ServerPacket.field3208, ServerPacket.field3193, ServerPacket.field3194, ServerPacket.MIDI_SONG, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.IF_SETANGLE, ServerPacket.IF_CLOSESUB, ServerPacket.field3199, ServerPacket.PROJECTILE_SPAWN, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.PLAYER_SPOTANIM, ServerPacket.CAM_SETANGLE, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.field3206, ServerPacket.CAM_LOOKAT, ServerPacket.field3183, ServerPacket.UPDATE_IGNORELIST, ServerPacket.UPDATE_UID192, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.field3205, ServerPacket.field3214, ServerPacket.NPC_SPOTANIM, ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.VARP_SMALL, ServerPacket.IF_SETPOSITION, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.field3213, ServerPacket.field3221, ServerPacket.field3222, ServerPacket.field3223, ServerPacket.field3224, ServerPacket.field3251, ServerPacket.field3226, ServerPacket.field3227, ServerPacket.field3184, ServerPacket.field3229, ServerPacket.field3242, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.field3232, ServerPacket.field3192, ServerPacket.NPC_INFO_SMALL_VIEWPORT_2, ServerPacket.field3235, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.CAM_RESET, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.field3241, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.IF_SETCOLOUR, ServerPacket.REFLECTION_CHECKER, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.field3247, ServerPacket.field3266, ServerPacket.field3285, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.field3249, ServerPacket.UPDATE_INV_FULL, ServerPacket.field3253, ServerPacket.IF_SETNPCHEAD, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.field3207, ServerPacket.field3248, ServerPacket.IF_SETSCROLLPOS, ServerPacket.SET_PRIVCHATMODE, ServerPacket.PLAYER_INFO, ServerPacket.LOGOUT, ServerPacket.IF_SETOBJECT, ServerPacket.field3263, ServerPacket.LOGOUT_FULL, ServerPacket.field3265, ServerPacket.UPDATE_STAT, ServerPacket.field3267, ServerPacket.field3268, ServerPacket.field3269, ServerPacket.field3286, ServerPacket.NPC_INFO_LARGE_VIEWPORT_1, ServerPacket.field3215, ServerPacket.field3287, ServerPacket.HINT_ARROW, ServerPacket.IF_SETMODEL, ServerPacket.field3276, ServerPacket.MESSAGE_PRIVATE, ServerPacket.REBUILD_REGION, ServerPacket.field3279, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.field3281, ServerPacket.SET_PLAYER_OP, ServerPacket.field3283, ServerPacket.field3284, ServerPacket.MINIMAP_TOGGLE, ServerPacket.REBUILD_NORMAL, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.field3288, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.field3290, ServerPacket.field3291, ServerPacket.field3292, ServerPacket.field3293, ServerPacket.field3189, ServerPacket.field3295, ServerPacket.field3296, ServerPacket.field3297};
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "([BI)Ljava/lang/String;",
      garbageValue = "-850113409"
   )
   public static String method3650(byte[] var0) {
      int var2 = var0.length;
      StringBuilder var3 = new StringBuilder();

      for(int var4 = 0; var4 < var2 + 0; var4 += 3) {
         int var5 = var0[var4] & 255;
         var3.append(class359.field4350[var5 >>> 2]);
         if (var4 < var2 - 1) {
            int var6 = var0[var4 + 1] & 255;
            var3.append(class359.field4350[(var5 & 3) << 4 | var6 >>> 4]);
            if (var4 < var2 - 2) {
               int var7 = var0[var4 + 2] & 255;
               var3.append(class359.field4350[(var6 & 15) << 2 | var7 >>> 6]).append(class359.field4350[var7 & 63]);
            } else {
               var3.append(class359.field4350[(var6 & 15) << 2]).append("=");
            }
         } else {
            var3.append(class359.field4350[(var5 & 3) << 4]).append("==");
         }
      }

      String var1 = var3.toString();
      return var1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lrw;"
   )
   @Export("newRunException")
   public static RunException newRunException(Throwable var0, String var1) {
      RunException var2;
      if (var0 instanceof RunException) {
         var2 = (RunException)var0;
         var2.message = var2.message + ' ' + var1;
      } else {
         var2 = new RunException(var0, var1);
      }

      return var2;
   }
}
