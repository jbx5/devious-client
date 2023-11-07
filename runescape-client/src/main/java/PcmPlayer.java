import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ab")
	public static int field275;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -259350243
	)
	public static int field266;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	@Export("pcmPlayerProvider")
	public static class51 pcmPlayerProvider;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	static Archive field281;
	@ObfuscatedName("as")
	@Export("samples")
	public int[] samples;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1988628851
	)
	int field271;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -231391675110677647L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1302720391
	)
	@Export("capacity")
	public int capacity;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1205498269
	)
	public int field272;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 656213455
	)
	int field267;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 7824561401735037233L
	)
	long field276;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 28096255
	)
	int field274;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1740635577
	)
	int field264;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1444849327
	)
	int field279;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = 8910830171002284323L
	)
	long field280;
	@ObfuscatedName("af")
	boolean field269;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 223547587
	)
	int field282;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "[Lbk;"
	)
	PcmStream[] field283;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "[Lbk;"
	)
	PcmStream[] field284;

	public PcmPlayer() {
		this.field271 = 32;
		this.timeMs = SpotAnimationDefinition.method3775();
		this.field276 = 0L;
		this.field274 = 0;
		this.field264 = 0;
		this.field279 = 0;
		this.field280 = 0L;
		this.field269 = true;
		this.field282 = 0;
		this.field283 = new PcmStream[8];
		this.field284 = new PcmStream[8];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "95"
	)
	@Export("init")
	public void init() throws Exception {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "851046877"
	)
	@Export("open")
	public void open(int var1) throws Exception {
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-79725090"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("ao")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1254913818"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-264971545"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lbk;B)V",
		garbageValue = "32"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1871006724"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = SpotAnimationDefinition.method3775();

			try {
				if (0L != this.field276) {
					if (var1 < this.field276) {
						return;
					}

					this.open(this.capacity);
					this.field276 = 0L;
					this.field269 = true;
				}

				int var3 = this.position();
				if (this.field279 - var3 > this.field274) {
					this.field274 = this.field279 - var3;
				}

				int var4 = this.field272 + this.field267;
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
					this.field269 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field267 = var4 - this.field272;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field280) {
					if (!this.field269) {
						if (this.field274 == 0 && this.field264 == 0) {
							this.close();
							this.field276 = 2000L + var1;
							return;
						}

						this.field267 = Math.min(this.field264, this.field274);
						this.field264 = this.field274;
					} else {
						this.field269 = false;
					}

					this.field274 = 0;
					this.field280 = var1 + 2000L;
				}

				this.field279 = var3;
			} catch (Exception var7) {
				this.close();
				this.field276 = 2000L + var1;
			}

			try {
				if (var1 > 500000L + this.timeMs) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(256);
					this.timeMs += (long)(256000 / (field275 * 1019137945));
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-440619545"
	)
	public final void method795() {
		this.field269 = true;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2108187094"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field269 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field276 = SpotAnimationDefinition.method3775() + 2000L;
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "592900977"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (DelayFadeTask.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == DelayFadeTask.soundSystem.players[var2]) {
					DelayFadeTask.soundSystem.players[var2] = null;
				}

				if (DelayFadeTask.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				class342.soundSystemExecutor.shutdownNow();
				class342.soundSystemExecutor = null;
				DelayFadeTask.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-120"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field282 -= var1;
		if (this.field282 < 0) {
			this.field282 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("bi")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (WorldMapRectangle.PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class421.clearIntArray(var1, 0, var3);
		this.field282 -= var2;
		if (this.stream != null && this.field282 <= 0) {
			this.field282 += 1019137945 * field275 >> 4;
			NPC.PcmStream_disable(this.stream);
			this.method802(this.stream, this.stream.vmethod1046());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label108:
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
						PcmStream var11 = this.field283[var7];

						label102:
						while (true) {
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
									int var13 = var11.vmethod6210();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field271) {
										break label108;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field337; var14 != null; var14 = var11.nextSubStream()) {
											this.method802(var14, var15 * var14.vmethod1046() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field283[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field284[var7] = var10;
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
				PcmStream var16 = this.field283[var6];
				PcmStream[] var17 = this.field283;
				this.field284[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field282 < 0) {
			this.field282 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = SpotAnimationDefinition.method3775();
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lbk;IB)V",
		garbageValue = "39"
	)
	final void method802(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field284[var3];
		if (var4 == null) {
			this.field283[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field284[var3] = var1;
		var1.field337 = var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luj;Ljava/lang/String;B)I",
		garbageValue = "108"
	)
	public static int method847(Buffer var0, String var1) {
		int var2 = var0.offset;
		byte[] var3 = MusicPatchPcmStream.method6233(var1);
		var0.writeSmartByteShort(var3.length);
		var0.offset += class350.huffman.compress(var3, 0, var3.length, var0.array, var0.offset);
		return var0.offset - var2;
	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-54"
	)
	static void method846(int var0) {
		class174.tempMenuAction = new MenuAction();
		class174.tempMenuAction.param0 = Client.menuArguments1[var0];
		class174.tempMenuAction.param1 = Client.menuArguments2[var0];
		class174.tempMenuAction.opcode = Client.menuOpcodes[var0];
		class174.tempMenuAction.identifier = Client.menuIdentifiers[var0];
		class174.tempMenuAction.itemId = Client.menuItemIds[var0];
		class174.tempMenuAction.action = Client.menuActions[var0];
		class174.tempMenuAction.target = Client.menuTargets[var0];
	}
}
