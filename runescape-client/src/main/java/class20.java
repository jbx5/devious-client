import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("f")
public class class20 implements Callable {
    @ObfuscatedName("ks")
    @ObfuscatedSignature(descriptor = "Ljz;")
    @Export("dragInventoryWidget")
    static Widget dragInventoryWidget;

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Ly;")
    final class10 field113;

    @ObfuscatedSignature(descriptor = "Lx;")
    final class14 this$0;

    @ObfuscatedSignature(descriptor = "(Lx;Ly;)V")
    class20(class14 var1, class10 var2) {
        this.this$0 = var1;
        this.field113 = var2;
    }

    public Object call() throws Exception {
        try {
            while (this.field113.method96()) {
                Language.method5813(10L);
            } 
        } catch (IOException var2) {
            return new class21("Error servicing REST query: " + var2.getMessage());
        }
        return this.field113.method99();
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)[Lpy;", garbageValue = "147068494")
    static PrivateChatMode[] method287() {
        return new PrivateChatMode[]{ PrivateChatMode.field4634, PrivateChatMode.field4632, PrivateChatMode.field4633 };
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(ILbl;ZI)I", garbageValue = "-1598638027")
    static int method289(int var0, Script var1, boolean var2) {
        Widget var3;
        if (var0 >= 2000) {
            var0 -= 1000;
            var3 = class130.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
        } else {
            var3 = (var2) ? class16.scriptDotWidget : Interpreter.scriptActiveWidget;
        }
        class112.invalidateWidget(var3);
        if (((var0 != ScriptOpcodes.CC_SETOBJECT) && (var0 != ScriptOpcodes.CC_SETOBJECT_NONUM)) && (var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM)) {
            if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
                var3.modelType = 2;
                var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                return 1;
            } else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
                var3.modelType = 3;
                var3.modelId = WorldMapSprite.localPlayer.appearance.getChatHeadId();
                return 1;
            } else {
                return 2;
            }
        } else {
            Interpreter.Interpreter_intStackSize -= 2;
            int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var3.itemId = var4;
            var3.itemQuantity = var5;
            ItemComposition var6 = Client.ItemDefinition_get(var4);
            var3.modelAngleX = var6.xan2d;
            var3.modelAngleY = var6.yan2d;
            var3.modelAngleZ = var6.zan2d;
            var3.modelOffsetX = var6.offsetX2d;
            var3.modelOffsetY = var6.offsetY2d;
            var3.modelZoom = var6.zoom2d;
            if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
                var3.itemQuantityMode = 0;
            } else if ((var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) | (1 == var6.isStackable)) {
                var3.itemQuantityMode = 1;
            } else {
                var3.itemQuantityMode = 2;
            }
            if (var3.field3310 > 0) {
                var3.modelZoom = (var3.modelZoom * 32) / var3.field3310;
            } else if (var3.rawWidth > 0) {
                var3.modelZoom = (var3.modelZoom * 32) / var3.rawWidth;
            }
            return 1;
        }
    }

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "(CB)Z", garbageValue = "-59")
    static boolean method288(char var0) {
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".indexOf(var0) != (-1);
    }

    @ObfuscatedName("hj")
    @ObfuscatedSignature(descriptor = "(ZLpc;I)V", garbageValue = "1852345170")
    static final void method290(boolean var0, PacketBuffer var1) {
        while (true) {
            if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) {
                int var2 = var1.readBits(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (Client.npcs[var2] == null) {
                        Client.npcs[var2] = new NPC();
                        var3 = true;
                    }
                    NPC var4 = Client.npcs[var2];
                    Client.npcIndices[(++Client.npcCount) - 1] = var2;
                    var4.npcCycle = Client.cycle;
                    int var5;
                    int var6;
                    int var7;
                    int var8;
                    int var9;
                    boolean var10;
                    if (HealthBarUpdate.field1178) {
                        if (var0) {
                            var6 = var1.readBits(8);
                            if (var6 > 127) {
                                var6 -= 256;
                            }
                        } else {
                            var6 = var1.readBits(5);
                            if (var6 > 15) {
                                var6 -= 32;
                            }
                        }
                        var8 = Client.defaultRotations[var1.readBits(3)];
                        if (var3) {
                            var4.orientation = var4.rotation = var8;
                        }
                        if (var0) {
                            var7 = var1.readBits(8);
                            if (var7 > 127) {
                                var7 -= 256;
                            }
                        } else {
                            var7 = var1.readBits(5);
                            if (var7 > 15) {
                                var7 -= 32;
                            }
                        }
                        var9 = var1.readBits(1);
                        if (var9 == 1) {
                            Client.field549[(++Client.field548) - 1] = var2;
                        }
                        var10 = var1.readBits(1) == 1;
                        if (var10) {
                            var1.readBits(32);
                        }
                        var5 = var1.readBits(1);
                        var4.definition = UserComparator10.getNpcDefinition(var1.readBits(14));
                    } else {
                        var8 = Client.defaultRotations[var1.readBits(3)];
                        if (var3) {
                            var4.orientation = var4.rotation = var8;
                        }
                        if (var0) {
                            var7 = var1.readBits(8);
                            if (var7 > 127) {
                                var7 -= 256;
                            }
                        } else {
                            var7 = var1.readBits(5);
                            if (var7 > 15) {
                                var7 -= 32;
                            }
                        }
                        var9 = var1.readBits(1);
                        if (var9 == 1) {
                            Client.field549[(++Client.field548) - 1] = var2;
                        }
                        var4.definition = UserComparator10.getNpcDefinition(var1.readBits(14));
                        var5 = var1.readBits(1);
                        var10 = var1.readBits(1) == 1;
                        if (var10) {
                            var1.readBits(32);
                        }
                        if (var0) {
                            var6 = var1.readBits(8);
                            if (var6 > 127) {
                                var6 -= 256;
                            }
                        } else {
                            var6 = var1.readBits(5);
                            if (var6 > 15) {
                                var6 -= 32;
                            }
                        }
                    }
                    var4.field1113 = var4.definition.size;
                    var4.field1170 = var4.definition.rotation;
                    if (var4.field1170 == 0) {
                        var4.rotation = 0;
                    }
                    var4.walkSequence = var4.definition.walkSequence;
                    var4.walkBackSequence = var4.definition.walkBackSequence;
                    var4.walkLeftSequence = var4.definition.walkLeftSequence;
                    var4.walkRightSequence = var4.definition.walkRightSequence;
                    var4.idleSequence = var4.definition.idleSequence;
                    var4.turnLeftSequence = var4.definition.turnLeftSequence;
                    var4.turnRightSequence = var4.definition.turnRightSequence;
                    var4.method2260(WorldMapSprite.localPlayer.pathX[0] + var6, WorldMapSprite.localPlayer.pathY[0] + var7, var5 == 1);
                    continue;
                }
            }
            var1.exportIndex();
            return;
        } 
    }
}