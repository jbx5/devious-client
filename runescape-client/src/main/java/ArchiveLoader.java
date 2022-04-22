import java.util.Collections;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("hg")
	@ObfuscatedSignature(descriptor = 
	"Lhv;")

	@Export("scene")
	static Scene scene;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Llx;")

	@Export("archive")
	final Archive archive;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	711415979)

	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-905507323)

	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(descriptor = 
	"(Llx;Ljava/lang/String;)V")

	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"0")

	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if ((!this.archive.method5824(var1)) || this.archive.method5814(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"([I[II)V", garbageValue = 
	"-1372726492")

	public static void method2061(int[] var0, int[] var1) {
		if ((var0 != null) && (var1 != null)) {
			FloorOverlayDefinition.ByteArrayPool_alternativeSizes = var0;
			class128.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			BoundaryObject.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < FloorOverlayDefinition.ByteArrayPool_alternativeSizes.length; ++var2) {
				BoundaryObject.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
				ByteArrayPool.field4167.add(var0[var2]);
			}

			Collections.sort(ByteArrayPool.field4167);
		} else {
			FloorOverlayDefinition.ByteArrayPool_alternativeSizes = null;
			class128.ByteArrayPool_altSizeArrayCounts = null;
			BoundaryObject.ByteArrayPool_arrays = null;
			Login.method1960();
		}
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(descriptor = 
	"(Lcz;ZI)V", garbageValue = 
	"784160741")

	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (((var0 != null) && var0.isVisible()) && (!var0.isHidden)) {
			var0.isUnanimated = false;
			if ((((Client.isLowDetail && (Players.Players_count > 50)) || (Players.Players_count > 200)) && var1) && (var0.movementSequence == var0.idleSequence)) {
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7;
			int var3 = var0.y >> 7;
			if ((((var2 >= 0) && (var2 < 104)) && (var3 >= 0)) && (var3 < 104)) {
				long var4 = GameObject.calculateTag(0, 0, 0, false, var0.index);
				if (((var0.model0 != null) && (Client.cycle >= var0.animationCycleStart)) && (Client.cycle < var0.animationCycleEnd)) {
					var0.isUnanimated = false;
					var0.tileHeight = WorldMapLabel.getTileHeight(var0.x, var0.y, class18.Client_plane);
					var0.playerCycle = Client.cycle;
					scene.addNullableObject(class18.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY);
				} else {
					if (((var0.x & 127) == 64) && ((var0.y & 127) == 64)) {
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
					}

					var0.tileHeight = WorldMapLabel.getTileHeight(var0.x, var0.y, class18.Client_plane);
					var0.playerCycle = Client.cycle;
					scene.drawEntity(class18.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
				}
			}
		}

	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(descriptor = 
	"(II)Z", garbageValue = 
	"1332589491")

	static boolean method2062(int var0) {
		for (int var1 = 0; var1 < Client.field731; ++var1) {
			if (Client.field733[var1] == var0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;ZI)Ljava/lang/String;", garbageValue = 
	"-1401650476")

	static String method2063(String var0, boolean var1) {
		String var2 = (var1) ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (class65.field868 != null) {
			var3 = "/p=" + class65.field868;
		}

		String var4 = "runescape.com";
		return ((((((((var2 + var0) + ".") + var4) + "/l=") + Skills.clientLanguage) + "/a=") + GrandExchangeOfferOwnWorldComparator.field483) + var3) + "/";
	}
}