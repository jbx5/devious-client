import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("jb")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Loj;")
    @Export("musicPatches")
    NodeHashTable musicPatches;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 552526635)
    int field3127;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -75989283)
    int field3113;

    @ObfuscatedName("e")
    int[] field3114;

    @ObfuscatedName("r")
    int[] field3115;

    @ObfuscatedName("o")
    int[] field3116;

    @ObfuscatedName("i")
    int[] field3117;

    @ObfuscatedName("v")
    int[] field3118;

    @ObfuscatedName("a")
    int[] field3119;

    @ObfuscatedName("y")
    int[] field3134;

    @ObfuscatedName("u")
    int[] field3121;

    @ObfuscatedName("h")
    int[] field3137;

    @ObfuscatedName("j")
    int[] field3124;

    @ObfuscatedName("f")
    int[] field3125;

    @ObfuscatedName("g")
    int[] field3122;

    @ObfuscatedName("t")
    int[] field3126;

    @ObfuscatedName("k")
    int[] field3132;

    @ObfuscatedName("b")
    int[] field3129;

    @ObfuscatedName("z")
    @ObfuscatedSignature(descriptor = "[[Ljm;")
    MusicPatchNode[][] field3130;

    @ObfuscatedName("ap")
    @ObfuscatedSignature(descriptor = "[[Ljm;")
    MusicPatchNode[][] field3131;

    @ObfuscatedName("af")
    @ObfuscatedSignature(descriptor = "Ljl;")
    @Export("midiFile")
    MidiFileReader midiFile;

    @ObfuscatedName("ak")
    boolean field3136;

    @ObfuscatedName("av")
    @ObfuscatedGetter(intValue = 1531479747)
    @Export("track")
    int track;

    @ObfuscatedName("ar")
    @ObfuscatedGetter(intValue = -1393888569)
    @Export("trackLength")
    int trackLength;

    @ObfuscatedName("al")
    @ObfuscatedGetter(longValue = 828631867034328585L)
    long field3112;

    @ObfuscatedName("aa")
    @ObfuscatedGetter(longValue = -3571997110879224945L)
    long field3133;

    @ObfuscatedName("ao")
    @ObfuscatedSignature(descriptor = "Ljn;")
    @Export("patchStream")
    MusicPatchPcmStream patchStream;

    public MidiPcmStream() {
        this.field3127 = 256;
        this.field3113 = 1000000;
        this.field3114 = new int[16];
        this.field3115 = new int[16];
        this.field3116 = new int[16];
        this.field3117 = new int[16];
        this.field3118 = new int[16];
        this.field3119 = new int[16];
        this.field3134 = new int[16];
        this.field3121 = new int[16];
        this.field3137 = new int[16];
        this.field3124 = new int[16];
        this.field3125 = new int[16];
        this.field3122 = new int[16];
        this.field3126 = new int[16];
        this.field3132 = new int[16];
        this.field3129 = new int[16];
        this.field3130 = new MusicPatchNode[16][128];
        this.field3131 = new MusicPatchNode[16][128];
        this.midiFile = new MidiFileReader();
        this.patchStream = new MusicPatchPcmStream(this);
        this.musicPatches = new NodeHashTable(128);
        this.method5073();
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-868657001")
    @Export("setPcmStreamVolume")
    public synchronized void setPcmStreamVolume(int var1) {
        this.field3127 = var1;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "39")
    int method5096() {
        return this.field3127;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Ljp;Lkq;Lau;II)Z", garbageValue = "-655263365")
    @Export("loadMusicTrack")
    public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
        var1.method5267();
        boolean var5 = true;
        int[] var6 = null;
        if (var4 > 0) {
            var6 = new int[]{ var4 };
        }
        for (ByteArrayNode var7 = ((ByteArrayNode) (var1.table.first())); var7 != null; var7 = ((ByteArrayNode) (var1.table.next()))) {
            int var8 = ((int) (var7.key));
            MusicPatch var9 = ((MusicPatch) (this.musicPatches.get(((long) (var8)))));
            if (var9 == null) {
                var9 = class21.method302(var2, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.musicPatches.put(var9, ((long) (var8)));
            }
            if (!var9.method5223(var3, var7.byteArray, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            var1.clear();
        }
        return var5;
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "62133201")
    @Export("clearAll")
    public synchronized void clearAll() {
        for (MusicPatch var1 = ((MusicPatch) (this.musicPatches.first())); var1 != null; var1 = ((MusicPatch) (this.musicPatches.next()))) {
            var1.clear();
        }
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "39401660")
    @Export("removeAll")
    synchronized void removeAll() {
        for (MusicPatch var1 = ((MusicPatch) (this.musicPatches.first())); var1 != null; var1 = ((MusicPatch) (this.musicPatches.next()))) {
            var1.remove();
        }
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "()Lan;")
    @Export("firstSubStream")
    protected synchronized PcmStream firstSubStream() {
        return this.patchStream;
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "()Lan;")
    @Export("nextSubStream")
    protected synchronized PcmStream nextSubStream() {
        return null;
    }

    @ObfuscatedName("w")
    protected synchronized int vmethod5241() {
        return 0;
    }

    @ObfuscatedName("v")
    @Export("fill")
    protected synchronized void fill(int[] var1, int var2, int var3) {
        if (this.midiFile.isReady()) {
            int var4 = (this.midiFile.division * this.field3113) / PcmPlayer.field305;
            do {
                long var5 = (((long) (var4)) * ((long) (var3))) + this.field3112;
                if ((this.field3133 - var5) >= 0L) {
                    this.field3112 = var5;
                    break;
                }
                int var7 = ((int) ((((this.field3133 - this.field3112) + ((long) (var4))) - 1L) / ((long) (var4))));
                this.field3112 += ((long) (var4)) * ((long) (var7));
                this.patchStream.fill(var1, var2, var7);
                var2 += var7;
                var3 -= var7;
                this.method5066();
            } while (this.midiFile.isReady() );
        }
        this.patchStream.fill(var1, var2, var3);
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(Ljp;ZB)V", garbageValue = "0")
    @Export("setMusicTrack")
    public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
        this.clear();
        this.midiFile.parse(var1.midi);
        this.field3136 = var2;
        this.field3112 = 0L;
        int var3 = this.midiFile.trackCount();
        for (int var4 = 0; var4 < var3; ++var4) {
            this.midiFile.gotoTrack(var4);
            this.midiFile.readTrackLength(var4);
            this.midiFile.markTrackPosition(var4);
        }
        this.track = this.midiFile.getPrioritizedTrack();
        this.trackLength = this.midiFile.trackLengths[this.track];
        this.field3133 = this.midiFile.method5188(this.trackLength);
    }

    @ObfuscatedName("y")
    @Export("skip")
    protected synchronized void skip(int var1) {
        if (this.midiFile.isReady()) {
            int var2 = (this.midiFile.division * this.field3113) / PcmPlayer.field305;
            do {
                long var3 = (((long) (var1)) * ((long) (var2))) + this.field3112;
                if ((this.field3133 - var3) >= 0L) {
                    this.field3112 = var3;
                    break;
                }
                int var5 = ((int) ((((this.field3133 - this.field3112) + ((long) (var2))) - 1L) / ((long) (var2))));
                this.field3112 += ((long) (var2)) * ((long) (var5));
                this.patchStream.skip(var5);
                var1 -= var5;
                this.method5066();
            } while (this.midiFile.isReady() );
        }
        this.patchStream.skip(var1);
    }

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "937177462")
    @Export("clear")
    public synchronized void clear() {
        this.midiFile.clear();
        this.method5073();
    }

    @ObfuscatedName("h")
    @ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "22")
    @Export("isReady")
    public synchronized boolean isReady() {
        return this.midiFile.isReady();
    }

    @ObfuscatedName("q")
    @ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-1764945806")
    public synchronized void method5043(int var1, int var2) {
        this.method5042(var1, var2);
    }

    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "-4")
    void method5042(int var1, int var2) {
        this.field3117[var1] = var2;
        this.field3119[var1] = var2 & (-128);
        this.method5113(var1, var2);
    }

    @ObfuscatedName("p")
    @ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-1617270070")
    void method5113(int var1, int var2) {
        if (var2 != this.field3118[var1]) {
            this.field3118[var1] = var2;
            for (int var3 = 0; var3 < 128; ++var3) {
                this.field3131[var1][var3] = null;
            }
        }
    }

    @ObfuscatedName("n")
    @ObfuscatedSignature(descriptor = "(IIII)V", garbageValue = "-1493113473")
    void method5095(int var1, int var2, int var3) {
        this.method5046(var1, var2, 64);
        if ((this.field3124[var1] & 2) != 0) {
            for (MusicPatchNode var4 = ((MusicPatchNode) (this.patchStream.queue.first())); var4 != null; var4 = ((MusicPatchNode) (this.patchStream.queue.next()))) {
                if ((var4.field3181 == var1) && (var4.field3186 < 0)) {
                    this.field3130[var1][var4.field3189] = null;
                    this.field3130[var1][var2] = var4;
                    int var8 = ((var4.field3187 * var4.field3177) >> 12) + var4.field3179;
                    var4.field3179 += (var2 - var4.field3189) << 8;
                    var4.field3177 = var8 - var4.field3179;
                    var4.field3187 = 4096;
                    var4.field3189 = var2;
                    return;
                }
            }
        }
        MusicPatch var9 = ((MusicPatch) (this.musicPatches.get(((long) (this.field3118[var1])))));
        if (var9 != null) {
            RawSound var5 = var9.rawSounds[var2];
            if (var5 != null) {
                MusicPatchNode var6 = new MusicPatchNode();
                var6.field3181 = var1;
                var6.patch = var9;
                var6.rawSound = var5;
                var6.field3174 = var9.field3155[var2];
                var6.field3171 = var9.field3159[var2];
                var6.field3189 = var2;
                var6.field3180 = ((((var3 * var3) * var9.field3156[var2]) * var9.field3160) + 1024) >> 11;
                var6.field3178 = var9.field3161[var2] & 255;
                var6.field3179 = (var2 << 8) - (var9.field3157[var2] & 32767);
                var6.field3182 = 0;
                var6.field3183 = 0;
                var6.field3176 = 0;
                var6.field3186 = -1;
                var6.field3175 = 0;
                if (this.field3126[var1] == 0) {
                    var6.stream = RawPcmStream.method873(var5, this.method5058(var6), this.method5152(var6), this.method5060(var6));
                } else {
                    var6.stream = RawPcmStream.method873(var5, this.method5058(var6), 0, this.method5060(var6));
                    this.method5164(var6, var9.field3157[var2] < 0);
                }
                if (var9.field3157[var2] < 0) {
                    var6.stream.setNumLoops(-1);
                }
                if (var6.field3171 >= 0) {
                    MusicPatchNode var7 = this.field3131[var1][var6.field3171];
                    if ((var7 != null) && (var7.field3186 < 0)) {
                        this.field3130[var1][var7.field3189] = null;
                        var7.field3186 = 0;
                    }
                    this.field3131[var1][var6.field3171] = var6;
                }
                this.patchStream.queue.addFirst(var6);
                this.field3130[var1][var2] = var6;
            }
        }
    }

    @ObfuscatedName("m")
    @ObfuscatedSignature(descriptor = "(Ljm;ZB)V", garbageValue = "63")
    void method5164(MusicPatchNode var1, boolean var2) {
        int var3 = var1.rawSound.samples.length;
        int var4;
        if (var2 && var1.rawSound.field270) {
            int var5 = (var3 + var3) - var1.rawSound.start;
            var4 = ((int) ((((long) (var5)) * ((long) (this.field3126[var1.field3181]))) >> 6));
            var3 <<= 8;
            if (var4 >= var3) {
                var4 = ((var3 + var3) - 1) - var4;
                var1.stream.method936();
            }
        } else {
            var4 = ((int) ((((long) (this.field3126[var1.field3181])) * ((long) (var3))) >> 6));
        }
        var1.stream.method818(var4);
    }

    @ObfuscatedName("d")
    @ObfuscatedSignature(descriptor = "(IIIB)V", garbageValue = "-13")
    void method5046(int var1, int var2, int var3) {
        MusicPatchNode var4 = this.field3130[var1][var2];
        if (var4 != null) {
            this.field3130[var1][var2] = null;
            if ((this.field3124[var1] & 2) != 0) {
                for (MusicPatchNode var5 = ((MusicPatchNode) (this.patchStream.queue.last())); var5 != null; var5 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
                    if (((var5.field3181 == var4.field3181) && (var5.field3186 < 0)) && (var5 != var4)) {
                        var4.field3186 = 0;
                        break;
                    }
                }
            } else {
                var4.field3186 = 0;
            }
        }
    }

    @ObfuscatedName("j")
    @ObfuscatedSignature(descriptor = "(IIIB)V", garbageValue = "-57")
    void method5047(int var1, int var2, int var3) {
    }

    @ObfuscatedName("f")
    @ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-651144515")
    void method5048(int var1, int var2) {
    }

    @ObfuscatedName("g")
    @ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "98")
    void method5049(int var1, int var2) {
        this.field3134[var1] = var2;
    }

    @ObfuscatedName("ao")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "750290801")
    void method5050(int var1) {
        for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
            if ((var1 < 0) || (var2.field3181 == var1)) {
                if (var2.stream != null) {
                    var2.stream.method822(PcmPlayer.field305 / 100);
                    if (var2.stream.method827()) {
                        this.patchStream.mixer.addSubStream(var2.stream);
                    }
                    var2.method5275();
                }
                if (var2.field3186 < 0) {
                    this.field3130[var2.field3181][var2.field3189] = null;
                }
                var2.remove();
            }
        }
    }

    @ObfuscatedName("aq")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1528042402")
    void method5051(int var1) {
        if (var1 >= 0) {
            this.field3114[var1] = 12800;
            this.field3115[var1] = 8192;
            this.field3116[var1] = 16383;
            this.field3134[var1] = 8192;
            this.field3121[var1] = 0;
            this.field3137[var1] = 8192;
            this.method5062(var1);
            this.method5055(var1);
            this.field3124[var1] = 0;
            this.field3125[var1] = 32767;
            this.field3122[var1] = 256;
            this.field3126[var1] = 0;
            this.method5045(var1, 8192);
        } else {
            for (var1 = 0; var1 < 16; ++var1) {
                this.method5051(var1);
            }
        }
    }

    @ObfuscatedName("ay")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-23275431")
    void method5063(int var1) {
        for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
            if (((var1 < 0) || (var2.field3181 == var1)) && (var2.field3186 < 0)) {
                this.field3130[var2.field3181][var2.field3189] = null;
                var2.field3186 = 0;
            }
        }
    }

    @ObfuscatedName("ag")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "5")
    void method5073() {
        this.method5050(-1);
        this.method5051(-1);
        int var1;
        for (var1 = 0; var1 < 16; ++var1) {
            this.field3118[var1] = this.field3117[var1];
        }
        for (var1 = 0; var1 < 16; ++var1) {
            this.field3119[var1] = this.field3117[var1] & (-128);
        }
    }

    @ObfuscatedName("ad")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-324027323")
    void method5062(int var1) {
        if ((this.field3124[var1] & 2) != 0) {
            for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
                if (((var2.field3181 == var1) && (this.field3130[var1][var2.field3189] == null)) && (var2.field3186 < 0)) {
                    var2.field3186 = 0;
                }
            }
        }
    }

    @ObfuscatedName("au")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1583663824")
    void method5055(int var1) {
        if ((this.field3124[var1] & 4) != 0) {
            for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
                if (var2.field3181 == var1) {
                    var2.field3191 = 0;
                }
            }
        }
    }

    @ObfuscatedName("at")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-2106838445")
    void method5056(int var1) {
        int var2 = var1 & 240;
        int var3;
        int var4;
        int var5;
        if (var2 == 128) {
            var3 = var1 & 15;
            var4 = (var1 >> 8) & 127;
            var5 = (var1 >> 16) & 127;
            this.method5046(var3, var4, var5);
        } else if (var2 == 144) {
            var3 = var1 & 15;
            var4 = (var1 >> 8) & 127;
            var5 = (var1 >> 16) & 127;
            if (var5 > 0) {
                this.method5095(var3, var4, var5);
            } else {
                this.method5046(var3, var4, 64);
            }
        } else if (var2 == 160) {
            var3 = var1 & 15;
            var4 = (var1 >> 8) & 127;
            var5 = (var1 >> 16) & 127;
            this.method5047(var3, var4, var5);
        } else if (var2 == 176) {
            var3 = var1 & 15;
            var4 = (var1 >> 8) & 127;
            var5 = (var1 >> 16) & 127;
            if (var4 == 0) {
                this.field3119[var3] = (var5 << 14) + (this.field3119[var3] & (-2080769));
            }
            if (var4 == 32) {
                this.field3119[var3] = (var5 << 7) + (this.field3119[var3] & (-16257));
            }
            if (var4 == 1) {
                this.field3121[var3] = (var5 << 7) + (this.field3121[var3] & (-16257));
            }
            if (var4 == 33) {
                this.field3121[var3] = var5 + (this.field3121[var3] & (-128));
            }
            if (var4 == 5) {
                this.field3137[var3] = (var5 << 7) + (this.field3137[var3] & (-16257));
            }
            if (var4 == 37) {
                this.field3137[var3] = var5 + (this.field3137[var3] & (-128));
            }
            if (var4 == 7) {
                this.field3114[var3] = (var5 << 7) + (this.field3114[var3] & (-16257));
            }
            if (var4 == 39) {
                this.field3114[var3] = var5 + (this.field3114[var3] & (-128));
            }
            if (var4 == 10) {
                this.field3115[var3] = (var5 << 7) + (this.field3115[var3] & (-16257));
            }
            if (var4 == 42) {
                this.field3115[var3] = var5 + (this.field3115[var3] & (-128));
            }
            if (var4 == 11) {
                this.field3116[var3] = (var5 << 7) + (this.field3116[var3] & (-16257));
            }
            if (var4 == 43) {
                this.field3116[var3] = var5 + (this.field3116[var3] & (-128));
            }
            int[] var10000;
            if (var4 == 64) {
                if (var5 >= 64) {
                    var10000 = this.field3124;
                    var10000[var3] |= 1;
                } else {
                    var10000 = this.field3124;
                    var10000[var3] &= -2;
                }
            }
            if (var4 == 65) {
                if (var5 >= 64) {
                    var10000 = this.field3124;
                    var10000[var3] |= 2;
                } else {
                    this.method5062(var3);
                    var10000 = this.field3124;
                    var10000[var3] &= -3;
                }
            }
            if (var4 == 99) {
                this.field3125[var3] = (var5 << 7) + (this.field3125[var3] & 127);
            }
            if (var4 == 98) {
                this.field3125[var3] = (this.field3125[var3] & 16256) + var5;
            }
            if (var4 == 101) {
                this.field3125[var3] = ((var5 << 7) + (this.field3125[var3] & 127)) + 16384;
            }
            if (var4 == 100) {
                this.field3125[var3] = ((this.field3125[var3] & 16256) + var5) + 16384;
            }
            if (var4 == 120) {
                this.method5050(var3);
            }
            if (var4 == 121) {
                this.method5051(var3);
            }
            if (var4 == 123) {
                this.method5063(var3);
            }
            int var6;
            if (var4 == 6) {
                var6 = this.field3125[var3];
                if (var6 == 16384) {
                    this.field3122[var3] = (var5 << 7) + (this.field3122[var3] & (-16257));
                }
            }
            if (var4 == 38) {
                var6 = this.field3125[var3];
                if (var6 == 16384) {
                    this.field3122[var3] = var5 + (this.field3122[var3] & (-128));
                }
            }
            if (var4 == 16) {
                this.field3126[var3] = (var5 << 7) + (this.field3126[var3] & (-16257));
            }
            if (var4 == 48) {
                this.field3126[var3] = var5 + (this.field3126[var3] & (-128));
            }
            if (var4 == 81) {
                if (var5 >= 64) {
                    var10000 = this.field3124;
                    var10000[var3] |= 4;
                } else {
                    this.method5055(var3);
                    var10000 = this.field3124;
                    var10000[var3] &= -5;
                }
            }
            if (var4 == 17) {
                this.method5045(var3, (var5 << 7) + (this.field3132[var3] & (-16257)));
            }
            if (var4 == 49) {
                this.method5045(var3, var5 + (this.field3132[var3] & (-128)));
            }
        } else if (var2 == 192) {
            var3 = var1 & 15;
            var4 = (var1 >> 8) & 127;
            this.method5113(var3, var4 + this.field3119[var3]);
        } else if (var2 == 208) {
            var3 = var1 & 15;
            var4 = (var1 >> 8) & 127;
            this.method5048(var3, var4);
        } else if (var2 == 224) {
            var3 = var1 & 15;
            var4 = ((var1 >> 8) & 127) + ((var1 >> 9) & 16256);
            this.method5049(var3, var4);
        } else {
            var2 = var1 & 255;
            if (var2 == 255) {
                this.method5073();
            }
        }
    }

    @ObfuscatedName("ae")
    @ObfuscatedSignature(descriptor = "(III)V", garbageValue = "557460831")
    void method5045(int var1, int var2) {
        this.field3132[var1] = var2;
        this.field3129[var1] = ((int) ((2097152.0 * Math.pow(2.0, 5.4931640625E-4 * ((double) (var2)))) + 0.5));
    }

    @ObfuscatedName("an")
    @ObfuscatedSignature(descriptor = "(Ljm;B)I", garbageValue = "41")
    int method5058(MusicPatchNode var1) {
        int var2 = ((var1.field3187 * var1.field3177) >> 12) + var1.field3179;
        var2 += ((this.field3134[var1.field3181] - 8192) * this.field3122[var1.field3181]) >> 12;
        MusicPatchNode2 var3 = var1.field3174;
        int var4;
        if ((var3.field3100 > 0) && ((var3.field3102 > 0) || (this.field3121[var1.field3181] > 0))) {
            var4 = var3.field3102 << 2;
            int var5 = var3.field3101 << 1;
            if (var1.field3184 < var5) {
                var4 = (var4 * var1.field3184) / var5;
            }
            var4 += this.field3121[var1.field3181] >> 7;
            double var6 = Math.sin(((double) (var1.field3188 & 511)) * 0.01227184630308513);
            var2 += ((int) (((double) (var4)) * var6));
        }
        var4 = ((int) (((((double) (var1.rawSound.sampleRate * 256)) * Math.pow(2.0, 3.255208333333333E-4 * ((double) (var2)))) / ((double) (PcmPlayer.field305))) + 0.5));
        return var4 < 1 ? 1 : var4;
    }

    @ObfuscatedName("aw")
    @ObfuscatedSignature(descriptor = "(Ljm;I)I", garbageValue = "738949981")
    int method5152(MusicPatchNode var1) {
        MusicPatchNode2 var2 = var1.field3174;
        int var3 = ((this.field3116[var1.field3181] * this.field3114[var1.field3181]) + 4096) >> 13;
        var3 = ((var3 * var3) + 16384) >> 15;
        var3 = ((var3 * var1.field3180) + 16384) >> 15;
        var3 = ((var3 * this.field3127) + 128) >> 8;
        if (var2.field3095 > 0) {
            var3 = ((int) ((((double) (var3)) * Math.pow(0.5, (((double) (var2.field3095)) * 1.953125E-5) * ((double) (var1.field3182)))) + 0.5));
        }
        int var4;
        int var5;
        int var6;
        int var7;
        if (var2.field3094 != null) {
            var4 = var1.field3183;
            var5 = var2.field3094[var1.field3176 + 1];
            if (var1.field3176 < (var2.field3094.length - 2)) {
                var6 = (var2.field3094[var1.field3176] & 255) << 8;
                var7 = (var2.field3094[var1.field3176 + 2] & 255) << 8;
                var5 += ((var4 - var6) * (var2.field3094[var1.field3176 + 3] - var5)) / (var7 - var6);
            }
            var3 = ((var3 * var5) + 32) >> 6;
        }
        if ((var1.field3186 > 0) && (var2.field3099 != null)) {
            var4 = var1.field3186;
            var5 = var2.field3099[var1.field3175 + 1];
            if (var1.field3175 < (var2.field3099.length - 2)) {
                var6 = (var2.field3099[var1.field3175] & 255) << 8;
                var7 = (var2.field3099[var1.field3175 + 2] & 255) << 8;
                var5 += ((var4 - var6) * (var2.field3099[var1.field3175 + 3] - var5)) / (var7 - var6);
            }
            var3 = ((var5 * var3) + 32) >> 6;
        }
        return var3;
    }

    @ObfuscatedName("aj")
    @ObfuscatedSignature(descriptor = "(Ljm;I)I", garbageValue = "1814455019")
    int method5060(MusicPatchNode var1) {
        int var2 = this.field3115[var1.field3181];
        return var2 < 8192 ? ((var2 * var1.field3178) + 32) >> 6 : 16384 - ((((128 - var1.field3178) * (16384 - var2)) + 32) >> 6);
    }

    @ObfuscatedName("ax")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "461876582")
    void method5066() {
        int var1 = this.track;
        int var2 = this.trackLength;
        long var3;
        for (var3 = this.field3133; var2 == this.trackLength; var3 = this.midiFile.method5188(var2)) {
            while (var2 == this.midiFile.trackLengths[var1]) {
                this.midiFile.gotoTrack(var1);
                int var5 = this.midiFile.readMessage(var1);
                if (var5 == 1) {
                    this.midiFile.setTrackDone();
                    this.midiFile.markTrackPosition(var1);
                    if (this.midiFile.isDone()) {
                        if ((!this.field3136) || (var2 == 0)) {
                            this.method5073();
                            this.midiFile.clear();
                            return;
                        }
                        this.midiFile.reset(var3);
                    }
                    break;
                }
                if ((var5 & 128) != 0) {
                    this.method5056(var5);
                }
                this.midiFile.readTrackLength(var1);
                this.midiFile.markTrackPosition(var1);
            } 
            var1 = this.midiFile.getPrioritizedTrack();
            var2 = this.midiFile.trackLengths[var1];
        }
        this.track = var1;
        this.trackLength = var2;
        this.field3133 = var3;
    }

    @ObfuscatedName("ah")
    @ObfuscatedSignature(descriptor = "(Ljm;B)Z", garbageValue = "88")
    boolean method5067(MusicPatchNode var1) {
        if (var1.stream == null) {
            if (var1.field3186 >= 0) {
                var1.remove();
                if ((var1.field3171 > 0) && (var1 == this.field3131[var1.field3181][var1.field3171])) {
                    this.field3131[var1.field3181][var1.field3171] = null;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ai")
    @ObfuscatedSignature(descriptor = "(Ljm;[IIII)Z", garbageValue = "-1351322760")
    boolean method5068(MusicPatchNode var1, int[] var2, int var3, int var4) {
        var1.field3190 = PcmPlayer.field305 / 100;
        if ((var1.field3186 < 0) || ((var1.stream != null) && (!var1.stream.method826()))) {
            int var5 = var1.field3187;
            if (var5 > 0) {
                var5 -= ((int) ((16.0 * Math.pow(2.0, 4.921259842519685E-4 * ((double) (this.field3137[var1.field3181])))) + 0.5));
                if (var5 < 0) {
                    var5 = 0;
                }
                var1.field3187 = var5;
            }
            var1.stream.method824(this.method5058(var1));
            MusicPatchNode2 var6 = var1.field3174;
            boolean var7 = false;
            ++var1.field3184;
            var1.field3188 += var6.field3100;
            double var8 = ((double) (((var1.field3189 - 60) << 8) + ((var1.field3177 * var1.field3187) >> 12))) * 5.086263020833333E-6;
            if (var6.field3095 > 0) {
                if (var6.field3098 > 0) {
                    var1.field3182 += ((int) ((128.0 * Math.pow(2.0, ((double) (var6.field3098)) * var8)) + 0.5));
                } else {
                    var1.field3182 += 128;
                }
            }
            if (var6.field3094 != null) {
                if (var6.field3096 > 0) {
                    var1.field3183 += ((int) ((128.0 * Math.pow(2.0, var8 * ((double) (var6.field3096)))) + 0.5));
                } else {
                    var1.field3183 += 128;
                }
                while ((var1.field3176 < (var6.field3094.length - 2)) && (var1.field3183 > ((var6.field3094[var1.field3176 + 2] & 255) << 8))) {
                    var1.field3176 += 2;
                } 
                if (((var6.field3094.length - 2) == var1.field3176) && (var6.field3094[var1.field3176 + 1] == 0)) {
                    var7 = true;
                }
            }
            if ((((var1.field3186 >= 0) && (var6.field3099 != null)) && ((this.field3124[var1.field3181] & 1) == 0)) && ((var1.field3171 < 0) || (var1 != this.field3131[var1.field3181][var1.field3171]))) {
                if (var6.field3097 > 0) {
                    var1.field3186 += ((int) ((128.0 * Math.pow(2.0, ((double) (var6.field3097)) * var8)) + 0.5));
                } else {
                    var1.field3186 += 128;
                }
                while ((var1.field3175 < (var6.field3099.length - 2)) && (var1.field3186 > ((var6.field3099[var1.field3175 + 2] & 255) << 8))) {
                    var1.field3175 += 2;
                } 
                if ((var6.field3099.length - 2) == var1.field3175) {
                    var7 = true;
                }
            }
            if (var7) {
                var1.stream.method822(var1.field3190);
                if (var2 != null) {
                    var1.stream.fill(var2, var3, var4);
                } else {
                    var1.stream.skip(var4);
                }
                if (var1.stream.method827()) {
                    this.patchStream.mixer.addSubStream(var1.stream);
                }
                var1.method5275();
                if (var1.field3186 >= 0) {
                    var1.remove();
                    if ((var1.field3171 > 0) && (var1 == this.field3131[var1.field3181][var1.field3171])) {
                        this.field3131[var1.field3181][var1.field3171] = null;
                    }
                }
                return true;
            } else {
                var1.stream.method911(var1.field3190, this.method5152(var1), this.method5060(var1));
                return false;
            }
        } else {
            var1.method5275();
            var1.remove();
            if ((var1.field3171 > 0) && (var1 == this.field3131[var1.field3181][var1.field3171])) {
                this.field3131[var1.field3181][var1.field3171] = null;
            }
            return true;
        }
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(B)[Lkm;", garbageValue = "12")
    @Export("PlayerType_values")
    public static PlayerType[] PlayerType_values() {
        return new PlayerType[]{ PlayerType.PlayerType_jagexModerator, PlayerType.field3857, PlayerType.PlayerType_ultimateIronman, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_normal, PlayerType.field3856, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_ironman, PlayerType.field3858 };
    }
}