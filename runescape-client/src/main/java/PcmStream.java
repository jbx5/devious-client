import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("av")
	int field353;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("ay")
	@Export("active")
	volatile boolean active;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Lbl;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Lbl;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("ao")
	protected abstract int vmethod6281();

	@ObfuscatedName("ae")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("au")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("bx")
	int vmethod1061() {
		return 255;
	}

	@ObfuscatedName("fm")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
