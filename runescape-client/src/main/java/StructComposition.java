import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("StructDefinition_archive")
	public static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("StructDefinition_cached")
	public static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	StructComposition() {
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2058093555"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "132251974"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "1593179292"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = AttackOption.readStringIntParameters(var1, this.params);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-38"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return WorldMapRectangle.method4997(this.params, var1, var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-2031831973"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class109.method2817(this.params, var1, var2);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Lum;",
		garbageValue = "30"
	)
	@Export("getDbTableType")
	public static DbTableType getDbTableType(int var0) {
		DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbTableType.field5294.takeFile(39, var0);
			var1 = new DbTableType();
			if (var2 != null) {
				var1.method9435(new Buffer(var2));
			}

			var1.method9436();
			DbTableType.DBTableType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "1899627573"
	)
	static int method3871(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return DbTableType.method9448(var0, var1, var2);
		} else if (var0 < 1100) {
			return AuthenticationScheme.method3049(var0, var1, var2);
		} else if (var0 < 1200) {
			return JagNetThread.method7305(var0, var1, var2);
		} else if (var0 < 1300) {
			return class317.method6089(var0, var1, var2);
		} else if (var0 < 1400) {
			return AsyncRestClient.method174(var0, var1, var2);
		} else if (var0 < 1500) {
			return class7.method59(var0, var1, var2);
		} else if (var0 < 1600) {
			return class173.method3540(var0, var1, var2);
		} else if (var0 < 1700) {
			return MusicPatchNode2.method6152(var0, var1, var2);
		} else if (var0 < 1800) {
			return class95.method2466(var0, var1, var2);
		} else if (var0 < 1900) {
			return RouteStrategy.method4456(var0, var1, var2);
		} else if (var0 < 2000) {
			return class292.method5753(var0, var1, var2);
		} else if (var0 < 2100) {
			return AuthenticationScheme.method3049(var0, var1, var2);
		} else if (var0 < 2200) {
			return JagNetThread.method7305(var0, var1, var2);
		} else if (var0 < 2300) {
			return class317.method6089(var0, var1, var2);
		} else if (var0 < 2400) {
			return AsyncRestClient.method174(var0, var1, var2);
		} else if (var0 < 2500) {
			return class7.method59(var0, var1, var2);
		} else if (var0 < 2600) {
			return HttpRequestTask.method281(var0, var1, var2);
		} else if (var0 < 2700) {
			return class95.method2465(var0, var1, var2);
		} else if (var0 < 2800) {
			return ClientPacket.method6090(var0, var1, var2);
		} else if (var0 < 2900) {
			return class351.method6525(var0, var1, var2);
		} else if (var0 < 3000) {
			return class292.method5753(var0, var1, var2);
		} else if (var0 < 3200) {
			return class371.method7066(var0, var1, var2);
		} else if (var0 < 3300) {
			return ApproximateRouteStrategy.method1223(var0, var1, var2);
		} else if (var0 < 3400) {
			return class138.method3191(var0, var1, var2);
		} else if (var0 < 3500) {
			return WorldMapDecorationType.method7053(var0, var1, var2);
		} else if (var0 < 3600) {
			return WorldMapLabel.method5004(var0, var1, var2);
		} else if (var0 < 3700) {
			return class380.method7097(var0, var1, var2);
		} else if (var0 < 3800) {
			return GameEngine.method645(var0, var1, var2);
		} else if (var0 < 3900) {
			return class168.method3511(var0, var1, var2);
		} else if (var0 < 4000) {
			return class176.method3564(var0, var1, var2);
		} else if (var0 < 4100) {
			return SoundSystem.method874(var0, var1, var2);
		} else if (var0 < 4200) {
			return HttpResponse.method298(var0, var1, var2);
		} else if (var0 < 4300) {
			return LoginState.method1247(var0, var1, var2);
		} else if (var0 < 5100) {
			return HttpRequest.method98(var0, var1, var2);
		} else if (var0 < 5400) {
			return class1.method7(var0, var1, var2);
		} else if (var0 < 5600) {
			return PacketWriter.method2940(var0, var1, var2);
		} else if (var0 < 5700) {
			return UserComparator6.method3045(var0, var1, var2);
		} else if (var0 < 6300) {
			return class337.method6384(var0, var1, var2);
		} else if (var0 < 6600) {
			return ReflectionCheck.method713(var0, var1, var2);
		} else if (var0 < 6700) {
			return class240.method4536(var0, var1, var2);
		} else if (var0 < 6800) {
			return BufferedSource.method8745(var0, var1, var2);
		} else if (var0 < 6900) {
			return Decimator.method1136(var0, var1, var2);
		} else if (var0 < 7000) {
			return HttpResponse.method297(var0, var1, var2);
		} else if (var0 < 7100) {
			return class33.method483(var0, var1, var2);
		} else if (var0 < 7200) {
			return class341.method6427(var0, var1, var2);
		} else if (var0 < 7500) {
			return class357.method6854(var0, var1, var2);
		} else if (var0 < 7600) {
			return class261.method5006(var0, var1, var2);
		} else if (var0 < 7700) {
			return class461.method8438(var0, var1, var2);
		} else {
			return var0 < 8100 ? class1.method10(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "5"
	)
	static void method3870(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}
}
