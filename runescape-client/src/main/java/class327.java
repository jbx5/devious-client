import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("lb")
public class class327 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Llb;")
	static final class327 field4087 = new class327();

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Llb;")
	static final class327 field4088 = new class327();

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Llb;")
	static final class327 field4086 = new class327();

	class327() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1442599873")
	public static void method5978() {
		ByteArrayPool.field4218.clear();
		ByteArrayPool.field4218.add(100);
		ByteArrayPool.field4218.add(5000);
		ByteArrayPool.field4218.add(10000);
		ByteArrayPool.field4218.add(30000);
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-869460521")
	static void method5979() {
		for (InterfaceParent var0 = ((InterfaceParent) (Client.interfaceParents.first())); var0 != null; var0 = ((InterfaceParent) (Client.interfaceParents.next()))) {
			int var1 = var0.group;
			if (ParamComposition.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = class358.Widget_interfaceComponents[var1];
				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}
				if (!var2) {
					var4 = ((int) (var0.key));
					Widget var5 = HitSplatDefinition.getWidget(var4);
					if (var5 != null) {
						class125.invalidateWidget(var5);
					}
				}
			}
		}
	}
}