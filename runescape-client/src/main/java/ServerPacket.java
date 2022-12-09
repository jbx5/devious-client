import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("ServerPacket")
public class ServerPacket {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket RUNCLIENTSCRIPT = new ServerPacket(0, -2);
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket IF_MOVESUB = new ServerPacket(1, 8);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket URL_OPEN = new ServerPacket(2, -2);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3186 = new ServerPacket(3, 5);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket MESSAGE_FRIENDS_CHAT = new ServerPacket(4, -1);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket VARP_LARGE = new ServerPacket(5, 6);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket MESSAGE_GAME = new ServerPacket(6, -1);
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket EVENT_WORLDHOP = new ServerPacket(7, -1);
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket IF_SETHIDE = new ServerPacket(8, 5);
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3208 = new ServerPacket(9, 15);
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3193 = new ServerPacket(10, 7);
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3194 = new ServerPacket(11, 2);
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket MIDI_SONG = new ServerPacket(12, 2);
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket UPDATE_INV_STOP_TRANSIT = new ServerPacket(13, 2);
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket IF_SETANGLE = new ServerPacket(14, 10);
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket IF_CLOSESUB = new ServerPacket(15, 4);
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3199 = new ServerPacket(16, -2);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket PROJECTILE_SPAWN = new ServerPacket(17, 17);
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket GRAPHICSOBJECT_SPAWN = new ServerPacket(18, 8);
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket PLAYER_SPOTANIM = new ServerPacket(19, 8);
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket CAM_SETANGLE = new ServerPacket(20, 6);
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket MESSAGE_PRIVATE_ECHO = new ServerPacket(21, -2);
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket MINIMAP_FLAG_SET = new ServerPacket(22, 2);
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3206 = new ServerPacket(23, -1);
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket CAM_LOOKAT = new ServerPacket(24, 6);
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3183 = new ServerPacket(25, 2);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket UPDATE_IGNORELIST = new ServerPacket(26, -2);
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket UPDATE_UID192 = new ServerPacket(27, 28);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket UPDATE_FRIENDLIST = new ServerPacket(28, -2);
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket UPDATE_REBOOT_TIMER = new ServerPacket(29, 2);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3205 = new ServerPacket(30, -2);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3214 = new ServerPacket(31, -2);
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket NPC_SPOTANIM = new ServerPacket(32, 8);
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket NPC_INFO_SMALL_VIEWPORT_1 = new ServerPacket(33, -2);
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket VARP_SMALL = new ServerPacket(34, 3);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket IF_SETPOSITION = new ServerPacket(35, 8);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket TRIGGER_ONDIALOG_ABORT = new ServerPacket(36, 0);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3213 = new ServerPacket(37, 4);
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3221 = new ServerPacket(38, 5);
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3222 = new ServerPacket(39, 4);
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3223 = new ServerPacket(40, 5);
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3224 = new ServerPacket(41, 6);
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3251 = new ServerPacket(42, -2);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3226 = new ServerPacket(43, 14);
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3227 = new ServerPacket(44, -2);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3184 = new ServerPacket(45, 4);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3229 = new ServerPacket(46, -2);
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3242 = new ServerPacket(47, 2);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket IF_SETPLAYERHEAD = new ServerPacket(48, 4);
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3232 = new ServerPacket(49, -2);
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3192 = new ServerPacket(50, 0);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket NPC_INFO_SMALL_VIEWPORT_2 = new ServerPacket(51, -2);
   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3235 = new ServerPacket(52, 8);
   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(53, 2);
   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket CAM_RESET = new ServerPacket(54, 0);
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket UPDATE_INV_PARTIAL = new ServerPacket(55, -2);
   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket CHAT_FILTER_SETTINGS = new ServerPacket(56, 2);
   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket UPDATE_INV_CLEAR = new ServerPacket(57, 4);
   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3241 = new ServerPacket(58, 1);
   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket UPDATE_STOCKMARKET_SLOT = new ServerPacket(59, 20);
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket RESET_CLIENT_VARCACHE = new ServerPacket(60, 0);
   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket IF_SETCOLOUR = new ServerPacket(61, 6);
   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket REFLECTION_CHECKER = new ServerPacket(62, -2);
   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(63, -2);
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3247 = new ServerPacket(64, 7);
   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3266 = new ServerPacket(65, -1);
   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3285 = new ServerPacket(66, 1);
   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket SYNC_CLIENT_VARCACHE = new ServerPacket(67, 0);
   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3249 = new ServerPacket(68, 0);
   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket UPDATE_INV_FULL = new ServerPacket(69, -2);
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3253 = new ServerPacket(70, 4);
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket IF_SETNPCHEAD = new ServerPacket(71, 6);
   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket NPC_INFO_LARGE_VIEWPORT_2 = new ServerPacket(72, -2);
   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3207 = new ServerPacket(73, 1);
   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3248 = new ServerPacket(74, 5);
   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket IF_SETSCROLLPOS = new ServerPacket(75, 6);
   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket SET_PRIVCHATMODE = new ServerPacket(76, 1);
   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket PLAYER_INFO = new ServerPacket(77, -2);
   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket LOGOUT = new ServerPacket(78, 1);
   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket IF_SETOBJECT = new ServerPacket(79, 10);
   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3263 = new ServerPacket(80, 6);
   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket LOGOUT_FULL = new ServerPacket(81, 0);
   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3265 = new ServerPacket(82, 5);
   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket UPDATE_STAT = new ServerPacket(83, 6);
   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3267 = new ServerPacket(84, -2);
   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3268 = new ServerPacket(85, 0);
   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3269 = new ServerPacket(86, -2);
   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3286 = new ServerPacket(87, 12);
   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket NPC_INFO_LARGE_VIEWPORT_1 = new ServerPacket(88, -2);
   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3215 = new ServerPacket(89, 4);
   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3287 = new ServerPacket(90, 2);
   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket HINT_ARROW = new ServerPacket(91, 6);
   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket IF_SETMODEL = new ServerPacket(92, 6);
   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3276 = new ServerPacket(93, -1);
   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket MESSAGE_PRIVATE = new ServerPacket(94, -2);
   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket REBUILD_REGION = new ServerPacket(95, -2);
   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3279 = new ServerPacket(96, 17);
   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket NPC_SET_SEQUENCE = new ServerPacket(97, 5);
   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3281 = new ServerPacket(98, -1);
   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket SET_PLAYER_OP = new ServerPacket(99, -1);
   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3283 = new ServerPacket(100, -1);
   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3284 = new ServerPacket(101, 16);
   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket MINIMAP_TOGGLE = new ServerPacket(102, 1);
   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket REBUILD_NORMAL = new ServerPacket(103, -2);
   @ObfuscatedName("dh")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket PING_STATISTICS_REQUEST = new ServerPacket(104, 8);
   @ObfuscatedName("dn")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3288 = new ServerPacket(105, 8);
   @ObfuscatedName("da")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket DYNAMICOBJECT_SPAWN = new ServerPacket(106, 6);
   @ObfuscatedName("de")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3290 = new ServerPacket(107, 0);
   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3291 = new ServerPacket(108, -2);
   @ObfuscatedName("dw")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3292 = new ServerPacket(109, 7);
   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3293 = new ServerPacket(110, 14);
   @ObfuscatedName("dv")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3189 = new ServerPacket(111, 0);
   @ObfuscatedName("ds")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3295 = new ServerPacket(112, 2);
   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3296 = new ServerPacket(113, 9);
   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   public static final ServerPacket field3297 = new ServerPacket(114, 6);
   @ObfuscatedName("df")
   @ObfuscatedGetter(
      intValue = -170435115
   )
   @Export("id")
   public final int id;
   @ObfuscatedName("dy")
   @ObfuscatedGetter(
      intValue = -1413935371
   )
   @Export("length")
   public final int length;

