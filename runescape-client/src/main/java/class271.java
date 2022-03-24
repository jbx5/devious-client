

import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
public class class271 {
	@ObfuscatedName("v")
	static int[] field3160;
	static 
	{
		new Object();
		field3160 = new int[33];
		field3160[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3160[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Llq;Ljava/lang/String;Ljava/lang/String;I)[Lqx;", garbageValue = 
	"925731085")

	public static IndexedSprite[] method5255(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		return WallDecoration.method4516(var0, var3, var4);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"-1269940605")

	static int method5256(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (class155.friendSystem.field801 == 0) {
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -2;
			} else if (class155.friendSystem.field801 == 1) {
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class155.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				if ((class155.friendSystem.method1657() && (var3 >= 0)) && (var3 < class155.friendSystem.friendsList.getSize())) {
					Friend var8 = ((Friend) (class155.friendSystem.friendsList.get(var3)));
					Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
					Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				if ((class155.friendSystem.method1657() && (var3 >= 0)) && (var3 < class155.friendSystem.friendsList.getSize())) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = ((Buddy) (class155.friendSystem.friendsList.get(var3))).world;
				} else {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				if ((class155.friendSystem.method1657() && (var3 >= 0)) && (var3 < class155.friendSystem.friendsList.getSize())) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = ((Buddy) (class155.friendSystem.friendsList.get(var3))).rank;
				} else {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
					int var6 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					DynamicObject.method1985(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
					class155.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
					class155.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
					class155.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
					class155.friendSystem.removeIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
					var5 = ObjectSound.method1734(var5);
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (class155.friendSystem.isFriended(new Username(var5, class83.loginType), false)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class230.friendsChat != null) {
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = class230.friendsChat.name;
					} else {
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class230.friendsChat != null) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class230.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					if ((class230.friendsChat != null) && (var3 < class230.friendsChat.getSize())) {
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = class230.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					if ((class230.friendsChat != null) && (var3 < class230.friendsChat.getSize())) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = ((Buddy) (class230.friendsChat.get(var3))).getWorld();
					} else {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					if ((class230.friendsChat != null) && (var3 < class230.friendsChat.getSize())) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = ((Buddy) (class230.friendsChat.get(var3))).rank;
					} else {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (class230.friendsChat != null) ? class230.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
					class10.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (class230.friendsChat != null) ? (class230.friendsChat.rank * 1904728549) * (-272778259) : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
					class16.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					Message.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class155.friendSystem.method1657()) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class155.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					if ((class155.friendSystem.method1657() && (var3 >= 0)) && (var3 < class155.friendSystem.ignoreList.getSize())) {
						Ignored var4 = ((Ignored) (class155.friendSystem.ignoreList.get(var3)));
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
					var5 = ObjectSound.method1734(var5);
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (class155.friendSystem.isIgnored(new Username(var5, class83.loginType))) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					if (((class230.friendsChat != null) && (var3 < class230.friendsChat.getSize())) && class230.friendsChat.get(var3).getUsername().equals(class19.localPlayer.username)) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if ((class230.friendsChat != null) && (class230.friendsChat.owner != null)) {
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = class230.friendsChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					if (((class230.friendsChat != null) && (var3 < class230.friendsChat.getSize())) && ((ClanMate) (class230.friendsChat.get(var3))).isFriend()) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class155.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							class155.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							class155.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							class155.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							class155.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							class155.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							class155.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							class155.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							class155.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							class155.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							class155.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							class155.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							class155.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							class155.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							class155.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							class155.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (class230.friendsChat != null) {
								class230.friendsChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							if (class230.friendsChat != null) {
								class230.friendsChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							if (class230.friendsChat != null) {
								class230.friendsChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							if (class230.friendsChat != null) {
								class230.friendsChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							if (class230.friendsChat != null) {
								class230.friendsChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							if (class230.friendsChat != null) {
								class230.friendsChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							if (class230.friendsChat != null) {
								class230.friendsChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							if (class230.friendsChat != null) {
								class230.friendsChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							if (class230.friendsChat != null) {
								class230.friendsChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							if (class230.friendsChat != null) {
								class230.friendsChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							if (class230.friendsChat != null) {
								class230.friendsChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (class230.friendsChat != null) {
								class230.friendsChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							class155.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							if (class230.friendsChat != null) {
								class230.friendsChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					if (((class230.friendsChat != null) && (var3 < class230.friendsChat.getSize())) && ((ClanMate) (class230.friendsChat.get(var3))).isIgnored()) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
					}

					return 1;
				}
			}
		}
	}
}