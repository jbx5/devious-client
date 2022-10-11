import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dr")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("s")
	@Export("SpriteBuffer_spriteHeights")
	public static int[] SpriteBuffer_spriteHeights;
	@ObfuscatedName("cc")
	static boolean field1387;
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Lnr;I)I",
		garbageValue = "2019558836"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "53690591"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (Frames.World_request == null) { // L: 31
				Frames.World_request = Messages.urlRequester.request(new URL(WorldMapSection1.field2879));
			} else if (Frames.World_request.isDone()) { // L: 33
				byte[] var0 = Frames.World_request.getResponse(); // L: 34
				Buffer var1 = new Buffer(var0); // L: 35
				var1.readInt(); // L: 36
				World.World_count = var1.readUnsignedShort(); // L: 37
				World.World_worlds = new World[World.World_count]; // L: 38

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 39 47
					var3 = World.World_worlds[var2] = new World(); // L: 40
					var3.id = var1.readUnsignedShort(); // L: 41
					var3.properties = var1.readInt(); // L: 42
					var3.host = var1.readStringCp1252NullTerminated(); // L: 43
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 44
					var3.location = var1.readUnsignedByte(); // L: 45
					var3.population = var1.readShort(); // L: 46
				}

				PendingSpawn.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 49
				Frames.World_request = null; // L: 50
				return true; // L: 51
			}
		} catch (Exception var4) { // L: 55
			var4.printStackTrace(); // L: 56
			Frames.World_request = null; // L: 57
		}

		return false; // L: 59
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "106"
	)
	static final boolean method2776(int var0, int var1) {
		ObjectComposition var2 = PlayerComposition.getObjectDefinition(var0); // L: 1008
		if (var1 == 11) { // L: 1009
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4; // L: 1010
		}

		return var2.method3787(var1); // L: 1011
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZB)I",
		garbageValue = "-1"
	)
	static int method2772(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 1863
			Interpreter.Interpreter_intStackSize -= 3; // L: 1864
			class67.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]); // L: 1865
			return 1; // L: 1866
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 1868
			class9.playSong(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1869
			return 1; // L: 1870
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 1872
			Interpreter.Interpreter_intStackSize -= 2; // L: 1873
			class161.method3458(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 1874
			return 1; // L: 1875
		} else {
			class83 var3;
			class82 var4;
			int var5;
			int var6;
			String var7;
			if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 1877
				if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 1989
					return var0 == 3211 ? 1 : 2; // L: 2098 2099 2101
				} else {
					var3 = class83.field1078; // L: 1990
					var4 = class82.field1062; // L: 1991
					boolean var8 = false; // L: 1992
					if (var0 == 3214) { // L: 1993
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1994
						var3 = (class83)Varps.findEnumerated(ObjectSound.method1849(), var6); // L: 1995
						if (var3 == null) { // L: 1996
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 1997
						}
					}

					if (var0 == 3215) { // L: 2000
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2001
						var4 = (class82)Varps.findEnumerated(Renderable.method4463(), var6); // L: 2002
						if (var4 == null) { // L: 2003
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2004
						}
					}

					if (var0 == 3210) { // L: 2007
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2008
						var3 = (class83)Varps.findEnumerated(ObjectSound.method1849(), var6); // L: 2009
						if (var3 == null) { // L: 2010
							var4 = (class82)Varps.findEnumerated(Renderable.method4463(), var6); // L: 2011
							if (var4 == null) { // L: 2012
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2013
							}
						}
					} else if (var0 == 3182) { // L: 2017
						var3 = class83.field1077; // L: 2018
					} else if (var0 == 3204) { // L: 2020
						var4 = class82.field1069; // L: 2021
					} else if (var0 == 3206) { // L: 2023
						var4 = class82.field1064; // L: 2024
					} else if (var0 == 3208) { // L: 2026
						var4 = class82.field1065; // L: 2027
					}

					if (var4 == class82.field1062) { // L: 2029
						switch(var3.field1079) { // L: 2030
						case 1:
							var5 = Player.clientPreferences.method2397() ? 1 : 0; // L: 2058
							break; // L: 2059
						case 2:
							var5 = Player.clientPreferences.method2393() ? 1 : 0; // L: 2038
							break; // L: 2039
						case 3:
							var5 = Player.clientPreferences.method2396() ? 1 : 0; // L: 2048
							break; // L: 2049
						case 4:
							var5 = Player.clientPreferences.method2398(); // L: 2033
							break;
						case 5:
							var5 = UserComparator5.method2751(); // L: 2043
							break; // L: 2044
						default:
							var7 = String.format("Unkown device option: %s.", var3.toString()); // L: 2053
							throw new RuntimeException(var7); // L: 2054
						}
					} else {
						switch(var4.field1066) { // L: 2064
						case 1:
							var5 = Player.clientPreferences.method2452() ? 1 : 0; // L: 2073
							break; // L: 2074
						case 2:
							var6 = Player.clientPreferences.method2402(); // L: 2089
							var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2090
							break; // L: 2091
						case 3:
							var6 = Player.clientPreferences.method2385(); // L: 2067
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2068
							break; // L: 2069
						case 4:
							var6 = Player.clientPreferences.method2474(); // L: 2083
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2084
							break; // L: 2085
						default:
							var7 = String.format("Unkown game option: %s.", var4.toString()); // L: 2078
							throw new RuntimeException(var7); // L: 2079
						}
					}

					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 2095
					return 1; // L: 2096
				}
			} else {
				var3 = class83.field1078; // L: 1878
				var4 = class82.field1062; // L: 1879
				var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1880
				if (var0 == 3212) { // L: 1881
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1882
					var3 = (class83)Varps.findEnumerated(ObjectSound.method1849(), var6); // L: 1883
					if (var3 == null) { // L: 1884
						throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 1885
					}
				}

				if (var0 == 3213) { // L: 1888
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1889
					var4 = (class82)Varps.findEnumerated(Renderable.method4463(), var6); // L: 1890
					if (var4 == null) { // L: 1891
						throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 1892
					}
				}

				if (var0 == 3209) { // L: 1895
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1896
					var3 = (class83)Varps.findEnumerated(ObjectSound.method1849(), var6); // L: 1897
					if (var3 == null) { // L: 1898
						var4 = (class82)Varps.findEnumerated(Renderable.method4463(), var6); // L: 1899
						if (var4 == null) { // L: 1900
							throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 1901
						}
					}
				} else if (var0 == 3181) { // L: 1905
					var3 = class83.field1077; // L: 1906
				} else if (var0 == 3203) { // L: 1908
					var4 = class82.field1069; // L: 1909
				} else if (var0 == 3205) { // L: 1911
					var4 = class82.field1064; // L: 1912
				} else if (var0 == 3207) { // L: 1914
					var4 = class82.field1065; // L: 1915
				}

				if (var4 == class82.field1062) { // L: 1917
					switch(var3.field1079) { // L: 1918
					case 1:
						Player.clientPreferences.method2390(var5 == 1); // L: 1931
						break; // L: 1932
					case 2:
						Player.clientPreferences.method2392(var5 == 1); // L: 1921
						break;
					case 3:
						Player.clientPreferences.method2394(var5 == 1); // L: 1926
						break; // L: 1927
					case 4:
						if (var5 < 0) { // L: 1941
							var5 = 0;
						}

						Player.clientPreferences.method2451(var5); // L: 1942
						break; // L: 1943
					case 5:
						GrandExchangeOfferOwnWorldComparator.method1174(var5); // L: 1947
						break; // L: 1948
					default:
						var7 = String.format("Unkown device option: %s.", var3.toString()); // L: 1936
						throw new RuntimeException(var7); // L: 1937
					}
				} else {
					switch(var4.field1066) { // L: 1953
					case 1:
						Player.clientPreferences.method2412(var5 == 1); // L: 1968
						break; // L: 1969
					case 2:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 1980
						var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 1981
						NPC.method2511(var6); // L: 1982
						break; // L: 1983
					case 3:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 1973
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 1974
						class150.method3286(var6); // L: 1975
						break; // L: 1976
					case 4:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 1956
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 1957
						class264.method5345(var6); // L: 1958
						break; // L: 1959
					default:
						var7 = String.format("Unkown game option: %s.", var4.toString()); // L: 1963
						throw new RuntimeException(var7); // L: 1964
					}
				}

				return 1; // L: 1987
			}
		}
	}
}
