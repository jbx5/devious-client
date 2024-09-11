import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("qg")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	static class532 field841;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -564322901
	)
	int field843;

	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	FriendSystem(LoginType var1) {
		this.field843 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1896211312"
	)
	boolean method1985() {
		return this.field843 == 2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-356277517"
	)
	final void method2039() {
		this.field843 = 1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvf;II)V",
		garbageValue = "82472118"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field843 = 2;
		WallDecoration.method5537();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1307903195"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field4978 < WorldMapElement.method3843() / 1000L - 5L) {
				if (var1.world > 0) {
					StructComposition.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					StructComposition.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-378558"
	)
	@Export("clear")
	final void clear() {
		this.field843 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lwf;ZI)Z",
		garbageValue = "-1289431622"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(AddRequestTask.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwf;B)Z",
		garbageValue = "2"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "185178241"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					class501.method9238();
				} else if (AddRequestTask.localPlayer.username.equals(var2)) {
					class419.method8013("You can't add yourself to your own friend list");
				} else if (this.isFriended(var2, false)) {
					Actor.method2689(var1);
				} else if (this.isIgnored(var2)) {
					class419.method8013("Please remove " + var1 + " from your ignore list first");
				} else {
					PacketBufferNode var3 = class141.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class536.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field565 != 1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "213108422"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					JagexCache.method4474();
				} else if (AddRequestTask.localPlayer.username.equals(var2)) {
					class419.method8013("You can't add yourself to your own ignore list");
				} else if (this.isIgnored(var2)) {
					class419.method8013(var1 + " is already on your ignore list");
				} else if (this.isFriended(var2, false)) {
					class419.method8013("Please remove " + var1 + " from your friend list first");
				} else {
					Archive.method7519(var1);
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1661588692"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field565 != 1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "5661"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Client.field714 = Client.cycleCntr;
					PacketBufferNode var3 = class141.getPacketBufferNode(ClientPacket.FRIEND_DELUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class536.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				WallDecoration.method5537();
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "918930584"
	)
	@Export("removeIgnore")
	public final void removeIgnore(String var1, boolean var2) {
		if (var1 != null) {
			Username var3 = new Username(var1, this.loginType);
			if (var3.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var3)) {
					Client.field714 = Client.cycleCntr;
					if (var2) {
						PacketBufferNode var4 = class141.getPacketBufferNode(ClientPacket.IGNORE_DELUSER, Client.packetWriter.isaacCipher);
						var4.packetBuffer.writeByte(class536.stringCp1252NullTerminatedByteSize(var1));
						var4.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var4);
					}
				}

				class417.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lwf;B)Z",
		garbageValue = "34"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(Lny;IIIB)V",
		garbageValue = "-26"
	)
	static final void method2046(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.method7244(TaskHandler.widgetDefinition, false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				UrlRequest.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

		}
	}
}
