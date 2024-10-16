import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qd")
public class class437 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1501095833
	)
	int field4838;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class437(int var1, boolean var2) {
		this.field4838 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1377209360"
	)
	public int method8551() {
		return this.field4838;
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-41"
	)
	@Export("setMusicVolume")
	static final void setMusicVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != TaskHandler.clientPreferences.getMusicVolume()) {
			label26: {
				if (TaskHandler.clientPreferences.getMusicVolume() == 0) {
					boolean var1 = !class333.field3628.isEmpty();
					if (var1) {
						FaceNormal.method5261(MouseHandler.archive6, var0);
						Client.playingJingle = false;
						break label26;
					}
				}

				if (var0 == 0) {
					class167.method3766(0, 0);
					Client.playingJingle = false;
				} else {
					RestClientThreadFactory.method203(var0);
				}
			}

			TaskHandler.clientPreferences.updateMusicVolume(var0);
		}

	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)Lng;",
		garbageValue = "50179034"
	)
	static Widget method8555(Widget var0) {
		int var1 = UrlRequester.method3229(class171.getWidgetFlags(var0));
		if (var1 == 0) {
			return null;
		} else {
			for (int var2 = 0; var2 < var1; ++var2) {
				var0 = class416.widgetDefinition.method6911(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
