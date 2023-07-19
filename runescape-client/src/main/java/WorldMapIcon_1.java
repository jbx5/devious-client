import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jg")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("us")
	@ObfuscatedGetter(
		intValue = -438679936
	)
	static int field2870;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1809018999
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 708898903
	)
	@Export("element")
	int element;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -94495923
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 163787557
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lmr;Lmr;ILjv;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1295582280"
	)
	@Export("init")
	void init() {
		this.element = class90.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(SequenceDefinition.WorldMapElement_get(this.element));
		WorldMapElement var1 = SequenceDefinition.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1799088869"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)Lka;",
		garbageValue = "8220"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "81"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-565304787"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-2050409235"
	)
	static int method5097(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class36.scriptDotWidget : class351.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class273.Widget_unpackTargetMask(UserComparator8.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "650679453"
	)
	static boolean method5108() {
		return (Client.drawPlayerNames & 1) != 0;
	}
}
