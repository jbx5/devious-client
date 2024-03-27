import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class170 extends class185 {
	@ObfuscatedName("vu")
	@ObfuscatedGetter(
		longValue = 7470982254105549161L
	)
	static long field1839;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1983326257
	)
	int field1836;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	final class182 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lhq;Ljava/lang/String;I)V"
	)
	class170(class182 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1836 = var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1882788400"
	)
	public int vmethod3670() {
		return 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1487447727"
	)
	public int vmethod3671() {
		return this.field1836;
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "160947630"
	)
	static void method3431() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (class243.widgetDefinition.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = class243.widgetDefinition.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = class243.widgetDefinition.method6281(var4);
					if (var5 != null) {
						WorldMapData_0.invalidateWidget(var5);
					}
				}
			}
		}

	}
}
