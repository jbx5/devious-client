import java.util.concurrent.ScheduledExecutorService; import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("up")
	@ObfuscatedSignature(descriptor = 
	"Lnn;")

	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("sg")
	@ObfuscatedGetter(intValue = 
	-1524812773)

	static int field302;
	@ObfuscatedName("n")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("j")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"Lal;")

	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	-1674689975)

	int field289;
	@ObfuscatedName("b")
	@ObfuscatedGetter(longValue = 
	-146289790672909629L)

	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 
	-2098648259)

	@Export("capacity")
	int capacity;
	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 
	901701685)

	int field282;
	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 
	1678649401)

	int field286;
	@ObfuscatedName("q")
	@ObfuscatedGetter(longValue = 
	-962258044052042289L)

	long field287;
	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 
	674233675)

	int field288;
	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 
	327498169)

	int field285;
	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 
	1102402763)

	int field294;
	@ObfuscatedName("t")
	@ObfuscatedGetter(longValue = 
	-8423144863370094901L)

	long field291;
	@ObfuscatedName("i")
	boolean field292;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(intValue = 
	-1149709291)

	int field298;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = 
	"[Lal;")

	PcmStream[] field295;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = 
	"[Lal;")

	PcmStream[] field296;

	protected PcmPlayer() {
		this.field289 = 32;
		this.timeMs = WorldMapSprite.getServerTime();
		this.field287 = 0L;
		this.field288 = 0;
		this.field285 = 0;
		this.field294 = 0;
		this.field291 = 0L;
		this.field292 = true;
		this.field298 = 0;
		this.field295 = new PcmStream[8];
		this.field296 = new PcmStream[8];
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"44")

	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(IS)V", garbageValue = 
	"5561")

	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"0")

	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("g")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1892762612")

	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-476108420")

	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = 
	"(Lal;I)V", garbageValue = 
	"646054771")

	@Export("setStream")
	public synchronized final void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1960857341")

	@Export("run")
	public synchronized final void run() {
		if (this.samples != null) {
			long var1 = WorldMapSprite.getServerTime();

			try {
				if (this.field287 != 0L) {
					if (var1 < this.field287) {
						return;
					}

					this.open(this.capacity);
					this.field287 = 0L;
					this.field292 = true;
				}

				int var3 = this.position();
				if ((this.field294 - var3) > this.field288) {
					this.field288 = this.field294 - var3;
				}

				int var4 = this.field282 + this.field286;
				if ((var4 + 256) > 16384) {
					var4 = 16128;
				}

				if ((var4 + 256) > this.capacity) {
					this.capacity += 1024;
					if (this.capacity > 16384) {
						this.capacity = 16384;
					}

					this.close();
					this.open(this.capacity);
					var3 = 0;
					this.field292 = true;
					if ((var4 + 256) > this.capacity) {
						var4 = this.capacity - 256;
						this.field286 = var4 - this.field282;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				} 

				if (var1 > this.field291) {
					if (!this.field292) {
						if ((this.field288 == 0) && (this.field285 == 0)) {
							this.close();
							this.field287 = var1 + 2000L;
							return;
						}

						this.field286 = Math.min(this.field285, this.field288);
						this.field285 = this.field288;
					} else {
						this.field292 = false;
					}

					this.field288 = 0;
					this.field291 = var1 + 2000L;
				}

				this.field294 = var3;
			} catch (Exception var7) {
				this.close();
				this.field287 = 2000L + var1;
			}

			try {
				if (var1 > (this.timeMs + 500000L)) {
					var1 = this.timeMs;
				}

				while (var1 > (this.timeMs + 5000L)) {
					this.skip(256);
					this.timeMs += ((long) (256000 / SecureRandomFuture.field949));
				} 
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-2105118710")

	public final void method722() {
		this.field292 = true;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"323324362")

	@Export("tryDiscard")
	public synchronized final void tryDiscard() {
		this.field292 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field287 = WorldMapSprite.getServerTime() + 2000L;
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"104")

	@Export("shutdown")
	public synchronized final void shutdown() {
		if (VarpDefinition.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == VarpDefinition.soundSystem.players[var2]) {
					VarpDefinition.soundSystem.players[var2] = null;
				}

				if (VarpDefinition.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				class342.soundSystemExecutor.shutdownNow();
				class342.soundSystemExecutor = null;
				VarpDefinition.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1425453165")

	@Export("skip")
	final void skip(int var1) {
		this.field298 -= var1;
		if (this.field298 < 0) {
			this.field298 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("ax")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class350.clearIntArray(var1, 0, var3);
		this.field298 -= var2;
		if ((this.stream != null) && (this.field298 <= 0)) {
			this.field298 += SecureRandomFuture.field949 >> 4;
			class341.PcmStream_disable(this.stream);
			this.method727(this.stream, this.stream.vmethod968());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label109 : for (
			var6 = 7; var5 != 0; --var6) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = (var5 >>> var7) & 286331153; var9 != 0; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						var10 = null;
						PcmStream var11 = this.field295[var7];

						label103 : while (
						true) {
							while (true) {
								if (var11 == null) {
									break label103;
								}

								AbstractSound var12 = var11.sound;
								if ((var12 != null) && (var12.position > var8)) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod5476();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field289) {
										break label109;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field349; var14 != null; var14 = var11.nextSubStream()) {
											this.method727(var14, (var15 * var14.vmethod968()) >> 8);
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
										this.field296[var7] = var10;
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
				this.field296[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field298 < 0) {
			this.field298 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = WorldMapSprite.getServerTime();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = 
	"(Lal;II)V", garbageValue = 
	"98012473")

	final void method727(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field296[var3];
		if (var4 == null) {
			this.field295[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field296[var3] = var1;
		var1.field349 = var2;
	}

	@ObfuscatedName("n")
	public static int method771(long var0) {
		return ((int) ((var0 >>> 7) & 127L));
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(II)Z", garbageValue = 
	"-291155965")

	public static boolean method772(int var0) {
		return (var0 >= 0) && (var0 < 112) ? KeyHandler.field125[var0] : false;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"1622893485")

	static int method770(int var0, Script var1, boolean var2) {
		if ((var0 >= 7200) && (var0 < 7204)) {
			class295.Interpreter_intStackSize -= 5;
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
			return 1;
		} else if (var0 == 7204) {
			class295.Interpreter_intStackSize -= 6;
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
			return 1;
		} else if ((var0 >= 7205) && (var0 < 7209)) {
			Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7209) {
			class295.Interpreter_intStackSize -= 2;
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
			return 1;
		} else if ((var0 >= 7210) && (var0 < 7214)) {
			--class295.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7214) {
			class295.Interpreter_intStackSize -= 2;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(descriptor = 
	"(Lkn;III)V", garbageValue = 
	"-2138605701")

	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if ((Client.clickedWidget == null) && (!Client.isMenuOpen)) {
			if ((var0 != null) && (DevicePcmPlayerProvider.method381(var0) != null)) {
				Client.clickedWidget = var0;
				Client.clickedWidgetParent = DevicePcmPlayerProvider.method381(var0);
				Client.widgetClickX = var1;
				Client.widgetClickY = var2;
				class136.widgetDragDuration = 0;
				Client.isDraggingWidget = false;
				int var3 = class168.method3324();
				if (var3 != (-1)) {
					PacketWriter.tempMenuAction = new MenuAction();
					PacketWriter.tempMenuAction.param0 = Client.menuArguments1[var3];
					PacketWriter.tempMenuAction.param1 = Client.menuArguments2[var3];
					PacketWriter.tempMenuAction.opcode = Client.menuOpcodes[var3];
					PacketWriter.tempMenuAction.identifier = Client.menuIdentifiers[var3];
					PacketWriter.tempMenuAction.action = Client.menuActions[var3];
				}

			}
		}
	}
}