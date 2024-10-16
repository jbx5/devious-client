import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tp")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("ey")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("kg")
	@Export("removeDual")
	public void removeDual() {
		if (this.nextDual != null) {
			this.nextDual.previousDual = this.previousDual;
			this.previousDual.nextDual = this.nextDual;
			this.previousDual = null;
			this.nextDual = null;
		}
	}
}
