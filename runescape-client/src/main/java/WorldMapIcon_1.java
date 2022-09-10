import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hq")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 655769695
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -677113903
	)
	@Export("element")
	int element;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1508318587
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1513759171
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lkz;Lkz;ILhy;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2); // L: 17
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-740691611"
	)
	@Export("init")
	void init() {
		this.element = PlayerComposition.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(class139.WorldMapElement_get(this.element)); // L: 25
		WorldMapElement var1 = class139.WorldMapElement_get(this.getElement()); // L: 26
		SpritePixels var2 = var1.getSpriteBool(false); // L: 27
		if (var2 != null) { // L: 28
			this.subWidth = var2.subWidth; // L: 29
			this.subHeight = var2.subHeight; // L: 30
		} else {
			this.subWidth = 0; // L: 33
			this.subHeight = 0; // L: 34
		}

	} // L: 36

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "922846736"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 40
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Lik;",
		garbageValue = "-114"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 45
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1340019060"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 50
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2085066872"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 55
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "-1515190918"
	)
	static int method4702(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 3736
			Interpreter.Interpreter_intStackSize -= 2; // L: 3737
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3738
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3739
			if (!Client.isCameraLocked) { // L: 3740
				Client.camAngleX = var3; // L: 3741
				Client.camAngleY = var4; // L: 3742
			}

			return 1; // L: 3744
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 3746
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 3747
			return 1; // L: 3748
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 3750
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 3751
			return 1; // L: 3752
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 3754
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3755
			if (var3 < 0) { // L: 3756
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 3757
			return 1; // L: 3758
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 3760
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 3761
			return 1; // L: 3762
		} else {
			return 2; // L: 3764
		}
	}
}
