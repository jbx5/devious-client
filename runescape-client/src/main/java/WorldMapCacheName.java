import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lg")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	public static final WorldMapCacheName field3214;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	public static final WorldMapCacheName field3211;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	public static final WorldMapCacheName field3213;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	static final WorldMapCacheName field3215;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	public static final WorldMapCacheName field3212;
	@ObfuscatedName("wv")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("ao")
	@Export("name")
	public final String name;

	static {
		field3214 = new WorldMapCacheName("details");
		field3211 = new WorldMapCacheName("compositemap");
		field3213 = new WorldMapCacheName("compositetexture");
		field3215 = new WorldMapCacheName("area");
		field3212 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lbl;B)V",
		garbageValue = "88"
	)
	public static final void method6020(class51 var0) {
		Login.pcmPlayerProvider = var0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZB)I",
		garbageValue = "113"
	)
	static int method6019(int var0, Script var1, boolean var2) {
		Widget var3 = FloorUnderlayDefinition.widgetDefinition.method6544(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InvDefinition.Widget_unpackTargetMask(SpriteMask.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}
}
