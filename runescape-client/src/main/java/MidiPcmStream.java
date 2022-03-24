import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lpo;")

	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	761028561)

	int field3185;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	450471691)

	int field3186;
	@ObfuscatedName("g")
	int[] field3187;
	@ObfuscatedName("l")
	int[] field3197;
	@ObfuscatedName("n")
	int[] field3189;
	@ObfuscatedName("d")
	int[] field3209;
	@ObfuscatedName("f")
	int[] field3184;
	@ObfuscatedName("u")
	int[] field3188;
	@ObfuscatedName("r")
	int[] field3193;
	@ObfuscatedName("k")
	int[] field3194;
	@ObfuscatedName("x")
	int[] field3195;
	@ObfuscatedName("m")
	int[] field3200;
	@ObfuscatedName("q")
	int[] field3201;
	@ObfuscatedName("y")
	int[] field3192;
	@ObfuscatedName("z")
	int[] field3190;
	@ObfuscatedName("e")
	int[] field3198;
	@ObfuscatedName("t")
	int[] field3202;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"[[Lju;")

	MusicPatchNode[][] field3203;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = 
	"[[Lju;")

	MusicPatchNode[][] field3204;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = 
	"Ljh;")

	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("ay")
	boolean field3206;
	@ObfuscatedName("au")
	@ObfuscatedGetter(intValue = 
	-1856926235)

	@Export("track")
	int track;
	@ObfuscatedName("at")
	@ObfuscatedGetter(intValue = 
	-1471582063)

	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(longValue = 
	1372390408550668693L)

	long field3199;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(longValue = 
	-7848885153992378789L)

	long field3210;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = 
	"Ljr;")

	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field3185 = 256;
		this.field3186 = 1000000;
		this.field3187 = new int[16];
		this.field3197 = new int[16];
		this.field3189 = new int[16];
		this.field3209 = new int[16];
		this.field3184 = new int[16];
		this.field3188 = new int[16];
		this.field3193 = new int[16];
		this.field3194 = new int[16];
		this.field3195 = new int[16];
		this.field3200 = new int[16];
		this.field3201 = new int[16];
		this.field3192 = new int[16];
		this.field3190 = new int[16];
		this.field3198 = new int[16];
		this.field3202 = new int[16];
		this.field3203 = new MusicPatchNode[16][128];
		this.field3204 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.musicPatches = new NodeHashTable(128);
		this.method5351();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-724813069")

	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3185 = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"1")

	int method5369() {
		return this.field3185;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(Ljs;Llq;Lan;II)Z", garbageValue = 
	"887201995")

	@Export("loadMusicTrack")
	synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method5489();
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

			if (!var9.method5460(var3, var7.byteArray, var6)) {
				var5 = false;
			}
		}

		if (var5) {
			var1.clear();
		}

		return var5;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1460535885")

	@Export("clearAll")
	synchronized void clearAll() {
		for (MusicPatch var1 = ((MusicPatch) (this.musicPatches.first())); var1 != null; var1 = ((MusicPatch) (this.musicPatches.next()))) {
			var1.clear();
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"30")

	@Export("removeAll")
	synchronized void removeAll() {
		for (MusicPatch var1 = ((MusicPatch) (this.musicPatches.first())); var1 != null; var1 = ((MusicPatch) (this.musicPatches.next()))) {
			var1.remove();
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"()Lal;")

	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"()Lal;")

	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("f")
	protected synchronized int vmethod5476() {
		return 0;
	}

	@ObfuscatedName("u")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = (this.midiFile.division * this.field3186) / SecureRandomFuture.field949;

			do {
				long var5 = (((long) (var3)) * ((long) (var4))) + this.field3199;
				if ((this.field3210 - var5) >= 0L) {
					this.field3199 = var5;
					break;
				}

				int var7 = ((int) (((((long) (var4)) + (this.field3210 - this.field3199)) - 1L) / ((long) (var4))));
				this.field3199 += ((long) (var4)) * ((long) (var7));
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method5364();
			} while (this.midiFile.isReady() );
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(Ljs;ZB)V", garbageValue = 
	"-52")

	@Export("setMusicTrack")
	synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field3206 = var2;
		this.field3199 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field3210 = this.midiFile.method5444(this.trackLength);
	}

	@ObfuscatedName("k")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = (this.midiFile.division * this.field3186) / SecureRandomFuture.field949;

			do {
				long var3 = (((long) (var1)) * ((long) (var2))) + this.field3199;
				if ((this.field3210 - var3) >= 0L) {
					this.field3199 = var3;
					break;
				}

				int var5 = ((int) (((((long) (var2)) + (this.field3210 - this.field3199)) - 1L) / ((long) (var2))));
				this.field3199 += ((long) (var2)) * ((long) (var5));
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method5364();
			} while (this.midiFile.isReady() );
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"108826747")

	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method5351();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"1770050412")

	@Export("isReady")
	synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"-1895183848")

	public synchronized void method5281(int var1, int var2) {
		this.method5282(var1, var2);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"-1146720138")

	void method5282(int var1, int var2) {
		this.field3209[var1] = var2;
		this.field3188[var1] = var2 & (-128);
		this.method5310(var1, var2);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"-1965921844")

	void method5310(int var1, int var2) {
		if (var2 != this.field3184[var1]) {
			this.field3184[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3204[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(IIII)V", garbageValue = 
	"-2030579325")

	void method5358(int var1, int var2, int var3) {
		this.method5286(var1, var2, 64);
		if ((this.field3200[var1] & 2) != 0) {
			for (MusicPatchNode var4 = ((MusicPatchNode) (this.patchStream.queue.first())); var4 != null; var4 = ((MusicPatchNode) (this.patchStream.queue.next()))) {
				if ((var4.field3240 == var1) && (var4.field3253 < 0)) {
					this.field3203[var1][var4.field3244] = null;
					this.field3203[var1][var2] = var4;
					int var8 = ((var4.field3249 * var4.field3248) >> 12) + var4.field3247;
					var4.field3247 += (var2 - var4.field3244) << 8;
					var4.field3248 = var8 - var4.field3247;
					var4.field3249 = 4096;
					var4.field3244 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = ((MusicPatch) (this.musicPatches.get(((long) (this.field3184[var1])))));
		if (var9 != null) {
			RawSound var5 = var9.rawSounds[var2];
			if (var5 != null) {
				MusicPatchNode var6 = new MusicPatchNode();
				var6.field3240 = var1;
				var6.patch = var9;
				var6.rawSound = var5;
				var6.field3242 = var9.field3231[var2];
				var6.field3243 = var9.field3232[var2];
				var6.field3244 = var2;
				var6.field3245 = ((((var3 * var3) * var9.field3229[var2]) * var9.field3227) + 1024) >> 11;
				var6.field3254 = var9.field3230[var2] & 255;
				var6.field3247 = (var2 << 8) - (var9.field3228[var2] & 32767);
				var6.field3251 = 0;
				var6.field3255 = 0;
				var6.field3252 = 0;
				var6.field3253 = -1;
				var6.field3250 = 0;
				if (this.field3190[var1] == 0) {
					var6.stream = RawPcmStream.method924(var5, this.method5290(var6), this.method5299(var6), this.method5318(var6));
				} else {
					var6.stream = RawPcmStream.method924(var5, this.method5290(var6), 0, this.method5318(var6));
					this.method5285(var6, var9.field3228[var2] < 0);
				}

				if (var9.field3228[var2] < 0) {
					var6.stream.setNumLoops(-1);
				}

				if (var6.field3243 >= 0) {
					MusicPatchNode var7 = this.field3204[var1][var6.field3243];
					if ((var7 != null) && (var7.field3253 < 0)) {
						this.field3203[var1][var7.field3244] = null;
						var7.field3253 = 0;
					}

					this.field3204[var1][var6.field3243] = var6;
				}

				this.patchStream.queue.addFirst(var6);
				this.field3203[var1][var2] = var6;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(Lju;ZS)V", garbageValue = 
	"16256")

	void method5285(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field266) {
			int var5 = (var3 + var3) - var1.rawSound.start;
			var4 = ((int) ((((long) (var5)) * ((long) (this.field3190[var1.field3240]))) >> 6));
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = ((var3 + var3) - 1) - var4;
				var1.stream.method824();
			}
		} else {
			var4 = ((int) ((((long) (var3)) * ((long) (this.field3190[var1.field3240]))) >> 6));
		}

		var1.stream.method897(var4);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = 
	"(IIIS)V", garbageValue = 
	"17734")

	void method5286(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3203[var1][var2];
		if (var4 != null) {
			this.field3203[var1][var2] = null;
			if ((this.field3200[var1] & 2) != 0) {
				for (MusicPatchNode var5 = ((MusicPatchNode) (this.patchStream.queue.last())); var5 != null; var5 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
					if (((var4.field3240 == var5.field3240) && (var5.field3253 < 0)) && (var5 != var4)) {
						var4.field3253 = 0;
						break;
					}
				}
			} else {
				var4.field3253 = 0;
			}

		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"(IIII)V", garbageValue = 
	"152018359")

	void method5287(int var1, int var2, int var3) {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"-295771769")

	void method5404(int var1, int var2) {
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = 
	"(IIS)V", garbageValue = 
	"15603")

	void method5289(int var1, int var2) {
		this.field3193[var1] = var2;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1957544878")

	void method5294(int var1) {
		for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
			if ((var1 < 0) || (var2.field3240 == var1)) {
				if (var2.stream != null) {
					var2.stream.method828(SecureRandomFuture.field949 / 100);
					if (var2.stream.method832()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method5501();
				}

				if (var2.field3253 < 0) {
					this.field3203[var2.field3240][var2.field3244] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"33")

	void method5308(int var1) {
		if (var1 >= 0) {
			this.field3187[var1] = 12800;
			this.field3197[var1] = 8192;
			this.field3189[var1] = 16383;
			this.field3193[var1] = 8192;
			this.field3194[var1] = 0;
			this.field3195[var1] = 8192;
			this.method5371(var1);
			this.method5295(var1);
			this.field3200[var1] = 0;
			this.field3201[var1] = 32767;
			this.field3192[var1] = 256;
			this.field3190[var1] = 0;
			this.method5297(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method5308(var1);
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"754465423")

	void method5292(int var1) {
		for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
			if (((var1 < 0) || (var2.field3240 == var1)) && (var2.field3253 < 0)) {
				this.field3203[var2.field3240][var2.field3244] = null;
				var2.field3253 = 0;
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = 
	"(S)V", garbageValue = 
	"-30072")

	void method5351() {
		this.method5294(-1);
		this.method5308(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3184[var1] = this.field3209[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3188[var1] = this.field3209[var1] & (-128);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-1200671157")

	void method5371(int var1) {
		if ((this.field3200[var1] & 2) != 0) {
			for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
				if (((var2.field3240 == var1) && (this.field3203[var1][var2.field3244] == null)) && (var2.field3253 < 0)) {
					var2.field3253 = 0;
				}
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-985236501")

	void method5295(int var1) {
		if ((this.field3200[var1] & 4) != 0) {
			for (MusicPatchNode var2 = ((MusicPatchNode) (this.patchStream.queue.last())); var2 != null; var2 = ((MusicPatchNode) (this.patchStream.queue.previous()))) {
				if (var2.field3240 == var1) {
					var2.field3239 = 0;
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1952001364")

	void method5296(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			var5 = (var1 >> 16) & 127;
			this.method5286(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			var5 = (var1 >> 16) & 127;
			if (var5 > 0) {
				this.method5358(var3, var4, var5);
			} else {
				this.method5286(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			var5 = (var1 >> 16) & 127;
			this.method5287(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			var5 = (var1 >> 16) & 127;
			if (var4 == 0) {
				this.field3188[var3] = (var5 << 14) + (this.field3188[var3] & (-2080769));
			}

			if (var4 == 32) {
				this.field3188[var3] = (var5 << 7) + (this.field3188[var3] & (-16257));
			}

			if (var4 == 1) {
				this.field3194[var3] = (var5 << 7) + (this.field3194[var3] & (-16257));
			}

			if (var4 == 33) {
				this.field3194[var3] = var5 + (this.field3194[var3] & (-128));
			}

			if (var4 == 5) {
				this.field3195[var3] = (var5 << 7) + (this.field3195[var3] & (-16257));
			}

			if (var4 == 37) {
				this.field3195[var3] = var5 + (this.field3195[var3] & (-128));
			}

			if (var4 == 7) {
				this.field3187[var3] = (var5 << 7) + (this.field3187[var3] & (-16257));
			}

			if (var4 == 39) {
				this.field3187[var3] = var5 + (this.field3187[var3] & (-128));
			}

			if (var4 == 10) {
				this.field3197[var3] = (var5 << 7) + (this.field3197[var3] & (-16257));
			}

			if (var4 == 42) {
				this.field3197[var3] = var5 + (this.field3197[var3] & (-128));
			}

			if (var4 == 11) {
				this.field3189[var3] = (var5 << 7) + (this.field3189[var3] & (-16257));
			}

			if (var4 == 43) {
				this.field3189[var3] = var5 + (this.field3189[var3] & (-128));
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3200;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3200;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3200;
					var10000[var3] |= 2;
				} else {
					this.method5371(var3);
					var10000 = this.field3200;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3201[var3] = (var5 << 7) + (this.field3201[var3] & 127);
			}

			if (var4 == 98) {
				this.field3201[var3] = (this.field3201[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3201[var3] = ((var5 << 7) + (this.field3201[var3] & 127)) + 16384;
			}

			if (var4 == 100) {
				this.field3201[var3] = ((this.field3201[var3] & 16256) + var5) + 16384;
			}

			if (var4 == 120) {
				this.method5294(var3);
			}

			if (var4 == 121) {
				this.method5308(var3);
			}

			if (var4 == 123) {
				this.method5292(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3201[var3];
				if (var6 == 16384) {
					this.field3192[var3] = (var5 << 7) + (this.field3192[var3] & (-16257));
				}
			}

			if (var4 == 38) {
				var6 = this.field3201[var3];
				if (var6 == 16384) {
					this.field3192[var3] = var5 + (this.field3192[var3] & (-128));
				}
			}

			if (var4 == 16) {
				this.field3190[var3] = (var5 << 7) + (this.field3190[var3] & (-16257));
			}

			if (var4 == 48) {
				this.field3190[var3] = var5 + (this.field3190[var3] & (-128));
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3200;
					var10000[var3] |= 4;
				} else {
					this.method5295(var3);
					var10000 = this.field3200;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method5297(var3, (var5 << 7) + (this.field3198[var3] & (-16257)));
			}

			if (var4 == 49) {
				this.method5297(var3, var5 + (this.field3198[var3] & (-128)));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			this.method5310(var3, var4 + this.field3188[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			this.method5404(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = ((var1 >> 8) & 127) + ((var1 >> 9) & 16256);
			this.method5289(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method5351();
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"-803515247")

	void method5297(int var1, int var2) {
		this.field3198[var1] = var2;
		this.field3202[var1] = ((int) ((2097152.0 * Math.pow(2.0, ((double) (var2)) * 5.4931640625E-4)) + 0.5));
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = 
	"(Lju;I)I", garbageValue = 
	"1061926046")

	int method5290(MusicPatchNode var1) {
		int var2 = ((var1.field3249 * var1.field3248) >> 12) + var1.field3247;
		var2 += ((this.field3193[var1.field3240] - 8192) * this.field3192[var1.field3240]) >> 12;
		MusicPatchNode2 var3 = var1.field3242;
		int var4;
		if ((var3.field3169 > 0) && ((var3.field3171 > 0) || (this.field3194[var1.field3240] > 0))) {
			var4 = var3.field3171 << 2;
			int var5 = var3.field3170 << 1;
			if (var1.field3258 < var5) {
				var4 = (var4 * var1.field3258) / var5;
			}

			var4 += this.field3194[var1.field3240] >> 7;
			double var6 = Math.sin(0.01227184630308513 * ((double) (var1.field3259 & 511)));
			var2 += ((int) (var6 * ((double) (var4))));
		}

		var4 = ((int) (((((double) (var1.rawSound.sampleRate * 256)) * Math.pow(2.0, 3.255208333333333E-4 * ((double) (var2)))) / ((double) (SecureRandomFuture.field949))) + 0.5));
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = 
	"(Lju;S)I", garbageValue = 
	"2208")

	int method5299(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3242;
		int var3 = ((this.field3187[var1.field3240] * this.field3189[var1.field3240]) + 4096) >> 13;
		var3 = ((var3 * var3) + 16384) >> 15;
		var3 = ((var3 * var1.field3245) + 16384) >> 15;
		var3 = ((var3 * this.field3185) + 128) >> 8;
		if (var2.field3164 > 0) {
			var3 = ((int) ((((double) (var3)) * Math.pow(0.5, (((double) (var2.field3164)) * 1.953125E-5) * ((double) (var1.field3251)))) + 0.5));
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3165 != null) {
			var4 = var1.field3255;
			var5 = var2.field3165[var1.field3252 + 1];
			if (var1.field3252 < (var2.field3165.length - 2)) {
				var6 = (var2.field3165[var1.field3252] & 255) << 8;
				var7 = (var2.field3165[var1.field3252 + 2] & 255) << 8;
				var5 += ((var2.field3165[var1.field3252 + 3] - var5) * (var4 - var6)) / (var7 - var6);
			}

			var3 = ((var3 * var5) + 32) >> 6;
		}

		if ((var1.field3253 > 0) && (var2.field3162 != null)) {
			var4 = var1.field3253;
			var5 = var2.field3162[var1.field3250 + 1];
			if (var1.field3250 < (var2.field3162.length - 2)) {
				var6 = (var2.field3162[var1.field3250] & 255) << 8;
				var7 = (var2.field3162[var1.field3250 + 2] & 255) << 8;
				var5 += ((var2.field3162[var1.field3250 + 3] - var5) * (var4 - var6)) / (var7 - var6);
			}

			var3 = ((var3 * var5) + 32) >> 6;
		}

		return var3;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = 
	"(Lju;I)I", garbageValue = 
	"-858777860")

	int method5318(MusicPatchNode var1) {
		int var2 = this.field3197[var1.field3240];
		return var2 < 8192 ? ((var2 * var1.field3254) + 32) >> 6 : 16384 - ((((128 - var1.field3254) * (16384 - var2)) + 32) >> 6);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"321540193")

	void method5364() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3210; var2 == this.trackLength; var3 = this.midiFile.method5444(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if ((!this.field3206) || (var2 == 0)) {
							this.method5351();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method5296(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			} 

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3210 = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = 
	"(Lju;I)Z", garbageValue = 
	"-1533510459")

	boolean method5307(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3253 >= 0) {
				var1.remove();
				if ((var1.field3243 > 0) && (var1 == this.field3204[var1.field3240][var1.field3243])) {
					this.field3204[var1.field3240][var1.field3243] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = 
	"(Lju;[IIIB)Z", garbageValue = 
	"-1")

	boolean method5396(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3256 = SecureRandomFuture.field949 / 100;
		if ((var1.field3253 < 0) || ((var1.stream != null) && (!var1.stream.method831()))) {
			int var5 = var1.field3249;
			if (var5 > 0) {
				var5 -= ((int) ((16.0 * Math.pow(2.0, 4.921259842519685E-4 * ((double) (this.field3195[var1.field3240])))) + 0.5));
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3249 = var5;
			}

			var1.stream.method843(this.method5290(var1));
			MusicPatchNode2 var6 = var1.field3242;
			boolean var7 = false;
			++var1.field3258;
			var1.field3259 += var6.field3169;
			double var8 = ((double) (((var1.field3244 - 60) << 8) + ((var1.field3249 * var1.field3248) >> 12))) * 5.086263020833333E-6;
			if (var6.field3164 > 0) {
				if (var6.field3173 > 0) {
					var1.field3251 += ((int) ((128.0 * Math.pow(2.0, var8 * ((double) (var6.field3173)))) + 0.5));
				} else {
					var1.field3251 += 128;
				}
			}

			if (var6.field3165 != null) {
				if (var6.field3168 > 0) {
					var1.field3255 += ((int) ((128.0 * Math.pow(2.0, ((double) (var6.field3168)) * var8)) + 0.5));
				} else {
					var1.field3255 += 128;
				}

				while ((var1.field3252 < (var6.field3165.length - 2)) && (var1.field3255 > ((var6.field3165[var1.field3252 + 2] & 255) << 8))) {
					var1.field3252 += 2;
				} 

				if (((var6.field3165.length - 2) == var1.field3252) && (var6.field3165[var1.field3252 + 1] == 0)) {
					var7 = true;
				}
			}

			if ((((var1.field3253 >= 0) && (var6.field3162 != null)) && ((this.field3200[var1.field3240] & 1) == 0)) && ((var1.field3243 < 0) || (var1 != this.field3204[var1.field3240][var1.field3243]))) {
				if (var6.field3163 > 0) {
					var1.field3253 += ((int) ((128.0 * Math.pow(2.0, var8 * ((double) (var6.field3163)))) + 0.5));
				} else {
					var1.field3253 += 128;
				}

				while ((var1.field3250 < (var6.field3162.length - 2)) && (var1.field3253 > ((var6.field3162[var1.field3250 + 2] & 255) << 8))) {
					var1.field3250 += 2;
				} 

				if ((var6.field3162.length - 2) == var1.field3250) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method828(var1.field3256);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method832()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method5501();
				if (var1.field3253 >= 0) {
					var1.remove();
					if ((var1.field3243 > 0) && (var1 == this.field3204[var1.field3240][var1.field3243])) {
						this.field3204[var1.field3240][var1.field3243] = null;
					}
				}

				return true;
			} else {
				var1.stream.method841(var1.field3256, this.method5299(var1), this.method5318(var1));
				return false;
			}
		} else {
			var1.method5501();
			var1.remove();
			if ((var1.field3243 > 0) && (var1 == this.field3204[var1.field3240][var1.field3243])) {
				this.field3204[var1.field3240][var1.field3243] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"([FIFI)F", garbageValue = 
	"-820460880")

	static float method5405(float[] var0, int var1, float var2) {
		float var3 = var0[var1];

		for (int var4 = var1 - 1; var4 >= 0; --var4) {
			var3 = (var2 * var3) + var0[var4];
		}

		return var3;
	}
}