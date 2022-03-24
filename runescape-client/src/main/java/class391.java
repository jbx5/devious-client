import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
public class class391 implements class396 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lpx;")

	public final class419 field4376;

	@ObfuscatedSignature(descriptor = 
	"(Lpf;)V")

	class391(class420 var1) {
		this.field4376 = var1;
	}

	@ObfuscatedSignature(descriptor = 
	"(Loo;)V")

	public class391(class392 var1) {
		this(new class420(var1));
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IB)I", garbageValue = 
	"15")

	public int method7164(int var1) {
		return this.field4376.vmethod7559(var1);
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-896274145")

	static void method7169() {
		if (Client.field602 && (class19.localPlayer != null)) {
			int var0 = class19.localPlayer.pathX[0];
			int var1 = class19.localPlayer.pathY[0];
			if ((((var0 < 0) || (var1 < 0)) || (var0 >= 104)) || (var1 >= 104)) {
				return;
			}

			Messages.oculusOrbFocalPointX = class19.localPlayer.x;
			int var2 = Archive.getTileHeight(class19.localPlayer.x, class19.localPlayer.y, class160.Client_plane) - Client.camFollowHeight;
			if (var2 < FloorOverlayDefinition.field2136) {
				FloorOverlayDefinition.field2136 = var2;
			}

			class115.oculusOrbFocalPointY = class19.localPlayer.y;
			Client.field602 = false;
		}

	}
}