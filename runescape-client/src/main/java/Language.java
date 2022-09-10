import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
@Implements("Language")
public class Language implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Llj;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = -1837809733
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("q")
	final String field4140;
	@ObfuscatedName("m")
	@Export("language")
	final String language;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1893856257
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4158, 0, "GB"); // L: 12
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4158, 1, "DE"); // L: 13
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4158, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4158, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4152, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4152, 5, "ES"); // L: 17
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4158, 6, "MX");
		Language[] var0 = new Language[]{Language_PT, Language_NL, Language_ES, Language_ES_MX, Language_EN, Language_FR, Language_DE}; // L: 27
		Language_valuesOrdered = new Language[var0.length]; // L: 30
		Language[] var2 = var0; // L: 32

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 33
			Language var4 = var2[var3]; // L: 34
			if (Language_valuesOrdered[var4.id] != null) { // L: 36
				throw new IllegalStateException(); // L: 37
			}

			Language_valuesOrdered[var4.id] = var4; // L: 39
		}

	} // L: 43

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llu;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4140 = var1; // L: 46
		this.language = var2; // L: 47
		this.id = var5; // L: 48
		if (var6 != null) { // L: 49
			new Locale(var2.substring(0, 2), var6); // L: 50
		} else {
			new Locale(var2.substring(0, 2)); // L: 53
		}

	} // L: 55

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1335488063"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 58
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 63
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 68
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1223672293"
	)
	public static final synchronized long method6232() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class270.field3201) { // L: 15
			class345.field4197 += class270.field3201 - var0; // L: 16
		}

		class270.field3201 = var0; // L: 18
		return class345.field4197 + var0; // L: 19
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "1066310043"
	)
	static int method6235(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 436
			return KeyHandler.method368(var0, var1, var2);
		} else if (var0 < 1100) { // L: 437
			return class296.method5887(var0, var1, var2);
		} else if (var0 < 1200) { // L: 438
			return class102.method2710(var0, var1, var2);
		} else if (var0 < 1300) { // L: 439
			return Frames.method4473(var0, var1, var2);
		} else if (var0 < 1400) { // L: 440
			return BufferedFile.method7715(var0, var1, var2);
		} else if (var0 < 1500) { // L: 441
			return class361.method6736(var0, var1, var2);
		} else if (var0 < 1600) { // L: 442
			return class1.method12(var0, var1, var2);
		} else if (var0 < 1700) { // L: 443
			return class300.method5916(var0, var1, var2);
		} else if (var0 < 1800) { // L: 444
			return InterfaceParent.method2238(var0, var1, var2);
		} else if (var0 < 1900) { // L: 445
			return class127.method2992(var0, var1, var2);
		} else if (var0 < 2000) { // L: 446
			return HealthBarUpdate.method2353(var0, var1, var2);
		} else if (var0 < 2100) { // L: 447
			return class296.method5887(var0, var1, var2);
		} else if (var0 < 2200) { // L: 448
			return class102.method2710(var0, var1, var2);
		} else if (var0 < 2300) { // L: 449
			return Frames.method4473(var0, var1, var2);
		} else if (var0 < 2400) { // L: 450
			return BufferedFile.method7715(var0, var1, var2);
		} else if (var0 < 2500) { // L: 451
			return class361.method6736(var0, var1, var2);
		} else if (var0 < 2600) { // L: 452
			return WorldMapSection0.method5068(var0, var1, var2);
		} else if (var0 < 2700) { // L: 453
			return SequenceDefinition.method3977(var0, var1, var2);
		} else if (var0 < 2800) { // L: 454
			return VarcInt.method3560(var0, var1, var2);
		} else if (var0 < 2900) { // L: 455
			return class360.method6733(var0, var1, var2);
		} else if (var0 < 3000) { // L: 456
			return HealthBarUpdate.method2353(var0, var1, var2);
		} else if (var0 < 3200) { // L: 457
			return class343.method6445(var0, var1, var2);
		} else if (var0 < 3300) { // L: 458
			return UserComparator9.method2772(var0, var1, var2);
		} else if (var0 < 3400) { // L: 459
			return class102.method2709(var0, var1, var2);
		} else if (var0 < 3500) { // L: 460
			return class16.method215(var0, var1, var2);
		} else if (var0 < 3600) { // L: 461
			return ClanChannelMember.method3025(var0, var1, var2);
		} else if (var0 < 3700) { // L: 462
			return class303.method5917(var0, var1, var2);
		} else if (var0 < 3800) { // L: 463
			return UserComparator10.method2782(var0, var1, var2);
		} else if (var0 < 3900) { // L: 464
			return MouseHandler.method603(var0, var1, var2);
		} else if (var0 < 4000) { // L: 465
			return class361.method6735(var0, var1, var2);
		} else if (var0 < 4100) {
			return class129.method3013(var0, var1, var2); // L: 466
		} else if (var0 < 4200) { // L: 467
			return class155.method3341(var0, var1, var2);
		} else if (var0 < 4300) { // L: 468
			return ItemLayer.method4039(var0, var1, var2);
		} else if (var0 < 5100) { // L: 469
			return class271.method5375(var0, var1, var2);
		} else if (var0 < 5400) { // L: 470
			return InterfaceParent.method2239(var0, var1, var2);
		} else if (var0 < 5600) { // L: 471
			return WorldMapIcon_1.method4702(var0, var1, var2);
		} else if (var0 < 5700) { // L: 472
			return class229.method5006(var0, var1, var2);
		} else if (var0 < 6300) { // L: 473
			return class28.method414(var0, var1, var2);
		} else if (var0 < 6600) { // L: 474
			return class260.method5340(var0, var1, var2);
		} else if (var0 < 6700) { // L: 475
			return class130.method3022(var0, var1, var2);
		} else if (var0 < 6800) { // L: 476
			return class13.method180(var0, var1, var2);
		} else if (var0 < 6900) { // L: 477
			return class434.method7790(var0, var1, var2);
		} else if (var0 < 7000) { // L: 478
			return class78.method2235(var0, var1, var2);
		} else if (var0 < 7100) { // L: 479
			return class194.method4038(var0, var1, var2);
		} else if (var0 < 7200) { // L: 480
			return PlayerType.method5943(var0, var1, var2);
		} else if (var0 < 7300) { // L: 481
			return SecureRandomFuture.method2103(var0, var1, var2);
		} else if (var0 < 7500) { // L: 482
			return SecureRandomCallable.method2206(var0, var1, var2);
		} else if (var0 < 7600) { // L: 483
			return class119.method2911(var0, var1, var2);
		} else {
			return var0 < 7700 ? class241.method5125(var0, var1, var2) : 2; // L: 484 485
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "([BIILgp;[Lgj;I)V",
		garbageValue = "-1340343543"
	)
	static final void method6230(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 252
		int var6 = -1; // L: 253

		while (true) {
			int var7 = var5.readIncrSmallSmart(); // L: 255
			if (var7 == 0) { // L: 256
				return; // L: 280
			}

			var6 += var7; // L: 257
			int var8 = 0; // L: 258

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 260
				if (var9 == 0) { // L: 261
					break;
				}

				var8 += var9 - 1; // L: 262
				int var10 = var8 & 63; // L: 263
				int var11 = var8 >> 6 & 63; // L: 264
				int var12 = var8 >> 12; // L: 265
				int var13 = var5.readUnsignedByte(); // L: 266
				int var14 = var13 >> 2; // L: 267
				int var15 = var13 & 3; // L: 268
				int var16 = var11 + var1; // L: 269
				int var17 = var10 + var2; // L: 270
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 271
					int var18 = var12; // L: 272
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 273
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 274
					if (var18 >= 0) { // L: 275
						var19 = var4[var18];
					}

					WorldMapAreaData.addObjects(var12, var16, var17, var6, var15, var14, var3, var19); // L: 276
				}
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "253206918"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 999
			var1 /= 2;
		}

		if (var2 > 192) { // L: 1000
			var1 /= 2;
		}

		if (var2 > 217) { // L: 1001
			var1 /= 2;
		}

		if (var2 > 243) { // L: 1002
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 1003
		return var3; // L: 1004
	}
}
