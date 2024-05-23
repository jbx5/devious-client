import java.util.ArrayList;
import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
public class class27 {
	@ObfuscatedName("at")
	int[] field141;
	@ObfuscatedName("ab")
	int[] field139;

	public class27() {
		this.field141 = new int[112];
		this.field139 = new int[192];
		Arrays.fill(this.field141, 3);
		Arrays.fill(this.field139, 3);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2058229385"
	)
	public void method381(int var1, int var2) {
		if (this.method389(var1) && this.method391(var2)) {
			this.field141[var1] = var2;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CIB)V",
		garbageValue = "-119"
	)
	public void method382(char var1, int var2) {
		if (this.method390(var1) && this.method391(var2)) {
			this.field139[var1] = var2;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "986435640"
	)
	public int method400(int var1) {
		return this.method389(var1) ? this.field141[var1] : 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(CI)I",
		garbageValue = "-5587874"
	)
	public int method386(char var1) {
		return this.method390(var1) ? this.field139[var1] : 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "15"
	)
	public boolean method385(int var1) {
		return this.method389(var1) && (this.field141[var1] == 1 || this.field141[var1] == 3);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-2011848427"
	)
	public boolean method383(char var1) {
		return this.method390(var1) && (this.field139[var1] == 1 || this.field139[var1] == 3);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-892573738"
	)
	public boolean method387(int var1) {
		return this.method389(var1) && (this.field141[var1] == 2 || this.field141[var1] == 3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "79"
	)
	public boolean method388(char var1) {
		return this.method390(var1) && (this.field139[var1] == 2 || this.field139[var1] == 3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1616829006"
	)
	boolean method389(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1888085464"
	)
	boolean method390(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "942286846"
	)
	boolean method391(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "95"
	)
	static final void method416() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) {
			int var10002 = Client.queuedSoundEffectDelays[var0]--;
			if (Client.queuedSoundEffectDelays[var0] >= -10) {
				SoundEffect var11 = Client.soundEffects[var0];
				if (var11 == null) {
					Object var10000 = null;
					var11 = SoundEffect.readSoundEffect(class135.field1637, Client.soundEffectIds[var0], 0);
					if (var11 == null) {
						continue;
					}

					int[] var16 = Client.queuedSoundEffectDelays;
					var16[var0] += var11.calculateDelay();
					Client.soundEffects[var0] = var11;
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) {
					int var2;
					if (Client.soundLocations[var0] != 0) {
						int var3 = (Client.soundLocations[var0] & 255) * 128;
						int var4 = Client.soundLocations[var0] >> 16 & 255;
						int var5 = Math.abs(var4 * 128 + 64 - class17.localPlayer.x);
						int var6 = Client.soundLocations[var0] >> 8 & 255;
						int var7 = Math.abs(var6 * 128 + 64 - class17.localPlayer.y);
						int var8 = Math.max(var7 + var5 - 128, 0);
						int var9 = Math.max(((Client.field785[var0] & 31) - 1) * 128, 0);
						if (var8 >= var3) {
							Client.queuedSoundEffectDelays[var0] = -100;
							continue;
						}

						float var10 = var9 < var3 ? Math.min(Math.max((float)(var3 - var8) / (float)(var3 - var9), 0.0F), 1.0F) : 1.0F;
						var2 = (int)(var10 * (float)class459.clientPreferences.getAreaSoundEffectsVolume());
					} else {
						var2 = class459.clientPreferences.getSoundEffectsVolume();
					}

					if (var2 > 0) {
						RawSound var12 = var11.toRawSound().resample(HealthBar.decimator);
						RawPcmStream var13 = RawPcmStream.createRawPcmStream(var12, 100, var2);
						var13.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1);
						class349.pcmStreamMixer.addSubStream(var13);
					}

					Client.queuedSoundEffectDelays[var0] = -100;
				}
			} else {
				--Client.soundEffectCount;

				for (int var1 = var0; var1 < Client.soundEffectCount; ++var1) {
					Client.soundEffectIds[var1] = Client.soundEffectIds[var1 + 1];
					Client.soundEffects[var1] = Client.soundEffects[var1 + 1];
					Client.queuedSoundEffectLoops[var1] = Client.queuedSoundEffectLoops[var1 + 1];
					Client.queuedSoundEffectDelays[var1] = Client.queuedSoundEffectDelays[var1 + 1];
					Client.soundLocations[var1] = Client.soundLocations[var1 + 1];
					Client.field785[var1] = Client.field785[var1 + 1];
				}

				--var0;
			}
		}

		if (Client.playingJingle) {
			boolean var14;
			if (!class329.field3581.isEmpty()) {
				var14 = true;
			} else if (!class329.musicSongs.isEmpty() && class329.musicSongs.get(0) != null && ((MusicSong)class329.musicSongs.get(0)).midiPcmStream != null) {
				var14 = ((MusicSong)class329.musicSongs.get(0)).midiPcmStream.isReady();
			} else {
				var14 = false;
			}

			if (!var14) {
				if (class459.clientPreferences.getMusicVolume() != 0) {
					boolean var15 = !class329.field3579.isEmpty();
					if (var15) {
						WorldMapLabel.method5938(GameObject.archive6, class459.clientPreferences.getMusicVolume());
					}
				}

				Client.playingJingle = false;
			}
		}

	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "507394209"
	)
	static void method414(int var0, int var1) {
		if (class459.clientPreferences.getMusicVolume() != 0 && var0 != -1) {
			ArrayList var2 = new ArrayList();
			var2.add(new MusicSong(class333.field3643, var0, 0, class459.clientPreferences.getMusicVolume(), false));
			ScriptFrame.method1169(var2, 0, 0, 0, 0, true);
			Client.playingJingle = true;
		}

	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1425892999"
	)
	static final void method415(int var0, int var1, int var2, int var3, int var4) {
		Scene var5 = class358.scene.field1331;
		long var6 = var5.getBoundaryObjectTag(var0, var1, var2);
		int var8;
		int var9;
		int var10;
		int var11;
		int var14;
		int var15;
		if (var6 != 0L) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = var3;
			boolean var12 = var6 != 0L && !class74.method2110(var6);
			if (var12) {
				var11 = var4;
			}

			int[] var13 = HealthBarUpdate.field1287.pixels;
			var14 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var15 = class105.method2748(var6);
			ObjectComposition var16 = HitSplatDefinition.getObjectDefinition(var15);
			if (var16.mapSceneId != -1) {
				IndexedSprite var17 = AsyncRestClient.mapSceneSprites[var16.mapSceneId];
				if (var17 != null) {
					int var18 = (var16.sizeX * 4 - var17.subWidth) / 2;
					int var19 = (var16.sizeY * 4 - var17.subHeight * -1758859088) / 2;
					var17.drawAt(var18 + var1 * 4 + 48, var19 + (104 - var2 - var16.sizeY) * 4 + 48);
				}
			} else {
				if (var10 == 0 || var10 == 2) {
					if (var9 == 0) {
						var13[var14] = var11;
						var13[var14 + 512] = var11;
						var13[var14 + 1024] = var11;
						var13[var14 + 1536] = var11;
					} else if (var9 == 1) {
						var13[var14] = var11;
						var13[var14 + 1] = var11;
						var13[var14 + 2] = var11;
						var13[var14 + 3] = var11;
					} else if (var9 == 2) {
						var13[var14 + 3] = var11;
						var13[var14 + 512 + 3] = var11;
						var13[var14 + 1024 + 3] = var11;
						var13[var14 + 1536 + 3] = var11;
					} else if (var9 == 3) {
						var13[var14 + 1536] = var11;
						var13[var14 + 1536 + 1] = var11;
						var13[var14 + 1536 + 2] = var11;
						var13[var14 + 1536 + 3] = var11;
					}
				}

				if (var10 == 3) {
					if (var9 == 0) {
						var13[var14] = var11;
					} else if (var9 == 1) {
						var13[var14 + 3] = var11;
					} else if (var9 == 2) {
						var13[var14 + 1536 + 3] = var11;
					} else if (var9 == 3) {
						var13[var14 + 1536] = var11;
					}
				}

				if (var10 == 2) {
					if (var9 == 3) {
						var13[var14] = var11;
						var13[var14 + 512] = var11;
						var13[var14 + 1024] = var11;
						var13[var14 + 1536] = var11;
					} else if (var9 == 0) {
						var13[var14] = var11;
						var13[var14 + 1] = var11;
						var13[var14 + 2] = var11;
						var13[var14 + 3] = var11;
					} else if (var9 == 1) {
						var13[var14 + 3] = var11;
						var13[var14 + 512 + 3] = var11;
						var13[var14 + 1024 + 3] = var11;
						var13[var14 + 1536 + 3] = var11;
					} else if (var9 == 2) {
						var13[var14 + 1536] = var11;
						var13[var14 + 1536 + 1] = var11;
						var13[var14 + 1536 + 2] = var11;
						var13[var14 + 1536 + 3] = var11;
					}
				}
			}
		}

