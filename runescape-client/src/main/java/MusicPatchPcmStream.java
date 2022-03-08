import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("jn")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Ljb;")
    @Export("superStream")
    MidiPcmStream superStream;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lls;")
    @Export("queue")
    NodeDeque queue;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lay;")
    @Export("mixer")
    PcmStreamMixer mixer;

    @ObfuscatedSignature(descriptor = "(Ljb;)V")
    MusicPatchPcmStream(MidiPcmStream var1) {
        this.queue = new NodeDeque();
        this.mixer = new PcmStreamMixer();
        this.superStream = var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Ljm;[IIIII)V", garbageValue = "-1585342605")
    void method5244(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
        if (((this.superStream.field3124[var1.field3181] & 4) != 0) && (var1.field3186 < 0)) {
            int var6 = this.superStream.field3129[var1.field3181] / PcmPlayer.field305;
            while (true) {
                int var7 = ((var6 + 1048575) - var1.field3191) / var6;
                if (var7 > var4) {
                    var1.field3191 += var6 * var4;
                    break;
                }
                var1.stream.fill(var2, var3, var7);
                var3 += var7;
                var4 -= var7;
                var1.field3191 += (var6 * var7) - 1048576;
                int var8 = PcmPlayer.field305 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                RawPcmStream var10 = var1.stream;
                if (this.superStream.field3126[var1.field3181] == 0) {
                    var1.stream = RawPcmStream.method873(var1.rawSound, var10.method825(), var10.method954(), var10.method817());
                } else {
                    var1.stream = RawPcmStream.method873(var1.rawSound, var10.method825(), 0, var10.method817());
                    this.superStream.method5164(var1, var1.patch.field3157[var1.field3189] < 0);
                    var1.stream.method821(var8, var10.method954());
                }
                if (var1.patch.field3157[var1.field3189] < 0) {
                    var1.stream.setNumLoops(-1);
                }
                var10.method822(var8);
                var10.fill(var2, var3, var5 - var3);
                if (var10.method827()) {
                    this.mixer.addSubStream(var10);
                }
            } 
        }
        var1.stream.fill(var2, var3, var4);
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ljm;II)V", garbageValue = "-1845108086")
    void method5245(MusicPatchNode var1, int var2) {
        if (((this.superStream.field3124[var1.field3181] & 4) != 0) && (var1.field3186 < 0)) {
            int var3 = this.superStream.field3129[var1.field3181] / PcmPlayer.field305;
            int var4 = ((var3 + 1048575) - var1.field3191) / var3;
            var1.field3191 = ((var3 * var2) + var1.field3191) & 1048575;
            if (var4 <= var2) {
                if (this.superStream.field3126[var1.field3181] == 0) {
                    var1.stream = RawPcmStream.method873(var1.rawSound, var1.stream.method825(), var1.stream.method954(), var1.stream.method817());
                } else {
                    var1.stream = RawPcmStream.method873(var1.rawSound, var1.stream.method825(), 0, var1.stream.method817());
                    this.superStream.method5164(var1, var1.patch.field3157[var1.field3189] < 0);
                }
                if (var1.patch.field3157[var1.field3189] < 0) {
                    var1.stream.setNumLoops(-1);
                }
                var2 = var1.field3191 / var3;
            }
        }
        var1.stream.skip(var2);
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "()Lan;")
    @Export("firstSubStream")
    protected PcmStream firstSubStream() {
        MusicPatchNode var1 = ((MusicPatchNode) (this.queue.last()));
        if (var1 == null) {
            return null;
        } else {
            return ((PcmStream) (var1.stream != null ? var1.stream : this.nextSubStream()));
        }
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "()Lan;")
    @Export("nextSubStream")
    protected PcmStream nextSubStream() {
        MusicPatchNode var1;
        do {
            var1 = ((MusicPatchNode) (this.queue.previous()));
            if (var1 == null) {
                return null;
            }
        } while (var1.stream == null );
        return var1.stream;
    }

    @ObfuscatedName("w")
    protected int vmethod5241() {
        return 0;
    }

    @ObfuscatedName("v")
    @Export("fill")
    protected void fill(int[] var1, int var2, int var3) {
        this.mixer.fill(var1, var2, var3);
        for (MusicPatchNode var6 = ((MusicPatchNode) (this.queue.last())); var6 != null; var6 = ((MusicPatchNode) (this.queue.previous()))) {
            if (!this.superStream.method5067(var6)) {
                int var4 = var2;
                int var5 = var3;
                do {
                    if (var5 <= var6.field3190) {
                        this.method5244(var6, var1, var4, var5, var4 + var5);
                        var6.field3190 -= var5;
                        break;
                    }
                    this.method5244(var6, var1, var4, var6.field3190, var5 + var4);
                    var4 += var6.field3190;
                    var5 -= var6.field3190;
                } while (!this.superStream.method5068(var6, var1, var4, var5) );
            }
        }
    }

    @ObfuscatedName("y")
    @Export("skip")
    protected void skip(int var1) {
        this.mixer.skip(var1);
        for (MusicPatchNode var3 = ((MusicPatchNode) (this.queue.last())); var3 != null; var3 = ((MusicPatchNode) (this.queue.previous()))) {
            if (!this.superStream.method5067(var3)) {
                int var2 = var1;
                do {
                    if (var2 <= var3.field3190) {
                        this.method5245(var3, var2);
                        var3.field3190 -= var2;
                        break;
                    }
                    this.method5245(var3, var3.field3190);
                    var2 -= var3.field3190;
                } while (!this.superStream.method5068(var3, ((int[]) (null)), 0, var2) );
            }
        }
    }
}