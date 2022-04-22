import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("cd")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(descriptor = 
	"Loz;")

	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(descriptor = 
	"Loz;")

	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("de")
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