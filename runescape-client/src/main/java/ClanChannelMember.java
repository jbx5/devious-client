import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("c")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 946209429
	)
	@Export("world")
	public int world;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lqo;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	} // L: 10

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lai;I)V",
		garbageValue = "-1714454103"
	)
	static void method3026(GameEngine var0) {
		while (class28.isKeyDown()) { // L: 1898
			if (class142.field1665 == 13) { // L: 1899
				Login.worldSelectOpen = false; // L: 1901
				TextureProvider.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1902
				PcmPlayer.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1903
				MilliClock.logoSprite.drawAt(Login.xPadding + 382 - MilliClock.logoSprite.subWidth / 2, 18); // L: 1904
				return; // L: 1906
			}

			if (class142.field1665 == 96) { // L: 1908
				if (Login.worldSelectPage > 0 && class239.worldSelectLeftSprite != null) { // L: 1909
					--Login.worldSelectPage; // L: 1910
				}
			} else if (class142.field1665 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class13.worldSelectRightSprite != null) { // L: 1913 1914
				++Login.worldSelectPage; // L: 1915
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !Renderable.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 1919
			int var1 = Login.xPadding + 280; // L: 1920
			if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1921
				class434.changeWorldSelectSorting(0, 0); // L: 1922
				return; // L: 1923
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1925
				class434.changeWorldSelectSorting(0, 1); // L: 1926
				return; // L: 1927
			}

			int var2 = Login.xPadding + 390; // L: 1929
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1930
				class434.changeWorldSelectSorting(1, 0); // L: 1931
				return; // L: 1932
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1934
				class434.changeWorldSelectSorting(1, 1); // L: 1935
				return; // L: 1936
			}

			int var3 = Login.xPadding + 500; // L: 1938
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1939
				class434.changeWorldSelectSorting(2, 0); // L: 1940
				return; // L: 1941
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1943
				class434.changeWorldSelectSorting(2, 1); // L: 1944
				return; // L: 1945
			}

			int var4 = Login.xPadding + 610; // L: 1947
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1948
				class434.changeWorldSelectSorting(3, 0); // L: 1949
				return; // L: 1950
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1952
				class434.changeWorldSelectSorting(3, 1); // L: 1953
				return; // L: 1954
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 1956
				Login.worldSelectOpen = false; // L: 1958
				TextureProvider.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1959
				PcmPlayer.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1960
				MilliClock.logoSprite.drawAt(Login.xPadding + 382 - MilliClock.logoSprite.subWidth / 2, 18); // L: 1961
				return; // L: 1963
			}

			if (Login.hoveredWorldIndex != -1) { // L: 1965
				World var5 = World.World_worlds[Login.hoveredWorldIndex]; // L: 1966
				class221.changeWorld(var5); // L: 1967
				Login.worldSelectOpen = false; // L: 1969
				TextureProvider.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1970
				PcmPlayer.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1971
				MilliClock.logoSprite.drawAt(Login.xPadding + 382 - MilliClock.logoSprite.subWidth / 2, 18); // L: 1972
				return; // L: 1974
			}

			if (Login.worldSelectPage > 0 && class239.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class239.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class166.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class166.canvasHeight / 2 + 50) { // L: 1976
				--Login.worldSelectPage; // L: 1977
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && class13.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class123.canvasWidth - class13.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class123.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class166.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class166.canvasHeight / 2 + 50) { // L: 1979
				++Login.worldSelectPage; // L: 1980
			}
		}

	} // L: 1983

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "911196083"
	)
	static int method3025(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2303
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2304
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class294.method5768(var3) ? 1 : 0; // L: 2305
			return 1; // L: 2306
		} else if (var0 == 3501) { // L: 2308
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2309
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class114.method2806(var3) ? 1 : 0; // L: 2310
			return 1; // L: 2311
		} else if (var0 == 3502) { // L: 2313
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2314
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameObject.method4666(var3) ? 1 : 0; // L: 2315
			return 1; // L: 2316
		} else {
			return 2; // L: 2318
		}
	}
}
