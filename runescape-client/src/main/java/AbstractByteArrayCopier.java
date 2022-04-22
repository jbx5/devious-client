



import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)[B", garbageValue = 
	"2035077648")

	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"([BI)V", garbageValue = 
	"-1279201457")

	@Export("set")
	abstract void set(byte[] var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZB)I", garbageValue = 
	"-58")

	static int method5506(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (Decimator.friendSystem.field805 == 0) {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -2;
			} else if (Decimator.friendSystem.field805 == 1) {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Decimator.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if ((Decimator.friendSystem.method1681() && (var3 >= 0)) && (var3 < Decimator.friendSystem.friendsList.getSize())) {
					Friend var8 = ((Friend) (Decimator.friendSystem.friendsList.get(var3)));
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if ((Decimator.friendSystem.method1681() && (var3 >= 0)) && (var3 < Decimator.friendSystem.friendsList.getSize())) {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((Buddy) (Decimator.friendSystem.friendsList.get(var3))).world;
				} else {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if ((Decimator.friendSystem.method1681() && (var3 >= 0)) && (var3 < Decimator.friendSystem.friendsList.getSize())) {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((Buddy) (Decimator.friendSystem.friendsList.get(var3))).rank;
				} else {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
					int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					WorldMapLabelSize.method3903(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
					Decimator.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
					Decimator.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
					Decimator.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
					Decimator.friendSystem.removeIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
					var5 = class160.method3280(var5);
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (Decimator.friendSystem.isFriended(new Username(var5, class122.loginType), false)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (ClientPacket.friendsChat != null) {
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = ClientPacket.friendsChat.name;
					} else {
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (ClientPacket.friendsChat != null) {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ClientPacket.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if ((ClientPacket.friendsChat != null) && (var3 < ClientPacket.friendsChat.getSize())) {
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = ClientPacket.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if ((ClientPacket.friendsChat != null) && (var3 < ClientPacket.friendsChat.getSize())) {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((Buddy) (ClientPacket.friendsChat.get(var3))).getWorld();
					} else {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if ((ClientPacket.friendsChat != null) && (var3 < ClientPacket.friendsChat.getSize())) {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((Buddy) (ClientPacket.friendsChat.get(var3))).rank;
					} else {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (ClientPacket.friendsChat != null) ? ClientPacket.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
					MidiPcmStream.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (ClientPacket.friendsChat != null) ? (ClientPacket.friendsChat.rank * (-1273194957)) * 1318081787 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
					WorldMapElement.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					WorldMapSprite.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!Decimator.friendSystem.method1681()) {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Decimator.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if ((Decimator.friendSystem.method1681() && (var3 >= 0)) && (var3 < Decimator.friendSystem.ignoreList.getSize())) {
						Ignored var4 = ((Ignored) (Decimator.friendSystem.ignoreList.get(var3)));
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
					var5 = class160.method3280(var5);
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (Decimator.friendSystem.isIgnored(new Username(var5, class122.loginType))) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (((ClientPacket.friendsChat != null) && (var3 < ClientPacket.friendsChat.getSize())) && ClientPacket.friendsChat.get(var3).getUsername().equals(GrandExchangeEvents.localPlayer.username)) {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if ((ClientPacket.friendsChat != null) && (ClientPacket.friendsChat.owner != null)) {
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = ClientPacket.friendsChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (((ClientPacket.friendsChat != null) && (var3 < ClientPacket.friendsChat.getSize())) && ((ClanMate) (ClientPacket.friendsChat.get(var3))).isFriend()) {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						Decimator.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Decimator.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Decimator.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Decimator.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Decimator.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Decimator.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Decimator.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Decimator.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Decimator.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Decimator.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Decimator.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							Decimator.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							Decimator.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Decimator.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Decimator.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							Decimator.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (ClientPacket.friendsChat != null) {
								ClientPacket.friendsChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (ClientPacket.friendsChat != null) {
								ClientPacket.friendsChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (ClientPacket.friendsChat != null) {
								ClientPacket.friendsChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (ClientPacket.friendsChat != null) {
								ClientPacket.friendsChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (ClientPacket.friendsChat != null) {
								ClientPacket.friendsChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (ClientPacket.friendsChat != null) {
								ClientPacket.friendsChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (ClientPacket.friendsChat != null) {
								ClientPacket.friendsChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (ClientPacket.friendsChat != null) {
								ClientPacket.friendsChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (ClientPacket.friendsChat != null) {
								ClientPacket.friendsChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (ClientPacket.friendsChat != null) {
								ClientPacket.friendsChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (ClientPacket.friendsChat != null) {
								ClientPacket.friendsChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (ClientPacket.friendsChat != null) {
								ClientPacket.friendsChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Decimator.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (ClientPacket.friendsChat != null) {
								ClientPacket.friendsChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (((ClientPacket.friendsChat != null) && (var3 < ClientPacket.friendsChat.getSize())) && ((ClanMate) (ClientPacket.friendsChat.get(var3))).isIgnored()) {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(descriptor = 
	"([Lky;Lky;ZI)V", garbageValue = 
	"1933510801")

	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = (var1.scrollWidth != 0) ? (var1.scrollWidth * (-188983191)) * (-885606439) : (var1.width * (-1328038141)) * (-1237179477);
		int var4 = (var1.scrollHeight != 0) ? (var1.scrollHeight * 153385713) * (-1426770415) : (var1.height * 191855667) * (-686825733);
		ModelData0.resizeInterface(var0, var1.id, var3, var4, var2);
		if (var1.children != null) {
			ModelData0.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var1.id)))));
		if (var5 != null) {
			int var6 = var5.group;
			if (class155.loadInterface(var6)) {
				ModelData0.resizeInterface(Widget.Widget_interfaceComponents[var6], -1, var3, var4, var2);
			}
		}

		if (var1.contentType == 1337) {
		}

	}
}