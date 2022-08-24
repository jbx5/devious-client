import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("of")
@Implements("Link")
public class Link {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lof;")
	@Export("previous")
	public Link previous;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lof;")
	@Export("next")
	public Link next;

	@ObfuscatedName("s")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}
}