import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("gj")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("dr")
	@ObfuscatedGetter(intValue = 1004163911)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)Lhy;", garbageValue = "1081110576")
	@Export("getModel")
	protected Model getModel() {
		return null;
	}

	@ObfuscatedName("cv")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel();
		if (var11 != null) {
			this.height = var11.height;
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Llh;I)V", garbageValue = "730571688")
	public static void method4342(AbstractArchive var0) {
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "1526978313")
	static int method4339(int var0, Script var1, boolean var2) {
		if (var0 == 7400) {
			--class446.Interpreter_intStackSize;
			--Interpreter.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7401) {
			--class446.Interpreter_intStackSize;
			--Interpreter.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7402) {
			class446.Interpreter_intStackSize -= 2;
			--Interpreter.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7403) {
			class446.Interpreter_intStackSize -= 2;
			--Interpreter.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7404) {
			--class446.Interpreter_intStackSize;
			--Interpreter.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7405) {
			class446.Interpreter_intStackSize -= 2;
			return 1;
		} else if (var0 == 7406) {
			--class446.Interpreter_intStackSize;
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 == 7407) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 7408) {
			class446.Interpreter_intStackSize -= 2;
			--Interpreter.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 7409) {
			--class446.Interpreter_intStackSize;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "51")
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (class238.pcmPlayer1 != null) {
			class238.pcmPlayer1.run();
		}
		if (AttackOption.pcmPlayer0 != null) {
			AttackOption.pcmPlayer0.run();
		}
	}
}