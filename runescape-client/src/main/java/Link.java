import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tn")
@Implements("Link")
public class Link {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	@Export("next")
	public Link next;

	@ObfuscatedName("ap")
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
