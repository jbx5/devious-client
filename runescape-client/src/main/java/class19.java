import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class class19 implements Callable {
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = -1387904025
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	final class10 field101;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Las;Lag;)V"
	)
	class19(class14 var1, class10 var2) {
		this.this$0 = var1;
		this.field101 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field101.method88()) {
				Players.method2741(10L);
			}
		} catch (IOException var2) {
			return new class20("Error servicing REST query: " + var2.getMessage());
		}

		return this.field101.method89();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "44"
	)
	static void method285(String var0, String var1, String var2) {
		GameEngine.setLoginIndex(7);
		AbstractWorldMapIcon.setLoginResponseString(var0, var1, var2);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "770676496"
	)
	protected static final void method283() {
		class314.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		class160.gameCyclesToDo = 0;
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIB)V",
		garbageValue = "-11"
	)
	static final void method280(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		PendingSpawn var10 = null;

		for (PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new PendingSpawn();
			var10.plane = var0;
			var10.type = var3;
			var10.x = var1;
			var10.y = var2;
			var10.field1180 = -1;
			GrandExchangeOfferOwnWorldComparator.method1237(var10);
			Client.pendingSpawns.addFirst(var10);
		}

		var10.field1177 = var4;
		var10.field1173 = var5;
		var10.field1170 = var6;
		var10.delay = var8;
		var10.hitpoints = var9;
		var10.method2413(var7);
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1266586426"
	)
	static final void method284(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.validRootWidgets[var4] = true;
			}
		}

	}
}
