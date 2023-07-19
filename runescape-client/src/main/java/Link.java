import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sp")
@Implements("Link")
public class Link {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("next")
	public Link next;

	@ObfuscatedName("aw")
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
