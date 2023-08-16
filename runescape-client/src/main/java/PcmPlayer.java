import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -251294299
	)
	public static int field293;
	@ObfuscatedName("ai")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("ap")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1214547985
	)
	static int field296;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("an")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lbw;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2010513145
	)
	int field300;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = 4668505505533220207L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1919941599
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 406112827
	)
	int field303;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1907297993
	)
	int field314;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = -2235654764052402713L
	)
	long field305;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1514301463
	)
	int field306;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 758582745
	)
	int field307;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -993560077
	)
	int field309;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -4227404571919014607L
	)
	long field297;
	@ObfuscatedName("ak")
	boolean field310;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1549070857
	)
	int field294;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "[Lbw;"
	)
	PcmStream[] field315;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "[Lbw;"
	)
	PcmStream[] field316;

	protected PcmPlayer() {
		this.field300 = 32;
		this.timeMs = GameEngine.method661();
		this.field305 = 0L;
		this.field306 = 0;
		this.field307 = 0;
		this.field309 = 0;
		this.field297 = 0L;
		this.field310 = true;
		this.field294 = 0;
		this.field315 = new PcmStream[8];
		this.field316 = new PcmStream[8];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1766369380"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "57"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1982834691"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("at")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1874015336"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lbw;I)V",
		garbageValue = "-828545471"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = GameEngine.method661();

			try {
				if (0L != this.field305) {
					if (var1 < this.field305) {
						return;
					}

					this.open(this.capacity);
					this.field305 = 0L;
					this.field310 = true;
				}

				int var3 = this.position();
				if (this.field309 - var3 > this.field306) {
					this.field306 = this.field309 - var3;
				}

				int var4 = this.field314 + this.field303;
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
					this.field310 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field314 = var4 - this.field303;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field297) {
					if (!this.field310) {
						if (this.field306 == 0 && this.field307 == 0) {
							this.close();
							this.field305 = var1 + 2000L;
							return;
						}

						this.field314 = Math.min(this.field307, this.field306);
						this.field307 = this.field306;
					} else {
						this.field310 = false;
					}

					this.field306 = 0;
					this.field297 = var1 + 2000L;
				}

				this.field309 = var3;
			} catch (Exception var7) {
				this.close();
				this.field305 = 2000L + var1;
			}

			try {
				if (var1 > 500000L + this.timeMs) {
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) {
					this.skip(256);
					this.timeMs += (long)(256000 / field293);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1331437422"
	)
	public final void method804() {
		this.field310 = true;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "30"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field310 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field305 = GameEngine.method661() + 2000L;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-35"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (Canvas.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == Canvas.soundSystem.players[var2]) {
					Canvas.soundSystem.players[var2] = null;
				}

				if (Canvas.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				soundSystemExecutor.shutdownNow();
				soundSystemExecutor = null;
				Canvas.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "9"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field294 -= var1;
		if (this.field294 < 0) {
			this.field294 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("bh")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class409.clearIntArray(var1, 0, var3);
		this.field294 -= var2;
		if (this.stream != null && this.field294 <= 0) {
			this.field294 += field293 >> 4;
			class31.PcmStream_disable(this.stream);
			this.method809(this.stream, this.stream.vmethod1041());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label107:
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
						PcmStream var11 = this.field315[var7];

						label101:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label101;
								}

								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod5973();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field300) {
										break label107;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field371; var14 != null; var14 = var11.nextSubStream()) {
											this.method809(var14, var15 * var14.vmethod1041() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field315[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field316[var7] = var10;
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
				PcmStream var16 = this.field315[var6];
				PcmStream[] var17 = this.field315;
				this.field316[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field294 < 0) {
			this.field294 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = GameEngine.method661();
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lbw;II)V",
		garbageValue = "1754087851"
	)
	final void method809(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field316[var3];
		if (var4 == null) {
			this.field315[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field316[var3] = var1;
		var1.field371 = var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "125"
	)
	public static int method854(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var1 = (int)(var2 >>> 7 & 127L);
		return var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1604258574"
	)
	static void method838(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIIIIB)V",
		garbageValue = "1"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) {
			if (var0 instanceof NPC) {
				NPCComposition var6 = ((NPC)var0).definition;
				if (var6.transforms != null) {
					var6 = var6.transform();
				}

				if (var6 == null) {
					return;
				}
			}

			int var75 = Players.Players_count;
			int[] var7 = Players.Players_indices;
			boolean var8 = var1 < var75;
			int var9 = -2;
			if (var0.overheadText != null && (!var8 || !var0.field1220 && (Client.publicChatMode == 4 || !var0.field1219 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) {
				SecureRandomFuture.method2156(var0, var0.defaultHeight);
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
					Client.overheadTextXOffsets[Client.overheadTextCount] = class59.fontBold12.stringWidth(var0.overheadText) / 2;
					Client.overheadTextAscents[Client.overheadTextCount] = class59.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY - var9;
					Client.overheadTextColors[Client.overheadTextCount] = var0.field1222;
					Client.overheadTextEffects[Client.overheadTextCount] = var0.field1223;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining;
					Client.field535[Client.overheadTextCount] = var0.field1264;
					Client.overheadText[Client.overheadTextCount] = var0.overheadText;
					++Client.overheadTextCount;
					var9 += 12;
				}
			}

			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method7032()) {
				SecureRandomFuture.method2156(var0, var0.defaultHeight + 15);

				for (HealthBar var10 = (HealthBar)var0.healthBars.last(); var10 != null; var10 = (HealthBar)var0.healthBars.previous()) {
					HealthBarUpdate var11 = var10.get(Client.cycle);
					if (var11 == null) {
						if (var10.isEmpty()) {
							var10.remove();
						}
					} else {
						HealthBarDefinition var12 = var10.definition;
						SpritePixels var79 = var12.getBackSprite();
						SpritePixels var83 = var12.getFrontSprite();
						int var84 = 0;
						if (var79 != null && var83 != null) {
							if (var12.widthPadding * 2 < var83.subWidth) {
								var84 = var12.widthPadding;
							}

							var15 = var83.subWidth - var84 * 2;
						} else {
							var15 = var12.width;
						}

						int var81 = 255;
						boolean var85 = true;
						int var86 = Client.cycle - var11.cycle;
						int var87 = var15 * var11.health2 / var12.width;
						int var88;
						int var98;
						if (var11.cycleOffset > var86) {
							var88 = var12.field1998 == 0 ? 0 : var12.field1998 * (var86 / var12.field1998);
							var22 = var15 * var11.health / var12.width;
							var98 = var88 * (var87 - var22) / var11.cycleOffset + var22;
						} else {
							var98 = var87;
							var88 = var11.cycleOffset + var12.int5 - var86;
							if (var12.int3 >= 0) {
								var81 = (var88 << 8) / (var12.int5 - var12.int3);
							}
						}

						if (var11.health2 > 0 && var98 < 1) {
							var98 = 1;
						}

						if (var79 != null && var83 != null) {
							if (var15 == var98) {
								var98 += var84 * 2;
							} else {
								var98 += var84;
							}

							var88 = var79.subHeight;
							var9 += var88;
							var22 = var2 + Client.viewportTempX - (var15 >> 1);
							var23 = var3 + Client.viewportTempY - var9;
							var22 -= var84;
							if (var81 >= 0 && var81 < 255) {
								var79.drawTransAt(var22, var23, var81);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var98, var23 + var88);
								var83.drawTransAt(var22, var23, var81);
							} else {
								var79.drawTransBgAt(var22, var23);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var98, var88 + var23);
								var83.drawTransBgAt(var22, var23);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
							var9 += 2;
						} else {
							var9 += 5;
							if (Client.viewportTempX > -1) {
								var88 = var2 + Client.viewportTempX - (var15 >> 1);
								var22 = var3 + Client.viewportTempY - var9;
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var22, var98, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var98 + var88, var22, var15 - var98, 5, 16711680);
							}

							var9 += 2;
						}
					}
				}
			}

			if (var9 == -2) {
				var9 += 7;
			}

			Player var89;
			if (var8 && var0.playerCycle == Client.cycle && Occluder.method4725((Player)var0)) {
				var89 = (Player)var0;
				if (var8) {
					SecureRandomFuture.method2156(var0, var0.defaultHeight + 15);
					AbstractFont var90 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
					var9 += 4;
					var90.drawCentered(var89.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var9, 16777215, 0);
					var9 += 18;
				}
			}

			if (var8) {
				var89 = (Player)var0;
				if (var89.isHidden) {
					return;
				}

				if (var89.headIconPk != -1 || var89.headIconPrayer != -1) {
					SecureRandomFuture.method2156(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						if (var89.headIconPk != -1) {
							var9 += 25;
							class178.headIconPkSprites[var89.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
						}

						if (var89.headIconPrayer != -1) {
							var9 += 25;
							class502.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) {
					SecureRandomFuture.method2156(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						var9 += ArchiveLoader.headIconHintSprites[1].subHeight;
						ArchiveLoader.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
					}
				}
			} else {
				NPC var91 = (NPC)var0;
				int[] var92 = var91.method2577();
				short[] var93 = var91.method2597();
				if (var93 != null && var92 != null) {
					for (int var13 = 0; var13 < var93.length; ++var13) {
						if (var93[var13] >= 0 && var92[var13] >= 0) {
							long var14 = (long)var92[var13] << 8 | (long)var93[var13];
							SpritePixels var16 = (SpritePixels)Client.archive5.method7781(var14);
							if (var16 == null) {
								SpritePixels[] var17 = WorldMapArchiveLoader.method8495(archive8, var92[var13], 0);
								if (var17 != null && var93[var13] < var17.length) {
									var16 = var17[var93[var13]];
									Client.archive5.method7782(var14, var16);
								}
							}

							if (var16 != null) {
								SecureRandomFuture.method2156(var0, var0.defaultHeight + 15);
								if (Client.viewportTempX > -1) {
									var16.drawTransBgAt(var2 + Client.viewportTempX - (var16.subWidth >> 1), Client.viewportTempY + (var3 - var16.subHeight) - 4);
								}
							}
						}
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
					SecureRandomFuture.method2156(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						ArchiveLoader.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var76 = 0; var76 < 4; ++var76) {
				int var77 = var0.hitSplatCycles[var76];
				int var78 = var0.hitSplatTypes[var76];
				HitSplatDefinition var96 = null;
				int var80 = 0;
				if (var78 >= 0) {
					if (var77 <= Client.cycle) {
						continue;
					}

					var96 = WorldMapCacheName.method5560(var0.hitSplatTypes[var76]);
					var80 = var96.field2161;
					if (var96 != null && var96.transforms != null) {
						var96 = var96.transform();
						if (var96 == null) {
							var0.hitSplatCycles[var76] = -1;
							continue;
						}
					}
				} else if (var77 < 0) {
					continue;
				}

				var15 = var0.hitSplatTypes2[var76];
				HitSplatDefinition var94 = null;
				if (var15 >= 0) {
					var94 = WorldMapCacheName.method5560(var15);
					if (var94 != null && var94.transforms != null) {
						var94 = var94.transform();
					}
				}

				if (var77 - var80 <= Client.cycle) {
					if (var96 == null) {
						var0.hitSplatCycles[var76] = -1;
					} else {
						SecureRandomFuture.method2156(var0, var0.defaultHeight / 2);
						if (Client.viewportTempX > -1) {
							boolean var97 = true;
							if (var76 == 1) {
								Client.viewportTempY -= 20;
							}

							if (var76 == 2) {
								Client.viewportTempX -= 15;
								Client.viewportTempY -= 10;
							}

							if (var76 == 3) {
								Client.viewportTempX += 15;
								Client.viewportTempY -= 10;
							}

							SpritePixels var18 = null;
							SpritePixels var19 = null;
							SpritePixels var20 = null;
							SpritePixels var21 = null;
							var22 = 0;
							var23 = 0;
							int var24 = 0;
							int var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							SpritePixels var30 = null;
							SpritePixels var31 = null;
							SpritePixels var32 = null;
							SpritePixels var33 = null;
							int var34 = 0;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							var18 = var96.method3850();
							int var43;
							if (var18 != null) {
								var22 = var18.subWidth;
								var43 = var18.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var26 = var18.xOffset;
							}

							var19 = var96.method3846();
							if (var19 != null) {
								var23 = var19.subWidth;
								var43 = var19.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var27 = var19.xOffset;
							}

							var20 = var96.method3852();
							if (var20 != null) {
								var24 = var20.subWidth;
								var43 = var20.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var28 = var20.xOffset;
							}

							var21 = var96.method3853();
							if (var21 != null) {
								var25 = var21.subWidth;
								var43 = var21.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var29 = var21.xOffset;
							}

							if (var94 != null) {
								var30 = var94.method3850();
								if (var30 != null) {
									var34 = var30.subWidth;
									var43 = var30.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var38 = var30.xOffset;
								}

								var31 = var94.method3846();
								if (var31 != null) {
									var35 = var31.subWidth;
									var43 = var31.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var39 = var31.xOffset;
								}

								var32 = var94.method3852();
								if (var32 != null) {
									var36 = var32.subWidth;
									var43 = var32.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var40 = var32.xOffset;
								}

								var33 = var94.method3853();
								if (var33 != null) {
									var37 = var33.subWidth;
									var43 = var33.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var41 = var33.xOffset;
								}
							}

							Font var82 = var96.getFont();
							if (var82 == null) {
								var82 = HealthBarUpdate.fontPlain11;
							}

							Font var44;
							if (var94 != null) {
								var44 = var94.getFont();
								if (var44 == null) {
									var44 = HealthBarUpdate.fontPlain11;
								}
							} else {
								var44 = HealthBarUpdate.fontPlain11;
							}

							String var45 = null;
							String var46 = null;
							boolean var47 = false;
							int var48 = 0;
							var45 = var96.getString(var0.hitSplatValues[var76]);
							int var95 = var82.stringWidth(var45);
							if (var94 != null) {
								var46 = var94.getString(var0.hitSplatValues2[var76]);
								var48 = var44.stringWidth(var46);
							}

							int var49 = 0;
							int var50 = 0;
							if (var23 > 0) {
								if (var20 == null && var21 == null) {
									var49 = 1;
								} else {
									var49 = var95 / var23 + 1;
								}
							}

							if (var94 != null && var35 > 0) {
								if (var32 == null && var33 == null) {
									var50 = 1;
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0;
							int var52 = var51;
							if (var22 > 0) {
								var51 += var22;
							}

							var51 += 2;
							int var53 = var51;
							if (var24 > 0) {
								var51 += var24;
							}

							int var54 = var51;
							int var55 = var51;
							int var56;
							if (var23 > 0) {
								var56 = var23 * var49;
								var51 += var56;
								var55 += (var56 - var95) / 2;
							} else {
								var51 += var95;
							}

							var56 = var51;
							if (var25 > 0) {
								var51 += var25;
							}

							int var57 = 0;
							int var58 = 0;
							int var59 = 0;
							int var60 = 0;
							int var61 = 0;
							int var62;
							if (var94 != null) {
								var51 += 2;
								var57 = var51;
								if (var34 > 0) {
									var51 += var34;
								}

								var51 += 2;
								var58 = var51;
								if (var36 > 0) {
									var51 += var36;
								}

								var59 = var51;
								var61 = var51;
								if (var35 > 0) {
									var62 = var50 * var35;
									var51 += var62;
									var61 += (var62 - var48) / 2;
								} else {
									var51 += var48;
								}

								var60 = var51;
								if (var37 > 0) {
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var76] - Client.cycle;
							int var63 = var96.field2159 - var62 * var96.field2159 / var96.field2161;
							int var64 = var62 * var96.field2153 / var96.field2161 + -var96.field2153;
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1));
							int var66 = var3 + Client.viewportTempY - 12 + var64;
							int var67 = var66;
							int var68 = var42 + var66;
							int var69 = var66 + var96.field2163 + 15;
							int var70 = var69 - var82.maxAscent;
							int var71 = var69 + var82.maxDescent;
							if (var70 < var66) {
								var67 = var70;
							}

							if (var71 > var68) {
								var68 = var71;
							}

							int var72 = 0;
							int var73;
							int var74;
							if (var94 != null) {
								var72 = var66 + var94.field2163 + 15;
								var73 = var72 - var44.maxAscent;
								var74 = var72 + var44.maxDescent;
								if (var73 < var67) {
									;
								}

								if (var74 > var68) {
									;
								}
							}

							var73 = 255;
							if (var96.field2147 >= 0) {
								var73 = (var62 << 8) / (var96.field2161 - var96.field2147);
							}

							if (var73 >= 0 && var73 < 255) {
								if (var18 != null) {
									var18.drawTransAt(var65 + var52 - var26, var66, var73);
								}

								if (var20 != null) {
									var20.drawTransAt(var65 + var53 - var28, var66, var73);
								}

								if (var19 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var19.drawTransAt(var74 * var23 + (var54 + var65 - var27), var66, var73);
									}
								}

								if (var21 != null) {
									var21.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var82.drawAlpha(var45, var65 + var55, var69, var96.textColor, 0, var73);
								if (var94 != null) {
									if (var30 != null) {
										var30.drawTransAt(var57 + var65 - var38, var66, var73);
									}

									if (var32 != null) {
										var32.drawTransAt(var58 + var65 - var40, var66, var73);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransAt(var74 * var35 + (var59 + var65 - var39), var66, var73);
										}
									}

									if (var33 != null) {
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var61 + var65, var72, var94.textColor, 0, var73);
								}
							} else {
								if (var18 != null) {
									var18.drawTransBgAt(var65 + var52 - var26, var66);
								}

								if (var20 != null) {
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var19 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var19.drawTransBgAt(var23 * var74 + (var65 + var54 - var27), var66);
									}
								}

								if (var21 != null) {
									var21.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var82.draw(var45, var65 + var55, var69, var96.textColor | -16777216, 0);
								if (var94 != null) {
									if (var30 != null) {
										var30.drawTransBgAt(var57 + var65 - var38, var66);
									}

									if (var32 != null) {
										var32.drawTransBgAt(var58 + var65 - var40, var66);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransBgAt(var74 * var35 + (var65 + var59 - var39), var66);
										}
									}

									if (var33 != null) {
										var33.drawTransBgAt(var65 + var60 - var41, var66);
									}

									var44.draw(var46, var65 + var61, var72, var94.textColor | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "([Lmi;IIIZI)V",
		garbageValue = "-166664235"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				class369.alignWidgetSize(var6, var2, var3, var4);
				WorldMapArea.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}

				if (var6.type == 0) {
					Login.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	}
}
