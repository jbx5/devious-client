import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sw")
@Implements("Link")
public class Link {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
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
