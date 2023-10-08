import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
@Implements("Link")
public class Link {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("next")
	public Link next;

	@ObfuscatedName("ac")
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
