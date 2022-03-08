import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("aq")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
    @ObfuscatedName("bu")
    static String field256;

    @ObfuscatedName("hz")
    @Export("regionMapArchives")
    static byte[][] regionMapArchives;

    @ObfuscatedName("me")
    @ObfuscatedGetter(intValue = -961973477)
    @Export("menuY")
    static int menuY;

    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = -1923363369)
    @Export("id")
    int id;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -311842773)
    @Export("size")
    int size;

    @ObfuscatedName("s")
    @Export("operations")
    int[] operations;

    @ObfuscatedName("e")
    @Export("creationErrors")
    int[] creationErrors;

    @ObfuscatedName("r")
    @Export("fields")
    Field[] fields;

    @ObfuscatedName("o")
    @Export("intReplaceValues")
    int[] intReplaceValues;

    @ObfuscatedName("i")
    @Export("methods")
    Method[] methods;

    @ObfuscatedName("w")
    @Export("arguments")
    byte[][][] arguments;

    ReflectionCheck() {
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-116")
    public static void method631() {
        FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(III)I", garbageValue = "-321975416")
    public static int method630(int var0, int var1) {
        int var2;
        for (var2 = 0; var1 > 0; --var1) {
            var2 = (var2 << 1) | (var0 & 1);
            var0 >>>= 1;
        }
        return var2;
    }

    @ObfuscatedName("ar")
    @ObfuscatedSignature(descriptor = "(ILbl;ZI)I", garbageValue = "1776722764")
    static int method629(int var0, Script var1, boolean var2) {
        int var3;
        int var4;
        if (var0 == ScriptOpcodes.ADD) {
            Interpreter.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4 + var3;
            return 1;
        } else if (var0 == ScriptOpcodes.SUB) {
            Interpreter.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 - var4;
            return 1;
        } else if (var0 == ScriptOpcodes.MULTIPLY) {
            Interpreter.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4 * var3;
            return 1;
        } else if (var0 == ScriptOpcodes.DIV) {
            Interpreter.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 / var4;
            return 1;
        } else if (var0 == ScriptOpcodes.RANDOM) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((int) (Math.random() * ((double) (var3))));
            return 1;
        } else if (var0 == ScriptOpcodes.RANDOMINC) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((int) (Math.random() * ((double) (var3 + 1))));
            return 1;
        } else {
            int var5;
            int var6;
            int var7;
            if (var0 == ScriptOpcodes.INTERPOLATE) {
                Interpreter.Interpreter_intStackSize -= 5;
                var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
                var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
                var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4];
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 + (((var7 - var5) * (var4 - var3)) / (var6 - var5));
                return 1;
            } else if (var0 == ScriptOpcodes.ADDPERCENT) {
                Interpreter.Interpreter_intStackSize -= 2;
                var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 + ((var4 * var3) / 100);
                return 1;
            } else if (var0 == ScriptOpcodes.SETBIT) {
                Interpreter.Interpreter_intStackSize -= 2;
                var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 | (1 << var4);
                return 1;
            } else if (var0 == ScriptOpcodes.CLEARBIT) {
                Interpreter.Interpreter_intStackSize -= 2;
                var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 & ((-1) - (1 << var4));
                return 1;
            } else if (var0 == ScriptOpcodes.TESTBIT) {
                Interpreter.Interpreter_intStackSize -= 2;
                var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((var3 & (1 << var4)) != 0) ? 1 : 0;
                return 1;
            } else if (var0 == ScriptOpcodes.MOD) {
                Interpreter.Interpreter_intStackSize -= 2;
                var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 % var4;
                return 1;
            } else if (var0 == ScriptOpcodes.POW) {
                Interpreter.Interpreter_intStackSize -= 2;
                var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                if (var3 == 0) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                } else {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((int) (Math.pow(((double) (var3)), ((double) (var4)))));
                }
                return 1;
            } else if (var0 == ScriptOpcodes.INVPOW) {
                Interpreter.Interpreter_intStackSize -= 2;
                var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                if (var3 == 0) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                    return 1;
                } else {
                    switch (var4) {
                        case 0 :
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Integer.MAX_VALUE;
                            break;
                        case 1 :
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3;
                            break;
                        case 2 :
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((int) (Math.sqrt(((double) (var3)))));
                            break;
                        case 3 :
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((int) (Math.cbrt(((double) (var3)))));
                            break;
                        case 4 :
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((int) (Math.sqrt(Math.sqrt(((double) (var3))))));
                            break;
                        default :
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((int) (Math.pow(((double) (var3)), 1.0 / ((double) (var4)))));
                    }
                    return 1;
                }
            } else if (var0 == ScriptOpcodes.AND) {
                Interpreter.Interpreter_intStackSize -= 2;
                var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 & var4;
                return 1;
            } else if (var0 == ScriptOpcodes.OR) {
                Interpreter.Interpreter_intStackSize -= 2;
                var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 | var4;
                return 1;
            } else if (var0 == ScriptOpcodes.SCALE) {
                Interpreter.Interpreter_intStackSize -= 3;
                long var9 = ((long) (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]));
                long var11 = ((long) (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]));
                long var13 = ((long) (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]));
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((int) ((var13 * var9) / var11));
                return 1;
            } else if (var0 == ScriptOpcodes.BITCOUNT) {
                var3 = class9.method67(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3;
                return 1;
            } else if (var0 == ScriptOpcodes.TOGGLEBIT) {
                Interpreter.Interpreter_intStackSize -= 2;
                var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 ^ (1 << var4);
                return 1;
            } else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
                Interpreter.Interpreter_intStackSize -= 3;
                var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ClientPreferences.method2237(var3, var4, var5);
                return 1;
            } else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
                Interpreter.Interpreter_intStackSize -= 3;
                var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ClanChannelMember.method2770(var3, var4, var5);
                return 1;
            } else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
                Interpreter.Interpreter_intStackSize -= 3;
                var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
                var6 = 31 - var5;
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var3 << var6) >>> (var4 + var6);
                return 1;
            } else if (var0 == 4030) {
                Interpreter.Interpreter_intStackSize -= 4;
                var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
                var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
                var3 = ClanChannelMember.method2770(var3, var5, var6);
                var7 = class125.method2741((var6 - var5) + 1);
                if (var4 > var7) {
                    var4 = var7;
                }
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 | (var4 << var5);
                return 1;
            } else if (var0 == 4032) {
                Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class278.method5319(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
                return 1;
            } else if (var0 == 4033) {
                Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = UrlRequest.method2432(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
                return 1;
            } else if (var0 == 4034) {
                Interpreter.Interpreter_intStackSize -= 2;
                var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                var5 = class341.method6227(var3, var4);
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var5;
                return 1;
            } else if (var0 == 4035) {
                Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("ky")
    @ObfuscatedSignature(descriptor = "(Ljz;IIIB)V", garbageValue = "23")
    @Export("drawMinimap")
    static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
        class122.playPcmPlayers();
        SpriteMask var4 = var0.getSpriteMask(false);
        if (var4 != null) {
            Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
            if ((Client.minimapState != 2) && (Client.minimapState != 5)) {
                int var5 = Client.camAngleY & 2047;
                int var6 = (WorldMapSprite.localPlayer.x / 32) + 48;
                int var7 = 464 - (WorldMapSprite.localPlayer.y / 32);
                class414.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);
                int var8;
                int var10;
                int var16;
                for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
                    var16 = ((Client.mapIconXs[var8] * 4) + 2) - (WorldMapSprite.localPlayer.x / 32);
                    var10 = ((Client.mapIconYs[var8] * 4) + 2) - (WorldMapSprite.localPlayer.y / 32);
                    Interpreter.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
                }
                int var11;
                int var12;
                for (var8 = 0; var8 < 104; ++var8) {
                    for (var16 = 0; var16 < 104; ++var16) {
                        NodeDeque var14 = Client.groundItems[SoundSystem.Client_plane][var8][var16];
                        if (var14 != null) {
                            var11 = ((var8 * 4) + 2) - (WorldMapSprite.localPlayer.x / 32);
                            var12 = ((var16 * 4) + 2) - (WorldMapSprite.localPlayer.y / 32);
                            Interpreter.drawSpriteOnMinimap(var1, var2, var11, var12, Huffman.mapDotSprites[0], var4);
                        }
                    }
                }
                for (var8 = 0; var8 < Client.npcCount; ++var8) {
                    NPC var9 = Client.npcs[Client.npcIndices[var8]];
                    if ((var9 != null) && var9.isVisible()) {
                        NPCComposition var18 = var9.definition;
                        if ((var18 != null) && (var18.transforms != null)) {
                            var18 = var18.transform();
                        }
                        if (((var18 != null) && var18.drawMapDot) && var18.isInteractable) {
                            var11 = (var9.x / 32) - (WorldMapSprite.localPlayer.x / 32);
                            var12 = (var9.y / 32) - (WorldMapSprite.localPlayer.y / 32);
                            Interpreter.drawSpriteOnMinimap(var1, var2, var11, var12, Huffman.mapDotSprites[1], var4);
                        }
                    }
                }
                var8 = Players.Players_count;
                int[] var17 = Players.Players_indices;
                for (var10 = 0; var10 < var8; ++var10) {
                    Player var15 = Client.players[var17[var10]];
                    if ((((var15 != null) && var15.isVisible()) && (!var15.isHidden)) && (var15 != WorldMapSprite.localPlayer)) {
                        var12 = (var15.x / 32) - (WorldMapSprite.localPlayer.x / 32);
                        int var13 = (var15.y / 32) - (WorldMapSprite.localPlayer.y / 32);
                        if (var15.isFriend()) {
                            Interpreter.drawSpriteOnMinimap(var1, var2, var12, var13, Huffman.mapDotSprites[3], var4);
                        } else if (((WorldMapSprite.localPlayer.team != 0) && (var15.team != 0)) && (var15.team == WorldMapSprite.localPlayer.team)) {
                            Interpreter.drawSpriteOnMinimap(var1, var2, var12, var13, Huffman.mapDotSprites[4], var4);
                        } else if (var15.isFriendsChatMember()) {
                            Interpreter.drawSpriteOnMinimap(var1, var2, var12, var13, Huffman.mapDotSprites[5], var4);
                        } else if (var15.isClanMember()) {
                            Interpreter.drawSpriteOnMinimap(var1, var2, var12, var13, Huffman.mapDotSprites[6], var4);
                        } else {
                            Interpreter.drawSpriteOnMinimap(var1, var2, var12, var13, Huffman.mapDotSprites[2], var4);
                        }
                    }
                }
                if ((Client.hintArrowType != 0) && ((Client.cycle % 20) < 10)) {
                    if (((Client.hintArrowType == 1) && (Client.hintArrowNpcIndex >= 0)) && (Client.hintArrowNpcIndex < Client.npcs.length)) {
                        NPC var19 = Client.npcs[Client.hintArrowNpcIndex];
                        if (var19 != null) {
                            var11 = (var19.x / 32) - (WorldMapSprite.localPlayer.x / 32);
                            var12 = (var19.y / 32) - (WorldMapSprite.localPlayer.y / 32);
                            class12.worldToMinimap(var1, var2, var11, var12, Varcs.mapMarkerSprites[1], var4);
                        }
                    }
                    if (Client.hintArrowType == 2) {
                        var10 = (((Client.hintArrowX * 4) - (Canvas.baseX * 4)) + 2) - (WorldMapSprite.localPlayer.x / 32);
                        var11 = (((Client.hintArrowY * 4) - (class118.baseY * 4)) + 2) - (WorldMapSprite.localPlayer.y / 32);
                        class12.worldToMinimap(var1, var2, var10, var11, Varcs.mapMarkerSprites[1], var4);
                    }
                    if (((Client.hintArrowType == 10) && (Client.hintArrowPlayerIndex >= 0)) && (Client.hintArrowPlayerIndex < Client.players.length)) {
                        Player var20 = Client.players[Client.hintArrowPlayerIndex];
                        if (var20 != null) {
                            var11 = (var20.x / 32) - (WorldMapSprite.localPlayer.x / 32);
                            var12 = (var20.y / 32) - (WorldMapSprite.localPlayer.y / 32);
                            class12.worldToMinimap(var1, var2, var11, var12, Varcs.mapMarkerSprites[1], var4);
                        }
                    }
                }
                if (Client.destinationX != 0) {
                    var10 = ((Client.destinationX * 4) + 2) - (WorldMapSprite.localPlayer.x / 32);
                    var11 = ((Client.destinationY * 4) + 2) - (WorldMapSprite.localPlayer.y / 32);
                    Interpreter.drawSpriteOnMinimap(var1, var2, var10, var11, Varcs.mapMarkerSprites[0], var4);
                }
                if (!WorldMapSprite.localPlayer.isHidden) {
                    Rasterizer2D.Rasterizer2D_fillRectangle(((var4.width / 2) + var1) - 1, ((var4.height / 2) + var2) - 1, 3, 3, 16777215);
                }
            } else {
                Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
            }
            Client.field714[var3] = true;
        }
    }
}