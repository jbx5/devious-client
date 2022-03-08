import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("g")
public class class21 {
    @ObfuscatedName("sm")
    @ObfuscatedGetter(intValue = 23217011)
    static int field119;

    @ObfuscatedName("y")
    public static short[] field120;

    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = 1951447145)
    final int field121;

    @ObfuscatedName("l")
    final String field118;

    class21(String var1) {
        this.field121 = 400;
        this.field118 = "";
    }

    class21(HttpURLConnection var1) throws IOException {
        this.field121 = var1.getResponseCode();
        var1.getResponseMessage();
        var1.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = (this.field121 >= 300) ? var1.getErrorStream() : var1.getInputStream();
        if (var3 != null) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);
            String var6;
            while ((var6 = var5.readLine()) != null) {
                var2.append(var6);
            } 
            var3.close();
        }
        this.field118 = var2.toString();
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "968083277")
    public int method294() {
        return this.field121;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-1877515937")
    public String method295() {
        return this.field118;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lkq;IB)Ljj;", garbageValue = "-3")
    static MusicPatch method302(AbstractArchive var0, int var1) {
        byte[] var2 = var0.takeFileFlat(var1);
        return var2 == null ? null : new MusicPatch(var2);
    }

    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "64")
    public static void method301() {
        ObjectComposition.ObjectDefinition_cached.clear();
        ObjectComposition.ObjectDefinition_cachedModelData.clear();
        ObjectComposition.ObjectDefinition_cachedEntities.clear();
        ObjectComposition.ObjectDefinition_cachedModels.clear();
    }

    @ObfuscatedName("m")
    @ObfuscatedSignature(descriptor = "(ILbl;ZB)I", garbageValue = "-117")
    static int method292(int var0, Script var1, boolean var2) {
        Widget var3 = class130.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
        if (var0 == ScriptOpcodes.IF_GETX) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.x;
            return 1;
        } else if (var0 == ScriptOpcodes.IF_GETY) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.y;
            return 1;
        } else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.width;
            return 1;
        } else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.height;
            return 1;
        } else if (var0 == ScriptOpcodes.IF_GETHIDE) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var3.isHidden) ? 1 : 0;
            return 1;
        } else if (var0 == ScriptOpcodes.IF_GETLAYER) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.parentId;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("af")
    @ObfuscatedSignature(descriptor = "(ILbl;ZB)I", garbageValue = "20")
    static int method303(int var0, Script var1, boolean var2) {
        if ((var0 != 3700) && (var0 != 3701)) {
            if (var0 == 3702) {
                ++Interpreter.Interpreter_intStackSize;
                return 1;
            } else {
                return 2;
            }
        } else {
            --Interpreter.Interpreter_intStackSize;
            --BufferedNetSocket.Interpreter_stringStackSize;
            return 1;
        }
    }

    @ObfuscatedName("ji")
    @ObfuscatedSignature(descriptor = "([Ljz;IIIZB)V", garbageValue = "1")
    @Export("resizeInterface")
    static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
        for (int var5 = 0; var5 < var0.length; ++var5) {
            Widget var6 = var0[var5];
            if ((var6 != null) && (var6.parentId == var1)) {
                class141.alignWidgetSize(var6, var2, var3, var4);
                NetCache.alignWidgetPosition(var6, var2, var3);
                if (var6.scrollX > (var6.scrollWidth - var6.width)) {
                    var6.scrollX = var6.scrollWidth - var6.width;
                }
                if (var6.scrollX < 0) {
                    var6.scrollX = 0;
                }
                if (var6.scrollY > (var6.scrollHeight - var6.height)) {
                    var6.scrollY = var6.scrollHeight - var6.height;
                }
                if (var6.scrollY < 0) {
                    var6.scrollY = 0;
                }
                if (var6.type == 0) {
                    PcmPlayer.revalidateWidgetScroll(var0, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("kc")
    @ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "3")
    static final void method299(int var0) {
        var0 = Math.min(Math.max(var0, 0), 255);
        if (var0 != class424.clientPreferences.musicVolume) {
            if ((class424.clientPreferences.musicVolume == 0) && (Client.currentTrackGroupId != (-1))) {
                MenuAction.method1894(WorldMapLabelSize.archive6, Client.currentTrackGroupId, 0, var0, false);
                Client.field744 = false;
            } else if (var0 == 0) {
                class265.midiPcmStream.clear();
                class265.musicPlayerStatus = 1;
                class265.musicTrackArchive = null;
                Client.field744 = false;
            } else {
                class111.method2528(var0);
            }
            class424.clientPreferences.musicVolume = var0;
            GameEngine.savePreferences();
        }
    }
}