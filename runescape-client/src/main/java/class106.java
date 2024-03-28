import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
final class class106 implements class339 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1419582299
	)
	static int field1375;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lnt;)V"
	)
	class106(Widget var1) {
		this.val$cc = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1847242304"
	)
	public void vmethod6279() {
		if (this.val$cc != null && this.val$cc.method6683().field3676 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2305(this.val$cc);
			var1.setArgs(this.val$cc.method6683().field3676);
			class131.method3048().addFirst(var1);
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "50"
	)
	static void method2699(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance);
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "380838610"
	)
	public static int method2696(int var0, int var1, int var2) {
		int var3 = class75.method2089(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-117"
	)
	public static void method2698() {
		KitDefinition.KitDefinition_cached.clear();
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "410458647"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		PacketBufferNode.logOut();
		switch(var0) {
		case 1:
			class210.method3930(24);
			class59.setLoginResponseString("", "You were disconnected from the server.", "");
			break;
		case 2:
			class210.method3930(24);
			class59.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
		}

	}
}
