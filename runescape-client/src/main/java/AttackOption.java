import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("co")
@Implements("AttackOption")
public enum AttackOption implements MouseWheel {

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lco;")
    @Export("AttackOption_dependsOnCombatLevels")
    AttackOption_dependsOnCombatLevels(0),
    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lco;")
    @Export("AttackOption_alwaysRightClick")
    AttackOption_alwaysRightClick(1),
    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lco;")
    field1267(2),
    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Lco;")
    @Export("AttackOption_hidden")
    AttackOption_hidden(3),
    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "Lco;")
    field1263(4);
    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = -1677551205)
    @Export("id")
    final int id;

    AttackOption(int var3) {
        this.id = var3;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-303340189")
    @Export("rsOrdinal")
    public int rsOrdinal() {
        return this.id;
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "489807425")
    static void method2288() {
        Messages.Messages_channels.clear();
        Messages.Messages_hashTable.clear();
        Messages.Messages_queue.clear();
        Messages.Messages_count = 0;
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(Lpc;I)V", garbageValue = "1736201417")
    static final void method2292(PacketBuffer var0) {
        for (int var1 = 0; var1 < Players.Players_pendingUpdateCount; ++var1) {
            int var2 = Players.Players_pendingUpdateIndices[var1];
            Player var3 = Client.players[var2];
            int var4 = var0.readUnsignedByte();
            if ((var4 & 128) != 0) {
                var4 += var0.readUnsignedByte() << 8;
            }
            byte var5 = class185.field2137.field2136;
            if ((var4 & 2048) != 0) {
                var3.field1153 = var0.readByteAdd();
                var3.field1144 = var0.readByteAdd();
                var3.field1147 = var0.readByte();
                var3.field1156 = var0.readByteNeg();
                var3.field1157 = var0.readUnsignedShortAddLE() + Client.cycle;
                var3.field1158 = var0.readUnsignedShort() + Client.cycle;
                var3.field1159 = var0.readUnsignedShort();
                if (var3.field1067) {
                    var3.field1153 += var3.tileX;
                    var3.field1144 += var3.tileY;
                    var3.field1147 += var3.tileX;
                    var3.field1156 += var3.tileY;
                    var3.pathLength = 0;
                } else {
                    var3.field1153 += var3.pathX[0];
                    var3.field1144 += var3.pathY[0];
                    var3.field1147 += var3.pathX[0];
                    var3.field1156 += var3.pathY[0];
                    var3.pathLength = 1;
                }
                var3.field1176 = 0;
            }
            if ((var4 & 16384) != 0) {
                Players.field1277[var2] = ((class185) (class140.findEnumerated(class113.method2601(), var0.readByte())));
            }
            int var6;
            int var9;
            int var10;
            int var13;
            if ((var4 & 32) != 0) {
                var6 = var0.readUnsignedShortAdd();
                PlayerType var7 = ((PlayerType) (class140.findEnumerated(MidiPcmStream.PlayerType_values(), var0.readUnsignedByteNeg())));
                boolean var8 = var0.readUnsignedByteNeg() == 1;
                var9 = var0.readUnsignedByte();
                var10 = var0.offset;
                if ((var3.username != null) && (var3.appearance != null)) {
                    boolean var11 = false;
                    if (var7.isUser && ClanSettings.friendSystem.isIgnored(var3.username)) {
                        var11 = true;
                    }
                    if (((!var11) && (Client.field658 == 0)) && (!var3.isHidden)) {
                        Players.field1275.offset = 0;
                        var0.method7564(Players.field1275.array, 0, var9);
                        Players.field1275.offset = 0;
                        String var12 = AbstractFont.escapeBrackets(ModelData0.method4273(GrandExchangeOfferUnitPriceComparator.method5755(Players.field1275)));
                        var3.overheadText = var12.trim();
                        var3.overheadTextColor = var6 >> 8;
                        var3.overheadTextEffect = var6 & 255;
                        var3.overheadTextCyclesRemaining = 150;
                        var3.isAutoChatting = var8;
                        var3.field1125 = (((var3 != WorldMapSprite.localPlayer) && var7.isUser) && ("" != Client.field726)) && (var12.toLowerCase().indexOf(Client.field726) == (-1));
                        if (var7.isPrivileged) {
                            var13 = (var8) ? 91 : 1;
                        } else {
                            var13 = (var8) ? 90 : 2;
                        }
                        if (var7.modIcon != (-1)) {
                            LoginScreenAnimation.addGameMessage(var13, WorldMapSectionType.method4720(var7.modIcon) + var3.username.getName(), var12);
                        } else {
                            LoginScreenAnimation.addGameMessage(var13, var3.username.getName(), var12);
                        }
                    }
                }
                var0.offset = var9 + var10;
            }
            if ((var4 & 1024) != 0) {
                var3.spotAnimation = var0.readUnsignedShortAddLE();
                var6 = var0.readInt();
                var3.spotAnimationHeight = var6 >> 16;
                var3.field1177 = (var6 & 65535) + Client.cycle;
                var3.spotAnimationFrame = 0;
                var3.spotAnimationFrameCycle = 0;
                if (var3.field1177 > Client.cycle) {
                    var3.spotAnimationFrame = -1;
                }
                if (var3.spotAnimation == 65535) {
                    var3.spotAnimation = -1;
                }
            }
            if ((var4 & 64) != 0) {
                var3.targetIndex = var0.readUnsignedShort();
                if (var3.targetIndex == 65535) {
                    var3.targetIndex = -1;
                }
            }
            if ((var4 & 8192) != 0) {
                var3.field1162 = Client.cycle + var0.readUnsignedShortLE();
                var3.field1163 = Client.cycle + var0.readUnsignedShort();
                var3.field1164 = var0.readByte();
                var3.field1155 = var0.readByte();
                var3.field1166 = var0.readByteSub();
                var3.field1167 = ((byte) (var0.readUnsignedByteNeg()));
            }
            int var14;
            if ((var4 & 2) != 0) {
                var6 = var0.readUnsignedByte();
                int var17;
                int var19;
                int var20;
                if (var6 > 0) {
                    for (var14 = 0; var14 < var6; ++var14) {
                        var9 = -1;
                        var10 = -1;
                        var20 = -1;
                        var19 = var0.readUShortSmart();
                        if (var19 == 32767) {
                            var19 = var0.readUShortSmart();
                            var10 = var0.readUShortSmart();
                            var9 = var0.readUShortSmart();
                            var20 = var0.readUShortSmart();
                        } else if (var19 != 32766) {
                            var10 = var0.readUShortSmart();
                        } else {
                            var19 = -1;
                        }
                        var17 = var0.readUShortSmart();
                        var3.addHitSplat(var19, var10, var9, var20, Client.cycle, var17);
                    }
                }
                var14 = var0.readUnsignedByteAdd();
                if (var14 > 0) {
                    for (var19 = 0; var19 < var14; ++var19) {
                        var9 = var0.readUShortSmart();
                        var10 = var0.readUShortSmart();
                        if (var10 != 32767) {
                            var20 = var0.readUShortSmart();
                            var17 = var0.readUnsignedByteAdd();
                            var13 = (var10 > 0) ? var0.readUnsignedByteSub() : var17;
                            var3.addHealthBar(var9, Client.cycle, var10, var20, var17, var13);
                        } else {
                            var3.removeHealthBar(var9);
                        }
                    }
                }
            }
            if ((var4 & 8) != 0) {
                var3.field1138 = var0.readUnsignedShortAddLE();
                if (var3.pathLength == 0) {
                    var3.orientation = var3.field1138;
                    var3.field1138 = -1;
                }
            }
            if ((var4 & 4) != 0) {
                var6 = var0.readUnsignedShort();
                if (var6 == 65535) {
                    var6 = -1;
                }
                var14 = var0.readUnsignedByte();
                ItemContainer.performPlayerAnimation(var3, var6, var14);
            }
            if ((var4 & 4096) != 0) {
                var5 = var0.readByte();
            }
            if ((var4 & 512) != 0) {
                for (var6 = 0; var6 < 3; ++var6) {
                    var3.actions[var6] = var0.readStringCp1252NullTerminated();
                }
            }
            if ((var4 & 1) != 0) {
                var6 = var0.readUnsignedByteAdd();
                byte[] var18 = new byte[var6];
                Buffer var15 = new Buffer(var18);
                var0.readBytesAdd(var18, 0, var6);
                Players.field1278[var2] = var15;
                var3.read(var15);
            }
            if ((var4 & 16) != 0) {
                var3.overheadText = var0.readStringCp1252NullTerminated();
                if (var3.overheadText.charAt(0) == '~') {
                    var3.overheadText = var3.overheadText.substring(1);
                    LoginScreenAnimation.addGameMessage(2, var3.username.getName(), var3.overheadText);
                } else if (var3 == WorldMapSprite.localPlayer) {
                    LoginScreenAnimation.addGameMessage(2, var3.username.getName(), var3.overheadText);
                }
                var3.isAutoChatting = false;
                var3.overheadTextColor = 0;
                var3.overheadTextEffect = 0;
                var3.overheadTextCyclesRemaining = 150;
            }
            if (var3.field1067) {
                if (var5 == 127) {
                    var3.resetPath(var3.tileX, var3.tileY);
                } else {
                    class185 var16;
                    if (var5 != class185.field2137.field2136) {
                        var16 = ((class185) (class140.findEnumerated(class113.method2601(), var5)));
                    } else {
                        var16 = Players.field1277[var2];
                    }
                    var3.method2122(var3.tileX, var3.tileY, var16);
                }
            }
        }
    }

    @ObfuscatedName("em")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1817008589")
    static final void method2293() {
        Scene.Scene_isLowDetail = false;
        Client.isLowDetail = false;
    }

    @ObfuscatedName("gz")
    @ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "1")
    static boolean method2294() {
        return (Client.drawPlayerNames & 2) != 0;
    }
}