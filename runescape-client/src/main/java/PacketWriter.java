import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -109969883
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lua;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lvr;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1237202353
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("ac")
	boolean field1471;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1298041783
	)
	int field1470;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -74223561
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	ServerPacket field1474;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	ServerPacket field1475;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	ServerPacket field1476;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1471 = true;
		this.field1470 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1489992232"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1931876998"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lmd;S)V",
		garbageValue = "1207"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lsm;I)V",
		garbageValue = "-2021066045"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-929515465"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1319220242"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Lsm;",
		garbageValue = "-103"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "25"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, int var4, int var5, String var6, String var7, int var8, int var9) {
		WorldView var10 = null;
		if (var5 >= 0 && class358.topLevelWorldView.worldEntities[var5] != null) {
			var10 = class358.topLevelWorldView.worldEntities[var5].worldView;
		} else if (var5 == -1) {
			var10 = class358.topLevelWorldView;
		}

		if (var10 != null) {
			int var11 = var10.baseX;
			int var12 = var10.baseY;
			NPC[] var13 = var10.npcs;
			Player[] var14 = var10.players;
			if (var2 >= 2000) {
				var2 -= 2000;
			}

			NPC var15;
			PacketBufferNode var16;
			if (var2 == 7) {
				var15 = var13[var3];
				if (var15 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = WorldMapElement.getPacketBufferNode(ClientPacket.field3309, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var16.packetBuffer.writeInt(WorldMapRegion.field3100);
					var16.packetBuffer.writeShortAddLE(class4.Players_count);
					var16.packetBuffer.writeShortLE(Varcs.field1456);
					var16.packetBuffer.writeShortAddLE(var3);
					Client.packetWriter.addNode(var16);
				}
			}

			PacketBufferNode var17;
			Widget var21;
			if (var2 == 24) {
				var21 = AsyncRestClient.widgetDefinition.method6536(var1);
				if (var21 != null) {
					boolean var18 = true;
					if (var21.contentType > 0) {
						var18 = GrandExchangeOfferUnitPriceComparator.method7439(var21);
					}

					if (var18) {
						var17 = WorldMapElement.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
						var17.packetBuffer.writeInt(var1);
						Client.packetWriter.addNode(var17);
					}
				}
			}

			Player var22;
			if (var2 == 46) {
				var22 = var14[var3];
				if (var22 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = WorldMapElement.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeShortAddLE(var3);
					var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var16);
				}
			}

			PacketBufferNode var23;
			if (var2 == 21) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var23 = WorldMapElement.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
				var23.packetBuffer.writeShort(var0 + var11);
				var23.packetBuffer.writeShortLE(var3);
				var23.packetBuffer.writeShortAddLE(var12 + var1);
				var23.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var23);
			}

			if (var2 == 48) {
				var22 = var14[var3];
				if (var22 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = WorldMapElement.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var16.packetBuffer.writeShortAddLE(var3);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 1002) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				var23 = WorldMapElement.getPacketBufferNode(ClientPacket.OPLOCE, Client.packetWriter.isaacCipher);
				var23.packetBuffer.writeShortLE(var3);
				Client.packetWriter.addNode(var23);
			}

			int var19;
			Widget var24;
			if (var2 == 29) {
				var23 = WorldMapElement.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
				var23.packetBuffer.writeInt(var1);
				Client.packetWriter.addNode(var23);
				var24 = AsyncRestClient.widgetDefinition.method6536(var1);
				if (var24 != null && var24.cs1Instructions != null && var24.cs1Instructions[0][0] == 5) {
					var19 = var24.cs1Instructions[0][1];
					if (Varps.Varps_main[var19] != var24.cs1ComparisonValues[0]) {
						Varps.Varps_main[var19] = var24.cs1ComparisonValues[0];
						ClanChannelMember.changeGameOptions(var19);
					}
				}
			}

			if (var2 == 45) {
				var22 = var14[var3];
				if (var22 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = WorldMapElement.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeShortLE(var3);
					var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 11) {
				var15 = var13[var3];
				if (var15 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = WorldMapElement.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeShortLE(var3);
					var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 15) {
				var22 = var14[var3];
				if (var22 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = WorldMapElement.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var16.packetBuffer.writeShort(var3);
					var16.packetBuffer.writeIntIME(Strings.selectedSpellWidget);
					var16.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
					var16.packetBuffer.writeShortLE(Client.selectedSpellItemId);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 14) {
				var22 = var14[var3];
				if (var22 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = WorldMapElement.getPacketBufferNode(ClientPacket.field3337, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeShortLE(class4.Players_count);
					var16.packetBuffer.writeShortAddLE(var3);
					var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var16.packetBuffer.writeIntME(WorldMapRegion.field3100);
					var16.packetBuffer.writeShort(Varcs.field1456);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 10) {
				var15 = var13[var3];
				if (var15 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = WorldMapElement.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeShortAddLE(var3);
					var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 3) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var23 = WorldMapElement.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher);
				var23.packetBuffer.writeShortLE(var0 + var11);
				var23.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var23.packetBuffer.writeShortAddLE(var12 + var1);
				var23.packetBuffer.writeShortAddLE(var3);
				Client.packetWriter.addNode(var23);
			}

			if (var2 == 49) {
				var22 = var14[var3];
				if (var22 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = WorldMapElement.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var16.packetBuffer.writeShortAdd(var3);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 4) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var23 = WorldMapElement.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher);
				var23.packetBuffer.writeShortAdd(var0 + var11);
				var23.packetBuffer.writeShortAddLE(var3);
				var23.packetBuffer.writeShortAdd(var12 + var1);
				var23.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var23);
			}

			if (var2 == 26) {
				ObjectSound.method1966();
			}

			if (var2 == 13) {
				var15 = var13[var3];
				if (var15 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = WorldMapElement.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeShortAdd(var3);
					var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 50) {
				var22 = var14[var3];
				if (var22 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = WorldMapElement.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var16.packetBuffer.writeShortLE(var3);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 1) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var23 = WorldMapElement.getPacketBufferNode(ClientPacket.field3317, Client.packetWriter.isaacCipher);
				var23.packetBuffer.writeIntME(WorldMapRegion.field3100);
				var23.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var23.packetBuffer.writeShortLE(Varcs.field1456);
				var23.packetBuffer.writeShortLE(var0 + var11);
				var23.packetBuffer.writeShortAdd(var12 + var1);
				var23.packetBuffer.writeShortAddLE(class4.Players_count);
				var23.packetBuffer.writeShort(var3);
				Client.packetWriter.addNode(var23);
			}

			if (var2 == 2) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var23 = WorldMapElement.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher);
				var23.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
				var23.packetBuffer.writeIntLE(Strings.selectedSpellWidget);
				var23.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var23.packetBuffer.writeShortAddLE(var12 + var1);
				var23.packetBuffer.writeShortLE(var0 + var11);
				var23.packetBuffer.writeShortLE(var3);
				var23.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
				Client.packetWriter.addNode(var23);
			}

			if (var2 == 8) {
				var15 = var13[var3];
				if (var15 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = WorldMapElement.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var16.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
					var16.packetBuffer.writeInt(Strings.selectedSpellWidget);
					var16.packetBuffer.writeShortAddLE(var3);
					var16.packetBuffer.writeShort(Client.selectedSpellItemId);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 51) {
				var22 = var14[var3];
				if (var22 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = WorldMapElement.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var16.packetBuffer.writeShortAddLE(var3);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 58) {
				var21 = AsyncRestClient.widgetDefinition.getWidgetChild(var1, var0);
				if (var21 != null) {
					if (var21.field3957 != null) {
						ScriptEvent var25 = new ScriptEvent();
						var25.widget = var21;
						var25.opIndex = var3;
						var25.targetName = var7;
						var25.args = var21.field3957;
						class371.runScriptEvent(var25);
					}

					var16 = WorldMapElement.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeIntLE(var1);
					var16.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
					var16.packetBuffer.writeShortAdd(var0);
					var16.packetBuffer.writeShort(Client.selectedSpellItemId);
					var16.packetBuffer.writeInt(Strings.selectedSpellWidget);
					var16.packetBuffer.writeShortAdd(var4);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 47) {
				var22 = var14[var3];
				if (var22 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = WorldMapElement.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var16.packetBuffer.writeShort(var3);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 28) {
				var23 = WorldMapElement.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
				var23.packetBuffer.writeInt(var1);
				Client.packetWriter.addNode(var23);
				var24 = AsyncRestClient.widgetDefinition.method6536(var1);
				if (var24 != null && var24.cs1Instructions != null && var24.cs1Instructions[0][0] == 5) {
					var19 = var24.cs1Instructions[0][1];
					Varps.Varps_main[var19] = 1 - Varps.Varps_main[var19];
					ClanChannelMember.changeGameOptions(var19);
				}
			}

			if (var2 == 1001) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var23 = WorldMapElement.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher);
				var23.packetBuffer.writeShortAddLE(var12 + var1);
				var23.packetBuffer.writeShortAddLE(var3);
				var23.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var23.packetBuffer.writeShortAddLE(var0 + var11);
				Client.packetWriter.addNode(var23);
			}

			if (var2 == 44) {
				var22 = var14[var3];
				if (var22 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = WorldMapElement.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var16.packetBuffer.writeShortAddLE(var3);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 30 && Client.meslayerContinueWidget == null) {
				SoundCache.resumePauseWidget(var1, var0);
				Client.meslayerContinueWidget = AsyncRestClient.widgetDefinition.getWidgetChild(var1, var0);
				class324.invalidateWidget(Client.meslayerContinueWidget);
			}

			if (var2 == 57 || var2 == 1007) {
				var21 = AsyncRestClient.widgetDefinition.getWidgetChild(var1, var0);
				if (var21 != null) {
					class351.widgetDefaultMenuAction(var3, var1, var0, var4, var7);
				}
			}

			if (var2 == 16) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var23 = WorldMapElement.getPacketBufferNode(ClientPacket.field3348, Client.packetWriter.isaacCipher);
				var23.packetBuffer.writeShortAddLE(var12 + var1);
				var23.packetBuffer.writeShortAdd(Varcs.field1456);
				var23.packetBuffer.writeShortAddLE(class4.Players_count);
				var23.packetBuffer.writeIntME(WorldMapRegion.field3100);
				var23.packetBuffer.writeShortAdd(var3);
				var23.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var23.packetBuffer.writeShortAddLE(var0 + var11);
				Client.packetWriter.addNode(var23);
			}

			if (var2 == 20) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var23 = WorldMapElement.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher);
				var23.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var23.packetBuffer.writeShortLE(var3);
				var23.packetBuffer.writeShortAddLE(var0 + var11);
				var23.packetBuffer.writeShort(var12 + var1);
				Client.packetWriter.addNode(var23);
			}

			if (var2 == 25) {
				var21 = AsyncRestClient.widgetDefinition.getWidgetChild(var1, var0);
				if (var21 != null) {
					ObjectSound.method1954();
					class368.method7125(var1, var0, TaskHandler.Widget_unpackTargetMask(class160.getWidgetFlags(var21)), var4);
					Client.isItemSelected = 0;
					Client.selectedSpellActionName = class105.Widget_getSpellActionName(var21);
					if (Client.selectedSpellActionName == null) {
						Client.selectedSpellActionName = "null";
					}

					if (var21.isIf3) {
						Client.selectedSpellName = var21.dataText + HttpAuthenticationHeader.colorStartTag(16777215);
					} else {
						Client.selectedSpellName = HttpAuthenticationHeader.colorStartTag(65280) + var21.field3848 + HttpAuthenticationHeader.colorStartTag(16777215);
					}
				}

			} else {
				if (var2 == 23) {
					if (Client.isMenuOpen) {
						class358.topLevelWorldView.scene.method4907();
					} else {
						class358.topLevelWorldView.scene.menuOpen(class358.topLevelWorldView.plane, var0, var1, true);
					}

					for (int var20 = 0; var20 < class358.topLevelWorldView.worldEntityCount; ++var20) {
						WorldEntity var26 = class358.topLevelWorldView.worldEntities[class358.topLevelWorldView.worldEntityIndices[var20]];
						if (var26 != null) {
							if (Client.isMenuOpen) {
								var26.worldView.scene.method4907();
							} else {
								var26.worldView.scene.menuOpen(var26.worldView.plane, var0, var1, true);
							}
						}
					}
				}

				if (var2 == 6) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var23 = WorldMapElement.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher);
					var23.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var23.packetBuffer.writeShortLE(var3);
					var23.packetBuffer.writeShortLE(var0 + var11);
					var23.packetBuffer.writeShortAddLE(var12 + var1);
					Client.packetWriter.addNode(var23);
				}

				if (var2 == 17) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var23 = WorldMapElement.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher);
					var23.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
					var23.packetBuffer.writeShortLE(var3);
					var23.packetBuffer.writeShortAddLE(var0 + var11);
					var23.packetBuffer.writeShortLE(Client.selectedSpellItemId);
					var23.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var23.packetBuffer.writeShort(var12 + var1);
					var23.packetBuffer.writeIntLE(Strings.selectedSpellWidget);
					Client.packetWriter.addNode(var23);
				}

				if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
					class6.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
				}

				if (var2 == 22) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var23 = WorldMapElement.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
					var23.packetBuffer.writeShortAdd(var3);
					var23.packetBuffer.writeShortAdd(var0 + var11);
					var23.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var23.packetBuffer.writeShortAddLE(var12 + var1);
					Client.packetWriter.addNode(var23);
				}

				if (var2 == 12) {
					var15 = var13[var3];
					if (var15 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = WorldMapElement.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShortAddLE(var3);
						Client.packetWriter.addNode(var16);
					}
				}

				if (var2 == 19) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var23 = WorldMapElement.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher);
					var23.packetBuffer.writeShort(var3);
					var23.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var23.packetBuffer.writeShortAddLE(var0 + var11);
					var23.packetBuffer.writeShortAdd(var12 + var1);
					Client.packetWriter.addNode(var23);
				}

				if (var2 == 5) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var23 = WorldMapElement.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher);
					var23.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var23.packetBuffer.writeShortAdd(var12 + var1);
					var23.packetBuffer.writeShortLE(var0 + var11);
					var23.packetBuffer.writeShort(var3);
					Client.packetWriter.addNode(var23);
				}

				if (var2 == 1004) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					var23 = WorldMapElement.getPacketBufferNode(ClientPacket.OPOBJE, Client.packetWriter.isaacCipher);
					var23.packetBuffer.writeShortAdd(var0 + var11);
					var23.packetBuffer.writeShortLE(var12 + var1);
					var23.packetBuffer.writeShort(var3);
					Client.packetWriter.addNode(var23);
				}

				if (var2 == 18) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var23 = WorldMapElement.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher);
					var23.packetBuffer.writeShort(var0 + var11);
					var23.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var23.packetBuffer.writeShortLE(var12 + var1);
					var23.packetBuffer.writeShortAdd(var3);
					Client.packetWriter.addNode(var23);
				}

				if (var2 == 1003) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					var15 = var13[var3];
					if (var15 != null) {
						NPCComposition var27 = var15.definition;
						if (var27.transforms != null) {
							var27 = var27.transform();
						}

						if (var27 != null) {
							var17 = WorldMapElement.getPacketBufferNode(ClientPacket.OPNPCE, Client.packetWriter.isaacCipher);
							var17.packetBuffer.writeShortAddLE(var27.id);
							Client.packetWriter.addNode(var17);
						}
					}
				}

				if (var2 == 9) {
					var15 = var13[var3];
					if (var15 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = WorldMapElement.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortAddLE(var3);
						var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var16);
					}
				}

				if (Client.isItemSelected != 0) {
					Client.isItemSelected = 0;
					class324.invalidateWidget(AsyncRestClient.widgetDefinition.method6536(WorldMapRegion.field3100));
				}

				if (Client.isSpellSelected) {
					ObjectSound.method1954();
				}

			}
		}
	}
}
