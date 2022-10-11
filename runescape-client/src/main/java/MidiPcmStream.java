import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2001840079
	)
	int field3234;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2000403541
	)
	int field3235;
	@ObfuscatedName("n")
	int[] field3236;
	@ObfuscatedName("k")
	int[] field3237;
	@ObfuscatedName("s")
	int[] field3259;
	@ObfuscatedName("q")
	int[] field3239;
	@ObfuscatedName("m")
	int[] field3252;
	@ObfuscatedName("x")
	int[] field3241;
	@ObfuscatedName("j")
	int[] field3240;
	@ObfuscatedName("v")
	int[] field3238;
	@ObfuscatedName("h")
	int[] field3250;
	@ObfuscatedName("e")
	int[] field3246;
	@ObfuscatedName("g")
	int[] field3247;
	@ObfuscatedName("y")
	int[] field3244;
	@ObfuscatedName("i")
	int[] field3249;
	@ObfuscatedName("r")
	int[] field3233;
	@ObfuscatedName("z")
	int[] field3255;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[[Ljb;"
	)
	MusicPatchNode[][] field3251;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[[Ljb;"
	)
	MusicPatchNode[][] field3253;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ljo;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("ao")
	boolean field3242;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -440104839
	)
	@Export("track")
	int track;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 878500507
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 6339965167519115271L
	)
	long field3258;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -9196756782097180817L
	)
	long field3257;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field3234 = 256; // L: 14
		this.field3235 = -727379968; // L: 15
		this.field3236 = new int[16]; // L: 16
		this.field3237 = new int[16]; // L: 17
		this.field3259 = new int[16]; // L: 18
		this.field3239 = new int[16]; // L: 19
		this.field3252 = new int[16]; // L: 20
		this.field3241 = new int[16]; // L: 21
		this.field3240 = new int[16]; // L: 22
		this.field3238 = new int[16]; // L: 23
		this.field3250 = new int[16]; // L: 24
		this.field3246 = new int[16]; // L: 28
		this.field3247 = new int[16]; // L: 29
		this.field3244 = new int[16]; // L: 30
		this.field3249 = new int[16]; // L: 31
		this.field3233 = new int[16]; // L: 32
		this.field3255 = new int[16]; // L: 33
		this.field3251 = new MusicPatchNode[16][128]; // L: 34
		this.field3253 = new MusicPatchNode[16][128]; // L: 35
		this.midiFile = new MidiFileReader(); // L: 36
		this.patchStream = new MusicPatchPcmStream(this); // L: 42
		this.musicPatches = new NodeHashTable(128); // L: 45
		this.method5471(); // L: 46
	} // L: 47

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-12"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3234 = var1; // L: 50
	} // L: 51

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-7"
	)
	public int method5466() {
		return this.field3234; // L: 54
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljd;Llv;Lax;IS)Z",
		garbageValue = "-1601"
	)
	@Export("loadMusicTrack")
	synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method5628(); // L: 58
		boolean var5 = true; // L: 59
		int[] var6 = null; // L: 60
		if (var4 > 0) { // L: 61
			var6 = new int[]{var4};
		}

		for (ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) { // L: 62
			int var8 = (int)var7.key; // L: 63
			MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8); // L: 64
			if (var9 == null) { // L: 65
				var9 = class153.method3312(var2, var8); // L: 66
				if (var9 == null) { // L: 67
					var5 = false;
					continue;
				}

				this.musicPatches.put(var9, (long)var8); // L: 71
			}

			if (!var9.method5594(var3, var7.byteArray, var6)) { // L: 73
				var5 = false;
			}
		}

		if (var5) { // L: 75
			var1.clear();
		}

		return var5; // L: 76
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1295892604"
	)
	@Export("clearAll")
	synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.clear(); // L: 80
		}

	} // L: 81

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1523729927"
	)
	@Export("removeAll")
	public synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 84
			var1.remove();
		}

	} // L: 85

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "()Lay;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 460
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "()Lay;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 464
	}

	@ObfuscatedName("q")
	protected synchronized int vmethod5612() {
		return 0; // L: 468
	}

	@ObfuscatedName("m")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 472
			int var4 = this.midiFile.division * this.field3235 * 1000000 / PcmPlayer.field307; // L: 473

			do {
				long var5 = (long)var3 * (long)var4 + this.field3258; // L: 475
				if (this.field3257 - var5 >= 0L) { // L: 476
					this.field3258 = var5; // L: 477
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3257 - this.field3258) - 1L) / (long)var4); // L: 480
				this.field3258 += (long)var4 * (long)var7; // L: 481
				this.patchStream.fill(var1, var2, var7); // L: 482
				var2 += var7; // L: 483
				var3 -= var7; // L: 484
				this.method5443(); // L: 485
			} while(this.midiFile.isReady()); // L: 486
		}

		this.patchStream.fill(var1, var2, var3); // L: 489
	} // L: 490

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljd;ZI)V",
		garbageValue = "-436682604"
	)
	@Export("setMusicTrack")
	synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 88
		this.midiFile.parse(var1.midi); // L: 89
		this.field3242 = var2; // L: 90
		this.field3258 = 0L; // L: 91
		int var3 = this.midiFile.trackCount(); // L: 92

		for (int var4 = 0; var4 < var3; ++var4) { // L: 93
			this.midiFile.gotoTrack(var4); // L: 94
			this.midiFile.readTrackLength(var4); // L: 95
			this.midiFile.markTrackPosition(var4); // L: 96
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 98
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 99
		this.field3257 = this.midiFile.method5534(this.trackLength); // L: 100
	} // L: 101

	@ObfuscatedName("j")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 493
			int var2 = this.midiFile.division * this.field3235 * 1000000 / PcmPlayer.field307; // L: 494

			do {
				long var3 = this.field3258 + (long)var2 * (long)var1; // L: 496
				if (this.field3257 - var3 >= 0L) { // L: 497
					this.field3258 = var3; // L: 498
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3257 - this.field3258) - 1L) / (long)var2); // L: 501
				this.field3258 += (long)var2 * (long)var5; // L: 502
				this.patchStream.skip(var5); // L: 503
				var1 -= var5; // L: 504
				this.method5443(); // L: 505
			} while(this.midiFile.isReady()); // L: 506
		}

		this.patchStream.skip(var1); // L: 509
	} // L: 510

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1036713647"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear(); // L: 104
		this.method5471(); // L: 105
	} // L: 106

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "347558801"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 109
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1578445253"
	)
	public synchronized void method5495(int var1, int var2) {
		this.method5419(var1, var2); // L: 113
	} // L: 114

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-816736310"
	)
	void method5419(int var1, int var2) {
		this.field3239[var1] = var2; // L: 117
		this.field3241[var1] = var2 & -128; // L: 118
		this.method5420(var1, var2); // L: 119
	} // L: 120

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "796300136"
	)
	void method5420(int var1, int var2) {
		if (var2 != this.field3252[var1]) { // L: 123
			this.field3252[var1] = var2; // L: 124

			for (int var3 = 0; var3 < 128; ++var3) { // L: 125
				this.field3253[var1][var3] = null;
			}
		}

	} // L: 127

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "1"
	)
	void method5421(int var1, int var2, int var3) {
		this.method5423(var1, var2, 64); // L: 130
		if ((this.field3246[var1] & 2) != 0) { // L: 131
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 132
				if (var4.field3303 == var1 && var4.field3300 < 0) { // L: 133
					this.field3251[var1][var4.field3311] = null; // L: 134
					this.field3251[var1][var2] = var4; // L: 135
					int var8 = (var4.field3302 * var4.field3296 >> 12) + var4.field3293; // L: 136
					var4.field3293 += var2 - var4.field3311 << 8; // L: 137
					var4.field3302 = var8 - var4.field3293; // L: 138
					var4.field3296 = 4096; // L: 139
					var4.field3311 = var2; // L: 140
					return; // L: 141
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3252[var1]); // L: 145
		if (var9 != null) { // L: 146
			RawSound var5 = var9.rawSounds[var2]; // L: 147
			if (var5 != null) { // L: 148
				MusicPatchNode var6 = new MusicPatchNode(); // L: 149
				var6.field3303 = var1; // L: 150
				var6.patch = var9; // L: 151
				var6.rawSound = var5; // L: 152
				var6.field3307 = var9.field3282[var2]; // L: 153
				var6.field3314 = var9.field3281[var2]; // L: 154
				var6.field3311 = var2; // L: 155
				var6.field3299 = var3 * var3 * var9.field3278[var2] * var9.field3280 + 1024 >> 11; // L: 156
				var6.field3297 = var9.field3279[var2] & 255; // L: 157
				var6.field3293 = (var2 << 8) - (var9.field3277[var2] & 32767); // L: 158
				var6.field3304 = 0; // L: 159
				var6.field3305 = 0; // L: 160
				var6.field3306 = 0; // L: 161
				var6.field3300 = -1; // L: 162
				var6.field3308 = 0; // L: 163
				if (this.field3249[var1] == 0) { // L: 164
					var6.stream = RawPcmStream.method851(var5, this.method5435(var6), this.method5485(var6), this.method5437(var6)); // L: 165
				} else {
					var6.stream = RawPcmStream.method851(var5, this.method5435(var6), 0, this.method5437(var6)); // L: 168
					this.method5422(var6, var9.field3277[var2] < 0); // L: 169
				}

				if (var9.field3277[var2] < 0) { // L: 171
					var6.stream.setNumLoops(-1);
				}

				if (var6.field3314 >= 0) { // L: 172
					MusicPatchNode var7 = this.field3253[var1][var6.field3314]; // L: 173
					if (var7 != null && var7.field3300 < 0) { // L: 174
						this.field3251[var1][var7.field3311] = null; // L: 175
						var7.field3300 = 0; // L: 176
					}

					this.field3253[var1][var6.field3314] = var6; // L: 178
				}

				this.patchStream.queue.addFirst(var6); // L: 180
				this.field3251[var1][var2] = var6; // L: 181
			}
		}
	} // L: 182

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljb;ZI)V",
		garbageValue = "-208296340"
	)
	void method5422(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 185
		int var4;
		if (var2 && var1.rawSound.field273) { // L: 187
			int var5 = var3 + var3 - var1.rawSound.start; // L: 188
			var4 = (int)((long)var5 * (long)this.field3249[var1.field3303] >> 6); // L: 189
			var3 <<= 8; // L: 190
			if (var4 >= var3) { // L: 191
				var4 = var3 + var3 - 1 - var4; // L: 192
				var1.stream.method857(); // L: 193
			}
		} else {
			var4 = (int)((long)this.field3249[var1.field3303] * (long)var3 >> 6); // L: 197
		}

		var1.stream.method859(var4); // L: 199
	} // L: 200

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "180177235"
	)
	void method5423(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3251[var1][var2]; // L: 203
		if (var4 != null) { // L: 204
			this.field3251[var1][var2] = null; // L: 205
			if ((this.field3246[var1] & 2) != 0) { // L: 206
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 207
					if (var5.field3303 == var4.field3303 && var5.field3300 < 0 && var4 != var5) { // L: 208
						var4.field3300 = 0; // L: 209
						break; // L: 210
					}
				}
			} else {
				var4.field3300 = 0; // L: 215
			}

		}
	} // L: 217

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-12"
	)
	void method5418(int var1, int var2, int var3) {
	} // L: 219

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-417707249"
	)
	void method5425(int var1, int var2) {
	} // L: 220

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-7325"
	)
	void method5426(int var1, int var2) {
		this.field3240[var1] = var2; // L: 223
	} // L: 224

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "5"
	)
	void method5427(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 227
			if (var1 < 0 || var2.field3303 == var1) { // L: 228
				if (var2.stream != null) { // L: 229
					var2.stream.method864(PcmPlayer.field307 / 100); // L: 230
					if (var2.stream.method892()) { // L: 231
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method5640(); // L: 232
				}

				if (var2.field3300 < 0) { // L: 234
					this.field3251[var2.field3303][var2.field3311] = null;
				}

				var2.remove(); // L: 235
			}
		}

	} // L: 238

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-10"
	)
	void method5441(int var1) {
		if (var1 >= 0) { // L: 241
			this.field3236[var1] = 12800; // L: 245
			this.field3237[var1] = 8192; // L: 246
			this.field3259[var1] = 16383; // L: 247
			this.field3240[var1] = 8192; // L: 248
			this.field3238[var1] = 0; // L: 249
			this.field3250[var1] = 8192; // L: 250
			this.method5431(var1); // L: 251
			this.method5510(var1); // L: 252
			this.field3246[var1] = 0; // L: 253
			this.field3247[var1] = 32767; // L: 254
			this.field3244[var1] = 256; // L: 255
			this.field3249[var1] = 0; // L: 256
			this.method5434(var1, 8192); // L: 257
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 242
				this.method5441(var1);
			}

		}
	} // L: 243 258

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "43"
	)
	void method5450(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 261
			if ((var1 < 0 || var2.field3303 == var1) && var2.field3300 < 0) { // L: 262 263
				this.field3251[var2.field3303][var2.field3311] = null; // L: 264
				var2.field3300 = 0; // L: 265
			}
		}

	} // L: 269

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "949461344"
	)
	void method5471() {
		this.method5427(-1); // L: 272
		this.method5441(-1); // L: 273

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 274
			this.field3252[var1] = this.field3239[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 275
			this.field3241[var1] = this.field3239[var1] & -128;
		}

	} // L: 276

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "557355510"
	)
	void method5431(int var1) {
		if ((this.field3246[var1] & 2) != 0) { // L: 279
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 280
				if (var2.field3303 == var1 && this.field3251[var1][var2.field3311] == null && var2.field3300 < 0) { // L: 281 282
					var2.field3300 = 0;
				}
			}
		}

	} // L: 286

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1460947216"
	)
	void method5510(int var1) {
		if ((this.field3246[var1] & 4) != 0) { // L: 289
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 290
				if (var2.field3303 == var1) { // L: 291
					var2.field3313 = 0;
				}
			}
		}

	} // L: 294

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "19292"
	)
	void method5433(int var1) {
		int var2 = var1 & 240; // L: 297
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 298
			var3 = var1 & 15; // L: 299
			var4 = var1 >> 8 & 127; // L: 300
			var5 = var1 >> 16 & 127; // L: 301
			this.method5423(var3, var4, var5); // L: 302
		} else if (var2 == 144) { // L: 305
			var3 = var1 & 15; // L: 306
			var4 = var1 >> 8 & 127; // L: 307
			var5 = var1 >> 16 & 127; // L: 308
			if (var5 > 0) { // L: 309
				this.method5421(var3, var4, var5);
			} else {
				this.method5423(var3, var4, 64); // L: 310
			}

		} else if (var2 == 160) { // L: 313
			var3 = var1 & 15; // L: 314
			var4 = var1 >> 8 & 127; // L: 315
			var5 = var1 >> 16 & 127; // L: 316
			this.method5418(var3, var4, var5); // L: 317
		} else if (var2 == 176) { // L: 320
			var3 = var1 & 15; // L: 321
			var4 = var1 >> 8 & 127; // L: 322
			var5 = var1 >> 16 & 127; // L: 323
			if (var4 == 0) { // L: 324
				this.field3241[var3] = (var5 << 14) + (this.field3241[var3] & -2080769);
			}

			if (var4 == 32) { // L: 325
				this.field3241[var3] = (var5 << 7) + (this.field3241[var3] & -16257);
			}

			if (var4 == 1) { // L: 326
				this.field3238[var3] = (var5 << 7) + (this.field3238[var3] & -16257);
			}

			if (var4 == 33) { // L: 327
				this.field3238[var3] = var5 + (this.field3238[var3] & -128);
			}

			if (var4 == 5) { // L: 328
				this.field3250[var3] = (var5 << 7) + (this.field3250[var3] & -16257);
			}

			if (var4 == 37) { // L: 329
				this.field3250[var3] = var5 + (this.field3250[var3] & -128);
			}

			if (var4 == 7) { // L: 330
				this.field3236[var3] = (var5 << 7) + (this.field3236[var3] & -16257);
			}

			if (var4 == 39) { // L: 331
				this.field3236[var3] = var5 + (this.field3236[var3] & -128);
			}

			if (var4 == 10) { // L: 332
				this.field3237[var3] = (var5 << 7) + (this.field3237[var3] & -16257);
			}

			if (var4 == 42) { // L: 333
				this.field3237[var3] = var5 + (this.field3237[var3] & -128);
			}

			if (var4 == 11) { // L: 334
				this.field3259[var3] = (var5 << 7) + (this.field3259[var3] & -16257);
			}

			if (var4 == 43) { // L: 335
				this.field3259[var3] = var5 + (this.field3259[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 336
				if (var5 >= 64) { // L: 337
					var10000 = this.field3246;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3246; // L: 338
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 340
				if (var5 >= 64) { // L: 341
					var10000 = this.field3246;
					var10000[var3] |= 2;
				} else {
					this.method5431(var3); // L: 343
					var10000 = this.field3246; // L: 344
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 347
				this.field3247[var3] = (var5 << 7) + (this.field3247[var3] & 127);
			}

			if (var4 == 98) { // L: 348
				this.field3247[var3] = (this.field3247[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 349
				this.field3247[var3] = (var5 << 7) + (this.field3247[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 350
				this.field3247[var3] = (this.field3247[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 351
				this.method5427(var3);
			}

			if (var4 == 121) { // L: 352
				this.method5441(var3);
			}

			if (var4 == 123) { // L: 353
				this.method5450(var3);
			}

			int var6;
			if (var4 == 6) { // L: 354
				var6 = this.field3247[var3]; // L: 355
				if (var6 == 16384) { // L: 356
					this.field3244[var3] = (var5 << 7) + (this.field3244[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 358
				var6 = this.field3247[var3]; // L: 359
				if (var6 == 16384) { // L: 360
					this.field3244[var3] = var5 + (this.field3244[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 362
				this.field3249[var3] = (var5 << 7) + (this.field3249[var3] & -16257);
			}

			if (var4 == 48) { // L: 363
				this.field3249[var3] = var5 + (this.field3249[var3] & -128);
			}

			if (var4 == 81) { // L: 364
				if (var5 >= 64) { // L: 365
					var10000 = this.field3246;
					var10000[var3] |= 4;
				} else {
					this.method5510(var3); // L: 367
					var10000 = this.field3246;
					var10000[var3] &= -5; // L: 368
				}
			}

			if (var4 == 17) { // L: 371
				this.method5434(var3, (var5 << 7) + (this.field3233[var3] & -16257));
			}

			if (var4 == 49) { // L: 372
				this.method5434(var3, var5 + (this.field3233[var3] & -128));
			}

		} else if (var2 == 192) { // L: 375
			var3 = var1 & 15; // L: 376
			var4 = var1 >> 8 & 127; // L: 377
			this.method5420(var3, var4 + this.field3241[var3]); // L: 378
		} else if (var2 == 208) { // L: 381
			var3 = var1 & 15; // L: 382
			var4 = var1 >> 8 & 127; // L: 383
			this.method5425(var3, var4); // L: 384
		} else if (var2 == 224) { // L: 387
			var3 = var1 & 15; // L: 388
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 389
			this.method5426(var3, var4); // L: 390
		} else {
			var2 = var1 & 255; // L: 393
			if (var2 == 255) { // L: 394
				this.method5471(); // L: 395
			}
		}
	} // L: 303 311 318 373 379 385 391 396 398

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "23"
	)
	void method5434(int var1, int var2) {
		this.field3233[var1] = var2; // L: 401
		this.field3255[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D); // L: 402
	} // L: 403

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljb;I)I",
		garbageValue = "-663837148"
	)
	int method5435(MusicPatchNode var1) {
		int var2 = (var1.field3296 * var1.field3302 >> 12) + var1.field3293; // L: 406
		var2 += (this.field3240[var1.field3303] - 8192) * this.field3244[var1.field3303] >> 12; // L: 407
		MusicPatchNode2 var3 = var1.field3307; // L: 408
		int var4;
		if (var3.field3218 > 0 && (var3.field3214 > 0 || this.field3238[var1.field3303] > 0)) { // L: 409
			var4 = var3.field3214 << 2; // L: 410
			int var5 = var3.field3222 << 1; // L: 411
			if (var1.field3309 < var5) { // L: 412
				var4 = var4 * var1.field3309 / var5;
			}

			var4 += this.field3238[var1.field3303] >> 7; // L: 413
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field3295 & 511)); // L: 414
			var2 += (int)(var6 * (double)var4); // L: 415
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)PcmPlayer.field307 + 0.5D); // L: 417
		return var4 < 1 ? 1 : var4; // L: 418
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljb;B)I",
		garbageValue = "-35"
	)
	int method5485(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3307; // L: 422
		int var3 = this.field3236[var1.field3303] * this.field3259[var1.field3303] + 4096 >> 13; // L: 423
		var3 = var3 * var3 + 16384 >> 15; // L: 424
		var3 = var3 * var1.field3299 + 16384 >> 15; // L: 425
		var3 = var3 * this.field3234 + 128 >> 8; // L: 426
		if (var2.field3213 > 0) { // L: 427
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var1.field3304 * 1.953125E-5D * (double)var2.field3213) + 0.5D); // L: 428
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3219 != null) { // L: 430
			var4 = var1.field3305; // L: 431
			var5 = var2.field3219[var1.field3306 * 4 + 1]; // L: 432
			if (var1.field3306 * 4 < var2.field3219.length - 2) { // L: 433
				var6 = (var2.field3219[var1.field3306 * 4] & 255) << 8; // L: 434
				var7 = (var2.field3219[var1.field3306 * 4 + 2] & 255) << 8; // L: 435
				var5 += (var2.field3219[var1.field3306 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 436
			}

			var3 = var5 * var3 + 32 >> 6; // L: 438
		}

		if (var1.field3300 > 0 && var2.field3212 != null) { // L: 440
			var4 = var1.field3300; // L: 441
			var5 = var2.field3212[var1.field3308 * 4 + 1]; // L: 442
			if (var1.field3308 * 4 < var2.field3212.length - 2) { // L: 443
				var6 = (var2.field3212[var1.field3308 * 4] & 255) << 8; // L: 444
				var7 = (var2.field3212[var1.field3308 * 4 + 2] & 255) << 8; // L: 445
				var5 += (var2.field3212[var1.field3308 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 446
			}

			var3 = var3 * var5 + 32 >> 6; // L: 448
		}

		return var3; // L: 450
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljb;I)I",
		garbageValue = "1147471590"
	)
	int method5437(MusicPatchNode var1) {
		int var2 = this.field3237[var1.field3303]; // L: 454
		return var2 < 8192 ? var2 * var1.field3297 + 32 >> 6 : 16384 - ((128 - var1.field3297) * (16384 - var2) + 32 >> 6); // L: 455 456
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2061183473"
	)
	void method5443() {
		int var1 = this.track; // L: 513
		int var2 = this.trackLength; // L: 514

		long var3;
		for (var3 = this.field3257; var2 == this.trackLength; var3 = this.midiFile.method5534(var2)) { // L: 515 516 538
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 517
				this.midiFile.gotoTrack(var1); // L: 518
				int var5 = this.midiFile.readMessage(var1); // L: 519
				if (var5 == 1) { // L: 520
					this.midiFile.setTrackDone(); // L: 521
					this.midiFile.markTrackPosition(var1); // L: 522
					if (this.midiFile.isDone()) { // L: 523
						if (!this.field3242 || var2 == 0) { // L: 524
							this.method5471(); // L: 528
							this.midiFile.clear(); // L: 529
							return; // L: 530
						}

						this.midiFile.reset(var3); // L: 525
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 532
					this.method5433(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 533
				this.midiFile.markTrackPosition(var1); // L: 534
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 536
			var2 = this.midiFile.trackLengths[var1]; // L: 537
		}

		this.track = var1; // L: 540
		this.trackLength = var2; // L: 541
		this.field3257 = var3; // L: 542
	} // L: 543

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljb;B)Z",
		garbageValue = "91"
	)
	boolean method5448(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 546
			if (var1.field3300 >= 0) { // L: 547
				var1.remove(); // L: 548
				if (var1.field3314 > 0 && var1 == this.field3253[var1.field3303][var1.field3314]) { // L: 549
					this.field3253[var1.field3303][var1.field3314] = null; // L: 550
				}
			}

			return true; // L: 553
		} else {
			return false; // L: 555
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljb;[IIII)Z",
		garbageValue = "1090173342"
	)
	boolean method5445(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3312 = PcmPlayer.field307 / 100; // L: 559
		if (var1.field3300 < 0 || var1.stream != null && !var1.stream.method867()) { // L: 560
			int var5 = var1.field3296; // L: 568
			if (var5 > 0) { // L: 569
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field3250[var1.field3303]) + 0.5D); // L: 570
				if (var5 < 0) { // L: 571
					var5 = 0;
				}

				var1.field3296 = var5; // L: 572
			}

			var1.stream.method903(this.method5435(var1)); // L: 574
			MusicPatchNode2 var6 = var1.field3307; // L: 575
			boolean var7 = false; // L: 576
			++var1.field3309; // L: 577
			var1.field3295 += var6.field3218; // L: 578
			double var8 = 5.086263020833333E-6D * (double)((var1.field3311 - 60 << 8) + (var1.field3302 * var1.field3296 >> 12)); // L: 579
			if (var6.field3213 > 0) { // L: 580
				if (var6.field3216 > 0) { // L: 581
					var1.field3304 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3216) + 0.5D);
				} else {
					var1.field3304 += 128; // L: 582
				}
			}

			if (var6.field3219 != null) { // L: 584
				if (var6.field3217 > 0) { // L: 585
					var1.field3305 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3217) + 0.5D);
				} else {
					var1.field3305 += 128; // L: 586
				}

				while (var1.field3306 * 4 < var6.field3219.length - 2 && var1.field3305 > (var6.field3219[var1.field3306 * 4 + 2] & 255) << 8) { // L: 587
					var1.field3306 = var1.field3306 * 4 + 2;
				}

				if (var1.field3306 * 4 == var6.field3219.length - 2 && var6.field3219[var1.field3306 * 4 + 1] == 0) { // L: 588
					var7 = true;
				}
			}

			if (var1.field3300 >= 0 && var6.field3212 != null && (this.field3246[var1.field3303] & 1) == 0 && (var1.field3314 < 0 || var1 != this.field3253[var1.field3303][var1.field3314])) { // L: 590 591
				if (var6.field3211 > 0) { // L: 592
					var1.field3300 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3211 * var8) + 0.5D);
				} else {
					var1.field3300 += 128; // L: 593
				}

				while (var1.field3308 * 4 < var6.field3212.length - 2 && var1.field3300 > (var6.field3212[var1.field3308 * 4 + 2] & 255) << 8) { // L: 594
					var1.field3308 = var1.field3308 * 4 + 2;
				}

				if (var1.field3308 * 4 == var6.field3212.length - 2) { // L: 595
					var7 = true;
				}
			}

			if (var7) { // L: 598
				var1.stream.method864(var1.field3312); // L: 599
				if (var2 != null) { // L: 600
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 601
				}

				if (var1.stream.method892()) { // L: 602
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method5640(); // L: 603
				if (var1.field3300 >= 0) { // L: 604
					var1.remove(); // L: 605
					if (var1.field3314 > 0 && var1 == this.field3253[var1.field3303][var1.field3314]) { // L: 606
						this.field3253[var1.field3303][var1.field3314] = null; // L: 607
					}
				}

				return true; // L: 610
			} else {
				var1.stream.method863(var1.field3312, this.method5485(var1), this.method5437(var1)); // L: 612
				return false; // L: 613
			}
		} else {
			var1.method5640(); // L: 561
			var1.remove(); // L: 562
			if (var1.field3314 > 0 && var1 == this.field3253[var1.field3303][var1.field3314]) { // L: 563
				this.field3253[var1.field3303][var1.field3314] = null; // L: 564
			}

			return true; // L: 566
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "121575723"
	)
	public static int method5532(CharSequence var0) {
		return Calendar.method5674(var0, 10, true); // L: 68
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1091184200"
	)
	static boolean method5533() {
		return Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81]; // L: 10781
	}
}
