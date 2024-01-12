import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rm")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("am")
	boolean field4718;
	@ObfuscatedName("ap")
	boolean field4717;

	Friend() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrm;I)I",
		garbageValue = "-900411691"
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
		} else if (this.field4718 && !var1.field4718) {
			return -1;
		} else if (!this.field4718 && var1.field4718) {
			return 1;
		} else if (this.field4717 && !var1.field4717) {
			return -1;
		} else if (!this.field4717 && var1.field4717) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrq;B)I",
		garbageValue = "111"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1983288800"
	)
	public static void method8228() {
		VarbitComposition.VarbitDefinition_cached.clear();
	}
}
