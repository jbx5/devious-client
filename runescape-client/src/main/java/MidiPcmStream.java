import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("jp")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("tq")
	@ObfuscatedGetter(intValue = 1365503093)
	static int field3231;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lpm;")
	@Export("musicPatches")
	NodeHashTable musicPatches;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -1341819569)
	int field3222;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1306647529)
	int field3205;

	@ObfuscatedName("f")
	int[] field3206;

	@ObfuscatedName("j")
	int[] field3225;

	@ObfuscatedName("e")
	int[] field3208;

	@ObfuscatedName("g")
	int[] field3209;

	@ObfuscatedName("y")
	int[] field3212;

	@ObfuscatedName("i")
	int[] field3211;

	@ObfuscatedName("s")
	int[] field3204;

	@ObfuscatedName("t")
	int[] field3203;

	@ObfuscatedName("z")
	int[] field3214;

	@ObfuscatedName("a")
	int[] field3210;

	@ObfuscatedName("p")
	int[] field3217;

	@ObfuscatedName("b")
	int[] field3218;

	@ObfuscatedName("n")
	int[] field3229;

	@ObfuscatedName("o")
	int[] field3220;

	@ObfuscatedName("m")
	int[] field3207;

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "[[Ljm;")
	MusicPatchNode[][] field3215;

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = "[[Ljm;")
	MusicPatchNode[][] field3223;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = "Lje;")
	@Export("midiFile")
	MidiFileReader midiFile;

	@ObfuscatedName("al")
	boolean field3213;

	@ObfuscatedName("ao")
	@ObfuscatedGetter(intValue = -958540141)
	@Export("track")
	int track;

	@ObfuscatedName("ab")
	@ObfuscatedGetter(intValue = 1440086017)
	@Export("trackLength")
	int trackLength;

	@ObfuscatedName("ap")
	@ObfuscatedGetter(longValue = -4140427133495308021L)
	long field3228;

	@ObfuscatedName("ac")
	@ObfuscatedGetter(longValue = 6635359799012910237L)
	long field3221;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "Ljy;")
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field3222 = 256;
		this.field3205 = 1000000;
		this.field3206 = new int[16];
		this.field3225 = new int[16];
		this.field3208 = new int[16];
		this.field3209 = new int[16];
		this.field3212 = new int[16];
		this.field3211 = new int[16];
		this.field3204 = new int[16];
		this.field3203 = new int[16];
		this.field3214 = new int[16];
		this.field3210 = new int[16];
		this.field3217 = new int[16];
		this.field3218 = new int[16];
		this.field3229 = new int[16];
		this.field3220 = new int[16];
		this.field3207 = new int[16];
		this.field3215 = new MusicPatchNode[16][128];
		this.field3223 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.musicPatches = new NodeHashTable(128);
		this.method5273();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "273043499")
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3222 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "6")
	public int method5254() {
		return this.field3222;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljj;Llh;Laq;II)Z", garbageValue = "-1742328873")
	@Export("loadMusicTrack")
	public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method5466();
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
			if (!var9.method5424(var3, var7.byteArray, var6)) {
				var5 = false;
			}
		}
		if (var5) {
			var1.clear();
		}
		return var5;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "490922950")
	@Export("clearAll")
	public synchronized void clearAll() {
		for (MusicPatch var1 = ((MusicPatch) (this.musicPatches.first())); var1 != null; var1 = ((MusicPatch) (this.musicPatches.next()))) {
			var1.clear();
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "732402985")
	@Export("removeAll")
	public synchronized void removeAll() {
		for (MusicPatch var1 = ((MusicPatch) (this.musicPatches.first())); var1 != null; var1 = ((MusicPatch) (this.musicPatches.next()))) {
			var1.remove();
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "()Laz;")
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "()Laz;")
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("w")
	protected synchronized int vmethod5437() {
		return 0;
	}

	@ObfuscatedName("y")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3205 / PcmPlayer.field287;
			do {
				long var5 = this.field3228 + ((long) (var4)) * ((long) (var3));
				if (this.field3221 - var5 >= 0L) {
					this.field3228 = var5;
					break;
				}
				int var7 = ((int) ((this.field3221 - this.field3228 + ((long) (var4)) - 1L) / ((long) (var4))));
				this.field3228 += ((long) (var4)) * ((long) (var7));
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method5286();
			} while (this.midiFile.isReady() );
		}
		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(Ljj;ZI)V", garbageValue = "701180303")
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field3213 = var2;
		this.field3228 = 0L;
		int var3 = this.midiFile.trackCount();
		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}
		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field3221 = this.midiFile.method5399(this.trackLength);
	}

	@ObfuscatedName("s")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3205 / PcmPlayer.field287;
			do {
				long var3 = ((long) (var2)) * ((long) (var1)) + this.field3228;
				if (this.field3221 - var3 >= 0L) {
					this.field3228 = var3;
					break;
				}
				int var5 = ((int) ((((long) (var2)) + (this.field3221 - this.field3228) - 1L) / ((long) (var2))));
				this.field3228 += ((long) (var5)) * ((long) (var2));
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method5286();
			} while (this.midiFile.isReady() );
		}
		this.patchStream.skip(var1);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-480918155")
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method5273();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "2138811243")
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "734019784")
	public synchronized void method5304(int var1, int var2) {
		this.method5262(var1, var2);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "473685475")
	void method5262(int var1, int var2) {
		this.field3209[var1] = var2;
		this.field3211[var1] = var2 & -128;
		this.method5263(var1, var2);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-1752032283")
	void method5263(int var1, int var2) {
		if (var2 != this.field3212[var1]) {
			this.field3212[var1] = var2;
			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3223[var1][var3] = null;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(IIII)V", garbageValue = "-276178565")
	void method5329(int var1, int var2, int var3) {
		this.method5266(var1, var2, 64);
		if ((this.field3210[var1] & 2) != 0) {
			for (MusicPatchNode var4 = ((MusicPatchNode) (this.patchStream.queue.first())); var4 != null; var4 = ((MusicPatchNode) (this.patchStream.queue.next()))) {
				if (var4.field3284 == var1 && var4.field3278 < 0) {
					this.field3215[var1][var4.field3269] = null;
					this.field3215[var1][var2] = var4;
					int var8 = (var4.field3273 * var4.field3277 >> 12) + var4.field3272;
					var4.field3272 += var2 - var4.field3269 << 8;
					var4.field3273 = var8 - var4.field3272;
					var4.field3277 = 4096;
					var4.field3269 = var2;
					return;
				}
			}
		}
		MusicPatch var9 = ((MusicPatch) (this.musicPatches.get(((long) (this.field3212[var1])))));
		if (var9 != null) {
			RawSound var5 = var9.rawSounds[var2];
			if (var5 != null) {
				MusicPatchNode var6 = new MusicPatchNode();
				var6.field3284 = var1;
				var6.patch = var9;
				var6.rawSound = var5;
				var6.field3264 = var9.field3252[var2];
				var6.field3267 = var9.field3249[var2];
				var6.field3269 = var2;
				var6.field3282 = var3 * var3 * var9.field3253[var2] * var9.field3247 + 1024 >> 11;
				var6.field3271 = var9.field3251[var2] & 255;
				var6.field3272 = (var2 << 8) - (var9.field3250[var2] & 32767);
				var6.field3275 = 0;
				var6.field3276 = 0;
				var6.field3274 = 0;
				var6.field3278 = -1;
				var6.field3279 = 0;
				if (this.field3229[var1] == 0) {
					var6.stream = RawPcmStream.method775(var5, this.method5278(var6), this.method5279(var6), this.method5312(var6));
				} else {
					var6.stream = RawPcmStream.method775(var5, this.method5278(var6), 0, this.method5312(var6));
					this.method5264(var6, var9.field3250[var2] < 0);
				}
				if (var9.field3250[var2] < 0) {
					var6.stream.setNumLoops(-1);
				}
				if (var6.field3267 >= 0) {
					MusicPatchNode var7 = this.field3223[var1][var6.field3267];
					if (var7 != null && var7.field3278 < 0) {
						this.field3215[var1][var7.field3269] = null;
						var7.field3278 = 0;
					}
					this.field3223[var1][var6.field3267] = var6;
				}
				this.patchStream.queue.addFirst(var6);
				this.field3215[var1][var2] = var6;
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(Ljm;ZI)V", garbageValue = "230504293")
	void method5264(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field261) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = ((int) (((long) (this.field3229[var1.field3284])) * ((long) (var5)) >> 6));
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method784();
			}
		} else {
			var4 = ((int) (((long) (var3)) * ((long) (this.field3229[var1.field3284])) >> 6));
		}
		var1.stream.method786(var4);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(IIIB)V", garbageValue = "12")
	void method5266(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3215[var1][var2];
		if (var4 != null) {
			this.field3215[var1][var2] = null;
			if ((this.field3210[var1] & 2) != 0) {
				for (MusicPatchNode var5 = ((MusicPatchNode) (this.patchStream.queue.last())); var5 != null; var5 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
					if (var5.field3284 == var4.field3284 && var5.field3278 < 0 && var4 != var5) {
						var4.field3278 = 0;
						break;
					}
				}
			} else {
				var4.field3278 = 0;
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(IIII)V", garbageValue = "-691245882")
	void method5267(int var1, int var2, int var3) {
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "1452089614")
	void method5362(int var1, int var2) {
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "114")
	void method5272(int var1, int var2) {
		this.field3204[var1] = var2;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "880130085")
	void method5358(int var1) {
		for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
			if (var1 < 0 || var2.field3284 == var1) {
				if (var2.stream != null) {
					var2.stream.method802(PcmPlayer.field287 / 100);
					if (var2.stream.method792()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}
					var2.method5471();
				}
				if (var2.field3278 < 0) {
					this.field3215[var2.field3284][var2.field3269] = null;
				}
				var2.remove();
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "32")
	void method5252(int var1) {
		if (var1 >= 0) {
			this.field3206[var1] = 12800;
			this.field3225[var1] = 8192;
			this.field3208[var1] = 16383;
			this.field3204[var1] = 8192;
			this.field3203[var1] = 0;
			this.field3214[var1] = 8192;
			this.method5274(var1);
			this.method5275(var1);
			this.field3210[var1] = 0;
			this.field3217[var1] = 32767;
			this.field3218[var1] = 256;
			this.field3229[var1] = 0;
			this.method5277(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method5252(var1);
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-861442886")
	void method5326(int var1) {
		for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
			if ((var1 < 0 || var2.field3284 == var1) && var2.field3278 < 0) {
				this.field3215[var2.field3284][var2.field3269] = null;
				var2.field3278 = 0;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "521776842")
	void method5273() {
		this.method5358(-1);
		this.method5252(-1);
		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3212[var1] = this.field3209[var1];
		}
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3211[var1] = this.field3209[var1] & -128;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1976817510")
	void method5274(int var1) {
		if ((this.field3210[var1] & 2) != 0) {
			for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
				if (var2.field3284 == var1 && this.field3215[var1][var2.field3269] == null && var2.field3278 < 0) {
					var2.field3278 = 0;
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "0")
	void method5275(int var1) {
		if ((this.field3210[var1] & 4) != 0) {
			for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
				if (var2.field3284 == var1) {
					var2.field3270 = 0;
				}
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "834979458")
	void method5276(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method5266(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method5329(var3, var4, var5);
			} else {
				this.method5266(var3, var4, 64);
			}
		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method5267(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3211[var3] = (var5 << 14) + (this.field3211[var3] & -2080769);
			}
			if (var4 == 32) {
				this.field3211[var3] = (var5 << 7) + (this.field3211[var3] & -16257);
			}
			if (var4 == 1) {
				this.field3203[var3] = (var5 << 7) + (this.field3203[var3] & -16257);
			}
			if (var4 == 33) {
				this.field3203[var3] = var5 + (this.field3203[var3] & -128);
			}
			if (var4 == 5) {
				this.field3214[var3] = (var5 << 7) + (this.field3214[var3] & -16257);
			}
			if (var4 == 37) {
				this.field3214[var3] = var5 + (this.field3214[var3] & -128);
			}
			if (var4 == 7) {
				this.field3206[var3] = (var5 << 7) + (this.field3206[var3] & -16257);
			}
			if (var4 == 39) {
				this.field3206[var3] = var5 + (this.field3206[var3] & -128);
			}
			if (var4 == 10) {
				this.field3225[var3] = (var5 << 7) + (this.field3225[var3] & -16257);
			}
			if (var4 == 42) {
				this.field3225[var3] = var5 + (this.field3225[var3] & -128);
			}
			if (var4 == 11) {
				this.field3208[var3] = (var5 << 7) + (this.field3208[var3] & -16257);
			}
			if (var4 == 43) {
				this.field3208[var3] = var5 + (this.field3208[var3] & -128);
			}
			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3210;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3210;
					var10000[var3] &= -2;
				}
			}
			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3210;
					var10000[var3] |= 2;
				} else {
					this.method5274(var3);
					var10000 = this.field3210;
					var10000[var3] &= -3;
				}
			}
			if (var4 == 99) {
				this.field3217[var3] = (var5 << 7) + (this.field3217[var3] & 127);
			}
			if (var4 == 98) {
				this.field3217[var3] = (this.field3217[var3] & 16256) + var5;
			}
			if (var4 == 101) {
				this.field3217[var3] = (var5 << 7) + (this.field3217[var3] & 127) + 16384;
			}
			if (var4 == 100) {
				this.field3217[var3] = (this.field3217[var3] & 16256) + var5 + 16384;
			}
			if (var4 == 120) {
				this.method5358(var3);
			}
			if (var4 == 121) {
				this.method5252(var3);
			}
			if (var4 == 123) {
				this.method5326(var3);
			}
			int var6;
			if (var4 == 6) {
				var6 = this.field3217[var3];
				if (var6 == 16384) {
					this.field3218[var3] = (var5 << 7) + (this.field3218[var3] & -16257);
				}
			}
			if (var4 == 38) {
				var6 = this.field3217[var3];
				if (var6 == 16384) {
					this.field3218[var3] = var5 + (this.field3218[var3] & -128);
				}
			}
			if (var4 == 16) {
				this.field3229[var3] = (var5 << 7) + (this.field3229[var3] & -16257);
			}
			if (var4 == 48) {
				this.field3229[var3] = var5 + (this.field3229[var3] & -128);
			}
			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3210;
					var10000[var3] |= 4;
				} else {
					this.method5275(var3);
					var10000 = this.field3210;
					var10000[var3] &= -5;
				}
			}
			if (var4 == 17) {
				this.method5277(var3, (var5 << 7) + (this.field3220[var3] & -16257));
			}
			if (var4 == 49) {
				this.method5277(var3, var5 + (this.field3220[var3] & -128));
			}
		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method5263(var3, var4 + this.field3211[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method5362(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method5272(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method5273();
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "1788030679")
	void method5277(int var1, int var2) {
		this.field3220[var1] = var2;
		this.field3207[var1] = ((int) (2097152.0 * Math.pow(2.0, 5.4931640625E-4 * ((double) (var2))) + 0.5));
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(descriptor = "(Ljm;B)I", garbageValue = "-45")
	int method5278(MusicPatchNode var1) {
		int var2 = (var1.field3277 * var1.field3273 >> 12) + var1.field3272;
		var2 += (this.field3204[var1.field3284] - 8192) * this.field3218[var1.field3284] >> 12;
		MusicPatchNode2 var3 = var1.field3264;
		int var4;
		if (var3.field3187 > 0 && (var3.field3186 > 0 || this.field3203[var1.field3284] > 0)) {
			var4 = var3.field3186 << 2;
			int var5 = var3.field3188 << 1;
			if (var1.field3280 < var5) {
				var4 = var4 * var1.field3280 / var5;
			}
			var4 += this.field3203[var1.field3284] >> 7;
			double var6 = Math.sin(((double) (var1.field3281 & 511)) * 0.01227184630308513);
			var2 += ((int) (var6 * ((double) (var4))));
		}
		var4 = ((int) (((double) (var1.rawSound.sampleRate * 256)) * Math.pow(2.0, 3.255208333333333E-4 * ((double) (var2))) / ((double) (PcmPlayer.field287)) + 0.5));
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = "(Ljm;I)I", garbageValue = "-512003611")
	int method5279(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3264;
		int var3 = this.field3206[var1.field3284] * this.field3208[var1.field3284] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3282 + 16384 >> 15;
		var3 = var3 * this.field3222 + 128 >> 8;
		if (var2.field3182 > 0) {
			var3 = ((int) (((double) (var3)) * Math.pow(0.5, ((double) (var1.field3275)) * 1.953125E-5 * ((double) (var2.field3182))) + 0.5));
		}
		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3184 != null) {
			var4 = var1.field3276;
			var5 = var2.field3184[var1.field3274 + 1];
			if (var1.field3274 < var2.field3184.length - 2) {
				var6 = (var2.field3184[var1.field3274] & 255) << 8;
				var7 = (var2.field3184[var1.field3274 + 2] & 255) << 8;
				var5 += (var2.field3184[var1.field3274 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}
			var3 = var5 * var3 + 32 >> 6;
		}
		if (var1.field3278 > 0 && var2.field3181 != null) {
			var4 = var1.field3278;
			var5 = var2.field3181[var1.field3279 + 1];
			if (var1.field3279 < var2.field3181.length - 2) {
				var6 = (var2.field3181[var1.field3279] & 255) << 8;
				var7 = (var2.field3181[var1.field3279 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3181[var1.field3279 + 3] - var5) / (var7 - var6);
			}
			var3 = var5 * var3 + 32 >> 6;
		}
		return var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = "(Ljm;I)I", garbageValue = "953724274")
	int method5312(MusicPatchNode var1) {
		int var2 = this.field3225[var1.field3284];
		return var2 < 8192 ? var2 * var1.field3271 + 32 >> 6 : 16384 - ((128 - var1.field3271) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-456467428")
	void method5286() {
		int var1 = this.track;
		int var2 = this.trackLength;
		long var3;
		for (var3 = this.field3221; var2 == this.trackLength; var3 = this.midiFile.method5399(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3213 || var2 == 0) {
							this.method5273();
							this.midiFile.clear();
							return;
						}
						this.midiFile.reset(var3);
					}
					break;
				}
				if ((var5 & 128) != 0) {
					this.method5276(var5);
				}
				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			} 
			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}
		this.track = var1;
		this.trackLength = var2;
		this.field3221 = var3;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "(Ljm;I)Z", garbageValue = "-29453707")
	boolean method5287(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3278 >= 0) {
				var1.remove();
				if (var1.field3267 > 0 && var1 == this.field3223[var1.field3284][var1.field3267]) {
					this.field3223[var1.field3284][var1.field3267] = null;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = "(Ljm;[IIII)Z", garbageValue = "12609433")
	boolean method5317(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3283 = PcmPlayer.field287 / 100;
		if (var1.field3278 < 0 || var1.stream != null && !var1.stream.method860()) {
			int var5 = var1.field3277;
			if (var5 > 0) {
				var5 -= ((int) (16.0 * Math.pow(2.0, ((double) (this.field3214[var1.field3284])) * 4.921259842519685E-4) + 0.5));
				if (var5 < 0) {
					var5 = 0;
				}
				var1.field3277 = var5;
			}
			var1.stream.method789(this.method5278(var1));
			MusicPatchNode2 var6 = var1.field3264;
			boolean var7 = false;
			++var1.field3280;
			var1.field3281 += var6.field3187;
			double var8 = ((double) ((var1.field3269 - 60 << 8) + (var1.field3273 * var1.field3277 >> 12))) * 5.086263020833333E-6;
			if (var6.field3182 > 0) {
				if (var6.field3183 > 0) {
					var1.field3275 += ((int) (128.0 * Math.pow(2.0, ((double) (var6.field3183)) * var8) + 0.5));
				} else {
					var1.field3275 += 128;
				}
			}
			if (var6.field3184 != null) {
				if (var6.field3190 > 0) {
					var1.field3276 += ((int) (128.0 * Math.pow(2.0, var8 * ((double) (var6.field3190))) + 0.5));
				} else {
					var1.field3276 += 128;
				}
				while (var1.field3274 < var6.field3184.length - 2 && var1.field3276 > (var6.field3184[var1.field3274 + 2] & 255) << 8) {
					var1.field3274 += 2;
				} 
				if (var6.field3184.length - 2 == var1.field3274 && var6.field3184[var1.field3274 + 1] == 0) {
					var7 = true;
				}
			}
			if (var1.field3278 >= 0 && var6.field3181 != null && (this.field3210[var1.field3284] & 1) == 0 && (var1.field3267 < 0 || var1 != this.field3223[var1.field3284][var1.field3267])) {
				if (var6.field3185 > 0) {
					var1.field3278 += ((int) (128.0 * Math.pow(2.0, var8 * ((double) (var6.field3185))) + 0.5));
				} else {
					var1.field3278 += 128;
				}
				while (var1.field3279 < var6.field3181.length - 2 && var1.field3278 > (var6.field3181[var1.field3279 + 2] & 255) << 8) {
					var1.field3279 += 2;
				} 
				if (var6.field3181.length - 2 == var1.field3279) {
					var7 = true;
				}
			}
			if (var7) {
				var1.stream.method802(var1.field3283);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}
				if (var1.stream.method792()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}
				var1.method5471();
				if (var1.field3278 >= 0) {
					var1.remove();
					if (var1.field3267 > 0 && var1 == this.field3223[var1.field3284][var1.field3267]) {
						this.field3223[var1.field3284][var1.field3267] = null;
					}
				}
				return true;
			} else {
				var1.stream.method787(var1.field3283, this.method5279(var1), this.method5312(var1));
				return false;
			}
		} else {
			var1.method5471();
			var1.remove();
			if (var1.field3267 > 0 && var1 == this.field3223[var1.field3284][var1.field3267]) {
				this.field3223[var1.field3284][var1.field3267] = null;
			}
			return true;
		}
	}
}