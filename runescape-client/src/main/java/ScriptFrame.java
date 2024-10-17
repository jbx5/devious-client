import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	static Bounds field446;
	@ObfuscatedName("cv")
	static String field447;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1491498489
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("ak")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("aj")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "164116332"
	)
	static void method1223() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvl;J)V"
	)
	static void method1222(Buffer var0, long var1) {
		var1 /= 10L;
		if (var1 < 0L) {
			var1 = 0L;
		} else if (var1 > 65535L) {
			var1 = 65535L;
		}

		var0.writeShort((int)var1);
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Ldn;IIII)I",
		garbageValue = "1850726211"
	)
	@Export("getTileHeight")
	static final int getTileHeight(WorldView var0, int var1, int var2, int var3) {
		int var4 = var1 >> 7;
		int var5 = var2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 < var0.tileSettings[0].length && var5 < var0.tileSettings[0][0].length) {
			int var6 = var3;
			if (var3 < 3 && (var0.tileSettings[1][var4][var5] & 2) == 2) {
				var6 = var3 + 1;
			}

			int var7 = var1 & 127;
			int var8 = var2 & 127;
			int var9 = var0.tileHeights[var6][var4 + 1][var5] * var7 + var0.tileHeights[var6][var4][var5] * (128 - var7) >> 7;
			int var10 = var0.tileHeights[var6][var4][var5 + 1] * (128 - var7) + var7 * var0.tileHeights[var6][var4 + 1][var5 + 1] >> 7;
			return var9 * (128 - var8) + var8 * var10 >> 7;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)Lng;",
		garbageValue = "880828421"
	)
	static Widget method1224(Widget var0) {
		Widget var1 = class437.method8555(var0);
		if (var1 == null) {
			var1 = var0.parent;
		}

		return var1;
	}
}
