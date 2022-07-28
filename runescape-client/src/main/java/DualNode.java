import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ob")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("dm")
	@Export("keyDual")
	public long keyDual;

	@ObfuscatedName("da")
	@ObfuscatedSignature(descriptor = "Lob;")
	@Export("previousDual")
	public DualNode previousDual;

	@ObfuscatedName("dr")
	@ObfuscatedSignature(descriptor = "Lob;")
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("dk")
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