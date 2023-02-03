import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("db")
@Implements("PacketWriter")
public class PacketWriter {
   @ObfuscatedName("vq")
   @ObfuscatedSignature(
      descriptor = "Lcy;"
   )
   @Export("clientPreferences")
   static ClientPreferences clientPreferences;
   @ObfuscatedName("ur")
   @ObfuscatedGetter(
      intValue = -2145885545
   )
   static int field1404;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lov;"
   )
   @Export("socket")
   AbstractSocket socket;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lmt;"
   )
   @Export("packetBufferNodes")
   IterableNodeDeque packetBufferNodes = new IterableNodeDeque();
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1193707915
   )
   @Export("bufferSize")
   int bufferSize = 0;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lrd;"
   )
   @Export("buffer")
   Buffer buffer = new Buffer(5000);
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lrt;"
   )
   @Export("isaacCipher")
   public IsaacCipher isaacCipher;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lru;"
   )
   @Export("packetBuffer")
   PacketBuffer packetBuffer = new PacketBuffer(40000);
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   @Export("serverPacket")
   ServerPacket serverPacket = null;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1900433183
   )
   @Export("serverPacketLength")
   int serverPacketLength = 0;
   @ObfuscatedName("l")
   boolean field1397 = true;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -74398163
   )
   int field1398 = 0;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -460541475
   )
   @Export("pendingWrites")
   int pendingWrites = 0;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   ServerPacket field1405;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   ServerPacket field1401;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   ServerPacket field1402;

   PacketWriter() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "30455"
   )
   @Export("clearBuffer")
   final void clearBuffer() {
      this.packetBufferNodes.rsClear();
      this.bufferSize = 0;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-60"
   )
   @Export("flush")
   final void flush() throws IOException {
      if (this.socket != null && this.bufferSize > 0) {
         this.buffer.offset = 0;

         while(true) {
            PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last();
            if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) {
               this.socket.write(this.buffer.array, 0, this.buffer.offset);
               this.pendingWrites = 0;
               break;
            }

            this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index);
            this.bufferSize -= var1.index;
            var1.remove();
            var1.packetBuffer.releaseArray();
            var1.release();
         }
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lji;B)V",
      garbageValue = "35"
   )
   @Export("addNode")
   public final void addNode(PacketBufferNode var1) {
      this.packetBufferNodes.addFirst(var1);
      var1.index = var1.packetBuffer.offset;
      var1.packetBuffer.offset = 0;
      this.bufferSize += var1.index;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Lov;S)V",
      garbageValue = "-25572"
   )
   @Export("setSocket")
   void setSocket(AbstractSocket var1) {
      this.socket = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-365633246"
   )
   @Export("close")
   void close() {
      if (this.socket != null) {
         this.socket.close();
         this.socket = null;
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "8"
   )
   @Export("removeSocket")
   void removeSocket() {
      this.socket = null;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(B)Lov;",
      garbageValue = "-5"
   )
   @Export("getSocket")
   AbstractSocket getSocket() {
      return this.socket;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Laj;Lnv;I)V",
      garbageValue = "1044238917"
   )
   @Export("loginScreen")
   static void loginScreen(GameEngine var0, Font var1) {
      if (Login.worldSelectOpen) {
         HealthBar.method2610(var0);
      } else {
         if ((MouseHandler.MouseHandler_lastButton == 1 || !ClanMate.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
            clientPreferences.method2563(!clientPreferences.method2570());
            if (!clientPreferences.method2570()) {
               Skeleton.method4454(class153.archive6, "scape main", "", 255, false);
            } else {
               class177.method3538();
            }
         }

         if (Client.gameState != 5) {
            if (-1L == Login.field921) {
               Login.field921 = class153.method3317() + 1000L;
            }

            long var2 = class153.method3317();
            boolean var4;
            if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
               while(true) {
                  if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) {
                     var4 = true;
                     break;
                  }

                  ArchiveLoader var5 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
                  if (!var5.isLoaded()) {
                     var4 = false;
                     break;
                  }

                  ++Client.archiveLoadersDone;
               }
            } else {
               var4 = true;
            }

            if (var4 && -1L == Login.field904) {
               Login.field904 = var2;
               if (Login.field904 > Login.field921) {
                  Login.field921 = Login.field904;
               }
            }

            if (Client.gameState == 10 || Client.gameState == 11) {
               int var6;
               int var7;
               int var21;
               if (class36.clientLanguage == Language.Language_EN) {
                  if (MouseHandler.MouseHandler_lastButton == 1 || !ClanMate.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
                     var21 = Login.xPadding + 5;
                     var6 = 463;
                     var7 = 100;
                     byte var8 = 35;
                     if (MouseHandler.MouseHandler_lastPressedX >= var21 && MouseHandler.MouseHandler_lastPressedX <= var7 + var21 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var8 + var6) {
                        FloorDecoration.method4315();
                        return;
                     }
                  }

                  if (ClanChannel.World_request != null) {
                     FloorDecoration.method4315();
                  }
               }

               var21 = MouseHandler.MouseHandler_lastButton;
               var6 = MouseHandler.MouseHandler_lastPressedX;
               var7 = MouseHandler.MouseHandler_lastPressedY;
               if (var21 == 0) {
                  var6 = MouseHandler.MouseHandler_x;
                  var7 = MouseHandler.MouseHandler_y;
               }

               if (!ClanMate.mouseCam && var21 == 4) {
                  var21 = 1;
               }

               class205 var22 = Client.field702;
               class205 var9 = var22;
               int var11;
               short var32;
               if (Login.loginIndex == 0) {
                  boolean var39 = false;

                  while(var9.method4141()) {
                     if (var9.field2339 == 84) {
                        var39 = true;
                     }
                  }

                  var11 = class143.loginBoxCenter - 80;
                  var32 = 291;
                  if (var21 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var32 - 20 && var7 <= var32 + 20) {
                     AttackOption.openURL(class310.method6356("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                  }

                  var11 = class143.loginBoxCenter + 80;
                  if (var21 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var32 - 20 && var7 <= var32 + 20 || var39) {
                     if ((Client.worldProperties & 33554432) != 0) {
                        Login.Login_response0 = "";
                        Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                        Login.Login_response2 = "Your normal account will not be affected.";
                        Login.Login_response3 = "";
                        ReflectionCheck.method696(1);
                        class361.method6967();
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
                        ReflectionCheck.method696(1);
                        class361.method6967();
                     } else if ((Client.worldProperties & 1024) != 0) {
                        Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                        Login.Login_response2 = "The Protect Item prayer will";
                        Login.Login_response3 = "not work on this world.";
                        Login.Login_response0 = "Warning!";
                        ReflectionCheck.method696(1);
                        class361.method6967();
                     } else {
                        UserComparator6.Login_promptCredentials(false);
                     }
                  }
               } else {
                  int var10;
                  short var33;
                  if (Login.loginIndex == 1) {
                     while(true) {
                        if (!var9.method4141()) {
                           var10 = class143.loginBoxCenter - 80;
                           var33 = 321;
                           if (var21 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var33 - 20 && var7 <= var33 + 20) {
                              UserComparator6.Login_promptCredentials(false);
                           }

                           var10 = class143.loginBoxCenter + 80;
                           if (var21 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var33 - 20 && var7 <= var33 + 20) {
                              ReflectionCheck.method696(0);
                           }
                           break;
                        }

                        if (var9.field2339 == 84) {
                           UserComparator6.Login_promptCredentials(false);
                        } else if (var9.field2339 == 13) {
                           ReflectionCheck.method696(0);
                        }
                     }
                  } else {
                     int var14;
                     int var15;
                     short var31;
                     boolean var34;
                     char var36;
                     if (Login.loginIndex == 2) {
                        var31 = 201;
                        var10 = var31 + 52;
                        if (var21 == 1 && var7 >= var10 - 12 && var7 < var10 + 2) {
                           Login.currentLoginField = 0;
                        }

                        var10 += 15;
                        if (var21 == 1 && var7 >= var10 - 12 && var7 < var10 + 2) {
                           Login.currentLoginField = 1;
                        }

                        var10 += 15;
                        var31 = 361;
                        if (Calendar.field3727 != null) {
                           var11 = Calendar.field3727.highX / 2;
                           if (var21 == 1 && var6 >= Calendar.field3727.lowX - var11 && var6 <= var11 + Calendar.field3727.lowX && var7 >= var31 - 15 && var7 < var31) {
                              switch (Login.field917) {
                                 case 1:
                                    class70.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                                    ReflectionCheck.method696(5);
                                    return;
                                 case 2:
                                    AttackOption.openURL("https://support.runescape.com/hc/en-gb", true, false);
                              }
                           }
                        }

                        var11 = class143.loginBoxCenter - 80;
                        var32 = 321;
                        if (var21 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var32 - 20 && var7 <= var32 + 20) {
                           Login.Login_username = Login.Login_username.trim();
                           if (Login.Login_username.length() == 0) {
                              class70.setLoginResponseString("", "Please enter your username/email address.", "");
                              return;
                           }

                           if (Login.Login_password.length() == 0) {
                              class70.setLoginResponseString("", "Please enter your password.", "");
                              return;
                           }

                           class70.setLoginResponseString("", "Connecting to server...", "");
                           class373.method7183(false);
                           class246.updateGameState(20);
                           return;
                        }

                        var11 = Login.loginBoxX + 180 + 80;
                        if (var21 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var32 - 20 && var7 <= var32 + 20) {
                           ReflectionCheck.method696(0);
                           Login.Login_username = "";
                           Login.Login_password = "";
                           UserComparator4.field1429 = 0;
                           InvDefinition.otp = "";
                           Login.field930 = true;
                        }

                        var11 = class143.loginBoxCenter + -117;
                        var32 = 277;
                        Login.field939 = var6 >= var11 && var6 < var11 + WorldMapRectangle.field2963 && var7 >= var32 && var7 < var32 + class134.field1613;
                        if (var21 == 1 && Login.field939) {
                           Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
                           if (!Client.Login_isUsernameRemembered && clientPreferences.method2545() != null) {
                              clientPreferences.method2500((String)null);
                           }
                        }

                        var11 = class143.loginBoxCenter + 24;
                        var32 = 277;
                        Login.field934 = var6 >= var11 && var6 < var11 + WorldMapRectangle.field2963 && var7 >= var32 && var7 < var32 + class134.field1613;
                        if (var21 == 1 && Login.field934) {
                           clientPreferences.method2483(!clientPreferences.method2484());
                           if (!clientPreferences.method2484()) {
                              Login.Login_username = "";
                              clientPreferences.method2500((String)null);
                              class361.method6967();
                           }
                        }

                        label1246:
                        while(true) {
                           Transferable var41;
                           do {
                              while(true) {
                                 label1210:
                                 do {
                                    while(true) {
                                       while(var9.method4141()) {
                                          if (var9.field2339 != 13) {
                                             if (Login.currentLoginField != 0) {
                                                continue label1210;
                                             }

                                             char var35 = var9.field2333;

                                             for(var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var35 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14); ++var14) {
                                             }

                                             if (var9.field2339 == 85 && Login.Login_username.length() > 0) {
                                                Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                                             }

                                             if (var9.field2339 == 84 || var9.field2339 == 80) {
                                                Login.currentLoginField = 1;
                                             }

                                             var36 = var9.field2333;
                                             boolean var37 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var36) != -1;
                                             if (var37 && Login.Login_username.length() < 320) {
                                                Login.Login_username = Login.Login_username + var9.field2333;
                                             }
                                          } else {
                                             ReflectionCheck.method696(0);
                                             Login.Login_username = "";
                                             Login.Login_password = "";
                                             UserComparator4.field1429 = 0;
                                             InvDefinition.otp = "";
                                             Login.field930 = true;
                                          }
                                       }

                                       return;
                                    }
                                 } while(Login.currentLoginField != 1);

                                 if (var9.field2339 == 85 && Login.Login_password.length() > 0) {
                                    Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
                                 } else if (var9.field2339 == 84 || var9.field2339 == 80) {
                                    Login.currentLoginField = 0;
                                    if (var9.field2339 == 84) {
                                       Login.Login_username = Login.Login_username.trim();
                                       if (Login.Login_username.length() == 0) {
                                          class70.setLoginResponseString("", "Please enter your username/email address.", "");
                                          return;
                                       }

                                       if (Login.Login_password.length() == 0) {
                                          class70.setLoginResponseString("", "Please enter your password.", "");
                                          return;
                                       }

                                       class70.setLoginResponseString("", "Connecting to server...", "");
                                       class373.method7183(false);
                                       class246.updateGameState(20);
                                       return;
                                    }
                                 }

                                 if ((var9.method4143(82) || var9.method4143(87)) && var9.field2339 == 67) {
                                    Clipboard var40 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var41 = var40.getContents(Decimator.client);
                                    var15 = 20 - Login.Login_password.length();
                                    break;
                                 }

                                 if (MusicPatch.method5789(var9.field2333)) {
                                    char var38 = var9.field2333;
                                    var34 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var38) != -1;
                                    if (var34 && Login.Login_password.length() < 20) {
                                       Login.Login_password = Login.Login_password + var9.field2333;
                                    }
                                 }
                              }
                           } while(var15 <= 0);

                           try {
                              String var16 = (String)var41.getTransferData(DataFlavor.stringFlavor);
                              int var17 = Math.min(var15, var16.length());
                              int var18 = 0;

                              while(true) {
                                 if (var18 >= var17) {
                                    Login.Login_password = Login.Login_password + var16.substring(0, var17);
                                    continue label1246;
                                 }

                                 if (!MusicPatch.method5789(var16.charAt(var18))) {
                                    break;
                                 }

                                 char var20 = var16.charAt(var18);
                                 boolean var19 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var20) != -1;
                                 if (!var19) {
                                    break;
                                 }

                                 ++var18;
                              }

                              ReflectionCheck.method696(3);
                              return;
                           } catch (UnsupportedFlavorException var29) {
                           } catch (IOException var30) {
                           }
                        }
                     } else if (Login.loginIndex == 3) {
                        var10 = Login.loginBoxX + 180;
                        var11 = 276;
                        if (var21 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var11 - 20 && var7 <= var11 + 20) {
                           GrandExchangeOfferNameComparator.method6672(false);
                        }

                        var10 = Login.loginBoxX + 180;
                        var11 = 326;
                        if (var21 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var11 - 20 && var7 <= var11 + 20) {
                           class70.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                           ReflectionCheck.method696(5);
                           return;
                        }
                     } else {
                        int var13;
                        if (Login.loginIndex == 4) {
                           var10 = Login.loginBoxX + 180 - 80;
                           var11 = 321;
                           if (var21 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var11 - 20 && var7 <= var11 + 20) {
                              InvDefinition.otp.trim();
                              if (InvDefinition.otp.length() != 6) {
                                 class70.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
                                 return;
                              }

                              UserComparator4.field1429 = Integer.parseInt(InvDefinition.otp);
                              InvDefinition.otp = "";
                              class373.method7183(true);
                              class70.setLoginResponseString("", "Connecting to server...", "");
                              class246.updateGameState(20);
                              return;
                           }

                           if (var21 == 1 && var6 >= Login.loginBoxX + 180 - 9 && var6 <= Login.loginBoxX + 180 + 130 && var7 >= 263 && var7 <= 296) {
                              Login.field930 = !Login.field930;
                           }

                           if (var21 == 1 && var6 >= Login.loginBoxX + 180 - 34 && var6 <= Login.loginBoxX + 34 + 180 && var7 >= 351 && var7 <= 363) {
                              AttackOption.openURL(class310.method6356("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                           }

                           var10 = Login.loginBoxX + 180 + 80;
                           if (var21 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var11 - 20 && var7 <= var11 + 20) {
                              ReflectionCheck.method696(0);
                              Login.Login_username = "";
                              Login.Login_password = "";
                              UserComparator4.field1429 = 0;
                              InvDefinition.otp = "";
                           }

                           while(var9.method4141()) {
                              boolean var12 = false;

                              for(var13 = 0; var13 < "1234567890".length(); ++var13) {
                                 if (var9.field2333 == "1234567890".charAt(var13)) {
                                    var12 = true;
                                    break;
                                 }
                              }

                              if (var9.field2339 == 13) {
                                 ReflectionCheck.method696(0);
                                 Login.Login_username = "";
                                 Login.Login_password = "";
                                 UserComparator4.field1429 = 0;
                                 InvDefinition.otp = "";
                              } else {
                                 if (var9.field2339 == 85 && InvDefinition.otp.length() > 0) {
                                    InvDefinition.otp = InvDefinition.otp.substring(0, InvDefinition.otp.length() - 1);
                                 }

                                 if (var9.field2339 == 84) {
                                    InvDefinition.otp.trim();
                                    if (InvDefinition.otp.length() != 6) {
                                       class70.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
                                       return;
                                    }

                                    UserComparator4.field1429 = Integer.parseInt(InvDefinition.otp);
                                    InvDefinition.otp = "";
                                    class373.method7183(true);
                                    class70.setLoginResponseString("", "Connecting to server...", "");
                                    class246.updateGameState(20);
                                    return;
                                 }

                                 if (var12 && InvDefinition.otp.length() < 6) {
                                    InvDefinition.otp = InvDefinition.otp + var9.field2333;
                                 }
                              }
                           }
                        } else if (Login.loginIndex == 5) {
                           var10 = Login.loginBoxX + 180 - 80;
                           var11 = 321;
                           if (var21 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var11 - 20 && var7 <= var11 + 20) {
                              WorldMapAreaData.method5426();
                              return;
                           }

                           var10 = Login.loginBoxX + 180 + 80;
                           if (var21 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var11 - 20 && var7 <= var11 + 20) {
                              UserComparator6.Login_promptCredentials(true);
                           }

                           var32 = 361;
                           if (class290.field3364 != null) {
                              var13 = class290.field3364.highX / 2;
                              if (var21 == 1 && var6 >= class290.field3364.lowX - var13 && var6 <= var13 + class290.field3364.lowX && var7 >= var32 - 15 && var7 < var32) {
                                 AttackOption.openURL(class310.method6356("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                              }
                           }

                           while(var9.method4141()) {
                              var34 = false;

                              for(var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var14) {
                                 if (var9.field2333 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14)) {
                                    var34 = true;
                                    break;
                                 }
                              }

                              if (var9.field2339 == 13) {
                                 UserComparator6.Login_promptCredentials(true);
                              } else {
                                 if (var9.field2339 == 85 && Login.Login_username.length() > 0) {
                                    Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                                 }

                                 if (var9.field2339 == 84) {
                                    WorldMapAreaData.method5426();
                                    return;
                                 }

                                 if (var34 && Login.Login_username.length() < 320) {
                                    Login.Login_username = Login.Login_username + var9.field2333;
                                 }
                              }
                           }
                        } else if (Login.loginIndex != 6) {
                           if (Login.loginIndex == 7) {
                              if (class209.field2376 && !Client.onMobile) {
                                 var10 = class143.loginBoxCenter - 150;
                                 var11 = var10 + 40 + 240 + 25;
                                 var32 = 231;
                                 var13 = var32 + 40;
                                 if (var21 == 1 && var6 >= var10 && var6 <= var11 && var7 >= var32 && var7 <= var13) {
                                    var15 = var10;
                                    int var25 = 0;

                                    while(true) {
                                       if (var25 >= 8) {
                                          var14 = 0;
                                          break;
                                       }

                                       if (var6 <= var15 + 30) {
                                          var14 = var25;
                                          break;
                                       }

                                       var15 += 30;
                                       var15 += var25 != 1 && var25 != 3 ? 5 : 20;
                                       ++var25;
                                    }

                                    Login.field925 = var14;
                                 }

                                 var14 = Login.loginBoxX + 180 - 80;
                                 var36 = 321;
                                 boolean var42;
                                 if (var21 == 1 && var6 >= var14 - 75 && var6 <= var14 + 75 && var7 >= var36 - 20 && var7 <= var36 + 20) {
                                    var42 = Language.method6781();
                                    if (var42) {
                                       class246.updateGameState(50);
                                       return;
                                    }
                                 }

                                 var14 = Login.loginBoxX + 180 + 80;
                                 if (var21 == 1 && var6 >= var14 - 75 && var6 <= var14 + 75 && var7 >= var36 - 20 && var7 <= var36 + 20) {
                                    Login.field926 = new String[8];
                                    UserComparator6.Login_promptCredentials(true);
                                 }

                                 while(var9.method4141()) {
                                    if (var9.field2339 == 101) {
                                       Login.field926[Login.field925] = null;
                                    }

                                    if (var9.field2339 == 85) {
                                       if (Login.field926[Login.field925] == null && Login.field925 > 0) {
                                          --Login.field925;
                                       }

                                       Login.field926[Login.field925] = null;
                                    }

                                    if (var9.field2333 >= '0' && var9.field2333 <= '9') {
                                       Login.field926[Login.field925] = "" + var9.field2333;
                                       if (Login.field925 < 7) {
                                          ++Login.field925;
                                       }
                                    }

                                    if (var9.field2339 == 84) {
                                       var42 = Language.method6781();
                                       if (var42) {
                                          class246.updateGameState(50);
                                       }

                                       return;
                                    }
                                 }
                              } else {
                                 var10 = Login.loginBoxX + 180 - 80;
                                 var11 = 321;
                                 if (var21 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var11 - 20 && var7 <= var11 + 20) {
                                    AttackOption.openURL(class310.method6356("secure", true) + "m=dob/set_dob.ws", true, false);
                                    class70.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                    ReflectionCheck.method696(6);
                                    return;
                                 }

                                 var10 = Login.loginBoxX + 180 + 80;
                                 if (var21 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var11 - 20 && var7 <= var11 + 20) {
                                    UserComparator6.Login_promptCredentials(true);
                                 }
                              }
                           } else if (Login.loginIndex == 8) {
                              var10 = Login.loginBoxX + 180 - 80;
                              var33 = 321;
                              if (var21 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var33 - 20 && var7 <= var33 + 20) {
                                 AttackOption.openURL("https://www.jagex.com/terms/privacy", true, false);
                                 class70.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                 ReflectionCheck.method696(6);
                                 return;
                              }

                              var10 = Login.loginBoxX + 180 + 80;
                              if (var21 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var33 - 20 && var7 <= var33 + 20) {
                                 UserComparator6.Login_promptCredentials(true);
                              }
                           } else if (Login.loginIndex == 9) {
                              var10 = Login.loginBoxX + 180;
                              var33 = 311;
                              if (var22.field2339 == 84 || var22.field2339 == 13 || var21 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var33 - 20 && var7 <= var33 + 20) {
                                 GrandExchangeOfferNameComparator.method6672(false);
                              }
                           } else if (Login.loginIndex == 10) {
                              var10 = Login.loginBoxX + 180;
                              var33 = 209;
                              if (var22.field2339 == 84 || var21 == 1 && var6 >= var10 - 109 && var6 <= var10 + 109 && var7 >= var33 && var7 <= var33 + 68) {
                                 class70.setLoginResponseString("", "Connecting to server...", "");
                                 Client.field536 = class478.field4992;
                                 class373.method7183(false);
                                 class246.updateGameState(20);
                              }
                           } else if (Login.loginIndex == 12) {
                              var10 = class143.loginBoxCenter;
                              var33 = 233;
                              Bounds var26 = var1.method7261(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var33);
                              Bounds var23 = var1.method7261(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var33);
                              Bounds var24 = var1.method7261(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var33);
                              var11 = var33 + 17;
                              Bounds var27 = var1.method7261(0, 34, "<col=ffd200>agreement (EULA)</col>.", var10, var11);
                              if (var21 == 1) {
                                 if (var26.method7850(var6, var7)) {
                                    AttackOption.openURL("https://www.jagex.com/terms", true, false);
                                 } else if (var23.method7850(var6, var7)) {
                                    AttackOption.openURL("https://www.jagex.com/terms/privacy", true, false);
                                 } else if (var24.method7850(var6, var7) || var27.method7850(var6, var7)) {
                                    AttackOption.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                                 }
                              }

                              var10 = class143.loginBoxCenter - 80;
                              var33 = 311;
                              if (var21 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var33 - 20 && var7 <= var33 + 20) {
                                 FriendsChat.method7572();
                                 GrandExchangeOfferNameComparator.method6672(true);
                              }

                              var10 = class143.loginBoxCenter + 80;
                              if (var21 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var33 - 20 && var7 <= var33 + 20) {
                                 Login.loginIndex = 13;
                              }
                           } else if (Login.loginIndex == 13) {
                              var10 = class143.loginBoxCenter;
                              var33 = 321;
                              if (var21 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var33 - 20 && var7 <= var33 + 20) {
                                 GrandExchangeOfferNameComparator.method6672(true);
                              }
                           } else if (Login.loginIndex == 14) {
                              String var28 = "";
                              switch (Login.Login_banType) {
                                 case 0:
                                    var28 = "https://secure.runescape.com/m=offence-appeal/account-history";
                                    break;
                                 case 1:
                                    var28 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                                    break;
                                 case 2:
                                    var28 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                                    break;
                                 default:
                                    UserComparator6.Login_promptCredentials(false);
                              }

                              var11 = Login.loginBoxX + 180;
                              var32 = 276;
                              if (var21 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var32 - 20 && var7 <= var32 + 20) {
                                 AttackOption.openURL(var28, true, false);
                                 class70.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                 ReflectionCheck.method696(6);
                                 return;
                              }

                              var11 = Login.loginBoxX + 180;
                              var32 = 326;
                              if (var21 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var32 - 20 && var7 <= var32 + 20) {
                                 UserComparator6.Login_promptCredentials(false);
                              }
                           } else if (Login.loginIndex == 24) {
                              var10 = Login.loginBoxX + 180;
                              var33 = 301;
                              if (var21 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var33 - 20 && var7 <= var33 + 20) {
                                 GrandExchangeOfferNameComparator.method6672(false);
                              }
                           } else if (Login.loginIndex == 26) {
                              var10 = Login.loginBoxX + 180 - 80;
                              var33 = 321;
                              if (var21 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var33 - 20 && var7 <= var33 + 20) {
                                 AttackOption.openURL(class310.method6356("secure", true) + "m=dob/set_dob.ws", true, false);
                                 class70.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                 ReflectionCheck.method696(6);
                                 return;
                              }

                              var10 = Login.loginBoxX + 180 + 80;
                              if (var21 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var33 - 20 && var7 <= var33 + 20) {
                                 UserComparator6.Login_promptCredentials(true);
                              }
                           }
                        } else {
                           while(true) {
                              do {
                                 if (!var9.method4141()) {
                                    var31 = 321;
                                    if (var21 == 1 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                                       UserComparator6.Login_promptCredentials(true);
                                    }

                                    return;
                                 }
                              } while(var9.field2339 != 84 && var9.field2339 != 13);

                              UserComparator6.Login_promptCredentials(true);
                           }
                        }
                     }
                  }
               }

            }
         }
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZB)I",
      garbageValue = "3"
   )
   static int method2847(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.CLIENTCLOCK) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.cycle;
         return 1;
      } else {
         int var3;
         int var4;
         if (var0 == ScriptOpcodes.INV_GETOBJ) {
            class302.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class6.method49(var3, var4);
            return 1;
         } else if (var0 == ScriptOpcodes.INV_GETNUM) {
            class302.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = DefaultsGroup.ItemContainer_getCount(var3, var4);
            return 1;
         } else if (var0 == ScriptOpcodes.INV_TOTAL) {
            class302.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class280.method5545(var3, var4);
            return 1;
         } else if (var0 == ScriptOpcodes.INV_SIZE) {
            var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.getInvDefinition(var3).size;
            return 1;
         } else if (var0 == ScriptOpcodes.STAT) {
            var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
            return 1;
         } else if (var0 == ScriptOpcodes.STAT_BASE) {
            var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.levels[var3];
            return 1;
         } else if (var0 == ScriptOpcodes.STAT_XP) {
            var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.experience[var3];
            return 1;
         } else {
            int var5;
            if (var0 == ScriptOpcodes.COORD) {
               var3 = class103.Client_plane;
               var4 = ParamComposition.baseX * 64 + (class387.localPlayer.x >> 7);
               var5 = Client.baseY * 64 + (class387.localPlayer.y >> 7);
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
               return 1;
            } else if (var0 == ScriptOpcodes.COORDX) {
               var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
               return 1;
            } else if (var0 == ScriptOpcodes.COORDZ) {
               var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 >> 28;
               return 1;
            } else if (var0 == ScriptOpcodes.COORDY) {
               var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 & 16383;
               return 1;
            } else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
               class302.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize] + '耀';
               var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class6.method49(var3, var4);
               return 1;
            } else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
               class302.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize] + '耀';
               var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = DefaultsGroup.ItemContainer_getCount(var3, var4);
               return 1;
            } else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
               class302.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize] + '耀';
               var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class280.method5545(var3, var4);
               return 1;
            } else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
               if (Client.staffModLevel >= 2) {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.staffModLevel;
               } else {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.REBOOTTIMER) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.rebootTimer;
               return 1;
            } else if (var0 == ScriptOpcodes.MAP_WORLD) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.worldId;
               return 1;
            } else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.runEnergy / 100;
               return 1;
            } else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.weight;
               return 1;
            } else if (var0 == ScriptOpcodes.PLAYERMOD) {
               if (Client.playerMod) {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.WORLDFLAGS) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.worldProperties;
               return 1;
            } else if (var0 == ScriptOpcodes.MOVECOORD) {
               class302.Interpreter_intStackSize -= 4;
               var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
               var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
               var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2];
               int var6 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 3];
               var3 += var4 << 14;
               var3 += var5 << 28;
               var3 += var6;
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3;
               return 1;
            } else if (var0 == 3326) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.field563;
               return 1;
            } else if (var0 == 3327) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.field513;
               return 1;
            } else if (var0 == 3331) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.runEnergy;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }
}
