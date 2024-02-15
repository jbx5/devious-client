import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bf")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 345499435
	)
	public static int field295;
	@ObfuscatedName("as")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("az")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("af")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lbj;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1666009421
	)
	int field285;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = 7904803181192803033L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -57612285
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1722443599
	)
	int field288;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 185087089
	)
	int field279;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -5103555793324550579L
	)
	long field290;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2127435563
	)
	int field291;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -927399077
	)
	int field292;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1628734865
	)
	int field293;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 1679271652544265673L
	)
	long field294;
	@ObfuscatedName("ap")
	boolean field298;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -474525305
	)
	int field284;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "[Lbj;"
	)
	PcmStream[] field283;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "[Lbj;"
	)
	PcmStream[] field289;

	protected PcmPlayer() {
		this.field285 = 32;
		this.timeMs = SecureRandomCallable.method2320();
		this.field290 = 0L;
		this.field291 = 0;
		this.field292 = 0;
		this.field293 = 0;
		this.field294 = 0L;
		this.field298 = true;
		this.field284 = 0;
		this.field283 = new PcmStream[8];
		this.field289 = new PcmStream[8];
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "19"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-51"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "810849571"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("ai")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-114"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1411350214"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lbj;I)V",
		garbageValue = "-1154054246"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1197971386"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = SecureRandomCallable.method2320();

			try {
				if (0L != this.field290) {
					if (var1 < this.field290) {
						return;
					}

					this.open(this.capacity);
					this.field290 = 0L;
					this.field298 = true;
				}

				int var3 = this.position();
				if (this.field293 - var3 > this.field291) {
					this.field291 = this.field293 - var3;
				}

				int var4 = this.field288 + this.field279;
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
					this.field298 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field279 = var4 - this.field288;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field294) {
					if (!this.field298) {
						if (this.field291 == 0 && this.field292 == 0) {
							this.close();
							this.field290 = 2000L + var1;
							return;
						}

						this.field279 = Math.min(this.field292, this.field291);
						this.field292 = this.field291;
					} else {
						this.field298 = false;
					}

					this.field291 = 0;
					this.field294 = 2000L + var1;
				}

				this.field293 = var3;
			} catch (Exception var7) {
				this.close();
				this.field290 = var1 + 2000L;
			}

			try {
				if (var1 > this.timeMs + 500000L) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(256);
					this.timeMs += (long)(256000 / field295);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "76"
	)
	public final void method741() {
		this.field298 = true;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-82"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field298 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field290 = SecureRandomCallable.method2320() + 2000L;
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-21100"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (class27.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == class27.soundSystem.players[var2]) {
					class27.soundSystem.players[var2] = null;
				}

				if (class27.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				soundSystemExecutor.shutdownNow();
				soundSystemExecutor = null;
				class27.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1435517864"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field284 -= var1;
		if (this.field284 < 0) {
			this.field284 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("bq")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class428.clearIntArray(var1, 0, var3);
		this.field284 -= var2;
		if (this.stream != null && this.field284 <= 0) {
			this.field284 += field295 >> 4;
			class60.PcmStream_disable(this.stream);
			this.method781(this.stream, this.stream.vmethod1014());
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
						PcmStream var11 = this.field283[var7];

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
									int var13 = var11.vmethod6346();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field285) {
										break label107;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field348; var14 != null; var14 = var11.nextSubStream()) {
											this.method781(var14, var15 * var14.vmethod1014() >> 8);
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
										this.field289[var7] = var10;
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
				this.field289[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field284 < 0) {
			this.field284 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = SecureRandomCallable.method2320();
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lbj;IB)V",
		garbageValue = "1"
	)
	final void method781(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field289[var3];
		if (var4 == null) {
			this.field283[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field289[var3] = var1;
		var1.field348 = var2;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1753341754"
	)
	static int method790(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		DbTable var6;
		int var7;
		if (var0 != ScriptOpcodes.DB_FIND_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND) {
			if (var0 != ScriptOpcodes.DB_FINDNEXT) {
				int var19;
				int var20;
				if (var0 == ScriptOpcodes.DB_GETFIELD) {
					Interpreter.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					var20 = class133.method3115(var19);
					var7 = class227.method4423(var19);
					int var21 = class167.method3503(var19);
					DbRowType var26 = FadeOutTask.getDbRowType(var3);
					DbTableType var27 = WorldMapScaleHandler.getDbTableType(var20);
					int[] var28 = var27.types[var7];
					int var12 = 0;
					int var13 = var28.length;
					if (var21 >= 0) {
						if (var21 >= var13) {
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13);
						}

						var12 = var21;
						var13 = var21 + 1;
					}

					Object[] var14 = var26.getColumnType(var7);
					if (var14 == null && var27.defaultValues != null) {
						var14 = var27.defaultValues[var7];
					}

					int var15;
					int var16;
					if (var14 == null) {
						for (var15 = var12; var15 < var13; ++var15) {
							var16 = var28[var15];
							class521 var22 = class297.method5966(var16);
							if (var22 == class521.field5126) {
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class383.method7273(var16);
							}
						}

						return 1;
					} else {
						var15 = var14.length / var28.length;
						if (var5 >= 0 && var5 < var15) {
							for (var16 = var12; var16 < var13; ++var16) {
								int var17 = var16 + var28.length * var5;
								class521 var18 = class297.method5966(var28[var16]);
								if (var18 == class521.field5126) {
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)var14[var17];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == ScriptOpcodes.DB_GETFIELDCOUNT) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = 0;
					var20 = class133.method3115(var19);
					var7 = class227.method4423(var19);
					DbRowType var25 = FadeOutTask.getDbRowType(var3);
					DbTableType var9 = WorldMapScaleHandler.getDbTableType(var20);
					int[] var10 = var9.types[var7];
					Object[] var11 = var25.getColumnType(var7);
					if (var11 == null && var9.defaultValues != null) {
						var11 = var9.defaultValues[var7];
					}

					if (var11 != null) {
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
					return 1;
				} else if (var0 != ScriptOpcodes.DB_FINDALL_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND_FILTER) {
					if (var0 == ScriptOpcodes.DB_GETROWTABLE) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						DbRowType var24 = FadeOutTask.getDbRowType(var3);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var24.tableId;
						return 1;
					} else if (var0 == ScriptOpcodes.DB_GETROW) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var19 = -1;
						if (class173.field1847 != null && var3 >= 0 && var3 < class173.field1847.size()) {
							var19 = (Integer)class173.field1847.get(var3);
						}

						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var19;
						return 1;
					} else if (var0 != ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT && var0 != ScriptOpcodes.DB_FINDALL) {
						return 2;
					} else {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = class319.method6108(var3);
						var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var6 = ModelData0.getDbTable(var5);
						if (var6 == null) {
							throw new RuntimeException();
						} else if (class133.method3115(var5) != Client.field824) {
							throw new RuntimeException();
						} else if (class173.field1847 == null && class173.field1847.isEmpty()) {
							throw new RuntimeException();
						} else {
							var7 = class167.method3503(var5);
							List var8 = var6.method9370(var4, var7);
							class173.field1847 = new LinkedList(class173.field1847);
							if (var8 != null) {
								class173.field1847.retainAll(var8);
							} else {
								class173.field1847.clear();
							}

							Timer.field4675 = class173.field1847.iterator();
							if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class173.field1847.size();
							}

							return 1;
						}
					}
				} else {
					--Interpreter.Interpreter_intStackSize;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					DbTable var23 = DelayFadeTask.method7998(var3);
					if (var23 == null) {
						throw new RuntimeException();
					} else {
						class173.field1847 = var23.method9370(0, 0);
						var5 = 0;
						if (class173.field1847 != null) {
							Client.field824 = var3;
							Timer.field4675 = class173.field1847.iterator();
							var5 = class173.field1847.size();
						}

						if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
						}

						return 1;
					}
				}
			} else {
				if (Timer.field4675 != null && Timer.field4675.hasNext()) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)Timer.field4675.next();
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
				}

				return 1;
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			var4 = class319.method6108(var3);
			var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			var6 = ModelData0.getDbTable(var5);
			if (var6 == null) {
				throw new RuntimeException();
			} else {
				var7 = class167.method3503(var5);
				class173.field1847 = var6.method9370(var4, var7);
				if (class173.field1847 != null) {
					Client.field824 = class133.method3115(var5);
					Timer.field4675 = class173.field1847.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class173.field1847.size();
					}
				} else {
					Client.field824 = -1;
					Timer.field4675 = null;
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)Z",
		garbageValue = "-1595987533"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}
