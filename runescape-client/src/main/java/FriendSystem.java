import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1624494161
	)
	int field851;

	@ObfuscatedSignature(
		descriptor = "(Lsl;)V"
	)
	FriendSystem(LoginType var1) {
		this.field851 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1751365649"
	)
	boolean method1855() {
		return this.field851 == 2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-641955560"
	)
	final void method1856() {
		this.field851 = 1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;II)V",
		garbageValue = "-479200024"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field851 = 2;

		for (int var3 = 0; var3 < Players.Players_count; ++var3) {
			Player var4 = Client.players[Players.Players_indices[var3]];
			var4.clearIsFriend();
		}

		Iterator var5 = Messages.Messages_hashTable.iterator();

		while (var5.hasNext()) {
			Message var6 = (Message)var5.next();
			var6.clearIsFromFriend();
		}

		if (ReflectionCheck.friendsChat != null) {
			ReflectionCheck.friendsChat.clearFriends();
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-676446193"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field4651 < GameEngine.method661() / 1000L - 5L) {
				if (var1.world > 0) {
					MouseHandler.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					MouseHandler.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "60"
	)
	@Export("clear")
	final void clear() {
		this.field851 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luc;ZI)Z",
		garbageValue = "496878304"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(VarbitComposition.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Luc;I)Z",
		garbageValue = "-1644388901"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "76"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					UserComparator8.method2870("Your friend list is full. Max of 200 for free users, and 400 for members");
				} else if (VarbitComposition.localPlayer.username.equals(var2)) {
					Clock.method3543();
				} else if (this.isFriended(var2, false)) {
					Strings.method6621(var1);
				} else if (this.isIgnored(var2)) {
					UserComparator8.method2870("Please remove " + var1 + " from your ignore list first");
				} else {
					MouseHandler.method698(var1);
				}
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1246160052"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field655 != 1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "541901649"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					UserComparator8.method2870("Your ignore list is full. Max of 100 for free users, and 400 for members");
				} else if (VarbitComposition.localPlayer.username.equals(var2)) {
					class503.method8932();
				} else if (this.isIgnored(var2)) {
					class31.method466(var1);
				} else if (this.isFriended(var2, false)) {
					UserComparator8.method2870("Please remove " + var1 + " from your friend list first");
				} else {
					PacketBufferNode var3 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(AbstractSocket.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "203788977"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field655 != 1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2045043911"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					class113.method2845();
					PacketBufferNode var3 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.FRIEND_DELUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(AbstractSocket.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) {
					Player var4 = Client.players[Players.Players_indices[var5]];
					var4.clearIsFriend();
				}

				Iterator var6 = Messages.Messages_hashTable.iterator();

				while (var6.hasNext()) {
					Message var7 = (Message)var6.next();
					var7.clearIsFromFriend();
				}

				if (ReflectionCheck.friendsChat != null) {
					ReflectionCheck.friendsChat.clearFriends();
				}

			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "81642025"
	)
	@Export("removeIgnore")
	public final void removeIgnore(String var1, boolean var2) {
		if (var1 != null) {
			Username var3 = new Username(var1, this.loginType);
			if (var3.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var3)) {
					class113.method2845();
					if (var2) {
						PacketBufferNode var4 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.IGNORE_DELUSER, Client.packetWriter.isaacCipher);
						var4.packetBuffer.writeByte(AbstractSocket.stringCp1252NullTerminatedByteSize(var1));
						var4.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var4);
					}
				}

				AbstractSocket.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Luc;I)Z",
		garbageValue = "1021453892"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIIB)V",
		garbageValue = "108"
	)
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

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "284694724"
	)
	static int method1917() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field827;
		} else {
			return 10000;
		}
	}
}
