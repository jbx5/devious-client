import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 386349799
	)
	static int field256;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("as")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1990141433
	)
	int field269;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = 5730192099342694241L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -759666385
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1459435157
	)
	int field263;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 406735441
	)
	int field255;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = -1008558277599236663L
	)
	long field274;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1673713699
	)
	int field266;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1404900599
	)
	int field267;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -313121805
	)
	int field268;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 7158173732442743367L
	)
	long field257;
	@ObfuscatedName("az")
	boolean field270;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 2056039053
	)
	int field271;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "[Lbb;"
	)
	PcmStream[] field272;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "[Lbb;"
	)
	PcmStream[] field273;

	protected PcmPlayer() {
		this.field269 = 32;
		this.timeMs = RouteStrategy.method5439();
		this.field274 = 0L;
		this.field266 = 0;
		this.field267 = 0;
		this.field268 = 0;
		this.field257 = 0L;
		this.field270 = true;
		this.field271 = 0;
		this.field272 = new PcmStream[8];
		this.field273 = new PcmStream[8];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-440470205"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "12"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "390833047"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("au")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-95270992"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "29"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lbb;B)V",
		garbageValue = "-58"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1441250216"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = RouteStrategy.method5439();

			try {
				if (this.field274 != 0L) {
					if (var1 < this.field274) {
						return;
					}

					this.open(this.capacity);
					this.field274 = 0L;
					this.field270 = true;
				}

				int var3 = this.position();
				if (this.field268 - var3 > this.field266) {
					this.field266 = this.field268 - var3;
				}

				int var4 = this.field255 + this.field263;
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
					this.field270 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field255 = var4 - this.field263;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field257) {
					if (!this.field270) {
						if (this.field266 == 0 && this.field267 == 0) {
							this.close();
							this.field274 = var1 + 2000L;
							return;
						}

						this.field255 = Math.min(this.field267, this.field266);
						this.field267 = this.field266;
					} else {
						this.field270 = false;
					}

					this.field266 = 0;
					this.field257 = 2000L + var1;
				}

				this.field268 = var3;
			} catch (Exception var7) {
				this.close();
				this.field274 = 2000L + var1;
			}

			try {
				if (var1 > this.timeMs + 500000L) {
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) {
					this.skip(256);
					this.timeMs += (long)(256000 / class511.field5136);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1823126824"
	)
	public final void method750() {
		this.field270 = true;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "422378971"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field270 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field274 = RouteStrategy.method5439() + 2000L;
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-32"
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
				WorldMapRectangle.soundSystemExecutor.shutdownNow();
				WorldMapRectangle.soundSystemExecutor = null;
				soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1082056936"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field271 -= var1;
		if (this.field271 < 0) {
			this.field271 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("bc")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (HttpContentType.PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class448.clearIntArray(var1, 0, var3);
		this.field271 -= var2;
		if (this.stream != null && this.field271 <= 0) {
			this.field271 += class511.field5136 >> 4;
			class166.PcmStream_disable(this.stream);
			this.method752(this.stream, this.stream.vmethod1015());
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
						PcmStream var11 = this.field272[var7];

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
									int var13 = var11.vmethod6461();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field269) {
										break label108;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field329; var14 != null; var14 = var11.nextSubStream()) {
											this.method752(var14, var15 * var14.vmethod1015() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field272[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field273[var7] = var10;
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
				PcmStream var16 = this.field272[var6];
				PcmStream[] var17 = this.field272;
				this.field273[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field271 < 0) {
			this.field271 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = RouteStrategy.method5439();
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lbb;II)V",
		garbageValue = "-1452551124"
	)
	final void method752(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field273[var3];
		if (var4 == null) {
			this.field272[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field273[var3] = var1;
		var1.field329 = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZB)[B",
		garbageValue = "1"
	)
	public static byte[] method798(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var6 = (byte[])((byte[])var0);
			if (var1) {
				int var4 = var6.length;
				byte[] var5 = new byte[var4];
				System.arraycopy(var6, 0, var5, 0, var4);
				return var5;
			} else {
				return var6;
			}
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([FIFB)F",
		garbageValue = "23"
	)
	static float method803(float[] var0, int var1, float var2) {
		float var3 = var0[var1];

		for (int var4 = var1 - 1; var4 >= 0; --var4) {
			var3 = var2 * var3 + var0[var4];
		}

		return var3;
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ldy;I)V",
		garbageValue = "1814638172"
	)
	static final void method801(WorldView var0) {
		for (GraphicsObject var1 = (GraphicsObject)var0.graphicsObjects.last(); var1 != null; var1 = (GraphicsObject)var0.graphicsObjects.previous()) {
			if (var0.plane == var1.plane && !var1.isFinished) {
				if (Client.cycle >= var1.cycleStart) {
					var1.advance(Client.graphicsCycle);
					if (var1.isFinished) {
						var1.remove();
					} else {
						var0.scene.drawEntity(var1.plane, var1.x, var1.y, var1.z, 60, var1, 0, -1L, false);
					}
				}
			} else {
				var1.remove();
			}
		}

	}
}
