import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("uz")
	@ObfuscatedGetter(
		intValue = 984261565
	)
	static int field3397;
	@ObfuscatedName("au")
	byte[] field3392;
	@ObfuscatedName("ae")
	byte[] field3398;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1214926019
	)
	int field3389;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1047647419
	)
	int field3388;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 751515157
	)
	int field3391;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -341693181
	)
	int field3387;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 326458923
	)
	int field3393;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1787275153
	)
	int field3394;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -107755175
	)
	int field3395;

	MusicPatchNode2() {
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "31198036"
	)
	static void method5742(int var0) {
		Client.oculusOrbState = var0;
	}
}
