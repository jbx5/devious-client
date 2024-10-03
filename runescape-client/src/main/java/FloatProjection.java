import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ja")
@Implements("FloatProjection")
public class FloatProjection extends Projection {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("transformationMatrix")
	TransformationMatrix transformationMatrix;
	@ObfuscatedName("ae")
	@Export("projection")
	float[] projection;

	@ObfuscatedSignature(
		descriptor = "(Lqf;)V"
	)
	FloatProjection(TransformationMatrix var1) {
		this.projection = new float[3];
		this.transformationMatrix = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lju;IIIIJ)V"
	)
	@Export("draw")
	void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
		var1.draw(var2, this.transformationMatrix, var3, var4, var5, var6);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljh;Ljl;IIII)V",
		garbageValue = "795237467"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
		int var6;
		int var7 = var6 = var4 << 7;
		int var8;
		int var9 = var8 = var5 << 7;
		int var10;
		int var11 = var10 = var7 + 128;
		int var12;
		int var13 = var12 = var9 + 128;
		int var14 = var1.tileHeights[var3][var4][var5];
		int var15 = var1.tileHeights[var3][var4 + 1][var5];
		int var16 = var1.tileHeights[var3][var4 + 1][var5 + 1];
		int var17 = var1.tileHeights[var3][var4][var5 + 1];
		this.transformationMatrix.transformPoint((float)var7, (float)var14, (float)var9, this.projection);
		var7 = (int)this.projection[0];
		var14 = (int)this.projection[1];
		var9 = (int)this.projection[2] | 1;
		this.transformationMatrix.transformPoint((float)var11, (float)var15, (float)var8, this.projection);
		var11 = (int)this.projection[0];
		var15 = (int)this.projection[1];
		var8 = (int)this.projection[2] | 1;
		this.transformationMatrix.transformPoint((float)var10, (float)var16, (float)var13, this.projection);
		var10 = (int)this.projection[0];
		var16 = (int)this.projection[1];
		var13 = (int)this.projection[2] | 1;
		this.transformationMatrix.transformPoint((float)var6, (float)var17, (float)var12, this.projection);
		var6 = (int)this.projection[0];
		var17 = (int)this.projection[1];
		var12 = (int)this.projection[2] | 1;
		this.drawSceneTilePaint(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var17, var9, var8, var13, var12);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljh;Ljb;III)V",
		garbageValue = "-849252545"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(Scene var1, SceneTileModel var2, int var3, int var4) {
		int var5 = var2.vertexX.length;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = var2.vertexX[var6];
			int var8 = var2.vertexY[var6];
			int var9 = var2.vertexZ[var6];
			this.transformationMatrix.transformPoint((float)var7, (float)var8, (float)var9, this.projection);
			var7 = (int)this.projection[0];
			var8 = (int)this.projection[1];
			var9 = (int)this.projection[2];
			if (var2.triangleTextureId != null) {
				SceneTileModel.triangleTexturesX[var6] = var7;
				SceneTileModel.triangleTexturesY[var6] = var8;
				SceneTileModel.triangleTexturesZ[var6] = var9;
			}

			var9 |= 1;
			SceneTileModel.verticesX[var6] = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.verticesY[var6] = Rasterizer3D.getClipMidY() + var8 * Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.verticesZ[var6] = class142.method3386(var9);
		}

		this.drawSceneTileModel(var1, var2, var3, var4);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1700204751"
	)
	public static void method5136() {
		class195.field2100.clear();
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1908182407"
	)
	static int method5138(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (class425.friendSystem.field843 == 0) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -2;
			} else if (class425.friendSystem.field843 == 1) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class425.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				if (class425.friendSystem.method1985() && var3 >= 0 && var3 < class425.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)class425.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				if (class425.friendSystem.method1985() && var3 >= 0 && var3 < class425.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = ((Buddy)class425.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				if (class425.friendSystem.method1985() && var3 >= 0 && var3 < class425.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = ((Buddy)class425.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
					int var9 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					UserComparator8.method3186(var5, var9);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
					class425.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
					class425.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
					class425.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
					boolean var6 = true;
					class425.friendSystem.removeIgnore(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
					var5 = class158.method3553(var5);
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class425.friendSystem.isFriended(new Username(var5, class28.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class168.friendsChat != null) {
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = class168.friendsChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class168.friendsChat != null) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class168.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					if (class168.friendsChat != null && var3 < class168.friendsChat.getSize()) {
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = class168.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					if (class168.friendsChat != null && var3 < class168.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = ((Buddy)class168.friendsChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					if (class168.friendsChat != null && var3 < class168.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = ((Buddy)class168.friendsChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class168.friendsChat != null ? class168.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
					SoundCache.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class168.friendsChat != null ? class168.friendsChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
					class383.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					Bounds.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class425.friendSystem.method1985()) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class425.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					if (class425.friendSystem.method1985() && var3 >= 0 && var3 < class425.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)class425.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
					var5 = class158.method3553(var5);
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class425.friendSystem.isIgnored(new Username(var5, class28.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					if (class168.friendsChat != null && var3 < class168.friendsChat.getSize() && class168.friendsChat.get(var3).getUsername().equals(AddRequestTask.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (class168.friendsChat != null && class168.friendsChat.owner != null) {
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = class168.friendsChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					if (class168.friendsChat != null && var3 < class168.friendsChat.getSize() && ((ClanMate)class168.friendsChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class425.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							class425.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							class425.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							class425.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							class425.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							class425.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							class425.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							class425.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							class425.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							class425.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							class425.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							class425.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							class425.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							class425.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							class425.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							class425.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (class168.friendsChat != null) {
								class168.friendsChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							if (class168.friendsChat != null) {
								class168.friendsChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							if (class168.friendsChat != null) {
								class168.friendsChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							if (class168.friendsChat != null) {
								class168.friendsChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							if (class168.friendsChat != null) {
								class168.friendsChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							if (class168.friendsChat != null) {
								class168.friendsChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							if (class168.friendsChat != null) {
								class168.friendsChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							if (class168.friendsChat != null) {
								class168.friendsChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							if (class168.friendsChat != null) {
								class168.friendsChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							if (class168.friendsChat != null) {
								class168.friendsChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							if (class168.friendsChat != null) {
								class168.friendsChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (class168.friendsChat != null) {
								class168.friendsChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							class425.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							if (class168.friendsChat != null) {
								class168.friendsChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					if (class168.friendsChat != null && var3 < class168.friendsChat.getSize() && ((ClanMate)class168.friendsChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}
}
