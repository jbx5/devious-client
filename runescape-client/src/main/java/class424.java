import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("pw")
public class class424 {
	@ObfuscatedName("f")
	public static final char[] field4634 = new char[]{ ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@ObfuscatedName("u")
	public static final char[] field4637 = new char[]{ '[', ']', '#' };

	@ObfuscatedName("kg")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1065463731")
	static void method7495() {
		for (InterfaceParent var0 = ((InterfaceParent) (Client.interfaceParents.first())); var0 != null; var0 = ((InterfaceParent) (Client.interfaceParents.next()))) {
			int var1 = var0.group;
			if (ReflectionCheck.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = Widget.Widget_interfaceComponents[var1];
				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}
				if (!var2) {
					var4 = ((int) (var0.key));
					Widget var5 = FloorUnderlayDefinition.getWidget(var4);
					if (var5 != null) {
						class220.invalidateWidget(var5);
					}
				}
			}
		}
	}
}