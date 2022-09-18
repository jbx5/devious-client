import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("te")
	@ObfuscatedGetter(
		intValue = 178380416
	)
	static int field3301;
	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = -367498747
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2122177483
	)
	int field3303;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	MusicPatchNode2 field3307;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1394938405
	)
	int field3314;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 598278571
	)
	int field3311;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 946170127
	)
	int field3299;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1689760395
	)
	int field3297;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1655175911
	)
	int field3293;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1990808293
	)
	int field3302;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1189870605
	)
	int field3296;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 641898845
	)
	int field3304;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -830547077
	)
	int field3305;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 982248577
	)
	int field3306;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -477051149
	)
	int field3300;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1891563053
	)
	int field3308;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -336676207
	)
	int field3309;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -610946301
	)
	int field3295;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 328839995
	)
	int field3312;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1631749861
	)
	int field3313;

	MusicPatchNode() {
	} // L: 31

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1053593547"
	)
	void method5640() {
		this.patch = null; // L: 34
		this.rawSound = null; // L: 35
		this.field3307 = null; // L: 36
		this.stream = null; // L: 37
	} // L: 38

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-12"
	)
	public static boolean method5641(int var0) {
		return (var0 >> 31 & 1) != 0; // L: 41
	}
}
