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

@ObfuscatedName("mc")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("bx")
	static AtomicBoolean field3625;
	@ObfuscatedName("bu")
	static ThreadPoolExecutor field3598;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -35329085
	)
	int field3596;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 909887491
	)
	int field3617;
	@ObfuscatedName("ak")
	int[] field3615;
	@ObfuscatedName("ap")
	int[] field3599;
	@ObfuscatedName("an")
	int[] field3600;
	@ObfuscatedName("aj")
	int[] field3601;
	@ObfuscatedName("av")
	int[] field3602;
	@ObfuscatedName("ab")
	int[] field3603;
	@ObfuscatedName("ai")
	int[] field3604;
	@ObfuscatedName("ae")
	int[] field3621;
	@ObfuscatedName("au")
	int[] field3606;
	@ObfuscatedName("aa")
	int[] field3608;
	@ObfuscatedName("as")
	int[] field3609;
	@ObfuscatedName("aw")
	int[] field3620;
	@ObfuscatedName("at")
	int[] field3611;
	@ObfuscatedName("af")
	int[] field3597;
	@ObfuscatedName("am")
	int[] field3613;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[[Lna;"
	)
	MusicPatchNode[][] field3614;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "[[Lna;"
	)
	MusicPatchNode[][] field3595;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("be")
	boolean field3616;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 2047528875
	)
	@Export("track")
	int track;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 992038787
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		longValue = 7642554548963887643L
	)
	long field3605;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		longValue = -7456478925563174147L
	)
	long field3610;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("player")
	PcmPlayer player;
	@ObfuscatedName("bp")
	@Export("priorityQueue")
	PriorityQueue priorityQueue;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1411363415
	)
	public int field3627;

	static {
		field3625 = null;
		field3598 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lbv;)V"
	)
	public MidiPcmStream(PcmPlayer var1) {
		this.field3596 = 256;
		this.field3617 = 1000000;
		this.field3615 = new int[16];
		this.field3599 = new int[16];
		this.field3600 = new int[16];
		this.field3601 = new int[16];
		this.field3602 = new int[16];
		this.field3603 = new int[16];
		this.field3604 = new int[16];
		this.field3621 = new int[16];
		this.field3606 = new int[16];
		this.field3608 = new int[16];
		this.field3609 = new int[16];
		this.field3620 = new int[16];
		this.field3611 = new int[16];
		this.field3597 = new int[16];
		this.field3613 = new int[16];
		this.field3614 = new MusicPatchNode[16][128];
		this.field3595 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.player = null;
		this.priorityQueue = new PriorityQueue(5, new class341());
		this.field3627 = 0;
		this.player = var1;
		this.musicPatches = new NodeHashTable(128);
		this.method6207();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-24"
	)
	@Export("setPcmStreamVolume")
	public void setPcmStreamVolume(int var1) {
		synchronized(this.player) {
			this.field3596 = var1;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "379610889"
	)
	public int method6187() {
		return this.field3596;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnz;Lok;Lbh;B)Z",
		garbageValue = "126"
	)
	public boolean method6188(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		synchronized(this.player) {
			boolean var5 = true;
			synchronized(this.priorityQueue) {
				this.priorityQueue.clear();
			}

			for (class343 var6 = (class343)var1.field3673.first(); var6 != null; var6 = (class343)var1.field3673.next()) {
				int var14 = (int)var6.key;
				MusicPatch var8 = (MusicPatch)this.musicPatches.get((long)var14);
				if (var8 == null) {
					var8 = class33.updateExternalPlayer(var2, var14);
					if (var8 == null) {
						var5 = false;
						continue;
					}

					this.musicPatches.put(var8, (long)var14);
				}

				if (!var8.method6373(var3, var6.field3721)) {
					var5 = false;
				} else if (this.priorityQueue != null) {
					synchronized(this.priorityQueue) {
						Iterator var10 = var8.field3659.iterator();

						while (var10.hasNext()) {
							class53 var11 = (class53)var10.next();
							this.priorityQueue.add(new class334(var6.field3719, var11));
						}
					}
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "389177170"
	)
	public void method6189() {
		if (this.priorityQueue != null) {
			if (field3625 != null) {
				field3625.set(true);
			}

			field3625 = new AtomicBoolean(false);
			AtomicBoolean var1 = field3625;
			if (field3598 == null) {
				int var2 = Runtime.getRuntime().availableProcessors();
				field3598 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class333(this));
			}

			field3598.submit(new class337(this, var1));
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	public void method6260() {
		synchronized(this.player) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.method6374();
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("av")
	protected int vmethod6390() {
		return 0;
	}

	@ObfuscatedName("ab")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3617 * -727379968 / PcmPlayer.field263;

			do {
				long var5 = this.field3605 + (long)var3 * (long)var4;
				if (this.field3610 - var5 >= 0L) {
					this.field3605 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3610 - this.field3605) - 1L) / (long)var4);
				this.field3605 += (long)var4 * (long)var7;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method6275();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "126"
	)
	public void method6190() {
		synchronized(this.player) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.remove();
			}

		}
	}

	@ObfuscatedName("ae")
	@Export("skip")
	protected void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3617 * -727379968 / PcmPlayer.field263;

			do {
				long var3 = this.field3605 + (long)var1 * (long)var2;
				if (this.field3610 - var3 >= 0L) {
					this.field3605 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3610 - this.field3605) - 1L) / (long)var2);
				this.field3605 += (long)var2 * (long)var5;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method6275();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnz;ZI)V",
		garbageValue = "1799040723"
	)
	@Export("setMusicTrack")
	public void setMusicTrack(MusicTrack var1, boolean var2) {
		synchronized(this.player) {
			this.clear();
			this.midiFile.parse(var1.midi);
			this.field3616 = var2;
			this.field3605 = 0L;
			int var4 = this.midiFile.trackCount();

			for (int var5 = 0; var5 < var4; ++var5) {
				this.midiFile.gotoTrack(var5);
				this.midiFile.readTrackLength(var5);
				this.midiFile.markTrackPosition(var5);
			}

			this.track = this.midiFile.getPrioritizedTrack();
			this.trackLength = this.midiFile.trackLengths[this.track];
			this.field3610 = this.midiFile.method6330(this.trackLength);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "126"
	)
	@Export("clear")
	public void clear() {
		synchronized(this.player) {
			this.midiFile.clear();
			this.method6207();
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "100"
	)
	@Export("isReady")
	public boolean isReady() {
		synchronized(this.player) {
			return this.midiFile.isReady();
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1453820669"
	)
	public boolean method6194() {
		synchronized(this.player) {
			return this.musicPatches.method9265() > 0;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1098221381"
	)
	public void method6195(int var1, int var2) {
		synchronized(this.player) {
			this.method6217(var1, var2);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2146758050"
	)
	void method6217(int var1, int var2) {
		this.field3601[var1] = var2;
		this.field3603[var1] = var2 & -128;
		this.method6277(var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-1"
	)
	void method6277(int var1, int var2) {
		if (var2 != this.field3602[var1]) {
			this.field3602[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3595[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V",
		garbageValue = "-22915"
	)
	void method6198(int var1, int var2, int var3) {
		this.method6249(var1, var2, 64);
		if ((this.field3608[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field3685 == var1 && var4.field3680 < 0) {
					this.field3614[var1][var4.field3675] = null;
					this.field3614[var1][var2] = var4;
					int var8 = (var4.field3678 * var4.field3684 >> 12) + var4.field3683;
					var4.field3683 += var2 - var4.field3675 << 8;
					var4.field3684 = var8 - var4.field3683;
					var4.field3678 = 4096;
					var4.field3675 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3602[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var5 = var9.rawSounds[var2].method1100();
				if (var5 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field3685 = var1;
					var6.table = var9;
					var6.rawSound = var5;
					var6.field3690 = var9.field3651[var2];
					var6.field3679 = var9.field3657[var2];
					var6.field3675 = var2;
					var6.field3681 = var3 * var3 * var9.field3655[var2] * var9.field3656 + 1024 >> 11;
					var6.field3682 = var9.field3652[var2] & 255;
					var6.field3683 = (var2 << 8) - (var9.field3654[var2] & 32767);
					var6.field3689 = 0;
					var6.field3686 = 0;
					var6.field3694 = 0;
					var6.field3680 = -1;
					var6.field3688 = 0;
					if (this.field3611[var1] == 0) {
						var6.stream = RawPcmStream.method908(var5, this.method6212(var6), this.method6221(var6), this.method6206(var6));
					} else {
						var6.stream = RawPcmStream.method908(var5, this.method6212(var6), 0, this.method6206(var6));
						this.method6205(var6, var9.field3654[var2] < 0);
					}

					if (var9.field3654[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3679 >= 0) {
						MusicPatchNode var7 = this.field3595[var1][var6.field3679];
						if (var7 != null && var7.field3680 < 0) {
							this.field3614[var1][var7.field3675] = null;
							var7.field3680 = 0;
						}

						this.field3595[var1][var6.field3679] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field3614[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lna;ZS)V",
		garbageValue = "-19359"
	)
	void method6205(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field251) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)var5 * (long)this.field3611[var1.field3685] >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method983();
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3611[var1.field3685] >> 6);
		}

		var1.stream.method1007(var4);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-530165942"
	)
	void method6249(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3614[var1][var2];
		if (var4 != null) {
			this.field3614[var1][var2] = null;
			if ((this.field3608[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var5.field3685 == var4.field3685 && var5.field3680 < 0 && var4 != var5) {
						var4.field3680 = 0;
						break;
					}
				}
			} else {
				var4.field3680 = 0;
			}

		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-105"
	)
	void method6306(int var1, int var2, int var3) {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "694149840"
	)
	void method6202(int var1, int var2) {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-92"
	)
	void method6313(int var1, int var2) {
		this.field3604[var1] = var2;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-843635039"
	)
	void method6204(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field3685 == var1) {
				if (var2.stream != null) {
					var2.stream.method921(PcmPlayer.field263 / 100);
					if (var2.stream.method916()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6423();
				}

				if (var2.field3680 < 0) {
					this.field3614[var2.field3685][var2.field3675] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-113"
	)
	void method6283(int var1) {
		if (var1 >= 0) {
			this.field3615[var1] = 12800;
			this.field3599[var1] = 8192;
			this.field3600[var1] = 16383;
			this.field3604[var1] = 8192;
			this.field3621[var1] = 0;
			this.field3606[var1] = 8192;
			this.method6252(var1);
			this.method6209(var1);
			this.field3608[var1] = 0;
			this.field3609[var1] = 32767;
			this.field3620[var1] = 256;
			this.field3611[var1] = 0;
			this.method6211(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method6283(var1);
			}

		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "8"
	)
	void method6287(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field3685 == var1) && var2.field3680 < 0) {
				this.field3614[var2.field3685][var2.field3675] = null;
				var2.field3680 = 0;
			}
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "355111668"
	)
	void method6207() {
		this.method6204(-1);
		this.method6283(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3602[var1] = this.field3601[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3603[var1] = this.field3601[var1] & -128;
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "18994"
	)
	void method6252(int var1) {
		if ((this.field3608[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3685 == var1 && this.field3614[var1][var2.field3675] == null && var2.field3680 < 0) {
					var2.field3680 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "5"
	)
	void method6209(int var1) {
		if ((this.field3608[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3685 == var1) {
					var2.field3695 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-50"
	)
	void method6297(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6249(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method6198(var3, var4, var5);
			} else {
				this.method6249(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6306(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3603[var3] = (var5 << 14) + (this.field3603[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3603[var3] = (var5 << 7) + (this.field3603[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3621[var3] = (var5 << 7) + (this.field3621[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3621[var3] = var5 + (this.field3621[var3] & -128);
			}

			if (var4 == 5) {
				this.field3606[var3] = (var5 << 7) + (this.field3606[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3606[var3] = var5 + (this.field3606[var3] & -128);
			}

			if (var4 == 7) {
				this.field3615[var3] = (var5 << 7) + (this.field3615[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3615[var3] = var5 + (this.field3615[var3] & -128);
			}

			if (var4 == 10) {
				this.field3599[var3] = (var5 << 7) + (this.field3599[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3599[var3] = var5 + (this.field3599[var3] & -128);
			}

			if (var4 == 11) {
				this.field3600[var3] = (var5 << 7) + (this.field3600[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3600[var3] = var5 + (this.field3600[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3608;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3608;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3608;
					var10000[var3] |= 2;
				} else {
					this.method6252(var3);
					var10000 = this.field3608;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3609[var3] = (var5 << 7) + (this.field3609[var3] & 127);
			}

			if (var4 == 98) {
				this.field3609[var3] = (this.field3609[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3609[var3] = (var5 << 7) + (this.field3609[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3609[var3] = (this.field3609[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method6204(var3);
			}

			if (var4 == 121) {
				this.method6283(var3);
			}

			if (var4 == 123) {
				this.method6287(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3609[var3];
				if (var6 == 16384) {
					this.field3620[var3] = (var5 << 7) + (this.field3620[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3609[var3];
				if (var6 == 16384) {
					this.field3620[var3] = var5 + (this.field3620[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3611[var3] = (var5 << 7) + (this.field3611[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3611[var3] = var5 + (this.field3611[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3608;
					var10000[var3] |= 4;
				} else {
					this.method6209(var3);
					var10000 = this.field3608;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method6211(var3, (var5 << 7) + (this.field3597[var3] & -16257));
			}

			if (var4 == 49) {
				this.method6211(var3, var5 + (this.field3597[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6277(var3, var4 + this.field3603[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6202(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method6313(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method6207();
			}
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1042536639"
	)
	void method6211(int var1, int var2) {
		this.field3597[var1] = var2;
		this.field3613[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lna;I)I",
		garbageValue = "-315105632"
	)
	int method6212(MusicPatchNode var1) {
		int var2 = (var1.field3678 * var1.field3684 >> 12) + var1.field3683;
		var2 += (this.field3604[var1.field3685] - 8192) * this.field3620[var1.field3685] >> 12;
		MusicPatchNode2 var3 = var1.field3690;
		int var4;
		if (var3.field3573 > 0 && (var3.field3567 > 0 || this.field3621[var1.field3685] > 0)) {
			var4 = var3.field3567 << 2;
			int var5 = var3.field3569 << 1;
			if (var1.field3687 < var5) {
				var4 = var4 * var1.field3687 / var5;
			}

			var4 += this.field3621[var1.field3685] >> 7;
			double var6 = Math.sin((double)(var1.field3692 & 511) * 0.01227184630308513D);
			var2 += (int)(var6 * (double)var4);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)PcmPlayer.field263 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lna;I)I",
		garbageValue = "-1878764550"
	)
	int method6221(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3690;
		int var3 = this.field3615[var1.field3685] * this.field3600[var1.field3685] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3681 + 16384 >> 15;
		var3 = var3 * this.field3596 + 128 >> 8;
		if (var2.field3568 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3568 * 1.953125E-5D * (double)var1.field3689) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3578 != null) {
			var4 = var1.field3686;
			var5 = var2.field3578[var1.field3694 * 4 + 1];
			if (var1.field3694 * 4 < var2.field3578.length - 2) {
				var6 = (var2.field3578[var1.field3694 * 4] & 255) << 8;
				var7 = (var2.field3578[var1.field3694 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3578[var1.field3694 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		if (var1.field3680 > 0 && var2.field3574 != null) {
			var4 = var1.field3680;
			var5 = var2.field3574[var1.field3688 * 4 + 1];
			if (var1.field3688 * 4 < var2.field3574.length - 2) {
				var6 = (var2.field3574[var1.field3688 * 4] & 255) << 8;
				var7 = (var2.field3574[var1.field3688 * 4 + 2] & 255) << 8;
				var5 += (var2.field3574[var1.field3688 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lna;I)I",
		garbageValue = "-435630989"
	)
	int method6206(MusicPatchNode var1) {
		int var2 = this.field3599[var1.field3685];
		return var2 < 8192 ? var2 * var1.field3682 + 32 >> 6 : 16384 - ((128 - var1.field3682) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1794319935"
	)
	void method6275() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3610; var2 == this.trackLength; var3 = this.midiFile.method6330(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3616 || var2 == 0) {
							this.method6207();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method6297(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3610 = var3;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lna;B)Z",
		garbageValue = "40"
	)
	boolean method6256(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3680 >= 0) {
				var1.remove();
				if (var1.field3679 > 0 && var1 == this.field3595[var1.field3685][var1.field3679]) {
					this.field3595[var1.field3685][var1.field3679] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Lna;[IIII)Z",
		garbageValue = "-2144292768"
	)
	boolean method6278(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3691 = PcmPlayer.field263 / 100;
		if (var1.field3680 < 0 || var1.stream != null && !var1.stream.method924()) {
			int var5 = var1.field3678;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3606[var1.field3685] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3678 = var5;
			}

			var1.stream.method922(this.method6212(var1));
			MusicPatchNode2 var6 = var1.field3690;
			boolean var7 = false;
			++var1.field3687;
			var1.field3692 += var6.field3573;
			double var8 = 5.086263020833333E-6D * (double)((var1.field3675 - 60 << 8) + (var1.field3678 * var1.field3684 >> 12));
			if (var6.field3568 > 0) {
				if (var6.field3571 > 0) {
					var1.field3689 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3571) + 0.5D);
				} else {
					var1.field3689 += 128;
				}
			}

			if (var6.field3578 != null) {
				if (var6.field3572 > 0) {
					var1.field3686 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3572 * var8) + 0.5D);
				} else {
					var1.field3686 += 128;
				}

				while (var1.field3694 * 4 < var6.field3578.length - 2 && var1.field3686 > (var6.field3578[var1.field3694 * 4 + 2] & 255) << 8) {
					var1.field3694 = var1.field3694 * 4 + 2;
				}

				if (var1.field3694 * 4 == var6.field3578.length - 2 && var6.field3578[var1.field3694 * 4 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field3680 >= 0 && var6.field3574 != null && (this.field3608[var1.field3685] & 1) == 0 && (var1.field3679 < 0 || var1 != this.field3595[var1.field3685][var1.field3679])) {
				if (var6.field3570 > 0) {
					var1.field3680 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3570 * var8) + 0.5D);
				} else {
					var1.field3680 += 128;
				}

				while (var1.field3688 * 4 < var6.field3574.length - 2 && var1.field3680 > (var6.field3574[var1.field3688 * 4 + 2] & 255) << 8) {
					var1.field3688 = var1.field3688 * 4 + 2;
				}

				if (var1.field3688 * 4 == var6.field3574.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method921(var1.field3691);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method916()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6423();
				if (var1.field3680 >= 0) {
					var1.remove();
					if (var1.field3679 > 0 && var1 == this.field3595[var1.field3685][var1.field3679]) {
						this.field3595[var1.field3685][var1.field3679] = null;
					}
				}

				return true;
			} else {
				var1.stream.method920(var1.field3691, this.method6221(var1), this.method6206(var1));
				return false;
			}
		} else {
			var1.method6423();
			var1.remove();
			if (var1.field3679 > 0 && var1 == this.field3595[var1.field3685][var1.field3679]) {
				this.field3595[var1.field3685][var1.field3679] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-556387055"
	)
	static final void method6317() {
		for (int var0 = 0; var0 < class511.topLevelWorldView.playerUpdateManager.playerCount; ++var0) {
			Player var1 = class511.topLevelWorldView.players[class511.topLevelWorldView.playerUpdateManager.playerIndices[var0]];
			var1.clearIsFriend();
		}

		Iterator var2 = Messages.Messages_hashTable.iterator();

		while (var2.hasNext()) {
			Message var3 = (Message)var2.next();
			var3.clearIsFromFriend();
		}

		if (Decimator.friendsChat != null) {
			Decimator.friendsChat.clearFriends();
		}

	}
}
