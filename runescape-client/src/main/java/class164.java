import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public abstract class class164 extends Node {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 864863067
	)
	static int field1782;

	class164() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;B)V",
		garbageValue = "-40"
	)
	abstract void vmethod3611(Buffer var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgx;I)V",
		garbageValue = "-357446960"
	)
	abstract void vmethod3612(ClanChannel var1);

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lcf;Lcf;IZI)I",
		garbageValue = "1373258559"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1898() ? (var1.method1898() ? 0 : 1) : (var1.method1898() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1876() ? (var1.method1876() ? 0 : 1) : (var1.method1876() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id;
		}
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Ldt;I)V",
		garbageValue = "629654173"
	)
	static final void method3545(Actor var0) {
		int var1 = Math.max(1, var0.spotAnimation - Client.cycle);
		int var2 = var0.field1231 * 128 + var0.field1183 * 64;
		int var3 = var0.field1233 * 128 + var0.field1183 * 64;
		var0.x += (var2 - var0.x) / var1;
		var0.y += (var3 - var0.y) / var1;
		var0.field1253 = 0;
		var0.orientation = var0.field1237;
	}
}
