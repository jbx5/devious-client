import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
public class class19 {
	@ObfuscatedName("v")
	Future field102;
	@ObfuscatedName("c")
	String field100;

	class19(Future var1) {
		this.field102 = var1;
	}

	class19(String var1) {
		this.method270(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)V", garbageValue = 
	"-1907371435")

	void method270(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.field100 = var1;
		if (this.field102 != null) {
			this.field102.cancel(true);
			this.field102 = null;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(B)Ljava/lang/String;", garbageValue = 
	"11")

	public final String method271() {
		return this.field100;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-2045655469")

	public boolean method283() {
		return (this.field100 != null) || (this.field102 == null);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"126")

	public final boolean method268() {
		return this.method283() ? true : this.field102.isDone();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(I)Ly;", garbageValue = 
	"1665321496")

	public final class21 method274() {
		if (this.method283()) {
			return new class21(this.field100);
		} else if (!this.method268()) {
			return null;
		} else {
			try {
				return ((class21) (this.field102.get()));
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println((var2 + "\r\n") + var3);
				this.method270(var2);
				return new class21(var2);
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(II)Lgf;", garbageValue = 
	"-1420060608")

	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = ((ItemComposition) (ItemComposition.ItemDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SoundCache.ItemDefinition_archive.takeFile(10, var0);
			var1 = new ItemComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.post();
			if (var1.noteTemplate != (-1)) {
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != (-1)) {
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != (-1)) {
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if ((!DevicePcmPlayerProvider.ItemDefinition_inMembersWorld) && var1.isMembersOnly) {
				var1.name = "Members object";
				var1.isTradable = false;

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) {
					var1.groundActions[var3] = null;
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) {
					if (var3 != 4) {
						var1.inventoryActions[var3] = null;
					}
				}

				var1.shiftClickIndex = -2;
				var1.team = 0;
				if (var1.params != null) {
					boolean var6 = false;

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
						ParamComposition var5 = class151.getParamDefinition(((int) (var4.key)));
						if (var5.autoDisable) {
							var4.remove();
						} else {
							var6 = true;
						}
					}

					if (!var6) {
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/CharSequence;I)I", garbageValue = 
	"1009415810")

	public static int method288(CharSequence var0) {
		return class263.method5178(var0, 10, true);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"-169885826")

	static int method286(int var0, Script var1, boolean var2) {
		if ((var0 >= 7200) && (var0 < 7204)) {
			Interpreter.Interpreter_intStackSize -= 5;
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
			return 1;
		} else if (var0 == 7204) {
			Interpreter.Interpreter_intStackSize -= 6;
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
			return 1;
		} else if ((var0 >= 7205) && (var0 < 7209)) {
			Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7209) {
			Interpreter.Interpreter_intStackSize -= 2;
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
			return 1;
		} else if ((var0 >= 7210) && (var0 < 7214)) {
			--Interpreter.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7214) {
			Interpreter.Interpreter_intStackSize -= 2;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-53")

	static final void method287() {
		if (SoundSystem.field309) {
			for (int var0 = 0; var0 < Players.Players_count; ++var0) {
				Player var1 = Client.players[Players.Players_indices[var0]];
				var1.method2121();
			}

			SoundSystem.field309 = false;
		}

	}
}