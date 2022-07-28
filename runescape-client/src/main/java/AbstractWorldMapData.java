import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.io.IOException;
import net.runelite.mapping.Export;
@ObfuscatedName("ht")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("ea")
	@ObfuscatedSignature(descriptor = "Llu;")
	@Export("archive8")
	static Archive archive8;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -923611136)
	@Export("regionXLow")
	int regionXLow;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -693487296)
	@Export("regionYLow")
	int regionYLow;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 1921743487)
	@Export("regionX")
	int regionX;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 892491975)
	@Export("regionY")
	int regionY;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 1903863783)
	@Export("minPlane")
	int minPlane;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 1962377257)
	@Export("planes")
	int planes;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -400193139)
	@Export("groupId")
	int groupId = -1;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -2033216141)
	@Export("fileId")
	int fileId = -1;

	@ObfuscatedName("x")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;

	@ObfuscatedName("g")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;

	@ObfuscatedName("p")
	byte[][][] field2796;

	@ObfuscatedName("b")
	byte[][][] field2793;

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "[[[[Lik;")
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;

	@ObfuscatedName("y")
	boolean field2804;

	@ObfuscatedName("k")
	boolean field2806;

	AbstractWorldMapData() {
		new LinkedList();
		this.field2804 = false;
		this.field2806 = false;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqw;B)V", garbageValue = "1")
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "2")
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2804 && this.field2806;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(Llc;S)V", garbageValue = "-8894")
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field2804 = true;
				this.field2806 = true;
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "2")
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field2796 = null;
		this.field2793 = null;
		this.decorations = null;
		this.field2804 = false;
		this.field2806 = false;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(IILqw;B)V", garbageValue = "7")
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method4952(var1, var2, var3, var4);
			} else {
				this.method4936(var1, var2, var3, var4);
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "(IILqw;II)V", garbageValue = "158392315")
	void method4952(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = ((short) (var3.readUnsignedByte()));
		}
		this.floorUnderlayIds[0][var1][var2] = ((short) (var3.readUnsignedByte()));
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "(IILqw;II)V", garbageValue = "-1800882307")
	void method4936(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = ((short) (var3.readUnsignedByte()));
		int var8;
		int var9;
		int var11;
		if (var6) {
			var8 = var3.readUnsignedByte();
			for (var9 = 0; var9 < var8; ++var9) {
				int var14 = var3.readUnsignedByte();
				if (var14 != 0) {
					this.floorOverlayIds[var9][var1][var2] = ((short) (var14));
					var11 = var3.readUnsignedByte();
					this.field2796[var9][var1][var2] = ((byte) (var11 >> 2));
					this.field2793[var9][var1][var2] = ((byte) (var11 & 3));
				}
			}
		}
		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];
					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.readNullableLargeSmart();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-706711214")
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1786538401")
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "-1359541834")
	static final void method4959(boolean var0) {
		class12.playPcmPlayers();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = class433.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);
				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.hadNetworkError = true;
				}
			}
		}
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(descriptor = "(IIIIII)V", garbageValue = "16711680")
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = Decimator.scene.getBoundaryObjectTag(var0, var1, var2);
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (0L != var5) {
			var7 = Decimator.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = var3;
			if (class28.method388(var5)) {
				var10 = var4;
			}
			int[] var11 = SceneTilePaint.sceneMinimapSprite.pixels;
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var13 = class141.Entity_unpackID(var5);
			ObjectComposition var14 = WorldMapDecoration.getObjectDefinition(var13);
			if (var14.mapSceneId != -1) {
				IndexedSprite var15 = class270.mapSceneSprites[var14.mapSceneId];
				if (var15 != null) {
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2;
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2;
					var15.drawAt(var16 + var1 * 4 + 48, var17 + (104 - var2 - var14.sizeY) * 4 + 48);
				}
			} else {
				if (var9 == 0 || var9 == 2) {
					if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 1) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 3] = var10;
						var11[var12 + 512 + 3] = var10;
						var11[var12 + 1024 + 3] = var10;
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}
				if (var9 == 3) {
					if (var8 == 0) {
						var11[var12] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
					}
				}
				if (var9 == 2) {
					if (var8 == 3) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
						var11[var12 + 512 + 3] = var10;
						var11[var12 + 1024 + 3] = var10;
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}
			}
		}
		var5 = Decimator.scene.getGameObjectTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = Decimator.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = class141.Entity_unpackID(var5);
			ObjectComposition var24 = WorldMapDecoration.getObjectDefinition(var10);
			int var19;
			if (var24.mapSceneId != -1) {
				IndexedSprite var20 = class270.mapSceneSprites[var24.mapSceneId];
				if (var20 != null) {
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2;
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2;
					var20.drawAt(var1 * 4 + var13 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48);
				}
			} else if (var9 == 9) {
				var12 = 15658734;
				if (class28.method388(var5)) {
					var12 = 15597568;
				}
				int[] var18 = SceneTilePaint.sceneMinimapSprite.pixels;
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var8 != 0 && var8 != 2) {
					var18[var19] = var12;
					var18[var19 + 1 + 512] = var12;
					var18[var19 + 1024 + 2] = var12;
					var18[var19 + 1536 + 3] = var12;
				} else {
					var18[var19 + 1536] = var12;
					var18[var19 + 1 + 1024] = var12;
					var18[var19 + 512 + 2] = var12;
					var18[var19 + 3] = var12;
				}
			}
		}
		var5 = Decimator.scene.getFloorDecorationTag(var0, var1, var2);
		if (0L != var5) {
			var7 = class141.Entity_unpackID(var5);
			ObjectComposition var21 = WorldMapDecoration.getObjectDefinition(var7);
			if (var21.mapSceneId != -1) {
				IndexedSprite var22 = class270.mapSceneSprites[var21.mapSceneId];
				if (var22 != null) {
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2;
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2;
					var22.drawAt(var1 * 4 + var10 + 48, (104 - var2 - var21.sizeY) * 4 + var23 + 48);
				}
			}
		}
	}
}