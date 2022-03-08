import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("df")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
    @ObfuscatedName("c")
    @Export("reversed")
    final boolean reversed;

    public UserComparator9(boolean var1) {
        this.reversed = var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lmd;Lmd;I)I", garbageValue = "1277014918")
    @Export("compareBuddy")
    int compareBuddy(Buddy var1, Buddy var2) {
        if ((Client.worldId == var1.world) && (var2.world == Client.worldId)) {
            return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
        } else {
            return this.compareUser(var1, var2);
        }
    }

    public int compare(Object var1, Object var2) {
        return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1595429629")
    static void method2495() {
        if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != (-1)) {
            KeyHandler.KeyHandler_keyCodes[186] = 57;
            KeyHandler.KeyHandler_keyCodes[187] = 27;
            KeyHandler.KeyHandler_keyCodes[188] = 71;
            KeyHandler.KeyHandler_keyCodes[189] = 26;
            KeyHandler.KeyHandler_keyCodes[190] = 72;
            KeyHandler.KeyHandler_keyCodes[191] = 73;
            KeyHandler.KeyHandler_keyCodes[192] = 58;
            KeyHandler.KeyHandler_keyCodes[219] = 42;
            KeyHandler.KeyHandler_keyCodes[220] = 74;
            KeyHandler.KeyHandler_keyCodes[221] = 43;
            KeyHandler.KeyHandler_keyCodes[222] = 59;
            KeyHandler.KeyHandler_keyCodes[223] = 28;
        } else {
            KeyHandler.KeyHandler_keyCodes[44] = 71;
            KeyHandler.KeyHandler_keyCodes[45] = 26;
            KeyHandler.KeyHandler_keyCodes[46] = 72;
            KeyHandler.KeyHandler_keyCodes[47] = 73;
            KeyHandler.KeyHandler_keyCodes[59] = 57;
            KeyHandler.KeyHandler_keyCodes[61] = 27;
            KeyHandler.KeyHandler_keyCodes[91] = 42;
            KeyHandler.KeyHandler_keyCodes[92] = 74;
            KeyHandler.KeyHandler_keyCodes[93] = 43;
            KeyHandler.KeyHandler_keyCodes[192] = 28;
            KeyHandler.KeyHandler_keyCodes[222] = 58;
            KeyHandler.KeyHandler_keyCodes[520] = 59;
        }
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(Lpi;IIIIIII)V", garbageValue = "-608728692")
    @Export("loadTerrain")
    static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        int var7;
        if ((((var2 >= 0) && (var2 < 104)) && (var3 >= 0)) && (var3 < 104)) {
            Tiles.Tiles_renderFlags[var1][var2][var3] = 0;
            while (true) {
                var7 = var0.readUnsignedByte();
                if (var7 == 0) {
                    if (var1 == 0) {
                        Tiles.Tiles_heights[0][var2][var3] = (-Skills.method5471((var4 + 932731) + var2, (var5 + 556238) + var3)) * 8;
                    } else {
                        Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
                    }
                    break;
                }
                if (var7 == 1) {
                    int var8 = var0.readUnsignedByte();
                    if (var8 == 1) {
                        var8 = 0;
                    }
                    if (var1 == 0) {
                        Tiles.Tiles_heights[0][var2][var3] = (-var8) * 8;
                    } else {
                        Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - (var8 * 8);
                    }
                    break;
                }
                if (var7 <= 49) {
                    Tiles.Tiles_overlays[var1][var2][var3] = var0.readByte();
                    Tiles.Tiles_shapes[var1][var2][var3] = ((byte) ((var7 - 2) / 4));
                    Tiles.field998[var1][var2][var3] = ((byte) (((var7 - 2) + var6) & 3));
                } else if (var7 <= 81) {
                    Tiles.Tiles_renderFlags[var1][var2][var3] = ((byte) (var7 - 49));
                } else {
                    Tiles.Tiles_underlays[var1][var2][var3] = ((byte) (var7 - 81));
                }
            } 
        } else {
            while (true) {
                var7 = var0.readUnsignedByte();
                if (var7 == 0) {
                    break;
                }
                if (var7 == 1) {
                    var0.readUnsignedByte();
                    break;
                }
                if (var7 <= 49) {
                    var0.readUnsignedByte();
                }
            } 
        }
    }

    @ObfuscatedName("gl")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "10")
    static final void method2494() {
        for (int var0 = 0; var0 < Client.npcCount; ++var0) {
            int var1 = Client.npcIndices[var0];
            NPC var2 = Client.npcs[var1];
            if (var2 != null) {
                class334.updateActorSequence(var2, var2.definition.size);
            }
        }
    }
}