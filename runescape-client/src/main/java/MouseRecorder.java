import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dg")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("ak")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("al")
	@Export("lock")
	Object lock;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1511893417
	)
	@Export("index")
	int index;
	@ObfuscatedName("az")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("af")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("aa")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; class484.method8889(50L)) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IS)Lfz;",
		garbageValue = "1475"
	)
	static class135 method2334(int var0) {
		class135[] var1 = new class135[]{class135.field1620, class135.field1631, class135.field1618, class135.field1619, class135.field1633, class135.field1621, class135.field1622, class135.field1628, class135.field1624, class135.field1625, class135.field1617, class135.field1626, class135.field1616, class135.field1635, class135.field1630, class135.field1623, class135.field1632};
		class135 var2 = (class135)MenuAction.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class135.field1620;
		}

		return var2;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-1393191509"
	)
	static int method2335(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (class33.friendSystem.field854 == 0) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -2;
			} else if (class33.friendSystem.field854 == 1) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class33.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				if (class33.friendSystem.method1887() && var3 >= 0 && var3 < class33.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)class33.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				if (class33.friendSystem.method1887() && var3 >= 0 && var3 < class33.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = ((Buddy)class33.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				if (class33.friendSystem.method1887() && var3 >= 0 && var3 < class33.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = ((Buddy)class33.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
					int var9 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					FloorOverlayDefinition.method4311(var5, var9);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
					class33.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
					class33.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
					class33.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
					boolean var6 = true;
					class33.friendSystem.removeIgnore(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
					var5 = class154.method3293(var5);
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class33.friendSystem.isFriended(new Username(var5, class236.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class108.friendsChat != null) {
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = class108.friendsChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class108.friendsChat != null) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class108.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					if (class108.friendsChat != null && var3 < class108.friendsChat.getSize()) {
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = class108.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					if (class108.friendsChat != null && var3 < class108.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = ((Buddy)class108.friendsChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					if (class108.friendsChat != null && var3 < class108.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = ((Buddy)class108.friendsChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class108.friendsChat != null ? class108.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
					class53.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class108.friendsChat != null ? class108.friendsChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
					class193.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class150.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class33.friendSystem.method1887()) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class33.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					if (class33.friendSystem.method1887() && var3 >= 0 && var3 < class33.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)class33.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
					var5 = class154.method3293(var5);
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class33.friendSystem.isIgnored(new Username(var5, class236.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					if (class108.friendsChat != null && var3 < class108.friendsChat.getSize() && class108.friendsChat.get(var3).getUsername().equals(class17.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (class108.friendsChat != null && class108.friendsChat.owner != null) {
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = class108.friendsChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					if (class108.friendsChat != null && var3 < class108.friendsChat.getSize() && ((ClanMate)class108.friendsChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class33.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							class33.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							class33.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							class33.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							class33.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							class33.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							class33.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							class33.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							class33.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							class33.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							class33.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							class33.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							class33.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							class33.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							class33.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							class33.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (class108.friendsChat != null) {
								class108.friendsChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							if (class108.friendsChat != null) {
								class108.friendsChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							if (class108.friendsChat != null) {
								class108.friendsChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							if (class108.friendsChat != null) {
								class108.friendsChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							if (class108.friendsChat != null) {
								class108.friendsChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							if (class108.friendsChat != null) {
								class108.friendsChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							if (class108.friendsChat != null) {
								class108.friendsChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							if (class108.friendsChat != null) {
								class108.friendsChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							if (class108.friendsChat != null) {
								class108.friendsChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							if (class108.friendsChat != null) {
								class108.friendsChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							if (class108.friendsChat != null) {
								class108.friendsChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (class108.friendsChat != null) {
								class108.friendsChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							class33.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							if (class108.friendsChat != null) {
								class108.friendsChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					if (class108.friendsChat != null && var3 < class108.friendsChat.getSize() && ((ClanMate)class108.friendsChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "(Lua;B)V",
		garbageValue = "7"
	)
	static void method2331(Buffer var0) {
		if (Client.randomDatData != null) {
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var1 = class59.randomDatData2();
			var0.writeBytes(var1, 0, var1.length);
		}
	}
}
