import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ao")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	@Export("soundSystem")
	public static SoundSystem soundSystem;
	@ObfuscatedName("bz")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field283;
	@ObfuscatedName("ia")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("ax")
	@Export("samples")
	public int[] samples;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -477975923
	)
	int field272;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = 267391531349526727L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 150500267
	)
	@Export("capacity")
	public int capacity;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -24065233
	)
	public int field270;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -925982767
	)
	int field280;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = 1433110650917121645L
	)
	long field277;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1806952535
	)
	int field278;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 493066387
	)
	int field275;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1948163787
	)
	int field286;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = 6302391860379089589L
	)
	long field281;
	@ObfuscatedName("ak")
	boolean field282;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 951407123
	)
	int field279;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "[Lba;"
	)
	PcmStream[] field284;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "[Lba;"
	)
	PcmStream[] field285;

	public PcmPlayer() {
		this.field272 = 32;
		this.timeMs = VerticalAlignment.method3924();
		this.field277 = 0L;
		this.field278 = 0;
		this.field275 = 0;
		this.field286 = 0;
		this.field281 = 0L;
		this.field282 = true;
		this.field279 = 0;
		this.field284 = new PcmStream[8];
		this.field285 = new PcmStream[8];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1163974499"
	)
	@Export("init")
	public void init() throws Exception {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1133626633"
	)
	@Export("open")
	public void open(int var1) throws Exception {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350442159"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("at")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "483569760"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-10789"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lba;I)V",
		garbageValue = "-1593114865"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-19"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = VerticalAlignment.method3924();

			try {
				if (this.field277 != 0L) {
					if (var1 < this.field277) {
						return;
					}

					this.open(this.capacity);
					this.field277 = 0L;
					this.field282 = true;
				}

				int var3 = this.position();
				if (this.field286 - var3 > this.field278) {
					this.field278 = this.field286 - var3;
				}

				int var4 = this.field280 + this.field270;
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
					this.field282 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field280 = var4 - this.field270;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field281) {
					if (!this.field282) {
						if (this.field278 == 0 && this.field275 == 0) {
							this.close();
							this.field277 = 2000L + var1;
							return;
						}

						this.field280 = Math.min(this.field275, this.field278);
						this.field275 = this.field278;
					} else {
						this.field282 = false;
					}

					this.field278 = 0;
					this.field281 = var1 + 2000L;
				}

				this.field286 = var3;
			} catch (Exception var7) {
				this.close();
				this.field277 = var1 + 2000L;
			}

			try {
				if (var1 > this.timeMs + 500000L) {
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) {
					this.skip(256);
					this.timeMs += (long)(256000 / (class472.field4892 * 722468864));
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1814436740"
	)
	public final void method763() {
		this.field282 = true;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-422429694"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field282 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field277 = VerticalAlignment.method3924() + 2000L;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == soundSystem.players[var2]) {
					soundSystem.players[var2] = null;
				}

				if (soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				LoginPacket.soundSystemExecutor.shutdownNow();
				LoginPacket.soundSystemExecutor = null;
				soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1197021655"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field279 -= var1;
		if (this.field279 < 0) {
			this.field279 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("bz")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class429.clearIntArray(var1, 0, var3);
		this.field279 -= var2;
		if (this.stream != null && this.field279 <= 0) {
			this.field279 += class472.field4892 * 722468864 >> 4;
			MusicSong.PcmStream_disable(this.stream);
			this.method760(this.stream, this.stream.vmethod1015());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label110:
			for (var6 = 7; var5 != 0; --var6) {
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
						PcmStream var11 = this.field284[var7];

						label104:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label104;
								}

								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod6214();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field272) {
										break label110;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field344; var14 != null; var14 = var11.nextSubStream()) {
											this.method760(var14, var15 * var14.vmethod1015() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field284[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field285[var7] = var10;
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
				PcmStream var16 = this.field284[var6];
				PcmStream[] var17 = this.field284;
				this.field285[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field279 < 0) {
			this.field279 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = VerticalAlignment.method3924();
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lba;II)V",
		garbageValue = "1415944306"
	)
	final void method760(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field285[var3];
		if (var4 == null) {
			this.field284[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field285[var3] = var1;
		var1.field344 = var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1962789961"
	)
	public static void method799() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)I",
		garbageValue = "113"
	)
	static int method752(Widget var0) {
		if (var0.type != 11) {
			--AbstractWorldMapIcon.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize];
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var0.method6670(var1);
			return 1;
		}
	}
}
