import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("aw")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lqa;Lqa;I)I",
		garbageValue = "-236621973"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Lir;",
		garbageValue = "-164706283"
	)
	static class215[] method2896() {
		return new class215[]{class215.field2352, class215.field2349, class215.field2355, class215.field2351, class215.field2350, class215.field2354, class215.field2353};
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lmt;IB)V",
		garbageValue = "0"
	)
	public static void method2889(Widget var0, int var1) {
		ItemComposition var2 = class125.ItemDefinition_get(var1);
		var0.field3681.equipment[var2.maleModel] = var1 + 512;
		if (var2.maleModel1 != -1) {
			var0.field3681.equipment[var2.maleModel1] = 0;
		}

		if (var2.maleModel2 != -1) {
			var0.field3681.equipment[var2.maleModel2] = 0;
		}

		var0.field3681.method6128();
	}
}
