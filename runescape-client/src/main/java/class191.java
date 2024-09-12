import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
public class class191 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("field2026")
	public static EvictingDualNodeHashTable field2026;
	@ObfuscatedName("au")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;

	static {
		field2026 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1020539214"
	)
	static void method3951() {
		if ((Client.worldProperties & class545.field5389.rsOrdinal()) != 0) {
			Login.Login_response0 = "";
			Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
			Login.Login_response2 = "Your normal account will not be affected.";
			Login.Login_response3 = "";
			LoginState.updateLoginIndex(1);
			class107.focusPasswordWhenUsernameFilled();
		} else if ((Client.worldProperties & class545.field5366.rsOrdinal()) != 0) {
			if ((Client.worldProperties & class545.field5374.rsOrdinal()) != 0) {
				Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
				Login.Login_response2 = "Players can attack each other almost everywhere";
				Login.Login_response3 = "and the Protect Item prayer won't work.";
			} else {
				Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
				Login.Login_response2 = "Players can attack each other";
				Login.Login_response3 = "almost everywhere.";
			}

			Login.Login_response0 = "Warning!";
			LoginState.updateLoginIndex(1);
			class107.focusPasswordWhenUsernameFilled();
		} else if ((Client.worldProperties & class545.field5374.rsOrdinal()) != 0) {
			Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
			Login.Login_response2 = "The Protect Item prayer will";
			Login.Login_response3 = "not work on this world.";
			Login.Login_response0 = "Warning!";
			LoginState.updateLoginIndex(1);
			class107.focusPasswordWhenUsernameFilled();
		} else {
			RouteStrategy.Login_promptCredentials(false);
		}

	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-62614915"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field785;
		} else if (var5 >= 100) {
			var6 = Client.field786;
		} else {
			var6 = (Client.field786 - Client.field785) * var5 / 100 + Client.field785;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var15;
		if (var7 < Client.field791) {
			var15 = Client.field791;
			var6 = var15 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field790) {
				var6 = Client.field790;
				var8 = var3 * var6 * 512 / (var15 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field792) {
			var15 = Client.field792;
			var6 = var15 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field727) {
				var6 = Client.field727;
				var8 = var15 * var2 * 334 / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = var3 * var6 / 334;
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
			int[] var14 = new int[9];

			for (var9 = 0; var9 < var14.length; ++var9) {
				int var10 = var9 * 32 + 15 + 128;
				int var11 = var10 * 3 + 600;
				int var13 = Rasterizer3D.Rasterizer3D_sine[var10];
				int var12 = UrlRequester.method3141(var11, var3);
				var14[var9] = var13 * var12 >> 16;
			}

			ClientPreferences.topLevelWorldView.scene.method4944(var14, 500, 800, var2 * 334 / var3, 334);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}
