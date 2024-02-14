import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -883395869
	)
	static int field859;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = 1321952883
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lrn;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -216489171
	)
	int field857;

	@ObfuscatedSignature(
		descriptor = "(Lte;)V"
	)
	FriendSystem(LoginType var1) {
		this.field857 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-152880935"
	)
	boolean method1942() {
		return this.field857 == 2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-240124587"
	)
	final void method1874() {
		this.field857 = 1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "-1330528881"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field857 = 2;

		for (int var3 = 0; var3 < Players.Players_count; ++var3) {
			Player var4 = Client.players[Players.Players_indices[var3]];
			var4.clearIsFriend();
		}

		PendingSpawn.method2454();
		if (Projectile.friendsChat != null) {
			Projectile.friendsChat.clearFriends();
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-417770306"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field4751 < SecureRandomCallable.method2320() / 1000L - 5L) {
				if (var1.world > 0) {
					class209.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					class209.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("clear")
	final void clear() {
		this.field857 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lvn;ZB)Z",
		garbageValue = "14"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(VarpDefinition.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lvn;I)Z",
		garbageValue = "-133614505"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1586069873"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					class59.method1137();
				} else if (VarpDefinition.localPlayer.username.equals(var2)) {
					SecureRandomCallable.method2319("You can't add yourself to your own friend list");
				} else if (this.isFriended(var2, false)) {
					class30.method416(var1);
				} else if (this.isIgnored(var2)) {
					class388.method7344(var1);
				} else {
					IgnoreList.method8240(var1);
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1536951971"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field653 != 1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "37"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					SecureRandomCallable.method2319("Your ignore list is full. Max of 100 for free users, and 400 for members");
				} else if (VarpDefinition.localPlayer.username.equals(var2)) {
					NPC.method2711();
				} else if (this.isIgnored(var2)) {
					class368.method7011(var1);
				} else if (this.isFriended(var2, false)) {
					class53.method1064(var1);
				} else {
					HitSplatDefinition.method3917(var1);
				}
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1866014959"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field653 != 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1642083231"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Client.field732 = Client.cycleCntr;
					PacketBufferNode var3 = ViewportMouse.getPacketBufferNode(ClientPacket.field3263, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class145.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) {
					Player var4 = Client.players[Players.Players_indices[var5]];
					var4.clearIsFriend();
				}

				PendingSpawn.method2454();
				if (Projectile.friendsChat != null) {
					Projectile.friendsChat.clearFriends();
				}

			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-805764742"
	)
	@Export("removeIgnore")
	public final void removeIgnore(String var1, boolean var2) {
		if (var1 != null) {
			Username var3 = new Username(var1, this.loginType);
			if (var3.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var3)) {
					Client.field732 = Client.cycleCntr;
					if (var2) {
						PacketBufferNode var4 = ViewportMouse.getPacketBufferNode(ClientPacket.field3261, Client.packetWriter.isaacCipher);
						var4.packetBuffer.writeByte(class145.stringCp1252NullTerminatedByteSize(var1));
						var4.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var4);
					}
				}

				class224.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvn;I)Z",
		garbageValue = "-1082572779"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1627467272"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		LoginState.method1206();

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var1.obj != null) {
				var1.set();
			}
		}

		int var3 = class148.VarpDefinition_get(var0).type;
		if (var3 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var3 == 1) {
				if (var2 == 1) {
					HttpRequestTask.method260(0.9D);
				}

				if (var2 == 2) {
					HttpRequestTask.method260(0.8D);
				}

				if (var2 == 3) {
					HttpRequestTask.method260(0.7D);
				}

				if (var2 == 4) {
					HttpRequestTask.method260(0.6D);
				}
			}

			if (var3 == 3) {
				if (var2 == 0) {
					SpriteMask.setMusicVolume(255);
				}

				if (var2 == 1) {
					SpriteMask.setMusicVolume(192);
				}

				if (var2 == 2) {
					SpriteMask.setMusicVolume(128);
				}

				if (var2 == 3) {
					SpriteMask.setMusicVolume(64);
				}

				if (var2 == 4) {
					SpriteMask.setMusicVolume(0);
				}
			}

			if (var3 == 4) {
				if (var2 == 0) {
					SoundCache.method831(127);
				}

				if (var2 == 1) {
					SoundCache.method831(96);
				}

				if (var2 == 2) {
					SoundCache.method831(64);
				}

				if (var2 == 3) {
					SoundCache.method831(32);
				}

				if (var2 == 4) {
					SoundCache.method831(0);
				}
			}

			if (var3 == 5) {
				Client.leftClickOpensMenu = var2 == 1;
			}

			if (var3 == 6) {
				Client.chatEffects = var2;
			}

			if (var3 == 9) {
			}

			if (var3 == 10) {
				if (var2 == 0) {
					class222.method4344(127);
				}

				if (var2 == 1) {
					class222.method4344(96);
				}

				if (var2 == 2) {
					class222.method4344(64);
				}

				if (var2 == 3) {
					class222.method4344(32);
				}

				if (var2 == 4) {
					class222.method4344(0);
				}
			}

			if (var3 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var3 == 18) {
				Client.playerAttackOption = (AttackOption)class356.findEnumerated(UserComparator7.method2951(), var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var3 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var3 == 22) {
				Client.npcAttackOption = (AttackOption)class356.findEnumerated(UserComparator7.method2951(), var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
