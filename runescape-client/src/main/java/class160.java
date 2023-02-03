import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fe")
public class class160 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "-1845674352"
   )
   static int method3374(int var0, Script var1, boolean var2) {
      String var3;
      int var10;
      if (var0 == ScriptOpcodes.APPEND_NUM) {
         var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
         var10 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3 + var10;
         return 1;
      } else {
         String var4;
         if (var0 == ScriptOpcodes.APPEND) {
            class20.Interpreter_stringStackSize -= 2;
            var3 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize];
            var4 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize + 1];
            Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3 + var4;
            return 1;
         } else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
            var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
            var10 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3 + ParamComposition.intToString(var10, true);
            return 1;
         } else if (var0 == ScriptOpcodes.LOWERCASE) {
            var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
            Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3.toLowerCase();
            return 1;
         } else {
            int var6;
            int var7;
            int var11;
            if (var0 == ScriptOpcodes.FROMDATE) {
               var11 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
               long var14 = 86400000L * (11745L + (long)var11);
               Interpreter.Interpreter_calendar.setTime(new Date(var14));
               var6 = Interpreter.Interpreter_calendar.get(5);
               var7 = Interpreter.Interpreter_calendar.get(2);
               int var8 = Interpreter.Interpreter_calendar.get(1);
               Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var7] + "-" + var8;
               return 1;
            } else if (var0 != ScriptOpcodes.TEXT_GENDER) {
               if (var0 == ScriptOpcodes.TOSTRING) {
                  var11 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = Integer.toString(var11);
                  return 1;
               } else if (var0 == ScriptOpcodes.COMPARE) {
                  class20.Interpreter_stringStackSize -= 2;
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = AbstractArchive.method6625(Projectile.compareStrings(Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize + 1], class36.clientLanguage));
                  return 1;
               } else {
                  int var9;
                  byte[] var12;
                  Font var13;
                  if (var0 == ScriptOpcodes.PARAHEIGHT) {
                     var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
                     class302.Interpreter_intStackSize -= 2;
                     var10 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
                     var12 = PendingSpawn.archive13.takeFile(var9, 0);
                     var13 = new Font(var12);
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.PARAWIDTH) {
                     var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
                     class302.Interpreter_intStackSize -= 2;
                     var10 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
                     var12 = PendingSpawn.archive13.takeFile(var9, 0);
                     var13 = new Font(var12);
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
                     class20.Interpreter_stringStackSize -= 2;
                     var3 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize];
                     var4 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize + 1];
                     if (Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1) {
                        Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3;
                     } else {
                        Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4;
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.ESCAPE) {
                     var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
                     return 1;
                  } else if (var0 == ScriptOpcodes.APPEND_CHAR) {
                     var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
                     var10 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3 + (char)var10;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
                     var11 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class126.isCharPrintable((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
                     var11 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class97.isAlphaNumeric((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
                     var11 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class155.isCharAlphabetic((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
                     var11 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = CollisionMap.isDigit((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.STRING_LENGTH) {
                     var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
                     if (var3 != null) {
                        Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.length();
                     } else {
                        Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.SUBSTRING) {
                     var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
                     class302.Interpreter_intStackSize -= 2;
                     var10 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3.substring(var10, var9);
                     return 1;
                  } else if (var0 == ScriptOpcodes.REMOVETAGS) {
                     var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
                     StringBuilder var16 = new StringBuilder(var3.length());
                     boolean var17 = false;

                     for(var6 = 0; var6 < var3.length(); ++var6) {
                        var7 = var3.charAt(var6);
                        if (var7 == 60) {
                           var17 = true;
                        } else if (var7 == 62) {
                           var17 = false;
                        } else if (!var17) {
                           var16.append((char)var7);
                        }
                     }

                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var16.toString();
                     return 1;
                  } else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
                     var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
                     var10 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.indexOf(var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
                     class20.Interpreter_stringStackSize -= 2;
                     var3 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize];
                     var4 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize + 1];
                     var9 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9);
                     return 1;
                  } else if (var0 == 4122) {
                     var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3.toUpperCase();
                     return 1;
                  } else if (var0 == 4123) {
                     class20.Interpreter_stringStackSize -= 3;
                     var3 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize];
                     var4 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize + 1];
                     String var5 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize + 2];
                     if (class387.localPlayer.appearance == null) {
                        Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var5;
                        return 1;
                     } else {
                        switch (class387.localPlayer.appearance.field3486) {
                           case 0:
                              Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3;
                              break;
                           case 1:
                              Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4;
                              break;
                           case 2:
                           default:
                              Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var5;
                        }

                        return 1;
                     }
                  } else {
                     return 2;
                  }
               }
            } else {
               class20.Interpreter_stringStackSize -= 2;
               var3 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize];
               var4 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize + 1];
               if (class387.localPlayer.appearance != null && class387.localPlayer.appearance.gender != 0) {
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4;
               } else {
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3;
               }

               return 1;
            }
         }
      }
   }

   @ObfuscatedName("ge")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1080663115"
   )
   @Export("setWindowedMode")
   static void setWindowedMode(int var0) {
      Client.field733 = 0L;
      if (var0 >= 2) {
         Client.isResizable = true;
      } else {
         Client.isResizable = false;
      }

      if (Message.getWindowedMode() == 1) {
         Decimator.client.setMaxCanvasSize(765, 503);
      } else {
         Decimator.client.setMaxCanvasSize(7680, 2160);
      }

      if (Client.gameState >= 25) {
         PacketBufferNode var1 = Renderable.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
         var1.packetBuffer.writeByte(Message.getWindowedMode());
         var1.packetBuffer.writeShort(GameEngine.canvasWidth);
         var1.packetBuffer.writeShort(class127.canvasHeight);
         Client.packetWriter.addNode(var1);
      }

   }

   @ObfuscatedName("lr")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "0"
   )
   @Export("clanKickUser")
   static final void clanKickUser(String var0) {
      if (class463.friendsChat != null) {
         PacketBufferNode var1 = Renderable.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher);
         var1.packetBuffer.writeByte(class96.stringCp1252NullTerminatedByteSize(var0));
         var1.packetBuffer.writeStringCp1252NullTerminated(var0);
         Client.packetWriter.addNode(var1);
      }
   }

   @ObfuscatedName("lm")
   @ObfuscatedSignature(
      descriptor = "(Lkz;I)Z",
      garbageValue = "419433067"
   )
   @Export("isComponentHidden")
   static boolean isComponentHidden(Widget var0) {
      return var0.isHidden;
   }
}
