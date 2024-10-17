import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(1, (byte)0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(2, (byte)1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(0, (byte)2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(3, (byte)3);

	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1849201209
	)
	@Export("type")
	final int type;
	@ObfuscatedName("ay")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Llg;",
		garbageValue = "1145772023"
	)
	static WorldMapSectionType[] method6257() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE0};
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "22"
	)
	public static void method6255() {
		class191.field2026.clear();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-115351229"
	)
	static void method6251() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			class132.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1 = LoginScreenAnimation.method2817();
			int var0;
			if (0L == var1) {
				var0 = 5;
			} else {
				var0 = class357.method6924(var1, Login.Login_username);
			}

			switch(var0) {
			case 2:
				class132.setLoginResponseString(Strings.field4237, Strings.field4198, Strings.field4448);
				class6.updateLoginIndex(6);
				break;
			case 3:
				class132.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				class132.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				class132.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				class132.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				class132.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-754771729"
	)
	static final void method6254() {
		if (Client.logoutTimer > 0) {
			class389.logOut();
		} else {
			Client.timer.method8791();
			BuddyRankComparator.updateGameState(40);
			class197.field2063 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIZI)V",
		garbageValue = "1487261076"
	)
	@Export("addTileItemToGroundItems")
	static void addTileItemToGroundItems(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		TileItem var10 = new TileItem();
		var10.id = var3;
		var10.quantity = var4;
		var10.setFlag(var5);
		var10.visibleTime = Client.serverCycle + var6;
		var10.despawnTime = var7 + Client.serverCycle;
		var10.ownership = var8;
		var10.isPrivate = var9;
		if (class344.worldView.groundItems[var0][var1][var2] == null) {
			class344.worldView.groundItems[var0][var1][var2] = new NodeDeque();
		}

		class344.worldView.groundItems[var0][var1][var2].addFirst(var10);
		class397.updateItemPile(var0, var1, var2);
	}
}
