




import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("rg")
	@ObfuscatedSignature(descriptor = 
	"Lqi;")

	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	-1067255387)

	public static int field1189;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	1328246863)

	@Export("cycle")
	int cycle;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	399035073)

	@Export("health")
	int health;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	573948343)

	@Export("health2")
	int health2;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	2144773551)

	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IIIII)V", garbageValue = 
	"-1624379348")

	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lln;Lln;IZB)Lim;", garbageValue = 
	"-50")

	public static Frames method2185(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		int[] var5 = var0.getGroupFileIds(var2);

		for (int var6 = 0; var6 < var5.length; ++var6) {
			byte[] var7 = var0.getFile(var2, var5[var6]);
			if (var7 == null) {
				var4 = false;
			} else {
				int var8 = ((var7[0] & 255) << 8) | (var7[1] & 255);
				byte[] var9;
				if (var3) {
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0);
				}

				if (var9 == null) {
					var4 = false;
				}
			}
		}

		if (!var4) {
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3);
			} catch (Exception var11) {
				return null;
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZB)I", garbageValue = 
	"-30")

	static int method2186(int var0, Script var1, boolean var2) {
		Widget var7;
		if ((var0 != ScriptOpcodes.CC_CALLONRESIZE) && (var0 != ScriptOpcodes.IF_CALLONRESIZE)) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var7 = (var2) ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if ((var4 >= 1) && (var4 <= 10)) {
					class93 var8 = new class93(var4, var7.id, var7.childIndex, var7.itemId);
					Interpreter.field843.add(var8);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				Interpreter.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				if ((var5 >= 1) && (var5 <= 10)) {
					class93 var6 = new class93(var5, var3, var4, class127.getWidget(var3).itemId);
					Interpreter.field843.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field844 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var7 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			} else {
				var7 = (var2) ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget;
			}

			if (var7.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var7;
				var9.args = var7.onResize;
				var9.field1031 = Interpreter.field844 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(descriptor = 
	"(Lky;III)V", garbageValue = 
	"-1103204446")

	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) {
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) {
			var0.x = var0.rawX + ((var1 - var0.width) / 2);
		} else if (var0.xAlignment == 2) {
			var0.x = (var1 - var0.width) - var0.rawX;
		} else if (var0.xAlignment == 3) {
			var0.x = (var0.rawX * var1) >> 14;
		} else if (var0.xAlignment == 4) {
			var0.x = ((var1 - var0.width) / 2) + ((var0.rawX * var1) >> 14);
		} else {
			var0.x = (var1 - var0.width) - ((var0.rawX * var1) >> 14);
		}

		if (var0.yAlignment == 0) {
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) {
			var0.y = ((var2 - var0.height) / 2) + var0.rawY;
		} else if (var0.yAlignment == 2) {
			var0.y = (var2 - var0.height) - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = (var2 * var0.rawY) >> 14;
		} else if (var0.yAlignment == 4) {
			var0.y = ((var2 * var0.rawY) >> 14) + ((var2 - var0.height) / 2);
		} else {
			var0.y = (var2 - var0.height) - ((var2 * var0.rawY) >> 14);
		}

	}
}