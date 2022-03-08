import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("gm")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
    @ObfuscatedName("c")
    static boolean field2105;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("SequenceDefinition_skeletonsArchive")
    static AbstractArchive SequenceDefinition_skeletonsArchive;

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("SequenceDefinition_cached")
    static EvictingDualNodeHashTable SequenceDefinition_cached;

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("SequenceDefinition_cachedFrames")
    static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("SequenceDefinition_cachedModel")
    static EvictingDualNodeHashTable SequenceDefinition_cachedModel;

    @ObfuscatedName("iu")
    @ObfuscatedSignature(descriptor = "[Lpt;")
    @Export("headIconHintSprites")
    static SpritePixels[] headIconHintSprites;

    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 36227189)
    @Export("SequenceDefinition_cachedModelId")
    int SequenceDefinition_cachedModelId;

    @ObfuscatedName("v")
    public Map field2092;

    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = -2142955465)
    int field2097;

    @ObfuscatedName("y")
    @ObfuscatedGetter(intValue = -2069874317)
    int field2094;

    @ObfuscatedName("u")
    @Export("frameIds")
    public int[] frameIds;

    @ObfuscatedName("h")
    @Export("chatFrameIds")
    int[] chatFrameIds;

    @ObfuscatedName("q")
    @Export("frameLengths")
    public int[] frameLengths;

    @ObfuscatedName("x")
    @Export("soundEffects")
    public int[] soundEffects;

    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = -1476085013)
    @Export("frameCount")
    public int frameCount;

    @ObfuscatedName("n")
    int[] field2100;

    @ObfuscatedName("m")
    boolean[] field2101;

    @ObfuscatedName("d")
    public boolean field2102;

    @ObfuscatedName("j")
    @ObfuscatedGetter(intValue = 414443535)
    public int field2095;

    @ObfuscatedName("f")
    @ObfuscatedGetter(intValue = -100893751)
    @Export("shield")
    public int shield;

    @ObfuscatedName("g")
    @ObfuscatedGetter(intValue = 922783975)
    @Export("weapon")
    public int weapon;

    @ObfuscatedName("t")
    @ObfuscatedGetter(intValue = 1203148505)
    public int field2108;

    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = -137394199)
    public int field2107;

    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = 687984557)
    public int field2099;

    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 1794410249)
    public int field2109;

    static {
        field2105 = false;
        SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
        SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
        SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
    }

    SequenceDefinition() {
        this.SequenceDefinition_cachedModelId = -1;
        this.field2097 = 0;
        this.field2094 = 0;
        this.frameCount = -1;
        this.field2102 = false;
        this.field2095 = 5;
        this.shield = -1;
        this.weapon = -1;
        this.field2108 = 99;
        this.field2107 = -1;
        this.field2099 = -1;
        this.field2109 = 2;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "1476762787")
    @Export("decode")
    void decode(Buffer var1) {
        while (true) {
            int var2 = var1.readUnsignedByte();
            if (var2 == 0) {
                return;
            }
            this.decodeNext(var1, var2);
        } 
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(Lpi;IB)V", garbageValue = "-63")
    @Export("decodeNext")
    void decodeNext(Buffer var1, int var2) {
        int var3;
        int var4;
        if (var2 == 1) {
            var3 = var1.readUnsignedShort();
            this.frameLengths = new int[var3];
            for (var4 = 0; var4 < var3; ++var4) {
                this.frameLengths[var4] = var1.readUnsignedShort();
            }
            this.frameIds = new int[var3];
            for (var4 = 0; var4 < var3; ++var4) {
                this.frameIds[var4] = var1.readUnsignedShort();
            }
            for (var4 = 0; var4 < var3; ++var4) {
                this.frameIds[var4] += var1.readUnsignedShort() << 16;
            }
        } else if (var2 == 2) {
            this.frameCount = var1.readUnsignedShort();
        } else if (var2 == 3) {
            var3 = var1.readUnsignedByte();
            this.field2100 = new int[var3 + 1];
            for (var4 = 0; var4 < var3; ++var4) {
                this.field2100[var4] = var1.readUnsignedByte();
            }
            this.field2100[var3] = 9999999;
        } else if (var2 == 4) {
            this.field2102 = true;
        } else if (var2 == 5) {
            this.field2095 = var1.readUnsignedByte();
        } else if (var2 == 6) {
            this.shield = var1.readUnsignedShort();
        } else if (var2 == 7) {
            this.weapon = var1.readUnsignedShort();
        } else if (var2 == 8) {
            this.field2108 = var1.readUnsignedByte();
        } else if (var2 == 9) {
            this.field2107 = var1.readUnsignedByte();
        } else if (var2 == 10) {
            this.field2099 = var1.readUnsignedByte();
        } else if (var2 == 11) {
            this.field2109 = var1.readUnsignedByte();
        } else if (var2 == 12) {
            var3 = var1.readUnsignedByte();
            this.chatFrameIds = new int[var3];
            for (var4 = 0; var4 < var3; ++var4) {
                this.chatFrameIds[var4] = var1.readUnsignedShort();
            }
            for (var4 = 0; var4 < var3; ++var4) {
                this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
            }
        } else if (var2 == 13) {
            var3 = var1.readUnsignedByte();
            this.soundEffects = new int[var3];
            for (var4 = 0; var4 < var3; ++var4) {
                this.soundEffects[var4] = var1.readMedium();
            }
        } else if (var2 == 14) {
            this.SequenceDefinition_cachedModelId = var1.readInt();
        } else if (var2 == 15) {
            var3 = var1.readUnsignedShort();
            this.field2092 = new HashMap();
            for (var4 = 0; var4 < var3; ++var4) {
                int var5 = var1.readUnsignedShort();
                int var6 = var1.readMedium();
                this.field2092.put(var5, var6);
            }
        } else if (var2 == 16) {
            this.field2097 = var1.readUnsignedShort();
            this.field2094 = var1.readUnsignedShort();
        } else if (var2 == 17) {
            this.field2101 = new boolean[256];
            for (var3 = 0; var3 < this.field2101.length; ++var3) {
                this.field2101[var3] = false;
            }
            var3 = var1.readUnsignedByte();
            for (var4 = 0; var4 < var3; ++var4) {
                this.field2101[var1.readUnsignedByte()] = true;
            }
        }
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-96390146")
    @Export("postDecode")
    void postDecode() {
        if (this.field2107 == (-1)) {
            if ((this.field2100 == null) && (this.field2101 == null)) {
                this.field2107 = 0;
            } else {
                this.field2107 = 2;
            }
        }
        if (this.field2099 == (-1)) {
            if ((this.field2100 == null) && (this.field2101 == null)) {
                this.field2099 = 0;
            } else {
                this.field2099 = 2;
            }
        }
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(Lgf;IB)Lgf;", garbageValue = "101")
    @Export("transformActorModel")
    public Model transformActorModel(Model var1, int var2) {
        Model var4;
        if (!this.isCachedModelIdSet()) {
            var2 = this.frameIds[var2];
            Frames var5 = MouseHandler.getFrames(var2 >> 16);
            var2 &= 65535;
            if (var5 == null) {
                return var1.toSharedSequenceModel(true);
            } else {
                var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
                var4.animate(var5, var2);
                return var4;
            }
        } else {
            class120 var3 = WorldMapSectionType.method4724(this.SequenceDefinition_cachedModelId);
            if (var3 == null) {
                return var1.toSharedSequenceModel(true);
            } else {
                var4 = var1.toSharedSequenceModel(!var3.method2697());
                var4.method4140(var3, var2);
                return var4;
            }
        }
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(Lgf;IIS)Lgf;", garbageValue = "256")
    @Export("transformObjectModel")
    Model transformObjectModel(Model var1, int var2, int var3) {
        Model var5;
        if (!this.isCachedModelIdSet()) {
            var2 = this.frameIds[var2];
            Frames var6 = MouseHandler.getFrames(var2 >> 16);
            var2 &= 65535;
            if (var6 == null) {
                return var1.toSharedSequenceModel(true);
            } else {
                var5 = var1.toSharedSequenceModel(!var6.hasAlphaTransform(var2));
                var3 &= 3;
                if (var3 == 1) {
                    var5.rotateY270Ccw();
                } else if (var3 == 2) {
                    var5.rotateY180();
                } else if (var3 == 3) {
                    var5.rotateY90Ccw();
                }
                var5.animate(var6, var2);
                if (var3 == 1) {
                    var5.rotateY90Ccw();
                } else if (var3 == 2) {
                    var5.rotateY180();
                } else if (var3 == 3) {
                    var5.rotateY270Ccw();
                }
                return var5;
            }
        } else {
            class120 var4 = WorldMapSectionType.method4724(this.SequenceDefinition_cachedModelId);
            if (var4 == null) {
                return var1.toSharedSequenceModel(true);
            } else {
                var5 = var1.toSharedSequenceModel(!var4.method2697());
                var3 &= 3;
                if (var3 == 1) {
                    var5.rotateY270Ccw();
                } else if (var3 == 2) {
                    var5.rotateY180();
                } else if (var3 == 3) {
                    var5.rotateY90Ccw();
                }
                var5.method4140(var4, var2);
                if (var3 == 1) {
                    var5.rotateY90Ccw();
                } else if (var3 == 2) {
                    var5.rotateY180();
                } else if (var3 == 3) {
                    var5.rotateY270Ccw();
                }
                return var5;
            }
        }
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(Lgf;II)Lgf;", garbageValue = "-1396727097")
    @Export("transformSpotAnimationModel")
    Model transformSpotAnimationModel(Model var1, int var2) {
        Model var4;
        if (!this.isCachedModelIdSet()) {
            var2 = this.frameIds[var2];
            Frames var5 = MouseHandler.getFrames(var2 >> 16);
            var2 &= 65535;
            if (var5 == null) {
                return var1.toSharedSpotAnimationModel(true);
            } else {
                var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2));
                var4.animate(var5, var2);
                return var4;
            }
        } else {
            class120 var3 = WorldMapSectionType.method4724(this.SequenceDefinition_cachedModelId);
            if (var3 == null) {
                return var1.toSharedSpotAnimationModel(true);
            } else {
                var4 = var1.toSharedSpotAnimationModel(!var3.method2697());
                var4.method4140(var3, var2);
                return var4;
            }
        }
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(Lgf;ILgm;IB)Lgf;", garbageValue = "46")
    @Export("applyTransformations")
    public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
        if ((field2105 && (!this.isCachedModelIdSet())) && (!var3.isCachedModelIdSet())) {
            return this.method3598(var1, var2, var3, var4);
        } else {
            Model var5 = var1.toSharedSequenceModel(false);
            boolean var6 = false;
            Frames var7 = null;
            class120 var8;
            if (this.isCachedModelIdSet()) {
                var8 = this.method3602();
                if (var3.isCachedModelIdSet() && (this.field2101 == null)) {
                    var5.method4140(var8, var2);
                    return var5;
                }
                var5.method4139(var8, var2, this.field2101, false);
            } else {
                var2 = this.frameIds[var2];
                var7 = MouseHandler.getFrames(var2 >> 16);
                var2 &= 65535;
                if (var7 == null) {
                    return var3.transformActorModel(var1, var4);
                }
                if ((!var3.isCachedModelIdSet()) && ((this.field2100 == null) || (var4 == (-1)))) {
                    var5.animate(var7, var2);
                    return var5;
                }
                if ((this.field2100 == null) || (var4 == (-1))) {
                    var5.animate(var7, var2);
                    return var5;
                }
                var6 = var3.isCachedModelIdSet();
                if (!var6) {
                    var5.method4145(var7, var2, this.field2100, false);
                }
            }
            if (var3.isCachedModelIdSet()) {
                var8 = var3.method3602();
                var5.method4139(var8, var4, this.field2101, true);
            } else {
                var4 = var3.frameIds[var4];
                Frames var9 = MouseHandler.getFrames(var4 >> 16);
                var4 &= 65535;
                if (var9 == null) {
                    return this.transformActorModel(var1, var2);
                }
                var5.method4145(var9, var4, this.field2100, true);
            }
            if (var6 && (var7 != null)) {
                var5.method4145(var7, var2, this.field2100, false);
            }
            var5.resetBounds();
            return var5;
        }
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(Lgf;ILgm;II)Lgf;", garbageValue = "1952184409")
    Model method3598(Model var1, int var2, SequenceDefinition var3, int var4) {
        var2 = this.frameIds[var2];
        Frames var5 = MouseHandler.getFrames(var2 >> 16);
        var2 &= 65535;
        if (var5 == null) {
            return var3.transformActorModel(var1, var4);
        } else {
            var4 = var3.frameIds[var4];
            Frames var6 = MouseHandler.getFrames(var4 >> 16);
            var4 &= 65535;
            Model var7;
            if (var6 == null) {
                var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
                var7.animate(var5, var2);
                return var7;
            } else {
                var7 = var1.toSharedSequenceModel((!var5.hasAlphaTransform(var2)) & (!var6.hasAlphaTransform(var4)));
                var7.animate2(var5, var2, var6, var4, this.field2100);
                return var7;
            }
        }
    }

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "(Lgf;IB)Lgf;", garbageValue = "-3")
    @Export("transformWidgetModel")
    public Model transformWidgetModel(Model var1, int var2) {
        if (!this.isCachedModelIdSet()) {
            int var3 = this.frameIds[var2];
            Frames var4 = MouseHandler.getFrames(var3 >> 16);
            var3 &= 65535;
            if (var4 == null) {
                return var1.toSharedSequenceModel(true);
            } else {
                Frames var5 = null;
                int var6 = 0;
                if ((this.chatFrameIds != null) && (var2 < this.chatFrameIds.length)) {
                    var6 = this.chatFrameIds[var2];
                    var5 = MouseHandler.getFrames(var6 >> 16);
                    var6 &= 65535;
                }
                Model var7;
                if ((var5 != null) && (var6 != 65535)) {
                    var7 = var1.toSharedSequenceModel((!var4.hasAlphaTransform(var3)) & (!var5.hasAlphaTransform(var6)));
                    var7.animate(var4, var3);
                    var7.animate(var5, var6);
                    return var7;
                } else {
                    var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3));
                    var7.animate(var4, var3);
                    return var7;
                }
            }
        } else {
            return this.transformActorModel(var1, var2);
        }
    }

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-2140209014")
    @Export("isCachedModelIdSet")
    public boolean isCachedModelIdSet() {
        return this.SequenceDefinition_cachedModelId >= 0;
    }

    @ObfuscatedName("h")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1530125215")
    public int method3637() {
        return this.field2094 - this.field2097;
    }

    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "(I)Ldw;", garbageValue = "-1955299057")
    public class120 method3602() {
        return this.isCachedModelIdSet() ? WorldMapSectionType.method4724(this.SequenceDefinition_cachedModelId) : null;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-78")
    static void method3623() {
        for (ObjectSound var0 = ((ObjectSound) (ObjectSound.objectSounds.last())); var0 != null; var0 = ((ObjectSound) (ObjectSound.objectSounds.previous()))) {
            if (var0.stream1 != null) {
                class123.pcmStreamMixer.removeSubStream(var0.stream1);
                var0.stream1 = null;
            }
            if (var0.stream2 != null) {
                class123.pcmStreamMixer.removeSubStream(var0.stream2);
                var0.stream2 = null;
            }
        }
        ObjectSound.objectSounds.clear();
    }
}