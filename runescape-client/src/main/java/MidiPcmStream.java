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

@ObfuscatedName("lc")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("bo")
	static AtomicBoolean field3437;
	@ObfuscatedName("br")
	static ThreadPoolExecutor field3438;
	@ObfuscatedName("rb")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("mouseWheel")
	static class174 mouseWheel;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1773416571
	)
	int field3420;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1978733760
	)
	int field3410;
	@ObfuscatedName("am")
	int[] field3412;
	@ObfuscatedName("as")
	int[] field3413;
	@ObfuscatedName("aj")
	int[] field3425;
	@ObfuscatedName("ag")
	int[] field3415;
	@ObfuscatedName("az")
	int[] field3414;
	@ObfuscatedName("av")
	int[] field3421;
	@ObfuscatedName("ap")
	int[] field3409;
	@ObfuscatedName("aq")
	int[] field3419;
	@ObfuscatedName("at")
	int[] field3432;
	@ObfuscatedName("ao")
	int[] field3433;
	@ObfuscatedName("ac")
	int[] field3422;
	@ObfuscatedName("ak")
	int[] field3423;
	@ObfuscatedName("an")
	int[] field3424;
	@ObfuscatedName("af")
	int[] field3417;
	@ObfuscatedName("ai")
	int[] field3440;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[[Lmw;"
	)
	MusicPatchNode[][] field3427;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "[[Lmw;"
	)
	MusicPatchNode[][] field3428;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bn")
	boolean field3430;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1759403075
	)
	@Export("track")
	int track;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1224296529
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		longValue = 7703786557427217681L
	)
	long field3416;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		longValue = -8249805723708220471L
	)
	long field3434;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bq")
	PriorityQueue field3436;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -662818405
	)
	public int field3439;

	static {
		field3437 = null;
		field3438 = null;
	}

	public MidiPcmStream() {
		this.field3420 = 256;
		this.field3410 = -727379968;
		this.field3412 = new int[16];
		this.field3413 = new int[16];
		this.field3425 = new int[16];
		this.field3415 = new int[16];
		this.field3414 = new int[16];
		this.field3421 = new int[16];
		this.field3409 = new int[16];
		this.field3419 = new int[16];
		this.field3432 = new int[16];
		this.field3433 = new int[16];
		this.field3422 = new int[16];
		this.field3423 = new int[16];
		this.field3424 = new int[16];
		this.field3417 = new int[16];
		this.field3440 = new int[16];
		this.field3427 = new MusicPatchNode[16][128];
		this.field3428 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.field3436 = new PriorityQueue(5, new class317());
		this.field3439 = 0;
		this.musicPatches = new NodeHashTable(128);
		this.method5878();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "3"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3420 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1139038647"
	)
	public int method5816() {
		return this.field3420;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lmp;Lnd;Lbh;S)Z",
		garbageValue = "195"
	)
	public synchronized boolean method5817(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		boolean var4 = true;
		synchronized(this.field3436) {
			this.field3436.clear();
		}

		for (class319 var5 = (class319)var1.field3483.first(); var5 != null; var5 = (class319)var1.field3483.next()) {
			int var12 = (int)var5.key;
			MusicPatch var7 = (MusicPatch)this.musicPatches.get((long)var12);
			if (var7 == null) {
				byte[] var9 = var2.takeFileFlat(var12);
				MusicPatch var8;
				if (var9 == null) {
					var8 = null;
				} else {
					var8 = new MusicPatch(var9);
				}

				var7 = var8;
				if (var8 == null) {
					var4 = false;
					continue;
				}

				this.musicPatches.put(var8, (long)var12);
			}

			if (!var7.method6010(var3, var5.field3520)) {
				var4 = false;
			} else if (this.field3436 != null) {
				synchronized(this.field3436) {
					Iterator var15 = var7.field3471.iterator();

					while (var15.hasNext()) {
						class53 var10 = (class53)var15.next();
						this.field3436.add(new class310(var5.field3519, var10));
					}
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1319222681"
	)
	public void method5840() {
		if (this.field3436 != null) {
			if (field3437 != null) {
				field3437.set(true);
			}

			field3437 = new AtomicBoolean(false);
			AtomicBoolean var1 = field3437;
			if (field3438 == null) {
				int var2 = Runtime.getRuntime().availableProcessors();
				field3438 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class309(this));
			}

			field3438.submit(new class313(this, var1));
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-59"
	)
	public synchronized void method5819() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.clear();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("az")
	protected synchronized int vmethod6028() {
		return 0;
	}

	@ObfuscatedName("av")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3410 * 1000000 / PcmPlayer.field314;

			do {
				long var5 = (long)var4 * (long)var3 + this.field3416;
				if (this.field3434 - var5 >= 0L) {
					this.field3416 = var5;
					break;
				}

				int var7 = (int)((this.field3434 - this.field3416 + (long)var4 - 1L) / (long)var4);
				this.field3416 += (long)var4 * (long)var7;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method5850();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-80"
	)
	public synchronized void method5820() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove();
		}

	}

	@ObfuscatedName("aq")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3410 * 1000000 / PcmPlayer.field314;

			do {
				long var3 = this.field3416 + (long)var1 * (long)var2;
				if (this.field3434 - var3 >= 0L) {
					this.field3416 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3434 - this.field3416) - 1L) / (long)var2);
				this.field3416 += (long)var2 * (long)var5;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method5850();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lmp;ZI)V",
		garbageValue = "1966762890"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field3430 = var2;
		this.field3416 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field3434 = this.midiFile.method5956(this.trackLength);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-38"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method5878();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-53"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-958919488"
	)
	public synchronized boolean method5926() {
		return this.musicPatches.method8791() > 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-736064552"
	)
	public synchronized void method5825(int var1, int var2) {
		this.method5905(var1, var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1708470262"
	)
	void method5905(int var1, int var2) {
		this.field3415[var1] = var2;
		this.field3421[var1] = var2 & -128;
		this.method5827(var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1087105384"
	)
	void method5827(int var1, int var2) {
		if (var2 != this.field3414[var1]) {
			this.field3414[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3428[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "2143768499"
	)
	void method5902(int var1, int var2, int var3) {
		this.method5830(var1, var2, 64);
		if ((this.field3433[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field3494 == var1 && var4.field3499 < 0) {
					this.field3427[var1][var4.field3490] = null;
					this.field3427[var1][var2] = var4;
					int var8 = (var4.field3495 * var4.field3488 >> 12) + var4.field3503;
					var4.field3503 += var2 - var4.field3490 << 8;
					var4.field3488 = var8 - var4.field3503;
					var4.field3495 = 4096;
					var4.field3490 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3414[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var5 = var9.rawSounds[var2].method1098();
				if (var5 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field3494 = var1;
					var6.table = var9;
					var6.rawSound = var5;
					var6.field3504 = var9.field3469[var2];
					var6.field3492 = var9.field3468[var2];
					var6.field3490 = var2;
					var6.field3491 = var3 * var3 * var9.field3467[var2] * var9.field3470 + 1024 >> 11;
					var6.field3485 = var9.field3472[var2] & 255;
					var6.field3503 = (var2 << 8) - (var9.field3465[var2] & 32767);
					var6.field3493 = 0;
					var6.field3497 = 0;
					var6.field3498 = 0;
					var6.field3499 = -1;
					var6.field3500 = 0;
					if (this.field3424[var1] == 0) {
						var6.stream = RawPcmStream.method887(var5, this.method5932(var6), this.method5940(var6), this.method5844(var6));
					} else {
						var6.stream = RawPcmStream.method887(var5, this.method5932(var6), 0, this.method5844(var6));
						this.method5829(var6, var9.field3465[var2] < 0);
					}

					if (var9.field3465[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3492 >= 0) {
						MusicPatchNode var7 = this.field3428[var1][var6.field3492];
						if (var7 != null && var7.field3499 < 0) {
							this.field3427[var1][var7.field3490] = null;
							var7.field3499 = 0;
						}

						this.field3428[var1][var6.field3492] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field3427[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lmw;ZI)V",
		garbageValue = "1430069342"
	)
	void method5829(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field282) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)this.field3424[var1.field3494] * (long)var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method1012();
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3424[var1.field3494] >> 6);
		}

		var1.stream.method988(var4);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1076595045"
	)
	void method5830(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3427[var1][var2];
		if (var4 != null) {
			this.field3427[var1][var2] = null;
			if ((this.field3433[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var4.field3494 == var5.field3494 && var5.field3499 < 0 && var4 != var5) {
						var4.field3499 = 0;
						break;
					}
				}
			} else {
				var4.field3499 = 0;
			}

		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "2035773529"
	)
	void method5831(int var1, int var2, int var3) {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "105"
	)
	void method5832(int var1, int var2) {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1823688205"
	)
	void method5833(int var1, int var2) {
		this.field3409[var1] = var2;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-361813593"
	)
	void method5874(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field3494 == var1) {
				if (var2.stream != null) {
					var2.stream.method900(PcmPlayer.field314 / 100);
					if (var2.stream.method1031()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6052();
				}

				if (var2.field3499 < 0) {
					this.field3427[var2.field3494][var2.field3490] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1673747519"
	)
	void method5835(int var1) {
		if (var1 >= 0) {
			this.field3412[var1] = 12800;
			this.field3413[var1] = 8192;
			this.field3425[var1] = 16383;
			this.field3409[var1] = 8192;
			this.field3419[var1] = 0;
			this.field3432[var1] = 8192;
			this.method5838(var1);
			this.method5839(var1);
			this.field3433[var1] = 0;
			this.field3422[var1] = 32767;
			this.field3423[var1] = 256;
			this.field3424[var1] = 0;
			this.method5841(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method5835(var1);
			}

		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-694816578"
	)
	void method5836(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field3494 == var1) && var2.field3499 < 0) {
				this.field3427[var2.field3494][var2.field3490] = null;
				var2.field3499 = 0;
			}
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1070396160"
	)
	void method5878() {
		this.method5874(-1);
		this.method5835(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3414[var1] = this.field3415[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3421[var1] = this.field3415[var1] & -128;
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1321540000"
	)
	void method5838(int var1) {
		if ((this.field3433[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3494 == var1 && this.field3427[var1][var2.field3490] == null && var2.field3499 < 0) {
					var2.field3499 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2058782045"
	)
	void method5839(int var1) {
		if ((this.field3433[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3494 == var1) {
					var2.field3505 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-76"
	)
	void method5875(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method5830(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method5902(var3, var4, var5);
			} else {
				this.method5830(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method5831(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3421[var3] = (var5 << 14) + (this.field3421[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3421[var3] = (var5 << 7) + (this.field3421[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3419[var3] = (var5 << 7) + (this.field3419[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3419[var3] = var5 + (this.field3419[var3] & -128);
			}

			if (var4 == 5) {
				this.field3432[var3] = (var5 << 7) + (this.field3432[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3432[var3] = var5 + (this.field3432[var3] & -128);
			}

			if (var4 == 7) {
				this.field3412[var3] = (var5 << 7) + (this.field3412[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3412[var3] = var5 + (this.field3412[var3] & -128);
			}

			if (var4 == 10) {
				this.field3413[var3] = (var5 << 7) + (this.field3413[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3413[var3] = var5 + (this.field3413[var3] & -128);
			}

			if (var4 == 11) {
				this.field3425[var3] = (var5 << 7) + (this.field3425[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3425[var3] = var5 + (this.field3425[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3433;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3433;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3433;
					var10000[var3] |= 2;
				} else {
					this.method5838(var3);
					var10000 = this.field3433;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3422[var3] = (var5 << 7) + (this.field3422[var3] & 127);
			}

			if (var4 == 98) {
				this.field3422[var3] = (this.field3422[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3422[var3] = (var5 << 7) + (this.field3422[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3422[var3] = (this.field3422[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method5874(var3);
			}

			if (var4 == 121) {
				this.method5835(var3);
			}

			if (var4 == 123) {
				this.method5836(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3422[var3];
				if (var6 == 16384) {
					this.field3423[var3] = (var5 << 7) + (this.field3423[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3422[var3];
				if (var6 == 16384) {
					this.field3423[var3] = var5 + (this.field3423[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3424[var3] = (var5 << 7) + (this.field3424[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3424[var3] = var5 + (this.field3424[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3433;
					var10000[var3] |= 4;
				} else {
					this.method5839(var3);
					var10000 = this.field3433;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method5841(var3, (var5 << 7) + (this.field3417[var3] & -16257));
			}

			if (var4 == 49) {
				this.method5841(var3, var5 + (this.field3417[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method5827(var3, var4 + this.field3421[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method5832(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method5833(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method5878();
			}
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1175935963"
	)
	void method5841(int var1, int var2) {
		this.field3417[var1] = var2;
		this.field3440[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)I",
		garbageValue = "389364679"
	)
	int method5932(MusicPatchNode var1) {
		int var2 = (var1.field3495 * var1.field3488 >> 12) + var1.field3503;
		var2 += (this.field3409[var1.field3494] - 8192) * this.field3423[var1.field3494] >> 12;
		MusicPatchNode2 var3 = var1.field3504;
		int var4;
		if (var3.field3387 > 0 && (var3.field3386 > 0 || this.field3419[var1.field3494] > 0)) {
			var4 = var3.field3386 << 2;
			int var5 = var3.field3388 << 1;
			if (var1.field3501 < var5) {
				var4 = var4 * var1.field3501 / var5;
			}

			var4 += this.field3419[var1.field3494] >> 7;
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field3502 & 511));
			var2 += (int)((double)var4 * var6);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)PcmPlayer.field314 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lmw;B)I",
		garbageValue = "92"
	)
	int method5940(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3504;
		int var3 = this.field3425[var1.field3494] * this.field3412[var1.field3494] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3491 + 16384 >> 15;
		var3 = var3 * this.field3420 + 128 >> 8;
		if (var2.field3382 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3382 * 1.953125E-5D * (double)var1.field3493) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3381 != null) {
			var4 = var1.field3497;
			var5 = var2.field3381[var1.field3498 * 2 + 1];
			if (var1.field3498 * 2 < var2.field3381.length - 2) {
				var6 = (var2.field3381[var1.field3498 * 2] & 255) << 8;
				var7 = (var2.field3381[var1.field3498 * 2 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3381[var1.field3498 * 2 + 3] - var5) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		if (var1.field3499 > 0 && var2.field3380 != null) {
			var4 = var1.field3499;
			var5 = var2.field3380[var1.field3500 * 4 + 1];
			if (var1.field3500 * 4 < var2.field3380.length - 2) {
				var6 = (var2.field3380[var1.field3500 * 4] & 255) << 8;
				var7 = (var2.field3380[var1.field3500 * 4 + 2] & 255) << 8;
				var5 += (var2.field3380[var1.field3500 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lmw;B)I",
		garbageValue = "5"
	)
	int method5844(MusicPatchNode var1) {
		int var2 = this.field3413[var1.field3494];
		return var2 < 8192 ? var2 * var1.field3485 + 32 >> 6 : 16384 - ((128 - var1.field3485) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-78"
	)
	void method5850() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3434; var2 == this.trackLength; var3 = this.midiFile.method5956(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3430 || var2 == 0) {
							this.method5878();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method5875(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3434 = var3;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)Z",
		garbageValue = "1531525351"
	)
	boolean method5851(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3499 >= 0) {
				var1.remove();
				if (var1.field3492 > 0 && var1 == this.field3428[var1.field3494][var1.field3492]) {
					this.field3428[var1.field3494][var1.field3492] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lmw;[IIIS)Z",
		garbageValue = "16345"
	)
	boolean method5852(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3486 = PcmPlayer.field314 / 100;
		if (var1.field3499 < 0 || var1.stream != null && !var1.stream.method903()) {
			int var5 = var1.field3495;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field3432[var1.field3494]) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3495 = var5;
			}

			var1.stream.method901(this.method5932(var1));
			MusicPatchNode2 var6 = var1.field3504;
			boolean var7 = false;
			++var1.field3501;
			var1.field3502 += var6.field3387;
			double var8 = (double)((var1.field3490 - 60 << 8) + (var1.field3495 * var1.field3488 >> 12)) * 5.086263020833333E-6D;
			if (var6.field3382 > 0) {
				if (var6.field3391 > 0) {
					var1.field3493 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3391 * var8) + 0.5D);
				} else {
					var1.field3493 += 128;
				}
			}

			if (var6.field3381 != null) {
				if (var6.field3383 > 0) {
					var1.field3497 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3383 * var8) + 0.5D);
				} else {
					var1.field3497 += 128;
				}

				while (var1.field3498 * 2 < var6.field3381.length - 2 && var1.field3497 > (var6.field3381[var1.field3498 * 2 + 2] & 255) << 8) {
					var1.field3498 = var1.field3498 * 4 + 4;
				}

				if (var1.field3498 * 2 == var6.field3381.length - 2 && var6.field3381[var1.field3498 * 2 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field3499 >= 0 && var6.field3380 != null && (this.field3433[var1.field3494] & 1) == 0 && (var1.field3492 < 0 || var1 != this.field3428[var1.field3494][var1.field3492])) {
				if (var6.field3385 > 0) {
					var1.field3499 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3385 * var8) + 0.5D);
				} else {
					var1.field3499 += 128;
				}

				while (var1.field3500 * 4 < var6.field3380.length - 2 && var1.field3499 > (var6.field3380[var1.field3500 * 4 + 2] & 255) << 8) {
					var1.field3500 = var1.field3500 * 4 + 2;
				}

				if (var1.field3500 * 4 == var6.field3380.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method900(var1.field3486);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method1031()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6052();
				if (var1.field3499 >= 0) {
					var1.remove();
					if (var1.field3492 > 0 && var1 == this.field3428[var1.field3494][var1.field3492]) {
						this.field3428[var1.field3494][var1.field3492] = null;
					}
				}

				return true;
			} else {
				var1.stream.method899(var1.field3486, this.method5940(var1), this.method5844(var1));
				return false;
			}
		} else {
			var1.method6052();
			var1.remove();
			if (var1.field3492 > 0 && var1 == this.field3428[var1.field3494][var1.field3492]) {
				this.field3428[var1.field3494][var1.field3492] = null;
			}

			return true;
		}
	}
}
