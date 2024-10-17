import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("pcmPlayerProvider")
	public static class51 pcmPlayerProvider;
	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("af")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1123588325
	)
	int field258;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 4554423640830226331L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1085729113
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 904133821
	)
	int field263;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1174494273
	)
	int field268;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = -5222918417860129227L
	)
	long field262;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1549083179
	)
	int field264;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 708124981
	)
	int field265;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -628727583
	)
	int field266;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = -779758542634195683L
	)
	long field267;
	@ObfuscatedName("ah")
	boolean field261;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 372128791
	)
	int field255;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "[Lbg;"
	)
	PcmStream[] field270;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "[Lbg;"
	)
	PcmStream[] field271;

	protected PcmPlayer() {
		this.field258 = 32;
		this.timeMs = class77.method2338();
		this.field262 = 0L;
		this.field264 = 0;
		this.field265 = 0;
		this.field266 = 0;
		this.field267 = 0L;
		this.field261 = true;
		this.field255 = 0;
		this.field270 = new PcmStream[8];
		this.field271 = new PcmStream[8];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-145621942"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "78"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("aj")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "102"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1701757798"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lbg;B)V",
		garbageValue = "62"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-38"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = class77.method2338();

			try {
				if (this.field262 != 0L) {
					if (var1 < this.field262) {
						return;
					}

					this.open(this.capacity);
					this.field262 = 0L;
					this.field261 = true;
				}

				int var3 = this.position();
				if (this.field266 - var3 > this.field264) {
					this.field264 = this.field266 - var3;
				}

				int var4 = this.field263 + this.field268;
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
					this.field261 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field268 = var4 - this.field263;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field267) {
					if (!this.field261) {
						if (this.field264 == 0 && this.field265 == 0) {
							this.close();
							this.field262 = 2000L + var1;
							return;
						}

						this.field268 = Math.min(this.field265, this.field264);
						this.field265 = this.field264;
					} else {
						this.field261 = false;
					}

					this.field264 = 0;
					this.field267 = 2000L + var1;
				}

				this.field266 = var3;
			} catch (Exception var7) {
				this.close();
				this.field262 = 2000L + var1;
			}

			try {
				if (var1 > 500000L + this.timeMs) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(256);
					this.timeMs += (long)(256000 / (ArchiveLoader.field1059 * -336955471));
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1630142664"
	)
	public final void method785() {
		this.field261 = true;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1740557638"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field261 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field262 = class77.method2338() + 2000L;
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1624144795"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (AccessFile.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == AccessFile.soundSystem.players[var2]) {
					AccessFile.soundSystem.players[var2] = null;
				}

				if (AccessFile.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				class6.soundSystemExecutor.shutdownNow();
				class6.soundSystemExecutor = null;
				AccessFile.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field255 -= var1;
		if (this.field255 < 0) {
			this.field255 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("bv")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (class550.PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class451.clearIntArray(var1, 0, var3);
		this.field255 -= var2;
		if (this.stream != null && this.field255 <= 0) {
			this.field255 += ArchiveLoader.field1059 * -336955471 >> 4;
			class328.PcmStream_disable(this.stream);
			this.method790(this.stream, this.stream.vmethod1061());
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
						PcmStream var11 = this.field270[var7];

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
									int var13 = var11.vmethod6791();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field258) {
										break label108;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field326; var14 != null; var14 = var11.nextSubStream()) {
											this.method790(var14, var15 * var14.vmethod1061() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field270[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field271[var7] = var10;
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
				PcmStream var16 = this.field270[var6];
				PcmStream[] var17 = this.field270;
				this.field271[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field255 < 0) {
			this.field255 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = class77.method2338();
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lbg;II)V",
		garbageValue = "-1982858633"
	)
	final void method790(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field271[var3];
		if (var4 == null) {
			this.field270[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field271[var3] = var1;
		var1.field326 = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(CB)B",
		garbageValue = "25"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			var1 = (byte)var0;
		} else if (var0 == 8364) {
			var1 = -128;
		} else if (var0 == 8218) {
			var1 = -126;
		} else if (var0 == 402) {
			var1 = -125;
		} else if (var0 == 8222) {
			var1 = -124;
		} else if (var0 == 8230) {
			var1 = -123;
		} else if (var0 == 8224) {
			var1 = -122;
		} else if (var0 == 8225) {
			var1 = -121;
		} else if (var0 == 710) {
			var1 = -120;
		} else if (var0 == 8240) {
			var1 = -119;
		} else if (var0 == 352) {
			var1 = -118;
		} else if (var0 == 8249) {
			var1 = -117;
		} else if (var0 == 338) {
			var1 = -116;
		} else if (var0 == 381) {
			var1 = -114;
		} else if (var0 == 8216) {
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110;
		} else if (var0 == 8220) {
			var1 = -109;
		} else if (var0 == 8221) {
			var1 = -108;
		} else if (var0 == 8226) {
			var1 = -107;
		} else if (var0 == 8211) {
			var1 = -106;
		} else if (var0 == 8212) {
			var1 = -105;
		} else if (var0 == 732) {
			var1 = -104;
		} else if (var0 == 8482) {
			var1 = -103;
		} else if (var0 == 353) {
			var1 = -102;
		} else if (var0 == 8250) {
			var1 = -101;
		} else if (var0 == 339) {
			var1 = -100;
		} else if (var0 == 382) {
			var1 = -98;
		} else if (var0 == 376) {
			var1 = -97;
		} else {
			var1 = 63;
		}

		return var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpe;I)V",
		garbageValue = "-1865596444"
	)
	public static void method839(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0;
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1369773461"
	)
	static void method833() {
		Client.field596 = true;
		if (class508.varcs != null && class508.varcs.hasUnwrittenChanges()) {
			class508.varcs.write();
		}

		class147.method3554();
		Language.method7860();
		if (IgnoreList.mouseRecorder != null) {
			IgnoreList.mouseRecorder.isRunning = false;
		}

		IgnoreList.mouseRecorder = null;
		Client.packetWriter.close();
		if (GameEngine.taskHandler != null) {
			try {
				GameEngine.taskHandler.close();
			} catch (Exception var2) {
			}
		}

		GameEngine.taskHandler = null;
		WorldView.clear();
		class168.method3777();
		Client.worldViewManager.clear();
		LoginState.worldMap = null;
		class167.method3766(0, 0);
		class182.method3872();
		Client.playingJingle = false;
		class289.method6205();
		if (DynamicObject.pcmPlayer1 != null) {
			DynamicObject.pcmPlayer1.shutdown();
		}

		class376.field4123.method7714();
		class139.method3489();
		if (class278.urlRequester != null) {
			class278.urlRequester.close();
		}

		AsyncRestClient.method178();
		JagexCache.JagexCache_dat2File = null;
		JagexCache.JagexCache_idx255File = null;
		UserComparator6.JagexCache_idxFiles = null;
		SoundSystem.method859();
		WorldMapElement.masterDisk = null;
		Client.archiveLoaders.clear();
		Client.field741 = 0;
		class376.field4123 = new JagNetThread();
		class278.urlRequester = new SecureUrlRequester(Projectile.client.https, 226);

		try {
			PendingSpawn.method2712("oldschool", class147.field1688, StructComposition.field2141.name, 0, 23);
		} catch (IOException var1) {
			throw new RuntimeException(var1);
		}

		WorldMapElement.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		GameEngine.taskHandler = new TaskHandler();
		Projectile.client.method511();
		class434.method8371(class95.field1165);
		BuddyRankComparator.updateGameState(0);
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1122824243"
	)
	static final void method835() {
		FloorOverlayDefinition.method4353(UserComparator10.field1521, HttpMethod.field34, IgnoreList.field4983);
		class138.method3480(ClientPreferences.field1339, GrandExchangeOfferAgeComparator.field4651);
		if (UserComparator10.field1521 == AsyncHttpResponse.cameraX && HttpMethod.field34 == FloorOverlayDefinition.cameraY && PlayerType.cameraZ == IgnoreList.field4983 && ClientPreferences.field1339 == class323.cameraPitch && GrandExchangeOfferAgeComparator.field4651 == class390.cameraYaw) {
			Client.field748 = false;
			Client.isCameraLocked = false;
			Client.field648 = false;
			Client.field738 = false;
			GrandExchangeOfferOwnWorldComparator.field468 = 0;
			class390.field4583 = 0;
			HorizontalAlignment.field1997 = 0;
			class150.field1701 = 0;
			class364.field4043 = 0;
			HttpResponse.field82 = 0;
			Message.field461 = 0;
			ClanChannel.field1843 = 0;
			UserComparator6.field1525 = 0;
			class319.field3307 = 0;
			Client.field761 = null;
			Client.field763 = null;
			Client.field504 = null;
		}

	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Ldn;Ldo;I)V",
		garbageValue = "-932829615"
	)
	static final void method838(WorldView var0, PendingSpawn var1) {
		Scene var2 = var0.scene;
		long var3 = 0L;
		int var5 = -1;
		int var6 = 0;
		int var7 = 0;
		if (var1.type == 0) {
			var3 = var2.getBoundaryObjectTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 1) {
			var3 = var2.getWallDecorationTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 2) {
			var3 = var2.getGameObjectTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 3) {
			var3 = var2.getFloorDecorationTag(var1.plane, var1.x, var1.y);
		}

		if (0L != var3) {
			int var8 = var2.getObjectFlags(var1.plane, var1.x, var1.y, var3);
			var5 = class309.Entity_unpackID(var3);
			var6 = var8 & 31;
			var7 = var8 >> 6 & 3;
		}

		var1.objectId = var5;
		var1.field1204 = var6;
		var1.field1202 = var7;
	}
}
