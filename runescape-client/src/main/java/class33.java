import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
public class class33 {
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 1550817359
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("vy")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1592180729
	)
	int field175;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2000861833
	)
	int field176;

	class33(int var1, int var2) {
		this.field175 = var1;
		this.field176 = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lbi;B)Z",
		garbageValue = "125"
	)
	boolean method475(class29 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field175) {
			case 1:
				return var1.vmethod4410(this.field176);
			case 2:
				return var1.vmethod4411(this.field176);
			case 3:
				return var1.vmethod4412((char)this.field176);
			case 4:
				return var1.vmethod4414(this.field176 == 1);
			default:
				return false;
			}
		}
	}
}
