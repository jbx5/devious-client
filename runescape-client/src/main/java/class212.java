import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public class class212 extends Node {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1764748121
	)
	public int field2311;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 103416025
	)
	public int field2312;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1783745811
	)
	public int field2310;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public Widget field2313;

	@ObfuscatedSignature(
		descriptor = "(IIILmt;)V"
	)
	public class212(int var1, int var2, int var3, Widget var4) {
		this.field2310 = var1;
		this.field2311 = var2;
		this.field2312 = var3;
		this.field2313 = var4;
	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(Lmt;II)Ljava/lang/String;",
		garbageValue = "-1905887286"
	)
	static String method4141(Widget var0, int var1) {
		int var3 = UserComparator8.getWidgetFlags(var0);
		boolean var2 = (var3 >> var1 + 1 & 1) != 0;
		if (!var2 && var0.onOp == null) {
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null;
		}
	}
}
