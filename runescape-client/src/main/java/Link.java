import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ou")
@Implements("Link")
public class Link {
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lou;")
	@Export("previous")
	public Link previous;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lou;")
	@Export("next")
	public Link next;

	@ObfuscatedName("c")
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