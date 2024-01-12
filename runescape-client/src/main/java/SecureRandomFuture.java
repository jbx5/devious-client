import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ca")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("am")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("ap")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor();
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "83199324"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1515985736"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "2034582915"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get();
		} catch (Exception var4) {
			SecureRandom var3 = new SecureRandom();
			var3.nextInt();
			return var3;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Llr;",
		garbageValue = "84"
	)
	public static PacketBufferNode method2234() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Low;II)V",
		garbageValue = "-1283853833"
	)
	static void method2235(AbstractArchive var0, int var1) {
		if ((var1 & class526.field5163.rsOrdinal()) != 0) {
			GrandExchangeEvents.logoSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", "");
		} else if ((var1 & class526.field5164.rsOrdinal()) != 0) {
			GrandExchangeEvents.logoSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", "");
		} else if ((var1 & class526.field5142.rsOrdinal()) != 0) {
			GrandExchangeEvents.logoSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var0, "logo_speedrunning", "");
		} else {
			GrandExchangeEvents.logoSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var0, "logo", "");
		}

	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-1830795903"
	)
	static int method2233(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (class332.friendSystem.field828 == 0) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -2;
			} else if (class332.friendSystem.field828 == 1) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class332.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
				if (class332.friendSystem.method1900() && var3 >= 0 && var3 < class332.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)class332.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
				if (class332.friendSystem.method1900() && var3 >= 0 && var3 < class332.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = ((Buddy)class332.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
				if (class332.friendSystem.method1900() && var3 >= 0 && var3 < class332.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = ((Buddy)class332.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
					int var9 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					class353.method6914(var5, var9);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
					class332.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
					class332.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
					class332.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
					boolean var6 = true;
					class332.friendSystem.removeIgnore(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
					var5 = class332.method6310(var5);
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class332.friendSystem.isFriended(new Username(var5, UserComparator10.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (ClientPreferences.friendsChat != null) {
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ClientPreferences.friendsChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (ClientPreferences.friendsChat != null) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = ClientPreferences.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					if (ClientPreferences.friendsChat != null && var3 < ClientPreferences.friendsChat.getSize()) {
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ClientPreferences.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					if (ClientPreferences.friendsChat != null && var3 < ClientPreferences.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = ((Buddy)ClientPreferences.friendsChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					if (ClientPreferences.friendsChat != null && var3 < ClientPreferences.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = ((Buddy)ClientPreferences.friendsChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = ClientPreferences.friendsChat != null ? ClientPreferences.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
					class165.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = ClientPreferences.friendsChat != null ? ClientPreferences.friendsChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
					HttpMethod.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					Client.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class332.friendSystem.method1900()) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class332.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					if (class332.friendSystem.method1900() && var3 >= 0 && var3 < class332.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)class332.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
					var5 = class332.method6310(var5);
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class332.friendSystem.isIgnored(new Username(var5, UserComparator10.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					if (ClientPreferences.friendsChat != null && var3 < ClientPreferences.friendsChat.getSize() && ClientPreferences.friendsChat.get(var3).getUsername().equals(KeyHandler.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (ClientPreferences.friendsChat != null && ClientPreferences.friendsChat.owner != null) {
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ClientPreferences.friendsChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					if (ClientPreferences.friendsChat != null && var3 < ClientPreferences.friendsChat.getSize() && ((ClanMate)ClientPreferences.friendsChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class332.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							class332.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							class332.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							class332.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							class332.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							class332.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							class332.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							class332.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							class332.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							class332.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							class332.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							class332.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							class332.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							class332.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							class332.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							class332.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (ClientPreferences.friendsChat != null) {
								ClientPreferences.friendsChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							if (ClientPreferences.friendsChat != null) {
								ClientPreferences.friendsChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							if (ClientPreferences.friendsChat != null) {
								ClientPreferences.friendsChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							if (ClientPreferences.friendsChat != null) {
								ClientPreferences.friendsChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							if (ClientPreferences.friendsChat != null) {
								ClientPreferences.friendsChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							if (ClientPreferences.friendsChat != null) {
								ClientPreferences.friendsChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							if (ClientPreferences.friendsChat != null) {
								ClientPreferences.friendsChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							if (ClientPreferences.friendsChat != null) {
								ClientPreferences.friendsChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							if (ClientPreferences.friendsChat != null) {
								ClientPreferences.friendsChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							if (ClientPreferences.friendsChat != null) {
								ClientPreferences.friendsChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							if (ClientPreferences.friendsChat != null) {
								ClientPreferences.friendsChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (ClientPreferences.friendsChat != null) {
								ClientPreferences.friendsChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							class332.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							if (ClientPreferences.friendsChat != null) {
								ClientPreferences.friendsChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					if (ClientPreferences.friendsChat != null && var3 < ClientPreferences.friendsChat.getSize() && ((ClanMate)ClientPreferences.friendsChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}
}
