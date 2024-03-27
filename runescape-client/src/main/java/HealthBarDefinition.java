import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	public static AbstractArchive field2055;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = 1264795921
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = -2037038519
	)
	static int field2044;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1269060333
	)
	public int field2061;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1585735123
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -212201907
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 456686747
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 615110845
	)
	public int field2049;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1265171965
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -608838045
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 567547233
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -231788403
	)
	@Export("width")
	public int width;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1001058743
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
	}

	public HealthBarDefinition() {
		this.int1 = 255;
		this.int2 = 255;
		this.int3 = -1;
		this.field2049 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "-67"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;IB)V",
		garbageValue = "115"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) {
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) {
			var1.readUnsignedByte();
		} else if (var2 == 7) {
			this.frontSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 8) {
			this.backSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lvg;",
		garbageValue = "413841288"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = GraphicsObject.SpriteBuffer_getSprite(field2055, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Lvg;",
		garbageValue = "0"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = GraphicsObject.SpriteBuffer_getSprite(field2055, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;II)Lmn;",
		garbageValue = "1692915056"
	)
	static MusicPatch method3813(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		return var2 == null ? null : new MusicPatch(var2);
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-2102652554"
	)
	public static void method3818(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = FadeInTask.getPacketBufferNode(ClientPacket.field3263, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeIntME(var3 ? Client.revision : 0);
		var4.packetBuffer.writeShortLE(var0);
		var4.packetBuffer.writeByteAdd(var2);
		var4.packetBuffer.writeShortLE(var1);
		Client.packetWriter.addNode(var4);
	}
}
