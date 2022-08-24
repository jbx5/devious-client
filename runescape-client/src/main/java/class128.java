import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("dh")
public abstract class class128 extends Node {
	class128() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "-885940784")
	abstract void vmethod3087(Buffer var1);

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Leh;B)V", garbageValue = "0")
	abstract void vmethod3084(ClanSettings var1);

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(III)Lkn;", garbageValue = "-1307186333")
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = HitSplatDefinition.getWidget(var0);
		if (var1 == -1) {
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "-99")
	static final void method2801(String var0) {
		class4.method20("Please remove " + var0 + " from your ignore list first");
	}
}