import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
public class class315 {
   @ObfuscatedName("af")
   public static final short[] field3550 = new short[]{6798, 8741, 25238, 4626, 4550};
   @ObfuscatedName("an")
   public static final short[][] field3549 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010, -22122, 937, 8130, -13422, 30385}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}};
   @ObfuscatedName("aw")
   public static final short[] field3551 = new short[]{-10304, 9104, -1, -1, -1};
   @ObfuscatedName("ac")
   public static final short[][] field3552 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002, -22116, 945, 8144, -13414, 30389}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]};

   @ObfuscatedName("hr")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "104097029"
   )
   @Export("getLoginError")
   static void getLoginError(int var0) {
      int var1 = class330.method6582();
      if (var0 == -3) {
         class205.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
      } else if (var0 == -2) {
         class205.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
      } else if (var0 == -1) {
         class205.setLoginResponseString("No response from server.", "Please try using a different world.", "");
      } else if (var0 == 3) {
         class129.method3124(3);
         Login.field916 = 1;
      } else if (var0 == 4) {
         class14.method187(0);
      } else if (var0 == 5) {
         Login.field916 = 2;
         class205.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
      } else if (var0 != 68 && (Client.onMobile || var0 != 6)) {
         if (var0 == 7) {
            class205.setLoginResponseString("This world is full.", "Please use a different world.", "");
         } else if (var0 == 8) {
            class205.setLoginResponseString("Unable to connect.", "Login server offline.", "");
         } else if (var0 == 9) {
            class205.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
         } else if (var0 == 10) {
            class205.setLoginResponseString("Unable to connect.", "Bad session id.", "");
         } else if (var0 == 11) {
            class205.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
         } else if (var0 == 12) {
            class205.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
         } else if (var0 == 13) {
            class205.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
         } else if (var0 == 14) {
            class205.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
         } else if (var0 == 16) {
            class205.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
            class129.method3124(33);
         } else if (var0 == 17) {
            class205.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
         } else if (var0 == 18) {
            class14.method187(1);
         } else if (var0 == 19) {
            class205.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
         } else if (var0 == 20) {
            class205.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
         } else if (var0 == 22) {
            class205.setLoginResponseString("Malformed login packet.", "Please try again.", "");
         } else if (var0 == 23) {
            class205.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
         } else if (var0 == 24) {
            class205.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
         } else if (var0 == 25) {
            class205.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
         } else if (var0 == 26) {
            class205.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
         } else if (var0 == 27) {
            class205.setLoginResponseString("", "Service unavailable.", "");
         } else if (var0 == 31) {
            class205.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
         } else if (var0 == 32) {
            class14.method187(2);
         } else if (var0 == 37) {
            class205.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
         } else if (var0 == 38) {
            class205.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
         } else if (var0 == 55) {
            class129.method3124(8);
         } else {
            if (var0 == 56) {
               class205.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
               class138.updateGameState(11);
               return;
            }

            if (var0 == 57) {
               class205.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
               class138.updateGameState(11);
               return;
            }

            if (var0 == 61) {
               class205.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
               class129.method3124(7);
            } else {
               if (var0 == 62) {
                  class138.updateGameState(10);
                  class129.method3124(9);
                  class205.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
                  return;
               }

               if (var0 == 63) {
                  class138.updateGameState(10);
                  class129.method3124(9);
                  class205.setLoginResponseString("You were signed out.", "Please sign in again.", "");
                  return;
               }

               if (var0 == 65 || var0 == 67) {
                  class138.updateGameState(10);
                  class129.method3124(9);
                  class205.setLoginResponseString("Failed to login.", "Please try again.", "");
                  return;
               }

               if (var0 == 71) {
                  class138.updateGameState(10);
                  class129.method3124(7);
                  class205.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
               } else if (var0 == 73) {
                  class138.updateGameState(10);
                  class129.method3124(6);
                  class205.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
               } else if (var0 == 72) {
                  class138.updateGameState(10);
                  class129.method3124(32);
               } else {
                  class205.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
               }
            }
         }
      } else {
         class205.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
      }

      class138.updateGameState(10);
      boolean var2 = var1 != class330.method6582();
      if (!var2 && Client.field527.method9347()) {
         class129.method3124(9);
      }

   }
}
