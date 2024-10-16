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
	@ObfuscatedName("by")
	static AtomicBoolean field3646;
	@ObfuscatedName("br")
	static ThreadPoolExecutor field3670;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 83352073
	)
	int field3667;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 611643456
	)
	int field3638;
	@ObfuscatedName("aj")
	int[] field3641;
	@ObfuscatedName("ai")
	int[] field3642;
	@ObfuscatedName("ay")
	int[] field3643;
	@ObfuscatedName("as")
	int[] field3644;
	@ObfuscatedName("ae")
	int[] field3671;
	@ObfuscatedName("am")
	int[] field3662;
	@ObfuscatedName("at")
	int[] field3665;
	@ObfuscatedName("au")
	int[] field3648;
	@ObfuscatedName("an")
	int[] field3657;
	@ObfuscatedName("ac")
	int[] field3652;
	@ObfuscatedName("av")
	int[] field3653;
	@ObfuscatedName("ax")
	int[] field3654;
	@ObfuscatedName("aq")
	int[] field3655;
	@ObfuscatedName("al")
	int[] field3649;
	@ObfuscatedName("aa")
	int[] field3650;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[[Lnx;"
	)
	MusicPatchNode[][] field3658;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "[[Lnx;"
	)
	MusicPatchNode[][] field3659;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bv")
	boolean field3661;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1467519319
	)
	@Export("track")
	int track;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -2049237699
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		longValue = -6156239428887658301L
	)
	long field3664;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		longValue = 3261477869149819139L
	)
	long field3656;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("player")
	PcmPlayer player;
	@ObfuscatedName("bc")
	@Export("priorityQueue")
	PriorityQueue priorityQueue;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1630423797
	)
	public int field3647;

	static {
		field3646 = null;
		field3670 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lbm;)V"
	)
	public MidiPcmStream(PcmPlayer var1) {
		this.field3667 = 256;
		this.field3638 = -727379968;
		this.field3641 = new int[16];
		this.field3642 = new int[16];
		this.field3643 = new int[16];
		this.field3644 = new int[16];
		this.field3671 = new int[16];
		this.field3662 = new int[16];
		this.field3665 = new int[16];
		this.field3648 = new int[16];
		this.field3657 = new int[16];
		this.field3652 = new int[16];
		this.field3653 = new int[16];
		this.field3654 = new int[16];
		this.field3655 = new int[16];
		this.field3649 = new int[16];
		this.field3650 = new int[16];
		this.field3658 = new MusicPatchNode[16][128];
		this.field3659 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.player = null;
		this.priorityQueue = new PriorityQueue(5, new class344());
		this.field3647 = 0;
		this.player = var1;
		this.musicPatches = new NodeHashTable(128);
		this.method6623();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-27357"
	)
	@Export("setPcmStreamVolume")
	public void setPcmStreamVolume(int var1) {
		synchronized(this.player) {
			this.field3667 = var1;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "310552653"
	)
	public int method6602() {
		return this.field3667;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnv;Lpe;Lba;I)Z",
		garbageValue = "-619528733"
	)
	@Export("updateExternalPlayer")
	public boolean updateExternalPlayer(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		synchronized(this.player) {
			boolean var5 = true;
			synchronized(this.priorityQueue) {
				this.priorityQueue.clear();
			}

			for (class346 var6 = (class346)var1.field3719.first(); var6 != null; var6 = (class346)var1.field3719.next()) {
				int var14 = (int)var6.key;
				MusicPatch var8 = (MusicPatch)this.musicPatches.get((long)var14);
				if (var8 == null) {
					var8 = class274.method5779(var2, var14);
					if (var8 == null) {
						var5 = false;
						continue;
					}

					this.musicPatches.put(var8, (long)var14);
				}

				if (!var8.method6773(var3, var6.field3761)) {
					var5 = false;
				} else if (this.priorityQueue != null) {
					synchronized(this.priorityQueue) {
						Iterator var10 = var8.field3703.iterator();

						while (var10.hasNext()) {
							class53 var11 = (class53)var10.next();
							this.priorityQueue.add(new class337(var6.field3763, var11));
						}
					}
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	public void method6604() {
		if (this.priorityQueue != null) {
			if (field3646 != null) {
				field3646.set(true);
			}

			field3646 = new AtomicBoolean(false);
			AtomicBoolean var1 = field3646;
			if (field3670 == null) {
				int var2 = Runtime.getRuntime().availableProcessors();
				field3670 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class336(this));
			}

			field3670.submit(new class340(this, var1));
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method6605() {
		synchronized(this.player) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.method6774();
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Lbg;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Lbg;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("ae")
	protected int vmethod6791() {
		return 0;
	}

	@ObfuscatedName("am")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3638 * 1000000 / (ArchiveLoader.field1059 * -336955471);

			do {
				long var5 = this.field3664 + (long)var3 * (long)var4;
				if (this.field3656 - var5 >= 0L) {
					this.field3664 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3656 - this.field3664) - 1L) / (long)var4);
				this.field3664 += (long)var4 * (long)var7;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method6619();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1669929059"
	)
	public void method6606() {
		synchronized(this.player) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.remove();
			}

		}
	}

	@ObfuscatedName("au")
	@Export("skip")
	protected void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3638 * 1000000 / (ArchiveLoader.field1059 * -336955471);

			do {
				long var3 = this.field3664 + (long)var2 * (long)var1;
				if (this.field3656 - var3 >= 0L) {
					this.field3664 = var3;
					break;
				}

				int var5 = (int)((this.field3656 - this.field3664 + (long)var2 - 1L) / (long)var2);
				this.field3664 += (long)var2 * (long)var5;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method6619();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnv;ZI)V",
		garbageValue = "-1356460749"
	)
	@Export("setMusicTrack")
	public void setMusicTrack(MusicTrack var1, boolean var2) {
		synchronized(this.player) {
			this.clear();
			this.midiFile.parse(var1.midi);
			this.field3661 = var2;
			this.field3664 = 0L;
			int var4 = this.midiFile.trackCount();

			for (int var5 = 0; var5 < var4; ++var5) {
				this.midiFile.gotoTrack(var5);
				this.midiFile.readTrackLength(var5);
				this.midiFile.markTrackPosition(var5);
			}

			this.track = this.midiFile.getPrioritizedTrack();
			this.trackLength = this.midiFile.trackLengths[this.track];
			this.field3656 = this.midiFile.method6726(this.trackLength);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2072897361"
	)
	@Export("clear")
	public void clear() {
		synchronized(this.player) {
			this.midiFile.clear();
			this.method6623();
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-58169751"
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
		garbageValue = "2093251940"
	)
	public boolean method6615() {
		synchronized(this.player) {
			return this.musicPatches.method9784() > 0;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2030320918"
	)
	public void method6611(int var1, int var2) {
		synchronized(this.player) {
			this.method6723(var1, var2);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1898445767"
	)
	void method6723(int var1, int var2) {
		this.field3644[var1] = var2;
		this.field3662[var1] = var2 & -128;
		this.method6688(var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1475650366"
	)
	void method6688(int var1, int var2) {
		if (var2 != this.field3671[var1]) {
			this.field3671[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3659[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2071266374"
	)
	void method6614(int var1, int var2, int var3) {
		this.method6694(var1, var2, 64);
		if ((this.field3652[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field3735 == var1 && var4.field3731 < 0) {
					this.field3658[var1][var4.field3725] = null;
					this.field3658[var1][var2] = var4;
					int var8 = (var4.field3739 * var4.field3730 >> 12) + var4.field3720;
					var4.field3720 += var2 - var4.field3725 << 8;
					var4.field3739 = var8 - var4.field3720;
					var4.field3730 = 4096;
					var4.field3725 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3671[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var5 = var9.rawSounds[var2].method1123();
				if (var5 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field3735 = var1;
					var6.table = var9;
					var6.rawSound = var5;
					var6.field3723 = var9.field3701[var2];
					var6.field3732 = var9.field3702[var2];
					var6.field3725 = var2;
					var6.field3726 = var3 * var3 * var9.field3699[var2] * var9.field3697 + 1024 >> 11;
					var6.field3727 = var9.field3700[var2] & 255;
					var6.field3720 = (var2 << 8) - (var9.field3698[var2] & 32767);
					var6.field3728 = 0;
					var6.field3737 = 0;
					var6.field3733 = 0;
					var6.field3731 = -1;
					var6.field3724 = 0;
					if (this.field3655[var1] == 0) {
						var6.stream = RawPcmStream.method901(var5, this.method6628(var6), this.method6629(var6), this.method6672(var6));
					} else {
						var6.stream = RawPcmStream.method901(var5, this.method6628(var6), 0, this.method6672(var6));
						this.method6691(var6, var9.field3698[var2] < 0);
					}

					if (var9.field3698[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3732 >= 0) {
						MusicPatchNode var7 = this.field3659[var1][var6.field3732];
						if (var7 != null && var7.field3731 < 0) {
							this.field3658[var1][var7.field3725] = null;
							var7.field3731 = 0;
						}

						this.field3659[var1][var6.field3732] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field3658[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lnx;ZI)V",
		garbageValue = "-533416364"
	)
	void method6691(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field240) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)this.field3655[var1.field3735] * (long)var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method1049();
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3655[var1.field3735] >> 6);
		}

		var1.stream.method915(var4);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-519596745"
	)
	void method6694(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3658[var1][var2];
		if (var4 != null) {
			this.field3658[var1][var2] = null;
			if ((this.field3652[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var5.field3735 == var4.field3735 && var5.field3731 < 0 && var5 != var4) {
						var4.field3731 = 0;
						break;
					}
				}
			} else {
				var4.field3731 = 0;
			}

		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "684495753"
	)
	void method6617(int var1, int var2, int var3) {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "236"
	)
	void method6618(int var1, int var2) {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "690438202"
	)
	void method6714(int var1, int var2) {
		this.field3665[var1] = var2;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1730903437"
	)
	void method6620(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field3735 == var1) {
				if (var2.stream != null) {
					var2.stream.method1040(ArchiveLoader.field1059 * -336955471 / 100);
					if (var2.stream.method918()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6816();
				}

				if (var2.field3731 < 0) {
					this.field3658[var2.field3735][var2.field3725] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1707744212"
	)
	void method6621(int var1) {
		if (var1 >= 0) {
			this.field3641[var1] = 12800;
			this.field3642[var1] = 8192;
			this.field3643[var1] = 16383;
			this.field3665[var1] = 8192;
			this.field3648[var1] = 0;
			this.field3657[var1] = 8192;
			this.method6624(var1);
			this.method6679(var1);
			this.field3652[var1] = 0;
			this.field3653[var1] = 32767;
			this.field3654[var1] = 256;
			this.field3655[var1] = 0;
			this.method6627(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method6621(var1);
			}

		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1883690382"
	)
	void method6682(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field3735 == var1) && var2.field3731 < 0) {
				this.field3658[var2.field3735][var2.field3725] = null;
				var2.field3731 = 0;
			}
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1554633082"
	)
	void method6623() {
		this.method6620(-1);
		this.method6621(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3671[var1] = this.field3644[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3662[var1] = this.field3644[var1] & -128;
		}

	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-15"
	)
	void method6624(int var1) {
		if ((this.field3652[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3735 == var1 && this.field3658[var1][var2.field3725] == null && var2.field3731 < 0) {
					var2.field3731 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1561583095"
	)
	void method6679(int var1) {
		if ((this.field3652[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3735 == var1) {
					var2.field3740 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1270663531"
	)
	void method6626(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6694(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method6614(var3, var4, var5);
			} else {
				this.method6694(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6617(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3662[var3] = (var5 << 14) + (this.field3662[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3662[var3] = (var5 << 7) + (this.field3662[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3648[var3] = (var5 << 7) + (this.field3648[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3648[var3] = var5 + (this.field3648[var3] & -128);
			}

			if (var4 == 5) {
				this.field3657[var3] = (var5 << 7) + (this.field3657[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3657[var3] = var5 + (this.field3657[var3] & -128);
			}

			if (var4 == 7) {
				this.field3641[var3] = (var5 << 7) + (this.field3641[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3641[var3] = var5 + (this.field3641[var3] & -128);
			}

			if (var4 == 10) {
				this.field3642[var3] = (var5 << 7) + (this.field3642[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3642[var3] = var5 + (this.field3642[var3] & -128);
			}

			if (var4 == 11) {
				this.field3643[var3] = (var5 << 7) + (this.field3643[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3643[var3] = var5 + (this.field3643[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3652;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3652;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3652;
					var10000[var3] |= 2;
				} else {
					this.method6624(var3);
					var10000 = this.field3652;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3653[var3] = (var5 << 7) + (this.field3653[var3] & 127);
			}

			if (var4 == 98) {
				this.field3653[var3] = (this.field3653[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3653[var3] = (var5 << 7) + (this.field3653[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3653[var3] = (this.field3653[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method6620(var3);
			}

			if (var4 == 121) {
				this.method6621(var3);
			}

			if (var4 == 123) {
				this.method6682(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3653[var3];
				if (var6 == 16384) {
					this.field3654[var3] = (var5 << 7) + (this.field3654[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3653[var3];
				if (var6 == 16384) {
					this.field3654[var3] = var5 + (this.field3654[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3655[var3] = (var5 << 7) + (this.field3655[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3655[var3] = var5 + (this.field3655[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3652;
					var10000[var3] |= 4;
				} else {
					this.method6679(var3);
					var10000 = this.field3652;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method6627(var3, (var5 << 7) + (this.field3649[var3] & -16257));
			}

			if (var4 == 49) {
				this.method6627(var3, var5 + (this.field3649[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6688(var3, var4 + this.field3662[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6618(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method6714(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method6623();
			}
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "126708469"
	)
	void method6627(int var1, int var2) {
		this.field3649[var1] = var2;
		this.field3650[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)I",
		garbageValue = "660763607"
	)
	int method6628(MusicPatchNode var1) {
		int var2 = (var1.field3739 * var1.field3730 >> 12) + var1.field3720;
		var2 += (this.field3665[var1.field3735] - 8192) * this.field3654[var1.field3735] >> 12;
		MusicPatchNode2 var3 = var1.field3723;
		int var4;
		if (var3.field3618 > 0 && (var3.field3617 > 0 || this.field3648[var1.field3735] > 0)) {
			var4 = var3.field3617 << 2;
			int var5 = var3.field3619 << 1;
			if (var1.field3736 < var5) {
				var4 = var4 * var1.field3736 / var5;
			}

			var4 += this.field3648[var1.field3735] >> 7;
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field3729 & 511));
			var2 += (int)((double)var4 * var6);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)(ArchiveLoader.field1059 * -336955471) + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)I",
		garbageValue = "24865926"
	)
	int method6629(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3723;
		int var3 = this.field3643[var1.field3735] * this.field3641[var1.field3735] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3726 + 16384 >> 15;
		var3 = var3 * this.field3667 + 128 >> 8;
		if (var2.field3611 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, 1.953125E-5D * (double)var1.field3728 * (double)var2.field3611) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3612 != null) {
			var4 = var1.field3737;
			var5 = var2.field3612[var1.field3733 * 4 + 1];
			if (var1.field3733 * 4 < var2.field3612.length - 2) {
				var6 = (var2.field3612[var1.field3733 * 4] & 255) << 8;
				var7 = (var2.field3612[var1.field3733 * 4 + 2] & 255) << 8;
				var5 += (var2.field3612[var1.field3733 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		if (var1.field3731 > 0 && var2.field3613 != null) {
			var4 = var1.field3731;
			var5 = var2.field3613[var1.field3724 * 4 + 1];
			if (var1.field3724 * 4 < var2.field3613.length - 2) {
				var6 = (var2.field3613[var1.field3724 * 4] & 255) << 8;
				var7 = (var2.field3613[var1.field3724 * 4 + 2] & 255) << 8;
				var5 += (var2.field3613[var1.field3724 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)I",
		garbageValue = "1887173733"
	)
	int method6672(MusicPatchNode var1) {
		int var2 = this.field3642[var1.field3735];
		return var2 < 8192 ? var2 * var1.field3727 + 32 >> 6 : 16384 - ((128 - var1.field3727) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-19"
	)
	void method6619() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3656; var2 == this.trackLength; var3 = this.midiFile.method6726(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3661 || var2 == 0) {
							this.method6623();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method6626(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3656 = var3;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)Z",
		garbageValue = "2022521912"
	)
	boolean method6625(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3731 >= 0) {
				var1.remove();
				if (var1.field3732 > 0 && var1 == this.field3659[var1.field3735][var1.field3732]) {
					this.field3659[var1.field3735][var1.field3732] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lnx;[IIII)Z",
		garbageValue = "-1810688159"
	)
	boolean method6637(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3734 = ArchiveLoader.field1059 * -336955471 / 100;
		if (var1.field3731 < 0 || var1.stream != null && !var1.stream.method917()) {
			int var5 = var1.field3730;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3657[var1.field3735] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3730 = var5;
			}

			var1.stream.method1022(this.method6628(var1));
			MusicPatchNode2 var6 = var1.field3723;
			boolean var7 = false;
			++var1.field3736;
			var1.field3729 += var6.field3618;
			double var8 = (double)((var1.field3725 - 60 << 8) + (var1.field3730 * var1.field3739 >> 12)) * 5.086263020833333E-6D;
			if (var6.field3611 > 0) {
				if (var6.field3616 > 0) {
					var1.field3728 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3616) + 0.5D);
				} else {
					var1.field3728 += 128;
				}
			}

			if (var6.field3612 != null) {
				if (var6.field3614 > 0) {
					var1.field3737 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3614) + 0.5D);
				} else {
					var1.field3737 += 128;
				}

				while (var1.field3733 * 4 < var6.field3612.length - 2 && var1.field3737 > (var6.field3612[var1.field3733 * 4 + 2] & 255) << 8) {
					var1.field3733 = var1.field3733 * 4 + 2;
				}

				if (var1.field3733 * 4 == var6.field3612.length - 2 && var6.field3612[var1.field3733 * 4 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field3731 >= 0 && var6.field3613 != null && (this.field3652[var1.field3735] & 1) == 0 && (var1.field3732 < 0 || var1 != this.field3659[var1.field3735][var1.field3732])) {
				if (var6.field3615 > 0) {
					var1.field3731 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3615) + 0.5D);
				} else {
					var1.field3731 += 128;
				}

				while (var1.field3724 * 4 < var6.field3613.length - 2 && var1.field3731 > (var6.field3613[var1.field3724 * 4 + 2] & 255) << 8) {
					var1.field3724 = var1.field3724 * 4 + 2;
				}

				if (var1.field3724 * 4 == var6.field3613.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method1040(var1.field3734);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method918()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6816();
				if (var1.field3731 >= 0) {
					var1.remove();
					if (var1.field3732 > 0 && var1 == this.field3659[var1.field3735][var1.field3732]) {
						this.field3659[var1.field3735][var1.field3732] = null;
					}
				}

				return true;
			} else {
				var1.stream.method913(var1.field3734, this.method6629(var1), this.method6672(var1));
				return false;
			}
		} else {
			var1.method6816();
			var1.remove();
			if (var1.field3732 > 0 && var1 == this.field3659[var1.field3735][var1.field3732]) {
				this.field3659[var1.field3735][var1.field3732] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(Lev;I)V",
		garbageValue = "-419349839"
	)
	static void method6725(NPC var0) {
		var0.field1220 = var0.definition.size;
		var0.field1285 = var0.definition.rotation;
		var0.walkSequence = var0.definition.walkSequence;
		var0.walkBackSequence = var0.definition.walkBackSequence;
		var0.walkLeftSequence = var0.definition.walkLeftSequence;
		var0.walkRightSequence = var0.definition.walkRightSequence;
		var0.idleSequence = var0.definition.idleSequence;
		var0.turnLeftSequence = var0.definition.turnLeftSequence;
		var0.turnRightSequence = var0.definition.turnRightSequence;
		var0.runSequence = var0.definition.field2038;
		var0.field1290 = var0.definition.field2021;
		var0.field1231 = var0.definition.field2022;
		var0.field1232 = var0.definition.field2023;
		var0.field1288 = var0.definition.field2024;
		var0.field1224 = var0.definition.field2025;
		var0.field1257 = var0.definition.field2026;
		var0.field1236 = var0.definition.field2027;
	}
}