		var6 = var5.getGameObjectTag(var0, var1, var2);
		if (var6 != 0L) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = class105.method2748(var6);
			ObjectComposition var20 = HitSplatDefinition.getObjectDefinition(var11);
			if (var20.mapSceneId != -1) {
				IndexedSprite var27 = AsyncRestClient.mapSceneSprites[var20.mapSceneId];
				if (var27 != null) {
					var14 = (var20.sizeX * 4 - var27.subWidth) / 2;
					var15 = (var20.sizeY * 4 - var27.subHeight * -1758859088) / 2;
					var27.drawAt(var14 + var1 * 4 + 48, (104 - var2 - var20.sizeY) * 4 + var15 + 48);
				}
			} else if (var10 == 9) {
				int var21 = 15658734;
				boolean var28 = 0L != var6 && !class74.method2110(var6);
				if (var28) {
					var21 = 15597568;
				}

				int[] var22 = HealthBarUpdate.field1287.pixels;
				int var23 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var9 != 0 && var9 != 2) {
					var22[var23] = var21;
					var22[var23 + 1 + 512] = var21;
					var22[var23 + 1024 + 2] = var21;
					var22[var23 + 1536 + 3] = var21;
				} else {
					var22[var23 + 1536] = var21;
					var22[var23 + 1 + 1024] = var21;
					var22[var23 + 512 + 2] = var21;
					var22[var23 + 3] = var21;
				}
			}
		}

		var6 = var5.getFloorDecorationTag(var0, var1, var2);
		if (var6 != 0L) {
			var8 = class105.method2748(var6);
			ObjectComposition var24 = HitSplatDefinition.getObjectDefinition(var8);
			if (var24.mapSceneId != -1) {
				IndexedSprite var25 = AsyncRestClient.mapSceneSprites[var24.mapSceneId];
				if (var25 != null) {
					var11 = (var24.sizeX * 4 - var25.subWidth) / 2;
					int var26 = (var24.sizeY * 4 - var25.subHeight * -1758859088) / 2;
					var25.drawAt(var11 + var1 * 4 + 48, var26 + (104 - var2 - var24.sizeY) * 4 + 48);
				}
			}
		}

	}
}
