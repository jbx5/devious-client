import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	NodeDeque field239;
	@ObfuscatedName("ag")
	int field241;
	@ObfuscatedName("am")
	int field238;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field239 = new NodeDeque();
		this.field241 = 0;
		this.field238 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lbk;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lbk;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("ag")
	void method714() {
		if (this.field241 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field239.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field239.previous()) {
				var1.field390 -= this.field241;
			}

			this.field238 -= this.field241;
			this.field241 = 0;
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lto;Lcu;)V"
	)
	void method711(Node var1, PcmStreamMixerListener var2) {
		while (this.field239.sentinel != var1 && ((PcmStreamMixerListener)var1).field390 <= var2.field390) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field238 = ((PcmStreamMixerListener)this.field239.sentinel.previous).field390;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lcu;)V"
	)
	void method725(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field239.sentinel.previous;
		if (var2 == this.field239.sentinel) {
			this.field238 = -1;
		} else {
			this.field238 = ((PcmStreamMixerListener)var2).field390;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("at")
	protected int vmethod6731() {
		return 0;
	}

	@ObfuscatedName("au")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field238 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field241 < this.field238) {
				this.field241 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field238 - this.field241;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field241 += var4;
			this.method714();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field239.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field390 = 0;
					this.method725(var5);
				} else {
					var5.field390 = var7;
					this.method711(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("ar")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("al")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field238 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field241 + var1 < this.field238) {
				this.field241 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field238 - this.field241;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field241 += var2;
			this.method714();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field239.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field390 = 0;
					this.method725(var3);
				} else {
					var3.field390 = var5;
					this.method711(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("ad")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
