import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
public class class393 {
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1829488267
   )
   static int field4436;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1441168841
   )
   int field4437;

   @ObfuscatedSignature(
      descriptor = "(IZ)V",
      garbageValue = "1"
   )
   class393(int var1, boolean var2) {
      this.field4437 = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2065900127"
   )
   public int method7412() {
      return this.field4437;
   }

   @ObfuscatedName("mc")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-26"
   )
   @Export("changeGameOptions")
   static final void changeGameOptions(int var0) {
      PlatformInfo.method8310();
      TileItem.method2662();
      int var1 = class100.VarpDefinition_get(var0).type;
      if (var1 != 0) {
         int var2 = Varps.Varps_main[var0];
         if (var1 == 1) {
            if (var2 == 1) {
               class392.method7411(0.9);
            }

            if (var2 == 2) {
               class392.method7411(0.8);
            }

            if (var2 == 3) {
               class392.method7411(0.7);
            }

            if (var2 == 4) {
               class392.method7411(0.6);
            }
         }

         if (var1 == 3) {
            if (var2 == 0) {
               class209.method4117(255);
            }

            if (var2 == 1) {
               class209.method4117(192);
            }

            if (var2 == 2) {
               class209.method4117(128);
            }

            if (var2 == 3) {
               class209.method4117(64);
            }

            if (var2 == 4) {
               class209.method4117(0);
            }
         }

         if (var1 == 4) {
            if (var2 == 0) {
               ClanChannelMember.method3136(127);
            }

            if (var2 == 1) {
               ClanChannelMember.method3136(96);
            }

            if (var2 == 2) {
               ClanChannelMember.method3136(64);
            }

            if (var2 == 3) {
               ClanChannelMember.method3136(32);
            }

            if (var2 == 4) {
               ClanChannelMember.method3136(0);
            }
         }

         if (var1 == 5) {
            Client.leftClickOpensMenu = var2 == 1;
         }

         if (var1 == 6) {
            Client.chatEffects = var2;
         }

         if (var1 == 9) {
         }

         if (var1 == 10) {
            if (var2 == 0) {
               class134.method3041(127);
            }

            if (var2 == 1) {
               class134.method3041(96);
            }

            if (var2 == 2) {
               class134.method3041(64);
            }

            if (var2 == 3) {
               class134.method3041(32);
            }

            if (var2 == 4) {
               class134.method3041(0);
            }
         }

         if (var1 == 17) {
            Client.followerIndex = var2 & '\uffff';
         }

         if (var1 == 18) {
            Client.playerAttackOption = (AttackOption)GameObject.findEnumerated(class404.method7634(), var2);
            if (Client.playerAttackOption == null) {
               Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
            }
         }

         if (var1 == 19) {
            if (var2 == -1) {
               Client.combatTargetPlayerIndex = -1;
            } else {
               Client.combatTargetPlayerIndex = var2 & 2047;
            }
         }

         if (var1 == 22) {
            Client.npcAttackOption = (AttackOption)GameObject.findEnumerated(class404.method7634(), var2);
            if (Client.npcAttackOption == null) {
               Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
            }
         }

      }
   }
}
