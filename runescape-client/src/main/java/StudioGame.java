import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("le")
@Implements("StudioGame")
public enum StudioGame implements MouseWheel {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lle;"
   )
   @Export("runescape")
   runescape("runescape", "RuneScape", 0),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lle;"
   )
   @Export("stellardawn")
   stellardawn("stellardawn", "Stellar Dawn", 1),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lle;"
   )
   @Export("game3")
   game3("game3", "Game 3", 2),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lle;"
   )
   @Export("game4")
   game4("game4", "Game 4", 3),
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lle;"
   )
   @Export("game5")
   game5("game5", "Game 5", 4),
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lle;"
   )
   @Export("oldscape")
   oldscape("oldscape", "RuneScape 2007", 5);

   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "Lrg;"
   )
   @Export("worldSelectLeftSprite")
   static IndexedSprite worldSelectLeftSprite;
   @ObfuscatedName("i")
   @Export("name")
   public final String name;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 167550277
   )
   @Export("id")
   final int id;

   StudioGame(String var3, String var4, int var5) {
      this.name = var3;
      this.id = var5;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "3"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/util/Date;",
      garbageValue = "1538018106"
   )
   static Date method6442() {
      java.util.Calendar var0 = java.util.Calendar.getInstance();
      var0.set(2, 0);
      var0.set(5, 1);
      var0.set(1, 1900);
      return var0.getTime();
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "62754255"
   )
   static int method6441(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.publicChatMode;
         return 1;
      } else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
         class302.Interpreter_intStackSize -= 3;
         Client.publicChatMode = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
         class288.privateChatMode = NewStuff.method3719(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]);
         if (class288.privateChatMode == null) {
            class288.privateChatMode = PrivateChatMode.field5072;
         }

         Client.tradeChatMode = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2];
         PacketBufferNode var13 = Renderable.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
         var13.packetBuffer.writeByte(Client.publicChatMode);
         var13.packetBuffer.writeByte(class288.privateChatMode.field5071);
         var13.packetBuffer.writeByte(Client.tradeChatMode);
         Client.packetWriter.addNode(var13);
         return 1;
      } else {
         PacketBufferNode var6;
         int var7;
         String var8;
         int var9;
         if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
            var8 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
            class302.Interpreter_intStackSize -= 2;
            var7 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var9 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            var6 = Renderable.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
            var6.packetBuffer.writeByte(class96.stringCp1252NullTerminatedByteSize(var8) + 2);
            var6.packetBuffer.writeStringCp1252NullTerminated(var8);
            var6.packetBuffer.writeByte(var7 - 1);
            var6.packetBuffer.writeByte(var9);
            Client.packetWriter.addNode(var6);
            return 1;
         } else {
            int var3;
            Message var5;
            if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
               class302.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
               var7 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
               var5 = Message.Messages_getByChannelAndID(var3, var7);
               if (var5 != null) {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var5.count;
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var5.cycle;
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
               } else {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else {
               Message var4;
               if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
                  var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  var4 = class17.Messages_getMessage(var3);
                  if (var4 != null) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.type;
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.cycle;
                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
                  } else {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
                  if (class288.privateChatMode == null) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                  } else {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class288.privateChatMode.field5071;
                  }

                  return 1;
               } else {
                  PacketBufferNode var12;
                  if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
                     var8 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                     var12 = class96.method2686(var7, var8, class36.clientLanguage, -1);
                     Client.packetWriter.addNode(var12);
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
                     class20.Interpreter_stringStackSize -= 2;
                     var8 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize];
                     String var11 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize + 1];
                     var12 = Renderable.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
                     var12.packetBuffer.writeShort(0);
                     int var10 = var12.packetBuffer.offset;
                     var12.packetBuffer.writeStringCp1252NullTerminated(var8);
                     ServerPacket.method5563(var12.packetBuffer, var11);
                     var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
                     Client.packetWriter.addNode(var12);
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
                     var8 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
                     class302.Interpreter_intStackSize -= 2;
                     var7 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
                     var6 = class96.method2686(var7, var8, class36.clientLanguage, var9);
                     Client.packetWriter.addNode(var6);
                     return 1;
                  } else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
                     if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
                        Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.tradeChatMode;
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
                        var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                        Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Projectile.Messages_getHistorySize(var3);
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
                        var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                        Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class7.Messages_getLastChatID(var3);
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
                        var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                        Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapSection1.method5370(var3);
                        return 1;
                     } else if (var0 == ScriptOpcodes.DOCHEAT) {
                        var8 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
                        ScriptFrame.doCheat(var8);
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
                        Client.field738 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize].toLowerCase().trim();
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
                        Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = Client.field738;
                        return 1;
                     } else if (var0 == ScriptOpcodes.WRITECONSOLE) {
                        var8 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
                        System.out.println(var8);
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
                        class302.Interpreter_intStackSize -= 2;
                        var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                        var7 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
                        var5 = Message.Messages_getByChannelAndID(var3, var7);
                        if (var5 != null) {
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var5.count;
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var5.cycle;
                           Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
                           Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
                           Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
                           Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                        } else {
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                           Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                           Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                        }

                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
                        var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                        var4 = class17.Messages_getMessage(var3);
                        if (var4 != null) {
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.type;
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.cycle;
                           Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
                           Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
                           Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
                           Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                        } else {
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                           Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                           Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                        }

                        return 1;
                     } else {
                        return 2;
                     }
                  } else {
                     if (class387.localPlayer != null && class387.localPlayer.username != null) {
                        var8 = class387.localPlayer.username.getName();
                     } else {
                        var8 = "";
                     }

                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var8;
                     return 1;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("gi")
   @ObfuscatedSignature(
      descriptor = "(Lge;IIII)V",
      garbageValue = "1802078195"
   )
   static void method6440(SequenceDefinition var0, int var1, int var2, int var3) {
      if (Client.soundEffectCount < 50 && PacketWriter.clientPreferences.method2499() != 0) {
         if (var0.field2290 != null && var0.field2290.containsKey(var1)) {
            class461.method8491((Integer)var0.field2290.get(var1), var2, var3);
         }
      }
   }
}
