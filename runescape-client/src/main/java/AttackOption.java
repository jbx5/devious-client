import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("AttackOption")
public enum AttackOption implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	field1413(2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	field1408(4);

	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2061046629
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpo;Lpo;IZI)Lfo;",
		garbageValue = "-1892237793"
	)
	public static class145 method2968(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		byte[] var5 = var0.getFile(var2 >> 16 & 65535, var2 & 65535);
		if (var5 == null) {
			var4 = false;
			return null;
		} else {
			int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
			byte[] var7;
			if (var3) {
				var7 = var1.getFile(0, var6);
			} else {
				var7 = var1.getFile(var6, 0);
			}

			if (var7 == null) {
				var4 = false;
			}

			if (!var4) {
				return null;
			} else {
				if (Fonts.field5251 == null) {
					GrandExchangeOfferOwnWorldComparator.field482 = Runtime.getRuntime().availableProcessors();
					Fonts.field5251 = new ThreadPoolExecutor(0, GrandExchangeOfferOwnWorldComparator.field482, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(GrandExchangeOfferOwnWorldComparator.field482 * 100 + 100), new class142());
				}

				try {
					return new class145(var0, var1, var2, var3);
				} catch (Exception var9) {
					return null;
				}
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-565314116"
	)
	public static int method2972(int var0, int var1, int var2) {
		if (var1 < var0) {
			throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
		} else {
			return Math.max(var0, Math.min(var2, var1));
		}
	}
}
