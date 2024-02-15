import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("au")
@Implements("HttpMethod")
public class HttpMethod implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	@Export("POST")
	public static final HttpMethod POST;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	@Export("GET")
	public static final HttpMethod GET;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	@Export("PUT")
	static final HttpMethod PUT;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	@Export("PATCH")
	static final HttpMethod PATCH;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	@Export("DELETE")
	static final HttpMethod DELETE;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lrc;"
	)
	static Bounds field35;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1320722447
	)
	int field30;
	@ObfuscatedName("aa")
	@Export("name")
	String name;
	@ObfuscatedName("az")
	boolean field32;
	@ObfuscatedName("ao")
	boolean field25;

	static {
		POST = new HttpMethod(0, "POST", true, true);
		GET = new HttpMethod(1, "GET", true, false);
		PUT = new HttpMethod(2, "PUT", false, true);
		PATCH = new HttpMethod(3, "PATCH", false, true);
		DELETE = new HttpMethod(4, "DELETE", false, true);
	}

	HttpMethod(int var1, String var2, boolean var3, boolean var4) {
		this.field30 = var1;
		this.name = var2;
		this.field32 = var3;
		this.field25 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field30;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-236928179"
	)
	boolean method63() {
		return this.field32;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "997211650"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "93"
	)
	boolean method68() {
		return this.field25;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfr;B)V",
		garbageValue = "34"
	)
	static void method67(float var0, float var1, float var2, float var3, class132 var4) {
		float var5 = var1 - var0;
		float var6 = var2 - var1;
		float var7 = var3 - var2;
		float var8 = var6 - var5;
		var4.field1566 = var7 - var6 - var8;
		var4.field1562 = var8 + var8 + var8;
		var4.field1564 = var5 + var5 + var5;
		var4.field1563 = var0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1822218626"
	)
	static int method83(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class141.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = TextureProvider.Widget_unpackTargetMask(class429.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-259088192"
	)
	static int method82(int var0, Script var1, boolean var2) {
		Widget var3 = ArchiveLoader.widgetDefinition.method6431(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = TextureProvider.Widget_unpackTargetMask(class429.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2111193111"
	)
	static final void method80() {
		FriendLoginUpdate.method8302();
	}
}
