import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 872007641
	)
	int field3494;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	MusicPatchNode2 field3504;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -673456539
	)
	int field3492;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 525544231
	)
	int field3490;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1517052011
	)
	int field3491;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1570745701
	)
	int field3485;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 293868513
	)
	int field3503;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1223202311
	)
	int field3488;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -949550453
	)
	int field3495;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 426454303
	)
	int field3493;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1619712909
	)
	int field3497;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 468729462
	)
	int field3498;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1793966159
	)
	int field3499;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1146410571
	)
	int field3500;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1814544761
	)
	int field3501;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1788586429
	)
	int field3502;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1895012319
	)
	int field3486;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1199361363
	)
	int field3505;

	MusicPatchNode() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1119340106"
	)
	void method6052() {
		this.table = null;
		this.rawSound = null;
		this.field3504 = null;
		this.stream = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BZI)Ljava/lang/Object;",
		garbageValue = "-2056513709"
	)
	public static Object method6054(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0.length > 136) {
			DirectByteArrayCopier var2 = new DirectByteArrayCopier();
			var2.set(var0);
			return var2;
		} else {
			return var0;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lhq;",
		garbageValue = "325991417"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0);
			var1 = new ParamComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-82"
	)
	static final void method6051(String var0) {
		Tile.method4399(var0 + " is already on your ignore list");
	}
}
