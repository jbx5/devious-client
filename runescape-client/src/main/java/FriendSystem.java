import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("ah")
	public static short[] field829;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1850775767
	)
	int field835;

	@ObfuscatedSignature(
		descriptor = "(Luu;)V"
	)
	FriendSystem(LoginType var1) {
		this.field835 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1624105511"
	)
	boolean method1911() {
		return this.field835 == 2;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1205650652"
	)
	final void method1912() {
		this.field835 = 1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;IB)V",
		garbageValue = "-126"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field835 = 2;
		MidiPcmStream.method6317();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field4936 < WorldMapData_1.method4861() / 1000L - 5L) {
				if (var1.world > 0) {
					VarbitComposition.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					VarbitComposition.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2051313334"
	)
	@Export("clear")
	final void clear() {
		this.field835 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvo;ZI)Z",
		garbageValue = "1902606376"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(SoundCache.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvo;I)Z",
		garbageValue = "648592187"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-68"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					AbstractWorldMapIcon.method5076("Your friend list is full. Max of 200 for free users, and 400 for members");
				} else if (SoundCache.localPlayer.username.equals(var2)) {
					AbstractWorldMapIcon.method5076("You can't add yourself to your own friend list");
				} else if (this.isFriended(var2, false)) {
					SoundSystem.method870(var1);
				} else if (this.isIgnored(var2)) {
					class498.method8897(var1);
				} else {
					PacketBufferNode var3 = class170.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-3"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field628 != 1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "317572337"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					class148.method3277();
				} else if (SoundCache.localPlayer.username.equals(var2)) {
					class235.method4450();
				} else if (this.isIgnored(var2)) {
					AbstractWorldMapIcon.method5076(var1 + " is already on your ignore list");
				} else if (this.isFriended(var2, false)) {
					AbstractWorldMapIcon.method5076("Please remove " + var1 + " from your friend list first");
				} else {
					PacketBufferNode var3 = class170.getPacketBufferNode(ClientPacket.field3298, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2113018311"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field628 != 1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "9"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					class498.method8900();
					PacketBufferNode var3 = class170.getPacketBufferNode(ClientPacket.FRIEND_DELUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				MidiPcmStream.method6317();
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "88"
	)
	@Export("removeIgnore")
	public final void removeIgnore(String var1, boolean var2) {
		if (var1 != null) {
			Username var3 = new Username(var1, this.loginType);
			if (var3.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var3)) {
					class498.method8900();
					if (var2) {
						PacketBufferNode var4 = class170.getPacketBufferNode(ClientPacket.IGNORE_DELUSER, Client.packetWriter.isaacCipher);
						var4.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var1));
						var4.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var4);
					}
				}

				class153.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lvo;I)Z",
		garbageValue = "-1955548629"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfi;",
		garbageValue = "33"
	)
	static class136 method1975(int var0) {
		class136 var1 = (class136)class210.findEnumerated(class421.method7720(), var0);
		if (var1 == null) {
			var1 = class136.field1609;
		}

		return var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1235413797"
	)
	static final int method1931(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
