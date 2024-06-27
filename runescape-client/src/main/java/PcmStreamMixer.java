import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	NodeDeque field242;
	@ObfuscatedName("ag")
	int field241;
	@ObfuscatedName("ak")
	int field239;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field242 = new NodeDeque();
		this.field241 = 0;
		this.field239 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lbk;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lbk;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("ag")
	void method717() {
		if (this.field241 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field242.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field242.previous()) {
				var1.field379 -= this.field241;
			}

			this.field239 -= this.field241;
			this.field241 = 0;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ltz;Lcm;)V"
	)
	void method741(Node var1, PcmStreamMixerListener var2) {
		while (this.field242.sentinel != var1 && ((PcmStreamMixerListener)var1).field379 <= var2.field379) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field239 = ((PcmStreamMixerListener)this.field242.sentinel.previous).field379;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lcm;)V"
	)
	void method719(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field242.sentinel.previous;
		if (var2 == this.field242.sentinel) {
			this.field239 = -1;
		} else {
			this.field239 = ((PcmStreamMixerListener)var2).field379;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("av")
	protected int vmethod6390() {
		return 0;
	}

	@ObfuscatedName("ab")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field239 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field241 < this.field239) {
				this.field241 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field239 - this.field241;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field241 += var4;
			this.method717();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field242.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field379 = 0;
					this.method719(var5);
				} else {
					var5.field379 = var7;
					this.method741(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("ai")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("ae")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field239 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field241 + var1 < this.field239) {
				this.field241 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field239 - this.field241;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field241 += var2;
			this.method717();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field242.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field379 = 0;
					this.method719(var3);
				} else {
					var3.field379 = var5;
					this.method741(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("au")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
