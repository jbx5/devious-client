import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class147 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = -7511183678987547969L
	)
	long field1689;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -527511193
	)
	public int field1696;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	IterableNodeDeque field1690;

	@ObfuscatedSignature(
		descriptor = "(Lur;)V"
	)
	public class147(Buffer var1) {
		this.field1696 = -1;
		this.field1690 = new IterableNodeDeque();
		this.method3166(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "19136782"
	)
	void method3166(Buffer var1) {
		this.field1689 = var1.readLong();
		this.field1696 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class166(this);
			} else if (var2 == 1) {
				var3 = new LoginPacket(this);
			} else if (var2 == 13) {
				var3 = new class159(this);
			} else if (var2 == 4) {
				var3 = new class151(this);
			} else if (var2 == 6) {
				var3 = new class158(this);
			} else if (var2 == 5) {
				var3 = new class143(this);
			} else if (var2 == 2) {
				var3 = new class148(this);
			} else if (var2 == 7) {
				var3 = new class141(this);
			} else if (var2 == 14) {
				var3 = new class145(this);
			} else if (var2 == 8) {
				var3 = new class162(this);
			} else if (var2 == 9) {
				var3 = new class168(this);
			} else if (var2 == 10) {
				var3 = new class154(this);
			} else if (var2 == 11) {
				var3 = new class149(this);
			} else if (var2 == 12) {
				var3 = new class153(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class163(this);
			}

			((class144)var3).vmethod3420(var1);
			this.field1690.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfp;I)V",
		garbageValue = "-2105530802"
	)
	public void method3174(ClanSettings var1) {
		if (this.field1689 == var1.field1734 && this.field1696 == var1.field1744) {
			for (class144 var2 = (class144)this.field1690.last(); var2 != null; var2 = (class144)this.field1690.previous()) {
				var2.vmethod3419(var1);
			}

			++var1.field1744;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lor;",
		garbageValue = "507270402"
	)
	public static class370[] method3171() {
		return new class370[]{class370.field4320, class370.field4319, class370.field4321, class370.field4324};
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Liu;",
		garbageValue = "-32"
	)
	public static class233[] method3172() {
		return new class233[]{class233.field2483, class233.field2485, class233.field2488, class233.field2486};
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)I",
		garbageValue = "-1220326076"
	)
	static final int method3173(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
			try {
				int[] var2 = var0.cs1Instructions[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}

					if (var6 == 1) {
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) {
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) {
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = class243.widgetDefinition.method6281(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!HttpRequest.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) {
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) {
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) {
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) {
						var7 = class133.localPlayer.combatLevel;
					}

					if (var6 == 9) {
						for (var9 = 0; var9 < 25; ++var9) {
							if (Skills.Skills_enabled[var9]) {
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = class243.widgetDefinition.method6281(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!HttpRequest.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 = 999999999;
									break;
								}
							}
						}
					}

					if (var6 == 11) {
						var7 = Client.runEnergy;
					}

					if (var6 == 12) {
						var7 = Client.weight;
					}

					if (var6 == 13) {
						var9 = Varps.Varps_main[var2[var4++]];
						int var13 = var2[var4++];
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = SpotAnimationDefinition.getVarbit(var9);
					}

					if (var6 == 15) {
						var8 = 1;
					}

					if (var6 == 16) {
						var8 = 2;
					}

					if (var6 == 17) {
						var8 = 3;
					}

					if (var6 == 18) {
						var7 = GrandExchangeOfferOwnWorldComparator.baseX * 64 + (class133.localPlayer.x >> 7);
					}

					if (var6 == 19) {
						var7 = DevicePcmPlayerProvider.baseY * 64 + (class133.localPlayer.y >> 7);
					}

					if (var6 == 20) {
						var7 = var2[var4++];
					}

					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}

						if (var5 == 1) {
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}

						if (var5 == 3) {
							var3 *= var7;
						}

						var5 = 0;
					} else {
						var5 = var8;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}
}
