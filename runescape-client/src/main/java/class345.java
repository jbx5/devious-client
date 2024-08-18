import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
public class class345 extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -830260785
	)
	int field3691;
	@ObfuscatedName("ay")
	BitSet field3688;

	class345(int var1) {
		this.field3691 = var1;
		this.field3688 = new BitSet(128);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)[Loo;",
		garbageValue = "256"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4417, PlayerType.field4422, PlayerType.PlayerType_jagexModerator, PlayerType.field4421, PlayerType.field4420, PlayerType.field4428, PlayerType.field4432, PlayerType.field4427, PlayerType.PlayerType_ironman, PlayerType.PlayerType_ultimateIronman, PlayerType.field4424, PlayerType.PlayerType_playerModerator, PlayerType.field4426, PlayerType.field4425, PlayerType.PlayerType_normal, PlayerType.field4423, PlayerType.PlayerType_hardcoreIronman};
	}

	@ObfuscatedName("aj")
	static final void method6489(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0;
	}
}
