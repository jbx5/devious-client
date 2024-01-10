import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public class class233 implements Comparator {
	@ObfuscatedName("am")
	@Export("javaVendor")
	public static String javaVendor;

	class233() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Liv;Liv;I)I",
		garbageValue = "381751439"
	)
	int method4578(class228 var1, class228 var2) {
		return var1.method4498() - var2.method4498();
	}

	public int compare(Object var1, Object var2) {
		return this.method4578((class228)var1, (class228)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1139421000"
	)
	static final int method4588() {
		if (class93.clientPreferences.isRoofsHidden()) {
			return SecureUrlRequester.Client_plane;
		} else {
			int var0 = HttpRequestTask.getTileHeight(GameEngine.cameraX, GrandExchangeOfferTotalQuantityComparator.cameraZ, SecureUrlRequester.Client_plane);
			return var0 - class28.cameraY < 800 && (Tiles.Tiles_renderFlags[SecureUrlRequester.Client_plane][GameEngine.cameraX >> 7][GrandExchangeOfferTotalQuantityComparator.cameraZ >> 7] & 4) != 0 ? SecureUrlRequester.Client_plane : 3;
		}
	}
}
