import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("jv")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("hx")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lpf;")
	@Export("musicPatches")
	NodeHashTable musicPatches = new NodeHashTable(128);

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1390078109)
	int field3201 = 256;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1956042483)
	int field3203 = 1000000;

	@ObfuscatedName("u")
	int[] field3204 = new int[16];

	@ObfuscatedName("c")
	int[] field3205 = new int[16];

	@ObfuscatedName("z")
	int[] field3206 = new int[16];

	@ObfuscatedName("j")
	int[] field3215 = new int[16];

	@ObfuscatedName("h")
	int[] field3208 = new int[16];

	@ObfuscatedName("a")
	int[] field3209 = new int[16];

	@ObfuscatedName("d")
	int[] field3210 = new int[16];

	@ObfuscatedName("n")
	int[] field3211 = new int[16];

	@ObfuscatedName("x")
	int[] field3218 = new int[16];

	@ObfuscatedName("v")
	int[] field3219 = new int[16];

	@ObfuscatedName("t")
	int[] field3214 = new int[16];

	@ObfuscatedName("e")
	int[] field3213 = new int[16];

	@ObfuscatedName("s")
	int[] field3212 = new int[16];

	@ObfuscatedName("i")
	int[] field3217 = new int[16];

	@ObfuscatedName("r")
	int[] field3222 = new int[16];

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "[[Ljf;")
	MusicPatchNode[][] field3221 = new MusicPatchNode[16][128];

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "[[Ljf;")
	MusicPatchNode[][] field3220 = new MusicPatchNode[16][128];

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "Lje;")
	@Export("midiFile")
	MidiFileReader midiFile = new MidiFileReader();

	@ObfuscatedName("aj")
	boolean field3202;

	@ObfuscatedName("au")
	@ObfuscatedGetter(intValue = 601100167)
	@Export("track")
	int track;

	@ObfuscatedName("af")
	@ObfuscatedGetter(intValue = -787100075)
	@Export("trackLength")
	int trackLength;

	@ObfuscatedName("as")
	@ObfuscatedGetter(longValue = 2334389162512579087L)
	long field3225;

	@ObfuscatedName("ab")
	@ObfuscatedGetter(longValue = 862408801138428007L)
	long field3207;

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = "Ljo;")
	@Export("patchStream")
	MusicPatchPcmStream patchStream = new MusicPatchPcmStream(this);

	public MidiPcmStream() {
		this.method5288();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "31")
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3201 = var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(S)I", garbageValue = "3804")
	int method5305() {
		return this.field3201;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Ljm;Llc;Lan;II)Z", garbageValue = "1855867257")
	@Export("loadMusicTrack")
	public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method5476();
		boolean var5 = true;
		int[] var6 = null;
		if (var4 > 0) {
			var6 = new int[]{ var4 };
		}
		for (ByteArrayNode var7 = ((ByteArrayNode) (var1.table.first())); var7 != null; var7 = ((ByteArrayNode) (var1.table.next()))) {
			int var8 = ((int) (var7.key));
			MusicPatch var9 = ((MusicPatch) (this.musicPatches.get(((long) (var8)))));
			if (var9 == null) {
				byte[] var11 = var2.takeFileFlat(var8);
				MusicPatch var10;
				if (var11 == null) {
					var10 = null;
				} else {
					var10 = new MusicPatch(var11);
				}
				var9 = var10;
				if (var10 == null) {
					var5 = false;
					continue;
				}
				this.musicPatches.put(var10, ((long) (var8)));
			}
			if (!var9.method5439(var3, var7.byteArray, var6)) {
				var5 = false;
			}
		}
		if (var5) {
			var1.clear();
		}
		return var5;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(S)V", garbageValue = "-20699")
	@Export("clearAll")
	public synchronized void clearAll() {
		for (MusicPatch var1 = ((MusicPatch) (this.musicPatches.first())); var1 != null; var1 = ((MusicPatch) (this.musicPatches.next()))) {
			var1.clear();
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "64909485")
	@Export("removeAll")
	synchronized void removeAll() {
		for (MusicPatch var1 = ((MusicPatch) (this.musicPatches.first())); var1 != null; var1 = ((MusicPatch) (this.musicPatches.next()))) {
			var1.remove();
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "()Lae;")
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "()Lae;")
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("j")
	protected synchronized int vmethod5453() {
		return 0;
	}

	@ObfuscatedName("h")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3203 * -727379968 / class301.field3595;
			do {
				long var5 = ((long) (var3)) * ((long) (var4)) + this.field3225;
				if (this.field3207 - var5 >= 0L) {
					this.field3225 = var5;
					break;
				}
				int var7 = ((int) ((((long) (var4)) + (this.field3207 - this.field3225) - 1L) / ((long) (var4))));
				this.field3225 += ((long) (var7)) * ((long) (var4));
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method5275();
			} while (this.midiFile.isReady() );
		}
		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(Ljm;ZB)V", garbageValue = "12")
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field3202 = var2;
		this.field3225 = 0L;
		int var3 = this.midiFile.trackCount();
		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}
		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field3207 = this.midiFile.method5402(this.trackLength);
	}

	@ObfuscatedName("d")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3203 * -727379968 / class301.field3595;
			do {
				long var3 = ((long) (var2)) * ((long) (var1)) + this.field3225;
				if (this.field3207 - var3 >= 0L) {
					this.field3225 = var3;
					break;
				}
				int var5 = ((int) ((this.field3207 - this.field3225 + ((long) (var2)) - 1L) / ((long) (var2))));
				this.field3225 += ((long) (var2)) * ((long) (var5));
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method5275();
			} while (this.midiFile.isReady() );
		}
		this.patchStream.skip(var1);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "871870904")
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method5288();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-431284263")
	@Export("isReady")
	synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "-96")
	public synchronized void method5277(int var1, int var2) {
		this.method5278(var1, var2);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "1436408703")
	void method5278(int var1, int var2) {
		this.field3215[var1] = var2;
		this.field3209[var1] = var2 & -128;
		this.method5279(var1, var2);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-1228102341")
	void method5279(int var1, int var2) {
		if (var2 != this.field3208[var1]) {
			this.field3208[var1] = var2;
			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3220[var1][var3] = null;
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(IIII)V", garbageValue = "2075815983")
	void method5389(int var1, int var2, int var3) {
		this.method5281(var1, var2, 64);
		if ((this.field3219[var1] & 2) != 0) {
			for (MusicPatchNode var4 = ((MusicPatchNode) (this.patchStream.queue.first())); var4 != null; var4 = ((MusicPatchNode) (this.patchStream.queue.next()))) {
				if (var4.field3274 == var1 && var4.field3275 < 0) {
					this.field3221[var1][var4.field3279] = null;
					this.field3221[var1][var2] = var4;
					int var8 = (var4.field3271 * var4.field3269 >> 12) + var4.field3263;
					var4.field3263 += var2 - var4.field3279 << 8;
					var4.field3269 = var8 - var4.field3263;
					var4.field3271 = 4096;
					var4.field3279 = var2;
					return;
				}
			}
		}
		MusicPatch var9 = ((MusicPatch) (this.musicPatches.get(((long) (this.field3208[var1])))));
		if (var9 != null) {
			RawSound var5 = var9.rawSounds[var2];
			if (var5 != null) {
				MusicPatchNode var6 = new MusicPatchNode();
				var6.field3274 = var1;
				var6.patch = var9;
				var6.rawSound = var5;
				var6.field3261 = var9.field3252[var2];
				var6.field3265 = var9.field3247[var2];
				var6.field3279 = var2;
				var6.field3267 = var3 * var3 * var9.field3246[var2] * var9.field3249 + 1024 >> 11;
				var6.field3273 = var9.field3244[var2] & 255;
				var6.field3263 = (var2 << 8) - (var9.field3245[var2] & 32767);
				var6.field3272 = 0;
				var6.field3264 = 0;
				var6.field3270 = 0;
				var6.field3275 = -1;
				var6.field3276 = 0;
				if (this.field3212[var1] == 0) {
					var6.stream = RawPcmStream.method795(var5, this.method5293(var6), this.method5294(var6), this.method5295(var6));
				} else {
					var6.stream = RawPcmStream.method795(var5, this.method5293(var6), 0, this.method5295(var6));
					this.method5280(var6, var9.field3245[var2] < 0);
				}
				if (var9.field3245[var2] < 0) {
					var6.stream.setNumLoops(-1);
				}
				if (var6.field3265 >= 0) {
					MusicPatchNode var7 = this.field3220[var1][var6.field3265];
					if (var7 != null && var7.field3275 < 0) {
						this.field3221[var1][var7.field3279] = null;
						var7.field3275 = 0;
					}
					this.field3220[var1][var6.field3265] = var6;
				}
				this.patchStream.queue.addFirst(var6);
				this.field3221[var1][var2] = var6;
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(Ljf;ZS)V", garbageValue = "510")
	void method5280(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field274) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = ((int) (((long) (var5)) * ((long) (this.field3212[var1.field3274])) >> 6));
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method815();
			}
		} else {
			var4 = ((int) (((long) (this.field3212[var1.field3274])) * ((long) (var3)) >> 6));
		}
		var1.stream.method816(var4);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(IIIB)V", garbageValue = "55")
	void method5281(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3221[var1][var2];
		if (var4 != null) {
			this.field3221[var1][var2] = null;
			if ((this.field3219[var1] & 2) != 0) {
				for (MusicPatchNode var5 = ((MusicPatchNode) (this.patchStream.queue.last())); var5 != null; var5 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
					if (var5.field3274 == var4.field3274 && var5.field3275 < 0 && var4 != var5) {
						var4.field3275 = 0;
						break;
					}
				}
			} else {
				var4.field3275 = 0;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IIII)V", garbageValue = "-127967903")
	void method5371(int var1, int var2, int var3) {
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-517599324")
	void method5362(int var1, int var2) {
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "1435250640")
	void method5284(int var1, int var2) {
		this.field3210[var1] = var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1580434428")
	void method5321(int var1) {
		for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
			if (var1 < 0 || var2.field3274 == var1) {
				if (var2.stream != null) {
					var2.stream.method823(class301.field3595 / 100);
					if (var2.stream.method908()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}
					var2.method5479();
				}
				if (var2.field3275 < 0) {
					this.field3221[var2.field3274][var2.field3279] = null;
				}
				var2.remove();
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1075280821")
	void method5352(int var1) {
		if (var1 >= 0) {
			this.field3204[var1] = 12800;
			this.field3205[var1] = 8192;
			this.field3206[var1] = 16383;
			this.field3210[var1] = 8192;
			this.field3211[var1] = 0;
			this.field3218[var1] = 8192;
			this.method5340(var1);
			this.method5302(var1);
			this.field3219[var1] = 0;
			this.field3214[var1] = 32767;
			this.field3213[var1] = 256;
			this.field3212[var1] = 0;
			this.method5292(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method5352(var1);
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-62")
	void method5351(int var1) {
		for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
			if ((var1 < 0 || var2.field3274 == var1) && var2.field3275 < 0) {
				this.field3221[var2.field3274][var2.field3279] = null;
				var2.field3275 = 0;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-78")
	void method5288() {
		this.method5321(-1);
		this.method5352(-1);
		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3208[var1] = this.field3215[var1];
		}
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3209[var1] = this.field3215[var1] & -128;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1754590687")
	void method5340(int var1) {
		if ((this.field3219[var1] & 2) != 0) {
			for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
				if (var2.field3274 == var1 && this.field3221[var1][var2.field3279] == null && var2.field3275 < 0) {
					var2.field3275 = 0;
				}
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1211156767")
	void method5302(int var1) {
		if ((this.field3219[var1] & 4) != 0) {
			for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
				if (var2.field3274 == var1) {
					var2.field3281 = 0;
				}
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "632421827")
	void method5291(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method5281(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method5389(var3, var4, var5);
			} else {
				this.method5281(var3, var4, 64);
			}
		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method5371(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3209[var3] = (var5 << 14) + (this.field3209[var3] & -2080769);
			}
			if (var4 == 32) {
				this.field3209[var3] = (var5 << 7) + (this.field3209[var3] & -16257);
			}
			if (var4 == 1) {
				this.field3211[var3] = (var5 << 7) + (this.field3211[var3] & -16257);
			}
			if (var4 == 33) {
				this.field3211[var3] = var5 + (this.field3211[var3] & -128);
			}
			if (var4 == 5) {
				this.field3218[var3] = (var5 << 7) + (this.field3218[var3] & -16257);
			}
			if (var4 == 37) {
				this.field3218[var3] = var5 + (this.field3218[var3] & -128);
			}
			if (var4 == 7) {
				this.field3204[var3] = (var5 << 7) + (this.field3204[var3] & -16257);
			}
			if (var4 == 39) {
				this.field3204[var3] = var5 + (this.field3204[var3] & -128);
			}
			if (var4 == 10) {
				this.field3205[var3] = (var5 << 7) + (this.field3205[var3] & -16257);
			}
			if (var4 == 42) {
				this.field3205[var3] = var5 + (this.field3205[var3] & -128);
			}
			if (var4 == 11) {
				this.field3206[var3] = (var5 << 7) + (this.field3206[var3] & -16257);
			}
			if (var4 == 43) {
				this.field3206[var3] = var5 + (this.field3206[var3] & -128);
			}
			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3219;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3219;
					var10000[var3] &= -2;
				}
			}
			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3219;
					var10000[var3] |= 2;
				} else {
					this.method5340(var3);
					var10000 = this.field3219;
					var10000[var3] &= -3;
				}
			}
			if (var4 == 99) {
				this.field3214[var3] = (var5 << 7) + (this.field3214[var3] & 127);
			}
			if (var4 == 98) {
				this.field3214[var3] = (this.field3214[var3] & 16256) + var5;
			}
			if (var4 == 101) {
				this.field3214[var3] = (var5 << 7) + (this.field3214[var3] & 127) + 16384;
			}
			if (var4 == 100) {
				this.field3214[var3] = (this.field3214[var3] & 16256) + var5 + 16384;
			}
			if (var4 == 120) {
				this.method5321(var3);
			}
			if (var4 == 121) {
				this.method5352(var3);
			}
			if (var4 == 123) {
				this.method5351(var3);
			}
			int var6;
			if (var4 == 6) {
				var6 = this.field3214[var3];
				if (var6 == 16384) {
					this.field3213[var3] = (var5 << 7) + (this.field3213[var3] & -16257);
				}
			}
			if (var4 == 38) {
				var6 = this.field3214[var3];
				if (var6 == 16384) {
					this.field3213[var3] = var5 + (this.field3213[var3] & -128);
				}
			}
			if (var4 == 16) {
				this.field3212[var3] = (var5 << 7) + (this.field3212[var3] & -16257);
			}
			if (var4 == 48) {
				this.field3212[var3] = var5 + (this.field3212[var3] & -128);
			}
			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3219;
					var10000[var3] |= 4;
				} else {
					this.method5302(var3);
					var10000 = this.field3219;
					var10000[var3] &= -5;
				}
			}
			if (var4 == 17) {
				this.method5292(var3, (var5 << 7) + (this.field3217[var3] & -16257));
			}
			if (var4 == 49) {
				this.method5292(var3, var5 + (this.field3217[var3] & -128));
			}
		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method5279(var3, var4 + this.field3209[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method5362(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method5284(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method5288();
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-1879942829")
	void method5292(int var1, int var2) {
		this.field3217[var1] = var2;
		this.field3222[var1] = ((int) (2097152.0 * Math.pow(2.0, ((double) (var2)) * 5.4931640625E-4) + 0.5));
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(descriptor = "(Ljf;I)I", garbageValue = "-526581783")
	int method5293(MusicPatchNode var1) {
		int var2 = (var1.field3269 * var1.field3271 >> 12) + var1.field3263;
		var2 += (this.field3210[var1.field3274] - 8192) * this.field3213[var1.field3274] >> 12;
		MusicPatchNode2 var3 = var1.field3261;
		int var4;
		if (var3.field3182 > 0 && (var3.field3186 > 0 || this.field3211[var1.field3274] > 0)) {
			var4 = var3.field3186 << 2;
			int var5 = var3.field3188 << 1;
			if (var1.field3277 < var5) {
				var4 = var4 * var1.field3277 / var5;
			}
			var4 += this.field3211[var1.field3274] >> 7;
			double var6 = Math.sin(((double) (var1.field3278 & 511)) * 0.01227184630308513);
			var2 += ((int) (((double) (var4)) * var6));
		}
		var4 = ((int) (((double) (var1.rawSound.sampleRate * 256)) * Math.pow(2.0, 3.255208333333333E-4 * ((double) (var2))) / ((double) (class301.field3595)) + 0.5));
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = "(Ljf;I)I", garbageValue = "-298677728")
	int method5294(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3261;
		int var3 = this.field3204[var1.field3274] * this.field3206[var1.field3274] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3267 + 16384 >> 15;
		var3 = var3 * this.field3201 + 128 >> 8;
		if (var2.field3180 > 0) {
			var3 = ((int) (((double) (var3)) * Math.pow(0.5, 1.953125E-5 * ((double) (var1.field3272)) * ((double) (var2.field3180))) + 0.5));
		}
		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3181 != null) {
			var4 = var1.field3264;
			var5 = var2.field3181[var1.field3270 * 2 + 1];
			if (var1.field3270 * 2 < var2.field3181.length - 2) {
				var6 = (var2.field3181[var1.field3270 * 2] & 255) << 8;
				var7 = (var2.field3181[var1.field3270 * 2 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3181[var1.field3270 * 2 + 3] - var5) / (var7 - var6);
			}
			var3 = var3 * var5 + 32 >> 6;
		}
		if (var1.field3275 > 0 && var2.field3191 != null) {
			var4 = var1.field3275;
			var5 = var2.field3191[var1.field3276 * 4 + 1];
			if (var1.field3276 * 4 < var2.field3191.length - 2) {
				var6 = (var2.field3191[var1.field3276 * 4] & 255) << 8;
				var7 = (var2.field3191[var1.field3276 * 4 + 2] & 255) << 8;
				var5 += (var2.field3191[var1.field3276 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}
			var3 = var5 * var3 + 32 >> 6;
		}
		return var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "(Ljf;I)I", garbageValue = "-1946458208")
	int method5295(MusicPatchNode var1) {
		int var2 = this.field3205[var1.field3274];
		return var2 < 8192 ? var2 * var1.field3273 + 32 >> 6 : 16384 - ((128 - var1.field3273) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1475173062")
	void method5275() {
		int var1 = this.track;
		int var2 = this.trackLength;
		long var3;
		for (var3 = this.field3207; var2 == this.trackLength; var3 = this.midiFile.method5402(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3202 || var2 == 0) {
							this.method5288();
							this.midiFile.clear();
							return;
						}
						this.midiFile.reset(var3);
					}
					break;
				}
				if ((var5 & 128) != 0) {
					this.method5291(var5);
				}
				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			} 
			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}
		this.track = var1;
		this.trackLength = var2;
		this.field3207 = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = "(Ljf;B)Z", garbageValue = "103")
	boolean method5379(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3275 >= 0) {
				var1.remove();
				if (var1.field3265 > 0 && var1 == this.field3220[var1.field3274][var1.field3265]) {
					this.field3220[var1.field3274][var1.field3265] = null;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = "(Ljf;[IIII)Z", garbageValue = "8182079")
	boolean method5303(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3280 = class301.field3595 / 100;
		if (var1.field3275 < 0 || var1.stream != null && !var1.stream.method859()) {
			int var5 = var1.field3271;
			if (var5 > 0) {
				var5 -= ((int) (16.0 * Math.pow(2.0, 4.921259842519685E-4 * ((double) (this.field3218[var1.field3274]))) + 0.5));
				if (var5 < 0) {
					var5 = 0;
				}
				var1.field3271 = var5;
			}
			var1.stream.method809(this.method5293(var1));
			MusicPatchNode2 var6 = var1.field3261;
			boolean var7 = false;
			++var1.field3277;
			var1.field3278 += var6.field3182;
			double var8 = ((double) ((var1.field3279 - 60 << 8) + (var1.field3269 * var1.field3271 >> 12))) * 5.086263020833333E-6;
			if (var6.field3180 > 0) {
				if (var6.field3185 > 0) {
					var1.field3272 += ((int) (128.0 * Math.pow(2.0, ((double) (var6.field3185)) * var8) + 0.5));
				} else {
					var1.field3272 += 128;
				}
			}
			if (var6.field3181 != null) {
				if (var6.field3183 > 0) {
					var1.field3264 += ((int) (128.0 * Math.pow(2.0, ((double) (var6.field3183)) * var8) + 0.5));
				} else {
					var1.field3264 += 128;
				}
				while (var1.field3270 * 2 < var6.field3181.length - 2 && var1.field3264 > (var6.field3181[var1.field3270 * 2 + 2] & 255) << 8) {
					var1.field3270 = var1.field3270 * 4 + 4;
				} 
				if (var1.field3270 * 2 == var6.field3181.length - 2 && var6.field3181[var1.field3270 * 2 + 1] == 0) {
					var7 = true;
				}
			}
			if (var1.field3275 >= 0 && var6.field3191 != null && (this.field3219[var1.field3274] & 1) == 0 && (var1.field3265 < 0 || var1 != this.field3220[var1.field3274][var1.field3265])) {
				if (var6.field3184 > 0) {
					var1.field3275 += ((int) (128.0 * Math.pow(2.0, ((double) (var6.field3184)) * var8) + 0.5));
				} else {
					var1.field3275 += 128;
				}
				while (var1.field3276 * 4 < var6.field3191.length - 2 && var1.field3275 > (var6.field3191[var1.field3276 * 4 + 2] & 255) << 8) {
					var1.field3276 = var1.field3276 * 4 + 2;
				} 
				if (var1.field3276 * 4 == var6.field3191.length - 2) {
					var7 = true;
				}
			}
			if (var7) {
				var1.stream.method823(var1.field3280);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}
				if (var1.stream.method908()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}
				var1.method5479();
				if (var1.field3275 >= 0) {
					var1.remove();
					if (var1.field3265 > 0 && var1 == this.field3220[var1.field3274][var1.field3265]) {
						this.field3220[var1.field3274][var1.field3265] = null;
					}
				}
				return true;
			} else {
				var1.stream.method807(var1.field3280, this.method5294(var1), this.method5295(var1));
				return false;
			}
		} else {
			var1.method5479();
			var1.remove();
			if (var1.field3265 > 0 && var1 == this.field3220[var1.field3274][var1.field3265]) {
				this.field3220[var1.field3274][var1.field3265] = null;
			}
			return true;
		}
	}
}