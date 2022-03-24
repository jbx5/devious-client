import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-652045891)

	public int field4259;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lqy;")

	@Export("username")
	public Username username;
	@ObfuscatedName("h")
	@Export("world")
	public short world;

	@ObfuscatedSignature(descriptor = 
	"(Lqy;I)V")

	FriendLoginUpdate(Username var1, int var2) {
		this.field4259 = ((int) (WorldMapSprite.getServerTime() / 1000L));
		this.username = var1;
		this.world = ((short) (var2));
	}

	@ObfuscatedName("o")
	static final void method6731(long var0) {
		try {
			Thread.sleep(var0);
		} catch (InterruptedException var3) {
		}

	}
}