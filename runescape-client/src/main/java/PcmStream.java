import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lbj;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("ag")
	int field348;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lcx;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("ad")
	@Export("active")
	volatile boolean active;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("az")
	protected abstract int vmethod6346();

	@ObfuscatedName("ao")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("ak")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("bh")
	int vmethod1014() {
		return 255;
	}

	@ObfuscatedName("gk")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
