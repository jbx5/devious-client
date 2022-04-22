import java.lang.management.GarbageCollectorMXBean;
import java.util.concurrent.ScheduledExecutorService; import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("tf")
	@ObfuscatedGetter(intValue = 
	-1674990359)

	static int field294;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	-100861485)

	public static int field268;
	@ObfuscatedName("n")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	-876322285)

	static int field295;
	@ObfuscatedName("ax")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("iw")
	@ObfuscatedSignature(descriptor = 
	"[Lqq;")

	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("k")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"Laf;")

	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 
	219086691)

	int field292;
	@ObfuscatedName("u")
	@ObfuscatedGetter(longValue = 
	7132959178591486869L)

	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 
	-1707278451)

	@Export("capacity")
	int capacity;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	918986377)

	int field289;
	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 
	-1421867195)

	int field279;
	@ObfuscatedName("a")
	@ObfuscatedGetter(longValue = 
	9027155764200073789L)

	long field280;
	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 
	-742253307)

	int field281;
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 
	-220533853)

	int field275;
	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 
	-220706099)

	int field283;
	@ObfuscatedName("z")
	@ObfuscatedGetter(longValue = 
	-5317730937569531851L)

	long field284;
	@ObfuscatedName("h")
	boolean field285;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(intValue = 
	-473229249)

	int field277;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = 
	"[Laf;")

	PcmStream[] field272;
	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = 
	"[Laf;")

	PcmStream[] field290;

	protected PcmPlayer() {
		this.field292 = 32;
		this.timeMs = class136.method2931();
		this.field280 = 0L;
		this.field281 = 0;
		this.field275 = 0;
		this.field283 = 0;
		this.field284 = 0L;
		this.field285 = true;
		this.field277 = 0;
		this.field272 = new PcmStream[8];
		this.field290 = new PcmStream[8];
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-843995592")

	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1651380399")

	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"244839095")

	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("f")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1662003992")

	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1137884684")

	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = 
	"(Laf;I)V", garbageValue = 
	"-1433712556")

	@Export("setStream")
	public synchronized final void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-941854175")

	@Export("run")
	public synchronized final void run() {
		if (this.samples != null) {
			long var1 = class136.method2931();

			try {
				if (this.field280 != 0L) {
					if (var1 < this.field280) {
						return;
					}

					this.open(this.capacity);
					this.field280 = 0L;
					this.field285 = true;
				}

				int var3 = this.position();
				if ((this.field283 - var3) > this.field281) {
					this.field281 = this.field283 - var3;
				}

				int var4 = this.field279 + this.field289;
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
					this.field285 = true;
					if ((var4 + 256) > this.capacity) {
						var4 = this.capacity - 256;
						this.field279 = var4 - this.field289;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				} 

				if (var1 > this.field284) {
					if (!this.field285) {
						if ((this.field281 == 0) && (this.field275 == 0)) {
							this.close();
							this.field280 = var1 + 2000L;
							return;
						}

						this.field279 = Math.min(this.field275, this.field281);
						this.field275 = this.field281;
					} else {
						this.field285 = false;
					}

					this.field281 = 0;
					this.field284 = 2000L + var1;
				}

				this.field283 = var3;
			} catch (Exception var7) {
				this.close();
				this.field280 = 2000L + var1;
			}

			try {
				if (var1 > (500000L + this.timeMs)) {
					var1 = this.timeMs;
				}

				while (var1 > (5000L + this.timeMs)) {
					this.skip(256);
					this.timeMs += ((long) (256000 / field268));
				} 
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1721057511")

	public final void method690() {
		this.field285 = true;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1697875178")

	@Export("tryDiscard")
	public synchronized final void tryDiscard() {
		this.field285 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field280 = class136.method2931() + 2000L;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"1")

	@Export("shutdown")
	public synchronized final void shutdown() {
		if (class6.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == class6.soundSystem.players[var2]) {
					class6.soundSystem.players[var2] = null;
				}

				if (class6.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				WorldMapSection1.soundSystemExecutor.shutdownNow();
				WorldMapSection1.soundSystemExecutor = null;
				class6.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = 
	"(IS)V", garbageValue = 
	"2048")

	@Export("skip")
	final void skip(int var1) {
		this.field277 -= var1;
		if (this.field277 < 0) {
			this.field277 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("am")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class350.clearIntArray(var1, 0, var3);
		this.field277 -= var2;
		if ((this.stream != null) && (this.field277 <= 0)) {
			this.field277 += field268 >> 4;
			class296.PcmStream_disable(this.stream);
			this.method695(this.stream, this.stream.vmethod962());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label108 : for (
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
						PcmStream var11 = this.field272[var7];

						label102 : while (
						true) {
							while (true) {
								if (var11 == null) {
									break label102;
								}

								AbstractSound var12 = var11.sound;
								if ((var12 != null) && (var12.position > var8)) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod5441();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field292) {
										break label108;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field343; var14 != null; var14 = var11.nextSubStream()) {
											this.method695(var14, (var15 * var14.vmethod962()) >> 8);
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
										this.field290[var7] = var10;
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
				this.field290[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field277 < 0) {
			this.field277 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = class136.method2931();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = 
	"(Laf;IS)V", garbageValue = 
	"195")

	final void method695(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field290[var3];
		if (var4 == null) {
			this.field272[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field290[var3] = var1;
		var1.field343 = var2;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"([BI)Lbd;", garbageValue = 
	"1634234442")

	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script();
		Buffer var2 = new Buffer(var0);
		var2.offset = var2.array.length - 2;
		int var3 = var2.readUnsignedShort();
		int var4 = ((var2.array.length - 2) - var3) - 12;
		var2.offset = var4;
		int var5 = var2.readInt();
		var1.localIntCount = var2.readUnsignedShort();
		var1.localStringCount = var2.readUnsignedShort();
		var1.intArgumentCount = var2.readUnsignedShort();
		var1.stringArgumentCount = var2.readUnsignedShort();
		int var6 = var2.readUnsignedByte();
		int var7;
		int var8;
		if (var6 > 0) {
			var1.switches = var1.newIterableNodeHashTable(var6);

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var2.readUnsignedShort();
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? class67.method1909(var8) : 1);
				var1.switches[var7] = var9;

				while ((var8--) > 0) {
					int var10 = var2.readInt();
					int var11 = var2.readInt();
					var9.put(new IntegerNode(var11), ((long) (var10)));
				} 
			}
		}

		var2.offset = 0;
		var1.field954 = var2.readStringCp1252NullTerminatedOrNull();
		var1.opcodes = new int[var5];
		var1.intOperands = new int[var5];
		var1.stringOperands = new String[var5];

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) {
			var8 = var2.readUnsignedShort();
			if (var8 == 3) {
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if ((((var8 < 100) && (var8 != 21)) && (var8 != 38)) && (var8 != 39)) {
				var1.intOperands[var7] = var2.readInt();
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte();
			}
		}

		return var1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/CharSequence;IB)I", garbageValue = 
	"42")

	public static int method746(CharSequence var0, int var1) {
		return class263.method5178(var0, var1, true);
	}
}