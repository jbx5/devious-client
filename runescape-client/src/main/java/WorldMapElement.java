import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lhr;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1903111453
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -5424259
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1445516927
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("ab")
	@Export("name")
	public String name;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1545215557
	)
	public int field2025;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2092703349
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("av")
	public boolean field2024;
	@ObfuscatedName("aq")
	public boolean field2028;
	@ObfuscatedName("ap")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ae")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("ax")
	int[] field2032;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1902796859
	)
	int field2029;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1963779555
	)
	int field2030;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 2037348525
	)
	int field2014;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1730248837
	)
	int field2019;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lhc;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("an")
	int[] field2035;
	@ObfuscatedName("am")
	byte[] field2036;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1951731109
	)
	@Export("category")
	public int category;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(256);
	}

	WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.field2024 = true;
		this.field2028 = false;
		this.menuActions = new String[5];
		this.field2029 = Integer.MAX_VALUE;
		this.field2030 = Integer.MAX_VALUE;
		this.field2014 = Integer.MIN_VALUE;
		this.field2019 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "-1011167050"
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lua;IB)V",
		garbageValue = "-36"
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
			this.field2025 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) {
				var3 = var1.readUnsignedByte();
				if ((var3 & 1) == 0) {
					this.field2024 = false;
				}

				if ((var3 & 2) == 2) {
					this.field2028 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var3 = var1.readUnsignedByte();
				this.field2032 = new int[var3 * 2];

				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) {
					this.field2032[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field2035 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field2035.length; ++var5) {
					this.field2035[var5] = var1.readInt();
				}

				this.field2036 = new byte[var3];

				for (var5 = 0; var5 < var3; ++var5) {
					this.field2036[var5] = var1.readByte();
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
					this.horizontalAlignment = (HorizontalAlignment)MenuAction.findEnumerated(PendingSpawn.method2417(), var1.readUnsignedByte());
				} else if (var2 == 30) {
					this.verticalAlignment = (VerticalAlignment)MenuAction.findEnumerated(class108.method2768(), var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1658768226"
	)
	void method3828() {
		if (this.field2032 != null) {
			for (int var1 = 0; var1 < this.field2032.length; var1 += 2) {
				if (this.field2032[var1] < this.field2029) {
					this.field2029 = this.field2032[var1];
				} else if (this.field2032[var1] > this.field2014) {
					this.field2014 = this.field2032[var1];
				}

				if (this.field2032[var1 + 1] < this.field2030) {
					this.field2030 = this.field2032[var1 + 1];
				} else if (this.field2032[var1 + 1] > this.field2019) {
					this.field2019 = this.field2032[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lvc;",
		garbageValue = "-115268277"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lvc;",
		garbageValue = "-1492918067"
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
				var2 = class542.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					HitSplatDefinition_cached.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "16777215"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lhr;",
		garbageValue = "408407870"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement_cached.length && WorldMapElement_cached[var0] != null ? WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lmc;Lvr;I)Lmd;",
		garbageValue = "390732705"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = WorldMapEvent.method6095();
		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}
}
