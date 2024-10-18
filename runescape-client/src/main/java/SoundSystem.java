import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lbm;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1];
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var4) {
			HttpHeaders.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(BI)Lkk;",
		garbageValue = "-882697113"
	)
	public static MoveSpeed method862(byte var0) {
		MoveSpeed[] var1 = MoveSpeed.field3056;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			MoveSpeed var3 = var1[var2];
			if (var0 == var3.id) {
				return var3;
			}
		}

		throw new RuntimeException("Could not find MoveSpeed with ID " + var0);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2134066588"
	)
	public static void method859() {
		FileSystem.FileSystem_cacheFiles.clear();
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(Ldn;B)V",
		garbageValue = "7"
	)
	static void method861(WorldView var0) {
		int var1 = Client.playerUpdateManager.playerCount;
		int[] var2 = Client.playerUpdateManager.playerIndices;

		for (int var3 = 0; var3 < var1; ++var3) {
			if (var2[var3] != Client.combatTargetPlayerIndex && var2[var3] != Client.localPlayerIndex) {
				Friend.addPlayerToScene(var0, var2[var3], true);
			}
		}

	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-473819764"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class147.scrollBarSprites[0].drawAt(var0, var1);
		class147.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field584);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field678);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field556);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field556);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field556);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field556);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field714);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field714);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var5 + var1 + 15, 16, Client.field714);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field714);
	}
}
