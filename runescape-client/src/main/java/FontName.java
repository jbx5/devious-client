import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pz")
@Implements("FontName")
public class FontName {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lpz;"
   )
   @Export("FontName_plain11")
   public static final FontName FontName_plain11 = new FontName("p11_full");
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lpz;"
   )
   @Export("FontName_plain12")
   public static final FontName FontName_plain12 = new FontName("p12_full");
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lpz;"
   )
   @Export("FontName_bold12")
   public static final FontName FontName_bold12 = new FontName("b12_full");
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lpz;"
   )
   @Export("FontName_verdana11")
   public static final FontName FontName_verdana11 = new FontName("verdana_11pt_regular");
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lpz;"
   )
   @Export("FontName_verdana13")
   public static final FontName FontName_verdana13 = new FontName("verdana_13pt_regular");
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lpz;"
   )
   @Export("FontName_verdana15")
   public static final FontName FontName_verdana15 = new FontName("verdana_15pt_regular");
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Leq;"
   )
   static ClanChannel field4758;
   @ObfuscatedName("y")
   @Export("name")
   String name;

   FontName(String var1) {
      this.name = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)[Lpz;",
      garbageValue = "57"
   )
   public static FontName[] method8076() {
      return new FontName[]{FontName_plain11, FontName_verdana13, FontName_verdana15, FontName_bold12, FontName_plain12, FontName_verdana11};
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lae;Lnl;I)V",
      garbageValue = "-354010538"
   )
   @Export("loginScreen")
   static void loginScreen(GameEngine var0, Font var1) {
      int var4;
      int var5;
      int var6;
      int var7;
      if (Login.worldSelectOpen) {
         class199 var32 = Client.field733;
         class199 var3 = var32;

         while(true) {
            if (!var3.method3981()) {
               if (MouseHandler.MouseHandler_lastButton != 1 && (class82.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) {
                  break;
               }

               var4 = Login.xPadding + 280;
               if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                  class278.changeWorldSelectSorting(0, 0);
                  break;
               }

               if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                  class278.changeWorldSelectSorting(0, 1);
                  break;
               }

               var5 = Login.xPadding + 390;
               if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                  class278.changeWorldSelectSorting(1, 0);
                  break;
               }

               if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                  class278.changeWorldSelectSorting(1, 1);
                  break;
               }

               var6 = Login.xPadding + 500;
               if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var6 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                  class278.changeWorldSelectSorting(2, 0);
                  break;
               }

               if (MouseHandler.MouseHandler_lastPressedX >= var6 + 15 && MouseHandler.MouseHandler_lastPressedX <= var6 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                  class278.changeWorldSelectSorting(2, 1);
                  break;
               }

               var7 = Login.xPadding + 610;
               if (MouseHandler.MouseHandler_lastPressedX >= var7 && MouseHandler.MouseHandler_lastPressedX <= var7 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                  class278.changeWorldSelectSorting(3, 0);
                  break;
               }

               if (MouseHandler.MouseHandler_lastPressedX >= var7 + 15 && MouseHandler.MouseHandler_lastPressedX <= var7 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                  class278.changeWorldSelectSorting(3, 1);
                  break;
               }

               if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
                  class20.method289();
                  break;
               }

               if (Login.hoveredWorldIndex != -1) {
                  World var34 = class412.World_worlds[Login.hoveredWorldIndex];
                  Client.changeWorld(var34);
                  class20.method289();
               } else {
                  if (Login.worldSelectPage > 0 && GameObject.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= GameObject.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class10.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class10.canvasHeight / 2 + 50) {
                     --Login.worldSelectPage;
                  }

                  if (Login.worldSelectPage < Login.worldSelectPagesCount && DevicePcmPlayerProvider.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GameEngine.canvasWidth - DevicePcmPlayerProvider.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GameEngine.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class10.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class10.canvasHeight / 2 + 50) {
                     ++Login.worldSelectPage;
                  }
               }
               break;
            }

            if (var3.field2252 == 13) {
               class20.method289();
               break;
            }

            if (var3.field2252 == 96) {
               if (Login.worldSelectPage > 0 && GameObject.worldSelectLeftSprite != null) {
                  --Login.worldSelectPage;
               }
            } else if (var3.field2252 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && DevicePcmPlayerProvider.worldSelectRightSprite != null) {
               ++Login.worldSelectPage;
            }
         }

      } else {
         if ((MouseHandler.MouseHandler_lastButton == 1 || !class82.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
            BufferedSink.clientPreferences.method2382(!BufferedSink.clientPreferences.method2383());
            if (!BufferedSink.clientPreferences.method2383()) {
               Archive var2 = ReflectionCheck.archive6;
               int var19 = var2.getGroupId("scape main");
               var4 = var2.getFileId(var19, "");
               class18.method266(var2, var19, var4, 255, false);
            } else {
               class283.midiPcmStream.clear();
               class283.musicPlayerStatus = 1;
               DevicePcmPlayerProvider.musicTrackArchive = null;
            }
         }

         if (Client.gameState != 5) {
            if (-1L == Login.field926) {
               Login.field926 = UserComparator8.method2748() + 1000L;
            }

            long var20 = UserComparator8.method2748();
            boolean var33;
            if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
               while(true) {
                  if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) {
                     var33 = true;
                     break;
                  }

                  ArchiveLoader var22 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
                  if (!var22.isLoaded()) {
                     var33 = false;
                     break;
                  }

                  ++Client.archiveLoadersDone;
               }
            } else {
               var33 = true;
            }

            if (var33 && -1L == Login.field918) {
               Login.field918 = var20;
               if (Login.field918 > Login.field926) {
                  Login.field926 = Login.field918;
               }
            }

            if (Client.gameState == 10 || Client.gameState == 11) {
               if (Language.Language_EN == class103.clientLanguage) {
                  if (MouseHandler.MouseHandler_lastButton == 1 || !class82.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
                     var5 = Login.xPadding + 5;
                     var6 = 463;
                     var7 = 100;
                     byte var23 = 35;
                     if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + var7 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var23 + var6) {
                        if (GrandExchangeEvent.loadWorlds()) {
                           Login.worldSelectOpen = true;
                           Login.worldSelectPage = 0;
                           Login.worldSelectPagesCount = 0;
                        }

                        return;
                     }
                  }

                  if (class96.World_request != null && GrandExchangeEvent.loadWorlds()) {
                     Login.worldSelectOpen = true;
                     Login.worldSelectPage = 0;
                     Login.worldSelectPagesCount = 0;
                  }
               }

               var5 = MouseHandler.MouseHandler_lastButton;
               var6 = MouseHandler.MouseHandler_lastPressedX;
               var7 = MouseHandler.MouseHandler_lastPressedY;
               if (var5 == 0) {
                  var6 = MouseHandler.MouseHandler_x;
                  var7 = MouseHandler.MouseHandler_y;
               }

               if (!class82.mouseCam && var5 == 4) {
                  var5 = 1;
               }

               class199 var8 = Client.field733;
               class199 var9 = var8;
               int var11;
               short var36;
               if (Login.loginIndex == 0) {
                  boolean var40 = false;

                  while(var9.method3981()) {
                     if (var9.field2252 == 84) {
                        var40 = true;
                     }
                  }

                  var11 = Canvas.loginBoxCenter - 80;
                  var36 = 291;
                  if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var36 - 20 && var7 <= var36 + 20) {
                     UrlRequester.openURL(class135.method2990("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                  }

                  var11 = Canvas.loginBoxCenter + 80;
                  if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var36 - 20 && var7 <= var36 + 20 || var40) {
                     if ((Client.worldProperties & 33554432) != 0) {
                        Login.Login_response0 = "";
                        Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                        Login.Login_response2 = "Your normal account will not be affected.";
                        Login.Login_response3 = "";
                        GrandExchangeOfferOwnWorldComparator.method1171(1);
                        class283.method5450();
                     } else if ((Client.worldProperties & 4) != 0) {
                        if ((Client.worldProperties & 1024) != 0) {
                           Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                           Login.Login_response2 = "Players can attack each other almost everywhere";
                           Login.Login_response3 = "and the Protect Item prayer won't work.";
                        } else {
                           Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                           Login.Login_response2 = "Players can attack each other";
                           Login.Login_response3 = "almost everywhere.";
                        }

                        Login.Login_response0 = "Warning!";
                        GrandExchangeOfferOwnWorldComparator.method1171(1);
                        class283.method5450();
                     } else if ((Client.worldProperties & 1024) != 0) {
                        Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                        Login.Login_response2 = "The Protect Item prayer will";
                        Login.Login_response3 = "not work on this world.";
                        Login.Login_response0 = "Warning!";
                        GrandExchangeOfferOwnWorldComparator.method1171(1);
                        class283.method5450();
                     } else {
                        FriendsChat.Login_promptCredentials(false);
                     }
                  }
               } else {
                  int var10;
                  short var37;
                  if (Login.loginIndex == 1) {
                     while(true) {
                        if (!var9.method3981()) {
                           var10 = Canvas.loginBoxCenter - 80;
                           var37 = 321;
                           if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var37 - 20 && var7 <= var37 + 20) {
                              FriendsChat.Login_promptCredentials(false);
                           }

                           var10 = Canvas.loginBoxCenter + 80;
                           if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var37 - 20 && var7 <= var37 + 20) {
                              GrandExchangeOfferOwnWorldComparator.method1171(0);
                           }
                           break;
                        }

                        if (var9.field2252 == 84) {
                           FriendsChat.Login_promptCredentials(false);
                        } else if (var9.field2252 == 13) {
                           GrandExchangeOfferOwnWorldComparator.method1171(0);
                        }
                     }
                  } else {
                     int var15;
                     short var35;
                     if (Login.loginIndex == 2) {
                        var35 = 201;
                        var10 = var35 + 52;
                        if (var5 == 1 && var7 >= var10 - 12 && var7 < var10 + 2) {
                           Login.currentLoginField = 0;
                        }

                        var10 += 15;
                        if (var5 == 1 && var7 >= var10 - 12 && var7 < var10 + 2) {
                           Login.currentLoginField = 1;
                        }

                        var10 += 15;
                        var35 = 361;
                        if (class459.field4855 != null) {
                           var11 = class459.field4855.highX / 2;
                           if (var5 == 1 && var6 >= class459.field4855.lowX - var11 && var6 <= var11 + class459.field4855.lowX && var7 >= var35 - 15 && var7 < var35) {
                              switch (Login.field925) {
                                 case 1:
                                    MusicPatchNode2.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                                    GrandExchangeOfferOwnWorldComparator.method1171(5);
                                    return;
                                 case 2:
                                    UrlRequester.openURL("https://support.runescape.com/hc/en-gb", true, false);
                              }
                           }
                        }

                        var11 = Canvas.loginBoxCenter - 80;
                        var36 = 321;
                        if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var36 - 20 && var7 <= var36 + 20) {
                           Login.Login_username = Login.Login_username.trim();
                           if (Login.Login_username.length() == 0) {
                              MusicPatchNode2.setLoginResponseString("", "Please enter your username/email address.", "");
                              return;
                           }

                           if (Login.Login_password.length() == 0) {
                              MusicPatchNode2.setLoginResponseString("", "Please enter your password.", "");
                              return;
                           }

                           MusicPatchNode2.setLoginResponseString("", "Connecting to server...", "");
                           SoundCache.method874(false);
                           class21.updateGameState(20);
                           return;
                        }

                        var11 = Login.loginBoxX + 180 + 80;
                        if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var36 - 20 && var7 <= var36 + 20) {
                           GrandExchangeOfferOwnWorldComparator.method1171(0);
                           Login.Login_username = "";
                           Login.Login_password = "";
                           class360.field4308 = 0;
                           class355.otp = "";
                           Login.field900 = true;
                        }

                        var11 = Canvas.loginBoxCenter + -117;
                        var36 = 277;
                        Login.field916 = var6 >= var11 && var6 < var11 + ModeWhere.field4271 && var7 >= var36 && var7 < var36 + Login.field915;
                        if (var5 == 1 && Login.field916) {
                           Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
                           if (!Client.Login_isUsernameRemembered && BufferedSink.clientPreferences.method2397() != null) {
                              BufferedSink.clientPreferences.method2385((String)null);
                           }
                        }

                        var11 = Canvas.loginBoxCenter + 24;
                        var36 = 277;
                        Login.field917 = var6 >= var11 && var6 < var11 + ModeWhere.field4271 && var7 >= var36 && var7 < var36 + Login.field915;
                        if (var5 == 1 && Login.field917) {
                           BufferedSink.clientPreferences.method2430(!BufferedSink.clientPreferences.method2381());
                           if (!BufferedSink.clientPreferences.method2381()) {
                              Login.Login_username = "";
                              BufferedSink.clientPreferences.method2385((String)null);
                              class283.method5450();
                           }
                        }

                        while(true) {
                           Transferable var39;
                           do {
                              while(true) {
                                 label1372:
                                 do {
                                    while(true) {
                                       while(var9.method3981()) {
                                          if (var9.field2252 != 13) {
                                             if (Login.currentLoginField != 0) {
                                                continue label1372;
                                             }

                                             VarpDefinition.method3415(var9.field2256);
                                             if (var9.field2252 == 85 && Login.Login_username.length() > 0) {
                                                Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                                             }

                                             if (var9.field2252 == 84 || var9.field2252 == 80) {
                                                Login.currentLoginField = 1;
                                             }

                                             if (class199.method3997(var9.field2256) && Login.Login_username.length() < 320) {
                                                Login.Login_username = Login.Login_username + var9.field2256;
                                             }
                                          } else {
                                             GrandExchangeOfferOwnWorldComparator.method1171(0);
                                             Login.Login_username = "";
                                             Login.Login_password = "";
                                             class360.field4308 = 0;
                                             class355.otp = "";
                                             Login.field900 = true;
                                          }
                                       }

                                       return;
                                    }
                                 } while(Login.currentLoginField != 1);

                                 if (var9.field2252 == 85 && Login.Login_password.length() > 0) {
                                    Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
                                 } else if (var9.field2252 == 84 || var9.field2252 == 80) {
                                    Login.currentLoginField = 0;
                                    if (var9.field2252 == 84) {
                                       Login.Login_username = Login.Login_username.trim();
                                       if (Login.Login_username.length() == 0) {
                                          MusicPatchNode2.setLoginResponseString("", "Please enter your username/email address.", "");
                                          return;
                                       }

                                       if (Login.Login_password.length() == 0) {
                                          MusicPatchNode2.setLoginResponseString("", "Please enter your password.", "");
                                          return;
                                       }

                                       MusicPatchNode2.setLoginResponseString("", "Connecting to server...", "");
                                       SoundCache.method874(false);
                                       class21.updateGameState(20);
                                       return;
                                    }
                                 }

                                 if ((var9.method3956(82) || var9.method3956(87)) && var9.field2252 == 67) {
                                    Clipboard var38 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var39 = var38.getContents(ClanChannelMember.client);
                                    var15 = 20 - Login.Login_password.length();
                                    break;
                                 }

                                 if (class283.method5443(var9.field2256) && class199.method3997(var9.field2256) && Login.Login_password.length() < 20) {
                                    Login.Login_password = Login.Login_password + var9.field2256;
                                 }
                              }
                           } while(var15 <= 0);

                           try {
                              String var16 = (String)var39.getTransferData(DataFlavor.stringFlavor);
                              int var17 = Math.min(var15, var16.length());

                              for(int var18 = 0; var18 < var17; ++var18) {
                                 if (!class283.method5443(var16.charAt(var18)) || !class199.method3997(var16.charAt(var18))) {
                                    GrandExchangeOfferOwnWorldComparator.method1171(3);
                                    return;
                                 }
                              }

                              Login.Login_password = Login.Login_password + var16.substring(0, var17);
                           } catch (UnsupportedFlavorException var30) {
                           } catch (IOException var31) {
                           }
                        }
                     } else if (Login.loginIndex == 3) {
                        var10 = Login.loginBoxX + 180;
                        var11 = 276;
                        if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var11 - 20 && var7 <= var11 + 20) {
                           GrandExchangeEvents.method6463(false);
                        }

                        var10 = Login.loginBoxX + 180;
                        var11 = 326;
                        if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var11 - 20 && var7 <= var11 + 20) {
                           MusicPatchNode2.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                           GrandExchangeOfferOwnWorldComparator.method1171(5);
                           return;
                        }
                     } else {
                        int var24;
                        if (Login.loginIndex == 4) {
                           var10 = Login.loginBoxX + 180 - 80;
                           var11 = 321;
                           if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var11 - 20 && var7 <= var11 + 20) {
                              class355.otp.trim();
                              if (class355.otp.length() != 6) {
                                 MusicPatchNode2.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
                                 return;
                              }

                              class360.field4308 = Integer.parseInt(class355.otp);
                              class355.otp = "";
                              SoundCache.method874(true);
                              MusicPatchNode2.setLoginResponseString("", "Connecting to server...", "");
                              class21.updateGameState(20);
                              return;
                           }

                           if (var5 == 1 && var6 >= Login.loginBoxX + 180 - 9 && var6 <= Login.loginBoxX + 180 + 130 && var7 >= 263 && var7 <= 296) {
                              Login.field900 = !Login.field900;
                           }

                           if (var5 == 1 && var6 >= Login.loginBoxX + 180 - 34 && var6 <= Login.loginBoxX + 34 + 180 && var7 >= 351 && var7 <= 363) {
                              UrlRequester.openURL(class135.method2990("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                           }

                           var10 = Login.loginBoxX + 180 + 80;
                           if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var11 - 20 && var7 <= var11 + 20) {
                              GrandExchangeOfferOwnWorldComparator.method1171(0);
                              Login.Login_username = "";
                              Login.Login_password = "";
                              class360.field4308 = 0;
                              class355.otp = "";
                           }

                           while(var9.method3981()) {
                              boolean var12 = false;

                              for(var24 = 0; var24 < "1234567890".length(); ++var24) {
                                 if (var9.field2256 == "1234567890".charAt(var24)) {
                                    var12 = true;
                                    break;
                                 }
                              }

                              if (var9.field2252 == 13) {
                                 GrandExchangeOfferOwnWorldComparator.method1171(0);
                                 Login.Login_username = "";
                                 Login.Login_password = "";
                                 class360.field4308 = 0;
                                 class355.otp = "";
                              } else {
                                 if (var9.field2252 == 85 && class355.otp.length() > 0) {
                                    class355.otp = class355.otp.substring(0, class355.otp.length() - 1);
                                 }

                                 if (var9.field2252 == 84) {
                                    class355.otp.trim();
                                    if (class355.otp.length() != 6) {
                                       MusicPatchNode2.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
                                       return;
                                    }

                                    class360.field4308 = Integer.parseInt(class355.otp);
                                    class355.otp = "";
                                    SoundCache.method874(true);
                                    MusicPatchNode2.setLoginResponseString("", "Connecting to server...", "");
                                    class21.updateGameState(20);
                                    return;
                                 }

                                 if (var12 && class355.otp.length() < 6) {
                                    class355.otp = class355.otp + var9.field2256;
                                 }
                              }
                           }
                        } else {
                           int var25;
                           if (Login.loginIndex == 5) {
                              var10 = Login.loginBoxX + 180 - 80;
                              var11 = 321;
                              if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var11 - 20 && var7 <= var11 + 20) {
                                 class362.method6840();
                                 return;
                              }

                              var10 = Login.loginBoxX + 180 + 80;
                              if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var11 - 20 && var7 <= var11 + 20) {
                                 FriendsChat.Login_promptCredentials(true);
                              }

                              var36 = 361;
                              if (WorldMapID.field2925 != null) {
                                 var24 = WorldMapID.field2925.highX / 2;
                                 if (var5 == 1 && var6 >= WorldMapID.field2925.lowX - var24 && var6 <= var24 + WorldMapID.field2925.lowX && var7 >= var36 - 15 && var7 < var36) {
                                    UrlRequester.openURL(class135.method2990("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                                 }
                              }

                              while(var9.method3981()) {
                                 boolean var41 = false;

                                 for(var25 = 0; var25 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var25) {
                                    if (var9.field2256 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var25)) {
                                       var41 = true;
                                       break;
                                    }
                                 }

                                 if (var9.field2252 == 13) {
                                    FriendsChat.Login_promptCredentials(true);
                                 } else {
                                    if (var9.field2252 == 85 && Login.Login_username.length() > 0) {
                                       Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                                    }

                                    if (var9.field2252 == 84) {
                                       class362.method6840();
                                       return;
                                    }

                                    if (var41 && Login.Login_username.length() < 320) {
                                       Login.Login_username = Login.Login_username + var9.field2256;
                                    }
                                 }
                              }
                           } else if (Login.loginIndex != 6) {
                              if (Login.loginIndex == 7) {
                                 if (ItemContainer.field1020 && !Client.onMobile) {
                                    var10 = Canvas.loginBoxCenter - 150;
                                    var11 = var10 + 40 + 240 + 25;
                                    var36 = 231;
                                    var24 = var36 + 40;
                                    if (var5 == 1 && var6 >= var10 && var6 <= var11 && var7 >= var36 && var7 <= var24) {
                                       Login.field913 = SecureRandomCallable.method2203(var10, var6);
                                    }

                                    var25 = Login.loginBoxX + 180 - 80;
                                    var15 = 321;
                                    boolean var26;
                                    if (var5 == 1 && var6 >= var25 - 75 && var6 <= var25 + 75 && var7 >= var15 - 20 && var7 <= var15 + 20) {
                                       var26 = FloorUnderlayDefinition.method3622();
                                       if (var26) {
                                          class21.updateGameState(50);
                                          return;
                                       }
                                    }

                                    var25 = Login.loginBoxX + 180 + 80;
                                    if (var5 == 1 && var6 >= var25 - 75 && var6 <= var25 + 75 && var7 >= var15 - 20 && var7 <= var15 + 20) {
                                       Login.field914 = new String[8];
                                       FriendsChat.Login_promptCredentials(true);
                                    }

                                    while(var9.method3981()) {
                                       if (var9.field2252 == 101) {
                                          Login.field914[Login.field913] = null;
                                       }

                                       if (var9.field2252 == 85) {
                                          if (Login.field914[Login.field913] == null && Login.field913 > 0) {
                                             --Login.field913;
                                          }

                                          Login.field914[Login.field913] = null;
                                       }

                                       if (var9.field2256 >= '0' && var9.field2256 <= '9') {
                                          Login.field914[Login.field913] = "" + var9.field2256;
                                          if (Login.field913 < 7) {
                                             ++Login.field913;
                                          }
                                       }

                                       if (var9.field2252 == 84) {
                                          var26 = FloorUnderlayDefinition.method3622();
                                          if (var26) {
                                             class21.updateGameState(50);
                                          }

                                          return;
                                       }
                                    }
                                 } else {
                                    var10 = Login.loginBoxX + 180 - 80;
                                    var11 = 321;
                                    if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var11 - 20 && var7 <= var11 + 20) {
                                       UrlRequester.openURL(class135.method2990("secure", true) + "m=dob/set_dob.ws", true, false);
                                       MusicPatchNode2.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                       GrandExchangeOfferOwnWorldComparator.method1171(6);
                                       return;
                                    }

                                    var10 = Login.loginBoxX + 180 + 80;
                                    if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var11 - 20 && var7 <= var11 + 20) {
                                       FriendsChat.Login_promptCredentials(true);
                                    }
                                 }
                              } else if (Login.loginIndex == 8) {
                                 var10 = Login.loginBoxX + 180 - 80;
                                 var37 = 321;
                                 if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var37 - 20 && var7 <= var37 + 20) {
                                    UrlRequester.openURL("https://www.jagex.com/terms/privacy", true, false);
                                    MusicPatchNode2.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                    GrandExchangeOfferOwnWorldComparator.method1171(6);
                                    return;
                                 }

                                 var10 = Login.loginBoxX + 180 + 80;
                                 if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var37 - 20 && var7 <= var37 + 20) {
                                    FriendsChat.Login_promptCredentials(true);
                                 }
                              } else if (Login.loginIndex == 9) {
                                 var10 = Login.loginBoxX + 180;
                                 var37 = 311;
                                 if (var8.field2252 == 84 || var8.field2252 == 13 || var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var37 - 20 && var7 <= var37 + 20) {
                                    GrandExchangeEvents.method6463(false);
                                 }
                              } else if (Login.loginIndex == 10) {
                                 var10 = Login.loginBoxX + 180;
                                 var37 = 209;
                                 if (var8.field2252 == 84 || var5 == 1 && var6 >= var10 - 109 && var6 <= var10 + 109 && var7 >= var37 && var7 <= var37 + 68) {
                                    MusicPatchNode2.setLoginResponseString("", "Connecting to server...", "");
                                    Client.field615 = class467.field4919;
                                    SoundCache.method874(false);
                                    class21.updateGameState(20);
                                 }
                              } else if (Login.loginIndex == 12) {
                                 var10 = Canvas.loginBoxCenter;
                                 var37 = 233;
                                 Bounds var27 = var1.method7001(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var37);
                                 Bounds var13 = var1.method7001(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var37);
                                 Bounds var14 = var1.method7001(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var37);
                                 var11 = var37 + 17;
                                 Bounds var28 = var1.method7001(0, 34, "<col=ffd200>agreement (EULA)</col>.", var10, var11);
                                 if (var5 == 1) {
                                    if (var27.method7574(var6, var7)) {
                                       UrlRequester.openURL("https://www.jagex.com/terms", true, false);
                                    } else if (var13.method7574(var6, var7)) {
                                       UrlRequester.openURL("https://www.jagex.com/terms/privacy", true, false);
                                    } else if (var14.method7574(var6, var7) || var28.method7574(var6, var7)) {
                                       UrlRequester.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                                    }
                                 }

                                 var10 = Canvas.loginBoxCenter - 80;
                                 var37 = 311;
                                 if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var37 - 20 && var7 <= var37 + 20) {
                                    Client.method1726();
                                    GrandExchangeEvents.method6463(true);
                                 }

                                 var10 = Canvas.loginBoxCenter + 80;
                                 if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var37 - 20 && var7 <= var37 + 20) {
                                    Login.loginIndex = 13;
                                 }
                              } else if (Login.loginIndex == 13) {
                                 var10 = Canvas.loginBoxCenter;
                                 var37 = 321;
                                 if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var37 - 20 && var7 <= var37 + 20) {
                                    GrandExchangeEvents.method6463(true);
                                 }
                              } else if (Login.loginIndex == 14) {
                                 String var29 = "";
                                 switch (Login.Login_banType) {
                                    case 0:
                                       var29 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                                       break;
                                    case 1:
                                       var29 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                                       break;
                                    case 2:
                                       var29 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                                       break;
                                    default:
                                       FriendsChat.Login_promptCredentials(false);
                                 }

                                 var11 = Login.loginBoxX + 180;
                                 var36 = 276;
                                 if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var36 - 20 && var7 <= var36 + 20) {
                                    UrlRequester.openURL(var29, true, false);
                                    MusicPatchNode2.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                    GrandExchangeOfferOwnWorldComparator.method1171(6);
                                    return;
                                 }

                                 var11 = Login.loginBoxX + 180;
                                 var36 = 326;
                                 if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var36 - 20 && var7 <= var36 + 20) {
                                    FriendsChat.Login_promptCredentials(false);
                                 }
                              } else if (Login.loginIndex == 24) {
                                 var10 = Login.loginBoxX + 180;
                                 var37 = 301;
                                 if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var37 - 20 && var7 <= var37 + 20) {
                                    GrandExchangeEvents.method6463(false);
                                 }
                              } else if (Login.loginIndex == 26) {
                                 var10 = Login.loginBoxX + 180 - 80;
                                 var37 = 321;
                                 if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var37 - 20 && var7 <= var37 + 20) {
                                    UrlRequester.openURL(class135.method2990("secure", true) + "m=dob/set_dob.ws", true, false);
                                    MusicPatchNode2.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                    GrandExchangeOfferOwnWorldComparator.method1171(6);
                                    return;
                                 }

                                 var10 = Login.loginBoxX + 180 + 80;
                                 if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var37 - 20 && var7 <= var37 + 20) {
                                    FriendsChat.Login_promptCredentials(true);
                                 }
                              }
                           } else {
                              while(true) {
                                 do {
                                    if (!var9.method3981()) {
                                       var35 = 321;
                                       if (var5 == 1 && var7 >= var35 - 20 && var7 <= var35 + 20) {
                                          FriendsChat.Login_promptCredentials(true);
                                       }

                                       return;
                                    }
                                 } while(var9.field2252 != 84 && var9.field2252 != 13);

                                 FriendsChat.Login_promptCredentials(true);
                              }
                           }
                        }
                     }
                  }
               }

            }
         }
      }
   }

   @ObfuscatedName("fc")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "85"
   )
   static final void method8080() {
      Scene.Scene_isLowDetail = false;
      Client.isLowDetail = false;
   }

   @ObfuscatedName("gi")
   @ObfuscatedSignature(
      descriptor = "(Lco;III)V",
      garbageValue = "2015329443"
   )
   @Export("performPlayerAnimation")
   static void performPlayerAnimation(Player var0, int var1, int var2) {
      if (var0.sequence == var1 && var1 != -1) {
         int var3 = WorldMapElement.SequenceDefinition_get(var1).field2232;
         if (var3 == 1) {
            var0.sequenceFrame = 0;
            var0.sequenceFrameCycle = 0;
            var0.sequenceDelay = var2;
            var0.field1210 = 0;
         }

         if (var3 == 2) {
            var0.field1210 = 0;
         }
      } else if (var1 == -1 || var0.sequence == -1 || WorldMapElement.SequenceDefinition_get(var1).field2225 >= WorldMapElement.SequenceDefinition_get(var0.sequence).field2225) {
         var0.sequence = var1;
         var0.sequenceFrame = 0;
         var0.sequenceFrameCycle = 0;
         var0.sequenceDelay = var2;
         var0.field1210 = 0;
         var0.field1211 = var0.pathLength;
      }

   }

   @ObfuscatedName("lz")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1202961922"
   )
   @Export("FriendSystem_invalidateIgnoreds")
   static final void FriendSystem_invalidateIgnoreds() {
      SoundCache.method878();
      if (MenuAction.friendsChat != null) {
         MenuAction.friendsChat.invalidateIgnoreds();
      }

   }
}
