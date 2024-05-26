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
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mw")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("bu")
	static AtomicBoolean field3594;
	@ObfuscatedName("bh")
	static ThreadPoolExecutor field3600;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1920878651
	)
	int field3602;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1590857280
	)
	int field3593;
	@ObfuscatedName("az")
	int[] field3590;
	@ObfuscatedName("af")
	int[] field3591;
	@ObfuscatedName("aa")
	int[] field3592;
	@ObfuscatedName("at")
	int[] field3619;
	@ObfuscatedName("ab")
	int[] field3612;
	@ObfuscatedName("ac")
	int[] field3595;
	@ObfuscatedName("ao")
	int[] field3610;
	@ObfuscatedName("ah")
	int[] field3597;
	@ObfuscatedName("av")
	int[] field3598;
	@ObfuscatedName("aw")
	int[] field3601;
	@ObfuscatedName("ad")
	int[] field3596;
	@ObfuscatedName("ai")
	int[] field3589;
	@ObfuscatedName("an")
	int[] field3604;
	@ObfuscatedName("am")
	int[] field3605;
	@ObfuscatedName("ar")
	int[] field3587;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[[Lne;"
	)
	MusicPatchNode[][] field3607;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "[[Lne;"
	)
	MusicPatchNode[][] field3608;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bo")
	boolean field3618;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -469107071
	)
	@Export("track")
	int track;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1552418049
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		longValue = -3040115667621603143L
	)
	long field3613;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		longValue = -4832767796175148511L
	)
	long field3614;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	@Export("player")
	PcmPlayer player;
	@ObfuscatedName("bg")
	@Export("priorityQueue")
	PriorityQueue priorityQueue;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -473293717
	)
	public int field3620;

	static {
		field3594 = null;
		field3600 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lbd;)V"
	)
	public MidiPcmStream(PcmPlayer var1) {
		this.field3602 = 256;
		this.field3593 = -727379968;
		this.field3590 = new int[16];
		this.field3591 = new int[16];
		this.field3592 = new int[16];
		this.field3619 = new int[16];
		this.field3612 = new int[16];
		this.field3595 = new int[16];
		this.field3610 = new int[16];
		this.field3597 = new int[16];
		this.field3598 = new int[16];
		this.field3601 = new int[16];
		this.field3596 = new int[16];
		this.field3589 = new int[16];
		this.field3604 = new int[16];
		this.field3605 = new int[16];
		this.field3587 = new int[16];
		this.field3607 = new MusicPatchNode[16][128];
		this.field3608 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.player = null;
		this.priorityQueue = new PriorityQueue(5, new class340());
		this.field3620 = 0;
		this.player = var1;
		this.musicPatches = new NodeHashTable(128);
		this.method6276();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "246118521"
	)
	@Export("setPcmStreamVolume")
	public void setPcmStreamVolume(int var1) {
		synchronized(this.player) {
			this.field3602 = var1;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method6374() {
		return this.field3602;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lno;Lor;Lbq;I)Z",
		garbageValue = "1846221629"
	)
	public boolean method6365(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		synchronized(this.player) {
			boolean var5 = true;
			synchronized(this.priorityQueue) {
				this.priorityQueue.clear();
			}

			for (class342 var6 = (class342)var1.field3660.first(); var6 != null; var6 = (class342)var1.field3660.next()) {
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

				if (!var8.method6436(var3, var6.field3698)) {
					var5 = false;
				} else if (this.priorityQueue != null) {
					synchronized(this.priorityQueue) {
						Iterator var18 = var8.field3652.iterator();

						while (var18.hasNext()) {
							class53 var11 = (class53)var18.next();
							this.priorityQueue.add(new class333(var6.field3699, var11));
						}
					}
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-25"
	)
	public void method6267() {
		if (this.priorityQueue != null) {
			if (field3594 != null) {
				field3594.set(true);
			}

			field3594 = new AtomicBoolean(false);
			AtomicBoolean var1 = field3594;
			if (field3600 == null) {
				int var2 = Runtime.getRuntime().availableProcessors();
				field3600 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class332(this));
			}

			field3600.submit(new class336(this, var1));
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-17"
	)
	public void method6259() {
		synchronized(this.player) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.method6437();
			}

		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("ab")
	protected int vmethod6454() {
		return 0;
	}

	@ObfuscatedName("ac")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3593 * 1000000 / UserComparator5.field1508;

			do {
				long var5 = (long)var4 * (long)var3 + this.field3613;
				if (this.field3614 - var5 >= 0L) {
					this.field3613 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3614 - this.field3613) - 1L) / (long)var4);
				this.field3613 += (long)var7 * (long)var4;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method6319();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-863647303"
	)
	public void method6256() {
		synchronized(this.player) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.remove();
			}

		}
	}

	@ObfuscatedName("ah")
	@Export("skip")
	protected void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3593 * 1000000 / UserComparator5.field1508;

			do {
				long var3 = (long)var2 * (long)var1 + this.field3613;
				if (this.field3614 - var3 >= 0L) {
					this.field3613 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3614 - this.field3613) - 1L) / (long)var2);
				this.field3613 += (long)var2 * (long)var5;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method6319();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lno;ZB)V",
		garbageValue = "1"
	)
	@Export("setMusicTrack")
	public void setMusicTrack(MusicTrack var1, boolean var2) {
		synchronized(this.player) {
			this.clear();
			this.midiFile.parse(var1.midi);
			this.field3618 = var2;
			this.field3613 = 0L;
			int var4 = this.midiFile.trackCount();

			for (int var5 = 0; var5 < var4; ++var5) {
				this.midiFile.gotoTrack(var5);
				this.midiFile.readTrackLength(var5);
				this.midiFile.markTrackPosition(var5);
			}

			this.track = this.midiFile.getPrioritizedTrack();
			this.trackLength = this.midiFile.trackLengths[this.track];
			this.field3614 = this.midiFile.method6389(this.trackLength);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2011841450"
	)
	@Export("clear")
	public void clear() {
		synchronized(this.player) {
			this.midiFile.clear();
			this.method6276();
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "84"
	)
	@Export("isReady")
	public boolean isReady() {
		synchronized(this.player) {
			return this.midiFile.isReady();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-28655"
	)
	public boolean method6264() {
		synchronized(this.player) {
			return this.musicPatches.method9356() > 0;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-190237832"
	)
	public void method6265(int var1, int var2) {
		synchronized(this.player) {
			this.method6266(var1, var2);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "442532470"
	)
	void method6266(int var1, int var2) {
		this.field3619[var1] = var2;
		this.field3595[var1] = var2 & -128;
		this.method6362(var1, var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	void method6362(int var1, int var2) {
		if (var2 != this.field3612[var1]) {
			this.field3612[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3608[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-741712812"
	)
	void method6268(int var1, int var2, int var3) {
		this.method6270(var1, var2, 64);
		if ((this.field3601[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field3666 == var1 && var4.field3676 < 0) {
					this.field3607[var1][var4.field3668] = null;
					this.field3607[var1][var2] = var4;
					int var8 = (var4.field3672 * var4.field3667 >> 12) + var4.field3679;
					var4.field3679 += var2 - var4.field3668 << 8;
					var4.field3667 = var8 - var4.field3679;
					var4.field3672 = 4096;
					var4.field3668 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3612[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var5 = var9.rawSounds[var2].method1072();
				if (var5 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field3666 = var1;
					var6.table = var9;
					var6.rawSound = var5;
					var6.field3665 = var9.field3649[var2];
					var6.field3664 = var9.field3651[var2];
					var6.field3668 = var2;
					var6.field3681 = var3 * var3 * var9.field3648[var2] * var9.field3645 + 1024 >> 11;
					var6.field3669 = var9.field3653[var2] & 255;
					var6.field3679 = (var2 << 8) - (var9.field3647[var2] & 32767);
					var6.field3670 = 0;
					var6.field3674 = 0;
					var6.field3680 = 0;
					var6.field3676 = -1;
					var6.field3677 = 0;
					if (this.field3604[var1] == 0) {
						var6.stream = RawPcmStream.method895(var5, this.method6281(var6), this.method6282(var6), this.method6283(var6));
					} else {
						var6.stream = RawPcmStream.method895(var5, this.method6281(var6), 0, this.method6283(var6));
						this.method6299(var6, var9.field3647[var2] < 0);
					}

					if (var9.field3647[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3664 >= 0) {
						MusicPatchNode var7 = this.field3608[var1][var6.field3664];
						if (var7 != null && var7.field3676 < 0) {
							this.field3607[var1][var7.field3668] = null;
							var7.field3676 = 0;
						}

						this.field3608[var1][var6.field3664] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field3607[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lne;ZB)V",
		garbageValue = "-78"
	)
	void method6299(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field269) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)this.field3604[var1.field3666] * (long)var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method904();
			}
		} else {
			var4 = (int)((long)this.field3604[var1.field3666] * (long)var3 >> 6);
		}

		var1.stream.method903(var4);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "669122751"
	)
	void method6270(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3607[var1][var2];
		if (var4 != null) {
			this.field3607[var1][var2] = null;
			if ((this.field3601[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var5.field3666 == var4.field3666 && var5.field3676 < 0 && var4 != var5) {
						var4.field3676 = 0;
						break;
					}
				}
			} else {
				var4.field3676 = 0;
			}

		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1697300424"
	)
	void method6335(int var1, int var2, int var3) {
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-569539279"
	)
	void method6272(int var1, int var2) {
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "416219688"
	)
	void method6376(int var1, int var2) {
		this.field3610[var1] = var2;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "102"
	)
	void method6273(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field3666 == var1) {
				if (var2.stream != null) {
					var2.stream.method908(UserComparator5.field1508 / 100);
					if (var2.stream.method912()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6478();
				}

				if (var2.field3676 < 0) {
					this.field3607[var2.field3666][var2.field3668] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "94"
	)
	void method6274(int var1) {
		if (var1 >= 0) {
			this.field3590[var1] = 12800;
			this.field3591[var1] = 8192;
			this.field3592[var1] = 16383;
			this.field3610[var1] = 8192;
			this.field3597[var1] = 0;
			this.field3598[var1] = 8192;
			this.method6310(var1);
			this.method6278(var1);
			this.field3601[var1] = 0;
			this.field3596[var1] = 32767;
			this.field3589[var1] = 256;
			this.field3604[var1] = 0;
			this.method6280(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method6274(var1);
			}

		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1967482724"
	)
	void method6275(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field3666 == var1) && var2.field3676 < 0) {
				this.field3607[var2.field3666][var2.field3668] = null;
				var2.field3676 = 0;
			}
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1120513445"
	)
	void method6276() {
		this.method6273(-1);
		this.method6274(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3612[var1] = this.field3619[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3595[var1] = this.field3619[var1] & -128;
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "20957472"
	)
	void method6310(int var1) {
		if ((this.field3601[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3666 == var1 && this.field3607[var1][var2.field3668] == null && var2.field3676 < 0) {
					var2.field3676 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-119796863"
	)
	void method6278(int var1) {
		if ((this.field3601[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3666 == var1) {
					var2.field3682 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-920629359"
	)
	void method6360(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6270(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method6268(var3, var4, var5);
			} else {
				this.method6270(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6335(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3595[var3] = (var5 << 14) + (this.field3595[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3595[var3] = (var5 << 7) + (this.field3595[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3597[var3] = (var5 << 7) + (this.field3597[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3597[var3] = var5 + (this.field3597[var3] & -128);
			}

			if (var4 == 5) {
				this.field3598[var3] = (var5 << 7) + (this.field3598[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3598[var3] = var5 + (this.field3598[var3] & -128);
			}

			if (var4 == 7) {
				this.field3590[var3] = (var5 << 7) + (this.field3590[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3590[var3] = var5 + (this.field3590[var3] & -128);
			}

			if (var4 == 10) {
				this.field3591[var3] = (var5 << 7) + (this.field3591[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3591[var3] = var5 + (this.field3591[var3] & -128);
			}

			if (var4 == 11) {
				this.field3592[var3] = (var5 << 7) + (this.field3592[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3592[var3] = var5 + (this.field3592[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3601;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3601;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3601;
					var10000[var3] |= 2;
				} else {
					this.method6310(var3);
					var10000 = this.field3601;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3596[var3] = (var5 << 7) + (this.field3596[var3] & 127);
			}

			if (var4 == 98) {
				this.field3596[var3] = (this.field3596[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3596[var3] = (var5 << 7) + (this.field3596[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3596[var3] = (this.field3596[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method6273(var3);
			}

			if (var4 == 121) {
				this.method6274(var3);
			}

			if (var4 == 123) {
				this.method6275(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3596[var3];
				if (var6 == 16384) {
					this.field3589[var3] = (var5 << 7) + (this.field3589[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3596[var3];
				if (var6 == 16384) {
					this.field3589[var3] = var5 + (this.field3589[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3604[var3] = (var5 << 7) + (this.field3604[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3604[var3] = var5 + (this.field3604[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3601;
					var10000[var3] |= 4;
				} else {
					this.method6278(var3);
					var10000 = this.field3601;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method6280(var3, (var5 << 7) + (this.field3605[var3] & -16257));
			}

			if (var4 == 49) {
				this.method6280(var3, var5 + (this.field3605[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6362(var3, var4 + this.field3595[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6272(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method6376(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method6276();
			}
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2029746282"
	)
	void method6280(int var1, int var2) {
		this.field3605[var1] = var2;
		this.field3587[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lne;B)I",
		garbageValue = "64"
	)
	int method6281(MusicPatchNode var1) {
		int var2 = (var1.field3672 * var1.field3667 >> 12) + var1.field3679;
		var2 += (this.field3610[var1.field3666] - 8192) * this.field3589[var1.field3666] >> 12;
		MusicPatchNode2 var3 = var1.field3665;
		int var4;
		if (var3.field3573 > 0 && (var3.field3572 > 0 || this.field3597[var1.field3666] > 0)) {
			var4 = var3.field3572 << 2;
			int var5 = var3.field3566 << 1;
			if (var1.field3678 < var5) {
				var4 = var4 * var1.field3678 / var5;
			}

			var4 += this.field3597[var1.field3666] >> 7;
			double var6 = Math.sin((double)(var1.field3675 & 511) * 0.01227184630308513D);
			var2 += (int)(var6 * (double)var4);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)UserComparator5.field1508 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lne;B)I",
		garbageValue = "2"
	)
	int method6282(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3665;
		int var3 = this.field3590[var1.field3666] * this.field3592[var1.field3666] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3681 + 16384 >> 15;
		var3 = var3 * this.field3602 + 128 >> 8;
		if (var2.field3568 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)0 * 1.953125E-5D * (double)var2.field3568) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3570 != null) {
			var4 = var1.field3674;
			var5 = var2.field3570[var1.field3680 * 2 + 1];
			if (var1.field3680 * 2 < var2.field3570.length - 2) {
				var6 = (var2.field3570[var1.field3680 * 2] & 255) << 8;
				var7 = (var2.field3570[var1.field3680 * 2 + 2] & 255) << 8;
				var5 += (var2.field3570[var1.field3680 * 2 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		if (var1.field3676 > 0 && var2.field3567 != null) {
			var4 = var1.field3676;
			var5 = var2.field3567[var1.field3677 * 4 + 1];
			if (var1.field3677 * 4 < var2.field3567.length - 2) {
				var6 = (var2.field3567[var1.field3677 * 4] & 255) << 8;
				var7 = (var2.field3567[var1.field3677 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3567[var1.field3677 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)I",
		garbageValue = "-2063094715"
	)
	int method6283(MusicPatchNode var1) {
		int var2 = this.field3591[var1.field3666];
		return var2 < 8192 ? var2 * var1.field3669 + 32 >> 6 : 16384 - ((128 - var1.field3669) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2103140443"
	)
	void method6319() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3614; var2 == this.trackLength; var3 = this.midiFile.method6389(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3618 || var2 == 0) {
							this.method6276();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method6360(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3614 = var3;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lne;B)Z",
		garbageValue = "-81"
	)
	boolean method6290(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3676 >= 0) {
				var1.remove();
				if (var1.field3664 > 0 && var1 == this.field3608[var1.field3666][var1.field3664]) {
					this.field3608[var1.field3666][var1.field3664] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lne;[IIII)Z",
		garbageValue = "-1906573079"
	)
	boolean method6331(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3662 = UserComparator5.field1508 / 100;
		if (var1.field3676 < 0 || var1.stream != null && !var1.stream.method919()) {
			int var5 = var1.field3672;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field3598[var1.field3666]) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3672 = var5;
			}

			var1.stream.method909(this.method6281(var1));
			MusicPatchNode2 var6 = var1.field3665;
			boolean var7 = false;
			++var1.field3678;
			var1.field3675 += var6.field3573;
			double var8 = 5.086263020833333E-6D * (double)((var1.field3668 - 60 << 8) + (var1.field3667 * var1.field3672 >> 12));
			if (var6.field3568 > 0) {
				if (var6.field3574 > 0) {
					var1.field3670 = 0 + (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3574) + 0.5D) * 471859200;
				} else {
					var1.field3670 = 0 + 268435456;
				}
			}

			if (var6.field3570 != null) {
				if (var6.field3569 > 0) {
					var1.field3674 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3569) + 0.5D);
				} else {
					var1.field3674 += 128;
				}

				while (var1.field3680 * 2 < var6.field3570.length - 2 && var1.field3674 > (var6.field3570[var1.field3680 * 2 + 2] & 255) << 8) {
					var1.field3680 = var1.field3680 * 4 + 4;
				}

				if (var1.field3680 * 2 == var6.field3570.length - 2 && var6.field3570[var1.field3680 * 2 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field3676 >= 0 && var6.field3567 != null && (this.field3601[var1.field3666] & 1) == 0 && (var1.field3664 < 0 || var1 != this.field3608[var1.field3666][var1.field3664])) {
				if (var6.field3571 > 0) {
					var1.field3676 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3571) + 0.5D);
				} else {
					var1.field3676 += 128;
				}

				while (var1.field3677 * 4 < var6.field3567.length - 2 && var1.field3676 > (var6.field3567[var1.field3677 * 4 + 2] & 255) << 8) {
					var1.field3677 = var1.field3677 * 4 + 2;
				}

				if (var1.field3677 * 4 == var6.field3567.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method908(var1.field3662);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method912()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6478();
				if (var1.field3676 >= 0) {
					var1.remove();
					if (var1.field3664 > 0 && var1 == this.field3608[var1.field3666][var1.field3664]) {
						this.field3608[var1.field3666][var1.field3664] = null;
					}
				}

				return true;
			} else {
				var1.stream.method907(var1.field3662, this.method6282(var1), this.method6283(var1));
				return false;
			}
		} else {
			var1.method6478();
			var1.remove();
			if (var1.field3664 > 0 && var1 == this.field3608[var1.field3666][var1.field3664]) {
				this.field3608[var1.field3666][var1.field3664] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-2067503956"
	)
	static int method6386(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			class13.Interpreter_intStackSize -= 3;
			var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
			int var11 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = AsyncRestClient.widgetDefinition.method6536(var9);
				if (var6.children == null) {
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) {
					Widget[] var7 = new Widget[var11 + 1];

					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}

					var6.children = var7;
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var11;
					var12.isIf3 = true;
					if (var4 == 12) {
						var12.method6941();
						var12.method6942().method6664(new class108(var12));
						var12.method6942().method6663(new class109(var12));
					}

					var6.children[var11] = var12;
					if (var2) {
						Interpreter.scriptDotWidget = var12;
					} else {
						SecureRandomSSLSocket.scriptActiveWidget = var12;
					}

					class324.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = var2 ? Interpreter.scriptDotWidget : SecureRandomSSLSocket.scriptActiveWidget;
				Widget var10 = AsyncRestClient.widgetDefinition.method6536(var3.id);
				var10.children[var3.childIndex] = null;
				class324.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = AsyncRestClient.widgetDefinition.method6536(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
				var3.children = null;
				class324.invalidateWidget(var3);
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var3 = AsyncRestClient.widgetDefinition.method6536(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
					if (var3 != null) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							Interpreter.scriptDotWidget = var3;
						} else {
							SecureRandomSSLSocket.scriptActiveWidget = var3;
						}
					} else {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				class13.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				Widget var5 = AsyncRestClient.widgetDefinition.getWidgetChild(var9, var4);
				if (var5 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						Interpreter.scriptDotWidget = var5;
					} else {
						SecureRandomSSLSocket.scriptActiveWidget = var5;
					}
				} else {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-936154492"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field800;
		} else if (var5 >= 100) {
			var6 = Client.field801;
		} else {
			var6 = (Client.field801 - Client.field800) * var5 / 100 + Client.field800;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field695) {
			var10 = Client.field695;
			var6 = var10 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field760) {
				var6 = Client.field760;
				var8 = var3 * var6 * 512 / (var10 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field807) {
			var10 = Client.field807;
			var6 = var10 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field804) {
				var6 = Client.field804;
				var8 = var10 * var2 * 334 / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = var3 * var6 / 334;
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
			class60.method1150(var2, var3);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}
