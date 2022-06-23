import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("nt")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("uj")
	@ObfuscatedGetter(intValue = -1573630725)
	@Export("foundItemIndex")
	static int foundItemIndex;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lnt;")
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lnt;")
	@Export("TriBool_true")
	public static final TriBool TriBool_true;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lnt;")
	@Export("TriBool_false")
	public static final TriBool TriBool_false;

	static {
		TriBool_unknown = new TriBool();
		TriBool_true = new TriBool();
		TriBool_false = new TriBool();
	}

	TriBool() {
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "114016538")
	static final void method6791(boolean var0) {
		if (var0) {
			Client.field515 = (Login.field895) ? class124.field1544 : class124.field1550;
		} else {
			Client.field515 = (class19.clientPreferences.parameters.containsKey(Projectile.method1950(Login.Login_username))) ? class124.field1546 : class124.field1543;
		}
	}
}