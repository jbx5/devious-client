import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
public class class355 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Log;FFFB)F",
		garbageValue = "12"
	)
	static float method6700(class391 var0, float var1, float var2, float var3) {
		float var4 = StructComposition.method3747(var0.field4454, var0.field4455, var1); // L: 116
		if (Math.abs(var4) < class115.field1423) { // L: 117
			return var1;
		} else {
			float var5 = StructComposition.method3747(var0.field4454, var0.field4455, var2); // L: 118
			if (Math.abs(var5) < class115.field1423) { // L: 119
				return var2;
			} else {
				float var6 = 0.0F; // L: 120
				float var7 = 0.0F; // L: 121
				float var8 = 0.0F; // L: 122
				float var13 = 0.0F; // L: 127
				boolean var14 = true; // L: 128
				boolean var15 = false; // L: 129

				do {
					var15 = false; // L: 131
					if (var14) { // L: 132
						var6 = var1; // L: 133
						var13 = var4; // L: 134
						var7 = var2 - var1; // L: 135
						var8 = var7; // L: 136
						var14 = false; // L: 137
					}

					if (Math.abs(var13) < Math.abs(var5)) { // L: 139
						var1 = var2; // L: 140
						var2 = var6; // L: 141
						var6 = var1; // L: 142
						var4 = var5; // L: 143
						var5 = var13; // L: 144
						var13 = var4; // L: 145
					}

					float var16 = class115.field1420 * Math.abs(var2) + 0.5F * var3; // L: 147
					float var17 = (var6 - var2) * 0.5F; // L: 148
					boolean var18 = Math.abs(var17) > var16 && 0.0F != var5; // L: 149
					if (var18) { // L: 150
						if (Math.abs(var8) >= var16 && Math.abs(var4) > Math.abs(var5)) { // L: 151
							float var12 = var5 / var4; // L: 156
							float var9;
							float var10;
							if (var1 == var6) { // L: 157
								var9 = var17 * 2.0F * var12; // L: 158
								var10 = 1.0F - var12; // L: 159
							} else {
								var10 = var4 / var13; // L: 162
								float var11 = var5 / var13; // L: 163
								var9 = ((var10 - var11) * var10 * 2.0F * var17 - (var11 - 1.0F) * (var2 - var1)) * var12; // L: 164
								var10 = (var12 - 1.0F) * (var11 - 1.0F) * (var10 - 1.0F); // L: 165
							}

							if ((double)var9 > 0.0D) { // L: 167
								var10 = -var10;
							} else {
								var9 = -var9; // L: 168
							}

							var12 = var8; // L: 169
							var8 = var7; // L: 170
							if (2.0F * var9 < 3.0F * var17 * var10 - Math.abs(var16 * var10) && var9 < Math.abs(var12 * 0.5F * var10)) { // L: 171
								var7 = var9 / var10; // L: 172
							} else {
								var7 = var17; // L: 175
								var8 = var17; // L: 176
							}
						} else {
							var7 = var17; // L: 152
							var8 = var17; // L: 153
						}

						var1 = var2; // L: 179
						var4 = var5; // L: 180
						if (Math.abs(var7) > var16) { // L: 181
							var2 += var7;
						} else if ((double)var17 > 0.0D) { // L: 182
							var2 += var16;
						} else {
							var2 -= var16; // L: 183
						}

						var5 = StructComposition.method3747(var0.field4454, var0.field4455, var2); // L: 184
						if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0D) { // L: 185
							var14 = true; // L: 186
							var15 = true; // L: 187
						} else {
							var15 = true; // L: 190
						}
					}
				} while(var15);

				return var2; // L: 194
			}
		}
	}
}
