import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lgw;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1261963857
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 676828907
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2116142677
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("ao")
	@Export("name")
	public String name;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1053455725
	)
	public int field1845;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 448400407
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("an")
	public boolean field1848;
	@ObfuscatedName("ad")
	public boolean field1849;
	@ObfuscatedName("ax")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("aw")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("az")
	int[] field1862;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1648279167
	)
	int field1853;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 790706639
	)
	int field1839;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1729356387
	)
	int field1838;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1937701375
	)
	int field1856;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("ai")
	int[] field1859;
	@ObfuscatedName("ac")
	byte[] field1860;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2068448285
	)
	@Export("category")
	public int category;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(256);
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.field1848 = true;
		this.field1849 = false;
		this.menuActions = new String[5];
		this.field1853 = Integer.MAX_VALUE;
		this.field1839 = Integer.MAX_VALUE;
		this.field1838 = Integer.MIN_VALUE;
		this.field1856 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "677973970"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "1519034890"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.sprite2 = var1.readNullableLargeSmart();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field1845 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 0) {
					this.field1848 = false;
				}

				if ((var6 & 2) == 2) {
					this.field1849 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var6 = var1.readUnsignedByte();
				this.field1862 = new int[var6 * 2];

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) {
					this.field1862[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1859 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1859.length; ++var5) {
					this.field1859[var5] = var1.readInt();
				}

				this.field1860 = new byte[var6];

				for (var5 = 0; var5 < var6; ++var5) {
					this.field1860[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.readNullableLargeSmart();
				} else if (var2 == 19) {
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) {
					var1.readInt();
				} else if (var2 == 22) {
					var1.readInt();
				} else if (var2 == 23) {
					var1.readUnsignedByte();
					var1.readUnsignedByte();
					var1.readUnsignedByte();
				} else if (var2 == 24) {
					var1.readShort();
					var1.readShort();
				} else if (var2 == 25) {
					var1.readNullableLargeSmart();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field1937, HorizontalAlignment.field1935, HorizontalAlignment.HorizontalAlignment_centered};
					this.horizontalAlignment = (HorizontalAlignment)GrandExchangeEvents.findEnumerated(var3, var1.readUnsignedByte());
				} else if (var2 == 30) {
					VerticalAlignment[] var7 = new VerticalAlignment[]{VerticalAlignment.field2004, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2006};
					this.verticalAlignment = (VerticalAlignment)GrandExchangeEvents.findEnumerated(var7, var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "70"
	)
	public void method3594() {
		if (this.field1862 != null) {
			for (int var1 = 0; var1 < this.field1862.length; var1 += 2) {
				if (this.field1862[var1] < this.field1853) {
					this.field1853 = this.field1862[var1];
				} else if (this.field1862[var1] > this.field1838) {
					this.field1838 = this.field1862[var1];
				}

				if (this.field1862[var1 + 1] < this.field1839) {
					this.field1839 = this.field1862[var1 + 1];
				} else if (this.field1862[var1 + 1] > this.field1856) {
					this.field1856 = this.field1862[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZI)Luc;",
		garbageValue = "-341352401"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Luc;",
		garbageValue = "187846819"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)HitSplatDefinition_cached.get((long)var1);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class135.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					HitSplatDefinition_cached.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-42590893"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	static void method3627() {
		Client.mouseLastLastPressedTimeMillis = 1L;
		Canvas.mouseRecorder.index = 0;
		class31.hasFocus = true;
		Client.hadFocus = true;
		Client.field741 = -1L;
		class469.method8643();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1402 = null;
		Client.packetWriter.field1411 = null;
		Client.packetWriter.field1407 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1399 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrowType = 0;
		RestClientThreadFactory.method219();
		MouseHandler.MouseHandler_idleCycles = 0;
		HorizontalAlignment.method3713();
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		Client.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		Varps.field3599 = null;
		Client.minimapState = 0;
		Client.field732 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		Client.npcCount = 0;
		Players.Players_count = 0;

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Players.field1347[var0] = null;
			Players.field1348[var0] = class231.field2458;
		}

		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 65536; ++var0) {
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1;
		Client.projectiles.clear();
		Client.graphicsObjects.clear();

		for (var0 = 0; var0 < 4; ++var0) {
			for (int var4 = 0; var4 < 104; ++var4) {
				for (int var2 = 0; var2 < 104; ++var2) {
					Client.groundItems[var0][var4][var2] = null;
				}
			}
		}

		Client.pendingSpawns = new NodeDeque();
		class332.friendSystem.clear();
		if (AbstractByteArrayCopier.field3856 > 5000) {
		}

		for (var0 = 0; var0 < AbstractByteArrayCopier.field3856; ++var0) {
			VarpDefinition var1 = class128.VarpDefinition_get(var0);
			if (var1 != null) {
				Varps.Varps_temp[var0] = 0;
				Varps.Varps_main[var0] = 0;
			}
		}

		ClientPreferences.varcs.clearTransient();
		Client.followerIndex = -1;
		if (Client.rootInterface != -1) {
			class380.widgetDefinition.method6346(Client.rootInterface);
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) {
			class363.closeInterface(var3, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		RestClientThreadFactory.method219();
		Client.playerAppearance.method6373((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.playerMenuActions[var0] = null;
			Client.playerOptionsPriorities[var0] = false;
		}

		HttpRequest.method89();
		Client.isLoading = true;

		for (var0 = 0; var0 < 100; ++var0) {
			Client.validRootWidgets[var0] = true;
		}

		Calendar.method6881();
		ClientPreferences.friendsChat = null;
		SecureUrlRequester.guestClanSettings = null;
		Arrays.fill(Client.currentClanSettings, (Object)null);
		UserComparator4.guestClanChannel = null;
		Arrays.fill(Client.currentClanChannels, (Object)null);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		class380.grandExchangeEvents = null;
		Client.field544 = false;
	}
}
