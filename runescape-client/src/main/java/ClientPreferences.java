import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("cl")
@Implements("ClientPreferences")
public class ClientPreferences {
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = 389167517)
    @Export("ClientPreferences_optionCount")
    static int ClientPreferences_optionCount;

    @ObfuscatedName("s")
    @Export("roofsHidden")
    boolean roofsHidden;

    @ObfuscatedName("e")
    @Export("titleMusicDisabled")
    boolean titleMusicDisabled;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = 687015131)
    @Export("windowMode")
    int windowMode;

    @ObfuscatedName("o")
    @Export("rememberedUsername")
    String rememberedUsername;

    @ObfuscatedName("i")
    @Export("hideUsername")
    boolean hideUsername;

    @ObfuscatedName("w")
    @Export("brightness")
    double brightness;

    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = 497474901)
    @Export("musicVolume")
    int musicVolume;

    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = 292884651)
    @Export("soundEffectsVolume")
    int soundEffectsVolume;

    @ObfuscatedName("y")
    @ObfuscatedGetter(intValue = -2024623247)
    @Export("areaSoundEffectsVolume")
    int areaSoundEffectsVolume;

    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 591433569)
    int field1231;

    @ObfuscatedName("h")
    @Export("parameters")
    LinkedHashMap parameters;

    static {
        ClientPreferences_optionCount = 8;
    }

    ClientPreferences() {
        this.windowMode = 1;
        this.rememberedUsername = null;
        this.hideUsername = false;
        this.brightness = 0.8;
        this.musicVolume = 127;
        this.soundEffectsVolume = 127;
        this.areaSoundEffectsVolume = 127;
        this.field1231 = -1;
        this.parameters = new LinkedHashMap();
        this.method2226(true);
    }

    @ObfuscatedSignature(descriptor = "(Lpi;)V")
    ClientPreferences(Buffer var1) {
        this.windowMode = 1;
        this.rememberedUsername = null;
        this.hideUsername = false;
        this.brightness = 0.8;
        this.musicVolume = 127;
        this.soundEffectsVolume = 127;
        this.areaSoundEffectsVolume = 127;
        this.field1231 = -1;
        this.parameters = new LinkedHashMap();
        if ((var1 != null) && (var1.array != null)) {
            int var2 = var1.readUnsignedByte();
            if ((var2 >= 0) && (var2 <= ClientPreferences_optionCount)) {
                if (var1.readUnsignedByte() == 1) {
                    this.roofsHidden = true;
                }
                if (var2 > 1) {
                    this.titleMusicDisabled = var1.readUnsignedByte() == 1;
                }
                if (var2 > 3) {
                    this.windowMode = var1.readUnsignedByte();
                }
                if (var2 > 2) {
                    int var3 = var1.readUnsignedByte();
                    for (int var4 = 0; var4 < var3; ++var4) {
                        int var5 = var1.readInt();
                        int var6 = var1.readInt();
                        this.parameters.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull();
                }
                if (var2 > 5) {
                    this.hideUsername = var1.readBoolean();
                }
                if (var2 > 6) {
                    this.brightness = ((double) (var1.readUnsignedByte())) / 100.0;
                    this.musicVolume = var1.readUnsignedByte();
                    this.soundEffectsVolume = var1.readUnsignedByte();
                    this.areaSoundEffectsVolume = var1.readUnsignedByte();
                }
                if (var2 > 7) {
                    this.field1231 = var1.readUnsignedByte();
                }
            } else {
                this.method2226(true);
            }
        } else {
            this.method2226(true);
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "65280")
    void method2226(boolean var1) {
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(I)Lpi;", garbageValue = "-118732597")
    @Export("toBuffer")
    Buffer toBuffer() {
        Buffer var1 = new Buffer(100);
        var1.writeByte(ClientPreferences_optionCount);
        var1.writeByte(this.roofsHidden ? 1 : 0);
        var1.writeByte(this.titleMusicDisabled ? 1 : 0);
        var1.writeByte(this.windowMode);
        var1.writeByte(this.parameters.size());
        Iterator var2 = this.parameters.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = ((Entry) (var2.next()));
            var1.writeInt(((Integer) (var3.getKey())));
            var1.writeInt(((Integer) (var3.getValue())));
        } 
        var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : "");
        var1.writeBoolean(this.hideUsername);
        var1.writeByte(((int) (100.0 * this.brightness)));
        var1.writeByte(this.musicVolume);
        var1.writeByte(this.soundEffectsVolume);
        var1.writeByte(this.areaSoundEffectsVolume);
        var1.writeByte(this.field1231);
        return var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "82")
    static void method2236() {
        WorldMapRegion.WorldMapRegion_cachedSprites.clear();
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(IIII)I", garbageValue = "-1797277779")
    public static int method2237(int var0, int var1, int var2) {
        int var3 = class125.method2741((var2 - var1) + 1);
        var3 <<= var1;
        var0 |= var3;
        return var0;
    }

    @ObfuscatedName("ab")
    @ObfuscatedSignature(descriptor = "([BIII)I", garbageValue = "-2125194524")
    public static int method2230(byte[] var0, int var1, int var2) {
        int var3 = -1;
        for (int var4 = var1; var4 < var2; ++var4) {
            var3 = (var3 >>> 8) ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255];
        }
        var3 = ~var3;
        return var3;
    }
}