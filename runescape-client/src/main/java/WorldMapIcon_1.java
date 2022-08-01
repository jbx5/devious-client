import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hu")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1586935727)
	@Export("objectDefId")
	final int objectDefId;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lhp;")
	@Export("region")
	final WorldMapRegion region;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -847793277)
	@Export("element")
	int element;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Liy;")
	@Export("label")
	WorldMapLabel label;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -934469311)
	@Export("subWidth")
	int subWidth;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -323192051)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(descriptor = "(Lkp;Lkp;ILhp;)V")
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "567101989")
	@Export("init")
	void init() {
		this.element = WorldMapDecoration.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(TileItem.WorldMapElement_get(this.element));
		WorldMapElement var1 = TileItem.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-2045439656")
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(B)Liy;", garbageValue = "1")
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "2147415720")
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "740963101")
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ldp;FB)F", garbageValue = "78")
	static float method4561(class117 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2;
			if (var1 == var0.field1439) {
				var2 = 0.0F;
			} else if (var0.field1440 == var1) {
				var2 = 1.0F;
			} else {
				var2 = (var1 - var0.field1439) / (var0.field1440 - var0.field1439);
			}
			float var3;
			if (var0.field1433) {
				var3 = var2;
			} else {
				float[] var4 = new float[]{ var0.field1441[0] - var2, var0.field1441[1], var0.field1441[2], var0.field1441[3] };
				float[] var5 = new float[5];
				int var6 = class358.method6579(var4, 3, 0.0F, true, 1.0F, true, var5);
				if (var6 == 1) {
					var3 = var5[0];
				} else {
					var3 = 0.0F;
				}
			}
			return var3 * (var0.field1442[1] + var3 * (var0.field1442[2] + var0.field1442[3] * var3)) + var0.field1442[0];
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IIIIIII)I", garbageValue = "1256478821")
	public static int method4560(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-76")
	static final void method4559() {
		for (Projectile var0 = ((Projectile) (Client.projectiles.last())); var0 != null; var0 = ((Projectile) (Client.projectiles.previous()))) {
			if (var0.plane == FriendSystem.Client_plane && Client.cycle <= var0.cycleEnd) {
				if (Client.cycle >= var0.cycleStart) {
					if (var0.targetIndex > 0) {
						NPC var1 = Client.npcs[var0.targetIndex - 1];
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) {
							var0.setDestination(var1.x, var1.y, SecureRandomFuture.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}
					if (var0.targetIndex < 0) {
						int var2 = -var0.targetIndex - 1;
						Player var3;
						if (var2 == Client.localPlayerIndex) {
							var3 = class28.localPlayer;
						} else {
							var3 = Client.players[var2];
						}
						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, SecureRandomFuture.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}
					var0.advance(Client.field744);
					Decimator.scene.drawEntity(FriendSystem.Client_plane, ((int) (var0.x)), ((int) (var0.y)), ((int) (var0.z)), 60, var0, var0.yaw, -1L, false);
				}
			} else {
				var0.remove();
			}
		}
	}
}