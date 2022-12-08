import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
@Implements("PlayerCompositionColorTextureOverride")
public class PlayerCompositionColorTextureOverride {
   @ObfuscatedName("v")
   @Export("playerCompositionRecolorTo")
   public short[] playerCompositionRecolorTo;
   @ObfuscatedName("x")
   @Export("playerCompositionRetextureTo")
   public short[] playerCompositionRetextureTo;

   public PlayerCompositionColorTextureOverride(int var1) {
      ItemComposition var2 = NPCComposition.ItemDefinition_get(var1);
      if (var2.method3963()) {
         this.playerCompositionRecolorTo = new short[var2.recolorTo.length];
         System.arraycopy(var2.recolorTo, 0, this.playerCompositionRecolorTo, 0, this.playerCompositionRecolorTo.length);
      }

      if (var2.method3941()) {
         this.playerCompositionRetextureTo = new short[var2.retextureTo.length];
         System.arraycopy(var2.retextureTo, 0, this.playerCompositionRetextureTo, 0, this.playerCompositionRetextureTo.length);
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1790788447"
   )
   @Export("getVarbit")
   public static int getVarbit(int var0) {
      VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
      VarbitComposition var1;
      if (var2 != null) {
         var1 = var2;
      } else {
         byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
         var2 = new VarbitComposition();
         if (var3 != null) {
            var2.decode(new Buffer(var3));
         }

         VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0);
         var1 = var2;
      }

      int var7 = var1.baseVar;
      int var4 = var1.startBit;
      int var5 = var1.endBit;
      int var6 = Varps.Varps_masks[var5 - var4];
      return Varps.Varps_main[var7] >> var4 & var6;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)Lkd;",
      garbageValue = "1101221337"
   )
   @Export("getWidget")
   public static Widget getWidget(int var0) {
      int var1 = var0 >> 16;
      int var2 = var0 & '\uffff';
      if (class71.Widget_interfaceComponents[var1] == null || class71.Widget_interfaceComponents[var1][var2] == null) {
         boolean var3 = Players.loadInterface(var1);
         if (!var3) {
            return null;
         }
      }

      return class71.Widget_interfaceComponents[var1][var2];
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lan;Lnv;B)V",
      garbageValue = "0"
   )
   @Export("loginScreen")
   static void loginScreen(GameEngine var0, Font var1) {
      int var4;
      int var5;
      int var6;
      int var7;
      if (Login.worldSelectOpen) {
         class201 var80 = Client.field747;
         class201 var3 = var80;

         while(true) {
            if (!var3.method4114()) {
               if (MouseHandler.MouseHandler_lastButton != 1 && (SceneTilePaint.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) {
                  break;
               }

               var4 = Login.xPadding + 280;
               if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                  class9.changeWorldSelectSorting(0, 0);
                  break;
               }

               if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                  class9.changeWorldSelectSorting(0, 1);
                  break;
               }

               var5 = Login.xPadding + 390;
               if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                  class9.changeWorldSelectSorting(1, 0);
                  break;
               }

               if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                  class9.changeWorldSelectSorting(1, 1);
                  break;
               }

               var6 = Login.xPadding + 500;
               if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var6 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                  class9.changeWorldSelectSorting(2, 0);
                  break;
               }

               if (MouseHandler.MouseHandler_lastPressedX >= var6 + 15 && MouseHandler.MouseHandler_lastPressedX <= var6 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                  class9.changeWorldSelectSorting(2, 1);
                  break;
               }

               var7 = Login.xPadding + 610;
               if (MouseHandler.MouseHandler_lastPressedX >= var7 && MouseHandler.MouseHandler_lastPressedX <= var7 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                  class9.changeWorldSelectSorting(3, 0);
                  break;
               }

               if (MouseHandler.MouseHandler_lastPressedX >= var7 + 15 && MouseHandler.MouseHandler_lastPressedX <= var7 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                  class9.changeWorldSelectSorting(3, 1);
                  break;
               }

               if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
                  Login.worldSelectOpen = false;
                  SecureRandomCallable.leftTitleSprite.drawAt(Login.xPadding, 0);
                  class9.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
                  Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
                  break;
               }

               if (Login.hoveredWorldIndex != -1) {
                  World var81 = World.World_worlds[Login.hoveredWorldIndex];
                  UserComparator6.changeWorld(var81);
                  Login.worldSelectOpen = false;
                  SecureRandomCallable.leftTitleSprite.drawAt(Login.xPadding, 0);
                  class9.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
                  Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
               } else {
                  if (Login.worldSelectPage > 0 && BufferedNetSocket.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= BufferedNetSocket.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= Language.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= Language.canvasHeight / 2 + 50) {
                     --Login.worldSelectPage;
                  }

                  if (Login.worldSelectPage < Login.worldSelectPagesCount && class140.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= CollisionMap.canvasWidth - class140.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= CollisionMap.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= Language.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= Language.canvasHeight / 2 + 50) {
                     ++Login.worldSelectPage;
                  }
               }
               break;
            }

            if (var3.field2328 == 13) {
               Login.worldSelectOpen = false;
               SecureRandomCallable.leftTitleSprite.drawAt(Login.xPadding, 0);
               class9.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
               Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
               break;
            }

            if (var3.field2328 == 96) {
               if (Login.worldSelectPage > 0 && BufferedNetSocket.worldSelectLeftSprite != null) {
                  --Login.worldSelectPage;
               }
            } else if (var3.field2328 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class140.worldSelectRightSprite != null) {
               ++Login.worldSelectPage;
            }
         }

      } else {
         if ((MouseHandler.MouseHandler_lastButton == 1 || !SceneTilePaint.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
            StructComposition.clientPreferences.method2448(!StructComposition.clientPreferences.method2428());
            if (!StructComposition.clientPreferences.method2428()) {
               Archive var2 = class162.archive6;
               int var35 = var2.getGroupId("scape main");
               var4 = var2.getFileId(var35, "");
               class29.method426(var2, var35, var4, 255, false);
            } else {
               class6.method39();
            }
         }

         if (Client.gameState != 5) {
            if (-1L == Login.field937) {
               Login.field937 = Message.method1197() + 1000L;
            }

            long var36 = Message.method1197();
            if (HitSplatDefinition.method3824() && Login.field950 == -1L) {
               Login.field950 = var36;
               if (Login.field950 > Login.field937) {
                  Login.field937 = Login.field950;
               }
            }

            if (Client.gameState == 10 || Client.gameState == 11) {
               if (Language.Language_EN == class173.clientLanguage) {
                  if (MouseHandler.MouseHandler_lastButton == 1 || !SceneTilePaint.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
                     var4 = Login.xPadding + 5;
                     var5 = 463;
                     var6 = 100;
                     var7 = 35;
                     if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + var6 && MouseHandler.MouseHandler_lastPressedY >= var5 && MouseHandler.MouseHandler_lastPressedY <= var5 + var7) {
                        WorldMapSection0.method5228();
                        return;
                     }
                  }

                  if (class1.World_request != null) {
                     WorldMapSection0.method5228();
                  }
               }

               var4 = MouseHandler.MouseHandler_lastButton;
               var5 = MouseHandler.MouseHandler_lastPressedX;
               var6 = MouseHandler.MouseHandler_lastPressedY;
               if (var4 == 0) {
                  var5 = MouseHandler.MouseHandler_x;
                  var6 = MouseHandler.MouseHandler_y;
               }

               if (!SceneTilePaint.mouseCam && var4 == 4) {
                  var4 = 1;
               }

               class201 var38 = Client.field747;
               class201 var8 = var38;
               int var10;
               short var83;
               if (Login.loginIndex == 0) {
                  boolean var92 = false;

                  while(var8.method4114()) {
                     if (var8.field2328 == 84) {
                        var92 = true;
                     }
                  }

                  var10 = UrlRequest.loginBoxCenter - 80;
                  var83 = 291;
                  if (var4 == 1 && var5 >= var10 - 75 && var5 <= var10 + 75 && var6 >= var83 - 20 && var6 <= var83 + 20) {
                     ModeWhere.openURL(ScriptFrame.method1169("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                  }

                  var10 = UrlRequest.loginBoxCenter + 80;
                  if (var4 == 1 && var5 >= var10 - 75 && var5 <= var10 + 75 && var6 >= var83 - 20 && var6 <= var83 + 20 || var92) {
                     if ((Client.worldProperties & 33554432) != 0) {
                        Login.Login_response0 = "";
                        Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                        Login.Login_response2 = "Your normal account will not be affected.";
                        Login.Login_response3 = "";
                        class12.method155(1);
                        SoundSystem.method873();
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
                        class12.method155(1);
                        SoundSystem.method873();
                     } else if ((Client.worldProperties & 1024) != 0) {
                        Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                        Login.Login_response2 = "The Protect Item prayer will";
                        Login.Login_response3 = "not work on this world.";
                        Login.Login_response0 = "Warning!";
                        class12.method155(1);
                        SoundSystem.method873();
                     } else {
                        class343.Login_promptCredentials(false);
                     }
                  }
               } else {
                  int var9;
                  short var84;
                  if (Login.loginIndex == 1) {
                     while(true) {
                        if (!var8.method4114()) {
                           var9 = UrlRequest.loginBoxCenter - 80;
                           var84 = 321;
                           if (var4 == 1 && var5 >= var9 - 75 && var5 <= var9 + 75 && var6 >= var84 - 20 && var6 <= var84 + 20) {
                              class343.Login_promptCredentials(false);
                           }

                           var9 = UrlRequest.loginBoxCenter + 80;
                           if (var4 == 1 && var5 >= var9 - 75 && var5 <= var9 + 75 && var6 >= var84 - 20 && var6 <= var84 + 20) {
                              class12.method155(0);
                           }
                           break;
                        }

                        if (var8.field2328 == 84) {
                           class343.Login_promptCredentials(false);
                        } else if (var8.field2328 == 13) {
                           class12.method155(0);
                        }
                     }
                  } else {
                     int var13;
                     int var14;
                     int var16;
                     short var82;
                     if (Login.loginIndex == 2) {
                        var82 = 201;
                        var9 = var82 + 52;
                        if (var4 == 1 && var6 >= var9 - 12 && var6 < var9 + 2) {
                           Login.currentLoginField = 0;
                        }

                        var9 += 15;
                        if (var4 == 1 && var6 >= var9 - 12 && var6 < var9 + 2) {
                           Login.currentLoginField = 1;
                        }

                        var9 += 15;
                        var82 = 361;
                        if (class379.field4467 != null) {
                           var10 = class379.field4467.highX / 2;
                           if (var4 == 1 && var5 >= class379.field4467.lowX - var10 && var5 <= var10 + class379.field4467.lowX && var6 >= var82 - 15 && var6 < var82) {
                              switch (Login.field928) {
                                 case 1:
                                    TaskHandler.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                                    class12.method155(5);
                                    return;
                                 case 2:
                                    ModeWhere.openURL("https://support.runescape.com/hc/en-gb", true, false);
                              }
                           }
                        }

                        var10 = UrlRequest.loginBoxCenter - 80;
                        var83 = 321;
                        if (var4 == 1 && var5 >= var10 - 75 && var5 <= var10 + 75 && var6 >= var83 - 20 && var6 <= var83 + 20) {
                           Login.Login_username = Login.Login_username.trim();
                           if (Login.Login_username.length() == 0) {
                              TaskHandler.setLoginResponseString("", "Please enter your username/email address.", "");
                              return;
                           }

                           if (Login.Login_password.length() == 0) {
                              TaskHandler.setLoginResponseString("", "Please enter your password.", "");
                              return;
                           }

                           TaskHandler.setLoginResponseString("", "Connecting to server...", "");
                           InterfaceParent.method2251(false);
                           class140.updateGameState(20);
                           return;
                        }

                        var10 = Login.loginBoxX + 180 + 80;
                        if (var4 == 1 && var5 >= var10 - 75 && var5 <= var10 + 75 && var6 >= var83 - 20 && var6 <= var83 + 20) {
                           class12.method155(0);
                           Login.Login_username = "";
                           Login.Login_password = "";
                           class143.field1697 = 0;
                           class141.otp = "";
                           Login.field930 = true;
                        }

                        var10 = UrlRequest.loginBoxCenter + -117;
                        var83 = 277;
                        Login.field939 = var5 >= var10 && var5 < var10 + class126.field1569 && var6 >= var83 && var6 < var83 + WorldMapSection1.field2998;
                        if (var4 == 1 && Login.field939) {
                           Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
                           if (!Client.Login_isUsernameRemembered && StructComposition.clientPreferences.method2430() != null) {
                              StructComposition.clientPreferences.method2429((String)null);
                           }
                        }

                        var10 = UrlRequest.loginBoxCenter + 24;
                        var83 = 277;
                        Login.field955 = var5 >= var10 && var5 < var10 + class126.field1569 && var6 >= var83 && var6 < var83 + WorldMapSection1.field2998;
                        if (var4 == 1 && Login.field955) {
                           StructComposition.clientPreferences.method2461(!StructComposition.clientPreferences.method2413());
                           if (!StructComposition.clientPreferences.method2413()) {
                              Login.Login_username = "";
                              StructComposition.clientPreferences.method2429((String)null);
                              SoundSystem.method873();
                           }
                        }

                        while(true) {
                           Transferable var108;
                           do {
                              while(true) {
                                 label1863:
                                 do {
                                    while(true) {
                                       while(var8.method4114()) {
                                          if (var8.field2328 != 13) {
                                             if (Login.currentLoginField != 0) {
                                                continue label1863;
                                             }

                                             char var88 = var8.field2315;

                                             for(var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var88 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13); ++var13) {
                                             }

                                             if (var8.field2328 == 85 && Login.Login_username.length() > 0) {
                                                Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                                             }

                                             if (var8.field2328 == 84 || var8.field2328 == 80) {
                                                Login.currentLoginField = 1;
                                             }

                                             if (class4.method22(var8.field2315) && Login.Login_username.length() < 320) {
                                                Login.Login_username = Login.Login_username + var8.field2315;
                                             }
                                          } else {
                                             class12.method155(0);
                                             Login.Login_username = "";
                                             Login.Login_password = "";
                                             class143.field1697 = 0;
                                             class141.otp = "";
                                             Login.field930 = true;
                                          }
                                       }

                                       return;
                                    }
                                 } while(Login.currentLoginField != 1);

                                 if (var8.field2328 == 85 && Login.Login_password.length() > 0) {
                                    Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
                                 } else if (var8.field2328 == 84 || var8.field2328 == 80) {
                                    Login.currentLoginField = 0;
                                    if (var8.field2328 == 84) {
                                       Login.Login_username = Login.Login_username.trim();
                                       if (Login.Login_username.length() == 0) {
                                          TaskHandler.setLoginResponseString("", "Please enter your username/email address.", "");
                                          return;
                                       }

                                       if (Login.Login_password.length() == 0) {
                                          TaskHandler.setLoginResponseString("", "Please enter your password.", "");
                                          return;
                                       }

                                       TaskHandler.setLoginResponseString("", "Connecting to server...", "");
                                       InterfaceParent.method2251(false);
                                       class140.updateGameState(20);
                                       return;
                                    }
                                 }

                                 if ((var8.method4106(82) || var8.method4106(87)) && var8.field2328 == 67) {
                                    Clipboard var107 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var108 = var107.getContents(BuddyRankComparator.client);
                                    var14 = 20 - Login.Login_password.length();
                                    break;
                                 }

                                 if (ObjectSound.method1871(var8.field2315) && class4.method22(var8.field2315) && Login.Login_password.length() < 20) {
                                    Login.Login_password = Login.Login_password + var8.field2315;
                                 }
                              }
                           } while(var14 <= 0);

                           try {
                              String var90 = (String)var108.getTransferData(DataFlavor.stringFlavor);
                              var16 = Math.min(var14, var90.length());

                              for(int var91 = 0; var91 < var16; ++var91) {
                                 if (!ObjectSound.method1871(var90.charAt(var91)) || !class4.method22(var90.charAt(var91))) {
                                    class12.method155(3);
                                    return;
                                 }
                              }

                              Login.Login_password = Login.Login_password + var90.substring(0, var16);
                           } catch (UnsupportedFlavorException var78) {
                           } catch (IOException var79) {
                           }
                        }
                     } else if (Login.loginIndex == 3) {
                        var9 = Login.loginBoxX + 180;
                        var10 = 276;
                        if (var4 == 1 && var5 >= var9 - 75 && var5 <= var9 + 75 && var6 >= var10 - 20 && var6 <= var10 + 20) {
                           class124.method2939(false);
                        }

                        var9 = Login.loginBoxX + 180;
                        var10 = 326;
                        if (var4 == 1 && var5 >= var9 - 75 && var5 <= var9 + 75 && var6 >= var10 - 20 && var6 <= var10 + 20) {
                           TaskHandler.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                           class12.method155(5);
                           return;
                        }
                     } else {
                        int var12;
                        if (Login.loginIndex == 4) {
                           var9 = Login.loginBoxX + 180 - 80;
                           var10 = 321;
                           if (var4 == 1 && var5 >= var9 - 75 && var5 <= var9 + 75 && var6 >= var10 - 20 && var6 <= var10 + 20) {
                              class141.otp.trim();
                              if (class141.otp.length() != 6) {
                                 TaskHandler.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
                                 return;
                              }

                              class143.field1697 = Integer.parseInt(class141.otp);
                              class141.otp = "";
                              InterfaceParent.method2251(true);
                              TaskHandler.setLoginResponseString("", "Connecting to server...", "");
                              class140.updateGameState(20);
                              return;
                           }

                           if (var4 == 1 && var5 >= Login.loginBoxX + 180 - 9 && var5 <= Login.loginBoxX + 180 + 130 && var6 >= 263 && var6 <= 296) {
                              Login.field930 = !Login.field930;
                           }

                           if (var4 == 1 && var5 >= Login.loginBoxX + 180 - 34 && var5 <= Login.loginBoxX + 34 + 180 && var6 >= 351 && var6 <= 363) {
                              ModeWhere.openURL(ScriptFrame.method1169("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                           }

                           var9 = Login.loginBoxX + 180 + 80;
                           if (var4 == 1 && var5 >= var9 - 75 && var5 <= var9 + 75 && var6 >= var10 - 20 && var6 <= var10 + 20) {
                              class12.method155(0);
                              Login.Login_username = "";
                              Login.Login_password = "";
                              class143.field1697 = 0;
                              class141.otp = "";
                           }

                           while(var8.method4114()) {
                              boolean var11 = false;

                              for(var12 = 0; var12 < "1234567890".length(); ++var12) {
                                 if (var8.field2315 == "1234567890".charAt(var12)) {
                                    var11 = true;
                                    break;
                                 }
                              }

                              if (var8.field2328 == 13) {
                                 class12.method155(0);
                                 Login.Login_username = "";
                                 Login.Login_password = "";
                                 class143.field1697 = 0;
                                 class141.otp = "";
                              } else {
                                 if (var8.field2328 == 85 && class141.otp.length() > 0) {
                                    class141.otp = class141.otp.substring(0, class141.otp.length() - 1);
                                 }

                                 if (var8.field2328 == 84) {
                                    class141.otp.trim();
                                    if (class141.otp.length() != 6) {
                                       TaskHandler.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
                                       return;
                                    }

                                    class143.field1697 = Integer.parseInt(class141.otp);
                                    class141.otp = "";
                                    InterfaceParent.method2251(true);
                                    TaskHandler.setLoginResponseString("", "Connecting to server...", "");
                                    class140.updateGameState(20);
                                    return;
                                 }

                                 if (var11 && class141.otp.length() < 6) {
                                    class141.otp = class141.otp + var8.field2315;
                                 }
                              }
                           }
                        } else {
                           int var55;
                           if (Login.loginIndex == 5) {
                              var9 = Login.loginBoxX + 180 - 80;
                              var10 = 321;
                              Buffer var20;
                              int var24;
                              if (var4 == 1 && var5 >= var9 - 75 && var5 <= var9 + 75 && var6 >= var10 - 20 && var6 <= var10 + 20) {
                                 Login.Login_username = Login.Login_username.trim();
                                 if (Login.Login_username.length() == 0) {
                                    TaskHandler.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                                 } else {
                                    long var44;
                                    try {
                                       URL var41 = new URL(ScriptFrame.method1169("services", false) + "m=accountappeal/login.ws");
                                       URLConnection var15 = var41.openConnection();
                                       var15.setRequestProperty("connection", "close");
                                       var15.setDoInput(true);
                                       var15.setDoOutput(true);
                                       var15.setConnectTimeout(5000);
                                       OutputStreamWriter var110 = new OutputStreamWriter(var15.getOutputStream());
                                       var110.write("data1=req");
                                       var110.flush();
                                       InputStream var112 = var15.getInputStream();
                                       Buffer var93 = new Buffer(new byte[1000]);

                                       while(true) {
                                          int var19 = var112.read(var93.array, var93.offset, 1000 - var93.offset);
                                          if (var19 == -1) {
                                             var93.offset = 0;
                                             long var46 = var93.readLong();
                                             var44 = var46;
                                             break;
                                          }

                                          var93.offset += var19;
                                          if (var93.offset >= 1000) {
                                             var44 = 0L;
                                             break;
                                          }
                                       }
                                    } catch (Exception var71) {
                                       var44 = 0L;
                                    }

                                    byte var85;
                                    if (var44 == 0L) {
                                       var85 = 5;
                                    } else {
                                       String var113 = Login.Login_username;
                                       Random var94 = new Random();
                                       Buffer var116 = new Buffer(128);
                                       var20 = new Buffer(128);
                                       int[] var100 = new int[]{var94.nextInt(), var94.nextInt(), (int)(var44 >> 32), (int)var44};
                                       var116.writeByte(10);

                                       int var22;
                                       for(var22 = 0; var22 < 4; ++var22) {
                                          var116.writeInt(var94.nextInt());
                                       }

                                       var116.writeInt(var100[0]);
                                       var116.writeInt(var100[1]);
                                       var116.writeLong(var44);
                                       var116.writeLong(0L);

                                       for(var22 = 0; var22 < 4; ++var22) {
                                          var116.writeInt(var94.nextInt());
                                       }

                                       var116.encryptRsa(class69.field889, class69.field887);
                                       var20.writeByte(10);

                                       for(var22 = 0; var22 < 3; ++var22) {
                                          var20.writeInt(var94.nextInt());
                                       }

                                       var20.writeLong(var94.nextLong());
                                       var20.writeLongMedium(var94.nextLong());
                                       if (Client.randomDatData != null) {
                                          var20.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
                                       } else {
                                          byte[] var101 = new byte[24];

                                          try {
                                             JagexCache.JagexCache_randomDat.seek(0L);
                                             JagexCache.JagexCache_randomDat.readFully(var101);

                                             for(var24 = 0; var24 < 24 && var101[var24] == 0; ++var24) {
                                             }

                                             if (var24 >= 24) {
                                                throw new IOException();
                                             }
                                          } catch (Exception var70) {
                                             for(int var25 = 0; var25 < 24; ++var25) {
                                                var101[var25] = -1;
                                             }
                                          }

                                          var20.writeBytes(var101, 0, var101.length);
                                       }

                                       var20.writeLong(var94.nextLong());
                                       var20.encryptRsa(class69.field889, class69.field887);
                                       var22 = class13.stringCp1252NullTerminatedByteSize(var113);
                                       if (var22 % 8 != 0) {
                                          var22 += 8 - var22 % 8;
                                       }

                                       Buffer var102 = new Buffer(var22);
                                       var102.writeStringCp1252NullTerminated(var113);
                                       var102.offset = var22;
                                       var102.xteaEncryptAll(var100);
                                       Buffer var51 = new Buffer(var20.offset + var116.offset + var102.offset + 5);
                                       var51.writeByte(2);
                                       var51.writeByte(var116.offset);
                                       var51.writeBytes(var116.array, 0, var116.offset);
                                       var51.writeByte(var20.offset);
                                       var51.writeBytes(var20.array, 0, var20.offset);
                                       var51.writeShort(var102.offset);
                                       var51.writeBytes(var102.array, 0, var102.offset);
                                       String var121 = EnumComposition.method3650(var51.array);

                                       try {
                                          URL var103 = new URL(ScriptFrame.method1169("services", false) + "m=accountappeal/login.ws");
                                          URLConnection var104 = var103.openConnection();
                                          var104.setDoInput(true);
                                          var104.setDoOutput(true);
                                          var104.setConnectTimeout(5000);
                                          OutputStreamWriter var105 = new OutputStreamWriter(var104.getOutputStream());
                                          var105.write("data2=" + DbTableType.method8435(var121) + "&dest=" + DbTableType.method8435("passwordchoice.ws"));
                                          var105.flush();
                                          InputStream var106 = var104.getInputStream();
                                          var51 = new Buffer(new byte[1000]);

                                          while(true) {
                                             int var30 = var106.read(var51.array, var51.offset, 1000 - var51.offset);
                                             if (var30 == -1) {
                                                var105.close();
                                                var106.close();
                                                String var122 = new String(var51.array);
                                                if (var122.startsWith("OFFLINE")) {
                                                   var16 = 4;
                                                } else if (var122.startsWith("WRONG")) {
                                                   var16 = 7;
                                                } else if (var122.startsWith("RELOAD")) {
                                                   var16 = 3;
                                                } else if (var122.startsWith("Not permitted for social network accounts.")) {
                                                   var16 = 6;
                                                } else {
                                                   var51.xteaDecryptAll(var100);

                                                   while(var51.offset > 0 && var51.array[var51.offset - 1] == 0) {
                                                      --var51.offset;
                                                   }

                                                   var122 = new String(var51.array, 0, var51.offset);
                                                   boolean var31;
                                                   if (var122 == null) {
                                                      var31 = false;
                                                   } else {
                                                      label2026: {
                                                         try {
                                                            new URL(var122);
                                                         } catch (MalformedURLException var68) {
                                                            var31 = false;
                                                            break label2026;
                                                         }

                                                         var31 = true;
                                                      }
                                                   }

                                                   if (var31) {
                                                      ModeWhere.openURL(var122, true, false);
                                                      var16 = 2;
                                                   } else {
                                                      var16 = 5;
                                                   }
                                                }
                                                break;
                                             }

                                             var51.offset += var30;
                                             if (var51.offset >= 1000) {
                                                var16 = 5;
                                                break;
                                             }
                                          }
                                       } catch (Throwable var69) {
                                          var69.printStackTrace();
                                          var16 = 5;
                                       }

                                       var85 = (byte)var16;
                                    }

                                    switch (var85) {
                                       case 2:
                                          TaskHandler.setLoginResponseString(Strings.field4095, Strings.field4096, Strings.field3832);
                                          class12.method155(6);
                                          break;
                                       case 3:
                                          TaskHandler.setLoginResponseString("", "Error connecting to server.", "");
                                          break;
                                       case 4:
                                          TaskHandler.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
                                          break;
                                       case 5:
                                          TaskHandler.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
                                          break;
                                       case 6:
                                          TaskHandler.setLoginResponseString("", "Error connecting to server.", "");
                                          break;
                                       case 7:
                                          TaskHandler.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
                                    }
                                 }

                                 return;
                              }

                              var9 = Login.loginBoxX + 180 + 80;
                              if (var4 == 1 && var5 >= var9 - 75 && var5 <= var9 + 75 && var6 >= var10 - 20 && var6 <= var10 + 20) {
                                 class343.Login_promptCredentials(true);
                              }

                              var83 = 361;
                              if (class151.field1763 != null) {
                                 var12 = class151.field1763.highX / 2;
                                 if (var4 == 1 && var5 >= class151.field1763.lowX - var12 && var5 <= var12 + class151.field1763.lowX && var6 >= var83 - 15 && var6 < var83) {
                                    ModeWhere.openURL(ScriptFrame.method1169("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                                 }
                              }

                              while(var8.method4114()) {
                                 boolean var86 = false;

                                 for(var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var13) {
                                    if (var8.field2315 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13)) {
                                       var86 = true;
                                       break;
                                    }
                                 }

                                 if (var8.field2328 == 13) {
                                    class343.Login_promptCredentials(true);
                                 } else {
                                    if (var8.field2328 == 85 && Login.Login_username.length() > 0) {
                                       Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                                    }

                                    if (var8.field2328 == 84) {
                                       Login.Login_username = Login.Login_username.trim();
                                       if (Login.Login_username.length() == 0) {
                                          TaskHandler.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                                       } else {
                                          long var48;
                                          try {
                                             URL var42 = new URL(ScriptFrame.method1169("services", false) + "m=accountappeal/login.ws");
                                             URLConnection var43 = var42.openConnection();
                                             var43.setRequestProperty("connection", "close");
                                             var43.setDoInput(true);
                                             var43.setDoOutput(true);
                                             var43.setConnectTimeout(5000);
                                             OutputStreamWriter var18 = new OutputStreamWriter(var43.getOutputStream());
                                             var18.write("data1=req");
                                             var18.flush();
                                             InputStream var50 = var43.getInputStream();
                                             var20 = new Buffer(new byte[1000]);

                                             while(true) {
                                                var55 = var50.read(var20.array, var20.offset, 1000 - var20.offset);
                                                if (var55 == -1) {
                                                   var20.offset = 0;
                                                   long var56 = var20.readLong();
                                                   var48 = var56;
                                                   break;
                                                }

                                                var20.offset += var55;
                                                if (var20.offset >= 1000) {
                                                   var48 = 0L;
                                                   break;
                                                }
                                             }
                                          } catch (Exception var75) {
                                             var48 = 0L;
                                          }

                                          byte var87;
                                          if (var48 == 0L) {
                                             var87 = 5;
                                          } else {
                                             String var115 = Login.Login_username;
                                             Random var98 = new Random();
                                             Buffer var21 = new Buffer(128);
                                             Buffer var52 = new Buffer(128);
                                             int[] var23 = new int[]{var98.nextInt(), var98.nextInt(), (int)(var48 >> 32), (int)var48};
                                             var21.writeByte(10);

                                             for(var24 = 0; var24 < 4; ++var24) {
                                                var21.writeInt(var98.nextInt());
                                             }

                                             var21.writeInt(var23[0]);
                                             var21.writeInt(var23[1]);
                                             var21.writeLong(var48);
                                             var21.writeLong(0L);

                                             for(var24 = 0; var24 < 4; ++var24) {
                                                var21.writeInt(var98.nextInt());
                                             }

                                             var21.encryptRsa(class69.field889, class69.field887);
                                             var52.writeByte(10);

                                             for(var24 = 0; var24 < 3; ++var24) {
                                                var52.writeInt(var98.nextInt());
                                             }

                                             var52.writeLong(var98.nextLong());
                                             var52.writeLongMedium(var98.nextLong());
                                             if (Client.randomDatData != null) {
                                                var52.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
                                             } else {
                                                byte[] var53 = new byte[24];

                                                try {
                                                   JagexCache.JagexCache_randomDat.seek(0L);
                                                   JagexCache.JagexCache_randomDat.readFully(var53);

                                                   int var60;
                                                   for(var60 = 0; var60 < 24 && var53[var60] == 0; ++var60) {
                                                   }

                                                   if (var60 >= 24) {
                                                      throw new IOException();
                                                   }
                                                } catch (Exception var74) {
                                                   for(int var61 = 0; var61 < 24; ++var61) {
                                                      var53[var61] = -1;
                                                   }
                                                }

                                                var52.writeBytes(var53, 0, var53.length);
                                             }

                                             var52.writeLong(var98.nextLong());
                                             var52.encryptRsa(class69.field889, class69.field887);
                                             var24 = class13.stringCp1252NullTerminatedByteSize(var115);
                                             if (var24 % 8 != 0) {
                                                var24 += 8 - var24 % 8;
                                             }

                                             Buffer var120 = new Buffer(var24);
                                             var120.writeStringCp1252NullTerminated(var115);
                                             var120.offset = var24;
                                             var120.xteaEncryptAll(var23);
                                             Buffer var26 = new Buffer(var52.offset + var21.offset + var120.offset + 5);
                                             var26.writeByte(2);
                                             var26.writeByte(var21.offset);
                                             var26.writeBytes(var21.array, 0, var21.offset);
                                             var26.writeByte(var52.offset);
                                             var26.writeBytes(var52.array, 0, var52.offset);
                                             var26.writeShort(var120.offset);
                                             var26.writeBytes(var120.array, 0, var120.offset);
                                             String var27 = EnumComposition.method3650(var26.array);

                                             byte var64;
                                             try {
                                                URL var28 = new URL(ScriptFrame.method1169("services", false) + "m=accountappeal/login.ws");
                                                URLConnection var29 = var28.openConnection();
                                                var29.setDoInput(true);
                                                var29.setDoOutput(true);
                                                var29.setConnectTimeout(5000);
                                                OutputStreamWriter var54 = new OutputStreamWriter(var29.getOutputStream());
                                                var54.write("data2=" + DbTableType.method8435(var27) + "&dest=" + DbTableType.method8435("passwordchoice.ws"));
                                                var54.flush();
                                                InputStream var62 = var29.getInputStream();
                                                var26 = new Buffer(new byte[1000]);

                                                while(true) {
                                                   int var63 = var62.read(var26.array, var26.offset, 1000 - var26.offset);
                                                   if (var63 == -1) {
                                                      var54.close();
                                                      var62.close();
                                                      String var32 = new String(var26.array);
                                                      if (var32.startsWith("OFFLINE")) {
                                                         var64 = 4;
                                                      } else if (var32.startsWith("WRONG")) {
                                                         var64 = 7;
                                                      } else if (var32.startsWith("RELOAD")) {
                                                         var64 = 3;
                                                      } else if (var32.startsWith("Not permitted for social network accounts.")) {
                                                         var64 = 6;
                                                      } else {
                                                         var26.xteaDecryptAll(var23);

                                                         while(var26.offset > 0 && var26.array[var26.offset - 1] == 0) {
                                                            --var26.offset;
                                                         }

                                                         var32 = new String(var26.array, 0, var26.offset);
                                                         boolean var33;
                                                         if (var32 == null) {
                                                            var33 = false;
                                                         } else {
                                                            label2028: {
                                                               try {
                                                                  new URL(var32);
                                                               } catch (MalformedURLException var72) {
                                                                  var33 = false;
                                                                  break label2028;
                                                               }

                                                               var33 = true;
                                                            }
                                                         }

                                                         if (var33) {
                                                            ModeWhere.openURL(var32, true, false);
                                                            var64 = 2;
                                                         } else {
                                                            var64 = 5;
                                                         }
                                                      }
                                                      break;
                                                   }

                                                   var26.offset += var63;
                                                   if (var26.offset >= 1000) {
                                                      var64 = 5;
                                                      break;
                                                   }
                                                }
                                             } catch (Throwable var73) {
                                                var73.printStackTrace();
                                                var64 = 5;
                                             }

                                             var87 = var64;
                                          }

                                          switch (var87) {
                                             case 2:
                                                TaskHandler.setLoginResponseString(Strings.field4095, Strings.field4096, Strings.field3832);
                                                class12.method155(6);
                                                break;
                                             case 3:
                                                TaskHandler.setLoginResponseString("", "Error connecting to server.", "");
                                                break;
                                             case 4:
                                                TaskHandler.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
                                                break;
                                             case 5:
                                                TaskHandler.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
                                                break;
                                             case 6:
                                                TaskHandler.setLoginResponseString("", "Error connecting to server.", "");
                                                break;
                                             case 7:
                                                TaskHandler.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
                                          }
                                       }

                                       return;
                                    }

                                    if (var86 && Login.Login_username.length() < 320) {
                                       Login.Login_username = Login.Login_username + var8.field2315;
                                    }
                                 }
                              }
                           } else if (Login.loginIndex != 6) {
                              if (Login.loginIndex == 7) {
                                 if (class155.field1785 && !Client.onMobile) {
                                    var9 = UrlRequest.loginBoxCenter - 150;
                                    var10 = var9 + 40 + 240 + 25;
                                    var83 = 231;
                                    var12 = var83 + 40;
                                    if (var4 == 1 && var5 >= var9 && var5 <= var10 && var6 >= var83 && var6 <= var12) {
                                       var14 = var9;
                                       int var65 = 0;

                                       while(true) {
                                          if (var65 >= 8) {
                                             var13 = 0;
                                             break;
                                          }

                                          if (var5 <= var14 + 30) {
                                             var13 = var65;
                                             break;
                                          }

                                          var14 += 30;
                                          var14 += var65 != 1 && var65 != 3 ? 5 : 20;
                                          ++var65;
                                       }

                                       Login.field938 = var13;
                                    }

                                    var13 = Login.loginBoxX + 180 - 80;
                                    short var89 = 321;
                                    boolean var17;
                                    SimpleDateFormat var95;
                                    java.util.Calendar var96;
                                    boolean var97;
                                    String[] var99;
                                    Date var111;
                                    Date var114;
                                    StringBuilder var117;
                                    Date var118;
                                    String var119;
                                    boolean var123;
                                    if (var4 == 1 && var5 >= var13 - 75 && var5 <= var13 + 75 && var6 >= var89 - 20 && var6 <= var89 + 20) {
                                       label1734: {
                                          try {
                                             var95 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                             var95.setLenient(false);
                                             var117 = new StringBuilder();
                                             var99 = Login.field915;
                                             var55 = 0;

                                             while(true) {
                                                if (var55 >= var99.length) {
                                                   var117.append("12");
                                                   var114 = var95.parse(var117.toString());
                                                   break;
                                                }

                                                var119 = var99[var55];
                                                if (var119 == null) {
                                                   Player.method2329("Date not valid.", "Please ensure all characters are populated.", "");
                                                   var114 = null;
                                                   break;
                                                }

                                                var117.append(var119);
                                                ++var55;
                                             }

                                             var111 = var114;
                                          } catch (ParseException var77) {
                                             Player.method2329("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                             var123 = false;
                                             break label1734;
                                          }

                                          if (var111 == null) {
                                             var123 = false;
                                          } else {
                                             var96 = java.util.Calendar.getInstance();
                                             var96.set(1, var96.get(1) - 13);
                                             var96.set(5, var96.get(5) + 1);
                                             var96.set(11, 0);
                                             var96.set(12, 0);
                                             var96.set(13, 0);
                                             var96.set(14, 0);
                                             var118 = var96.getTime();
                                             var17 = var111.before(var118);
                                             var97 = class410.method7833(var111);
                                             if (!var97) {
                                                Player.method2329("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                var123 = false;
                                             } else {
                                                if (!var17) {
                                                   class29.field172 = 8388607;
                                                } else {
                                                   class29.field172 = (int)(var111.getTime() / 86400000L - 11745L);
                                                }

                                                var123 = true;
                                             }
                                          }
                                       }

                                       if (var123) {
                                          class140.updateGameState(50);
                                          return;
                                       }
                                    }

                                    var13 = Login.loginBoxX + 180 + 80;
                                    if (var4 == 1 && var5 >= var13 - 75 && var5 <= var13 + 75 && var6 >= var89 - 20 && var6 <= var89 + 20) {
                                       Login.field915 = new String[8];
                                       class343.Login_promptCredentials(true);
                                    }

                                    while(var8.method4114()) {
                                       if (var8.field2328 == 101) {
                                          Login.field915[Login.field938] = null;
                                       }

                                       if (var8.field2328 == 85) {
                                          if (Login.field915[Login.field938] == null && Login.field938 > 0) {
                                             --Login.field938;
                                          }

                                          Login.field915[Login.field938] = null;
                                       }

                                       if (var8.field2315 >= '0' && var8.field2315 <= '9') {
                                          Login.field915[Login.field938] = "" + var8.field2315;
                                          if (Login.field938 < 7) {
                                             ++Login.field938;
                                          }
                                       }

                                       if (var8.field2328 == 84) {
                                          label1662: {
                                             try {
                                                var95 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                                var95.setLenient(false);
                                                var117 = new StringBuilder();
                                                var99 = Login.field915;
                                                var55 = 0;

                                                while(true) {
                                                   if (var55 < var99.length) {
                                                      var119 = var99[var55];
                                                      if (var119 != null) {
                                                         var117.append(var119);
                                                         ++var55;
                                                         continue;
                                                      }

                                                      Player.method2329("Date not valid.", "Please ensure all characters are populated.", "");
                                                      var114 = null;
                                                   } else {
                                                      var117.append("12");
                                                      var114 = var95.parse(var117.toString());
                                                   }

                                                   var111 = var114;
                                                   break;
                                                }
                                             } catch (ParseException var76) {
                                                Player.method2329("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                var123 = false;
                                                break label1662;
                                             }

                                             if (var111 == null) {
                                                var123 = false;
                                             } else {
                                                var96 = java.util.Calendar.getInstance();
                                                var96.set(1, var96.get(1) - 13);
                                                var96.set(5, var96.get(5) + 1);
                                                var96.set(11, 0);
                                                var96.set(12, 0);
                                                var96.set(13, 0);
                                                var96.set(14, 0);
                                                var118 = var96.getTime();
                                                var17 = var111.before(var118);
                                                var97 = class410.method7833(var111);
                                                if (!var97) {
                                                   Player.method2329("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                   var123 = false;
                                                } else {
                                                   if (!var17) {
                                                      class29.field172 = 8388607;
                                                   } else {
                                                      class29.field172 = (int)(var111.getTime() / 86400000L - 11745L);
                                                   }

                                                   var123 = true;
                                                }
                                             }
                                          }

                                          if (var123) {
                                             class140.updateGameState(50);
                                          }

                                          return;
                                       }
                                    }
                                 } else {
                                    var9 = Login.loginBoxX + 180 - 80;
                                    var10 = 321;
                                    if (var4 == 1 && var5 >= var9 - 75 && var5 <= var9 + 75 && var6 >= var10 - 20 && var6 <= var10 + 20) {
                                       ModeWhere.openURL(ScriptFrame.method1169("secure", true) + "m=dob/set_dob.ws", true, false);
                                       TaskHandler.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                       class12.method155(6);
                                       return;
                                    }

                                    var9 = Login.loginBoxX + 180 + 80;
                                    if (var4 == 1 && var5 >= var9 - 75 && var5 <= var9 + 75 && var6 >= var10 - 20 && var6 <= var10 + 20) {
                                       class343.Login_promptCredentials(true);
                                    }
                                 }
                              } else if (Login.loginIndex == 8) {
                                 var9 = Login.loginBoxX + 180 - 80;
                                 var84 = 321;
                                 if (var4 == 1 && var5 >= var9 - 75 && var5 <= var9 + 75 && var6 >= var84 - 20 && var6 <= var84 + 20) {
                                    ModeWhere.openURL("https://www.jagex.com/terms/privacy", true, false);
                                    TaskHandler.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                    class12.method155(6);
                                    return;
                                 }

                                 var9 = Login.loginBoxX + 180 + 80;
                                 if (var4 == 1 && var5 >= var9 - 75 && var5 <= var9 + 75 && var6 >= var84 - 20 && var6 <= var84 + 20) {
                                    class343.Login_promptCredentials(true);
                                 }
                              } else if (Login.loginIndex == 9) {
                                 var9 = Login.loginBoxX + 180;
                                 var84 = 311;
                                 if (var38.field2328 == 84 || var38.field2328 == 13 || var4 == 1 && var5 >= var9 - 75 && var5 <= var9 + 75 && var6 >= var84 - 20 && var6 <= var84 + 20) {
                                    class124.method2939(false);
                                 }
                              } else if (Login.loginIndex == 10) {
                                 var9 = Login.loginBoxX + 180;
                                 var84 = 209;
                                 if (var38.field2328 == 84 || var4 == 1 && var5 >= var9 - 109 && var5 <= var9 + 109 && var6 >= var84 && var6 <= var84 + 68) {
                                    TaskHandler.setLoginResponseString("", "Connecting to server...", "");
                                    Client.field640 = class471.field4969;
                                    InterfaceParent.method2251(false);
                                    class140.updateGameState(20);
                                 }
                              } else if (Login.loginIndex == 12) {
                                 var9 = UrlRequest.loginBoxCenter;
                                 var84 = 233;
                                 Bounds var66 = var1.method7169(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var84);
                                 Bounds var39 = var1.method7169(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var84);
                                 Bounds var40 = var1.method7169(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var84);
                                 var10 = var84 + 17;
                                 Bounds var109 = var1.method7169(0, 34, "<col=ffd200>agreement (EULA)</col>.", var9, var10);
                                 if (var4 == 1) {
                                    if (var66.method7724(var5, var6)) {
                                       ModeWhere.openURL("https://www.jagex.com/terms", true, false);
                                    } else if (var39.method7724(var5, var6)) {
                                       ModeWhere.openURL("https://www.jagex.com/terms/privacy", true, false);
                                    } else if (var40.method7724(var5, var6) || var109.method7724(var5, var6)) {
                                       ModeWhere.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                                    }
                                 }

                                 var9 = UrlRequest.loginBoxCenter - 80;
                                 var84 = 311;
                                 if (var4 == 1 && var5 >= var9 - 75 && var5 <= var9 + 75 && var6 >= var84 - 20 && var6 <= var84 + 20) {
                                    WorldMapData_0.method4848();
                                    class124.method2939(true);
                                 }

                                 var9 = UrlRequest.loginBoxCenter + 80;
                                 if (var4 == 1 && var5 >= var9 - 75 && var5 <= var9 + 75 && var6 >= var84 - 20 && var6 <= var84 + 20) {
                                    Login.loginIndex = 13;
                                 }
                              } else if (Login.loginIndex == 13) {
                                 var9 = UrlRequest.loginBoxCenter;
                                 var84 = 321;
                                 if (var4 == 1 && var5 >= var9 - 75 && var5 <= var9 + 75 && var6 >= var84 - 20 && var6 <= var84 + 20) {
                                    class124.method2939(true);
                                 }
                              } else if (Login.loginIndex == 14) {
                                 String var67 = "";
                                 switch (Login.Login_banType) {
                                    case 0:
                                       var67 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                                       break;
                                    case 1:
                                       var67 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                                       break;
                                    case 2:
                                       var67 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                                       break;
                                    default:
                                       class343.Login_promptCredentials(false);
                                 }

                                 var10 = Login.loginBoxX + 180;
                                 var83 = 276;
                                 if (var4 == 1 && var5 >= var10 - 75 && var5 <= var10 + 75 && var6 >= var83 - 20 && var6 <= var83 + 20) {
                                    ModeWhere.openURL(var67, true, false);
                                    TaskHandler.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                    class12.method155(6);
                                    return;
                                 }

                                 var10 = Login.loginBoxX + 180;
                                 var83 = 326;
                                 if (var4 == 1 && var5 >= var10 - 75 && var5 <= var10 + 75 && var6 >= var83 - 20 && var6 <= var83 + 20) {
                                    class343.Login_promptCredentials(false);
                                 }
                              } else if (Login.loginIndex == 24) {
                                 var9 = Login.loginBoxX + 180;
                                 var84 = 301;
                                 if (var4 == 1 && var5 >= var9 - 75 && var5 <= var9 + 75 && var6 >= var84 - 20 && var6 <= var84 + 20) {
                                    class124.method2939(false);
                                 }
                              } else if (Login.loginIndex == 26) {
                                 var9 = Login.loginBoxX + 180 - 80;
                                 var84 = 321;
                                 if (var4 == 1 && var5 >= var9 - 75 && var5 <= var9 + 75 && var6 >= var84 - 20 && var6 <= var84 + 20) {
                                    ModeWhere.openURL(ScriptFrame.method1169("secure", true) + "m=dob/set_dob.ws", true, false);
                                    TaskHandler.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                    class12.method155(6);
                                    return;
                                 }

                                 var9 = Login.loginBoxX + 180 + 80;
                                 if (var4 == 1 && var5 >= var9 - 75 && var5 <= var9 + 75 && var6 >= var84 - 20 && var6 <= var84 + 20) {
                                    class343.Login_promptCredentials(true);
                                 }
                              }
                           } else {
                              while(true) {
                                 do {
                                    if (!var8.method4114()) {
                                       var82 = 321;
                                       if (var4 == 1 && var6 >= var82 - 20 && var6 <= var82 + 20) {
                                          class343.Login_promptCredentials(true);
                                       }

                                       return;
                                    }
                                 } while(var8.field2328 != 84 && var8.field2328 != 13);

                                 class343.Login_promptCredentials(true);
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
