import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public class class129 implements Callable {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class130 field1527;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	final class131 field1529;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class132 field1526;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1571193313
	)
	final int field1525;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class137 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;Lfm;Lfa;Lfg;I)V"
	)
	class129(class137 var1, class130 var2, class131 var3, class132 var4, int var5) {
		this.this$0 = var1;
		this.field1527 = var2;
		this.field1529 = var3;
		this.field1526 = var4;
		this.field1525 = var5;
	}

	public Object call() {
		this.field1527.method2992();
		class130[][] var1;
		if (this.field1529 == class131.field1557) {
			var1 = this.this$0.field1610;
		} else {
			var1 = this.this$0.field1608;
		}

		var1[this.field1525][this.field1526.method3027()] = this.field1527;
		return null;
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-68"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 30) {
				Client.field612.method4119();
			}

			if (Client.gameState == 0) {
				TileItem.client.method634();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				BuddyRankComparator.method2912(0);
				Client.field552 = 0;
				Client.field796 = 0;
				Client.timer.method7725(var0);
				if (var0 != 20) {
					GrandExchangeOfferTotalQuantityComparator.method6892(false);
				}
			}

			if (var0 != 20 && var0 != 40 && UserComparator5.field1461 != null) {
				UserComparator5.field1461.close();
				UserComparator5.field1461 = null;
			}

			if (Client.gameState == 25) {
				Client.field537 = 0;
				Client.field730 = 0;
				Client.field584 = 1;
				Client.field679 = 0;
				Client.field586 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					int var3 = Client.gameState == 11 ? 4 : 0;
					UserComparator10.method2904(class131.archive10, class386.archive8, false, var3);
				} else if (var0 == 11) {
					UserComparator10.method2904(class131.archive10, class386.archive8, false, 4);
				} else if (var0 == 50) {
					Actor.setLoginResponseString("", "Updating date of birth...", "");
					UserComparator10.method2904(class131.archive10, class386.archive8, false, 7);
				} else {
					WorldMapData_0.method5080();
				}
			} else {
				boolean var1 = class150.clientPreferences.method2539() >= Client.field521;
				int var2 = var1 ? 0 : 12;
				UserComparator10.method2904(class131.archive10, class386.archive8, true, var2);
			}

			Client.gameState = var0;
		}
	}
}