   ServerPacket(int var1, int var2) {
      this.id = var1;
      this.length = var2;
   }

   @ObfuscatedName("kc")
   @ObfuscatedSignature(
      descriptor = "(Lcj;IIII)V",
      garbageValue = "1927055632"
   )
   @Export("addPlayerToMenu")
   static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
      if (class155.localPlayer != var0) {
         if (Client.menuOptionsCount < 400) {
            String var4;
            if (var0.skillLevel == 0) {
               var4 = var0.actions[0] + var0.username + var0.actions[1] + class125.method2971(var0.combatLevel, class155.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
            } else {
               var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
            }

            int var5;
            if (Client.isItemSelected == 1) {
               ObjectSound.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + MouseRecorder.colorStartTag(16777215) + var4, 14, var1, var2, var3);
            } else if (Client.isSpellSelected) {
               if ((class21.selectedSpellFlags & 8) == 8) {
                  ObjectSound.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MouseRecorder.colorStartTag(16777215) + var4, 15, var1, var2, var3);
               }
            } else {
               for(var5 = 7; var5 >= 0; --var5) {
                  if (Client.playerMenuActions[var5] != null) {
                     short var6 = 0;
                     if (Client.playerMenuActions[var5].equalsIgnoreCase("Attack")) {
                        if (Client.playerAttackOption == AttackOption.AttackOption_hidden) {
                           continue;
                        }

                        if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > class155.localPlayer.combatLevel) {
                           var6 = 2000;
                        }

                        if (class155.localPlayer.team != 0 && var0.team != 0) {
                           if (var0.team == class155.localPlayer.team) {
                              var6 = 2000;
                           } else {
                              var6 = 0;
                           }
                        } else if (Client.playerAttackOption == AttackOption.field1346 && var0.isClanMember()) {
                           var6 = 2000;
                        }
                     } else if (Client.playerOptionsPriorities[var5]) {
                        var6 = 2000;
                     }

                     boolean var7 = false;
                     int var8 = Client.playerMenuOpcodes[var5] + var6;
                     ObjectSound.insertMenuItemNoShift(Client.playerMenuActions[var5], MouseRecorder.colorStartTag(16777215) + var4, var8, var1, var2, var3);
                  }
               }
            }

            for(var5 = 0; var5 < Client.menuOptionsCount; ++var5) {
               if (Client.menuOpcodes[var5] == 23) {
                  Client.menuTargets[var5] = MouseRecorder.colorStartTag(16777215) + var4;
                  break;
               }
            }

         }
      }
   }
}
