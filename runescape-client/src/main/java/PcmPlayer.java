import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("at")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("w")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "Lax;")
	@Export("soundSystem")
	static SoundSystem soundSystem;

	@ObfuscatedName("ht")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;

	@ObfuscatedName("g")
	@Export("samples")
	protected int[] samples;

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "Lae;")
	@Export("stream")
	PcmStream stream;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 1070483423)
	int field289 = 32;

	@ObfuscatedName("l")
	@ObfuscatedGetter(longValue = -7636460397969717259L)
	@Export("timeMs")
	long timeMs = class131.method2916();

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -1836093347)
	@Export("capacity")
	int capacity;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = -756570525)
	int field290;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -1043855905)
	int field296;

	@ObfuscatedName("t")
	@ObfuscatedGetter(longValue = -1277459700016021033L)
	long field297 = 0L;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = -1619668637)
	int field298 = 0;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -937790393)
	int field287 = 0;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 689589807)
	int field300 = 0;

	@ObfuscatedName("r")
	@ObfuscatedGetter(longValue = -2276824281352982551L)
	long field301 = 0L;

	@ObfuscatedName("m")
	boolean field292 = true;

	@ObfuscatedName("as")
	@ObfuscatedGetter(intValue = 752389737)
	int field303 = 0;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = "[Lae;")
	PcmStream[] field304 = new PcmStream[8];

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = "[Lae;")
	PcmStream[] field305 = new PcmStream[8];

	protected PcmPlayer() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1912003377")
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-870519251")
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1295373245")
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("u")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-40")
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-15")
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(Lae;I)V", garbageValue = "-1114112408")
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "0")
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = class131.method2916();
			try {
				if (0L != this.field297) {
					if (var1 < this.field297) {
						return;
					}
					this.open(this.capacity);
					this.field297 = 0L;
					this.field292 = true;
				}
				int var3 = this.position();
				if (this.field300 - var3 > this.field298) {
					this.field298 = this.field300 - var3;
				}
				int var4 = this.field296 + this.field290;
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
					this.field292 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field296 = var4 - this.field290;
					}
				}
				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				} 
				if (var1 > this.field301) {
					if (!this.field292) {
						if (this.field298 == 0 && this.field287 == 0) {
							this.close();
							this.field297 = var1 + 2000L;
							return;
						}
						this.field296 = Math.min(this.field287, this.field298);
						this.field287 = this.field298;
					} else {
						this.field292 = false;
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
					this.timeMs += ((long) (256000 / class301.field3595));
				} 
			} catch (Exception var6) {
				this.timeMs = var1;
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-627992854")
	public final void method698() {
		this.field292 = true;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1004120734")
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field292 = true;
		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field297 = class131.method2916() + 2000L;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1917315609")
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (soundSystem != null) {
			boolean var1 = true;
			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == PcmPlayer.soundSystem.players[var2]) {
					PcmPlayer.soundSystem.players[var2] = null;
				}
				if (PcmPlayer.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}
			if (var1) {
				Messages.soundSystemExecutor.shutdownNow();
				Messages.soundSystemExecutor = null;
				soundSystem = null;
			}
		}
		this.close();
		this.samples = null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1638389721")
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

	@ObfuscatedName("au")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (PcmPlayer_stereo) {
			var3 = var2 << 1;
		}
		class351.clearIntArray(var1, 0, var3);
		this.field303 -= var2;
		if (this.stream != null && this.field303 <= 0) {
			this.field303 += class301.field3595 >> 4;
			class346.PcmStream_disable(this.stream);
			this.method721(this.stream, this.stream.vmethod959());
			int var4 = 0;
			int var5 = 255;
			int var6;
			PcmStream var10;
			label107 : for (var6 = 7; var5 != 0; --var6) {
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
						PcmStream var11 = this.field304[var7];
						label101 : while (true) {
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
									int var13 = var11.vmethod5453();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}
									if (var4 >= this.field289) {
										break label107;
									}
									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field354; var14 != null; var14 = var11.nextSubStream()) {
											this.method721(var14, var15 * var14.vmethod959() >> 8);
										}
									}
									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field304[var7] = var18;
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
				PcmStream var16 = this.field304[var6];
				PcmStream[] var17 = this.field304;
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
		this.timeMs = class131.method2916();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = "(Lae;II)V", garbageValue = "-1010174146")
	final void method721(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field305[var3];
		if (var4 == null) {
			this.field304[var3] = var1;
		} else {
			var4.after = var1;
		}
		this.field305[var3] = var1;
		var1.field354 = var2;
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(descriptor = "(Lqy;I)V", garbageValue = "1786212767")
	static final void method751(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field541; ++var1) {
			int var2 = Client.field729[var1];
			NPC var3 = Client.npcs[var2];
			int var4 = var0.readUnsignedByte();
			int var5;
			if (ScriptFrame.field462 && (var4 & 2) != 0) {
				var5 = var0.readUnsignedByte();
				var4 += var5 << 8;
			}
			if ((var4 & 64) != 0) {
				var3.targetIndex = var0.readUnsignedShort();
				if (var3.targetIndex == 65535) {
					var3.targetIndex = -1;
				}
			}
			if ((var4 & 256) != 0) {
				var3.method2412(var0.readStringCp1252NullTerminated());
			}
			int var6;
			int var7;
			if ((var4 & 8) != 0) {
				var5 = var0.readUnsignedShortAdd();
				if (var5 == 65535) {
					var5 = -1;
				}
				var6 = var0.readUnsignedByteNeg();
				if (var5 == var3.sequence && var5 != -1) {
					var7 = class14.SequenceDefinition_get(var5).field2175;
					if (var7 == 1) {
						var3.sequenceFrame = 0;
						var3.sequenceFrameCycle = 0;
						var3.sequenceDelay = var6;
						var3.field1174 = 0;
					}
					if (var7 == 2) {
						var3.field1174 = 0;
					}
				} else if (var5 == -1 || var3.sequence == -1 || class14.SequenceDefinition_get(var5).field2168 >= class14.SequenceDefinition_get(var3.sequence).field2168) {
					var3.sequence = var5;
					var3.sequenceFrame = 0;
					var3.sequenceFrameCycle = 0;
					var3.sequenceDelay = var6;
					var3.field1174 = 0;
					var3.field1203 = var3.pathLength;
				}
			}
			if ((var4 & 16) != 0) {
				var3.definition = class125.getNpcDefinition(var0.readUnsignedShortAddLE());
				var3.field1202 = var3.definition.size;
				var3.field1197 = var3.definition.rotation;
				var3.walkSequence = var3.definition.walkSequence;
				var3.walkBackSequence = var3.definition.walkBackSequence;
				var3.walkLeftSequence = var3.definition.walkLeftSequence;
				var3.walkRightSequence = var3.definition.walkRightSequence;
				var3.idleSequence = var3.definition.idleSequence;
				var3.turnLeftSequence = var3.definition.turnLeftSequence;
				var3.turnRightSequence = var3.definition.turnRightSequence;
			}
			if ((var4 & 32) != 0) {
				var3.overheadText = var0.readStringCp1252NullTerminated();
				var3.overheadTextCyclesRemaining = 100;
			}
			int var8;
			if ((var4 & 4) != 0) {
				var5 = var0.readUnsignedShortLE();
				var6 = var0.readUnsignedShortLE();
				if (ScriptFrame.field462) {
					var3.field1152 = var0.readUnsignedByte() == 1;
				}
				var7 = var3.x - (var5 - class300.baseX * 8 - class300.baseX * 8) * 64;
				var8 = var3.y - (var6 - Message.baseY * 64 - Message.baseY * 64) * 64;
				if (var7 != 0 || var8 != 0) {
					var3.field1164 = ((int) (Math.atan2(((double) (var7)), ((double) (var8))) * 325.949)) & 2047;
				}
			}
			if ((var4 & 128) != 0) {
				var5 = var0.readUnsignedByteAdd();
				int var9;
				int var10;
				int var11;
				if (var5 > 0) {
					for (var6 = 0; var6 < var5; ++var6) {
						var8 = -1;
						var9 = -1;
						var10 = -1;
						var7 = var0.readUShortSmart();
						if (var7 == 32767) {
							var7 = var0.readUShortSmart();
							var9 = var0.readUShortSmart();
							var8 = var0.readUShortSmart();
							var10 = var0.readUShortSmart();
						} else if (var7 != 32766) {
							var9 = var0.readUShortSmart();
						} else {
							var7 = -1;
						}
						var11 = var0.readUShortSmart();
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11);
					}
				}
				var6 = var0.readUnsignedByte();
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						if (var9 != 32767) {
							var10 = var0.readUShortSmart();
							var11 = var0.readUnsignedByteNeg();
							int var12 = (var9 > 0) ? var0.readUnsignedByteAdd() : var11;
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12);
						} else {
							var3.removeHealthBar(var8);
						}
					}
				}
			}
			if ((var4 & 1) != 0) {
				var3.spotAnimation = var0.readUnsignedShortLE();
				var5 = var0.readUnsignedIntIME();
				var3.spotAnimationHeight = var5 >> 16;
				var3.field1178 = (var5 & '￿') + Client.cycle;
				var3.spotAnimationFrame = 0;
				var3.spotAnimationFrameCycle = 0;
				if (var3.field1178 > Client.cycle) {
					var3.spotAnimationFrame = -1;
				}
				if (var3.spotAnimation == 65535) {
					var3.spotAnimation = -1;
				}
			}
			if ((var4 & 1024) != 0) {
				var3.field1189 = Client.cycle + var0.readUnsignedShortLE();
				var3.field1136 = Client.cycle + var0.readUnsignedShort();
				var3.field1191 = var0.readByteAdd();
				var3.field1168 = var0.readByte();
				var3.field1193 = var0.readByte();
				var3.field1184 = ((byte) (var0.readUnsignedByteAdd()));
			}
			if (ScriptFrame.field462 && (var4 & 512) != 0 || !ScriptFrame.field462 && (var4 & 2) != 0) {
				var3.field1177 = var0.readByteNeg();
				var3.field1182 = var0.readByteSub();
				var3.field1188 = var0.readByteNeg();
				var3.field1183 = var0.readByte();
				var3.field1194 = var0.readUnsignedShortAddLE() + Client.cycle;
				var3.field1166 = var0.readUnsignedShortAddLE() + Client.cycle;
				var3.field1186 = var0.readUnsignedShortAddLE();
				var3.pathLength = 1;
				var3.field1203 = 0;
				var3.field1177 += var3.pathX[0];
				var3.field1182 += var3.pathY[0];
				var3.field1188 += var3.pathX[0];
				var3.field1183 += var3.pathY[0];
			}
			if ((var4 & 2048) != 0) {
				var3.field1204 = var0.readUnsignedIntIME();
			}
		}
	}
}