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

@ObfuscatedName("mo")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("bv")
	static AtomicBoolean field3511;
	@ObfuscatedName("by")
	static ThreadPoolExecutor field3517;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1100227907
	)
	int field3488;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -831228387
	)
	int field3495;
	@ObfuscatedName("ai")
	int[] field3490;
	@ObfuscatedName("ar")
	int[] field3491;
	@ObfuscatedName("as")
	int[] field3514;
	@ObfuscatedName("aa")
	int[] field3493;
	@ObfuscatedName("az")
	int[] field3494;
	@ObfuscatedName("ao")
	int[] field3503;
	@ObfuscatedName("au")
	int[] field3496;
	@ObfuscatedName("ak")
	int[] field3502;
	@ObfuscatedName("ah")
	int[] field3492;
	@ObfuscatedName("at")
	int[] field3499;
	@ObfuscatedName("ay")
	int[] field3500;
	@ObfuscatedName("ae")
	int[] field3501;
	@ObfuscatedName("ac")
	int[] field3497;
	@ObfuscatedName("ab")
	int[] field3504;
	@ObfuscatedName("av")
	int[] field3516;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[[Lmw;"
	)
	MusicPatchNode[][] field3505;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "[[Lmw;"
	)
	MusicPatchNode[][] field3506;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bd")
	boolean field3508;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -695121899
	)
	@Export("track")
	int track;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -984331291
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		longValue = -4100503427476976343L
	)
	long field3498;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		longValue = -3899664085788780929L
	)
	long field3512;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("player")
	PcmPlayer player;
	@ObfuscatedName("bw")
	@Export("priorityQueue")
	PriorityQueue priorityQueue;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1588859775
	)
	public int field3518;

	static {
		field3511 = null;
		field3517 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lbf;)V"
	)
	public MidiPcmStream(PcmPlayer var1) {
		this.field3488 = 256;
		this.field3495 = 1000000;
		this.field3490 = new int[16];
		this.field3491 = new int[16];
		this.field3514 = new int[16];
		this.field3493 = new int[16];
		this.field3494 = new int[16];
		this.field3503 = new int[16];
		this.field3496 = new int[16];
		this.field3502 = new int[16];
		this.field3492 = new int[16];
		this.field3499 = new int[16];
		this.field3500 = new int[16];
		this.field3501 = new int[16];
		this.field3497 = new int[16];
		this.field3504 = new int[16];
		this.field3516 = new int[16];
		this.field3505 = new MusicPatchNode[16][128];
		this.field3506 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.player = null;
		this.priorityQueue = new PriorityQueue(5, new class332());
		this.field3518 = 0;
		this.player = var1;
		this.musicPatches = new NodeHashTable(128);
		this.method6171();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1261452882"
	)
	@Export("setPcmStreamVolume")
	public void setPcmStreamVolume(int var1) {
		synchronized(this.player) {
			this.field3488 = var1;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "6201"
	)
	public int method6150() {
		return this.field3488;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lmu;Lof;Lbc;I)Z",
		garbageValue = "1123969906"
	)
	public boolean method6151(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		synchronized(this.player) {
			boolean var5 = true;
			synchronized(this.priorityQueue) {
				this.priorityQueue.clear();
			}

			for (class334 var6 = (class334)var1.field3563.first(); var6 != null; var6 = (class334)var1.field3563.next()) {
				int var14 = (int)var6.key;
				MusicPatch var8 = (MusicPatch)this.musicPatches.get((long)var14);
				if (var8 == null) {
					byte[] var10 = var2.takeFileFlat(var14);
					MusicPatch var9;
					if (var10 == null) {
						var9 = null;
					} else {
						var9 = new MusicPatch(var10);
					}

					var8 = var9;
					if (var9 == null) {
						var5 = false;
						continue;
					}

					this.musicPatches.put(var9, (long)var14);
				}

				if (!var8.method6328(var3, var6.field3606)) {
					var5 = false;
				} else if (this.priorityQueue != null) {
					synchronized(this.priorityQueue) {
						Iterator var18 = var8.field3545.iterator();

						while (var18.hasNext()) {
							class53 var11 = (class53)var18.next();
							this.priorityQueue.add(new class325(var6.field3604, var11));
						}
					}
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	public void method6152() {
		if (this.priorityQueue != null) {
			if (field3511 != null) {
				field3511.set(true);
			}

			field3511 = new AtomicBoolean(false);
			AtomicBoolean var1 = field3511;
			if (field3517 == null) {
				int var2 = Runtime.getRuntime().availableProcessors();
				field3517 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class324(this));
			}

			field3517.submit(new class328(this, var1));
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-77"
	)
	public void method6153() {
		synchronized(this.player) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.method6327();
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("az")
	protected int vmethod6346() {
		return 0;
	}

	@ObfuscatedName("ao")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3495 * -727379968 / PcmPlayer.field295;

			do {
				long var5 = this.field3498 + (long)var4 * (long)var3;
				if (this.field3512 - var5 >= 0L) {
					this.field3498 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3512 - this.field3498) - 1L) / (long)var4);
				this.field3498 += (long)var4 * (long)var7;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method6188();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-73"
	)
	public void method6202() {
		synchronized(this.player) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.remove();
			}

		}
	}

	@ObfuscatedName("ak")
	@Export("skip")
	protected void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3495 * -727379968 / PcmPlayer.field295;

			do {
				long var3 = (long)var2 * (long)var1 + this.field3498;
				if (this.field3512 - var3 >= 0L) {
					this.field3498 = var3;
					break;
				}

				int var5 = (int)((this.field3512 - this.field3498 + (long)var2 - 1L) / (long)var2);
				this.field3498 += (long)var5 * (long)var2;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method6188();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lmu;ZI)V",
		garbageValue = "-127379304"
	)
	@Export("setMusicTrack")
	public void setMusicTrack(MusicTrack var1, boolean var2) {
		synchronized(this.player) {
			this.clear();
			this.midiFile.parse(var1.midi);
			this.field3508 = var2;
			this.field3498 = 0L;
			int var4 = this.midiFile.trackCount();

			for (int var5 = 0; var5 < var4; ++var5) {
				this.midiFile.gotoTrack(var5);
				this.midiFile.readTrackLength(var5);
				this.midiFile.markTrackPosition(var5);
			}

			this.track = this.midiFile.getPrioritizedTrack();
			this.trackLength = this.midiFile.trackLengths[this.track];
			this.field3512 = this.midiFile.method6323(this.trackLength);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	@Export("clear")
	public void clear() {
		synchronized(this.player) {
			this.midiFile.clear();
			this.method6171();
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-112"
	)
	@Export("isReady")
	public boolean isReady() {
		synchronized(this.player) {
			return this.midiFile.isReady();
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "102"
	)
	public boolean method6229() {
		synchronized(this.player) {
			return this.musicPatches.method9165() > 0;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "5"
	)
	public void method6230(int var1, int var2) {
		synchronized(this.player) {
			this.method6160(var1, var2);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1765229247"
	)
	void method6160(int var1, int var2) {
		this.field3493[var1] = var2;
		this.field3503[var1] = var2 & -128;
		this.method6161(var1, var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-79"
	)
	void method6161(int var1, int var2) {
		if (var2 != this.field3494[var1]) {
			this.field3494[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3506[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-124"
	)
	void method6162(int var1, int var2, int var3) {
		this.method6164(var1, var2, 64);
		if ((this.field3499[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field3576 == var1 && var4.field3578 < 0) {
					this.field3505[var1][var4.field3569] = null;
					this.field3505[var1][var2] = var4;
					int var8 = (var4.field3573 * var4.field3574 >> 12) + var4.field3581;
					var4.field3581 += var2 - var4.field3569 << 8;
					var4.field3573 = var8 - var4.field3581;
					var4.field3574 = 4096;
					var4.field3569 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3494[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var5 = var9.rawSounds[var2].method1067();
				if (var5 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field3576 = var1;
					var6.table = var9;
					var6.rawSound = var5;
					var6.field3567 = var9.field3552[var2];
					var6.field3572 = var9.field3554[var2];
					var6.field3569 = var2;
					var6.field3570 = var3 * var3 * var9.field3549[var2] * var9.field3551 + 1024 >> 11;
					var6.field3580 = var9.field3550[var2] & 255;
					var6.field3581 = (var2 << 8) - (var9.field3548[var2] & 32767);
					var6.field3571 = 0;
					var6.field3582 = 0;
					var6.field3577 = 0;
					var6.field3578 = -1;
					var6.field3579 = 0;
					if (this.field3497[var1] == 0) {
						var6.stream = RawPcmStream.method846(var5, this.method6176(var6), this.method6177(var6), this.method6178(var6));
					} else {
						var6.stream = RawPcmStream.method846(var5, this.method6176(var6), 0, this.method6178(var6));
						this.method6163(var6, var9.field3548[var2] < 0);
					}

					if (var9.field3548[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3572 >= 0) {
						MusicPatchNode var7 = this.field3506[var1][var6.field3572];
						if (var7 != null && var7.field3578 < 0) {
							this.field3505[var1][var7.field3569] = null;
							var7.field3578 = 0;
						}

						this.field3506[var1][var6.field3572] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field3505[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lmw;ZI)V",
		garbageValue = "-1050214773"
	)
	void method6163(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field266) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)this.field3497[var1.field3576] * (long)var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method855();
			}
		} else {
			var4 = (int)((long)this.field3497[var1.field3576] * (long)var3 >> 6);
		}

		var1.stream.method889(var4);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-146148879"
	)
	void method6164(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3505[var1][var2];
		if (var4 != null) {
			this.field3505[var1][var2] = null;
			if ((this.field3499[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var5.field3576 == var4.field3576 && var5.field3578 < 0 && var4 != var5) {
						var4.field3578 = 0;
						break;
					}
				}
			} else {
				var4.field3578 = 0;
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "1"
	)
	void method6154(int var1, int var2, int var3) {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "12"
	)
	void method6209(int var1, int var2) {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1772179237"
	)
	void method6167(int var1, int var2) {
		this.field3496[var1] = var2;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "80"
	)
	void method6168(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field3576 == var1) {
				if (var2.stream != null) {
					var2.stream.method951(PcmPlayer.field295 / 100);
					if (var2.stream.method849()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6378();
				}

				if (var2.field3578 < 0) {
					this.field3505[var2.field3576][var2.field3569] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-181524970"
	)
	void method6226(int var1) {
		if (var1 >= 0) {
			this.field3490[var1] = 12800;
			this.field3491[var1] = 8192;
			this.field3514[var1] = 16383;
			this.field3496[var1] = 8192;
			this.field3502[var1] = 0;
			this.field3492[var1] = 8192;
			this.method6172(var1);
			this.method6186(var1);
			this.field3499[var1] = 0;
			this.field3500[var1] = 32767;
			this.field3501[var1] = 256;
			this.field3497[var1] = 0;
			this.method6173(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method6226(var1);
			}

		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1332909523"
	)
	void method6248(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field3576 == var1) && var2.field3578 < 0) {
				this.field3505[var2.field3576][var2.field3569] = null;
				var2.field3578 = 0;
			}
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method6171() {
		this.method6168(-1);
		this.method6226(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3494[var1] = this.field3493[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3503[var1] = this.field3493[var1] & -128;
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2105906400"
	)
	void method6172(int var1) {
		if ((this.field3499[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3576 == var1 && this.field3505[var1][var2.field3569] == null && var2.field3578 < 0) {
					var2.field3578 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1575578518"
	)
	void method6186(int var1) {
		if ((this.field3499[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3576 == var1) {
					var2.field3584 = 0;
				}
			}
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-97"
	)
	void method6241(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6164(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method6162(var3, var4, var5);
			} else {
				this.method6164(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6154(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3503[var3] = (var5 << 14) + (this.field3503[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3503[var3] = (var5 << 7) + (this.field3503[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3502[var3] = (var5 << 7) + (this.field3502[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3502[var3] = var5 + (this.field3502[var3] & -128);
			}

			if (var4 == 5) {
				this.field3492[var3] = (var5 << 7) + (this.field3492[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3492[var3] = var5 + (this.field3492[var3] & -128);
			}

			if (var4 == 7) {
				this.field3490[var3] = (var5 << 7) + (this.field3490[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3490[var3] = var5 + (this.field3490[var3] & -128);
			}

			if (var4 == 10) {
				this.field3491[var3] = (var5 << 7) + (this.field3491[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3491[var3] = var5 + (this.field3491[var3] & -128);
			}

			if (var4 == 11) {
				this.field3514[var3] = (var5 << 7) + (this.field3514[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3514[var3] = var5 + (this.field3514[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3499;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3499;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3499;
					var10000[var3] |= 2;
				} else {
					this.method6172(var3);
					var10000 = this.field3499;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3500[var3] = (var5 << 7) + (this.field3500[var3] & 127);
			}

			if (var4 == 98) {
				this.field3500[var3] = (this.field3500[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3500[var3] = (var5 << 7) + (this.field3500[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3500[var3] = (this.field3500[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method6168(var3);
			}

			if (var4 == 121) {
				this.method6226(var3);
			}

			if (var4 == 123) {
				this.method6248(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3500[var3];
				if (var6 == 16384) {
					this.field3501[var3] = (var5 << 7) + (this.field3501[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3500[var3];
				if (var6 == 16384) {
					this.field3501[var3] = var5 + (this.field3501[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3497[var3] = (var5 << 7) + (this.field3497[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3497[var3] = var5 + (this.field3497[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3499;
					var10000[var3] |= 4;
				} else {
					this.method6186(var3);
					var10000 = this.field3499;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method6173(var3, (var5 << 7) + (this.field3504[var3] & -16257));
			}

			if (var4 == 49) {
				this.method6173(var3, var5 + (this.field3504[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6161(var3, var4 + this.field3503[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6209(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method6167(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method6171();
			}
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1812753781"
	)
	void method6173(int var1, int var2) {
		this.field3504[var1] = var2;
		this.field3516[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)I",
		garbageValue = "26734457"
	)
	int method6176(MusicPatchNode var1) {
		int var2 = (var1.field3573 * var1.field3574 >> 12) + var1.field3581;
		var2 += (this.field3496[var1.field3576] - 8192) * this.field3501[var1.field3576] >> 12;
		MusicPatchNode2 var3 = var1.field3567;
		int var4;
		if (var3.field3472 > 0 && (var3.field3471 > 0 || this.field3502[var1.field3576] > 0)) {
			var4 = var3.field3471 << 2;
			int var5 = var3.field3473 << 1;
			if (var1.field3586 < var5) {
				var4 = var4 * var1.field3586 / var5;
			}

			var4 += this.field3502[var1.field3576] >> 7;
			double var6 = Math.sin((double)(var1.field3565 & 511) * 0.01227184630308513D);
			var2 += (int)(var6 * (double)var4);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)PcmPlayer.field295 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)I",
		garbageValue = "1785127689"
	)
	int method6177(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3567;
		int var3 = this.field3490[var1.field3576] * this.field3514[var1.field3576] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3570 + 16384 >> 15;
		var3 = var3 * this.field3488 + 128 >> 8;
		if (var2.field3465 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3465 * 1.953125E-5D * (double)var1.field3571) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3467 != null) {
			var4 = var1.field3582;
			var5 = var2.field3467[var1.field3577 * 4 + 1];
			if (var1.field3577 * 4 < var2.field3467.length - 2) {
				var6 = (var2.field3467[var1.field3577 * 4] & 255) << 8;
				var7 = (var2.field3467[var1.field3577 * 4 + 2] & 255) << 8;
				var5 += (var2.field3467[var1.field3577 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		if (var1.field3578 > 0 && var2.field3466 != null) {
			var4 = var1.field3578;
			var5 = var2.field3466[var1.field3579 * 4 + 1];
			if (var1.field3579 * 4 < var2.field3466.length - 2) {
				var6 = (var2.field3466[var1.field3579 * 4] & 255) << 8;
				var7 = (var2.field3466[var1.field3579 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3466[var1.field3579 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)I",
		garbageValue = "169543047"
	)
	int method6178(MusicPatchNode var1) {
		int var2 = this.field3491[var1.field3576];
		return var2 < 8192 ? var2 * var1.field3580 + 32 >> 6 : 16384 - ((128 - var1.field3580) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-21270581"
	)
	void method6188() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3512; var2 == this.trackLength; var3 = this.midiFile.method6323(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3508 || var2 == 0) {
							this.method6171();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method6241(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3512 = var3;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lmw;B)Z",
		garbageValue = "4"
	)
	boolean method6180(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3578 >= 0) {
				var1.remove();
				if (var1.field3572 > 0 && var1 == this.field3506[var1.field3576][var1.field3572]) {
					this.field3506[var1.field3576][var1.field3572] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Lmw;[IIIB)Z",
		garbageValue = "46"
	)
	boolean method6219(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3583 = PcmPlayer.field295 / 100;
		if (var1.field3578 < 0 || var1.stream != null && !var1.stream.method979()) {
			int var5 = var1.field3574;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3492[var1.field3576] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3574 = var5;
			}

			var1.stream.method954(this.method6176(var1));
			MusicPatchNode2 var6 = var1.field3567;
			boolean var7 = false;
			++var1.field3586;
			var1.field3565 += var6.field3472;
			double var8 = (double)((var1.field3569 - 60 << 8) + (var1.field3574 * var1.field3573 >> 12)) * 5.086263020833333E-6D;
			if (var6.field3465 > 0) {
				if (var6.field3470 > 0) {
					var1.field3571 = var1.field3571 * 240926720 + (int)(128.0D * Math.pow(2.0D, (double)var6.field3470 * var8) + 0.5D) * 240926720;
				} else {
					var1.field3571 = var1.field3571 * 240926720 + 773849088;
				}
			}

			if (var6.field3467 != null) {
				if (var6.field3468 > 0) {
					var1.field3582 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3468) + 0.5D);
				} else {
					var1.field3582 += 128;
				}

				while (var1.field3577 * 4 < var6.field3467.length - 2 && var1.field3582 > (var6.field3467[var1.field3577 * 4 + 2] & 255) << 8) {
					var1.field3577 = var1.field3577 * 4 + 2;
				}

				if (var1.field3577 * 4 == var6.field3467.length - 2 && var6.field3467[var1.field3577 * 4 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field3578 >= 0 && var6.field3466 != null && (this.field3499[var1.field3576] & 1) == 0 && (var1.field3572 < 0 || var1 != this.field3506[var1.field3576][var1.field3572])) {
				if (var6.field3469 > 0) {
					var1.field3578 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3469) + 0.5D);
				} else {
					var1.field3578 += 128;
				}

				while (var1.field3579 * 4 < var6.field3466.length - 2 && var1.field3578 > (var6.field3466[var1.field3579 * 4 + 2] & 255) << 8) {
					var1.field3579 = var1.field3579 * 4 + 2;
				}

				if (var1.field3579 * 4 == var6.field3466.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method951(var1.field3583);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method849()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6378();
				if (var1.field3578 >= 0) {
					var1.remove();
					if (var1.field3572 > 0 && var1 == this.field3506[var1.field3576][var1.field3572]) {
						this.field3506[var1.field3576][var1.field3572] = null;
					}
				}

				return true;
			} else {
				var1.stream.method858(var1.field3583, this.method6177(var1), this.method6178(var1));
				return false;
			}
		} else {
			var1.method6378();
			var1.remove();
			if (var1.field3572 > 0 && var1 == this.field3506[var1.field3576][var1.field3572]) {
				this.field3506[var1.field3576][var1.field3572] = null;
			}

			return true;
		}
	}
}
