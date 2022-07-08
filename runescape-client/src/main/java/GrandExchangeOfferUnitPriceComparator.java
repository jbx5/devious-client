import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.text.ParseException;
import java.util.Comparator;
import java.util.Date;
import net.runelite.mapping.Export;
@ObfuscatedName("ly")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Llj;Llj;I)I", garbageValue = "-2004855128")
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1;
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged(((GrandExchangeEvent) (var1)), ((GrandExchangeEvent) (var2)));
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-118")
	static boolean method6031() {
		Date var0;
		try {
			var0 = GameObject.method4552();
		} catch (ParseException var9) {
			GraphicsObject.method1877("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}
		if (var0 == null) {
			return false;
		} else {
			java.util.Calendar var2 = java.util.Calendar.getInstance();
			var2.set(1, var2.get(1) - 13);
			var2.set(5, var2.get(5) + 1);
			var2.set(11, 0);
			var2.set(12, 0);
			var2.set(13, 0);
			var2.set(14, 0);
			Date var3 = var2.getTime();
			boolean var5 = var0.before(var3);
			Date var4 = BufferedNetSocket.method6835();
			boolean var7 = var0.after(var4);
			if (!var7) {
				GraphicsObject.method1877("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
				return false;
			} else {
				if (!var5) {
					class174.field1891 = 8388607;
				} else {
					class174.field1891 = ((int) (var0.getTime() / 86400000L - 11745L));
				}
				return true;
			}
		}
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1960096370")
	static final void method6024() {
		PacketBuffer var0 = Client.packetWriter.packetBuffer;
		var0.importIndex();
		int var1 = var0.readBits(8);
		int var2;
		if (var1 < Client.npcCount) {
			for (var2 = var1; var2 < Client.npcCount; ++var2) {
				Client.field616[++Client.field615 - 1] = Client.npcIndices[var2];
			}
		}
		if (var1 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;
			for (var2 = 0; var2 < var1; ++var2) {
				int var3 = Client.npcIndices[var2];
				NPC var4 = Client.npcs[var3];
				int var5 = var0.readBits(1);
				if (var5 == 0) {
					Client.npcIndices[++Client.npcCount - 1] = var3;
					var4.npcCycle = Client.cycle;
				} else {
					int var6 = var0.readBits(2);
					if (var6 == 0) {
						Client.npcIndices[++Client.npcCount - 1] = var3;
						var4.npcCycle = Client.cycle;
						Client.field539[++Client.field538 - 1] = var3;
					} else {
						int var7;
						int var8;
						if (var6 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var3;
							var4.npcCycle = Client.cycle;
							var7 = var0.readBits(3);
							var4.method2361(var7, class192.field2212);
							var8 = var0.readBits(1);
							if (var8 == 1) {
								Client.field539[++Client.field538 - 1] = var3;
							}
						} else if (var6 == 2) {
							Client.npcIndices[++Client.npcCount - 1] = var3;
							var4.npcCycle = Client.cycle;
							if (var0.readBits(1) == 1) {
								var7 = var0.readBits(3);
								var4.method2361(var7, class192.field2211);
								var8 = var0.readBits(3);
								var4.method2361(var8, class192.field2211);
							} else {
								var7 = var0.readBits(3);
								var4.method2361(var7, class192.field2209);
							}
							var7 = var0.readBits(1);
							if (var7 == 1) {
								Client.field539[++Client.field538 - 1] = var3;
							}
						} else if (var6 == 3) {
							Client.field616[++Client.field615 - 1] = var3;
						}
					}
				}
			}
		}
	}
}