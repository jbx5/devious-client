import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("World")
public class World {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lch;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1400134735
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1226484089
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("ao")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("ae")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 949505101
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -857776505
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1854816577
	)
	@Export("population")
	int population;
	@ObfuscatedName("ax")
	@Export("host")
	String host;
	@ObfuscatedName("aw")
	@Export("activity")
	String activity;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2046997537
	)
	@Export("location")
	int location;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -337156259
	)
	@Export("index")
	int index;
	@ObfuscatedName("ak")
	String field821;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1879877142"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (class526.field5149.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1551707870"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (class526.field5160.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-35176563"
	)
	boolean method1841() {
		return (class526.field5150.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "662458741"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (class526.field5136.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "197916706"
	)
	boolean method1845() {
		return (class526.field5137.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "97"
	)
	boolean method1842() {
		return (class526.field5163.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-989897710"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (class526.field5151.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2019572946"
	)
	boolean method1844() {
		return (class526.field5164.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1167071721"
	)
	boolean method1893() {
		return (class526.field5142.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1549455343"
	)
	boolean method1858() {
		return (class526.field5161.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfx;I)V",
		garbageValue = "-222950832"
	)
	static void method1863(float var0, float var1, float var2, float var3, class131 var4) {
		float var5 = var1 - var0;
		float var6 = var2 - var1;
		float var7 = var3 - var2;
		float var8 = var6 - var5;
		var4.field1542 = var7 - var6 - var8;
		var4.field1529 = var8 + var8 + var8;
		var4.field1531 = var5 + var5 + var5;
		var4.field1537 = var0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lch;Lch;IZI)I",
		garbageValue = "-84905403"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1845() ? (var1.method1845() ? 0 : 1) : (var1.method1845() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1841() ? (var1.method1841() ? 0 : 1) : (var1.method1841() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id;
		}
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1793102624"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class189.logOut();
		switch(var0) {
		case 1:
			class255.method5036();
			break;
		case 2:
			class28.SpriteBuffer_reset();
		}

	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1688710746"
	)
	static final void method1896(boolean var0) {
		WorldMapRectangle.method5020();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = class482.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.hadNetworkError = true;
				}
			}

		}
	}

	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "30"
	)
	static void method1898() {
		if (Client.field597 && KeyHandler.localPlayer != null) {
			int var0 = KeyHandler.localPlayer.pathX[0];
			int var1 = KeyHandler.localPlayer.pathY[0];
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
				return;
			}

			class367.oculusOrbFocalPointX = KeyHandler.localPlayer.x;
			int var2 = HttpRequestTask.getTileHeight(KeyHandler.localPlayer.x, KeyHandler.localPlayer.y, SecureUrlRequester.Client_plane) - Client.camFollowHeight;
			if (var2 < WorldMapArea.field2516) {
				WorldMapArea.field2516 = var2;
			}

			WorldMapCacheName.oculusOrbFocalPointY = KeyHandler.localPlayer.y;
			Client.field597 = false;
		}

	}
}
