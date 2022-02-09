import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("fd")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("SpotAnimationDefinition_archive")
    static AbstractArchive SpotAnimationDefinition_archive;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("SpotAnimationDefinition_modelArchive")
    static AbstractArchive SpotAnimationDefinition_modelArchive;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("SpotAnimationDefinition_cached")
    static EvictingDualNodeHashTable SpotAnimationDefinition_cached;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("SpotAnimationDefinition_cachedModels")
    static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = -1055975223)
    @Export("id")
    int id;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = -716952283)
    @Export("archive")
    int archive;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -491782013)
    @Export("sequence")
    public int sequence;

    @ObfuscatedName("w")
    @Export("recolorFrom")
    short[] recolorFrom;

    @ObfuscatedName("v")
    @Export("recolorTo")
    short[] recolorTo;

    @ObfuscatedName("a")
    @Export("retextureFrom")
    short[] retextureFrom;

    @ObfuscatedName("y")
    @Export("retextureTo")
    short[] retextureTo;

    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -1079548463)
    @Export("widthScale")
    int widthScale;

    @ObfuscatedName("h")
    @ObfuscatedGetter(intValue = 1702381343)
    @Export("heightScale")
    int heightScale;

    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = 1225275049)
    @Export("orientation")
    int orientation;

    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = 1815298771)
    @Export("ambient")
    int ambient;

    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = -407707061)
    @Export("contrast")
    int contrast;

    static {
        SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);
        SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30);
    }

    SpotAnimationDefinition() {
        this.sequence = -1;
        this.widthScale = 128;
        this.heightScale = 128;
        this.orientation = 0;
        this.ambient = 0;
        this.contrast = 0;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Lpi;B)V", garbageValue = "-24")
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
    @ObfuscatedSignature(descriptor = "(Lpi;II)V", garbageValue = "-627331869")
    @Export("decodeNext")
    void decodeNext(Buffer var1, int var2) {
        if (var2 == 1) {
            this.archive = var1.readUnsignedShort();
        } else if (var2 == 2) {
            this.sequence = var1.readUnsignedShort();
        } else if (var2 == 4) {
            this.widthScale = var1.readUnsignedShort();
        } else if (var2 == 5) {
            this.heightScale = var1.readUnsignedShort();
        } else if (var2 == 6) {
            this.orientation = var1.readUnsignedShort();
        } else if (var2 == 7) {
            this.ambient = var1.readUnsignedByte();
        } else if (var2 == 8) {
            this.contrast = var1.readUnsignedByte();
        } else {
            int var3;
            int var4;
            if (var2 == 40) {
                var3 = var1.readUnsignedByte();
                this.recolorFrom = new short[var3];
                this.recolorTo = new short[var3];
                for (var4 = 0; var4 < var3; ++var4) {
                    this.recolorFrom[var4] = ((short) (var1.readUnsignedShort()));
                    this.recolorTo[var4] = ((short) (var1.readUnsignedShort()));
                }
            } else if (var2 == 41) {
                var3 = var1.readUnsignedByte();
                this.retextureFrom = new short[var3];
                this.retextureTo = new short[var3];
                for (var4 = 0; var4 < var3; ++var4) {
                    this.retextureFrom[var4] = ((short) (var1.readUnsignedShort()));
                    this.retextureTo[var4] = ((short) (var1.readUnsignedShort()));
                }
            }
        }
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(IB)Lgf;", garbageValue = "-38")
    @Export("getModel")
    public final Model getModel(int var1) {
        Model var2 = ((Model) (SpotAnimationDefinition_cachedModels.get(((long) (this.id)))));
        if (var2 == null) {
            ModelData var3 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0);
            if (var3 == null) {
                return null;
            }
            int var4;
            if (this.recolorFrom != null) {
                for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
                    var3.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
                }
            }
            if (this.retextureFrom != null) {
                for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
                    var3.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
                }
            }
            var2 = var3.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
            SpotAnimationDefinition_cachedModels.put(var2, ((long) (this.id)));
        }
        Model var5;
        if ((this.sequence != (-1)) && (var1 != (-1))) {
            var5 = class78.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
        } else {
            var5 = var2.toSharedSpotAnimationModel(true);
        }
        if ((this.widthScale != 128) || (this.heightScale != 128)) {
            var5.scale(this.widthScale, this.heightScale, this.widthScale);
        }
        if (this.orientation != 0) {
            if (this.orientation == 90) {
                var5.rotateY90Ccw();
            }
            if (this.orientation == 180) {
                var5.rotateY90Ccw();
                var5.rotateY90Ccw();
            }
            if (this.orientation == 270) {
                var5.rotateY90Ccw();
                var5.rotateY90Ccw();
                var5.rotateY90Ccw();
            }
        }
        return var5;
    }
}