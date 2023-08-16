import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sq")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("ej")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("ex")
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
