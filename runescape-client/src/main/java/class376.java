import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("oy")
public class class376 {
	static {
		int var0 = 0;
		int var1 = 0;
		class371[] var2 = ParamComposition.method4110();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class371 var4 = var2[var3];
			if (var4.field4045 > var0) {
				var0 = var4.field4045;
			}

			if (var4.field4046 > var1) {
				var1 = var4.field4046;
			}
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-1672104084"
	)
	static int method7148(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else {
			return 2;
		}
	}
}
