import java.lang.management.ManagementFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
@ObfuscatedName("j")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class47 {
	@ObfuscatedName("fy")
	static String field156;

	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(B)Laf;", garbageValue = "-43")
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Ljb;Lqb;B)Ljg;", garbageValue = "-79")
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
			var2 = new PacketBufferNode();
		} else {
			var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
		}
		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}
		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-63")
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (WorldMapID.garbageCollector == null || !WorldMapID.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = ((GarbageCollectorMXBean) (var1.next()));
					if (var2.isValid()) {
						WorldMapID.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = -1L;
						GameEngine.garbageCollectorLastCollectionTime = -1L;
					}
				} 
			} catch (Throwable var11) {
			}
		}
		if (WorldMapID.garbageCollector != null) {
			long var9 = class181.method3483();
			long var3 = WorldMapID.garbageCollector.getCollectionTime();
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) {
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
				if (var7 != 0L) {
					var0 = ((int) (100L * var5 / var7));
				}
			}
			GameEngine.garbageCollectorLastCollectionTime = var3;
			GameEngine.garbageCollectorLastCheckTimeMs = var9;
		}
		return var0;
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(descriptor = "(IIZB)V", garbageValue = "111")
	static final void method348(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class352.field4196 || class20.field105 != var1) {
			class352.field4196 = var0;
			class20.field105 = var1;
			class4.updateGameState(25);
			class20.drawLoadingMessage("Loading - please wait.", true);
			int var3 = Decimator.baseX * 8;
			int var4 = class7.baseY * 64;
			Decimator.baseX = (var0 - 6) * 64;
			class7.baseY = (var1 - 6) * 8;
			int var5 = Decimator.baseX * 8 - var3;
			int var6 = class7.baseY * 64 - var4;
			var3 = Decimator.baseX * 8;
			var4 = class7.baseY * 64;
			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) {
				NPC var19 = Client.npcs[var7];
				if (var19 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var19.pathX;
						var10000[var9] -= var5;
						var10000 = var19.pathY;
						var10000[var9] -= var6;
					}
					var19.x -= var5 * 128;
					var19.y -= var6 * 128;
				}
			}
			for (var7 = 0; var7 < 2048; ++var7) {
				Player var22 = Client.players[var7];
				if (var22 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var22.pathX;
						var10000[var9] -= var5;
						var10000 = var22.pathY;
						var10000[var9] -= var6;
					}
					var22.x -= var5 * 128;
					var22.y -= var6 * 128;
				}
			}
			byte var20 = 0;
			byte var8 = 104;
			byte var21 = 1;
			if (var5 < 0) {
				var20 = 103;
				var8 = -1;
				var21 = -1;
			}
			byte var10 = 0;
			byte var11 = 104;
			byte var12 = 1;
			if (var6 < 0) {
				var10 = 103;
				var11 = -1;
				var12 = -1;
			}
			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) {
				for (var14 = var10; var11 != var14; var14 += var12) {
					int var15 = var13 + var5;
					int var16 = var6 + var14;
					for (int var17 = 0; var17 < 4; ++var17) {
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null;
						}
					}
				}
			}
			for (PendingSpawn var18 = ((PendingSpawn) (Client.pendingSpawns.last())); var18 != null; var18 = ((PendingSpawn) (Client.pendingSpawns.previous()))) {
				var18.x -= var5;
				var18.y -= var6;
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) {
					var18.remove();
				}
			}
			if (Client.destinationX != 0) {
				Client.destinationX -= var5;
				Client.destinationY -= var6;
			}
			Client.soundEffectCount = 0;
			Client.isCameraLocked = false;
			class16.cameraX -= var5 << 7;
			class269.cameraZ -= var6 << 7;
			FloorOverlayDefinition.oculusOrbFocalPointX -= var5 << 7;
			AbstractUserComparator.oculusOrbFocalPointY -= var6 << 7;
			Client.field720 = -1;
			Client.graphicsObjects.clear();
			Client.projectiles.clear();
			for (var14 = 0; var14 < 4; ++var14) {
				Client.collisionMaps[var14].clear();
			}
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-762895060")
	static final void method352(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) {
			if (Client.showMouseOverText) {
				int var2 = Client.menuOptionsCount - 1;
				String var4;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) {
					var4 = "Use" + " " + Client.selectedItemName + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) {
					var4 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
				} else {
					var4 = ScriptFrame.method1034(var2);
				}
				if (Client.menuOptionsCount > 2) {
					var4 = var4 + Clock.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}
				WorldMapSection2.fontBold12.drawRandomAlphaAndSpacing(var4, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000);
			}
		}
	}
}