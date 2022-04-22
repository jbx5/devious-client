import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"Lea;")

	static ClanChannel field808;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lpe;")

	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Lnr;")

	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lmw;")

	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	-189724235)

	int field805;

	@ObfuscatedSignature(descriptor = 
	"(Lpe;)V")

	FriendSystem(LoginType var1) {
		this.field805 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-846146726")

	boolean method1681() {
		return this.field805 == 2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-22")

	final void method1726() {
		this.field805 = 1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;II)V", garbageValue = 
	"-1095656877")

	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field805 = 2;
		class295.method5732();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(S)V", garbageValue = 
	"-6357")

	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = ((FriendLoginUpdate) (this.friendsList.friendLoginUpdates.last())); var1 != null; var1 = ((FriendLoginUpdate) (this.friendsList.friendLoginUpdates.previous()))) {
			if (((long) (var1.field4246)) < ((class136.method2931() / 1000L) - 5L)) {
				if (var1.world > 0) {
					Actor.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					Actor.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1878826448")

	@Export("clear")
	final void clear() {
		this.field805 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Lqb;ZS)Z", garbageValue = 
	"301")

	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(GrandExchangeEvents.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(Lqb;B)Z", garbageValue = 
	"24")

	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;B)V", garbageValue = 
	"95")

	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					class149.method3138("Your friend list is full. Max of 200 for free users, and 400 for members");
				} else if (GrandExchangeEvents.localPlayer.username.equals(var2)) {
					ClanSettings.method3031();
				} else if (this.isFriended(var2, false)) {
					class149.method3138(var1 + " is already on your friend list");
				} else if (this.isIgnored(var2)) {
					Canvas.method359(var1);
				} else {
					Skeleton.method4728(var1);
				}
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-1352470577")

	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || ((this.friendsList.getSize() >= 200) && (Client.field544 != 1));
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)V", garbageValue = 
	"-1994485705")

	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					ModeWhere.method6092();
				} else if (GrandExchangeEvents.localPlayer.username.equals(var2)) {
					class149.method3138("You can't add yourself to your own ignore list");
				} else if (this.isIgnored(var2)) {
					class149.method3138(var1 + " is already on your ignore list");
				} else if (this.isFriended(var2, false)) {
					KeyHandler.method348(var1);
				} else {
					GameEngine.method569(var1);
				}
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"1971481625")

	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || ((this.ignoreList.getSize() >= 100) && (Client.field544 != 1));
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;B)V", garbageValue = 
	"-14")

	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Client.field701 = Client.cycleCntr;
					PacketBufferNode var3 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2970, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class425.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				class295.method5732();
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)V", garbageValue = 
	"20346063")

	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var2)) {
					Client.field701 = Client.cycleCntr;
					PacketBufferNode var3 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2991, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class425.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				KitDefinition.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = 
	"(Lqb;I)Z", garbageValue = 
	"-2101577013")

	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = ((Friend) (this.friendsList.getByUsername(var1)));
		return (var2 != null) && var2.hasWorld();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)[Lcn;", garbageValue = 
	"-1586565487")

	static AttackOption[] method1743() {
		return new AttackOption[]{ AttackOption.field1263, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden, AttackOption.field1257 };
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(IB)Z", garbageValue = 
	"106")

	public static boolean method1698(int var0) {
		return ((var0 >> 28) & 1) != 0;
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1628645730")

	static final void method1715() {
		class389.method7094(false);
		Client.field747 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < Varcs.regionLandArchives.length; ++var1) {
			if ((VarpDefinition.regionMapArchiveIds[var1] != (-1)) && (Varcs.regionLandArchives[var1] == null)) {
				Varcs.regionLandArchives[var1] = Players.archive5.takeFile(VarpDefinition.regionMapArchiveIds[var1], 0);
				if (Varcs.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field747;
				}
			}

			if ((class133.regionLandArchiveIds[var1] != (-1)) && (DynamicObject.regionMapArchives[var1] == null)) {
				DynamicObject.regionMapArchives[var1] = Players.archive5.takeFileEncrypted(class133.regionLandArchiveIds[var1], 0, WorldMapSectionType.xteaKeys[var1]);
				if (DynamicObject.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field747;
				}
			}
		}

		if (!var0) {
			Client.field560 = 1;
		} else {
			Client.field558 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < Varcs.regionLandArchives.length; ++var1) {
				byte[] var15 = DynamicObject.regionMapArchives[var1];
				if (var15 != null) {
					var3 = ((class21.regions[var1] >> 8) * 64) - GrandExchangeOfferOwnWorldComparator.baseX;
					var4 = ((class21.regions[var1] & 255) * 64) - VarcInt.baseY;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= ItemComposition.method3771(var15, var3, var4);
				}
			}

			if (!var0) {
				Client.field560 = 2;
			} else {
				if (Client.field560 != 0) {
					MusicPatch.drawLoadingMessage(((("Loading - please wait." + ("<br>" + " (")) + 100) + "%") + ")", true);
				}

				class116.playPcmPlayers();
				ArchiveLoader.scene.clear();

				for (var1 = 0; var1 < 4; ++var1) {
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var2 = 0; var2 < 104; ++var2) {
						for (var3 = 0; var3 < 104; ++var3) {
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0;
						}
					}
				}

				class116.playPcmPlayers();
				class321.method5996();
				var1 = Varcs.regionLandArchives.length;
				ClientPreferences.method2259();
				class389.method7094(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var14;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = ((class21.regions[var2] >> 8) * 64) - GrandExchangeOfferOwnWorldComparator.baseX;
						var4 = ((class21.regions[var2] & 255) * 64) - VarcInt.baseY;
						var14 = Varcs.regionLandArchives[var2];
						if (var14 != null) {
							class116.playPcmPlayers();
							class1.method9(var14, var3, var4, (ScriptEvent.field1042 * 8) - 48, (KitDefinition.field1855 * 8) - 48, Client.collisionMaps);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = ((class21.regions[var2] >> 8) * 64) - GrandExchangeOfferOwnWorldComparator.baseX;
						var4 = ((class21.regions[var2] & 255) * 64) - VarcInt.baseY;
						var14 = Varcs.regionLandArchives[var2];
						if ((var14 == null) && (KitDefinition.field1855 < 800)) {
							class116.playPcmPlayers();
							class431.method7593(var3, var4, 64, 64);
						}
					}

					class389.method7094(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var13 = DynamicObject.regionMapArchives[var2];
						if (var13 != null) {
							var4 = ((class21.regions[var2] >> 8) * 64) - GrandExchangeOfferOwnWorldComparator.baseX;
							var5 = ((class21.regions[var2] & 255) * 64) - VarcInt.baseY;
							class116.playPcmPlayers();
							Widget.method5681(var13, var4, var5, ArchiveLoader.scene, Client.collisionMaps);
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) {
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) {
						class116.playPcmPlayers();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								boolean var16 = false;
								var6 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var6 != (-1)) {
									var7 = (var6 >> 24) & 3;
									var8 = (var6 >> 1) & 3;
									var9 = (var6 >> 14) & 1023;
									var10 = (var6 >> 3) & 2047;
									var11 = ((var9 / 8) << 8) + (var10 / 8);

									for (int var12 = 0; var12 < class21.regions.length; ++var12) {
										if ((class21.regions[var12] == var11) && (Varcs.regionLandArchives[var12] != null)) {
											class305.method5781(Varcs.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, Client.collisionMaps);
											var16 = true;
											break;
										}
									}
								}

								if (!var16) {
									KeyHandler.method337(var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == (-1)) {
								class431.method7593(var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					class389.method7094(true);

					for (var2 = 0; var2 < 4; ++var2) {
						class116.playPcmPlayers();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != (-1)) {
									var6 = (var5 >> 24) & 3;
									var7 = (var5 >> 1) & 3;
									var8 = (var5 >> 14) & 1023;
									var9 = (var5 >> 3) & 2047;
									var10 = ((var8 / 8) << 8) + (var9 / 8);

									for (var11 = 0; var11 < class21.regions.length; ++var11) {
										if ((class21.regions[var11] == var10) && (DynamicObject.regionMapArchives[var11] != null)) {
											Tiles.method2015(DynamicObject.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, ArchiveLoader.scene, Client.collisionMaps);
											break;
										}
									}
								}
							}
						}
					}
				}

				class389.method7094(true);
				class116.playPcmPlayers();
				GraphicsDefaults.method6939(ArchiveLoader.scene, Client.collisionMaps);
				class389.method7094(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > class18.Client_plane) {
					var2 = class18.Client_plane;
				}

				if (var2 < (class18.Client_plane - 1)) {
					var2 = class18.Client_plane - 1;
				}

				if (Client.isLowDetail) {
					ArchiveLoader.scene.init(Tiles.Tiles_minPlane);
				} else {
					ArchiveLoader.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						UserComparator3.updateItemPile(var3, var4);
					}
				}

				class116.playPcmPlayers();
				class28.method390();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var17;
				if (class127.client.hasFrame()) {
					var17 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2893, Client.packetWriter.isaacCipher);
					var17.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var17);
				}

				if (!Client.isInInstance) {
					var3 = (ScriptEvent.field1042 - 6) / 8;
					var4 = (ScriptEvent.field1042 + 6) / 8;
					var5 = (KitDefinition.field1855 - 6) / 8;
					var6 = (KitDefinition.field1855 + 6) / 8;

					for (var7 = var3 - 1; var7 <= (var4 + 1); ++var7) {
						for (var8 = var5 - 1; var8 <= (var6 + 1); ++var8) {
							if ((((var7 < var3) || (var7 > var4)) || (var8 < var5)) || (var8 > var6)) {
								Players.archive5.loadRegionFromName((("m" + var7) + "_") + var8);
								Players.archive5.loadRegionFromName((("l" + var7) + "_") + var8);
							}
						}
					}
				}

				Decimator.updateGameState(30);
				class116.playPcmPlayers();
				NPC.method2360();
				var17 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2973, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var17);
				UserComparator9.method2619();
			}
		}
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-825343638")

	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) {
			Widget var0 = ItemComposition.getWidgetChild(Timer.selectedSpellWidget, Client.selectedSpellChildIndex);
			if ((var0 != null) && (var0.onTargetLeave != null)) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				ClanSettings.runScriptEvent(var1);
			}

			Client.selectedSpellItemId = -1;
			Client.isSpellSelected = false;
			class346.invalidateWidget(var0);
		}
	}
}