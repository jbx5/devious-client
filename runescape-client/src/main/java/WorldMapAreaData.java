import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("az")
	HashSet field2744;
	@ObfuscatedName("ax")
	HashSet field2745;
	@ObfuscatedName("ac")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Lvp;Lvp;IZI)V",
		garbageValue = "-580518776"
	)
	void method5100(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.method4649(var1, var3);
		int var5 = var2.readUnsignedShort();
		this.field2744 = new HashSet(var5);

		int var6;
		for (var6 = 0; var6 < var5; ++var6) {
			WorldMapData_0 var7 = new WorldMapData_0();

			try {
				var7.init(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.field2744.add(var7);
		}

		var6 = var2.readUnsignedShort();
		this.field2745 = new HashSet(var6);

		for (int var10 = 0; var10 < var6; ++var10) {
			WorldMapData_1 var8 = new WorldMapData_1();

			try {
				var8.init(var2);
			} catch (IllegalStateException var11) {
				continue;
			}

			this.field2745.add(var8);
		}

		this.initIconsList(var2, var4);
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Lvp;ZI)V",
		garbageValue = "-242900480"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList();
		int var3 = var1.readUnsignedShort();

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = var1.readNullableLargeSmart();
			Coord var6 = new Coord(var1.readInt());
			boolean var7 = var1.readUnsignedByte() == 1;
			if (var2 || !var7) {
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null));
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lbs;I)V",
		garbageValue = "2079882661"
	)
	static void method5107(GameEngine var0) {
		IndexCheck var1 = Client.indexCheck;
		IndexCheck var2 = var1;

		while (var2.method4382()) {
			if (var2.field2460 == 13) {
				Login.worldSelectOpen = false;
				Login.leftTitleSprite.drawAt(Login.xPadding, 0);
				class189.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
				ArchiveDiskActionHandler.logoSprite.drawAt(Login.xPadding + 382 - ArchiveDiskActionHandler.logoSprite.subWidth / 2, 18);
				return;
			}

			if (var2.field2460 == 96) {
				if (Login.worldSelectPage > 0 && class31.worldSelectLeftSprite != null) {
					--Login.worldSelectPage;
				}
			} else if (var2.field2460 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && Calendar.worldSelectRightSprite != null) {
				++Login.worldSelectPage;
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !World.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
			int var3 = Login.xPadding + 280;
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				HealthBar.changeWorldSelectSorting(0, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				HealthBar.changeWorldSelectSorting(0, 1);
				return;
			}

			int var4 = Login.xPadding + 390;
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				HealthBar.changeWorldSelectSorting(1, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				HealthBar.changeWorldSelectSorting(1, 1);
				return;
			}

			int var5 = Login.xPadding + 500;
			if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				HealthBar.changeWorldSelectSorting(2, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				HealthBar.changeWorldSelectSorting(2, 1);
				return;
			}

			int var6 = Login.xPadding + 610;
			if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var6 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				HealthBar.changeWorldSelectSorting(3, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var6 + 15 && MouseHandler.MouseHandler_lastPressedX <= var6 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				HealthBar.changeWorldSelectSorting(3, 1);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
				Login.worldSelectOpen = false;
				Login.leftTitleSprite.drawAt(Login.xPadding, 0);
				class189.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
				ArchiveDiskActionHandler.logoSprite.drawAt(Login.xPadding + 382 - ArchiveDiskActionHandler.logoSprite.subWidth / 2, 18);
				return;
			}

			if (Login.hoveredWorldIndex != -1) {
				World var7 = class357.World_worlds[Login.hoveredWorldIndex];
				boolean var8 = NpcOverrides.method3699(Client.worldProperties, class542.field5331);
				boolean var9 = var7.isDeadman();
				class4.field9 = var9;
				var7.field819 = var9 ? "beta" : var7.field819;
				ScriptEvent.changeWorld(var7);
				Login.worldSelectOpen = false;
				Login.leftTitleSprite.drawAt(Login.xPadding, 0);
				class189.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
				ArchiveDiskActionHandler.logoSprite.drawAt(Login.xPadding + 382 - ArchiveDiskActionHandler.logoSprite.subWidth / 2, 18);
				if (var9 != var8) {
					class36.method708();
				}

				return;
			}

			if (Login.worldSelectPage > 0 && class31.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class31.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class1.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class1.canvasHeight / 2 + 50) {
				--Login.worldSelectPage;
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && Calendar.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class74.canvasWidth - Calendar.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class74.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class1.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class1.canvasHeight / 2 + 50) {
				++Login.worldSelectPage;
			}
		}

	}
}
