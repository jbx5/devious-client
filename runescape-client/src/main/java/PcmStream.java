import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("ae")
	int field376;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("ad")
	@Export("active")
	volatile boolean active;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("az")
	protected abstract int vmethod6028();

	@ObfuscatedName("av")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("aq")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("by")
	int vmethod1051() {
		return 255;
	}

	@ObfuscatedName("gy")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
