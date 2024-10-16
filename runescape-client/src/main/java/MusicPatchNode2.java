import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mq")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("ap")
	byte[] field3612;
	@ObfuscatedName("aw")
	byte[] field3613;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -45274081
	)
	int field3611;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 673344057
	)
	int field3614;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1450993153
	)
	int field3615;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2113529759
	)
	int field3616;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1464811851
	)
	int field3617;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1749128175
	)
	int field3618;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2064706685
	)
	int field3619;

	MusicPatchNode2() {
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "1455682705"
	)
	static int method6562(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
			var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
			var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
			var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
			var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
			return 1;
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
				var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
				var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
				var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
				var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
					var12 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
					if (MusicSong.grandExchangeEvents != null) {
						MusicSong.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
					var12 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
					if (MusicSong.grandExchangeEvents != null) {
						MusicSong.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
					class96.Interpreter_intStackSize -= 2;
					var12 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize] == 1;
					boolean var11 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1] == 1;
					if (MusicSong.grandExchangeEvents != null) {
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11;
						MusicSong.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
					var12 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
					if (MusicSong.grandExchangeEvents != null) {
						MusicSong.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
					var12 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
					if (MusicSong.grandExchangeEvents != null) {
						MusicSong.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = MusicSong.grandExchangeEvents == null ? 0 : MusicSong.grandExchangeEvents.events.size();
					return 1;
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)MusicSong.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4.world;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)MusicSong.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var4.getOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)MusicSong.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)MusicSong.grandExchangeEvents.events.get(var3);
						long var5 = class77.method2338() - Interpreter.field868 - var4.age;
						int var7 = (int)(var5 / 3600000L);
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L);
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var10;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)MusicSong.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)MusicSong.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)MusicSong.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id;
						return 1;
					} else if (var0 == 3939) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Bounds.ItemDefinition_get(var3).isTradable ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
