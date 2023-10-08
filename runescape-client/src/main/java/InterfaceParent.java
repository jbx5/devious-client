import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1919932593
	)
	@Export("group")
	int group;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1828374187
	)
	@Export("type")
	int type;
	@ObfuscatedName("ak")
	boolean field1074;

	InterfaceParent() {
		this.field1074 = false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I[B[BI)V",
		garbageValue = "101462872"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3752 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3752 = new byte[11][];
			var0.field3779 = new byte[11][];
			var0.field3770 = new int[11];
			var0.field3800 = new int[11];
		}

		var0.field3752[var1] = var2;
		if (var2 != null) {
			var0.field3751 = true;
		} else {
			var0.field3751 = false;

			for (int var4 = 0; var4 < var0.field3752.length; ++var4) {
				if (var0.field3752[var4] != null) {
					var0.field3751 = true;
					break;
				}
			}
		}

		var0.field3779[var1] = var3;
	}

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "554905289"
	)
	static String method2312(String var0) {
		PlayerType[] var1 = class183.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon != -1 && var0.startsWith(class436.method7916(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}

		return var0;
	}
}
