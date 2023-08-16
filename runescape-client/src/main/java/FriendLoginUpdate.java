import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qg")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = 175102541
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -508388215
	)
	public int field4651;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("ao")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Luc;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4651 = (int)(GameEngine.method661() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}
}
