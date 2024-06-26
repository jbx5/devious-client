import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ox")
public enum class380 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4435(0),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4436(1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4437(2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4438(3);

	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2138893877
	)
	public final int field4439;

	class380(int var3) {
		this.field4439 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4439;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-95"
	)
	public static void method7094() {
		synchronized(ArchiveDiskActionHandler.field4472) {
			if (ArchiveDiskActionHandler.field4468 != 0) {
				ArchiveDiskActionHandler.field4468 = 1;
				ArchiveDiskActionHandler.field4470 = true;

				try {
					ArchiveDiskActionHandler.field4472.wait();
				} catch (InterruptedException var3) {
				}
			}

		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(BB)C",
		garbageValue = "1"
	)
	public static char method7096(byte var0) {
		int var1 = var0 & 255;
		if (var1 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(var1, 16));
		} else {
			if (var1 >= 128 && var1 < 160) {
				char var2 = class413.cp1252AsciiExtension[var1 - 128];
				if (var2 == 0) {
					var2 = '?';
				}

				var1 = var2;
			}

			return (char)var1;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "2123126465"
	)
	static int method7097(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (class135.friendSystem.field835 == 0) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -2;
			} else if (class135.friendSystem.field835 == 1) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class135.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				if (class135.friendSystem.method1911() && var3 >= 0 && var3 < class135.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)class135.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				if (class135.friendSystem.method1911() && var3 >= 0 && var3 < class135.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = ((Buddy)class135.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				if (class135.friendSystem.method1911() && var3 >= 0 && var3 < class135.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = ((Buddy)class135.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
					int var9 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					IndexCheck.method4409(var5, var9);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
					class135.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
					class135.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
					class135.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
					boolean var6 = true;
					class135.friendSystem.removeIgnore(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
					var5 = FontName.method9219(var5);
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class135.friendSystem.isFriended(new Username(var5, Projectile.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (Decimator.friendsChat != null) {
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = Decimator.friendsChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (Decimator.friendsChat != null) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Decimator.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					if (Decimator.friendsChat != null && var3 < Decimator.friendsChat.getSize()) {
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = Decimator.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					if (Decimator.friendsChat != null && var3 < Decimator.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = ((Buddy)Decimator.friendsChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					if (Decimator.friendsChat != null && var3 < Decimator.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = ((Buddy)Decimator.friendsChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Decimator.friendsChat != null ? Decimator.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
					Messages.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Decimator.friendsChat != null ? Decimator.friendsChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
					class441.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					Messages.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class135.friendSystem.method1911()) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class135.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					if (class135.friendSystem.method1911() && var3 >= 0 && var3 < class135.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)class135.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
					var5 = FontName.method9219(var5);
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class135.friendSystem.isIgnored(new Username(var5, Projectile.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					if (Decimator.friendsChat != null && var3 < Decimator.friendsChat.getSize() && Decimator.friendsChat.get(var3).getUsername().equals(SoundCache.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (Decimator.friendsChat != null && Decimator.friendsChat.owner != null) {
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = Decimator.friendsChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					if (Decimator.friendsChat != null && var3 < Decimator.friendsChat.getSize() && ((ClanMate)Decimator.friendsChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class135.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							class135.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							class135.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							class135.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							class135.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							class135.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							class135.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							class135.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							class135.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							class135.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							class135.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							class135.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							class135.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							class135.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							class135.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							class135.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (Decimator.friendsChat != null) {
								Decimator.friendsChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							if (Decimator.friendsChat != null) {
								Decimator.friendsChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							if (Decimator.friendsChat != null) {
								Decimator.friendsChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							if (Decimator.friendsChat != null) {
								Decimator.friendsChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							if (Decimator.friendsChat != null) {
								Decimator.friendsChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							if (Decimator.friendsChat != null) {
								Decimator.friendsChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							if (Decimator.friendsChat != null) {
								Decimator.friendsChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							if (Decimator.friendsChat != null) {
								Decimator.friendsChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							if (Decimator.friendsChat != null) {
								Decimator.friendsChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							if (Decimator.friendsChat != null) {
								Decimator.friendsChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							if (Decimator.friendsChat != null) {
								Decimator.friendsChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (Decimator.friendsChat != null) {
								Decimator.friendsChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							class135.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							if (Decimator.friendsChat != null) {
								Decimator.friendsChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					if (Decimator.friendsChat != null && var3 < Decimator.friendsChat.getSize() && ((ClanMate)Decimator.friendsChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}
}
