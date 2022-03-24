import java.util.Locale;





import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("Language")
public class Language implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Llp;")

	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Llp;")

	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Llp;")

	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Llp;")

	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Llp;")

	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Llp;")

	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"Llp;")

	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"[Llp;")

	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("ib")
	@ObfuscatedGetter(intValue = 
	1235623999)

	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("f")
	final String field4062;
	@ObfuscatedName("u")
	@Export("language")
	final String language;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	-1267463723)

	@Export("id")
	final int id;
	static 
	{
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4073, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4073, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4073, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4073, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4075, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4075, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4073, 6, "MX");
		Language[] var0 = method6118();
		Language_valuesOrdered = new Language[var0.length];
		Language[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			Language var3 = var1[var2];
			if (Language_valuesOrdered[var3.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var3.id] = var3;
		}

	}

	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llj;ILjava/lang/String;)V")

	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4062 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"15")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/lang/String;", garbageValue = 
	"940593481")

	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(III)Z", garbageValue = 
	"2038855833")

	static boolean method6135(int var0, int var1) {
		return (var0 != 4) || (var1 < 8);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)[Llp;", garbageValue = 
	"3")

	static Language[] method6118() {
		return new Language[]{ Language_DE, Language_ES_MX, Language_EN, Language_FR, Language_ES, Language_PT, Language_NL };
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)[Lji;", garbageValue = 
	"42")

	public static class263[] method6134() {
		return new class263[]{ class263.field3010, class263.field3004, class263.field3005, class263.field3006, class263.field3007, class263.field3008, class263.field3009, class263.field3013, class263.field3011, class263.field3012 };
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"-118")

	static void method6136(int var0) {
		ItemContainer var1 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("d")
	static boolean method6131(long var0) {
		return ((int) ((var0 >>> 16) & 1L)) == 1;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"(IIB)I", garbageValue = 
	"125")

	static final int method6137(int var0, int var1) {
		int var2 = ((AbstractSocket.method6884(var0 - 1, var1 - 1) + AbstractSocket.method6884(var0 + 1, var1 - 1)) + AbstractSocket.method6884(var0 - 1, var1 + 1)) + AbstractSocket.method6884(var0 + 1, var1 + 1);
		int var3 = ((AbstractSocket.method6884(var0 - 1, var1) + AbstractSocket.method6884(1 + var0, var1)) + AbstractSocket.method6884(var0, var1 - 1)) + AbstractSocket.method6884(var0, 1 + var1);
		int var4 = AbstractSocket.method6884(var0, var1);
		return ((var2 / 16) + (var3 / 8)) + (var4 / 4);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"-1522906497")

	static int method6125(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.grandExchangeOffers[var3].type();
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.grandExchangeOffers[var3].id;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.grandExchangeOffers[var3].unitPrice;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.grandExchangeOffers[var3].totalQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.grandExchangeOffers[var3].currentQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.grandExchangeOffers[var3].currentPrice;
			return 1;
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (var13 == 0) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (var13 == 2) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (var13 == 5) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (var13 == 1) ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
					var12 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
					if (ReflectionCheck.grandExchangeEvents != null) {
						ReflectionCheck.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
					var12 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
					if (ReflectionCheck.grandExchangeEvents != null) {
						ReflectionCheck.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
					class295.Interpreter_intStackSize -= 2;
					var12 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize] == 1;
					boolean var11 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1] == 1;
					if (ReflectionCheck.grandExchangeEvents != null) {
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11;
						ReflectionCheck.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
					var12 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
					if (ReflectionCheck.grandExchangeEvents != null) {
						ReflectionCheck.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
					var12 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
					if (ReflectionCheck.grandExchangeEvents != null) {
						ReflectionCheck.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (ReflectionCheck.grandExchangeEvents == null) ? 0 : ReflectionCheck.grandExchangeEvents.events.size();
					return 1;
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (ReflectionCheck.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var4.world;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (ReflectionCheck.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var4.getOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (ReflectionCheck.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var4.getPreviousOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (ReflectionCheck.grandExchangeEvents.events.get(var3)));
						long var5 = (WorldMapSprite.getServerTime() - Varps.field3287) - var4.age;
						int var7 = ((int) (var5 / 3600000L));
						int var8 = ((int) ((var5 - ((long) (var7 * 3600000))) / 60000L));
						int var9 = ((int) (((var5 - ((long) (var7 * 3600000))) - ((long) (var8 * 60000))) / 1000L));
						String var10 = (((((var7 + ":") + (var8 / 10)) + (var8 % 10)) + ":") + (var9 / 10)) + (var9 % 10);
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var10;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (ReflectionCheck.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var4.grandExchangeOffer.totalQuantity;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (ReflectionCheck.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var4.grandExchangeOffer.unitPrice;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (ReflectionCheck.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var4.grandExchangeOffer.id;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"303370492")

	static int method6121(int var0, Script var1, boolean var2) {
		if (((((var0 != 6700) && (var0 != 6702)) && (var0 != 6704)) && (var0 != 6706)) && (var0 != 6708)) {
			if (((((var0 != 6701) && (var0 != 6703)) && (var0 != 6705)) && (var0 != 6707)) && (var0 != 6709)) {
				if (var0 == 6750) {
					Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
					return 1;
				} else if (((var0 != 6751) && (var0 != 6752)) && (var0 != 6753)) {
					if (var0 == 6754) {
						int var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						NPCComposition var4 = class9.getNpcDefinition(var3);
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = (var4 != null) ? var4.name : "";
						return 1;
					} else {
						return 2;
					}
				} else {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
					return 1;
				}
			} else {
				--class295.Interpreter_intStackSize;
				return 1;
			}
		} else {
			class295.Interpreter_intStackSize -= 2;
			--ChatChannel.Interpreter_stringStackSize;
			return 1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"-525559357")

	static int method6132(int var0, Script var1, boolean var2) {
		if (var0 == 6900) {
			Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
			return 1;
		} else if (var0 == 6950) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(descriptor = 
	"(IIIIZI)V", garbageValue = 
	"-1490020023")

	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field745;
		} else if (var5 >= 100) {
			var6 = Client.field706;
		} else {
			var6 = (((Client.field706 - Client.field745) * var5) / 100) + Client.field745;
		}

		int var7 = ((var3 * var6) * 512) / (var2 * 334);
		int var8;
		int var9;
		short var17;
		if (var7 < Client.field751) {
			var17 = Client.field751;
			var6 = ((var17 * var2) * 334) / (var3 * 512);
			if (var6 > Client.field750) {
				var6 = Client.field750;
				var8 = ((var3 * var6) * 512) / (var17 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle((var0 + var2) - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field752) {
			var17 = Client.field752;
			var6 = ((var17 * var2) * 334) / (var3 * 512);
			if (var6 < Client.field562) {
				var6 = Client.field562;
				var8 = ((var17 * var2) * 334) / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, (var3 + var1) - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = (var3 * var6) / 334;
		if ((var2 != Client.viewportWidth) || (var3 != Client.viewportHeight)) {
			int[] var16 = new int[9];

			for (var9 = 0; var9 < var16.length; ++var9) {
				int var10 = ((var9 * 32) + 15) + 128;
				int var11 = DevicePcmPlayerProvider.method385(var10);
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10];
				int var14 = var3 - 334;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 100) {
					var14 = 100;
				}

				int var15 = (((Client.zoomWidth - Client.zoomHeight) * var14) / 100) + Client.zoomHeight;
				int var13 = (var15 * var11) / 256;
				var16[var9] = (var13 * var12) >> 16;
			}

			Scene.Scene_buildVisiblityMap(var16, 500, 800, (var2 * 334) / var3, 334);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}