import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
public class class202 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1780874977
	)
	public int field2107;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1140378407
	)
	public int field2108;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 683378459
	)
	public int field2109;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1328376621
	)
	public int field2113;

	class202(int var1, int var2, int var3, int var4) {
		this.field2107 = 0;
		this.field2108 = 0;
		this.field2109 = 0;
		this.field2113 = 0;
		this.field2107 = var1;
		this.field2108 = var2;
		this.field2109 = var3;
		this.field2113 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BI)Lvd;",
		garbageValue = "1978049322"
	)
	public static final SpritePixels method3920(byte[] var0) {
		BufferedImage var1 = null;

		try {
			Class var2 = ImageIO.class;
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			int var6 = var1.getWidth();
			int var7 = var1.getHeight();
			int[] var4 = new int[var7 * var6];
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6);
			var5.grabPixels();
			return new SpritePixels(var4, var6, var7);
		} catch (IOException var9) {
		} catch (InterruptedException var10) {
		}

		return new SpritePixels(0, 0);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lbm;I)V",
		garbageValue = "-1796017443"
	)
	static void method3919(GameEngine var0) {
		class228 var1 = PacketBufferNode.method6051();

		while (var1.method4431()) {
			if (var1.field2434 == 13) {
				AbstractWorldMapData.method5005();
				return;
			}

			if (var1.field2434 == 96) {
				if (Login.worldSelectPage > 0 && WorldMapSectionType.worldSelectLeftSprite != null) {
					--Login.worldSelectPage;
				}
			} else if (var1.field2434 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class516.worldSelectRightSprite != null) {
				++Login.worldSelectPage;
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !DbTableType.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
			int var2 = Login.xPadding + 280;
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				MusicPatch.changeWorldSelectSorting(0, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				MusicPatch.changeWorldSelectSorting(0, 1);
				return;
			}

			int var3 = Login.xPadding + 390;
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				MusicPatch.changeWorldSelectSorting(1, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				MusicPatch.changeWorldSelectSorting(1, 1);
				return;
			}

			int var4 = Login.xPadding + 500;
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				MusicPatch.changeWorldSelectSorting(2, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				MusicPatch.changeWorldSelectSorting(2, 1);
				return;
			}

			int var5 = Login.xPadding + 610;
			if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				MusicPatch.changeWorldSelectSorting(3, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				MusicPatch.changeWorldSelectSorting(3, 1);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
				AbstractWorldMapData.method5005();
				return;
			}

			if (Login.hoveredWorldIndex != -1) {
				World var6 = WorldMapID.World_worlds[Login.hoveredWorldIndex];
				boolean var7 = class59.method1133(Client.worldProperties, class529.field5174);
				boolean var8 = var6.isDeadman();
				WorldMapScaleHandler.field2696 = var8;
				var6.field850 = var8 ? "beta" : var6.field850;
				class246.changeWorld(var6);
				AbstractWorldMapData.method5005();
				if (var8 != var7) {
					class371.method7026();
				}

				return;
			}

			if (Login.worldSelectPage > 0 && WorldMapSectionType.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= WorldMapSectionType.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= WorldMapArea.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= WorldMapArea.canvasHeight / 2 + 50) {
				--Login.worldSelectPage;
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && class516.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GameEngine.canvasWidth - class516.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GameEngine.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= WorldMapArea.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= WorldMapArea.canvasHeight / 2 + 50) {
				++Login.worldSelectPage;
			}
		}

	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(ILns;ZI)V",
		garbageValue = "660409340"
	)
	static void method3918(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class485.getWorldMap().getMapArea(var0);
		int var4 = VarpDefinition.localPlayer.plane;
		int var5 = Projectile.baseX * 64 + (VarpDefinition.localPlayer.x >> 7);
		int var6 = GameEngine.baseY * 64 + (VarpDefinition.localPlayer.y >> 7);
		Coord var7 = new Coord(var4, var5, var6);
		class485.getWorldMap().method8925(var3, var7, var1, var2);
	}
}
