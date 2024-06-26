import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1185086541
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 571921967
	)
	@Export("z")
	int z;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 632661417
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 340723817
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2112751427
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1877979663
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -567760481
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -763115457
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1461270687
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1339418813
	)
	int field3235;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 437260815
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = -1569410276734308073L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1042137613
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1956684786"
	)
	public static void method6032() {
		DbRowType.DBRowType_cache.clear();
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(ILnl;ZI)V",
		garbageValue = "615784753"
	)
	static void method6031(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = RestClientThreadFactory.getWorldMap().getMapArea(var0);
		int var4 = SoundCache.localPlayer.plane;
		int var5 = (SoundCache.localPlayer.x >> 7) + class511.topLevelWorldView.baseX;
		int var6 = (SoundCache.localPlayer.y >> 7) + class511.topLevelWorldView.baseY;
		Coord var7 = new Coord(var4, var5, var6);
		RestClientThreadFactory.getWorldMap().method9017(var3, var7, var1, var2);
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(Lde;Lug;B)V",
		garbageValue = "-76"
	)
	static void method6030(WorldView var0, PacketBuffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 < var0.worldEntityCount) {
			throw new RuntimeException("dang");
		} else if (var2 > var0.worldEntityCount) {
			throw new RuntimeException("dang!");
		} else {
			var0.worldEntityCount = 0;

			int var3;
			int var4;
			for (var3 = 0; var3 < var2; ++var3) {
				var4 = var0.worldEntityIndices[var3];
				WorldEntity var12 = var0.worldEntities[var4];
				boolean var6 = var1.readUnsignedByte() == 1;
				if (!var6) {
					var0.worldEntities[var4] = null;
				} else {
					var0.worldEntityIndices[++var0.worldEntityCount - 1] = var4;
					byte var7 = var1.readByte();
					byte var13 = var1.readByte();
					var12.field4964 = var1.readUnsignedShort();
					class238 var14 = class213.method4167((byte)var1.readUnsignedByte());
					class234 var15 = class150.method3284(var12.field4964, var12.field4970);
					int var11 = Math.min(var15.method4447(), 128);
					var12.field4963 = var11 / Client.field732;
					var12.field4968 = var11 % Client.field732;
					if (var7 != 0 || var13 != 0) {
						var12.method8684(var7 + var12.field4974[0], var13 + var12.field4965[0], var14);
					}
				}
			}

			while (var1.method9510(Client.packetWriter.serverPacketLength) >= 10) {
				var3 = var1.readUnsignedShort();
				var0.worldEntityIndices[++var0.worldEntityCount - 1] = var3;
				var4 = var1.readUnsignedByte();
				int var5 = var1.readUnsignedByte();
				int var16 = var4 * 8;
				int var17 = var5 * 8;
				WorldEntity var8 = new WorldEntity(var3, var16, var17, class105.clientPreferences.getDrawDistance());
				var0.worldEntities[var3] = var8;
				int var9 = var1.readUnsignedByte();
				int var10 = var1.readUnsignedByte();
				var8.method8679(var9, var10);
				var8.field4970 = var1.readUnsignedShort();
				var1.readUnsignedShort();
			}

		}
	}
}
