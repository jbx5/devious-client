import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rd")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = -490399289
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("aq")
	boolean field4745;
	@ObfuscatedName("aw")
	boolean field4748;

	Friend() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)I",
		garbageValue = "1533507026"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) {
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) {
			return 1;
		} else if (super.world != 0 && var1.world == 0) {
			return -1;
		} else if (var1.world != 0 && super.world == 0) {
			return 1;
		} else if (this.field4745 && !var1.field4745) {
			return -1;
		} else if (!this.field4745 && var1.field4745) {
			return 1;
		} else if (this.field4748 && !var1.field4748) {
			return -1;
		} else if (!this.field4748 && var1.field4748) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lra;B)I",
		garbageValue = "-67"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldh;",
		garbageValue = "-54"
	)
	static class91[] method8300() {
		return new class91[]{class91.field1132, class91.field1128, class91.field1127, class91.field1123, class91.field1124, class91.field1130};
	}
}
