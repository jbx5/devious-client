import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("bi")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lpf;")
	@Export("itemContainers")
	static NodeHashTable itemContainers = new NodeHashTable(32);

	@ObfuscatedName("q")
	@Export("ids")
	int[] ids = new int[]{ -1 };

	@ObfuscatedName("f")
	@Export("quantities")
	int[] quantities = new int[]{ 0 };

	ItemContainer() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "79")
	static final int method2154(int var0, int var1) {
		int var2 = GameEngine.method563(var0 - 1, var1 - 1) + GameEngine.method563(var0 + 1, var1 - 1) + GameEngine.method563(var0 - 1, var1 + 1) + GameEngine.method563(var0 + 1, var1 + 1);
		int var3 = GameEngine.method563(var0 - 1, var1) + GameEngine.method563(1 + var0, var1) + GameEngine.method563(var0, var1 - 1) + GameEngine.method563(var0, 1 + var1);
		int var4 = GameEngine.method563(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "1156827407")
	static int method2144(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (MusicPatchPcmStream.friendSystem.field801 == 0) {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -2;
			} else if (MusicPatchPcmStream.friendSystem.field801 == 1) {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = MusicPatchPcmStream.friendSystem.friendsList.getSize();
			}
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				if (MusicPatchPcmStream.friendSystem.method1694() && var3 >= 0 && var3 < MusicPatchPcmStream.friendSystem.friendsList.getSize()) {
					Friend var8 = ((Friend) (MusicPatchPcmStream.friendSystem.friendsList.get(var3)));
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
				}
				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				if (MusicPatchPcmStream.friendSystem.method1694() && var3 >= 0 && var3 < MusicPatchPcmStream.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((Buddy) (MusicPatchPcmStream.friendSystem.friendsList.get(var3))).world;
				} else {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
				}
				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				if (MusicPatchPcmStream.friendSystem.method1694() && var3 >= 0 && var3 < MusicPatchPcmStream.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((Buddy) (MusicPatchPcmStream.friendSystem.friendsList.get(var3))).rank;
				} else {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
				}
				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
					int var6 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
					FriendSystem.method1748(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
					MusicPatchPcmStream.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
					MusicPatchPcmStream.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
					MusicPatchPcmStream.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
					MusicPatchPcmStream.friendSystem.removeIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
					var5 = class20.method293(var5);
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (MusicPatchPcmStream.friendSystem.isFriended(new Username(var5, class162.loginType), false)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class13.friendsChat != null) {
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = class13.friendsChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
					}
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class13.friendsChat != null) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class13.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
					if (class13.friendsChat != null && var3 < class13.friendsChat.getSize()) {
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = class13.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
					}
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
					if (class13.friendsChat != null && var3 < class13.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((Buddy) (class13.friendsChat.get(var3))).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
					if (class13.friendsChat != null && var3 < class13.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((Buddy) (class13.friendsChat.get(var3))).rank;
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (class13.friendsChat != null) ? class13.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
					class240.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (class13.friendsChat != null) ? class13.friendsChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
					UserComparator2.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					MouseHandler.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!MusicPatchPcmStream.friendSystem.method1694()) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = MusicPatchPcmStream.friendSystem.ignoreList.getSize();
					}
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
					if (MusicPatchPcmStream.friendSystem.method1694() && var3 >= 0 && var3 < MusicPatchPcmStream.friendSystem.ignoreList.getSize()) {
						Ignored var4 = ((Ignored) (MusicPatchPcmStream.friendSystem.ignoreList.get(var3)));
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
					}
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
					var5 = class20.method293(var5);
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (MusicPatchPcmStream.friendSystem.isIgnored(new Username(var5, class162.loginType))) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
					if (class13.friendsChat != null && var3 < class13.friendsChat.getSize() && class13.friendsChat.get(var3).getUsername().equals(class28.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (class13.friendsChat != null && class13.friendsChat.owner != null) {
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = class13.friendsChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
					}
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
					if (class13.friendsChat != null && var3 < class13.friendsChat.getSize() && ((ClanMate) (class13.friendsChat.get(var3))).isFriend()) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						MusicPatchPcmStream.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							MusicPatchPcmStream.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							MusicPatchPcmStream.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							MusicPatchPcmStream.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							MusicPatchPcmStream.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							MusicPatchPcmStream.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							MusicPatchPcmStream.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							MusicPatchPcmStream.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							MusicPatchPcmStream.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							MusicPatchPcmStream.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							MusicPatchPcmStream.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							MusicPatchPcmStream.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							MusicPatchPcmStream.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							MusicPatchPcmStream.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							MusicPatchPcmStream.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							MusicPatchPcmStream.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (class13.friendsChat != null) {
								class13.friendsChat.removeComparator();
							}
							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							if (class13.friendsChat != null) {
								class13.friendsChat.addComparator(new UserComparator1(var7));
							}
							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							if (class13.friendsChat != null) {
								class13.friendsChat.addComparator(new UserComparator2(var7));
							}
							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							if (class13.friendsChat != null) {
								class13.friendsChat.addComparator(new UserComparator3(var7));
							}
							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							if (class13.friendsChat != null) {
								class13.friendsChat.addComparator(new UserComparator4(var7));
							}
							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							if (class13.friendsChat != null) {
								class13.friendsChat.addComparator(new UserComparator5(var7));
							}
							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							if (class13.friendsChat != null) {
								class13.friendsChat.addComparator(new UserComparator6(var7));
							}
							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							if (class13.friendsChat != null) {
								class13.friendsChat.addComparator(new UserComparator7(var7));
							}
							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							if (class13.friendsChat != null) {
								class13.friendsChat.addComparator(new UserComparator8(var7));
							}
							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							if (class13.friendsChat != null) {
								class13.friendsChat.addComparator(new UserComparator9(var7));
							}
							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							if (class13.friendsChat != null) {
								class13.friendsChat.addComparator(new UserComparator10(var7));
							}
							return 1;
						} else if (var0 == 3655) {
							if (class13.friendsChat != null) {
								class13.friendsChat.sort();
							}
							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							MusicPatchPcmStream.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							if (class13.friendsChat != null) {
								class13.friendsChat.addComparator(new BuddyRankComparator(var7));
							}
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
					if (class13.friendsChat != null && var3 < class13.friendsChat.getSize() && ((ClanMate) (class13.friendsChat.get(var3))).isIgnored()) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				}
			}
		}
	}
}