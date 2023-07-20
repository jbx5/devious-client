import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 125222871
	)
	public static int field314;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -2102660149
	)
	static int field299;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = 334530779
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("ax")
	@Export("samples")
	public int[] samples;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 61437835
	)
	int field301;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -977548067956458725L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1972567701
	)
	@Export("capacity")
	public int capacity;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -440082657
	)
	public int field304;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1827602467
	)
	int field305;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 283027201097119447L
	)
	long field306;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -205332835
	)
	int field307;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 835819537
	)
	int field317;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1967460671
	)
	int field309;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 7219484143483602389L
	)
	long field310;
	@ObfuscatedName("al")
	boolean field308;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -18718451
	)
	int field313;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "[Lby;"
	)
	PcmStream[] field296;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "[Lby;"
	)
	PcmStream[] field312;

	public PcmPlayer() {
		this.field301 = 32;
		this.timeMs = class113.method2835();
		this.field306 = 0L;
		this.field307 = 0;
		this.field317 = 0;
		this.field309 = 0;
		this.field310 = 0L;
		this.field308 = true;
		this.field313 = 0;
		this.field296 = new PcmStream[8];
		this.field312 = new PcmStream[8];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-27916"
	)
	@Export("init")
	public void init() throws Exception {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1387208790"
	)
	@Export("open")
	public void open(int var1) throws Exception {
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-110"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("am")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1310720179"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1294273793"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lby;B)V",
		garbageValue = "46"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1561448166"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = class113.method2835();

			try {
				if (this.field306 != 0L) {
					if (var1 < this.field306) {
						return;
					}

					this.open(this.capacity);
					this.field306 = 0L;
					this.field308 = true;
				}

				int var3 = this.position();
				if (this.field309 - var3 > this.field307) {
					this.field307 = this.field309 - var3;
				}

				int var4 = this.field305 + this.field304;
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
					this.field308 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field305 = var4 - this.field304;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field310) {
					if (!this.field308) {
						if (this.field307 == 0 && this.field317 == 0) {
							this.close();
							this.field306 = var1 + 2000L;
							return;
						}

						this.field305 = Math.min(this.field317, this.field307);
						this.field317 = this.field307;
					} else {
						this.field308 = false;
					}

					this.field307 = 0;
					this.field310 = 2000L + var1;
				}

				this.field309 = var3;
			} catch (Exception var7) {
				this.close();
				this.field306 = var1 + 2000L;
			}

			try {
				if (var1 > 500000L + this.timeMs) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(256);
					this.timeMs += (long)(256000 / field314);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1629205695"
	)
	public final void method783() {
		this.field308 = true;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2090417340"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field308 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field306 = class113.method2835() + 2000L;
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1796457673"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (WorldMapSectionType.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == WorldMapSectionType.soundSystem.players[var2]) {
					WorldMapSectionType.soundSystem.players[var2] = null;
				}

				if (WorldMapSectionType.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				class273.soundSystemExecutor.shutdownNow();
				class273.soundSystemExecutor = null;
				WorldMapSectionType.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "75"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field313 -= var1;
		if (this.field313 < 0) {
			this.field313 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("ba")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (class373.PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class410.clearIntArray(var1, 0, var3);
		this.field313 -= var2;
		if (this.stream != null && this.field313 <= 0) {
			this.field313 += field314 >> 4;
			class345.PcmStream_disable(this.stream);
			this.method788(this.stream, this.stream.vmethod1051());
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
						PcmStream var11 = this.field296[var7];

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
									int var13 = var11.vmethod6028();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field301) {
										break label108;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field376; var14 != null; var14 = var11.nextSubStream()) {
											this.method788(var14, var15 * var14.vmethod1051() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field296[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field312[var7] = var10;
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
				PcmStream var16 = this.field296[var6];
				PcmStream[] var17 = this.field296;
				this.field312[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field313 < 0) {
			this.field313 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = class113.method2835();
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lby;II)V",
		garbageValue = "702268738"
	)
	final void method788(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field312[var3];
		if (var4 == null) {
			this.field296[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field312[var3] = var1;
		var1.field376 = var2;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZZI)Luu;",
		garbageValue = "1707988592"
	)
	static IndexedSprite method780(boolean var0, boolean var1) {
		return var0 ? (var1 ? Message.field504 : class11.options_buttons_2Sprite) : (var1 ? class4.field10 : WorldMapLabelSize.options_buttons_0Sprite);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lcr;",
		garbageValue = "1"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return class419.getNextWorldListWorld();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "1"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + class313.charToByteCp1252(var0.charAt(var3));
		}

		return var2;
	}
}
