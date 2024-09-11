import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
public class class358 {
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static Archive field3790;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	public class360 field3785;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	class354 field3783;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	class27 field3789;
	@ObfuscatedName("am")
	public Object[] field3786;
	@ObfuscatedName("ax")
	public Object[] field3787;
	@ObfuscatedName("aq")
	public Object[] field3784;
	@ObfuscatedName("af")
	public Object[] field3788;

	class358() {
		this.field3785 = new class360();
		this.field3783 = new class354();
		this.field3789 = new class27();
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lny;B)Ljava/lang/String;",
		garbageValue = "42"
	)
	static String method6876(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					String var4 = var0.substring(0, var3);
					int var6 = ClientPreferences.method2777(var1, var2 - 1);
					String var5;
					if (var6 < 999999999) {
						var5 = Integer.toString(var6);
					} else {
						var5 = "*";
					}

					var0 = var4 + var5 + var0.substring(var3 + 2);
				}
			}
		}

		return var0;
	}
}
