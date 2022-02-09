import java.awt.Component;
import java.awt.Graphics;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("z")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
    @ObfuscatedName("gc")
    @ObfuscatedGetter(longValue = -228960610816436577L)
    static long field159;

    @ObfuscatedName("ha")
    @ObfuscatedGetter(intValue = -729054449)
    @Export("baseX")
    static int baseX;

    @ObfuscatedName("hl")
    @ObfuscatedGetter(intValue = 547455067)
    static int field157;

    @ObfuscatedName("c")
    @Export("component")
    Component component;

    Canvas(Component var1) {
        this.component = var1;
    }

    public final void update(Graphics var1) {
        this.component.update(var1);
    }

    public final void paint(Graphics var1) {
        this.component.paint(var1);
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "-41")
    static int method371(int var0, int var1) {
        if (var0 == (-2)) {
            return 12345678;
        } else if (var0 == (-1)) {
            if (var1 < 0) {
                var1 = 0;
            } else if (var1 > 127) {
                var1 = 127;
            }
            var1 = 127 - var1;
            return var1;
        } else {
            var1 = ((var0 & 127) * var1) / 128;
            if (var1 < 2) {
                var1 = 2;
            } else if (var1 > 126) {
                var1 = 126;
            }
            return (var0 & 65408) + var1;
        }
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(IIII)V", garbageValue = "2124496518")
    static final void method370(int var0, int var1, int var2) {
        int var3;
        for (var3 = 0; var3 < 8; ++var3) {
            for (int var4 = 0; var4 < 8; ++var4) {
                Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
            }
        }
        if (var1 > 0) {
            for (var3 = 1; var3 < 8; ++var3) {
                Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
            }
        }
        if (var2 > 0) {
            for (var3 = 1; var3 < 8; ++var3) {
                Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
            }
        }
        if ((var1 > 0) && (Tiles.Tiles_heights[var0][var1 - 1][var2] != 0)) {
            Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
        } else if ((var2 > 0) && (Tiles.Tiles_heights[var0][var1][var2 - 1] != 0)) {
            Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
        } else if (((var1 > 0) && (var2 > 0)) && (Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0)) {
            Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
        }
    }

    @ObfuscatedName("h")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1618787427")
    public static void method365() {
        class434.SpriteBuffer_xOffsets = null;
        class434.SpriteBuffer_yOffsets = null;
        class434.SpriteBuffer_spriteWidths = null;
        Fonts.SpriteBuffer_spriteHeights = null;
        HealthBarUpdate.SpriteBuffer_spritePalette = null;
        WorldMapLabelSize.SpriteBuffer_pixels = null;
    }

    @ObfuscatedName("q")
    @ObfuscatedSignature(descriptor = "(ILbl;ZI)I", garbageValue = "998938485")
    static int method364(int var0, Script var1, boolean var2) {
        Widget var3 = (var2) ? class16.scriptDotWidget : Interpreter.scriptActiveWidget;
        if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.scrollX;
            return 1;
        } else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.scrollY;
            return 1;
        } else if (var0 == ScriptOpcodes.CC_GETTEXT) {
            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var3.text;
            return 1;
        } else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.scrollWidth;
            return 1;
        } else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.scrollHeight;
            return 1;
        } else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.modelZoom;
            return 1;
        } else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.modelAngleX;
            return 1;
        } else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.modelAngleZ;
            return 1;
        } else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.modelAngleY;
            return 1;
        } else if (var0 == ScriptOpcodes.CC_GETTRANS) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.transparencyTop;
            return 1;
        } else if (var0 == 1610) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.transparencyBot;
            return 1;
        } else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.color;
            return 1;
        } else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.color2;
            return 1;
        } else if (var0 == 1613) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.fillMode.rsOrdinal();
            return 1;
        } else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var3.modelTransparency) ? 1 : 0;
            return 1;
        } else if ((var0 != 1615) && (var0 != 1616)) {
            return 2;
        } else {
            ++Interpreter.Interpreter_intStackSize;
            return 1;
        }
    }
}