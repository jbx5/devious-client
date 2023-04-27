import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("EnumDefinition_archive")
   static AbstractArchive EnumDefinition_archive;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("EnumDefinition_cached")
   static EvictingDualNodeHashTable EnumDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -391109139
   )
   static int field1979;
   @ObfuscatedName("aw")
   @Export("inputType")
   public char inputType;
   @ObfuscatedName("ac")
   @Export("outputType")
   public char outputType;
   @ObfuscatedName("au")
   @Export("defaultStr")
   public String defaultStr = "null";
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -635236715
   )
   @Export("defaultInt")
   public int defaultInt;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1067065
   )
   @Export("outputCount")
   public int outputCount = 0;
   @ObfuscatedName("al")
   @Export("keys")
   public int[] keys;
   @ObfuscatedName("at")
   @Export("intVals")
   public int[] intVals;
   @ObfuscatedName("aa")
   @Export("strVals")
   public String[] strVals;

   EnumComposition() {
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lsg;B)V",
      garbageValue = "1"
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

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lsg;II)V",
      garbageValue = "-1230554018"
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

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1771733315"
   )
   @Export("size")
   public int size() {
      return this.outputCount;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lnm;B)V",
      garbageValue = "42"
   )
   public static void method3738(AbstractArchive var0) {
      FloorOverlayDefinition.FloorOverlayDefinition_archive = var0;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lro;ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "2050135786"
   )
   static String method3750(IterableNodeHashTable var0, int var1, String var2) {
      if (var0 == null) {
         return var2;
      } else {
         ObjectNode var3 = (ObjectNode)var0.get((long)var1);
         return var3 == null ? var2 : (String)var3.obj;
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lbm;Lon;Lon;I)V",
      garbageValue = "1210826213"
   )
   @Export("loginScreen")
   static void loginScreen(GameEngine var0, Font var1, Font var2) {
      if (Login.worldSelectOpen) {
         class33.method510(var0);
      } else {
         if ((MouseHandler.MouseHandler_lastButton == 1 || !class473.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
            class20.clientPreferences.method2531(!class20.clientPreferences.method2534());
            if (!class20.clientPreferences.method2534()) {
               class478.method8904(class399.archive6, "scape main", "", 255, false);
            } else {
               FloorUnderlayDefinition.method3865();
            }
         }

         if (Client.gameState != 5) {
            if (-1L == Login.field894) {
               Login.field894 = class96.method2634() + 1000L;
            }

            long var3 = class96.method2634();
            boolean var5;
            if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
               while(true) {
                  if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) {
                     var5 = true;
                     break;
                  }

                  ArchiveLoader var6 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
                  if (!var6.isLoaded()) {
                     var5 = false;
                     break;
                  }

                  ++Client.archiveLoadersDone;
               }
            } else {
               var5 = true;
            }

            if (var5 && -1L == Login.field923) {
               Login.field923 = var3;
               if (Login.field923 > Login.field894) {
                  Login.field894 = Login.field923;
               }
            }

            if (Client.gameState == 10 || Client.gameState == 11) {
               int var7;
               int var8;
               int var33;
               if (ClanSettings.clientLanguage == Language.Language_EN) {
                  if (MouseHandler.MouseHandler_lastButton == 1 || !class473.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
                     var33 = Login.xPadding + 5;
                     var7 = 463;
                     var8 = 100;
                     byte var9 = 35;
                     if (MouseHandler.MouseHandler_lastPressedX >= var33 && MouseHandler.MouseHandler_lastPressedX <= var33 + var8 && MouseHandler.MouseHandler_lastPressedY >= var7 && MouseHandler.MouseHandler_lastPressedY <= var7 + var9) {
                        Login.method2102();
                        return;
                     }
                  }

                  if (class11.World_request != null) {
                     Login.method2102();
                  }
               }

               var33 = MouseHandler.MouseHandler_lastButton;
               var7 = MouseHandler.MouseHandler_lastPressedX;
               var8 = MouseHandler.MouseHandler_lastPressedY;
               if (var33 == 0) {
                  var7 = MouseHandler.MouseHandler_x;
                  var8 = MouseHandler.MouseHandler_y;
               }

               if (!class473.mouseCam && var33 == 4) {
                  var33 = 1;
               }

               class207 var34 = Client.field721;
               class207 var10 = var34;
               int var12;
               short var61;
               if (Login.loginIndex == 0) {
                  boolean var70 = false;

                  while(var10.method4215()) {
                     if (var10.field2362 == 84) {
                        var70 = true;
                     }
                  }

                  var12 = class143.loginBoxCenter - 80;
                  var61 = 291;
                  if (var33 == 1 && var7 >= var12 - 75 && var7 <= var12 + 75 && var8 >= var61 - 20 && var8 <= var61 + 20) {
                     Ignored.openURL(InvDefinition.method3645("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                  }

                  var12 = class143.loginBoxCenter + 80;
                  if (var33 == 1 && var7 >= var12 - 75 && var7 <= var12 + 75 && var8 >= var61 - 20 && var8 <= var61 + 20 || var70) {
                     if ((Client.worldProperties & 33554432) != 0) {
                        Login.Login_response0 = "";
                        Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                        Login.Login_response2 = "Your normal account will not be affected.";
                        Login.Login_response3 = "";
                        class129.method3124(1);
                        if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
                           Login.currentLoginField = 1;
                        } else {
                           Login.currentLoginField = 0;
                        }
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
                        class129.method3124(1);
                        if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
                           Login.currentLoginField = 1;
                        } else {
                           Login.currentLoginField = 0;
                        }
                     } else if ((Client.worldProperties & 1024) != 0) {
                        Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                        Login.Login_response2 = "The Protect Item prayer will";
                        Login.Login_response3 = "not work on this world.";
                        Login.Login_response0 = "Warning!";
                        class129.method3124(1);
                        if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
                           Login.currentLoginField = 1;
                        } else {
                           Login.currentLoginField = 0;
                        }
                     } else {
                        class6.Login_promptCredentials(false);
                     }
                  }
               } else {
                  int var11;
                  short var62;
                  if (Login.loginIndex == 1) {
                     while(true) {
                        if (!var10.method4215()) {
                           var11 = class143.loginBoxCenter - 80;
                           var62 = 321;
                           if (var33 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var62 - 20 && var8 <= var62 + 20) {
                              class6.Login_promptCredentials(false);
                           }

                           var11 = class143.loginBoxCenter + 80;
                           if (var33 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var62 - 20 && var8 <= var62 + 20) {
                              class129.method3124(0);
                           }
                           break;
                        }

                        if (var10.field2362 == 84) {
                           class6.Login_promptCredentials(false);
                        } else if (var10.field2362 == 13) {
                           class129.method3124(0);
                        }
                     }
                  } else {
                     int var15;
                     int var16;
                     String var17;
                     int var18;
                     boolean var20;
                     short var60;
                     boolean var64;
                     char var65;
                     char var69;
                     if (Login.loginIndex == 2) {
                        var60 = 201;
                        var11 = var60 + 52;
                        if (var33 == 1 && var8 >= var11 - 12 && var8 < var11 + 2) {
                           Login.currentLoginField = 0;
                        }

                        var11 += 15;
                        if (var33 == 1 && var8 >= var11 - 12 && var8 < var11 + 2) {
                           Login.currentLoginField = 1;
                        }

                        var11 += 15;
                        var60 = 361;
                        if (class96.field1295 != null) {
                           var12 = class96.field1295.highX / 2;
                           if (var33 == 1 && var7 >= class96.field1295.lowX - var12 && var7 <= var12 + class96.field1295.lowX && var8 >= var60 - 15 && var8 < var60) {
                              switch (Login.field916) {
                                 case 1:
                                    class205.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                                    class129.method3124(5);
                                    return;
                                 case 2:
                                    Ignored.openURL("https://support.runescape.com/hc/en-gb", true, false);
                              }
                           }
                        }

                        var12 = class143.loginBoxCenter - 80;
                        var61 = 321;
                        if (var33 == 1 && var7 >= var12 - 75 && var7 <= var12 + 75 && var8 >= var61 - 20 && var8 <= var61 + 20) {
                           Login.Login_username = Login.Login_username.trim();
                           if (Login.Login_username.length() == 0) {
                              class205.setLoginResponseString("", "Please enter your username/email address.", "");
                              return;
                           }

                           if (Login.Login_password.length() == 0) {
                              class205.setLoginResponseString("", "Please enter your password.", "");
                              return;
                           }

                           class205.setLoginResponseString("", "Connecting to server...", "");
                           class14.method180(false);
                           class138.updateGameState(20);
                           return;
                        }

                        var12 = Login.loginBoxX + 180 + 80;
                        if (var33 == 1 && var7 >= var12 - 75 && var7 <= var12 + 75 && var8 >= var61 - 20 && var8 <= var61 + 20) {
                           class129.method3124(0);
                           Login.Login_username = "";
                           Login.Login_password = "";
                           class204.field2330 = 0;
                           Messages.otp = "";
                           Login.field914 = true;
                        }

                        var12 = class143.loginBoxCenter + -117;
                        var61 = 277;
                        Login.field890 = var7 >= var12 && var7 < var12 + ChatChannel.field992 && var8 >= var61 && var8 < var61 + FloorUnderlayDefinition.field2096;
                        if (var33 == 1 && Login.field890) {
                           Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
                           if (!Client.Login_isUsernameRemembered && class20.clientPreferences.method2473() != null) {
                              class20.clientPreferences.method2466((String)null);
                           }
                        }

                        var12 = class143.loginBoxCenter + 24;
                        var61 = 277;
                        Login.field902 = var7 >= var12 && var7 < var12 + ChatChannel.field992 && var8 >= var61 && var8 < var61 + FloorUnderlayDefinition.field2096;
                        if (var33 == 1 && Login.field902) {
                           class20.clientPreferences.method2449(!class20.clientPreferences.method2450());
                           if (!class20.clientPreferences.method2450()) {
                              Login.Login_username = "";
                              class20.clientPreferences.method2466((String)null);
                              if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
                                 Login.currentLoginField = 1;
                              } else {
                                 Login.currentLoginField = 0;
                              }
                           }
                        }

                        label1653:
                        while(true) {
                           Transferable var79;
                           do {
                              while(true) {
                                 label1617:
                                 do {
                                    while(true) {
                                       while(var10.method4215()) {
                                          if (var10.field2362 != 13) {
                                             if (Login.currentLoginField != 0) {
                                                continue label1617;
                                             }

                                             char var66 = var10.field2361;

                                             for(var15 = 0; var15 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var66 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var15); ++var15) {
                                             }

                                             if (var10.field2362 == 85 && Login.Login_username.length() > 0) {
                                                Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                                             }

                                             if (var10.field2362 == 84 || var10.field2362 == 80) {
                                                Login.currentLoginField = 1;
                                             }

                                             var69 = var10.field2361;
                                             boolean var67 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var69) != -1;
                                             if (var67 && Login.Login_username.length() < 320) {
                                                Login.Login_username = Login.Login_username + var10.field2361;
                                             }
                                          } else {
                                             class129.method3124(0);
                                             Login.Login_username = "";
                                             Login.Login_password = "";
                                             class204.field2330 = 0;
                                             Messages.otp = "";
                                             Login.field914 = true;
                                          }
                                       }

                                       return;
                                    }
                                 } while(Login.currentLoginField != 1);

                                 if (var10.field2362 == 85 && Login.Login_password.length() > 0) {
                                    Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
                                 } else if (var10.field2362 == 84 || var10.field2362 == 80) {
                                    Login.currentLoginField = 0;
                                    if (var10.field2362 == 84) {
                                       Login.Login_username = Login.Login_username.trim();
                                       if (Login.Login_username.length() == 0) {
                                          class205.setLoginResponseString("", "Please enter your username/email address.", "");
                                          return;
                                       }

                                       if (Login.Login_password.length() == 0) {
                                          class205.setLoginResponseString("", "Please enter your password.", "");
                                          return;
                                       }

                                       class205.setLoginResponseString("", "Connecting to server...", "");
                                       class14.method180(false);
                                       class138.updateGameState(20);
                                       return;
                                    }
                                 }

                                 if ((var10.method4229(82) || var10.method4229(87)) && var10.field2362 == 67) {
                                    Clipboard var78 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var79 = var78.getContents(ScriptFrame.client);
                                    var16 = 20 - Login.Login_password.length();
                                    break;
                                 }

                                 if (MouseHandler.method714(var10.field2361)) {
                                    var65 = var10.field2361;
                                    var64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var65) != -1;
                                    if (var64 && Login.Login_password.length() < 20) {
                                       Login.Login_password = Login.Login_password + var10.field2361;
                                    }
                                 }
                              }
                           } while(var16 <= 0);

                           try {
                              var17 = (String)var79.getTransferData(DataFlavor.stringFlavor);
                              var18 = Math.min(var16, var17.length());
                              int var68 = 0;

                              while(true) {
                                 if (var68 >= var18) {
                                    Login.Login_password = Login.Login_password + var17.substring(0, var18);
                                    continue label1653;
                                 }

                                 if (!MouseHandler.method714(var17.charAt(var68))) {
                                    break;
                                 }

                                 char var21 = var17.charAt(var68);
                                 var20 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var21) != -1;
                                 if (!var20) {
                                    break;
                                 }

                                 ++var68;
                              }

                              class129.method3124(3);
                              return;
                           } catch (UnsupportedFlavorException var58) {
                           } catch (IOException var59) {
                           }
                        }
                     } else {
                        Bounds var37;
                        if (Login.loginIndex == 3) {
                           var11 = Login.loginBoxX + 180;
                           var12 = 241;
                           var37 = var1.method7408(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var11, var12);
                           if (var33 == 1 && var37.method8089(var7, var8)) {
                              Ignored.openURL("https://oldschool.runescape.com/launcher", true, false);
                           }

                           var11 = Login.loginBoxX + 180;
                           var12 = 276;
                           if (var33 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var12 - 20 && var8 <= var12 + 20) {
                              Login.method2100(false);
                           }

                           var11 = Login.loginBoxX + 180;
                           var12 = 326;
                           if (var33 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var12 - 20 && var8 <= var12 + 20) {
                              class205.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                              class129.method3124(5);
                              return;
                           }
                        } else {
                           int var14;
                           if (Login.loginIndex == 4) {
                              var11 = Login.loginBoxX + 180 - 80;
                              var12 = 321;
                              if (var33 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var12 - 20 && var8 <= var12 + 20) {
                                 Messages.otp.trim();
                                 if (Messages.otp.length() != 6) {
                                    class205.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
                                    return;
                                 }

                                 class204.field2330 = Integer.parseInt(Messages.otp);
                                 Messages.otp = "";
                                 class14.method180(true);
                                 class205.setLoginResponseString("", "Connecting to server...", "");
                                 class138.updateGameState(20);
                                 return;
                              }

                              if (var33 == 1 && var7 >= Login.loginBoxX + 180 - 9 && var7 <= Login.loginBoxX + 180 + 130 && var8 >= 263 && var8 <= 296) {
                                 Login.field914 = !Login.field914;
                              }

                              if (var33 == 1 && var7 >= Login.loginBoxX + 180 - 34 && var7 <= Login.loginBoxX + 34 + 180 && var8 >= 351 && var8 <= 363) {
                                 Ignored.openURL(InvDefinition.method3645("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                              }

                              var11 = Login.loginBoxX + 180 + 80;
                              if (var33 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var12 - 20 && var8 <= var12 + 20) {
                                 class129.method3124(0);
                                 Login.Login_username = "";
                                 Login.Login_password = "";
                                 class204.field2330 = 0;
                                 Messages.otp = "";
                              }

                              while(var10.method4215()) {
                                 boolean var13 = false;

                                 for(var14 = 0; var14 < "1234567890".length(); ++var14) {
                                    if (var10.field2361 == "1234567890".charAt(var14)) {
                                       var13 = true;
                                       break;
                                    }
                                 }

                                 if (var10.field2362 == 13) {
                                    class129.method3124(0);
                                    Login.Login_username = "";
                                    Login.Login_password = "";
                                    class204.field2330 = 0;
                                    Messages.otp = "";
                                 } else {
                                    if (var10.field2362 == 85 && Messages.otp.length() > 0) {
                                       Messages.otp = Messages.otp.substring(0, Messages.otp.length() - 1);
                                    }

                                    if (var10.field2362 == 84) {
                                       Messages.otp.trim();
                                       if (Messages.otp.length() != 6) {
                                          class205.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
                                          return;
                                       }

                                       class204.field2330 = Integer.parseInt(Messages.otp);
                                       Messages.otp = "";
                                       class14.method180(true);
                                       class205.setLoginResponseString("", "Connecting to server...", "");
                                       class138.updateGameState(20);
                                       return;
                                    }

                                    if (var13 && Messages.otp.length() < 6) {
                                       Messages.otp = Messages.otp + var10.field2361;
                                    }
                                 }
                              }
                           } else if (Login.loginIndex == 5) {
                              var11 = Login.loginBoxX + 180 - 80;
                              var12 = 321;
                              if (var33 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var12 - 20 && var8 <= var12 + 20) {
                                 Login.Login_username = Login.Login_username.trim();
                                 if (Login.Login_username.length() == 0) {
                                    class205.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                                 } else {
                                    long var38 = class264.method5481();
                                    byte var63;
                                    if (var38 == 0L) {
                                       var63 = 5;
                                    } else {
                                       var17 = Login.Login_username;
                                       Random var40 = new Random();
                                       Buffer var81 = new Buffer(128);
                                       Buffer var83 = new Buffer(128);
                                       int[] var85 = new int[]{var40.nextInt(), var40.nextInt(), (int)(var38 >> 32), (int)var38};
                                       var81.writeByte(10);

                                       int var22;
                                       for(var22 = 0; var22 < 4; ++var22) {
                                          var81.writeInt(var40.nextInt());
                                       }

                                       var81.writeInt(var85[0]);
                                       var81.writeInt(var85[1]);
                                       var81.writeLong(var38);
                                       var81.writeLong(0L);

                                       for(var22 = 0; var22 < 4; ++var22) {
                                          var81.writeInt(var40.nextInt());
                                       }

                                       var81.encryptRsa(class68.field874, class68.field871);
                                       var83.writeByte(10);

                                       for(var22 = 0; var22 < 3; ++var22) {
                                          var83.writeInt(var40.nextInt());
                                       }

                                       var83.writeLong(var40.nextLong());
                                       var83.writeLongMedium(var40.nextLong());
                                       class383.method7541(var83);
                                       var83.writeLong(var40.nextLong());
                                       var83.encryptRsa(class68.field874, class68.field871);
                                       var22 = DynamicObject.stringCp1252NullTerminatedByteSize(var17);
                                       if (var22 % 8 != 0) {
                                          var22 += 8 - var22 % 8;
                                       }

                                       Buffer var71 = new Buffer(var22);
                                       var71.writeStringCp1252NullTerminated(var17);
                                       var71.offset = var22;
                                       var71.xteaEncryptAll(var85);
                                       Buffer var24 = new Buffer(var71.offset + var83.offset + var81.offset + 5);
                                       var24.writeByte(2);
                                       var24.writeByte(var81.offset);
                                       var24.writeBytes(var81.array, 0, var81.offset);
                                       var24.writeByte(var83.offset);
                                       var24.writeBytes(var83.array, 0, var83.offset);
                                       var24.writeShort(var71.offset);
                                       var24.writeBytes(var71.array, 0, var71.offset);
                                       String var73 = WorldMapSectionType.method5427(var24.array);

                                       try {
                                          URL var74 = new URL(InvDefinition.method3645("services", false) + "m=accountappeal/login.ws");
                                          URLConnection var75 = var74.openConnection();
                                          var75.setDoInput(true);
                                          var75.setDoOutput(true);
                                          var75.setConnectTimeout(5000);
                                          OutputStreamWriter var76 = new OutputStreamWriter(var75.getOutputStream());
                                          var76.write("data2=" + class397.method7696(var73) + "&dest=" + class397.method7696("passwordchoice.ws"));
                                          var76.flush();
                                          InputStream var77 = var75.getInputStream();
                                          var24 = new Buffer(new byte[1000]);

                                          while(true) {
                                             int var30 = var77.read(var24.array, var24.offset, 1000 - var24.offset);
                                             if (var30 == -1) {
                                                var76.close();
                                                var77.close();
                                                String var88 = new String(var24.array);
                                                if (var88.startsWith("OFFLINE")) {
                                                   var16 = 4;
                                                } else if (var88.startsWith("WRONG")) {
                                                   var16 = 7;
                                                } else if (var88.startsWith("RELOAD")) {
                                                   var16 = 3;
                                                } else if (var88.startsWith("Not permitted for social network accounts.")) {
                                                   var16 = 6;
                                                } else {
                                                   var24.xteaDecryptAll(var85);

                                                   while(var24.offset > 0 && var24.array[var24.offset - 1] == 0) {
                                                      --var24.offset;
                                                   }

                                                   var88 = new String(var24.array, 0, var24.offset);
                                                   if (AttackOption.method2656(var88)) {
                                                      Ignored.openURL(var88, true, false);
                                                      var16 = 2;
                                                   } else {
                                                      var16 = 5;
                                                   }
                                                }
                                                break;
                                             }

                                             var24.offset += var30;
                                             if (var24.offset >= 1000) {
                                                var16 = 5;
                                                break;
                                             }
                                          }
                                       } catch (Throwable var54) {
                                          var54.printStackTrace();
                                          var16 = 5;
                                       }

                                       var63 = (byte)var16;
                                    }

                                    switch (var63) {
                                       case 2:
                                          class205.setLoginResponseString(Strings.field4008, Strings.field4032, Strings.field4117);
                                          class129.method3124(6);
                                          break;
                                       case 3:
                                          class205.setLoginResponseString("", "Error connecting to server.", "");
                                          break;
                                       case 4:
                                          class205.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
                                          break;
                                       case 5:
                                          class205.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
                                          break;
                                       case 6:
                                          class205.setLoginResponseString("", "Error connecting to server.", "");
                                          break;
                                       case 7:
                                          class205.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
                                    }
                                 }

                                 return;
                              }

                              var11 = Login.loginBoxX + 180 + 80;
                              if (var33 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var12 - 20 && var8 <= var12 + 20) {
                                 class6.Login_promptCredentials(true);
                              }

                              var61 = 361;
                              if (class19.field103 != null) {
                                 var14 = class19.field103.highX / 2;
                                 if (var33 == 1 && var7 >= class19.field103.lowX - var14 && var7 <= var14 + class19.field103.lowX && var8 >= var61 - 15 && var8 < var61) {
                                    Ignored.openURL(InvDefinition.method3645("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                                 }
                              }

                              while(var10.method4215()) {
                                 var64 = false;

                                 for(var15 = 0; var15 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var15) {
                                    if (var10.field2361 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var15)) {
                                       var64 = true;
                                       break;
                                    }
                                 }

                                 if (var10.field2362 == 13) {
                                    class6.Login_promptCredentials(true);
                                 } else {
                                    if (var10.field2362 == 85 && Login.Login_username.length() > 0) {
                                       Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                                    }

                                    if (var10.field2362 == 84) {
                                       Login.Login_username = Login.Login_username.trim();
                                       if (Login.Login_username.length() == 0) {
                                          class205.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                                       } else {
                                          long var45 = class264.method5481();
                                          if (var45 == 0L) {
                                             var65 = 5;
                                          } else {
                                             String var41 = Login.Login_username;
                                             Random var42 = new Random();
                                             Buffer var43 = new Buffer(128);
                                             Buffer var47 = new Buffer(128);
                                             int[] var23 = new int[]{var42.nextInt(), var42.nextInt(), (int)(var45 >> 32), (int)var45};
                                             var43.writeByte(10);

                                             int var48;
                                             for(var48 = 0; var48 < 4; ++var48) {
                                                var43.writeInt(var42.nextInt());
                                             }

                                             var43.writeInt(var23[0]);
                                             var43.writeInt(var23[1]);
                                             var43.writeLong(var45);
                                             var43.writeLong(0L);

                                             for(var48 = 0; var48 < 4; ++var48) {
                                                var43.writeInt(var42.nextInt());
                                             }

                                             var43.encryptRsa(class68.field874, class68.field871);
                                             var47.writeByte(10);

                                             for(var48 = 0; var48 < 3; ++var48) {
                                                var47.writeInt(var42.nextInt());
                                             }

                                             var47.writeLong(var42.nextLong());
                                             var47.writeLongMedium(var42.nextLong());
                                             class383.method7541(var47);
                                             var47.writeLong(var42.nextLong());
                                             var47.encryptRsa(class68.field874, class68.field871);
                                             var48 = DynamicObject.stringCp1252NullTerminatedByteSize(var41);
                                             if (var48 % 8 != 0) {
                                                var48 += 8 - var48 % 8;
                                             }

                                             Buffer var25 = new Buffer(var48);
                                             var25.writeStringCp1252NullTerminated(var41);
                                             var25.offset = var48;
                                             var25.xteaEncryptAll(var23);
                                             Buffer var26 = new Buffer(var43.offset + var47.offset + var25.offset + 5);
                                             var26.writeByte(2);
                                             var26.writeByte(var43.offset);
                                             var26.writeBytes(var43.array, 0, var43.offset);
                                             var26.writeByte(var47.offset);
                                             var26.writeBytes(var47.array, 0, var47.offset);
                                             var26.writeShort(var25.offset);
                                             var26.writeBytes(var25.array, 0, var25.offset);
                                             String var27 = WorldMapSectionType.method5427(var26.array);

                                             try {
                                                URL var28 = new URL(InvDefinition.method3645("services", false) + "m=accountappeal/login.ws");
                                                URLConnection var29 = var28.openConnection();
                                                var29.setDoInput(true);
                                                var29.setDoOutput(true);
                                                var29.setConnectTimeout(5000);
                                                OutputStreamWriter var44 = new OutputStreamWriter(var29.getOutputStream());
                                                var44.write("data2=" + class397.method7696(var27) + "&dest=" + class397.method7696("passwordchoice.ws"));
                                                var44.flush();
                                                InputStream var31 = var29.getInputStream();
                                                var26 = new Buffer(new byte[1000]);

                                                while(true) {
                                                   int var32 = var31.read(var26.array, var26.offset, 1000 - var26.offset);
                                                   if (var32 == -1) {
                                                      var44.close();
                                                      var31.close();
                                                      String var49 = new String(var26.array);
                                                      if (var49.startsWith("OFFLINE")) {
                                                         var18 = 4;
                                                      } else if (var49.startsWith("WRONG")) {
                                                         var18 = 7;
                                                      } else if (var49.startsWith("RELOAD")) {
                                                         var18 = 3;
                                                      } else if (var49.startsWith("Not permitted for social network accounts.")) {
                                                         var18 = 6;
                                                      } else {
                                                         var26.xteaDecryptAll(var23);

                                                         while(var26.offset > 0 && var26.array[var26.offset - 1] == 0) {
                                                            --var26.offset;
                                                         }

                                                         var49 = new String(var26.array, 0, var26.offset);
                                                         if (AttackOption.method2656(var49)) {
                                                            Ignored.openURL(var49, true, false);
                                                            var18 = 2;
                                                         } else {
                                                            var18 = 5;
                                                         }
                                                      }
                                                      break;
                                                   }

                                                   var26.offset += var32;
                                                   if (var26.offset >= 1000) {
                                                      var18 = 5;
                                                      break;
                                                   }
                                                }
                                             } catch (Throwable var55) {
                                                var55.printStackTrace();
                                                var18 = 5;
                                             }

                                             var65 = (char)var18;
                                          }

                                          switch (var65) {
                                             case '\u0002':
                                                class205.setLoginResponseString(Strings.field4008, Strings.field4032, Strings.field4117);
                                                class129.method3124(6);
                                                break;
                                             case '\u0003':
                                                class205.setLoginResponseString("", "Error connecting to server.", "");
                                                break;
                                             case '\u0004':
                                                class205.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
                                                break;
                                             case '\u0005':
                                                class205.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
                                                break;
                                             case '\u0006':
                                                class205.setLoginResponseString("", "Error connecting to server.", "");
                                                break;
                                             case '\u0007':
                                                class205.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
                                          }
                                       }

                                       return;
                                    }

                                    if (var64 && Login.Login_username.length() < 320) {
                                       Login.Login_username = Login.Login_username + var10.field2361;
                                    }
                                 }
                              }
                           } else if (Login.loginIndex != 6) {
                              if (Login.loginIndex == 7) {
                                 if (WorldMapSectionType.field2983 && !Client.onMobile) {
                                    var11 = class143.loginBoxCenter - 150;
                                    var12 = var11 + 40 + 240 + 25;
                                    var61 = 231;
                                    var14 = var61 + 40;
                                    if (var33 == 1 && var7 >= var11 && var7 <= var12 && var8 >= var61 && var8 <= var14) {
                                       var16 = var11;
                                       int var50 = 0;

                                       while(true) {
                                          if (var50 >= 8) {
                                             var15 = 0;
                                             break;
                                          }

                                          if (var7 <= var16 + 30) {
                                             var15 = var50;
                                             break;
                                          }

                                          var16 += 30;
                                          var16 += var50 != 1 && var50 != 3 ? 5 : 20;
                                          ++var50;
                                       }

                                       Login.field909 = var15;
                                    }

                                    var15 = Login.loginBoxX + 180 - 80;
                                    var69 = 321;
                                    boolean var19;
                                    int var51;
                                    String var72;
                                    Date var80;
                                    Date var82;
                                    SimpleDateFormat var84;
                                    StringBuilder var86;
                                    Date var87;
                                    String[] var89;
                                    boolean var90;
                                    if (var33 == 1 && var7 >= var15 - 75 && var7 <= var15 + 75 && var8 >= var69 - 20 && var8 <= var69 + 20) {
                                       label1469: {
                                          try {
                                             var84 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                             var84.setLenient(false);
                                             var86 = new StringBuilder();
                                             var89 = Login.field910;
                                             var51 = 0;

                                             while(true) {
                                                if (var51 >= var89.length) {
                                                   var86.append("12");
                                                   var82 = var84.parse(var86.toString());
                                                   break;
                                                }

                                                var72 = var89[var51];
                                                if (var72 == null) {
                                                   WorldMapRectangle.method5466("Date not valid.", "Please ensure all characters are populated.", "");
                                                   var82 = null;
                                                   break;
                                                }

                                                var86.append(var72);
                                                ++var51;
                                             }

                                             var80 = var82;
                                          } catch (ParseException var57) {
                                             WorldMapRectangle.method5466("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                             var90 = false;
                                             break label1469;
                                          }

                                          if (var80 == null) {
                                             var90 = false;
                                          } else {
                                             var19 = class81.method2247(var80);
                                             var87 = Varcs.method2747();
                                             var20 = var80.after(var87);
                                             if (!var20) {
                                                WorldMapRectangle.method5466("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                var90 = false;
                                             } else {
                                                if (!var19) {
                                                   ByteArrayPool.field4478 = 8388607;
                                                } else {
                                                   ByteArrayPool.field4478 = (int)(var80.getTime() / 86400000L - 11745L);
                                                }

                                                var90 = true;
                                             }
                                          }
                                       }

                                       if (var90) {
                                          class138.updateGameState(50);
                                          return;
                                       }
                                    }

                                    var15 = Login.loginBoxX + 180 + 80;
                                    if (var33 == 1 && var7 >= var15 - 75 && var7 <= var15 + 75 && var8 >= var69 - 20 && var8 <= var69 + 20) {
                                       Login.field910 = new String[8];
                                       class6.Login_promptCredentials(true);
                                    }

                                    while(var10.method4215()) {
                                       if (var10.field2362 == 101) {
                                          Login.field910[Login.field909] = null;
                                       }

                                       if (var10.field2362 == 85) {
                                          if (Login.field910[Login.field909] == null && Login.field909 > 0) {
                                             --Login.field909;
                                          }

                                          Login.field910[Login.field909] = null;
                                       }

                                       if (var10.field2361 >= '0' && var10.field2361 <= '9') {
                                          Login.field910[Login.field909] = "" + var10.field2361;
                                          if (Login.field909 < 7) {
                                             ++Login.field909;
                                          }
                                       }

                                       if (var10.field2362 == 84) {
                                          label1397: {
                                             try {
                                                var84 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                                var84.setLenient(false);
                                                var86 = new StringBuilder();
                                                var89 = Login.field910;
                                                var51 = 0;

                                                while(true) {
                                                   if (var51 < var89.length) {
                                                      var72 = var89[var51];
                                                      if (var72 != null) {
                                                         var86.append(var72);
                                                         ++var51;
                                                         continue;
                                                      }

                                                      WorldMapRectangle.method5466("Date not valid.", "Please ensure all characters are populated.", "");
                                                      var82 = null;
                                                   } else {
                                                      var86.append("12");
                                                      var82 = var84.parse(var86.toString());
                                                   }

                                                   var80 = var82;
                                                   break;
                                                }
                                             } catch (ParseException var56) {
                                                WorldMapRectangle.method5466("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                var90 = false;
                                                break label1397;
                                             }

                                             if (var80 == null) {
                                                var90 = false;
                                             } else {
                                                var19 = class81.method2247(var80);
                                                var87 = Varcs.method2747();
                                                var20 = var80.after(var87);
                                                if (!var20) {
                                                   WorldMapRectangle.method5466("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                   var90 = false;
                                                } else {
                                                   if (!var19) {
                                                      ByteArrayPool.field4478 = 8388607;
                                                   } else {
                                                      ByteArrayPool.field4478 = (int)(var80.getTime() / 86400000L - 11745L);
                                                   }

                                                   var90 = true;
                                                }
                                             }
                                          }

                                          if (var90) {
                                             class138.updateGameState(50);
                                          }

                                          return;
                                       }
                                    }
                                 } else {
                                    var11 = Login.loginBoxX + 180 - 80;
                                    var12 = 321;
                                    if (var33 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var12 - 20 && var8 <= var12 + 20) {
                                       Ignored.openURL(InvDefinition.method3645("secure", true) + "m=dob/set_dob.ws", true, false);
                                       class205.setLoginResponseString("", "Page has opened in the browser.", "");
                                       class129.method3124(6);
                                       return;
                                    }

                                    var11 = Login.loginBoxX + 180 + 80;
                                    if (var33 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var12 - 20 && var8 <= var12 + 20) {
                                       class6.Login_promptCredentials(true);
                                    }
                                 }
                              } else if (Login.loginIndex == 8) {
                                 var11 = Login.loginBoxX + 180 - 80;
                                 var62 = 321;
                                 if (var33 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var62 - 20 && var8 <= var62 + 20) {
                                    Ignored.openURL("https://www.jagex.com/terms/privacy", true, false);
                                    class205.setLoginResponseString("", "Page has opened in the browser.", "");
                                    class129.method3124(6);
                                    return;
                                 }

                                 var11 = Login.loginBoxX + 180 + 80;
                                 if (var33 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var62 - 20 && var8 <= var62 + 20) {
                                    class6.Login_promptCredentials(true);
                                 }
                              } else if (Login.loginIndex == 9) {
                                 var11 = Login.loginBoxX + 180;
                                 var62 = 311;
                                 if (var34.field2362 == 84 || var34.field2362 == 13 || var33 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var62 - 20 && var8 <= var62 + 20) {
                                    Login.method2100(false);
                                 }
                              } else if (Login.loginIndex == 10) {
                                 var11 = Login.loginBoxX + 180;
                                 var62 = 209;
                                 if (var34.field2362 == 84 || var33 == 1 && var7 >= var11 - 109 && var7 <= var11 + 109 && var8 >= var62 && var8 <= var62 + 68) {
                                    class205.setLoginResponseString("", "Connecting to server...", "");
                                    Client.field527 = class493.field5044;
                                    class14.method180(false);
                                    class138.updateGameState(20);
                                 }
                              } else if (Login.loginIndex == 12) {
                                 var11 = class143.loginBoxCenter;
                                 var62 = 233;
                                 var37 = var2.method7408(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var11, var62);
                                 Bounds var35 = var2.method7408(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var11, var62);
                                 Bounds var36 = var2.method7408(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var11, var62);
                                 var12 = var62 + 17;
                                 Bounds var52 = var2.method7408(0, 34, "<col=ffd200>agreement (EULA)</col>.", var11, var12);
                                 if (var33 == 1) {
                                    if (var37.method8089(var7, var8)) {
                                       Ignored.openURL("https://www.jagex.com/terms", true, false);
                                    } else if (var35.method8089(var7, var8)) {
                                       Ignored.openURL("https://www.jagex.com/terms/privacy", true, false);
                                    } else if (var36.method8089(var7, var8) || var52.method8089(var7, var8)) {
                                       Ignored.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                                    }
                                 }

                                 var11 = class143.loginBoxCenter - 80;
                                 var62 = 311;
                                 if (var33 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var62 - 20 && var8 <= var62 + 20) {
                                    class20.clientPreferences.method2468(Client.field493);
                                    Login.method2100(true);
                                 }

                                 var11 = class143.loginBoxCenter + 80;
                                 if (var33 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var62 - 20 && var8 <= var62 + 20) {
                                    Login.loginIndex = 13;
                                 }
                              } else if (Login.loginIndex == 13) {
                                 var11 = class143.loginBoxCenter;
                                 var62 = 321;
                                 if (var33 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var62 - 20 && var8 <= var62 + 20) {
                                    Login.method2100(true);
                                 }
                              } else if (Login.loginIndex == 14) {
                                 String var53 = "";
                                 switch (Login.Login_banType) {
                                    case 0:
                                       var53 = "https://secure.runescape.com/m=offence-appeal/account-history";
                                       break;
                                    case 1:
                                       var53 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                                       break;
                                    case 2:
                                       var53 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                                       break;
                                    default:
                                       class6.Login_promptCredentials(false);
                                 }

                                 var12 = Login.loginBoxX + 180;
                                 var61 = 276;
                                 if (var33 == 1 && var7 >= var12 - 75 && var7 <= var12 + 75 && var8 >= var61 - 20 && var8 <= var61 + 20) {
                                    Ignored.openURL(var53, true, false);
                                    class205.setLoginResponseString("", "Page has opened in the browser.", "");
                                    class129.method3124(6);
                                    return;
                                 }

                                 var12 = Login.loginBoxX + 180;
                                 var61 = 326;
                                 if (var33 == 1 && var7 >= var12 - 75 && var7 <= var12 + 75 && var8 >= var61 - 20 && var8 <= var61 + 20) {
                                    class6.Login_promptCredentials(false);
                                 }
                              } else if (Login.loginIndex == 24) {
                                 var11 = Login.loginBoxX + 180;
                                 var62 = 301;
                                 if (var33 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var62 - 20 && var8 <= var62 + 20) {
                                    Login.method2100(false);
                                 }
                              } else if (Login.loginIndex == 32) {
                                 var11 = Login.loginBoxX + 180 - 80;
                                 var62 = 321;
                                 if (var33 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var62 - 20 && var8 <= var62 + 20) {
                                    Ignored.openURL(InvDefinition.method3645("secure", true) + "m=dob/set_dob.ws", true, false);
                                    class205.setLoginResponseString("", "Page has opened in the browser.", "");
                                    class129.method3124(6);
                                    return;
                                 }

                                 var11 = Login.loginBoxX + 180 + 80;
                                 if (var33 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var62 - 20 && var8 <= var62 + 20) {
                                    class6.Login_promptCredentials(true);
                                 }
                              } else if (Login.loginIndex == 33) {
                                 var11 = Login.loginBoxX + 180;
                                 var62 = 276;
                                 if (var33 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var62 - 20 && var8 <= var62 + 20) {
                                    Ignored.openURL("https://oldschool.runescape.com/launcher", true, false);
                                 }

                                 var11 = Login.loginBoxX + 180;
                                 var62 = 326;
                                 if (var33 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var62 - 20 && var8 <= var62 + 20) {
                                    class6.Login_promptCredentials(true);
                                 }
                              }
                           } else {
                              while(true) {
                                 do {
                                    if (!var10.method4215()) {
                                       var60 = 321;
                                       if (var33 == 1 && var8 >= var60 - 20 && var8 <= var60 + 20) {
                                          class6.Login_promptCredentials(true);
                                       }

                                       return;
                                    }
                                 } while(var10.field2362 != 84 && var10.field2362 != 13);

                                 class6.Login_promptCredentials(true);
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

   @ObfuscatedName("ic")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1074260583"
   )
   static final void method3744() {
      for(int var0 = 0; var0 < Client.npcCount; ++var0) {
         int var1 = Client.npcIndices[var0];
         NPC var2 = Client.npcs[var1];
         if (var2 != null) {
            ReflectionCheck.updateActorSequence(var2, var2.definition.size);
         }
      }

   }

   @ObfuscatedName("jb")
   @ObfuscatedSignature(
      descriptor = "(Llm;I)V",
      garbageValue = "-302991134"
   )
   static final void method3751(class287 var0) {
      PacketBuffer var1 = Client.packetWriter.packetBuffer;
      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      if (class287.field3200 == var0) {
         var2 = var1.readUnsignedByte();
         var3 = var1.readUnsignedByte();
         var4 = (var3 >> 4 & 7) + class9.field43;
         var5 = (var3 & 7) + FontName.field4882;
         var6 = var1.readUnsignedByteSub() * 4;
         var7 = var1.readUnsignedShortAdd();
         var8 = var1.readUnsignedByteSub();
         var9 = var1.readUnsignedShort();
         byte var36 = var1.readByteNeg();
         var11 = var1.readUnsignedByteNeg() * 4;
         var12 = var1.readUnsignedShort();
         var13 = var1.method9117();
         byte var37 = var1.readByteSub();
         var14 = var37 + var4;
         var10 = var36 + var5;
         if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var14 >= 0 && var10 >= 0 && var14 < 104 && var10 < 104 && var7 != 65535) {
            var4 = var4 * 128 + 64;
            var5 = var5 * 128 + 64;
            var14 = var14 * 128 + 64;
            var10 = var10 * 128 + 64;
            Projectile var35 = new Projectile(var7, GameEngine.Client_plane, var4, var5, class147.getTileHeight(var4, var5, GameEngine.Client_plane) - var11, var9 + Client.cycle, var12 + Client.cycle, var2, var8, var13, var6);
            var35.setDestination(var14, var10, class147.getTileHeight(var14, var10, GameEngine.Client_plane) - var6, var9 + Client.cycle);
            Client.projectiles.addFirst(var35);
         }

      } else {
         if (class287.field3197 == var0) {
            var2 = var1.readUnsignedShort();
            var3 = var1.readByteSub();
            var4 = var1.readByteAdd();
            var5 = var1.readUnsignedByteAdd();
            var6 = (var5 >> 4 & 7) + class9.field43;
            var7 = (var5 & 7) + FontName.field4882;
            var8 = var1.readByte();
            var9 = var1.readUnsignedShort();
            var10 = var1.readByteAdd();
            var11 = var1.readUnsignedByte();
            var12 = var11 >> 2;
            var13 = var11 & 3;
            var14 = Client.field563[var12];
            int var15 = var1.readUnsignedShortAdd();
            int var16 = var1.readUnsignedShortAddLE();
            Player var17;
            if (var2 == Client.localPlayerIndex) {
               var17 = MusicPatchNode.localPlayer;
            } else {
               var17 = Client.players[var2];
            }

            if (var17 != null) {
               ObjectComposition var18 = class144.getObjectDefinition(var16);
               int var19;
               int var20;
               if (var13 != 1 && var13 != 3) {
                  var19 = var18.sizeX;
                  var20 = var18.sizeY;
               } else {
                  var19 = var18.sizeY;
                  var20 = var18.sizeX;
               }

               int var21 = var6 + (var19 >> 1);
               int var22 = var6 + (var19 + 1 >> 1);
               int var23 = var7 + (var20 >> 1);
               int var24 = var7 + (var20 + 1 >> 1);
               int[][] var25 = Tiles.Tiles_heights[GameEngine.Client_plane];
               int var26 = var25[var21][var24] + var25[var22][var23] + var25[var21][var23] + var25[var22][var24] >> 2;
               int var27 = (var6 << 7) + (var19 << 6);
               int var28 = (var7 << 7) + (var20 << 6);
               Model var29 = var18.getModel(var12, var13, var25, var27, var26, var28);
               if (var29 != null) {
                  class33.method508(GameEngine.Client_plane, var6, var7, var14, -1, 0, 0, 31, var9 + 1, var15 + 1);
                  var17.animationCycleStart = var9 + Client.cycle;
                  var17.animationCycleEnd = var15 + Client.cycle;
                  var17.model0 = var29;
                  var17.field1094 = var6 * 128 + var19 * 64;
                  var17.field1098 = var7 * 128 + var20 * 64;
                  var17.tileHeight2 = var26;
                  byte var30;
                  if (var8 > var10) {
                     var30 = (byte)var8;
                     var8 = var10;
                     var10 = var30;
                  }

                  if (var3 > var4) {
                     var30 = (byte)var3;
                     var3 = var4;
                     var4 = var30;
                  }

                  var17.minX = var6 + var8;
                  var17.maxX = var6 + var10;
                  var17.minY = var7 + var3;
                  var17.maxY = var4 + var7;
               }
            }
         }

         if (class287.field3196 == var0) {
            var2 = var1.readUnsignedByteSub();
            var3 = (var2 >> 4 & 7) + class9.field43;
            var4 = (var2 & 7) + FontName.field4882;
            var5 = var1.readInt();
            var6 = var1.readUnsignedShortAddLE();
            var7 = var1.readInt();
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
               NodeDeque var41 = Client.groundItems[GameEngine.Client_plane][var3][var4];
               if (var41 != null) {
                  for(TileItem var34 = (TileItem)var41.last(); var34 != null; var34 = (TileItem)var41.previous()) {
                     if ((var6 & 32767) == var34.id && var7 == var34.quantity) {
                        var34.quantity = var5;
                        break;
                     }
                  }

                  class121.updateItemPile(var3, var4);
               }
            }

         } else {
            TileItem var38;
            if (class287.field3205 == var0) {
               var1.readUnsignedByteAdd();
               var2 = var1.readUnsignedIntLE();
               var3 = var1.readUnsignedByteAdd();
               var4 = var1.readUnsignedByte();
               var5 = (var4 >> 4 & 7) + class9.field43;
               var6 = (var4 & 7) + FontName.field4882;
               var7 = var1.readUnsignedShortAdd();
               var1.readUnsignedShortLE();
               var1.readUnsignedShortAdd();
               var1.readUnsignedByteNeg();
               if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                  var38 = new TileItem();
                  var38.id = var7;
                  var38.quantity = var2;
                  var38.method2663(var3);
                  if (Client.groundItems[GameEngine.Client_plane][var5][var6] == null) {
                     Client.groundItems[GameEngine.Client_plane][var5][var6] = new NodeDeque();
                  }

                  Client.groundItems[GameEngine.Client_plane][var5][var6].addFirst(var38);
                  class121.updateItemPile(var5, var6);
               }

            } else if (class287.field3202 == var0) {
               var2 = var1.readUnsignedByte();
               var3 = var1.readUnsignedByteSub();
               var4 = (var3 >> 4 & 7) + class9.field43;
               var5 = (var3 & 7) + FontName.field4882;
               var6 = var1.readUnsignedByteNeg();
               var7 = var6 >> 2;
               var8 = var6 & 3;
               var9 = Client.field563[var7];
               var10 = var1.readUnsignedShortLE();
               if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                  class33.method508(GameEngine.Client_plane, var4, var5, var9, var10, var7, var8, var2, 0, -1);
               }

            } else {
               NodeDeque var33;
               if (class287.field3204 == var0) {
                  var2 = var1.readUnsignedByteNeg();
                  var3 = (var2 >> 4 & 7) + class9.field43;
                  var4 = (var2 & 7) + FontName.field4882;
                  var5 = var1.readUnsignedShortLE();
                  var6 = var1.readUnsignedIntIME();
                  if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                     var33 = Client.groundItems[GameEngine.Client_plane][var3][var4];
                     if (var33 != null) {
                        for(var38 = (TileItem)var33.last(); var38 != null; var38 = (TileItem)var33.previous()) {
                           if ((var5 & 32767) == var38.id && var6 == var38.quantity) {
                              var38.remove();
                              break;
                           }
                        }

                        if (var33.last() == null) {
                           Client.groundItems[GameEngine.Client_plane][var3][var4] = null;
                        }

                        class121.updateItemPile(var3, var4);
                     }
                  }

               } else {
                  if (class287.field3208 == var0) {
                     var2 = var1.readUnsignedShortAddLE();
                     var3 = var1.readUnsignedByteNeg();
                     var4 = var3 >> 4 & 15;
                     var5 = var3 & 7;
                     var6 = var1.readUnsignedByteAdd();
                     var7 = (var6 >> 4 & 7) + class9.field43;
                     var8 = (var6 & 7) + FontName.field4882;
                     var9 = var1.readUnsignedByteSub();
                     if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                        var10 = var4 + 1;
                        if (MusicPatchNode.localPlayer.pathX[0] >= var7 - var10 && MusicPatchNode.localPlayer.pathX[0] <= var10 + var7 && MusicPatchNode.localPlayer.pathY[0] >= var8 - var10 && MusicPatchNode.localPlayer.pathY[0] <= var8 + var10 && class20.clientPreferences.method2465() != 0 && var5 > 0 && Client.soundEffectCount < 50) {
                           Client.soundEffectIds[Client.soundEffectCount] = var2;
                           Client.queuedSoundEffectLoops[Client.soundEffectCount] = var5;
                           Client.queuedSoundEffectDelays[Client.soundEffectCount] = var9;
                           Client.soundEffects[Client.soundEffectCount] = null;
                           Client.soundLocations[Client.soundEffectCount] = var4 + (var8 << 8) + (var7 << 16);
                           ++Client.soundEffectCount;
                        }
                     }
                  }

                  if (class287.field3203 == var0) {
                     var2 = var1.readUnsignedShortAddLE();
                     var3 = var1.readUnsignedByteNeg();
                     var4 = (var3 >> 4 & 7) + class9.field43;
                     var5 = (var3 & 7) + FontName.field4882;
                     var6 = var1.readUnsignedByteAdd();
                     if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                        var33 = Client.groundItems[GameEngine.Client_plane][var4][var5];
                        if (var33 != null) {
                           for(var38 = (TileItem)var33.last(); var38 != null; var38 = (TileItem)var33.previous()) {
                              if ((var2 & 32767) == var38.id) {
                                 var38.method2663(var6);
                                 break;
                              }
                           }
                        }
                     }

                  } else if (class287.field3199 != var0) {
                     if (class287.field3206 == var0) {
                        var2 = var1.readUnsignedByteAdd();
                        var3 = (var2 >> 4 & 7) + class9.field43;
                        var4 = (var2 & 7) + FontName.field4882;
                        var5 = var1.readUnsignedByte();
                        var6 = var5 >> 2;
                        var7 = var5 & 3;
                        var8 = Client.field563[var6];
                        if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                           class33.method508(GameEngine.Client_plane, var3, var4, var8, -1, var6, var7, 31, 0, -1);
                        }

                     } else if (class287.field3201 == var0) {
                        var2 = var1.readUnsignedByteNeg();
                        var3 = var1.readUnsignedShort();
                        var4 = var1.readUnsignedByteSub();
                        var5 = (var4 >> 4 & 7) + class9.field43;
                        var6 = (var4 & 7) + FontName.field4882;
                        var7 = var1.readUnsignedShortLE();
                        if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                           var5 = var5 * 128 + 64;
                           var6 = var6 * 128 + 64;
                           GraphicsObject var31 = new GraphicsObject(var7, GameEngine.Client_plane, var5, var6, class147.getTileHeight(var5, var6, GameEngine.Client_plane) - var2, var3, Client.cycle);
                           Client.graphicsObjects.addFirst(var31);
                        }

                     }
                  } else {
                     var2 = var1.readUnsignedByte();
                     var3 = (var2 >> 4 & 7) + class9.field43;
                     var4 = (var2 & 7) + FontName.field4882;
                     var5 = var1.readUnsignedShortLE();
                     var6 = var1.readUnsignedByteNeg();
                     var7 = var6 >> 2;
                     var8 = var6 & 3;
                     var9 = Client.field563[var7];
                     if (var3 >= 0 && var4 >= 0 && var3 < 103 && var4 < 103) {
                        if (var9 == 0) {
                           BoundaryObject var32 = class31.scene.method4544(GameEngine.Client_plane, var3, var4);
                           if (var32 != null) {
                              var11 = InterfaceParent.Entity_unpackID(var32.tag);
                              if (var7 == 2) {
                                 var32.renderable1 = new DynamicObject(var11, 2, var8 + 4, GameEngine.Client_plane, var3, var4, var5, false, var32.renderable1);
                                 var32.renderable2 = new DynamicObject(var11, 2, var8 + 1 & 3, GameEngine.Client_plane, var3, var4, var5, false, var32.renderable2);
                              } else {
                                 var32.renderable1 = new DynamicObject(var11, var7, var8, GameEngine.Client_plane, var3, var4, var5, false, var32.renderable1);
                              }

                              return;
                           }
                        }

                        if (var9 == 1) {
                           WallDecoration var39 = class31.scene.method4545(GameEngine.Client_plane, var3, var4);
                           if (var39 != null) {
                              var11 = InterfaceParent.Entity_unpackID(var39.tag);
                              if (var7 != 4 && var7 != 5) {
                                 if (var7 == 6) {
                                    var39.renderable1 = new DynamicObject(var11, 4, var8 + 4, GameEngine.Client_plane, var3, var4, var5, false, var39.renderable1);
                                 } else if (var7 == 7) {
                                    var39.renderable1 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, GameEngine.Client_plane, var3, var4, var5, false, var39.renderable1);
                                 } else if (var7 == 8) {
                                    var39.renderable1 = new DynamicObject(var11, 4, var8 + 4, GameEngine.Client_plane, var3, var4, var5, false, var39.renderable1);
                                    var39.renderable2 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, GameEngine.Client_plane, var3, var4, var5, false, var39.renderable2);
                                 }
                              } else {
                                 var39.renderable1 = new DynamicObject(var11, 4, var8, GameEngine.Client_plane, var3, var4, var5, false, var39.renderable1);
                              }

                              return;
                           }
                        }

                        if (var9 == 2) {
                           GameObject var40 = class31.scene.getGameObject(GameEngine.Client_plane, var3, var4);
                           if (var7 == 11) {
                              var7 = 10;
                           }

                           if (var40 != null) {
                              var40.renderable = new DynamicObject(InterfaceParent.Entity_unpackID(var40.tag), var7, var8, GameEngine.Client_plane, var3, var4, var5, false, var40.renderable);
                              return;
                           }
                        }

                        if (var9 == 3) {
                           FloorDecoration var42 = class31.scene.getFloorDecoration(GameEngine.Client_plane, var3, var4);
                           if (var42 != null) {
                              var42.renderable = new DynamicObject(InterfaceParent.Entity_unpackID(var42.tag), 22, var8, GameEngine.Client_plane, var3, var4, var5, false, var42.renderable);
                              return;
                           }
                        }

                        class186.method3736(GameEngine.Client_plane, var3, var4, var9, var5);
                     }

                  }
               }
            }
         }
      }
   }
}
