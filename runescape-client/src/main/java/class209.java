import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("if")
public class class209 extends class224 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1096130633
	)
	int field2294;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	final class221 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lit;Ljava/lang/String;I)V"
	)
	class209(class221 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2294 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2105911105"
	)
	public int vmethod4366() {
		return 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-8310"
	)
	public int vmethod4368() {
		return this.field2294;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1019572333"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		Message.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;B)Z",
		garbageValue = "-91"
	)
	static boolean method4123(Date var0) {
		java.util.Calendar var1 = java.util.Calendar.getInstance();
		var1.set(1, var1.get(1) - 13);
		var1.set(5, var1.get(5) + 1);
		var1.set(11, 0);
		var1.set(12, 0);
		var1.set(13, 0);
		var1.set(14, 0);
		Date var2 = var1.getTime();
		return var0.before(var2);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "33"
	)
	static int method4124(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (InterfaceParent.friendSystem.field857 == 0) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -2;
			} else if (InterfaceParent.friendSystem.field857 == 1) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InterfaceParent.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (InterfaceParent.friendSystem.method1942() && var3 >= 0 && var3 < InterfaceParent.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)InterfaceParent.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (InterfaceParent.friendSystem.method1942() && var3 >= 0 && var3 < InterfaceParent.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)InterfaceParent.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (InterfaceParent.friendSystem.method1942() && var3 >= 0 && var3 < InterfaceParent.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)InterfaceParent.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
					int var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					HttpRequest.method88(var5, var9);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
					InterfaceParent.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
					InterfaceParent.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
					InterfaceParent.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
					boolean var6 = true;
					InterfaceParent.friendSystem.removeIgnore(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
					var5 = class433.method8127(var5);
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InterfaceParent.friendSystem.isFriended(new Username(var5, FriendLoginUpdate.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (Projectile.friendsChat != null) {
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = Projectile.friendsChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (Projectile.friendsChat != null) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Projectile.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (Projectile.friendsChat != null && var3 < Projectile.friendsChat.getSize()) {
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = Projectile.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (Projectile.friendsChat != null && var3 < Projectile.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)Projectile.friendsChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (Projectile.friendsChat != null && var3 < Projectile.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)Projectile.friendsChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Projectile.friendsChat != null ? Projectile.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
					UserComparator8.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Projectile.friendsChat != null ? Projectile.friendsChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
					ApproximateRouteStrategy.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class102.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!InterfaceParent.friendSystem.method1942()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InterfaceParent.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (InterfaceParent.friendSystem.method1942() && var3 >= 0 && var3 < InterfaceParent.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)InterfaceParent.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
					var5 = class433.method8127(var5);
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InterfaceParent.friendSystem.isIgnored(new Username(var5, FriendLoginUpdate.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (Projectile.friendsChat != null && var3 < Projectile.friendsChat.getSize() && Projectile.friendsChat.get(var3).getUsername().equals(VarpDefinition.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (Projectile.friendsChat != null && Projectile.friendsChat.owner != null) {
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = Projectile.friendsChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (Projectile.friendsChat != null && var3 < Projectile.friendsChat.getSize() && ((ClanMate)Projectile.friendsChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						InterfaceParent.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							InterfaceParent.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							InterfaceParent.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							InterfaceParent.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (Projectile.friendsChat != null) {
								Projectile.friendsChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Projectile.friendsChat != null) {
								Projectile.friendsChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Projectile.friendsChat != null) {
								Projectile.friendsChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Projectile.friendsChat != null) {
								Projectile.friendsChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Projectile.friendsChat != null) {
								Projectile.friendsChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Projectile.friendsChat != null) {
								Projectile.friendsChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Projectile.friendsChat != null) {
								Projectile.friendsChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Projectile.friendsChat != null) {
								Projectile.friendsChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Projectile.friendsChat != null) {
								Projectile.friendsChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Projectile.friendsChat != null) {
								Projectile.friendsChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Projectile.friendsChat != null) {
								Projectile.friendsChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (Projectile.friendsChat != null) {
								Projectile.friendsChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Projectile.friendsChat != null) {
								Projectile.friendsChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (Projectile.friendsChat != null && var3 < Projectile.friendsChat.getSize() && ((ClanMate)Projectile.friendsChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Ldy;I)V",
		garbageValue = "-1240244412"
	)
	static final void method4126(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = Actor.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) {
			var1 = Actor.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) {
			var1 = Actor.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = Actor.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var1 != 0L) {
			int var6 = Actor.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = Message.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = var6 >> 6 & 3;
		}

		var0.objectId = var3;
		var0.field1196 = var4;
		var0.field1197 = var5;
	}
}
