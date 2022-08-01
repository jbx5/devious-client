import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hg")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lhg;")
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(3, ((byte) (0))),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lhg;")
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(2, ((byte) (1))),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lhg;")
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(0, ((byte) (2))),
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lhg;")
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(1, ((byte) (3)));
	@ObfuscatedName("l")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = "Lnz;")
	static Bounds field2781;

	@ObfuscatedName("fb")
	@Export("worldHost")
	static String worldHost;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 1437983207)
	@Export("type")
	final int type;

	@ObfuscatedName("w")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)[Lhg;", garbageValue = "-492719905")
	static WorldMapSectionType[] method4928() {
		return new WorldMapSectionType[]{ WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE3 };
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-500537850")
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) {
			if (KeyHandler.field150 == KeyHandler.field148) {
				return false;
			} else {
				SequenceDefinition.field2176 = KeyHandler.field128[KeyHandler.field148];
				Clock.field1797 = KeyHandler.field136[KeyHandler.field148];
				KeyHandler.field148 = KeyHandler.field148 + 1 & 127;
				return true;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqy;II)Z", garbageValue = "1961067812")
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
				if (Players.field1295[var1] != null) {
					var11.read(Players.field1295[var1]);
				}
				var11.orientation = Players.Players_orientations[var1];
				var11.targetIndex = Players.Players_targetIndices[var1];
				var7 = Players.Players_regions[var1];
				var8 = var7 >> 28;
				var9 = var7 >> 14 & 255;
				var10 = var7 & 255;
				var11.pathTraversed[0] = Players.field1294[var1];
				var11.plane = ((byte) (var8));
				var11.resetPath((var9 << 13) + var3 - class300.baseX * 8, (var10 << 13) + var4 - Message.baseY * 64);
				var11.field1111 = false;
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

	@ObfuscatedName("gh")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-91789193")
	static final void method4927(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		}
		if (var0 > 383) {
			var0 = 383;
		}
		if (UserComparator9.cameraPitch < var0) {
			UserComparator9.cameraPitch = (var0 - UserComparator9.cameraPitch) * ScriptFrame.field459 / 1000 + UserComparator9.cameraPitch + class83.field1082;
			if (UserComparator9.cameraPitch > var0) {
				UserComparator9.cameraPitch = var0;
			}
		}
		if (UserComparator9.cameraPitch > var0) {
			UserComparator9.cameraPitch -= (UserComparator9.cameraPitch - var0) * ScriptFrame.field459 / 1000 + class83.field1082;
			if (UserComparator9.cameraPitch < var0) {
				UserComparator9.cameraPitch = var0;
			}
		}
		int var2 = var1 - PendingSpawn.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		}
		if (var2 < -1024) {
			var2 += 2048;
		}
		if (var2 > 0) {
			PendingSpawn.cameraYaw = var2 * ScriptFrame.field459 / 1000 + PendingSpawn.cameraYaw + class83.field1082;
			PendingSpawn.cameraYaw &= 2047;
		}
		if (var2 < 0) {
			PendingSpawn.cameraYaw -= class83.field1082 + -var2 * ScriptFrame.field459 / 1000;
			PendingSpawn.cameraYaw &= 2047;
		}
		int var3 = var1 - PendingSpawn.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		}
		if (var3 < -1024) {
			var3 += 2048;
		}
		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			PendingSpawn.cameraYaw = var1;
		}
	}
}