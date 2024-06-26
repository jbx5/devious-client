import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 228258009
	)
	public static int field263;
	@ObfuscatedName("av")
	@Export("soundSystemExecutor")
	public static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("soundSystem")
	public static SoundSystem soundSystem;
	@ObfuscatedName("az")
	@Export("samples")
	public int[] samples;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1310725203
	)
	int field267;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -6736315824041076637L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1554328633
	)
	@Export("capacity")
	public int capacity;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1832230557
	)
	public int field270;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -945699819
	)
	int field271;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = 4914575348622821863L
	)
	long field281;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1128975809
	)
	int field273;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -31211881
	)
	int field274;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -613062825
	)
	int field275;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = -4744642679061521139L
	)
	long field264;
	@ObfuscatedName("ar")
	boolean field282;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 494305069
	)
	int field279;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "[Lbk;"
	)
	PcmStream[] field272;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "[Lbk;"
	)
	PcmStream[] field277;

	public PcmPlayer() {
		this.field267 = 32;
		this.timeMs = WorldMapData_1.method4861();
		this.field281 = 0L;
		this.field273 = 0;
		this.field274 = 0;
		this.field275 = 0;
		this.field264 = 0L;
		this.field282 = true;
		this.field279 = 0;
		this.field272 = new PcmStream[8];
		this.field277 = new PcmStream[8];
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1354681235"
	)
	@Export("init")
	public void init() throws Exception {
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-44"
	)
	@Export("open")
	public void open(int var1) throws Exception {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("ak")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-761877080"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "56"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lbk;I)V",
		garbageValue = "-1119313536"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1613233697"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = WorldMapData_1.method4861();

			try {
				if (0L != this.field281) {
					if (var1 < this.field281) {
						return;
					}

					this.open(this.capacity);
					this.field281 = 0L;
					this.field282 = true;
				}

				int var3 = this.position();
				if (this.field275 - var3 > this.field273) {
					this.field273 = this.field275 - var3;
				}

				int var4 = this.field270 + this.field271;
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
						this.field271 = var4 - this.field270;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field264) {
					if (!this.field282) {
						if (this.field273 == 0 && this.field274 == 0) {
							this.close();
							this.field281 = 2000L + var1;
							return;
						}

						this.field271 = Math.min(this.field274, this.field273);
						this.field274 = this.field273;
					} else {
						this.field282 = false;
					}

					this.field273 = 0;
					this.field264 = var1 + 2000L;
				}

				this.field275 = var3;
			} catch (Exception var7) {
				this.close();
				this.field281 = 2000L + var1;
			}

			try {
				if (var1 > this.timeMs + 500000L) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(256);
					this.timeMs += (long)(256000 / field263);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1775154545"
	)
	public final void method841() {
		this.field282 = true;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1317614118"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field282 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field281 = WorldMapData_1.method4861() + 2000L;
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-198329887"
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
				soundSystemExecutor.shutdownNow();
				soundSystemExecutor = null;
				soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "138550330"
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

	@ObfuscatedName("bg")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (SecureRandomFuture.PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class447.clearIntArray(var1, 0, var3);
		this.field279 -= var2;
		if (this.stream != null && this.field279 <= 0) {
			this.field279 += field263 >> 4;
			class30.PcmStream_disable(this.stream);
			this.method802(this.stream, this.stream.vmethod1052());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label109:
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

						label103:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label103;
								}

								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod6390();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field267) {
										break label109;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field331; var14 != null; var14 = var11.nextSubStream()) {
											this.method802(var14, var15 * var14.vmethod1052() >> 8);
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
										this.field277[var7] = var10;
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
				this.field277[var6] = null;

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

		this.timeMs = WorldMapData_1.method4861();
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lbk;II)V",
		garbageValue = "-1031606940"
	)
	final void method802(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field277[var3];
		if (var4 == null) {
			this.field272[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field277[var3] = var1;
		var1.field331 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhq;",
		garbageValue = "88"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else if (KitDefinition.KitDefinition_archive == null) {
			return null;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;B)V",
		garbageValue = "1"
	)
	public static void method855(AbstractArchive var0) {
		class421.ParamDefinition_archive = var0;
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIZI)V",
		garbageValue = "1398931861"
	)
	@Export("addTileItemToGroundItems")
	static void addTileItemToGroundItems(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		TileItem var10 = new TileItem();
		var10.id = var3;
		var10.quantity = var4;
		var10.setFlag(var5);
		var10.visibleTime = Client.serverCycle + var6;
		var10.despawnTime = var7 + Client.serverCycle;
		var10.ownership = var8;
		var10.isPrivate = var9;
		if (HttpResponse.worldView.groundItems[var0][var1][var2] == null) {
			HttpResponse.worldView.groundItems[var0][var1][var2] = new NodeDeque();
		}

		HttpResponse.worldView.groundItems[var0][var1][var2].addFirst(var10);
		WorldMapRenderer.updateItemPile(var0, var1, var2);
	}
}
