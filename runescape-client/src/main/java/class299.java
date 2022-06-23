import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.io.IOException;
@ObfuscatedName("kq")
public final class class299 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Lcv;", garbageValue = "268550387")
	static ClientPreferences method5754() {
		AccessFile var0 = null;
		ClientPreferences var1 = new ClientPreferences();
		try {
			var0 = class67.getPreferencesFile("", class285.field3313.name, false);
			byte[] var2 = new byte[((int) (var0.length()))];
			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var0.read(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new IOException();
				}
			}
			var1 = new ClientPreferences(new Buffer(var2));
		} catch (Exception var6) {
		}
		try {
			if (var0 != null) {
				var0.close();
			}
		} catch (Exception var5) {
		}
		return var1;
	}
}