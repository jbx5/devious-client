import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
public enum class231 implements MouseWheel {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field2429((byte)-1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field2426((byte)0),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field2428((byte)1),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field2427((byte)2);

	@ObfuscatedName("ao")
	public byte field2430;

	class231(byte var3) {
		this.field2430 = var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2430;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;B)Z",
		garbageValue = "-81"
	)
	static boolean method4387(Date var0) {
		Date var1 = class314.method5897();
		return var0.after(var1);
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(Lnm;IB)Ljava/lang/String;",
		garbageValue = "-29"
	)
	static String method4382(Widget var0, int var1) {
		int var3 = MouseRecorder.getWidgetFlags(var0);
		boolean var2 = (var3 >> var1 + 1 & 1) != 0;
		if (!var2 && var0.onOp == null) {
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null;
		}
	}
}
