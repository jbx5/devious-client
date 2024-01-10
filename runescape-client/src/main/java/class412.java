import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pc")
public class class412 {
	@ObfuscatedName("am")
	public char field4545;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2146708003
	)
	public int field4544;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1375073155
	)
	public int field4546;

	class412() {
		this.field4544 = 0;
		this.field4546 = 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1372610125"
	)
	public static int method7750(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Low;Ljava/lang/String;Ljava/lang/String;I)[Lut;",
		garbageValue = "1974839893"
	)
	public static IndexedSprite[] method7748(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			return class197.method3853(var0, var3, var4);
		}
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-128"
	)
	static final void method7749() {
		int var0;
		int var1;
		int var2;
		if (!Client.field760) {
			var0 = HttpMethod.field29 * 128 + 64;
			var1 = class172.field1817 * 16384 + 64;
			var2 = HttpRequestTask.getTileHeight(var0, var1, SecureUrlRequester.Client_plane) - HealthBar.field1296;
			GameObject.method5901(var0, var2, var1);
		} else if (Client.field763 != null) {
			GameEngine.cameraX = Client.field763.vmethod8819();
			GrandExchangeOfferTotalQuantityComparator.cameraZ = Client.field763.vmethod8820();
			if (Client.field762) {
				class28.cameraY = Client.field763.vmethod8814();
			} else {
				class28.cameraY = HttpRequestTask.getTileHeight(GameEngine.cameraX, GrandExchangeOfferTotalQuantityComparator.cameraZ, SecureUrlRequester.Client_plane) - Client.field763.vmethod8814();
			}

			Client.field763.method8831();
		}

		if (!Client.field761) {
			var0 = SoundSystem.field314 * 16384 + 64;
			var1 = ArchiveDiskActionHandler.field4334 * 128 + 64;
			var2 = HttpRequestTask.getTileHeight(var0, var1, SecureUrlRequester.Client_plane) - ClanChannel.field1766;
			int var3 = var0 - GameEngine.cameraX;
			int var4 = var2 - class28.cameraY;
			int var5 = var1 - GrandExchangeOfferTotalQuantityComparator.cameraZ;
			int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3));
			int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047;
			int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047;
			class401.method7504(var7, var8);
		} else {
			if (Client.field765 != null) {
				UserComparator3.cameraPitch = Client.field765.method8812();
				UserComparator3.cameraPitch = Math.min(Math.max(UserComparator3.cameraPitch, 128), 383);
				Client.field765.method8831();
			}

			if (Client.field500 != null) {
				HealthBarUpdate.cameraYaw = Client.field500.method8812() & 2047;
				Client.field500.method8831();
			}
		}

	}
}
