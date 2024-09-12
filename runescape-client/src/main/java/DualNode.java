import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tr")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("ef")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("jz")
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
