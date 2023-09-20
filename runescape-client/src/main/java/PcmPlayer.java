import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 911118355
	)
	public static int field306;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("tw")
	static boolean field307;
	@ObfuscatedName("ay")
	@Export("samples")
	public int[] samples;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1263973473
	)
	int field292;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -2154553687402305665L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -140839579
	)
	@Export("capacity")
	public int capacity;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1020036435
	)
	public int field289;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1686523433
	)
	int field299;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 8238266776402452691L
	)
	long field297;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1466732995
	)
	int field298;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -802432147
	)
	int field294;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2014710731
	)
	int field300;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -8003400550630877477L
	)
	long field301;
	@ObfuscatedName("ad")
	boolean field302;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1290381553
	)
	int field303;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "[Lbi;"
	)
	PcmStream[] field296;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "[Lbi;"
	)
	PcmStream[] field305;

	public PcmPlayer() {
		this.field292 = 32;
		this.timeMs = GrandExchangeOfferTotalQuantityComparator.method7049();
		this.field297 = 0L;
		this.field298 = 0;
		this.field294 = 0;
		this.field300 = 0;
		this.field301 = 0L;
		this.field302 = true;
		this.field303 = 0;
		this.field296 = new PcmStream[8];
		this.field305 = new PcmStream[8];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1058566109"
	)
	@Export("init")
	public void init() throws Exception {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("open")
	public void open(int var1) throws Exception {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-325041005"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("ax")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "3331"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lbi;I)V",
		garbageValue = "-1717479669"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1281644299"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = GrandExchangeOfferTotalQuantityComparator.method7049();

			try {
				if (this.field297 != 0L) {
					if (var1 < this.field297) {
						return;
					}

					this.open(this.capacity);
					this.field297 = 0L;
					this.field302 = true;
				}

				int var3 = this.position();
				if (this.field300 - var3 > this.field298) {
					this.field298 = this.field300 - var3;
				}

				int var4 = this.field299 + this.field289;
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
					this.field302 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field299 = var4 - this.field289;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field301) {
					if (!this.field302) {
						if (this.field298 == 0 && this.field294 == 0) {
							this.close();
							this.field297 = var1 + 2000L;
							return;
						}

						this.field299 = Math.min(this.field294, this.field298);
						this.field294 = this.field298;
					} else {
						this.field302 = false;
					}

					this.field298 = 0;
					this.field301 = 2000L + var1;
				}

				this.field300 = var3;
			} catch (Exception var7) {
				this.close();
				this.field297 = var1 + 2000L;
			}

			try {
				if (var1 > 500000L + this.timeMs) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(256);
					this.timeMs += (long)(256000 / field306);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "233937978"
	)
	public final void method780() {
		this.field302 = true;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1063946921"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field302 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field297 = GrandExchangeOfferTotalQuantityComparator.method7049() + 2000L;
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1490878758"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (UserComparator4.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == UserComparator4.soundSystem.players[var2]) {
					UserComparator4.soundSystem.players[var2] = null;
				}

				if (UserComparator4.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				class353.soundSystemExecutor.shutdownNow();
				class353.soundSystemExecutor = null;
				UserComparator4.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1697605758"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field303 -= var1;
		if (this.field303 < 0) {
			this.field303 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("bd")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (class306.PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class424.clearIntArray(var1, 0, var3);
		this.field303 -= var2;
		if (this.stream != null && this.field303 <= 0) {
			this.field303 += field306 >> 4;
			class193.PcmStream_disable(this.stream);
			this.method820(this.stream, this.stream.vmethod1038());
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
									int var13 = var11.vmethod6188();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field292) {
										break label108;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field366; var14 != null; var14 = var11.nextSubStream()) {
											this.method820(var14, var15 * var14.vmethod1038() >> 8);
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
										this.field305[var7] = var10;
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
				this.field305[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field303 < 0) {
			this.field303 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = GrandExchangeOfferTotalQuantityComparator.method7049();
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lbi;IB)V",
		garbageValue = "-119"
	)
	final void method820(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field305[var3];
		if (var4 == null) {
			this.field296[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field305[var3] = var1;
		var1.field366 = var2;
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "13"
	)
	static final void method819() {
		int var0;
		int var1;
		int var2;
		if (!Client.field779) {
			var0 = class191.field1922 * 128 + 64;
			var1 = MouseHandler.field224 * 128 + 64;
			var2 = class115.getTileHeight(var0, var1, class87.Client_plane) - SoundSystem.field323;
			WorldMapSectionType.method5616(var0, var2, var1);
		} else if (Client.field782 != null) {
			Client.cameraX = Client.field782.vmethod8614();
			WorldMapArea.cameraZ = Client.field782.vmethod8622();
			if (Client.field781) {
				class17.cameraY = Client.field782.vmethod8618();
			} else {
				class17.cameraY = class115.getTileHeight(Client.cameraX, WorldMapArea.cameraZ, class87.Client_plane) - Client.field782.vmethod8618();
			}

			Client.field782.method8627();
		}

		if (!Client.field780) {
			var0 = class148.field1663 * 16384 + 64;
			var1 = BufferedNetSocket.field4722 * 16384 + 64;
			var2 = class115.getTileHeight(var0, var1, class87.Client_plane) - class161.field1754;
			int var3 = var0 - Client.cameraX;
			int var4 = var2 - class17.cameraY;
			int var5 = var1 - WorldMapArea.cameraZ;
			int var6 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5));
			int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047;
			int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047;
			Projectile.method2184(var7, var8);
		} else {
			if (Client.field784 != null) {
				class365.cameraPitch = Client.field784.method8611();
				class365.cameraPitch = Math.min(Math.max(class365.cameraPitch, 128), 383);
				Client.field784.method8627();
			}

			if (Client.field783 != null) {
				WallDecoration.cameraYaw = Client.field783.method8611() & 2047;
				Client.field783.method8627();
			}
		}

	}
}
