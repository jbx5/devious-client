import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 278788719
	)
	public int field4346;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lqo;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("f")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lqo;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4346 = (int)(Language.method6232() / 1000L); // L: 109
		this.username = var1; // L: 110
		this.world = (short)var2; // L: 111
	} // L: 112

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Lkw;Lgk;IIZB)V",
		garbageValue = "33"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions; // L: 10554
		byte var6 = -1; // L: 10555
		String var7 = null; // L: 10556
		if (var5 != null && var5[var3] != null) { // L: 10557
			if (var3 == 0) { // L: 10558
				var6 = 33;
			} else if (var3 == 1) { // L: 10559
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35; // L: 10560
			} else if (var3 == 3) { // L: 10561
				var6 = 36;
			} else {
				var6 = 37; // L: 10562
			}

			var7 = var5[var3]; // L: 10563
		} else if (var3 == 4) { // L: 10566
			var6 = 37; // L: 10567
			var7 = "Drop"; // L: 10568
		}

		if (var6 != -1 && var7 != null) { // L: 10571
			class399.insertMenuItem(var7, SoundCache.colorStartTag(16748608) + var1.name, var6, 0, var2, var0.id, var1.id, var4); // L: 10572
		}

	} // L: 10574
}
