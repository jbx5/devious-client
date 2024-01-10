import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
public class class47 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	VorbisSample field336;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	RawSound field337;
	@ObfuscatedName("af")
	ReentrantLock field334;

	@ObfuscatedSignature(
		descriptor = "(Lci;Lbm;)V"
	)
	class47(VorbisSample var1, RawSound var2) {
		this.field336 = var1;
		this.field337 = var2;
		this.field334 = new ReentrantLock();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-36"
	)
	static void method913() {
		if (Login.clearLoginScreen) {
			Login.titleboxSprite = null;
			class182.titlebuttonSprite = null;
			Login.runesSprite = null;
			Buddy.leftTitleSprite = null;
			SecureRandomCallable.rightTitleSprite = null;
			GrandExchangeEvents.logoSprite = null;
			Clock.title_muteSprite = null;
			class182.options_buttons_0Sprite = null;
			class402.options_buttons_2Sprite = null;
			class167.worldSelectBackSprites = null;
			class131.worldSelectFlagSprites = null;
			Client.worldSelectArrows = null;
			class326.worldSelectStars = null;
			class155.field1725 = null;
			SpriteMask.loginScreenRunesAnimation.method2509();
			Actor.method2488(0, 100);
			class220.method4348().method7126(true);
			Login.clearLoginScreen = false;
		}
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lnn;S)Ljava/lang/String;",
		garbageValue = "3107"
	)
	static String method912(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					String var4 = var0.substring(0, var3);
					int var6 = SecureRandomCallable.method2318(var1, var2 - 1);
					String var5;
					if (var6 < 999999999) {
						var5 = Integer.toString(var6);
					} else {
						var5 = "*";
					}

					var0 = var4 + var5 + var0.substring(var3 + 2);
				}
			}
		}

		return var0;
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1508392285"
	)
	static final void method910() {
		PacketBufferNode var0 = class482.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field858 = true;

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				class363.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			FaceNormal.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field858 = false;
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1681464996"
	)
	static void method911(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) {
			if ((var1.key >> 48 & 65535L) == (long)var0) {
				var1.remove();
			}
		}

	}
}
