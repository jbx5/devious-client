import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ny")
public class class350 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	@Export("huffman")
	static Huffman huffman;

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-857536144"
	)
	static int method6850(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (SecureRandomSSLSocket.friendSystem.field816 == 0) {
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = -2;
			} else if (SecureRandomSSLSocket.friendSystem.field816 == 1) {
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = SecureRandomSSLSocket.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
				if (SecureRandomSSLSocket.friendSystem.method1902() && var3 >= 0 && var3 < SecureRandomSSLSocket.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend) SecureRandomSSLSocket.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
				if (SecureRandomSSLSocket.friendSystem.method1902() && var3 >= 0 && var3 < SecureRandomSSLSocket.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = ((Buddy) SecureRandomSSLSocket.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
				if (SecureRandomSSLSocket.friendSystem.method1902() && var3 >= 0 && var3 < SecureRandomSSLSocket.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = ((Buddy) SecureRandomSSLSocket.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
					int var9 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					SecureRandomSSLSocket.method167(var5, var9);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
					SecureRandomSSLSocket.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
					SecureRandomSSLSocket.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
					SecureRandomSSLSocket.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
					boolean var6 = true;
					SecureRandomSSLSocket.friendSystem.removeIgnore(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
					var5 = UserComparator7.method2959(var5);
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = SecureRandomSSLSocket.friendSystem.isFriended(new Username(var5, class89.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (HttpResponse.friendsChat != null) {
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = HttpResponse.friendsChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (HttpResponse.friendsChat != null) {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = HttpResponse.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					if (HttpResponse.friendsChat != null && var3 < HttpResponse.friendsChat.getSize()) {
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = HttpResponse.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					if (HttpResponse.friendsChat != null && var3 < HttpResponse.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = ((Buddy) HttpResponse.friendsChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					if (HttpResponse.friendsChat != null && var3 < HttpResponse.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = ((Buddy) HttpResponse.friendsChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = HttpResponse.friendsChat != null ? HttpResponse.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
					InvDefinition.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = HttpResponse.friendsChat != null ? HttpResponse.friendsChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
					class138.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					WorldMapSectionType.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!SecureRandomSSLSocket.friendSystem.method1902()) {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = SecureRandomSSLSocket.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					if (SecureRandomSSLSocket.friendSystem.method1902() && var3 >= 0 && var3 < SecureRandomSSLSocket.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored) SecureRandomSSLSocket.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
					var5 = UserComparator7.method2959(var5);
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = SecureRandomSSLSocket.friendSystem.isIgnored(new Username(var5, class89.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					if (HttpResponse.friendsChat != null && var3 < HttpResponse.friendsChat.getSize() && HttpResponse.friendsChat.get(var3).getUsername().equals(class229.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (HttpResponse.friendsChat != null && HttpResponse.friendsChat.owner != null) {
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = HttpResponse.friendsChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					if (HttpResponse.friendsChat != null && var3 < HttpResponse.friendsChat.getSize() && ((ClanMate) HttpResponse.friendsChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						SecureRandomSSLSocket.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							SecureRandomSSLSocket.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							SecureRandomSSLSocket.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							SecureRandomSSLSocket.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							SecureRandomSSLSocket.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							SecureRandomSSLSocket.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							SecureRandomSSLSocket.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							SecureRandomSSLSocket.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							SecureRandomSSLSocket.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							SecureRandomSSLSocket.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							SecureRandomSSLSocket.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							SecureRandomSSLSocket.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							SecureRandomSSLSocket.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							SecureRandomSSLSocket.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							SecureRandomSSLSocket.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							SecureRandomSSLSocket.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (HttpResponse.friendsChat != null) {
								HttpResponse.friendsChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							if (HttpResponse.friendsChat != null) {
								HttpResponse.friendsChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							if (HttpResponse.friendsChat != null) {
								HttpResponse.friendsChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							if (HttpResponse.friendsChat != null) {
								HttpResponse.friendsChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							if (HttpResponse.friendsChat != null) {
								HttpResponse.friendsChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							if (HttpResponse.friendsChat != null) {
								HttpResponse.friendsChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							if (HttpResponse.friendsChat != null) {
								HttpResponse.friendsChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							if (HttpResponse.friendsChat != null) {
								HttpResponse.friendsChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							if (HttpResponse.friendsChat != null) {
								HttpResponse.friendsChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							if (HttpResponse.friendsChat != null) {
								HttpResponse.friendsChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							if (HttpResponse.friendsChat != null) {
								HttpResponse.friendsChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (HttpResponse.friendsChat != null) {
								HttpResponse.friendsChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							SecureRandomSSLSocket.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							if (HttpResponse.friendsChat != null) {
								HttpResponse.friendsChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					if (HttpResponse.friendsChat != null && var3 < HttpResponse.friendsChat.getSize() && ((ClanMate) HttpResponse.friendsChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}
}
