import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("hh")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lhh;")
    @Export("WorldMapLabelSize_small")
    public static final WorldMapLabelSize WorldMapLabelSize_small;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lhh;")
    @Export("WorldMapLabelSize_medium")
    public static final WorldMapLabelSize WorldMapLabelSize_medium;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lhh;")
    @Export("WorldMapLabelSize_large")
    public static final WorldMapLabelSize WorldMapLabelSize_large;

    @ObfuscatedName("v")
    @Export("SpriteBuffer_pixels")
    public static byte[][] SpriteBuffer_pixels;

    @ObfuscatedName("ey")
    @ObfuscatedSignature(descriptor = "Lkz;")
    @Export("archive6")
    static Archive archive6;

    @ObfuscatedName("eu")
    @ObfuscatedSignature(descriptor = "Lkz;")
    @Export("archive7")
    static Archive archive7;

    @ObfuscatedName("nq")
    @ObfuscatedGetter(intValue = 360824335)
    @Export("selectedSpellWidget")
    static int selectedSpellWidget;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -1864990741)
    final int field2599;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = -980270199)
    final int field2603;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = -576668207)
    final int field2602;

    static {
        WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4);
        WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2);
        WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0);
    }

    WorldMapLabelSize(int var1, int var2, int var3) {
        this.field2599 = var1;
        this.field2603 = var2;
        this.field2602 = var3;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(FI)Z", garbageValue = "605395104")
    boolean method4311(float var1) {
        return var1 >= ((float) (this.field2602));
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)[Lhh;", garbageValue = "-1884718304")
    static WorldMapLabelSize[] method4309() {
        return new WorldMapLabelSize[]{ WorldMapLabelSize_small, WorldMapLabelSize_large, WorldMapLabelSize_medium };
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lkq;I)V", garbageValue = "-613673460")
    public static void method4325(AbstractArchive var0) {
        StructComposition.StructDefinition_archive = var0;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(IB)Lhh;", garbageValue = "81")
    static WorldMapLabelSize method4320(int var0) {
        WorldMapLabelSize[] var1 = method4309();
        for (int var2 = 0; var2 < var1.length; ++var2) {
            WorldMapLabelSize var3 = var1[var2];
            if (var0 == var3.field2603) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-2109628628")
    static void method4324(int var0) {
        ItemContainer var1 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
        if (var1 != null) {
            var1.remove();
        }
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "163767958")
    static void method4317() {
        if ((Client.Login_isUsernameRemembered && (Login.Login_username != null)) && (Login.Login_username.length() > 0)) {
            Login.currentLoginField = 1;
        } else {
            Login.currentLoginField = 0;
        }
    }

    @ObfuscatedName("p")
    @ObfuscatedSignature(descriptor = "(ILbl;ZB)I", garbageValue = "31")
    static int method4322(int var0, Script var1, boolean var2) {
        Widget var3 = (var2) ? class16.scriptDotWidget : Interpreter.scriptActiveWidget;
        if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class135.Widget_unpackTargetMask(Language.getWidgetFlags(var3));
            return 1;
        } else if (var0 != ScriptOpcodes.CC_GETOP) {
            if (var0 == ScriptOpcodes.CC_GETOPBASE) {
                if (var3.dataText == null) {
                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                } else {
                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var3.dataText;
                }
                return 1;
            } else {
                return 2;
            }
        } else {
            int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            --var4;
            if (((var3.actions != null) && (var4 < var3.actions.length)) && (var3.actions[var4] != null)) {
                Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var3.actions[var4];
            } else {
                Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
            }
            return 1;
        }
    }

    @ObfuscatedName("ge")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1940340272")
    @Export("setWindowedMode")
    static void setWindowedMode(int var0) {
        Client.field764 = 0L;
        if (var0 >= 2) {
            Client.isResizable = true;
        } else {
            Client.isResizable = false;
        }
        if (class339.getWindowedMode() == 1) {
            class414.client.setMaxCanvasSize(765, 503);
        } else {
            class414.client.setMaxCanvasSize(7680, 2160);
        }
        if (Client.gameState >= 25) {
            DesktopPlatformInfoProvider.method6847();
        }
    }

    @ObfuscatedName("ly")
    @ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "15")
    static void method4321(int var0) {
        if (var0 != Client.loginState) {
            Client.loginState = var0;
        }
    }
}