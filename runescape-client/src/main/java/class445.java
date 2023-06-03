import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rg")
public abstract class class445 implements class279 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lsw;"
   )
   class490 field4714;

   class445(int var1) {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;II)V",
      garbageValue = "-1438020298"
   )
   abstract void vmethod8212(Buffer var1, int var2);

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ltz;B)V",
      garbageValue = "-62"
   )
   public void method8211(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         class441[] var3 = new class441[]{class441.field4704, class441.field4706, class441.field4705, class441.field4702};
         class441 var4 = (class441)GameObject.findEnumerated(var3, var2);
         if (var4 != null) {
            switch (var4.field4703) {
               case 0:
                  var1.readStringCp1252NullCircumfixed();
                  break;
               case 1:
                  int var6 = var1.readUnsignedByte();
                  this.field4714 = WorldMapRectangle.method5458(var6);
                  if (this.field4714 != null) {
                     break;
                  }

                  throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6);
               case 2:
               default:
                  throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
               case 3:
                  class350[] var5 = new class350[]{class350.field4192, class350.field4190, class350.field4195, class350.field4193};
                  GameObject.findEnumerated(var5, var1.readUnsignedByte());
            }
         } else {
            this.vmethod8212(var1, var2);
         }
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1820418420"
   )
   boolean method8213() {
      return this.field4714 != null;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/Object;",
      garbageValue = "1"
   )
   Object method8214() {
      if (this.field4714 == class490.field4973) {
         return 0;
      } else if (this.field4714 == class490.field4972) {
         return -1L;
      } else {
         return this.field4714 == class490.field4976 ? "" : null;
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lba;Lph;Lph;I)V",
      garbageValue = "196820122"
   )
   @Export("loginScreen")
   static void loginScreen(GameEngine var0, Font var1, Font var2) {
      if (Login.worldSelectOpen) {
         class11.method105(var0);
      } else {
         int var5;
         if ((MouseHandler.MouseHandler_lastButton == 1 || !class305.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
            class10.clientPreferences.method2436(!class10.clientPreferences.method2437());
            if (!class10.clientPreferences.method2437()) {
               Archive var3 = ReflectionCheck.archive6;
               if (var3.isValidFileName("scape main", "")) {
                  int var4 = var3.getGroupId("scape main");
                  var5 = var3.getFileId(var4, "");
                  class368.method6892(var3, var4, var5, 255, false);
               }
            } else {
               class304.midiPcmStream.clear();
               class304.musicPlayerStatus = 1;
               UserComparator9.musicTrackArchive = null;
            }
         }

         if (Client.gameState != 5) {
            if (Login.field949 == -1L) {
               Login.field949 = BoundaryObject.method5027() + 1000L;
            }

            long var23 = BoundaryObject.method5027();
            if (class142.method3125() && -1L == Login.field930) {
               Login.field930 = var23;
               if (Login.field930 > Login.field949) {
                  Login.field949 = Login.field930;
               }
            }

            if (Client.gameState == 10 || Client.gameState == 11) {
               int var6;
               int var7;
               if (Language.Language_EN == TriBool.clientLanguage) {
                  if (MouseHandler.MouseHandler_lastButton == 1 || !class305.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
                     var5 = Login.xPadding + 5;
                     var6 = 463;
                     var7 = 100;
                     byte var8 = 35;
                     if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var7 + var5 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var6 + var8) {
                        if (class497.loadWorlds()) {
                           Login.worldSelectOpen = true;
                           Login.worldSelectPage = 0;
                           Login.worldSelectPagesCount = 0;
                        }

                        return;
                     }
                  }

                  if (World.World_request != null && class497.loadWorlds()) {
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

               if (!class305.mouseCam && var5 == 4) {
                  var5 = 1;
               }

               class211 var25 = class350.method6624();
               int var10;
               short var44;
               if (Login.loginIndex == 0) {
                  boolean var51 = false;

                  while(var25.method4133()) {
                     if (var25.field2349 == 84) {
                        var51 = true;
                     }
                  }

                  var10 = class485.loginBoxCenter - 80;
                  var44 = 291;
                  if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var44 - 20 && var7 <= var44 + 20) {
                     class27.openURL(Widget.method6509("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                  }

                  var10 = class485.loginBoxCenter + 80;
                  if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var44 - 20 && var7 <= var44 + 20 || var51) {
                     if ((Client.worldProperties & 33554432) != 0) {
                        Login.Login_response0 = "";
                        Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                        Login.Login_response2 = "Your normal account will not be affected.";
                        Login.Login_response3 = "";
                        class390.method7249(1);
                        WorldMapSectionType.method5418();
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
                        class390.method7249(1);
                        WorldMapSectionType.method5418();
                     } else if ((Client.worldProperties & 1024) != 0) {
                        Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                        Login.Login_response2 = "The Protect Item prayer will";
                        Login.Login_response3 = "not work on this world.";
                        Login.Login_response0 = "Warning!";
                        class390.method7249(1);
                        WorldMapSectionType.method5418();
                     } else {
                        ViewportMouse.Login_promptCredentials(false);
                     }
                  }
               } else {
                  int var9;
                  short var45;
                  if (Login.loginIndex == 1) {
                     while(true) {
                        if (!var25.method4133()) {
                           var9 = class485.loginBoxCenter - 80;
                           var45 = 321;
                           if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var45 - 20 && var7 <= var45 + 20) {
                              ViewportMouse.Login_promptCredentials(false);
                           }

                           var9 = class485.loginBoxCenter + 80;
                           if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var45 - 20 && var7 <= var45 + 20) {
                              class390.method7249(0);
                           }
                           break;
                        }

                        if (var25.field2349 == 84) {
                           ViewportMouse.Login_promptCredentials(false);
                        } else if (var25.field2349 == 13) {
                           class390.method7249(0);
                        }
                     }
                  } else {
                     int var13;
                     int var14;
                     int var21;
                     short var43;
                     boolean var46;
                     if (Login.loginIndex == 2) {
                        var43 = 201;
                        var9 = var43 + 52;
                        if (var5 == 1 && var7 >= var9 - 12 && var7 < var9 + 2) {
                           Login.currentLoginField = 0;
                        }

                        var9 += 15;
                        if (var5 == 1 && var7 >= var9 - 12 && var7 < var9 + 2) {
                           Login.currentLoginField = 1;
                        }

                        var9 += 15;
                        var43 = 361;
                        if (FriendsList.field4572 != null) {
                           var10 = FriendsList.field4572.highX / 2;
                           if (var5 == 1 && var6 >= FriendsList.field4572.lowX - var10 && var6 <= var10 + FriendsList.field4572.lowX && var7 >= var43 - 15 && var7 < var43) {
                              switch (Login.field929) {
                                 case 1:
                                    class478.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                                    class390.method7249(5);
                                    return;
                                 case 2:
                                    class27.openURL("https://support.runescape.com/hc/en-gb", true, false);
                              }
                           }
                        }

                        var10 = class485.loginBoxCenter - 80;
                        var44 = 321;
                        if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var44 - 20 && var7 <= var44 + 20) {
                           Login.Login_username = Login.Login_username.trim();
                           if (Login.Login_username.length() == 0) {
                              class478.setLoginResponseString("", "Please enter your username/email address.", "");
                              return;
                           }

                           if (Login.Login_password.length() == 0) {
                              class478.setLoginResponseString("", "Please enter your password.", "");
                              return;
                           }

                           class478.setLoginResponseString("", "Connecting to server...", "");
                           class152.method3194(false);
                           UserComparator8.updateGameState(20);
                           return;
                        }

                        var10 = Login.loginBoxX + 180 + 80;
                        if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var44 - 20 && var7 <= var44 + 20) {
                           class390.method7249(0);
                           Login.Login_username = "";
                           Login.Login_password = "";
                           class322.field3521 = 0;
                           SoundSystem.otp = "";
                           Login.field942 = true;
                        }

                        var10 = class485.loginBoxCenter + -117;
                        var44 = 277;
                        Login.field947 = var6 >= var10 && var6 < var10 + class251.field2858 && var7 >= var44 && var7 < var44 + class60.field443;
                        if (var5 == 1 && Login.field947) {
                           Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
                           if (!Client.Login_isUsernameRemembered && class10.clientPreferences.method2529() != null) {
                              class10.clientPreferences.method2432((String)null);
                           }
                        }

                        var10 = class485.loginBoxCenter + 24;
                        var44 = 277;
                        Login.field941 = var6 >= var10 && var6 < var10 + class251.field2858 && var7 >= var44 && var7 < var44 + class60.field443;
                        if (var5 == 1 && Login.field941) {
                           class10.clientPreferences.method2524(!class10.clientPreferences.method2472());
                           if (!class10.clientPreferences.method2472()) {
                              Login.Login_username = "";
                              class10.clientPreferences.method2432((String)null);
                              WorldMapSectionType.method5418();
                           }
                        }

                        label1388:
                        while(true) {
                           Transferable var57;
                           do {
                              while(true) {
                                 label1327:
                                 do {
                                    while(true) {
                                       while(var25.method4133()) {
                                          if (var25.field2349 != 13) {
                                             if (Login.currentLoginField != 0) {
                                                continue label1327;
                                             }

                                             char var47 = var25.field2348;

                                             for(var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var47 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13); ++var13) {
                                             }

                                             if (var25.field2349 == 85 && Login.Login_username.length() > 0) {
                                                Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                                             }

                                             if (var25.field2349 == 84 || var25.field2349 == 80) {
                                                Login.currentLoginField = 1;
                                             }

                                             var14 = var25.field2348;
                                             boolean var48 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var14) != -1;
                                             if (var48 && Login.Login_username.length() < 320) {
                                                Login.Login_username = Login.Login_username + var25.field2348;
                                             }
                                          } else {
                                             class390.method7249(0);
                                             Login.Login_username = "";
                                             Login.Login_password = "";
                                             class322.field3521 = 0;
                                             SoundSystem.otp = "";
                                             Login.field942 = true;
                                          }
                                       }

                                       return;
                                    }
                                 } while(Login.currentLoginField != 1);

                                 if (var25.field2349 == 85 && Login.Login_password.length() > 0) {
                                    Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
                                 } else if (var25.field2349 == 84 || var25.field2349 == 80) {
                                    Login.currentLoginField = 0;
                                    if (var25.field2349 == 84) {
                                       Login.Login_username = Login.Login_username.trim();
                                       if (Login.Login_username.length() == 0) {
                                          class478.setLoginResponseString("", "Please enter your username/email address.", "");
                                          return;
                                       }

                                       if (Login.Login_password.length() == 0) {
                                          class478.setLoginResponseString("", "Please enter your password.", "");
                                          return;
                                       }

                                       class478.setLoginResponseString("", "Connecting to server...", "");
                                       class152.method3194(false);
                                       UserComparator8.updateGameState(20);
                                       return;
                                    }
                                 }

                                 if ((var25.method4134(82) || var25.method4134(87)) && var25.field2349 == 67) {
                                    Clipboard var56 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var57 = var56.getContents(class347.client);
                                    var14 = 20 - Login.Login_password.length();
                                    break;
                                 }

                                 if (ClanChannelMember.method3135(var25.field2348)) {
                                    char var49 = var25.field2348;
                                    var46 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var49) != -1;
                                    if (var46 && Login.Login_password.length() < 20) {
                                       Login.Login_password = Login.Login_password + var25.field2348;
                                    }
                                 }
                              }
                           } while(var14 <= 0);

                           try {
                              String var15 = (String)var57.getTransferData(DataFlavor.stringFlavor);
                              int var16 = Math.min(var14, var15.length());
                              int var50 = 0;

                              while(true) {
                                 if (var50 >= var16) {
                                    Login.Login_password = Login.Login_password + var15.substring(0, var16);
                                    continue label1388;
                                 }

                                 char var52 = var15.charAt(var50);
                                 boolean var18;
                                 if (var52 >= ' ' && var52 < 127 || var52 > 127 && var52 < 160 || var52 > 160 && var52 <= 255) {
                                    var18 = true;
                                 } else {
                                    label1528: {
                                       if (var52 != 0) {
                                          char[] var54 = class382.cp1252AsciiExtension;

                                          for(var21 = 0; var21 < var54.length; ++var21) {
                                             char var22 = var54[var21];
                                             if (var22 == var52) {
                                                var18 = true;
                                                break label1528;
                                             }
                                          }
                                       }

                                       var18 = false;
                                    }
                                 }

                                 if (!var18) {
                                    break;
                                 }

                                 char var55 = var15.charAt(var50);
                                 boolean var28 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var55) != -1;
                                 if (!var28) {
                                    break;
                                 }

                                 ++var50;
                              }

                              class390.method7249(3);
                              return;
                           } catch (UnsupportedFlavorException var41) {
                           } catch (IOException var42) {
                           }
                        }
                     } else {
                        Bounds var29;
                        if (Login.loginIndex == 3) {
                           var9 = Login.loginBoxX + 180;
                           var10 = 241;
                           var29 = var1.method7425(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var9, var10);
                           if (var5 == 1 && var29.method8029(var6, var7)) {
                              class27.openURL("https://oldschool.runescape.com/launcher", true, false);
                           }

                           var9 = Login.loginBoxX + 180;
                           var10 = 276;
                           if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var10 - 20 && var7 <= var10 + 20) {
                              class164.method3362(false);
                           }

                           var9 = Login.loginBoxX + 180;
                           var10 = 326;
                           if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var10 - 20 && var7 <= var10 + 20) {
                              class478.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                              class390.method7249(5);
                              return;
                           }
                        } else {
                           int var12;
                           if (Login.loginIndex == 4) {
                              var9 = Login.loginBoxX + 180 - 80;
                              var10 = 321;
                              if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var10 - 20 && var7 <= var10 + 20) {
                                 SoundSystem.otp.trim();
                                 if (SoundSystem.otp.length() != 6) {
                                    class478.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
                                    return;
                                 }

                                 class322.field3521 = Integer.parseInt(SoundSystem.otp);
                                 SoundSystem.otp = "";
                                 class152.method3194(true);
                                 class478.setLoginResponseString("", "Connecting to server...", "");
                                 UserComparator8.updateGameState(20);
                                 return;
                              }

                              if (var5 == 1 && var6 >= Login.loginBoxX + 180 - 9 && var6 <= Login.loginBoxX + 180 + 130 && var7 >= 263 && var7 <= 296) {
                                 Login.field942 = !Login.field942;
                              }

                              if (var5 == 1 && var6 >= Login.loginBoxX + 180 - 34 && var6 <= Login.loginBoxX + 34 + 180 && var7 >= 351 && var7 <= 363) {
                                 class27.openURL(Widget.method6509("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                              }

                              var9 = Login.loginBoxX + 180 + 80;
                              if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var10 - 20 && var7 <= var10 + 20) {
                                 class390.method7249(0);
                                 Login.Login_username = "";
                                 Login.Login_password = "";
                                 class322.field3521 = 0;
                                 SoundSystem.otp = "";
                              }

                              while(var25.method4133()) {
                                 boolean var11 = false;

                                 for(var12 = 0; var12 < "1234567890".length(); ++var12) {
                                    if (var25.field2348 == "1234567890".charAt(var12)) {
                                       var11 = true;
                                       break;
                                    }
                                 }

                                 if (var25.field2349 == 13) {
                                    class390.method7249(0);
                                    Login.Login_username = "";
                                    Login.Login_password = "";
                                    class322.field3521 = 0;
                                    SoundSystem.otp = "";
                                 } else {
                                    if (var25.field2349 == 85 && SoundSystem.otp.length() > 0) {
                                       SoundSystem.otp = SoundSystem.otp.substring(0, SoundSystem.otp.length() - 1);
                                    }

                                    if (var25.field2349 == 84) {
                                       SoundSystem.otp.trim();
                                       if (SoundSystem.otp.length() != 6) {
                                          class478.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
                                          return;
                                       }

                                       class322.field3521 = Integer.parseInt(SoundSystem.otp);
                                       SoundSystem.otp = "";
                                       class152.method3194(true);
                                       class478.setLoginResponseString("", "Connecting to server...", "");
                                       UserComparator8.updateGameState(20);
                                       return;
                                    }

                                    if (var11 && SoundSystem.otp.length() < 6) {
                                       SoundSystem.otp = SoundSystem.otp + var25.field2348;
                                    }
                                 }
                              }
                           } else if (Login.loginIndex == 5) {
                              var9 = Login.loginBoxX + 180 - 80;
                              var10 = 321;
                              if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var10 - 20 && var7 <= var10 + 20) {
                                 class489.method8753();
                                 return;
                              }

                              var9 = Login.loginBoxX + 180 + 80;
                              if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var10 - 20 && var7 <= var10 + 20) {
                                 ViewportMouse.Login_promptCredentials(true);
                              }

                              var44 = 361;
                              if (Calendar.field3770 != null) {
                                 var12 = Calendar.field3770.highX / 2;
                                 if (var5 == 1 && var6 >= Calendar.field3770.lowX - var12 && var6 <= var12 + Calendar.field3770.lowX && var7 >= var44 - 15 && var7 < var44) {
                                    class27.openURL(Widget.method6509("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                                 }
                              }

                              while(var25.method4133()) {
                                 var46 = false;

                                 for(var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var13) {
                                    if (var25.field2348 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13)) {
                                       var46 = true;
                                       break;
                                    }
                                 }

                                 if (var25.field2349 == 13) {
                                    ViewportMouse.Login_promptCredentials(true);
                                 } else {
                                    if (var25.field2349 == 85 && Login.Login_username.length() > 0) {
                                       Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                                    }

                                    if (var25.field2349 == 84) {
                                       class489.method8753();
                                       return;
                                    }

                                    if (var46 && Login.Login_username.length() < 320) {
                                       Login.Login_username = Login.Login_username + var25.field2348;
                                    }
                                 }
                              }
                           } else if (Login.loginIndex != 6) {
                              if (Login.loginIndex == 7) {
                                 if (class112.field1401 && !Client.onMobile) {
                                    var9 = class485.loginBoxCenter - 150;
                                    var10 = var9 + 40 + 240 + 25;
                                    var44 = 231;
                                    var12 = var44 + 40;
                                    if (var5 == 1 && var6 >= var9 && var6 <= var10 && var7 >= var44 && var7 <= var12) {
                                       Login.field935 = ArchiveLoader.method2220(var9, var6);
                                    }

                                    var13 = Login.loginBoxX + 180 - 80;
                                    var14 = 321;
                                    boolean var17;
                                    boolean var19;
                                    String[] var20;
                                    SimpleDateFormat var30;
                                    StringBuilder var31;
                                    String var32;
                                    Date var33;
                                    Date var34;
                                    boolean var35;
                                    java.util.Calendar var36;
                                    Date var53;
                                    java.util.Calendar var58;
                                    Date var59;
                                    if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var14 - 20 && var7 <= var14 + 20) {
                                       label1222: {
                                          try {
                                             var30 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                             var30.setLenient(false);
                                             var31 = new StringBuilder();
                                             var20 = Login.field938;
                                             var21 = 0;

                                             while(true) {
                                                if (var21 < var20.length) {
                                                   var32 = var20[var21];
                                                   if (var32 != null) {
                                                      var31.append(var32);
                                                      ++var21;
                                                      continue;
                                                   }

                                                   class390.method7249(7);
                                                   class478.setLoginResponseString("Date not valid.", "Please ensure all characters are populated.", "");
                                                   var33 = null;
                                                } else {
                                                   var31.append("12");
                                                   var33 = var30.parse(var31.toString());
                                                }

                                                var34 = var33;
                                                break;
                                             }
                                          } catch (ParseException var40) {
                                             class390.method7249(7);
                                             class478.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                             var35 = false;
                                             break label1222;
                                          }

                                          if (var34 == null) {
                                             var35 = false;
                                          } else {
                                             var58 = java.util.Calendar.getInstance();
                                             var58.set(1, var58.get(1) - 13);
                                             var58.set(5, var58.get(5) + 1);
                                             var58.set(11, 0);
                                             var58.set(12, 0);
                                             var58.set(13, 0);
                                             var58.set(14, 0);
                                             var59 = var58.getTime();
                                             var17 = var34.before(var59);
                                             var36 = java.util.Calendar.getInstance();
                                             var36.set(2, 0);
                                             var36.set(5, 1);
                                             var36.set(1, 1900);
                                             var53 = var36.getTime();
                                             var19 = var34.after(var53);
                                             if (!var19) {
                                                class390.method7249(7);
                                                class478.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                var35 = false;
                                             } else {
                                                if (!var17) {
                                                   GameObject.field2850 = 8388607;
                                                } else {
                                                   GameObject.field2850 = (int)(var34.getTime() / 86400000L - 11745L);
                                                }

                                                var35 = true;
                                             }
                                          }
                                       }

                                       if (var35) {
                                          UserComparator8.updateGameState(50);
                                          return;
                                       }
                                    }

                                    var13 = Login.loginBoxX + 180 + 80;
                                    if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var14 - 20 && var7 <= var14 + 20) {
                                       Login.field938 = new String[8];
                                       ViewportMouse.Login_promptCredentials(true);
                                    }

                                    while(var25.method4133()) {
                                       if (var25.field2349 == 101) {
                                          Login.field938[Login.field935] = null;
                                       }

                                       if (var25.field2349 == 85) {
                                          if (Login.field938[Login.field935] == null && Login.field935 > 0) {
                                             --Login.field935;
                                          }

                                          Login.field938[Login.field935] = null;
                                       }

                                       if (var25.field2348 >= '0' && var25.field2348 <= '9') {
                                          Login.field938[Login.field935] = "" + var25.field2348;
                                          if (Login.field935 < 7) {
                                             ++Login.field935;
                                          }
                                       }

                                       if (var25.field2349 == 84) {
                                          label1151: {
                                             try {
                                                var30 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                                var30.setLenient(false);
                                                var31 = new StringBuilder();
                                                var20 = Login.field938;
                                                var21 = 0;

                                                while(true) {
                                                   if (var21 >= var20.length) {
                                                      var31.append("12");
                                                      var33 = var30.parse(var31.toString());
                                                      break;
                                                   }

                                                   var32 = var20[var21];
                                                   if (var32 == null) {
                                                      class390.method7249(7);
                                                      class478.setLoginResponseString("Date not valid.", "Please ensure all characters are populated.", "");
                                                      var33 = null;
                                                      break;
                                                   }

                                                   var31.append(var32);
                                                   ++var21;
                                                }

                                                var34 = var33;
                                             } catch (ParseException var39) {
                                                class390.method7249(7);
                                                class478.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                var35 = false;
                                                break label1151;
                                             }

                                             if (var34 == null) {
                                                var35 = false;
                                             } else {
                                                var58 = java.util.Calendar.getInstance();
                                                var58.set(1, var58.get(1) - 13);
                                                var58.set(5, var58.get(5) + 1);
                                                var58.set(11, 0);
                                                var58.set(12, 0);
                                                var58.set(13, 0);
                                                var58.set(14, 0);
                                                var59 = var58.getTime();
                                                var17 = var34.before(var59);
                                                var36 = java.util.Calendar.getInstance();
                                                var36.set(2, 0);
                                                var36.set(5, 1);
                                                var36.set(1, 1900);
                                                var53 = var36.getTime();
                                                var19 = var34.after(var53);
                                                if (!var19) {
                                                   class390.method7249(7);
                                                   class478.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                   var35 = false;
                                                } else {
                                                   if (!var17) {
                                                      GameObject.field2850 = 8388607;
                                                   } else {
                                                      GameObject.field2850 = (int)(var34.getTime() / 86400000L - 11745L);
                                                   }

                                                   var35 = true;
                                                }
                                             }
                                          }

                                          if (var35) {
                                             UserComparator8.updateGameState(50);
                                          }

                                          return;
                                       }
                                    }
                                 } else {
                                    var9 = Login.loginBoxX + 180 - 80;
                                    var10 = 321;
                                    if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var10 - 20 && var7 <= var10 + 20) {
                                       class27.openURL(Widget.method6509("secure", true) + "m=dob/set_dob.ws", true, false);
                                       class478.setLoginResponseString("", "Page has opened in the browser.", "");
                                       class390.method7249(6);
                                       return;
                                    }

                                    var9 = Login.loginBoxX + 180 + 80;
                                    if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var10 - 20 && var7 <= var10 + 20) {
                                       ViewportMouse.Login_promptCredentials(true);
                                    }
                                 }
                              } else if (Login.loginIndex == 8) {
                                 var9 = Login.loginBoxX + 180 - 80;
                                 var45 = 321;
                                 if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var45 - 20 && var7 <= var45 + 20) {
                                    class27.openURL("https://www.jagex.com/terms/privacy", true, false);
                                    class478.setLoginResponseString("", "Page has opened in the browser.", "");
                                    class390.method7249(6);
                                    return;
                                 }

                                 var9 = Login.loginBoxX + 180 + 80;
                                 if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var45 - 20 && var7 <= var45 + 20) {
                                    ViewportMouse.Login_promptCredentials(true);
                                 }
                              } else if (Login.loginIndex == 9) {
                                 var9 = Login.loginBoxX + 180;
                                 var45 = 311;
                                 if (var25.field2349 == 84 || var25.field2349 == 13 || var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var45 - 20 && var7 <= var45 + 20) {
                                    class164.method3362(false);
                                 }
                              } else if (Login.loginIndex == 10) {
                                 var9 = Login.loginBoxX + 180;
                                 var45 = 209;
                                 if (var25.field2349 == 84 || var5 == 1 && var6 >= var9 - 109 && var6 <= var9 + 109 && var7 >= var45 && var7 <= var45 + 68) {
                                    class478.setLoginResponseString("", "Connecting to server...", "");
                                    Client.field633 = class505.field5073;
                                    class152.method3194(false);
                                    UserComparator8.updateGameState(20);
                                 }
                              } else if (Login.loginIndex == 12) {
                                 var9 = class485.loginBoxCenter;
                                 var45 = 233;
                                 var29 = var2.method7425(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var45);
                                 Bounds var26 = var2.method7425(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var45);
                                 Bounds var27 = var2.method7425(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var45);
                                 var10 = var45 + 17;
                                 Bounds var37 = var2.method7425(0, 34, "<col=ffd200>agreement (EULA)</col>.", var9, var10);
                                 if (var5 == 1) {
                                    if (var29.method8029(var6, var7)) {
                                       class27.openURL("https://www.jagex.com/terms", true, false);
                                    } else if (var26.method8029(var6, var7)) {
                                       class27.openURL("https://www.jagex.com/terms/privacy", true, false);
                                    } else if (var27.method8029(var6, var7) || var37.method8029(var6, var7)) {
                                       class27.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                                    }
                                 }

                                 var9 = class485.loginBoxCenter - 80;
                                 var45 = 311;
                                 if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var45 - 20 && var7 <= var45 + 20) {
                                    class10.clientPreferences.method2466(Client.field508);
                                    class164.method3362(true);
                                 }

                                 var9 = class485.loginBoxCenter + 80;
                                 if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var45 - 20 && var7 <= var45 + 20) {
                                    Login.loginIndex = 13;
                                 }
                              } else if (Login.loginIndex == 13) {
                                 var9 = class485.loginBoxCenter;
                                 var45 = 321;
                                 if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var45 - 20 && var7 <= var45 + 20) {
                                    class164.method3362(true);
                                 }
                              } else if (Login.loginIndex == 14) {
                                 String var38 = "";
                                 switch (Login.Login_banType) {
                                    case 0:
                                       var38 = "https://secure.runescape.com/m=offence-appeal/account-history";
                                       break;
                                    case 1:
                                       var38 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                                       break;
                                    case 2:
                                       var38 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                                       break;
                                    default:
                                       ViewportMouse.Login_promptCredentials(false);
                                 }

                                 var10 = Login.loginBoxX + 180;
                                 var44 = 276;
                                 if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var44 - 20 && var7 <= var44 + 20) {
                                    class27.openURL(var38, true, false);
                                    class478.setLoginResponseString("", "Page has opened in the browser.", "");
                                    class390.method7249(6);
                                    return;
                                 }

                                 var10 = Login.loginBoxX + 180;
                                 var44 = 326;
                                 if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var44 - 20 && var7 <= var44 + 20) {
                                    ViewportMouse.Login_promptCredentials(false);
                                 }
                              } else if (Login.loginIndex == 24) {
                                 var9 = Login.loginBoxX + 180;
                                 var45 = 301;
                                 if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var45 - 20 && var7 <= var45 + 20) {
                                    class164.method3362(false);
                                 }
                              } else if (Login.loginIndex == 32) {
                                 var9 = Login.loginBoxX + 180 - 80;
                                 var45 = 321;
                                 if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var45 - 20 && var7 <= var45 + 20) {
                                    class27.openURL(Widget.method6509("secure", true) + "m=dob/set_dob.ws", true, false);
                                    class478.setLoginResponseString("", "Page has opened in the browser.", "");
                                    class390.method7249(6);
                                    return;
                                 }

                                 var9 = Login.loginBoxX + 180 + 80;
                                 if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var45 - 20 && var7 <= var45 + 20) {
                                    ViewportMouse.Login_promptCredentials(true);
                                 }
                              } else if (Login.loginIndex == 33) {
                                 var9 = Login.loginBoxX + 180;
                                 var45 = 276;
                                 if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var45 - 20 && var7 <= var45 + 20) {
                                    class27.openURL("https://oldschool.runescape.com/launcher", true, false);
                                 }

                                 var9 = Login.loginBoxX + 180;
                                 var45 = 326;
                                 if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var45 - 20 && var7 <= var45 + 20) {
                                    ViewportMouse.Login_promptCredentials(true);
                                 }
                              }
                           } else {
                              while(true) {
                                 do {
                                    if (!var25.method4133()) {
                                       var43 = 321;
                                       if (var5 == 1 && var7 >= var43 - 20 && var7 <= var43 + 20) {
                                          ViewportMouse.Login_promptCredentials(true);
                                       }

                                       return;
                                    }
                                 } while(var25.field2349 != 84 && var25.field2349 != 13);

                                 ViewportMouse.Login_promptCredentials(true);
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
}
