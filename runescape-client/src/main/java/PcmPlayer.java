import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ar")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1517063499)
	public static int field287;

	@ObfuscatedName("w")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "Lag;")
	@Export("soundSystem")
	static SoundSystem soundSystem;

	@ObfuscatedName("aa")
	@ObfuscatedSignature(descriptor = "Lns;")
	static Bounds field294;

	@ObfuscatedName("hw")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;

	@ObfuscatedName("r")
	@Export("samples")
	protected int[] samples;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Laz;")
	@Export("stream")
	PcmStream stream;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = -1871567331)
	int field274;

	@ObfuscatedName("h")
	@ObfuscatedGetter(longValue = -199998738011106139L)
	@Export("timeMs")
	long timeMs;

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = -387059293)
	@Export("capacity")
	int capacity;

	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 266426517)
	int field282;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 890315289)
	int field283;

	@ObfuscatedName("p")
	@ObfuscatedGetter(longValue = 7385207387876044501L)
	long field284;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = -284119641)
	int field285;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 1652209615)
	int field286;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 218560279)
	int field296;

	@ObfuscatedName("m")
	@ObfuscatedGetter(longValue = 3493257443098912669L)
	long field288;

	@ObfuscatedName("d")
	boolean field293;

	@ObfuscatedName("ap")
	@ObfuscatedGetter(intValue = -1315224697)
	int field291;

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = "[Laz;")
	PcmStream[] field289;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "[Laz;")
	PcmStream[] field292;

	protected PcmPlayer() {
		this.field274 = 32;
		this.timeMs = class115.method2692();
		this.field284 = 0L;
		this.field285 = 0;
		this.field286 = 0;
		this.field296 = 0;
		this.field288 = 0L;
		this.field293 = true;
		this.field291 = 0;
		this.field289 = new PcmStream[8];
		this.field292 = new PcmStream[8];
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-609921240")
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1372651644")
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "2144118703")
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("f")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-49")
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "35")
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(Laz;I)V", garbageValue = "-2073910324")
	@Export("setStream")
	public synchronized final void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-987567305")
	@Export("run")
	public synchronized final void run() {
		if (this.samples != null) {
			long var1 = class115.method2692();
			try {
				if (this.field284 != 0L) {
					if (var1 < this.field284) {
						return;
					}
					this.open(this.capacity);
					this.field284 = 0L;
					this.field293 = true;
				}
				int var3 = this.position();
				if (this.field296 - var3 > this.field285) {
					this.field285 = this.field296 - var3;
				}
				int var4 = this.field283 + this.field282;
				if (var4 + 256 > 16384) {
					var4 = 16128;
				}
				if (var4 + 256 > this.capacity) {
					this.capacity += 1024;
					if (this.capacity > 16384) {
						this.capacity = 16384;
					}
					this.close();
					this.open(this.capacity);
					var3 = 0;
					this.field293 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field283 = var4 - this.field282;
					}
				}
				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				} 
				if (var1 > this.field288) {
					if (!this.field293) {
						if (this.field285 == 0 && this.field286 == 0) {
							this.close();
							this.field284 = var1 + 2000L;
							return;
						}
						this.field283 = Math.min(this.field286, this.field285);
						this.field286 = this.field285;
					} else {
						this.field293 = false;
					}
					this.field285 = 0;
					this.field288 = var1 + 2000L;
				}
				this.field296 = var3;
			} catch (Exception var7) {
				this.close();
				this.field284 = var1 + 2000L;
			}
			try {
				if (var1 > 500000L + this.timeMs) {
					var1 = this.timeMs;
				}
				while (var1 > this.timeMs + 5000L) {
					this.skip(256);
					this.timeMs += ((long) (256000 / field287));
				} 
			} catch (Exception var6) {
				this.timeMs = var1;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-2134156100")
	public final void method715() {
		this.field293 = true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-643520817")
	@Export("tryDiscard")
	public synchronized final void tryDiscard() {
		this.field293 = true;
		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field284 = class115.method2692() + 2000L;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "2")
	@Export("shutdown")
	public synchronized final void shutdown() {
		if (soundSystem != null) {
			boolean var1 = true;
			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == PcmPlayer.soundSystem.players[var2]) {
					PcmPlayer.soundSystem.players[var2] = null;
				}
				if (PcmPlayer.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}
			if (var1) {
				soundSystemExecutor.shutdownNow();
				soundSystemExecutor = null;
				soundSystem = null;
			}
		}
		this.close();
		this.samples = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1021979490")
	@Export("skip")
	final void skip(int var1) {
		this.field291 -= var1;
		if (this.field291 < 0) {
			this.field291 = 0;
		}
		if (this.stream != null) {
			this.stream.skip(var1);
		}
	}

	@ObfuscatedName("ap")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (BuddyRankComparator.PcmPlayer_stereo) {
			var3 = var2 << 1;
		}
		class350.clearIntArray(var1, 0, var3);
		this.field291 -= var2;
		if (this.stream != null && this.field291 <= 0) {
			this.field291 += field287 >> 4;
			Language.PcmStream_disable(this.stream);
			this.method673(this.stream, this.stream.vmethod948());
			int var4 = 0;
			int var5 = 255;
			int var6;
			PcmStream var10;
			label108 : for (var6 = 7; var5 != 0; --var6) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}
				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						var10 = null;
						PcmStream var11 = this.field289[var7];
						label102 : while (true) {
							while (true) {
								if (var11 == null) {
									break label102;
								}
								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod5437();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}
									if (var4 >= this.field274) {
										break label108;
									}
									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field346; var14 != null; var14 = var11.nextSubStream()) {
											this.method673(var14, var15 * var14.vmethod948() >> 8);
										}
									}
									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field289[var7] = var18;
									} else {
										var10.after = var18;
									}
									if (var18 == null) {
										this.field292[var7] = var10;
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
				PcmStream var16 = this.field289[var6];
				PcmStream[] var17 = this.field289;
				this.field292[var6] = null;
				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}
		if (this.field291 < 0) {
			this.field291 = 0;
		}
		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}
		this.timeMs = class115.method2692();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "(Laz;II)V", garbageValue = "-2042142637")
	final void method673(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field292[var3];
		if (var4 == null) {
			this.field289[var3] = var1;
		} else {
			var4.after = var1;
		}
		this.field292[var3] = var1;
		var1.field346 = var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqt;Ljava/lang/String;I)I", garbageValue = "347450782")
	public static int method720(Buffer var0, String var1) {
		int var2 = var0.offset;
		int var4 = var1.length();
		byte[] var5 = new byte[var4];
		for (int var6 = 0; var6 < var4; ++var6) {
			char var7 = var1.charAt(var6);
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
				var5[var6] = ((byte) (var7));
			} else if (var7 == 8364) {
				var5[var6] = -128;
			} else if (var7 == 8218) {
				var5[var6] = -126;
			} else if (var7 == 402) {
				var5[var6] = -125;
			} else if (var7 == 8222) {
				var5[var6] = -124;
			} else if (var7 == 8230) {
				var5[var6] = -123;
			} else if (var7 == 8224) {
				var5[var6] = -122;
			} else if (var7 == 8225) {
				var5[var6] = -121;
			} else if (var7 == 710) {
				var5[var6] = -120;
			} else if (var7 == 8240) {
				var5[var6] = -119;
			} else if (var7 == 352) {
				var5[var6] = -118;
			} else if (var7 == 8249) {
				var5[var6] = -117;
			} else if (var7 == 338) {
				var5[var6] = -116;
			} else if (var7 == 381) {
				var5[var6] = -114;
			} else if (var7 == 8216) {
				var5[var6] = -111;
			} else if (var7 == 8217) {
				var5[var6] = -110;
			} else if (var7 == 8220) {
				var5[var6] = -109;
			} else if (var7 == 8221) {
				var5[var6] = -108;
			} else if (var7 == 8226) {
				var5[var6] = -107;
			} else if (var7 == 8211) {
				var5[var6] = -106;
			} else if (var7 == 8212) {
				var5[var6] = -105;
			} else if (var7 == 732) {
				var5[var6] = -104;
			} else if (var7 == 8482) {
				var5[var6] = -103;
			} else if (var7 == 353) {
				var5[var6] = -102;
			} else if (var7 == 8250) {
				var5[var6] = -101;
			} else if (var7 == 339) {
				var5[var6] = -100;
			} else if (var7 == 382) {
				var5[var6] = -98;
			} else if (var7 == 376) {
				var5[var6] = -97;
			} else {
				var5[var6] = 63;
			}
		}
		var0.writeSmartByteShort(var5.length);
		var0.offset += class281.huffman.compress(var5, 0, var5.length, var0.array, var0.offset);
		return var0.offset - var2;
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "-101")
	static void method719(int var0, int var1) {
		if (class19.clientPreferences.method2258() != 0 && var0 != -1) {
			AttackOption.method2410(UserComparator7.field1383, var0, 0, class19.clientPreferences.method2258(), false);
			Client.playingJingle = true;
		}
	}
}