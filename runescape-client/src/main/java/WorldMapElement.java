import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lgg;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -731625705
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -640773699
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -419355367
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1313100289
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("av")
	@Export("name")
	public String name;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1782190655
	)
	public int field1891;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2142550135
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("au")
	public boolean field1896;
	@ObfuscatedName("ah")
	public boolean field1900;
	@ObfuscatedName("az")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ax")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("ac")
	int[] field1895;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1897252869
	)
	int field1894;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1911514097
	)
	int field1902;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2063216183
	)
	int field1903;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 367877827
	)
	int field1901;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("at")
	int[] field1907;
	@ObfuscatedName("af")
	byte[] field1908;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1450163917
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
		this.field1896 = true;
		this.field1900 = false;
		this.menuActions = new String[5];
		this.field1894 = Integer.MAX_VALUE;
		this.field1902 = Integer.MAX_VALUE;
		this.field1903 = Integer.MIN_VALUE;
		this.field1901 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "891006214"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "1390831493"
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
			this.field1891 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 0) {
					this.field1896 = false;
				}

				if ((var6 & 2) == 2) {
					this.field1900 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var6 = var1.readUnsignedByte();
				this.field1895 = new int[var6 * 2];

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) {
					this.field1895[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1907 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1907.length; ++var5) {
					this.field1907[var5] = var1.readInt();
				}

				this.field1908 = new byte[var6];

				for (var5 = 0; var5 < var6; ++var5) {
					this.field1908[var5] = var1.readByte();
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
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1970, HorizontalAlignment.field1976};
					this.horizontalAlignment = (HorizontalAlignment)class210.findEnumerated(var3, var1.readUnsignedByte());
				} else if (var2 == 30) {
					this.verticalAlignment = (VerticalAlignment)class210.findEnumerated(AbstractWorldMapIcon.method5050(), var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1010949943"
	)
	public void method3584() {
		if (this.field1895 != null) {
			for (int var1 = 0; var1 < this.field1895.length; var1 += 2) {
				if (this.field1895[var1] < this.field1894) {
					this.field1894 = this.field1895[var1];
				} else if (this.field1895[var1] > this.field1903) {
					this.field1903 = this.field1895[var1];
				}

				if (this.field1895[var1 + 1] < this.field1902) {
					this.field1902 = this.field1895[var1 + 1];
				} else if (this.field1895[var1 + 1] > this.field1901) {
					this.field1901 = this.field1895[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lvg;",
		garbageValue = "-1473839283"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lvg;",
		garbageValue = "457669942"
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
				var2 = ArchiveDiskActionHandler.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					HitSplatDefinition_cached.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "8888"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1023089861"
	)
	static void method3595() {
		Client.mouseLastLastPressedTimeMillis = -1L;
		if (Client.mouseRecorder != null) {
			Client.mouseRecorder.index = 0;
		}

		class498.hasFocus = true;
		Client.hadFocus = true;
		Client.field744 = -1L;
		class36.reflectionChecks = new IterableNodeDeque();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1462 = null;
		Client.packetWriter.field1459 = null;
		Client.packetWriter.field1464 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1457 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrowType = 0;
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		MouseHandler.MouseHandler_idleCycles = 0;
		HealthBarUpdate.method2528();
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		Client.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		class485.field5030 = null;
		Client.minimapState = 0;
		Client.field632 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		class511.topLevelWorldView.clear();
		class135.friendSystem.clear();
		if (VarpDefinition.field1874 > 5000) {
		}

		int var0;
		if (Client.field739) {
			Arrays.fill(Varps.Varps_temp, 0);
			Arrays.fill(Varps.Varps_main, 0);
		} else {
			for (var0 = 0; var0 < VarpDefinition.field1874; ++var0) {
				VarpDefinition var1 = MilliClock.VarpDefinition_get(var0);
				if (var1 != null) {
					Varps.Varps_temp[var0] = 0;
					Varps.Varps_main[var0] = 0;
				}
			}
		}

		if (Archive.varcs != null) {
			Archive.varcs.clearTransient();
		}

		Client.followerIndex = -1;
		if (Client.rootInterface != -1) {
			ModeWhere.widgetDefinition.method6512(Client.rootInterface);
		}

		for (InterfaceParent var2 = (InterfaceParent)Client.interfaceParents.first(); var2 != null; var2 = (InterfaceParent)Client.interfaceParents.next()) {
			ArchiveDiskActionHandler.closeInterface(var2, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.playerAppearance.method6541((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.playerMenuActions[var0] = null;
			Client.playerOptionsPriorities[var0] = false;
		}

		ItemContainer.itemContainers = new NodeHashTable(32);
		Client.isLoading = true;

		for (var0 = 0; var0 < 100; ++var0) {
			Client.validRootWidgets[var0] = true;
		}

		class333.method6367();
		Decimator.friendsChat = null;
		class142.guestClanSettings = null;
		Arrays.fill(Client.currentClanSettings, (Object)null);
		Tile.guestClanChannel = null;
		Arrays.fill(Client.currentClanChannels, (Object)null);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		class252.grandExchangeEvents = null;
	}
}
