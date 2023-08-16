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

@ObfuscatedName("lf")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("bf")
	static AtomicBoolean field3441;
	@ObfuscatedName("bq")
	static ThreadPoolExecutor field3438;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1749604367
	)
	int field3414;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -119074624
	)
	int field3422;
	@ObfuscatedName("at")
	int[] field3416;
	@ObfuscatedName("ac")
	int[] field3417;
	@ObfuscatedName("ai")
	int[] field3418;
	@ObfuscatedName("az")
	int[] field3419;
	@ObfuscatedName("ap")
	int[] field3420;
	@ObfuscatedName("aa")
	int[] field3425;
	@ObfuscatedName("af")
	int[] field3431;
	@ObfuscatedName("ad")
	int[] field3421;
	@ObfuscatedName("aq")
	int[] field3424;
	@ObfuscatedName("ah")
	int[] field3413;
	@ObfuscatedName("as")
	int[] field3426;
	@ObfuscatedName("ay")
	int[] field3427;
	@ObfuscatedName("aj")
	int[] field3415;
	@ObfuscatedName("av")
	int[] field3429;
	@ObfuscatedName("aw")
	int[] field3440;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[[Lmg;"
	)
	MusicPatchNode[][] field3428;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "[[Lmg;"
	)
	MusicPatchNode[][] field3432;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bk")
	boolean field3434;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -716283687
	)
	@Export("track")
	int track;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -699922429
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		longValue = -7285986816161155915L
	)
	long field3437;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		longValue = 6809306897544537L
	)
	long field3430;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bm")
	PriorityQueue field3423;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1591268569
	)
	public int field3443;

	static {
		field3441 = null;
		field3438 = null;
	}

	public MidiPcmStream() {
		this.field3414 = 256;
		this.field3422 = -727379968;
		this.field3416 = new int[16];
		this.field3417 = new int[16];
		this.field3418 = new int[16];
		this.field3419 = new int[16];
		this.field3420 = new int[16];
		this.field3425 = new int[16];
		this.field3431 = new int[16];
		this.field3421 = new int[16];
		this.field3424 = new int[16];
		this.field3413 = new int[16];
		this.field3426 = new int[16];
		this.field3427 = new int[16];
		this.field3415 = new int[16];
		this.field3429 = new int[16];
		this.field3440 = new int[16];
		this.field3428 = new MusicPatchNode[16][128];
		this.field3432 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.field3423 = new PriorityQueue(5, new class316());
		this.field3443 = 0;
		this.musicPatches = new NodeHashTable(128);
		this.method5803();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "178339919"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3414 = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1304608444"
	)
	public int method5830() {
		return this.field3414;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lmv;Lnu;Lbi;I)Z",
		garbageValue = "2146420949"
	)
	public synchronized boolean method5781(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		boolean var4 = true;
		synchronized(this.field3423) {
			this.field3423.clear();
		}

		for (class318 var5 = (class318)var1.field3486.first(); var5 != null; var5 = (class318)var1.field3486.next()) {
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

			if (!var7.method5959(var3, var5.field3526)) {
				var4 = false;
			} else if (this.field3423 != null) {
				synchronized(this.field3423) {
					Iterator var15 = var7.field3475.iterator();

					while (var15.hasNext()) {
						class53 var10 = (class53)var15.next();
						this.field3423.add(new class309(var5.field3527, var10));
					}
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-932325376"
	)
	public void method5782() {
		if (this.field3423 != null) {
			if (field3441 != null) {
				field3441.set(true);
			}

			field3441 = new AtomicBoolean(false);
			AtomicBoolean var1 = field3441;
			if (field3438 == null) {
				int var2 = Runtime.getRuntime().availableProcessors();
				field3438 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class308(this));
			}

			field3438.submit(new class312(this, var1));
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2076204033"
	)
	public synchronized void method5783() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.method5960();
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Lbw;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Lbw;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("ap")
	protected synchronized int vmethod5973() {
		return 0;
	}

	@ObfuscatedName("aa")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3422 * 1000000 / PcmPlayer.field293;

			do {
				long var5 = (long)var4 * (long)var3 + this.field3437;
				if (this.field3430 - var5 >= 0L) {
					this.field3437 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3430 - this.field3437) - 1L) / (long)var4);
				this.field3437 += (long)var4 * (long)var7;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method5814();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1876288055"
	)
	public synchronized void method5877() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove();
		}

	}

	@ObfuscatedName("ad")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3422 * 1000000 / PcmPlayer.field293;

			do {
				long var3 = this.field3437 + (long)var1 * (long)var2;
				if (this.field3430 - var3 >= 0L) {
					this.field3437 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3430 - this.field3437) - 1L) / (long)var2);
				this.field3437 += (long)var2 * (long)var5;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method5814();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lmv;ZI)V",
		garbageValue = "718932503"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field3434 = var2;
		this.field3437 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field3430 = this.midiFile.method5924(this.trackLength);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "965115955"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method5803();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-12"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	public synchronized boolean method5788() {
		return this.musicPatches.method8746() > 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1830042203"
	)
	public synchronized void method5811(int var1, int var2) {
		this.method5835(var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-22"
	)
	void method5835(int var1, int var2) {
		this.field3419[var1] = var2;
		this.field3425[var1] = var2 & -128;
		this.method5791(var1, var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "71"
	)
	void method5791(int var1, int var2) {
		if (var2 != this.field3420[var1]) {
			this.field3420[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3432[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "896950696"
	)
	void method5792(int var1, int var2, int var3) {
		this.method5794(var1, var2, 64);
		if ((this.field3413[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field3497 == var1 && var4.field3501 < 0) {
					this.field3428[var1][var4.field3492] = null;
					this.field3428[var1][var2] = var4;
					int var8 = (var4.field3496 * var4.field3499 >> 12) + var4.field3491;
					var4.field3491 += var2 - var4.field3492 << 8;
					var4.field3496 = var8 - var4.field3491;
					var4.field3499 = 4096;
					var4.field3492 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3420[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var5 = var9.rawSounds[var2].method1087();
				if (var5 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field3497 = var1;
					var6.table = var9;
					var6.rawSound = var5;
					var6.field3490 = var9.field3471[var2];
					var6.field3503 = var9.field3472[var2];
					var6.field3492 = var2;
					var6.field3493 = var3 * var3 * var9.field3469[var2] * var9.field3474 + 1024 >> 11;
					var6.field3494 = var9.field3470[var2] & 255;
					var6.field3491 = (var2 << 8) - (var9.field3468[var2] & 32767);
					var6.field3498 = 0;
					var6.field3505 = 0;
					var6.field3500 = 0;
					var6.field3501 = -1;
					var6.field3502 = 0;
					if (this.field3415[var1] == 0) {
						var6.stream = RawPcmStream.method904(var5, this.method5843(var6), this.method5849(var6), this.method5808(var6));
					} else {
						var6.stream = RawPcmStream.method904(var5, this.method5843(var6), 0, this.method5808(var6));
						this.method5807(var6, var9.field3468[var2] < 0);
					}

					if (var9.field3468[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3503 >= 0) {
						MusicPatchNode var7 = this.field3432[var1][var6.field3503];
						if (var7 != null && var7.field3501 < 0) {
							this.field3428[var1][var7.field3492] = null;
							var7.field3501 = 0;
						}

						this.field3432[var1][var6.field3503] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field3428[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lmg;ZS)V",
		garbageValue = "5717"
	)
	void method5807(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field283) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)var5 * (long)this.field3415[var1.field3497] >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method968();
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3415[var1.field3497] >> 6);
		}

		var1.stream.method912(var4);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1002745448"
	)
	void method5794(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3428[var1][var2];
		if (var4 != null) {
			this.field3428[var1][var2] = null;
			if ((this.field3413[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var5.field3497 == var4.field3497 && var5.field3501 < 0 && var4 != var5) {
						var4.field3501 = 0;
						break;
					}
				}
			} else {
				var4.field3501 = 0;
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1830352831"
	)
	void method5795(int var1, int var2, int var3) {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1399006127"
	)
	void method5796(int var1, int var2) {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1713272694"
	)
	void method5797(int var1, int var2) {
		this.field3431[var1] = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "405588365"
	)
	void method5876(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field3497 == var1) {
				if (var2.stream != null) {
					var2.stream.method917(PcmPlayer.field293 / 100);
					if (var2.stream.method921()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method5998();
				}

				if (var2.field3501 < 0) {
					this.field3428[var2.field3497][var2.field3492] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "11"
	)
	void method5799(int var1) {
		if (var1 >= 0) {
			this.field3416[var1] = 12800;
			this.field3417[var1] = 8192;
			this.field3418[var1] = 16383;
			this.field3431[var1] = 8192;
			this.field3421[var1] = 0;
			this.field3424[var1] = 8192;
			this.method5802(var1);
			this.method5840(var1);
			this.field3413[var1] = 0;
			this.field3426[var1] = 32767;
			this.field3427[var1] = 256;
			this.field3415[var1] = 0;
			this.method5805(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method5799(var1);
			}

		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "2"
	)
	void method5800(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field3497 == var1) && var2.field3501 < 0) {
				this.field3428[var2.field3497][var2.field3492] = null;
				var2.field3501 = 0;
			}
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1873768041"
	)
	void method5803() {
		this.method5876(-1);
		this.method5799(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3420[var1] = this.field3419[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3425[var1] = this.field3419[var1] & -128;
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1931071556"
	)
	void method5802(int var1) {
		if ((this.field3413[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3497 == var1 && this.field3428[var1][var2.field3492] == null && var2.field3501 < 0) {
					var2.field3501 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1591565057"
	)
	void method5840(int var1) {
		if ((this.field3413[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3497 == var1) {
					var2.field3507 = 0;
				}
			}
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-60"
	)
	void method5806(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method5794(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method5792(var3, var4, var5);
			} else {
				this.method5794(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method5795(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3425[var3] = (var5 << 14) + (this.field3425[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3425[var3] = (var5 << 7) + (this.field3425[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3421[var3] = (var5 << 7) + (this.field3421[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3421[var3] = var5 + (this.field3421[var3] & -128);
			}

			if (var4 == 5) {
				this.field3424[var3] = (var5 << 7) + (this.field3424[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3424[var3] = var5 + (this.field3424[var3] & -128);
			}

			if (var4 == 7) {
				this.field3416[var3] = (var5 << 7) + (this.field3416[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3416[var3] = var5 + (this.field3416[var3] & -128);
			}

			if (var4 == 10) {
				this.field3417[var3] = (var5 << 7) + (this.field3417[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3417[var3] = var5 + (this.field3417[var3] & -128);
			}

			if (var4 == 11) {
				this.field3418[var3] = (var5 << 7) + (this.field3418[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3418[var3] = var5 + (this.field3418[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3413;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3413;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3413;
					var10000[var3] |= 2;
				} else {
					this.method5802(var3);
					var10000 = this.field3413;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3426[var3] = (var5 << 7) + (this.field3426[var3] & 127);
			}

			if (var4 == 98) {
				this.field3426[var3] = (this.field3426[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3426[var3] = (var5 << 7) + (this.field3426[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3426[var3] = (this.field3426[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method5876(var3);
			}

			if (var4 == 121) {
				this.method5799(var3);
			}

			if (var4 == 123) {
				this.method5800(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3426[var3];
				if (var6 == 16384) {
					this.field3427[var3] = (var5 << 7) + (this.field3427[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3426[var3];
				if (var6 == 16384) {
					this.field3427[var3] = var5 + (this.field3427[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3415[var3] = (var5 << 7) + (this.field3415[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3415[var3] = var5 + (this.field3415[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3413;
					var10000[var3] |= 4;
				} else {
					this.method5840(var3);
					var10000 = this.field3413;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method5805(var3, (var5 << 7) + (this.field3429[var3] & -16257));
			}

			if (var4 == 49) {
				this.method5805(var3, var5 + (this.field3429[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method5791(var3, var4 + this.field3425[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method5796(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method5797(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method5803();
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "943957578"
	)
	void method5805(int var1, int var2) {
		this.field3429[var1] = var2;
		this.field3440[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lmg;B)I",
		garbageValue = "-57"
	)
	int method5843(MusicPatchNode var1) {
		int var2 = (var1.field3499 * var1.field3496 >> 12) + var1.field3491;
		var2 += (this.field3431[var1.field3497] - 8192) * this.field3427[var1.field3497] >> 12;
		MusicPatchNode2 var3 = var1.field3490;
		int var4;
		if (var3.field3394 > 0 && (var3.field3393 > 0 || this.field3421[var1.field3497] > 0)) {
			var4 = var3.field3393 << 2;
			int var5 = var3.field3395 << 1;
			if (var1.field3487 < var5) {
				var4 = var4 * var1.field3487 / var5;
			}

			var4 += this.field3421[var1.field3497] >> 7;
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field3504 & 511));
			var2 += (int)((double)var4 * var6);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)PcmPlayer.field293 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lmg;I)I",
		garbageValue = "-1224155709"
	)
	int method5849(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3490;
		int var3 = this.field3416[var1.field3497] * this.field3418[var1.field3497] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3493 + 16384 >> 15;
		var3 = var3 * this.field3414 + 128 >> 8;
		if (var2.field3389 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, 1.953125E-5D * (double)var1.field3498 * (double)var2.field3389) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3392 != null) {
			var4 = var1.field3505;
			var5 = var2.field3392[var1.field3500 * 4 + 1];
			if (var1.field3500 * 4 < var2.field3392.length - 2) {
				var6 = (var2.field3392[var1.field3500 * 4] & 255) << 8;
				var7 = (var2.field3392[var1.field3500 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3392[var1.field3500 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		if (var1.field3501 > 0 && var2.field3398 != null) {
			var4 = var1.field3501;
			var5 = var2.field3398[var1.field3502 * 4 + 1];
			if (var1.field3502 * 4 < var2.field3398.length - 2) {
				var6 = (var2.field3398[var1.field3502 * 4] & 255) << 8;
				var7 = (var2.field3398[var1.field3502 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3398[var1.field3502 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lmg;I)I",
		garbageValue = "-1781769455"
	)
	int method5808(MusicPatchNode var1) {
		int var2 = this.field3417[var1.field3497];
		return var2 < 8192 ? var2 * var1.field3494 + 32 >> 6 : 16384 - ((128 - var1.field3494) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-25"
	)
	void method5814() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3430; var2 == this.trackLength; var3 = this.midiFile.method5924(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3434 || var2 == 0) {
							this.method5803();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method5806(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3430 = var3;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lmg;I)Z",
		garbageValue = "845643756"
	)
	boolean method5888(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3501 >= 0) {
				var1.remove();
				if (var1.field3503 > 0 && var1 == this.field3432[var1.field3497][var1.field3503]) {
					this.field3432[var1.field3497][var1.field3503] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lmg;[IIII)Z",
		garbageValue = "1875808849"
	)
	boolean method5816(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3506 = PcmPlayer.field293 / 100;
		if (var1.field3501 < 0 || var1.stream != null && !var1.stream.method920()) {
			int var5 = var1.field3499;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field3424[var1.field3497]) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3499 = var5;
			}

			var1.stream.method918(this.method5843(var1));
			MusicPatchNode2 var6 = var1.field3490;
			boolean var7 = false;
			++var1.field3487;
			var1.field3504 += var6.field3394;
			double var8 = 5.086263020833333E-6D * (double)((var1.field3492 - 60 << 8) + (var1.field3496 * var1.field3499 >> 12));
			if (var6.field3389 > 0) {
				if (var6.field3387 > 0) {
					var1.field3498 = var1.field3498 * 380125184 + (int)(128.0D * Math.pow(2.0D, (double)var6.field3387 * var8) + 0.5D) * 380125184;
				} else {
					var1.field3498 = var1.field3498 * 380125184 + 1411383296;
				}
			}

			if (var6.field3392 != null) {
				if (var6.field3388 > 0) {
					var1.field3505 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3388) + 0.5D);
				} else {
					var1.field3505 += 128;
				}

				while (var1.field3500 * 4 < var6.field3392.length - 2 && var1.field3505 > (var6.field3392[var1.field3500 * 4 + 2] & 255) << 8) {
					var1.field3500 = var1.field3500 * 4 + 2;
				}

				if (var1.field3500 * 4 == var6.field3392.length - 2 && var6.field3392[var1.field3500 * 4 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field3501 >= 0 && var6.field3398 != null && (this.field3413[var1.field3497] & 1) == 0 && (var1.field3503 < 0 || var1 != this.field3432[var1.field3497][var1.field3503])) {
				if (var6.field3391 > 0) {
					var1.field3501 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3391) + 0.5D);
				} else {
					var1.field3501 += 128;
				}

				while (var1.field3502 * 4 < var6.field3398.length - 2 && var1.field3501 > (var6.field3398[var1.field3502 * 4 + 2] & 255) << 8) {
					var1.field3502 = var1.field3502 * 4 + 2;
				}

				if (var1.field3502 * 4 == var6.field3398.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method917(var1.field3506);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method921()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method5998();
				if (var1.field3501 >= 0) {
					var1.remove();
					if (var1.field3503 > 0 && var1 == this.field3432[var1.field3497][var1.field3503]) {
						this.field3432[var1.field3497][var1.field3503] = null;
					}
				}

				return true;
			} else {
				var1.stream.method925(var1.field3506, this.method5849(var1), this.method5808(var1));
				return false;
			}
		} else {
			var1.method5998();
			var1.remove();
			if (var1.field3503 > 0 && var1 == this.field3432[var1.field3497][var1.field3503]) {
				this.field3432[var1.field3497][var1.field3503] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnn;",
		garbageValue = "1169137618"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4235, PlayerType.PlayerType_ultimateIronman, PlayerType.field4229, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_playerModerator, PlayerType.field4240, PlayerType.field4238, PlayerType.PlayerType_ironman, PlayerType.PlayerType_normal, PlayerType.field4245, PlayerType.field4244, PlayerType.field4243, PlayerType.PlayerType_hardcoreIronman, PlayerType.field4241, PlayerType.field4239, PlayerType.field4242, PlayerType.field4237};
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[Lum;",
		garbageValue = "37"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.field5193, FillMode.field5196, FillMode.SOLID};
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Ljt;",
		garbageValue = "2017214624"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			var1 = ArchiveLoader.method2254(VarpDefinition.SequenceDefinition_animationsArchive, class485.SequenceDefinition_skeletonsArchive, var0, false);
			if (var1 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1;
		}
	}
}
