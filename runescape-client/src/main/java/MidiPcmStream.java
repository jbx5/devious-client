import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	public static class381 field3456;
	@ObfuscatedName("bp")
	static AtomicBoolean field3453;
	@ObfuscatedName("bw")
	static ThreadPoolExecutor field3430;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1898062855
	)
	int field3437;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1645997632
	)
	int field3427;
	@ObfuscatedName("ao")
	int[] field3428;
	@ObfuscatedName("ab")
	int[] field3446;
	@ObfuscatedName("au")
	int[] field3426;
	@ObfuscatedName("aa")
	int[] field3454;
	@ObfuscatedName("ac")
	int[] field3432;
	@ObfuscatedName("al")
	int[] field3433;
	@ObfuscatedName("az")
	int[] field3448;
	@ObfuscatedName("ap")
	int[] field3435;
	@ObfuscatedName("av")
	int[] field3436;
	@ObfuscatedName("ai")
	int[] field3450;
	@ObfuscatedName("aw")
	int[] field3438;
	@ObfuscatedName("ae")
	int[] field3439;
	@ObfuscatedName("an")
	int[] field3440;
	@ObfuscatedName("ag")
	int[] field3443;
	@ObfuscatedName("ad")
	int[] field3442;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[[Lmw;"
	)
	MusicPatchNode[][] field3434;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "[[Lmw;"
	)
	MusicPatchNode[][] field3444;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bl")
	boolean field3425;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -945236811
	)
	@Export("track")
	int track;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 574733067
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		longValue = -4602302537664311021L
	)
	long field3449;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		longValue = 109747029175512933L
	)
	long field3431;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bm")
	PriorityQueue field3452;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1731385213
	)
	public int field3455;

	static {
		field3453 = null;
		field3430 = null;
	}

	public MidiPcmStream() {
		this.field3437 = 256;
		this.field3427 = -727379968;
		this.field3428 = new int[16];
		this.field3446 = new int[16];
		this.field3426 = new int[16];
		this.field3454 = new int[16];
		this.field3432 = new int[16];
		this.field3433 = new int[16];
		this.field3448 = new int[16];
		this.field3435 = new int[16];
		this.field3436 = new int[16];
		this.field3450 = new int[16];
		this.field3438 = new int[16];
		this.field3439 = new int[16];
		this.field3440 = new int[16];
		this.field3443 = new int[16];
		this.field3442 = new int[16];
		this.field3434 = new MusicPatchNode[16][128];
		this.field3444 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.field3452 = new PriorityQueue(5, new class327());
		this.field3455 = 0;
		this.musicPatches = new NodeHashTable(128);
		this.method6027();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-19"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3437 = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	public int method6007() {
		return this.field3437;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lms;Lol;Lbc;I)Z",
		garbageValue = "289790936"
	)
	public synchronized boolean method6008(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		boolean var4 = true;
		synchronized(this.field3452) {
			this.field3452.clear();
		}

		for (class329 var5 = (class329)var1.field3496.first(); var5 != null; var5 = (class329)var1.field3496.next()) {
			int var12 = (int)var5.key;
			MusicPatch var7 = (MusicPatch)this.musicPatches.get((long)var12);
			if (var7 == null) {
				var7 = LoginScreenAnimation.method2536(var2, var12);
				if (var7 == null) {
					var4 = false;
					continue;
				}

				this.musicPatches.put(var7, (long)var12);
			}

			if (!var7.method6191(var3, var5.field3540)) {
				var4 = false;
			} else if (this.field3452 != null) {
				synchronized(this.field3452) {
					Iterator var9 = var7.field3479.iterator();

					while (var9.hasNext()) {
						class53 var10 = (class53)var9.next();
						this.field3452.add(new class320(var5.field3539, var10));
					}
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "121"
	)
	public void method6009() {
		if (this.field3452 != null) {
			if (field3453 != null) {
				field3453.set(true);
			}

			field3453 = new AtomicBoolean(false);
			AtomicBoolean var1 = field3453;
			if (field3430 == null) {
				int var2 = Runtime.getRuntime().availableProcessors();
				field3430 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class319(this));
			}

			field3430.submit(new class323(this, var1));
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1842485318"
	)
	public synchronized void method6059() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.method6192();
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("ac")
	protected synchronized int vmethod6210() {
		return 0;
	}

	@ObfuscatedName("al")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3427 * 1000000 / (PcmPlayer.field275 * 1019137945);

			do {
				long var5 = (long)var3 * (long)var4 + this.field3449;
				if (this.field3431 - var5 >= 0L) {
					this.field3449 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3431 - this.field3449) - 1L) / (long)var4);
				this.field3449 += (long)var4 * (long)var7;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method6040();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-64"
	)
	public synchronized void method6011() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove();
		}

	}

	@ObfuscatedName("ap")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3427 * 1000000 / (PcmPlayer.field275 * 1019137945);

			do {
				long var3 = (long)var1 * (long)var2 + this.field3449;
				if (this.field3431 - var3 >= 0L) {
					this.field3449 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3431 - this.field3449) - 1L) / (long)var2);
				this.field3449 += (long)var2 * (long)var5;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method6040();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lms;ZI)V",
		garbageValue = "-624556623"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field3425 = var2;
		this.field3449 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field3431 = this.midiFile.method6145(this.trackLength);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "84"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method6027();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2096879002"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "26568"
	)
	public synchronized boolean method6015() {
		return this.musicPatches.method8971() > 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-438742560"
	)
	public synchronized void method6016(int var1, int var2) {
		this.method6024(var1, var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "31"
	)
	void method6024(int var1, int var2) {
		this.field3454[var1] = var2;
		this.field3433[var1] = var2 & -128;
		this.method6107(var1, var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "39"
	)
	void method6107(int var1, int var2) {
		if (var2 != this.field3432[var1]) {
			this.field3432[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3444[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "123"
	)
	void method6102(int var1, int var2, int var3) {
		this.method6019(var1, var2, 64);
		if ((this.field3450[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field3515 == var1 && var4.field3498 < 0) {
					this.field3434[var1][var4.field3517] = null;
					this.field3434[var1][var2] = var4;
					int var8 = (var4.field3507 * var4.field3508 >> 12) + var4.field3506;
					var4.field3506 += var2 - var4.field3517 << 8;
					var4.field3507 = var8 - var4.field3506;
					var4.field3508 = 4096;
					var4.field3517 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3432[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var5 = var9.rawSounds[var2].method1094();
				if (var5 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field3515 = var1;
					var6.table = var9;
					var6.rawSound = var5;
					var6.field3501 = var9.field3485[var2];
					var6.field3502 = var9.field3482[var2];
					var6.field3517 = var2;
					var6.field3504 = var3 * var3 * var9.field3483[var2] * var9.field3481 + 1024 >> 11;
					var6.field3505 = var9.field3480[var2] & 255;
					var6.field3506 = (var2 << 8) - (var9.field3478[var2] & 32767);
					var6.field3509 = 0;
					var6.field3510 = 0;
					var6.field3511 = 0;
					var6.field3498 = -1;
					var6.field3519 = 0;
					if (this.field3440[var1] == 0) {
						var6.stream = RawPcmStream.method904(var5, this.method6010(var6), this.method6021(var6), this.method6034(var6));
					} else {
						var6.stream = RawPcmStream.method904(var5, this.method6010(var6), 0, this.method6034(var6));
						this.method6020(var6, var9.field3478[var2] < 0);
					}

					if (var9.field3478[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3502 >= 0) {
						MusicPatchNode var7 = this.field3444[var1][var6.field3502];
						if (var7 != null && var7.field3498 < 0) {
							this.field3434[var1][var7.field3517] = null;
							var7.field3498 = 0;
						}

						this.field3444[var1][var6.field3502] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field3434[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lmw;ZB)V",
		garbageValue = "8"
	)
	void method6020(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field250) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)this.field3440[var1.field3515] * (long)var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method902();
			}
		} else {
			var4 = (int)((long)this.field3440[var1.field3515] * (long)var3 >> 6);
		}

		var1.stream.method912(var4);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1277420327"
	)
	void method6019(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3434[var1][var2];
		if (var4 != null) {
			this.field3434[var1][var2] = null;
			if ((this.field3450[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var5.field3515 == var4.field3515 && var5.field3498 < 0 && var5 != var4) {
						var4.field3498 = 0;
						break;
					}
				}
			} else {
				var4.field3498 = 0;
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-84"
	)
	void method6115(int var1, int var2, int var3) {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	void method6022(int var1, int var2) {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-5960"
	)
	void method6065(int var1, int var2) {
		this.field3448[var1] = var2;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2098056782"
	)
	void method6120(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field3515 == var1) {
				if (var2.stream != null) {
					var2.stream.method917(PcmPlayer.field275 * 1019137945 / 100);
					if (var2.stream.method921()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6239();
				}

				if (var2.field3498 < 0) {
					this.field3434[var2.field3515][var2.field3517] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method6025(int var1) {
		if (var1 >= 0) {
			this.field3428[var1] = 12800;
			this.field3446[var1] = 8192;
			this.field3426[var1] = 16383;
			this.field3448[var1] = 8192;
			this.field3435[var1] = 0;
			this.field3436[var1] = 8192;
			this.method6005(var1);
			this.method6029(var1);
			this.field3450[var1] = 0;
			this.field3438[var1] = 32767;
			this.field3439[var1] = 256;
			this.field3440[var1] = 0;
			this.method6050(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method6025(var1);
			}

		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2027347232"
	)
	void method6026(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field3515 == var1) && var2.field3498 < 0) {
				this.field3434[var2.field3515][var2.field3517] = null;
				var2.field3498 = 0;
			}
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "3235279"
	)
	void method6027() {
		this.method6120(-1);
		this.method6025(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3432[var1] = this.field3454[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3433[var1] = this.field3454[var1] & -128;
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "936925077"
	)
	void method6005(int var1) {
		if ((this.field3450[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3515 == var1 && this.field3434[var1][var2.field3517] == null && var2.field3498 < 0) {
					var2.field3498 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "31"
	)
	void method6029(int var1) {
		if ((this.field3450[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3515 == var1) {
					var2.field3516 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1011808650"
	)
	void method6030(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6019(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method6102(var3, var4, var5);
			} else {
				this.method6019(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6115(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3433[var3] = (var5 << 14) + (this.field3433[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3433[var3] = (var5 << 7) + (this.field3433[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3435[var3] = (var5 << 7) + (this.field3435[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3435[var3] = var5 + (this.field3435[var3] & -128);
			}

			if (var4 == 5) {
				this.field3436[var3] = (var5 << 7) + (this.field3436[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3436[var3] = var5 + (this.field3436[var3] & -128);
			}

			if (var4 == 7) {
				this.field3428[var3] = (var5 << 7) + (this.field3428[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3428[var3] = var5 + (this.field3428[var3] & -128);
			}

			if (var4 == 10) {
				this.field3446[var3] = (var5 << 7) + (this.field3446[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3446[var3] = var5 + (this.field3446[var3] & -128);
			}

			if (var4 == 11) {
				this.field3426[var3] = (var5 << 7) + (this.field3426[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3426[var3] = var5 + (this.field3426[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3450;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3450;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3450;
					var10000[var3] |= 2;
				} else {
					this.method6005(var3);
					var10000 = this.field3450;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3438[var3] = (var5 << 7) + (this.field3438[var3] & 127);
			}

			if (var4 == 98) {
				this.field3438[var3] = (this.field3438[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3438[var3] = (var5 << 7) + (this.field3438[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3438[var3] = (this.field3438[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method6120(var3);
			}

			if (var4 == 121) {
				this.method6025(var3);
			}

			if (var4 == 123) {
				this.method6026(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3438[var3];
				if (var6 == 16384) {
					this.field3439[var3] = (var5 << 7) + (this.field3439[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3438[var3];
				if (var6 == 16384) {
					this.field3439[var3] = var5 + (this.field3439[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3440[var3] = (var5 << 7) + (this.field3440[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3440[var3] = var5 + (this.field3440[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3450;
					var10000[var3] |= 4;
				} else {
					this.method6029(var3);
					var10000 = this.field3450;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method6050(var3, (var5 << 7) + (this.field3443[var3] & -16257));
			}

			if (var4 == 49) {
				this.method6050(var3, var5 + (this.field3443[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6107(var3, var4 + this.field3433[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6022(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method6065(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method6027();
			}
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "23"
	)
	void method6050(int var1, int var2) {
		this.field3443[var1] = var2;
		this.field3442[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)I",
		garbageValue = "2086193831"
	)
	int method6010(MusicPatchNode var1) {
		int var2 = (var1.field3507 * var1.field3508 >> 12) + var1.field3506;
		var2 += (this.field3448[var1.field3515] - 8192) * this.field3439[var1.field3515] >> 12;
		MusicPatchNode2 var3 = var1.field3501;
		int var4;
		if (var3.field3410 > 0 && (var3.field3409 > 0 || this.field3435[var1.field3515] > 0)) {
			var4 = var3.field3409 << 2;
			int var5 = var3.field3404 << 1;
			if (var1.field3512 < var5) {
				var4 = var4 * var1.field3512 / var5;
			}

			var4 += this.field3435[var1.field3515] >> 7;
			double var6 = Math.sin((double)(var1.field3503 & 511) * 0.01227184630308513D);
			var2 += (int)((double)var4 * var6);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)(PcmPlayer.field275 * 1019137945) + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lmw;B)I",
		garbageValue = "-88"
	)
	int method6021(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3501;
		int var3 = this.field3428[var1.field3515] * this.field3426[var1.field3515] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3504 + 16384 >> 15;
		var3 = var3 * this.field3437 + 128 >> 8;
		if (var2.field3405 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, 1.953125E-5D * (double)(var1.field3509 * 128) * (double)var2.field3405) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3406 != null) {
			var4 = var1.field3510;
			var5 = var2.field3406[var1.field3511 * 4 + 1];
			if (var1.field3511 * 4 < var2.field3406.length - 2) {
				var6 = (var2.field3406[var1.field3511 * 4] & 255) << 8;
				var7 = (var2.field3406[var1.field3511 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3406[var1.field3511 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		if (var1.field3498 > 0 && var2.field3411 != null) {
			var4 = var1.field3498;
			var5 = var2.field3411[var1.field3519 * 4 + 1];
			if (var1.field3519 * 4 < var2.field3411.length - 2) {
				var6 = (var2.field3411[var1.field3519 * 4] & 255) << 8;
				var7 = (var2.field3411[var1.field3519 * 4 + 2] & 255) << 8;
				var5 += (var2.field3411[var1.field3519 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lmw;B)I",
		garbageValue = "-7"
	)
	int method6034(MusicPatchNode var1) {
		int var2 = this.field3446[var1.field3515];
		return var2 < 8192 ? var2 * var1.field3505 + 32 >> 6 : 16384 - ((128 - var1.field3505) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1708238703"
	)
	void method6040() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3431; var2 == this.trackLength; var3 = this.midiFile.method6145(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3425 || var2 == 0) {
							this.method6027();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method6030(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3431 = var3;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)Z",
		garbageValue = "1582725415"
	)
	boolean method6041(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3498 >= 0) {
				var1.remove();
				if (var1.field3502 > 0 && var1 == this.field3444[var1.field3515][var1.field3502]) {
					this.field3444[var1.field3515][var1.field3502] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lmw;[IIII)Z",
		garbageValue = "1206952354"
	)
	boolean method6042(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3513 = PcmPlayer.field275 * 1019137945 / 100;
		if (var1.field3498 < 0 || var1.stream != null && !var1.stream.method1008()) {
			int var5 = var1.field3508;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3436[var1.field3515] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3508 = var5;
			}

			var1.stream.method913(this.method6010(var1));
			MusicPatchNode2 var6 = var1.field3501;
			boolean var7 = false;
			++var1.field3512;
			var1.field3503 += var6.field3410;
			double var8 = (double)((var1.field3517 - 60 << 8) + (var1.field3507 * var1.field3508 >> 12)) * 5.086263020833333E-6D;
			if (var6.field3405 > 0) {
				if (var6.field3408 > 0) {
					var1.field3509 = var1.field3509 * -1887682560 + (int)(128.0D * Math.pow(2.0D, (double)var6.field3408 * var8) + 0.5D) * 589232256;
				} else {
					var1.field3509 = var1.field3509 * -1887682560 + -1887682560;
				}
			}

			if (var6.field3406 != null) {
				if (var6.field3412 > 0) {
					var1.field3510 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3412 * var8) + 0.5D);
				} else {
					var1.field3510 += 128;
				}

				while (var1.field3511 * 4 < var6.field3406.length - 2 && var1.field3510 > (var6.field3406[var1.field3511 * 4 + 2] & 255) << 8) {
					var1.field3511 = var1.field3511 * 4 + 2;
				}

				if (var1.field3511 * 4 == var6.field3406.length - 2 && var6.field3406[var1.field3511 * 4 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field3498 >= 0 && var6.field3411 != null && (this.field3450[var1.field3515] & 1) == 0 && (var1.field3502 < 0 || var1 != this.field3444[var1.field3515][var1.field3502])) {
				if (var6.field3407 > 0) {
					var1.field3498 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3407 * var8) + 0.5D);
				} else {
					var1.field3498 += 128;
				}

				while (var1.field3519 * 4 < var6.field3411.length - 2 && var1.field3498 > (var6.field3411[var1.field3519 * 4 + 2] & 255) << 8) {
					var1.field3519 = var1.field3519 * 4 + 2;
				}

				if (var1.field3519 * 4 == var6.field3411.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method917(var1.field3513);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method921()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6239();
				if (var1.field3498 >= 0) {
					var1.remove();
					if (var1.field3502 > 0 && var1 == this.field3444[var1.field3515][var1.field3502]) {
						this.field3444[var1.field3515][var1.field3502] = null;
					}
				}

				return true;
			} else {
				var1.stream.method916(var1.field3513, this.method6021(var1), this.method6034(var1));
				return false;
			}
		} else {
			var1.method6239();
			var1.remove();
			if (var1.field3502 > 0 && var1 == this.field3444[var1.field3515][var1.field3502]) {
				this.field3444[var1.field3515][var1.field3502] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1188911227"
	)
	static void method6133() {
		Tiles.Tiles_minPlane = 99;
		class74.Tiles_underlays = new short[4][104][104];
		Interpreter.Tiles_overlays = new short[4][104][104];
		ViewportMouse.Tiles_shapes = new byte[4][104][104];
		class369.field4297 = new byte[4][104][104];
		class344.field3814 = new int[4][105][105];
		class93.Tiles_underlays2 = new byte[4][105][105];
		Tiles.field999 = new int[105][105];
		class337.Tiles_hue = new int[104];
		Tiles.Tiles_saturation = new int[104];
		class185.Tiles_lightness = new int[104];
		MenuAction.Tiles_hueMultiplier = new int[104];
		WorldMapLabelSize.field2441 = new int[104];
	}
}
