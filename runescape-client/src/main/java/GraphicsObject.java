import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ca")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	static SpritePixels[] field892;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1795290967
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1453685285
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -94166123
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 373231719
	)
	@Export("x")
	int x;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 234359759
	)
	@Export("y")
	int y;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 866033949
	)
	@Export("z")
	int z;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -630248333
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -304088277
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("at")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0;
		this.frameCycle = 0;
		this.isFinished = false;
		this.id = var1;
		this.plane = var2;
		this.x = var3;
		this.y = var4;
		this.z = var5;
		this.cycleStart = var7 + var6;
		int var8 = class362.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = Widget.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-27"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) {
			this.frameCycle += var1;
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
					this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
					++this.frame;
					if (this.frame >= this.sequenceDefinition.frameIds.length) {
						this.isFinished = true;
						break;
					}

					WorldMapSection0.method6223(this.sequenceDefinition, this.frame, this.x, this.y, false);
				}
			} else {
				this.frame += var1;
				if (this.frame >= this.sequenceDefinition.method4367()) {
					this.isFinished = true;
				} else {
					WorldMapSection0.method6223(this.sequenceDefinition, this.frame, this.x, this.y, false);
				}
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljy;",
		garbageValue = "1885718735"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class362.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ldt;III)V",
		garbageValue = "-2113529759"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		if (MoveSpeed.isWorldMapEvent(var0.type)) {
			class429.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var6 = AsyncRestClient.WorldMapElement_get(class429.worldMapEvent.mapElement);
			var4 = FontName.getWorldMapScript(var0.type, var6.objectId, var6.category);
		} else {
			int var5 = (Integer)var3[0];
			var4 = class298.getScript(var5);
		}

		if (var4 != null) {
			GraphicsDefaults.runScriptLogic(var0, var4, var1, var2);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "30289876"
	)
	static int method2328(int var0, Script var1, boolean var2) {
		Widget var8;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var8 = var2 ? UserComparator2.scriptDotWidget : HttpRequestTask.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class107 var9 = new class107(var4, var8.id, var8.childIndex, var8.itemId);
					Interpreter.field857.add(var9);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				class96.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					Widget var6 = class416.widgetDefinition.getWidgetChild(var3, var4);
					if (var6 == null) {
						throw new RuntimeException();
					} else {
						class107 var7 = new class107(var5, var3, var4, var6.itemId);
						Interpreter.field857.add(var7);
						return 1;
					}
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field865 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var8 = class416.widgetDefinition.method6911(Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize]);
			} else {
				var8 = var2 ? UserComparator2.scriptDotWidget : HttpRequestTask.scriptActiveWidget;
			}

			if (var8.onResize == null) {
				return 0;
			} else {
				ScriptEvent var10 = new ScriptEvent();
				var10.widget = var8;
				var10.args = var8.onResize;
				var10.field1108 = Interpreter.field865 + 1;
				Client.scriptEvents.addFirst(var10);
				return 1;
			}
		}
	}

	public GraphicsObject() {
	}
}
