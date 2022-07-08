import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("ee")
public class class151 extends class144 {
	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1270572839)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;

	@ObfuscatedName("c")
	String field1712;

	@ObfuscatedName("v")
	byte field1710;

	@ObfuscatedName("q")
	byte field1711;

	@ObfuscatedSignature(descriptor = "Leu;")
	final class145 this$0;

	@ObfuscatedSignature(descriptor = "(Leu;)V")
	class151(class145 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqt;I)V", garbageValue = "355261812")
	void vmethod3137(Buffer var1) {
		this.field1712 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1712 != null) {
			var1.readUnsignedByte();
			this.field1710 = var1.readByte();
			this.field1711 = var1.readByte();
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lex;I)V", garbageValue = "1368590037")
	void vmethod3138(ClanChannel var1) {
		var1.name = this.field1712;
		if (this.field1712 != null) {
			var1.field1695 = this.field1710;
			var1.field1696 = this.field1711;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)Lbc;", garbageValue = "1585435431")
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return Interpreter.getNextWorldListWorld();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lap;S)V", garbageValue = "-24407")
	static void method3136(GameEngine var0) {
		while (class18.isKeyDown()) {
			if (class272.field3196 == 13) {
				Tiles.method2021();
				return;
			}
			if (class272.field3196 == 96) {
				if (Login.worldSelectPage > 0 && class266.worldSelectLeftSprite != null) {
					--Login.worldSelectPage;
				}
			} else if (class272.field3196 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && SceneTilePaint.worldSelectRightSprite != null) {
				++Login.worldSelectPage;
			}
		} 
		if (MouseHandler.MouseHandler_lastButton == 1 || !class122.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
			int var1 = Login.xPadding + 280;
			if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				ReflectionCheck.changeWorldSelectSorting(0, 0);
				return;
			}
			if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				ReflectionCheck.changeWorldSelectSorting(0, 1);
				return;
			}
			int var2 = Login.xPadding + 390;
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				ReflectionCheck.changeWorldSelectSorting(1, 0);
				return;
			}
			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				ReflectionCheck.changeWorldSelectSorting(1, 1);
				return;
			}
			int var3 = Login.xPadding + 500;
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				ReflectionCheck.changeWorldSelectSorting(2, 0);
				return;
			}
			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				ReflectionCheck.changeWorldSelectSorting(2, 1);
				return;
			}
			int var4 = Login.xPadding + 610;
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				ReflectionCheck.changeWorldSelectSorting(3, 0);
				return;
			}
			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				ReflectionCheck.changeWorldSelectSorting(3, 1);
				return;
			}
			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
				Tiles.method2021();
				return;
			}
			if (Login.hoveredWorldIndex != -1) {
				World var5 = class362.World_worlds[Login.hoveredWorldIndex];
				class295.changeWorld(var5);
				Tiles.method2021();
				return;
			}
			if (Login.worldSelectPage > 0 && class266.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class266.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class78.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class78.canvasHeight / 2 + 50) {
				--Login.worldSelectPage;
			}
			if (Login.worldSelectPage < Login.worldSelectPagesCount && SceneTilePaint.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= Script.canvasWidth - SceneTilePaint.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= Script.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class78.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class78.canvasHeight / 2 + 50) {
				++Login.worldSelectPage;
			}
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(descriptor = "(Lcg;I)V", garbageValue = "47717415")
	static final void method3146(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = class356.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}
		if (var0.type == 1) {
			var1 = class356.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}
		if (var0.type == 2) {
			var1 = class356.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}
		if (var0.type == 3) {
			var1 = class356.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}
		if (0L != var1) {
			int var6 = class356.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = Decimator.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = var6 >> 6 & 3;
		}
		var0.objectId = var3;
		var0.field1122 = var4;
		var0.field1121 = var5;
	}
}