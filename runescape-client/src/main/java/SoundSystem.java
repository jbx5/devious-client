import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ai")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "Lkn;")
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "[Laf;")
	@Export("players")
	volatile PcmPlayer[] players = new PcmPlayer[2];

	SoundSystem() {
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1];
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var4) {
			class33.RunException_sendStackTrace(((String) (null)), var4);
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(IB)Ljava/lang/String;", garbageValue = "1")
	static String method740(int var0) {
		return "<img=" + var0 + ">";
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(descriptor = "(Lkn;Lgb;IIZB)V", garbageValue = "8")
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions;
		byte var6 = -1;
		String var7 = null;
		if (var5 != null && var5[var3] != null) {
			if (var3 == 0) {
				var6 = 33;
			} else if (var3 == 1) {
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35;
			} else if (var3 == 3) {
				var6 = 36;
			} else {
				var6 = 37;
			}
			var7 = var5[var3];
		} else if (var3 == 4) {
			var6 = 37;
			var7 = "Drop";
		}
		if (var6 != -1 && var7 != null) {
			CollisionMap.insertMenuItem(var7, Clock.colorStartTag(16748608) + var1.name, var6, 0, var2, var0.id, var1.id, var4);
		}
	}
}