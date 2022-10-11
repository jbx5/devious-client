import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
public class class399 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	public static final class399 field4470;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	static final class399 field4467;
	@ObfuscatedName("f")
	String field4468;

	static {
		field4470 = new class399("application/json"); // L: 4
		field4467 = new class399("text/plain"); // L: 5
	}

	class399(String var1) {
		this.field4468 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "3"
	)
	public String method7299() {
		return this.field4468; // L: 13
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llv;B)V",
		garbageValue = "16"
	)
	public static void method7302(AbstractArchive var0) {
		DbTableType.field4708 = var0; // L: 19
	} // L: 20

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V",
		garbageValue = "2129607347"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.isMenuOpen) { // L: 9382
			if (Client.menuOptionsCount < 500) { // L: 9383
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 9384
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 9385
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 9386
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 9387
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 9388
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 9389
				Client.menuItemIds[Client.menuOptionsCount] = var6; // L: 9390
				Client.menuShiftClick[Client.menuOptionsCount] = var7; // L: 9391
				++Client.menuOptionsCount; // L: 9392
			}

		}
	} // L: 9394
}
