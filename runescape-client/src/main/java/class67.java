import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.math.BigInteger;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("bh")
public class class67 {
	@ObfuscatedName("s")
	static final BigInteger field865 = new BigInteger("10001", 16);

	@ObfuscatedName("h")
	static final BigInteger field863 = new BigInteger("824f2de2a0dd6d85b44b801f7518e6cef7eacec0a14284cbab75c2ac2cf34d2c942efb3604fea616fbf370136562a38ede7136a51e37889c49ab1883910b0296731625bb64164f6f0caf48dc72e22612513ad3576daae73c5c9a1b27d7cbffd7ad60f1de62d8526ce9d17a33ec709e3d620b704d37806701c88b1ddd5057dd5f", 16);

	@ObfuscatedName("nx")
	@ObfuscatedGetter(intValue = 1422794341)
	@Export("selectedItemSlot")
	static int selectedItemSlot;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)[Ljq;", garbageValue = "92901003")
	public static class263[] method1861() {
		return new class263[]{ class263.field3032, class263.field3029, class263.field3028, class263.field3027, class263.field3030, class263.field3031, class263.field3026, class263.field3033, class263.field3034, class263.field3036 };
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = "(ILbz;ZI)I", garbageValue = "-1729072365")
	static int method1862(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (class321.friendSystem.field794 == 0) {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -2;
			} else if (class321.friendSystem.field794 == 1) {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class321.friendSystem.friendsList.getSize();
			}
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				if (class321.friendSystem.method1627() && var3 >= 0 && var3 < class321.friendSystem.friendsList.getSize()) {
					Friend var8 = ((Friend) (class321.friendSystem.friendsList.get(var3)));
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
				}
				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				if (class321.friendSystem.method1627() && var3 >= 0 && var3 < class321.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = ((Buddy) (class321.friendSystem.friendsList.get(var3))).world;
				} else {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
				}
				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				if (class321.friendSystem.method1627() && var3 >= 0 && var3 < class321.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = ((Buddy) (class321.friendSystem.friendsList.get(var3))).rank;
				} else {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
				}
				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
					int var6 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					JagexCache.method3205(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
					class321.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
					class321.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
					class321.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
					class321.friendSystem.removeIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
					var5 = WorldMapSection0.method4870(var5);
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (class321.friendSystem.isFriended(new Username(var5, StructComposition.loginType), false)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class19.friendsChat != null) {
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = class19.friendsChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
					}
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class19.friendsChat != null) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class19.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					if (class19.friendsChat != null && var3 < class19.friendsChat.getSize()) {
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = class19.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
					}
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					if (class19.friendsChat != null && var3 < class19.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = ((Buddy) (class19.friendsChat.get(var3))).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					if (class19.friendsChat != null && var3 < class19.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = ((Buddy) (class19.friendsChat.get(var3))).rank;
					} else {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (class19.friendsChat != null) ? class19.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
					DynamicObject.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (class19.friendsChat != null) ? class19.friendsChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
					Login.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class114.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class321.friendSystem.method1627()) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class321.friendSystem.ignoreList.getSize();
					}
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					if (class321.friendSystem.method1627() && var3 >= 0 && var3 < class321.friendSystem.ignoreList.getSize()) {
						Ignored var4 = ((Ignored) (class321.friendSystem.ignoreList.get(var3)));
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
					}
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
					var5 = WorldMapSection0.method4870(var5);
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (class321.friendSystem.isIgnored(new Username(var5, StructComposition.loginType))) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					if (class19.friendsChat != null && var3 < class19.friendsChat.getSize() && class19.friendsChat.get(var3).getUsername().equals(ScriptFrame.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (class19.friendsChat != null && class19.friendsChat.owner != null) {
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = class19.friendsChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
					}
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					if (class19.friendsChat != null && var3 < class19.friendsChat.getSize() && ((ClanMate) (class19.friendsChat.get(var3))).isFriend()) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class321.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							class321.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							class321.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							class321.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							class321.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							class321.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							class321.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							class321.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							class321.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							class321.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							class321.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							class321.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							class321.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							class321.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							class321.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							class321.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (class19.friendsChat != null) {
								class19.friendsChat.removeComparator();
							}
							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							if (class19.friendsChat != null) {
								class19.friendsChat.addComparator(new UserComparator1(var7));
							}
							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							if (class19.friendsChat != null) {
								class19.friendsChat.addComparator(new UserComparator2(var7));
							}
							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							if (class19.friendsChat != null) {
								class19.friendsChat.addComparator(new UserComparator3(var7));
							}
							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							if (class19.friendsChat != null) {
								class19.friendsChat.addComparator(new UserComparator4(var7));
							}
							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							if (class19.friendsChat != null) {
								class19.friendsChat.addComparator(new UserComparator5(var7));
							}
							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							if (class19.friendsChat != null) {
								class19.friendsChat.addComparator(new UserComparator6(var7));
							}
							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							if (class19.friendsChat != null) {
								class19.friendsChat.addComparator(new UserComparator7(var7));
							}
							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							if (class19.friendsChat != null) {
								class19.friendsChat.addComparator(new UserComparator8(var7));
							}
							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							if (class19.friendsChat != null) {
								class19.friendsChat.addComparator(new UserComparator9(var7));
							}
							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							if (class19.friendsChat != null) {
								class19.friendsChat.addComparator(new UserComparator10(var7));
							}
							return 1;
						} else if (var0 == 3655) {
							if (class19.friendsChat != null) {
								class19.friendsChat.sort();
							}
							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							class321.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							if (class19.friendsChat != null) {
								class19.friendsChat.addComparator(new BuddyRankComparator(var7));
							}
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					if (class19.friendsChat != null && var3 < class19.friendsChat.getSize() && ((ClanMate) (class19.friendsChat.get(var3))).isIgnored()) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				}
			}
		}
	}
}