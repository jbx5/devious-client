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

@ObfuscatedName("ms")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("bp")
	static AtomicBoolean field3657;
	@ObfuscatedName("by")
	static ThreadPoolExecutor field3638;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1104127909
	)
	int field3628;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1318576595
	)
	int field3644;
	@ObfuscatedName("am")
	int[] field3655;
	@ObfuscatedName("ax")
	int[] field3658;
	@ObfuscatedName("aq")
	int[] field3632;
	@ObfuscatedName("af")
	int[] field3633;
	@ObfuscatedName("at")
	int[] field3634;
	@ObfuscatedName("au")
	int[] field3635;
	@ObfuscatedName("ar")
	int[] field3631;
	@ObfuscatedName("al")
	int[] field3646;
	@ObfuscatedName("ad")
	int[] field3630;
	@ObfuscatedName("as")
	int[] field3640;
	@ObfuscatedName("ay")
	int[] field3641;
	@ObfuscatedName("aj")
	int[] field3642;
	@ObfuscatedName("av")
	int[] field3643;
	@ObfuscatedName("aw")
	int[] field3627;
	@ObfuscatedName("an")
	int[] field3645;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[[Lnb;"
	)
	MusicPatchNode[][] field3629;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "[[Lnb;"
	)
	MusicPatchNode[][] field3647;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bd")
	boolean field3649;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 462450459
	)
	@Export("track")
	int track;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1112281507
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		longValue = -1172391544945565461L
	)
	long field3652;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		longValue = 1055179931651124245L
	)
	long field3653;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	@Export("player")
	PcmPlayer player;
	@ObfuscatedName("bj")
	@Export("priorityQueue")
	PriorityQueue priorityQueue;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1813270399
	)
	public int field3637;

	static {
		field3657 = null;
		field3638 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lbz;)V"
	)
	public MidiPcmStream(PcmPlayer var1) {
		this.field3628 = 256;
		this.field3644 = 1000000;
		this.field3655 = new int[16];
		this.field3658 = new int[16];
		this.field3632 = new int[16];
		this.field3633 = new int[16];
		this.field3634 = new int[16];
		this.field3635 = new int[16];
		this.field3631 = new int[16];
		this.field3646 = new int[16];
		this.field3630 = new int[16];
		this.field3640 = new int[16];
		this.field3641 = new int[16];
		this.field3642 = new int[16];
		this.field3643 = new int[16];
		this.field3627 = new int[16];
		this.field3645 = new int[16];
		this.field3629 = new MusicPatchNode[16][128];
		this.field3647 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.player = null;
		this.priorityQueue = new PriorityQueue(5, new class345());
		this.field3637 = 0;
		this.player = var1;
		this.musicPatches = new NodeHashTable(128);
		this.method6527();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1461844016"
	)
	@Export("setPcmStreamVolume")
	public void setPcmStreamVolume(int var1) {
		synchronized(this.player) {
			this.field3628 = var1;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-498747792"
	)
	public int method6506() {
		return this.field3628;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnk;Lpo;Lbo;I)Z",
		garbageValue = "-384564894"
	)
	@Export("updateExternalPlayer")
	public boolean updateExternalPlayer(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		synchronized(this.player) {
			boolean var5 = true;
			synchronized(this.priorityQueue) {
				this.priorityQueue.clear();
			}

			for (class347 var6 = (class347)var1.field3700.first(); var6 != null; var6 = (class347)var1.field3700.next()) {
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

				if (!var8.method6704(var3, var6.field3741)) {
					var5 = false;
				} else if (this.priorityQueue != null) {
					synchronized(this.priorityQueue) {
						Iterator var18 = var8.field3691.iterator();

						while (var18.hasNext()) {
							class53 var11 = (class53)var18.next();
							this.priorityQueue.add(new class338(var6.field3740, var11));
						}
					}
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-73"
	)
	public void method6508() {
		if (this.priorityQueue != null) {
			if (field3657 != null) {
				field3657.set(true);
			}

			field3657 = new AtomicBoolean(false);
			AtomicBoolean var1 = field3657;
			if (field3638 == null) {
				int var2 = Runtime.getRuntime().availableProcessors();
				field3638 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class337(this));
			}

			field3638.submit(new class341(this, var1));
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method6509() {
		synchronized(this.player) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.method6703();
			}

		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("at")
	protected int vmethod6731() {
		return 0;
	}

	@ObfuscatedName("au")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3644 * -727379968 / PcmPlayer.field270;

			do {
				long var5 = (long)var3 * (long)var4 + this.field3652;
				if (this.field3653 - var5 >= 0L) {
					this.field3652 = var5;
					break;
				}

				int var7 = (int)((this.field3653 - this.field3652 + (long)var4 - 1L) / (long)var4);
				this.field3652 += (long)var7 * (long)var4;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method6587();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	public void method6510() {
		synchronized(this.player) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.remove();
			}

		}
	}

	@ObfuscatedName("al")
	@Export("skip")
	protected void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3644 * -727379968 / PcmPlayer.field270;

			do {
				long var3 = this.field3652 + (long)var1 * (long)var2;
				if (this.field3653 - var3 >= 0L) {
					this.field3652 = var3;
					break;
				}

				int var5 = (int)((this.field3653 - this.field3652 + (long)var2 - 1L) / (long)var2);
				this.field3652 += (long)var5 * (long)var2;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method6587();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lnk;ZI)V",
		garbageValue = "1533324333"
	)
	@Export("setMusicTrack")
	public void setMusicTrack(MusicTrack var1, boolean var2) {
		synchronized(this.player) {
			this.clear();
			this.midiFile.parse(var1.midi);
			this.field3649 = var2;
			this.field3652 = 0L;
			int var4 = this.midiFile.trackCount();

			for (int var5 = 0; var5 < var4; ++var5) {
				this.midiFile.gotoTrack(var5);
				this.midiFile.readTrackLength(var5);
				this.midiFile.markTrackPosition(var5);
			}

			this.track = this.midiFile.getPrioritizedTrack();
			this.trackLength = this.midiFile.trackLengths[this.track];
			this.field3653 = this.midiFile.method6655(this.trackLength);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-667727505"
	)
	@Export("clear")
	public void clear() {
		synchronized(this.player) {
			this.midiFile.clear();
			this.method6527();
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1891926304"
	)
	@Export("isReady")
	public boolean isReady() {
		synchronized(this.player) {
			return this.midiFile.isReady();
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1925109314"
	)
	public boolean method6543() {
		synchronized(this.player) {
			return this.musicPatches.method9602() > 0;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1708391853"
	)
	public void method6515(int var1, int var2) {
		synchronized(this.player) {
			this.method6516(var1, var2);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1823323916"
	)
	void method6516(int var1, int var2) {
		this.field3633[var1] = var2;
		this.field3635[var1] = var2 & -128;
		this.method6518(var1, var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "3"
	)
	void method6518(int var1, int var2) {
		if (var2 != this.field3634[var1]) {
			this.field3634[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3647[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "47"
	)
	void method6620(int var1, int var2, int var3) {
		this.method6520(var1, var2, 64);
		if ((this.field3640[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field3711 == var1 && var4.field3704 < 0) {
					this.field3629[var1][var4.field3706] = null;
					this.field3629[var1][var2] = var4;
					int var8 = (var4.field3710 * var4.field3701 >> 12) + var4.field3709;
					var4.field3709 += var2 - var4.field3706 << 8;
					var4.field3710 = var8 - var4.field3709;
					var4.field3701 = 4096;
					var4.field3706 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3634[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var5 = var9.rawSounds[var2].method1102();
				if (var5 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field3711 = var1;
					var6.table = var9;
					var6.rawSound = var5;
					var6.field3705 = var9.field3687[var2];
					var6.field3712 = var9.field3688[var2];
					var6.field3706 = var2;
					var6.field3707 = var3 * var3 * var9.field3685[var2] * var9.field3689 + 1024 >> 11;
					var6.field3708 = var9.field3686[var2] & 255;
					var6.field3709 = (var2 << 8) - (var9.field3681[var2] & 32767);
					var6.field3720 = 0;
					var6.field3713 = 0;
					var6.field3714 = 0;
					var6.field3704 = -1;
					var6.field3716 = 0;
					if (this.field3643[var1] == 0) {
						var6.stream = RawPcmStream.method1007(var5, this.method6602(var6), this.method6564(var6), this.method6618(var6));
					} else {
						var6.stream = RawPcmStream.method1007(var5, this.method6602(var6), 0, this.method6618(var6));
						this.method6525(var6, var9.field3681[var2] < 0);
					}

					if (var9.field3681[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3712 >= 0) {
						MusicPatchNode var7 = this.field3647[var1][var6.field3712];
						if (var7 != null && var7.field3704 < 0) {
							this.field3629[var1][var7.field3706] = null;
							var7.field3704 = 0;
						}

						this.field3647[var1][var6.field3712] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field3629[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lnb;ZI)V",
		garbageValue = "586187569"
	)
	void method6525(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field250) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)this.field3643[var1.field3711] * (long)var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method911();
			}
		} else {
			var4 = (int)((long)this.field3643[var1.field3711] * (long)var3 >> 6);
		}

		var1.stream.method910(var4);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1239035602"
	)
	void method6520(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3629[var1][var2];
		if (var4 != null) {
			this.field3629[var1][var2] = null;
			if ((this.field3640[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var4.field3711 == var5.field3711 && var5.field3704 < 0 && var4 != var5) {
						var4.field3704 = 0;
						break;
					}
				}
			} else {
				var4.field3704 = 0;
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1991246083"
	)
	void method6521(int var1, int var2, int var3) {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "42305589"
	)
	void method6522(int var1, int var2) {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-111"
	)
	void method6523(int var1, int var2) {
		this.field3631[var1] = var2;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method6524(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field3711 == var1) {
				if (var2.stream != null) {
					var2.stream.method1045(PcmPlayer.field270 / 100);
					if (var2.stream.method919()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6754();
				}

				if (var2.field3704 < 0) {
					this.field3629[var2.field3711][var2.field3706] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "853244495"
	)
	void method6638(int var1) {
		if (var1 >= 0) {
			this.field3655[var1] = 12800;
			this.field3658[var1] = 8192;
			this.field3632[var1] = 16383;
			this.field3631[var1] = 8192;
			this.field3646[var1] = 0;
			this.field3630[var1] = 8192;
			this.method6528(var1);
			this.method6529(var1);
			this.field3640[var1] = 0;
			this.field3641[var1] = 32767;
			this.field3642[var1] = 256;
			this.field3643[var1] = 0;
			this.method6563(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method6638(var1);
			}

		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1918382963"
	)
	void method6526(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field3711 == var1) && var2.field3704 < 0) {
				this.field3629[var2.field3711][var2.field3706] = null;
				var2.field3704 = 0;
			}
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "419017179"
	)
	void method6527() {
		this.method6524(-1);
		this.method6638(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3634[var1] = this.field3633[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3635[var1] = this.field3633[var1] & -128;
		}

	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "74877614"
	)
	void method6528(int var1) {
		if ((this.field3640[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3711 == var1 && this.field3629[var1][var2.field3706] == null && var2.field3704 < 0) {
					var2.field3704 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "683002864"
	)
	void method6529(int var1) {
		if ((this.field3640[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3711 == var1) {
					var2.field3721 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1856457959"
	)
	void method6530(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6520(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method6620(var3, var4, var5);
			} else {
				this.method6520(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6521(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3635[var3] = (var5 << 14) + (this.field3635[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3635[var3] = (var5 << 7) + (this.field3635[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3646[var3] = (var5 << 7) + (this.field3646[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3646[var3] = var5 + (this.field3646[var3] & -128);
			}

			if (var4 == 5) {
				this.field3630[var3] = (var5 << 7) + (this.field3630[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3630[var3] = var5 + (this.field3630[var3] & -128);
			}

			if (var4 == 7) {
				this.field3655[var3] = (var5 << 7) + (this.field3655[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3655[var3] = var5 + (this.field3655[var3] & -128);
			}

			if (var4 == 10) {
				this.field3658[var3] = (var5 << 7) + (this.field3658[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3658[var3] = var5 + (this.field3658[var3] & -128);
			}

			if (var4 == 11) {
				this.field3632[var3] = (var5 << 7) + (this.field3632[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3632[var3] = var5 + (this.field3632[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3640;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3640;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3640;
					var10000[var3] |= 2;
				} else {
					this.method6528(var3);
					var10000 = this.field3640;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3641[var3] = (var5 << 7) + (this.field3641[var3] & 127);
			}

			if (var4 == 98) {
				this.field3641[var3] = (this.field3641[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3641[var3] = (var5 << 7) + (this.field3641[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3641[var3] = (this.field3641[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method6524(var3);
			}

			if (var4 == 121) {
				this.method6638(var3);
			}

			if (var4 == 123) {
				this.method6526(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3641[var3];
				if (var6 == 16384) {
					this.field3642[var3] = (var5 << 7) + (this.field3642[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3641[var3];
				if (var6 == 16384) {
					this.field3642[var3] = var5 + (this.field3642[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3643[var3] = (var5 << 7) + (this.field3643[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3643[var3] = var5 + (this.field3643[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3640;
					var10000[var3] |= 4;
				} else {
					this.method6529(var3);
					var10000 = this.field3640;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method6563(var3, (var5 << 7) + (this.field3627[var3] & -16257));
			}

			if (var4 == 49) {
				this.method6563(var3, var5 + (this.field3627[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6518(var3, var4 + this.field3635[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6522(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method6523(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method6527();
			}
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-378404734"
	)
	void method6563(int var1, int var2) {
		this.field3627[var1] = var2;
		this.field3645[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)I",
		garbageValue = "-95203169"
	)
	int method6602(MusicPatchNode var1) {
		int var2 = (var1.field3701 * var1.field3710 >> 12) + var1.field3709;
		var2 += (this.field3631[var1.field3711] - 8192) * this.field3642[var1.field3711] >> 12;
		MusicPatchNode2 var3 = var1.field3705;
		int var4;
		if (var3.field3604 > 0 && (var3.field3612 > 0 || this.field3646[var1.field3711] > 0)) {
			var4 = var3.field3612 << 2;
			int var5 = var3.field3611 << 1;
			if (var1.field3717 < var5) {
				var4 = var4 * var1.field3717 / var5;
			}

			var4 += this.field3646[var1.field3711] >> 7;
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field3718 & 511));
			var2 += (int)(var6 * (double)var4);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)PcmPlayer.field270 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)I",
		garbageValue = "-1232918609"
	)
	int method6564(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3705;
		int var3 = this.field3655[var1.field3711] * this.field3632[var1.field3711] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3707 + 16384 >> 15;
		var3 = var3 * this.field3628 + 128 >> 8;
		if (var2.field3606 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)0 * 1.953125E-5D * (double)var2.field3606) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3605 != null) {
			var4 = var1.field3713;
			var5 = var2.field3605[var1.field3714 * 4 + 1];
			if (var1.field3714 * 4 < var2.field3605.length - 2) {
				var6 = (var2.field3605[var1.field3714 * 4] & 255) << 8;
				var7 = (var2.field3605[var1.field3714 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3605[var1.field3714 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		if (var1.field3704 > 0 && var2.field3610 != null) {
			var4 = var1.field3704;
			var5 = var2.field3610[var1.field3716 * 4 + 1];
			if (var1.field3716 * 4 < var2.field3610.length - 2) {
				var6 = (var2.field3610[var1.field3716 * 4] & 255) << 8;
				var7 = (var2.field3610[var1.field3716 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3610[var1.field3716 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lnb;B)I",
		garbageValue = "-78"
	)
	int method6618(MusicPatchNode var1) {
		int var2 = this.field3658[var1.field3711];
		return var2 < 8192 ? var2 * var1.field3708 + 32 >> 6 : 16384 - ((128 - var1.field3708) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1660420066"
	)
	void method6587() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3653; var2 == this.trackLength; var3 = this.midiFile.method6655(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3649 || var2 == 0) {
							this.method6527();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method6530(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3653 = var3;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Lnb;B)Z",
		garbageValue = "1"
	)
	boolean method6541(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3704 >= 0) {
				var1.remove();
				if (var1.field3712 > 0 && var1 == this.field3647[var1.field3711][var1.field3712]) {
					this.field3647[var1.field3711][var1.field3712] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Lnb;[IIII)Z",
		garbageValue = "472340663"
	)
	boolean method6542(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3703 = PcmPlayer.field270 / 100;
		if (var1.field3704 < 0 || var1.stream != null && !var1.stream.method918()) {
			int var5 = var1.field3701;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3630[var1.field3711] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3701 = var5;
			}

			var1.stream.method1037(this.method6602(var1));
			MusicPatchNode2 var6 = var1.field3705;
			boolean var7 = false;
			++var1.field3717;
			var1.field3718 += var6.field3604;
			double var8 = 5.086263020833333E-6D * (double)((var1.field3706 - 60 << 8) + (var1.field3701 * var1.field3710 >> 12));
			if (var6.field3606 > 0) {
				if (var6.field3609 > 0) {
					var1.field3720 = 0 + (int)(128.0D * Math.pow(2.0D, (double)var6.field3609 * var8) + 0.5D) * 740294656;
				} else {
					var1.field3720 = 0 + 268435456;
				}
			}

			if (var6.field3605 != null) {
				if (var6.field3607 > 0) {
					var1.field3713 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3607) + 0.5D);
				} else {
					var1.field3713 += 128;
				}

				while (var1.field3714 * 4 < var6.field3605.length - 2 && var1.field3713 > (var6.field3605[var1.field3714 * 4 + 2] & 255) << 8) {
					var1.field3714 = var1.field3714 * 4 + 2;
				}

				if (var1.field3714 * 4 == var6.field3605.length - 2 && var6.field3605[var1.field3714 * 4 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field3704 >= 0 && var6.field3610 != null && (this.field3640[var1.field3711] & 1) == 0 && (var1.field3712 < 0 || var1 != this.field3647[var1.field3711][var1.field3712])) {
				if (var6.field3608 > 0) {
					var1.field3704 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3608) + 0.5D);
				} else {
					var1.field3704 += 128;
				}

				while (var1.field3716 * 4 < var6.field3610.length - 2 && var1.field3704 > (var6.field3610[var1.field3716 * 4 + 2] & 255) << 8) {
					var1.field3716 = var1.field3716 * 4 + 2;
				}

				if (var1.field3716 * 4 == var6.field3610.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method1045(var1.field3703);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method919()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6754();
				if (var1.field3704 >= 0) {
					var1.remove();
					if (var1.field3712 > 0 && var1 == this.field3647[var1.field3711][var1.field3712]) {
						this.field3647[var1.field3711][var1.field3712] = null;
					}
				}

				return true;
			} else {
				var1.stream.method991(var1.field3703, this.method6564(var1), this.method6618(var1));
				return false;
			}
		} else {
			var1.method6754();
			var1.remove();
			if (var1.field3712 > 0 && var1 == this.field3647[var1.field3711][var1.field3712]) {
				this.field3647[var1.field3711][var1.field3712] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "195544566"
	)
	static final boolean method6507() {
		return Client.isMenuOpen;
	}
}
