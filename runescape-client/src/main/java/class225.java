import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public class class225 {
	@ObfuscatedName("ak")
	public String field2417;
	@ObfuscatedName("ap")
	public float[] field2415;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1255674463
	)
	public int field2418;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1383873547
	)
	public int field2420;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2014108559
	)
	public int field2421;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	final class224 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lif;)V"
	)
	class225(class224 var1) {
		this.this$0 = var1;
		this.field2415 = new float[4];
		this.field2418 = 1;
		this.field2420 = 1;
		this.field2421 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;Ljava/lang/String;I)I",
		garbageValue = "696085709"
	)
	public static int method4305(Buffer var0, String var1) {
		int var2 = var0.offset;
		byte[] var3 = class189.method3694(var1);
		var0.writeSmartByteShort(var3.length);
		var0.offset += class365.huffman.compress(var3, 0, var3.length, var0.array, var0.offset);
		return var0.offset - var2;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1962200947"
	)
	public static void method4304(int var0, int var1) {
		VarbitComposition var2 = ItemContainer.method2361(var0);
		int var3 = var2.baseVar;
		int var4 = var2.startBit;
		int var5 = var2.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		if (var1 < 0 || var1 > var6) {
			var1 = 0;
		}

		var6 <<= var4;
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-23"
	)
	static final int method4306() {
		return ViewportMouse.ViewportMouse_y;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lnx;IIB)V",
		garbageValue = "15"
	)
	public static void method4302(Widget var0, int var1, int var2) {
		PlayerComposition var3 = var0.field3838;
		boolean var4 = var2 != var3.gender;
		var3.gender = var2;
		if (var4) {
			int var5;
			int var7;
			if (var3.gender == var1) {
				for (var5 = 0; var5 < PlayerComposition.equipmentIndices.length; ++var5) {
					var7 = PlayerComposition.equipmentIndices[var5];
					if (var3.equipment[var7] > 0 && var3.equipment[var7] < 512) {
						var3.equipment[var7] = var3.field3771[var7];
					}
				}
			} else {
				label72: {
					if (var3.equipment[0] >= 512) {
						boolean var8;
						if (var3.equipment[0] < 512) {
							var8 = false;
						} else {
							ItemComposition var6 = class164.ItemDefinition_get(var3.equipment[0] - 512);
							var8 = var6.maleModel1 != class210.field2307.field2311 && var6.maleModel2 != class210.field2307.field2311;
						}

						if (!var8) {
							break label72;
						}
					}

					var3.equipment[class210.field2307.field2311] = 1;
				}

				for (var5 = 0; var5 < 7; ++var5) {
					var7 = PlayerComposition.equipmentIndices[var5];
					if (var3.equipment[var7] > 0 && var3.equipment[var7] < 512) {
						class325.method6121(var2, var3.equipment, var5);
					}
				}
			}
		}

		var3.method6538();
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1261016918"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field729 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (GrandExchangeOfferOwnWorldComparator.getWindowedMode() == 1) {
			class415.client.setMaxCanvasSize(765, 503);
		} else {
			class415.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25) {
			class333.method6367();
		}

	}
}
