import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("st")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("eb")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lst;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lst;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("fi")
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
