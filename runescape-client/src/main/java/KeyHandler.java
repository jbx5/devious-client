import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("k")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener , FocusListener {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lk;")
    @Export("KeyHandler_instance")
    public static KeyHandler KeyHandler_instance;

    @ObfuscatedName("cs")
    @Export("KeyHandler_pressedKeys")
    public static boolean[] KeyHandler_pressedKeys;

    @ObfuscatedName("cl")
    public static boolean[] field131;

    @ObfuscatedName("ck")
    public static boolean[] field138;

    @ObfuscatedName("cr")
    public static int[] field133;

    @ObfuscatedName("co")
    @ObfuscatedGetter(intValue = -48583837)
    public static int field145;

    @ObfuscatedName("cj")
    @ObfuscatedGetter(intValue = 79077775)
    public static int field148;

    @ObfuscatedName("ci")
    static char[] field136;

    @ObfuscatedName("ct")
    static int[] field132;

    @ObfuscatedName("ca")
    public static int[] field135;

    @ObfuscatedName("cx")
    @ObfuscatedGetter(intValue = 1602435519)
    public static int field139;

    @ObfuscatedName("cz")
    public static int[] field125;

    @ObfuscatedName("cm")
    @ObfuscatedGetter(intValue = -1015802681)
    public static int field141;

    @ObfuscatedName("cp")
    @ObfuscatedGetter(intValue = 2029736161)
    public static int field140;

    @ObfuscatedName("ce")
    @ObfuscatedGetter(intValue = 1860741199)
    public static int field146;

    @ObfuscatedName("cv")
    @ObfuscatedGetter(intValue = -253542341)
    public static int field144;

    @ObfuscatedName("ds")
    @ObfuscatedGetter(intValue = 653575701)
    @Export("KeyHandler_idleCycles")
    public static volatile int KeyHandler_idleCycles;

    @ObfuscatedName("de")
    @Export("KeyHandler_keyCodes")
    static int[] KeyHandler_keyCodes;

    static {
        KeyHandler_instance = new KeyHandler();
        KeyHandler_pressedKeys = new boolean[112];
        field131 = new boolean[112];
        field138 = new boolean[112];
        field133 = new int[128];
        field145 = 0;
        field148 = 0;
        field136 = new char[128];
        field132 = new int[128];
        field135 = new int[128];
        field139 = 0;
        field125 = new int[128];
        field141 = 0;
        field140 = 0;
        field146 = 0;
        field144 = 0;
        KeyHandler_idleCycles = 0;
        KeyHandler_keyCodes = new int[]{ -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    }

    KeyHandler() {
    }

    public synchronized final void keyReleased(KeyEvent var1) {
        if (KeyHandler_instance != null) {
            int var2 = var1.getKeyCode();
            if ((var2 >= 0) && (var2 < KeyHandler.KeyHandler_keyCodes.length)) {
                var2 = KeyHandler_keyCodes[var2] & (-129);
            } else {
                var2 = -1;
            }
            if ((field148 >= 0) && (var2 >= 0)) {
                field133[field148] = ~var2;
                field148 = (field148 + 1) & 127;
                if (field145 == field148) {
                    field148 = -1;
                }
            }
        }
        var1.consume();
    }

    public final void focusGained(FocusEvent var1) {
    }

    public final void keyTyped(KeyEvent var1) {
        if (KeyHandler_instance != null) {
            char var2 = var1.getKeyChar();
            if ((var2 != 0) && (var2 != '￿')) {
                boolean var3;
                if (((var2 > 0) && (var2 < 128)) || ((var2 >= 160) && (var2 <= 255))) {
                    var3 = true;
                } else {
                    label58 : {
                        if (var2 != 0) {
                            char[] var4 = class333.cp1252AsciiExtension;
                            for (int var5 = 0; var5 < var4.length; ++var5) {
                                char var6 = var4[var5];
                                if (var6 == var2) {
                                    var3 = true;
                                    break label58;
                                }
                            }
                        }
                        var3 = false;
                    }
                }
                if (var3) {
                    int var7 = (field146 + 1) & 127;
                    if (var7 != field140) {
                        field132[field146] = -1;
                        field136[field146] = var2;
                        field146 = var7;
                    }
                }
            }
        }
        var1.consume();
    }

    public synchronized final void focusLost(FocusEvent var1) {
        if (KeyHandler_instance != null) {
            field148 = -1;
        }
    }

    public synchronized final void keyPressed(KeyEvent var1) {
        if (KeyHandler_instance != null) {
            int var2 = var1.getKeyCode();
            if ((var2 >= 0) && (var2 < KeyHandler.KeyHandler_keyCodes.length)) {
                var2 = KeyHandler_keyCodes[var2];
                if ((var2 & 128) != 0) {
                    var2 = -1;
                }
            } else {
                var2 = -1;
            }
            if ((field148 >= 0) && (var2 >= 0)) {
                field133[field148] = var2;
                field148 = (field148 + 1) & 127;
                if (field148 == field145) {
                    field148 = -1;
                }
            }
            int var3;
            if (var2 >= 0) {
                var3 = (field146 + 1) & 127;
                if (var3 != field140) {
                    field132[field146] = var2;
                    field136[field146] = 0;
                    field146 = var3;
                }
            }
            var3 = var1.getModifiers();
            if ((((var3 & 10) != 0) || (var2 == 85)) || (var2 == 10)) {
                var1.consume();
            }
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-730157037")
    public static void method353() {
        class33.reflectionChecks = new IterableNodeDeque();
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(I)[Lfo;", garbageValue = "-1430977988")
    static VerticalAlignment[] method322() {
        return new VerticalAlignment[]{ VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1886, VerticalAlignment.field1887 };
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(I)[B", garbageValue = "1298635805")
    public static byte[] method332() {
        byte[] var0 = new byte[24];
        try {
            JagexCache.JagexCache_randomDat.seek(0L);
            JagexCache.JagexCache_randomDat.readFully(var0);
            int var1;
            for (var1 = 0; (var1 < 24) && (var0[var1] == 0); ++var1) {
            }
            if (var1 >= 24) {
                throw new IOException();
            }
        } catch (Exception var4) {
            for (int var2 = 0; var2 < 24; ++var2) {
                var0[var2] = -1;
            }
        }
        return var0;
    }

    @ObfuscatedName("r")
    public static int method355(long var0) {
        return ((int) ((var0 >>> 7) & 127L));
    }

    @ObfuscatedName("jc")
    @ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "84")
    static boolean method324() {
        return Client.tapToDrop || KeyHandler_pressedKeys[81];
    }
}