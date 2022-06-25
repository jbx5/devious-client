import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.io.IOException;
import java.io.File;
import net.runelite.mapping.Export;
@ObfuscatedName("nr")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("c")
	boolean field4299;

	@ObfuscatedName("v")
	boolean field4298;

	Friend() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lnr;I)I", garbageValue = "-1436702085")
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) {
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) {
			return 1;
		} else if (super.world != 0 && var1.world == 0) {
			return -1;
		} else if (var1.world != 0 && super.world == 0) {
			return 1;
		} else if (this.field4299 && !var1.field4299) {
			return -1;
		} else if (!this.field4299 && var1.field4299) {
			return 1;
		} else if (this.field4298 && !var1.field4298) {
			return -1;
		} else if (!this.field4298 && var1.field4298) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lne;B)I", garbageValue = "-81")
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend(((Friend) (var1)));
	}

	public int compareTo(Object var1) {
		return this.compareToFriend(((Friend) (var1)));
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;", garbageValue = "-29")
	static File method6630(String var0, String var1, int var2) {
		String var3 = (var2 == 0) ? "" : "" + var2;
		class267.JagexCache_locationFile = new File(class123.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
		String var4 = null;
		String var5 = null;
		boolean var6 = false;
		Buffer var8;
		File var23;
		if (class267.JagexCache_locationFile.exists()) {
			try {
				AccessFile var7 = new AccessFile(class267.JagexCache_locationFile, "rw", 10000L);
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
			} catch (IOException var21) {
				var21.printStackTrace();
			}
			if (var4 != null) {
				var23 = new File(var4);
				if (!var23.exists()) {
					var4 = null;
				}
			}
			if (var4 != null) {
				var23 = new File(var4, "test.dat");
				if (!Varcs.method2474(var23, true)) {
					var4 = null;
				}
			}
		}
		if (var4 == null && var2 == 0) {
			label140 : for (int var15 = 0; var15 < JagexCache.cacheSubPaths.length; ++var15) {
				for (int var16 = 0; var16 < Fonts.cacheParentPaths.length; ++var16) {
					File var17 = new File(Fonts.cacheParentPaths[var16] + JagexCache.cacheSubPaths[var15] + File.separatorChar + var0 + File.separatorChar);
					if (var17.exists() && Varcs.method2474(new File(var17, "test.dat"), true)) {
						var4 = var17.toString();
						var6 = true;
						break label140;
					}
				}
			}
		}
		if (var4 == null) {
			var4 = class123.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
			var6 = true;
		}
		File var22;
		if (var5 != null) {
			var22 = new File(var5);
			var23 = new File(var4);
			try {
				File[] var24 = var22.listFiles();
				File[] var18 = var24;
				for (int var11 = 0; var11 < var18.length; ++var11) {
					File var12 = var18[var11];
					File var13 = new File(var23, var12.getName());
					boolean var14 = var12.renameTo(var13);
					if (!var14) {
						throw new IOException();
					}
				}
			} catch (Exception var20) {
				var20.printStackTrace();
			}
			var6 = true;
		}
		if (var6) {
			var22 = new File(var4);
			var8 = null;
			try {
				AccessFile var25 = new AccessFile(class267.JagexCache_locationFile, "rw", 10000L);
				Buffer var26 = new Buffer(500);
				var26.writeByte(3);
				var26.writeByte(var8 != null ? 1 : 0);
				var26.writeCESU8(var22.getPath());
				if (var8 != null) {
					var26.writeCESU8("");
				}
				var25.write(var26.array, 0, var26.offset);
				var25.close();
			} catch (IOException var19) {
				var19.printStackTrace();
			}
		}
		return new File(var4);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(ILbi;ZB)I", garbageValue = "44")
	static int method6619(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return JagexCache.method3271(var0, var1, var2);
		} else if (var0 < 1100) {
			return PendingSpawn.method2180(var0, var1, var2);
		} else if (var0 < 1200) {
			return Varcs.method2475(var0, var1, var2);
		} else if (var0 < 1300) {
			return StructComposition.method3617(var0, var1, var2);
		} else if (var0 < 1400) {
			return ChatChannel.method2003(var0, var1, var2);
		} else if (var0 < 1500) {
			return ViewportMouse.method4514(var0, var1, var2);
		} else if (var0 < 1600) {
			return class125.method2821(var0, var1, var2);
		} else if (var0 < 1700) {
			return class1.method7(var0, var1, var2);
		} else if (var0 < 1800) {
			return GameObject.method4553(var0, var1, var2);
		} else if (var0 < 1900) {
			return FloorOverlayDefinition.method3817(var0, var1, var2);
		} else if (var0 < 2000) {
			return ReflectionCheck.method576(var0, var1, var2);
		} else if (var0 < 2100) {
			return PendingSpawn.method2180(var0, var1, var2);
		} else if (var0 < 2200) {
			return Varcs.method2475(var0, var1, var2);
		} else if (var0 < 2300) {
			return StructComposition.method3617(var0, var1, var2);
		} else if (var0 < 2400) {
			return ChatChannel.method2003(var0, var1, var2);
		} else if (var0 < 2500) {
			return ViewportMouse.method4514(var0, var1, var2);
		} else if (var0 < 2600) {
			return WorldMapDecoration.method4992(var0, var1, var2);
		} else if (var0 < 2700) {
			return DynamicObject.method1987(var0, var1, var2);
		} else if (var0 < 2800) {
			return class353.method6506(var0, var1, var2);
		} else if (var0 < 2900) {
			return class238.method5001(var0, var1, var2);
		} else if (var0 < 3000) {
			return ReflectionCheck.method576(var0, var1, var2);
		} else if (var0 < 3200) {
			return class115.method2682(var0, var1, var2);
		} else if (var0 < 3300) {
			return Decimator.method1019(var0, var1, var2);
		} else if (var0 < 3400) {
			return UserComparator10.method2605(var0, var1, var2);
		} else if (var0 < 3500) {
			return class131.method2875(var0, var1, var2);
		} else if (var0 < 3600) {
			return InterfaceParent.method2097(var0, var1, var2);
		} else if (var0 < 3700) {
			return JagexCache.method3249(var0, var1, var2);
		} else if (var0 < 3800) {
			return ArchiveLoader.method2073(var0, var1, var2);
		} else if (var0 < 3900) {
			return Client.method1177(var0, var1, var2);
		} else if (var0 < 4000) {
			return WorldMapSectionType.method4953(var0, var1, var2);
		} else if (var0 < 4100) {
			return Language.method6068(var0, var1, var2);
		} else if (var0 < 4200) {
			return UserComparator3.method2592(var0, var1, var2);
		} else if (var0 < 4300) {
			return UserComparator6.method2628(var0, var1, var2);
		} else if (var0 < 5100) {
			return class118.method2742(var0, var1, var2);
		} else if (var0 < 5400) {
			return VarcInt.method3411(var0, var1, var2);
		} else if (var0 < 5600) {
			return class118.method2744(var0, var1, var2);
		} else if (var0 < 5700) {
			return class21.method264(var0, var1, var2);
		} else if (var0 < 6300) {
			return class387.method7021(var0, var1, var2);
		} else if (var0 < 6600) {
			return ParamComposition.method3574(var0, var1, var2);
		} else if (var0 < 6700) {
			return UserList.method6754(var0, var1, var2);
		} else if (var0 < 6800) {
			return class14.method155(var0, var1, var2);
		} else if (var0 < 6900) {
			return class162.method3298(var0, var1, var2);
		} else if (var0 < 7000) {
			return MilliClock.method3308(var0, var1, var2);
		} else if (var0 < 7100) {
			return SpriteMask.method5524(var0, var1, var2);
		} else if (var0 < 7200) {
			return class11.method96(var0, var1, var2);
		} else if (var0 < 7300) {
			return WorldMapSectionType.method4948(var0, var1, var2);
		} else if (var0 < 7500) {
			return Renderable.method4339(var0, var1, var2);
		} else if (var0 < 7600) {
			return MouseHandler.method547(var0, var1, var2);
		} else {
			return var0 < 7700 ? UserComparator3.method2590(var0, var1, var2) : 2;
		}
	}
}