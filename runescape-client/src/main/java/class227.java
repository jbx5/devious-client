import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
public class class227 {
	@ObfuscatedName("at")
	final int[][] field2403;
	@ObfuscatedName("ah")
	final int[][] field2399;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -793547525
	)
	int field2400;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -354000603
	)
	int field2401;
	@ObfuscatedName("ab")
	final int[] field2402;
	@ObfuscatedName("au")
	final int[] field2404;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 2049771567
	)
	final int field2398;

	class227(int var1, int var2) {
		this.field2403 = new int[var1][var2];
		this.field2399 = new int[var1][var2];
		int var3 = var2 * var1;
		int var4 = class184.method3680(var3 / 4);
		this.field2402 = new int[var4];
		this.field2404 = new int[var4];
		this.field2398 = var4 - 1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1222193481"
	)
	void method4396() {
		for (int var1 = 0; var1 < this.field2403.length; ++var1) {
			for (int var2 = 0; var2 < this.field2403[var1].length; ++var2) {
				this.field2403[var1][var2] = 0;
				this.field2399[var1][var2] = 99999999;
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "19"
	)
	void method4397(int var1, int var2) {
		this.field2400 = var1;
		this.field2401 = var2;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "40323441"
	)
	int method4409() {
		return this.field2400;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1750478119"
	)
	int method4399() {
		return this.field2401;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1487241351"
	)
	int method4400() {
		return this.field2403.length;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-63"
	)
	int method4401() {
		return this.field2403[0].length;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "-32547244"
	)
	int[][] method4402() {
		return this.field2403;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "2082106732"
	)
	int[][] method4403() {
		return this.field2399;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-33"
	)
	int[] method4423() {
		return this.field2402;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1805149245"
	)
	int[] method4405() {
		return this.field2404;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "3128"
	)
	int method4428() {
		return this.field2398;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "516019890"
	)
	public static void method4406() {
		synchronized(ArchiveDiskActionHandler.field4272) {
			if (ArchiveDiskActionHandler.field4271 != 0) {
				ArchiveDiskActionHandler.field4271 = 1;
				ArchiveDiskActionHandler.field4274 = true;

				try {
					ArchiveDiskActionHandler.field4272.wait();
				} catch (InterruptedException var3) {
				}
			}

		}
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)Lnn;",
		garbageValue = "16221133"
	)
	static Widget method4434(Widget var0) {
		int var2 = class361.getWidgetFlags(var0);
		int var1 = var2 >> 17 & 7;
		int var3 = var1;
		if (var1 == 0) {
			return null;
		} else {
			for (int var4 = 0; var4 < var3; ++var4) {
				var0 = HealthBarDefinition.widgetDefinition.method6285(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
