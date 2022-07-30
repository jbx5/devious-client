import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

import java.util.zip.CRC32;
@ObfuscatedName("lv")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lnj;")
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1322628773)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime = 0;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lpf;")
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites = new NodeHashTable(4096);

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 2003342179)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount = 0;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lpf;")
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses = new NodeHashTable(32);

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 662622231)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount = 0;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lld;")
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue = new DualNodeDeque();

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lpf;")
	@Export("NetCache_pendingWrites")
	public static NodeHashTable NetCache_pendingWrites = new NodeHashTable(4096);

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -2048363861)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount = 0;

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "Lpf;")
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses = new NodeHashTable(4096);

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -1187515461)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount = 0;

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "Lqw;")
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer = new Buffer(8);

	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 1467757539)
	public static int field4045 = 0;

	@ObfuscatedName("k")
	@Export("NetCache_crc")
	public static CRC32 NetCache_crc = new CRC32();

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "[Llu;")
	@Export("NetCache_archives")
	public static Archive[] NetCache_archives = new Archive[256];

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = -1007973587)
	static int field4048 = -1;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -1157700571)
	static int field4046 = 255;

	@ObfuscatedName("i")
	public static byte field4033 = 0;

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 1786371509)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches = 0;

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 83406129)
	@Export("NetCache_ioExceptions")
	public static int NetCache_ioExceptions = 0;

	@ObfuscatedName("lu")
	@ObfuscatedSignature(descriptor = "Lku;")
	@Export("hoveredItemContainer")
	static Widget hoveredItemContainer;

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(Lqy;B)V", garbageValue = "0")
	static final void method5973(PacketBuffer var0) {
		for (int var1 = 0; var1 < Players.Players_pendingUpdateCount; ++var1) {
			int var2 = Players.Players_pendingUpdateIndices[var1];
			Player var3 = Client.players[var2];
			int var4 = var0.readUnsignedByte();
			if ((var4 & 32) != 0) {
				var4 += var0.readUnsignedByte() << 8;
			}
			byte var5 = class192.field2201.field2196;
			if ((var4 & 256) != 0) {
				var3.field1177 = var0.readByteSub();
				var3.field1182 = var0.readByteNeg();
				var3.field1188 = var0.readByte();
				var3.field1183 = var0.readByteAdd();
				var3.field1194 = var0.readUnsignedShortAdd() + Client.cycle;
				var3.field1166 = var0.readUnsignedShortAddLE() + Client.cycle;
				var3.field1186 = var0.readUnsignedShortLE();
				if (var3.field1111) {
					var3.field1177 += var3.tileX;
					var3.field1182 += var3.tileY;
					var3.field1188 += var3.tileX;
					var3.field1183 += var3.tileY;
					var3.pathLength = 0;
				} else {
					var3.field1177 += var3.pathX[0];
					var3.field1182 += var3.pathY[0];
					var3.field1188 += var3.pathX[0];
					var3.field1183 += var3.pathY[0];
					var3.pathLength = 1;
				}
				var3.field1203 = 0;
			}
			int var6;
			int var9;
			int var10;
			int var13;
			if ((var4 & 16) != 0) {
				var6 = var0.readUnsignedShortAddLE();
				PlayerType var7 = ((PlayerType) (class271.findEnumerated(Client.PlayerType_values(), var0.readUnsignedByteNeg())));
				boolean var8 = var0.readUnsignedByteAdd() == 1;
				var9 = var0.readUnsignedByteAdd();
				var10 = var0.offset;
				if (var3.username != null && var3.appearance != null) {
					boolean var11 = false;
					if (var7.isUser && MusicPatchPcmStream.friendSystem.isIgnored(var3.username)) {
						var11 = true;
					}
					if (!var11 && Client.field542 == 0 && !var3.isHidden) {
						Players.field1300.offset = 0;
						var0.readBytesLE(Players.field1300.array, 0, var9);
						Players.field1300.offset = 0;
						String var12 = AbstractFont.escapeBrackets(class4.method13(CollisionMap.method3870(Players.field1300)));
						var3.overheadText = var12.trim();
						var3.overheadTextColor = var6 >> 8;
						var3.overheadTextEffect = var6 & 255;
						var3.overheadTextCyclesRemaining = 150;
						var3.isAutoChatting = var8;
						var3.field1151 = var3 != class28.localPlayer && var7.isUser && "" != Client.field719 && var12.toLowerCase().indexOf(Client.field719) == -1;
						if (var7.isPrivileged) {
							var13 = (var8) ? 91 : 1;
						} else {
							var13 = (var8) ? 90 : 2;
						}
						if (var7.modIcon != -1) {
							FileSystem.addGameMessage(var13, UrlRequester.method2619(var7.modIcon) + var3.username.getName(), var12);
						} else {
							FileSystem.addGameMessage(var13, var3.username.getName(), var12);
						}
					}
				}
				var0.offset = var10 + var9;
			}
			if ((var4 & 64) != 0) {
				var3.targetIndex = var0.readUnsignedShortLE();
				if (var3.targetIndex == 65535) {
					var3.targetIndex = -1;
				}
			}
			if ((var4 & 2048) != 0) {
				Players.field1294[var2] = ((class192) (class271.findEnumerated(class165.method3305(), var0.readByteNeg())));
			}
			int var14;
			if ((var4 & 2) != 0) {
				var6 = var0.readUnsignedShortLE();
				if (var6 == 65535) {
					var6 = -1;
				}
				var14 = var0.readUnsignedByteAdd();
				Strings.performPlayerAnimation(var3, var6, var14);
			}
			if ((var4 & 8192) != 0) {
				var3.field1189 = Client.cycle + var0.readUnsignedShortAdd();
				var3.field1136 = Client.cycle + var0.readUnsignedShortAddLE();
				var3.field1191 = var0.readByteNeg();
				var3.field1168 = var0.readByteNeg();
				var3.field1193 = var0.readByteSub();
				var3.field1184 = ((byte) (var0.readUnsignedByteSub()));
			}
			if ((var4 & 512) != 0) {
				for (var6 = 0; var6 < 3; ++var6) {
					var3.actions[var6] = var0.readStringCp1252NullTerminated();
				}
			}
			if ((var4 & 16384) != 0) {
				var5 = var0.readByteSub();
			}
			if ((var4 & 4) != 0) {
				var6 = var0.readUnsignedByteNeg();
				byte[] var18 = new byte[var6];
				Buffer var15 = new Buffer(var18);
				var0.readBytes(var18, 0, var6);
				Players.field1295[var2] = var15;
				var3.read(var15);
			}
			if ((var4 & 1024) != 0) {
				var3.spotAnimation = var0.readUnsignedShortLE();
				var6 = var0.readUnsignedIntIME();
				var3.spotAnimationHeight = var6 >> 16;
				var3.field1178 = (var6 & '￿') + Client.cycle;
				var3.spotAnimationFrame = 0;
				var3.spotAnimationFrameCycle = 0;
				if (var3.field1178 > Client.cycle) {
					var3.spotAnimationFrame = -1;
				}
				if (var3.spotAnimation == 65535) {
					var3.spotAnimation = -1;
				}
			}
			if ((var4 & 8) != 0) {
				var3.field1164 = var0.readUnsignedShortLE();
				if (var3.pathLength == 0) {
					var3.orientation = var3.field1164;
					var3.field1164 = -1;
				}
			}
			if ((var4 & 1) != 0) {
				var3.overheadText = var0.readStringCp1252NullTerminated();
				if (var3.overheadText.charAt(0) == '~') {
					var3.overheadText = var3.overheadText.substring(1);
					FileSystem.addGameMessage(2, var3.username.getName(), var3.overheadText);
				} else if (var3 == class28.localPlayer) {
					FileSystem.addGameMessage(2, var3.username.getName(), var3.overheadText);
				}
				var3.isAutoChatting = false;
				var3.overheadTextColor = 0;
				var3.overheadTextEffect = 0;
				var3.overheadTextCyclesRemaining = 150;
			}
			if ((var4 & 128) != 0) {
				var6 = var0.readUnsignedByte();
				int var17;
				int var19;
				int var20;
				if (var6 > 0) {
					for (var14 = 0; var14 < var6; ++var14) {
						var9 = -1;
						var10 = -1;
						var20 = -1;
						var19 = var0.readUShortSmart();
						if (var19 == 32767) {
							var19 = var0.readUShortSmart();
							var10 = var0.readUShortSmart();
							var9 = var0.readUShortSmart();
							var20 = var0.readUShortSmart();
						} else if (var19 != 32766) {
							var10 = var0.readUShortSmart();
						} else {
							var19 = -1;
						}
						var17 = var0.readUShortSmart();
						var3.addHitSplat(var19, var10, var9, var20, Client.cycle, var17);
					}
				}
				var14 = var0.readUnsignedByteNeg();
				if (var14 > 0) {
					for (var19 = 0; var19 < var14; ++var19) {
						var9 = var0.readUShortSmart();
						var10 = var0.readUShortSmart();
						if (var10 != 32767) {
							var20 = var0.readUShortSmart();
							var17 = var0.readUnsignedByte();
							var13 = (var10 > 0) ? var0.readUnsignedByteAdd() : var17;
							var3.addHealthBar(var9, Client.cycle, var10, var20, var17, var13);
						} else {
							var3.removeHealthBar(var9);
						}
					}
				}
			}
			if (var3.field1111) {
				if (var5 == 127) {
					var3.resetPath(var3.tileX, var3.tileY);
				} else {
					class192 var16;
					if (var5 != class192.field2201.field2196) {
						var16 = ((class192) (class271.findEnumerated(class165.method3305(), var5)));
					} else {
						var16 = Players.field1294[var2];
					}
					var3.method2230(var3.tileX, var3.tileY, var16);
				}
			}
		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(descriptor = "([Lku;IIIZB)V", garbageValue = "119")
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				class356.alignWidgetSize(var6, var2, var3, var4);
				VertexNormal.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}
				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}
				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height;
				}
				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}
				if (var6.type == 0) {
					class439.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}
	}
}