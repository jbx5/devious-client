import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.awt.Graphics;
import net.runelite.mapping.Implements;
import java.awt.Component;
import net.runelite.mapping.Export;
@ObfuscatedName("d")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("h")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -1814972075)
	@Export("loginBoxCenter")
	static int loginBoxCenter;

	@ObfuscatedName("c")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("q")
	public static boolean method322(long var0) {
		boolean var2 = var0 != 0L;
		if (var2) {
			boolean var3 = ((int) (var0 >>> 16 & 1L)) == 1;
			var2 = !var3;
		}
		return var2;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "([BIIIIIII[Lgv;B)V", garbageValue = "70")
	static final void method315(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8) {
		int var10;
		for (int var9 = 0; var9 < 8; ++var9) {
			for (var10 = 0; var10 < 8; ++var10) {
				if (var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) {
					int[] var10000 = var8[var1].flags[var9 + var2];
					var10000[var3 + var10] &= -16777217;
				}
			}
		}
		Buffer var13 = new Buffer(var0);
		for (var10 = 0; var10 < 4; ++var10) {
			for (int var11 = 0; var11 < 64; ++var11) {
				for (int var12 = 0; var12 < 64; ++var12) {
					if (var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) {
						Players.loadTerrain(var13, var1, var2 + class122.method2763(var11 & 7, var12 & 7, var7), var3 + FloorOverlayDefinition.method3818(var11 & 7, var12 & 7, var7), 0, 0, var7);
					} else {
						Players.loadTerrain(var13, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-113372020")
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex;
		if (var0 == -3) {
			class101.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			class101.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			class101.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			WorldMapData_1.method4872(3);
			Login.field902 = 1;
		} else if (var0 == 4) {
			WorldMapData_1.method4872(14);
			Login.field897 = 0;
		} else if (var0 == 5) {
			Login.field902 = 2;
			class101.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) {
			if (var0 == 7) {
				class101.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) {
				class101.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) {
				class101.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) {
				class101.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) {
				class101.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) {
				class101.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) {
				class101.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) {
				class101.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) {
				class101.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			} else if (var0 == 17) {
				class101.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
			} else if (var0 == 18) {
				WorldMapData_1.method4872(14);
				Login.field897 = 1;
			} else if (var0 == 19) {
				class101.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) {
				class101.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) {
				class101.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) {
				class101.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) {
				class101.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) {
				class101.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) {
				class101.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) {
				class101.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) {
				class101.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) {
				class101.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
			} else if (var0 == 37) {
				class101.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) {
				class101.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) {
				WorldMapData_1.method4872(8);
			} else {
				if (var0 == 56) {
					class101.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
					HealthBarUpdate.updateGameState(11);
					return;
				}
				if (var0 == 57) {
					class101.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
					HealthBarUpdate.updateGameState(11);
					return;
				}
				if (var0 == 61) {
					class101.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
					WorldMapData_1.method4872(7);
				} else {
					if (var0 == 62) {
						HealthBarUpdate.updateGameState(10);
						WorldMapData_1.method4872(9);
						class101.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
						return;
					}
					if (var0 == 63) {
						HealthBarUpdate.updateGameState(10);
						WorldMapData_1.method4872(9);
						class101.setLoginResponseString("You were signed out.", "Please sign in again.", "");
						return;
					}
					if (var0 == 65 || var0 == 67) {
						HealthBarUpdate.updateGameState(10);
						WorldMapData_1.method4872(9);
						class101.setLoginResponseString("Failed to login.", "Please try again.", "");
						return;
					}
					if (var0 == 71) {
						HealthBarUpdate.updateGameState(10);
						WorldMapData_1.method4872(7);
						class101.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
					} else if (var0 == 73) {
						HealthBarUpdate.updateGameState(10);
						WorldMapData_1.method4872(6);
						class101.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
					} else if (var0 == 72) {
						HealthBarUpdate.updateGameState(10);
						WorldMapData_1.method4872(26);
					} else {
						class101.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
					}
				}
			}
		} else {
			class101.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		}
		HealthBarUpdate.updateGameState(10);
		int var4 = Login.loginIndex;
		boolean var5 = var4 != var1;
		if (!var5 && Client.field516.method8008()) {
			WorldMapData_1.method4872(9);
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(descriptor = "(IIIIIIIIII)V", garbageValue = "-525734760")
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null;
		for (PendingSpawn var10 = ((PendingSpawn) (Client.pendingSpawns.last())); var10 != null; var10 = ((PendingSpawn) (Client.pendingSpawns.previous()))) {
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) {
				var9 = var10;
				break;
			}
		}
		if (var9 == null) {
			var9 = new PendingSpawn();
			var9.plane = var0;
			var9.type = var3;
			var9.x = var1;
			var9.y = var2;
			class151.method3146(var9);
			Client.pendingSpawns.addFirst(var9);
		}
		var9.id = var4;
		var9.field1125 = var5;
		var9.orientation = var6;
		var9.delay = var7;
		var9.hitpoints = var8;
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(descriptor = "(Lkb;IB)I", garbageValue = "9")
	static final int method319(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
			try {
				int[] var2 = var0.cs1Instructions[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;
				while (true) {
					int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}
					if (var6 == 1) {
						var7 = Client.currentLevels[var2[var4++]];
					}
					if (var6 == 2) {
						var7 = Client.levels[var2[var4++]];
					}
					if (var6 == 3) {
						var7 = Client.experience[var2[var4++]];
					}
					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = class140.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!EnumComposition.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}
					if (var6 == 5) {
						var7 = Varps.Varps_main[var2[var4++]];
					}
					if (var6 == 6) {
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}
					if (var6 == 7) {
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}
					if (var6 == 8) {
						var7 = class101.localPlayer.combatLevel;
					}
					if (var6 == 9) {
						for (var9 = 0; var9 < 25; ++var9) {
							if (Skills.Skills_enabled[var9]) {
								var7 += Client.levels[var9];
							}
						}
					}
					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = class140.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!EnumComposition.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 = 999999999;
									break;
								}
							}
						}
					}
					if (var6 == 11) {
						var7 = Client.runEnergy;
					}
					if (var6 == 12) {
						var7 = Client.weight;
					}
					if (var6 == 13) {
						var9 = Varps.Varps_main[var2[var4++]];
						int var13 = var2[var4++];
						var7 = ((var9 & 1 << var13) != 0) ? 1 : 0;
					}
					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = class388.getVarbit(var9);
					}
					if (var6 == 15) {
						var8 = 1;
					}
					if (var6 == 16) {
						var8 = 2;
					}
					if (var6 == 17) {
						var8 = 3;
					}
					if (var6 == 18) {
						var7 = (class101.localPlayer.x >> 7) + class28.baseX;
					}
					if (var6 == 19) {
						var7 = (class101.localPlayer.y >> 7) + WorldMapLabelSize.baseY;
					}
					if (var6 == 20) {
						var7 = var2[var4++];
					}
					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}
						if (var5 == 1) {
							var3 -= var7;
						}
						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}
						if (var5 == 3) {
							var3 *= var7;
						}
						var5 = 0;
					} else {
						var5 = var8;
					}
				} 
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}
}