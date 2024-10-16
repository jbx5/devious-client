import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lkv;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkv;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lkv;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 767209907
	)
	final int field3082;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 46521641
	)
	final int field3083;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 935019347
	)
	final int field3084;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(1, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field3082 = var1;
		this.field3083 = var2;
		this.field3084 = var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "-518406032"
	)
	boolean method5871(float var1) {
		return var1 >= (float)this.field3084;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lkv;",
		garbageValue = "-1763088923"
	)
	static WorldMapLabelSize method5872(int var0) {
		WorldMapLabelSize[] var1 = new WorldMapLabelSize[]{WorldMapLabelSize_large, WorldMapLabelSize_medium, WorldMapLabelSize_small};
		WorldMapLabelSize[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			WorldMapLabelSize var4 = var2[var3];
			if (var0 == var4.field3083) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1712679396"
	)
	static void method5875(int var0, String var1) {
		Login.Login_loadingText = var1;
		Login.Login_loadingPercent = var0;
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	static void method5879() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < var1.worldEntityCount; ++var2) {
				int var3 = var1.worldEntityIndices[var2];
				WorldEntity var4 = var1.worldEntities[var3];
				if (var4 != null) {
					var4.method9154(Client.cycle);
				}
			}
		}

	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lng;I)Ljava/lang/String;",
		garbageValue = "-622775175"
	)
	static String method5880(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					String var4 = var0.substring(0, var3);
					int var6 = class153.method3600(var1, var2 - 1);
					String var5;
					if (var6 < 999999999) {
						var5 = Integer.toString(var6);
					} else {
						var5 = "*";
					}

					var0 = var4 + var5 + var0.substring(var3 + 2);
				}
			}
		}

		return var0;
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1835850188"
	)
	static boolean method5878(int var0) {
		for (int var1 = 0; var1 < Client.field735; ++var1) {
			if (Client.field737[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
