import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bb")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ao")
	@Export("soundSystemExecutor")
	public static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lbw;"
	)
	@Export("soundSystem")
	public static SoundSystem soundSystem;
	@ObfuscatedName("ax")
	@Export("samples")
	public int[] samples;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 544795385
	)
	int field295;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 2923713038662853309L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1811234521
	)
	@Export("capacity")
	public int capacity;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -700999465
	)
	public int field288;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1061162499
	)
	int field289;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -3737012796057226807L
	)
	long field281;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1556259401
	)
	int field291;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 761147211
	)
	int field292;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1186639275
	)
	int field293;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = 5892979677882615623L
	)
	long field294;
	@ObfuscatedName("at")
	boolean field284;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 810684273
	)
	int field285;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "[Lbl;"
	)
	PcmStream[] field298;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "[Lbl;"
	)
	PcmStream[] field283;

	public PcmPlayer() {
		this.field295 = 32;
		this.timeMs = UserComparator9.method2973();
		this.field281 = 0L;
		this.field291 = 0;
		this.field292 = 0;
		this.field293 = 0;
		this.field294 = 0L;
		this.field284 = true;
		this.field285 = 0;
		this.field298 = new PcmStream[8];
		this.field283 = new PcmStream[8];
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "128"
	)
	@Export("init")
	public void init() throws Exception {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-81"
	)
	@Export("open")
	public void open(int var1) throws Exception {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-95"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("aj")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1232699455"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1520596872"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lbl;B)V",
		garbageValue = "22"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2034283035"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = UserComparator9.method2973();

			try {
				if (this.field281 != 0L) {
					if (var1 < this.field281) {
						return;
					}

					this.open(this.capacity);
					this.field281 = 0L;
					this.field284 = true;
				}

				int var3 = this.position();
				if (this.field293 - var3 > this.field291) {
					this.field291 = this.field293 - var3;
				}

				int var4 = this.field289 + this.field288;
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
					this.field284 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field289 = var4 - this.field288;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field294) {
					if (!this.field284) {
						if (this.field291 == 0 && this.field292 == 0) {
							this.close();
							this.field281 = 2000L + var1;
							return;
						}

						this.field289 = Math.min(this.field292, this.field291);
						this.field292 = this.field291;
					} else {
						this.field284 = false;
					}

					this.field291 = 0;
					this.field294 = var1 + 2000L;
				}

				this.field293 = var3;
			} catch (Exception var7) {
				this.close();
				this.field281 = var1 + 2000L;
			}

			try {
				if (var1 > this.timeMs + 500000L) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(256);
					this.timeMs += (long)(256000 / (class189.field1993 * 22050));
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "246556055"
	)
	public final void method845() {
		this.field284 = true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1777076574"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field284 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field281 = UserComparator9.method2973() + 2000L;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1331387146"
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

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-32"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field285 -= var1;
		if (this.field285 < 0) {
			this.field285 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("bd")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (class462.PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class425.clearIntArray(var1, 0, var3);
		this.field285 -= var2;
		if (this.stream != null && this.field285 <= 0) {
			this.field285 += class189.field1993 * 22050 >> 4;
			FloorOverlayDefinition.PcmStream_disable(this.stream);
			this.method814(this.stream, this.stream.vmethod1061());
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
						PcmStream var11 = this.field298[var7];

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
									int var13 = var11.vmethod6281();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field295) {
										break label108;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field353; var14 != null; var14 = var11.nextSubStream()) {
											this.method814(var14, var15 * var14.vmethod1061() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field298[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field283[var7] = var10;
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
				PcmStream var16 = this.field298[var6];
				PcmStream[] var17 = this.field298;
				this.field283[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field285 < 0) {
			this.field285 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = UserComparator9.method2973();
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lbl;II)V",
		garbageValue = "429153206"
	)
	final void method814(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field283[var3];
		if (var4 == null) {
			this.field298[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field283[var3] = var1;
		var1.field353 = var2;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-1767711937"
	)
	static int method860(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
			return 1;
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
					var12 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
					if (class380.grandExchangeEvents != null) {
						class380.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
					var12 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
					if (class380.grandExchangeEvents != null) {
						class380.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
					UserComparator6.Interpreter_intStackSize -= 2;
					var12 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize] == 1;
					boolean var11 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1] == 1;
					if (class380.grandExchangeEvents != null) {
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11;
						class380.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
					var12 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
					if (class380.grandExchangeEvents != null) {
						class380.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
					var12 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
					if (class380.grandExchangeEvents != null) {
						class380.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class380.grandExchangeEvents == null ? 0 : class380.grandExchangeEvents.events.size();
					return 1;
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class380.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.world;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class380.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4.getOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class380.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class380.grandExchangeEvents.events.get(var3);
						long var5 = UserComparator9.method2973() - class17.field74 - var4.age;
						int var7 = (int)(var5 / 3600000L);
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L);
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var10;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class380.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class380.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class380.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id;
						return 1;
					} else if (var0 == 3939) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class341.ItemDefinition_get(var3).isTradable ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIZI)V",
		garbageValue = "-1536525774"
	)
	static void method859(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		TileItem var10 = new TileItem();
		var10.id = var3;
		var10.quantity = var4;
		var10.method2750(var5);
		if (Client.groundItems[var0][var1][var2] == null) {
			Client.groundItems[var0][var1][var2] = new NodeDeque();
		}

		Client.groundItems[var0][var1][var2].addFirst(var10);
		class134.updateItemPile(var0, var1, var2);
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(Luo;B)V",
		garbageValue = "84"
	)
	static final void method846(PacketBuffer var0) {
		var0.importIndex();
		int var1 = var0.readBits(8);
		int var2;
		if (var1 < Client.npcCount) {
			for (var2 = var1; var2 < Client.npcCount; ++var2) {
				Client.field625[++Client.field708 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;

			for (var2 = 0; var2 < var1; ++var2) {
				int var3 = Client.npcIndices[var2];
				NPC var4 = Client.npcs[var3];
				int var5 = var0.readBits(1);
				if (var5 == 0) {
					Client.npcIndices[++Client.npcCount - 1] = var3;
					var4.npcCycle = Client.cycle;
				} else {
					int var6 = var0.readBits(2);
					if (var6 == 0) {
						Client.npcIndices[++Client.npcCount - 1] = var3;
						var4.npcCycle = Client.cycle;
						Client.field603[++Client.field549 - 1] = var3;
					} else {
						int var7;
						int var8;
						if (var6 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var3;
							var4.npcCycle = Client.cycle;
							var7 = var0.readBits(3);
							var4.method2661(var7, class231.field2458);
							var8 = var0.readBits(1);
							if (var8 == 1) {
								Client.field603[++Client.field549 - 1] = var3;
							}
						} else if (var6 == 2) {
							Client.npcIndices[++Client.npcCount - 1] = var3;
							var4.npcCycle = Client.cycle;
							if (var0.readBits(1) == 1) {
								var7 = var0.readBits(3);
								var4.method2661(var7, class231.field2459);
								var8 = var0.readBits(3);
								var4.method2661(var8, class231.field2459);
							} else {
								var7 = var0.readBits(3);
								var4.method2661(var7, class231.field2456);
							}

							var7 = var0.readBits(1);
							if (var7 == 1) {
								Client.field603[++Client.field549 - 1] = var3;
							}
						} else if (var6 == 3) {
							Client.field625[++Client.field708 - 1] = var3;
						}
					}
				}
			}

		}
	}
}
