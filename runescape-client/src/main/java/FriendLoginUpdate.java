import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rn")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1180665603
	)
	public int field4723;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lvs;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("af")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lvs;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4723 = (int)(UserComparator9.method2973() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}
}
