import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sj")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2061610665
	)
	public int field4978;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lwf;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("ag")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lwf;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4978 = (int)(WorldMapElement.method3843() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}
}
