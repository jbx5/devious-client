import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("fy")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("HitSplatDefinition_archive")
    public static AbstractArchive HitSplatDefinition_archive;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("HitSplatDefinition_cached")
    static EvictingDualNodeHashTable HitSplatDefinition_cached;

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("HitSplatDefinition_cachedSprites")
    static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("HitSplatDefinition_cachedFonts")
    static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;

    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 94930249)
    @Export("fontId")
    int fontId;

    @ObfuscatedName("h")
    @ObfuscatedGetter(intValue = 686766047)
    @Export("textColor")
    public int textColor;

    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -2105047485)
    public int field1944;

    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = 1942953281)
    int field1953;

    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = -1147561849)
    int field1954;

    @ObfuscatedName("n")
    @ObfuscatedGetter(intValue = -1759102975)
    int field1955;

    @ObfuscatedName("m")
    @ObfuscatedGetter(intValue = -1125972115)
    int field1956;

    @ObfuscatedName("d")
    @ObfuscatedGetter(intValue = 1621904885)
    public int field1957;

    @ObfuscatedName("j")
    @ObfuscatedGetter(intValue = -2049678163)
    public int field1952;

    @ObfuscatedName("f")
    @ObfuscatedGetter(intValue = 1036282431)
    public int field1959;

    @ObfuscatedName("g")
    String field1960;

    @ObfuscatedName("t")
    @ObfuscatedGetter(intValue = -2045691497)
    public int field1961;

    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = 1085768131)
    public int field1958;

    @ObfuscatedName("b")
    @Export("transforms")
    public int[] transforms;

    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = -2018519527)
    @Export("transformVarbit")
    int transformVarbit;

    @ObfuscatedName("ap")
    @ObfuscatedGetter(intValue = 1546252907)
    @Export("transformVarp")
    int transformVarp;

    static {
        HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
        HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
        HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
    }

    HitSplatDefinition() {
        this.fontId = -1;
        this.textColor = 16777215;
        this.field1944 = 70;
        this.field1953 = -1;
        this.field1954 = -1;
        this.field1955 = -1;
        this.field1956 = -1;
        this.field1957 = 0;
        this.field1952 = 0;
        this.field1959 = -1;
        this.field1960 = "";
        this.field1961 = -1;
        this.field1958 = 0;
        this.transformVarbit = -1;
        this.transformVarp = -1;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Lpi;B)V", garbageValue = "101")
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

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Lpi;II)V", garbageValue = "-633903385")
    @Export("decodeNext")
    void decodeNext(Buffer var1, int var2) {
        if (var2 == 1) {
            this.fontId = var1.readNullableLargeSmart();
        } else if (var2 == 2) {
            this.textColor = var1.readMedium();
        } else if (var2 == 3) {
            this.field1953 = var1.readNullableLargeSmart();
        } else if (var2 == 4) {
            this.field1955 = var1.readNullableLargeSmart();
        } else if (var2 == 5) {
            this.field1954 = var1.readNullableLargeSmart();
        } else if (var2 == 6) {
            this.field1956 = var1.readNullableLargeSmart();
        } else if (var2 == 7) {
            this.field1957 = var1.readShort();
        } else if (var2 == 8) {
            this.field1960 = var1.readStringCp1252NullCircumfixed();
        } else if (var2 == 9) {
            this.field1944 = var1.readUnsignedShort();
        } else if (var2 == 10) {
            this.field1952 = var1.readShort();
        } else if (var2 == 11) {
            this.field1959 = 0;
        } else if (var2 == 12) {
            this.field1961 = var1.readUnsignedByte();
        } else if (var2 == 13) {
            this.field1958 = var1.readShort();
        } else if (var2 == 14) {
            this.field1959 = var1.readUnsignedShort();
        } else if ((var2 == 17) || (var2 == 18)) {
            this.transformVarbit = var1.readUnsignedShort();
            if (this.transformVarbit == 65535) {
                this.transformVarbit = -1;
            }
            this.transformVarp = var1.readUnsignedShort();
            if (this.transformVarp == 65535) {
                this.transformVarp = -1;
            }
            int var3 = -1;
            if (var2 == 18) {
                var3 = var1.readUnsignedShort();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = var1.readUnsignedByte();
            this.transforms = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; ++var5) {
                this.transforms[var5] = var1.readUnsignedShort();
                if (this.transforms[var5] == 65535) {
                    this.transforms[var5] = -1;
                }
            }
            this.transforms[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(I)Lfy;", garbageValue = "1373539159")
    @Export("transform")
    public final HitSplatDefinition transform() {
        int var1 = -1;
        if (this.transformVarbit != (-1)) {
            var1 = class375.getVarbit(this.transformVarbit);
        } else if (this.transformVarp != (-1)) {
            var1 = Varps.Varps_main[this.transformVarp];
        }
        int var2;
        if ((var1 >= 0) && (var1 < (this.transforms.length - 1))) {
            var2 = this.transforms[var1];
        } else {
            var2 = this.transforms[this.transforms.length - 1];
        }
        return var2 != (-1) ? class293.method5480(var2) : null;
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;", garbageValue = "2056247959")
    @Export("getString")
    public String getString(int var1) {
        String var2 = this.field1960;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = (var2.substring(0, var3) + class121.intToString(var1, false)) + var2.substring(var3 + 2);
        } 
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(I)Lpt;", garbageValue = "1497260899")
    public SpritePixels method3450() {
        if (this.field1953 < 0) {
            return null;
        } else {
            SpritePixels var1 = ((SpritePixels) (HitSplatDefinition_cachedSprites.get(((long) (this.field1953)))));
            if (var1 != null) {
                return var1;
            } else {
                var1 = class126.SpriteBuffer_getSprite(Frames.field2379, this.field1953, 0);
                if (var1 != null) {
                    HitSplatDefinition_cachedSprites.put(var1, ((long) (this.field1953)));
                }
                return var1;
            }
        }
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(I)Lpt;", garbageValue = "636789367")
    public SpritePixels method3411() {
        if (this.field1954 < 0) {
            return null;
        } else {
            SpritePixels var1 = ((SpritePixels) (HitSplatDefinition_cachedSprites.get(((long) (this.field1954)))));
            if (var1 != null) {
                return var1;
            } else {
                var1 = class126.SpriteBuffer_getSprite(Frames.field2379, this.field1954, 0);
                if (var1 != null) {
                    HitSplatDefinition_cachedSprites.put(var1, ((long) (this.field1954)));
                }
                return var1;
            }
        }
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(I)Lpt;", garbageValue = "-140418588")
    public SpritePixels method3418() {
        if (this.field1955 < 0) {
            return null;
        } else {
            SpritePixels var1 = ((SpritePixels) (HitSplatDefinition_cachedSprites.get(((long) (this.field1955)))));
            if (var1 != null) {
                return var1;
            } else {
                var1 = class126.SpriteBuffer_getSprite(Frames.field2379, this.field1955, 0);
                if (var1 != null) {
                    HitSplatDefinition_cachedSprites.put(var1, ((long) (this.field1955)));
                }
                return var1;
            }
        }
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(B)Lpt;", garbageValue = "0")
    public SpritePixels method3419() {
        if (this.field1956 < 0) {
            return null;
        } else {
            SpritePixels var1 = ((SpritePixels) (HitSplatDefinition_cachedSprites.get(((long) (this.field1956)))));
            if (var1 != null) {
                return var1;
            } else {
                var1 = class126.SpriteBuffer_getSprite(Frames.field2379, this.field1956, 0);
                if (var1 != null) {
                    HitSplatDefinition_cachedSprites.put(var1, ((long) (this.field1956)));
                }
                return var1;
            }
        }
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(B)Llv;", garbageValue = "-26")
    @Export("getFont")
    public Font getFont() {
        if (this.fontId == (-1)) {
            return null;
        } else {
            Font var1 = ((Font) (HitSplatDefinition_cachedFonts.get(((long) (this.fontId)))));
            if (var1 != null) {
                return var1;
            } else {
                AbstractArchive var3 = Frames.field2379;
                AbstractArchive var4 = class413.HitSplatDefinition_fontsArchive;
                int var5 = this.fontId;
                Font var2;
                if (!class125.method2744(var3, var5, 0)) {
                    var2 = null;
                } else {
                    var2 = Clock.method3125(var4.takeFile(var5, 0));
                }
                if (var2 != null) {
                    HitSplatDefinition_cachedFonts.put(var2, ((long) (this.fontId)));
                }
                return var2;
            }
        }
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(IIILfg;IB)V", garbageValue = "0")
    static void method3456(int var0, int var1, int var2, ObjectComposition var3, int var4) {
        ObjectSound var5 = new ObjectSound();
        var5.plane = var0;
        var5.x = var1 * 128;
        var5.y = var2 * 128;
        int var6 = var3.sizeX;
        int var7 = var3.sizeY;
        if ((var4 == 1) || (var4 == 3)) {
            var6 = var3.sizeY;
            var7 = var3.sizeX;
        }
        var5.maxX = (var6 + var1) * 128;
        var5.maxY = (var7 + var2) * 128;
        var5.soundEffectId = var3.ambientSoundId;
        var5.field822 = var3.int7 * 128;
        var5.field820 = var3.int5;
        var5.field830 = var3.int6;
        var5.soundEffectIds = var3.soundEffectIds;
        if (var3.transforms != null) {
            var5.obj = var3;
            var5.set();
        }
        ObjectSound.objectSounds.addFirst(var5);
        if (var5.soundEffectIds != null) {
            var5.field826 = var5.field820 + ((int) (Math.random() * ((double) (var5.field830 - var5.field820))));
        }
    }

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-2128803730")
    public static int method3455(int var0) {
        if (var0 > 0) {
            return 1;
        } else {
            return var0 < 0 ? -1 : 0;
        }
    }

    @ObfuscatedName("ho")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1464715593")
    static void method3454() {
        Client.menuOptionsCount = 0;
        Client.isMenuOpen = false;
    }
}