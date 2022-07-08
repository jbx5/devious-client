import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.awt.Image;
import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
@ObfuscatedName("fl")
public class class162 extends class165 {
	@ObfuscatedName("aj")
	static Image field1781;

	@ObfuscatedName("av")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -454332877)
	int field1784;

	@ObfuscatedSignature(descriptor = "Les;")
	final class155 this$0;

	@ObfuscatedSignature(descriptor = "(Les;Ljava/lang/String;I)V")
	class162(class155 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1784 = var3;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-118")
	public int vmethod3314() {
		return 0;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "16777215")
	public int vmethod3318() {
		return this.field1784;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II)Lgk;", garbageValue = "540611824")
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = ((ObjectComposition) (ObjectComposition.ObjectDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class328.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}
			ObjectComposition.ObjectDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "1499243899")
	static int method3298(int var0, Script var1, boolean var2) {
		if (var0 == 6800) {
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 != 6801 && var0 != 6802) {
			if (var0 == 6850) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				return 1;
			} else if (var0 != 6851 && var0 != 6852) {
				if (var0 == 6853) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
				return 1;
			}
		} else {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
			return 1;
		}
	}
}