import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ab")
	static ThreadPoolExecutor field279;
	@ObfuscatedName("ah")
	public static short[] field294;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = 601850613
	)
	static int field296;
	@ObfuscatedName("ap")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -927893663
	)
	int field281;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -6124916407686776029L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -781092137
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 779817765
	)
	int field284;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -63177569
	)
	int field285;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = 3619051364314954007L
	)
	long field282;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1635881985
	)
	int field287;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -117889257
	)
	int field288;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 317305953
	)
	int field289;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 3397901339844606541L
	)
	long field290;
	@ObfuscatedName("ag")
	boolean field286;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1098020825
	)
	int field293;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "[Lba;"
	)
	PcmStream[] field295;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "[Lba;"
	)
	PcmStream[] field298;

	protected PcmPlayer() {
		this.field281 = 32;
		this.timeMs = class129.method3033();
		this.field282 = 0L;
		this.field287 = 0;
		this.field288 = 0;
		this.field289 = 0;
		this.field290 = 0L;
		this.field286 = true;
		this.field293 = 0;
		this.field295 = new PcmStream[8];
		this.field298 = new PcmStream[8];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-85"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1902302382"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("az")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1417939230"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lba;I)V",
		garbageValue = "-1441154437"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1372508670"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = class129.method3033();

			try {
				if (this.field282 != 0L) {
					if (var1 < this.field282) {
						return;
					}

					this.open(this.capacity);
					this.field282 = 0L;
					this.field286 = true;
				}

				int var3 = this.position();
				if (this.field289 - var3 > this.field287) {
					this.field287 = this.field289 - var3;
				}

				int var4 = this.field285 + this.field284;
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
					this.field286 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field285 = var4 - this.field284;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field290) {
					if (!this.field286) {
						if (this.field287 == 0 && this.field288 == 0) {
							this.close();
							this.field282 = var1 + 2000L;
							return;
						}

						this.field285 = Math.min(this.field288, this.field287);
						this.field288 = this.field287;
					} else {
						this.field286 = false;
					}

					this.field287 = 0;
					this.field290 = var1 + 2000L;
				}

				this.field289 = var3;
			} catch (Exception var7) {
				this.close();
				this.field282 = var1 + 2000L;
			}

			try {
				if (var1 > 500000L + this.timeMs) {
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) {
					this.skip(256);
					this.timeMs += (long)(256000 / UserComparator5.field1508);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1636072353"
	)
	public final void method779() {
		this.field286 = true;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1304127248"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field286 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field282 = class129.method3033() + 2000L;
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (HttpMethod.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == HttpMethod.soundSystem.players[var2]) {
					HttpMethod.soundSystem.players[var2] = null;
				}

				if (HttpMethod.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				class213.soundSystemExecutor.shutdownNow();
				class213.soundSystemExecutor = null;
				HttpMethod.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1578944058"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field293 -= var1;
		if (this.field293 < 0) {
			this.field293 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("be")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (JagexCache.PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class446.clearIntArray(var1, 0, var3);
		this.field293 -= var2;
		if (this.stream != null && this.field293 <= 0) {
			this.field293 += UserComparator5.field1508 >> 4;
			ObjectSound.PcmStream_disable(this.stream);
			this.method784(this.stream, this.stream.vmethod1030());
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
						PcmStream var11 = this.field295[var7];

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
									int var13 = var11.vmethod6454();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field281) {
										break label108;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field355; var14 != null; var14 = var11.nextSubStream()) {
											this.method784(var14, var15 * var14.vmethod1030() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field295[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field298[var7] = var10;
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
				PcmStream var16 = this.field295[var6];
				PcmStream[] var17 = this.field295;
				this.field298[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field293 < 0) {
			this.field293 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = class129.method3033();
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lba;II)V",
		garbageValue = "282838317"
	)
	final void method784(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field298[var3];
		if (var4 == null) {
			this.field295[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field298[var3] = var1;
		var1.field355 = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lor;Lor;ZI)V",
		garbageValue = "2097756368"
	)
	public static void method838(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		ObjectComposition.ObjectDefinition_archive = var0;
		class4.ObjectDefinition_modelsArchive = var1;
		ObjectComposition.ObjectDefinition_isLowDetail = var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Lco;",
		garbageValue = "13"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0);
	}
}
