import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
public class class389 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static final class389 field4565;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class389 field4557;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class389 field4568;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class389 field4559;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class389 field4560;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class389 field4561;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class389 field4562;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class389 field4558;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class389 field4564;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class389 field4569;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class389 field4566;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class389 field4567;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class389 field4576;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class389 field4578;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class389 field4570;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class389 field4571;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class389 field4572;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class389 field4573;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class389 field4574;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class389 field4575;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class389 field4556;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class389 field4577;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class389 field4563;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1308770465
	)
	public final int field4579;

	static {
		field4565 = new class389(255);
		field4557 = new class389(0);
		field4568 = new class389(1);
		field4559 = new class389(2);
		field4560 = new class389(3);
		field4561 = new class389(4);
		field4562 = new class389(5);
		field4558 = new class389(6);
		field4564 = new class389(7);
		field4569 = new class389(8);
		field4566 = new class389(9);
		field4567 = new class389(10);
		field4576 = new class389(11);
		field4578 = new class389(12);
		field4570 = new class389(13);
		field4571 = new class389(14);
		field4572 = new class389(15);
		field4573 = new class389(17);
		field4574 = new class389(18);
		field4575 = new class389(19);
		field4556 = new class389(20);
		field4577 = new class389(21);
		field4563 = new class389(22);
	}

	class389(int var1) {
		this.field4579 = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lqt;FI)Lqt;",
		garbageValue = "-1770542040"
	)
	public static final class426 method7606(class426 var0, float var1) {
		class426 var2;
		synchronized(class426.field4768) {
			if (class426.field4770 == 0) {
				var2 = new class426(var0);
			} else {
				class426.field4768[--class426.field4770].method8169(var0);
				var2 = class426.field4768[class426.field4770];
			}
		}

		var2.method8177(var1);
		return var2;
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "72"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		WorldView.clear();
		Client.worldViewManager.clear();
		Client.playerUpdateManager.method3090();
		Client.field754.method5617();
		System.gc();
		class167.method3766(0, 0);
		class182.method3872();
		Client.playingJingle = false;
		class289.method6205();
		BuddyRankComparator.updateGameState(10);
		Client.serverCycle = 0;
		class417.method8077().method4572();
		class417.method8077().method4565();
	}
}
