import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = -168710823
	)
	static int field829;
	@ObfuscatedName("tb")
	@ObfuscatedGetter(
		intValue = 292204685
	)
	static int field827;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -194289991
	)
	int field826;

	@ObfuscatedSignature(
		descriptor = "(Luk;)V"
	)
	FriendSystem(LoginType var1) {
		this.field826 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "72"
	)
	boolean method1931() {
		return this.field826 == 2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "625102613"
	)
	final void method1932() {
		this.field826 = 1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvg;II)V",
		garbageValue = "654988384"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field826 = 2;

		for (int var3 = 0; var3 < ConcurrentMidiTask.topLevelWorldView.playerUpdateManager.playerCount; ++var3) {
			Player var4 = ConcurrentMidiTask.topLevelWorldView.players[ConcurrentMidiTask.topLevelWorldView.playerUpdateManager.playerIndices[var3]];
			var4.clearIsFriend();
		}

		Iterator var5 = Messages.Messages_hashTable.iterator();

		while (var5.hasNext()) {
			Message var6 = (Message)var5.next();
			var6.clearIsFromFriend();
		}

		if (HttpRequestTask.friendsChat != null) {
			HttpRequestTask.friendsChat.clearFriends();
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "324496132"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field4915 < RouteStrategy.method5439() / 1000L - 5L) {
				if (var1.world > 0) {
					class269.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					class269.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-15"
	)
	@Export("clear")
	final void clear() {
		this.field826 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvf;ZB)Z",
		garbageValue = "21"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(class253.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)Z",
		garbageValue = "-1591009787"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1919515465"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					class424.method7859();
				} else if (class253.localPlayer.username.equals(var2)) {
					ReflectionCheck.method675("You can't add yourself to your own friend list");
				} else if (this.isFriended(var2, false)) {
					class142.method3296(var1);
				} else if (this.isIgnored(var2)) {
					class36.method663(var1);
				} else {
					UserList.method8670(var1);
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1413463350"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field630 != 1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "125396245"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					ReflectionCheck.method675("Your ignore list is full. Max of 100 for free users, and 400 for members");
				} else if (class253.localPlayer.username.equals(var2)) {
					class339.method6447();
				} else if (this.isIgnored(var2)) {
					ReflectionCheck.method675(var1 + " is already on your ignore list");
				} else if (this.isFriended(var2, false)) {
					ReflectionCheck.method675("Please remove " + var1 + " from your friend list first");
				} else {
					PacketBufferNode var3 = class218.getPacketBufferNode(ClientPacket.field3284, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class526.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field630 != 1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "107"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					class30.method418();
					PacketBufferNode var3 = class218.getPacketBufferNode(ClientPacket.FRIEND_DELUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class526.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				for (int var5 = 0; var5 < ConcurrentMidiTask.topLevelWorldView.playerUpdateManager.playerCount; ++var5) {
					Player var4 = ConcurrentMidiTask.topLevelWorldView.players[ConcurrentMidiTask.topLevelWorldView.playerUpdateManager.playerIndices[var5]];
					var4.clearIsFriend();
				}

				Iterator var6 = Messages.Messages_hashTable.iterator();

				while (var6.hasNext()) {
					Message var7 = (Message)var6.next();
					var7.clearIsFromFriend();
				}

				if (HttpRequestTask.friendsChat != null) {
					HttpRequestTask.friendsChat.clearFriends();
				}

			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "-100"
	)
	@Export("removeIgnore")
	public final void removeIgnore(String var1, boolean var2) {
		if (var1 != null) {
			Username var3 = new Username(var1, this.loginType);
			if (var3.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var3)) {
					class30.method418();
					if (var2) {
						PacketBufferNode var4 = class218.getPacketBufferNode(ClientPacket.IGNORE_DELUSER, Client.packetWriter.isaacCipher);
						var4.packetBuffer.writeByte(class526.stringCp1252NullTerminatedByteSize(var1));
						var4.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var4);
					}
				}

				Decimator.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)Z",
		garbageValue = "-5"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}
}
