import java.io.IOException;
import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
public class class65 {
	@ObfuscatedName("l")
	static final BigInteger field861;
	@ObfuscatedName("n")
	static final BigInteger field862;
	static 
	{
		field861 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field862 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-685134646")

	public static boolean method1875() {
		long var0 = WorldMapSprite.getServerTime();
		int var2 = ((int) (var0 - NetCache.field3976));
		NetCache.field3976 = var0;
		if (var2 > 200) {
			var2 = 200;
		}

		NetCache.NetCache_loadTime += var2;
		if ((((NetCache.NetCache_pendingResponsesCount == 0) && (NetCache.NetCache_pendingPriorityResponsesCount == 0)) && (NetCache.NetCache_pendingWritesCount == 0)) && (NetCache.NetCache_pendingPriorityWritesCount == 0)) {
			return true;
		} else if (NetCache.NetCache_socket == null) {
			return false;
		} else {
			try {
				if (NetCache.NetCache_loadTime > 30000) {
					throw new IOException();
				} else {
					NetFileRequest var3;
					Buffer var4;
					while ((NetCache.NetCache_pendingPriorityResponsesCount < 200) && (NetCache.NetCache_pendingPriorityWritesCount > 0)) {
						var3 = ((NetFileRequest) (NetCache.NetCache_pendingPriorityWrites.first()));
						var4 = new Buffer(4);
						var4.writeByte(1);
						var4.writeMedium(((int) (var3.key)));
						NetCache.NetCache_socket.write(var4.array, 0, 4);
						NetCache.NetCache_pendingPriorityResponses.put(var3, var3.key);
						--NetCache.NetCache_pendingPriorityWritesCount;
						++NetCache.NetCache_pendingPriorityResponsesCount;
					} 

					while ((NetCache.NetCache_pendingResponsesCount < 200) && (NetCache.NetCache_pendingWritesCount > 0)) {
						var3 = ((NetFileRequest) (NetCache.NetCache_pendingWritesQueue.removeLast()));
						var4 = new Buffer(4);
						var4.writeByte(0);
						var4.writeMedium(((int) (var3.key)));
						NetCache.NetCache_socket.write(var4.array, 0, 4);
						var3.removeDual();
						NetCache.NetCache_pendingResponses.put(var3, var3.key);
						--NetCache.NetCache_pendingWritesCount;
						++NetCache.NetCache_pendingResponsesCount;
					} 

					for (int var15 = 0; var15 < 100; ++var15) {
						int var16 = NetCache.NetCache_socket.available();
						if (var16 < 0) {
							throw new IOException();
						}

						if (var16 == 0) {
							break;
						}

						NetCache.NetCache_loadTime = 0;
						byte var5 = 0;
						if (NetCache.NetCache_currentResponse == null) {
							var5 = 8;
						} else if (NetCache.field3990 == 0) {
							var5 = 1;
						}

						int var6;
						int var7;
						int var8;
						int var10;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var5 > 0) {
							var6 = var5 - NetCache.NetCache_responseHeaderBuffer.offset;
							if (var6 > var16) {
								var6 = var16;
							}

							NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var6);
							if (NetCache.field3999 != 0) {
								for (var7 = 0; var7 < var6; ++var7) {
									var10000 = NetCache.NetCache_responseHeaderBuffer.array;
									var10001 = var7 + NetCache.NetCache_responseHeaderBuffer.offset;
									var10000[var10001] ^= NetCache.field3999;
								}
							}

							var22 = NetCache.NetCache_responseHeaderBuffer;
							var22.offset += var6;
							if (NetCache.NetCache_responseHeaderBuffer.offset < var5) {
								break;
							}

							if (NetCache.NetCache_currentResponse == null) {
								NetCache.NetCache_responseHeaderBuffer.offset = 0;
								var7 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
								var8 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
								int var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
								var10 = NetCache.NetCache_responseHeaderBuffer.readInt();
								long var11 = ((long) (var8 + (var7 << 16)));
								NetFileRequest var13 = ((NetFileRequest) (NetCache.NetCache_pendingPriorityResponses.get(var11)));
								ClanChannel.field1673 = true;
								if (var13 == null) {
									var13 = ((NetFileRequest) (NetCache.NetCache_pendingResponses.get(var11)));
									ClanChannel.field1673 = false;
								}

								if (var13 == null) {
									throw new IOException();
								}

								int var14 = (var9 == 0) ? 5 : 9;
								NetCache.NetCache_currentResponse = var13;
								class291.NetCache_responseArchiveBuffer = new Buffer((var14 + var10) + NetCache.NetCache_currentResponse.padding);
								class291.NetCache_responseArchiveBuffer.writeByte(var9);
								class291.NetCache_responseArchiveBuffer.writeInt(var10);
								NetCache.field3990 = 8;
								NetCache.NetCache_responseHeaderBuffer.offset = 0;
							} else if (NetCache.field3990 == 0) {
								if (NetCache.NetCache_responseHeaderBuffer.array[0] == (-1)) {
									NetCache.field3990 = 1;
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
								} else {
									NetCache.NetCache_currentResponse = null;
								}
							}
						} else {
							var6 = class291.NetCache_responseArchiveBuffer.array.length - NetCache.NetCache_currentResponse.padding;
							var7 = 512 - NetCache.field3990;
							if (var7 > (var6 - class291.NetCache_responseArchiveBuffer.offset)) {
								var7 = var6 - class291.NetCache_responseArchiveBuffer.offset;
							}

							if (var7 > var16) {
								var7 = var16;
							}

							NetCache.NetCache_socket.read(class291.NetCache_responseArchiveBuffer.array, class291.NetCache_responseArchiveBuffer.offset, var7);
							if (NetCache.field3999 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = class291.NetCache_responseArchiveBuffer.array;
									var10001 = class291.NetCache_responseArchiveBuffer.offset + var8;
									var10000[var10001] ^= NetCache.field3999;
								}
							}

							var22 = class291.NetCache_responseArchiveBuffer;
							var22.offset += var7;
							NetCache.field3990 += var7;
							if (var6 == class291.NetCache_responseArchiveBuffer.offset) {
								if (NetCache.NetCache_currentResponse.key == 16711935L) {
									class122.NetCache_reference = class291.NetCache_responseArchiveBuffer;

									for (var8 = 0; var8 < 256; ++var8) {
										Archive var17 = NetCache.NetCache_archives[var8];
										if (var17 != null) {
											class122.NetCache_reference.offset = (var8 * 8) + 5;
											var10 = class122.NetCache_reference.readInt();
											int var18 = class122.NetCache_reference.readInt();
											var17.loadIndex(var10, var18);
										}
									}
								} else {
									NetCache.NetCache_crc.reset();
									NetCache.NetCache_crc.update(class291.NetCache_responseArchiveBuffer.array, 0, var6);
									var8 = ((int) (NetCache.NetCache_crc.getValue()));
									if (var8 != NetCache.NetCache_currentResponse.crc) {
										try {
											NetCache.NetCache_socket.close();
										} catch (Exception var20) {
										}

										++NetCache.NetCache_crcMismatches;
										NetCache.NetCache_socket = null;
										NetCache.field3999 = ((byte) ((int) ((Math.random() * 255.0) + 1.0)));
										return false;
									}

									NetCache.NetCache_crcMismatches = 0;
									NetCache.NetCache_ioExceptions = 0;
									NetCache.NetCache_currentResponse.archive.write(((int) (NetCache.NetCache_currentResponse.key & 65535L)), class291.NetCache_responseArchiveBuffer.array, (NetCache.NetCache_currentResponse.key & 16711680L) == 16711680L, ClanChannel.field1673);
								}

								NetCache.NetCache_currentResponse.remove();
								if (ClanChannel.field1673) {
									--NetCache.NetCache_pendingPriorityResponsesCount;
								} else {
									--NetCache.NetCache_pendingResponsesCount;
								}

								NetCache.field3990 = 0;
								NetCache.NetCache_currentResponse = null;
								class291.NetCache_responseArchiveBuffer = null;
							} else {
								if (NetCache.field3990 != 512) {
									break;
								}

								NetCache.field3990 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					NetCache.NetCache_socket.close();
				} catch (Exception var19) {
				}

				++NetCache.NetCache_ioExceptions;
				NetCache.NetCache_socket = null;
				return false;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IIIB)J", garbageValue = 
	"126")

	static long method1867(int var0, int var1, int var2) {
		return ((long) (((var2 << 16) | (var0 << 8)) | var1));
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljt;", garbageValue = 
	"-381402387")

	static PacketBufferNode method1876() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(I)[I", garbageValue = 
	"138595425")

	public static int[] method1869() {
		int[] var0 = new int[KeyHandler.field132];

		for (int var1 = 0; var1 < KeyHandler.field132; ++var1) {
			var0[var1] = KeyHandler.field139[var1];
		}

		return var0;
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(descriptor = 
	"([Lkn;IIIZI)V", garbageValue = 
	"561334145")

	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if ((var6 != null) && (var6.parentId == var1)) {
				class116.alignWidgetSize(var6, var2, var3, var4);
				class162.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > (var6.scrollWidth - var6.width)) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}

				if (var6.scrollY > (var6.scrollHeight - var6.height)) {
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}

				if (var6.type == 0) {
					GrandExchangeEvents.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	}
}