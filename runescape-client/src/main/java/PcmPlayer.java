import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ag")
@Implements("PcmPlayer")
public class PcmPlayer {
    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = -1282105105)
    public static int field305;

    @ObfuscatedName("o")
    @Export("PcmPlayer_stereo")
    protected static boolean PcmPlayer_stereo;

    @ObfuscatedName("w")
    @Export("soundSystemExecutor")
    static ScheduledExecutorService soundSystemExecutor;

    @ObfuscatedName("az")
    @ObfuscatedSignature(descriptor = "Lpq;")
    @Export("rasterProvider")
    public static AbstractRasterProvider rasterProvider;

    @ObfuscatedName("q")
    @Export("samples")
    protected int[] samples;

    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "Lan;")
    @Export("stream")
    PcmStream stream;

    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = 505283827)
    int field293;

    @ObfuscatedName("n")
    @ObfuscatedGetter(longValue = 2942857516536814513L)
    @Export("timeMs")
    long timeMs;

    @ObfuscatedName("m")
    @ObfuscatedGetter(intValue = 2146341369)
    @Export("capacity")
    int capacity;

    @ObfuscatedName("d")
    @ObfuscatedGetter(intValue = 617020007)
    int field296;

    @ObfuscatedName("j")
    @ObfuscatedGetter(intValue = -134597597)
    int field297;

    @ObfuscatedName("f")
    @ObfuscatedGetter(longValue = 3988394758568685751L)
    long field298;

    @ObfuscatedName("g")
    @ObfuscatedGetter(intValue = 454965771)
    int field299;

    @ObfuscatedName("t")
    @ObfuscatedGetter(intValue = -435698239)
    int field288;

    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = 1647257589)
    int field301;

    @ObfuscatedName("b")
    @ObfuscatedGetter(longValue = -3633081744103915623L)
    long field302;

    @ObfuscatedName("z")
    boolean field294;

    @ObfuscatedName("al")
    @ObfuscatedGetter(intValue = 1386517767)
    int field304;

    @ObfuscatedName("aa")
    @ObfuscatedSignature(descriptor = "[Lan;")
    PcmStream[] field303;

    @ObfuscatedName("ao")
    @ObfuscatedSignature(descriptor = "[Lan;")
    PcmStream[] field306;

    protected PcmPlayer() {
        this.field293 = 32;
        this.timeMs = DirectByteArrayCopier.getServerTime();
        this.field298 = 0L;
        this.field299 = 0;
        this.field288 = 0;
        this.field301 = 0;
        this.field302 = 0L;
        this.field294 = true;
        this.field304 = 0;
        this.field303 = new PcmStream[8];
        this.field306 = new PcmStream[8];
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "62")
    @Export("init")
    protected void init() throws Exception {
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1020940076")
    @Export("open")
    protected void open(int var1) throws Exception {
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "2")
    @Export("position")
    protected int position() throws Exception {
        return this.capacity;
    }

    @ObfuscatedName("e")
    @Export("write")
    protected void write() throws Exception {
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-375742034")
    @Export("close")
    protected void close() {
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-128")
    @Export("discard")
    protected void discard() throws Exception {
    }

    @ObfuscatedName("k")
    @ObfuscatedSignature(descriptor = "(Lan;I)V", garbageValue = "1934557281")
    @Export("setStream")
    public synchronized final void setStream(PcmStream var1) {
        this.stream = var1;
    }

    @ObfuscatedName("b")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1902527420")
    @Export("run")
    public synchronized final void run() {
        if (this.samples != null) {
            long var1 = DirectByteArrayCopier.getServerTime();
            try {
                if (0L != this.field298) {
                    if (var1 < this.field298) {
                        return;
                    }
                    this.open(this.capacity);
                    this.field298 = 0L;
                    this.field294 = true;
                }
                int var3 = this.position();
                if ((this.field301 - var3) > this.field299) {
                    this.field299 = this.field301 - var3;
                }
                int var4 = this.field296 + this.field297;
                if ((var4 + 256) > 16384) {
                    var4 = 16128;
                }
                if ((var4 + 256) > this.capacity) {
                    this.capacity += 1024;
                    if (this.capacity > 16384) {
                        this.capacity = 16384;
                    }
                    this.close();
                    this.open(this.capacity);
                    var3 = 0;
                    this.field294 = true;
                    if ((var4 + 256) > this.capacity) {
                        var4 = this.capacity - 256;
                        this.field297 = var4 - this.field296;
                    }
                }
                while (var3 < var4) {
                    this.fill(this.samples, 256);
                    this.write();
                    var3 += 256;
                } 
                if (var1 > this.field302) {
                    if (!this.field294) {
                        if ((this.field299 == 0) && (this.field288 == 0)) {
                            this.close();
                            this.field298 = 2000L + var1;
                            return;
                        }
                        this.field297 = Math.min(this.field288, this.field299);
                        this.field288 = this.field299;
                    } else {
                        this.field294 = false;
                    }
                    this.field299 = 0;
                    this.field302 = 2000L + var1;
                }
                this.field301 = var3;
            } catch (Exception var7) {
                this.close();
                this.field298 = var1 + 2000L;
            }
            try {
                if (var1 > (500000L + this.timeMs)) {
                    var1 = this.timeMs;
                }
                while (var1 > (this.timeMs + 5000L)) {
                    this.skip(256);
                    this.timeMs += ((long) (256000 / field305));
                } 
            } catch (Exception var6) {
                this.timeMs = var1;
            }
        }
    }

    @ObfuscatedName("z")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-670373790")
    public final void method710() {
        this.field294 = true;
    }

    @ObfuscatedName("ap")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "19")
    @Export("tryDiscard")
    public synchronized final void tryDiscard() {
        this.field294 = true;
        try {
            this.discard();
        } catch (Exception var2) {
            this.close();
            this.field298 = DirectByteArrayCopier.getServerTime() + 2000L;
        }
    }

    @ObfuscatedName("af")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "117161958")
    @Export("shutdown")
    public synchronized final void shutdown() {
        if (class415.soundSystem != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; ++var2) {
                if (this == class415.soundSystem.players[var2]) {
                    class415.soundSystem.players[var2] = null;
                }
                if (class415.soundSystem.players[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                soundSystemExecutor.shutdownNow();
                soundSystemExecutor = null;
                class415.soundSystem = null;
            }
        }
        this.close();
        this.samples = null;
    }

    @ObfuscatedName("ak")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "65280")
    @Export("skip")
    final void skip(int var1) {
        this.field304 -= var1;
        if (this.field304 < 0) {
            this.field304 = 0;
        }
        if (this.stream != null) {
            this.stream.skip(var1);
        }
    }

    @ObfuscatedName("av")
    @Export("fill")
    final void fill(int[] var1, int var2) {
        int var3 = var2;
        if (PcmPlayer_stereo) {
            var3 = var2 << 1;
        }
        class338.clearIntArray(var1, 0, var3);
        this.field304 -= var2;
        if ((this.stream != null) && (this.field304 <= 0)) {
            this.field304 += field305 >> 4;
            class7.PcmStream_disable(this.stream);
            this.method715(this.stream, this.stream.vmethod956());
            int var4 = 0;
            int var5 = 255;
            int var6;
            PcmStream var10;
            label109 : for (var6 = 7; var5 != 0; --var6) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = (var5 >>> var7) & 286331153; var9 != 0; var9 >>>= 4) {
                    if ((var9 & 1) != 0) {
                        var5 &= ~(1 << var7);
                        var10 = null;
                        PcmStream var11 = this.field303[var7];
                        label103 : while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label103;
                                }
                                AbstractSound var12 = var11.sound;
                                if ((var12 != null) && (var12.position > var8)) {
                                    var5 |= 1 << var7;
                                    var10 = var11;
                                    var11 = var11.after;
                                } else {
                                    var11.active = true;
                                    int var13 = var11.vmethod5241();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.position += var13;
                                    }
                                    if (var4 >= this.field293) {
                                        break label109;
                                    }
                                    PcmStream var14 = var11.firstSubStream();
                                    if (var14 != null) {
                                        for (int var15 = var11.field359; var14 != null; var14 = var11.nextSubStream()) {
                                            this.method715(var14, (var15 * var14.vmethod956()) >> 8);
                                        }
                                    }
                                    PcmStream var18 = var11.after;
                                    var11.after = null;
                                    if (var10 == null) {
                                        this.field303[var7] = var18;
                                    } else {
                                        var10.after = var18;
                                    }
                                    if (var18 == null) {
                                        this.field306[var7] = var10;
                                    }
                                    var11 = var18;
                                }
                            } 
                        } 
                    }
                    var7 += 4;
                    ++var8;
                }
            }
            for (var6 = 0; var6 < 8; ++var6) {
                PcmStream var16 = this.field303[var6];
                PcmStream[] var17 = this.field303;
                this.field306[var6] = null;
                for (var17[var6] = null; var16 != null; var16 = var10) {
                    var10 = var16.after;
                    var16.after = null;
                }
            }
        }
        if (this.field304 < 0) {
            this.field304 = 0;
        }
        if (this.stream != null) {
            this.stream.fill(var1, 0, var2);
        }
        this.timeMs = DirectByteArrayCopier.getServerTime();
    }

    @ObfuscatedName("al")
    @ObfuscatedSignature(descriptor = "(Lan;II)V", garbageValue = "-273686229")
    final void method715(PcmStream var1, int var2) {
        int var3 = var2 >> 5;
        PcmStream var4 = this.field306[var3];
        if (var4 == null) {
            this.field303[var3] = var1;
        } else {
            var4.after = var1;
        }
        this.field306[var3] = var1;
        var1.field359 = var2;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(ILpi;S)Lff;", garbageValue = "27127")
    public static class160 method744(int var0, Buffer var1) {
        int var2 = var1.readUnsignedByte();
        boolean var3 = (var2 & 1) != 0;
        boolean var4 = (var2 & 2) != 0;
        class160 var5 = new class160(var0);
        int var6;
        int[] var7;
        boolean var8;
        int var9;
        short var10;
        if (var3) {
            var6 = var1.readUnsignedByte();
            var7 = new int[]{ var6 & 15, (var6 >> 4) & 15 };
            var8 = (var5.field1745 != null) && (var7.length == var5.field1745.length);
            for (var9 = 0; var9 < 2; ++var9) {
                if (var7[var9] != 15) {
                    var10 = ((short) (var1.readUnsignedShort()));
                    if (var8) {
                        var5.field1745[var7[var9]] = var10;
                    }
                }
            }
        }
        if (var4) {
            var6 = var1.readUnsignedByte();
            var7 = new int[]{ var6 & 15, (var6 >> 4) & 15 };
            var8 = (var5.field1746 != null) && (var7.length == var5.field1746.length);
            for (var9 = 0; var9 < 2; ++var9) {
                if (var7[var9] != 15) {
                    var10 = ((short) (var1.readUnsignedShort()));
                    if (var8) {
                        var5.field1746[var7[var9]] = var10;
                    }
                }
            }
        }
        return var5;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(II)Lfp;", garbageValue = "-1755865139")
    @Export("VarpDefinition_get")
    public static VarpDefinition VarpDefinition_get(int var0) {
        VarpDefinition var1 = ((VarpDefinition) (VarpDefinition.VarpDefinition_cached.get(((long) (var0)))));
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
            var1 = new VarpDefinition();
            if (var2 != null) {
                var1.decode(new Buffer(var2));
            }
            VarpDefinition.VarpDefinition_cached.put(var1, ((long) (var0)));
            return var1;
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "28")
    public static void method764(int var0, int var1) {
        VarbitComposition var3 = ((VarbitComposition) (VarbitComposition.VarbitDefinition_cached.get(((long) (var0)))));
        VarbitComposition var2;
        if (var3 != null) {
            var2 = var3;
        } else {
            byte[] var4 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
            var3 = new VarbitComposition();
            if (var4 != null) {
                var3.decode(new Buffer(var4));
            }
            VarbitComposition.VarbitDefinition_cached.put(var3, ((long) (var0)));
            var2 = var3;
        }
        int var8 = var2.baseVar;
        int var5 = var2.startBit;
        int var6 = var2.endBit;
        int var7 = Varps.Varps_masks[var6 - var5];
        if ((var1 < 0) || (var1 > var7)) {
            var1 = 0;
        }
        var7 <<= var5;
        Varps.Varps_main[var8] = (Varps.Varps_main[var8] & (~var7)) | ((var1 << var5) & var7);
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(III)Lbd;", garbageValue = "-1527078723")
    @Export("Messages_getByChannelAndID")
    static Message Messages_getByChannelAndID(int var0, int var1) {
        ChatChannel var2 = ((ChatChannel) (Messages.Messages_channels.get(var0)));
        return var2.getMessage(var1);
    }

    @ObfuscatedName("jg")
    @ObfuscatedSignature(descriptor = "([Ljz;Ljz;ZI)V", garbageValue = "-953702217")
    @Export("revalidateWidgetScroll")
    static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
        int var3 = (var1.scrollWidth != 0) ? (var1.scrollWidth * 1839447183) * (-112860561) : (var1.width * 308678411) * (-528431965);
        int var4 = (var1.scrollHeight != 0) ? (var1.scrollHeight * (-857694431)) * 54764769 : (var1.height * 1501533581) * (-1285507771);
        class21.resizeInterface(var0, var1.id, var3, var4, var2);
        if (var1.children != null) {
            class21.resizeInterface(var1.children, var1.id, var3, var4, var2);
        }
        InterfaceParent var5 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var1.id)))));
        if (var5 != null) {
            int var6 = var5.group;
            if (class13.loadInterface(var6)) {
                class21.resizeInterface(Widget.Widget_interfaceComponents[var6], -1, var3, var4, var2);
            }
        }
        if (var1.contentType == 1337) {
        }
    }
}