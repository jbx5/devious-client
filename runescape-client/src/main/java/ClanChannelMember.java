import java.util.Iterator;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("dc")
@Implements("ClanChannelMember")
public class ClanChannelMember {
    @ObfuscatedName("rz")
    static boolean field1528;

    @ObfuscatedName("c")
    @Export("rank")
    public byte rank;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 1118667793)
    @Export("world")
    public int world;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lpb;")
    @Export("username")
    public Username username;

    ClanChannelMember() {
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(IIIB)I", garbageValue = "8")
    public static int method2770(int var0, int var1, int var2) {
        int var3 = class125.method2741((var2 - var1) + 1);
        var3 <<= var1;
        return var0 & (~var3);
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-623943743")
    static String method2769() {
        String var0 = "";
        Message var2;
        for (Iterator var1 = Messages.Messages_hashTable.iterator(); var1.hasNext(); var0 = (((var0 + var2.sender) + ':') + var2.text) + '\n') {
            var2 = ((Message) (var1.next()));
        }
        return var0;
    }

    @ObfuscatedName("n")
    @ObfuscatedSignature(descriptor = "(ILbl;ZI)I", garbageValue = "-848604287")
    static int method2772(int var0, Script var1, boolean var2) {
        Widget var7;
        if ((var0 != ScriptOpcodes.CC_CALLONRESIZE) && (var0 != ScriptOpcodes.IF_CALLONRESIZE)) {
            int var4;
            if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
                var7 = (var2) ? class16.scriptDotWidget : Interpreter.scriptActiveWidget;
                var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                if ((var4 >= 1) && (var4 <= 10)) {
                    class92 var8 = new class92(var4, var7.id, var7.childIndex, var7.itemId);
                    Interpreter.field832.add(var8);
                    return 1;
                } else {
                    throw new RuntimeException();
                }
            } else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
                Interpreter.Interpreter_intStackSize -= 3;
                int var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
                if ((var5 >= 1) && (var5 <= 10)) {
                    class92 var6 = new class92(var5, var3, var4, class130.getWidget(var3).itemId);
                    Interpreter.field832.add(var6);
                    return 1;
                } else {
                    throw new RuntimeException();
                }
            } else {
                return 2;
            }
        } else if (Interpreter.field849 >= 10) {
            throw new RuntimeException();
        } else {
            if (var0 >= 2000) {
                var7 = class130.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
            } else {
                var7 = (var2) ? class16.scriptDotWidget : Interpreter.scriptActiveWidget;
            }
            if (var7.onResize == null) {
                return 0;
            } else {
                ScriptEvent var9 = new ScriptEvent();
                var9.widget = var7;
                var9.args = var7.onResize;
                var9.field1041 = Interpreter.field849 + 1;
                Client.scriptEvents.addFirst(var9);
                return 1;
            }
        }
    }

    @ObfuscatedName("ao")
    @ObfuscatedSignature(descriptor = "(ILbl;ZI)I", garbageValue = "2131909524")
    static int method2771(int var0, Script var1, boolean var2) {
        if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.publicChatMode;
            return 1;
        } else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
            Interpreter.Interpreter_intStackSize -= 3;
            Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            class65.privateChatMode = class231.method4764(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
            if (class65.privateChatMode == null) {
                class65.privateChatMode = PrivateChatMode.field4632;
            }
            Client.tradeChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            PacketBufferNode var13 = class135.getPacketBufferNode(ClientPacket.field2872, Client.packetWriter.isaacCipher);
            var13.packetBuffer.writeByte(Client.publicChatMode);
            var13.packetBuffer.writeByte(class65.privateChatMode.field4631);
            var13.packetBuffer.writeByte(Client.tradeChatMode);
            Client.packetWriter.addNode(var13);
            return 1;
        } else {
            PacketBufferNode var6;
            int var7;
            String var8;
            int var9;
            if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
                var8 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                Interpreter.Interpreter_intStackSize -= 2;
                var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                var6 = class135.getPacketBufferNode(ClientPacket.field2877, Client.packetWriter.isaacCipher);
                var6.packetBuffer.writeByte(GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var8) + 2);
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
                    var5 = PcmPlayer.Messages_getByChannelAndID(var3, var7);
                    if (var5 != null) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var5.count;
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var5.cycle;
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = (var5.sender != null) ? var5.sender : "";
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = (var5.prefix != null) ? var5.prefix : "";
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = (var5.text != null) ? var5.text : "";
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var5.isFromFriend()) ? 1 : var5.isFromIgnored() ? 2 : 0;
                    } else {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                    }
                    return 1;
                } else {
                    Message var4;
                    if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        var4 = class405.Messages_getMessage(var3);
                        if (var4 != null) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4.type;
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4.cycle;
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = (var4.sender != null) ? var4.sender : "";
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = (var4.prefix != null) ? var4.prefix : "";
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = (var4.text != null) ? var4.text : "";
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var4.isFromFriend()) ? 1 : var4.isFromIgnored() ? 2 : 0;
                        } else {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                        }
                        return 1;
                    } else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
                        if (class65.privateChatMode == null) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
                        } else {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class65.privateChatMode.field4631;
                        }
                        return 1;
                    } else {
                        PacketBufferNode var12;
                        if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
                            var8 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                            var12 = class78.method2082(var7, var8, class122.clientLanguage, -1);
                            Client.packetWriter.addNode(var12);
                            return 1;
                        } else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
                            BufferedNetSocket.Interpreter_stringStackSize -= 2;
                            var8 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize];
                            String var11 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize + 1];
                            var12 = class135.getPacketBufferNode(ClientPacket.field2875, Client.packetWriter.isaacCipher);
                            var12.packetBuffer.writeShort(0);
                            int var10 = var12.packetBuffer.offset;
                            var12.packetBuffer.writeStringCp1252NullTerminated(var8);
                            WorldMapRectangle.method4757(var12.packetBuffer, var11);
                            var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
                            Client.packetWriter.addNode(var12);
                            return 1;
                        } else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
                            var8 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                            Interpreter.Interpreter_intStackSize -= 2;
                            var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                            var6 = class78.method2082(var7, var8, class122.clientLanguage, var9);
                            Client.packetWriter.addNode(var6);
                            return 1;
                        } else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
                            if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
                                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.tradeChatMode;
                                return 1;
                            } else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
                                var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class7.Messages_getHistorySize(var3);
                                return 1;
                            } else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
                                var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = VertexNormal.Messages_getLastChatID(var3);
                                return 1;
                            } else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
                                var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class140.method2932(var3);
                                return 1;
                            } else if (var0 == ScriptOpcodes.DOCHEAT) {
                                var8 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                                doCheat(var8);
                                return 1;
                            } else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
                                Client.field726 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize].toLowerCase().trim();
                                return 1;
                            } else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
                                Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = Client.field726;
                                return 1;
                            } else if (var0 == ScriptOpcodes.WRITECONSOLE) {
                                var8 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                                System.out.println(var8);
                                return 1;
                            } else if (var0 == 5024) {
                                --Interpreter.Interpreter_intStackSize;
                                return 1;
                            } else if (var0 == 5025) {
                                ++Interpreter.Interpreter_intStackSize;
                                return 1;
                            } else if (var0 == 5030) {
                                Interpreter.Interpreter_intStackSize -= 2;
                                var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                                var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                                var5 = PcmPlayer.Messages_getByChannelAndID(var3, var7);
                                if (var5 != null) {
                                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var5.count;
                                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var5.cycle;
                                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = (var5.sender != null) ? var5.sender : "";
                                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = (var5.prefix != null) ? var5.prefix : "";
                                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = (var5.text != null) ? var5.text : "";
                                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var5.isFromFriend()) ? 1 : var5.isFromIgnored() ? 2 : 0;
                                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                                } else {
                                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
                                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                                }
                                return 1;
                            } else if (var0 == 5031) {
                                var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                                var4 = class405.Messages_getMessage(var3);
                                if (var4 != null) {
                                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4.type;
                                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4.cycle;
                                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = (var4.sender != null) ? var4.sender : "";
                                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = (var4.prefix != null) ? var4.prefix : "";
                                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = (var4.text != null) ? var4.text : "";
                                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var4.isFromFriend()) ? 1 : var4.isFromIgnored() ? 2 : 0;
                                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                                } else {
                                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
                                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                                }
                                return 1;
                            } else {
                                return 2;
                            }
                        } else {
                            if ((WorldMapSprite.localPlayer != null) && (WorldMapSprite.localPlayer.username != null)) {
                                var8 = WorldMapSprite.localPlayer.username.getName();
                            } else {
                                var8 = "";
                            }
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var8;
                            return 1;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fn")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-1951640050")
    @Export("doCheat")
    static final void doCheat(String var0) {
        if (var0.equalsIgnoreCase("toggleroof")) {
            class424.clientPreferences.roofsHidden = !class424.clientPreferences.roofsHidden;
            GameEngine.savePreferences();
            if (class424.clientPreferences.roofsHidden) {
                LoginScreenAnimation.addGameMessage(99, "", "Roofs are now all hidden");
            } else {
                LoginScreenAnimation.addGameMessage(99, "", "Roofs will only be removed selectively");
            }
        }
        if (var0.equalsIgnoreCase("displayfps")) {
            Client.displayFps = !Client.displayFps;
        }
        if (var0.equalsIgnoreCase("renderself")) {
            Client.renderSelf = !Client.renderSelf;
        }
        if (var0.equalsIgnoreCase("mouseovertext")) {
            Client.showMouseOverText = !Client.showMouseOverText;
        }
        if (Client.staffModLevel >= 2) {
            if (var0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (var0.equalsIgnoreCase("showcoord")) {
                Huffman.worldMap.showCoord = !Huffman.worldMap.showCoord;
            }
            if (var0.equalsIgnoreCase("fpson")) {
                Client.displayFps = true;
            }
            if (var0.equalsIgnoreCase("fpsoff")) {
                Client.displayFps = false;
            }
            if (var0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (var0.equalsIgnoreCase("clientdrop")) {
                class17.method258();
            }
        }
        PacketBufferNode var1 = class135.getPacketBufferNode(ClientPacket.field2854, Client.packetWriter.isaacCipher);
        var1.packetBuffer.writeByte(var0.length() + 1);
        var1.packetBuffer.writeStringCp1252NullTerminated(var0);
        Client.packetWriter.addNode(var1);
    }
}