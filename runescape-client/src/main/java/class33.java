import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
public class class33 {
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lrg;"
   )
   @Export("logoSprite")
   static IndexedSprite logoSprite;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 869620667
   )
   int field201;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -123303623
   )
   int field199;

   class33(int var1, int var2) {
      this.field201 = var1;
      this.field199 = var2;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lag;I)Z",
      garbageValue = "-384198501"
   )
   boolean method494(class29 var1) {
      if (var1 == null) {
         return false;
      } else {
         switch (this.field201) {
            case 1:
               return var1.vmethod4135(this.field199);
            case 2:
               return var1.vmethod4136(this.field199);
            case 3:
               return var1.vmethod4179((char)this.field199);
            case 4:
               return var1.vmethod4139(this.field199 == 1);
            default:
               return false;
         }
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)[Lra;",
      garbageValue = "-483685235"
   )
   static PrivateChatMode[] method495() {
      return new PrivateChatMode[]{PrivateChatMode.field5074, PrivateChatMode.field5072, PrivateChatMode.field5073};
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lln;Lln;IIS)Lnv;",
      garbageValue = "17887"
   )
   public static Font method488(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
      if (!Buffer.method8892(var0, var2, var3)) {
         return null;
      } else {
         byte[] var5 = var1.takeFile(var2, var3);
         Font var4;
         if (var5 == null) {
            var4 = null;
         } else {
            Font var6 = new Font(var5, class488.SpriteBuffer_xOffsets, ApproximateRouteStrategy.SpriteBuffer_yOffsets, FriendsList.SpriteBuffer_spriteWidths, class132.SpriteBuffer_spriteHeights, class100.SpriteBuffer_spritePalette, class140.SpriteBuffer_pixels);
            class100.method2724();
            var4 = var6;
         }

         return var4;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "1548132184"
   )
   static int method493(int var0, Script var1, boolean var2) {
      if (var0 < 1000) {
         return class130.method3087(var0, var1, var2);
      } else if (var0 < 1100) {
         return UserComparator9.method2948(var0, var1, var2);
      } else if (var0 < 1200) {
         return GrandExchangeOfferOwnWorldComparator.method1209(var0, var1, var2);
      } else if (var0 < 1300) {
         return ScriptFrame.method1154(var0, var1, var2);
      } else if (var0 < 1400) {
         return GrandExchangeOfferOwnWorldComparator.method1208(var0, var1, var2);
      } else if (var0 < 1500) {
         return class139.method3157(var0, var1, var2);
      } else if (var0 < 1600) {
         return WorldMapRenderer.method5198(var0, var1, var2);
      } else if (var0 < 1700) {
         return class162.method3392(var0, var1, var2);
      } else if (var0 < 1800) {
         return class96.method2687(var0, var1, var2);
      } else if (var0 < 1900) {
         return class457.method8459(var0, var1, var2);
      } else if (var0 < 2000) {
         return Tiles.method2277(var0, var1, var2);
      } else if (var0 < 2100) {
         return UserComparator9.method2948(var0, var1, var2);
      } else if (var0 < 2200) {
         return GrandExchangeOfferOwnWorldComparator.method1209(var0, var1, var2);
      } else if (var0 < 2300) {
         return ScriptFrame.method1154(var0, var1, var2);
      } else if (var0 < 2400) {
         return GrandExchangeOfferOwnWorldComparator.method1208(var0, var1, var2);
      } else if (var0 < 2500) {
         return class139.method3157(var0, var1, var2);
      } else if (var0 < 2600) {
         return class132.method3090(var0, var1, var2);
      } else if (var0 < 2700) {
         return EnumComposition.method3711(var0, var1, var2);
      } else if (var0 < 2800) {
         return GrandExchangeOfferOwnWorldComparator.method1205(var0, var1, var2);
      } else if (var0 < 2900) {
         return WorldMapSectionType.method5294(var0, var1, var2);
      } else if (var0 < 3000) {
         return Tiles.method2277(var0, var1, var2);
      } else if (var0 < 3200) {
         return class217.method4444(var0, var1, var2);
      } else if (var0 < 3300) {
         return class122.method3027(var0, var1, var2);
      } else if (var0 < 3400) {
         return PacketWriter.method2847(var0, var1, var2);
      } else if (var0 < 3500) {
         return class151.method3302(var0, var1, var2);
      } else if (var0 < 3600) {
         return UserComparator4.method2909(var0, var1, var2);
      } else if (var0 < 3700) {
         return class390.method7472(var0, var1, var2);
      } else if (var0 < 3800) {
         return StructComposition.method3869(var0, var1, var2);
      } else if (var0 < 3900) {
         return DynamicObject.method2207(var0, var1, var2);
      } else if (var0 < 4000) {
         return TriBool.method7752(var0, var1, var2);
      } else if (var0 < 4100) {
         return class10.method112(var0, var1, var2);
      } else if (var0 < 4200) {
         return class160.method3374(var0, var1, var2);
      } else if (var0 < 4300) {
         return class6.method45(var0, var1, var2);
      } else if (var0 < 5100) {
         return StudioGame.method6441(var0, var1, var2);
      } else if (var0 < 5400) {
         return FriendSystem.method1855(var0, var1, var2);
      } else if (var0 < 5600) {
         return class101.method2732(var0, var1, var2);
      } else if (var0 < 5700) {
         return class217.method4426(var0, var1, var2);
      } else if (var0 < 6300) {
         return ServerPacket.method5564(var0, var1, var2);
      } else if (var0 < 6600) {
         return class378.method7358(var0, var1, var2);
      } else if (var0 < 6700) {
         return WorldMapRectangle.method5329(var0, var1, var2);
      } else if (var0 < 6800) {
         return class134.method3126(var0, var1, var2);
      } else if (var0 < 6900) {
         return class17.method225(var0, var1, var2);
      } else if (var0 < 7000) {
         return PcmPlayer.method837(var0, var1, var2);
      } else if (var0 < 7100) {
         return Client.method1634(var0, var1, var2);
      } else if (var0 < 7200) {
         return World.method1825(var0, var1, var2);
      } else if (var0 < 7300) {
         return CollisionMap.method4213(var0, var1, var2);
      } else if (var0 < 7500) {
         return class4.method22(var0, var1, var2);
      } else if (var0 < 7600) {
         return ArchiveDisk.method7835(var0, var1, var2);
      } else {
         return var0 < 7700 ? class126.method3074(var0, var1, var2) : 2;
      }
   }

   @ObfuscatedName("fo")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1841454557"
   )
   @Export("getLoginError")
   static void getLoginError(int var0) {
      int var1 = Login.loginIndex;
      if (var0 == -3) {
         class70.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
      } else if (var0 == -2) {
         class70.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
      } else if (var0 == -1) {
         class70.setLoginResponseString("No response from server.", "Please try using a different world.", "");
      } else if (var0 == 3) {
         ReflectionCheck.method696(3);
         Login.field917 = 1;
      } else if (var0 == 4) {
         ReflectionCheck.method696(14);
         Login.Login_banType = 0;
      } else if (var0 == 5) {
         Login.field917 = 2;
         class70.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
      } else if (var0 == 68 || !Client.onMobile && var0 == 6) {
         class70.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
      } else if (var0 == 7) {
         class70.setLoginResponseString("This world is full.", "Please use a different world.", "");
      } else if (var0 == 8) {
         class70.setLoginResponseString("Unable to connect.", "Login server offline.", "");
      } else if (var0 == 9) {
         class70.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
      } else if (var0 == 10) {
         class70.setLoginResponseString("Unable to connect.", "Bad session id.", "");
      } else if (var0 == 11) {
         class70.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
      } else if (var0 == 12) {
         class70.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
      } else if (var0 == 13) {
         class70.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
      } else if (var0 == 14) {
         class70.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
      } else if (var0 == 16) {
         class70.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
      } else if (var0 == 17) {
         class70.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
      } else if (var0 == 18) {
         ReflectionCheck.method696(14);
         Login.Login_banType = 1;
      } else if (var0 == 19) {
         class70.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
      } else if (var0 == 20) {
         class70.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
      } else if (var0 == 22) {
         class70.setLoginResponseString("Malformed login packet.", "Please try again.", "");
      } else if (var0 == 23) {
         class70.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
      } else if (var0 == 24) {
         class70.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
      } else if (var0 == 25) {
         class70.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
      } else if (var0 == 26) {
         class70.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
      } else if (var0 == 27) {
         class70.setLoginResponseString("", "Service unavailable.", "");
      } else if (var0 == 31) {
         class70.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
      } else if (var0 == 32) {
         ReflectionCheck.method696(14);
         Login.Login_banType = 2;
      } else if (var0 == 37) {
         class70.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
      } else if (var0 == 38) {
         class70.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
      } else if (var0 == 55) {
         ReflectionCheck.method696(8);
      } else {
         if (var0 == 56) {
            class70.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
            class246.updateGameState(11);
            return;
         }

         if (var0 == 57) {
            class70.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
            class246.updateGameState(11);
            return;
         }

         if (var0 == 61) {
            class70.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
            ReflectionCheck.method696(7);
         } else {
            if (var0 == 62) {
               class246.updateGameState(10);
               ReflectionCheck.method696(9);
               class70.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
               return;
            }

            if (var0 == 63) {
               class246.updateGameState(10);
               ReflectionCheck.method696(9);
               class70.setLoginResponseString("You were signed out.", "Please sign in again.", "");
               return;
            }

            if (var0 == 65 || var0 == 67) {
               class246.updateGameState(10);
               ReflectionCheck.method696(9);
               class70.setLoginResponseString("Failed to login.", "Please try again.", "");
               return;
            }

            if (var0 == 71) {
               class246.updateGameState(10);
               ReflectionCheck.method696(7);
               class70.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
            } else if (var0 == 73) {
               class246.updateGameState(10);
               ReflectionCheck.method696(6);
               class70.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
            } else if (var0 == 72) {
               class246.updateGameState(10);
               ReflectionCheck.method696(26);
            } else {
               class70.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
            }
         }
      }

      class246.updateGameState(10);
      boolean var3 = var1 != class16.method218();
      if (!var3 && Client.field536.method8938()) {
         ReflectionCheck.method696(9);
      }

   }

   @ObfuscatedName("kb")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "32"
   )
   static void method492(int var0) {
      class148.tempMenuAction = new MenuAction();
      class148.tempMenuAction.param0 = Client.menuArguments1[var0];
      class148.tempMenuAction.param1 = Client.menuArguments2[var0];
      class148.tempMenuAction.opcode = Client.menuOpcodes[var0];
      class148.tempMenuAction.identifier = Client.menuIdentifiers[var0];
      class148.tempMenuAction.itemId = Client.menuItemIds[var0];
      class148.tempMenuAction.action = Client.menuActions[var0];
      class148.tempMenuAction.target = Client.menuTargets[var0];
   }
}
