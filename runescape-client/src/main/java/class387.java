import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("on")
public class class387 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	Archive field4490;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1607135767
	)
	int field4491;
	@ObfuscatedName("an")
	byte field4488;

	class387() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ldy;IIII)I",
		garbageValue = "1107296256"
	)
	static int method7244(WorldView var0, int var1, int var2, int var3) {
		if ((var0.tileSettings[var1][var2][var3] & 8) != 0) {
			return 0;
		} else {
			return var1 > 0 && (var0.tileSettings[1][var2][var3] & 2) != 0 ? var1 - 1 : var1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1420449803"
	)
	static void method7242() {
		Login.worldSelectOpen = false;
		class368.leftTitleSprite.drawAt(Login.xPadding, 0);
		AttackOption.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
		FillMode.logoSprite.drawAt(Login.xPadding + 382 - FillMode.logoSprite.subWidth / 2, 18);
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1108607099"
	)
	static final void method7243() {
		Scene.Scene_isLowDetail = false;
		Client.isLowDetail = false;
	}
}
