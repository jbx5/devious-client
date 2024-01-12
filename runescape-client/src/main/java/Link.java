import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sv")
@Implements("Link")
public class Link {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	@Export("next")
	public Link next;

	@ObfuscatedName("am")
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
