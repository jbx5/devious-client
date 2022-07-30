import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ih")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lih;")
	static final WorldMapID field2839 = new WorldMapID(0);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lih;")
	static final WorldMapID field2841 = new WorldMapID(1);

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 49151053)
	@Export("value")
	final int value;

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "([Ljava/lang/String;[SIII)V", garbageValue = "484240058")
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}
			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "-1503364186")
	static void method4981(boolean var0) {
		byte var1 = 0;
		if (!AbstractWorldMapIcon.method5047()) {
			var1 = 12;
		} else if (class329.client.method1112() || class329.client.method1113()) {
			var1 = 10;
		}
		UserComparator6.method2701(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			class260.field2908 = 0;
			Login.otp = "";
		}
		Client.method1639();
		FloorOverlayDefinition.method3799();
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "966593255")
	static final void method4982() {
		Client.field542 = 0;
		int var0 = class300.baseX * 8 + (class28.localPlayer.x >> 7);
		int var1 = Message.baseY * 64 + (class28.localPlayer.y >> 7);
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
			Client.field542 = 1;
		}
		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
			Client.field542 = 1;
		}
		if (Client.field542 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
			Client.field542 = 0;
		}
	}
}