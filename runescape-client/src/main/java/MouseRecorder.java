import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("ap")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("aw")
	@Export("lock")
	Object lock;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -92678711
	)
	@Export("index")
	int index;
	@ObfuscatedName("aj")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("ai")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("ay")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; World.method2001(50L)) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lfl;",
		garbageValue = "-1219590039"
	)
	static class138 method2573(int var0) {
		class138 var1 = (class138)class177.findEnumerated(class508.method9433(), var0);
		if (var1 == null) {
			var1 = class138.field1625;
		}

		return var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lur;B)Ljava/lang/String;",
		garbageValue = "14"
	)
	public static String method2576(CharSequence var0, LoginType var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;

			int var3;
			for (var3 = var0.length(); var2 < var3 && VertexNormal.method5489(var0.charAt(var2)); ++var2) {
			}

			while (var3 > var2 && VertexNormal.method5489(var0.charAt(var3 - 1))) {
				--var3;
			}

			int var4 = var3 - var2;
			if (var4 >= 1 && var4 <= RouteStrategy.method5726(var1)) {
				StringBuilder var5 = new StringBuilder(var4);

				for (int var6 = var2; var6 < var3; ++var6) {
					char var7 = var0.charAt(var6);
					if (MusicPatchPcmStream.method6800(var7)) {
						char var8;
						switch(var7) {
						case ' ':
						case '-':
						case '_':
						case ' ':
							var8 = '_';
							break;
						case '#':
						case '[':
						case ']':
							var8 = var7;
							break;
						case 'À':
						case 'Á':
						case 'Â':
						case 'Ã':
						case 'Ä':
						case 'à':
						case 'á':
						case 'â':
						case 'ã':
						case 'ä':
							var8 = 'a';
							break;
						case 'Ç':
						case 'ç':
							var8 = 'c';
							break;
						case 'È':
						case 'É':
						case 'Ê':
						case 'Ë':
						case 'è':
						case 'é':
						case 'ê':
						case 'ë':
							var8 = 'e';
							break;
						case 'Í':
						case 'Î':
						case 'Ï':
						case 'í':
						case 'î':
						case 'ï':
							var8 = 'i';
							break;
						case 'Ñ':
						case 'ñ':
							var8 = 'n';
							break;
						case 'Ò':
						case 'Ó':
						case 'Ô':
						case 'Õ':
						case 'Ö':
						case 'ò':
						case 'ó':
						case 'ô':
						case 'õ':
						case 'ö':
							var8 = 'o';
							break;
						case 'Ù':
						case 'Ú':
						case 'Û':
						case 'Ü':
						case 'ù':
						case 'ú':
						case 'û':
						case 'ü':
							var8 = 'u';
							break;
						case 'ß':
							var8 = 'b';
							break;
						case 'ÿ':
						case 'Ÿ':
							var8 = 'y';
							break;
						default:
							var8 = Character.toLowerCase(var7);
						}

						if (var8 != 0) {
							var5.append(var8);
						}
					}
				}

				if (var5.length() == 0) {
					return null;
				} else {
					return var5.toString();
				}
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1280869037"
	)
	static final void method2575(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class357.field3813 || class133.field1546 != var1) {
			class357.field3813 = var0;
			class133.field1546 = var1;
			BuddyRankComparator.updateGameState(25);
			Client.field510 = true;
			ObjectComposition.drawLoadingMessage("Loading - please wait.", true);
			int var3 = class198.topLevelWorldView.baseX;
			int var4 = class198.topLevelWorldView.baseY;
			class198.topLevelWorldView.baseX = (var0 - 6) * 8;
			class198.topLevelWorldView.baseY = (var1 - 6) * 8;
			int var5 = class198.topLevelWorldView.baseX - var3;
			int var6 = class198.topLevelWorldView.baseY - var4;
			int var7 = var5 * 128;
			int var8 = var6 * 128;

			int var9;
			int var11;
			int[] var10000;
			for (var9 = 0; var9 < 65536; ++var9) {
				NPC var21 = class198.topLevelWorldView.npcs[var9];
				if (var21 != null) {
					for (var11 = 0; var11 < 10; ++var11) {
						var10000 = var21.pathX;
						var10000[var11] -= var5;
						var10000 = var21.pathY;
						var10000[var11] -= var6;
					}

					var21.x -= var7;
					var21.y -= var8;
					var21.field1268 -= var5;
					var21.field1228 -= var6;
					var21.field1286 -= var5;
					var21.field1271 -= var6;
				}
			}

			for (var9 = 0; var9 < 2048; ++var9) {
				Player var24 = class198.topLevelWorldView.players[var9];
				if (var24 != null) {
					for (var11 = 0; var11 < 10; ++var11) {
						var10000 = var24.pathX;
						var10000[var11] -= var5;
						var10000 = var24.pathY;
						var10000[var11] -= var6;
					}

					var24.x -= var7;
					var24.y -= var8;
					var24.field1268 -= var5;
					var24.field1228 -= var6;
					var24.field1286 -= var5;
					var24.field1271 -= var6;
				}
			}

			for (var9 = 0; var9 < 2048; ++var9) {
				WorldEntity var25 = class198.topLevelWorldView.worldEntities[var9];
				if (var25 != null) {
					var25.setPosition(-var7, -var8);
				}
			}

			byte var22 = 0;
			byte var10 = 104;
			byte var23 = 1;
			if (var5 < 0) {
				var22 = 103;
				var10 = -1;
				var23 = -1;
			}

			byte var12 = 0;
			byte var13 = 104;
			byte var14 = 1;
			if (var6 < 0) {
				var12 = 103;
				var13 = -1;
				var14 = -1;
			}

			int var16;
			for (int var15 = var22; var15 != var10; var15 += var23) {
				for (var16 = var12; var16 != var13; var16 += var14) {
					int var17 = var5 + var15;
					int var18 = var6 + var16;

					for (int var19 = 0; var19 < 4; ++var19) {
						if (0 <= var17 && var17 < 104 && 0 <= var18 && var18 < 104) {
							class198.topLevelWorldView.groundItems[var19][var15][var16] = class198.topLevelWorldView.groundItems[var19][var17][var18];
						} else {
							class198.topLevelWorldView.groundItems[var19][var15][var16] = null;
						}
					}
				}
			}

			for (PendingSpawn var20 = (PendingSpawn)class198.topLevelWorldView.pendingSpawns.last(); var20 != null; var20 = (PendingSpawn)class198.topLevelWorldView.pendingSpawns.previous()) {
				var20.x -= var5;
				var20.y -= var6;
				if (var20.x < 0 || 104 <= var20.x || var20.y < 0 || 104 <= var20.y) {
					var20.remove();
				}
			}

			if (Client.destinationX != 0) {
				Client.destinationX -= var5;
				Client.destinationY -= var6;
			}

			Client.soundEffectCount = 0;
			Client.isCameraLocked = false;
			AsyncHttpResponse.cameraX -= var5 << 7;
			PlayerType.cameraZ -= var6 << 7;
			ArchiveDisk.oculusOrbFocalPointX -= var5 << 7;
			class298.oculusOrbFocalPointY -= var6 << 7;
			Client.field578 = -1;
			class198.topLevelWorldView.graphicsObjects.clear();
			class198.topLevelWorldView.projectiles.clear();

			for (var16 = 0; var16 < 4; ++var16) {
				class198.topLevelWorldView.collisionMaps[var16].clear();
			}

		}
	}
}
