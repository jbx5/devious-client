import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bg")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lpl;")
	@Export("loginType")
	final LoginType loginType;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lno;")
	@Export("friendsList")
	public final FriendsList friendsList;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lnd;")
	@Export("ignoreList")
	public final IgnoreList ignoreList;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 927837377)
	int field794 = 0;

	@ObfuscatedSignature(descriptor = "(Lpl;)V")
	FriendSystem(LoginType var1) {
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-788390797")
	boolean method1627() {
		return this.field794 == 2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "1")
	final void method1702() {
		this.field794 = 1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqr;II)V", garbageValue = "15776660")
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field794 = 2;
		class271.method5170();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-596929038")
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = ((FriendLoginUpdate) (this.friendsList.friendLoginUpdates.last())); var1 != null; var1 = ((FriendLoginUpdate) (this.friendsList.friendLoginUpdates.previous()))) {
			if (((long) (var1.field4296)) < class181.method3483() / 1000L - 5L) {
				if (var1.world > 0) {
					VarcInt.addGameMessage(5, "", var1.username + " has logged in.");
				}
				if (var1.world == 0) {
					VarcInt.addGameMessage(5, "", var1.username + " has logged out.");
				}
				var1.remove();
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-860887782")
	@Export("clear")
	final void clear() {
		this.field794 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqy;ZI)Z", garbageValue = "244591169")
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(ScriptFrame.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(Lqy;I)Z", garbageValue = "-622799263")
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-1454729750")
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					Object var10000 = null;
					String var4 = "Your friend list is full. Max of 200 for free users, and 400 for members";
					VarcInt.addGameMessage(30, "", var4);
				} else if (ScriptFrame.localPlayer.username.equals(var2)) {
					class270.method5154();
				} else if (this.isFriended(var2, false)) {
					WorldMapLabelSize.method4449(var1);
				} else if (this.isIgnored(var2)) {
					class128.method2801(var1);
				} else {
					PacketBufferNode var3 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-360356908")
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field592 != 1;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "-34")
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					class4.method20("Your ignore list is full. Max of 100 for free users, and 400 for members");
				} else if (ScriptFrame.localPlayer.username.equals(var2)) {
					PacketBufferNode.method5137();
				} else if (this.isIgnored(var2)) {
					WorldMapCacheName.method4984(var1);
				} else if (this.isFriended(var2, false)) {
					UserComparator8.method2552(var1);
				} else {
					UserComparator3.method2582(var1);
				}
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-64")
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field592 != 1;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-509438981")
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					ParamComposition.method3508();
					PacketBufferNode var3 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.FRIEND_DELUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
				class271.method5170();
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-1617210876")
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var2)) {
					ParamComposition.method3508();
					PacketBufferNode var3 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.IGNORE_DELUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
				ParamComposition.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqy;B)Z", garbageValue = "2")
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = ((Friend) (this.friendsList.getByUsername(var1)));
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)Lbd;", garbageValue = "-1446818255")
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "63163772")
	static int method1661(int var0) {
		return ((int) ((Math.log(((double) (var0))) / Interpreter.field824 - 7.0) * 256.0));
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-2052694572")
	static final void method1670() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) {
			Player var1 = Client.players[Players.Players_indices[var0]];
			var1.clearIsInFriendsChat();
		}
	}
}