import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	NodeDeque field275;
	@ObfuscatedName("ar")
	int field274;
	@ObfuscatedName("am")
	int field277;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field275 = new NodeDeque();
		this.field274 = 0;
		this.field277 = -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lby;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lby;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("ar")
	void method725() {
		if (this.field274 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field275.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field275.previous()) {
				var1.field429 -= this.field274;
			}

			this.field277 -= this.field274;
			this.field274 = 0;
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lsb;Lcs;)V"
	)
	void method738(Node var1, PcmStreamMixerListener var2) {
		while (this.field275.sentinel != var1 && ((PcmStreamMixerListener)var1).field429 <= var2.field429) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field277 = ((PcmStreamMixerListener)this.field275.sentinel.previous).field429;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lcs;)V"
	)
	void method715(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field275.sentinel.previous;
		if (var2 == this.field275.sentinel) {
			this.field277 = -1;
		} else {
			this.field277 = ((PcmStreamMixerListener)var2).field429;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("az")
	protected int vmethod6028() {
		return 0;
	}

	@ObfuscatedName("av")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field277 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field274 < this.field277) {
				this.field274 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field277 - this.field274;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field274 += var4;
			this.method725();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field275.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field429 = 0;
					this.method715(var5);
				} else {
					var5.field429 = var7;
					this.method738(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("ap")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("aq")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field277 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field274 + var1 < this.field277) {
				this.field274 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field277 - this.field274;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field274 += var2;
			this.method725();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field275.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field429 = 0;
					this.method715(var3);
				} else {
					var3.field429 = var5;
					this.method738(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("at")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
