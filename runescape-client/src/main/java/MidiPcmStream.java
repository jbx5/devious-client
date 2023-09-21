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

@ObfuscatedName("mt")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("bo")
	static AtomicBoolean field3473;
	@ObfuscatedName("bp")
	static ThreadPoolExecutor field3454;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1345811845
	)
	int field3445;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1623814097
	)
	int field3446;
	@ObfuscatedName("ax")
	int[] field3447;
	@ObfuscatedName("ao")
	int[] field3448;
	@ObfuscatedName("ah")
	int[] field3449;
	@ObfuscatedName("ar")
	int[] field3458;
	@ObfuscatedName("ab")
	int[] field3451;
	@ObfuscatedName("am")
	int[] field3444;
	@ObfuscatedName("av")
	int[] field3453;
	@ObfuscatedName("ag")
	int[] field3474;
	@ObfuscatedName("aa")
	int[] field3455;
	@ObfuscatedName("ae")
	int[] field3457;
	@ObfuscatedName("aw")
	int[] field3467;
	@ObfuscatedName("aq")
	int[] field3459;
	@ObfuscatedName("az")
	int[] field3460;
	@ObfuscatedName("at")
	int[] field3461;
	@ObfuscatedName("af")
	int[] field3475;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[[Lms;"
	)
	MusicPatchNode[][] field3465;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "[[Lms;"
	)
	MusicPatchNode[][] field3462;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("by")
	boolean field3463;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1049039467
	)
	@Export("track")
	int track;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1236508829
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		longValue = -1904008253243275471L
	)
	long field3471;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		longValue = -4957310323141208567L
	)
	long field3470;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bb")
	PriorityQueue field3472;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 817128569
	)
	public int field3450;

	static {
		field3473 = null;
		field3454 = null;
	}

	public MidiPcmStream() {
		this.field3445 = 256;
		this.field3446 = 1000000;
		this.field3447 = new int[16];
		this.field3448 = new int[16];
		this.field3449 = new int[16];
		this.field3458 = new int[16];
		this.field3451 = new int[16];
		this.field3444 = new int[16];
		this.field3453 = new int[16];
		this.field3474 = new int[16];
		this.field3455 = new int[16];
		this.field3457 = new int[16];
		this.field3467 = new int[16];
		this.field3459 = new int[16];
		this.field3460 = new int[16];
		this.field3461 = new int[16];
		this.field3475 = new int[16];
		this.field3465 = new MusicPatchNode[16][128];
		this.field3462 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.field3472 = new PriorityQueue(5, new class330());
		this.field3450 = 0;
		this.musicPatches = new NodeHashTable(128);
		this.method5992();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "109"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3445 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-13"
	)
	public int method5971() {
		return this.field3445;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lmk;Lom;Lbl;I)Z",
		garbageValue = "-1830159532"
	)
	public synchronized boolean method5972(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		boolean var4 = true;
		synchronized(this.field3472) {
			this.field3472.clear();
		}

		for (class332 var5 = (class332)var1.field3514.first(); var5 != null; var5 = (class332)var1.field3514.next()) {
			int var12 = (int)var5.key;
			MusicPatch var7 = (MusicPatch)this.musicPatches.get((long)var12);
			if (var7 == null) {
				var7 = class309.method5871(var2, var12);
				if (var7 == null) {
					var4 = false;
					continue;
				}

				this.musicPatches.put(var7, (long)var12);
			}

			if (!var7.method6157(var3, var5.field3554)) {
				var4 = false;
			} else if (this.field3472 != null) {
				synchronized(this.field3472) {
					Iterator var9 = var7.field3503.iterator();

					while (var9.hasNext()) {
						class53 var10 = (class53)var9.next();
						this.field3472.add(new class323(var5.field3555, var10));
					}
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-38"
	)
	public void method5979() {
		if (this.field3472 != null) {
			if (field3473 != null) {
				field3473.set(true);
			}

			field3473 = new AtomicBoolean(false);
			AtomicBoolean var1 = field3473;
			if (field3454 == null) {
				int var2 = Runtime.getRuntime().availableProcessors();
				field3454 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class322(this));
			}

			field3454.submit(new class326(this, var1));
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "356838086"
	)
	public synchronized void method5974() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.method6151();
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Lbi;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Lbi;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("ab")
	protected synchronized int vmethod6188() {
		return 0;
	}

	@ObfuscatedName("am")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3446 * -727379968 / PcmPlayer.field306;

			do {
				long var5 = this.field3471 + (long)var3 * (long)var4;
				if (this.field3470 - var5 >= 0L) {
					this.field3471 = var5;
					break;
				}

				int var7 = (int)((this.field3470 - this.field3471 + (long)var4 - 1L) / (long)var4);
				this.field3471 += (long)var7 * (long)var4;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method6005();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	public synchronized void method6044() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove();
		}

	}

	@ObfuscatedName("ag")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3446 * -727379968 / PcmPlayer.field306;

			do {
				long var3 = this.field3471 + (long)var1 * (long)var2;
				if (this.field3470 - var3 >= 0L) {
					this.field3471 = var3;
					break;
				}

				int var5 = (int)((this.field3470 - this.field3471 + (long)var2 - 1L) / (long)var2);
				this.field3471 += (long)var5 * (long)var2;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method6005();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lmk;ZI)V",
		garbageValue = "-1812900871"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field3463 = var2;
		this.field3471 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field3470 = this.midiFile.method6144(this.trackLength);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1705880184"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method5992();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1826603097"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1035642858"
	)
	public synchronized boolean method6050() {
		return this.musicPatches.method8894() > 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	public synchronized void method5980(int var1, int var2) {
		this.method5981(var1, var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "160"
	)
	void method5981(int var1, int var2) {
		this.field3458[var1] = var2;
		this.field3444[var1] = var2 & -128;
		this.method5982(var1, var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2093622252"
	)
	void method5982(int var1, int var2) {
		if (var2 != this.field3451[var1]) {
			this.field3451[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3462[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1932106886"
	)
	void method6065(int var1, int var2, int var3) {
		this.method5985(var1, var2, 64);
		if ((this.field3457[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field3516 == var1 && var4.field3524 < 0) {
					this.field3465[var1][var4.field3520] = null;
					this.field3465[var1][var2] = var4;
					int var8 = (var4.field3525 * var4.field3529 >> 12) + var4.field3517;
					var4.field3517 += var2 - var4.field3520 << 8;
					var4.field3529 = var8 - var4.field3517;
					var4.field3525 = 4096;
					var4.field3520 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3451[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var5 = var9.rawSounds[var2].method1078();
				if (var5 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field3516 = var1;
					var6.table = var9;
					var6.rawSound = var5;
					var6.field3518 = var9.field3501[var2];
					var6.field3519 = var9.field3495[var2];
					var6.field3520 = var2;
					var6.field3521 = var3 * var3 * var9.field3499[var2] * var9.field3500 + 1024 >> 11;
					var6.field3522 = var9.field3502[var2] & 255;
					var6.field3517 = (var2 << 8) - (var9.field3498[var2] & 32767);
					var6.field3526 = 0;
					var6.field3527 = 0;
					var6.field3528 = 0;
					var6.field3524 = -1;
					var6.field3530 = 0;
					if (this.field3460[var1] == 0) {
						var6.stream = RawPcmStream.method942(var5, this.method6025(var6), this.method5998(var6), this.method5999(var6));
					} else {
						var6.stream = RawPcmStream.method942(var5, this.method6025(var6), 0, this.method5999(var6));
						this.method5984(var6, var9.field3498[var2] < 0);
					}

					if (var9.field3498[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3519 >= 0) {
						MusicPatchNode var7 = this.field3462[var1][var6.field3519];
						if (var7 != null && var7.field3524 < 0) {
							this.field3465[var1][var7.field3520] = null;
							var7.field3524 = 0;
						}

						this.field3462[var1][var6.field3519] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field3465[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lms;ZI)V",
		garbageValue = "240911451"
	)
	void method5984(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field279) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)this.field3460[var1.field3516] * (long)var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method886();
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3460[var1.field3516] >> 6);
		}

		var1.stream.method885(var4);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1358549088"
	)
	void method5985(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3465[var1][var2];
		if (var4 != null) {
			this.field3465[var1][var2] = null;
			if ((this.field3457[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var5.field3516 == var4.field3516 && var5.field3524 < 0 && var5 != var4) {
						var4.field3524 = 0;
						break;
					}
				}
			} else {
				var4.field3524 = 0;
			}

		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "714069724"
	)
	void method6053(int var1, int var2, int var3) {
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-454645454"
	)
	void method5987(int var1, int var2) {
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2005247777"
	)
	void method5988(int var1, int var2) {
		this.field3453[var1] = var2;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "7"
	)
	void method5989(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field3516 == var1) {
				if (var2.stream != null) {
					var2.stream.method890(PcmPlayer.field306 / 100);
					if (var2.stream.method904()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6195();
				}

				if (var2.field3524 < 0) {
					this.field3465[var2.field3516][var2.field3520] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-58"
	)
	void method5990(int var1) {
		if (var1 >= 0) {
			this.field3447[var1] = 12800;
			this.field3448[var1] = 8192;
			this.field3449[var1] = 16383;
			this.field3453[var1] = 8192;
			this.field3474[var1] = 0;
			this.field3455[var1] = 8192;
			this.method6001(var1);
			this.method6079(var1);
			this.field3457[var1] = 0;
			this.field3467[var1] = 32767;
			this.field3459[var1] = 256;
			this.field3460[var1] = 0;
			this.method6004(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method5990(var1);
			}

		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1157620765"
	)
	void method5991(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field3516 == var1) && var2.field3524 < 0) {
				this.field3465[var2.field3516][var2.field3520] = null;
				var2.field3524 = 0;
			}
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "421748536"
	)
	void method5992() {
		this.method5989(-1);
		this.method5990(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3451[var1] = this.field3458[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3444[var1] = this.field3458[var1] & -128;
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "666381709"
	)
	void method6001(int var1) {
		if ((this.field3457[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3516 == var1 && this.field3465[var1][var2.field3520] == null && var2.field3524 < 0) {
					var2.field3524 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "3"
	)
	void method6079(int var1) {
		if ((this.field3457[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3516 == var1) {
					var2.field3535 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1231976764"
	)
	void method5995(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method5985(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method6065(var3, var4, var5);
			} else {
				this.method5985(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6053(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3444[var3] = (var5 << 14) + (this.field3444[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3444[var3] = (var5 << 7) + (this.field3444[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3474[var3] = (var5 << 7) + (this.field3474[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3474[var3] = var5 + (this.field3474[var3] & -128);
			}

			if (var4 == 5) {
				this.field3455[var3] = (var5 << 7) + (this.field3455[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3455[var3] = var5 + (this.field3455[var3] & -128);
			}

			if (var4 == 7) {
				this.field3447[var3] = (var5 << 7) + (this.field3447[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3447[var3] = var5 + (this.field3447[var3] & -128);
			}

			if (var4 == 10) {
				this.field3448[var3] = (var5 << 7) + (this.field3448[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3448[var3] = var5 + (this.field3448[var3] & -128);
			}

			if (var4 == 11) {
				this.field3449[var3] = (var5 << 7) + (this.field3449[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3449[var3] = var5 + (this.field3449[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3457;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3457;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3457;
					var10000[var3] |= 2;
				} else {
					this.method6001(var3);
					var10000 = this.field3457;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3467[var3] = (var5 << 7) + (this.field3467[var3] & 127);
			}

			if (var4 == 98) {
				this.field3467[var3] = (this.field3467[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3467[var3] = (var5 << 7) + (this.field3467[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3467[var3] = (this.field3467[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method5989(var3);
			}

			if (var4 == 121) {
				this.method5990(var3);
			}

			if (var4 == 123) {
				this.method5991(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3467[var3];
				if (var6 == 16384) {
					this.field3459[var3] = (var5 << 7) + (this.field3459[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3467[var3];
				if (var6 == 16384) {
					this.field3459[var3] = var5 + (this.field3459[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3460[var3] = (var5 << 7) + (this.field3460[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3460[var3] = var5 + (this.field3460[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3457;
					var10000[var3] |= 4;
				} else {
					this.method6079(var3);
					var10000 = this.field3457;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method6004(var3, (var5 << 7) + (this.field3461[var3] & -16257));
			}

			if (var4 == 49) {
				this.method6004(var3, var5 + (this.field3461[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method5982(var3, var4 + this.field3444[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method5987(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method5988(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method5992();
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-742542086"
	)
	void method6004(int var1, int var2) {
		this.field3461[var1] = var2;
		this.field3475[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lms;S)I",
		garbageValue = "2001"
	)
	int method6025(MusicPatchNode var1) {
		int var2 = (var1.field3529 * var1.field3525 >> 12) + var1.field3517;
		var2 += (this.field3453[var1.field3516] - 8192) * this.field3459[var1.field3516] >> 12;
		MusicPatchNode2 var3 = var1.field3518;
		int var4;
		if (var3.field3424 > 0 && (var3.field3423 > 0 || this.field3474[var1.field3516] > 0)) {
			var4 = var3.field3423 << 2;
			int var5 = var3.field3426 << 1;
			if (var1.field3531 < var5) {
				var4 = var4 * var1.field3531 / var5;
			}

			var4 += this.field3474[var1.field3516] >> 7;
			double var6 = Math.sin((double)(var1.field3534 & 511) * 0.01227184630308513D);
			var2 += (int)((double)var4 * var6);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)PcmPlayer.field306 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lms;B)I",
		garbageValue = "59"
	)
	int method5998(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3518;
		int var3 = this.field3449[var1.field3516] * this.field3447[var1.field3516] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3521 + 16384 >> 15;
		var3 = var3 * this.field3445 + 128 >> 8;
		if (var2.field3419 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3419 * (double)var1.field3526 * 1.953125E-5D) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3420 != null) {
			var4 = var1.field3527;
			var5 = var2.field3420[var1.field3528 * 4 + 1];
			if (var1.field3528 * 4 < var2.field3420.length - 2) {
				var6 = (var2.field3420[var1.field3528 * 4] & 255) << 8;
				var7 = (var2.field3420[var1.field3528 * 4 + 2] & 255) << 8;
				var5 += (var2.field3420[var1.field3528 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		if (var1.field3524 > 0 && var2.field3418 != null) {
			var4 = var1.field3524;
			var5 = var2.field3418[var1.field3530 * 4 + 1];
			if (var1.field3530 * 4 < var2.field3418.length - 2) {
				var6 = (var2.field3418[var1.field3530 * 4] & 255) << 8;
				var7 = (var2.field3418[var1.field3530 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3418[var1.field3530 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lms;B)I",
		garbageValue = "2"
	)
	int method5999(MusicPatchNode var1) {
		int var2 = this.field3448[var1.field3516];
		return var2 < 8192 ? var2 * var1.field3522 + 32 >> 6 : 16384 - ((128 - var1.field3522) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2129137394"
	)
	void method6005() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3470; var2 == this.trackLength; var3 = this.midiFile.method6144(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3463 || var2 == 0) {
							this.method5992();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method5995(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3470 = var3;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lms;B)Z",
		garbageValue = "-28"
	)
	boolean method6045(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3524 >= 0) {
				var1.remove();
				if (var1.field3519 > 0 && var1 == this.field3462[var1.field3516][var1.field3519]) {
					this.field3462[var1.field3516][var1.field3519] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lms;[IIIS)Z",
		garbageValue = "27530"
	)
	boolean method6007(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3536 = PcmPlayer.field306 / 100;
		if (var1.field3524 < 0 || var1.stream != null && !var1.stream.method893()) {
			int var5 = var1.field3525;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3455[var1.field3516] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3525 = var5;
			}

			var1.stream.method891(this.method6025(var1));
			MusicPatchNode2 var6 = var1.field3518;
			boolean var7 = false;
			++var1.field3531;
			var1.field3534 += var6.field3424;
			double var8 = (double)((var1.field3520 - 60 << 8) + (var1.field3529 * var1.field3525 >> 12)) * 5.086263020833333E-6D;
			if (var6.field3419 > 0) {
				if (var6.field3421 > 0) {
					var1.field3526 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3421 * var8) + 0.5D);
				} else {
					var1.field3526 += 128;
				}
			}

			if (var6.field3420 != null) {
				if (var6.field3425 > 0) {
					var1.field3527 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3425 * var8) + 0.5D);
				} else {
					var1.field3527 += 128;
				}

				while (var1.field3528 * 4 < var6.field3420.length - 2 && var1.field3527 > (var6.field3420[var1.field3528 * 4 + 2] & 255) << 8) {
					var1.field3528 = var1.field3528 * 4 + 2;
				}

				if (var1.field3528 * 4 == var6.field3420.length - 2 && var6.field3420[var1.field3528 * 4 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field3524 >= 0 && var6.field3418 != null && (this.field3457[var1.field3516] & 1) == 0 && (var1.field3519 < 0 || var1 != this.field3462[var1.field3516][var1.field3519])) {
				if (var6.field3417 > 0) {
					var1.field3524 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3417 * var8) + 0.5D);
				} else {
					var1.field3524 += 128;
				}

				while (var1.field3530 * 4 < var6.field3418.length - 2 && var1.field3524 > (var6.field3418[var1.field3530 * 4 + 2] & 255) << 8) {
					var1.field3530 = var1.field3530 * 4 + 2;
				}

				if (var1.field3530 * 4 == var6.field3418.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method890(var1.field3536);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method904()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6195();
				if (var1.field3524 >= 0) {
					var1.remove();
					if (var1.field3519 > 0 && var1 == this.field3462[var1.field3516][var1.field3519]) {
						this.field3462[var1.field3516][var1.field3519] = null;
					}
				}

				return true;
			} else {
				var1.stream.method889(var1.field3536, this.method5998(var1), this.method5999(var1));
				return false;
			}
		} else {
			var1.method6195();
			var1.remove();
			if (var1.field3519 > 0 && var1 == this.field3462[var1.field3516][var1.field3519]) {
				this.field3462[var1.field3516][var1.field3519] = null;
			}

			return true;
		}
	}
}
