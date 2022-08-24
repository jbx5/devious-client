import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("je")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lpa;")
	@Export("musicPatches")
	NodeHashTable musicPatches = new NodeHashTable(128);

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 945152209)
	int field3206 = 256;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 1527124495)
	int field3207 = 1000000;

	@ObfuscatedName("c")
	int[] field3228 = new int[16];

	@ObfuscatedName("q")
	int[] field3208 = new int[16];

	@ObfuscatedName("i")
	int[] field3210 = new int[16];

	@ObfuscatedName("k")
	int[] field3205 = new int[16];

	@ObfuscatedName("o")
	int[] field3212 = new int[16];

	@ObfuscatedName("n")
	int[] field3224 = new int[16];

	@ObfuscatedName("d")
	int[] field3209 = new int[16];

	@ObfuscatedName("a")
	int[] field3218 = new int[16];

	@ObfuscatedName("m")
	int[] field3216 = new int[16];

	@ObfuscatedName("e")
	int[] field3223 = new int[16];

	@ObfuscatedName("b")
	int[] field3219 = new int[16];

	@ObfuscatedName("x")
	int[] field3220 = new int[16];

	@ObfuscatedName("f")
	int[] field3221 = new int[16];

	@ObfuscatedName("t")
	int[] field3222 = new int[16];

	@ObfuscatedName("j")
	int[] field3214 = new int[16];

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "[[Ljl;")
	MusicPatchNode[][] field3229 = new MusicPatchNode[16][128];

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "[[Ljl;")
	MusicPatchNode[][] field3211 = new MusicPatchNode[16][128];

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = "Ljw;")
	@Export("midiFile")
	MidiFileReader midiFile = new MidiFileReader();

	@ObfuscatedName("av")
	boolean field3213;

	@ObfuscatedName("aj")
	@ObfuscatedGetter(intValue = 750816385)
	@Export("track")
	int track;

	@ObfuscatedName("ax")
	@ObfuscatedGetter(intValue = -1424179677)
	@Export("trackLength")
	int trackLength;

	@ObfuscatedName("ab")
	@ObfuscatedGetter(longValue = 7267383447845986699L)
	long field3230;

	@ObfuscatedName("ak")
	@ObfuscatedGetter(longValue = 2251608804778444067L)
	long field3231;

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "Ljk;")
	@Export("patchStream")
	MusicPatchPcmStream patchStream = new MusicPatchPcmStream(this);

	public MidiPcmStream() {
		this.method5240();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "406140515")
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3206 = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-571564591")
	int method5237() {
		return this.field3206;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lja;Lls;Lap;II)Z", garbageValue = "912390095")
	@Export("loadMusicTrack")
	public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method5408();
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
			if (!var9.method5369(var3, var7.byteArray, var6)) {
				var5 = false;
			}
		}
		if (var5) {
			var1.clear();
		}
		return var5;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1779976021")
	@Export("clearAll")
	public synchronized void clearAll() {
		for (MusicPatch var1 = ((MusicPatch) (this.musicPatches.first())); var1 != null; var1 = ((MusicPatch) (this.musicPatches.next()))) {
			var1.clear();
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-191760391")
	@Export("removeAll")
	synchronized void removeAll() {
		for (MusicPatch var1 = ((MusicPatch) (this.musicPatches.first())); var1 != null; var1 = ((MusicPatch) (this.musicPatches.next()))) {
			var1.remove();
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "()Lah;")
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "()Lah;")
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("k")
	protected synchronized int vmethod5396() {
		return 0;
	}

	@ObfuscatedName("o")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3207 * -727379968 / (class344.field4152 * -449918071);
			do {
				long var5 = ((long) (var4)) * ((long) (var3)) + this.field3230;
				if (this.field3231 - var5 >= 0L) {
					this.field3230 = var5;
					break;
				}
				int var7 = ((int) ((((long) (var4)) + (this.field3231 - this.field3230) - 1L) / ((long) (var4))));
				this.field3230 += ((long) (var4)) * ((long) (var7));
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method5223();
			} while (this.midiFile.isReady() );
		}
		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(Lja;ZI)V", garbageValue = "-1535614413")
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field3213 = var2;
		this.field3230 = 0L;
		int var3 = this.midiFile.trackCount();
		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}
		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field3231 = this.midiFile.method5330(this.trackLength);
	}

	@ObfuscatedName("d")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3207 * -727379968 / (class344.field4152 * -449918071);
			do {
				long var3 = ((long) (var1)) * ((long) (var2)) + this.field3230;
				if (this.field3231 - var3 >= 0L) {
					this.field3230 = var3;
					break;
				}
				int var5 = ((int) ((this.field3231 - this.field3230 + ((long) (var2)) - 1L) / ((long) (var2))));
				this.field3230 += ((long) (var5)) * ((long) (var2));
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method5223();
			} while (this.midiFile.isReady() );
		}
		this.patchStream.skip(var1);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-11")
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method5240();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "11")
	@Export("isReady")
	synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "-106")
	public synchronized void method5198(int var1, int var2) {
		this.method5199(var1, var2);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "5")
	void method5199(int var1, int var2) {
		this.field3205[var1] = var2;
		this.field3224[var1] = var2 & -128;
		this.method5200(var1, var2);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-1539743468")
	void method5200(int var1, int var2) {
		if (var2 != this.field3212[var1]) {
			this.field3212[var1] = var2;
			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3211[var1][var3] = null;
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(IIII)V", garbageValue = "1108184532")
	void method5201(int var1, int var2, int var3) {
		this.method5203(var1, var2, 64);
		if ((this.field3223[var1] & 2) != 0) {
			for (MusicPatchNode var4 = ((MusicPatchNode) (this.patchStream.queue.first())); var4 != null; var4 = ((MusicPatchNode) (this.patchStream.queue.next()))) {
				if (var4.field3280 == var1 && var4.field3266 < 0) {
					this.field3229[var1][var4.field3286] = null;
					this.field3229[var1][var2] = var4;
					int var8 = (var4.field3272 * var4.field3273 >> 12) + var4.field3271;
					var4.field3271 += var2 - var4.field3286 << 8;
					var4.field3272 = var8 - var4.field3271;
					var4.field3273 = 4096;
					var4.field3286 = var2;
					return;
				}
			}
		}
		MusicPatch var9 = ((MusicPatch) (this.musicPatches.get(((long) (this.field3212[var1])))));
		if (var9 != null) {
			RawSound var5 = var9.rawSounds[var2];
			if (var5 != null) {
				MusicPatchNode var6 = new MusicPatchNode();
				var6.field3280 = var1;
				var6.patch = var9;
				var6.rawSound = var5;
				var6.field3284 = var9.field3255[var2];
				var6.field3267 = var9.field3253[var2];
				var6.field3286 = var2;
				var6.field3269 = var3 * var3 * var9.field3252[var2] * var9.field3248 + 1024 >> 11;
				var6.field3270 = var9.field3251[var2] & 255;
				var6.field3271 = (var2 << 8) - (var9.field3249[var2] & 32767);
				var6.field3263 = 0;
				var6.field3275 = 0;
				var6.field3276 = 0;
				var6.field3266 = -1;
				var6.field3281 = 0;
				if (this.field3221[var1] == 0) {
					var6.stream = RawPcmStream.method769(var5, this.method5215(var6), this.method5216(var6), this.method5300(var6));
				} else {
					var6.stream = RawPcmStream.method769(var5, this.method5215(var6), 0, this.method5300(var6));
					this.method5202(var6, var9.field3249[var2] < 0);
				}
				if (var9.field3249[var2] < 0) {
					var6.stream.setNumLoops(-1);
				}
				if (var6.field3267 >= 0) {
					MusicPatchNode var7 = this.field3211[var1][var6.field3267];
					if (var7 != null && var7.field3266 < 0) {
						this.field3229[var1][var7.field3286] = null;
						var7.field3266 = 0;
					}
					this.field3211[var1][var6.field3267] = var6;
				}
				this.patchStream.queue.addFirst(var6);
				this.field3229[var1][var2] = var6;
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(Ljl;ZI)V", garbageValue = "-2091594866")
	void method5202(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field264) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = ((int) (((long) (var5)) * ((long) (this.field3221[var1.field3280])) >> 6));
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method778();
			}
		} else {
			var4 = ((int) (((long) (this.field3221[var1.field3280])) * ((long) (var3)) >> 6));
		}
		var1.stream.method793(var4);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(IIIB)V", garbageValue = "88")
	void method5203(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3229[var1][var2];
		if (var4 != null) {
			this.field3229[var1][var2] = null;
			if ((this.field3223[var1] & 2) != 0) {
				for (MusicPatchNode var5 = ((MusicPatchNode) (this.patchStream.queue.last())); var5 != null; var5 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
					if (var5.field3280 == var4.field3280 && var5.field3266 < 0 && var5 != var4) {
						var4.field3266 = 0;
						break;
					}
				}
			} else {
				var4.field3266 = 0;
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(IIII)V", garbageValue = "-2083947219")
	void method5204(int var1, int var2, int var3) {
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(IIS)V", garbageValue = "-27277")
	void method5294(int var1, int var2) {
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "582010167")
	void method5206(int var1, int var2) {
		this.field3209[var1] = var2;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1944528994")
	void method5207(int var1) {
		for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
			if (var1 < 0 || var2.field3280 == var1) {
				if (var2.stream != null) {
					var2.stream.method782(class344.field4152 * -449918071 / 100);
					if (var2.stream.method820()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}
					var2.method5415();
				}
				if (var2.field3266 < 0) {
					this.field3229[var2.field3280][var2.field3286] = null;
				}
				var2.remove();
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "519673015")
	void method5208(int var1) {
		if (var1 >= 0) {
			this.field3228[var1] = 12800;
			this.field3208[var1] = 8192;
			this.field3210[var1] = 16383;
			this.field3209[var1] = 8192;
			this.field3218[var1] = 0;
			this.field3216[var1] = 8192;
			this.method5211(var1);
			this.method5212(var1);
			this.field3223[var1] = 0;
			this.field3219[var1] = 32767;
			this.field3220[var1] = 256;
			this.field3221[var1] = 0;
			this.method5214(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method5208(var1);
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1761941662")
	void method5264(int var1) {
		for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
			if ((var1 < 0 || var2.field3280 == var1) && var2.field3266 < 0) {
				this.field3229[var2.field3280][var2.field3286] = null;
				var2.field3266 = 0;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-2007631477")
	void method5240() {
		this.method5207(-1);
		this.method5208(-1);
		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3212[var1] = this.field3205[var1];
		}
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3224[var1] = this.field3205[var1] & -128;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-72")
	void method5211(int var1) {
		if ((this.field3223[var1] & 2) != 0) {
			for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
				if (var2.field3280 == var1 && this.field3229[var1][var2.field3286] == null && var2.field3266 < 0) {
					var2.field3266 = 0;
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1573730813")
	void method5212(int var1) {
		if ((this.field3223[var1] & 4) != 0) {
			for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
				if (var2.field3280 == var1) {
					var2.field3283 = 0;
				}
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "100")
	void method5213(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method5203(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method5201(var3, var4, var5);
			} else {
				this.method5203(var3, var4, 64);
			}
		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method5204(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3224[var3] = (var5 << 14) + (this.field3224[var3] & -2080769);
			}
			if (var4 == 32) {
				this.field3224[var3] = (var5 << 7) + (this.field3224[var3] & -16257);
			}
			if (var4 == 1) {
				this.field3218[var3] = (var5 << 7) + (this.field3218[var3] & -16257);
			}
			if (var4 == 33) {
				this.field3218[var3] = var5 + (this.field3218[var3] & -128);
			}
			if (var4 == 5) {
				this.field3216[var3] = (var5 << 7) + (this.field3216[var3] & -16257);
			}
			if (var4 == 37) {
				this.field3216[var3] = var5 + (this.field3216[var3] & -128);
			}
			if (var4 == 7) {
				this.field3228[var3] = (var5 << 7) + (this.field3228[var3] & -16257);
			}
			if (var4 == 39) {
				this.field3228[var3] = var5 + (this.field3228[var3] & -128);
			}
			if (var4 == 10) {
				this.field3208[var3] = (var5 << 7) + (this.field3208[var3] & -16257);
			}
			if (var4 == 42) {
				this.field3208[var3] = var5 + (this.field3208[var3] & -128);
			}
			if (var4 == 11) {
				this.field3210[var3] = (var5 << 7) + (this.field3210[var3] & -16257);
			}
			if (var4 == 43) {
				this.field3210[var3] = var5 + (this.field3210[var3] & -128);
			}
			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3223;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3223;
					var10000[var3] &= -2;
				}
			}
			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3223;
					var10000[var3] |= 2;
				} else {
					this.method5211(var3);
					var10000 = this.field3223;
					var10000[var3] &= -3;
				}
			}
			if (var4 == 99) {
				this.field3219[var3] = (var5 << 7) + (this.field3219[var3] & 127);
			}
			if (var4 == 98) {
				this.field3219[var3] = (this.field3219[var3] & 16256) + var5;
			}
			if (var4 == 101) {
				this.field3219[var3] = (var5 << 7) + (this.field3219[var3] & 127) + 16384;
			}
			if (var4 == 100) {
				this.field3219[var3] = (this.field3219[var3] & 16256) + var5 + 16384;
			}
			if (var4 == 120) {
				this.method5207(var3);
			}
			if (var4 == 121) {
				this.method5208(var3);
			}
			if (var4 == 123) {
				this.method5264(var3);
			}
			int var6;
			if (var4 == 6) {
				var6 = this.field3219[var3];
				if (var6 == 16384) {
					this.field3220[var3] = (var5 << 7) + (this.field3220[var3] & -16257);
				}
			}
			if (var4 == 38) {
				var6 = this.field3219[var3];
				if (var6 == 16384) {
					this.field3220[var3] = var5 + (this.field3220[var3] & -128);
				}
			}
			if (var4 == 16) {
				this.field3221[var3] = (var5 << 7) + (this.field3221[var3] & -16257);
			}
			if (var4 == 48) {
				this.field3221[var3] = var5 + (this.field3221[var3] & -128);
			}
			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3223;
					var10000[var3] |= 4;
				} else {
					this.method5212(var3);
					var10000 = this.field3223;
					var10000[var3] &= -5;
				}
			}
			if (var4 == 17) {
				this.method5214(var3, (var5 << 7) + (this.field3222[var3] & -16257));
			}
			if (var4 == 49) {
				this.method5214(var3, var5 + (this.field3222[var3] & -128));
			}
		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method5200(var3, var4 + this.field3224[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method5294(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method5206(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method5240();
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = "(IIS)V", garbageValue = "6872")
	void method5214(int var1, int var2) {
		this.field3222[var1] = var2;
		this.field3214[var1] = ((int) (2097152.0 * Math.pow(2.0, ((double) (var2)) * 5.4931640625E-4) + 0.5));
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(descriptor = "(Ljl;B)I", garbageValue = "-22")
	int method5215(MusicPatchNode var1) {
		int var2 = (var1.field3273 * var1.field3272 >> 12) + var1.field3271;
		var2 += (this.field3209[var1.field3280] - 8192) * this.field3220[var1.field3280] >> 12;
		MusicPatchNode2 var3 = var1.field3284;
		int var4;
		if (var3.field3193 > 0 && (var3.field3194 > 0 || this.field3218[var1.field3280] > 0)) {
			var4 = var3.field3194 << 2;
			int var5 = var3.field3196 << 1;
			if (var1.field3268 < var5) {
				var4 = var4 * var1.field3268 / var5;
			}
			var4 += this.field3218[var1.field3280] >> 7;
			double var6 = Math.sin(0.01227184630308513 * ((double) (var1.field3279 & 511)));
			var2 += ((int) (var6 * ((double) (var4))));
		}
		var4 = ((int) (((double) (var1.rawSound.sampleRate * 256)) * Math.pow(2.0, ((double) (var2)) * 3.255208333333333E-4) / ((double) (class344.field4152 * -449918071)) + 0.5));
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = "(Ljl;S)I", garbageValue = "-22694")
	int method5216(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3284;
		int var3 = this.field3210[var1.field3280] * this.field3228[var1.field3280] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3269 + 16384 >> 15;
		var3 = var3 * this.field3206 + 128 >> 8;
		if (var2.field3190 > 0) {
			var3 = ((int) (((double) (var3)) * Math.pow(0.5, ((double) (var2.field3190)) * ((double) (var1.field3263)) * 1.953125E-5) + 0.5));
		}
		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3189 != null) {
			var4 = var1.field3275;
			var5 = var2.field3189[var1.field3276 * 4 + 1];
			if (var1.field3276 * 4 < var2.field3189.length - 2) {
				var6 = (var2.field3189[var1.field3276 * 4] & 255) << 8;
				var7 = (var2.field3189[var1.field3276 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3189[var1.field3276 * 4 + 3] - var5) / (var7 - var6);
			}
			var3 = var5 * var3 + 32 >> 6;
		}
		if (var1.field3266 > 0 && var2.field3195 != null) {
			var4 = var1.field3266;
			var5 = var2.field3195[var1.field3281 * 4 + 1];
			if (var1.field3281 * 4 < var2.field3195.length - 2) {
				var6 = (var2.field3195[var1.field3281 * 4] & 255) << 8;
				var7 = (var2.field3195[var1.field3281 * 4 + 2] & 255) << 8;
				var5 += (var2.field3195[var1.field3281 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}
			var3 = var5 * var3 + 32 >> 6;
		}
		return var3;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(descriptor = "(Ljl;S)I", garbageValue = "24564")
	int method5300(MusicPatchNode var1) {
		int var2 = this.field3208[var1.field3280];
		return var2 < 8192 ? var2 * var1.field3270 + 32 >> 6 : 16384 - ((128 - var1.field3270) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1086583875")
	void method5223() {
		int var1 = this.track;
		int var2 = this.trackLength;
		long var3;
		for (var3 = this.field3231; var2 == this.trackLength; var3 = this.midiFile.method5330(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3213 || var2 == 0) {
							this.method5240();
							this.midiFile.clear();
							return;
						}
						this.midiFile.reset(var3);
					}
					break;
				}
				if ((var5 & 128) != 0) {
					this.method5213(var5);
				}
				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			} 
			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}
		this.track = var1;
		this.trackLength = var2;
		this.field3231 = var3;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(descriptor = "(Ljl;I)Z", garbageValue = "1853843219")
	boolean method5224(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3266 >= 0) {
				var1.remove();
				if (var1.field3267 > 0 && var1 == this.field3211[var1.field3280][var1.field3267]) {
					this.field3211[var1.field3280][var1.field3267] = null;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(descriptor = "(Ljl;[IIII)Z", garbageValue = "2071249267")
	boolean method5225(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3282 = class344.field4152 * -449918071 / 100;
		if (var1.field3266 < 0 || var1.stream != null && !var1.stream.method785()) {
			int var5 = var1.field3273;
			if (var5 > 0) {
				var5 -= ((int) (16.0 * Math.pow(2.0, ((double) (this.field3216[var1.field3280])) * 4.921259842519685E-4) + 0.5));
				if (var5 < 0) {
					var5 = 0;
				}
				var1.field3273 = var5;
			}
			var1.stream.method808(this.method5215(var1));
			MusicPatchNode2 var6 = var1.field3284;
			boolean var7 = false;
			++var1.field3268;
			var1.field3279 += var6.field3193;
			double var8 = ((double) ((var1.field3286 - 60 << 8) + (var1.field3273 * var1.field3272 >> 12))) * 5.086263020833333E-6;
			if (var6.field3190 > 0) {
				if (var6.field3188 > 0) {
					var1.field3263 += ((int) (128.0 * Math.pow(2.0, ((double) (var6.field3188)) * var8) + 0.5));
				} else {
					var1.field3263 += 128;
				}
			}
			if (var6.field3189 != null) {
				if (var6.field3191 > 0) {
					var1.field3275 += ((int) (128.0 * Math.pow(2.0, var8 * ((double) (var6.field3191))) + 0.5));
				} else {
					var1.field3275 += 128;
				}
				while (var1.field3276 * 4 < var6.field3189.length - 2 && var1.field3275 > (var6.field3189[var1.field3276 * 4 + 2] & 255) << 8) {
					var1.field3276 = var1.field3276 * 4 + 2;
				} 
				if (var1.field3276 * 4 == var6.field3189.length - 2 && var6.field3189[var1.field3276 * 4 + 1] == 0) {
					var7 = true;
				}
			}
			if (var1.field3266 >= 0 && var6.field3195 != null && (this.field3223[var1.field3280] & 1) == 0 && (var1.field3267 < 0 || var1 != this.field3211[var1.field3280][var1.field3267])) {
				if (var6.field3192 > 0) {
					var1.field3266 += ((int) (128.0 * Math.pow(2.0, var8 * ((double) (var6.field3192))) + 0.5));
				} else {
					var1.field3266 += 128;
				}
				while (var1.field3281 * 4 < var6.field3195.length - 2 && var1.field3266 > (var6.field3195[var1.field3281 * 4 + 2] & 255) << 8) {
					var1.field3281 = var1.field3281 * 4 + 2;
				} 
				if (var1.field3281 * 4 == var6.field3195.length - 2) {
					var7 = true;
				}
			}
			if (var7) {
				var1.stream.method782(var1.field3282);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}
				if (var1.stream.method820()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}
				var1.method5415();
				if (var1.field3266 >= 0) {
					var1.remove();
					if (var1.field3267 > 0 && var1 == this.field3211[var1.field3280][var1.field3267]) {
						this.field3211[var1.field3280][var1.field3267] = null;
					}
				}
				return true;
			} else {
				var1.stream.method781(var1.field3282, this.method5216(var1), this.method5300(var1));
				return false;
			}
		} else {
			var1.method5415();
			var1.remove();
			if (var1.field3267 > 0 && var1 == this.field3211[var1.field3280][var1.field3267]) {
				this.field3211[var1.field3280][var1.field3267] = null;
			}
			return true;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lls;Lls;ZLmg;I)V", garbageValue = "16711935")
	public static void method5316(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		ItemComposition.ItemDefinition_archive = var0;
		ItemComposition.ItemDefinition_modelArchive = var1;
		InterfaceParent.ItemDefinition_inMembersWorld = var2;
		class144.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10);
		class137.ItemDefinition_fontPlain11 = var3;
	}
}