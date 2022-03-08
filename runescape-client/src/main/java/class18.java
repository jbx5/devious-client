import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("d")
class class18 implements Comparator {
    @ObfuscatedSignature(descriptor = "Ly;")
    final class10 this$0;

    @ObfuscatedSignature(descriptor = "(Ly;)V")
    class18(class10 var1) {
        this.this$0 = var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I", garbageValue = "-1424585601")
    int method261(Entry var1, Entry var2) {
        return ((Float) (var2.getValue())).compareTo(((Float) (var1.getValue())));
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }

    public int compare(Object var1, Object var2) {
        return this.method261(((Entry) (var1)), ((Entry) (var2)));
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "18786529")
    public static void method268() {
        HealthBarDefinition.HealthBarDefinition_cached.clear();
        HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2032312560")
    public static final void method260() {
        ViewportMouse.ViewportMouse_isInViewport = false;
        ViewportMouse.ViewportMouse_entityCount = 0;
    }

    @ObfuscatedName("ig")
    @ObfuscatedSignature(descriptor = "(IIIILjava/lang/String;Ljava/lang/String;IIB)V", garbageValue = "64")
    @Export("menuAction")
    static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        PacketBufferNode var8;
        if (var2 == 1) {
            Client.mouseCrossX = var6;
            Client.mouseCrossY = var7;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            var8 = class135.getPacketBufferNode(ClientPacket.OPLOCU, Client.packetWriter.isaacCipher);
            var8.packetBuffer.writeShortAdd(var3);
            var8.packetBuffer.writeShortLE(var0 + Canvas.baseX);
            var8.packetBuffer.writeShortLE(WorldMapAreaData.selectedItemSlot);
            var8.packetBuffer.writeShort(class286.selectedItemId);
            var8.packetBuffer.writeShortAdd(class118.baseY + var1);
            var8.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
            var8.packetBuffer.writeIntME(class133.selectedItemWidget);
            Client.packetWriter.addNode(var8);
        } else if (var2 == 2) {
            Client.mouseCrossX = var6;
            Client.mouseCrossY = var7;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            var8 = class135.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher);
            var8.packetBuffer.writeShort(class118.baseY + var1);
            var8.packetBuffer.writeInt(WorldMapLabelSize.selectedSpellWidget);
            var8.packetBuffer.writeShortLE(var0 + Canvas.baseX);
            var8.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
            var8.packetBuffer.writeShortAddLE(Client.field536);
            var8.packetBuffer.writeShort(var3);
            var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
            Client.packetWriter.addNode(var8);
        } else if (var2 == 3) {
            Client.mouseCrossX = var6;
            Client.mouseCrossY = var7;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            var8 = class135.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher);
            var8.packetBuffer.writeShortAdd(var0 + Canvas.baseX);
            var8.packetBuffer.writeShortLE(class118.baseY + var1);
            var8.packetBuffer.writeShort(var3);
            var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
            Client.packetWriter.addNode(var8);
        } else if (var2 == 4) {
            Client.mouseCrossX = var6;
            Client.mouseCrossY = var7;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            var8 = class135.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher);
            var8.packetBuffer.writeShortLE(var0 + Canvas.baseX);
            var8.packetBuffer.writeShortAdd(var3);
            var8.packetBuffer.writeShortLE(class118.baseY + var1);
            var8.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
            Client.packetWriter.addNode(var8);
        } else if (var2 == 5) {
            Client.mouseCrossX = var6;
            Client.mouseCrossY = var7;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            var8 = class135.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher);
            var8.packetBuffer.writeShortLE(class118.baseY + var1);
            var8.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
            var8.packetBuffer.writeShortLE(var3);
            var8.packetBuffer.writeShort(var0 + Canvas.baseX);
            Client.packetWriter.addNode(var8);
        } else if (var2 == 6) {
            Client.mouseCrossX = var6;
            Client.mouseCrossY = var7;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            var8 = class135.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher);
            var8.packetBuffer.writeShort(class118.baseY + var1);
            var8.packetBuffer.writeShortLE(var3);
            var8.packetBuffer.writeShortAdd(var0 + Canvas.baseX);
            var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
            Client.packetWriter.addNode(var8);
        } else {
            PacketBufferNode var9;
            NPC var13;
            if (var2 == 7) {
                var13 = Client.npcs[var3];
                if (var13 != null) {
                    Client.mouseCrossX = var6;
                    Client.mouseCrossY = var7;
                    Client.mouseCrossColor = 2;
                    Client.mouseCrossState = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    var9 = class135.getPacketBufferNode(ClientPacket.OPNPCU, Client.packetWriter.isaacCipher);
                    var9.packetBuffer.writeShortAdd(var3);
                    var9.packetBuffer.writeShortAdd(WorldMapAreaData.selectedItemSlot);
                    var9.packetBuffer.writeShortAdd(class286.selectedItemId);
                    var9.packetBuffer.writeIntIME(class133.selectedItemWidget);
                    var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                    Client.packetWriter.addNode(var9);
                }
            } else if (var2 == 8) {
                var13 = Client.npcs[var3];
                if (var13 != null) {
                    Client.mouseCrossX = var6;
                    Client.mouseCrossY = var7;
                    Client.mouseCrossColor = 2;
                    Client.mouseCrossState = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    var9 = class135.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
                    var9.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
                    var9.packetBuffer.writeShortAdd(var3);
                    var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                    var9.packetBuffer.writeIntIME(WorldMapLabelSize.selectedSpellWidget);
                    var9.packetBuffer.writeShortAddLE(Client.field536);
                    Client.packetWriter.addNode(var9);
                }
            } else if (var2 == 9) {
                var13 = Client.npcs[var3];
                if (var13 != null) {
                    Client.mouseCrossX = var6;
                    Client.mouseCrossY = var7;
                    Client.mouseCrossColor = 2;
                    Client.mouseCrossState = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    var9 = class135.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher);
                    var9.packetBuffer.writeShortLE(var3);
                    var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                    Client.packetWriter.addNode(var9);
                }
            } else if (var2 == 10) {
                var13 = Client.npcs[var3];
                if (var13 != null) {
                    Client.mouseCrossX = var6;
                    Client.mouseCrossY = var7;
                    Client.mouseCrossColor = 2;
                    Client.mouseCrossState = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    var9 = class135.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher);
                    var9.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                    var9.packetBuffer.writeShortAddLE(var3);
                    Client.packetWriter.addNode(var9);
                }
            } else if (var2 == 11) {
                var13 = Client.npcs[var3];
                if (var13 != null) {
                    Client.mouseCrossX = var6;
                    Client.mouseCrossY = var7;
                    Client.mouseCrossColor = 2;
                    Client.mouseCrossState = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    var9 = class135.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher);
                    var9.packetBuffer.writeShortAddLE(var3);
                    var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                    Client.packetWriter.addNode(var9);
                }
            } else if (var2 == 12) {
                var13 = Client.npcs[var3];
                if (var13 != null) {
                    Client.mouseCrossX = var6;
                    Client.mouseCrossY = var7;
                    Client.mouseCrossColor = 2;
                    Client.mouseCrossState = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    var9 = class135.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher);
                    var9.packetBuffer.writeShortAddLE(var3);
                    var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                    Client.packetWriter.addNode(var9);
                }
            } else if (var2 == 13) {
                var13 = Client.npcs[var3];
                if (var13 != null) {
                    Client.mouseCrossX = var6;
                    Client.mouseCrossY = var7;
                    Client.mouseCrossColor = 2;
                    Client.mouseCrossState = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    var9 = class135.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
                    var9.packetBuffer.writeShort(var3);
                    var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                    Client.packetWriter.addNode(var9);
                }
            } else {
                Player var15;
                if (var2 == 14) {
                    var15 = Client.players[var3];
                    if (var15 != null) {
                        Client.mouseCrossX = var6;
                        Client.mouseCrossY = var7;
                        Client.mouseCrossColor = 2;
                        Client.mouseCrossState = 0;
                        Client.destinationX = var0;
                        Client.destinationY = var1;
                        var9 = class135.getPacketBufferNode(ClientPacket.OPPLAYERU, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                        var9.packetBuffer.writeIntLE(class133.selectedItemWidget);
                        var9.packetBuffer.writeShortAdd(WorldMapAreaData.selectedItemSlot);
                        var9.packetBuffer.writeShortLE(var3);
                        var9.packetBuffer.writeShortLE(class286.selectedItemId);
                        Client.packetWriter.addNode(var9);
                    }
                } else if (var2 == 15) {
                    var15 = Client.players[var3];
                    if (var15 != null) {
                        Client.mouseCrossX = var6;
                        Client.mouseCrossY = var7;
                        Client.mouseCrossColor = 2;
                        Client.mouseCrossState = 0;
                        Client.destinationX = var0;
                        Client.destinationY = var1;
                        var9 = class135.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                        var9.packetBuffer.writeIntLE(WorldMapLabelSize.selectedSpellWidget);
                        var9.packetBuffer.writeShort(Client.selectedSpellChildIndex);
                        var9.packetBuffer.writeShortAddLE(Client.field536);
                        var9.packetBuffer.writeShortAddLE(var3);
                        Client.packetWriter.addNode(var9);
                    }
                } else if (var2 == 16) {
                    Client.mouseCrossX = var6;
                    Client.mouseCrossY = var7;
                    Client.mouseCrossColor = 2;
                    Client.mouseCrossState = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    var8 = class135.getPacketBufferNode(ClientPacket.OPOBJU, Client.packetWriter.isaacCipher);
                    var8.packetBuffer.writeShort(class118.baseY + var1);
                    var8.packetBuffer.writeShortAddLE(WorldMapAreaData.selectedItemSlot);
                    var8.packetBuffer.writeShortAddLE(var3);
                    var8.packetBuffer.writeShortAdd(var0 + Canvas.baseX);
                    var8.packetBuffer.writeIntLE(class133.selectedItemWidget);
                    var8.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                    var8.packetBuffer.writeShortAddLE(class286.selectedItemId);
                    Client.packetWriter.addNode(var8);
                } else if (var2 == 17) {
                    Client.mouseCrossX = var6;
                    Client.mouseCrossY = var7;
                    Client.mouseCrossColor = 2;
                    Client.mouseCrossState = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    var8 = class135.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher);
                    var8.packetBuffer.writeInt(WorldMapLabelSize.selectedSpellWidget);
                    var8.packetBuffer.writeShortAddLE(class118.baseY + var1);
                    var8.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                    var8.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
                    var8.packetBuffer.writeShortAddLE(var3);
                    var8.packetBuffer.writeShortAdd(var0 + Canvas.baseX);
                    var8.packetBuffer.writeShortAdd(Client.field536);
                    Client.packetWriter.addNode(var8);
                } else if (var2 == 18) {
                    Client.mouseCrossX = var6;
                    Client.mouseCrossY = var7;
                    Client.mouseCrossColor = 2;
                    Client.mouseCrossState = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    var8 = class135.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher);
                    var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                    var8.packetBuffer.writeShort(class118.baseY + var1);
                    var8.packetBuffer.writeShortLE(var3);
                    var8.packetBuffer.writeShort(var0 + Canvas.baseX);
                    Client.packetWriter.addNode(var8);
                } else if (var2 == 19) {
                    Client.mouseCrossX = var6;
                    Client.mouseCrossY = var7;
                    Client.mouseCrossColor = 2;
                    Client.mouseCrossState = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    var8 = class135.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher);
                    var8.packetBuffer.writeShortLE(class118.baseY + var1);
                    var8.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                    var8.packetBuffer.writeShortAdd(var0 + Canvas.baseX);
                    var8.packetBuffer.writeShortAdd(var3);
                    Client.packetWriter.addNode(var8);
                } else if (var2 == 20) {
                    Client.mouseCrossX = var6;
                    Client.mouseCrossY = var7;
                    Client.mouseCrossColor = 2;
                    Client.mouseCrossState = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    var8 = class135.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher);
                    var8.packetBuffer.writeShort(class118.baseY + var1);
                    var8.packetBuffer.writeShort(var3);
                    var8.packetBuffer.writeShortLE(var0 + Canvas.baseX);
                    var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                    Client.packetWriter.addNode(var8);
                } else if (var2 == 21) {
                    Client.mouseCrossX = var6;
                    Client.mouseCrossY = var7;
                    Client.mouseCrossColor = 2;
                    Client.mouseCrossState = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    var8 = class135.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
                    var8.packetBuffer.writeShortAddLE(var3);
                    var8.packetBuffer.writeShortAdd(var0 + Canvas.baseX);
                    var8.packetBuffer.writeShortAddLE(class118.baseY + var1);
                    var8.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                    Client.packetWriter.addNode(var8);
                } else if (var2 == 22) {
                    Client.mouseCrossX = var6;
                    Client.mouseCrossY = var7;
                    Client.mouseCrossColor = 2;
                    Client.mouseCrossState = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    var8 = class135.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
                    var8.packetBuffer.writeShortAdd(var0 + Canvas.baseX);
                    var8.packetBuffer.writeShort(class118.baseY + var1);
                    var8.packetBuffer.writeShortLE(var3);
                    var8.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                    Client.packetWriter.addNode(var8);
                } else if (var2 == 23) {
                    if (Client.isMenuOpen) {
                        Decimator.scene.setViewportWalking();
                    } else {
                        Decimator.scene.menuOpen(SoundSystem.Client_plane, var0, var1, true);
                    }
                } else {
                    PacketBufferNode var12;
                    Widget var16;
                    if (var2 == 24) {
                        var16 = class130.getWidget(var1);
                        boolean var11 = true;
                        if (var16.contentType > 0) {
                            var11 = LoginScreenAnimation.method2218(var16);
                        }
                        if (var11) {
                            var12 = class135.getPacketBufferNode(ClientPacket.WIDGET_TYPE_1, Client.packetWriter.isaacCipher);
                            var12.packetBuffer.writeInt(var1);
                            Client.packetWriter.addNode(var12);
                        }
                    } else {
                        if (var2 == 25) {
                            var16 = ModeWhere.getWidgetChild(var1, var0);
                            if (var16 != null) {
                                WorldMapRectangle.Widget_runOnTargetLeave();
                                PendingSpawn.selectSpell(var1, var0, class135.Widget_unpackTargetMask(Language.getWidgetFlags(var16)), var16.itemId);
                                Client.isItemSelected = 0;
                                Client.selectedSpellActionName = WorldMapEvent.Widget_getSpellActionName(var16);
                                if (Client.selectedSpellActionName == null) {
                                    Client.selectedSpellActionName = "null";
                                }
                                if (var16.isIf3) {
                                    Client.selectedSpellName = var16.dataText + LoginScreenAnimation.colorStartTag(16777215);
                                } else {
                                    Client.selectedSpellName = (LoginScreenAnimation.colorStartTag(65280) + var16.spellName) + LoginScreenAnimation.colorStartTag(16777215);
                                }
                            }
                            return;
                        }
                        if (var2 == 26) {
                            VertexNormal.method4267();
                        } else {
                            int var10;
                            Widget var14;
                            if (var2 == 28) {
                                var8 = class135.getPacketBufferNode(ClientPacket.WIDGET_TYPE_1, Client.packetWriter.isaacCipher);
                                var8.packetBuffer.writeInt(var1);
                                Client.packetWriter.addNode(var8);
                                var14 = class130.getWidget(var1);
                                if ((var14.cs1Instructions != null) && (var14.cs1Instructions[0][0] == 5)) {
                                    var10 = var14.cs1Instructions[0][1];
                                    Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10];
                                    NetFileRequest.changeGameOptions(var10);
                                }
                            } else if (var2 == 29) {
                                var8 = class135.getPacketBufferNode(ClientPacket.WIDGET_TYPE_1, Client.packetWriter.isaacCipher);
                                var8.packetBuffer.writeInt(var1);
                                Client.packetWriter.addNode(var8);
                                var14 = class130.getWidget(var1);
                                if ((var14.cs1Instructions != null) && (var14.cs1Instructions[0][0] == 5)) {
                                    var10 = var14.cs1Instructions[0][1];
                                    if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) {
                                        Varps.Varps_main[var10] = var14.cs1ComparisonValues[0];
                                        NetFileRequest.changeGameOptions(var10);
                                    }
                                }
                            } else if (var2 == 30) {
                                if (Client.meslayerContinueWidget == null) {
                                    class312.resumePauseWidget(var1, var0);
                                    Client.meslayerContinueWidget = ModeWhere.getWidgetChild(var1, var0);
                                    class112.invalidateWidget(Client.meslayerContinueWidget);
                                }
                            } else if (var2 == 31) {
                                var8 = class135.getPacketBufferNode(ClientPacket.OPHELDU, Client.packetWriter.isaacCipher);
                                var8.packetBuffer.writeIntLE(var1);
                                var8.packetBuffer.writeInt(class133.selectedItemWidget);
                                var8.packetBuffer.writeShortLE(var0);
                                var8.packetBuffer.writeShortLE(var3);
                                var8.packetBuffer.writeShortAdd(WorldMapAreaData.selectedItemSlot);
                                var8.packetBuffer.writeShortAddLE(class286.selectedItemId);
                                Client.packetWriter.addNode(var8);
                                Client.field610 = 0;
                                WorldMapSectionType.field2720 = class130.getWidget(var1);
                                Client.field611 = var0;
                            } else if (var2 == 32) {
                                var8 = class135.getPacketBufferNode(ClientPacket.OPHELDT, Client.packetWriter.isaacCipher);
                                var8.packetBuffer.writeShortAdd(var3);
                                var8.packetBuffer.writeShort(Client.selectedSpellChildIndex);
                                var8.packetBuffer.writeInt(WorldMapLabelSize.selectedSpellWidget);
                                var8.packetBuffer.writeIntIME(var1);
                                var8.packetBuffer.writeShortLE(var0);
                                Client.packetWriter.addNode(var8);
                                Client.field610 = 0;
                                WorldMapSectionType.field2720 = class130.getWidget(var1);
                                Client.field611 = var0;
                            } else if (var2 == 33) {
                                var8 = class135.getPacketBufferNode(ClientPacket.OPHELD1, Client.packetWriter.isaacCipher);
                                var8.packetBuffer.writeShortLE(var0);
                                var8.packetBuffer.writeShortLE(var3);
                                var8.packetBuffer.writeInt(var1);
                                Client.packetWriter.addNode(var8);
                                Client.field610 = 0;
                                WorldMapSectionType.field2720 = class130.getWidget(var1);
                                Client.field611 = var0;
                            } else if (var2 == 34) {
                                var8 = class135.getPacketBufferNode(ClientPacket.OPHELD2, Client.packetWriter.isaacCipher);
                                var8.packetBuffer.writeShort(var0);
                                var8.packetBuffer.writeIntME(var1);
                                var8.packetBuffer.writeShort(var3);
                                Client.packetWriter.addNode(var8);
                                Client.field610 = 0;
                                WorldMapSectionType.field2720 = class130.getWidget(var1);
                                Client.field611 = var0;
                            } else if (var2 == 35) {
                                var8 = class135.getPacketBufferNode(ClientPacket.OPHELD3, Client.packetWriter.isaacCipher);
                                var8.packetBuffer.writeIntIME(var1);
                                var8.packetBuffer.writeShortAdd(var0);
                                var8.packetBuffer.writeShortAddLE(var3);
                                Client.packetWriter.addNode(var8);
                                Client.field610 = 0;
                                WorldMapSectionType.field2720 = class130.getWidget(var1);
                                Client.field611 = var0;
                            } else if (var2 == 36) {
                                var8 = class135.getPacketBufferNode(ClientPacket.OPHELD4, Client.packetWriter.isaacCipher);
                                var8.packetBuffer.writeInt(var1);
                                var8.packetBuffer.writeShortLE(var3);
                                var8.packetBuffer.writeShortAdd(var0);
                                Client.packetWriter.addNode(var8);
                                Client.field610 = 0;
                                WorldMapSectionType.field2720 = class130.getWidget(var1);
                                Client.field611 = var0;
                            } else if (var2 == 37) {
                                var8 = class135.getPacketBufferNode(ClientPacket.OPHELD5, Client.packetWriter.isaacCipher);
                                var8.packetBuffer.writeShortAdd(var0);
                                var8.packetBuffer.writeShortLE(var3);
                                var8.packetBuffer.writeInt(var1);
                                Client.packetWriter.addNode(var8);
                                Client.field610 = 0;
                                WorldMapSectionType.field2720 = class130.getWidget(var1);
                                Client.field611 = var0;
                            } else {
                                if (var2 == 38) {
                                    WorldMapRectangle.Widget_runOnTargetLeave();
                                    var16 = class130.getWidget(var1);
                                    Client.isItemSelected = 1;
                                    WorldMapAreaData.selectedItemSlot = var0;
                                    class133.selectedItemWidget = var1;
                                    class286.selectedItemId = var3;
                                    class112.invalidateWidget(var16);
                                    Client.selectedItemName = (LoginScreenAnimation.colorStartTag(16748608) + Client.ItemDefinition_get(var3).name) + LoginScreenAnimation.colorStartTag(16777215);
                                    if (Client.selectedItemName == null) {
                                        Client.selectedItemName = "null";
                                    }
                                    return;
                                }
                                if (var2 == 39) {
                                    var8 = class135.getPacketBufferNode(ClientPacket.IF1_BUTTON1, Client.packetWriter.isaacCipher);
                                    var8.packetBuffer.writeIntLE(var1);
                                    var8.packetBuffer.writeShortLE(var3);
                                    var8.packetBuffer.writeShort(var0);
                                    Client.packetWriter.addNode(var8);
                                    Client.field610 = 0;
                                    WorldMapSectionType.field2720 = class130.getWidget(var1);
                                    Client.field611 = var0;
                                } else if (var2 == 40) {
                                    var8 = class135.getPacketBufferNode(ClientPacket.IF1_BUTTON2, Client.packetWriter.isaacCipher);
                                    var8.packetBuffer.writeShortLE(var3);
                                    var8.packetBuffer.writeInt(var1);
                                    var8.packetBuffer.writeShortLE(var0);
                                    Client.packetWriter.addNode(var8);
                                    Client.field610 = 0;
                                    WorldMapSectionType.field2720 = class130.getWidget(var1);
                                    Client.field611 = var0;
                                } else if (var2 == 41) {
                                    var8 = class135.getPacketBufferNode(ClientPacket.IF1_BUTTON3, Client.packetWriter.isaacCipher);
                                    var8.packetBuffer.writeInt(var1);
                                    var8.packetBuffer.writeShort(var3);
                                    var8.packetBuffer.writeShort(var0);
                                    Client.packetWriter.addNode(var8);
                                    Client.field610 = 0;
                                    WorldMapSectionType.field2720 = class130.getWidget(var1);
                                    Client.field611 = var0;
                                } else if (var2 == 42) {
                                    var8 = class135.getPacketBufferNode(ClientPacket.IF1_BUTTON4, Client.packetWriter.isaacCipher);
                                    var8.packetBuffer.writeShortAdd(var3);
                                    var8.packetBuffer.writeShortAdd(var0);
                                    var8.packetBuffer.writeIntIME(var1);
                                    Client.packetWriter.addNode(var8);
                                    Client.field610 = 0;
                                    WorldMapSectionType.field2720 = class130.getWidget(var1);
                                    Client.field611 = var0;
                                } else if (var2 == 43) {
                                    var8 = class135.getPacketBufferNode(ClientPacket.IF1_BUTTON5, Client.packetWriter.isaacCipher);
                                    var8.packetBuffer.writeShort(var3);
                                    var8.packetBuffer.writeShort(var0);
                                    var8.packetBuffer.writeInt(var1);
                                    Client.packetWriter.addNode(var8);
                                    Client.field610 = 0;
                                    WorldMapSectionType.field2720 = class130.getWidget(var1);
                                    Client.field611 = var0;
                                } else if (var2 == 44) {
                                    var15 = Client.players[var3];
                                    if (var15 != null) {
                                        Client.mouseCrossX = var6;
                                        Client.mouseCrossY = var7;
                                        Client.mouseCrossColor = 2;
                                        Client.mouseCrossState = 0;
                                        Client.destinationX = var0;
                                        Client.destinationY = var1;
                                        var9 = class135.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
                                        var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                                        var9.packetBuffer.writeShortAddLE(var3);
                                        Client.packetWriter.addNode(var9);
                                    }
                                } else if (var2 == 45) {
                                    var15 = Client.players[var3];
                                    if (var15 != null) {
                                        Client.mouseCrossX = var6;
                                        Client.mouseCrossY = var7;
                                        Client.mouseCrossColor = 2;
                                        Client.mouseCrossState = 0;
                                        Client.destinationX = var0;
                                        Client.destinationY = var1;
                                        var9 = class135.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher);
                                        var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                                        var9.packetBuffer.writeShortAddLE(var3);
                                        Client.packetWriter.addNode(var9);
                                    }
                                } else if (var2 == 46) {
                                    var15 = Client.players[var3];
                                    if (var15 != null) {
                                        Client.mouseCrossX = var6;
                                        Client.mouseCrossY = var7;
                                        Client.mouseCrossColor = 2;
                                        Client.mouseCrossState = 0;
                                        Client.destinationX = var0;
                                        Client.destinationY = var1;
                                        var9 = class135.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
                                        var9.packetBuffer.writeShortAdd(var3);
                                        var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                                        Client.packetWriter.addNode(var9);
                                    }
                                } else if (var2 == 47) {
                                    var15 = Client.players[var3];
                                    if (var15 != null) {
                                        Client.mouseCrossX = var6;
                                        Client.mouseCrossY = var7;
                                        Client.mouseCrossColor = 2;
                                        Client.mouseCrossState = 0;
                                        Client.destinationX = var0;
                                        Client.destinationY = var1;
                                        var9 = class135.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
                                        var9.packetBuffer.writeShortAdd(var3);
                                        var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                                        Client.packetWriter.addNode(var9);
                                    }
                                } else if (var2 == 48) {
                                    var15 = Client.players[var3];
                                    if (var15 != null) {
                                        Client.mouseCrossX = var6;
                                        Client.mouseCrossY = var7;
                                        Client.mouseCrossColor = 2;
                                        Client.mouseCrossState = 0;
                                        Client.destinationX = var0;
                                        Client.destinationY = var1;
                                        var9 = class135.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
                                        var9.packetBuffer.writeShort(var3);
                                        var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                                        Client.packetWriter.addNode(var9);
                                    }
                                } else if (var2 == 49) {
                                    var15 = Client.players[var3];
                                    if (var15 != null) {
                                        Client.mouseCrossX = var6;
                                        Client.mouseCrossY = var7;
                                        Client.mouseCrossColor = 2;
                                        Client.mouseCrossState = 0;
                                        Client.destinationX = var0;
                                        Client.destinationY = var1;
                                        var9 = class135.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
                                        var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                                        var9.packetBuffer.writeShortLE(var3);
                                        Client.packetWriter.addNode(var9);
                                    }
                                } else if (var2 == 50) {
                                    var15 = Client.players[var3];
                                    if (var15 != null) {
                                        Client.mouseCrossX = var6;
                                        Client.mouseCrossY = var7;
                                        Client.mouseCrossColor = 2;
                                        Client.mouseCrossState = 0;
                                        Client.destinationX = var0;
                                        Client.destinationY = var1;
                                        var9 = class135.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
                                        var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                                        var9.packetBuffer.writeShort(var3);
                                        Client.packetWriter.addNode(var9);
                                    }
                                } else if (var2 == 51) {
                                    var15 = Client.players[var3];
                                    if (var15 != null) {
                                        Client.mouseCrossX = var6;
                                        Client.mouseCrossY = var7;
                                        Client.mouseCrossColor = 2;
                                        Client.mouseCrossState = 0;
                                        Client.destinationX = var0;
                                        Client.destinationY = var1;
                                        var9 = class135.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher);
                                        var9.packetBuffer.writeShortLE(var3);
                                        var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                                        Client.packetWriter.addNode(var9);
                                    }
                                } else if ((var2 != 57) && (var2 != 1007)) {
                                    if (var2 == 58) {
                                        var16 = ModeWhere.getWidgetChild(var1, var0);
                                        if (var16 != null) {
                                            var9 = class135.getPacketBufferNode(ClientPacket.field2919, Client.packetWriter.isaacCipher);
                                            var9.packetBuffer.writeShortLE(Client.field536);
                                            var9.packetBuffer.writeShortAdd(var0);
                                            var9.packetBuffer.writeIntLE(WorldMapLabelSize.selectedSpellWidget);
                                            var9.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
                                            var9.packetBuffer.writeShort(var16.itemId);
                                            var9.packetBuffer.writeIntLE(var1);
                                            Client.packetWriter.addNode(var9);
                                        }
                                    } else if (var2 == 1001) {
                                        Client.mouseCrossX = var6;
                                        Client.mouseCrossY = var7;
                                        Client.mouseCrossColor = 2;
                                        Client.mouseCrossState = 0;
                                        Client.destinationX = var0;
                                        Client.destinationY = var1;
                                        var8 = class135.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher);
                                        var8.packetBuffer.writeShortLE(var0 + Canvas.baseX);
                                        var8.packetBuffer.writeShort(class118.baseY + var1);
                                        var8.packetBuffer.writeShort(var3);
                                        var8.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                                        Client.packetWriter.addNode(var8);
                                    } else if (var2 == 1002) {
                                        Client.mouseCrossX = var6;
                                        Client.mouseCrossY = var7;
                                        Client.mouseCrossColor = 2;
                                        Client.mouseCrossState = 0;
                                        var8 = class135.getPacketBufferNode(ClientPacket.OPLOC6, Client.packetWriter.isaacCipher);
                                        var8.packetBuffer.writeShort(var3);
                                        Client.packetWriter.addNode(var8);
                                    } else if (var2 == 1003) {
                                        Client.mouseCrossX = var6;
                                        Client.mouseCrossY = var7;
                                        Client.mouseCrossColor = 2;
                                        Client.mouseCrossState = 0;
                                        var13 = Client.npcs[var3];
                                        if (var13 != null) {
                                            NPCComposition var17 = var13.definition;
                                            if (var17.transforms != null) {
                                                var17 = var17.transform();
                                            }
                                            if (var17 != null) {
                                                var12 = class135.getPacketBufferNode(ClientPacket.OPNPC6, Client.packetWriter.isaacCipher);
                                                var12.packetBuffer.writeShortAdd(var17.id);
                                                Client.packetWriter.addNode(var12);
                                            }
                                        }
                                    } else if (var2 == 1004) {
                                        Client.mouseCrossX = var6;
                                        Client.mouseCrossY = var7;
                                        Client.mouseCrossColor = 2;
                                        Client.mouseCrossState = 0;
                                        var8 = class135.getPacketBufferNode(ClientPacket.OPOBJ6, Client.packetWriter.isaacCipher);
                                        var8.packetBuffer.writeShort(var3);
                                        Client.packetWriter.addNode(var8);
                                    } else if (var2 == 1005) {
                                        var16 = class130.getWidget(var1);
                                        if ((var16 != null) && (var16.itemQuantities[var0] >= 100000)) {
                                            LoginScreenAnimation.addGameMessage(27, "", (var16.itemQuantities[var0] + " x ") + Client.ItemDefinition_get(var3).name);
                                        } else {
                                            var9 = class135.getPacketBufferNode(ClientPacket.OPOBJ6, Client.packetWriter.isaacCipher);
                                            var9.packetBuffer.writeShort(var3);
                                            Client.packetWriter.addNode(var9);
                                        }
                                        Client.field610 = 0;
                                        WorldMapSectionType.field2720 = class130.getWidget(var1);
                                        Client.field611 = var0;
                                    } else if (((((var2 == 1009) || (var2 == 1010)) || (var2 == 1011)) || (var2 == 1008)) || (var2 == 1012)) {
                                        Huffman.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
                                    }
                                } else {
                                    var16 = ModeWhere.getWidgetChild(var1, var0);
                                    if (var16 != null) {
                                        GameEngine.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (Client.isItemSelected != 0) {
            Client.isItemSelected = 0;
            class112.invalidateWidget(class130.getWidget(class133.selectedItemWidget));
        }
        if (Client.isSpellSelected) {
            WorldMapRectangle.Widget_runOnTargetLeave();
        }
        if ((WorldMapSectionType.field2720 != null) && (Client.field610 == 0)) {
            class112.invalidateWidget(WorldMapSectionType.field2720);
        }
    }
}