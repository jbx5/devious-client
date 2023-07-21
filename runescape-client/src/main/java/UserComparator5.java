import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	static AbstractSocket field1461;
	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = 1108296275
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("aw")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lqa;Lqa;I)I",
		garbageValue = "-382682288"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) {
			if (var2.world == 0) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "55"
	)
	static final void method2875() {
		Tile.method4399("Your ignore list is full. Max of 100 for free users, and 400 for members");
	}
}
