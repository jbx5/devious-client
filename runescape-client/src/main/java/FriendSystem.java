import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import net.runelite.mapping.Export;
@ObfuscatedName("bl")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("cc")
	@ObfuscatedSignature(descriptor = "[Lqu;")
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lpe;")
	@Export("loginType")
	final LoginType loginType;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lng;")
	@Export("friendsList")
	public final FriendsList friendsList;

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Lmi;")
	@Export("ignoreList")
	public final IgnoreList ignoreList;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 594500445)
	int field802;

	@ObfuscatedSignature(descriptor = "(Lpe;)V")
	FriendSystem(LoginType var1) {
		this.field802 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "3")
	boolean method1634() {
		return this.field802 == 2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-499734620")
	final void method1635() {
		this.field802 = 1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqt;IB)V", garbageValue = "-18")
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field802 = 2;
		for (int var3 = 0; var3 < Players.Players_count; ++var3) {
			Player var4 = Client.players[Players.Players_indices[var3]];
			var4.clearIsFriend();
		}
		Iterator var5 = Messages.Messages_hashTable.iterator();
		while (var5.hasNext()) {
			Message var6 = ((Message) (var5.next()));
			var6.clearIsFromFriend();
		} 
		if (Huffman.friendsChat != null) {
			Huffman.friendsChat.clearFriends();
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1539962262")
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = ((FriendLoginUpdate) (this.friendsList.friendLoginUpdates.last())); var1 != null; var1 = ((FriendLoginUpdate) (this.friendsList.friendLoginUpdates.previous()))) {
			if (((long) (var1.field4300)) < class115.method2692() / 1000L - 5L) {
				if (var1.world > 0) {
					class290.addGameMessage(5, "", var1.username + " has logged in.");
				}
				if (var1.world == 0) {
					class290.addGameMessage(5, "", var1.username + " has logged out.");
				}
				var1.remove();
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1212770605")
	@Export("clear")
	final void clear() {
		this.field802 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(Lqa;ZI)Z", garbageValue = "883394648")
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(class101.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(Lqa;I)Z", garbageValue = "1096678749")
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "-108")
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				StringBuilder var10000;
				String var4;
				if (this.friendsListIsFull()) {
					var10000 = null;
					var4 = "Your friend list is full. Max of 200 for free users, and 400 for members";
					class290.addGameMessage(30, "", var4);
				} else if (class101.localPlayer.username.equals(var2)) {
					var10000 = null;
					var4 = "You can't add yourself to your own friend list";
					class290.addGameMessage(30, "", var4);
				} else if (this.isFriended(var2, false)) {
					FriendLoginUpdate.method6632(var1);
				} else if (this.isIgnored(var2)) {
					var10000 = new StringBuilder();
					Object var10001 = null;
					var10000 = var10000.append("Please remove ").append(var1);
					var10001 = null;
					var4 = var10000.append(" from your ignore list first").toString();
					class290.addGameMessage(30, "", var4);
				} else {
					PacketBufferNode var3 = EnumComposition.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(ScriptEvent.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-2036548455")
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field601 != 1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "87")
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					GrandExchangeOfferOwnWorldComparator.method1095();
				} else {
					StringBuilder var10000;
					String var3;
					if (class101.localPlayer.username.equals(var2)) {
						var10000 = null;
						var3 = "You can't add yourself to your own ignore list";
						class290.addGameMessage(30, "", var3);
					} else {
						Object var10001;
						if (this.isIgnored(var2)) {
							var10000 = new StringBuilder().append(var1);
							var10001 = null;
							var3 = var10000.append(" is already on your ignore list").toString();
							class290.addGameMessage(30, "", var3);
						} else if (this.isFriended(var2, false)) {
							var10000 = new StringBuilder();
							var10001 = null;
							var10000 = var10000.append("Please remove ").append(var1);
							var10001 = null;
							var3 = var10000.append(" from your friend list first").toString();
							class290.addGameMessage(30, "", var3);
						} else {
							class113.method2632(var1);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "2051401607")
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field601 != 1;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "1055399844")
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Client.field689 = Client.cycleCntr;
					PacketBufferNode var3 = EnumComposition.getPacketBufferNode(ClientPacket.FRIEND_DELUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(ScriptEvent.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
				for (int var5 = 0; var5 < Players.Players_count; ++var5) {
					Player var4 = Client.players[Players.Players_indices[var5]];
					var4.clearIsFriend();
				}
				Iterator var6 = Messages.Messages_hashTable.iterator();
				while (var6.hasNext()) {
					Message var7 = ((Message) (var6.next()));
					var7.clearIsFromFriend();
				} 
				if (Huffman.friendsChat != null) {
					Huffman.friendsChat.clearFriends();
				}
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-1243393303")
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var2)) {
					Client.field689 = Client.cycleCntr;
					PacketBufferNode var3 = EnumComposition.getPacketBufferNode(ClientPacket.IGNORE_DELUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(ScriptEvent.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
				class126.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(Lqa;I)Z", garbageValue = "-2000641193")
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = ((Friend) (this.friendsList.getByUsername(var1)));
		return var2 != null && var2.hasWorld();
	}
}