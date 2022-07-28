import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.io.IOException;
import java.io.File;
import java.awt.Component;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
@ObfuscatedName("q")
public class class1 implements Callable {
	@ObfuscatedName("dl")
	@ObfuscatedSignature(descriptor = "Lfz;")
	@Export("js5SocketTask")
	static Task js5SocketTask;

	@ObfuscatedName("ei")
	@ObfuscatedSignature(descriptor = "Llu;")
	@Export("archive13")
	static Archive archive13;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lqw;")
	final Buffer field4;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lu;")
	final class3 field0;

	@ObfuscatedSignature(descriptor = "Lj;")
	final class7 this$0;

	@ObfuscatedSignature(descriptor = "(Lj;Lqw;Lu;)V")
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field4 = var2;
		this.field0 = var3;
	}

	public Object call() {
		return this.field0.vmethod12(this.field4);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/awt/Component;I)V", garbageValue = "-991776535")
	static void method10(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance);
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;", garbageValue = "1735615253")
	public static File method9(String var0, String var1, int var2) {
		String var3 = (var2 == 0) ? "" : "" + var2;
		JagexCache.JagexCache_locationFile = new File(JagexCache.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
		String var4 = null;
		String var5 = null;
		boolean var6 = false;
		File var22;
		if (JagexCache.JagexCache_locationFile.exists()) {
			try {
				AccessFile var7 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);
				Buffer var8;
				int var9;
				for (var8 = new Buffer(((int) (var7.length()))); var8.offset < var8.array.length; var8.offset += var9) {
					var9 = var7.read(var8.array, var8.offset, var8.array.length - var8.offset);
					if (var9 == -1) {
						throw new IOException();
					}
				}
				var8.offset = 0;
				var9 = var8.readUnsignedByte();
				if (var9 < 1 || var9 > 3) {
					throw new IOException("" + var9);
				}
				int var10 = 0;
				if (var9 > 1) {
					var10 = var8.readUnsignedByte();
				}
				if (var9 <= 2) {
					var4 = var8.readStringCp1252NullCircumfixed();
					if (var10 == 1) {
						var5 = var8.readStringCp1252NullCircumfixed();
					}
				} else {
					var4 = var8.readCESU8();
					if (var10 == 1) {
						var5 = var8.readCESU8();
					}
				}
				var7.close();
			} catch (IOException var20) {
				var20.printStackTrace();
			}
			if (var4 != null) {
				var22 = new File(var4);
				if (!var22.exists()) {
					var4 = null;
				}
			}
			if (var4 != null) {
				var22 = new File(var4, "test.dat");
				if (!ClanSettings.method3006(var22, true)) {
					var4 = null;
				}
			}
		}
		if (var4 == null && var2 == 0) {
			label124 : for (int var15 = 0; var15 < class14.cacheSubPaths.length; ++var15) {
				for (int var16 = 0; var16 < class329.cacheParentPaths.length; ++var16) {
					File var17 = new File(class329.cacheParentPaths[var16] + class14.cacheSubPaths[var15] + File.separatorChar + var0 + File.separatorChar);
					if (var17.exists() && ClanSettings.method3006(new File(var17, "test.dat"), true)) {
						var4 = var17.toString();
						var6 = true;
						break label124;
					}
				}
			}
		}
		if (var4 == null) {
			var4 = JagexCache.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
			var6 = true;
		}
		if (var5 != null) {
			File var21 = new File(var5);
			var22 = new File(var4);
			try {
				File[] var23 = var21.listFiles();
				File[] var18 = var23;
				for (int var11 = 0; var11 < var18.length; ++var11) {
					File var12 = var18[var11];
					File var13 = new File(var22, var12.getName());
					boolean var14 = var12.renameTo(var13);
					if (!var14) {
						throw new IOException();
					}
				}
			} catch (Exception var19) {
				var19.printStackTrace();
			}
			var6 = true;
		}
		if (var6) {
			class293.method5616(new File(var4), ((File) (null)));
		}
		return new File(var4);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = "(IB)I", garbageValue = "-53")
	static int method7(int var0) {
		return ((int) (Math.pow(2.0, ((double) (((float) (var0)) / 256.0F + 7.0F)))));
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "80")
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) {
			LoginPacket.method5207();
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && class260.clientPreferences.method2335() != 0 && !Client.playingJingle) {
			Archive var1 = MouseHandler.archive6;
			int var2 = class260.clientPreferences.method2335();
			class273.musicPlayerStatus = 1;
			class149.musicTrackArchive = var1;
			class273.musicTrackGroupId = var0;
			UserComparator6.musicTrackFileId = 0;
			class273.musicTrackVolume = var2;
			class347.musicTrackBoolean = false;
			FaceNormal.pcmSampleLength = 2;
		}
		Client.currentTrackGroupId = var0;
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(descriptor = "(IIIIIIIB)V", garbageValue = "-72")
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (Client.isLowDetail && var0 != FriendSystem.Client_plane) {
				return;
			}
			long var7 = 0L;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;
			if (var1 == 0) {
				var7 = Decimator.scene.getBoundaryObjectTag(var0, var2, var3);
			}
			if (var1 == 1) {
				var7 = Decimator.scene.getWallDecorationTag(var0, var2, var3);
			}
			if (var1 == 2) {
				var7 = Decimator.scene.getGameObjectTag(var0, var2, var3);
			}
			if (var1 == 3) {
				var7 = Decimator.scene.getFloorDecorationTag(var0, var2, var3);
			}
			int var12;
			if (var7 != 0L) {
				var12 = Decimator.scene.getObjectFlags(var0, var2, var3, var7);
				int var14 = class141.Entity_unpackID(var7);
				int var15 = var12 & 31;
				int var16 = var12 >> 6 & 3;
				ObjectComposition var13;
				if (var1 == 0) {
					Decimator.scene.removeBoundaryObject(var0, var2, var3);
					var13 = WorldMapDecoration.getObjectDefinition(var14);
					if (var13.interactType != 0) {
						Client.collisionMaps[var0].method3857(var2, var3, var15, var16, var13.boolean1);
					}
				}
				if (var1 == 1) {
					Decimator.scene.removeWallDecoration(var0, var2, var3);
				}
				if (var1 == 2) {
					Decimator.scene.removeGameObject(var0, var2, var3);
					var13 = WorldMapDecoration.getObjectDefinition(var14);
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) {
						return;
					}
					if (var13.interactType != 0) {
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var16, var13.boolean1);
					}
				}
				if (var1 == 3) {
					Decimator.scene.removeFloorDecoration(var0, var2, var3);
					var13 = WorldMapDecoration.getObjectDefinition(var14);
					if (var13.interactType == 1) {
						Client.collisionMaps[var0].method3889(var2, var3);
					}
				}
			}
			if (var4 >= 0) {
				var12 = var0;
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var12 = var0 + 1;
				}
				class341.method6300(var0, var12, var2, var3, var4, var5, var6, Decimator.scene, Client.collisionMaps[var0]);
			}
		}
	}
}