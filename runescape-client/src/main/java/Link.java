import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sn")
@Implements("Link")
public class Link {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	@Export("next")
	public Link next;

	@ObfuscatedName("az")
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
