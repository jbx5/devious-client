import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -691430043
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lwh;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lvm;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1771183759
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("am")
	boolean field1475;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -296744095
	)
	int field1467;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1309495331
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	ServerPacket field1478;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	ServerPacket field1479;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	ServerPacket field1480;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1475 = true;
		this.field1467 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "106"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1660219547"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) {
			this.buffer.offset = 0;

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last();
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) {
					this.socket.write(this.buffer.array, 0, this.buffer.offset);
					this.pendingWrites = 0;
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index);
				this.bufferSize -= var1.index;
				var1.remove();
				var1.packetBuffer.releaseArray();
				var1.release();
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lme;S)V",
		garbageValue = "486"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsw;B)V",
		garbageValue = "34"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1073142363"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-80128830"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lsw;",
		garbageValue = "1399514619"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "-138188705"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Ljava/lang/String;Ljava/lang/String;I)[Lvv;",
		garbageValue = "940309715"
	)
	public static SpritePixels[] method3205(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			return UrlRequester.method3231(var0, var3, var4);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ldn;Lvl;IIIIIIB)V",
		garbageValue = "-73"
	)
	@Export("loadTerrain")
	static final void loadTerrain(WorldView var0, Buffer var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int[][][] var8 = var0.tileHeights;
		byte[][][] var9 = var0.tileSettings;
		int var10;
		if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
			var9[var2][var3][var4] = 0;

			while (true) {
				var10 = var1.readUnsignedShort();
				if (var10 == 0) {
					if (var2 == 0) {
						int[] var17 = var8[0][var3];
						int var14 = var5 + 932731;
						int var15 = var6 + 556238;
						int var16 = GameEngine.method535(var14 + 45365, 91923 + var15, 4) - 128 + (GameEngine.method535(10294 + var14, 37821 + var15, 2) - 128 >> 1) + (GameEngine.method535(var14, var15, 1) - 128 >> 2);
						var16 = (int)(0.3D * (double)var16) + 35;
						if (var16 < 10) {
							var16 = 10;
						} else if (var16 > 60) {
							var16 = 60;
						}

						var17[var4] = -var16 * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 240;
					}
					break;
				}

				if (var10 == 1) {
					int var11 = var1.readUnsignedByte();
					if (var11 == 1) {
						var11 = 0;
					}

					if (var2 == 0) {
						var8[0][var3][var4] = -var11 * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
					}
					break;
				}

				if (var10 <= 49) {
					Tiles.Tiles_overlays[var2][var3][var4] = (short)var1.readShort();
					Tiles.Tiles_shapes[var2][var3][var4] = (byte)((var10 - 2) / 4);
					Tiles.field1037[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
				} else if (var10 <= 81) {
					var9[var2][var3][var4] = (byte)(var10 - 49);
				} else {
					Tiles.Tiles_underlays[var2][var3][var4] = (short)(var10 - 81);
				}
			}
		} else {
			while (true) {
				var10 = var1.readUnsignedShort();
				if (var10 == 0) {
					break;
				}

				if (var10 == 1) {
					var1.readUnsignedByte();
					break;
				}

				if (var10 <= 49) {
					var1.readShort();
				}
			}
		}

	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "809942685"
	)
	static void method3202() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (class416.widgetDefinition.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = class416.widgetDefinition.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = class416.widgetDefinition.method6911(var4);
					if (var5 != null) {
						class110.invalidateWidget(var5);
					}
				}
			}
		}

	}
}
