import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("InvDefinition_archive")
	public static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1319222005
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	InvDefinition() {
		this.size = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "-481213061"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lua;II)V",
		garbageValue = "-1344869318"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) {
			this.size = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lmr;I)V",
		garbageValue = "-1586498254"
	)
	public static void method3790(class335 var0) {
		if (!class329.field3582.contains(var0)) {
			class329.field3582.add(var0);
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lor;B)V",
		garbageValue = "12"
	)
	public static void method3783(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0;
		VarpDefinition.field2003 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)I",
		garbageValue = "1055878957"
	)
	static int method3791(Widget var0) {
		if (var0.type != 11) {
			--class166.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var0.method6932(var1);
			return 1;
		}
	}
}
