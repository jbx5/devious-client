import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("StructDefinition_archive")
	public static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("StructDefinition_cached")
	static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	StructComposition() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1258888832"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "1232795812"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lvf;IB)V",
		garbageValue = "-29"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = class166.readStringIntParameters(var1, this.params);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1704318188"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class27.method421(this.params, var1, var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-84"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params;
		String var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = (String)var5.obj;
			}
		}

		return var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-22"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		IndexCheck.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "260692102"
	)
	public static int method4125(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var1 = (int)(var2 >>> 49 & 2047L);
		return var1;
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1869662012"
	)
	static final int method4114() {
		if (class461.clientPreferences.isRoofsHidden()) {
			return ClientPreferences.topLevelWorldView.plane;
		} else {
			int var0 = 3;
			int var1 = ClanSettings.entity.getX() >> 7;
			int var2 = ClanSettings.entity.getY() >> 7;
			if (class463.cameraPitch < 310) {
				label166: {
					int var3;
					int var4;
					if (Client.oculusOrbState == 1) {
						var3 = UserComparator6.oculusOrbFocalPointX >> 7;
						var4 = AsyncHttpResponse.oculusOrbFocalPointY >> 7;
					} else {
						var3 = var1;
						var4 = var2;
					}

					int var5 = class301.cameraX >> 7;
					int var6 = class33.cameraZ >> 7;
					if (var5 >= 0 && 104 > var5 && var6 >= 0 && 104 > var6) {
						if (var3 >= 0 && 104 > var3 && var4 >= 0 && 104 > var4) {
							if ((ClientPreferences.topLevelWorldView.tileSettings[ClientPreferences.topLevelWorldView.plane][var5][var6] & 4) != 0) {
								var0 = ClientPreferences.topLevelWorldView.plane;
							}

							int var7;
							if (var3 > var5) {
								var7 = var3 - var5;
							} else {
								var7 = var5 - var3;
							}

							int var8;
							if (var4 > var6) {
								var8 = var4 - var6;
							} else {
								var8 = var6 - var4;
							}

							int var9;
							int var10;
							if (var7 > var8) {
								var9 = var8 * 65536 / var7;
								var10 = 32768;

								while (true) {
									if (var3 == var5) {
										break label166;
									}

									if (var5 < var3) {
										++var5;
									} else if (var5 > var3) {
										--var5;
									}

									if ((ClientPreferences.topLevelWorldView.tileSettings[ClientPreferences.topLevelWorldView.plane][var5][var6] & 4) != 0) {
										var0 = ClientPreferences.topLevelWorldView.plane;
									}

									var10 += var9;
									if (var10 >= 65536) {
										var10 -= 65536;
										if (var6 < var4) {
											++var6;
										} else if (var6 > var4) {
											--var6;
										}

										if ((ClientPreferences.topLevelWorldView.tileSettings[ClientPreferences.topLevelWorldView.plane][var5][var6] & 4) != 0) {
											var0 = ClientPreferences.topLevelWorldView.plane;
										}
									}
								}
							} else {
								if (var8 > 0) {
									var9 = var7 * 65536 / var8;
									var10 = 32768;

									while (var6 != var4) {
										if (var6 < var4) {
											++var6;
										} else if (var6 > var4) {
											--var6;
										}

										if ((ClientPreferences.topLevelWorldView.tileSettings[ClientPreferences.topLevelWorldView.plane][var5][var6] & 4) != 0) {
											var0 = ClientPreferences.topLevelWorldView.plane;
										}

										var10 += var9;
										if (var10 >= 65536) {
											var10 -= 65536;
											if (var5 < var3) {
												++var5;
											} else if (var5 > var3) {
												--var5;
											}

											if ((ClientPreferences.topLevelWorldView.tileSettings[ClientPreferences.topLevelWorldView.plane][var5][var6] & 4) != 0) {
												var0 = ClientPreferences.topLevelWorldView.plane;
											}
										}
									}
								}
								break label166;
							}
						}

						return ClientPreferences.topLevelWorldView.plane;
					}

					return ClientPreferences.topLevelWorldView.plane;
				}
			}

			if (var1 >= 0 && 104 > var1 && var2 >= 0 && 104 > var2) {
				if ((ClientPreferences.topLevelWorldView.tileSettings[ClientPreferences.topLevelWorldView.plane][var1][var2] & 4) != 0) {
					var0 = ClientPreferences.topLevelWorldView.plane;
				}

				return var0;
			} else {
				return ClientPreferences.topLevelWorldView.plane;
			}
		}
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIIIB)Ldr;",
		garbageValue = "-56"
	)
	static final PendingSpawn method4123(WorldView var0, int var1, int var2, int var3, int var4) {
		for (PendingSpawn var5 = (PendingSpawn)var0.pendingSpawns.last(); var5 != null; var5 = (PendingSpawn)var0.pendingSpawns.previous()) {
			if (var5.plane == var1 && var2 == var5.x && var3 == var5.y && var4 == var5.type) {
				return var5;
			}
		}

		return null;
	}
}
