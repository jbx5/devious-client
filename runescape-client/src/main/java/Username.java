import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qo")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("c")
	@Export("name")
	String name;
	@ObfuscatedName("p")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lpn;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1; // L: 124
		String var4;
		if (var1 == null) { // L: 128
			var4 = null; // L: 129
		} else {
			label138: {
				int var5 = 0; // L: 132

				int var6;
				boolean var7;
				char var8;
				for (var6 = var1.length(); var5 < var6; ++var5) { // L: 133 136 146
					var8 = var1.charAt(var5); // L: 138
					var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-'; // L: 140
					if (!var7) { // L: 142
						break;
					}
				}

				while (var6 > var5) { // L: 150
					var8 = var1.charAt(var6 - 1); // L: 152
					var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-'; // L: 154
					if (!var7) { // L: 156
						break;
					}

					--var6; // L: 160
				}

				int var17 = var6 - var5; // L: 162
				if (var17 >= 1) { // L: 164
					byte var9;
					if (var2 == null) { // L: 168
						var9 = 12; // L: 169
					} else {
						switch(var2.field4642) { // L: 172
						case 7:
							var9 = 20; // L: 177
							break;
						default:
							var9 = 12; // L: 174
						}
					}

					if (var17 <= var9) { // L: 181
						StringBuilder var15 = new StringBuilder(var17); // L: 186

						for (int var18 = var5; var18 < var6; ++var18) { // L: 187
							char var10 = var1.charAt(var18); // L: 188
							boolean var11;
							if (Character.isISOControl(var10)) { // L: 191
								var11 = false; // L: 192
							} else if (PlayerCompositionColorTextureOverride.isAlphaNumeric(var10)) { // L: 195
								var11 = true; // L: 196
							} else {
								char[] var12 = class425.field4655; // L: 200
								int var13 = 0;

								label91:
								while (true) {
									char var14;
									if (var13 >= var12.length) {
										var12 = class425.field4659; // L: 210

										for (var13 = 0; var13 < var12.length; ++var13) { // L: 211
											var14 = var12[var13]; // L: 212
											if (var10 == var14) { // L: 213
												var11 = true; // L: 214
												break label91; // L: 215
											}
										}

										var11 = false; // L: 219
										break;
									}

									var14 = var12[var13]; // L: 202
									if (var14 == var10) { // L: 203
										var11 = true; // L: 204
										break; // L: 205
									}

									++var13; // L: 201
								}
							}

							if (var11) { // L: 221
								char var16 = GrandExchangeOfferAgeComparator.method6156(var10); // L: 222
								if (var16 != 0) { // L: 223
									var15.append(var16); // L: 224
								}
							}
						}

						if (var15.length() == 0) { // L: 226
							var4 = null; // L: 227
						} else {
							var4 = var15.toString(); // L: 230
						}
						break label138;
					}
				}

				var4 = null; // L: 183
			}
		}

		this.cleanName = var4; // L: 232
	} // L: 233

	public Username(String var1) {
		this.name = var1; // L: 11
		LoginType var4 = LoginType.oldscape; // L: 14
		String var3;
		if (var1 == null) { // L: 16
			var3 = null; // L: 17
		} else {
			label136: {
				int var5 = 0; // L: 20

				int var6;
				boolean var7;
				char var8;
				for (var6 = var1.length(); var5 < var6; ++var5) { // L: 21 24 34
					var8 = var1.charAt(var5); // L: 26
					var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-'; // L: 28
					if (!var7) { // L: 30
						break;
					}
				}

				while (var6 > var5) { // L: 38
					var8 = var1.charAt(var6 - 1); // L: 40
					var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-'; // L: 42
					if (!var7) { // L: 44
						break;
					}

					--var6; // L: 48
				}

				int var17 = var6 - var5; // L: 50
				if (var17 >= 1) { // L: 52
					byte var9;
					if (var4 == null) { // L: 56
						var9 = 12; // L: 57
					} else {
						switch(var4.field4642) { // L: 60
						case 7:
							var9 = 20; // L: 62
							break; // L: 63
						default:
							var9 = 12; // L: 65
						}
					}

					if (var17 <= var9) { // L: 69
						StringBuilder var15 = new StringBuilder(var17); // L: 74

						for (int var18 = var5; var18 < var6; ++var18) { // L: 75
							char var10 = var1.charAt(var18); // L: 76
							boolean var11;
							if (Character.isISOControl(var10)) { // L: 79
								var11 = false; // L: 80
							} else if (PlayerCompositionColorTextureOverride.isAlphaNumeric(var10)) { // L: 83
								var11 = true; // L: 84
							} else {
								char[] var12 = class425.field4655; // L: 88
								int var13 = 0;

								label89:
								while (true) {
									char var14;
									if (var13 >= var12.length) {
										var12 = class425.field4659; // L: 98

										for (var13 = 0; var13 < var12.length; ++var13) { // L: 99
											var14 = var12[var13]; // L: 100
											if (var14 == var10) { // L: 101
												var11 = true; // L: 102
												break label89; // L: 103
											}
										}

										var11 = false; // L: 107
										break;
									}

									var14 = var12[var13]; // L: 90
									if (var10 == var14) { // L: 91
										var11 = true; // L: 92
										break; // L: 93
									}

									++var13; // L: 89
								}
							}

							if (var11) { // L: 109
								char var16 = GrandExchangeOfferAgeComparator.method6156(var10); // L: 110
								if (var16 != 0) { // L: 111
									var15.append(var16); // L: 112
								}
							}
						}

						if (var15.length() == 0) { // L: 114
							var3 = null; // L: 115
						} else {
							var3 = var15.toString(); // L: 118
						}
						break label136;
					}
				}

				var3 = null; // L: 71
			}
		}

		this.cleanName = var3; // L: 120
	} // L: 121

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2060656858"
	)
	@Export("getName")
	public String getName() {
		return this.name; // L: 236
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1292087899"
	)
	public String method8530() {
		return this.cleanName; // L: 240
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2041641419"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null; // L: 244
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lqo;I)I",
		garbageValue = "-502687717"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) { // L: 271
			return var1.cleanName == null ? 0 : 1; // L: 272 273
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName); // L: 275 276
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) { // L: 249
			Username var2 = (Username)var1; // L: 250
			if (this.cleanName == null) {
				return var2.cleanName == null; // L: 251
			} else if (var2.cleanName == null) { // L: 252
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName); // L: 253 254
			}
		} else {
			return false; // L: 256
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode(); // L: 261 262
	}

	public String toString() {
		return this.getName(); // L: 267
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1); // L: 280
	}
}
