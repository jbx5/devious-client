import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("as")
	static int[][][] field1486;
	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("ac")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lri;Lri;B)I",
		garbageValue = "1"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "97"
	)
	static final void method2942(boolean var0) {
		if (var0) {
			Client.field558 = Login.field951 ? class141.field1627 : class141.field1629;
		} else {
			Client.field558 = class91.clientPreferences.method2527(Login.Login_username) ? class141.field1635 : class141.field1630;
		}

	}
}
