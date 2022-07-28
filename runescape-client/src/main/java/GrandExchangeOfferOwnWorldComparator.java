import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Comparator;
import net.runelite.mapping.Export;
@ObfuscatedName("bu")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1731335085)
	static int field480;

	@ObfuscatedName("bq")
	static String field479;

	@ObfuscatedName("nq")
	@ObfuscatedGetter(intValue = -876119815)
	@Export("selectedItemSlot")
	static int selectedItemSlot;

	@ObfuscatedName("o")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Llf;Llf;I)I", garbageValue = "579303732")
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) {
			return 0;
		} else {
			if (this.filterWorlds) {
				if (Client.worldId == var1.world) {
					return -1;
				}
				if (var2.world == Client.worldId) {
					return 1;
				}
			}
			return var1.world < var2.world ? -1 : 1;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged(((GrandExchangeEvent) (var1)), ((GrandExchangeEvent) (var2)));
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "-1860134981")
	public static int method1103(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var2 = var0 * var2;
			}
			var0 *= var0;
		}
		if (var1 == 1) {
			return var0 * var2;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)Lgf;", garbageValue = "801437853")
	public static HitSplatDefinition method1095(int var0) {
		HitSplatDefinition var1 = ((HitSplatDefinition) (HitSplatDefinition.HitSplatDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			HitSplatDefinition.HitSplatDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("q")
	public static String method1107(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;
				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}
				StringBuilder var5 = new StringBuilder(var2);
				while (var0 != 0L) {
					long var6 = var0;
					var0 /= 37L;
					var5.append(class345.base37Table[((int) (var6 - var0 * 37L))]);
				} 
				return var5.reverse().toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(descriptor = "(IIII)V", garbageValue = "1594580668")
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var3 = SecureRandomFuture.getTileHeight(var0, var1, FriendSystem.Client_plane) - var2;
			var0 -= WorldMapLabelSize.cameraX;
			var3 -= class123.cameraY;
			var1 -= Widget.cameraZ;
			int var4 = Rasterizer3D.Rasterizer3D_sine[UserComparator9.cameraPitch];
			int var5 = Rasterizer3D.Rasterizer3D_cosine[UserComparator9.cameraPitch];
			int var6 = Rasterizer3D.Rasterizer3D_sine[PendingSpawn.cameraYaw];
			int var7 = Rasterizer3D.Rasterizer3D_cosine[PendingSpawn.cameraYaw];
			int var8 = var6 * var1 + var0 * var7 >> 16;
			var1 = var7 * var1 - var0 * var6 >> 16;
			var0 = var8;
			var8 = var5 * var3 - var4 * var1 >> 16;
			var1 = var4 * var3 + var5 * var1 >> 16;
			if (var1 >= 50) {
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}
		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}