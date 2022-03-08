import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("id")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lid;")
    public static final WorldMapCacheName field2793;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lid;")
    public static final WorldMapCacheName field2790;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lid;")
    public static final WorldMapCacheName field2791;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Lid;")
    static final WorldMapCacheName field2792;

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "Lid;")
    public static final WorldMapCacheName field2795;

    @ObfuscatedName("da")
    @ObfuscatedSignature(descriptor = "Lmg;")
    @Export("js5Socket")
    static AbstractSocket js5Socket;

    @ObfuscatedName("o")
    @Export("name")
    public final String name;

    static {
        field2793 = new WorldMapCacheName("details");
        field2790 = new WorldMapCacheName("compositemap");
        field2791 = new WorldMapCacheName("compositetexture");
        field2792 = new WorldMapCacheName("area");
        field2795 = new WorldMapCacheName("labels");
    }

    WorldMapCacheName(String var1) {
        this.name = var1;
    }

    @ObfuscatedName("as")
    @ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-128254341")
    static int method4829(int var0) {
        return ((int) (((Math.log(((double) (var0))) / Interpreter.field850) - 7.0) * 256.0));
    }

    @ObfuscatedName("an")
    @ObfuscatedSignature(descriptor = "(ILbl;ZI)I", garbageValue = "1334324157")
    static int method4830(int var0, Script var1, boolean var2) {
        if ((((((((var0 != 7000) && (var0 != 7005)) && (var0 != 7010)) && (var0 != 7015)) && (var0 != 7020)) && (var0 != 7025)) && (var0 != 7030)) && (var0 != 7035)) {
            if ((((((var0 != 7001) && (var0 != 7002)) && (var0 != 7011)) && (var0 != 7012)) && (var0 != 7021)) && (var0 != 7022)) {
                if (((var0 != 7003) && (var0 != 7013)) && (var0 != 7023)) {
                    if ((((((var0 != 7006) && (var0 != 7007)) && (var0 != 7016)) && (var0 != 7017)) && (var0 != 7026)) && (var0 != 7027)) {
                        if (((var0 != 7008) && (var0 != 7018)) && (var0 != 7028)) {
                            if ((var0 != 7031) && (var0 != 7032)) {
                                if (var0 == 7033) {
                                    --BufferedNetSocket.Interpreter_stringStackSize;
                                    return 1;
                                } else if ((var0 != 7036) && (var0 != 7037)) {
                                    if (var0 == 7038) {
                                        --Interpreter.Interpreter_intStackSize;
                                        return 1;
                                    } else if ((((((((var0 != 7004) && (var0 != 7009)) && (var0 != 7014)) && (var0 != 7019)) && (var0 != 7024)) && (var0 != 7029)) && (var0 != 7034)) && (var0 != 7039)) {
                                        return 2;
                                    } else {
                                        --Interpreter.Interpreter_intStackSize;
                                        return 1;
                                    }
                                } else {
                                    Interpreter.Interpreter_intStackSize -= 2;
                                    return 1;
                                }
                            } else {
                                --BufferedNetSocket.Interpreter_stringStackSize;
                                --Interpreter.Interpreter_intStackSize;
                                return 1;
                            }
                        } else {
                            --Interpreter.Interpreter_intStackSize;
                            return 1;
                        }
                    } else {
                        Interpreter.Interpreter_intStackSize -= 2;
                        return 1;
                    }
                } else {
                    Interpreter.Interpreter_intStackSize -= 2;
                    return 1;
                }
            } else {
                Interpreter.Interpreter_intStackSize -= 3;
                return 1;
            }
        } else {
            Interpreter.Interpreter_intStackSize -= 5;
            return 1;
        }
    }
}