import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("pv")
final class class434 implements class429 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lqr;I)V", garbageValue = "1286167930")
	public void vmethod7506(Object var1, Buffer var2) {
		this.method7508(((String) (var1)), var2);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lqr;B)Ljava/lang/Object;", garbageValue = "36")
	public Object vmethod7514(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lqr;I)V", garbageValue = "1029497331")
	void method7508(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(Lbd;Lbd;IZI)I", garbageValue = "1892264087")
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}
				if (var5 == -1) {
					var5 = 2001;
				}
			}
			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1596() ? var1.method1596() ? 0 : 1 : var1.method1596() ? -1 : 0;
		} else if (var2 == 5) {
			return var0.method1587() ? var1.method1587() ? 0 : 1 : var1.method1587() ? -1 : 0;
		} else if (var2 == 6) {
			return var0.isPvp() ? var1.isPvp() ? 0 : 1 : var1.isPvp() ? -1 : 0;
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? var1.isMembersOnly() ? 0 : 1 : var1.isMembersOnly() ? -1 : 0;
		} else {
			return var0.id - var1.id;
		}
	}
}