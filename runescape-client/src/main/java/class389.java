import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
public final class class389 {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Lnw;"
	)
	static class389[] field4437;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	public static final class389 field4438;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 310732121
	)
	static int field4441;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1392359511
	)
	static int field4439;
	@ObfuscatedName("w")
	public float[] field4440;

	static {
		field4437 = new class389[0]; // L: 9
		field4441 = 100; // L: 15
		field4437 = new class389[100]; // L: 16
		field4439 = 0; // L: 17
		field4438 = new class389();
	} // L: 22

	public class389() {
		this.field4440 = new float[16];
		this.method7172(); // L: 41
	} // L: 42

	@ObfuscatedSignature(
		descriptor = "(Lnw;)V"
	)
	public class389(class389 var1) {
		this.field4440 = new float[16];
		this.method7227(var1); // L: 45
	} // L: 46

	@ObfuscatedSignature(
		descriptor = "(Lqq;Z)V"
	)
	public class389(Buffer var1, boolean var2) {
		this.field4440 = new float[16]; // L: 21
		this.method7169(var1, var2); // L: 49
	} // L: 50

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-901327832"
	)
	public void method7203() {
		synchronized(field4437) { // L: 35
			if (field4439 < field4441 - 1) { // L: 36
				field4437[++field4439 - 1] = this;
			}

		}
	} // L: 38

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqq;ZI)V",
		garbageValue = "-1302105045"
	)
	void method7169(Buffer var1, boolean var2) {
		if (var2) { // L: 53
			class390 var4 = new class390(); // L: 54
			var4.method7240(UserComparator6.method2792(var1.readShort())); // L: 55
			var4.method7235(UserComparator6.method2792(var1.readShort())); // L: 56
			var4.method7236(UserComparator6.method2792(var1.readShort())); // L: 57
			var4.method7237((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 58
			this.method7180(var4); // L: 59
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 62
				this.field4440[var3] = var1.method7930(); // L: 63
			}
		}

	} // L: 66

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1579058177"
	)
	float[] method7170() {
		float[] var1 = new float[3]; // L: 69
		if ((double)this.field4440[2] < 0.999D && (double)this.field4440[2] > -0.999D) { // L: 70
			var1[1] = (float)(-Math.asin((double)this.field4440[2])); // L: 71
			double var2 = Math.cos((double)var1[1]); // L: 72
			var1[0] = (float)Math.atan2((double)this.field4440[6] / var2, (double)this.field4440[10] / var2); // L: 73
			var1[2] = (float)Math.atan2((double)this.field4440[1] / var2, (double)this.field4440[0] / var2); // L: 74
		} else {
			var1[0] = 0.0F; // L: 77
			var1[1] = (float)Math.atan2((double)this.field4440[2], 0.0D); // L: 78
			var1[2] = (float)Math.atan2((double)(-this.field4440[9]), (double)this.field4440[5]); // L: 79
		}

		return var1; // L: 81
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "-51"
	)
	public float[] method7206() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4440[6])), 0.0F, 0.0F}; // L: 85 86
		double var2 = Math.cos((double)var1[0]); // L: 87
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 88
			var4 = (double)this.field4440[2]; // L: 89
			var6 = (double)this.field4440[10]; // L: 90
			double var8 = (double)this.field4440[4]; // L: 91
			double var10 = (double)this.field4440[5]; // L: 92
			var1[1] = (float)Math.atan2(var4, var6); // L: 93
			var1[2] = (float)Math.atan2(var8, var10); // L: 94
		} else {
			var4 = (double)this.field4440[1]; // L: 97
			var6 = (double)this.field4440[0]; // L: 98
			if (this.field4440[6] < 0.0F) { // L: 99
				var1[1] = (float)Math.atan2(var4, var6); // L: 100
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 103
			}

			var1[2] = 0.0F; // L: 105
		}

		return var1; // L: 107
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "578515372"
	)
	void method7172() {
		this.field4440[0] = 1.0F; // L: 111
		this.field4440[1] = 0.0F; // L: 112
		this.field4440[2] = 0.0F; // L: 113
		this.field4440[3] = 0.0F; // L: 114
		this.field4440[4] = 0.0F; // L: 115
		this.field4440[5] = 1.0F; // L: 116
		this.field4440[6] = 0.0F; // L: 117
		this.field4440[7] = 0.0F; // L: 118
		this.field4440[8] = 0.0F; // L: 119
		this.field4440[9] = 0.0F; // L: 120
		this.field4440[10] = 1.0F; // L: 121
		this.field4440[11] = 0.0F; // L: 122
		this.field4440[12] = 0.0F; // L: 123
		this.field4440[13] = 0.0F; // L: 124
		this.field4440[14] = 0.0F; // L: 125
		this.field4440[15] = 1.0F; // L: 126
	} // L: 127

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "145510553"
	)
	public void method7173() {
		this.field4440[0] = 0.0F; // L: 130
		this.field4440[1] = 0.0F; // L: 131
		this.field4440[2] = 0.0F; // L: 132
		this.field4440[3] = 0.0F; // L: 133
		this.field4440[4] = 0.0F; // L: 134
		this.field4440[5] = 0.0F; // L: 135
		this.field4440[6] = 0.0F; // L: 136
		this.field4440[7] = 0.0F; // L: 137
		this.field4440[8] = 0.0F; // L: 138
		this.field4440[9] = 0.0F; // L: 139
		this.field4440[10] = 0.0F; // L: 140
		this.field4440[11] = 0.0F; // L: 141
		this.field4440[12] = 0.0F; // L: 142
		this.field4440[13] = 0.0F; // L: 143
		this.field4440[14] = 0.0F; // L: 144
		this.field4440[15] = 0.0F; // L: 145
	} // L: 146

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lnw;B)V",
		garbageValue = "100"
	)
	public void method7227(class389 var1) {
		System.arraycopy(var1.field4440, 0, this.field4440, 0, 16); // L: 149
	} // L: 150

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1635594797"
	)
	public void method7201(float var1) {
		this.method7176(var1, var1, var1); // L: 153
	} // L: 154

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "81"
	)
	public void method7176(float var1, float var2, float var3) {
		this.method7172(); // L: 157
		this.field4440[0] = var1; // L: 158
		this.field4440[5] = var2; // L: 159
		this.field4440[10] = var3; // L: 160
	} // L: 161

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnw;I)V",
		garbageValue = "1550721431"
	)
	public void method7221(class389 var1) {
		for (int var2 = 0; var2 < this.field4440.length; ++var2) { // L: 164
			float[] var10000 = this.field4440; // L: 165
			var10000[var2] += var1.field4440[var2];
		}

	} // L: 167

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnw;I)V",
		garbageValue = "363548376"
	)
	public void method7178(class389 var1) {
		float var2 = var1.field4440[12] * this.field4440[3] + var1.field4440[8] * this.field4440[2] + this.field4440[0] * var1.field4440[0] + var1.field4440[4] * this.field4440[1]; // L: 170
		float var3 = this.field4440[2] * var1.field4440[9] + this.field4440[1] * var1.field4440[5] + this.field4440[0] * var1.field4440[1] + var1.field4440[13] * this.field4440[3]; // L: 171
		float var4 = var1.field4440[14] * this.field4440[3] + this.field4440[0] * var1.field4440[2] + this.field4440[1] * var1.field4440[6] + var1.field4440[10] * this.field4440[2]; // L: 172
		float var5 = this.field4440[2] * var1.field4440[11] + var1.field4440[3] * this.field4440[0] + this.field4440[1] * var1.field4440[7] + this.field4440[3] * var1.field4440[15]; // L: 173
		float var6 = var1.field4440[0] * this.field4440[4] + var1.field4440[4] * this.field4440[5] + var1.field4440[8] * this.field4440[6] + var1.field4440[12] * this.field4440[7]; // L: 174
		float var7 = var1.field4440[13] * this.field4440[7] + this.field4440[6] * var1.field4440[9] + this.field4440[5] * var1.field4440[5] + var1.field4440[1] * this.field4440[4]; // L: 175
		float var8 = var1.field4440[2] * this.field4440[4] + var1.field4440[6] * this.field4440[5] + this.field4440[6] * var1.field4440[10] + this.field4440[7] * var1.field4440[14]; // L: 176
		float var9 = this.field4440[4] * var1.field4440[3] + this.field4440[5] * var1.field4440[7] + var1.field4440[11] * this.field4440[6] + var1.field4440[15] * this.field4440[7]; // L: 177
		float var10 = var1.field4440[8] * this.field4440[10] + var1.field4440[0] * this.field4440[8] + this.field4440[9] * var1.field4440[4] + this.field4440[11] * var1.field4440[12]; // L: 178
		float var11 = this.field4440[11] * var1.field4440[13] + this.field4440[9] * var1.field4440[5] + this.field4440[8] * var1.field4440[1] + var1.field4440[9] * this.field4440[10]; // L: 179
		float var12 = var1.field4440[14] * this.field4440[11] + this.field4440[9] * var1.field4440[6] + this.field4440[8] * var1.field4440[2] + this.field4440[10] * var1.field4440[10]; // L: 180
		float var13 = this.field4440[9] * var1.field4440[7] + var1.field4440[3] * this.field4440[8] + var1.field4440[11] * this.field4440[10] + this.field4440[11] * var1.field4440[15]; // L: 181
		float var14 = var1.field4440[12] * this.field4440[15] + this.field4440[12] * var1.field4440[0] + this.field4440[13] * var1.field4440[4] + this.field4440[14] * var1.field4440[8]; // L: 182
		float var15 = this.field4440[13] * var1.field4440[5] + var1.field4440[1] * this.field4440[12] + this.field4440[14] * var1.field4440[9] + this.field4440[15] * var1.field4440[13]; // L: 183
		float var16 = this.field4440[14] * var1.field4440[10] + this.field4440[12] * var1.field4440[2] + var1.field4440[6] * this.field4440[13] + this.field4440[15] * var1.field4440[14]; // L: 184
		float var17 = this.field4440[15] * var1.field4440[15] + this.field4440[14] * var1.field4440[11] + this.field4440[13] * var1.field4440[7] + this.field4440[12] * var1.field4440[3]; // L: 185
		this.field4440[0] = var2; // L: 186
		this.field4440[1] = var3; // L: 187
		this.field4440[2] = var4; // L: 188
		this.field4440[3] = var5; // L: 189
		this.field4440[4] = var6; // L: 190
		this.field4440[5] = var7; // L: 191
		this.field4440[6] = var8; // L: 192
		this.field4440[7] = var9; // L: 193
		this.field4440[8] = var10; // L: 194
		this.field4440[9] = var11; // L: 195
		this.field4440[10] = var12; // L: 196
		this.field4440[11] = var13; // L: 197
		this.field4440[12] = var14; // L: 198
		this.field4440[13] = var15; // L: 199
		this.field4440[14] = var16; // L: 200
		this.field4440[15] = var17; // L: 201
	} // L: 202

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)V",
		garbageValue = "1381972226"
	)
	public void method7179(class388 var1) {
		float var2 = var1.field4435 * var1.field4435; // L: 205
		float var3 = var1.field4435 * var1.field4432; // L: 206
		float var4 = var1.field4435 * var1.field4433; // L: 207
		float var5 = var1.field4435 * var1.field4431; // L: 208
		float var6 = var1.field4432 * var1.field4432; // L: 209
		float var7 = var1.field4432 * var1.field4433; // L: 210
		float var8 = var1.field4432 * var1.field4431; // L: 211
		float var9 = var1.field4433 * var1.field4433; // L: 212
		float var10 = var1.field4433 * var1.field4431; // L: 213
		float var11 = var1.field4431 * var1.field4431; // L: 214
		this.field4440[0] = var6 + var2 - var11 - var9; // L: 215
		this.field4440[1] = var7 + var5 + var7 + var5; // L: 216
		this.field4440[2] = var8 + (var8 - var4 - var4); // L: 217
		this.field4440[4] = var7 - var5 - var5 + var7; // L: 218
		this.field4440[5] = var2 + var9 - var6 - var11; // L: 219
		this.field4440[6] = var3 + var3 + var10 + var10; // L: 220
		this.field4440[8] = var8 + var4 + var8 + var4; // L: 221
		this.field4440[9] = var10 + (var10 - var3 - var3); // L: 222
		this.field4440[10] = var2 + var11 - var9 - var6; // L: 223
	} // L: 224

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lod;I)V",
		garbageValue = "1656242906"
	)
	void method7180(class390 var1) {
		this.field4440[0] = var1.field4448; // L: 227
		this.field4440[1] = var1.field4452; // L: 228
		this.field4440[2] = var1.field4444; // L: 229
		this.field4440[3] = 0.0F; // L: 230
		this.field4440[4] = var1.field4450; // L: 231
		this.field4440[5] = var1.field4446; // L: 232
		this.field4440[6] = var1.field4447; // L: 233
		this.field4440[7] = 0.0F; // L: 234
		this.field4440[8] = var1.field4442; // L: 235
		this.field4440[9] = var1.field4449; // L: 236
		this.field4440[10] = var1.field4443; // L: 237
		this.field4440[11] = 0.0F; // L: 238
		this.field4440[12] = var1.field4451; // L: 239
		this.field4440[13] = var1.field4445; // L: 240
		this.field4440[14] = var1.field4453; // L: 241
		this.field4440[15] = 1.0F; // L: 242
	} // L: 243

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "529784450"
	)
	float method7181() {
		return this.field4440[12] * this.field4440[3] * this.field4440[6] * this.field4440[9] + (this.field4440[8] * this.field4440[7] * this.field4440[2] * this.field4440[13] + this.field4440[15] * this.field4440[8] * this.field4440[1] * this.field4440[6] + this.field4440[0] * this.field4440[7] * this.field4440[9] * this.field4440[14] + this.field4440[13] * this.field4440[6] * this.field4440[0] * this.field4440[11] + (this.field4440[5] * this.field4440[0] * this.field4440[10] * this.field4440[15] - this.field4440[14] * this.field4440[11] * this.field4440[5] * this.field4440[0] - this.field4440[9] * this.field4440[6] * this.field4440[0] * this.field4440[15]) - this.field4440[13] * this.field4440[0] * this.field4440[7] * this.field4440[10] - this.field4440[15] * this.field4440[10] * this.field4440[4] * this.field4440[1] + this.field4440[14] * this.field4440[11] * this.field4440[1] * this.field4440[4] - this.field4440[12] * this.field4440[11] * this.field4440[6] * this.field4440[1] - this.field4440[1] * this.field4440[7] * this.field4440[8] * this.field4440[14] + this.field4440[12] * this.field4440[10] * this.field4440[7] * this.field4440[1] + this.field4440[15] * this.field4440[4] * this.field4440[2] * this.field4440[9] - this.field4440[13] * this.field4440[11] * this.field4440[2] * this.field4440[4] - this.field4440[15] * this.field4440[2] * this.field4440[5] * this.field4440[8] + this.field4440[5] * this.field4440[2] * this.field4440[11] * this.field4440[12] - this.field4440[12] * this.field4440[9] * this.field4440[2] * this.field4440[7] - this.field4440[4] * this.field4440[3] * this.field4440[9] * this.field4440[14] + this.field4440[13] * this.field4440[10] * this.field4440[3] * this.field4440[4] + this.field4440[14] * this.field4440[8] * this.field4440[3] * this.field4440[5] - this.field4440[10] * this.field4440[3] * this.field4440[5] * this.field4440[12] - this.field4440[3] * this.field4440[6] * this.field4440[8] * this.field4440[13]); // L: 246
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "855733111"
	)
	public void method7199() {
		float var1 = 1.0F / this.method7181(); // L: 250
		float var2 = var1 * (this.field4440[7] * this.field4440[9] * this.field4440[14] + this.field4440[13] * this.field4440[11] * this.field4440[6] + (this.field4440[5] * this.field4440[10] * this.field4440[15] - this.field4440[14] * this.field4440[5] * this.field4440[11] - this.field4440[15] * this.field4440[9] * this.field4440[6]) - this.field4440[13] * this.field4440[7] * this.field4440[10]); // L: 251
		float var3 = var1 * (this.field4440[15] * this.field4440[9] * this.field4440[2] + this.field4440[14] * this.field4440[1] * this.field4440[11] + this.field4440[15] * -this.field4440[1] * this.field4440[10] - this.field4440[13] * this.field4440[11] * this.field4440[2] - this.field4440[3] * this.field4440[9] * this.field4440[14] + this.field4440[13] * this.field4440[10] * this.field4440[3]); // L: 252
		float var4 = (this.field4440[14] * this.field4440[5] * this.field4440[3] + this.field4440[15] * this.field4440[1] * this.field4440[6] - this.field4440[7] * this.field4440[1] * this.field4440[14] - this.field4440[15] * this.field4440[5] * this.field4440[2] + this.field4440[2] * this.field4440[7] * this.field4440[13] - this.field4440[3] * this.field4440[6] * this.field4440[13]) * var1; // L: 253
		float var5 = var1 * (this.field4440[3] * this.field4440[6] * this.field4440[9] + (this.field4440[5] * this.field4440[2] * this.field4440[11] + this.field4440[1] * this.field4440[7] * this.field4440[10] + this.field4440[6] * -this.field4440[1] * this.field4440[11] - this.field4440[9] * this.field4440[2] * this.field4440[7] - this.field4440[3] * this.field4440[5] * this.field4440[10])); // L: 254
		float var6 = (this.field4440[14] * this.field4440[11] * this.field4440[4] + this.field4440[15] * this.field4440[10] * -this.field4440[4] + this.field4440[6] * this.field4440[8] * this.field4440[15] - this.field4440[11] * this.field4440[6] * this.field4440[12] - this.field4440[14] * this.field4440[7] * this.field4440[8] + this.field4440[12] * this.field4440[7] * this.field4440[10]) * var1; // L: 255
		float var7 = (this.field4440[12] * this.field4440[2] * this.field4440[11] + (this.field4440[10] * this.field4440[0] * this.field4440[15] - this.field4440[0] * this.field4440[11] * this.field4440[14] - this.field4440[15] * this.field4440[8] * this.field4440[2]) + this.field4440[14] * this.field4440[8] * this.field4440[3] - this.field4440[3] * this.field4440[10] * this.field4440[12]) * var1; // L: 256
		float var8 = (this.field4440[12] * this.field4440[3] * this.field4440[6] + (this.field4440[15] * this.field4440[2] * this.field4440[4] + this.field4440[6] * -this.field4440[0] * this.field4440[15] + this.field4440[14] * this.field4440[7] * this.field4440[0] - this.field4440[12] * this.field4440[2] * this.field4440[7] - this.field4440[14] * this.field4440[4] * this.field4440[3])) * var1; // L: 257
		float var9 = (this.field4440[7] * this.field4440[2] * this.field4440[8] + (this.field4440[0] * this.field4440[6] * this.field4440[11] - this.field4440[10] * this.field4440[0] * this.field4440[7] - this.field4440[11] * this.field4440[4] * this.field4440[2]) + this.field4440[3] * this.field4440[4] * this.field4440[10] - this.field4440[8] * this.field4440[3] * this.field4440[6]) * var1; // L: 258
		float var10 = (this.field4440[4] * this.field4440[9] * this.field4440[15] - this.field4440[13] * this.field4440[11] * this.field4440[4] - this.field4440[15] * this.field4440[8] * this.field4440[5] + this.field4440[11] * this.field4440[5] * this.field4440[12] + this.field4440[13] * this.field4440[8] * this.field4440[7] - this.field4440[9] * this.field4440[7] * this.field4440[12]) * var1; // L: 259
		float var11 = var1 * (this.field4440[13] * this.field4440[0] * this.field4440[11] + this.field4440[15] * -this.field4440[0] * this.field4440[9] + this.field4440[15] * this.field4440[8] * this.field4440[1] - this.field4440[12] * this.field4440[11] * this.field4440[1] - this.field4440[3] * this.field4440[8] * this.field4440[13] + this.field4440[12] * this.field4440[3] * this.field4440[9]); // L: 260
		float var12 = var1 * (this.field4440[13] * this.field4440[3] * this.field4440[4] + this.field4440[5] * this.field4440[0] * this.field4440[15] - this.field4440[7] * this.field4440[0] * this.field4440[13] - this.field4440[4] * this.field4440[1] * this.field4440[15] + this.field4440[1] * this.field4440[7] * this.field4440[12] - this.field4440[5] * this.field4440[3] * this.field4440[12]); // L: 261
		float var13 = (this.field4440[8] * this.field4440[5] * this.field4440[3] + (this.field4440[11] * this.field4440[1] * this.field4440[4] + -this.field4440[0] * this.field4440[5] * this.field4440[11] + this.field4440[0] * this.field4440[7] * this.field4440[9] - this.field4440[7] * this.field4440[1] * this.field4440[8] - this.field4440[4] * this.field4440[3] * this.field4440[9])) * var1; // L: 262
		float var14 = (-this.field4440[4] * this.field4440[9] * this.field4440[14] + this.field4440[13] * this.field4440[4] * this.field4440[10] + this.field4440[14] * this.field4440[5] * this.field4440[8] - this.field4440[12] * this.field4440[10] * this.field4440[5] - this.field4440[13] * this.field4440[8] * this.field4440[6] + this.field4440[6] * this.field4440[9] * this.field4440[12]) * var1; // L: 263
		float var15 = var1 * (this.field4440[12] * this.field4440[10] * this.field4440[1] + (this.field4440[0] * this.field4440[9] * this.field4440[14] - this.field4440[10] * this.field4440[0] * this.field4440[13] - this.field4440[14] * this.field4440[8] * this.field4440[1]) + this.field4440[2] * this.field4440[8] * this.field4440[13] - this.field4440[9] * this.field4440[2] * this.field4440[12]); // L: 264
		float var16 = (this.field4440[4] * this.field4440[1] * this.field4440[14] + this.field4440[0] * this.field4440[6] * this.field4440[13] + -this.field4440[0] * this.field4440[5] * this.field4440[14] - this.field4440[6] * this.field4440[1] * this.field4440[12] - this.field4440[2] * this.field4440[4] * this.field4440[13] + this.field4440[12] * this.field4440[5] * this.field4440[2]) * var1; // L: 265
		float var17 = (this.field4440[8] * this.field4440[6] * this.field4440[1] + (this.field4440[5] * this.field4440[0] * this.field4440[10] - this.field4440[9] * this.field4440[6] * this.field4440[0] - this.field4440[4] * this.field4440[1] * this.field4440[10]) + this.field4440[2] * this.field4440[4] * this.field4440[9] - this.field4440[8] * this.field4440[2] * this.field4440[5]) * var1; // L: 266
		this.field4440[0] = var2; // L: 267
		this.field4440[1] = var3; // L: 268
		this.field4440[2] = var4; // L: 269
		this.field4440[3] = var5; // L: 270
		this.field4440[4] = var6; // L: 271
		this.field4440[5] = var7; // L: 272
		this.field4440[6] = var8; // L: 273
		this.field4440[7] = var9; // L: 274
		this.field4440[8] = var10; // L: 275
		this.field4440[9] = var11; // L: 276
		this.field4440[10] = var12; // L: 277
		this.field4440[11] = var13; // L: 278
		this.field4440[12] = var14; // L: 279
		this.field4440[13] = var15; // L: 280
		this.field4440[14] = var16; // L: 281
		this.field4440[15] = var17; // L: 282
	} // L: 283

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "-123"
	)
	public float[] method7185() {
		float[] var1 = new float[3]; // L: 320
		class387 var2 = new class387(this.field4440[0], this.field4440[1], this.field4440[2]); // L: 321
		class387 var3 = new class387(this.field4440[4], this.field4440[5], this.field4440[6]); // L: 322
		class387 var4 = new class387(this.field4440[8], this.field4440[9], this.field4440[10]); // L: 323
		var1[0] = var2.method7130(); // L: 324
		var1[1] = var3.method7130(); // L: 325
		var1[2] = var4.method7130(); // L: 326
		return var1; // L: 327
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 288
		this.method7206(); // L: 289
		this.method7170(); // L: 290

		for (int var2 = 0; var2 < 4; ++var2) { // L: 291
			for (int var3 = 0; var3 < 4; ++var3) { // L: 292
				if (var3 > 0) {
					var1.append("\t"); // L: 293
				}

				float var4 = this.field4440[var3 + var2 * 4]; // L: 294
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) { // L: 295
					var4 = 0.0F;
				}

				var1.append(var4); // L: 296
			}

			var1.append("\n"); // L: 298
		}

		return var1.toString(); // L: 300
	}

	public int hashCode() {
		boolean var1 = true; // L: 305
		byte var2 = 1; // L: 306
		int var3 = 31 * var2 + Arrays.hashCode(this.field4440); // L: 307
		return var3; // L: 308
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class389)) { // L: 313
			return false;
		} else {
			class389 var2 = (class389)var1; // L: 314

			for (int var3 = 0; var3 < 16; ++var3) { // L: 315
				if (var2.field4440[var3] != this.field4440[var3]) {
					return false;
				}
			}

			return true; // L: 316
		}
	}
}
