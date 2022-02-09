import java.awt.Component;
import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("en")
public abstract class class142 extends Node {
    @ObfuscatedName("fg")
    @Export("secureRandom")
    static SecureRandom secureRandom;

    class142() {
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpi;B)V", garbageValue = "-103")
    abstract void vmethod3014(Buffer var1);

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Leg;B)V", garbageValue = "48")
    abstract void vmethod3015(ClanChannel var1);

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;B)V", garbageValue = "77")
    static void method2945(Component var0) {
        var0.addMouseListener(MouseHandler.MouseHandler_instance);
        var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
        var0.addFocusListener(MouseHandler.MouseHandler_instance);
    }

    @ObfuscatedName("hl")
    @ObfuscatedSignature(descriptor = "(Lpc;I)V", garbageValue = "-893851567")
    static final void method2952(PacketBuffer var0) {
        for (int var1 = 0; var1 < Client.field548; ++var1) {
            int var2 = Client.field549[var1];
            NPC var3 = Client.npcs[var2];
            int var4 = var0.readUnsignedByte();
            int var5;
            if (HealthBarUpdate.field1178 && ((var4 & 16) != 0)) {
                var5 = var0.readUnsignedByte();
                var4 += var5 << 8;
            }
            if ((var4 & 32) != 0) {
                var3.definition = UserComparator10.getNpcDefinition(var0.readUnsignedShortAddLE());
                var3.field1113 = var3.definition.size;
                var3.field1170 = var3.definition.rotation;
                var3.walkSequence = var3.definition.walkSequence;
                var3.walkBackSequence = var3.definition.walkBackSequence;
                var3.walkLeftSequence = var3.definition.walkLeftSequence;
                var3.walkRightSequence = var3.definition.walkRightSequence;
                var3.idleSequence = var3.definition.idleSequence;
                var3.turnLeftSequence = var3.definition.turnLeftSequence;
                var3.turnRightSequence = var3.definition.turnRightSequence;
            }
            if ((var4 & 128) != 0) {
                var3.spotAnimation = var0.readUnsignedShortLE();
                var5 = var0.readInt();
                var3.spotAnimationHeight = var5 >> 16;
                var3.field1177 = (var5 & 65535) + Client.cycle;
                var3.spotAnimationFrame = 0;
                var3.spotAnimationFrameCycle = 0;
                if (var3.field1177 > Client.cycle) {
                    var3.spotAnimationFrame = -1;
                }
                if (var3.spotAnimation == 65535) {
                    var3.spotAnimation = -1;
                }
            }
            if ((var4 & 512) != 0) {
                var3.field1135 = var0.readUnsignedIntLE();
            }
            if ((HealthBarUpdate.field1178 && ((var4 & 1024) != 0)) || ((!HealthBarUpdate.field1178) && ((var4 & 16) != 0))) {
                var3.field1153 = var0.readByte();
                var3.field1144 = var0.readByte();
                var3.field1147 = var0.readByteSub();
                var3.field1156 = var0.readByteAdd();
                var3.field1157 = var0.readUnsignedShortAddLE() + Client.cycle;
                var3.field1158 = var0.readUnsignedShortLE() + Client.cycle;
                var3.field1159 = var0.readUnsignedShort();
                var3.pathLength = 1;
                var3.field1176 = 0;
                var3.field1153 += var3.pathX[0];
                var3.field1144 += var3.pathY[0];
                var3.field1147 += var3.pathX[0];
                var3.field1156 += var3.pathY[0];
            }
            if ((var4 & 256) != 0) {
                var3.field1162 = Client.cycle + var0.readUnsignedShortLE();
                var3.field1163 = Client.cycle + var0.readUnsignedShort();
                var3.field1164 = var0.readByteNeg();
                var3.field1155 = var0.readByteAdd();
                var3.field1166 = var0.readByte();
                var3.field1167 = ((byte) (var0.readUnsignedByteSub()));
            }
            if ((var4 & 64) != 0) {
                var3.targetIndex = var0.readUnsignedShortAddLE();
                if (var3.targetIndex == 65535) {
                    var3.targetIndex = -1;
                }
            }
            int var6;
            int var7;
            int var8;
            if ((var4 & 1) != 0) {
                var5 = var0.readUnsignedByteNeg();
                int var9;
                int var10;
                int var11;
                if (var5 > 0) {
                    for (var6 = 0; var6 < var5; ++var6) {
                        var8 = -1;
                        var9 = -1;
                        var10 = -1;
                        var7 = var0.readUShortSmart();
                        if (var7 == 32767) {
                            var7 = var0.readUShortSmart();
                            var9 = var0.readUShortSmart();
                            var8 = var0.readUShortSmart();
                            var10 = var0.readUShortSmart();
                        } else if (var7 != 32766) {
                            var9 = var0.readUShortSmart();
                        } else {
                            var7 = -1;
                        }
                        var11 = var0.readUShortSmart();
                        var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11);
                    }
                }
                var6 = var0.readUnsignedByte();
                if (var6 > 0) {
                    for (var7 = 0; var7 < var6; ++var7) {
                        var8 = var0.readUShortSmart();
                        var9 = var0.readUShortSmart();
                        if (var9 != 32767) {
                            var10 = var0.readUShortSmart();
                            var11 = var0.readUnsignedByteNeg();
                            int var12 = (var9 > 0) ? var0.readUnsignedByteAdd() : var11;
                            var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12);
                        } else {
                            var3.removeHealthBar(var8);
                        }
                    }
                }
            }
            if ((var4 & 4) != 0) {
                var5 = var0.readUnsignedShortAddLE();
                if (var5 == 65535) {
                    var5 = -1;
                }
                var6 = var0.readUnsignedByte();
                if ((var5 == var3.sequence) && (var5 != (-1))) {
                    var7 = class78.SequenceDefinition_get(var5).field2109;
                    if (var7 == 1) {
                        var3.sequenceFrame = 0;
                        var3.sequenceFrameCycle = 0;
                        var3.sequenceDelay = var6;
                        var3.field1129 = 0;
                    }
                    if (var7 == 2) {
                        var3.field1129 = 0;
                    }
                } else if (((var5 == (-1)) || (var3.sequence == (-1))) || (class78.SequenceDefinition_get(var5).field2095 >= class78.SequenceDefinition_get(var3.sequence).field2095)) {
                    var3.sequence = var5;
                    var3.sequenceFrame = 0;
                    var3.sequenceFrameCycle = 0;
                    var3.sequenceDelay = var6;
                    var3.field1129 = 0;
                    var3.field1176 = var3.pathLength;
                }
            }
            if ((var4 & 2) != 0) {
                var3.overheadText = var0.readStringCp1252NullTerminated();
                var3.overheadTextCyclesRemaining = 100;
            }
            if ((var4 & 8) != 0) {
                var5 = var0.readUnsignedShort();
                var6 = var0.readUnsignedShortLE();
                if (HealthBarUpdate.field1178) {
                    var3.field1139 = var0.readUnsignedByte() == 1;
                }
                var7 = var3.x - (((var5 - Canvas.baseX) - Canvas.baseX) * 64);
                var8 = var3.y - (((var6 - class118.baseY) - class118.baseY) * 64);
                if ((var7 != 0) || (var8 != 0)) {
                    var3.field1138 = ((int) (Math.atan2(((double) (var7)), ((double) (var8))) * 325.949)) & 2047;
                }
            }
        }
    }
}