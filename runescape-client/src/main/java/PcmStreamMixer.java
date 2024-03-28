import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	NodeDeque field247;
	@ObfuscatedName("af")
	int field248;
	@ObfuscatedName("at")
	int field249;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field247 = new NodeDeque();
		this.field248 = 0;
		this.field249 = -1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lba;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lba;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("af")
	void method677() {
		if (this.field248 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field247.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field247.previous()) {
				var1.field391 -= this.field248;
			}

			this.field249 -= this.field248;
			this.field248 = 0;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lsu;Lcg;)V"
	)
	void method675(Node var1, PcmStreamMixerListener var2) {
		while (this.field247.sentinel != var1 && ((PcmStreamMixerListener)var1).field391 <= var2.field391) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field249 = ((PcmStreamMixerListener)this.field247.sentinel.previous).field391;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lcg;)V"
	)
	void method676(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field247.sentinel.previous;
		if (var2 == this.field247.sentinel) {
			this.field249 = -1;
		} else {
			this.field249 = ((PcmStreamMixerListener)var2).field391;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("aw")
	protected int vmethod6214() {
		return 0;
	}

	@ObfuscatedName("ad")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field249 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field248 < this.field249) {
				this.field248 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field249 - this.field248;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field248 += var4;
			this.method677();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field247.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field391 = 0;
					this.method676(var5);
				} else {
					var5.field391 = var7;
					this.method675(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("al")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("as")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field249 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field248 + var1 < this.field249) {
				this.field248 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field249 - this.field248;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field248 += var2;
			this.method677();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field247.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field391 = 0;
					this.method676(var3);
				} else {
					var3.field391 = var5;
					this.method675(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("ag")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
