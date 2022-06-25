import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import java.io.File;
import net.runelite.mapping.Export;
@ObfuscatedName("fz")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("j")
	@Export("cacheDir")
	static File cacheDir;

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "Lpa;")
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Lpa;")
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "Lpa;")
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;

	@ObfuscatedName("x")
	@Export("cacheSubPaths")
	static String[] cacheSubPaths;

	@ObfuscatedName("qd")
	@ObfuscatedSignature(descriptor = "Lfh;")
	@Export("mouseWheel")
	static class158 mouseWheel;

	static {
		JagexCache_randomDat = null;
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "2126958696")
	static int method3271(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			class446.Interpreter_intStackSize -= 3;
			var9 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
			int var11 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = class140.getWidget(var9);
				if (var6.children == null) {
					var6.children = new Widget[var11 + 1];
				}
				if (var6.children.length <= var11) {
					Widget[] var7 = new Widget[var11 + 1];
					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}
					var6.children = var7;
				}
				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var11;
					var12.isIf3 = true;
					var6.children[var11] = var12;
					if (var2) {
						class124.scriptDotWidget = var12;
					} else {
						GrandExchangeOfferOwnWorldComparator.scriptActiveWidget = var12;
					}
					ChatChannel.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = (var2) ? class124.scriptDotWidget : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget;
				Widget var10 = class140.getWidget(var3.id);
				var10.children[var3.childIndex] = null;
				ChatChannel.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
				var3.children = null;
				ChatChannel.invalidateWidget(var3);
				return 1;
			} else if (var0 == 103) {
				class446.Interpreter_intStackSize -= 3;
				return 1;
			} else if (var0 == 104) {
				--class446.Interpreter_intStackSize;
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
					if (var3 != null) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							class124.scriptDotWidget = var3;
						} else {
							GrandExchangeOfferOwnWorldComparator.scriptActiveWidget = var3;
						}
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				} else if (var0 == 202) {
					Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else if (var0 == 203) {
					Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				class446.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				Widget var5 = ScriptFrame.getWidgetChild(var9, var4);
				if (var5 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						class124.scriptDotWidget = var5;
					} else {
						GrandExchangeOfferOwnWorldComparator.scriptActiveWidget = var5;
					}
				} else {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
				}
				return 1;
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "20332166")
	public static int method3250(int var0) {
		return Decimator.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = "(ILbi;ZB)I", garbageValue = "34")
	static int method3249(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (Player.friendSystem.field802 == 0) {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -2;
			} else if (Player.friendSystem.field802 == 1) {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Player.friendSystem.friendsList.getSize();
			}
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				if (Player.friendSystem.method1634() && var3 >= 0 && var3 < Player.friendSystem.friendsList.getSize()) {
					Friend var8 = ((Friend) (Player.friendSystem.friendsList.get(var3)));
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}
				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				if (Player.friendSystem.method1634() && var3 >= 0 && var3 < Player.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((Buddy) (Player.friendSystem.friendsList.get(var3))).world;
				} else {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
				}
				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				if (Player.friendSystem.method1634() && var3 >= 0 && var3 < Player.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((Buddy) (Player.friendSystem.friendsList.get(var3))).rank;
				} else {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
				}
				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					int var6 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					DevicePcmPlayerProvider.method309(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					Player.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					Player.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					Player.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					Player.friendSystem.removeIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var5 = class92.method2388(var5);
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (Player.friendSystem.isFriended(new Username(var5, HealthBarDefinition.loginType), false)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (Huffman.friendsChat != null) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Huffman.friendsChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (Huffman.friendsChat != null) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Huffman.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					if (Huffman.friendsChat != null && var3 < Huffman.friendsChat.getSize()) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Huffman.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					if (Huffman.friendsChat != null && var3 < Huffman.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((Buddy) (Huffman.friendsChat.get(var3))).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					if (Huffman.friendsChat != null && var3 < Huffman.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((Buddy) (Huffman.friendsChat.get(var3))).rank;
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (Huffman.friendsChat != null) ? Huffman.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					ArchiveLoader.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (Huffman.friendsChat != null) ? Huffman.friendsChat.rank * -1691262047 * -1648279455 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					Players.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					UserComparator5.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!Player.friendSystem.method1634()) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Player.friendSystem.ignoreList.getSize();
					}
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					if (Player.friendSystem.method1634() && var3 >= 0 && var3 < Player.friendSystem.ignoreList.getSize()) {
						Ignored var4 = ((Ignored) (Player.friendSystem.ignoreList.get(var3)));
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var5 = class92.method2388(var5);
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (Player.friendSystem.isIgnored(new Username(var5, HealthBarDefinition.loginType))) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					if (Huffman.friendsChat != null && var3 < Huffman.friendsChat.getSize() && Huffman.friendsChat.get(var3).getUsername().equals(class101.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (Huffman.friendsChat != null && Huffman.friendsChat.owner != null) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Huffman.friendsChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					if (Huffman.friendsChat != null && var3 < Huffman.friendsChat.getSize() && ((ClanMate) (Huffman.friendsChat.get(var3))).isFriend()) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						Player.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							Player.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							Player.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							Player.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							Player.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							Player.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							Player.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							Player.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							Player.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							Player.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							Player.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							Player.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							Player.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							Player.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							Player.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							Player.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (Huffman.friendsChat != null) {
								Huffman.friendsChat.removeComparator();
							}
							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							if (Huffman.friendsChat != null) {
								Huffman.friendsChat.addComparator(new UserComparator1(var7));
							}
							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							if (Huffman.friendsChat != null) {
								Huffman.friendsChat.addComparator(new UserComparator2(var7));
							}
							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							if (Huffman.friendsChat != null) {
								Huffman.friendsChat.addComparator(new UserComparator3(var7));
							}
							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							if (Huffman.friendsChat != null) {
								Huffman.friendsChat.addComparator(new UserComparator4(var7));
							}
							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							if (Huffman.friendsChat != null) {
								Huffman.friendsChat.addComparator(new UserComparator5(var7));
							}
							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							if (Huffman.friendsChat != null) {
								Huffman.friendsChat.addComparator(new UserComparator6(var7));
							}
							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							if (Huffman.friendsChat != null) {
								Huffman.friendsChat.addComparator(new UserComparator7(var7));
							}
							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							if (Huffman.friendsChat != null) {
								Huffman.friendsChat.addComparator(new UserComparator8(var7));
							}
							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							if (Huffman.friendsChat != null) {
								Huffman.friendsChat.addComparator(new UserComparator9(var7));
							}
							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							if (Huffman.friendsChat != null) {
								Huffman.friendsChat.addComparator(new UserComparator10(var7));
							}
							return 1;
						} else if (var0 == 3655) {
							if (Huffman.friendsChat != null) {
								Huffman.friendsChat.sort();
							}
							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							Player.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							if (Huffman.friendsChat != null) {
								Huffman.friendsChat.addComparator(new BuddyRankComparator(var7));
							}
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					if (Huffman.friendsChat != null && var3 < Huffman.friendsChat.getSize() && ((ClanMate) (Huffman.friendsChat.get(var3))).isIgnored()) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				}
			}
		}
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(descriptor = "(IIIIIIB)V", garbageValue = "-13")
	static final void method3262(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = (var6 >= 0) ? var6 : -var6;
		int var9 = (var7 >= 0) ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}
		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}
			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var13 + var6;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var15 + var7 + var1;
			Rasterizer3D.method4030(var17, var18, var19);
			Rasterizer3D.method4116(var21, var22, var23, var17, var18, var19, var4);
			Rasterizer3D.method4030(var17, var19, var20);
			Rasterizer3D.method4116(var21, var23, var24, var17, var19, var20, var4);
		}
	}
}