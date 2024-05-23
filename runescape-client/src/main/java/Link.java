import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tq")
@Implements("Link")
public class Link {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	@Export("next")
	public Link next;

	@ObfuscatedName("ak")
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
