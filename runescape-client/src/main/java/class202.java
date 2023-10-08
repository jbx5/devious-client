import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hx")
public class class202 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("field2026")
	static EvictingDualNodeHashTable field2026;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1153223597
	)
	static int field2025;

	static {
		field2026 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhb;",
		garbageValue = "163265038"
	)
	static HorizontalAlignment[] method3767() {
		return new HorizontalAlignment[]{HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field2032, HorizontalAlignment.field2027};
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "1725894118"
	)
	static int method3766(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class416.scriptDotWidget : class306.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.childIndex;
			return 1;
		} else if (var0 == 1707) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6604() ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return class110.method2752(var3);
		} else {
			return var0 == 1709 ? Canvas.method320(var3) : 2;
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Lok;",
		garbageValue = "-1284352202"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, UserComparator8.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, UserComparator10.masterDisk, class59.field452, var0, var1, var2, var3, var4, false);
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIII)V",
		garbageValue = "976879674"
	)
	static void method3764(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) {
			int var5 = (Integer)var0.get(0);
			if (var5 == -1 && !Client.playingJingle) {
				ItemComposition.method4136(0, 0);
			} else if (var5 != -1) {
				boolean var6;
				if (class319.field3440.isEmpty()) {
					var6 = false;
				} else {
					MusicSong var7 = (MusicSong)class319.field3440.get(0);
					var6 = var7 != null && var5 == var7.musicTrackGroupId;
				}

				if (!var6 && class91.clientPreferences.method2515() != 0) {
					ArrayList var9 = new ArrayList();

					for (int var8 = 0; var8 < var0.size(); ++var8) {
						var9.add(new MusicSong(CollisionMap.archive6, (Integer)var0.get(var8), 0, class91.clientPreferences.method2515(), false));
					}

					if (Client.playingJingle) {
						class275.method5562(var9, var1, var2, var3, var4);
					} else {
						class148.method3166(var9, var1, var2, var3, var4, false);
					}
				}
			}

		}
	}
}
