import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rr")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1250536245
	)
	public int field4691;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("ak")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4691 = (int)(GrandExchangeOfferTotalQuantityComparator.method7049() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}
}
