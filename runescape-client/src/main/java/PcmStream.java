import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("az")
	int field326;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("ad")
	@Export("active")
	volatile boolean active;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Lbg;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Lbg;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("ae")
	protected abstract int vmethod6791();

	@ObfuscatedName("am")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("au")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("bt")
	int vmethod1061() {
		return 255;
	}

	@ObfuscatedName("ga")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
