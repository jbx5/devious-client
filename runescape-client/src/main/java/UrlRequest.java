import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("v")
	@Export("url")
	final URL url;
	@ObfuscatedName("c")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("i")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"16")

	@Export("isDone")
	public boolean isDone() {
		return this.isDone0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)[B", garbageValue = 
	"1979081265")

	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(B)Ljava/lang/String;", garbageValue = 
	"1")

	public String method2554() {
		return this.url.toString();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1489870449")

	public static void method2564() {
		class54.reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"232574947")

	static void method2551(int var0, int var1) {
		MenuAction var2 = Interpreter.tempMenuAction;
		if (var2 != null) {
			class9.menuAction(var2.param0, var2.param1, var2.opcode, var2.identifier, var2.action, var2.action, var0, var1);
		}

		Interpreter.tempMenuAction = null;
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(descriptor = 
	"(S)V", garbageValue = 
	"1100")

	static void method2560() {
		if (Client.field759 && (GrandExchangeEvents.localPlayer != null)) {
			int var0 = GrandExchangeEvents.localPlayer.pathX[0];
			int var1 = GrandExchangeEvents.localPlayer.pathY[0];
			if ((((var0 < 0) || (var1 < 0)) || (var0 >= 104)) || (var1 >= 104)) {
				return;
			}

			class10.oculusOrbFocalPointX = GrandExchangeEvents.localPlayer.x;
			int var2 = WorldMapLabel.getTileHeight(GrandExchangeEvents.localPlayer.x, GrandExchangeEvents.localPlayer.y, class18.Client_plane) - Client.camFollowHeight;
			if (var2 < Decimator.field397) {
				Decimator.field397 = var2;
			}

			ClientPacket.oculusOrbFocalPointY = GrandExchangeEvents.localPlayer.y;
			Client.field759 = false;
		}

	}
}