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

@ObfuscatedName("mx")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("bh")
	static AtomicBoolean field3519;
	@ObfuscatedName("bs")
	static ThreadPoolExecutor field3528;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1232505159
	)
	int field3505;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1920608576
	)
	int field3506;
	@ObfuscatedName("at")
	int[] field3520;
	@ObfuscatedName("an")
	int[] field3508;
	@ObfuscatedName("ao")
	int[] field3517;
	@ObfuscatedName("ab")
	int[] field3510;
	@ObfuscatedName("aw")
	int[] field3511;
	@ObfuscatedName("ad")
	int[] field3512;
	@ObfuscatedName("al")
	int[] field3535;
	@ObfuscatedName("as")
	int[] field3514;
	@ObfuscatedName("ag")
	int[] field3531;
	@ObfuscatedName("av")
	int[] field3516;
	@ObfuscatedName("aa")
	int[] field3533;
	@ObfuscatedName("aq")
	int[] field3518;
	@ObfuscatedName("am")
	int[] field3507;
	@ObfuscatedName("ac")
	int[] field3513;
	@ObfuscatedName("ae")
	int[] field3521;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[[Lme;"
	)
	MusicPatchNode[][] field3522;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "[[Lme;"
	)
	MusicPatchNode[][] field3523;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bc")
	boolean field3525;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 806727885
	)
	@Export("track")
	int track;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1400628395
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		longValue = 5342612596381340661L
	)
	long field3509;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		longValue = -7189705389303690993L
	)
	long field3529;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("player")
	PcmPlayer player;
	@ObfuscatedName("bl")
	@Export("priorityQueue")
	PriorityQueue priorityQueue;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1531536061
	)
	public int field3534;

	static {
		field3519 = null;
		field3528 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lby;)V"
	)
	public MidiPcmStream(PcmPlayer var1) {
		this.field3505 = 256;
		this.field3506 = -727379968;
		this.field3520 = new int[16];
		this.field3508 = new int[16];
		this.field3517 = new int[16];
		this.field3510 = new int[16];
		this.field3511 = new int[16];
		this.field3512 = new int[16];
		this.field3535 = new int[16];
		this.field3514 = new int[16];
		this.field3531 = new int[16];
		this.field3516 = new int[16];
		this.field3533 = new int[16];
		this.field3518 = new int[16];
		this.field3507 = new int[16];
		this.field3513 = new int[16];
		this.field3521 = new int[16];
		this.field3522 = new MusicPatchNode[16][128];
		this.field3523 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.player = null;
		this.priorityQueue = new PriorityQueue(5, new class332());
		this.field3534 = 0;
		this.player = var1;
		this.musicPatches = new NodeHashTable(128);
		this.method6020();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1707051618"
	)
	@Export("setPcmStreamVolume")
	public void setPcmStreamVolume(int var1) {
		synchronized(this.player) {
			this.field3505 = var1;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1748103113"
	)
	public int method6000() {
		return this.field3505;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lmr;Loc;Lbq;B)Z",
		garbageValue = "71"
	)
	public boolean method6085(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		synchronized(this.player) {
			boolean var5 = true;
			synchronized(this.priorityQueue) {
				this.priorityQueue.clear();
			}

			for (class334 var6 = (class334)var1.field3574.first(); var6 != null; var6 = (class334)var1.field3574.next()) {
				int var14 = (int)var6.key;
				MusicPatch var8 = (MusicPatch)this.musicPatches.get((long)var14);
				if (var8 == null) {
					var8 = HealthBarDefinition.method3813(var2, var14);
					if (var8 == null) {
						var5 = false;
						continue;
					}

					this.musicPatches.put(var8, (long)var14);
				}

				if (!var8.method6186(var3, var6.field3618)) {
					var5 = false;
				} else if (this.priorityQueue != null) {
					synchronized(this.priorityQueue) {
						Iterator var10 = var8.field3560.iterator();

						while (var10.hasNext()) {
							class53 var11 = (class53)var10.next();
							this.priorityQueue.add(new class325(var6.field3622, var11));
						}
					}
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-435435149"
	)
	public void method6002() {
		if (this.priorityQueue != null) {
			if (field3519 != null) {
				field3519.set(true);
			}

			field3519 = new AtomicBoolean(false);
			AtomicBoolean var1 = field3519;
			if (field3528 == null) {
				int var2 = Runtime.getRuntime().availableProcessors();
				field3528 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class324(this));
			}

			field3528.submit(new class328(this, var1));
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1799863503"
	)
	public void method6093() {
		synchronized(this.player) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.method6179();
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("aw")
	protected int vmethod6214() {
		return 0;
	}

	@ObfuscatedName("ad")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3506 * 1000000 / (class472.field4892 * 722468864);

			do {
				long var5 = (long)var3 * (long)var4 + this.field3509;
				if (this.field3529 - var5 >= 0L) {
					this.field3509 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3529 - this.field3509) - 1L) / (long)var4);
				this.field3509 += (long)var4 * (long)var7;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method6034();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method6004() {
		synchronized(this.player) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.remove();
			}

		}
	}

	@ObfuscatedName("as")
	@Export("skip")
	protected void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3506 * 1000000 / (class472.field4892 * 722468864);

			do {
				long var3 = (long)var2 * (long)var1 + this.field3509;
				if (this.field3529 - var3 >= 0L) {
					this.field3509 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3529 - this.field3509) - 1L) / (long)var2);
				this.field3509 += (long)var5 * (long)var2;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method6034();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lmr;ZI)V",
		garbageValue = "-1881676391"
	)
	@Export("setMusicTrack")
	public void setMusicTrack(MusicTrack var1, boolean var2) {
		synchronized(this.player) {
			this.clear();
			this.midiFile.parse(var1.midi);
			this.field3525 = var2;
			this.field3509 = 0L;
			int var4 = this.midiFile.trackCount();

			for (int var5 = 0; var5 < var4; ++var5) {
				this.midiFile.gotoTrack(var5);
				this.midiFile.readTrackLength(var5);
				this.midiFile.markTrackPosition(var5);
			}

			this.track = this.midiFile.getPrioritizedTrack();
			this.trackLength = this.midiFile.trackLengths[this.track];
			this.field3529 = this.midiFile.method6142(this.trackLength);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1568230116"
	)
	@Export("clear")
	public void clear() {
		synchronized(this.player) {
			this.midiFile.clear();
			this.method6020();
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-50"
	)
	@Export("isReady")
	public boolean isReady() {
		synchronized(this.player) {
			return this.midiFile.isReady();
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1230358681"
	)
	public boolean method6113() {
		synchronized(this.player) {
			return this.musicPatches.method8973() > 0;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "324552685"
	)
	public void method6009(int var1, int var2) {
		synchronized(this.player) {
			this.method6010(var1, var2);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1868799263"
	)
	void method6010(int var1, int var2) {
		this.field3510[var1] = var2;
		this.field3512[var1] = var2 & -128;
		this.method6011(var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "245482142"
	)
	void method6011(int var1, int var2) {
		if (var2 != this.field3511[var1]) {
			this.field3511[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3523[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-892706501"
	)
	void method6127(int var1, int var2, int var3) {
		this.method6014(var1, var2, 64);
		if ((this.field3516[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field3590 == var1 && var4.field3582 < 0) {
					this.field3522[var1][var4.field3581] = null;
					this.field3522[var1][var2] = var4;
					int var8 = (var4.field3586 * var4.field3596 >> 12) + var4.field3583;
					var4.field3583 += var2 - var4.field3581 << 8;
					var4.field3596 = var8 - var4.field3583;
					var4.field3586 = 4096;
					var4.field3581 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3511[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var5 = var9.rawSounds[var2].method1044();
				if (var5 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field3590 = var1;
					var6.table = var9;
					var6.rawSound = var5;
					var6.field3579 = var9.field3563[var2];
					var6.field3580 = var9.field3564[var2];
					var6.field3581 = var2;
					var6.field3576 = var3 * var3 * var9.field3561[var2] * var9.field3565 + 1024 >> 11;
					var6.field3589 = var9.field3562[var2] & 255;
					var6.field3583 = (var2 << 8) - (var9.field3557[var2] & 32767);
					var6.field3587 = 0;
					var6.field3588 = 0;
					var6.field3593 = 0;
					var6.field3582 = -1;
					var6.field3584 = 0;
					if (this.field3507[var1] == 0) {
						var6.stream = RawPcmStream.method856(var5, this.method6094(var6), this.method6027(var6), this.method6028(var6));
					} else {
						var6.stream = RawPcmStream.method856(var5, this.method6094(var6), 0, this.method6028(var6));
						this.method6013(var6, var9.field3557[var2] < 0);
					}

					if (var9.field3557[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3580 >= 0) {
						MusicPatchNode var7 = this.field3523[var1][var6.field3580];
						if (var7 != null && var7.field3582 < 0) {
							this.field3522[var1][var7.field3581] = null;
							var7.field3582 = 0;
						}

						this.field3523[var1][var6.field3580] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field3522[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lme;ZI)V",
		garbageValue = "-1782952424"
	)
	void method6013(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field254) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)var5 * (long)this.field3507[var1.field3590] >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method865();
			}
		} else {
			var4 = (int)((long)this.field3507[var1.field3590] * (long)var3 >> 6);
		}

		var1.stream.method899(var4);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-35"
	)
	void method6014(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3522[var1][var2];
		if (var4 != null) {
			this.field3522[var1][var2] = null;
			if ((this.field3516[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var4.field3590 == var5.field3590 && var5.field3582 < 0 && var4 != var5) {
						var4.field3582 = 0;
						break;
					}
				}
			} else {
				var4.field3582 = 0;
			}

		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "32"
	)
	void method6015(int var1, int var2, int var3) {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "41"
	)
	void method6032(int var1, int var2) {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1901244464"
	)
	void method6017(int var1, int var2) {
		this.field3535[var1] = var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-55"
	)
	void method6019(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field3590 == var1) {
				if (var2.stream != null) {
					var2.stream.method862(class472.field4892 * 722468864 / 100);
					if (var2.stream.method873()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6225();
				}

				if (var2.field3582 < 0) {
					this.field3522[var2.field3590][var2.field3581] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "50"
	)
	void method6099(int var1) {
		if (var1 >= 0) {
			this.field3520[var1] = 12800;
			this.field3508[var1] = 8192;
			this.field3517[var1] = 16383;
			this.field3535[var1] = 8192;
			this.field3514[var1] = 0;
			this.field3531[var1] = 8192;
			this.method6022(var1);
			this.method6023(var1);
			this.field3516[var1] = 0;
			this.field3533[var1] = 32767;
			this.field3518[var1] = 256;
			this.field3507[var1] = 0;
			this.method6025(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method6099(var1);
			}

		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-80"
	)
	void method6001(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field3590 == var1) && var2.field3582 < 0) {
				this.field3522[var2.field3590][var2.field3581] = null;
				var2.field3582 = 0;
			}
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-798437721"
	)
	void method6020() {
		this.method6019(-1);
		this.method6099(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3511[var1] = this.field3510[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3512[var1] = this.field3510[var1] & -128;
		}

	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1648662084"
	)
	void method6022(int var1) {
		if ((this.field3516[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3590 == var1 && this.field3522[var1][var2.field3581] == null && var2.field3582 < 0) {
					var2.field3582 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method6023(int var1) {
		if ((this.field3516[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3590 == var1) {
					var2.field3597 = 0;
				}
			}
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1128476609"
	)
	void method6024(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6014(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method6127(var3, var4, var5);
			} else {
				this.method6014(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6015(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3512[var3] = (var5 << 14) + (this.field3512[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3512[var3] = (var5 << 7) + (this.field3512[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3514[var3] = (var5 << 7) + (this.field3514[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3514[var3] = var5 + (this.field3514[var3] & -128);
			}

			if (var4 == 5) {
				this.field3531[var3] = (var5 << 7) + (this.field3531[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3531[var3] = var5 + (this.field3531[var3] & -128);
			}

			if (var4 == 7) {
				this.field3520[var3] = (var5 << 7) + (this.field3520[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3520[var3] = var5 + (this.field3520[var3] & -128);
			}

			if (var4 == 10) {
				this.field3508[var3] = (var5 << 7) + (this.field3508[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3508[var3] = var5 + (this.field3508[var3] & -128);
			}

			if (var4 == 11) {
				this.field3517[var3] = (var5 << 7) + (this.field3517[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3517[var3] = var5 + (this.field3517[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3516;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3516;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3516;
					var10000[var3] |= 2;
				} else {
					this.method6022(var3);
					var10000 = this.field3516;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3533[var3] = (var5 << 7) + (this.field3533[var3] & 127);
			}

			if (var4 == 98) {
				this.field3533[var3] = (this.field3533[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3533[var3] = (var5 << 7) + (this.field3533[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3533[var3] = (this.field3533[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method6019(var3);
			}

			if (var4 == 121) {
				this.method6099(var3);
			}

			if (var4 == 123) {
				this.method6001(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3533[var3];
				if (var6 == 16384) {
					this.field3518[var3] = (var5 << 7) + (this.field3518[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3533[var3];
				if (var6 == 16384) {
					this.field3518[var3] = var5 + (this.field3518[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3507[var3] = (var5 << 7) + (this.field3507[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3507[var3] = var5 + (this.field3507[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3516;
					var10000[var3] |= 4;
				} else {
					this.method6023(var3);
					var10000 = this.field3516;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method6025(var3, (var5 << 7) + (this.field3513[var3] & -16257));
			}

			if (var4 == 49) {
				this.method6025(var3, var5 + (this.field3513[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6011(var3, var4 + this.field3512[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6032(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method6017(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method6020();
			}
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2035548933"
	)
	void method6025(int var1, int var2) {
		this.field3513[var1] = var2;
		this.field3521[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lme;I)I",
		garbageValue = "2025674930"
	)
	int method6094(MusicPatchNode var1) {
		int var2 = (var1.field3586 * var1.field3596 >> 12) + var1.field3583;
		var2 += (this.field3535[var1.field3590] - 8192) * this.field3518[var1.field3590] >> 12;
		MusicPatchNode2 var3 = var1.field3579;
		int var4;
		if (var3.field3485 > 0 && (var3.field3483 > 0 || this.field3514[var1.field3590] > 0)) {
			var4 = var3.field3483 << 2;
			int var5 = var3.field3481 << 1;
			if (var1.field3592 < var5) {
				var4 = var4 * var1.field3592 / var5;
			}

			var4 += this.field3514[var1.field3590] >> 7;
			double var6 = Math.sin((double)(var1.field3595 & 511) * 0.01227184630308513D);
			var2 += (int)((double)var4 * var6);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)(class472.field4892 * 722468864) + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lme;I)I",
		garbageValue = "1315318775"
	)
	int method6027(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3579;
		int var3 = this.field3520[var1.field3590] * this.field3517[var1.field3590] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3576 + 16384 >> 15;
		var3 = var3 * this.field3505 + 128 >> 8;
		if (var2.field3489 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3489 * (double)var1.field3587 * 1.953125E-5D) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3488 != null) {
			var4 = var1.field3588;
			var5 = var2.field3488[var1.field3593 * 4 + 1];
			if (var1.field3593 * 4 < var2.field3488.length - 2) {
				var6 = (var2.field3488[var1.field3593 * 4] & 255) << 8;
				var7 = (var2.field3488[var1.field3593 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3488[var1.field3593 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		if (var1.field3582 > 0 && var2.field3482 != null) {
			var4 = var1.field3582;
			var5 = var2.field3482[var1.field3584 * 2 + 1];
			if (var1.field3584 * 2 < var2.field3482.length - 2) {
				var6 = (var2.field3482[var1.field3584 * 2] & 255) << 8;
				var7 = (var2.field3482[var1.field3584 * 2 + 2] & 255) << 8;
				var5 += (var2.field3482[var1.field3584 * 2 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lme;I)I",
		garbageValue = "-1571379808"
	)
	int method6028(MusicPatchNode var1) {
		int var2 = this.field3508[var1.field3590];
		return var2 < 8192 ? var2 * var1.field3589 + 32 >> 6 : 16384 - ((128 - var1.field3589) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "23791"
	)
	void method6034() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3529; var2 == this.trackLength; var3 = this.midiFile.method6142(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3525 || var2 == 0) {
							this.method6020();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method6024(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3529 = var3;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lme;I)Z",
		garbageValue = "2146565938"
	)
	boolean method6003(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3582 >= 0) {
				var1.remove();
				if (var1.field3580 > 0 && var1 == this.field3523[var1.field3590][var1.field3580]) {
					this.field3523[var1.field3590][var1.field3580] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lme;[IIII)Z",
		garbageValue = "1082346919"
	)
	boolean method6037(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3577 = class472.field4892 * 722468864 / 100;
		if (var1.field3582 < 0 || var1.stream != null && !var1.stream.method853()) {
			int var5 = var1.field3586;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field3531[var1.field3590]) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3586 = var5;
			}

			var1.stream.method896(this.method6094(var1));
			MusicPatchNode2 var6 = var1.field3579;
			boolean var7 = false;
			++var1.field3592;
			var1.field3595 += var6.field3485;
			double var8 = (double)((var1.field3581 - 60 << 8) + (var1.field3586 * var1.field3596 >> 12)) * 5.086263020833333E-6D;
			if (var6.field3489 > 0) {
				if (var6.field3486 > 0) {
					var1.field3587 = var1.field3587 * -1599848448 + (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3486) + 0.5D) * -1599848448;
				} else {
					var1.field3587 = var1.field3587 * -1599848448 + 1377828864;
				}
			}

			if (var6.field3488 != null) {
				if (var6.field3484 > 0) {
					var1.field3588 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3484 * var8) + 0.5D);
				} else {
					var1.field3588 += 128;
				}

				while (var1.field3593 * 4 < var6.field3488.length - 2 && var1.field3588 > (var6.field3488[var1.field3593 * 4 + 2] & 255) << 8) {
					var1.field3593 = var1.field3593 * 4 + 2;
				}

				if (var1.field3593 * 4 == var6.field3488.length - 2 && var6.field3488[var1.field3593 * 4 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field3582 >= 0 && var6.field3482 != null && (this.field3516[var1.field3590] & 1) == 0 && (var1.field3580 < 0 || var1 != this.field3523[var1.field3590][var1.field3580])) {
				if (var6.field3487 > 0) {
					var1.field3582 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3487) + 0.5D);
				} else {
					var1.field3582 += 128;
				}

				while (var1.field3584 * 2 < var6.field3482.length - 2 && var1.field3582 > (var6.field3482[var1.field3584 * 2 + 2] & 255) << 8) {
					var1.field3584 = var1.field3584 * 4 + 4;
				}

				if (var1.field3584 * 2 == var6.field3482.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method862(var1.field3577);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method873()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6225();
				if (var1.field3582 >= 0) {
					var1.remove();
					if (var1.field3580 > 0 && var1 == this.field3523[var1.field3590][var1.field3580]) {
						this.field3523[var1.field3590][var1.field3580] = null;
					}
				}

				return true;
			} else {
				var1.stream.method868(var1.field3577, this.method6027(var1), this.method6028(var1));
				return false;
			}
		} else {
			var1.method6225();
			var1.remove();
			if (var1.field3580 > 0 && var1 == this.field3523[var1.field3590][var1.field3580]) {
				this.field3523[var1.field3590][var1.field3580] = null;
			}

			return true;
		}
	}
}
