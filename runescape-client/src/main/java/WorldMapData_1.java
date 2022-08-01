import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("hc")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("uz")
	@Export("foundItemIds")
	static short[] foundItemIds;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1540818723)
	@Export("chunkXLow")
	int chunkXLow;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1273854217)
	@Export("chunkYLow")
	int chunkYLow;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1262571631)
	@Export("chunkX")
	int chunkX;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 391822755)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;B)V", garbageValue = "-43")
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field2841.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort() * 4096;
			super.regionYLow = var1.readUnsignedShort() * 64;
			this.chunkXLow = var1.readUnsignedByte();
			this.chunkYLow = var1.readUnsignedByte();
			super.regionX = var1.readUnsignedShort();
			super.regionY = var1.readUnsignedShort();
			this.chunkX = var1.readUnsignedByte();
			this.chunkY = var1.readUnsignedByte();
			super.groupId = var1.readNullableLargeSmart();
			super.fileId = var1.readNullableLargeSmart();
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqw;B)V", garbageValue = "1")
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field2796 = new byte[super.planes][64][64];
		super.field2793 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class238.field2831.value) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			int var5 = var1.readUnsignedByte();
			int var6 = var1.readUnsignedByte();
			if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) {
				for (int var7 = 0; var7 < 8; ++var7) {
					for (int var8 = 0; var8 < 8; ++var8) {
						this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1);
					}
				}
			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1606384690")
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "702888353")
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "364294110")
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "418959705")
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) {
			return false;
		} else {
			WorldMapData_1 var2 = ((WorldMapData_1) (var1));
			if (super.regionX == var2.regionX && var2.regionY == super.regionY) {
				return var2.chunkX == this.chunkX && this.chunkY == var2.chunkY;
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "-2137190609")
	static int method4832(int var0, Script var1, boolean var2) {
		Widget var3 = (var2) ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.childIndex;
			return 1;
		} else if (var0 == 1707) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (var3.method5640()) ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return PacketWriter.method2600(var3);
		} else {
			return var0 == 1709 ? HealthBar.method2410(var3) : 2;
		}
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-103")
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex;
		if (var0 == -3) {
			HealthBarUpdate.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			HealthBarUpdate.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			HealthBarUpdate.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			UserComparator6.method2701(3);
			Login.field919 = 1;
		} else if (var0 == 4) {
			class67.method1935(0);
		} else if (var0 == 5) {
			Login.field919 = 2;
			HealthBarUpdate.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
		} else if (var0 == 68 || !Client.onMobile && var0 == 6) {
			HealthBarUpdate.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (var0 == 7) {
			HealthBarUpdate.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			HealthBarUpdate.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			HealthBarUpdate.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			HealthBarUpdate.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			HealthBarUpdate.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			HealthBarUpdate.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) {
			HealthBarUpdate.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			HealthBarUpdate.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) {
			HealthBarUpdate.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
		} else if (var0 == 17) {
			HealthBarUpdate.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) {
			class67.method1935(1);
		} else if (var0 == 19) {
			HealthBarUpdate.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) {
			HealthBarUpdate.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			HealthBarUpdate.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			HealthBarUpdate.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			HealthBarUpdate.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			HealthBarUpdate.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			HealthBarUpdate.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			HealthBarUpdate.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			HealthBarUpdate.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			class67.method1935(2);
		} else if (var0 == 37) {
			HealthBarUpdate.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			HealthBarUpdate.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) {
			UserComparator6.method2701(8);
		} else {
			if (var0 == 56) {
				HealthBarUpdate.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				class82.updateGameState(11);
				return;
			}
			if (var0 == 57) {
				HealthBarUpdate.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				class82.updateGameState(11);
				return;
			}
			if (var0 == 61) {
				HealthBarUpdate.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
				UserComparator6.method2701(7);
			} else {
				if (var0 == 62) {
					class82.updateGameState(10);
					UserComparator6.method2701(9);
					HealthBarUpdate.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}
				if (var0 == 63) {
					class82.updateGameState(10);
					UserComparator6.method2701(9);
					HealthBarUpdate.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}
				if (var0 == 65 || var0 == 67) {
					class82.updateGameState(10);
					UserComparator6.method2701(9);
					HealthBarUpdate.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}
				if (var0 == 71) {
					class82.updateGameState(10);
					UserComparator6.method2701(7);
					HealthBarUpdate.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					class82.updateGameState(10);
					UserComparator6.method2701(6);
					HealthBarUpdate.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
				} else if (var0 == 72) {
					class82.updateGameState(10);
					UserComparator6.method2701(26);
				} else {
					HealthBarUpdate.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		}
		class82.updateGameState(10);
		int var4 = Login.loginIndex;
		boolean var5 = var4 != var1;
		if (!var5 && Client.field741.method8024()) {
			UserComparator6.method2701(9);
		}
	}
}