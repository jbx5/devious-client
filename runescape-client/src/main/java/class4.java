import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("b")
public final class class4 {
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", garbageValue = 
	"1921636813")

	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-5")

	static void method17() {
		PacketBufferNode var0 = WorldMapSprite.getPacketBufferNode(ClientPacket.field3000, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(Client.getWindowedMode());
		var0.packetBuffer.writeShort(InvDefinition.canvasWidth);
		var0.packetBuffer.writeShort(class321.canvasHeight);
		Client.packetWriter.addNode(var0);
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(descriptor = 
	"(IIII)Lcc;", garbageValue = 
	"-1034458506")

	static final InterfaceParent method16(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, ((long) (var0)));
		class29.Widget_resetModelFrames(var1);
		Widget var4 = class127.getWidget(var0);
		class346.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			class346.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		AbstractByteArrayCopier.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var0 >> 16], var4, false);
		class145.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != (-1)) {
			MouseRecorder.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}