import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1036601557
	)
	int field837;

	@ObfuscatedSignature(
		descriptor = "(Ltr;)V"
	)
	FriendSystem(LoginType var1) {
		this.field837 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1854467383"
	)
	boolean method1904() {
		return this.field837 == 2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	final void method1849() {
		this.field837 = 1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "-1820828369"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field837 = 2;

		for (int var3 = 0; var3 < Players.Players_count; ++var3) {
			Player var4 = Client.players[Players.Players_indices[var3]];
			var4.clearIsFriend();
		}

		Iterator var5 = Messages.Messages_hashTable.iterator();

		while (var5.hasNext()) {
			Message var6 = (Message)var5.next();
			var6.clearIsFromFriend();
		}

		if (class143.friendsChat != null) {
			class143.friendsChat.clearFriends();
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field4787 < VerticalAlignment.method3924() / 1000L - 5L) {
				if (var1.world > 0) {
					SecureRandomCallable.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					SecureRandomCallable.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1563117344"
	)
	@Export("clear")
	final void clear() {
		this.field837 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvx;ZI)Z",
		garbageValue = "-626395081"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(class133.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvx;S)Z",
		garbageValue = "2048"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2076717120"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					AbstractWorldMapIcon.method5748();
				} else if (class133.localPlayer.username.equals(var2)) {
					SequenceDefinition.method4270();
				} else if (this.isFriended(var2, false)) {
					class6.method40(var1 + " is already on your friend list");
				} else if (this.isIgnored(var2)) {
					Client.method1791(var1);
				} else {
					PacketBufferNode var3 = FadeInTask.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(SequenceDefinition.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1411136213"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field783 != 1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1957948062"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					class6.method40("Your ignore list is full. Max of 100 for free users, and 400 for members");
				} else if (class133.localPlayer.username.equals(var2)) {
					Projectile.method2177();
				} else if (this.isIgnored(var2)) {
					class6.method40(var1 + " is already on your ignore list");
				} else if (this.isFriended(var2, false)) {
					class6.method40("Please remove " + var1 + " from your friend list first");
				} else {
					PacketBufferNode var3 = FadeInTask.getPacketBufferNode(ClientPacket.field3210, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(SequenceDefinition.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "65"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field783 != 1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2102552250"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Client.field716 = Client.cycleCntr;
					PacketBufferNode var3 = FadeInTask.getPacketBufferNode(ClientPacket.FRIEND_DELUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(SequenceDefinition.stringCp1252NullTerminatedByteSize(var1));
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

				if (class143.friendsChat != null) {
					class143.friendsChat.clearFriends();
				}

			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "-64"
	)
	@Export("removeIgnore")
	public final void removeIgnore(String var1, boolean var2) {
		if (var1 != null) {
			Username var3 = new Username(var1, this.loginType);
			if (var3.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var3)) {
					Client.field716 = Client.cycleCntr;
					if (var2) {
						PacketBufferNode var4 = FadeInTask.getPacketBufferNode(ClientPacket.IGNORE_DELUSER, Client.packetWriter.isaacCipher);
						var4.packetBuffer.writeByte(SequenceDefinition.stringCp1252NullTerminatedByteSize(var1));
						var4.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var4);
					}
				}

				ClientPacket.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lvx;I)Z",
		garbageValue = "-458167689"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lur;IIIIIIB)V",
		garbageValue = "4"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = var1 >= 0 && var1 < 4 && var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104;
		int var8;
		if (var7) {
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0;

			while (true) {
				var8 = var0.readUnsignedShort();
				if (var8 == 0) {
					if (var1 == 0) {
						int[] var15 = Tiles.Tiles_heights[0][var2];
						int var12 = var4 + 932731;
						int var13 = var5 + 556238;
						int var14 = InvDefinition.method3695(var12 + 45365, 91923 + var13, 4) - 128 + (InvDefinition.method3695(10294 + var12, var13 + 37821, 2) - 128 >> 1) + (InvDefinition.method3695(var12, var13, 1) - 128 >> 2);
						var14 = (int)((double)var14 * 0.3D) + 35;
						if (var14 < 10) {
							var14 = 10;
						} else if (var14 > 60) {
							var14 = 60;
						}

						var15[var3] = -var14 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
					}
					break;
				}

				if (var8 == 1) {
					int var9 = var0.readUnsignedByte();
					if (var9 == 1) {
						var9 = 0;
					}

					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -var9 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var9 * 8;
					}
					break;
				}

				if (var8 <= 49) {
					AccessFile.Tiles_overlays[var1][var2][var3] = (short)var0.readShort();
					Tiles.Tiles_shapes[var1][var2][var3] = (byte)((var8 - 2) / 4);
					Tiles.field1028[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3);
				} else if (var8 <= 81) {
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var8 - 49);
				} else {
					Tiles.Tiles_underlays[var1][var2][var3] = (short)(var8 - 81);
				}
			}
		} else {
			while (true) {
				var8 = var0.readUnsignedShort();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					var0.readUnsignedByte();
					break;
				}

				if (var8 <= 49) {
					var0.readShort();
				}
			}
		}

	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIB)V",
		garbageValue = "56"
	)
	static void method1892(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) {
			int var5 = (Integer)var0.get(0);
			if (var5 == -1 && !Client.playingJingle) {
				class11.method108(0, 0);
			} else if (var5 != -1) {
				boolean var6;
				if (class321.field3496.isEmpty()) {
					var6 = false;
				} else {
					MusicSong var7 = (MusicSong)class321.field3496.get(0);
					var6 = var7 != null && var5 == var7.musicTrackGroupId;
				}

				if (!var6 && NPC.clientPreferences.getMusicVolume() != 0) {
					ArrayList var9 = new ArrayList();

					for (int var8 = 0; var8 < var0.size(); ++var8) {
						var9.add(new MusicSong(UserComparator6.archive6, (Integer)var0.get(var8), 0, NPC.clientPreferences.getMusicVolume(), false));
					}

					if (Client.playingJingle) {
						HealthBar.method2572(var9, var1, var2, var3, var4);
					} else {
						Renderable.method4881(var9, var1, var2, var3, var4, false);
					}
				}
			}

		}
	}
}
