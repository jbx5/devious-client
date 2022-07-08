import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("hv")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lhv;")
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(1, ((byte) (0))),
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lhv;")
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(3, ((byte) (1))),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lhv;")
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(2, ((byte) (2))),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lhv;")
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(0, ((byte) (3)));
	@ObfuscatedName("s")
	public static short[] field2793;

	@ObfuscatedName("eq")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("archive9")
	static Archive archive9;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -2074450081)
	@Export("type")
	final int type;

	@ObfuscatedName("e")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-100")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(B)[Lhv;", garbageValue = "0")
	static WorldMapSectionType[] method4950() {
		return new WorldMapSectionType[]{ WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE0 };
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "-803910111")
	static int method4953(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
			return 1;
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (var13 == 0) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (var13 == 2) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (var13 == 5) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (var13 == 1) ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
					var12 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
					if (class143.grandExchangeEvents != null) {
						class143.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
					}
					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
					var12 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
					if (class143.grandExchangeEvents != null) {
						class143.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
					}
					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
					class446.Interpreter_intStackSize -= 2;
					var12 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] == 1;
					boolean var11 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1] == 1;
					if (class143.grandExchangeEvents != null) {
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11;
						class143.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12);
					}
					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
					var12 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
					if (class143.grandExchangeEvents != null) {
						class143.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
					}
					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
					var12 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
					if (class143.grandExchangeEvents != null) {
						class143.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
					}
					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (class143.grandExchangeEvents == null) ? 0 : class143.grandExchangeEvents.events.size();
					return 1;
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (class143.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.world;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (class143.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (class143.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (class143.grandExchangeEvents.events.get(var3)));
						long var5 = class115.method2692() - class270.field3177 - var4.age;
						int var7 = ((int) (var5 / 3600000L));
						int var8 = ((int) ((var5 - ((long) (var7 * 3600000))) / 60000L));
						int var9 = ((int) ((var5 - ((long) (var7 * 3600000)) - ((long) (var8 * 60000))) / 1000L));
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (class143.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (class143.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (class143.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "1351074150")
	static int method4948(int var0, Script var1, boolean var2) {
		if (var0 >= 7200 && var0 < 7204) {
			class446.Interpreter_intStackSize -= 5;
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7204) {
			class446.Interpreter_intStackSize -= 6;
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 >= 7205 && var0 < 7209) {
			Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7209) {
			class446.Interpreter_intStackSize -= 2;
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 >= 7210 && var0 < 7214) {
			--class446.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7214) {
			class446.Interpreter_intStackSize -= 2;
			return 1;
		} else {
			return 2;
		}
	}
}