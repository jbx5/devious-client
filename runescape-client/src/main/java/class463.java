import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("rm")
public class class463 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	public static final class463 field4960;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	static final class463 field4957;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -653504303
	)
	final int field4959;

	static {
		field4960 = new class463(1);
		field4957 = new class463(0);
	}

	class463(int var1) {
		this.field4959 = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ldn;[BIIIIIIIIII)V",
		garbageValue = "728392059"
	)
	static final void method8879(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		CollisionMap[] var11 = var0.collisionMaps;
		int var13;
		if (var11 != null) {
			for (int var12 = 0; var12 < 8; ++var12) {
				for (var13 = 0; var13 < 8; ++var13) {
					if (var3 + var12 > 0 && var3 + var12 < var11[var2].flags.length && var13 + var4 > 0 && var13 + var4 < var11[var2].flags[var3 + var12].length) {
						int[] var10000 = var11[var2].flags[var3 + var12];
						var10000[var13 + var4] &= -1073741825;
					}
				}
			}
		}

		Buffer var25 = new Buffer(var1);

		for (var13 = 0; var13 < 4; ++var13) {
			for (int var14 = 0; var14 < 64; ++var14) {
				for (int var15 = 0; var15 < 64; ++var15) {
					if (var5 == var13 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) {
						int var18 = var14 & 7;
						int var19 = var15 & 7;
						int var20 = var8 & 3;
						int var17;
						if (var20 == 0) {
							var17 = var18;
						} else if (var20 == 1) {
							var17 = var19;
						} else if (var20 == 2) {
							var17 = 7 - var18;
						} else {
							var17 = 7 - var19;
						}

						int var21 = var17 + var3;
						int var22 = var4 + FloorUnderlayDefinition.method4106(var14 & 7, var15 & 7, var8);
						int var23 = var3 + (var14 & 7) + var9;
						int var24 = var10 + (var15 & 7) + var4;
						PacketWriter.loadTerrain(var0, var25, var2, var21, var22, var23, var24, var8);
					} else {
						PacketWriter.loadTerrain(var0, var25, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "-285150505"
	)
	static int method8880(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (ItemContainer.friendSystem.field830 == 0) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = -2;
			} else if (ItemContainer.friendSystem.field830 == 1) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = ItemContainer.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				if (ItemContainer.friendSystem.method2004() && var3 >= 0 && var3 < ItemContainer.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)ItemContainer.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				if (ItemContainer.friendSystem.method2004() && var3 >= 0 && var3 < ItemContainer.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = ((Buddy)ItemContainer.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				if (ItemContainer.friendSystem.method2004() && var3 >= 0 && var3 < ItemContainer.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = ((Buddy)ItemContainer.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
					int var9 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					class144.method3502(var5, var9);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
					ItemContainer.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
					ItemContainer.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
					ItemContainer.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
					boolean var6 = true;
					ItemContainer.friendSystem.removeIgnore(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
					var5 = class267.method5641(var5);
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = ItemContainer.friendSystem.isFriended(new Username(var5, WorldMapScaleHandler.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (PendingSpawn.friendsChat != null) {
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = PendingSpawn.friendsChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (PendingSpawn.friendsChat != null) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = PendingSpawn.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					if (PendingSpawn.friendsChat != null && var3 < PendingSpawn.friendsChat.getSize()) {
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = PendingSpawn.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					if (PendingSpawn.friendsChat != null && var3 < PendingSpawn.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = ((Buddy)PendingSpawn.friendsChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					if (PendingSpawn.friendsChat != null && var3 < PendingSpawn.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = ((Buddy)PendingSpawn.friendsChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = PendingSpawn.friendsChat != null ? PendingSpawn.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
					FontName.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = PendingSpawn.friendsChat != null ? PendingSpawn.friendsChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
					Canvas.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					ApproximateRouteStrategy.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!ItemContainer.friendSystem.method2004()) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = ItemContainer.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					if (ItemContainer.friendSystem.method2004() && var3 >= 0 && var3 < ItemContainer.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)ItemContainer.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
					var5 = class267.method5641(var5);
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = ItemContainer.friendSystem.isIgnored(new Username(var5, WorldMapScaleHandler.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					if (PendingSpawn.friendsChat != null && var3 < PendingSpawn.friendsChat.getSize() && PendingSpawn.friendsChat.get(var3).getUsername().equals(SpriteMask.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (PendingSpawn.friendsChat != null && PendingSpawn.friendsChat.owner != null) {
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = PendingSpawn.friendsChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					if (PendingSpawn.friendsChat != null && var3 < PendingSpawn.friendsChat.getSize() && ((ClanMate)PendingSpawn.friendsChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						ItemContainer.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							ItemContainer.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							ItemContainer.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							ItemContainer.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							ItemContainer.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							ItemContainer.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							ItemContainer.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							ItemContainer.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							ItemContainer.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							ItemContainer.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							ItemContainer.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							ItemContainer.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							ItemContainer.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							ItemContainer.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							ItemContainer.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							ItemContainer.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (PendingSpawn.friendsChat != null) {
								PendingSpawn.friendsChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							if (PendingSpawn.friendsChat != null) {
								PendingSpawn.friendsChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							if (PendingSpawn.friendsChat != null) {
								PendingSpawn.friendsChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							if (PendingSpawn.friendsChat != null) {
								PendingSpawn.friendsChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							if (PendingSpawn.friendsChat != null) {
								PendingSpawn.friendsChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							if (PendingSpawn.friendsChat != null) {
								PendingSpawn.friendsChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							if (PendingSpawn.friendsChat != null) {
								PendingSpawn.friendsChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							if (PendingSpawn.friendsChat != null) {
								PendingSpawn.friendsChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							if (PendingSpawn.friendsChat != null) {
								PendingSpawn.friendsChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							if (PendingSpawn.friendsChat != null) {
								PendingSpawn.friendsChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							if (PendingSpawn.friendsChat != null) {
								PendingSpawn.friendsChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (PendingSpawn.friendsChat != null) {
								PendingSpawn.friendsChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							ItemContainer.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							if (PendingSpawn.friendsChat != null) {
								PendingSpawn.friendsChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					if (PendingSpawn.friendsChat != null && var3 < PendingSpawn.friendsChat.getSize() && ((ClanMate)PendingSpawn.friendsChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}
}
