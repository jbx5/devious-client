import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lpo;")

	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	-748679043)

	int field3179;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	1077722431)

	int field3180;
	@ObfuscatedName("f")
	int[] field3181;
	@ObfuscatedName("b")
	int[] field3203;
	@ObfuscatedName("n")
	int[] field3183;
	@ObfuscatedName("s")
	int[] field3184;
	@ObfuscatedName("l")
	int[] field3185;
	@ObfuscatedName("q")
	int[] field3178;
	@ObfuscatedName("o")
	int[] field3187;
	@ObfuscatedName("r")
	int[] field3186;
	@ObfuscatedName("p")
	int[] field3182;
	@ObfuscatedName("x")
	int[] field3193;
	@ObfuscatedName("a")
	int[] field3202;
	@ObfuscatedName("y")
	int[] field3192;
	@ObfuscatedName("j")
	int[] field3189;
	@ObfuscatedName("e")
	int[] field3194;
	@ObfuscatedName("z")
	int[] field3195;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"[[Ljn;")

	MusicPatchNode[][] field3196;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = 
	"[[Ljn;")

	MusicPatchNode[][] field3197;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = 
	"Ljk;")

	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("aw")
	boolean field3199;
	@ObfuscatedName("am")
	@ObfuscatedGetter(intValue = 
	1021655575)

	@Export("track")
	int track;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(intValue = 
	-1014777517)

	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(longValue = 
	-4285151308752849057L)

	long field3188;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(longValue = 
	1303107017095870899L)

	long field3205;
	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = 
	"Ljt;")

	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field3179 = 256;
		this.field3180 = 1000000;
		this.field3181 = new int[16];
		this.field3203 = new int[16];
		this.field3183 = new int[16];
		this.field3184 = new int[16];
		this.field3185 = new int[16];
		this.field3178 = new int[16];
		this.field3187 = new int[16];
		this.field3186 = new int[16];
		this.field3182 = new int[16];
		this.field3193 = new int[16];
		this.field3202 = new int[16];
		this.field3192 = new int[16];
		this.field3189 = new int[16];
		this.field3194 = new int[16];
		this.field3195 = new int[16];
		this.field3196 = new MusicPatchNode[16][128];
		this.field3197 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.musicPatches = new NodeHashTable(128);
		this.method5259();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"1")

	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3179 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"2127112295")

	public int method5264() {
		return this.field3179;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Lju;Lln;Lac;IB)Z", garbageValue = 
	"36")

	@Export("loadMusicTrack")
	public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method5463();
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

			if (!var9.method5427(var3, var7.byteArray, var6)) {
				var5 = false;
			}
		}

		if (var5) {
			var1.clear();
		}

		return var5;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1039741430")

	@Export("clearAll")
	public synchronized void clearAll() {
		for (MusicPatch var1 = ((MusicPatch) (this.musicPatches.first())); var1 != null; var1 = ((MusicPatch) (this.musicPatches.next()))) {
			var1.clear();
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1531441938")

	@Export("removeAll")
	public synchronized void removeAll() {
		for (MusicPatch var1 = ((MusicPatch) (this.musicPatches.first())); var1 != null; var1 = ((MusicPatch) (this.musicPatches.next()))) {
			var1.remove();
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"()Laf;")

	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"()Laf;")

	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("l")
	protected synchronized int vmethod5441() {
		return 0;
	}

	@ObfuscatedName("q")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = (this.midiFile.division * this.field3180) / PcmPlayer.field268;

			do {
				long var5 = this.field3188 + (((long) (var4)) * ((long) (var3)));
				if ((this.field3205 - var5) >= 0L) {
					this.field3188 = var5;
					break;
				}

				int var7 = ((int) ((((this.field3205 - this.field3188) + ((long) (var4))) - 1L) / ((long) (var4))));
				this.field3188 += ((long) (var4)) * ((long) (var7));
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method5272();
			} while (this.midiFile.isReady() );
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Lju;ZB)V", garbageValue = 
	"11")

	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field3199 = var2;
		this.field3188 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field3205 = this.midiFile.method5393(this.trackLength);
	}

	@ObfuscatedName("r")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = (this.midiFile.division * this.field3180) / PcmPlayer.field268;

			do {
				long var3 = this.field3188 + (((long) (var2)) * ((long) (var1)));
				if ((this.field3205 - var3) >= 0L) {
					this.field3188 = var3;
					break;
				}

				int var5 = ((int) ((((this.field3205 - this.field3188) + ((long) (var2))) - 1L) / ((long) (var2))));
				this.field3188 += ((long) (var5)) * ((long) (var2));
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method5272();
			} while (this.midiFile.isReady() );
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"867852143")

	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method5259();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"-39")

	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(IIS)V", garbageValue = 
	"-25295")

	public synchronized void method5248(int var1, int var2) {
		this.method5249(var1, var2);
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"2146989537")

	void method5249(int var1, int var2) {
		this.field3184[var1] = var2;
		this.field3178[var1] = var2 & (-128);
		this.method5250(var1, var2);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"-1072257688")

	void method5250(int var1, int var2) {
		if (var2 != this.field3185[var1]) {
			this.field3185[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3197[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(IIII)V", garbageValue = 
	"887672121")

	void method5251(int var1, int var2, int var3) {
		this.method5252(var1, var2, 64);
		if ((this.field3193[var1] & 2) != 0) {
			for (MusicPatchNode var4 = ((MusicPatchNode) (this.patchStream.queue.first())); var4 != null; var4 = ((MusicPatchNode) (this.patchStream.queue.next()))) {
				if ((var4.field3248 == var1) && (var4.field3249 < 0)) {
					this.field3196[var1][var4.field3251] = null;
					this.field3196[var1][var2] = var4;
					int var8 = ((var4.field3245 * var4.field3244) >> 12) + var4.field3243;
					var4.field3243 += (var2 - var4.field3251) << 8;
					var4.field3244 = var8 - var4.field3243;
					var4.field3245 = 4096;
					var4.field3251 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = ((MusicPatch) (this.musicPatches.get(((long) (this.field3185[var1])))));
		if (var9 != null) {
			RawSound var5 = var9.rawSounds[var2];
			if (var5 != null) {
				MusicPatchNode var6 = new MusicPatchNode();
				var6.field3248 = var1;
				var6.patch = var9;
				var6.rawSound = var5;
				var6.field3247 = var9.field3224[var2];
				var6.field3239 = var9.field3220[var2];
				var6.field3251 = var2;
				var6.field3241 = ((((var3 * var3) * var9.field3223[var2]) * var9.field3228) + 1024) >> 11;
				var6.field3242 = var9.field3222[var2] & 255;
				var6.field3243 = (var2 << 8) - (var9.field3227[var2] & 32767);
				var6.field3246 = 0;
				var6.field3235 = 0;
				var6.field3252 = 0;
				var6.field3249 = -1;
				var6.field3250 = 0;
				if (this.field3189[var1] == 0) {
					var6.stream = RawPcmStream.method791(var5, this.method5246(var6), this.method5244(var6), this.method5302(var6));
				} else {
					var6.stream = RawPcmStream.method791(var5, this.method5246(var6), 0, this.method5302(var6));
					this.method5342(var6, var9.field3227[var2] < 0);
				}

				if (var9.field3227[var2] < 0) {
					var6.stream.setNumLoops(-1);
				}

				if (var6.field3239 >= 0) {
					MusicPatchNode var7 = this.field3197[var1][var6.field3239];
					if ((var7 != null) && (var7.field3249 < 0)) {
						this.field3196[var1][var7.field3251] = null;
						var7.field3249 = 0;
					}

					this.field3197[var1][var6.field3239] = var6;
				}

				this.patchStream.queue.addFirst(var6);
				this.field3196[var1][var2] = var6;
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = 
	"(Ljn;ZI)V", garbageValue = 
	"2081023106")

	void method5342(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field254) {
			int var5 = (var3 + var3) - var1.rawSound.start;
			var4 = ((int) ((((long) (var5)) * ((long) (this.field3189[var1.field3248]))) >> 6));
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = ((var3 + var3) - 1) - var4;
				var1.stream.method800();
			}
		} else {
			var4 = ((int) ((((long) (this.field3189[var1.field3248])) * ((long) (var3))) >> 6));
		}

		var1.stream.method799(var4);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(IIIS)V", garbageValue = 
	"-1455")

	void method5252(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3196[var1][var2];
		if (var4 != null) {
			this.field3196[var1][var2] = null;
			if ((this.field3193[var1] & 2) != 0) {
				for (MusicPatchNode var5 = ((MusicPatchNode) (this.patchStream.queue.last())); var5 != null; var5 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
					if (((var5.field3248 == var4.field3248) && (var5.field3249 < 0)) && (var5 != var4)) {
						var4.field3249 = 0;
						break;
					}
				}
			} else {
				var4.field3249 = 0;
			}

		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(IIIB)V", garbageValue = 
	"94")

	void method5253(int var1, int var2, int var3) {
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"1226196956")

	void method5254(int var1, int var2) {
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = 
	"(IIS)V", garbageValue = 
	"-18394")

	void method5255(int var1, int var2) {
		this.field3187[var1] = var2;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"74")

	void method5256(int var1) {
		for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
			if ((var1 < 0) || (var2.field3248 == var1)) {
				if (var2.stream != null) {
					var2.stream.method882(PcmPlayer.field268 / 100);
					if (var2.stream.method808()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method5473();
				}

				if (var2.field3249 < 0) {
					this.field3196[var2.field3248][var2.field3251] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1161401652")

	void method5257(int var1) {
		if (var1 >= 0) {
			this.field3181[var1] = 12800;
			this.field3203[var1] = 8192;
			this.field3183[var1] = 16383;
			this.field3187[var1] = 8192;
			this.field3186[var1] = 0;
			this.field3182[var1] = 8192;
			this.method5260(var1);
			this.method5261(var1);
			this.field3193[var1] = 0;
			this.field3202[var1] = 32767;
			this.field3192[var1] = 256;
			this.field3189[var1] = 0;
			this.method5303(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method5257(var1);
			}

		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1206801353")

	void method5258(int var1) {
		for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
			if (((var1 < 0) || (var2.field3248 == var1)) && (var2.field3249 < 0)) {
				this.field3196[var2.field3248][var2.field3251] = null;
				var2.field3249 = 0;
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1660389199")

	void method5259() {
		this.method5256(-1);
		this.method5257(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3185[var1] = this.field3184[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3178[var1] = this.field3184[var1] & (-128);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"0")

	void method5260(int var1) {
		if ((this.field3193[var1] & 2) != 0) {
			for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
				if (((var2.field3248 == var1) && (this.field3196[var1][var2.field3251] == null)) && (var2.field3249 < 0)) {
					var2.field3249 = 0;
				}
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"527815614")

	void method5261(int var1) {
		if ((this.field3193[var1] & 4) != 0) {
			for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
				if (var2.field3248 == var1) {
					var2.field3238 = 0;
				}
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-455692195")

	void method5262(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			var5 = (var1 >> 16) & 127;
			this.method5252(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			var5 = (var1 >> 16) & 127;
			if (var5 > 0) {
				this.method5251(var3, var4, var5);
			} else {
				this.method5252(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			var5 = (var1 >> 16) & 127;
			this.method5253(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			var5 = (var1 >> 16) & 127;
			if (var4 == 0) {
				this.field3178[var3] = (var5 << 14) + (this.field3178[var3] & (-2080769));
			}

			if (var4 == 32) {
				this.field3178[var3] = (var5 << 7) + (this.field3178[var3] & (-16257));
			}

			if (var4 == 1) {
				this.field3186[var3] = (var5 << 7) + (this.field3186[var3] & (-16257));
			}

			if (var4 == 33) {
				this.field3186[var3] = var5 + (this.field3186[var3] & (-128));
			}

			if (var4 == 5) {
				this.field3182[var3] = (var5 << 7) + (this.field3182[var3] & (-16257));
			}

			if (var4 == 37) {
				this.field3182[var3] = var5 + (this.field3182[var3] & (-128));
			}

			if (var4 == 7) {
				this.field3181[var3] = (var5 << 7) + (this.field3181[var3] & (-16257));
			}

			if (var4 == 39) {
				this.field3181[var3] = var5 + (this.field3181[var3] & (-128));
			}

			if (var4 == 10) {
				this.field3203[var3] = (var5 << 7) + (this.field3203[var3] & (-16257));
			}

			if (var4 == 42) {
				this.field3203[var3] = var5 + (this.field3203[var3] & (-128));
			}

			if (var4 == 11) {
				this.field3183[var3] = (var5 << 7) + (this.field3183[var3] & (-16257));
			}

			if (var4 == 43) {
				this.field3183[var3] = var5 + (this.field3183[var3] & (-128));
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3193;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3193;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3193;
					var10000[var3] |= 2;
				} else {
					this.method5260(var3);
					var10000 = this.field3193;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3202[var3] = (var5 << 7) + (this.field3202[var3] & 127);
			}

			if (var4 == 98) {
				this.field3202[var3] = (this.field3202[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3202[var3] = ((var5 << 7) + (this.field3202[var3] & 127)) + 16384;
			}

			if (var4 == 100) {
				this.field3202[var3] = ((this.field3202[var3] & 16256) + var5) + 16384;
			}

			if (var4 == 120) {
				this.method5256(var3);
			}

			if (var4 == 121) {
				this.method5257(var3);
			}

			if (var4 == 123) {
				this.method5258(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3202[var3];
				if (var6 == 16384) {
					this.field3192[var3] = (var5 << 7) + (this.field3192[var3] & (-16257));
				}
			}

			if (var4 == 38) {
				var6 = this.field3202[var3];
				if (var6 == 16384) {
					this.field3192[var3] = var5 + (this.field3192[var3] & (-128));
				}
			}

			if (var4 == 16) {
				this.field3189[var3] = (var5 << 7) + (this.field3189[var3] & (-16257));
			}

			if (var4 == 48) {
				this.field3189[var3] = var5 + (this.field3189[var3] & (-128));
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3193;
					var10000[var3] |= 4;
				} else {
					this.method5261(var3);
					var10000 = this.field3193;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method5303(var3, (var5 << 7) + (this.field3194[var3] & (-16257)));
			}

			if (var4 == 49) {
				this.method5303(var3, var5 + (this.field3194[var3] & (-128)));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			this.method5250(var3, var4 + this.field3178[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			this.method5254(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = ((var1 >> 8) & 127) + ((var1 >> 9) & 16256);
			this.method5255(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method5259();
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"8396929")

	void method5303(int var1, int var2) {
		this.field3194[var1] = var2;
		this.field3195[var1] = ((int) ((2097152.0 * Math.pow(2.0, 5.4931640625E-4 * ((double) (var2)))) + 0.5));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = 
	"(Ljn;I)I", garbageValue = 
	"2132643149")

	int method5246(MusicPatchNode var1) {
		int var2 = ((var1.field3245 * var1.field3244) >> 12) + var1.field3243;
		var2 += ((this.field3187[var1.field3248] - 8192) * this.field3192[var1.field3248]) >> 12;
		MusicPatchNode2 var3 = var1.field3247;
		int var4;
		if ((var3.field3166 > 0) && ((var3.field3161 > 0) || (this.field3186[var1.field3248] > 0))) {
			var4 = var3.field3161 << 2;
			int var5 = var3.field3167 << 1;
			if (var1.field3253 < var5) {
				var4 = (var4 * var1.field3253) / var5;
			}

			var4 += this.field3186[var1.field3248] >> 7;
			double var6 = Math.sin(0.01227184630308513 * ((double) (var1.field3237 & 511)));
			var2 += ((int) (((double) (var4)) * var6));
		}

		var4 = ((int) (((((double) (var1.rawSound.sampleRate * 256)) * Math.pow(2.0, ((double) (var2)) * 3.255208333333333E-4)) / ((double) (PcmPlayer.field268))) + 0.5));
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = 
	"(Ljn;B)I", garbageValue = 
	"22")

	int method5244(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3247;
		int var3 = ((this.field3181[var1.field3248] * this.field3183[var1.field3248]) + 4096) >> 13;
		var3 = ((var3 * var3) + 16384) >> 15;
		var3 = ((var3 * var1.field3241) + 16384) >> 15;
		var3 = ((var3 * this.field3179) + 128) >> 8;
		if (var2.field3162 > 0) {
			var3 = ((int) ((((double) (var3)) * Math.pow(0.5, (1.953125E-5 * ((double) (var1.field3246))) * ((double) (var2.field3162)))) + 0.5));
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3160 != null) {
			var4 = var1.field3235;
			var5 = var2.field3160[var1.field3252 + 1];
			if (var1.field3252 < (var2.field3160.length - 2)) {
				var6 = (var2.field3160[var1.field3252] & 255) << 8;
				var7 = (var2.field3160[var1.field3252 + 2] & 255) << 8;
				var5 += ((var2.field3160[var1.field3252 + 3] - var5) * (var4 - var6)) / (var7 - var6);
			}

			var3 = ((var3 * var5) + 32) >> 6;
		}

		if ((var1.field3249 > 0) && (var2.field3165 != null)) {
			var4 = var1.field3249;
			var5 = var2.field3165[var1.field3250 + 1];
			if (var1.field3250 < (var2.field3165.length - 2)) {
				var6 = (var2.field3165[var1.field3250] & 255) << 8;
				var7 = (var2.field3165[var1.field3250 + 2] & 255) << 8;
				var5 += ((var4 - var6) * (var2.field3165[var1.field3250 + 3] - var5)) / (var7 - var6);
			}

			var3 = ((var3 * var5) + 32) >> 6;
		}

		return var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(descriptor = 
	"(Ljn;I)I", garbageValue = 
	"17665426")

	int method5302(MusicPatchNode var1) {
		int var2 = this.field3203[var1.field3248];
		return var2 < 8192 ? ((var2 * var1.field3242) + 32) >> 6 : 16384 - ((((128 - var1.field3242) * (16384 - var2)) + 32) >> 6);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"2142415416")

	void method5272() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3205; var2 == this.trackLength; var3 = this.midiFile.method5393(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if ((!this.field3199) || (var2 == 0)) {
							this.method5259();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method5262(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			} 

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3205 = var3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(descriptor = 
	"(Ljn;I)Z", garbageValue = 
	"1597341922")

	boolean method5273(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3249 >= 0) {
				var1.remove();
				if ((var1.field3239 > 0) && (var1 == this.field3197[var1.field3248][var1.field3239])) {
					this.field3197[var1.field3248][var1.field3239] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = 
	"(Ljn;[IIII)Z", garbageValue = 
	"-1282463450")

	boolean method5311(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3255 = PcmPlayer.field268 / 100;
		if ((var1.field3249 < 0) || ((var1.stream != null) && (!var1.stream.method830()))) {
			int var5 = var1.field3245;
			if (var5 > 0) {
				var5 -= ((int) ((16.0 * Math.pow(2.0, ((double) (this.field3182[var1.field3248])) * 4.921259842519685E-4)) + 0.5));
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3245 = var5;
			}

			var1.stream.method896(this.method5246(var1));
			MusicPatchNode2 var6 = var1.field3247;
			boolean var7 = false;
			++var1.field3253;
			var1.field3237 += var6.field3166;
			double var8 = ((double) (((var1.field3251 - 60) << 8) + ((var1.field3245 * var1.field3244) >> 12))) * 5.086263020833333E-6;
			if (var6.field3162 > 0) {
				if (var6.field3164 > 0) {
					var1.field3246 += ((int) ((128.0 * Math.pow(2.0, ((double) (var6.field3164)) * var8)) + 0.5));
				} else {
					var1.field3246 += 128;
				}
			}

			if (var6.field3160 != null) {
				if (var6.field3159 > 0) {
					var1.field3235 += ((int) ((128.0 * Math.pow(2.0, ((double) (var6.field3159)) * var8)) + 0.5));
				} else {
					var1.field3235 += 128;
				}

				while ((var1.field3252 < (var6.field3160.length - 2)) && (var1.field3235 > ((var6.field3160[var1.field3252 + 2] & 255) << 8))) {
					var1.field3252 += 2;
				} 

				if (((var6.field3160.length - 2) == var1.field3252) && (var6.field3160[var1.field3252 + 1] == 0)) {
					var7 = true;
				}
			}

			if ((((var1.field3249 >= 0) && (var6.field3165 != null)) && ((this.field3193[var1.field3248] & 1) == 0)) && ((var1.field3239 < 0) || (var1 != this.field3197[var1.field3248][var1.field3239]))) {
				if (var6.field3163 > 0) {
					var1.field3249 += ((int) ((128.0 * Math.pow(2.0, var8 * ((double) (var6.field3163)))) + 0.5));
				} else {
					var1.field3249 += 128;
				}

				while ((var1.field3250 < (var6.field3165.length - 2)) && (var1.field3249 > ((var6.field3165[var1.field3250 + 2] & 255) << 8))) {
					var1.field3250 += 2;
				} 

				if ((var6.field3165.length - 2) == var1.field3250) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method882(var1.field3255);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method808()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method5473();
				if (var1.field3249 >= 0) {
					var1.remove();
					if ((var1.field3239 > 0) && (var1 == this.field3197[var1.field3248][var1.field3239])) {
						this.field3197[var1.field3248][var1.field3239] = null;
					}
				}

				return true;
			} else {
				var1.stream.method880(var1.field3255, this.method5244(var1), this.method5302(var1));
				return false;
			}
		} else {
			var1.method5473();
			var1.remove();
			if ((var1.field3239 > 0) && (var1 == this.field3197[var1.field3248][var1.field3239])) {
				this.field3197[var1.field3248][var1.field3239] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lln;Ljava/lang/String;Ljava/lang/String;IZI)V", garbageValue = 
	"1823520808")

	public static void method5368(AbstractArchive var0, String var1, String var2, int var3, boolean var4) {
		int var5 = var0.getGroupId(var1);
		int var6 = var0.getFileId(var5, var2);
		class18.method266(var0, var5, var6, var3, var4);
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(descriptor = 
	"(ILjava/lang/String;B)V", garbageValue = 
	"-126")

	static void method5366(int var0, String var1) {
		int var2 = Players.Players_count;
		int[] var3 = Players.Players_indices;
		boolean var4 = false;
		Username var5 = new Username(var1, class122.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = Client.players[var3[var6]];
			if ((((var7 != null) && (var7 != GrandExchangeEvents.localPlayer)) && (var7.username != null)) && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortLE(var3[var6]);
					var8.packetBuffer.writeByteAdd(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByteNeg(0);
					var8.packetBuffer.writeShort(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortAddLE(var3[var6]);
					var8.packetBuffer.writeByte(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(var3[var6]);
					var8.packetBuffer.writeByteAdd(0);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			Actor.addGameMessage(4, "", "Unable to find " + var1);
		}

	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)V", garbageValue = 
	"2065627422")

	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (ClientPacket.friendsChat != null) {
			PacketBufferNode var1 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2909, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class425.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}