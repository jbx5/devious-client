import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -23968915
	)
	int field828;

	@ObfuscatedSignature(
		descriptor = "(Lth;)V"
	)
	FriendSystem(LoginType var1) {
		this.field828 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-58"
	)
	boolean method1900() {
		return this.field828 == 2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2127783427"
	)
	final void method1901() {
		this.field828 = 1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "-613423136"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field828 = 2;
		Occluder.method5589();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "659623582"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field4723 < UserComparator9.method2973() / 1000L - 5L) {
				if (var1.world > 0) {
					GrandExchangeEvents.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					GrandExchangeEvents.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1771897068"
	)
	@Export("clear")
	final void clear() {
		this.field828 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lvs;ZI)Z",
		garbageValue = "1674739073"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(KeyHandler.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvs;I)Z",
		garbageValue = "2027984135"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1415095436"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					Canvas.method334("Your friend list is full. Max of 200 for free users, and 400 for members");
				} else if (KeyHandler.localPlayer.username.equals(var2)) {
					KeyHandler.method366();
				} else if (this.isFriended(var2, false)) {
					Canvas.method334(var1 + " is already on your friend list");
				} else if (this.isIgnored(var2)) {
					Canvas.method333(var1);
				} else {
					PacketBufferNode var3 = class482.getPacketBufferNode(ClientPacket.field3210, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(CollisionMap.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "728677755"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field518 != 1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-76"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					Canvas.method334("Your ignore list is full. Max of 100 for free users, and 400 for members");
				} else if (KeyHandler.localPlayer.username.equals(var2)) {
					Canvas.method334("You can't add yourself to your own ignore list");
				} else if (this.isIgnored(var2)) {
					Projectile.method2221(var1);
				} else if (this.isFriended(var2, false)) {
					class467.method8636(var1);
				} else {
					PacketBufferNode var3 = class482.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(CollisionMap.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-367407536"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field518 != 1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1920078386"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					class13.method176();
					PacketBufferNode var3 = class482.getPacketBufferNode(ClientPacket.FRIEND_DELUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(CollisionMap.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) {
					Player var4 = Client.players[Players.Players_indices[var5]];
					var4.clearIsFriend();
				}

				SecureUrlRequester.method2916();
				if (ClientPreferences.friendsChat != null) {
					ClientPreferences.friendsChat.clearFriends();
				}

			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1543576051"
	)
	@Export("removeIgnore")
	public final void removeIgnore(String var1, boolean var2) {
		if (var1 != null) {
			Username var3 = new Username(var1, this.loginType);
			if (var3.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var3)) {
					class13.method176();
					if (var2) {
						PacketBufferNode var4 = class482.getPacketBufferNode(ClientPacket.IGNORE_DELUSER, Client.packetWriter.isaacCipher);
						var4.packetBuffer.writeByte(CollisionMap.stringCp1252NullTerminatedByteSize(var1));
						var4.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var4);
					}
				}

				Varps.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lvs;I)Z",
		garbageValue = "667447544"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1017893005"
	)
	public static void method1927(int var0, int var1, int var2, int var3) {
		if (class319.musicSongs.size() > 1 && class319.musicSongs.get(0) != null && ((MusicSong)class319.musicSongs.get(0)).midiPcmStream.isReady() && class319.musicSongs.get(1) != null && ((MusicSong)class319.musicSongs.get(1)).midiPcmStream.isReady()) {
			WorldMapRectangle.method5019(var0, var1, var2, var3);
			class319.field3462.add(new SwapSongTask((SongTask)null));
			ArrayList var4 = new ArrayList();
			var4.add(new DelayFadeTask(new FadeInTask((SongTask)null, 1, false, class319.field3454), class319.field3465));
			var4.add(new DelayFadeTask(new FadeOutTask((SongTask)null, 0, false, class319.field3464), class319.musicPlayerStatus));
			class319.field3462.add(new ConcurrentMidiTask((SongTask)null, var4));
			if (class319.field3466.get(0) != null && class319.field3466.get(1) != null) {
				MusicSong var5 = (MusicSong)class319.field3466.get(0);
				class319.field3466.set(0, class319.musicSongs.get(1));
				class319.field3466.set(1, var5);
			}
		}

	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1553854475"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var3 = HttpRequestTask.getTileHeight(var0, var1, SecureUrlRequester.Client_plane) - var2;
			var0 -= GameEngine.cameraX;
			var3 -= class28.cameraY;
			var1 -= GrandExchangeOfferTotalQuantityComparator.cameraZ;
			int var4 = Rasterizer3D.Rasterizer3D_sine[UserComparator3.cameraPitch];
			int var5 = Rasterizer3D.Rasterizer3D_cosine[UserComparator3.cameraPitch];
			int var6 = Rasterizer3D.Rasterizer3D_sine[HealthBarUpdate.cameraYaw];
			int var7 = Rasterizer3D.Rasterizer3D_cosine[HealthBarUpdate.cameraYaw];
			int var8 = var6 * var1 + var0 * var7 >> 16;
			var1 = var7 * var1 - var0 * var6 >> 16;
			var0 = var8;
			var8 = var5 * var3 - var4 * var1 >> 16;
			var1 = var5 * var1 + var3 * var4 >> 16;
			if (var1 >= 50) {
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
				Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}
