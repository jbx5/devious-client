import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bz")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1578400357
	)
	public static int field270;
	@ObfuscatedName("aq")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("at")
	@Export("soundSystemExecutor")
	public static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("pcmPlayerProvider")
	public static class51 pcmPlayerProvider;
	@ObfuscatedName("ap")
	@Export("samples")
	public int[] samples;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1982115239
	)
	int field277;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = -3638405484091574507L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -346835411
	)
	@Export("capacity")
	public int capacity;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1081630887
	)
	public int field279;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1815483087
	)
	int field269;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 2411520514733183893L
	)
	long field271;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 430313417
	)
	int field272;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2113819299
	)
	int field273;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -201425607
	)
	int field274;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = 169485058503496869L
	)
	long field266;
	@ObfuscatedName("ak")
	boolean field276;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 771669979
	)
	int field260;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "[Lbk;"
	)
	PcmStream[] field278;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "[Lbk;"
	)
	PcmStream[] field275;

	public PcmPlayer() {
		this.field277 = 32;
		this.timeMs = WorldMapElement.method3843();
		this.field271 = 0L;
		this.field272 = 0;
		this.field273 = 0;
		this.field274 = 0;
		this.field266 = 0L;
		this.field276 = true;
		this.field260 = 0;
		this.field278 = new PcmStream[8];
		this.field275 = new PcmStream[8];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "553204875"
	)
	@Export("init")
	public void init() throws Exception {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-761853986"
	)
	@Export("open")
	public void open(int var1) throws Exception {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1581364414"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("am")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1825559718"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-47"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lbk;I)V",
		garbageValue = "-486249466"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = WorldMapElement.method3843();

			try {
				if (0L != this.field271) {
					if (var1 < this.field271) {
						return;
					}

					this.open(this.capacity);
					this.field271 = 0L;
					this.field276 = true;
				}

				int var3 = this.position();
				if (this.field274 - var3 > this.field272) {
					this.field272 = this.field274 - var3;
				}

				int var4 = this.field279 + this.field269;
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
					this.field276 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field269 = var4 - this.field279;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field266) {
					if (!this.field276) {
						if (this.field272 == 0 && this.field273 == 0) {
							this.close();
							this.field271 = 2000L + var1;
							return;
						}

						this.field269 = Math.min(this.field273, this.field272);
						this.field273 = this.field272;
					} else {
						this.field276 = false;
					}

					this.field272 = 0;
					this.field266 = var1 + 2000L;
				}

				this.field274 = var3;
			} catch (Exception var7) {
				this.close();
				this.field271 = 2000L + var1;
			}

			try {
				if (var1 > this.timeMs + 500000L) {
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) {
					this.skip(256);
					this.timeMs += (long)(256000 / field270);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-892591947"
	)
	public final void method791() {
		this.field276 = true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-64"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field276 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field271 = WorldMapElement.method3843() + 2000L;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1150308250"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (ConcurrentMidiTask.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == ConcurrentMidiTask.soundSystem.players[var2]) {
					ConcurrentMidiTask.soundSystem.players[var2] = null;
				}

				if (ConcurrentMidiTask.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				soundSystemExecutor.shutdownNow();
				soundSystemExecutor = null;
				ConcurrentMidiTask.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "369833428"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field260 -= var1;
		if (this.field260 < 0) {
			this.field260 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("bn")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class450.clearIntArray(var1, 0, var3);
		this.field260 -= var2;
		if (this.stream != null && this.field260 <= 0) {
			this.field260 += field270 >> 4;
			WorldMapSectionType.PcmStream_disable(this.stream);
			this.method807(this.stream, this.stream.vmethod1054());
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
						PcmStream var11 = this.field278[var7];

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
									int var13 = var11.vmethod6731();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field277) {
										break label108;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field334; var14 != null; var14 = var11.nextSubStream()) {
											this.method807(var14, var15 * var14.vmethod1054() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field278[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field275[var7] = var10;
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
				PcmStream var16 = this.field278[var6];
				PcmStream[] var17 = this.field278;
				this.field275[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field260 < 0) {
			this.field260 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = WorldMapElement.method3843();
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lbk;II)V",
		garbageValue = "-1473339744"
	)
	final void method807(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field275[var3];
		if (var4 == null) {
			this.field278[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field275[var3] = var1;
		var1.field334 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1843435875"
	)
	static int method840(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
			var4 = TaskHandler.widgetDefinition.method6841(var3);
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : class464.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			class320.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 3];
			SecureRandomCallable.invalidateWidget(var4);
			class1.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				AsyncHttpResponse.revalidateWidgetScroll(TaskHandler.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			class320.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 3];
			SecureRandomCallable.invalidateWidget(var4);
			class1.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				AsyncHttpResponse.revalidateWidgetScroll(TaskHandler.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				SecureRandomCallable.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-136821139"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		class179.clear();
		Client.worldViewManager.clear();
		Client.playerUpdateManager.method3008();
		Client.field679.method5545();
		System.gc();
		AbstractWorldMapIcon.method6257(0, 0);
		SoundCache.method889();
		Client.playingJingle = false;
		MenuAction.method2299();
		class464.updateGameState(10);
		Client.serverCycle = 0;
		Player.method2610().method4520();
		Player.method2610().method4535();
	}
}
