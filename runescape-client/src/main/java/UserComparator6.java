import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eg")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
   @ObfuscatedName("eq")
   @ObfuscatedSignature(
      descriptor = "Ldl;"
   )
   @Export("mouseRecorder")
   static MouseRecorder mouseRecorder;
   @ObfuscatedName("af")
   @Export("reversed")
   final boolean reversed;

   public UserComparator6(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpb;Lpb;I)I",
      garbageValue = "2114105554"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (var1.world != 0 && var2.world != 0) {
         return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
      } else {
         return this.compareUser(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("an")
   static boolean method2971(long var0) {
      return TextureProvider.method4736(var0) == 2;
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZB)I",
      garbageValue = "-45"
   )
   static int method2963(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.publicChatMode;
         return 1;
      } else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
         Interpreter.Interpreter_intStackSize -= 3;
         Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         FloorUnderlayDefinition.privateChatMode = class399.method7732(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
         if (FloorUnderlayDefinition.privateChatMode == null) {
            FloorUnderlayDefinition.privateChatMode = PrivateChatMode.field5128;
         }

         Client.tradeChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         PacketBufferNode var13 = class330.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
         var13.packetBuffer.writeByte(Client.publicChatMode);
         var13.packetBuffer.writeByte(FloorUnderlayDefinition.privateChatMode.field5131);
         var13.packetBuffer.writeByte(Client.tradeChatMode);
         Client.packetWriter.addNode(var13);
         return 1;
      } else {
         PacketBufferNode var6;
         int var7;
         String var8;
         int var9;
         if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
            var8 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
            Interpreter.Interpreter_intStackSize -= 2;
            var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var6 = class330.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
            var6.packetBuffer.writeByte(DynamicObject.stringCp1252NullTerminatedByteSize(var8) + 2);
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
               var5 = Actor.Messages_getByChannelAndID(var3, var7);
               if (var5 != null) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle;
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else {
               Message var4;
               if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = MouseRecorder.Messages_getMessage(var3);
                  if (var4 != null) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type;
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle;
                     Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
                     Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
                     Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
                  } else {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
                  if (FloorUnderlayDefinition.privateChatMode == null) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                  } else {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FloorUnderlayDefinition.privateChatMode.field5131;
                  }

                  return 1;
               } else {
                  PacketBufferNode var12;
                  if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
                     var8 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     var12 = class314.method6225(var7, var8, ClanSettings.clientLanguage, -1);
                     Client.packetWriter.addNode(var12);
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
                     SecureRandomCallable.Interpreter_stringStackSize -= 2;
                     var8 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize];
                     String var11 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize + 1];
                     var12 = class330.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
                     var12.packetBuffer.writeShort(0);
                     int var10 = var12.packetBuffer.offset;
                     var12.packetBuffer.writeStringCp1252NullTerminated(var8);
                     WorldMapArea.method5162(var12.packetBuffer, var11);
                     var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
                     Client.packetWriter.addNode(var12);
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
                     var8 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
                     Interpreter.Interpreter_intStackSize -= 2;
                     var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var6 = class314.method6225(var7, var8, ClanSettings.clientLanguage, var9);
                     Client.packetWriter.addNode(var6);
                     return 1;
                  } else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
                     if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.tradeChatMode;
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = World.Messages_getHistorySize(var3);
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FaceNormal.Messages_getLastChatID(var3);
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = BuddyRankComparator.method2949(var3);
                        return 1;
                     } else if (var0 == ScriptOpcodes.DOCHEAT) {
                        var8 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
                        DynamicObject.doCheat(var8);
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
                        Client.field718 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize].toLowerCase().trim();
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
                        Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = Client.field718;
                        return 1;
                     } else if (var0 == ScriptOpcodes.WRITECONSOLE) {
                        var8 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
                        System.out.println(var8);
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
                        Interpreter.Interpreter_intStackSize -= 2;
                        var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                        var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                        var5 = Actor.Messages_getByChannelAndID(var3, var7);
                        if (var5 != null) {
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count;
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle;
                           Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
                           Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
                           Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
                           Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                        } else {
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                           Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                           Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                        }

                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        var4 = MouseRecorder.Messages_getMessage(var3);
                        if (var4 != null) {
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type;
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle;
                           Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
                           Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
                           Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
                           Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                        } else {
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                           Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                           Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                        }

                        return 1;
                     } else {
                        return 2;
                     }
                  } else {
                     if (MusicPatchNode.localPlayer != null && MusicPatchNode.localPlayer.username != null) {
                        var8 = MusicPatchNode.localPlayer.username.getName();
                     } else {
                        var8 = "";
                     }

                     Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var8;
                     return 1;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("jd")
   @ObfuscatedSignature(
      descriptor = "(Lde;II)V",
      garbageValue = "1654924432"
   )
   static final void method2972(Actor var0, int var1) {
      class374.worldToScreen(var0.x, var0.y, var1);
   }
}
