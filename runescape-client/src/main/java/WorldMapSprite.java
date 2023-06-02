import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
   @ObfuscatedName("an")
   @Export("tileColors")
   final int[] tileColors;

   WorldMapSprite() {
      this.tileColors = new int[4096];
   }

   WorldMapSprite(int[] var1) {
      this.tileColors = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-1695191644"
   )
   @Export("getTileColor")
   final int getTileColor(int var1, int var2) {
      return this.tileColors[var1 + var2 * 64];
   }

   @ObfuscatedName("gs")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-86"
   )
   @Export("getLoginError")
   static void getLoginError(int var0) {
      int var1 = class135.method3048();
      if (var0 == -3) {
         class478.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
      } else if (var0 == -2) {
         class478.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
      } else if (var0 == -1) {
         class478.setLoginResponseString("No response from server.", "Please try using a different world.", "");
      } else if (var0 == 3) {
         class390.method7249(3);
         Login.field929 = 1;
      } else if (var0 == 4) {
         class390.method7249(14);
         Login.Login_banType = 0;
      } else if (var0 == 5) {
         Login.field929 = 2;
         class478.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
      } else if (var0 == 68 || !Client.onMobile && var0 == 6) {
         class478.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
      } else if (var0 == 7) {
         class478.setLoginResponseString("This world is full.", "Please use a different world.", "");
      } else if (var0 == 8) {
         class478.setLoginResponseString("Unable to connect.", "Login server offline.", "");
      } else if (var0 == 9) {
         class478.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
      } else if (var0 == 10) {
         class478.setLoginResponseString("Unable to connect.", "Bad session id.", "");
      } else if (var0 == 11) {
         class478.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
      } else if (var0 == 12) {
         class478.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
      } else if (var0 == 13) {
         class478.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
      } else if (var0 == 14) {
         class478.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
      } else if (var0 == 16) {
         class478.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
         class390.method7249(33);
      } else if (var0 == 17) {
         class478.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
      } else if (var0 == 18) {
         class390.method7249(14);
         Login.Login_banType = 1;
      } else if (var0 == 19) {
         class478.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
      } else if (var0 == 20) {
         class478.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
      } else if (var0 == 22) {
         class478.setLoginResponseString("Malformed login packet.", "Please try again.", "");
      } else if (var0 == 23) {
         class478.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
      } else if (var0 == 24) {
         class478.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
      } else if (var0 == 25) {
         class478.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
      } else if (var0 == 26) {
         class478.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
      } else if (var0 == 27) {
         class478.setLoginResponseString("", "Service unavailable.", "");
      } else if (var0 == 31) {
         class478.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
      } else if (var0 == 32) {
         class390.method7249(14);
         Login.Login_banType = 2;
      } else if (var0 == 37) {
         class478.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
      } else if (var0 == 38) {
         class478.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
      } else if (var0 == 55) {
         class390.method7249(8);
      } else {
         if (var0 == 56) {
            class478.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
            UserComparator8.updateGameState(11);
            return;
         }

         if (var0 == 57) {
            class478.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
            UserComparator8.updateGameState(11);
            return;
         }

         if (var0 == 61) {
            class478.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class390.method7249(7);
         } else {
            if (var0 == 62) {
               UserComparator8.updateGameState(10);
               class390.method7249(9);
               class478.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
               return;
            }

            if (var0 == 63) {
               UserComparator8.updateGameState(10);
               class390.method7249(9);
               class478.setLoginResponseString("You were signed out.", "Please sign in again.", "");
               return;
            }

            if (var0 == 65 || var0 == 67) {
               UserComparator8.updateGameState(10);
               class390.method7249(9);
               class478.setLoginResponseString("Failed to login.", "Please try again.", "");
               return;
            }

            if (var0 == 71) {
               UserComparator8.updateGameState(10);
               class390.method7249(7);
               class478.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
            } else if (var0 == 73) {
               UserComparator8.updateGameState(10);
               class390.method7249(6);
               class478.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
            } else if (var0 == 72) {
               UserComparator8.updateGameState(10);
               class390.method7249(32);
            } else {
               class478.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
            }
         }
      }

      UserComparator8.updateGameState(10);
      boolean var2 = var1 != class135.method3048();
      if (!var2 && Client.field633.method9212()) {
         class390.method7249(9);
      }

   }
}
