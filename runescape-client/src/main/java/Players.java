import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eh")
@Implements("Players")
public class Players {
   @ObfuscatedName("av")
   static byte[] field1330 = new byte[2048];
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "[Lie;"
   )
   static class216[] field1328 = new class216[2048];
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "[Ltz;"
   )
   static Buffer[] field1332 = new Buffer[2048];
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 377514575
   )
   @Export("Players_count")
   static int Players_count = 0;
   @ObfuscatedName("ab")
   @Export("Players_indices")
   static int[] Players_indices = new int[2048];
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1650114917
   )
   @Export("Players_emptyIdxCount")
   static int Players_emptyIdxCount = 0;
   @ObfuscatedName("ae")
   @Export("Players_emptyIndices")
   static int[] Players_emptyIndices = new int[2048];
   @ObfuscatedName("af")
   @Export("Players_regions")
   static int[] Players_regions = new int[2048];
   @ObfuscatedName("ao")
   @Export("Players_orientations")
   static int[] Players_orientations = new int[2048];
   @ObfuscatedName("aa")
   @Export("Players_targetIndices")
   static int[] Players_targetIndices = new int[2048];
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 262229345
   )
   @Export("Players_pendingUpdateCount")
   static int Players_pendingUpdateCount = 0;
   @ObfuscatedName("ad")
   @Export("Players_pendingUpdateIndices")
   static int[] Players_pendingUpdateIndices = new int[2048];
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Ltz;"
   )
   static Buffer field1342 = new Buffer(new byte[5000]);

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZI)I",
      garbageValue = "2142252006"
   )
   static int method2699(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.publicChatMode;
         return 1;
      } else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
         Interpreter.Interpreter_intStackSize -= 3;
         Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         SpotAnimationDefinition.privateChatMode = class404.method7633(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
         if (SpotAnimationDefinition.privateChatMode == null) {
            SpotAnimationDefinition.privateChatMode = PrivateChatMode.field5154;
         }

         Client.tradeChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         PacketBufferNode var13 = ObjectComposition.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
         var13.packetBuffer.writeByte(Client.publicChatMode);
         var13.packetBuffer.writeByte(SpotAnimationDefinition.privateChatMode.field5156);
         var13.packetBuffer.writeByte(Client.tradeChatMode);
         Client.packetWriter.addNode(var13);
         return 1;
      } else {
         PacketBufferNode var6;
         int var7;
         String var8;
         int var9;
         if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
            var8 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
            Interpreter.Interpreter_intStackSize -= 2;
            var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var6 = ObjectComposition.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
            var6.packetBuffer.writeByte(Widget.stringCp1252NullTerminatedByteSize(var8) + 2);
            var6.packetBuffer.writeStringCp1252NullTerminated(var8);
            var6.packetBuffer.writeByte(var7 - 1);
            var6.packetBuffer.writeByte(var9);
            Client.packetWriter.addNode(var6);
            return 1;
         } else {
            int var3;
            Message var5;
            if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
               Interpreter.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
               var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
               var5 = UserComparator5.Messages_getByChannelAndID(var3, var7);
               if (var5 != null) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle;
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else {
               Message var4;
               if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = class166.Messages_getMessage(var3);
                  if (var4 != null) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type;
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle;
                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
                  } else {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
                  if (SpotAnimationDefinition.privateChatMode == null) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                  } else {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SpotAnimationDefinition.privateChatMode.field5156;
                  }

                  return 1;
               } else {
                  PacketBufferNode var12;
                  if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
                     var8 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     var12 = SpotAnimationDefinition.method3778(var7, var8, TriBool.clientLanguage, -1);
                     Client.packetWriter.addNode(var12);
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
                     class149.Interpreter_stringStackSize -= 2;
                     var8 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize];
                     String var11 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize + 1];
                     var12 = ObjectComposition.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
                     var12.packetBuffer.writeShort(0);
                     int var10 = var12.packetBuffer.offset;
                     var12.packetBuffer.writeStringCp1252NullTerminated(var8);
                     class324.method6006(var12.packetBuffer, var11);
                     var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
                     Client.packetWriter.addNode(var12);
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
                     var8 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
                     Interpreter.Interpreter_intStackSize -= 2;
                     var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var6 = SpotAnimationDefinition.method3778(var7, var8, TriBool.clientLanguage, var9);
                     Client.packetWriter.addNode(var6);
                     return 1;
                  } else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
                     if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.tradeChatMode;
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator3.Messages_getHistorySize(var3);
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class104.Messages_getLastChatID(var3);
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = LoginPacket.method5680(var3);
                        return 1;
                     } else if (var0 == ScriptOpcodes.DOCHEAT) {
                        var8 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
                        class324.doCheat(var8);
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
                        Client.field736 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize].toLowerCase().trim();
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
                        Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = Client.field736;
                        return 1;
                     } else if (var0 == ScriptOpcodes.WRITECONSOLE) {
                        var8 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
                        System.out.println(var8);
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
                        Interpreter.Interpreter_intStackSize -= 2;
                        var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                        var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                        var5 = UserComparator5.Messages_getByChannelAndID(var3, var7);
                        if (var5 != null) {
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count;
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle;
                           Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
                           Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
                           Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
                           Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                        } else {
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                           Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                           Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                        }

                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        var4 = class166.Messages_getMessage(var3);
                        if (var4 != null) {
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type;
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle;
                           Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
                           Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
                           Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
                           Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                        } else {
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                           Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                           Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                        }

                        return 1;
                     } else {
                        return 2;
                     }
                  } else {
                     if (Projectile.localPlayer != null && Projectile.localPlayer.username != null) {
                        var8 = Projectile.localPlayer.username.getName();
                     } else {
                        var8 = "";
                     }

                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var8;
                     return 1;
                  }
               }
            }
         }
      }
   }
}
