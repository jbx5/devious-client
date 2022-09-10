import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 983410639
	)
	int field814;

	@ObfuscatedSignature(
		descriptor = "(Lpn;)V"
	)
	FriendSystem(LoginType var1) {
		this.field814 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "293339898"
	)
	boolean method1784() {
		return this.field814 == 2; // L: 32
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-76"
	)
	final void method1785() {
		this.field814 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqq;II)V",
		garbageValue = "2116353988"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field814 = 2; // L: 41
		Interpreter.method2011(); // L: 42
	} // L: 43

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "41"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 46
			if ((long)var1.field4346 < Language.method6232() / 1000L - 5L) { // L: 47
				if (var1.world > 0) {
					class65.addGameMessage(5, "", var1.username + " has logged in."); // L: 48
				}

				if (var1.world == 0) { // L: 49
					class65.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 50
			}
		}

	} // L: 53

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1775658387"
	)
	@Export("clear")
	final void clear() {
		this.field814 = 0; // L: 56
		this.friendsList.clear(); // L: 57
		this.ignoreList.clear(); // L: 58
	} // L: 59

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqo;ZI)Z",
		garbageValue = "-218613046"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(class67.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqo;I)Z",
		garbageValue = "1139624346"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 69
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 70
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-588093598"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 75
			Username var2 = new Username(var1, this.loginType); // L: 76
			if (var2.hasCleanName()) { // L: 77
				StringBuilder var10000;
				String var4;
				if (this.friendsListIsFull()) { // L: 78
					var10000 = null; // L: 80
					var4 = "Your friend list is full. Max of 200 for free users, and 400 for members";
					class65.addGameMessage(30, "", var4); // L: 82
				} else if (class67.localPlayer.username.equals(var2)) { // L: 87
					class116.method2857(); // L: 88
				} else if (this.isFriended(var2, false)) { // L: 91
					var10000 = (new StringBuilder()).append(var1); // L: 93
					Object var10001 = null;
					var4 = var10000.append(" is already on your friend list").toString();
					class65.addGameMessage(30, "", var4); // L: 95
				} else if (this.isIgnored(var2)) { // L: 100
					ClientPreferences.method2400(var1); // L: 101
				} else {
					PacketBufferNode var3 = class120.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher); // L: 106
					var3.packetBuffer.writeByte(class357.stringCp1252NullTerminatedByteSize(var1)); // L: 107
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 108
					Client.packetWriter.addNode(var3); // L: 109
				}
			}
		}
	} // L: 85 89 98 102 111

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "106"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field621 != 1; // L: 128
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1418867525"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 135
			Username var2 = new Username(var1, this.loginType); // L: 136
			if (var2.hasCleanName()) { // L: 137
				if (this.canAddIgnore()) { // L: 138
					WorldMapSectionType.method5077(); // L: 139
				} else if (class67.localPlayer.username.equals(var2)) { // L: 142
					UserComparator7.method2743(); // L: 143
				} else if (this.isIgnored(var2)) { // L: 146
					StringBuilder var10000 = (new StringBuilder()).append(var1); // L: 148
					Object var10001 = null;
					String var4 = var10000.append(" is already on your ignore list").toString();
					class65.addGameMessage(30, "", var4); // L: 150
				} else if (this.isFriended(var2, false)) { // L: 155
					class145.method3227(var1); // L: 156
				} else {
					PacketBufferNode var3 = class120.getPacketBufferNode(ClientPacket.field3037, Client.packetWriter.isaacCipher); // L: 161
					var3.packetBuffer.writeByte(class357.stringCp1252NullTerminatedByteSize(var1)); // L: 162
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 163
					Client.packetWriter.addNode(var3); // L: 164
				}
			}
		}
	} // L: 140 144 153 157 166

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-718632691"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field621 != 1; // L: 190
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "859092397"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 197
			Username var2 = new Username(var1, this.loginType); // L: 198
			if (var2.hasCleanName()) { // L: 199
				if (this.friendsList.removeByUsername(var2)) { // L: 200
					WorldMapLabel.method5119(); // L: 201
					PacketBufferNode var3 = class120.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher); // L: 203
					var3.packetBuffer.writeByte(class357.stringCp1252NullTerminatedByteSize(var1)); // L: 204
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 205
					Client.packetWriter.addNode(var3); // L: 206
				}

				Interpreter.method2011(); // L: 208
			}
		}
	} // L: 209

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-40"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) { // L: 212
			Username var2 = new Username(var1, this.loginType); // L: 213
			if (var2.hasCleanName()) { // L: 214
				if (this.ignoreList.removeByUsername(var2)) { // L: 215
					WorldMapLabel.method5119(); // L: 216
					PacketBufferNode var3 = class120.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher); // L: 218
					var3.packetBuffer.writeByte(class357.stringCp1252NullTerminatedByteSize(var1)); // L: 219
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 220
					Client.packetWriter.addNode(var3); // L: 221
				}

				class364.FriendSystem_invalidateIgnoreds(); // L: 223
			}
		}
	} // L: 224

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqo;B)Z",
		garbageValue = "1"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 236
		return var2 != null && var2.hasWorld(); // L: 237
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "14834"
	)
	static void method1807() {
		ByteArrayPool.field4259.clear(); // L: 61
		ByteArrayPool.field4259.add(100); // L: 62
		ByteArrayPool.field4259.add(5000); // L: 63
		ByteArrayPool.field4259.add(10000); // L: 64
		ByteArrayPool.field4259.add(30000); // L: 65
	} // L: 66

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1479702690"
	)
	static void method1836() {
		if (Login.clearLoginScreen) { // L: 257
			Login.titleboxSprite = null; // L: 258
			Login.titlebuttonSprite = null; // L: 259
			DevicePcmPlayerProvider.runesSprite = null; // L: 260
			TextureProvider.leftTitleSprite = null; // L: 261
			PcmPlayer.rightTitleSprite = null; // L: 262
			MilliClock.logoSprite = null; // L: 263
			LoginType.title_muteSprite = null; // L: 264
			WorldMapDecoration.options_buttons_0Sprite = null; // L: 265
			UserComparator7.options_buttons_2Sprite = null; // L: 266
			class82.worldSelectBackSprites = null; // L: 267
			ReflectionCheck.worldSelectFlagSprites = null; // L: 268
			UserComparator6.worldSelectArrows = null; // L: 269
			class182.worldSelectStars = null; // L: 270
			class10.field45 = null; // L: 271
			VertexNormal.loginScreenRunesAnimation.method2356(); // L: 272
			TaskHandler.method3435(2); // L: 273
			class117.method2859(true); // L: 274
			Login.clearLoginScreen = false; // L: 275
		}
	} // L: 276
}
