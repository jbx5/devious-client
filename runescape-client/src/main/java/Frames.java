import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("gn")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "[Lga;")
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(descriptor = "(Lls;Lls;IZ)V", garbageValue = "0")
	public Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque();
		int var6 = var1.getGroupFileCount(var3);
		this.frames = new Animation[var6];
		int[] var7 = var1.getGroupFileIds(var3);
		for (int var8 = 0; var8 < var7.length; ++var8) {
			byte[] var9 = var1.takeFile(var3, var7[var8]);
			Skeleton var10 = null;
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255;
			for (Skeleton var12 = ((Skeleton) (var5.last())); var12 != null; var12 = ((Skeleton) (var5.previous()))) {
				if (var11 == var12.id) {
					var10 = var12;
					break;
				}
			}
			if (var10 == null) {
				byte[] var13 = var2.getFile(var11, 0);
				var10 = new Skeleton(var11, var13);
				var5.addFirst(var10);
			}
			this.frames[var7[var8]] = new Animation(var9, var10);
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "1979341269")
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform;
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(descriptor = "(IIIIIIIB)V", garbageValue = "8")
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (Client.isLowDetail && var0 != class268.Client_plane) {
				return;
			}
			long var7 = 0L;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;
			if (var1 == 0) {
				var7 = class12.scene.getBoundaryObjectTag(var0, var2, var3);
			}
			if (var1 == 1) {
				var7 = class12.scene.getWallDecorationTag(var0, var2, var3);
			}
			if (var1 == 2) {
				var7 = class12.scene.getGameObjectTag(var0, var2, var3);
			}
			if (var1 == 3) {
				var7 = class12.scene.getFloorDecorationTag(var0, var2, var3);
			}
			int var12;
			if (0L != var7) {
				var12 = class12.scene.getObjectFlags(var0, var2, var3, var7);
				int var14 = WorldMapSection2.Entity_unpackID(var7);
				int var15 = var12 & 31;
				int var16 = var12 >> 6 & 3;
				ObjectComposition var13;
				if (var1 == 0) {
					class12.scene.removeBoundaryObject(var0, var2, var3);
					var13 = FileSystem.getObjectDefinition(var14);
					if (var13.interactType != 0) {
						Client.collisionMaps[var0].method3778(var2, var3, var15, var16, var13.boolean1);
					}
				}
				if (var1 == 1) {
					class12.scene.removeWallDecoration(var0, var2, var3);
				}
				if (var1 == 2) {
					class12.scene.removeGameObject(var0, var2, var3);
					var13 = FileSystem.getObjectDefinition(var14);
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) {
						return;
					}
					if (var13.interactType != 0) {
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var16, var13.boolean1);
					}
				}
				if (var1 == 3) {
					class12.scene.removeFloorDecoration(var0, var2, var3);
					var13 = FileSystem.getObjectDefinition(var14);
					if (var13.interactType == 1) {
						Client.collisionMaps[var0].method3781(var2, var3);
					}
				}
			}
			if (var4 >= 0) {
				var12 = var0;
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var12 = var0 + 1;
				}
				class14.method174(var0, var12, var2, var3, var4, var5, var6, class12.scene, Client.collisionMaps[var0]);
			}
		}
	}
}