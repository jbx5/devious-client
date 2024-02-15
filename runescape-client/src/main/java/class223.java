import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ia")
public class class223 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	static final class223 field2401;
	@ObfuscatedName("sz")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("aw")
	Map field2402;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 571857845
	)
	int field2400;

	static {
		field2401 = new class223();
	}

	class223() {
		this.field2402 = new HashMap();
		this.field2400 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILel;I)V",
		garbageValue = "-737927221"
	)
	void method4353(JSONObject var1, int var2, UrlRequester var3) {
		this.field2402.clear();

		JSONObject var4;
		try {
			var4 = var1;
			this.field2400 = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var7) {
			return;
		}

		try {
			this.method4345(var4.getJSONArray("crmcomponents"), this.field2400, var3);
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILel;I)V",
		garbageValue = "-1974650686"
	)
	void method4345(JSONArray var1, int var2, UrlRequester var3) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				JSONObject var5 = var1.getJSONObject(var4);
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
					String var6 = var5.getString("platform");
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
						class221 var7 = new class221();

						try {
							var7.method4304(var5, var2, var3);
						} catch (Exception var9) {
						}

						if (!var7.field2387.isEmpty()) {
							String var8 = var5.getString("location");
							this.field2402.put(var8, var7);
						}
					}
				}
			}

			this.field2402 = this.method4347();
			SecureRandomCallable.method2320();
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "38"
	)
	Map method4347() {
		HashMap var1 = new HashMap();
		ArrayList var2 = new ArrayList();
		var2.addAll(this.field2402.entrySet());
		boolean var3 = false;

		while (!var3) {
			var3 = true;

			for (int var7 = 0; var7 < var2.size() - 1; ++var7) {
				if (((class221)((Entry)var2.get(var7)).getValue()).method4336() > ((class221)((Entry)var2.get(var7 + 1)).getValue()).method4336()) {
					Entry var4 = (Entry)var2.get(var7);
					var2.set(var7, var2.get(var7 + 1));
					var2.set(var7 + 1, var4);
					var3 = false;
				}
			}
		}

		Iterator var5 = var2.iterator();

		while (var5.hasNext()) {
			Entry var6 = (Entry)var5.next();
			var1.put(var6.getKey(), var6.getValue());
		}

		return var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lit;",
		garbageValue = "1"
	)
	class221 method4348(String var1) {
		return (class221)this.field2402.get(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldc;",
		garbageValue = "1732993842"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = Player.shift8LeftAndAdd(var1, var0);
		Script var4 = WorldMapAreaData.getScript(var3, var0);
		if (var4 != null) {
			return var4;
		} else {
			int var5 = (-3 - var2 << 8) + var0;
			var4 = WorldMapAreaData.getScript(var5, var0);
			if (var4 != null) {
				return var4;
			} else {
				int var6 = var0 + -512;
				var4 = WorldMapAreaData.getScript(var6, var0);
				return var4 != null ? var4 : null;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "5"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "530526359"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			UrlRequest.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;

		int var8;
		for (var8 = 0; var8 < SecureRandomFuture.method2228(); ++var8) {
			long var22 = FloorUnderlayDefinition.method3815(var8);
			if (var6 != var22) {
				var6 = var22;
				int var11 = class86.method2349(var8);
				int var12 = class367.method7009(var8);
				int var13 = WorldMapDecoration.method5032(var8);
				int var14 = Message.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]);
				int var15 = var14;
				int var19;
				if (var13 == 2 && Actor.scene.getObjectFlags(class473.Client_plane, var11, var12, var22) >= 0) {
					ObjectComposition var16 = class127.getObjectDefinition(var14);
					if (var16.transforms != null) {
						var16 = var16.transform();
					}

					if (var16 == null) {
						continue;
					}

					PendingSpawn var17 = null;

					for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) {
						if (var18.plane == class473.Client_plane && var11 == var18.x && var12 == var18.y && var15 == var18.field1198) {
							var17 = var18;
							break;
						}
					}

					if (Client.isItemSelected == 1) {
						UrlRequest.insertMenuItemNoShift("Use", Client.field822 + " " + "->" + " " + class370.colorStartTag(65535) + var16.name, 1, var15, var11, var12);
					} else if (Client.isSpellSelected) {
						if ((class128.selectedSpellFlags & 4) == 4) {
							UrlRequest.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class370.colorStartTag(65535) + var16.name, 2, var15, var11, var12);
						}
					} else {
						String[] var31 = var16.actions;
						if (var31 != null) {
							for (var19 = 4; var19 >= 0; --var19) {
								if ((var17 == null || var17.method2460(var19)) && var31[var19] != null) {
									short var20 = 0;
									if (var19 == 0) {
										var20 = 3;
									}

									if (var19 == 1) {
										var20 = 4;
									}

									if (var19 == 2) {
										var20 = 5;
									}

									if (var19 == 3) {
										var20 = 6;
									}

									if (var19 == 4) {
										var20 = 1001;
									}

									UrlRequest.insertMenuItemNoShift(var31[var19], class370.colorStartTag(65535) + var16.name, var20, var15, var11, var12);
								}
							}
						}

						UrlRequest.insertMenuItemNoShift("Examine", class370.colorStartTag(65535) + var16.name, 1002, var16.id, var11, var12);
					}
				}

				int var24;
				Player var25;
				NPC var32;
				int[] var33;
				if (var13 == 1) {
					NPC var27 = Client.npcs[var15];
					if (var27 == null) {
						continue;
					}

					if (var27.definition.size == 1 && (var27.x & 127) == 64 && (var27.y & 127) == 64) {
						for (var24 = 0; var24 < Client.npcCount; ++var24) {
							var32 = Client.npcs[Client.npcIndices[var24]];
							if (var32 != null && var32 != var27 && var32.definition.size == 1 && var32.x == var27.x && var27.y == var32.y) {
								Skeleton.addNpcToMenu(var32, Client.npcIndices[var24], var11, var12);
							}
						}

						var24 = Players.Players_count;
						var33 = Players.Players_indices;

						for (var19 = 0; var19 < var24; ++var19) {
							var25 = Client.players[var33[var19]];
							if (var25 != null && var25.x == var27.x && var25.y == var27.y) {
								MilliClock.addPlayerToMenu(var25, var33[var19], var11, var12);
							}
						}
					}

					Skeleton.addNpcToMenu(var27, var15, var11, var12);
				}

				if (var13 == 0) {
					Player var28 = Client.players[var15];
					if (var28 == null) {
						continue;
					}

					if ((var28.x & 127) == 64 && (var28.y & 127) == 64) {
						for (var24 = 0; var24 < Client.npcCount; ++var24) {
							var32 = Client.npcs[Client.npcIndices[var24]];
							if (var32 != null && var32.definition.size == 1 && var32.x == var28.x && var28.y == var32.y) {
								Skeleton.addNpcToMenu(var32, Client.npcIndices[var24], var11, var12);
							}
						}

						var24 = Players.Players_count;
						var33 = Players.Players_indices;

						for (var19 = 0; var19 < var24; ++var19) {
							var25 = Client.players[var33[var19]];
							if (var25 != null && var28 != var25 && var28.x == var25.x && var28.y == var25.y) {
								MilliClock.addPlayerToMenu(var25, var33[var19], var11, var12);
							}
						}
					}

					if (var15 != Client.combatTargetPlayerIndex) {
						MilliClock.addPlayerToMenu(var28, var15, var11, var12);
					} else {
						var4 = var22;
					}
				}

				if (var13 == 3) {
					NodeDeque var29 = Client.groundItems[class473.Client_plane][var11][var12];
					if (var29 != null) {
						for (TileItem var30 = (TileItem)var29.first(); var30 != null; var30 = (TileItem)var29.next()) {
							ItemComposition var34 = ArchiveDiskActionHandler.ItemDefinition_get(var30.id);
							if (Client.isItemSelected == 1) {
								UrlRequest.insertMenuItemNoShift("Use", Client.field822 + " " + "->" + " " + class370.colorStartTag(16748608) + var34.name, 16, var30.id, var11, var12);
							} else if (Client.isSpellSelected) {
								if ((class128.selectedSpellFlags & 1) == 1) {
									UrlRequest.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class370.colorStartTag(16748608) + var34.name, 17, var30.id, var11, var12);
								}
							} else {
								String[] var26 = var34.groundActions;

								for (int var35 = 4; var35 >= 0; --var35) {
									if (var30.method2760(var35)) {
										if (var26 != null && var26[var35] != null) {
											byte var21 = 0;
											if (var35 == 0) {
												var21 = 18;
											}

											if (var35 == 1) {
												var21 = 19;
											}

											if (var35 == 2) {
												var21 = 20;
											}

											if (var35 == 3) {
												var21 = 21;
											}

											if (var35 == 4) {
												var21 = 22;
											}

											UrlRequest.insertMenuItemNoShift(var26[var35], class370.colorStartTag(16748608) + var34.name, var21, var30.id, var11, var12);
										} else if (var35 == 2) {
											UrlRequest.insertMenuItemNoShift("Take", class370.colorStartTag(16748608) + var34.name, 20, var30.id, var11, var12);
										}
									}
								}

								UrlRequest.insertMenuItemNoShift("Examine", class370.colorStartTag(16748608) + var34.name, 1004, var30.id, var11, var12);
							}
						}
					}
				}
			}
		}

		if (-1L != var4) {
			var8 = GrandExchangeOfferAgeComparator.method7271(var4);
			int var9 = SoundSystem.method809(var4);
			Player var10 = Client.players[Client.combatTargetPlayerIndex];
			MilliClock.addPlayerToMenu(var10, Client.combatTargetPlayerIndex, var8, var9);
		}

	}
}
