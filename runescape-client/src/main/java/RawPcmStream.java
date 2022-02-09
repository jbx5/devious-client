import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ae")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
    @ObfuscatedName("c")
    int field347;

    @ObfuscatedName("l")
    int field346;

    @ObfuscatedName("s")
    int field345;

    @ObfuscatedName("e")
    int field344;

    @ObfuscatedName("r")
    int field343;

    @ObfuscatedName("o")
    int field348;

    @ObfuscatedName("i")
    int field349;

    @ObfuscatedName("v")
    @Export("numLoops")
    int numLoops;

    @ObfuscatedName("a")
    @Export("start")
    int start;

    @ObfuscatedName("y")
    @Export("end")
    int end;

    @ObfuscatedName("u")
    boolean field353;

    @ObfuscatedName("h")
    int field354;

    @ObfuscatedName("q")
    int field355;

    @ObfuscatedName("x")
    int field356;

    @ObfuscatedName("p")
    int field357;

    @ObfuscatedSignature(descriptor = "(Lab;III)V")
    RawPcmStream(RawSound var1, int var2, int var3, int var4) {
        super.sound = var1;
        this.start = var1.start;
        this.end = var1.end;
        this.field353 = var1.field270;
        this.field346 = var2;
        this.field345 = var3;
        this.field344 = var4;
        this.field347 = 0;
        this.method883();
    }

    @ObfuscatedSignature(descriptor = "(Lab;II)V")
    RawPcmStream(RawSound var1, int var2, int var3) {
        super.sound = var1;
        this.start = var1.start;
        this.end = var1.end;
        this.field353 = var1.field270;
        this.field346 = var2;
        this.field345 = var3;
        this.field344 = 8192;
        this.field347 = 0;
        this.method883();
    }

    @ObfuscatedName("r")
    void method883() {
        this.field343 = this.field345;
        this.field348 = method847(this.field345, this.field344);
        this.field349 = method807(this.field345, this.field344);
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "()Lan;")
    @Export("firstSubStream")
    protected PcmStream firstSubStream() {
        return null;
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "()Lan;")
    @Export("nextSubStream")
    protected PcmStream nextSubStream() {
        return null;
    }

    @ObfuscatedName("w")
    protected int vmethod5241() {
        return (this.field345 == 0) && (this.field354 == 0) ? 0 : 1;
    }

    @ObfuscatedName("v")
    @Export("fill")
    public synchronized void fill(int[] var1, int var2, int var3) {
        if ((this.field345 == 0) && (this.field354 == 0)) {
            this.skip(var3);
        } else {
            RawSound var4 = ((RawSound) (super.sound));
            int var5 = this.start << 8;
            int var6 = this.end << 8;
            int var7 = var4.samples.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.numLoops = 0;
            }
            int var9 = var2;
            var3 += var2;
            if (this.field347 < 0) {
                if (this.field346 <= 0) {
                    this.method820();
                    this.remove();
                    return;
                }
                this.field347 = 0;
            }
            if (this.field347 >= var7) {
                if (this.field346 >= 0) {
                    this.method820();
                    this.remove();
                    return;
                }
                this.field347 = var7 - 1;
            }
            if (this.numLoops < 0) {
                if (this.field353) {
                    if (this.field346 < 0) {
                        var9 = this.method834(var1, var2, var5, var3, var4.samples[this.start]);
                        if (this.field347 >= var5) {
                            return;
                        }
                        this.field347 = ((var5 + var5) - 1) - this.field347;
                        this.field346 = -this.field346;
                    }
                    while (true) {
                        var9 = this.method833(var1, var9, var6, var3, var4.samples[this.end - 1]);
                        if (this.field347 < var6) {
                            return;
                        }
                        this.field347 = ((var6 + var6) - 1) - this.field347;
                        this.field346 = -this.field346;
                        var9 = this.method834(var1, var9, var5, var3, var4.samples[this.start]);
                        if (this.field347 >= var5) {
                            return;
                        }
                        this.field347 = ((var5 + var5) - 1) - this.field347;
                        this.field346 = -this.field346;
                    } 
                } else if (this.field346 < 0) {
                    while (true) {
                        var9 = this.method834(var1, var9, var5, var3, var4.samples[this.end - 1]);
                        if (this.field347 >= var5) {
                            return;
                        }
                        this.field347 = (var6 - 1) - (((var6 - 1) - this.field347) % var8);
                    } 
                } else {
                    while (true) {
                        var9 = this.method833(var1, var9, var6, var3, var4.samples[this.start]);
                        if (this.field347 < var6) {
                            return;
                        }
                        this.field347 = var5 + ((this.field347 - var5) % var8);
                    } 
                }
            } else {
                if (this.numLoops > 0) {
                    if (this.field353) {
                        label127 : {
                            if (this.field346 < 0) {
                                var9 = this.method834(var1, var2, var5, var3, var4.samples[this.start]);
                                if (this.field347 >= var5) {
                                    return;
                                }
                                this.field347 = ((var5 + var5) - 1) - this.field347;
                                this.field346 = -this.field346;
                                if ((--this.numLoops) == 0) {
                                    break label127;
                                }
                            }
                            do {
                                var9 = this.method833(var1, var9, var6, var3, var4.samples[this.end - 1]);
                                if (this.field347 < var6) {
                                    return;
                                }
                                this.field347 = ((var6 + var6) - 1) - this.field347;
                                this.field346 = -this.field346;
                                if ((--this.numLoops) == 0) {
                                    break;
                                }
                                var9 = this.method834(var1, var9, var5, var3, var4.samples[this.start]);
                                if (this.field347 >= var5) {
                                    return;
                                }
                                this.field347 = ((var5 + var5) - 1) - this.field347;
                                this.field346 = -this.field346;
                            } while ((--this.numLoops) != 0 );
                        }
                    } else {
                        int var10;
                        if (this.field346 < 0) {
                            while (true) {
                                var9 = this.method834(var1, var9, var5, var3, var4.samples[this.end - 1]);
                                if (this.field347 >= var5) {
                                    return;
                                }
                                var10 = ((var6 - 1) - this.field347) / var8;
                                if (var10 >= this.numLoops) {
                                    this.field347 += var8 * this.numLoops;
                                    this.numLoops = 0;
                                    break;
                                }
                                this.field347 += var8 * var10;
                                this.numLoops -= var10;
                            } 
                        } else {
                            while (true) {
                                var9 = this.method833(var1, var9, var6, var3, var4.samples[this.start]);
                                if (this.field347 < var6) {
                                    return;
                                }
                                var10 = (this.field347 - var5) / var8;
                                if (var10 >= this.numLoops) {
                                    this.field347 -= var8 * this.numLoops;
                                    this.numLoops = 0;
                                    break;
                                }
                                this.field347 -= var8 * var10;
                                this.numLoops -= var10;
                            } 
                        }
                    }
                }
                if (this.field346 < 0) {
                    this.method834(var1, var9, 0, var3, 0);
                    if (this.field347 < 0) {
                        this.field347 = -1;
                        this.method820();
                        this.remove();
                    }
                } else {
                    this.method833(var1, var9, var7, var3, 0);
                    if (this.field347 >= var7) {
                        this.field347 = var7;
                        this.method820();
                        this.remove();
                    }
                }
            }
        }
    }

    @ObfuscatedName("a")
    @Export("setNumLoops")
    public synchronized void setNumLoops(int var1) {
        this.numLoops = var1;
    }

    @ObfuscatedName("y")
    @Export("skip")
    public synchronized void skip(int var1) {
        if (this.field354 > 0) {
            if (var1 >= this.field354) {
                if (this.field345 == Integer.MIN_VALUE) {
                    this.field345 = 0;
                    this.field349 = 0;
                    this.field348 = 0;
                    this.field343 = 0;
                    this.remove();
                    var1 = this.field354;
                }
                this.field354 = 0;
                this.method883();
            } else {
                this.field343 += this.field355 * var1;
                this.field348 += this.field356 * var1;
                this.field349 += this.field357 * var1;
                this.field354 -= var1;
            }
        }
        RawSound var2 = ((RawSound) (super.sound));
        int var3 = this.start << 8;
        int var4 = this.end << 8;
        int var5 = var2.samples.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.numLoops = 0;
        }
        if (this.field347 < 0) {
            if (this.field346 <= 0) {
                this.method820();
                this.remove();
                return;
            }
            this.field347 = 0;
        }
        if (this.field347 >= var5) {
            if (this.field346 >= 0) {
                this.method820();
                this.remove();
                return;
            }
            this.field347 = var5 - 1;
        }
        this.field347 += this.field346 * var1;
        if (this.numLoops < 0) {
            if (!this.field353) {
                if (this.field346 < 0) {
                    if (this.field347 >= var3) {
                        return;
                    }
                    this.field347 = (var4 - 1) - (((var4 - 1) - this.field347) % var6);
                } else {
                    if (this.field347 < var4) {
                        return;
                    }
                    this.field347 = var3 + ((this.field347 - var3) % var6);
                }
            } else {
                if (this.field346 < 0) {
                    if (this.field347 >= var3) {
                        return;
                    }
                    this.field347 = ((var3 + var3) - 1) - this.field347;
                    this.field346 = -this.field346;
                }
                while (this.field347 >= var4) {
                    this.field347 = ((var4 + var4) - 1) - this.field347;
                    this.field346 = -this.field346;
                    if (this.field347 >= var3) {
                        return;
                    }
                    this.field347 = ((var3 + var3) - 1) - this.field347;
                    this.field346 = -this.field346;
                } 
            }
        } else {
            if (this.numLoops > 0) {
                if (this.field353) {
                    label129 : {
                        if (this.field346 < 0) {
                            if (this.field347 >= var3) {
                                return;
                            }
                            this.field347 = ((var3 + var3) - 1) - this.field347;
                            this.field346 = -this.field346;
                            if ((--this.numLoops) == 0) {
                                break label129;
                            }
                        }
                        do {
                            if (this.field347 < var4) {
                                return;
                            }
                            this.field347 = ((var4 + var4) - 1) - this.field347;
                            this.field346 = -this.field346;
                            if ((--this.numLoops) == 0) {
                                break;
                            }
                            if (this.field347 >= var3) {
                                return;
                            }
                            this.field347 = ((var3 + var3) - 1) - this.field347;
                            this.field346 = -this.field346;
                        } while ((--this.numLoops) != 0 );
                    }
                } else {
                    label161 : {
                        int var7;
                        if (this.field346 < 0) {
                            if (this.field347 >= var3) {
                                return;
                            }
                            var7 = ((var4 - 1) - this.field347) / var6;
                            if (var7 >= this.numLoops) {
                                this.field347 += var6 * this.numLoops;
                                this.numLoops = 0;
                                break label161;
                            }
                            this.field347 += var6 * var7;
                            this.numLoops -= var7;
                        } else {
                            if (this.field347 < var4) {
                                return;
                            }
                            var7 = (this.field347 - var3) / var6;
                            if (var7 >= this.numLoops) {
                                this.field347 -= var6 * this.numLoops;
                                this.numLoops = 0;
                                break label161;
                            }
                            this.field347 -= var6 * var7;
                            this.numLoops -= var7;
                        }
                        return;
                    }
                }
            }
            if (this.field346 < 0) {
                if (this.field347 < 0) {
                    this.field347 = -1;
                    this.method820();
                    this.remove();
                }
            } else if (this.field347 >= var5) {
                this.field347 = var5;
                this.method820();
                this.remove();
            }
        }
    }

    @ObfuscatedName("u")
    public synchronized void method813(int var1) {
        this.method912(var1 << 6, this.method817());
    }

    @ObfuscatedName("h")
    synchronized void method814(int var1) {
        this.method912(var1, this.method817());
    }

    @ObfuscatedName("q")
    synchronized void method912(int var1, int var2) {
        this.field345 = var1;
        this.field344 = var2;
        this.field354 = 0;
        this.method883();
    }

    @ObfuscatedName("x")
    public synchronized int method954() {
        return this.field345 == Integer.MIN_VALUE ? 0 : this.field345;
    }

    @ObfuscatedName("p")
    public synchronized int method817() {
        return this.field344 < 0 ? -1 : this.field344;
    }

    @ObfuscatedName("n")
    public synchronized void method818(int var1) {
        int var2 = ((RawSound) (super.sound)).samples.length << 8;
        if (var1 < (-1)) {
            var1 = -1;
        }
        if (var1 > var2) {
            var1 = var2;
        }
        this.field347 = var1;
    }

    @ObfuscatedName("m")
    @ObfuscatedSignature(descriptor = "(Z)V", garbageValue = "1")
    public synchronized void method936() {
        this.field346 = (this.field346 ^ (this.field346 >> 31)) + (this.field346 >>> 31);
        this.field346 = -this.field346;
    }

    @ObfuscatedName("d")
    void method820() {
        if (this.field354 != 0) {
            if (this.field345 == Integer.MIN_VALUE) {
                this.field345 = 0;
            }
            this.field354 = 0;
            this.method883();
        }
    }

    @ObfuscatedName("j")
    public synchronized void method821(int var1, int var2) {
        this.method911(var1, var2, this.method817());
    }

    @ObfuscatedName("f")
    public synchronized void method911(int var1, int var2, int var3) {
        if (var1 == 0) {
            this.method912(var2, var3);
        } else {
            int var4 = method847(var2, var3);
            int var5 = method807(var2, var3);
            if ((var4 == this.field348) && (var5 == this.field349)) {
                this.field354 = 0;
            } else {
                int var6 = var2 - this.field343;
                if ((this.field343 - var2) > var6) {
                    var6 = this.field343 - var2;
                }
                if ((var4 - this.field348) > var6) {
                    var6 = var4 - this.field348;
                }
                if ((this.field348 - var4) > var6) {
                    var6 = this.field348 - var4;
                }
                if ((var5 - this.field349) > var6) {
                    var6 = var5 - this.field349;
                }
                if ((this.field349 - var5) > var6) {
                    var6 = this.field349 - var5;
                }
                if (var1 > var6) {
                    var1 = var6;
                }
                this.field354 = var1;
                this.field345 = var2;
                this.field344 = var3;
                this.field355 = (var2 - this.field343) / var1;
                this.field356 = (var4 - this.field348) / var1;
                this.field357 = (var5 - this.field349) / var1;
            }
        }
    }

    @ObfuscatedName("g")
    public synchronized void method822(int var1) {
        if (var1 == 0) {
            this.method814(0);
            this.remove();
        } else if ((this.field348 == 0) && (this.field349 == 0)) {
            this.field354 = 0;
            this.field345 = 0;
            this.field343 = 0;
            this.remove();
        } else {
            int var2 = -this.field343;
            if (this.field343 > var2) {
                var2 = this.field343;
            }
            if ((-this.field348) > var2) {
                var2 = -this.field348;
            }
            if (this.field348 > var2) {
                var2 = this.field348;
            }
            if ((-this.field349) > var2) {
                var2 = -this.field349;
            }
            if (this.field349 > var2) {
                var2 = this.field349;
            }
            if (var1 > var2) {
                var1 = var2;
            }
            this.field354 = var1;
            this.field345 = Integer.MIN_VALUE;
            this.field355 = (-this.field343) / var1;
            this.field356 = (-this.field348) / var1;
            this.field357 = (-this.field349) / var1;
        }
    }

    @ObfuscatedName("ao")
    public synchronized void method824(int var1) {
        if (this.field346 < 0) {
            this.field346 = -var1;
        } else {
            this.field346 = var1;
        }
    }

    @ObfuscatedName("aq")
    public synchronized int method825() {
        return this.field346 < 0 ? -this.field346 : this.field346;
    }

    @ObfuscatedName("ay")
    public boolean method826() {
        return (this.field347 < 0) || (this.field347 >= (((RawSound) (super.sound)).samples.length << 8));
    }

    @ObfuscatedName("ag")
    public boolean method827() {
        return this.field354 != 0;
    }

    @ObfuscatedName("az")
    int vmethod956() {
        int var1 = (this.field343 * 3) >> 6;
        var1 = (var1 ^ (var1 >> 31)) + (var1 >>> 31);
        if (this.numLoops == 0) {
            var1 -= (var1 * this.field347) / (((RawSound) (super.sound)).samples.length << 8);
        } else if (this.numLoops >= 0) {
            var1 -= (var1 * this.start) / ((RawSound) (super.sound)).samples.length;
        }
        return var1 > 255 ? 255 : var1;
    }

    @ObfuscatedName("ad")
    int method833(int[] var1, int var2, int var3, int var4, int var5) {
        while (true) {
            if (this.field354 > 0) {
                int var6 = var2 + this.field354;
                if (var6 > var4) {
                    var6 = var4;
                }
                this.field354 += var2;
                if ((this.field346 == 256) && ((this.field347 & 255) == 0)) {
                    if (PcmPlayer.PcmPlayer_stereo) {
                        var2 = method858(0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field348, this.field349, this.field356, this.field357, 0, var6, var3, this);
                    } else {
                        var2 = method844(((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field343, this.field355, 0, var6, var3, this);
                    }
                } else if (PcmPlayer.PcmPlayer_stereo) {
                    var2 = method849(0, 0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field348, this.field349, this.field356, this.field357, 0, var6, var3, this, this.field346, var5);
                } else {
                    var2 = method848(0, 0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field343, this.field355, 0, var6, var3, this, this.field346, var5);
                }
                this.field354 -= var2;
                if (this.field354 != 0) {
                    return var2;
                }
                if (!this.method918()) {
                    continue;
                }
                return var4;
            }
            if ((this.field346 == 256) && ((this.field347 & 255) == 0)) {
                if (PcmPlayer.PcmPlayer_stereo) {
                    return method884(0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field348, this.field349, 0, var4, var3, this);
                }
                return method836(((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field343, 0, var4, var3, this);
            }
            if (PcmPlayer.PcmPlayer_stereo) {
                return method841(0, 0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field348, this.field349, 0, var4, var3, this, this.field346, var5);
            }
            return method953(0, 0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field343, 0, var4, var3, this, this.field346, var5);
        } 
    }

    @ObfuscatedName("au")
    int method834(int[] var1, int var2, int var3, int var4, int var5) {
        while (true) {
            if (this.field354 > 0) {
                int var6 = var2 + this.field354;
                if (var6 > var4) {
                    var6 = var4;
                }
                this.field354 += var2;
                if ((this.field346 == (-256)) && ((this.field347 & 255) == 0)) {
                    if (PcmPlayer.PcmPlayer_stereo) {
                        var2 = method829(0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field348, this.field349, this.field356, this.field357, 0, var6, var3, this);
                    } else {
                        var2 = method861(((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field343, this.field355, 0, var6, var3, this);
                    }
                } else if (PcmPlayer.PcmPlayer_stereo) {
                    var2 = method851(0, 0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field348, this.field349, this.field356, this.field357, 0, var6, var3, this, this.field346, var5);
                } else {
                    var2 = method850(0, 0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field343, this.field355, 0, var6, var3, this, this.field346, var5);
                }
                this.field354 -= var2;
                if (this.field354 != 0) {
                    return var2;
                }
                if (!this.method918()) {
                    continue;
                }
                return var4;
            }
            if ((this.field346 == (-256)) && ((this.field347 & 255) == 0)) {
                if (PcmPlayer.PcmPlayer_stereo) {
                    return method816(0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field348, this.field349, 0, var4, var3, this);
                }
                return method917(((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field343, 0, var4, var3, this);
            }
            if (PcmPlayer.PcmPlayer_stereo) {
                return method843(0, 0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field348, this.field349, 0, var4, var3, this, this.field346, var5);
            }
            return method904(0, 0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field343, 0, var4, var3, this, this.field346, var5);
        } 
    }

    @ObfuscatedName("at")
    boolean method918() {
        int var1 = this.field345;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var3 = 0;
            var2 = 0;
            var1 = 0;
        } else {
            var2 = method847(var1, this.field344);
            var3 = method807(var1, this.field344);
        }
        if (((var1 == this.field343) && (var2 == this.field348)) && (var3 == this.field349)) {
            if (this.field345 == Integer.MIN_VALUE) {
                this.field345 = 0;
                this.field349 = 0;
                this.field348 = 0;
                this.field343 = 0;
                this.remove();
                return true;
            } else {
                this.method883();
                return false;
            }
        } else {
            if (this.field343 < var1) {
                this.field355 = 1;
                this.field354 = var1 - this.field343;
            } else if (this.field343 > var1) {
                this.field355 = -1;
                this.field354 = this.field343 - var1;
            } else {
                this.field355 = 0;
            }
            if (this.field348 < var2) {
                this.field356 = 1;
                if ((this.field354 == 0) || (this.field354 > (var2 - this.field348))) {
                    this.field354 = var2 - this.field348;
                }
            } else if (this.field348 > var2) {
                this.field356 = -1;
                if ((this.field354 == 0) || (this.field354 > (this.field348 - var2))) {
                    this.field354 = this.field348 - var2;
                }
            } else {
                this.field356 = 0;
            }
            if (this.field349 < var3) {
                this.field357 = 1;
                if ((this.field354 == 0) || (this.field354 > (var3 - this.field349))) {
                    this.field354 = var3 - this.field349;
                }
            } else if (this.field349 > var3) {
                this.field357 = -1;
                if ((this.field354 == 0) || (this.field354 > (this.field349 - var3))) {
                    this.field354 = this.field349 - var3;
                }
            } else {
                this.field357 = 0;
            }
            return false;
        }
    }

    @ObfuscatedName("c")
    static int method847(int var0, int var1) {
        return var1 < 0 ? var0 : ((int) ((((double) (var0)) * Math.sqrt(((double) (16384 - var1)) * 1.220703125E-4)) + 0.5));
    }

    @ObfuscatedName("l")
    static int method807(int var0, int var1) {
        return var1 < 0 ? -var0 : ((int) ((((double) (var0)) * Math.sqrt(((double) (var1)) * 1.220703125E-4)) + 0.5));
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Lab;II)Lae;")
    @Export("createRawPcmStream")
    public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
        return (var0.samples != null) && (var0.samples.length != 0) ? new RawPcmStream(var0, ((int) (((((long) (var0.sampleRate)) * 256L) * ((long) (var1))) / ((long) (PcmPlayer.field305 * 100)))), var2 << 6) : null;
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(Lab;III)Lae;")
    public static RawPcmStream method873(RawSound var0, int var1, int var2, int var3) {
        return (var0.samples != null) && (var0.samples.length != 0) ? new RawPcmStream(var0, var1, var2, var3) : null;
    }

    @ObfuscatedName("ae")
    @ObfuscatedSignature(descriptor = "([B[IIIIIIILae;)I")
    static int method836(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
        var2 >>= 8;
        var7 >>= 8;
        var4 <<= 2;
        if ((var5 = (var3 + var7) - var2) > var6) {
            var5 = var6;
        }
        int var10001;
        for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var10001 = var3++;
        }
        for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
            var10001 = var3++;
        }
        var8.field347 = var2 << 8;
        return var3;
    }

    @ObfuscatedName("an")
    @ObfuscatedSignature(descriptor = "(I[B[IIIIIIIILae;)I")
    static int method884(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
        var3 >>= 8;
        var9 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        if ((var7 = (var4 + var9) - var3) > var8) {
            var7 = var8;
        }
        var4 <<= 1;
        var7 <<= 1;
        int var10001;
        byte var11;
        for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }
        for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }
        var10.field347 = var3 << 8;
        return var4 >> 1;
    }

    @ObfuscatedName("aw")
    @ObfuscatedSignature(descriptor = "([B[IIIIIIILae;)I")
    static int method917(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
        var2 >>= 8;
        var7 >>= 8;
        var4 <<= 2;
        if ((var5 = (var3 + var2) - (var7 - 1)) > var6) {
            var5 = var6;
        }
        int var10001;
        for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var10001 = var3++;
        }
        for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
            var10001 = var3++;
        }
        var8.field347 = var2 << 8;
        return var3;
    }

    @ObfuscatedName("aj")
    @ObfuscatedSignature(descriptor = "(I[B[IIIIIIIILae;)I")
    static int method816(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
        var3 >>= 8;
        var9 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        if ((var7 = (var3 + var4) - (var9 - 1)) > var8) {
            var7 = var8;
        }
        var4 <<= 1;
        var7 <<= 1;
        int var10001;
        byte var11;
        for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }
        for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }
        var10.field347 = var3 << 8;
        return var4 >> 1;
    }

    @ObfuscatedName("ax")
    @ObfuscatedSignature(descriptor = "(II[B[IIIIIIILae;II)I")
    static int method953(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
        if ((var11 == 0) || ((var7 = var5 + (((var11 + (var9 - var4)) - 257) / var11)) > var8)) {
            var7 = var8;
        }
        byte var13;
        int var10001;
        while (var5 < var7) {
            var1 = var4 >> 8;
            var13 = var2[var1];
            var10001 = var5++;
            var3[var10001] += (((var13 << 8) + ((var2[var1 + 1] - var13) * (var4 & 255))) * var6) >> 6;
            var4 += var11;
        } 
        if ((var11 == 0) || ((var7 = var5 + (((var11 + (var9 - var4)) - 1) / var11)) > var8)) {
            var7 = var8;
        }
        for (var1 = var12; var5 < var7; var4 += var11) {
            var13 = var2[var4 >> 8];
            var10001 = var5++;
            var3[var10001] += (((var13 << 8) + ((var1 - var13) * (var4 & 255))) * var6) >> 6;
        }
        var10.field347 = var4;
        return var5;
    }

    @ObfuscatedName("ah")
    @ObfuscatedSignature(descriptor = "(II[B[IIIIIIIILae;II)I")
    static int method841(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
        if ((var12 == 0) || ((var8 = var5 + ((((var10 - var4) + var12) - 257) / var12)) > var9)) {
            var8 = var9;
        }
        var5 <<= 1;
        byte var14;
        int var10001;
        for (var8 <<= 1; var5 < var8; var4 += var12) {
            var1 = var4 >> 8;
            var14 = var2[var1];
            var0 = (var14 << 8) + ((var4 & 255) * (var2[var1 + 1] - var14));
            var10001 = var5++;
            var3[var10001] += (var0 * var6) >> 6;
            var10001 = var5++;
            var3[var10001] += (var0 * var7) >> 6;
        }
        if ((var12 == 0) || ((var8 = (var5 >> 1) + ((((var10 - var4) + var12) - 1) / var12)) > var9)) {
            var8 = var9;
        }
        var8 <<= 1;
        for (var1 = var13; var5 < var8; var4 += var12) {
            var14 = var2[var4 >> 8];
            var0 = (var14 << 8) + ((var1 - var14) * (var4 & 255));
            var10001 = var5++;
            var3[var10001] += (var0 * var6) >> 6;
            var10001 = var5++;
            var3[var10001] += (var0 * var7) >> 6;
        }
        var11.field347 = var4;
        return var5 >> 1;
    }

    @ObfuscatedName("ai")
    @ObfuscatedSignature(descriptor = "(II[B[IIIIIIILae;II)I")
    static int method904(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
        if ((var11 == 0) || ((var7 = var5 + ((var11 + ((var9 + 256) - var4)) / var11)) > var8)) {
            var7 = var8;
        }
        int var10001;
        while (var5 < var7) {
            var1 = var4 >> 8;
            byte var13 = var2[var1 - 1];
            var10001 = var5++;
            var3[var10001] += (((var13 << 8) + ((var2[var1] - var13) * (var4 & 255))) * var6) >> 6;
            var4 += var11;
        } 
        if ((var11 == 0) || ((var7 = var5 + ((var11 + (var9 - var4)) / var11)) > var8)) {
            var7 = var8;
        }
        var0 = var12;
        for (var1 = var11; var5 < var7; var4 += var1) {
            var10001 = var5++;
            var3[var10001] += (((var0 << 8) + ((var2[var4 >> 8] - var0) * (var4 & 255))) * var6) >> 6;
        }
        var10.field347 = var4;
        return var5;
    }

    @ObfuscatedName("am")
    @ObfuscatedSignature(descriptor = "(II[B[IIIIIIIILae;II)I")
    static int method843(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
        if ((var12 == 0) || ((var8 = var5 + ((((var10 + 256) - var4) + var12) / var12)) > var9)) {
            var8 = var9;
        }
        var5 <<= 1;
        int var10001;
        for (var8 <<= 1; var5 < var8; var4 += var12) {
            var1 = var4 >> 8;
            byte var14 = var2[var1 - 1];
            var0 = ((var2[var1] - var14) * (var4 & 255)) + (var14 << 8);
            var10001 = var5++;
            var3[var10001] += (var0 * var6) >> 6;
            var10001 = var5++;
            var3[var10001] += (var0 * var7) >> 6;
        }
        if ((var12 == 0) || ((var8 = (var5 >> 1) + (((var10 - var4) + var12) / var12)) > var9)) {
            var8 = var9;
        }
        var8 <<= 1;
        for (var1 = var13; var5 < var8; var4 += var12) {
            var0 = (var1 << 8) + ((var4 & 255) * (var2[var4 >> 8] - var1));
            var10001 = var5++;
            var3[var10001] += (var0 * var6) >> 6;
            var10001 = var5++;
            var3[var10001] += (var0 * var7) >> 6;
        }
        var11.field347 = var4;
        return var5 >> 1;
    }

    @ObfuscatedName("bt")
    @ObfuscatedSignature(descriptor = "([B[IIIIIIIILae;)I")
    static int method844(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
        var2 >>= 8;
        var8 >>= 8;
        var4 <<= 2;
        var5 <<= 2;
        if ((var6 = (var3 + var8) - var2) > var7) {
            var6 = var7;
        }
        var9.field348 += var9.field356 * (var6 - var3);
        var9.field349 += var9.field357 * (var6 - var3);
        int var10001;
        for (var6 -= 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
        }
        for (var6 += 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
        }
        var9.field343 = var4 >> 2;
        var9.field347 = var2 << 8;
        return var3;
    }

    @ObfuscatedName("bn")
    @ObfuscatedSignature(descriptor = "(I[B[IIIIIIIIIILae;)I")
    static int method858(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
        var3 >>= 8;
        var11 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        var7 <<= 2;
        var8 <<= 2;
        if ((var9 = (var11 + var4) - var3) > var10) {
            var9 = var10;
        }
        var12.field343 += var12.field355 * (var9 - var4);
        var4 <<= 1;
        var9 <<= 1;
        byte var13;
        int var10001;
        for (var9 -= 6; var4 < var9; var6 += var8) {
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }
        for (var9 += 6; var4 < var9; var6 += var8) {
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }
        var12.field348 = var5 >> 2;
        var12.field349 = var6 >> 2;
        var12.field347 = var3 << 8;
        return var4 >> 1;
    }

    @ObfuscatedName("bz")
    @ObfuscatedSignature(descriptor = "([B[IIIIIIIILae;)I")
    static int method861(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
        var2 >>= 8;
        var8 >>= 8;
        var4 <<= 2;
        var5 <<= 2;
        if ((var6 = (var3 + var2) - (var8 - 1)) > var7) {
            var6 = var7;
        }
        var9.field348 += var9.field356 * (var6 - var3);
        var9.field349 += var9.field357 * (var6 - var3);
        int var10001;
        for (var6 -= 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
        }
        for (var6 += 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
        }
        var9.field343 = var4 >> 2;
        var9.field347 = var2 << 8;
        return var3;
    }

    @ObfuscatedName("bx")
    @ObfuscatedSignature(descriptor = "(I[B[IIIIIIIIIILae;)I")
    static int method829(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
        var3 >>= 8;
        var11 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        var7 <<= 2;
        var8 <<= 2;
        if ((var9 = (var3 + var4) - (var11 - 1)) > var10) {
            var9 = var10;
        }
        var12.field343 += var12.field355 * (var9 - var4);
        var4 <<= 1;
        var9 <<= 1;
        byte var13;
        int var10001;
        for (var9 -= 6; var4 < var9; var6 += var8) {
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }
        for (var9 += 6; var4 < var9; var6 += var8) {
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }
        var12.field348 = var5 >> 2;
        var12.field349 = var6 >> 2;
        var12.field347 = var3 << 8;
        return var4 >> 1;
    }

    @ObfuscatedName("bd")
    @ObfuscatedSignature(descriptor = "(II[B[IIIIIIIILae;II)I")
    static int method848(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
        var11.field348 -= var11.field356 * var5;
        var11.field349 -= var11.field357 * var5;
        if ((var12 == 0) || ((var8 = var5 + ((((var10 - var4) + var12) - 257) / var12)) > var9)) {
            var8 = var9;
        }
        byte var14;
        int var10001;
        while (var5 < var8) {
            var1 = var4 >> 8;
            var14 = var2[var1];
            var10001 = var5++;
            var3[var10001] += (((var14 << 8) + ((var2[var1 + 1] - var14) * (var4 & 255))) * var6) >> 6;
            var6 += var7;
            var4 += var12;
        } 
        if ((var12 == 0) || ((var8 = var5 + ((((var10 - var4) + var12) - 1) / var12)) > var9)) {
            var8 = var9;
        }
        for (var1 = var13; var5 < var8; var4 += var12) {
            var14 = var2[var4 >> 8];
            var10001 = var5++;
            var3[var10001] += (((var14 << 8) + ((var1 - var14) * (var4 & 255))) * var6) >> 6;
            var6 += var7;
        }
        var11.field348 += var11.field356 * var5;
        var11.field349 += var11.field357 * var5;
        var11.field343 = var6;
        var11.field347 = var4;
        return var5;
    }

    @ObfuscatedName("bg")
    @ObfuscatedSignature(descriptor = "(II[B[IIIIIIIIIILae;II)I")
    static int method849(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
        var13.field343 -= var5 * var13.field355;
        if ((var14 == 0) || ((var10 = var5 + ((((var12 - var4) + var14) - 257) / var14)) > var11)) {
            var10 = var11;
        }
        var5 <<= 1;
        byte var16;
        int var10001;
        for (var10 <<= 1; var5 < var10; var4 += var14) {
            var1 = var4 >> 8;
            var16 = var2[var1];
            var0 = (var16 << 8) + ((var4 & 255) * (var2[var1 + 1] - var16));
            var10001 = var5++;
            var3[var10001] += (var0 * var6) >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += (var0 * var7) >> 6;
            var7 += var9;
        }
        if ((var14 == 0) || ((var10 = (var5 >> 1) + ((((var12 - var4) + var14) - 1) / var14)) > var11)) {
            var10 = var11;
        }
        var10 <<= 1;
        for (var1 = var15; var5 < var10; var4 += var14) {
            var16 = var2[var4 >> 8];
            var0 = (var16 << 8) + ((var1 - var16) * (var4 & 255));
            var10001 = var5++;
            var3[var10001] += (var0 * var6) >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += (var0 * var7) >> 6;
            var7 += var9;
        }
        var5 >>= 1;
        var13.field343 += var13.field355 * var5;
        var13.field348 = var6;
        var13.field349 = var7;
        var13.field347 = var4;
        return var5;
    }

    @ObfuscatedName("bm")
    @ObfuscatedSignature(descriptor = "(II[B[IIIIIIIILae;II)I")
    static int method850(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
        var11.field348 -= var11.field356 * var5;
        var11.field349 -= var11.field357 * var5;
        if ((var12 == 0) || ((var8 = var5 + ((((var10 + 256) - var4) + var12) / var12)) > var9)) {
            var8 = var9;
        }
        int var10001;
        while (var5 < var8) {
            var1 = var4 >> 8;
            byte var14 = var2[var1 - 1];
            var10001 = var5++;
            var3[var10001] += (((var14 << 8) + ((var2[var1] - var14) * (var4 & 255))) * var6) >> 6;
            var6 += var7;
            var4 += var12;
        } 
        if ((var12 == 0) || ((var8 = var5 + (((var10 - var4) + var12) / var12)) > var9)) {
            var8 = var9;
        }
        var0 = var13;
        for (var1 = var12; var5 < var8; var4 += var1) {
            var10001 = var5++;
            var3[var10001] += (((var0 << 8) + ((var2[var4 >> 8] - var0) * (var4 & 255))) * var6) >> 6;
            var6 += var7;
        }
        var11.field348 += var11.field356 * var5;
        var11.field349 += var11.field357 * var5;
        var11.field343 = var6;
        var11.field347 = var4;
        return var5;
    }

    @ObfuscatedName("bi")
    @ObfuscatedSignature(descriptor = "(II[B[IIIIIIIIIILae;II)I")
    static int method851(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
        var13.field343 -= var5 * var13.field355;
        if ((var14 == 0) || ((var10 = var5 + ((((var12 + 256) - var4) + var14) / var14)) > var11)) {
            var10 = var11;
        }
        var5 <<= 1;
        int var10001;
        for (var10 <<= 1; var5 < var10; var4 += var14) {
            var1 = var4 >> 8;
            byte var16 = var2[var1 - 1];
            var0 = ((var2[var1] - var16) * (var4 & 255)) + (var16 << 8);
            var10001 = var5++;
            var3[var10001] += (var0 * var6) >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += (var0 * var7) >> 6;
            var7 += var9;
        }
        if ((var14 == 0) || ((var10 = (var5 >> 1) + (((var12 - var4) + var14) / var14)) > var11)) {
            var10 = var11;
        }
        var10 <<= 1;
        for (var1 = var15; var5 < var10; var4 += var14) {
            var0 = (var1 << 8) + ((var4 & 255) * (var2[var4 >> 8] - var1));
            var10001 = var5++;
            var3[var10001] += (var0 * var6) >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += (var0 * var7) >> 6;
            var7 += var9;
        }
        var5 >>= 1;
        var13.field343 += var13.field355 * var5;
        var13.field348 = var6;
        var13.field349 = var7;
        var13.field347 = var4;
        return var5;
    }
}