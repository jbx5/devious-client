import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mq")
public class class361 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final class361 field4300;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	static final class361 field4301;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1404357375
	)
	final int field4302;

	static {
		field4300 = new class361(0); // L: 5
		field4301 = new class361(1); // L: 6
	}

	class361(int var1) {
		this.field4302 = var1; // L: 10
	} // L: 11

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZB)I",
		garbageValue = "6"
	)
	static int method6736(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1022
			var0 -= 1000; // L: 1023
			var3 = SpotAnimationDefinition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1024
		} else {
			var3 = var2 ? TextureProvider.scriptDotWidget : MenuAction.scriptActiveWidget; // L: 1026
		}

		String var4 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 1027
		int[] var5 = null; // L: 1028
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1029
			int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1030
			if (var6 > 0) { // L: 1031
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]) { // L: 1032 1033
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1035
		}

		Object[] var8 = new Object[var4.length() + 1]; // L: 1037

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) { // L: 1038
			if (var4.charAt(var7 - 1) == 's') { // L: 1039
				var8[var7] = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1040
			}
		}

		var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1042
		if (var7 != -1) { // L: 1043
			var8[0] = new Integer(var7);
		} else {
			var8 = null; // L: 1044
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) { // L: 1045
			var3.onClick = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1046
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1047
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1048
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1049
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1050
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1051
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1052
			var3.onVarTransmit = var8; // L: 1053
			var3.varTransmitTriggers = var5; // L: 1054
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1056
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1057
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1058
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1059
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1060
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1061
			var3.onInvTransmit = var8; // L: 1062
			var3.invTransmitTriggers = var5; // L: 1063
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1065
			var3.onStatTransmit = var8; // L: 1066
			var3.statTransmitTriggers = var5; // L: 1067
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 1069
			var3.onTargetEnter = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1070
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1071
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1072
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1073
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1074
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1075
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1076
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1077
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1078
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) { // L: 1079
			var3.field3452 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1080
			var3.onResize = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1081
			var3.field3526 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1082
			var3.field3431 = var8;
		} else if (var0 == 1430) { // L: 1083
			var3.field3528 = var8;
		} else if (var0 == 1431) { // L: 1084
			var3.field3511 = var8;
		} else if (var0 == 1434) { // L: 1085
			var3.field3522 = var8;
		} else {
			if (var0 != 1435) { // L: 1086
				return 2; // L: 1087
			}

			var3.field3506 = var8;
		}

		var3.hasListener = true; // L: 1088
		return 1; // L: 1089
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZB)I",
		garbageValue = "7"
	)
	static int method6735(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 2864
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2865
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 2866
			return 1; // L: 2867
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 2869
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2870
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 2871
			return 1; // L: 2872
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 2874
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2875
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 2876
			return 1; // L: 2877
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 2879
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2880
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 2881
			return 1; // L: 2882
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 2884
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2885
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 2886
			return 1; // L: 2887
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 2889
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2890
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 2891
			return 1; // L: 2892
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 2894
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2895
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2896
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 2897
				return 1; // L: 2898
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 2900
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2901
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2902
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 2903
				return 1; // L: 2904
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 2906
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2907
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2908
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 2909
				return 1; // L: 2910
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 2912
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2913
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2914
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 2915
				return 1; // L: 2916
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 2918
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2919
					if (EnumComposition.grandExchangeEvents != null) { // L: 2920
						EnumComposition.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 2921
					}

					return 1; // L: 2923
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 2925
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2926
					if (EnumComposition.grandExchangeEvents != null) { // L: 2927
						EnumComposition.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 2928
					}

					return 1; // L: 2930
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 2932
					Interpreter.Interpreter_intStackSize -= 2; // L: 2933
					var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == 1; // L: 2934
					boolean var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 2935
					if (EnumComposition.grandExchangeEvents != null) { // L: 2936
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 2937
						EnumComposition.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 2938
					}

					return 1; // L: 2940
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 2942
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2943
					if (EnumComposition.grandExchangeEvents != null) { // L: 2944
						EnumComposition.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 2945
					}

					return 1; // L: 2947
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 2949
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2950
					if (EnumComposition.grandExchangeEvents != null) { // L: 2951
						EnumComposition.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 2952
					}

					return 1; // L: 2954
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 2956
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = EnumComposition.grandExchangeEvents == null ? 0 : EnumComposition.grandExchangeEvents.events.size(); // L: 2957
					return 1; // L: 2958
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 2960
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2961
						var4 = (GrandExchangeEvent)EnumComposition.grandExchangeEvents.events.get(var3); // L: 2962
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.world; // L: 2963
						return 1; // L: 2964
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 2966
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2967
						var4 = (GrandExchangeEvent)EnumComposition.grandExchangeEvents.events.get(var3); // L: 2968
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 2969
						return 1; // L: 2970
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 2972
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2973
						var4 = (GrandExchangeEvent)EnumComposition.grandExchangeEvents.events.get(var3); // L: 2974
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 2975
						return 1; // L: 2976
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 2978
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2979
						var4 = (GrandExchangeEvent)EnumComposition.grandExchangeEvents.events.get(var3); // L: 2980
						long var5 = Language.method6232() - SceneTilePaint.field2649 - var4.age; // L: 2981
						int var7 = (int)(var5 / 3600000L); // L: 2982
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 2983
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 2984
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 2985
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var10; // L: 2986
						return 1; // L: 2987
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 2989
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2990
						var4 = (GrandExchangeEvent)EnumComposition.grandExchangeEvents.events.get(var3); // L: 2991
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 2992
						return 1; // L: 2993
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 2995
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2996
						var4 = (GrandExchangeEvent)EnumComposition.grandExchangeEvents.events.get(var3); // L: 2997
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 2998
						return 1; // L: 2999
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 3001
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3002
						var4 = (GrandExchangeEvent)EnumComposition.grandExchangeEvents.events.get(var3); // L: 3003
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 3004
						return 1; // L: 3005
					} else {
						return 2; // L: 3007
					}
				}
			}
		}
	}
}
