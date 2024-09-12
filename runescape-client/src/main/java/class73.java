import java.util.ArrayList;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
public class class73 {
	@ObfuscatedName("de")
	static boolean field893;
	@ObfuscatedName("ac")
	final ArrayList field902;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -193436451
	)
	int field892;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -38288679
	)
	int field898;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("coord")
	Coord coord;
	@ObfuscatedName("ax")
	byte field895;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 182383155
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1315619531
	)
	int field897;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -841216137
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("pathTraversed")
	MoveSpeed pathTraversed;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	Buffer field900;
	@ObfuscatedName("al")
	@Export("actions")
	String[] actions;

	class73(int var1) {
		this.field902 = new ArrayList(1);
		this.field892 = -1;
		this.field898 = 0;
		this.coord = new Coord();
		this.orientation = 0;
		this.field897 = -1;
		this.targetIndex = -1;
		this.actions = new String[3];
		this.field892 = var1;

		for (int var2 = 0; var2 < 3; ++var2) {
			this.actions[var2] = "";
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "79"
	)
	void method2198() {
		this.field900 = null;
		this.field902.clear();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1667659676"
	)
	void method2276(int var1) {
		this.field898 = var1;
		this.orientation = 0;
		this.field897 = -1;
		this.targetIndex = -1;
		this.field895 = 0;
		this.pathTraversed = MoveSpeed.field3036;
		this.field900 = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "1767907585"
	)
	void method2200(Player var1) {
		this.field902.add(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "1694164316"
	)
	void method2201(Player var1) {
		this.field902.remove(var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILdd;I)Ldi;",
		garbageValue = "36195750"
	)
	Player method2202(int var1, WorldView var2) {
		Player var3 = new Player();
		var3.index = var1;
		if (this.field900 != null) {
			var3.read(this.field900);
		}

		var3.orientation = this.orientation;
		var3.targetIndex = this.targetIndex;
		var3.pathTraversed[0] = this.pathTraversed;
		var3.plane = this.coord.plane;
		var3.worldView = var2;
		var3.actions = this.actions;
		var3.resetPath(this.coord.x - var2.baseX, this.coord.y - var2.baseY);
		return var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1837509137"
	)
	boolean method2203() {
		return this.field898 == -1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1105692368"
	)
	void method2204() {
		this.field898 = this.coord.method6789();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-535403897"
	)
	void method2205(int var1, int var2) {
		this.coord.method6790(this.field898, var1, var2);
		this.field898 = -1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-300282592"
	)
	int method2206() {
		return this.coord.plane;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-300605319"
	)
	void method2257(int var1) {
		this.coord.plane = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lkk;I)V",
		garbageValue = "1618042977"
	)
	void method2197(MoveSpeed var1) {
		for (int var2 = 0; var2 < this.field902.size(); ++var2) {
			Player var3 = (Player)this.field902.get(var2);
			WorldView var4 = var3.worldView;
			int var5 = this.coord.x - var4.baseX;
			int var6 = this.coord.y - var4.baseY;
			MoveSpeed var7 = var1;
			boolean var8 = true;
			boolean var9 = true;
			if (var3 == ClanSettings.entity && (var3.x < 1536 || var3.y < 1536 || var3.x >= 11776 || var3.y >= 11776)) {
				var7 = MoveSpeed.field3038;
			}

			var3.plane = this.coord.plane;
			if (var7 == MoveSpeed.field3038) {
				var3.resetPath(var5, var6);
			} else {
				var3.method2559(var4, var5, var6, var7);
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "1"
	)
	void method2209(Buffer var1) {
		this.field900 = var1;

		for (int var2 = 0; var2 < this.field902.size(); ++var2) {
			((Player)this.field902.get(var2)).read(this.field900);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-97"
	)
	void method2263(int var1, int var2) {
		for (int var3 = 0; var3 < this.field902.size(); ++var3) {
			class277.performPlayerAnimation((Player)this.field902.get(var3), var1, var2);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "255"
	)
	void method2253(int var1) {
		this.targetIndex = var1;

		for (int var2 = 0; var2 < this.field902.size(); ++var2) {
			((Actor)this.field902.get(var2)).targetIndex = var1;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "951234879"
	)
	void method2212(String var1) {
		String var2 = "";

		for (int var3 = 0; var3 < this.field902.size(); ++var3) {
			Player var4 = (Player)this.field902.get(var3);
			var4.field1279 = false;
			var4.field1297 = 0;
			var4.field1223 = 0;
			var4.overheadTextCyclesRemaining = 150;
			var4.overheadText = var1;
			var2 = var4.username.getName();
		}

		if (var1.charAt(0) == '~') {
			var1 = var1.substring(1);
			StructComposition.addGameMessage(2, var2, var1);
		} else if (this.field892 == Client.localPlayerIndex) {
			StructComposition.addGameMessage(2, var2, var1);
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-114"
	)
	void method2213(int var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < this.field902.size(); ++var6) {
			((Actor)this.field902.get(var6)).addHitSplat(var1, var2, var3, var4, Client.cycle, var5);
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "133843114"
	)
	void method2207(int var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < this.field902.size(); ++var6) {
			((Actor)this.field902.get(var6)).addHealthBar(var1, Client.cycle, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2077646750"
	)
	void method2215(int var1) {
		for (int var2 = 0; var2 < this.field902.size(); ++var2) {
			((Actor)this.field902.get(var2)).removeHealthBar(var1);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "67"
	)
	void method2216(int var1) {
		this.field897 = var1;

		for (int var2 = 0; var2 < this.field902.size(); ++var2) {
			Player var3 = (Player)this.field902.get(var2);
			var3.field1260 = this.field897;
			if (var3.pathLength == 0) {
				var3.orientation = this.field897;
				var3.method2670();
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILoq;ZLjava/lang/String;[BI)V",
		garbageValue = "1049874548"
	)
	void method2217(int var1, PlayerType var2, boolean var3, String var4, byte[] var5) {
		boolean var6 = false;
		String var7 = null;

		int var8;
		for (var8 = 0; var8 < this.field902.size(); ++var8) {
			Player var9 = (Player)this.field902.get(var8);
			if (var9.username != null && var9.appearance != null) {
				boolean var10 = false;
				if (var2.isUser && class425.friendSystem.isIgnored(var9.username)) {
					var10 = true;
				}

				if (!var10 && Client.field728 == 0 && !var9.isHidden) {
					var6 = true;
					var7 = var9.username.getName();
					var9.overheadText = var4.trim();
					var9.field1297 = var1 >> 8;
					var9.field1223 = var1 & 255;
					var9.overheadTextCyclesRemaining = 150;
					byte[] var13 = var5;
					int[] var12;
					if (var5 != null && var5.length != 0 && var5.length <= 8) {
						int[] var14 = new int[var5.length];
						int var15 = 0;

						while (true) {
							if (var15 >= var13.length) {
								var12 = var14;
								break;
							}

							if (var13[var15] < 0 || var13[var15] >= class574.field5577.length) {
								var12 = null;
								break;
							}

							var14[var15] = class574.field5577[var13[var15]];
							++var15;
						}
					} else {
						var12 = null;
					}

					var9.field1250 = var12;
					var9.field1279 = var3;
					var9.field1275 = var9 != AddRequestTask.localPlayer && var2.isUser && !Client.field745.isEmpty() && var4.toLowerCase().indexOf(Client.field745) == -1;
				}
			}
		}

		if (var6 && var7 != null) {
			if (var2.isPrivileged) {
				var8 = var3 ? 91 : 1;
			} else {
				var8 = var3 ? 90 : 2;
			}

			if (var2.modIcon != -1) {
				StructComposition.addGameMessage(var8, class201.method4066(var2.modIcon) + var7, var4);
			} else {
				StructComposition.addGameMessage(var8, var7, var4);
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZB)V",
		garbageValue = "-60"
	)
	void method2275(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
		for (int var9 = 0; var9 < this.field902.size(); ++var9) {
			Player var10 = (Player)this.field902.get(var9);
			var10.field1257 = var1;
			var10.field1248 = var2;
			var10.field1276 = var3;
			var10.field1231 = var4;
			var10.spotAnimation = var5;
			var10.field1233 = var6;
			var10.field1291 = var7;
			if (var8) {
				WorldView var11 = var10.worldView;
				int var12 = this.coord.x - var11.baseX;
				int var13 = this.coord.y - var11.baseY;
				var10.field1257 += var12;
				var10.field1248 += var13;
				var10.field1276 += var12;
				var10.field1231 += var13;
				var10.pathLength = 0;
			} else {
				var10.field1257 += var10.pathX[0];
				var10.field1248 += var10.pathY[0];
				var10.field1276 += var10.pathX[0];
				var10.field1231 += var10.pathY[0];
				var10.pathLength = 1;
			}

			var10.field1298 = 0;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;I)V",
		garbageValue = "1433910639"
	)
	void method2219(String[] var1) {
		this.actions = (String[])((String[])Arrays.copyOf(var1, var1.length));

		for (int var2 = 0; var2 < this.field902.size(); ++var2) {
			((Player)this.field902.get(var2)).actions = (String[])((String[])Arrays.copyOf(var1, var1.length));
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIBBBBI)V",
		garbageValue = "1508012926"
	)
	void method2240(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
		for (int var7 = 0; var7 < this.field902.size(); ++var7) {
			Player var8 = (Player)this.field902.get(var7);
			var8.field1284 = var1;
			var8.field1258 = var2;
			var8.field1259 = var3;
			var8.field1287 = var4;
			var8.field1288 = var5;
			var8.field1285 = var6;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "959368608"
	)
	void method2221(int var1, int var2, int var3, int var4) {
		for (int var5 = 0; var5 < this.field902.size(); ++var5) {
			((Actor)this.field902.get(var5)).updateSpotAnimation(var1, var2, var3, var4);
		}

	}
}
