import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public class class149 extends class150 {
	@ObfuscatedName("du")
	static boolean field1696;
	@ObfuscatedName("hr")
	static String field1700;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -836247655
	)
	int field1697;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class149(class153 var1) {
		this.this$0 = var1;
		this.field1697 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-1813719027"
	)
	void vmethod3822(Buffer var1) {
		this.field1697 = var1.readUnsignedShort();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgy;I)V",
		garbageValue = "-2079483058"
	)
	void vmethod3821(ClanSettings var1) {
		var1.method3660(this.field1697);
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "276753757"
	)
	static final void method3569() {
		if (DynamicObject.pcmPlayer1 != null) {
			DynamicObject.pcmPlayer1.run();
		}

	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1794836673"
	)
	static final boolean method3568(int var0) {
		if (var0 >= 2000) {
			var0 -= 2000;
		}

		return var0 == 1007;
	}
}
