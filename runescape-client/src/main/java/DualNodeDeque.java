import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
@Implements("DualNodeDeque")
public final class DualNodeDeque {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	@Export("sentinel")
	DualNode sentinel;

	public DualNodeDeque() {
		this.sentinel = new DualNode();
		this.sentinel.previousDual = this.sentinel;
		this.sentinel.nextDual = this.sentinel;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ltm;)V"
	)
	public void method7496(DualNode var1) {
		if (var1.nextDual != null) {
			var1.removeDual();
		}

		var1.nextDual = this.sentinel.nextDual;
		var1.previousDual = this.sentinel;
		var1.nextDual.previousDual = var1;
		var1.previousDual.nextDual = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ltm;)V"
	)
	public void method7493(DualNode var1) {
		if (var1.nextDual != null) {
			var1.removeDual();
		}

		var1.nextDual = this.sentinel;
		var1.previousDual = this.sentinel.previousDual;
		var1.nextDual.previousDual = var1;
		var1.previousDual.nextDual = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Ltm;"
	)
	@Export("removeLast")
	public DualNode removeLast() {
		DualNode var1 = this.sentinel.previousDual;
		return var1 == this.sentinel ? null : var1;
	}
}
