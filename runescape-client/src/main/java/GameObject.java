import java.util.Locale;
import java.text.SimpleDateFormat;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.text.ParseException;
import net.runelite.rs.ScriptOpcodes;
import java.util.Date;
import net.runelite.mapping.Export;
@ObfuscatedName("hb")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 555755513)
	@Export("plane")
	int plane;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 1199180827)
	@Export("z")
	int z;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1171704683)
	@Export("centerX")
	int centerX;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1998426191)
	@Export("centerY")
	int centerY;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lgj;")
	@Export("renderable")
	public Renderable renderable;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 2060742587)
	@Export("orientation")
	int orientation;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 780367115)
	@Export("startX")
	int startX;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -16124731)
	@Export("endX")
	int endX;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 1663298221)
	@Export("startY")
	int startY;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -2083887369)
	@Export("endY")
	int endY;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -1662545459)
	int field2655;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 1055321127)
	@Export("lastDrawn")
	int lastDrawn;

	@ObfuscatedName("z")
	@ObfuscatedGetter(longValue = -5445393225516942137L)
	@Export("tag")
	public long tag;

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = -1409812671)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(S)Ljava/util/Date;", garbageValue = "206")
	static Date method4552() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
		var0.setLenient(false);
		StringBuilder var1 = new StringBuilder();
		String[] var2 = Login.field911;
		for (int var3 = 0; var3 < var2.length; ++var3) {
			String var4 = var2[var3];
			if (var4 == null) {
				GraphicsObject.method1877("Date not valid.", "Please ensure all characters are populated.", "");
				return null;
			}
			var1.append(var4);
		}
		var1.append("12");
		return var0.parse(var1.toString());
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "-1762087173")
	static int method4553(int var0, Script var1, boolean var2) {
		Widget var3 = (var2) ? class124.scriptDotWidget : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.childIndex;
			return 1;
		} else if (var0 == 1707) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (var3.method5680()) ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return class29.method363(var3);
		} else {
			return var0 == 1709 ? WorldMapSection0.method4947(var3) : 2;
		}
	}
}