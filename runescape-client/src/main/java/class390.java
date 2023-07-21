import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
public class class390 extends RuntimeException {
	public class390(String var1, Object[] var2) {
		super(String.format(var1, var2));
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-79"
	)
	static final void method7262() {
		PacketBufferNode var0 = class503.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field864 = true;

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				Actor.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			class200.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field864 = false;
	}
}
