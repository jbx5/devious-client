import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
@Implements("PlayerCompositionColorTextureOverride")
public class PlayerCompositionColorTextureOverride {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 331775757
	)
	public static int field1886;
	@ObfuscatedName("ht")
	static SecureRandom field1892;
	@ObfuscatedName("ut")
	@ObfuscatedGetter(
		intValue = -1402221440
	)
	static int field1890;
	@ObfuscatedName("ar")
	@Export("playerCompositionRecolorTo")
	public short[] playerCompositionRecolorTo;
	@ObfuscatedName("am")
	@Export("playerCompositionRetextureTo")
	public short[] playerCompositionRetextureTo;

	public PlayerCompositionColorTextureOverride(int var1) {
		ItemComposition var2 = class125.ItemDefinition_get(var1);
		if (var2.method3989()) {
			this.playerCompositionRecolorTo = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.playerCompositionRecolorTo, 0, this.playerCompositionRecolorTo.length);
		}

		if (var2.method3982()) {
			this.playerCompositionRetextureTo = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.playerCompositionRetextureTo, 0, this.playerCompositionRetextureTo.length);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-1206238469"
	)
	public static void method3575(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		JagexCache.field1840 = var4;
		UserList.cacheGamebuild = var3;

		try {
			class424.field4617 = System.getProperty("os.name");
		} catch (Exception var36) {
			class424.field4617 = "Unknown";
		}

		CollisionMap.field2347 = class424.field4617.toLowerCase();
		Bounds.userHomeDirectory = null;

		try {
			Bounds.userHomeDirectory = System.getProperty("jagex.userhome");
		} catch (Exception var35) {
		}

		if (Bounds.userHomeDirectory == null) {
			try {
				Bounds.userHomeDirectory = System.getProperty("user.home");
			} catch (Exception var34) {
			}
		}

		if (Bounds.userHomeDirectory != null) {
			Bounds.userHomeDirectory = Bounds.userHomeDirectory + "/";
		}

		try {
			if (CollisionMap.field2347.startsWith("win")) {
				if (Bounds.userHomeDirectory == null) {
					Bounds.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (Bounds.userHomeDirectory == null) {
				Bounds.userHomeDirectory = System.getenv("HOME");
			}

			if (Bounds.userHomeDirectory != null) {
				Bounds.userHomeDirectory = Bounds.userHomeDirectory + "/";
			}
		} catch (Exception var33) {
		}

		if (Bounds.userHomeDirectory == null) {
			Bounds.userHomeDirectory = "~/";
		}

		class157.field1745 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Bounds.userHomeDirectory, "/tmp/", ""};
		ByteArrayPool.field4541 = new String[]{".jagex_cache_" + UserList.cacheGamebuild, ".file_store_" + UserList.cacheGamebuild};
		int var19 = 0;

		label301:
		while (var19 < 4) {
			String var7 = var19 == 0 ? "" : "" + var19;
			class158.field1748 = new File(Bounds.userHomeDirectory, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
			String var8 = null;
			String var9 = null;
			boolean var10 = false;
			Buffer var12;
			int var13;
			int var15;
			File var41;
			if (class158.field1748.exists()) {
				try {
					AccessFile var11 = new AccessFile(class158.field1748, "rw", 10000L);

					for (var12 = new Buffer((int)var11.length()); var12.offset < var12.array.length; var12.offset += var13) {
						var13 = var11.read(var12.array, var12.offset, var12.array.length - var12.offset);
						if (var13 == -1) {
							throw new IOException();
						}
					}

					var12.offset = 0;
					var13 = var12.readUnsignedByte();
					if (var13 < 1 || var13 > 3) {
						throw new IOException("" + var13);
					}

					int var14 = 0;
					if (var13 > 1) {
						var14 = var12.readUnsignedByte();
					}

					if (var13 <= 2) {
						var8 = var12.readStringCp1252NullCircumfixed();
						if (var14 == 1) {
							var9 = var12.readStringCp1252NullCircumfixed();
						}
					} else {
						var8 = var12.readCESU8();
						if (var14 == 1) {
							var9 = var12.readCESU8();
						}
					}

					var11.close();
				} catch (IOException var38) {
					var38.printStackTrace();
				}

				if (var8 != null) {
					var41 = new File(var8);
					if (!var41.exists()) {
						var8 = null;
					}
				}

				if (var8 != null) {
					var41 = new File(var8, "test.dat");

					boolean var43;
					try {
						RandomAccessFile var20 = new RandomAccessFile(var41, "rw");
						var15 = var20.read();
						var20.seek(0L);
						var20.write(var15);
						var20.seek(0L);
						var20.close();
						var41.delete();
						var43 = true;
					} catch (Exception var32) {
						var43 = false;
					}

					if (!var43) {
						var8 = null;
					}
				}
			}

			if (var8 == null && var19 == 0) {
				label276:
				for (int var21 = 0; var21 < ByteArrayPool.field4541.length; ++var21) {
					for (int var22 = 0; var22 < class157.field1745.length; ++var22) {
						File var23 = new File(class157.field1745[var22] + ByteArrayPool.field4541[var21] + File.separatorChar + var0 + File.separatorChar);
						if (var23.exists()) {
							File var24 = new File(var23, "test.dat");

							boolean var45;
							try {
								RandomAccessFile var16 = new RandomAccessFile(var24, "rw");
								int var17 = var16.read();
								var16.seek(0L);
								var16.write(var17);
								var16.seek(0L);
								var16.close();
								var24.delete();
								var45 = true;
							} catch (Exception var31) {
								var45 = false;
							}

							if (var45) {
								var8 = var23.toString();
								var10 = true;
								break label276;
							}
						}
					}
				}
			}

			if (var8 == null) {
				var8 = Bounds.userHomeDirectory + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
				var10 = true;
			}

			File var40;
			if (var9 != null) {
				var40 = new File(var9);
				var41 = new File(var8);

				try {
					File[] var50 = var40.listFiles();
					File[] var47 = var50;

					for (var15 = 0; var15 < var47.length; ++var15) {
						File var46 = var47[var15];
						File var25 = new File(var41, var46.getName());
						boolean var18 = var46.renameTo(var25);
						if (!var18) {
							throw new IOException();
						}
					}
				} catch (Exception var37) {
					var37.printStackTrace();
				}

				var10 = true;
			}

			if (var10) {
				var40 = new File(var8);
				var12 = null;

				try {
					AccessFile var51 = new AccessFile(class158.field1748, "rw", 10000L);
					Buffer var48 = new Buffer(500);
					var48.writeByte(3);
					var48.writeByte(var12 != null ? 1 : 0);
					var48.writeCESU8(var40.getPath());
					if (var12 != null) {
						var48.writeCESU8("");
					}

					var51.write(var48.array, 0, var48.offset);
					var51.close();
				} catch (IOException var30) {
					var30.printStackTrace();
				}
			}

			File var6 = new File(var8);
			JagexCache.cacheDir = var6;
			if (!JagexCache.cacheDir.exists()) {
				JagexCache.cacheDir.mkdirs();
			}

			File[] var39 = JagexCache.cacheDir.listFiles();
			if (var39 != null) {
				File[] var42 = var39;

				for (int var26 = 0; var26 < var42.length; ++var26) {
					File var27 = var42[var26];

					boolean var49;
					try {
						RandomAccessFile var44 = new RandomAccessFile(var27, "rw");
						var13 = var44.read();
						var44.seek(0L);
						var44.write(var13);
						var44.seek(0L);
						var44.close();
						var49 = true;
					} catch (Exception var29) {
						var49 = false;
					}

					if (!var49) {
						++var19;
						continue label301;
					}
				}
			}
			break;
		}

		File var5 = JagexCache.cacheDir;
		FileSystem.FileSystem_cacheDir = var5;
		if (!FileSystem.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;
			User.method7972();
			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class7.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class7.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
			class302.JagexCache_idxFiles = new BufferedFile[JagexCache.field1840];

			for (int var28 = 0; var28 < JagexCache.field1840; ++var28) {
				class302.JagexCache_idxFiles[var28] = new BufferedFile(new AccessFile(class7.getFile("main_file_cache.idx" + var28), "rw", 1048576L), 6000, 0);
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ltc;IB)Z",
		garbageValue = "-18"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2);
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) {
			if (var0.readBits(1) != 0) {
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13);
			var4 = var0.readBits(13);
			boolean var12 = var0.readBits(1) == 1;
			if (var12) {
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) {
				throw new RuntimeException();
			} else {
				Player var11 = Client.players[var1] = new Player();
				var11.index = var1;
				if (Players.field1360[var1] != null) {
					var11.read(Players.field1360[var1]);
				}

				var11.orientation = Players.Players_orientations[var1];
				var11.targetIndex = Players.Players_targetIndices[var1];
				var7 = Players.Players_regions[var1];
				var8 = var7 >> 28;
				var9 = var7 >> 14 & 255;
				var10 = var7 & 255;
				var11.pathTraversed[0] = Players.field1363[var1];
				var11.plane = (byte)var8;
				var11.resetPath((var9 << 13) + var3 - AbstractArchive.baseX * 64, (var10 << 13) + var4 - class148.baseY * 64);
				var11.field1118 = false;
				return true;
			}
		} else if (var2 == 1) {
			var3 = var0.readBits(2);
			var4 = Players.Players_regions[var1];
			Players.Players_regions[var1] = (((var4 >> 28) + var3 & 3) << 28) + (var4 & 268435455);
			return false;
		} else {
			int var5;
			int var6;
			if (var2 == 2) {
				var3 = var0.readBits(5);
				var4 = var3 >> 3;
				var5 = var3 & 7;
				var6 = Players.Players_regions[var1];
				var7 = (var6 >> 28) + var4 & 3;
				var8 = var6 >> 14 & 255;
				var9 = var6 & 255;
				if (var5 == 0) {
					--var8;
					--var9;
				}

				if (var5 == 1) {
					--var9;
				}

				if (var5 == 2) {
					++var8;
					--var9;
				}

				if (var5 == 3) {
					--var8;
				}

				if (var5 == 4) {
					++var8;
				}

				if (var5 == 5) {
					--var8;
					++var9;
				}

				if (var5 == 6) {
					++var9;
				}

				if (var5 == 7) {
					++var8;
					++var9;
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28);
				return false;
			} else {
				var3 = var0.readBits(18);
				var4 = var3 >> 16;
				var5 = var3 >> 8 & 255;
				var6 = var3 & 255;
				var7 = Players.Players_regions[var1];
				var8 = (var7 >> 28) + var4 & 3;
				var9 = var5 + (var7 >> 14) & 255;
				var10 = var6 + var7 & 255;
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28);
				return false;
			}
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-1851987184"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (Client.isLowDetail && var0 != class36.Client_plane) {
				return;
			}

			long var8 = 0L;
			boolean var10 = true;
			boolean var11 = false;
			boolean var12 = false;
			if (var1 == 0) {
				var8 = UserComparator5.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) {
				var8 = UserComparator5.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) {
				var8 = UserComparator5.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) {
				var8 = UserComparator5.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var13;
			if (var8 != 0L) {
				var13 = UserComparator5.scene.getObjectFlags(var0, var2, var3, var8);
				int var40 = class458.Entity_unpackID(var8);
				int var41 = var13 & 31;
				int var42 = var13 >> 6 & 3;
				ObjectComposition var14;
				if (var1 == 0) {
					UserComparator5.scene.removeBoundaryObject(var0, var2, var3);
					var14 = class90.getObjectDefinition(var40);
					if (var14.interactType != 0) {
						Client.collisionMaps[var0].method4202(var2, var3, var41, var42, var14.boolean1);
					}
				}

				if (var1 == 1) {
					UserComparator5.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) {
					UserComparator5.scene.removeGameObject(var0, var2, var3);
					var14 = class90.getObjectDefinition(var40);
					if (var2 + var14.sizeX > 103 || var3 + var14.sizeX > 103 || var2 + var14.sizeY > 103 || var3 + var14.sizeY > 103) {
						return;
					}

					if (var14.interactType != 0) {
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var14.sizeX, var14.sizeY, var42, var14.boolean1);
					}
				}

				if (var1 == 3) {
					UserComparator5.scene.removeFloorDecoration(var0, var2, var3);
					var14 = class90.getObjectDefinition(var40);
					if (var14.interactType == 1) {
						Client.collisionMaps[var0].method4194(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var13 = var0;
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var13 = var0 + 1;
				}

				Scene var43 = UserComparator5.scene;
				CollisionMap var15 = Client.collisionMaps[var0];
				ObjectComposition var16 = class90.getObjectDefinition(var4);
				int var17 = var7 >= 0 ? var7 : var16.animationId;
				int var18;
				int var19;
				if (var5 != 1 && var5 != 3) {
					var18 = var16.sizeX;
					var19 = var16.sizeY;
				} else {
					var18 = var16.sizeY;
					var19 = var16.sizeX;
				}

				int var20;
				int var21;
				if (var18 + var2 <= 104) {
					var20 = (var18 >> 1) + var2;
					var21 = var2 + (var18 + 1 >> 1);
				} else {
					var20 = var2;
					var21 = var2 + 1;
				}

				int var22;
				int var23;
				if (var3 + var19 <= 104) {
					var22 = var3 + (var19 >> 1);
					var23 = var3 + (var19 + 1 >> 1);
				} else {
					var22 = var3;
					var23 = var3 + 1;
				}

				int[][] var24 = Tiles.Tiles_heights[var13];
				int var25 = var24[var21][var23] + var24[var20][var22] + var24[var21][var22] + var24[var20][var23] >> 2;
				int var26 = (var2 << 7) + (var18 << 6);
				int var27 = (var3 << 7) + (var19 << 6);
				long var28 = BufferedNetSocket.calculateTag(var2, var3, 2, var16.int1 == 0, var4);
				int var30 = (var5 << 6) + var6;
				if (var16.int3 == 1) {
					var30 += 256;
				}

				Object var38;
				if (var6 == 22) {
					if (var17 == -1 && var16.transforms == null) {
						var38 = var16.getModel(22, var5, var24, var26, var25, var27);
					} else {
						var38 = new DynamicObject(var4, 22, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
					}

					var43.newFloorDecoration(var0, var2, var3, var25, (Renderable)var38, var28, var30);
					if (var16.interactType == 1) {
						var15.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) {
					if (var6 >= 12) {
						if (var17 == -1 && var16.transforms == null) {
							var38 = var16.getModel(var6, var5, var24, var26, var25, var27);
						} else {
							var38 = new DynamicObject(var4, var6, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
						}

						var43.method4569(var0, var2, var3, var25, 1, 1, (Renderable)var38, 0, var28, var30);
						if (var16.interactType != 0) {
							var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
						}
					} else if (var6 == 0) {
						if (var17 == -1 && var16.transforms == null) {
							var38 = var16.getModel(0, var5, var24, var26, var25, var27);
						} else {
							var38 = new DynamicObject(var4, 0, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
						}

						var43.newBoundaryObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1027[var5], 0, var28, var30);
						if (var16.interactType != 0) {
							var15.method4191(var2, var3, var6, var5, var16.boolean1);
						}
					} else if (var6 == 1) {
						if (var17 == -1 && var16.transforms == null) {
							var38 = var16.getModel(1, var5, var24, var26, var25, var27);
						} else {
							var38 = new DynamicObject(var4, 1, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
						}

						var43.newBoundaryObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1028[var5], 0, var28, var30);
						if (var16.interactType != 0) {
							var15.method4191(var2, var3, var6, var5, var16.boolean1);
						}
					} else {
						int var31;
						if (var6 == 2) {
							var31 = var5 + 1 & 3;
							Object var33;
							Object var39;
							if (var17 == -1 && var16.transforms == null) {
								var39 = var16.getModel(2, var5 + 4, var24, var26, var25, var27);
								var33 = var16.getModel(2, var31, var24, var26, var25, var27);
							} else {
								var39 = new DynamicObject(var4, 2, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
								var33 = new DynamicObject(var4, 2, var31, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
							}

							var43.newBoundaryObject(var0, var2, var3, var25, (Renderable)var39, (Renderable)var33, Tiles.field1027[var5], Tiles.field1027[var31], var28, var30);
							if (var16.interactType != 0) {
								var15.method4191(var2, var3, var6, var5, var16.boolean1);
							}
						} else if (var6 == 3) {
							if (var17 == -1 && var16.transforms == null) {
								var38 = var16.getModel(3, var5, var24, var26, var25, var27);
							} else {
								var38 = new DynamicObject(var4, 3, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
							}

							var43.newBoundaryObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1028[var5], 0, var28, var30);
							if (var16.interactType != 0) {
								var15.method4191(var2, var3, var6, var5, var16.boolean1);
							}
						} else if (var6 == 9) {
							if (var17 == -1 && var16.transforms == null) {
								var38 = var16.getModel(var6, var5, var24, var26, var25, var27);
							} else {
								var38 = new DynamicObject(var4, var6, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
							}

							var43.method4569(var0, var2, var3, var25, 1, 1, (Renderable)var38, 0, var28, var30);
							if (var16.interactType != 0) {
								var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
							}
						} else if (var6 == 4) {
							if (var17 == -1 && var16.transforms == null) {
								var38 = var16.getModel(4, var5, var24, var26, var25, var27);
							} else {
								var38 = new DynamicObject(var4, 4, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
							}

							var43.newWallDecoration(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1027[var5], 0, 0, 0, var28, var30);
						} else {
							long var32;
							Object var34;
							if (var6 == 5) {
								var31 = 16;
								var32 = var43.getBoundaryObjectTag(var0, var2, var3);
								if (0L != var32) {
									var31 = class90.getObjectDefinition(class458.Entity_unpackID(var32)).int2;
								}

								if (var17 == -1 && var16.transforms == null) {
									var34 = var16.getModel(4, var5, var24, var26, var25, var27);
								} else {
									var34 = new DynamicObject(var4, 4, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
								}

								var43.newWallDecoration(var0, var2, var3, var25, (Renderable)var34, (Renderable)null, Tiles.field1027[var5], 0, var31 * Tiles.field1037[var5], var31 * Tiles.field1034[var5], var28, var30);
							} else if (var6 == 6) {
								var31 = 8;
								var32 = var43.getBoundaryObjectTag(var0, var2, var3);
								if (0L != var32) {
									var31 = class90.getObjectDefinition(class458.Entity_unpackID(var32)).int2 / 2;
								}

								if (var17 == -1 && var16.transforms == null) {
									var34 = var16.getModel(4, var5 + 4, var24, var26, var25, var27);
								} else {
									var34 = new DynamicObject(var4, 4, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
								}

								var43.newWallDecoration(var0, var2, var3, var25, (Renderable)var34, (Renderable)null, 256, var5, var31 * Tiles.field1031[var5], var31 * Tiles.field1032[var5], var28, var30);
							} else if (var6 == 7) {
								int var37 = var5 + 2 & 3;
								if (var17 == -1 && var16.transforms == null) {
									var38 = var16.getModel(4, var37 + 4, var24, var26, var25, var27);
								} else {
									var38 = new DynamicObject(var4, 4, var37 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
								}

								var43.newWallDecoration(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, 256, var37, 0, 0, var28, var30);
							} else if (var6 == 8) {
								var31 = 8;
								var32 = var43.getBoundaryObjectTag(var0, var2, var3);
								if (var32 != 0L) {
									var31 = class90.getObjectDefinition(class458.Entity_unpackID(var32)).int2 / 2;
								}

								int var36 = var5 + 2 & 3;
								Object var35;
								if (var17 == -1 && var16.transforms == null) {
									var34 = var16.getModel(4, var5 + 4, var24, var26, var25, var27);
									var35 = var16.getModel(4, var36 + 4, var24, var26, var25, var27);
								} else {
									var34 = new DynamicObject(var4, 4, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
									var35 = new DynamicObject(var4, 4, var36 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
								}

								var43.newWallDecoration(var0, var2, var3, var25, (Renderable)var34, (Renderable)var35, 256, var5, var31 * Tiles.field1031[var5], var31 * Tiles.field1032[var5], var28, var30);
							}
						}
					}
				} else {
					if (var17 == -1 && var16.transforms == null) {
						var38 = var16.getModel(10, var5, var24, var26, var25, var27);
					} else {
						var38 = new DynamicObject(var4, 10, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
					}

					if (var38 != null) {
						var43.method4569(var0, var2, var3, var25, var18, var19, (Renderable)var38, var6 == 11 ? 256 : 0, var28, var30);
					}

					if (var16.interactType != 0) {
						var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
					}
				}
			}
		}

	}
}
