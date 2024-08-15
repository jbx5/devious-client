import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cu")
public class class53 extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	class47 field342;

	public class53() {
		this.field342 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcz;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) {
			this.field342 = new class47(var1, (RawSound)null);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lbq;)V"
	)
	public class53(RawSound var1) {
		this.field342 = new class47((VorbisSample)null, var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "252726076"
	)
	public boolean method1042() {
		return this.field342 == null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lbq;",
		garbageValue = "35"
	)
	public RawSound method1040() {
		if (this.field342 != null && this.field342.field310.tryLock()) {
			RawSound var1;
			try {
				var1 = this.method1038();
			} finally {
				this.field342.field310.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lbq;",
		garbageValue = "-64951596"
	)
	public RawSound method1041() {
		if (this.field342 != null) {
			this.field342.field310.lock();

			RawSound var1;
			try {
				var1 = this.method1038();
			} finally {
				this.field342.field310.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lbq;",
		garbageValue = "-1344950932"
	)
	RawSound method1038() {
		if (this.field342.field308 == null) {
			this.field342.field308 = this.field342.field309.toRawSound((int[])null);
			this.field342.field309 = null;
		}

		return this.field342.field308;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZB)V",
		garbageValue = "0"
	)
	public static void method1051(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			class332.field3563.clear();
			class332.field3566.clear();
			class376.method7164(var5);
			if (!var5) {
				class332.field3565.clear();
			}

			Iterator var6 = var0.iterator();

			while (var6.hasNext()) {
				MusicSong var7 = (MusicSong)var6.next();
				if (var7.musicTrackGroupId != -1 && var7.musicTrackFileId != -1) {
					if (!var5) {
						class332.field3565.add(var7);
					}

					class332.field3563.add(var7);
				}
			}

			if (!class332.field3563.isEmpty()) {
				UserComparator6.method3100(var1, var2, var3, var4);
				class332.field3566.add(new AddRequestTask((SongTask)null));
				class332.field3566.add(new class447((SongTask)null, class288.field3119, class233.field2460, class332.field3572));
				ArrayList var9 = new ArrayList();
				var9.add(new class442(new FadeInTask((SongTask)null, 0, true, class332.field3567)));
				if (!class332.musicSongs.isEmpty()) {
					ArrayList var10 = new ArrayList();
					var10.add(new DelayFadeTask(new ConcurrentMidiTask((SongTask)null, var9), class332.field3570));
					ArrayList var8 = class523.method9342();
					var10.add(new DelayFadeTask(new FadeOutTask(new class440((SongTask)null, var8), 0, false, class332.field3568), class332.musicPlayerStatus));
					class332.field3566.add(new ConcurrentMidiTask((SongTask)null, var10));
				} else {
					class332.field3566.add(new DelayFadeTask((SongTask)null, class332.field3570));
					class332.field3566.add(new ConcurrentMidiTask((SongTask)null, var9));
				}

			}
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZI)I",
		garbageValue = "-1901155042"
	)
	static int method1045(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (class277.friendSystem.field826 == 0) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -2;
			} else if (class277.friendSystem.field826 == 1) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class277.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (class277.friendSystem.method1931() && var3 >= 0 && var3 < class277.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)class277.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (class277.friendSystem.method1931() && var3 >= 0 && var3 < class277.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class277.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (class277.friendSystem.method1931() && var3 >= 0 && var3 < class277.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class277.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class230.Interpreter_stringStackSize];
					int var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					UserComparator6.method3099(var5, var9);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class230.Interpreter_stringStackSize];
					class277.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class230.Interpreter_stringStackSize];
					class277.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class230.Interpreter_stringStackSize];
					class277.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class230.Interpreter_stringStackSize];
					boolean var6 = true;
					class277.friendSystem.removeIgnore(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class230.Interpreter_stringStackSize];
					var5 = class60.method1147(var5);
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class277.friendSystem.isFriended(new Username(var5, ObjectSound.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (HttpRequestTask.friendsChat != null) {
						Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = HttpRequestTask.friendsChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (HttpRequestTask.friendsChat != null) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HttpRequestTask.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (HttpRequestTask.friendsChat != null && var3 < HttpRequestTask.friendsChat.getSize()) {
						Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = HttpRequestTask.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (HttpRequestTask.friendsChat != null && var3 < HttpRequestTask.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)HttpRequestTask.friendsChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (HttpRequestTask.friendsChat != null && var3 < HttpRequestTask.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)HttpRequestTask.friendsChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HttpRequestTask.friendsChat != null ? HttpRequestTask.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class230.Interpreter_stringStackSize];
					class138.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HttpRequestTask.friendsChat != null ? HttpRequestTask.friendsChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class230.Interpreter_stringStackSize];
					UserComparator6.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					ReflectionCheck.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class277.friendSystem.method1931()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class277.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (class277.friendSystem.method1931() && var3 >= 0 && var3 < class277.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)class277.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class230.Interpreter_stringStackSize];
					var5 = class60.method1147(var5);
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class277.friendSystem.isIgnored(new Username(var5, ObjectSound.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (HttpRequestTask.friendsChat != null && var3 < HttpRequestTask.friendsChat.getSize() && HttpRequestTask.friendsChat.get(var3).getUsername().equals(class253.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (HttpRequestTask.friendsChat != null && HttpRequestTask.friendsChat.owner != null) {
						Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = HttpRequestTask.friendsChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (HttpRequestTask.friendsChat != null && var3 < HttpRequestTask.friendsChat.getSize() && ((ClanMate)HttpRequestTask.friendsChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class277.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class277.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class277.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class277.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class277.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class277.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class277.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class277.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class277.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class277.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class277.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							class277.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							class277.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class277.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class277.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							class277.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (HttpRequestTask.friendsChat != null) {
								HttpRequestTask.friendsChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (HttpRequestTask.friendsChat != null) {
								HttpRequestTask.friendsChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (HttpRequestTask.friendsChat != null) {
								HttpRequestTask.friendsChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (HttpRequestTask.friendsChat != null) {
								HttpRequestTask.friendsChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (HttpRequestTask.friendsChat != null) {
								HttpRequestTask.friendsChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (HttpRequestTask.friendsChat != null) {
								HttpRequestTask.friendsChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (HttpRequestTask.friendsChat != null) {
								HttpRequestTask.friendsChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (HttpRequestTask.friendsChat != null) {
								HttpRequestTask.friendsChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (HttpRequestTask.friendsChat != null) {
								HttpRequestTask.friendsChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (HttpRequestTask.friendsChat != null) {
								HttpRequestTask.friendsChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (HttpRequestTask.friendsChat != null) {
								HttpRequestTask.friendsChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (HttpRequestTask.friendsChat != null) {
								HttpRequestTask.friendsChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class277.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (HttpRequestTask.friendsChat != null) {
								HttpRequestTask.friendsChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (HttpRequestTask.friendsChat != null && var3 < HttpRequestTask.friendsChat.getSize() && ((ClanMate)HttpRequestTask.friendsChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1335491606"
	)
	static boolean method1050(int var0) {
		for (int var1 = 0; var1 < Client.field736; ++var1) {
			if (Client.field651[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
