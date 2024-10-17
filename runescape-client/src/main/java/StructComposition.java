import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("StructDefinition_archive")
	static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("StructDefinition_cached")
	static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	static GameBuild field2141;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	StructComposition() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1748145409"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvl;B)V",
		garbageValue = "0"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lvl;II)V",
		garbageValue = "136629228"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = DynamicObject.readStringIntParameters(var1, this.params);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-599941804"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class180.method3850(this.params, var1, var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1228695163"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class298.method6296(this.params, var1, var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lbz;I)V",
		garbageValue = "590094442"
	)
	static void method4156(GameEngine var0) {
		IndexCheck var1 = Client.indexCheck;
		IndexCheck var2 = var1;

		while (var2.method5650()) {
			if (var2.field2988 == 13) {
				Login.worldSelectOpen = false;
				Rasterizer2D.Rasterizer2D_fillRectangle(0, 0, Rasterizer2D.Rasterizer2D_width, Rasterizer2D.Rasterizer2D_height, 0);
				IntHashTable.leftTitleSprite.drawAt(Login.xPadding, 0);
				class544.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
				TriBool.logoSprite.drawAt(Login.xPadding + 382 - TriBool.logoSprite.subWidth / 2, 18);
				return;
			}

			if (var2.field2988 == 96) {
				if (Login.worldSelectPage > 0 && DesktopPlatformInfoProvider.worldSelectLeftSprite != null) {
					--Login.worldSelectPage;
				}
			} else if (var2.field2988 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class492.worldSelectRightSprite != null) {
				++Login.worldSelectPage;
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !class150.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
			int var3 = Login.xPadding + 280;
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class164.changeWorldSelectSorting(0, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class164.changeWorldSelectSorting(0, 1);
				return;
			}

			int var4 = Login.xPadding + 390;
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class164.changeWorldSelectSorting(1, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class164.changeWorldSelectSorting(1, 1);
				return;
			}

			int var5 = Login.xPadding + 500;
			if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class164.changeWorldSelectSorting(2, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class164.changeWorldSelectSorting(2, 1);
				return;
			}

			int var6 = Login.xPadding + 610;
			if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var6 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class164.changeWorldSelectSorting(3, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var6 + 15 && MouseHandler.MouseHandler_lastPressedX <= var6 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class164.changeWorldSelectSorting(3, 1);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
				Login.worldSelectOpen = false;
				Rasterizer2D.Rasterizer2D_fillRectangle(0, 0, Rasterizer2D.Rasterizer2D_width, Rasterizer2D.Rasterizer2D_height, 0);
				IntHashTable.leftTitleSprite.drawAt(Login.xPadding, 0);
				class544.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
				TriBool.logoSprite.drawAt(Login.xPadding + 382 - TriBool.logoSprite.subWidth / 2, 18);
				return;
			}

			if (Login.hoveredWorldIndex != -1) {
				World var7 = World.World_worlds[Login.hoveredWorldIndex];
				int var9 = Client.worldProperties;
				class552 var10 = class552.field5430;
				boolean var8 = (var9 & var10.rsOrdinal()) != 0;
				boolean var12 = var7.isDeadman();
				Client.field719 = var12;
				var7.field821 = var12 ? "beta" : var7.field821;
				class372.changeWorld(var7);
				Login.worldSelectOpen = false;
				Rasterizer2D.Rasterizer2D_fillRectangle(0, 0, Rasterizer2D.Rasterizer2D_width, Rasterizer2D.Rasterizer2D_height, 0);
				IntHashTable.leftTitleSprite.drawAt(Login.xPadding, 0);
				class544.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
				TriBool.logoSprite.drawAt(Login.xPadding + 382 - TriBool.logoSprite.subWidth / 2, 18);
				if (var12 != var8) {
					PcmPlayer.method833();
				}

				return;
			}

			if (Login.worldSelectPage > 0 && DesktopPlatformInfoProvider.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= DesktopPlatformInfoProvider.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class268.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class268.canvasHeight / 2 + 50) {
				--Login.worldSelectPage;
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && class492.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= HttpRequestTask.canvasWidth - class492.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= HttpRequestTask.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class268.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class268.canvasHeight / 2 + 50) {
				++Login.worldSelectPage;
			}
		}

	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Ldv;I)Z",
		garbageValue = "-943834878"
	)
	static boolean method4173(Player var0) {
		if (Client.drawPlayerNames == 0) {
			return false;
		} else if (SpriteMask.localPlayer != var0) {
			boolean var1 = (Client.drawPlayerNames & 4) != 0;
			boolean var2 = var1;
			if (!var1) {
				boolean var3 = (Client.drawPlayerNames & 1) != 0;
				var2 = var3 && var0.isFriend();
			}

			return var2 || class330.method6542() && var0.isFriendsChatMember();
		} else {
			return ClientPreferences.method2940();
		}
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(Lww;I)V",
		garbageValue = "-1688506433"
	)
	static final void method4174(Menu var0) {
		boolean var1 = false;

		while (!var1) {
			var1 = true;

			for (int var2 = 0; var2 < var0.menuOptionsCount - 1; ++var2) {
				if (var0.menuOpcodes[var2] < 1000 && var0.menuOpcodes[var2 + 1] > 1000) {
					String var3 = var0.menuTargets[var2];
					var0.menuTargets[var2] = var0.menuTargets[var2 + 1];
					var0.menuTargets[var2 + 1] = var3;
					String var4 = var0.menuActions[var2];
					var0.menuActions[var2] = var0.menuActions[var2 + 1];
					var0.menuActions[var2 + 1] = var4;
					Menu var5 = var0.subMenus[var2];
					var0.subMenus[var2] = var0.subMenus[var2 + 1];
					var0.subMenus[var2 + 1] = var5;
					int var6 = var0.menuOpcodes[var2];
					var0.menuOpcodes[var2] = var0.menuOpcodes[var2 + 1];
					var0.menuOpcodes[var2 + 1] = var6;
					var6 = var0.menuArguments1[var2];
					var0.menuArguments1[var2] = var0.menuArguments1[var2 + 1];
					var0.menuArguments1[var2 + 1] = var6;
					var6 = var0.menuArguments2[var2];
					var0.menuArguments2[var2] = var0.menuArguments2[var2 + 1];
					var0.menuArguments2[var2 + 1] = var6;
					var6 = var0.menuIdentifiers[var2];
					var0.menuIdentifiers[var2] = var0.menuIdentifiers[var2 + 1];
					var0.menuIdentifiers[var2 + 1] = var6;
					var6 = var0.menuItemIds[var2];
					var0.menuItemIds[var2] = var0.menuItemIds[var2 + 1];
					var0.menuItemIds[var2 + 1] = var6;
					var6 = var0.menuWorldViewIds[var2];
					var0.menuWorldViewIds[var2] = var0.menuWorldViewIds[var2 + 1];
					var0.menuWorldViewIds[var2 + 1] = var6;
					boolean var7 = var0.menuShiftClick[var2];
					var0.menuShiftClick[var2] = var0.menuShiftClick[var2 + 1];
					var0.menuShiftClick[var2 + 1] = var7;
					var1 = false;
				}
			}
		}

	}
}
