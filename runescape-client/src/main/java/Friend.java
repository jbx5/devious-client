import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("v")
	boolean field4256;
	@ObfuscatedName("o")
	boolean field4257;

	Friend() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lnk;I)I", garbageValue = 
	"985584211")

	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if ((super.world == Client.worldId) && (Client.worldId != var1.world)) {
			return -1;
		} else if ((Client.worldId == var1.world) && (super.world != Client.worldId)) {
			return 1;
		} else if ((super.world != 0) && (var1.world == 0)) {
			return -1;
		} else if ((var1.world != 0) && (super.world == 0)) {
			return 1;
		} else if (this.field4256 && (!var1.field4256)) {
			return -1;
		} else if ((!this.field4256) && var1.field4256) {
			return 1;
		} else if (this.field4257 && (!var1.field4257)) {
			return -1;
		} else if ((!this.field4257) && var1.field4257) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Lnc;S)I", garbageValue = 
	"-8912")

	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend(((Friend) (var1)));
	}

	public int compareTo(Object var1) {
		return this.compareToFriend(((Friend) (var1)));
	}
}