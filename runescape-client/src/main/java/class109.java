import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
final class class109 implements class348 {
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static StudioGame field1400;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lnx;)V"
	)
	class109(Widget var1) {
		this.val$cc = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2099855571"
	)
	public void vmethod6510() {
		if (this.val$cc != null && this.val$cc.method6892().field3766 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2378(this.val$cc);
			var1.setArgs(this.val$cc.method6892().field3766);
			Varps.method6447().addFirst(var1);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lth;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1909911513"
	)
	static String method2817(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	static final void method2818() {
		PacketBufferNode var0 = class170.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field870 = true;

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				ArchiveDiskActionHandler.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			TriBool.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field870 = false;
	}
}
