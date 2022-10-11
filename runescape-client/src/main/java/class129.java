import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ds")
public abstract class class129 extends Node {
	class129() {
	} // L: 68

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "-41"
	)
	abstract void vmethod3320(Buffer var1);

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Led;I)V",
		garbageValue = "-538131930"
	)
	abstract void vmethod3313(ClanSettings var1);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "877438235"
	)
	static int method3013(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) { // L: 3011
			Interpreter.Interpreter_intStackSize -= 2; // L: 3012
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3013
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3014
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 + var3; // L: 3015
			return 1; // L: 3016
		} else if (var0 == ScriptOpcodes.SUB) { // L: 3018
			Interpreter.Interpreter_intStackSize -= 2; // L: 3019
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3020
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3021
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 - var4; // L: 3022
			return 1; // L: 3023
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 3025
			Interpreter.Interpreter_intStackSize -= 2; // L: 3026
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3027
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3028
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 * var4; // L: 3029
			return 1; // L: 3030
		} else if (var0 == ScriptOpcodes.DIV) { // L: 3032
			Interpreter.Interpreter_intStackSize -= 2; // L: 3033
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3034
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3035
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 / var4; // L: 3036
			return 1; // L: 3037
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 3039
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3040
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3); // L: 3041
			return 1; // L: 3042
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 3044
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3045
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1)); // L: 3046
			return 1; // L: 3047
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 3049
				Interpreter.Interpreter_intStackSize -= 5; // L: 3050
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3051
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3052
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3053
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 3054
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 3055
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5); // L: 3056
				return 1; // L: 3057
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 3059
				Interpreter.Interpreter_intStackSize -= 2; // L: 3060
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3061
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3062
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 + var4 * var3 / 100; // L: 3063
				return 1; // L: 3064
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 3066
				Interpreter.Interpreter_intStackSize -= 2; // L: 3067
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3068
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3069
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 | 1 << var4; // L: 3070
				return 1; // L: 3071
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 3073
				Interpreter.Interpreter_intStackSize -= 2; // L: 3074
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3075
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3076
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4); // L: 3077
				return 1; // L: 3078
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 3080
				Interpreter.Interpreter_intStackSize -= 2; // L: 3081
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3082
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3083
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0; // L: 3084
				return 1; // L: 3085
			} else if (var0 == ScriptOpcodes.MOD) { // L: 3087
				Interpreter.Interpreter_intStackSize -= 2; // L: 3088
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3089
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3090
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 % var4; // L: 3091
				return 1; // L: 3092
			} else if (var0 == ScriptOpcodes.POW) { // L: 3094
				Interpreter.Interpreter_intStackSize -= 2; // L: 3095
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3096
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3097
				if (var3 == 0) { // L: 3098
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4); // L: 3099
				}

				return 1; // L: 3100
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 3102
				Interpreter.Interpreter_intStackSize -= 2; // L: 3103
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3104
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3105
				if (var3 == 0) { // L: 3106
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3107
					return 1; // L: 3108
				} else {
					switch(var4) { // L: 3110
					case 0:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 3123
						break; // L: 3124
					case 1:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 3138
						break;
					case 2:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3); // L: 3128
						break; // L: 3129
					case 3:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3); // L: 3113
						break;
					case 4:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3)); // L: 3133
						break; // L: 3134
					default:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4); // L: 3118
					}

					return 1; // L: 3142
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 3144
				Interpreter.Interpreter_intStackSize -= 2; // L: 3145
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3146
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3147
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & var4; // L: 3148
				return 1; // L: 3149
			} else if (var0 == ScriptOpcodes.OR) { // L: 3151
				Interpreter.Interpreter_intStackSize -= 2; // L: 3152
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3153
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3154
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 | var4; // L: 3155
				return 1; // L: 3156
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 3158
				Interpreter.Interpreter_intStackSize -= 3; // L: 3159
				long var9 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3160
				long var11 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3161
				long var13 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3162
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(var13 * var9 / var11); // L: 3163
				return 1; // L: 3164
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 3166
				var3 = RouteStrategy.method4026(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3167
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 3168
				return 1; // L: 3169
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 3171
				Interpreter.Interpreter_intStackSize -= 2; // L: 3172
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3173
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3174
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 ^ 1 << var4; // L: 3175
				return 1; // L: 3176
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 3178
				Interpreter.Interpreter_intStackSize -= 3; // L: 3179
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3180
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3181
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3182
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = KitDefinition.method3588(var3, var4, var5); // L: 3183
				return 1; // L: 3184
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3186
				Interpreter.Interpreter_intStackSize -= 3; // L: 3187
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3188
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3189
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3190
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapRectangle.method5113(var3, var4, var5); // L: 3191
				return 1; // L: 3192
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3194
				Interpreter.Interpreter_intStackSize -= 3; // L: 3195
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3196
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3197
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3198
				var6 = 31 - var5; // L: 3199
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 << var6 >>> var4 + var6; // L: 3200
				return 1; // L: 3201
			} else if (var0 == 4030) { // L: 3203
				Interpreter.Interpreter_intStackSize -= 4; // L: 3204
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3205
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3206
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3207
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 3208
				var3 = WorldMapRectangle.method5113(var3, var5, var6); // L: 3209
				var7 = ArchiveLoader.method2208(var6 - var5 + 1); // L: 3210
				if (var4 > var7) { // L: 3211
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 | var4 << var5; // L: 3212
				return 1; // L: 3213
			} else if (var0 == 4032) { // L: 3215
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = VarbitComposition.method3709(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3216
				return 1; // L: 3217
			} else if (var0 == 4033) { // L: 3219
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = DefaultsGroup.method7084(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3220
				return 1; // L: 3221
			} else if (var0 == 4034) { // L: 3223
				Interpreter.Interpreter_intStackSize -= 2; // L: 3224
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3225
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3226
				var5 = FriendsList.method6799(var3, var4); // L: 3227
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 3228
				return 1; // L: 3229
			} else if (var0 == 4035) { // L: 3231
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3232
				return 1; // L: 3233
			} else {
				return 2; // L: 3235
			}
		}
	}
}
