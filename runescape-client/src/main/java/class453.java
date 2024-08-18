import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rv")
public class class453 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILuq;B)Z",
		garbageValue = "0"
	)
	public static boolean method8428(int var0, class543 var1) {
		return (var0 & var1.rsOrdinal()) != 0;
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Lcv;III)V",
		garbageValue = "-890822604"
	)
	static final void method8429(MenuAction var0, int var1, int var2) {
		if (var0 != null) {
			GrandExchangeEvents.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.itemId, var0.worldViewId, var0.action, var0.target, var1, var2);
		}

	}
}
