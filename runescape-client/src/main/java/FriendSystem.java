import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 930018943
	)
	int field854;

	@ObfuscatedSignature(
		descriptor = "(Lux;)V"
	)
	FriendSystem(LoginType var1) {
		this.field854 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-341039258"
	)
	boolean method1887() {
		return this.field854 == 2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "58"
	)
	final void method1888() {
		this.field854 = 1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lua;II)V",
		garbageValue = "155473540"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field854 = 2;
		class94.method2409();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1716558011"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field4914 < class129.method3033() / 1000L - 5L) {
				if (var1.world > 0) {
					UrlRequest.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					UrlRequest.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "42376380"
	)
	@Export("clear")
	final void clear() {
		this.field854 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lvv;ZI)Z",
		garbageValue = "-155866018"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(class17.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvv;B)Z",
		garbageValue = "65"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1198656270"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					class414.method7741();
				} else if (class17.localPlayer.username.equals(var2)) {
					class171.method3491();
				} else if (this.isFriended(var2, false)) {
					StringBuilder var10000 = (new StringBuilder()).append(var1);
					Object var10001 = null;
					String var4 = var10000.append(" is already on your friend list").toString();
					UrlRequest.addGameMessage(30, "", var4);
				} else if (this.isIgnored(var2)) {
					class186.method3733(var1);
				} else {
					PacketBufferNode var3 = WorldMapElement.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class432.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1424658205"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field653 != 1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1503464588"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				StringBuilder var10000;
				String var3;
				if (this.canAddIgnore()) {
					var10000 = null;
					var3 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
					UrlRequest.addGameMessage(30, "", var3);
				} else if (class17.localPlayer.username.equals(var2)) {
					var10000 = null;
					var3 = "You can't add yourself to your own ignore list";
					UrlRequest.addGameMessage(30, "", var3);
				} else if (this.isIgnored(var2)) {
					var10000 = (new StringBuilder()).append(var1);
					Object var10001 = null;
					var3 = var10000.append(" is already on your ignore list").toString();
					UrlRequest.addGameMessage(30, "", var3);
				} else if (this.isFriended(var2, false)) {
					Occluder.method5112(var1);
				} else {
					class188.method3766(var1);
				}
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field653 != 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "276791875"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Client.field729 = Client.cycleCntr;
					PacketBufferNode var3 = WorldMapElement.getPacketBufferNode(ClientPacket.FRIEND_DELUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class432.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				class94.method2409();
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "1857780506"
	)
	@Export("removeIgnore")
	public final void removeIgnore(String var1, boolean var2) {
		if (var1 != null) {
			Username var3 = new Username(var1, this.loginType);
			if (var3.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var3)) {
					Client.field729 = Client.cycleCntr;
					if (var2) {
						PacketBufferNode var4 = WorldMapElement.getPacketBufferNode(ClientPacket.IGNORE_DELUSER, Client.packetWriter.isaacCipher);
						var4.packetBuffer.writeByte(class432.stringCp1252NullTerminatedByteSize(var1));
						var4.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var4);
					}
				}

				ItemContainer.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvv;I)Z",
		garbageValue = "1627960102"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "71"
	)
	public static int method1953(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}
}
