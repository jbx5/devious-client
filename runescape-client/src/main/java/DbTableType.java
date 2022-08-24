import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("pu")
@Implements("DbTableType")
public class DbTableType extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lls;")
	public static AbstractArchive field4669;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Liz;")
	@Export("DBTableType_cache")
	static EvictingDualNodeHashTable DBTableType_cache = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("w")
	@Export("types")
	public int[][] types;

	@ObfuscatedName("v")
	@Export("defaultValues")
	public Object[][] defaultValues;

	DbTableType() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "2102275490")
	void method7532(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			this.method7524(var1, var2);
		} 
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqr;IB)V", garbageValue = "0")
	void method7524(Buffer var1, int var2) {
		if (var2 == 1) {
			int var3 = var1.readUnsignedByte();
			if (this.types == null) {
				this.types = new int[var3][];
			}
			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) {
				int var5 = var4 & 127;
				boolean var6 = (var4 & 128) != 0;
				int[] var7 = new int[var1.readUnsignedByte()];
				for (int var8 = 0; var8 < var7.length; ++var8) {
					var7[var8] = var1.readUShortSmart();
				}
				this.types[var5] = var7;
				if (var6) {
					if (this.defaultValues == null) {
						this.defaultValues = new Object[this.types.length][];
					}
					Object[][] var17 = this.defaultValues;
					int var11 = var1.readUShortSmart();
					Object[] var12 = new Object[var7.length * var11];
					for (int var13 = 0; var13 < var11; ++var13) {
						for (int var14 = 0; var14 < var7.length; ++var14) {
							int var15 = var14 + var7.length * var13;
							class433 var16 = class19.method285(var7[var14]);
							var12[var15] = var16.method7493(var1);
						}
					}
					var17[var5] = var12;
				}
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1626541562")
	void method7523() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = "(ILbz;ZS)I", garbageValue = "4902")
	static int method7535(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
			var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
			var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
			var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
			var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
			return 1;
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
				var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (var13 == 0) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
				var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (var13 == 2) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
				var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (var13 == 5) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
				var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (var13 == 1) ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
					var12 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
					if (UserComparator3.grandExchangeEvents != null) {
						UserComparator3.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
					}
					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
					var12 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
					if (UserComparator3.grandExchangeEvents != null) {
						UserComparator3.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
					}
					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
					User.Interpreter_intStackSize -= 2;
					var12 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize] == 1;
					boolean var11 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1] == 1;
					if (UserComparator3.grandExchangeEvents != null) {
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11;
						UserComparator3.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12);
					}
					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
					var12 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
					if (UserComparator3.grandExchangeEvents != null) {
						UserComparator3.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
					}
					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
					var12 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
					if (UserComparator3.grandExchangeEvents != null) {
						UserComparator3.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
					}
					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (UserComparator3.grandExchangeEvents == null) ? 0 : UserComparator3.grandExchangeEvents.events.size();
					return 1;
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (UserComparator3.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4.world;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (UserComparator3.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4.getOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (UserComparator3.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (UserComparator3.grandExchangeEvents.events.get(var3)));
						long var5 = class181.method3483() - FontName.field4587 - var4.age;
						int var7 = ((int) (var5 / 3600000L));
						int var8 = ((int) ((var5 - ((long) (var7 * 3600000))) / 60000L));
						int var9 = ((int) ((var5 - ((long) (var7 * 3600000)) - ((long) (var8 * ''))) / 1000L));
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var10;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (UserComparator3.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (UserComparator3.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (UserComparator3.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}