import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("aa")
	int field334;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("ao")
	@Export("active")
	volatile boolean active;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("at")
	protected abstract int vmethod6731();

	@ObfuscatedName("au")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("al")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("bt")
	int vmethod1054() {
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
