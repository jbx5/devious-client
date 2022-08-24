import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("hm")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lhm;")
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4);

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lhm;")
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2);

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lhm;")
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0);

	@ObfuscatedName("fg")
	@ObfuscatedGetter(intValue = -591353031)
	@Export("currentPort")
	static int currentPort;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -146107061)
	final int field2679;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1294860383)
	final int field2680;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -266370173)
	final int field2678;

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2679 = var1;
		this.field2680 = var2;
		this.field2678 = var3;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(FI)Z", garbageValue = "1471087645")
	boolean method4450(float var1) {
		return var1 >= ((float) (this.field2678));
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)[Lhm;", garbageValue = "1555481893")
	static WorldMapLabelSize[] method4455() {
		return new WorldMapLabelSize[]{ WorldMapLabelSize_medium, WorldMapLabelSize_small, WorldMapLabelSize_large };
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "1503008254")
	public static int method4459(int var0) {
		return class402.field4447[var0 & 16383];
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-2090272148")
	static final void method4449(String var0) {
		class4.method20(var0 + " is already on your friend list");
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(ILbz;ZI)I", garbageValue = "-1000138777")
	static int method4451(int var0, Script var1, boolean var2) {
		Widget var3 = (var2) ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.childIndex;
			return 1;
		} else if (var0 == 1707) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (var3.method5562()) ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return class154.method3103(var3);
		} else {
			return var0 == 1709 ? AttackOption.method2360(var3) : 2;
		}
	}
}