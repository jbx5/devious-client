import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class163 extends class144 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1490830621
	)
	int field1762;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class163(class147 var1) {
		this.this$0 = var1;
		this.field1762 = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-734756620"
	)
	void vmethod3510(Buffer var1) {
		this.field1762 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfc;I)V",
		garbageValue = "-2111347169"
	)
	void vmethod3506(ClanSettings var1) {
		var1.method3366(this.field1762);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-114"
	)
	static final void method3461() {
		WorldMapArea.method4622("You can't add yourself to your own friend list");
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2130928035"
	)
	static boolean method3462(int var0) {
		for (int var1 = 0; var1 < Client.field726; ++var1) {
			if (Client.field518[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
