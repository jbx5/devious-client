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

@ObfuscatedName("mk")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("bc")
	static AtomicBoolean field3497;
	@ObfuscatedName("bx")
	static ThreadPoolExecutor field3487;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1518385287
	)
	int field3470;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1610555469
	)
	int field3498;
	@ObfuscatedName("aj")
	int[] field3480;
	@ObfuscatedName("aq")
	int[] field3472;
	@ObfuscatedName("ar")
	int[] field3500;
	@ObfuscatedName("ag")
	int[] field3474;
	@ObfuscatedName("ao")
	int[] field3475;
	@ObfuscatedName("ae")
	int[] field3476;
	@ObfuscatedName("aa")
	int[] field3477;
	@ObfuscatedName("au")
	int[] field3478;
	@ObfuscatedName("an")
	int[] field3479;
	@ObfuscatedName("as")
	int[] field3481;
	@ObfuscatedName("ab")
	int[] field3473;
	@ObfuscatedName("ah")
	int[] field3471;
	@ObfuscatedName("ai")
	int[] field3484;
	@ObfuscatedName("ac")
	int[] field3485;
	@ObfuscatedName("al")
	int[] field3494;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[[Lmv;"
	)
	MusicPatchNode[][] field3490;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "[[Lmv;"
	)
	MusicPatchNode[][] field3488;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bg")
	boolean field3469;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1050180227
	)
	@Export("track")
	int track;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -543510225
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		longValue = -8628189700403988937L
	)
	long field3493;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		longValue = -1845324877038206627L
	)
	long field3482;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("by")
	PriorityQueue field3496;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 590471631
	)
	public int field3499;

	static {
		field3497 = null;
		field3487 = null;
	}

	public MidiPcmStream() {
		this.field3470 = 256;
		this.field3498 = 1000000;
		this.field3480 = new int[16];
		this.field3472 = new int[16];
		this.field3500 = new int[16];
		this.field3474 = new int[16];
		this.field3475 = new int[16];
		this.field3476 = new int[16];
		this.field3477 = new int[16];
		this.field3478 = new int[16];
		this.field3479 = new int[16];
		this.field3481 = new int[16];
		this.field3473 = new int[16];
		this.field3471 = new int[16];
		this.field3484 = new int[16];
		this.field3485 = new int[16];
		this.field3494 = new int[16];
		this.field3490 = new MusicPatchNode[16][128];
		this.field3488 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.field3496 = new PriorityQueue(5, new class330());
		this.field3499 = 0;
		this.musicPatches = new NodeHashTable(128);
		this.method6091();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "618137822"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3470 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "2250"
	)
	public int method6071() {
		return this.field3470;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lmr;Low;Lbi;B)Z",
		garbageValue = "96"
	)
	public synchronized boolean method6072(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		boolean var4 = true;
		synchronized(this.field3496) {
			this.field3496.clear();
		}

		for (class332 var5 = (class332)var1.field3543.first(); var5 != null; var5 = (class332)var1.field3543.next()) {
			int var12 = (int)var5.key;
			MusicPatch var7 = (MusicPatch)this.musicPatches.get((long)var12);
			if (var7 == null) {
				var7 = MusicPatchNode2.method6039(var2, var12);
				if (var7 == null) {
					var4 = false;
					continue;
				}

				this.musicPatches.put(var7, (long)var12);
			}

			if (!var7.method6243(var3, var5.field3586)) {
				var4 = false;
			} else if (this.field3496 != null) {
				synchronized(this.field3496) {
					Iterator var9 = var7.field3528.iterator();

					while (var9.hasNext()) {
						class53 var10 = (class53)var9.next();
						this.field3496.add(new class323(var5.field3585, var10));
					}
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "101"
	)
	public void method6073() {
		if (this.field3496 != null) {
			if (field3497 != null) {
				field3497.set(true);
			}

			field3497 = new AtomicBoolean(false);
			AtomicBoolean var1 = field3497;
			if (field3487 == null) {
				int var2 = Runtime.getRuntime().availableProcessors();
				field3487 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class322(this));
			}

			field3487.submit(new class326(this, var1));
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1106474056"
	)
	public synchronized void method6185() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.method6246();
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Lbl;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Lbl;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("ao")
	protected synchronized int vmethod6281() {
		return 0;
	}

	@ObfuscatedName("ae")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3498 * -727379968 / (class189.field1993 * 22050);

			do {
				long var5 = this.field3493 + (long)var4 * (long)var3;
				if (this.field3482 - var5 >= 0L) {
					this.field3493 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3482 - this.field3493) - 1L) / (long)var4);
				this.field3493 += (long)var7 * (long)var4;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method6104();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1535924462"
	)
	public synchronized void method6075() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove();
		}

	}

	@ObfuscatedName("au")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3498 * -727379968 / (class189.field1993 * 22050);

			do {
				long var3 = this.field3493 + (long)var2 * (long)var1;
				if (this.field3482 - var3 >= 0L) {
					this.field3493 = var3;
					break;
				}

				int var5 = (int)((this.field3482 - this.field3493 + (long)var2 - 1L) / (long)var2);
				this.field3493 += (long)var2 * (long)var5;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method6104();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lmr;ZB)V",
		garbageValue = "125"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field3469 = var2;
		this.field3493 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field3482 = this.midiFile.method6205(this.trackLength);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1256499276"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method6091();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1271037352"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-67"
	)
	public synchronized boolean method6079() {
		return this.musicPatches.method9091() > 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1798130100"
	)
	public synchronized void method6080(int var1, int var2) {
		this.method6081(var1, var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-89"
	)
	void method6081(int var1, int var2) {
		this.field3474[var1] = var2;
		this.field3476[var1] = var2 & -128;
		this.method6145(var1, var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "45"
	)
	void method6145(int var1, int var2) {
		if (var2 != this.field3475[var1]) {
			this.field3475[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3488[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-63"
	)
	void method6128(int var1, int var2, int var3) {
		this.method6097(var1, var2, 64);
		if ((this.field3481[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field3557 == var1 && var4.field3559 < 0) {
					this.field3490[var1][var4.field3568] = null;
					this.field3490[var1][var2] = var4;
					int var8 = (var4.field3567 * var4.field3550 >> 12) + var4.field3549;
					var4.field3549 += var2 - var4.field3568 << 8;
					var4.field3567 = var8 - var4.field3549;
					var4.field3550 = 4096;
					var4.field3568 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3475[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var5 = var9.rawSounds[var2].method1099();
				if (var5 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field3557 = var1;
					var6.table = var9;
					var6.rawSound = var5;
					var6.field3545 = var9.field3526[var2];
					var6.field3553 = var9.field3523[var2];
					var6.field3568 = var2;
					var6.field3551 = var3 * var3 * var9.field3524[var2] * var9.field3531 + 1024 >> 11;
					var6.field3552 = var9.field3525[var2] & 255;
					var6.field3549 = (var2 << 8) - (var9.field3522[var2] & 32767);
					var6.field3556 = 0;
					var6.field3566 = 0;
					var6.field3558 = 0;
					var6.field3559 = -1;
					var6.field3560 = 0;
					if (this.field3484[var1] == 0) {
						var6.stream = RawPcmStream.method919(var5, this.method6096(var6), this.method6186(var6), this.method6144(var6));
					} else {
						var6.stream = RawPcmStream.method919(var5, this.method6096(var6), 0, this.method6144(var6));
						this.method6084(var6, var9.field3522[var2] < 0);
					}

					if (var9.field3522[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3553 >= 0) {
						MusicPatchNode var7 = this.field3488[var1][var6.field3553];
						if (var7 != null && var7.field3559 < 0) {
							this.field3490[var1][var7.field3568] = null;
							var7.field3559 = 0;
						}

						this.field3488[var1][var6.field3553] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field3490[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lmv;ZB)V",
		garbageValue = "-127"
	)
	void method6084(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field267) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)var5 * (long)this.field3484[var1.field3557] >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method923();
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3484[var1.field3557] >> 6);
		}

		var1.stream.method959(var4);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "115"
	)
	void method6097(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3490[var1][var2];
		if (var4 != null) {
			this.field3490[var1][var2] = null;
			if ((this.field3481[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var4.field3557 == var5.field3557 && var5.field3559 < 0 && var5 != var4) {
						var4.field3559 = 0;
						break;
					}
				}
			} else {
				var4.field3559 = 0;
			}

		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V",
		garbageValue = "255"
	)
	void method6135(int var1, int var2, int var3) {
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1927423918"
	)
	void method6086(int var1, int var2) {
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "699999928"
	)
	void method6087(int var1, int var2) {
		this.field3477[var1] = var2;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "466938433"
	)
	void method6088(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field3557 == var1) {
				if (var2.stream != null) {
					var2.stream.method1022(class189.field1993 * 22050 / 100);
					if (var2.stream.method936()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6288();
				}

				if (var2.field3559 < 0) {
					this.field3490[var2.field3557][var2.field3568] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-49"
	)
	void method6089(int var1) {
		if (var1 >= 0) {
			this.field3480[var1] = 12800;
			this.field3472[var1] = 8192;
			this.field3500[var1] = 16383;
			this.field3477[var1] = 8192;
			this.field3478[var1] = 0;
			this.field3479[var1] = 8192;
			this.method6107(var1);
			this.method6093(var1);
			this.field3481[var1] = 0;
			this.field3473[var1] = 32767;
			this.field3471[var1] = 256;
			this.field3484[var1] = 0;
			this.method6159(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method6089(var1);
			}

		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1547440629"
	)
	void method6090(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field3557 == var1) && var2.field3559 < 0) {
				this.field3490[var2.field3557][var2.field3568] = null;
				var2.field3559 = 0;
			}
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "124"
	)
	void method6091() {
		this.method6088(-1);
		this.method6089(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3475[var1] = this.field3474[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3476[var1] = this.field3474[var1] & -128;
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2091346053"
	)
	void method6107(int var1) {
		if ((this.field3481[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3557 == var1 && this.field3490[var1][var2.field3568] == null && var2.field3559 < 0) {
					var2.field3559 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "592552276"
	)
	void method6093(int var1) {
		if ((this.field3481[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3557 == var1) {
					var2.field3554 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-871283348"
	)
	void method6094(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6097(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method6128(var3, var4, var5);
			} else {
				this.method6097(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6135(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3476[var3] = (var5 << 14) + (this.field3476[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3476[var3] = (var5 << 7) + (this.field3476[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3478[var3] = (var5 << 7) + (this.field3478[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3478[var3] = var5 + (this.field3478[var3] & -128);
			}

			if (var4 == 5) {
				this.field3479[var3] = (var5 << 7) + (this.field3479[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3479[var3] = var5 + (this.field3479[var3] & -128);
			}

			if (var4 == 7) {
				this.field3480[var3] = (var5 << 7) + (this.field3480[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3480[var3] = var5 + (this.field3480[var3] & -128);
			}

			if (var4 == 10) {
				this.field3472[var3] = (var5 << 7) + (this.field3472[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3472[var3] = var5 + (this.field3472[var3] & -128);
			}

			if (var4 == 11) {
				this.field3500[var3] = (var5 << 7) + (this.field3500[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3500[var3] = var5 + (this.field3500[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3481;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3481;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3481;
					var10000[var3] |= 2;
				} else {
					this.method6107(var3);
					var10000 = this.field3481;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3473[var3] = (var5 << 7) + (this.field3473[var3] & 127);
			}

			if (var4 == 98) {
				this.field3473[var3] = (this.field3473[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3473[var3] = (var5 << 7) + (this.field3473[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3473[var3] = (this.field3473[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method6088(var3);
			}

			if (var4 == 121) {
				this.method6089(var3);
			}

			if (var4 == 123) {
				this.method6090(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3473[var3];
				if (var6 == 16384) {
					this.field3471[var3] = (var5 << 7) + (this.field3471[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3473[var3];
				if (var6 == 16384) {
					this.field3471[var3] = var5 + (this.field3471[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3484[var3] = (var5 << 7) + (this.field3484[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3484[var3] = var5 + (this.field3484[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3481;
					var10000[var3] |= 4;
				} else {
					this.method6093(var3);
					var10000 = this.field3481;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method6159(var3, (var5 << 7) + (this.field3485[var3] & -16257));
			}

			if (var4 == 49) {
				this.method6159(var3, var5 + (this.field3485[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6145(var3, var4 + this.field3476[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6086(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method6087(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method6091();
			}
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1103725518"
	)
	void method6159(int var1, int var2) {
		this.field3485[var1] = var2;
		this.field3494[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lmv;B)I",
		garbageValue = "111"
	)
	int method6096(MusicPatchNode var1) {
		int var2 = (var1.field3550 * var1.field3567 >> 12) + var1.field3549;
		var2 += (this.field3477[var1.field3557] - 8192) * this.field3471[var1.field3557] >> 12;
		MusicPatchNode2 var3 = var1.field3545;
		int var4;
		if (var3.field3452 > 0 && (var3.field3451 > 0 || this.field3478[var1.field3557] > 0)) {
			var4 = var3.field3451 << 2;
			int var5 = var3.field3449 << 1;
			if (var1.field3561 < var5) {
				var4 = var4 * var1.field3561 / var5;
			}

			var4 += this.field3478[var1.field3557] >> 7;
			double var6 = Math.sin((double)(var1.field3562 & 511) * 0.01227184630308513D);
			var2 += (int)((double)var4 * var6);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)(class189.field1993 * 22050) + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lmv;I)I",
		garbageValue = "-1407702522"
	)
	int method6186(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3545;
		int var3 = this.field3480[var1.field3557] * this.field3500[var1.field3557] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3551 + 16384 >> 15;
		var3 = var3 * this.field3470 + 128 >> 8;
		if (var2.field3453 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var1.field3556 * 1.953125E-5D * (double)var2.field3453) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3446 != null) {
			var4 = var1.field3566;
			var5 = var2.field3446[var1.field3558 * 2 + 1];
			if (var1.field3558 * 2 < var2.field3446.length - 2) {
				var6 = (var2.field3446[var1.field3558 * 2] & 255) << 8;
				var7 = (var2.field3446[var1.field3558 * 2 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3446[var1.field3558 * 2 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		if (var1.field3559 > 0 && var2.field3445 != null) {
			var4 = var1.field3559;
			var5 = var2.field3445[var1.field3560 * 4 + 1];
			if (var1.field3560 * 4 < var2.field3445.length - 2) {
				var6 = (var2.field3445[var1.field3560 * 4] & 255) << 8;
				var7 = (var2.field3445[var1.field3560 * 4 + 2] & 255) << 8;
				var5 += (var2.field3445[var1.field3560 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lmv;I)I",
		garbageValue = "-953411793"
	)
	int method6144(MusicPatchNode var1) {
		int var2 = this.field3472[var1.field3557];
		return var2 < 8192 ? var2 * var1.field3552 + 32 >> 6 : 16384 - ((128 - var1.field3552) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method6104() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3482; var2 == this.trackLength; var3 = this.midiFile.method6205(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3469 || var2 == 0) {
							this.method6091();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method6094(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3482 = var3;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lmv;I)Z",
		garbageValue = "456617802"
	)
	boolean method6105(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3559 >= 0) {
				var1.remove();
				if (var1.field3553 > 0 && var1 == this.field3488[var1.field3557][var1.field3553]) {
					this.field3488[var1.field3557][var1.field3553] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lmv;[IIII)Z",
		garbageValue = "167898530"
	)
	boolean method6106(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3564 = class189.field1993 * 22050 / 100;
		if (var1.field3559 < 0 || var1.stream != null && !var1.stream.method988()) {
			int var5 = var1.field3550;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field3479[var1.field3557]) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3550 = var5;
			}

			var1.stream.method933(this.method6096(var1));
			MusicPatchNode2 var6 = var1.field3545;
			boolean var7 = false;
			++var1.field3561;
			var1.field3562 += var6.field3452;
			double var8 = (double)((var1.field3568 - 60 << 8) + (var1.field3567 * var1.field3550 >> 12)) * 5.086263020833333E-6D;
			if (var6.field3453 > 0) {
				if (var6.field3450 > 0) {
					var1.field3556 = var1.field3556 * -885506048 + (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3450) + 0.5D) * -885506048;
				} else {
					var1.field3556 = var1.field3556 * -885506048 + -1675624448;
				}
			}

			if (var6.field3446 != null) {
				if (var6.field3448 > 0) {
					var1.field3566 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3448) + 0.5D);
				} else {
					var1.field3566 += 128;
				}

				while (var1.field3558 * 2 < var6.field3446.length - 2 && var1.field3566 > (var6.field3446[var1.field3558 * 2 + 2] & 255) << 8) {
					var1.field3558 = var1.field3558 * 4 + 4;
				}

				if (var1.field3558 * 2 == var6.field3446.length - 2 && var6.field3446[var1.field3558 * 2 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field3559 >= 0 && var6.field3445 != null && (this.field3481[var1.field3557] & 1) == 0 && (var1.field3553 < 0 || var1 != this.field3488[var1.field3557][var1.field3553])) {
				if (var6.field3447 > 0) {
					var1.field3559 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3447) + 0.5D);
				} else {
					var1.field3559 += 128;
				}

				while (var1.field3560 * 4 < var6.field3445.length - 2 && var1.field3559 > (var6.field3445[var1.field3560 * 4 + 2] & 255) << 8) {
					var1.field3560 = var1.field3560 * 4 + 2;
				}

				if (var1.field3560 * 4 == var6.field3445.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method1022(var1.field3564);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method936()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6288();
				if (var1.field3559 >= 0) {
					var1.remove();
					if (var1.field3553 > 0 && var1 == this.field3488[var1.field3557][var1.field3553]) {
						this.field3488[var1.field3557][var1.field3553] = null;
					}
				}

				return true;
			} else {
				var1.stream.method931(var1.field3564, this.method6186(var1), this.method6144(var1));
				return false;
			}
		} else {
			var1.method6288();
			var1.remove();
			if (var1.field3553 > 0 && var1 == this.field3488[var1.field3557][var1.field3553]) {
				this.field3488[var1.field3557][var1.field3553] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-45"
	)
	public static String method6176(String var0) {
		return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lnn;III)V",
		garbageValue = "1456727681"
	)
	public static void method6132(Widget var0, int var1, int var2) {
		PlayerComposition var3 = var0.field3759;
		boolean var4 = var2 != var3.gender;
		var3.gender = var2;
		if (var4) {
			int var5;
			int var6;
			if (var3.gender == var1) {
				for (var5 = 0; var5 < PlayerComposition.equipmentIndices.length; ++var5) {
					var6 = PlayerComposition.equipmentIndices[var5];
					if (var3.equipment[var6] > 0 && var3.equipment[var6] < 512) {
						var3.equipment[var6] = var3.field3643[var6];
					}
				}
			} else {
				if (var3.equipment[0] < 512 || ClanMate.method8252(var3)) {
					var3.equipment[class205.field2257.field2259] = 1;
				}

				for (var5 = 0; var5 < 7; ++var5) {
					var6 = PlayerComposition.equipmentIndices[var5];
					if (var3.equipment[var6] > 0 && var3.equipment[var6] < 512) {
						int[] var7 = var3.equipment;

						for (int var8 = 0; var8 < KitDefinition.KitDefinition_fileCount; ++var8) {
							KitDefinition var9 = PlayerType.KitDefinition_get(var8);
							if (var9 != null && !var9.nonSelectable && (var2 == 1 ? 7 : 0) + var5 == var9.bodypartID) {
								var7[PlayerComposition.equipmentIndices[var5]] = var8 + 256;
								break;
							}
						}
					}
				}
			}
		}

		var3.method6383();
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)Z",
		garbageValue = "52"
	)
	static final boolean method6149(int var0, int var1, int var2, int var3, int var4) {
		PendingSpawn var5 = null;

		for (PendingSpawn var6 = (PendingSpawn)Client.pendingSpawns.last(); var6 != null; var6 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0 == var6.plane && var6.x == var1 && var2 == var6.y && var3 == var6.type) {
				var5 = var6;
				break;
			}
		}

		if (var5 != null) {
			var5.field1167 = var4;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("no")
	static final void method6190(double var0) {
		Rasterizer3D.method5296(var0);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(var0);
		ItemComposition.ItemDefinition_cachedSprites.clear();
		class93.clientPreferences.updateBrightness(var0);
	}
}
