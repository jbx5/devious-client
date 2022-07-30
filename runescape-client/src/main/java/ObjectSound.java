import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("bj")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Llt;")
	@Export("objectSounds")
	static NodeDeque objectSounds = new NodeDeque();

	@ObfuscatedName("de")
	@Export("mouseCam")
	static boolean mouseCam;

	@ObfuscatedName("jh")
	@ObfuscatedGetter(intValue = -1822247975)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 212392441)
	@Export("plane")
	int plane;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -278318549)
	@Export("x")
	int x;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -1341823616)
	@Export("y")
	int y;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -191743071)
	@Export("maxX")
	int maxX;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1980588265)
	@Export("maxY")
	int maxY;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = -772687821)
	int field814;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -2001625905)
	@Export("soundEffectId")
	int soundEffectId;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lav;")
	@Export("stream1")
	RawPcmStream stream1;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 2058290103)
	int field817;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 182876323)
	int field823;

	@ObfuscatedName("n")
	@Export("soundEffectIds")
	int[] soundEffectIds;

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 228178925)
	int field818;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Lav;")
	@Export("stream2")
	RawPcmStream stream2;

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "Lgx;")
	@Export("obj")
	ObjectComposition obj;

	ObjectSound() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-621060457")
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field814 = var2.int7 * 128;
			this.field817 = var2.int5;
			this.field823 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field814 = 0;
			this.field817 = 0;
			this.field823 = 0;
			this.soundEffectIds = null;
		}
		if (var1 != this.soundEffectId && this.stream1 != null) {
			StructComposition.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ldp;[F[FB)V", garbageValue = "1")
	static void method1774(class117 var0, float[] var1, float[] var2) {
		if (var0 != null) {
			float var3 = var1[3] - var1[0];
			if (0.0 != ((double) (var3))) {
				float var4 = var1[1] - var1[0];
				float var5 = var1[2] - var1[0];
				Float var6 = var4 / var3;
				Float var7 = var5 / var3;
				var0.field1433 = var6 == 0.33333334F && var7 == 0.6666667F;
				float var8 = var6;
				float var9 = var7;
				if (((double) (var6)) < 0.0) {
					var6 = 0.0F;
				}
				if (((double) (var7)) > 1.0) {
					var7 = 1.0F;
				}
				if (((double) (var6)) > 1.0 || var7 < -1.0F) {
					AbstractByteArrayCopier.method5509(var6, var7);
				}
				if (var6 != var8) {
					var1[1] = var1[0] + var6 * var3;
					if (0.0 != ((double) (var8))) {
						var2[1] = var2[0] + (var2[1] - var2[0]) * var6 / var8;
					}
				}
				if (var7 != var9) {
					var1[2] = var1[0] + var7 * var3;
					if (1.0 != ((double) (var9))) {
						var2[2] = ((float) (((double) (var2[3])) - ((double) (var2[3] - var2[2])) * (1.0 - ((double) (var7))) / (1.0 - ((double) (var9)))));
					}
				}
				var0.field1439 = var1[0];
				var0.field1440 = var1[3];
				float var10 = var6;
				float var11 = var7;
				float[] var12 = var0.field1441;
				float var13 = var10 - 0.0F;
				float var14 = var11 - var10;
				float var15 = 1.0F - var11;
				float var16 = var14 - var13;
				var12[3] = var15 - var14 - var16;
				var12[2] = var16 + var16 + var16;
				var12[1] = var13 + var13 + var13;
				var12[0] = 0.0F;
				var13 = var2[0];
				var14 = var2[1];
				var15 = var2[2];
				var16 = var2[3];
				float[] var17 = var0.field1442;
				float var18 = var14 - var13;
				float var19 = var15 - var14;
				float var20 = var16 - var15;
				float var21 = var19 - var18;
				var17[3] = var20 - var19 - var21;
				var17[2] = var21 + var21 + var21;
				var17[1] = var18 + var18 + var18;
				var17[0] = var13;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = "(ILbc;ZB)I", garbageValue = "47")
	static int method1770(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
			return 1;
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (var13 == 0) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (var13 == 2) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (var13 == 5) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (var13 == 1) ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
					var12 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
					if (class302.grandExchangeEvents != null) {
						class302.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
					}
					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
					var12 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
					if (class302.grandExchangeEvents != null) {
						class302.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
					}
					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
					TaskHandler.Interpreter_intStackSize -= 2;
					var12 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize] == 1;
					boolean var11 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1] == 1;
					if (class302.grandExchangeEvents != null) {
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11;
						class302.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12);
					}
					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
					var12 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
					if (class302.grandExchangeEvents != null) {
						class302.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
					}
					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
					var12 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
					if (class302.grandExchangeEvents != null) {
						class302.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
					}
					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (class302.grandExchangeEvents == null) ? 0 : class302.grandExchangeEvents.events.size();
					return 1;
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (class302.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.world;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (class302.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4.getOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (class302.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (class302.grandExchangeEvents.events.get(var3)));
						long var5 = class131.method2916() - class20.field116 - var4.age;
						int var7 = ((int) (var5 / 3600000L));
						int var8 = ((int) ((var5 - ((long) (var7 * 3600000))) / 60000L));
						int var9 = ((int) ((var5 - ((long) (var7 * 3600000)) - ((long) (var8 * ''))) / 1000L));
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var10;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (class302.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (class302.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (class302.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(descriptor = "(Lcs;II)V", garbageValue = "1067868497")
	static final void method1776(Actor var0, int var1) {
		GrandExchangeOfferOwnWorldComparator.worldToScreen(var0.x, var0.y, var1);
	}
}