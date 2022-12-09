import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ar")
public class class32 {
   @ObfuscatedName("h")
   public static Applet field182 = null;
   @ObfuscatedName("e")
   public static String field183 = "";
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1450599729
   )
   static int field191;
   @ObfuscatedName("ib")
   @ObfuscatedSignature(
      descriptor = "[Lra;"
   )
   @Export("mapSceneSprites")
   static IndexedSprite[] mapSceneSprites;

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)J",
      garbageValue = "567247801"
   )
   public static long method461(CharSequence var0) {
      long var1 = 0L;
      int var3 = var0.length();

      for(int var4 = 0; var4 < var3; ++var4) {
         var1 *= 37L;
         char var5 = var0.charAt(var4);
         if (var5 >= 'A' && var5 <= 'Z') {
            var1 += (long)(var5 + 1 - 65);
         } else if (var5 >= 'a' && var5 <= 'z') {
            var1 += (long)(var5 + 1 - 97);
         } else if (var5 >= '0' && var5 <= '9') {
            var1 += (long)(var5 + 27 - 48);
         }

         if (var1 >= 177917621779460413L) {
            break;
         }
      }

      while(var1 % 37L == 0L && 0L != var1) {
         var1 /= 37L;
      }

      return var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "115056037"
   )
   public static void method468(int var0) {
      if (class286.musicPlayerStatus != 0) {
         class467.musicTrackVolume = var0;
      } else {
         class251.midiPcmStream.setPcmStreamVolume(var0);
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1648061781"
   )
   static void method459() {
      ItemContainer.itemContainers = new NodeHashTable(32);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "-316408933"
   )
   static int method466(int var0, Script var1, boolean var2) {
      boolean var3 = true;
      Widget var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = PlayerCompositionColorTextureOverride.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
         var3 = false;
      } else {
         var4 = var2 ? class190.scriptDotWidget : class360.scriptActiveWidget;
      }

      int var5;
      if (var0 == ScriptOpcodes.CC_SETOP) {
         var5 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] - 1;
         if (var5 >= 0 && var5 <= 9) {
            var4.setAction(var5, Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
            return 1;
         } else {
            --Interpreter.Interpreter_stringStackSize;
            return 1;
         }
      } else {
         int var6;
         if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
            class87.Interpreter_intStackSize -= 2;
            var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var6 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            var4.parent = AttackOption.getWidgetChild(var5, var6);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
            var4.isScrollBar = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
            var4.dragZoneSize = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
            var4.dragThreshold = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
            var4.dataText = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
            var4.spellActionName = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
            return 1;
         } else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
            var4.actions = null;
            return 1;
         } else if (var0 == 1308) {
            var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
            return 1;
         } else if (var0 == 1309) {
            --class87.Interpreter_intStackSize;
            return 1;
         } else {
            int var7;
            byte[] var8;
            if (var0 != ScriptOpcodes.CC_SETOPKEY) {
               byte var11;
               if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
                  class87.Interpreter_intStackSize -= 2;
                  var11 = 10;
                  var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]};
                  byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]};
                  class18.Widget_setKey(var4, var11, var8, var9);
                  return 1;
               } else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
                  class87.Interpreter_intStackSize -= 3;
                  var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] - 1;
                  var6 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
                  var7 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2];
                  if (var5 >= 0 && var5 <= 9) {
                     class9.Widget_setKeyRate(var4, var5, var6, var7);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
                  var11 = 10;
                  var6 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  class9.Widget_setKeyRate(var4, var11, var6, var7);
                  return 1;
               } else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
                  --class87.Interpreter_intStackSize;
                  var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] - 1;
                  if (var5 >= 0 && var5 <= 9) {
                     GrandExchangeOfferTotalQuantityComparator.Widget_setKeyIgnoreHeld(var4, var5);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
                  var5 = 10;
                  GrandExchangeOfferTotalQuantityComparator.Widget_setKeyIgnoreHeld(var4, var5);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               byte[] var10 = null;
               var8 = null;
               if (var3) {
                  class87.Interpreter_intStackSize -= 10;

                  for(var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + class87.Interpreter_intStackSize] >= 0; var7 += 2) {
                  }

                  if (var7 > 0) {
                     var10 = new byte[var7 / 2];
                     var8 = new byte[var7 / 2];

                     for(var7 -= 2; var7 >= 0; var7 -= 2) {
                        var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class87.Interpreter_intStackSize];
                        var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class87.Interpreter_intStackSize + 1];
                     }
                  }
               } else {
                  class87.Interpreter_intStackSize -= 2;
                  var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]};
                  var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]};
               }

               var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] - 1;
               if (var7 >= 0 && var7 <= 9) {
                  class18.Widget_setKey(var4, var7, var10, var8);
                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         }
      }
   }

   @ObfuscatedName("gr")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2002926472"
   )
   @Export("getLoginError")
   static void getLoginError(int var0) {
      int var1 = GraphicsObject.method2024();
      if (var0 == -3) {
         TaskHandler.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
      } else if (var0 == -2) {
         TaskHandler.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
      } else if (var0 == -1) {
         TaskHandler.setLoginResponseString("No response from server.", "Please try using a different world.", "");
      } else if (var0 == 3) {
         class12.method155(3);
         Login.field928 = 1;
      } else if (var0 == 4) {
         DevicePcmPlayerProvider.method320(0);
      } else if (var0 == 5) {
         Login.field928 = 2;
         TaskHandler.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
      } else if (var0 != 68 && (Client.onMobile || var0 != 6)) {
         if (var0 == 7) {
            TaskHandler.setLoginResponseString("This world is full.", "Please use a different world.", "");
         } else if (var0 == 8) {
            TaskHandler.setLoginResponseString("Unable to connect.", "Login server offline.", "");
         } else if (var0 == 9) {
            TaskHandler.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
         } else if (var0 == 10) {
            TaskHandler.setLoginResponseString("Unable to connect.", "Bad session id.", "");
         } else if (var0 == 11) {
            TaskHandler.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
         } else if (var0 == 12) {
            TaskHandler.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
         } else if (var0 == 13) {
            TaskHandler.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
         } else if (var0 == 14) {
            TaskHandler.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
         } else if (var0 == 16) {
            TaskHandler.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
         } else if (var0 == 17) {
            TaskHandler.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
         } else if (var0 == 18) {
            DevicePcmPlayerProvider.method320(1);
         } else if (var0 == 19) {
            TaskHandler.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
         } else if (var0 == 20) {
            TaskHandler.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
         } else if (var0 == 22) {
            TaskHandler.setLoginResponseString("Malformed login packet.", "Please try again.", "");
         } else if (var0 == 23) {
            TaskHandler.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
         } else if (var0 == 24) {
            TaskHandler.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
         } else if (var0 == 25) {
            TaskHandler.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
         } else if (var0 == 26) {
            TaskHandler.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
         } else if (var0 == 27) {
            TaskHandler.setLoginResponseString("", "Service unavailable.", "");
         } else if (var0 == 31) {
            TaskHandler.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
         } else if (var0 == 32) {
            DevicePcmPlayerProvider.method320(2);
         } else if (var0 == 37) {
            TaskHandler.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
         } else if (var0 == 38) {
            TaskHandler.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
         } else if (var0 == 55) {
            class12.method155(8);
         } else {
            if (var0 == 56) {
               TaskHandler.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
               class140.updateGameState(11);
               return;
            }

            if (var0 == 57) {
               TaskHandler.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
               class140.updateGameState(11);
               return;
            }

            if (var0 == 61) {
               TaskHandler.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
               class12.method155(7);
            } else {
               if (var0 == 62) {
                  class140.updateGameState(10);
                  class12.method155(9);
                  TaskHandler.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
                  return;
               }

               if (var0 == 63) {
                  class140.updateGameState(10);
                  class12.method155(9);
                  TaskHandler.setLoginResponseString("You were signed out.", "Please sign in again.", "");
                  return;
               }

               if (var0 == 65 || var0 == 67) {
                  class140.updateGameState(10);
                  class12.method155(9);
                  TaskHandler.setLoginResponseString("Failed to login.", "Please try again.", "");
                  return;
               }

               if (var0 == 71) {
                  class140.updateGameState(10);
                  class12.method155(7);
                  TaskHandler.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
               } else if (var0 == 73) {
                  class140.updateGameState(10);
                  class12.method155(6);
                  TaskHandler.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
               } else if (var0 == 72) {
                  class140.updateGameState(10);
                  class12.method155(26);
               } else {
                  TaskHandler.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
               }
            }
         }
      } else {
         TaskHandler.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
      }

      class140.updateGameState(10);
      boolean var2 = var1 != GraphicsObject.method2024();
      if (!var2 && Client.field640.method8841()) {
         class12.method155(9);
      }

   }

   @ObfuscatedName("jg")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-941365461"
   )
   @Export("selectSpell")
   static void selectSpell(int var0, int var1, int var2, int var3) {
      Widget var4 = AttackOption.getWidgetChild(var0, var1);
      if (var4 != null && var4.onTargetEnter != null) {
         ScriptEvent var5 = new ScriptEvent();
         var5.widget = var4;
         var5.args = var4.onTargetEnter;
         WorldMapElement.runScriptEvent(var5);
      }

      Client.selectedSpellItemId = var3;
      Client.isSpellSelected = true;
      class358.selectedSpellWidget = var0;
      Client.selectedSpellChildIndex = var1;
      class21.selectedSpellFlags = var2;
      class69.invalidateWidget(var4);
   }
}
