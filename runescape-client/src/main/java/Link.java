import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tf")
@Implements("Link")
public class Link {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	@Export("next")
	public Link next;

	@ObfuscatedName("aq")
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
