import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("oa")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("dd")
	@Export("keyDual")
	public long keyDual;

	@ObfuscatedName("dz")
	@ObfuscatedSignature(descriptor = "Loa;")
	@Export("previousDual")
	public DualNode previousDual;

	@ObfuscatedName("do")
	@ObfuscatedSignature(descriptor = "Loa;")
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("db")
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