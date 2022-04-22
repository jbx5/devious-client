import java.awt.FontMetrics;
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("l")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 
	-1670816889)

	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("ak")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-660682519)

	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	1314045431)

	@Export("planes")
	int planes;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	911829811)

	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-1785911481)

	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	587301171)

	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	1342465229)

	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lgu;I)V", garbageValue = 
	"964088357")

	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) {
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX;
		}

		if (var1.regionLowY > this.regionEndY) {
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) {
			var1.regionHighY = this.regionEndY;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(IIII)Z", garbageValue = 
	"-1337137401")

	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if ((var1 >= this.minPlane) && (var1 < (this.minPlane + this.planes))) {
			return ((var2 >> 6) == this.regionStartX) && ((var3 >> 6) == this.regionStartY);
		} else {
			return false;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(III)Z", garbageValue = 
	"1769831605")

	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return ((var1 >> 6) == this.regionEndX) && ((var2 >> 6) == this.regionEndY);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(IIII)[I", garbageValue = 
	"1941144122")

	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{ var2 + ((this.regionEndX * 64) - (this.regionStartX * 64)), var3 + ((this.regionEndY * 64) - (this.regionStartY * 64)) };
			return var4;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(III)Lks;", garbageValue = 
	"-670243838")

	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = ((this.regionStartX * 64) - (this.regionEndX * 64)) + var1;
			int var4 = var2 + ((this.regionStartY * 64) - (this.regionEndY * 64));
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"-860121653")

	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1338654039")

	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"40")

	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}

		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(descriptor = 
	"(ZLpz;B)V", garbageValue = 
	"71")

	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field626 = 0;
		Client.field547 = 0;
		PacketBuffer var2 = Client.packetWriter.packetBuffer;
		var2.importIndex();
		int var3 = var2.readBits(8);
		int var4;
		if (var3 < Client.npcCount) {
			for (var4 = var3; var4 < Client.npcCount; ++var4) {
				Client.field627[(++Client.field626) - 1] = Client.npcIndices[var4];
			}
		}

		if (var3 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;

			int var5;
			int var7;
			int var8;
			int var10;
			for (var4 = 0; var4 < var3; ++var4) {
				var5 = Client.npcIndices[var4];
				NPC var13 = Client.npcs[var5];
				var7 = var2.readBits(1);
				if (var7 == 0) {
					Client.npcIndices[(++Client.npcCount) - 1] = var5;
					var13.npcCycle = Client.cycle;
				} else {
					var8 = var2.readBits(2);
					if (var8 == 0) {
						Client.npcIndices[(++Client.npcCount) - 1] = var5;
						var13.npcCycle = Client.cycle;
						Client.field548[(++Client.field547) - 1] = var5;
					} else {
						int var9;
						if (var8 == 1) {
							Client.npcIndices[(++Client.npcCount) - 1] = var5;
							var13.npcCycle = Client.cycle;
							var9 = var2.readBits(3);
							var13.method2347(var9, class193.field2185);
							var10 = var2.readBits(1);
							if (var10 == 1) {
								Client.field548[(++Client.field547) - 1] = var5;
							}
						} else if (var8 == 2) {
							Client.npcIndices[(++Client.npcCount) - 1] = var5;
							var13.npcCycle = Client.cycle;
							if (var2.readBits(1) == 1) {
								var9 = var2.readBits(3);
								var13.method2347(var9, class193.field2187);
								var10 = var2.readBits(3);
								var13.method2347(var10, class193.field2187);
							} else {
								var9 = var2.readBits(3);
								var13.method2347(var9, class193.field2184);
							}

							var9 = var2.readBits(1);
							if (var9 == 1) {
								Client.field548[(++Client.field547) - 1] = var5;
							}
						} else if (var8 == 3) {
							Client.field627[(++Client.field626) - 1] = var5;
						}
					}
				}
			}

			int var11;
			while (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) {
				var11 = var1.readBits(15);
				if (var11 == 32767) {
					break;
				}

				boolean var14 = false;
				if (Client.npcs[var11] == null) {
					Client.npcs[var11] = new NPC();
					var14 = true;
				}

				NPC var12 = Client.npcs[var11];
				Client.npcIndices[(++Client.npcCount) - 1] = var11;
				var12.npcCycle = Client.cycle;
				int var6;
				boolean var15;
				if (class431.field4602) {
					if (var0) {
						var6 = var1.readBits(8);
						if (var6 > 127) {
							var6 -= 256;
						}
					} else {
						var6 = var1.readBits(5);
						if (var6 > 15) {
							var6 -= 32;
						}
					}

					var5 = var1.readBits(1);
					var8 = Client.defaultRotations[var1.readBits(3)];
					if (var14) {
						var12.orientation = var12.rotation = var8;
					}

					var12.definition = KeyHandler.getNpcDefinition(var1.readBits(14));
					if (var0) {
						var7 = var1.readBits(8);
						if (var7 > 127) {
							var7 -= 256;
						}
					} else {
						var7 = var1.readBits(5);
						if (var7 > 15) {
							var7 -= 32;
						}
					}

					var15 = var1.readBits(1) == 1;
					if (var15) {
						var1.readBits(32);
					}

					var10 = var1.readBits(1);
					if (var10 == 1) {
						Client.field548[(++Client.field547) - 1] = var11;
					}
				} else {
					var5 = var1.readBits(1);
					var8 = var1.readBits(1);
					if (var8 == 1) {
						Client.field548[(++Client.field547) - 1] = var11;
					}

					if (var0) {
						var7 = var1.readBits(8);
						if (var7 > 127) {
							var7 -= 256;
						}
					} else {
						var7 = var1.readBits(5);
						if (var7 > 15) {
							var7 -= 32;
						}
					}

					var15 = var1.readBits(1) == 1;
					if (var15) {
						var1.readBits(32);
					}

					if (var0) {
						var6 = var1.readBits(8);
						if (var6 > 127) {
							var6 -= 256;
						}
					} else {
						var6 = var1.readBits(5);
						if (var6 > 15) {
							var6 -= 32;
						}
					}

					var12.definition = KeyHandler.getNpcDefinition(var1.readBits(14));
					var10 = Client.defaultRotations[var1.readBits(3)];
					if (var14) {
						var12.orientation = var12.rotation = var10;
					}
				}

				var12.field1150 = var12.definition.size;
				var12.field1175 = var12.definition.rotation;
				if (var12.field1175 == 0) {
					var12.rotation = 0;
				}

				var12.walkSequence = var12.definition.walkSequence;
				var12.walkBackSequence = var12.definition.walkBackSequence;
				var12.walkLeftSequence = var12.definition.walkLeftSequence;
				var12.walkRightSequence = var12.definition.walkRightSequence;
				var12.idleSequence = var12.definition.idleSequence;
				var12.turnLeftSequence = var12.definition.turnLeftSequence;
				var12.turnRightSequence = var12.definition.turnRightSequence;
				var12.method2348(GrandExchangeEvents.localPlayer.pathX[0] + var6, GrandExchangeEvents.localPlayer.pathY[0] + var7, var5 == 1);
			} 

			var1.exportIndex();
			MouseHandler.method593(var1);

			for (var11 = 0; var11 < Client.field626; ++var11) {
				var3 = Client.field627[var11];
				if (Client.npcs[var3].npcCycle != Client.cycle) {
					Client.npcs[var3].definition = null;
					Client.npcs[var3] = null;
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) {
				throw new RuntimeException((var1.offset + ",") + Client.packetWriter.serverPacketLength);
			} else {
				for (var11 = 0; var11 < Client.npcCount; ++var11) {
					if (Client.npcs[Client.npcIndices[var11]] == null) {
						throw new RuntimeException((var11 + ",") + Client.npcCount);
					}
				}

			}
		}
	}
}