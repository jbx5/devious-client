import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
public class class127 {
	@ObfuscatedName("ao")
	public static final float field1484;
	@ObfuscatedName("ab")
	public static final float field1485;
	@ObfuscatedName("au")
	static float[] field1487;
	@ObfuscatedName("aa")
	static float[] field1489;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -875440561
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("us")
	@ObfuscatedGetter(
		intValue = 1214366117
	)
	static int field1488;
	@ObfuscatedName("vz")
	@ObfuscatedGetter(
		intValue = -2052950467
	)
	static int field1494;

	static {
		field1484 = Math.ulp(1.0F);
		field1485 = 2.0F * field1484;
		field1487 = new float[4];
		field1489 = new float[5];
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2049504300"
	)
	static void method3038() {
		if (NpcOverrides.worldMap != null) {
			NpcOverrides.worldMap.method8723(ItemLayer.Client_plane, NpcOverrides.baseX * 64 + (class229.localPlayer.x >> 7), class101.baseY * 64 + (class229.localPlayer.y >> 7), false);
			NpcOverrides.worldMap.loadCache();
		}

	}
}
