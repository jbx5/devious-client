import java.applet.Applet;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("fe")
public class class132 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1487779715
	)
	int field1554;
	@ObfuscatedName("ae")
	float field1555;
	@ObfuscatedName("ag")
	float field1556;
	@ObfuscatedName("am")
	float field1557;
	@ObfuscatedName("ax")
	float field1558;
	@ObfuscatedName("aq")
	float field1559;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	class132 field1560;

	class132() {
		this.field1556 = Float.MAX_VALUE;
		this.field1557 = Float.MAX_VALUE;
		this.field1558 = Float.MAX_VALUE;
		this.field1559 = Float.MAX_VALUE;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;II)V",
		garbageValue = "-378304652"
	)
	void method3249(Buffer var1, int var2) {
		this.field1554 = var1.readShort();
		this.field1555 = var1.method9934();
		this.field1556 = var1.method9934();
		this.field1557 = var1.method9934();
		this.field1558 = var1.method9934();
		this.field1559 = var1.method9934();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;S)Z",
		garbageValue = "148"
	)
	static boolean method3255(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class31.field143.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var11.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var5) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Object var10 = class26.method376(class31.field147, var2, new Object[]{(new URL(class31.field147.getCodeBase(), var0)).toString()});
				return var10 != null;
			} catch (Throwable var6) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class31.field147.getAppletContext().showDocument(new URL(class31.field147.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var7) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Applet var3 = class31.field147;
				JSObject.getWindow(var3).call("loggedout", (Object[])null);
			} catch (Throwable var9) {
			}

			try {
				class31.field147.getAppletContext().showDocument(new URL(class31.field147.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var8) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([I[IIII)V",
		garbageValue = "-1486251795"
	)
	public static void method3256(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method3256(var0, var1, var2, var5 - 1);
			method3256(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lpo;II)V",
		garbageValue = "-949517220"
	)
	public static void method3248(AbstractArchive var0, int var1) {
		if (!class334.field3619.isEmpty()) {
			ArrayList var2 = new ArrayList();
			Iterator var3 = class334.field3619.iterator();

			while (var3.hasNext()) {
				MusicSong var4 = (MusicSong)var3.next();
				var4.field3733 = false;
				var4.field3739 = false;
				var4.field3734 = false;
				var4.field3735 = false;
				var4.musicTrackArchive = var0;
				var4.musicTrackVolume = var1;
				var4.field3730 = 0.0F;
				var2.add(var4);
			}

			class180.method3804(var2, class334.musicPlayerStatus, class334.field3614, class334.field3624, class334.field3625, false);
		}
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Ldd;ZI)V",
		garbageValue = "-1569831656"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(WorldView var0, boolean var1) {
		for (int var2 = 0; var2 < var0.npcCount; ++var2) {
			NPC var3 = var0.npcs[var0.npcIndices[var2]];
			if (var3 != null && var3.isVisible() && var3.definition.isVisible == var1 && var3.definition.transformIsVisible()) {
				int var4 = var0.plane;
				int var5 = var3.x >> 7;
				int var6 = var3.y >> 7;
				if (var5 >= 0 && var5 < var0.sizeX && var6 >= 0 && var6 < var0.sizeY) {
					if (var3.field1227 == 1 && (var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.tileLastDrawnActor[var5][var6] == Client.viewportDrawCount) {
							continue;
						}

						var0.tileLastDrawnActor[var5][var6] = Client.viewportDrawCount;
					}

					long var7 = class273.calculateTag(0, 0, 1, !var3.definition.isInteractable, var0.npcIndices[var2], var0.id);
					var3.playerCycle = Client.cycle;
					int var9 = VarcInt.getTileHeight(var0, var3.field1227 * 64 - 64 + var3.x, var3.field1227 * 64 - 64 + var3.y, var4);
					var0.scene.drawEntity(var4, var3.x, var3.y, var9, var3.field1227 * 64 - 64 + 60, var3, var3.rotation, var7, var3.isWalking);
				}
			}
		}

	}

	@ObfuscatedName("nr")
	static final void method3252(double var0) {
		Rasterizer3D.buildPalette(var0);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(var0);
		if (UserComparator8.worldMap != null) {
			UserComparator8.worldMap.method9363();
		}

		class139.method3374();
		class461.clientPreferences.updateBrightness(var0);
	}
}
