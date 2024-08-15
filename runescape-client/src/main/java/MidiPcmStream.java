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

@ObfuscatedName("mr")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("bu")
	static AtomicBoolean field3602;
	@ObfuscatedName("bp")
	static ThreadPoolExecutor field3603;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1925103729
	)
	int field3574;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 411203009
	)
	int field3597;
	@ObfuscatedName("au")
	int[] field3575;
	@ObfuscatedName("ax")
	int[] field3573;
	@ObfuscatedName("ao")
	int[] field3578;
	@ObfuscatedName("am")
	int[] field3576;
	@ObfuscatedName("ac")
	int[] field3580;
	@ObfuscatedName("ae")
	int[] field3601;
	@ObfuscatedName("ad")
	int[] field3581;
	@ObfuscatedName("aq")
	int[] field3583;
	@ObfuscatedName("al")
	int[] field3582;
	@ObfuscatedName("av")
	int[] field3585;
	@ObfuscatedName("ar")
	int[] field3586;
	@ObfuscatedName("ap")
	int[] field3587;
	@ObfuscatedName("ak")
	int[] field3588;
	@ObfuscatedName("ai")
	int[] field3579;
	@ObfuscatedName("at")
	int[] field3590;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[[Lno;"
	)
	MusicPatchNode[][] field3591;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "[[Lno;"
	)
	MusicPatchNode[][] field3592;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bj")
	boolean field3594;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1060623375
	)
	@Export("track")
	int track;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -226428107
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		longValue = 8714343991119440089L
	)
	long field3589;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		longValue = -8114834856669510025L
	)
	long field3598;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	@Export("player")
	PcmPlayer player;
	@ObfuscatedName("bv")
	@Export("priorityQueue")
	PriorityQueue priorityQueue;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1707039073
	)
	public int field3604;

	static {
		field3602 = null;
		field3603 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lbi;)V"
	)
	public MidiPcmStream(PcmPlayer var1) {
		this.field3574 = 256;
		this.field3597 = 1000000;
		this.field3575 = new int[16];
		this.field3573 = new int[16];
		this.field3578 = new int[16];
		this.field3576 = new int[16];
		this.field3580 = new int[16];
		this.field3601 = new int[16];
		this.field3581 = new int[16];
		this.field3583 = new int[16];
		this.field3582 = new int[16];
		this.field3585 = new int[16];
		this.field3586 = new int[16];
		this.field3587 = new int[16];
		this.field3588 = new int[16];
		this.field3579 = new int[16];
		this.field3590 = new int[16];
		this.field3591 = new MusicPatchNode[16][128];
		this.field3592 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.player = null;
		this.priorityQueue = new PriorityQueue(5, new class343());
		this.field3604 = 0;
		this.player = var1;
		this.musicPatches = new NodeHashTable(128);
		this.method6341();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1570094351"
	)
	@Export("setPcmStreamVolume")
	public void setPcmStreamVolume(int var1) {
		synchronized(this.player) {
			this.field3574 = var1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-112461490"
	)
	public int method6260() {
		return this.field3574;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lob;Lbn;I)Z",
		garbageValue = "2038911956"
	)
	public boolean method6282(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		synchronized(this.player) {
			boolean var5 = true;
			synchronized(this.priorityQueue) {
				this.priorityQueue.clear();
			}

			for (class345 var6 = (class345)var1.field3645.first(); var6 != null; var6 = (class345)var1.field3645.next()) {
				int var14 = (int)var6.key;
				MusicPatch var8 = (MusicPatch)this.musicPatches.get((long)var14);
				if (var8 == null) {
					var8 = HttpRequest.updateExternalPlayer(var2, var14);
					if (var8 == null) {
						var5 = false;
						continue;
					}

					this.musicPatches.put(var8, (long)var14);
				}

				if (!var8.method6441(var3, var6.field3688)) {
					var5 = false;
				} else if (this.priorityQueue != null) {
					synchronized(this.priorityQueue) {
						Iterator var10 = var8.field3635.iterator();

						while (var10.hasNext()) {
							class53 var11 = (class53)var10.next();
							this.priorityQueue.add(new class336(var6.field3691, var11));
						}
					}
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1615716010"
	)
	public void method6245() {
		if (this.priorityQueue != null) {
			if (field3602 != null) {
				field3602.set(true);
			}

			field3602 = new AtomicBoolean(false);
			AtomicBoolean var1 = field3602;
			if (field3603 == null) {
				int var2 = Runtime.getRuntime().availableProcessors();
				field3603 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class335(this));
			}

			field3603.submit(new class339(this, var1));
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "101"
	)
	public void method6246() {
		synchronized(this.player) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.method6433();
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lbb;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Lbb;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("ac")
	protected int vmethod6461() {
		return 0;
	}

	@ObfuscatedName("ae")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3597 * -727379968 / class511.field5136;

			do {
				long var5 = this.field3589 + (long)var4 * (long)var3;
				if (this.field3598 - var5 >= 0L) {
					this.field3589 = var5;
					break;
				}

				int var7 = (int)((this.field3598 - this.field3589 + (long)var4 - 1L) / (long)var4);
				this.field3589 += (long)var7 * (long)var4;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method6279();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "11"
	)
	public void method6247() {
		synchronized(this.player) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.remove();
			}

		}
	}

	@ObfuscatedName("aq")
	@Export("skip")
	protected void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3597 * -727379968 / class511.field5136;

			do {
				long var3 = (long)var2 * (long)var1 + this.field3589;
				if (this.field3598 - var3 >= 0L) {
					this.field3589 = var3;
					break;
				}

				int var5 = (int)((this.field3598 - this.field3589 + (long)var2 - 1L) / (long)var2);
				this.field3589 += (long)var5 * (long)var2;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method6279();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lnd;ZI)V",
		garbageValue = "1340255296"
	)
	@Export("setMusicTrack")
	public void setMusicTrack(MusicTrack var1, boolean var2) {
		synchronized(this.player) {
			this.clear();
			this.midiFile.parse(var1.midi);
			this.field3594 = var2;
			this.field3589 = 0L;
			int var4 = this.midiFile.trackCount();

			for (int var5 = 0; var5 < var4; ++var5) {
				this.midiFile.gotoTrack(var5);
				this.midiFile.readTrackLength(var5);
				this.midiFile.markTrackPosition(var5);
			}

			this.track = this.midiFile.getPrioritizedTrack();
			this.trackLength = this.midiFile.trackLengths[this.track];
			this.field3598 = this.midiFile.method6376(this.trackLength);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1671089301"
	)
	@Export("clear")
	public void clear() {
		synchronized(this.player) {
			this.midiFile.clear();
			this.method6341();
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "364199980"
	)
	@Export("isReady")
	public boolean isReady() {
		synchronized(this.player) {
			return this.midiFile.isReady();
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "841962100"
	)
	public boolean method6307() {
		synchronized(this.player) {
			return this.musicPatches.method9308() > 0;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1446209707"
	)
	public void method6252(int var1, int var2) {
		synchronized(this.player) {
			this.method6338(var1, var2);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "77"
	)
	void method6338(int var1, int var2) {
		this.field3576[var1] = var2;
		this.field3601[var1] = var2 & -128;
		this.method6254(var1, var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2143407152"
	)
	void method6254(int var1, int var2) {
		if (var2 != this.field3580[var1]) {
			this.field3580[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3592[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-633400529"
	)
	void method6255(int var1, int var2, int var3) {
		this.method6256(var1, var2, 64);
		if ((this.field3585[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field3652 == var1 && var4.field3660 < 0) {
					this.field3591[var1][var4.field3657] = null;
					this.field3591[var1][var2] = var4;
					int var8 = (var4.field3662 * var4.field3656 >> 12) + var4.field3654;
					var4.field3654 += var2 - var4.field3657 << 8;
					var4.field3662 = var8 - var4.field3654;
					var4.field3656 = 4096;
					var4.field3657 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3580[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var5 = var9.rawSounds[var2].method1041();
				if (var5 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field3652 = var1;
					var6.table = var9;
					var6.rawSound = var5;
					var6.field3655 = var9.field3633[var2];
					var6.field3650 = var9.field3630[var2];
					var6.field3657 = var2;
					var6.field3647 = var3 * var3 * var9.field3628[var2] * var9.field3632 + 1024 >> 11;
					var6.field3649 = var9.field3631[var2] & 255;
					var6.field3654 = (var2 << 8) - (var9.field3634[var2] & 32767);
					var6.field3646 = 0;
					var6.field3665 = 0;
					var6.field3659 = 0;
					var6.field3660 = -1;
					var6.field3661 = 0;
					if (this.field3588[var1] == 0) {
						var6.stream = RawPcmStream.method855(var5, this.method6268(var6), this.method6356(var6), this.method6335(var6));
					} else {
						var6.stream = RawPcmStream.method855(var5, this.method6268(var6), 0, this.method6335(var6));
						this.method6267(var6, var9.field3634[var2] < 0);
					}

					if (var9.field3634[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3650 >= 0) {
						MusicPatchNode var7 = this.field3592[var1][var6.field3650];
						if (var7 != null && var7.field3660 < 0) {
							this.field3591[var1][var7.field3657] = null;
							var7.field3660 = 0;
						}

						this.field3592[var1][var6.field3650] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field3591[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lno;ZI)V",
		garbageValue = "-1310593926"
	)
	void method6267(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field241) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)this.field3588[var1.field3652] * (long)var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method958();
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3588[var1.field3652] >> 6);
		}

		var1.stream.method968(var4);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1998877757"
	)
	void method6256(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3591[var1][var2];
		if (var4 != null) {
			this.field3591[var1][var2] = null;
			if ((this.field3585[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var5.field3652 == var4.field3652 && var5.field3660 < 0 && var5 != var4) {
						var4.field3660 = 0;
						break;
					}
				}
			} else {
				var4.field3660 = 0;
			}

		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "433159834"
	)
	void method6257(int var1, int var2, int var3) {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	void method6258(int var1, int var2) {
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1939387979"
	)
	void method6259(int var1, int var2) {
		this.field3581[var1] = var2;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "73"
	)
	void method6243(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field3652 == var1) {
				if (var2.stream != null) {
					var2.stream.method999(class511.field5136 / 100);
					if (var2.stream.method872()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6470();
				}

				if (var2.field3660 < 0) {
					this.field3591[var2.field3652][var2.field3657] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1325527514"
	)
	void method6261(int var1) {
		if (var1 >= 0) {
			this.field3575[var1] = 12800;
			this.field3573[var1] = 8192;
			this.field3578[var1] = 16383;
			this.field3581[var1] = 8192;
			this.field3583[var1] = 0;
			this.field3582[var1] = 8192;
			this.method6264(var1);
			this.method6265(var1);
			this.field3585[var1] = 0;
			this.field3586[var1] = 32767;
			this.field3587[var1] = 256;
			this.field3588[var1] = 0;
			this.method6292(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method6261(var1);
			}

		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1242890270"
	)
	void method6333(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field3652 == var1) && var2.field3660 < 0) {
				this.field3591[var2.field3652][var2.field3657] = null;
				var2.field3660 = 0;
			}
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-44"
	)
	void method6341() {
		this.method6243(-1);
		this.method6261(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3580[var1] = this.field3576[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3601[var1] = this.field3576[var1] & -128;
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "43"
	)
	void method6264(int var1) {
		if ((this.field3585[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3652 == var1 && this.field3591[var1][var2.field3657] == null && var2.field3660 < 0) {
					var2.field3660 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "751630761"
	)
	void method6265(int var1) {
		if ((this.field3585[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3652 == var1) {
					var2.field3666 = 0;
				}
			}
		}

	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "864549592"
	)
	void method6318(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6256(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method6255(var3, var4, var5);
			} else {
				this.method6256(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6257(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3601[var3] = (var5 << 14) + (this.field3601[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3601[var3] = (var5 << 7) + (this.field3601[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3583[var3] = (var5 << 7) + (this.field3583[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3583[var3] = var5 + (this.field3583[var3] & -128);
			}

			if (var4 == 5) {
				this.field3582[var3] = (var5 << 7) + (this.field3582[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3582[var3] = var5 + (this.field3582[var3] & -128);
			}

			if (var4 == 7) {
				this.field3575[var3] = (var5 << 7) + (this.field3575[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3575[var3] = var5 + (this.field3575[var3] & -128);
			}

			if (var4 == 10) {
				this.field3573[var3] = (var5 << 7) + (this.field3573[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3573[var3] = var5 + (this.field3573[var3] & -128);
			}

			if (var4 == 11) {
				this.field3578[var3] = (var5 << 7) + (this.field3578[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3578[var3] = var5 + (this.field3578[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3585;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3585;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3585;
					var10000[var3] |= 2;
				} else {
					this.method6264(var3);
					var10000 = this.field3585;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3586[var3] = (var5 << 7) + (this.field3586[var3] & 127);
			}

			if (var4 == 98) {
				this.field3586[var3] = (this.field3586[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3586[var3] = (var5 << 7) + (this.field3586[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3586[var3] = (this.field3586[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method6243(var3);
			}

			if (var4 == 121) {
				this.method6261(var3);
			}

			if (var4 == 123) {
				this.method6333(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3586[var3];
				if (var6 == 16384) {
					this.field3587[var3] = (var5 << 7) + (this.field3587[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3586[var3];
				if (var6 == 16384) {
					this.field3587[var3] = var5 + (this.field3587[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3588[var3] = (var5 << 7) + (this.field3588[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3588[var3] = var5 + (this.field3588[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3585;
					var10000[var3] |= 4;
				} else {
					this.method6265(var3);
					var10000 = this.field3585;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method6292(var3, (var5 << 7) + (this.field3579[var3] & -16257));
			}

			if (var4 == 49) {
				this.method6292(var3, var5 + (this.field3579[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6254(var3, var4 + this.field3601[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6258(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method6259(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method6341();
			}
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "884427107"
	)
	void method6292(int var1, int var2) {
		this.field3579[var1] = var2;
		this.field3590[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lno;B)I",
		garbageValue = "123"
	)
	int method6268(MusicPatchNode var1) {
		int var2 = (var1.field3662 * var1.field3656 >> 12) + var1.field3654;
		var2 += (this.field3581[var1.field3652] - 8192) * this.field3587[var1.field3652] >> 12;
		MusicPatchNode2 var3 = var1.field3655;
		int var4;
		if (var3.field3556 > 0 && (var3.field3557 > 0 || this.field3583[var1.field3652] > 0)) {
			var4 = var3.field3557 << 2;
			int var5 = var3.field3552 << 1;
			if (var1.field3653 < var5) {
				var4 = var4 * var1.field3653 / var5;
			}

			var4 += this.field3583[var1.field3652] >> 7;
			double var6 = Math.sin((double)(var1.field3663 & 511) * 0.01227184630308513D);
			var2 += (int)(var6 * (double)var4);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)class511.field5136 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lno;I)I",
		garbageValue = "392312846"
	)
	int method6356(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3655;
		int var3 = this.field3578[var1.field3652] * this.field3575[var1.field3652] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3647 + 16384 >> 15;
		var3 = var3 * this.field3574 + 128 >> 8;
		if (var2.field3551 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3551 * (double)var1.field3646 * 1.953125E-5D) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3549 != null) {
			var4 = var1.field3665;
			var5 = var2.field3549[var1.field3659 * 2 + 1];
			if (var1.field3659 * 2 < var2.field3549.length - 2) {
				var6 = (var2.field3549[var1.field3659 * 2] & 255) << 8;
				var7 = (var2.field3549[var1.field3659 * 2 + 2] & 255) << 8;
				var5 += (var2.field3549[var1.field3659 * 2 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		if (var1.field3660 > 0 && var2.field3550 != null) {
			var4 = var1.field3660;
			var5 = var2.field3550[var1.field3661 * 4 + 1];
			if (var1.field3661 * 4 < var2.field3550.length - 2) {
				var6 = (var2.field3550[var1.field3661 * 4] & 255) << 8;
				var7 = (var2.field3550[var1.field3661 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3550[var1.field3661 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lno;B)I",
		garbageValue = "-103"
	)
	int method6335(MusicPatchNode var1) {
		int var2 = this.field3573[var1.field3652];
		return var2 < 8192 ? var2 * var1.field3649 + 32 >> 6 : 16384 - ((128 - var1.field3649) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-92"
	)
	void method6279() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3598; var2 == this.trackLength; var3 = this.midiFile.method6376(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3594 || var2 == 0) {
							this.method6341();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method6318(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3598 = var3;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lno;I)Z",
		garbageValue = "2068887385"
	)
	boolean method6277(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3660 >= 0) {
				var1.remove();
				if (var1.field3650 > 0 && var1 == this.field3592[var1.field3652][var1.field3650]) {
					this.field3592[var1.field3652][var1.field3650] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lno;[IIIB)Z",
		garbageValue = "97"
	)
	boolean method6278(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3651 = class511.field5136 / 100;
		if (var1.field3660 < 0 || var1.stream != null && !var1.stream.method871()) {
			int var5 = var1.field3656;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field3582[var1.field3652]) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3656 = var5;
			}

			var1.stream.method869(this.method6268(var1));
			MusicPatchNode2 var6 = var1.field3655;
			boolean var7 = false;
			++var1.field3653;
			var1.field3663 += var6.field3556;
			double var8 = 5.086263020833333E-6D * (double)((var1.field3657 - 60 << 8) + (var1.field3662 * var1.field3656 >> 12));
			if (var6.field3551 > 0) {
				if (var6.field3554 > 0) {
					var1.field3646 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3554) + 0.5D);
				} else {
					var1.field3646 += 128;
				}
			}

			if (var6.field3549 != null) {
				if (var6.field3560 > 0) {
					var1.field3665 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3560 * var8) + 0.5D);
				} else {
					var1.field3665 += 128;
				}

				while (var1.field3659 * 2 < var6.field3549.length - 2 && var1.field3665 > (var6.field3549[var1.field3659 * 2 + 2] & 255) << 8) {
					var1.field3659 = var1.field3659 * 4 + 4;
				}

				if (var1.field3659 * 2 == var6.field3549.length - 2 && var6.field3549[var1.field3659 * 2 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field3660 >= 0 && var6.field3550 != null && (this.field3585[var1.field3652] & 1) == 0 && (var1.field3650 < 0 || var1 != this.field3592[var1.field3652][var1.field3650])) {
				if (var6.field3553 > 0) {
					var1.field3660 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3553) + 0.5D);
				} else {
					var1.field3660 += 128;
				}

				while (var1.field3661 * 4 < var6.field3550.length - 2 && var1.field3660 > (var6.field3550[var1.field3661 * 4 + 2] & 255) << 8) {
					var1.field3661 = var1.field3661 * 4 + 2;
				}

				if (var1.field3661 * 4 == var6.field3550.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method999(var1.field3651);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method872()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6470();
				if (var1.field3660 >= 0) {
					var1.remove();
					if (var1.field3650 > 0 && var1 == this.field3592[var1.field3652][var1.field3650]) {
						this.field3592[var1.field3652][var1.field3650] = null;
					}
				}

				return true;
			} else {
				var1.stream.method867(var1.field3651, this.method6356(var1), this.method6335(var1));
				return false;
			}
		} else {
			var1.method6470();
			var1.remove();
			if (var1.field3650 > 0 && var1 == this.field3592[var1.field3652][var1.field3650]) {
				this.field3592[var1.field3652][var1.field3650] = null;
			}

			return true;
		}
	}
}
