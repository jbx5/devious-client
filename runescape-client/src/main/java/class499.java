import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("tl")
final class class499 implements class498 {
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("archive9")
	static Archive archive9;

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ltm;I)V",
		garbageValue = "465506048"
	)
	public void vmethod8928(Object var1, Buffer var2) {
		this.method8896((Integer)var1, var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)Ljava/lang/Object;",
		garbageValue = "-295239457"
	)
	public Object vmethod8926(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Ltm;S)V",
		garbageValue = "128"
	)
	void method8896(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "1972049883"
	)
	static int method8897(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var7 = var2 ? GameObject.scriptDotWidget : SceneTilePaint.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class102 var8 = new class102(var4, var7.id, var7.childIndex, var7.itemId);
					Interpreter.field889.add(var8);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				SoundCache.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class102 var6 = new class102(var5, var3, var4, class92.getWidget(var3).itemId);
					Interpreter.field889.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field890 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var7 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
			} else {
				var7 = var2 ? GameObject.scriptDotWidget : SceneTilePaint.scriptActiveWidget;
			}

			if (var7.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var7;
				var9.args = var7.onResize;
				var9.field1093 = Interpreter.field890 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}
}
