import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
public class class243 {
	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	static Task field2538;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;I)I",
		garbageValue = "-1696918894"
	)
	static int method4565(AbstractArchive var0) {
		int var1 = Login.field955.length + Login.field940.length;
		String[] var2 = Login.field942;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			String var4 = var2[var3];
			if (var0.getGroupId(var4) != -1) {
				++var1;
			}
		}

		return var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2028841376"
	)
	public static boolean method4563() {
		return !class330.field3585.isEmpty();
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Lcj;III)V",
		garbageValue = "2065080322"
	)
	static final void method4564(MenuAction var0, int var1, int var2) {
		if (var0 != null) {
			MenuAction.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.itemId, var0.worldViewId, var0.action, var0.target, var1, var2);
		}

	}
}
